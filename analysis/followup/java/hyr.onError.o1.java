    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str, int i) {
        aooh.f(str, "utteranceId");
        this.a.setOnUtteranceProgressListener(null);
        this.d.e.o(rmx.TTS_FILE_PROVIDER_SYNTHESIZE_UTTERANCE_ERROR);
        this.b.w(aooc.ae(new IllegalStateException(a.bj(i, "tts generation failed: "))));
    }
