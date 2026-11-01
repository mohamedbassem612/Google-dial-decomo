package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pbm implements agtk {
    final /* synthetic */ defpackage.pbp a;

    public pbm(defpackage.pbp pbpVar) {
        this.a = pbpVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) throws aois {
        java.lang.String str = (java.lang.String) obj;
        if (th instanceof java.util.concurrent.TimeoutException) {
            defpackage.pbp.a.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer$acceptOrRejectCallback$<anonymous>", "onFailure", 224, "AnswerFragmentPeer.kt").y("timeout to %s a call", str);
        } else {
            defpackage.pbp.a.b().k(th).l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer$acceptOrRejectCallback$<anonymous>", "onFailure", 226, "AnswerFragmentPeer.kt").y("Failed to %s a call.", str);
        }
        this.a.e.a();
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.pbp.a.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer$acceptOrRejectCallback$<anonymous>", "onSuccess", 219, "AnswerFragmentPeer.kt").y("success to %s a call", (java.lang.String) obj);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
