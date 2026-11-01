package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hyr extends android.speech.tts.UtteranceProgressListener {
    final /* synthetic */ android.speech.tts.TextToSpeech a;
    final /* synthetic */ aosb b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ defpackage.hys d;

    public hyr(android.speech.tts.TextToSpeech textToSpeech, aosb aosbVar, java.lang.String str, defpackage.hys hysVar) {
        this.a = textToSpeech;
        this.b = aosbVar;
        this.c = str;
        this.d = hysVar;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(java.lang.String str) {
        aooh.f(str, "utteranceId");
        this.a.setOnUtteranceProgressListener(null);
        aosb aosbVar = this.b;
        if (aosbVar.i()) {
            defpackage.hys.a.b().l("com/android/dialer/audio/audioinjector/fileprovider/TtsFileProvider$synthesizeTextIntoFile$<anonymous>$<anonymous>", "onDone", 121, "TtsFileProvider.kt").v("tts generation was completed. ignoring");
        } else {
            defpackage.hys.a.b().l("com/android/dialer/audio/audioinjector/fileprovider/TtsFileProvider$synthesizeTextIntoFile$<anonymous>$<anonymous>", "onDone", 125, "TtsFileProvider.kt").y("tts generation complete. Generated: %s", this.c);
            aosbVar.w(aojh.a);
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(java.lang.String str) {
        aooh.f(str, "utteranceId");
        this.a.setOnUtteranceProgressListener(null);
        aosb aosbVar = this.b;
        if (aosbVar.i()) {
            defpackage.hys.a.b().l("com/android/dialer/audio/audioinjector/fileprovider/TtsFileProvider$synthesizeTextIntoFile$<anonymous>$<anonymous>", "onError", 137, "TtsFileProvider.kt").v("tts generation was completed. ignoring");
        } else {
            this.d.e.o(rmx.nk);
            aosbVar.w(aooc.ae(new java.lang.IllegalStateException("tts generation failed")));
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(java.lang.String str) {
        aooh.f(str, "utteranceId");
        defpackage.hys.a.b().l("com/android/dialer/audio/audioinjector/fileprovider/TtsFileProvider$synthesizeTextIntoFile$<anonymous>$<anonymous>", "onStart", 111, "TtsFileProvider.kt").v("tts generation started");
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(java.lang.String str, int i) {
        aooh.f(str, "utteranceId");
        this.a.setOnUtteranceProgressListener(null);
        this.d.e.o(rmx.nk);
        this.b.w(aooc.ae(new java.lang.IllegalStateException(a.bj(i, "tts generation failed: "))));
    }
}
