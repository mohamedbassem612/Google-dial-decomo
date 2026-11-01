package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afoz extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.afpb a;

    public afoz(defpackage.afpb afpbVar) {
        j$.util.Objects.requireNonNull(afpbVar);
        this.a = afpbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.d();
    }
}
