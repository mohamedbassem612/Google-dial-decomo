package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hrk extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ rai b;

    public hrk(android.view.View view, rai raiVar) {
        this.a = view;
        this.b = raiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        android.view.View view = this.a;
        view.setVisibility(8);
        view.setAlpha(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.setVisibility(8);
        ((defpackage.mlp) this.b.a).b.setVisibility(4);
    }
}
