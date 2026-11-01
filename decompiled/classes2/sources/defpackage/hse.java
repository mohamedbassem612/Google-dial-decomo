package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hse extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.hsh a;

    public hse(defpackage.hsh hshVar) {
        this.a = hshVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        defpackage.hsh hshVar = this.a;
        hshVar.e(hshVar.e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.hsh hshVar = this.a;
        hshVar.e(hshVar.f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        defpackage.hsh hshVar = this.a;
        hshVar.e(hshVar.d);
    }
}
