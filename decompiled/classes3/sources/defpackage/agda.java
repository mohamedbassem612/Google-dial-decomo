package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agda extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.agdb a;

    public agda(defpackage.agdb agdbVar) {
        j$.util.Objects.requireNonNull(agdbVar);
        this.a = agdbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.agdb agdbVar = this.a;
        agdbVar.x();
        agdbVar.d.start();
    }
}
