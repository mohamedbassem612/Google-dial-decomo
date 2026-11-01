package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aejz extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;

    public aejz(android.view.View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.a.setVisibility(0);
    }
}
