package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class is extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ ld a;
    final /* synthetic */ android.view.View b;
    final /* synthetic */ android.view.ViewPropertyAnimator c;
    final /* synthetic */ ix d;

    public is(ix ixVar, ld ldVar, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.a = ldVar;
        this.b = view;
        this.c = viewPropertyAnimator;
        this.d = ixVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.c.setListener(null);
        ix ixVar = this.d;
        ld ldVar = this.a;
        ixVar.l(ldVar);
        ixVar.d.remove(ldVar);
        ixVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
