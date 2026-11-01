package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agbr extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.agbv a;

    public agbr(defpackage.agbv agbvVar) {
        j$.util.Objects.requireNonNull(agbvVar);
        this.a = agbvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.g();
    }
}
