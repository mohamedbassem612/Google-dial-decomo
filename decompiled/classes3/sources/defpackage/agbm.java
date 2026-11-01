package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agbm extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.agbv a;

    public agbm(defpackage.agbv agbvVar) {
        j$.util.Objects.requireNonNull(agbvVar);
        this.a = agbvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        defpackage.agbv agbvVar = this.a;
        com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout = agbvVar.u;
        snackbarContentLayout.a.setAlpha(0.0f);
        android.view.ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout.a.animate().alpha(1.0f);
        int i = agbvVar.c;
        long j = i;
        android.view.ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(j);
        android.animation.TimeInterpolator timeInterpolator = snackbarContentLayout.c;
        android.view.ViewPropertyAnimator interpolator = duration.setInterpolator(timeInterpolator);
        long j2 = agbvVar.e - i;
        interpolator.setStartDelay(j2).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(0.0f);
            snackbarContentLayout.b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }
}
