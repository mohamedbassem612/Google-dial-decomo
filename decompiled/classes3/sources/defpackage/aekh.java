package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aekh extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.aekj a;

    public aekh(defpackage.aekj aekjVar) {
        j$.util.Objects.requireNonNull(aekjVar);
        this.a = aekjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.q.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        defpackage.aekj aekjVar = this.a;
        aekjVar.p.setVisibility(0);
        aekjVar.o.setVisibility(0);
    }
}
