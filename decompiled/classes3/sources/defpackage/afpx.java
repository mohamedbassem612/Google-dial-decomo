package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afpx extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ com.google.android.material.behavior.HideBottomViewOnScrollBehavior b;

    public afpx(com.google.android.material.behavior.HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, android.view.View view) {
        this.a = view;
        j$.util.Objects.requireNonNull(hideBottomViewOnScrollBehavior);
        this.b = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        com.google.android.material.behavior.HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.b;
        hideBottomViewOnScrollBehavior.d = null;
        if (hideBottomViewOnScrollBehavior.c == 1) {
            android.view.View view = this.a;
            if (view.getVisibility() == 0) {
                view.setVisibility(4);
            }
        }
    }
}
