package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afzm extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.animation.AnimatorSet a;
    final /* synthetic */ defpackage.afzu b;

    public afzm(defpackage.afzu afzuVar, android.animation.AnimatorSet animatorSet) {
        this.a = animatorSet;
        j$.util.Objects.requireNonNull(afzuVar);
        this.b = afzuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.afzu afzuVar = this.b;
        afzuVar.c.setVisibility(8);
        com.google.android.material.search.SearchView searchView = afzuVar.a;
        if (!searchView.k()) {
            afzuVar.j.clearFocus();
        }
        searchView.m(2, true);
        if (afzuVar.n == this.a) {
            afzuVar.n = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.b.a.m(1, true);
    }
}
