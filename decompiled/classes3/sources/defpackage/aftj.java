package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aftj extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ defpackage.aftn b;
    final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton.AnonymousClass1 c;
    private boolean d;

    public aftj(defpackage.aftn aftnVar, boolean z, com.google.android.material.floatingactionbutton.FloatingActionButton.AnonymousClass1 anonymousClass1) {
        this.a = z;
        this.c = anonymousClass1;
        j$.util.Objects.requireNonNull(aftnVar);
        this.b = aftnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.aftn aftnVar = this.b;
        aftnVar.A = 0;
        aftnVar.v = null;
        if (this.d) {
            return;
        }
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = aftnVar.B;
        boolean z = this.a;
        floatingActionButton.g(true != z ? 4 : 8, z);
        com.google.android.material.floatingactionbutton.FloatingActionButton.AnonymousClass1 anonymousClass1 = this.c;
        if (anonymousClass1 != null) {
            anonymousClass1.onHidden();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        defpackage.aftn aftnVar = this.b;
        aftnVar.B.g(0, this.a);
        aftnVar.A = 1;
        aftnVar.v = animator;
        this.d = false;
    }
}
