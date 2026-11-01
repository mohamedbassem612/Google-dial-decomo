package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wdp extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ wdx a;

    public wdp(wdx wdxVar) {
        j$.util.Objects.requireNonNull(wdxVar);
        this.a = wdxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.a.y = 2;
    }
}
