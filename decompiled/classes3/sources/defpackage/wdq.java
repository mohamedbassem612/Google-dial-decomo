package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wdq extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ wdx a;

    public wdq(wdx wdxVar) {
        j$.util.Objects.requireNonNull(wdxVar);
        this.a = wdxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        wdx wdxVar = this.a;
        wdxVar.m = 2;
        wdxVar.e();
    }
}
