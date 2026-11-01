package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agbn extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ defpackage.agbv b;

    public agbn(defpackage.agbv agbvVar, int i) {
        this.a = i;
        j$.util.Objects.requireNonNull(agbvVar);
        this.b = agbvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.b.f(this.a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        defpackage.agbv agbvVar = this.b;
        com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout = agbvVar.u;
        snackbarContentLayout.a.setAlpha(1.0f);
        android.view.ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout.a.animate().alpha(0.0f);
        long j = agbvVar.d;
        android.view.ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(j);
        android.animation.TimeInterpolator timeInterpolator = snackbarContentLayout.c;
        duration.setInterpolator(timeInterpolator).setStartDelay(0L).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(1.0f);
            snackbarContentLayout.b.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(0L).start();
        }
    }
}
