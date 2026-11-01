package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afwa extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;

    public afwa(defpackage.afwb afwbVar, android.view.View view) {
        this.a = view;
        j$.util.Objects.requireNonNull(afwbVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = this.a;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
