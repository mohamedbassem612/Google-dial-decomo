# Focused disclosure resources

`extract_resources.py` reads the original APK ZIP and parses `resources.arsc` with Androguard's `ARSCParser`. It does not change the APK. Run it with `PYTHONPATH=/tmp/phone-androguard` in this environment; the exact installed version and APK hash are recorded in `extraction-provenance.json`.

- `resources-resolved.json`: selected resource IDs, names, and all resolved resource configurations/values. For the six raw audio resources, it records original ZIP entry, byte size, and SHA-256.
- `public-focused.xml`: projection of the selected entries from Androguard's public resource output.
- `strings-default-focused.xml` and `strings-ar-focused.xml`: focused projections of Androguard's decoded string table output, preserving the decoded string text. They are not XML files originally stored in the APK; their source is the compiled resource table. A missing localized string can fall back to the default table.
- `audio/`: exact copied ZIP-entry bytes for the six named start/end Arabic, Burmese, and beep resources. The descriptive filenames here differ from the APK's obfuscated ZIP paths; the mapping is in the JSON. Audio contents have not been listened to or speech-transcribed as part of this extraction. Resource names do not prove that a particular phone selects those files.

The Arabic **string resource** values are `يجري الآن تسجيل هذه المكالمة.` for `call_recording_starting_voice` and `لقد انتهى تسجيل المكالمة الآن.` for `call_recording_ending_voice`. The default values are `This call is now being recorded` and `Call recording has now ended`. These text values should not be treated as an audio transcript of the copied `.m4a` files.

The default string resource `use_beep_sound_toggle_key` resolves to the literal `use_beep_sound_toggle_key`; it is not translated in the Arabic resource table. The setting title is `Play audio tone instead of disclaimer`. Existence of a key or a label does not establish that the setting is externally writable or available on a particular device.
