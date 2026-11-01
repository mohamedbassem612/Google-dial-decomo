package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abox extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.aboy a;

    public abox(defpackage.aboy aboyVar) {
        this.a = aboyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        defpackage.aboy.c(this.a.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        defpackage.aboy.c(this.a.d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator, boolean z) {
        aooh.f(animator, "animation");
        defpackage.aboy.c(this.a.b);
    }
}
