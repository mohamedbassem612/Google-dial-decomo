package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hvu extends android.speech.tts.UtteranceProgressListener {
    final /* synthetic */ aosb a;
    final /* synthetic */ java.io.File b;

    public hvu(aosb aosbVar, java.io.File file) {
        this.a = aosbVar;
        this.b = file;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(java.lang.String str) {
        hvy.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioGeneratorImpl$generateAudio$<anonymous>$<anonymous>$<anonymous>$<anonymous>$<anonymous>", "onDone", 168, "VoiceAssistAudioGeneratorImpl.kt").v("tts generation complete");
        this.a.w(this.b);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(java.lang.String str) {
        this.a.w(aooc.ae(new java.lang.RuntimeException("tts generation failed")));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(java.lang.String str) {
        hvy.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioGeneratorImpl$generateAudio$<anonymous>$<anonymous>$<anonymous>$<anonymous>$<anonymous>", "onStart", 164, "VoiceAssistAudioGeneratorImpl.kt").v("tts generation started");
    }
}
