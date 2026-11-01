package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afui implements defpackage.afuj {
    private final /* synthetic */ int $cid;

    @Override // defpackage.afuj
    public final void a(android.animation.ValueAnimator valueAnimator, android.view.View view) {
        int i = this.$cid;
        if (i == 0) {
            int i2 = defpackage.afuk.a;
            java.lang.Float f = (java.lang.Float) valueAnimator.getAnimatedValue();
            view.setScaleX(f.floatValue());
            view.setScaleY(f.floatValue());
            return;
        }
        if (i == 1) {
            int i3 = defpackage.afuk.a;
            view.setTranslationX(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        } else if (i != 2) {
            int i4 = defpackage.afuk.a;
            view.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            int i5 = defpackage.afuk.a;
            view.setTranslationY(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
