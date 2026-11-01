package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afxv extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.afxy a;

    public afxv(defpackage.afxy afxyVar) {
        j$.util.Objects.requireNonNull(afxyVar);
        this.a = afxyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        defpackage.afxy afxyVar = this.a;
        afxyVar.a();
        gls glsVar = afxyVar.h;
        if (glsVar != null) {
            glsVar.b(afxyVar.j);
        }
    }
}
