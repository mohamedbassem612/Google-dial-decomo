package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aged extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ float b;

    public aged(android.view.View view, float f) {
        this.a = view;
        this.b = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.setTranslationX(this.b);
    }
}
