package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aejy extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ defpackage.aekj b;

    public aejy(defpackage.aekj aekjVar, boolean z) {
        this.a = z;
        j$.util.Objects.requireNonNull(aekjVar);
        this.b = aekjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (this.a) {
            defpackage.aekj aekjVar = this.b;
            aekjVar.o(true);
            aekjVar.p(true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        if (this.a) {
            return;
        }
        defpackage.aekj aekjVar = this.b;
        aekjVar.o(false);
        aekjVar.p(false);
    }
}
