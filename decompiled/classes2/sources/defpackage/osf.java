package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class osf implements agye {
    final /* synthetic */ defpackage.osg a;

    public osf(defpackage.osg osgVar) {
        j$.util.Objects.requireNonNull(osgVar);
        this.a = osgVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.osg.a.d(), "failed to load user review info", "com/android/dialer/inappreview/ui/InAppReviewFragmentPeer$1", "onError", 'N', "InAppReviewFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (!optional.isPresent()) {
            defpackage.osg.a.b().l("com/android/dialer/inappreview/ui/InAppReviewFragmentPeer$1", "onNewData", 68, "InAppReviewFragmentPeer.java").v("InAppReview feature not present when requesting flow");
            return;
        }
        defpackage.osg.a.b().l("com/android/dialer/inappreview/ui/InAppReviewFragmentPeer$1", "onNewData", 50, "InAppReviewFragmentPeer.java").v("received review info");
        final int i = 1;
        ((aaum) optional.orElseThrow()).a(new aaui() { // from class: ose
            public final void d(java.lang.Object obj2) {
                defpackage.osg osgVar = this.a.a;
                agsm.d("com/android/dialer/inappreview/ui/InAppReviewFragmentPeer$1", "onNewData", 54, dff.m(new defpackage.hyd(osgVar.e.a(osgVar.c, (com.google.android.play.core.review.ReviewInfo) obj2), 9)), zct.b, "Fail to request flow", new java.lang.Object[0]);
            }
        }).q(new aauh() { // from class: aajz
            public final void a(java.lang.Exception exc) {
                if (i != 0) {
                    a.bq(defpackage.osg.a.c(), "Fail to receive review info", "com/android/dialer/inappreview/ui/InAppReviewFragmentPeer$1", "onNewData", 'A', "InAppReviewFragmentPeer.java", exc, zct.b);
                } else {
                    android.util.Log.w("DGInternalHandle", "Client disconnected on close: ".concat(java.lang.String.valueOf(exc.getMessage())));
                }
            }
        });
    }

    public final /* synthetic */ void c() {
    }
}
