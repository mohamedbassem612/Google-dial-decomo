package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aftk extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ defpackage.aftn b;
    final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton.AnonymousClass1 c;

    public aftk(defpackage.aftn aftnVar, boolean z, com.google.android.material.floatingactionbutton.FloatingActionButton.AnonymousClass1 anonymousClass1) {
        this.a = z;
        this.c = anonymousClass1;
        j$.util.Objects.requireNonNull(aftnVar);
        this.b = aftnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.aftn aftnVar = this.b;
        aftnVar.A = 0;
        aftnVar.v = null;
        com.google.android.material.floatingactionbutton.FloatingActionButton.AnonymousClass1 anonymousClass1 = this.c;
        if (anonymousClass1 != null) {
            anonymousClass1.onShown();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        defpackage.aftn aftnVar = this.b;
        aftnVar.B.g(0, this.a);
        aftnVar.A = 2;
        aftnVar.v = animator;
    }
}
