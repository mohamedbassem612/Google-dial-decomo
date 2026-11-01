package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ir extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ ld a;
    final /* synthetic */ android.view.ViewPropertyAnimator b;
    final /* synthetic */ android.view.View c;
    final /* synthetic */ ix d;

    public ir(ix ixVar, ld ldVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.a = ldVar;
        this.b = viewPropertyAnimator;
        this.c = view;
        this.d = ixVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        ix ixVar = this.d;
        ld ldVar = this.a;
        ixVar.l(ldVar);
        ixVar.f.remove(ldVar);
        ixVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
