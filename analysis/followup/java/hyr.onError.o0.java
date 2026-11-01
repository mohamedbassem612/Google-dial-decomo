    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        aooh.f(str, "utteranceId");
        this.a.setOnUtteranceProgressListener(null);
        aosb aosbVar = this.b;
        if (aosbVar.i()) {
            ((aimw) hys.a.b().l("com/android/dialer/audio/audioinjector/fileprovider/TtsFileProvider$synthesizeTextIntoFile$<anonymous>$<anonymous>", "onError", 137, "TtsFileProvider.kt")).v("tts generation was completed. ignoring");
        } else {
            this.d.e.o(rmx.TTS_FILE_PROVIDER_SYNTHESIZE_UTTERANCE_ERROR);
            aosbVar.w(aooc.ae(new IllegalStateException("tts generation failed")));
        }
    }
