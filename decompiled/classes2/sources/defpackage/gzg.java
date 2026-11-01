package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gzg implements defpackage.gzu {
    private final /* synthetic */ int $cid;
    private final java.lang.ref.WeakReference a;

    public gzg(com.airbnb.lottie.LottieAnimationView lottieAnimationView, int i, byte[] bArr) {
        this.$cid = i;
        this.a = new java.lang.ref.WeakReference(lottieAnimationView);
    }

    @Override // defpackage.gzu
    public final /* synthetic */ void a(java.lang.Object obj) {
        if (this.$cid == 0) {
            defpackage.gzh gzhVar = (defpackage.gzh) obj;
            com.airbnb.lottie.LottieAnimationView lottieAnimationView = (com.airbnb.lottie.LottieAnimationView) this.a.get();
            if (lottieAnimationView != null) {
                lottieAnimationView.l(gzhVar);
                return;
            }
            return;
        }
        java.lang.Throwable th = (java.lang.Throwable) obj;
        com.airbnb.lottie.LottieAnimationView lottieAnimationView2 = (com.airbnb.lottie.LottieAnimationView) this.a.get();
        if (lottieAnimationView2 != null) {
            int i = lottieAnimationView2.b;
            if (i != 0) {
                lottieAnimationView2.setImageResource(i);
            }
            com.airbnb.lottie.LottieAnimationView.a.a(th);
        }
    }

    public gzg(com.airbnb.lottie.LottieAnimationView lottieAnimationView, int i) {
        this.$cid = i;
        this.a = new java.lang.ref.WeakReference(lottieAnimationView);
    }
}
