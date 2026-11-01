package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afxq extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.afxt a;

    public afxq(defpackage.afxt afxtVar) {
        j$.util.Objects.requireNonNull(afxtVar);
        this.a = afxtVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        defpackage.afxt afxtVar = this.a;
        afxtVar.a();
        gls glsVar = afxtVar.i;
        if (glsVar != null) {
            glsVar.b(afxtVar.j);
        }
    }
}
