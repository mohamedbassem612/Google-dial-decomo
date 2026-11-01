package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gku extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ gkz a;

    public gku(gkz gkzVar) {
        this.a = gkzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.r();
        animator.removeListener(this);
    }
}
