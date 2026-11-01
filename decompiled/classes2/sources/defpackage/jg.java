package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jg extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.jh a;
    private boolean b = false;

    public jg(defpackage.jh jhVar) {
        this.a = jhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        defpackage.jh jhVar = this.a;
        if (((java.lang.Float) jhVar.p.getAnimatedValue()).floatValue() == 0.0f) {
            jhVar.q = 0;
            jhVar.e(0);
        } else {
            jhVar.q = 2;
            jhVar.d();
        }
    }
}
