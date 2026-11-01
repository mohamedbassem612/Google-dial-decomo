package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afvx extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.afvy a;

    public afvx(defpackage.afvy afvyVar) {
        j$.util.Objects.requireNonNull(afvyVar);
        this.a = afvyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.afvy afvyVar = this.a;
        afvyVar.a.setTranslationY(0.0f);
        afvyVar.g(0.0f);
    }
}
