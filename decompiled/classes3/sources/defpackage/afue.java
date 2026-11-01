package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afue implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final android.view.View a;
    private final android.view.View b;
    private final float[] c = new float[2];

    public afue(android.view.View view, android.view.View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.c;
        defpackage.aftt.d(fFloatValue, fArr);
        android.view.View view = this.a;
        if (view != null) {
            view.setAlpha(fArr[0]);
        }
        android.view.View view2 = this.b;
        if (view2 != null) {
            view2.setAlpha(fArr[1]);
        }
    }
}
