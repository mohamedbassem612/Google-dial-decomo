package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wdl implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ wdx a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ wdl(wdx wdxVar, float f, int i, int i2) {
        this.a = wdxVar;
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        wdx wdxVar = this.a;
        int i = wdxVar.m;
        if (i == 0 || i == 3) {
            return;
        }
        float f = this.b;
        float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        if (f != 0.0f) {
            int i2 = this.d;
            wdxVar.i.y = this.c + ((int) (java.lang.Math.abs(fFloatValue - i2) * f));
        }
        wdxVar.i.x = (int) fFloatValue;
        try {
            ((android.view.WindowManager) wdxVar.g.eZ()).updateViewLayout(((defpackage.wdw) wdxVar.o.eZ()).b, wdxVar.i);
        } catch (java.lang.IllegalArgumentException e) {
            a.bq(wdx.a.c(), "Root view not found", "com/android/dialer/widget/bubble/impl/BubbleImpl", "createBubbleMoveAnimator", (char) 1007, "BubbleImpl.java", e, zct.b);
        }
    }
}
