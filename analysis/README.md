# Google Phone 244.0.1001930441 — REA static analysis

## Artifact

- Package: `com.google.android.dialer`
- Version: `244.0.1001930441` (version code `20185488`)
- Variant: arm64-v8a, nodpi; Android 11+ (sourced from APKMirror listing)
- APK size: 84,773,759 bytes
- SHA-256: `0ae5ba4f0f68ac200d1cf6e37b9685e57149b27ba9901d1879b133ddc4af53a0`
- Source listing: [APKMirror exact release](https://www.apkmirror.com/apk/google-inc/google-phone/phone-by-google-244-0-1001930441-release/phone-by-google-244-0-1001930441-android-apk-download/)
- REA/JADX: `jadx-headless-mcp` 0.7.1; static analysis only, APK was not executed.

## Package structure

REA parsed `30,025` classes and `4,027` resources. The manifest identifies target SDK `37` and min SDK `30`. It declares `com.android.dialer.externals.androidapis.telecom.callscreeningservice.DialerCallScreeningService` for Android's `android.telecom.CallScreeningService` action, along with the in-call service `com.android.incallui.InCallServiceImpl`.

## Call screening path examined

The exported `DialerCallScreeningService.onScreenCall(Call.Details)` validates the argument, starts a metric/journal scope, then delegates to the internal `lnh` instance. It constructs an `okd` callback/context, records `CALL_SCREENING_SERVICE_SCREEN_CALL`, launches coroutine `hyq`, stores the resulting job, awaits its result, and reports the failure metric text `failed to screen call` when applicable. This entry point does not contain the screening decision itself.

The delegated `lnh` class is heavily obfuscated. REA inventory shows methods for transforming call details (`a`), selecting a call direction (`l` maps Android direction 0 to 1 and direction 1 to 2, rejecting other values), and building a `CallScreeningService.CallResponse.Builder` (`j` delegates further to `lnd`). I did not infer what policies or caller classifications are applied from these limited method bodies. The method `j` alone is only a coroutine handoff, so the substantive decision likely occurs deeper in the delegated state machine.

Decompiled entry method: [`callscreen-onScreenCall.java.txt`](callscreen-onScreenCall.java.txt)

## REA evidence bundles

- [`rea-package-evidence.json`](rea-package-evidence.json)
- [`rea-signature-evidence.json`](rea-signature-evidence.json)
- [`rea-callscreen-class.json`](rea-callscreen-class.json)
- [`rea-class-lnh.json`](rea-class-lnh.json)
- [`rea-callscreen-onScreenCall.json`](rea-callscreen-onScreenCall.json)
- [`rea-lnh-j.json`](rea-lnh-j.json)
- [`rea-lnh-l.json`](rea-lnh-l.json)

The APK SHA-256 matches the digest shown on the linked APKMirror listing. REA's signature inspection found v1/v2/v3 signature declarations that agree internally, but its inspection does not cryptographically authenticate the signer or prove Google origin. Static decompilation also cannot establish runtime behavior. Obfuscated names and incomplete call-path tracing limit semantic conclusions.


## Call recording location check

REA's complete top-level class search for `Recording` returned only:

- `com.android.dialer.callrecording.impl.history.CallRecordingSessionActivity` — recording history UI.
- `com.android.dialer.playback.CallRecordingPlayer` — playback UI; its class inventory contains an Android `MediaPlayer` field.

The APK's DEX string pool also contains the source-like names `com/android/dialer/callrecording/impl/service/CallRecorder`, `CallRecordingAudioManager`, and recording-start / audio-Tee diagnostics. However, REA cannot find or inspect `com.android.dialer.callrecording.impl.service.CallRecorder` as a class in this artifact, and the DEX type inventory contains only the history activity and player under the `callrecording` package. These strings alone do not prove that the recorder class is shipped or reveal its implementation.

**Correction:** Searching class names alone cannot establish whether capture code is present. REA traced eight direct calls to `AudioRecord.startRecording()` in obfuscated classes. The decompiled `defpackage.iar.a()` identifies itself in a log as `VoipDownlinkAudioRecordWrapper.startRecording`, builds an audio mix and policy through reflection, obtains an `AudioRecord`, and starts it. This establishes a VoIP downlink audio capture path in this APK; its relationship to the user-facing call recording feature and saving files remains to be traced. `rea-recording-class-search.json` preserves the complete class-name search result; `rea-recording-player-class.json` has the player member inventory; `rea-recording-history-class.json` has the history activity inventory; `rea-incall-service-class.json` has the Telecom in-call service inventory. The DEX string pool observations were used as leads only, not as decompiled code evidence.

Evidence: `rea-audiorecord-start-xrefs.json` (eight direct DEX call sites), `rea-iar-a.json` (method decompilation), `voip-downlink-start.java.txt` (readable method). Static analysis does not establish that this path runs for every call.


## Call recording: traced implementation (updated)

The capture and save implementation is present under obfuscated names. The earlier class-name-only search could not identify it. String cross-references from the DEX lead to `defpackage.kxr.c(long)`, whose retained log identifies it as `CallRecorder.startRecording`. REA decompiled this method as Java. It requests creation of an audio tee for downlink and uplink, sets up asynchronous processing, and passes buffered audio and WAV output parameters to a save routine. The resulting file path is the app-private `getFilesDir()/callrecording/record-<long>.wav`. This describes the path constructed in code; actual creation and contents depend on runtime execution.

`defpackage.kxt.b(Object)`, case 3, identifies itself as a `CallRecordingButtonController` callback. After the starting disclosure audio reports success, it invokes `kxr.c(...)`. The result supports a connection between the button controller and recorder; it does not establish all feature gates or every possible recording entry path. The earlier `defpackage.iar.a()` is a VoIP downlink `AudioRecord` wrapper; a direct connection between that particular wrapper and this recording flow has not been established.

Evidence and readable output: `rea-kxr-c.json`, `call-recorder-start.java.txt`, `rea-kxr-c-xrefs.json`, `rea-kxt-b.json`, `record-button-callback.java.txt`, `rea-kxo-a.json` (Smali fallback), and `recording-string-xrefs.txt` (DEX string references). REA found two direct callers of `kxr.c`. The APK was not run, so behavior is inferred from static code.


## Audible recording disclosure

The manual recording button controller `kxx.g()` calls `kxr.b()` under the label `playStartingAudio`. In `kxt.b`, case 3, successful completion of that starting audio logs disclosure completion and calls `kxr.c(...)` to start recording. `kxr.b()` delegates to `kxr.g(kxq.b)`, which dispatches playback through other components. A separate `TtsCallRecordingDisclosure` implementation initializes Android TextToSpeech (`kus.c`); DEX strings also name built-in audio and beep disclosure variants. These observations confirm audible disclosure handling and a TTS implementation, but do not establish from the traced code alone the exact spoken words or that the remote caller receives the audio on a particular device. See `rea-kxx-g.json`, `rea-kxr-b.json`, `rea-kxr-g.json`, `rea-kxt-b.json`, `rea-kus-c.json`, and `disclosure-string-xrefs.txt`.
