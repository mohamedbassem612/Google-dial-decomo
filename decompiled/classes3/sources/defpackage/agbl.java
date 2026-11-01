package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agbl extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ defpackage.agbv b;

    public agbl(defpackage.agbv agbvVar, int i) {
        this.a = i;
        j$.util.Objects.requireNonNull(agbvVar);
        this.b = agbvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.b.f(this.a);
    }
}
