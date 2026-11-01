package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qnu implements agtk {
    final /* synthetic */ defpackage.qnv a;

    public qnu(defpackage.qnv qnvVar) {
        this.a = qnvVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) throws aois {
        java.lang.String str = (java.lang.String) obj;
        if (th instanceof java.util.concurrent.TimeoutException) {
            defpackage.qnv.a.d().i(zct.b).l("com/android/dialer/incall/video/answer/ui/VideoAnswerFragmentPeer$acceptOrRejectCallback$<anonymous>", "onFailure", 155, "VideoAnswerFragmentPeer.kt").y("timeout to %s a call", str);
        } else {
            defpackage.qnv.a.c().i(zct.b).k(th).l("com/android/dialer/incall/video/answer/ui/VideoAnswerFragmentPeer$acceptOrRejectCallback$<anonymous>", "onFailure", 161, "VideoAnswerFragmentPeer.kt").y("Failed to %s a call.", str);
        }
        defpackage.qnv qnvVar = this.a;
        qnvVar.f.a();
        android.view.View viewA = qnvVar.e.a();
        if (viewA != null) {
            viewA.setAlpha(1.0f);
            viewA.setScaleX(1.0f);
            viewA.setScaleY(1.0f);
        }
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.qnv.a.b().l("com/android/dialer/incall/video/answer/ui/VideoAnswerFragmentPeer$acceptOrRejectCallback$<anonymous>", "onSuccess", 150, "VideoAnswerFragmentPeer.kt").y("success to %s a call", (java.lang.String) obj);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
