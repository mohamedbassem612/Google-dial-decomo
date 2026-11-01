package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afyp extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.afys a;

    public afyp(defpackage.afys afysVar) {
        j$.util.Objects.requireNonNull(afysVar);
        this.a = afysVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        super.onAnimationRepeat(animator);
        defpackage.afys afysVar = this.a;
        afysVar.e = (afysVar.e + 1) % afysVar.d.e.length;
        afysVar.f = true;
    }
}
