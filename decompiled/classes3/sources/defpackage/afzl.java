package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afzl extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.animation.AnimatorSet a;
    final /* synthetic */ defpackage.afzu b;

    public afzl(defpackage.afzu afzuVar, android.animation.AnimatorSet animatorSet) {
        this.a = animatorSet;
        j$.util.Objects.requireNonNull(afzuVar);
        this.b = afzuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        defpackage.afzu afzuVar = this.b;
        com.google.android.material.search.SearchView searchView = afzuVar.a;
        if (!searchView.k()) {
            searchView.d();
        }
        searchView.m(4, true);
        if (afzuVar.n == this.a) {
            afzuVar.n = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        defpackage.afzu afzuVar = this.b;
        afzuVar.c.setVisibility(0);
        afzuVar.a.m(3, true);
    }
}
