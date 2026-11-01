package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wdr extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ wdx a;

    public wdr(wdx wdxVar) {
        j$.util.Objects.requireNonNull(wdxVar);
        this.a = wdxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        wdx wdxVar = this.a;
        wdxVar.m = 3;
        ((defpackage.wdw) wdxVar.o.eZ()).b.setAccessibilityDelegate(null);
    }
}
