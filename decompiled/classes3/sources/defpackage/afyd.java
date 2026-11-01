package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afyd extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.afyf a;

    public afyd(defpackage.afyf afyfVar) {
        j$.util.Objects.requireNonNull(afyfVar);
        this.a = afyfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        defpackage.afyf afyfVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        java.util.List list = afyfVar.k;
        if (list == null || afyfVar.l) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((gls) it.next()).b(afyfVar);
        }
    }
}
