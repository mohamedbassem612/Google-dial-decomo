package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wec extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ defpackage.wed b;
    private boolean c;

    public wec(defpackage.wed wedVar, android.view.View view) {
        this.a = view;
        j$.util.Objects.requireNonNull(wedVar);
        this.b = wedVar;
        this.c = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.c = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (this.c) {
            return;
        }
        android.view.View view = this.a;
        view.setOutlineProvider(android.view.ViewOutlineProvider.BACKGROUND);
        view.setClipToOutline(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        android.view.View view = this.a;
        view.setOutlineProvider(this.b);
        view.setClipToOutline(true);
    }
}
