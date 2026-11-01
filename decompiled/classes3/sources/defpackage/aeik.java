package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aeik extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.aeim a;

    public aeik(defpackage.aeim aeimVar) {
        j$.util.Objects.requireNonNull(aeimVar);
        this.a = aeimVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.aeim aeimVar = this.a;
        aeimVar.f = false;
        if (aeimVar.d.f()) {
            aeimVar.d.b();
        }
        aeimVar.a.k(null);
    }
}
