package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agcq extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.agcs a;

    public agcq(defpackage.agcs agcsVar) {
        j$.util.Objects.requireNonNull(agcsVar);
        this.a = agcsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.a.f.m(true);
    }
}
