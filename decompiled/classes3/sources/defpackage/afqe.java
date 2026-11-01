package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afqe extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ com.google.android.material.behavior.HideViewOnScrollBehavior b;

    public afqe(com.google.android.material.behavior.HideViewOnScrollBehavior hideViewOnScrollBehavior, android.view.View view) {
        this.a = view;
        j$.util.Objects.requireNonNull(hideViewOnScrollBehavior);
        this.b = hideViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        com.google.android.material.behavior.HideViewOnScrollBehavior hideViewOnScrollBehavior = this.b;
        hideViewOnScrollBehavior.d = null;
        if (hideViewOnScrollBehavior.c == 1) {
            android.view.View view = this.a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
