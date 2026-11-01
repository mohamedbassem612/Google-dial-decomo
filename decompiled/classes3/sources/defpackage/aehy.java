package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aehy extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.graphics.drawable.Drawable a = null;
    final /* synthetic */ defpackage.aehz b;

    public aehy(defpackage.aehz aehzVar, android.graphics.drawable.Drawable drawable) {
        j$.util.Objects.requireNonNull(aehzVar);
        this.b = aehzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        defpackage.aehz aehzVar = this.b;
        aehzVar.b.f(null);
        aehzVar.a.setVisibility(0);
    }
}
