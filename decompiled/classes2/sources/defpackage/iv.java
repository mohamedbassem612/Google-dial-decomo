package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iv extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.iw a;
    final /* synthetic */ android.view.ViewPropertyAnimator b;
    final /* synthetic */ android.view.View c;
    final /* synthetic */ ix d;

    public iv(ix ixVar, defpackage.iw iwVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.a = iwVar;
        this.b = viewPropertyAnimator;
        this.c = view;
        this.d = ixVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.b.setListener(null);
        android.view.View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        ix ixVar = this.d;
        defpackage.iw iwVar = this.a;
        ixVar.l(iwVar.b);
        ixVar.g.remove(iwVar.b);
        ixVar.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        ld ldVar = this.a.b;
    }
}
