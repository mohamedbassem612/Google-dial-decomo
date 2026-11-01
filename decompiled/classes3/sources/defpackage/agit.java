package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agit extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.agiu a;

    public agit(defpackage.agiu agiuVar) {
        this.a = agiuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        aomy aomyVar = this.a.c;
        if (aomyVar != null) {
            aomyVar.a();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        super.onAnimationStart(animator);
    }
}
