package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aeil extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ ahyn a;
    final /* synthetic */ android.graphics.drawable.Drawable b;
    final /* synthetic */ defpackage.aeim c;

    public aeil(defpackage.aeim aeimVar, ahyn ahynVar, android.graphics.drawable.Drawable drawable) {
        this.a = ahynVar;
        this.b = drawable;
        j$.util.Objects.requireNonNull(aeimVar);
        this.c = aeimVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        defpackage.aeim aeimVar = this.c;
        aeimVar.g = false;
        aeimVar.d = this.a;
        if (aeimVar.d.f()) {
            aeimVar.d.b();
        }
        aeimVar.a.k(this.b);
    }
}
