package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agdy implements android.animation.ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;

    public agdy(android.view.View view, float f, float f2, float f3, float f4) {
        this.a = view;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = defpackage.agef.a;
        float f = this.d;
        float f2 = this.b;
        if (fFloatValue >= f) {
            float f3 = this.e;
            float f4 = this.c;
            if (fFloatValue > f3) {
                f2 = f4;
            } else {
                f2 += ((fFloatValue - f) / (f3 - f)) * (f4 - f2);
            }
        }
        this.a.setAlpha(f2);
    }
}
