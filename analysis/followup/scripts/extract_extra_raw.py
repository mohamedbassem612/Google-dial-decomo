#!/usr/bin/env python3
"""Read-only Androguard dump. No code is decompiled, changed or assembled.
Usage: PYTHONPATH=/tmp/phone-androguard python extract_raw_methods.py APK OUT
Addresses in labels are DEX code units (16-bit), not byte offsets.
"""
import hashlib,json,sys,zipfile
from pathlib import Path
from loguru import logger
logger.remove()
from androguard import __version__ as ag_version
from androguard.core.dex import DEX
TARGETS={'blv':[6],'kdr':[3],'kuw':[],'kut':[],'hyo':[],'ibe':[7,9],'blj':[9]}
METHOD_NAMES={'blv':'b','kdr':'b','kuw':'a','kut':'<clinit>','hyo':'a','ibe':'a','blj':'b'}
apk=Path(sys.argv[1]);out=Path(sys.argv[2]);out.mkdir(parents=True,exist_ok=True)
report={'apk_sha256':hashlib.sha256(apk.read_bytes()).hexdigest(),'androguard_version':ag_version,'address_unit':'16-bit DEX code unit','methods':[]}
with zipfile.ZipFile(apk) as z:
 for entry in z.namelist():
  if not entry.endswith('.dex'):continue
  raw=z.read(entry);dex=DEX(raw)
  for cls in dex.get_classes():
   name=cls.get_name()[1:-1]
   if name not in TARGETS:continue
   for method in cls.get_methods():
    if method.get_name()!=METHOD_NAMES[name]:continue
    code=method.get_code();insns=list(method.get_instructions()); addresses=[];pos=0
    for ins in insns:addresses.append((pos//2,ins));pos+=ins.get_length()
    assert pos==code.get_insns_size()*2
    byaddr=dict(addresses);codeoff=method.get_code_off();size=code.get_size();original=raw[codeoff:codeoff+size]
    # get_raw is used only to determine size and to cross-check; stored bytes come directly from the APK DEX.
    assert original==code.get_raw(), 'Code-item reconstruction differs from original bytes'
    stem=name+'.'+METHOD_NAMES[name].replace('<','').replace('>','');(out/(stem+'.code_item.hex')).write_text(original.hex()+'\n')
    lines=[f'# {cls.get_name()}->{method.get_name()}{method.get_descriptor()}',f'# APK sha256={report["apk_sha256"]}',f'# {entry} sha256={hashlib.sha256(raw).hexdigest()}',f'# code_item file offset=0x{codeoff:x} byte length={size}',f'# registers={code.get_registers_size()} incoming_words={code.get_ins_size()} outgoing_words={code.get_outs_size()} insns_size={code.get_insns_size()} code_units', '# Every instruction/payload is listed; label suffixes use code units. Resolved labels are annotations, original bytes are included.']
    switches=[]
    for addr,ins in addresses:
     text=f':cu_{addr:04x}  {ins.get_raw().hex():<24} {ins.get_name()} {ins.get_output()}'
     if hasattr(ins,'get_ref_off'):
      dest=addr+ins.get_ref_off(); text+=f' # target=:cu_{dest:04x}'
      if ins.get_name() in ('packed-switch','sparse-switch'):
       payload=byaddr[dest];mapping={key:addr+target for key,target in zip(payload.get_values(),payload.get_targets())};switches.append({'switch_cu':addr,'payload_cu':dest,'keys_to_target_cu':mapping})
       text+=' # '+', '.join(f'{k}->:cu_{v:04x}' for k,v in mapping.items())
     if ins.get_name() in ('packed-switch-payload','sparse-switch-payload'):
      text+=' # payload keys='+repr(ins.get_values())+' relative_targets='+repr(ins.get_targets())
     lines.append(text)
    lines.append('# Exception table: starts inclusive, ends exclusive; handler offsets are bytes from encoded_catch_handler_list.')
    exception_entries=[]
    handlers=code.get_handlers()
    if handlers:
     hm={h.get_off()-handlers.get_off():h for h in handlers.get_list()}
     for tr in code.get_tries():
      h=hm[tr.get_handler_off()];pairs=[]
      for pair in h.get_handlers():pairs.append({'type':dex.get_cm_type(pair.get_type_idx()),'target_cu':pair.get_addr()})
      if h.get_size()<=0:pairs.append({'type':'catchall','target_cu':h.get_catch_all_addr()})
      start=tr.get_start_addr();end=start+tr.get_insn_count();exception_entries.append({'start_cu':start,'end_cu_exclusive':end,'handler_offset_bytes':tr.get_handler_off(),'handlers':pairs})
      for pair in pairs:lines.append(f'# .catch {pair["type"]} {{:cu_{start:04x} .. :cu_{end:04x}}} :cu_{pair["target_cu"]:04x}')
    else:lines.append('# no exception handlers')
    (out/(stem+'.disasm.txt')).write_text('\n'.join(lines)+'\n')
    first_switch=switches[0] if switches else None
    requested={}
    if first_switch:
     for key in TARGETS[name]:
      target=first_switch['keys_to_target_cu'].get(key);requested[str(key)]={'target_cu':target,'first_instructions':[f'{a:04x}: {i.get_name()} {i.get_output()}' for a,i in addresses if target is not None and target<=a<target+20]}
    else:
     # mwq dispatch is an if chain. Preserve its original compare instructions for direct verification.
     requested={}
    report['methods'].append({'class':cls.get_name(),'method_name':method.get_name(),'prototype':method.get_descriptor(),'dex_entry':entry,'dex_sha256':hashlib.sha256(raw).hexdigest(),'dex_method_index':method.get_method_idx(),'code_item_offset_bytes':codeoff,'code_item_size_bytes':size,'code_item_sha256':hashlib.sha256(original).hexdigest(),'instruction_bytes':pos,'first_instructions':[f'{a:04x}: {i.get_name()} {i.get_output()}' for a,i in addresses[:18]],'switches':switches,'requested_branches':requested,'exception_entries':exception_entries})
(out/'manifest.json').write_text(json.dumps(report,indent=2)+'\n')
assert len(report['methods'])==len(TARGETS)
print('Dumped',len(report['methods']),'complete method code_items and instruction lists')
