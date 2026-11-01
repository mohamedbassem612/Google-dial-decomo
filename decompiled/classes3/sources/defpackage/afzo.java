package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afzo implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ afzo(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        switch (this.$cid) {
            case 0:
                ((defpackage.afzr) this.a).a.f.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int i = defpackage.afzu.x;
                ((android.widget.ImageButton) this.a).setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ((defpackage.afzr) this.a).a.k(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                defpackage.afzr.g(((defpackage.afzr) this.a).a.i, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                defpackage.afzu afzuVar = ((defpackage.afzt) this.a).a;
                afzuVar.j.setAlpha(fFloatValue);
                afzuVar.q.B.setAlpha(1.0f - ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                float fFloatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                defpackage.agbj agbjVar = (defpackage.agbj) this.a;
                for (defpackage.agdx agdxVar : agbjVar.d) {
                    agdxVar.j = fFloatValue2;
                    agdxVar.k = fFloatValue2;
                    agdxVar.n = afpc.a(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue2);
                    agdxVar.invalidateSelf();
                }
                agbjVar.postInvalidateOnAnimation();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.agcs) this.a).h.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                float fFloatValue3 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                com.google.android.material.internal.CheckableImageButton checkableImageButton = ((defpackage.agcs) this.a).h;
                checkableImageButton.setScaleX(fFloatValue3);
                checkableImageButton.setScaleY(fFloatValue3);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((defpackage.agdb) this.a).h.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aooh.f(valueAnimator, "it");
                java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
                aooh.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue4 = ((java.lang.Float) animatedValue).floatValue();
                com.google.android.setupdesign.view.GradientCircularProgressIndicator gradientCircularProgressIndicator = (com.google.android.setupdesign.view.GradientCircularProgressIndicator) this.a;
                gradientCircularProgressIndicator.c = 720.0f * fFloatValue4;
                double d = ((double) fFloatValue4) * 3.141592653589793d;
                gradientCircularProgressIndicator.d = (float) ((((java.lang.Math.sin((d + d) - 1.5707963267948966d) + 1.0d) / 2.0d) * 280.0d) + 20.0d);
                gradientCircularProgressIndicator.invalidate();
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aooh.f(valueAnimator, "it");
                java.lang.Object animatedValue2 = valueAnimator.getAnimatedValue();
                aooh.d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue5 = ((java.lang.Float) animatedValue2).floatValue();
                com.google.android.setupdesign.view.GradientCircularProgressIndicator gradientCircularProgressIndicator2 = (com.google.android.setupdesign.view.GradientCircularProgressIndicator) this.a;
                gradientCircularProgressIndicator2.b = fFloatValue5;
                if (gradientCircularProgressIndicator2.a) {
                    gradientCircularProgressIndicator2.invalidate();
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                xtq xtqVar = defpackage.agiu.e;
                aooh.f(valueAnimator, "animator");
                java.lang.Object animatedValue3 = valueAnimator.getAnimatedValue();
                aooh.d(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                ((aggz) this.a).a(((java.lang.Float) animatedValue3).floatValue());
                break;
            default:
                xtq xtqVar2 = defpackage.agiu.e;
                aooh.f(valueAnimator, "animator");
                java.lang.Object animatedValue4 = valueAnimator.getAnimatedValue();
                aooh.d(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                ((aggz) this.a).a(((java.lang.Float) animatedValue4).floatValue());
                break;
        }
    }
}
