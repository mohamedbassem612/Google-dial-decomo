package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gkt extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ aca a;
    final /* synthetic */ gkz b;

    public gkt(gkz gkzVar, aca acaVar) {
        this.a = acaVar;
        this.b = gkzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.remove(animator);
        this.b.j.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.b.j.add(animator);
    }
}
