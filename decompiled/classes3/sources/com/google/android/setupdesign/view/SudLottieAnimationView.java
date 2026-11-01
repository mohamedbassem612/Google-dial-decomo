package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class SudLottieAnimationView extends com.airbnb.lottie.LottieAnimationView implements android.view.View.OnClickListener, android.animation.Animator.AnimatorListener, android.animation.Animator.AnimatorPauseListener {
    private static final xtq i = new xtq(com.google.android.setupdesign.view.SudLottieAnimationView.class);
    private android.view.View.OnClickListener e;
    private final ebc f;
    private final ebc g;
    private final java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SudLottieAnimationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.animation.ValueAnimator.DurationScaleChangeListener durationScaleChangeListener;
        super(context, attributeSet);
        aooh.f(context, "context");
        this.f = u(2132020293);
        this.g = u(2132020294);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            final int i2 = 0;
            durationScaleChangeListener = new android.animation.ValueAnimator.DurationScaleChangeListener() { // from class: agir
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f) {
                    int i3 = i2;
                    java.lang.Object obj = this;
                    if (i3 != 0) {
                        ((ejk) ((fje) obj).b).e = f;
                        return;
                    }
                    com.google.android.setupdesign.view.SudLottieAnimationView sudLottieAnimationView = (com.google.android.setupdesign.view.SudLottieAnimationView) obj;
                    sudLottieAnimationView.t(defpackage.aggo.a(sudLottieAnimationView.getContext()));
                    ((com.airbnb.lottie.LottieAnimationView) obj).e();
                }
            };
        } else {
            durationScaleChangeListener = null;
        }
        this.h = durationScaleChangeListener;
        super.setOnClickListener(this);
        setContentDescription(getResources().getString(2132020297));
        a(this);
        ((com.airbnb.lottie.LottieAnimationView) this).c.c.addPauseListener(this);
        if (defpackage.agfz.B(context)) {
            android.content.Context context2 = getContext();
            aooh.e(context2, "getContext(...)");
            defpackage.aggp aggpVar = new defpackage.aggp(context2);
            aggpVar.a = -3;
            aggpVar.b = -3;
            setForeground(aggpVar.a());
        }
    }

    private final ebc u(int i2) {
        return new ebc((java.lang.Object) null, 16, getResources().getString(i2), (ebo) null, (java.lang.Class) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void v(ebc ebcVar) {
        dzs.i(this, new defpackage.agis(ebcVar));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        aooh.f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        aooh.f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        i.x("onAnimationPause");
        v(this.g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        aooh.f(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        i.x("onAnimationResume");
        v(this.f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        i.x("onAnimationStart");
        v(this.f);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (android.os.Build.VERSION.SDK_INT < 33 || !defpackage.aggo.b(getContext())) {
            return;
        }
        ?? r2 = this.h;
        aooh.d((java.lang.Object) r2, "null cannot be cast to non-null type android.animation.ValueAnimator.DurationScaleChangeListener");
        android.animation.ValueAnimator.registerDurationScaleChangeListener(r2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        aooh.f(view, "v");
        android.view.View.OnClickListener onClickListener = this.e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        if (s()) {
            d();
            t(defpackage.aggo.a(getContext()));
        } else {
            t(true);
            g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    protected final void onDetachedFromWindow() {
        if (android.os.Build.VERSION.SDK_INT >= 33 && defpackage.aggo.b(getContext())) {
            ?? r0 = this.h;
            aooh.d((java.lang.Object) r0, "null cannot be cast to non-null type android.animation.ValueAnimator.DurationScaleChangeListener");
            android.animation.ValueAnimator.unregisterDurationScaleChangeListener(r0);
        }
        super.onDetachedFromWindow();
    }

    public final void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.e = onClickListener;
    }

    public final void t(boolean z) {
        if (defpackage.aggo.b(getContext())) {
            gzs drawable = getDrawable();
            gzs gzsVar = drawable instanceof gzs ? drawable : null;
            if (gzsVar != null) {
                gzsVar.t(java.lang.Boolean.valueOf(z));
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SudLottieAnimationView(android.content.Context context) {
        aooh.f(context, "context");
        android.util.AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ SudLottieAnimationView(android.content.Context context, android.util.AttributeSet attributeSet, int i2, aooc aoocVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }
}
