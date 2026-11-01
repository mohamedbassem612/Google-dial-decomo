    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        aooh.f(str, "utteranceId");
        this.a.setOnUtteranceProgressListener(null);
        aosb aosbVar = this.b;
        if (aosbVar.i()) {
            ((aimw) hys.a.b().l("com/android/dialer/audio/audioinjector/fileprovider/TtsFileProvider$synthesizeTextIntoFile$<anonymous>$<anonymous>", "onDone", 121, "TtsFileProvider.kt")).v("tts generation was completed. ignoring");
        } else {
            ((aimw) hys.a.b().l("com/android/dialer/audio/audioinjector/fileprovider/TtsFileProvider$synthesizeTextIntoFile$<anonymous>$<anonymous>", "onDone", 125, "TtsFileProvider.kt")).y("tts generation complete. Generated: %s", this.c);
            aosbVar.w(aojh.a);
        }
    }
