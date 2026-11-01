package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afxp extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.afxt a;

    public afxp(defpackage.afxt afxtVar) {
        j$.util.Objects.requireNonNull(afxtVar);
        this.a = afxtVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        super.onAnimationRepeat(animator);
        defpackage.afxt afxtVar = this.a;
        afxtVar.f = (afxtVar.f + 4) % afxtVar.e.e.length;
    }
}
