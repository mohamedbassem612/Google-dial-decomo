package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wdo extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ wdx a;

    public wdo(wdx wdxVar) {
        j$.util.Objects.requireNonNull(wdxVar);
        this.a = wdxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        wdx wdxVar = this.a;
        wdxVar.y = 3;
        ((defpackage.wdu) wdxVar.x.eZ()).b.setVisibility(0);
        ((defpackage.wdw) wdxVar.o.eZ()).a(true);
        ((defpackage.wdu) wdxVar.x.eZ()).a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.a.y = 4;
    }
}
