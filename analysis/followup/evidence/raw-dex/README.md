# Raw DEX discriminator verification

All five methods are in `classes2.dex`, prototype `(Ljava/lang/Object;)Ljava/lang/Object;`. Their first dispatch reads a real DEX field named `$cid:I` (not the coroutine state field `a` or `b`). Addresses below count 16-bit code units relative to the method instruction start. This report interprets instruction dumps; `.disasm.txt` and `.code_item.hex` files preserve the tool extraction separately.

| Method | Dispatch | Requested key → target |
|---|---|---|
| `hnt.b(Object)` | packed-switch `:cu_000f`, payload `:cu_0322` | 18 → `:cu_003b`, 19 → `:cu_001c` |
| `hqi.b(Object)` | packed-switch `:cu_0015`, payload `:cu_0b42` | 16 → `:cu_018f`, 17 → `:cu_0130`, 18 → `:cu_00d1` |
| `kqd.b(Object)` | packed-switch `:cu_0017`, payload `:cu_0874` | 2 → `:cu_06ef` |
| `ksy.b(Object)` | packed-switch `:cu_000c`, payload `:cu_044e` | 2 → `:cu_0378`, 3 → `:cu_0358`, 4 → `:cu_031b`, 5 → `:cu_02de`, 6 → `:cu_029f`, 7 → `:cu_0260` |
| `mwq.b(Object)` | `if-eq v0, v4` at `:cu_0008`; `v4 = 1` at `:cu_0005`; relative target +0x00e4 | 1 → `:cu_00ec` |

`hnt` key 18 casts its captured object to `hyo` and invokes `hyo.c`; key 19 casts to `izg`, obtains `Locale` via `izg.n`, then continues TTS preparation. These are DEX-level branch matches, not identifications based solely on JADX branch numbering.

`ksy` key 2 creates a `hqi` coroutine with integer discriminator 14 (constant register value loaded before dispatch); key 3 creates a `hqi` coroutine with discriminator 15. Keys 4 and 5 refer to `ending_voice-` and `starting_voice-` respectively and call into `kup`. Keys 6 and 7 reference `kuv.a:Lkuu;` and enum values `kut.d` and `kut.c`. `kqd` key 2 casts to `kup`.

The `.code_item.hex` files are exact byte slices read from the source APK DEX entries, covering the code header, all instructions/payloads, padding, try records, and encoded handlers. The extractor asserts byte equality against Androguard serialization and that instruction lengths cover the entire DEX `insns_size`. DEX source APK bytes are not modified. No APK or raw full DEX is emitted.

`manifest.json` includes original method indexes, DEX hashes, code item offsets/sizes/hashes, all switch mappings, requested branch excerpts, and all exception entries. `.disasm.txt` uses labels resolved from DEX code-unit addresses; these labels are annotations, not source Java labels. All instruction bytes remain available as hex.

Reproduce with:

```sh
PYTHONPATH=/tmp/phone-androguard python extract_raw_methods.py /workspace/google-phone-analysis-244/GooglePhone_244.0.1001930441_arm64.apk OUT_DIR
```

Androguard version: `4.1.4`.
