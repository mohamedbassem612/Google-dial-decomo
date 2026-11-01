package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afxu extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.afxy a;

    public afxu(defpackage.afxy afxyVar) {
        j$.util.Objects.requireNonNull(afxyVar);
        this.a = afxyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        super.onAnimationRepeat(animator);
        defpackage.afxy afxyVar = this.a;
        int i = afxyVar.e;
        int length = defpackage.afxy.a.length;
        afxyVar.e = (i + 4) % afxyVar.d.e.length;
    }
}
