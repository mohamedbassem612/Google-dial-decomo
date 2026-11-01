package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afwc extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ afwd c;

    public afwc(afwd afwdVar, boolean z, int i) {
        this.a = z;
        this.b = i;
        j$.util.Objects.requireNonNull(afwdVar);
        this.c = afwdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        afwd afwdVar = this.c;
        afwdVar.a.setTranslationX(0.0f);
        afwdVar.g(0.0f, this.a, this.b);
    }
}
