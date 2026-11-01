package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afsz extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.afto a;
    private boolean b;

    public afsz(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, defpackage.afto aftoVar) {
        this.a = aftoVar;
        j$.util.Objects.requireNonNull(extendedFloatingActionButton);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.b = true;
        this.a.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.afto aftoVar = this.a;
        aftoVar.f();
        if (this.b) {
            return;
        }
        aftoVar.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.a.g(animator);
        this.b = false;
    }
}
