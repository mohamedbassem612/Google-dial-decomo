package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agcr extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.agcs a;

    public agcr(defpackage.agcs agcsVar) {
        j$.util.Objects.requireNonNull(agcsVar);
        this.a = agcsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.f.m(false);
    }
}
