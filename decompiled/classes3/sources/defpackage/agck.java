package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agck implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ android.view.View a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ android.widget.LinearLayout c;

    public agck(com.google.android.material.appbar.AppBarLayout.BaseBehavior baseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i) {
        this.$cid = i;
        this.a = coordinatorLayout;
        this.c = appBarLayout;
        j$.util.Objects.requireNonNull(baseBehavior);
        this.b = baseBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        if (this.$cid != 0) {
            int iIntValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
            android.widget.LinearLayout linearLayout = this.c;
            ((defpackage.afpp) this.b).h(this.a, linearLayout, iIntValue, Integer.MIN_VALUE, Integer.MAX_VALUE);
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        java.lang.Object obj = this.b;
        ((defpackage.agcl) this.c).c(this.a, (android.view.View) obj, animatedFraction);
    }

    public agck(defpackage.agcl agclVar, android.view.View view, android.view.View view2, int i) {
        this.$cid = i;
        this.a = view;
        this.b = view2;
        j$.util.Objects.requireNonNull(agclVar);
        this.c = agclVar;
    }
}
