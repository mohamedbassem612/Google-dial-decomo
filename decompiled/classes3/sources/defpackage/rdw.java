package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rdw implements android.animation.Animator.AnimatorListener {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ defpackage.rdx b;
    final /* synthetic */ android.view.View c;

    public rdw(android.view.View view, defpackage.rdx rdxVar, android.view.View view2) {
        this.a = view;
        this.b = rdxVar;
        this.c = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        aooh.f(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        aooh.f(animator, "animator");
        android.view.View view = this.a;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
        android.view.ViewGroup viewGroup = this.b.a;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = -2;
        viewGroup.setLayoutParams(layoutParams2);
        android.view.View view2 = this.c;
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.height = -2;
            view2.setLayoutParams(layoutParams3);
            view2.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        aooh.f(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        aooh.f(animator, "animator");
    }
}
