package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class mi implements android.animation.Animator.AnimatorListener {
    final float d;
    final float e;
    final float f;
    final float g;
    public final ld h;
    final int i;
    final android.animation.ValueAnimator j;
    boolean k;
    float l;
    float m;
    public boolean n = false;
    public boolean o = false;
    public float p;

    public mi(ld ldVar, int i, float f, float f2, float f3, float f4) {
        this.i = i;
        this.h = ldVar;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.j = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new defpackage.mh(this, 0));
        valueAnimatorOfFloat.setTarget(ldVar.a);
        valueAnimatorOfFloat.addListener(this);
        this.p = 0.0f;
    }

    public final void a() {
        this.j.cancel();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.p = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (!this.o) {
            this.h.n(true);
        }
        this.o = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
