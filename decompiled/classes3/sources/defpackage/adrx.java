package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adrx implements ajcb {
    public adrx(defpackage.adsa adsaVar) {
        j$.util.Objects.requireNonNull(adsaVar);
    }

    public final void a(java.lang.Throwable th) {
        a.by(defpackage.adsa.d.c(), "startSpeechRecognition(): recognition loop failed", "com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer$1", "onFailure", (char) 152, "TerseSpeechRecognizer.java", th);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        defpackage.adsa.d.b().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseSpeechRecognizer$1", "onSuccess", 145, "TerseSpeechRecognizer.java").v("startSpeechRecognition(): recognition loop finished succedfully");
    }
}
