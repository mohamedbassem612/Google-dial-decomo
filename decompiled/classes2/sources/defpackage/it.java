package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class it extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ ld a;
    final /* synthetic */ int b;
    final /* synthetic */ android.view.View c;
    final /* synthetic */ int d;
    final /* synthetic */ android.view.ViewPropertyAnimator e;
    final /* synthetic */ ix f;

    public it(ix ixVar, ld ldVar, int i, android.view.View view, int i2, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.a = ldVar;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
        this.f = ixVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.e.setListener(null);
        ix ixVar = this.f;
        ld ldVar = this.a;
        ixVar.l(ldVar);
        ixVar.e.remove(ldVar);
        ixVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
