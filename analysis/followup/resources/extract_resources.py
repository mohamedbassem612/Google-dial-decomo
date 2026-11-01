#!/usr/bin/env python3
"""Read-only focused extraction from APK resources.arsc using Androguard.
Set PYTHONPATH to the installed Androguard directory when needed.
"""
import argparse, hashlib, json, zipfile
from pathlib import Path
from lxml import etree as E
from loguru import logger
from androguard.core.axml import ARSCParser
logger.remove()
p=argparse.ArgumentParser();p.add_argument('apk');p.add_argument('output');args=p.parse_args()
out=Path(args.output);out.mkdir(parents=True,exist_ok=True)
with zipfile.ZipFile(args.apk) as z:
    arsc=z.read('resources.arsc'); a=ARSCParser(arsc);pkg=a.get_packages_names()[0]
    pub=E.fromstring(a.get_public_resources(pkg))
    raw_names={'starting_voice_ar_XA','ending_voice_ar_XA','starting_voice_my_MM','ending_voice_my_MM','starting_voice_beep_sound','ending_voice_beep_sound'}
    string_names={'call_recording_starting_voice','call_recording_ending_voice','call_recording_disclaimer_title','call_recording_disclaimer_content','call_recording_disclaimer_agreen_button_text'}
    selected=[]
    for n in pub:
        name=n.get('name','');typ=n.get('type'); rid=int(n.get('id'),16)
        if (typ=='raw' and name in raw_names) or (typ=='string' and (name in string_names or name.startswith('use_beep_sound_'))):
            row=dict(n.attrib);row['resolved']=[]
            for cfg,val in a.get_resolved_res_configs(rid):
                row['resolved'].append({'config':str(cfg),'qualifier':cfg.get_qualifier(),'value':val})
                if typ=='raw':
                    data=z.read(val); dest=out/'audio'/f'{name}{Path(val).suffix}';dest.parent.mkdir(exist_ok=True);dest.write_bytes(data)
                    row.update(zip_entry=val,extracted_path=str(dest.relative_to(out)),size=len(data),sha256=hashlib.sha256(data).hexdigest())
            selected.append(row)
    (out/'resources-resolved.json').write_text(json.dumps({'package':pkg,'resources_arsc_sha256':hashlib.sha256(arsc).hexdigest(),'resources':selected},ensure_ascii=False,indent=2)+'\n')
    root=E.Element('resources')
    for n in pub:
        if any(n.get('name')==r['name'] and n.get('type')==r['type'] for r in selected):root.append(n)
    (out/'public-focused.xml').write_bytes(E.tostring(root,pretty_print=True,encoding='utf-8',xml_declaration=True))
    selected_strings={r['name'] for r in selected if r['type']=='string'}
    for locale in ['\x00\x00','ar']:
        doc=E.fromstring(a.get_string_resources(pkg,locale));root=E.Element('resources')
        for n in doc:
            if n.get('name') in selected_strings:root.append(n)
        fname='strings-default-focused.xml' if locale=='\x00\x00' else 'strings-ar-focused.xml'
        (out/fname).write_bytes(E.tostring(root,pretty_print=True,encoding='utf-8',xml_declaration=True))
    (out/'extraction-provenance.json').write_text(json.dumps({'tool':'Androguard ARSCParser','androguard_version':__import__('androguard').__version__,'input_apk':str(Path(args.apk).resolve()),'apk_sha256':hashlib.sha256(Path(args.apk).read_bytes()).hexdigest(),'method':'ARSC get_public_resources and get_resolved_res_configs; focused XML is a projection of get_string_resources for default and ar. Audio bytes are exact ZIP-entry copies. No APK rebuild or mutation.'},indent=2)+'\n')
