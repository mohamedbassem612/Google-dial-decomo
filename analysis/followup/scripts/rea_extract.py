#!/usr/bin/env python3
"""Read-only REA method extraction; never modifies or rebuilds the input APK."""
import os,sys,json,subprocess,pathlib,hashlib
base=pathlib.Path(__file__).resolve().parents[1]
apk='/workspace/google-phone-analysis-244/GooglePhone_244.0.1001930441_arm64.apk'
env=os.environ.copy();env.update(REA_JADX_MCP_JAR='/home/agent/.local/share/rea/android/jadx-headless-mcp-0.7.1-all.jar',REA_JADX_HEAP_MIB='4096',REA_JADX_OPERATION_TIMEOUT_MS='600000')
for selector in sys.argv[1:]:
 parts=selector.split(':'); cls,method=parts[:2]; overload=parts[2] if len(parts)>2 else None; tag=f'{cls}.{method}'+(f'.o{overload}' if overload is not None else '')
 evidence=base/'evidence'/f'{tag}.rea.json'
 if evidence.exists():
  print('EXISTS',tag,flush=True)
 else:
  cmd=['rea','inspect-android-method',apk,cls,method,'--detail','summary','--evidence_output',str(evidence),'--format','json']
  if overload is not None: cmd += ['--overload-index',overload]
  print('START',tag,flush=True)
  out=subprocess.run(cmd,env=env,capture_output=True,text=True)
  (base/'evidence'/f'{tag}.cli.json').write_text(out.stdout)
  (base/'evidence'/f'{tag}.stderr.txt').write_text(out.stderr)
  if not evidence.exists(): print('FAILED',tag,out.stdout[:500],flush=True);continue
 d=json.loads(evidence.read_text());r=next(x for x in d['records'] if x['operation']=='inspect_android_method')['normalized_result']
 mode=r.get('representation');text=r.get('source',{}).get('text','')
 folder='smali' if mode=='smali' else 'java';suffix='smali' if mode=='smali' else 'java'
 (base/folder/f'{tag}.{suffix}').write_text(text+'\n')
 print('DONE',tag,mode,r.get('body_status'),r.get('source',{}).get('status'),len(text),flush=True)
