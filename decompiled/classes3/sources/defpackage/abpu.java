package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpu {
    public final android.view.View a;
    public float b;
    public boolean c;
    public final android.view.ViewOutlineProvider d;
    private final android.animation.ValueAnimator e;

    public abpu(android.view.View view) {
        this.a = view;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new emd());
        valueAnimatorOfFloat.setDuration(250L);
        aooh.e(valueAnimatorOfFloat, "apply(...)");
        this.e = valueAnimatorOfFloat;
        this.d = new defpackage.abpt(this);
    }

    public final void a(float f) {
        arg argVar = new arg(this, f, 4);
        if (this.c) {
            android.animation.ValueAnimator valueAnimator = this.e;
            valueAnimator.cancel();
            valueAnimator.removeAllListeners();
            argVar.a(valueAnimator);
            valueAnimator.start();
        }
    }

    public final void b(float f) {
        float f2 = this.b;
        this.b = f;
        if (this.c) {
            android.view.View view = this.a;
            view.setClipToOutline(f != 0.0f);
            if (f2 != f) {
                view.invalidateOutline();
            }
        }
    }
}
