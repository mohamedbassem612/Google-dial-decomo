package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afym extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.afyo a;

    public afym(defpackage.afyo afyoVar) {
        j$.util.Objects.requireNonNull(afyoVar);
        this.a = afyoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        super.onAnimationRepeat(animator);
        defpackage.afyo afyoVar = this.a;
        afyoVar.c = (afyoVar.c + 1) % afyoVar.b.e.length;
        afyoVar.d = true;
    }
}
