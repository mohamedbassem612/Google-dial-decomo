package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agbg extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ defpackage.agbj a;

    public agbg(defpackage.agbj agbjVar) {
        j$.util.Objects.requireNonNull(agbjVar);
        this.a = agbjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        defpackage.agbj agbjVar = this.a;
        android.view.ViewOverlay viewOverlayB = agbjVar.b();
        if (viewOverlayB != null) {
            java.util.Iterator it = agbjVar.d.iterator();
            while (it.hasNext()) {
                viewOverlayB.remove((defpackage.agdx) it.next());
            }
        }
    }
}
