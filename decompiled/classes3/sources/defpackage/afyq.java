package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afyq extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.afys a;

    public afyq(defpackage.afys afysVar) {
        j$.util.Objects.requireNonNull(afysVar);
        this.a = afysVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        defpackage.afys afysVar = this.a;
        afysVar.a();
        gls glsVar = afysVar.h;
        if (glsVar != null) {
            glsVar.b(afysVar.j);
        }
    }
}
