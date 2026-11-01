package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jnw extends android.speech.tts.UtteranceProgressListener {
    final /* synthetic */ dsd a;

    public jnw(defpackage.jny jnyVar, dsd dsdVar) {
        this.a = dsdVar;
        j$.util.Objects.requireNonNull(jnyVar);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(java.lang.String str) {
        defpackage.jny.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer$1", "onDone", 241, "CallAnnouncer.java").y("tts utterance completed, id: %s", str);
        this.a.b((java.lang.Object) null);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(java.lang.String str) {
        a.bt(defpackage.jny.a.c().m(aioa.b), "tts utterance failed, id: %s", str, "com/android/dialer/callannouncer/impl/service/CallAnnouncer$1", "onError", (char) 251, "CallAnnouncer.java", zct.b);
        this.a.d(new java.lang.IllegalStateException("failed to speak"));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(java.lang.String str) {
        defpackage.jny.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer$1", "onStart", 236, "CallAnnouncer.java").y("tts utterance started, id: %s", str);
    }
}
