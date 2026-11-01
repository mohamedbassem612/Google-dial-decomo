package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afwk implements android.animation.ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ float a;
    final /* synthetic */ afwm b;

    public afwk(afwm afwmVar, float f) {
        this.a = f;
        j$.util.Objects.requireNonNull(afwmVar);
        this.b = afwmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.b.o(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), this.a);
    }
}
