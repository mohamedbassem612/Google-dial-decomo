package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rdx extends android.transition.Transition {
    private static final android.view.animation.PathInterpolator b = new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
    public final android.view.ViewGroup a;
    private final int c;

    public rdx(android.view.ViewGroup viewGroup) {
        android.view.ViewGroup.LayoutParams layoutParams;
        aooh.f(viewGroup, "parentView");
        this.a = viewGroup;
        int height = viewGroup.getHeight();
        this.c = height;
        if (!viewGroup.isLaidOut() || (layoutParams = viewGroup.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = height;
        viewGroup.setLayoutParams(layoutParams);
    }

    @Override // android.transition.Transition
    public final void captureEndValues(android.transition.TransitionValues transitionValues) {
        aooh.f(transitionValues, "transitionValues");
        transitionValues.view.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.a.getWidth(), 1073741824), 0);
        java.util.Map map = transitionValues.values;
        aooh.e(map, "values");
        map.put("dialer:container_height:height", java.lang.Integer.valueOf(transitionValues.view.getMeasuredHeight()));
    }

    @Override // android.transition.Transition
    public final void captureStartValues(android.transition.TransitionValues transitionValues) {
        aooh.f(transitionValues, "transitionValues");
    }

    @Override // android.transition.Transition
    public final android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, android.transition.TransitionValues transitionValues, android.transition.TransitionValues transitionValues2) {
        aooh.f(viewGroup, "sceneRoot");
        if (transitionValues2 == null) {
            return null;
        }
        int i = this.c;
        java.lang.Object obj = transitionValues2.values.get("dialer:container_height:height");
        aooh.d(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((java.lang.Integer) obj).intValue();
        android.view.View view = transitionValues2.view;
        aooh.e(view, "view");
        java.lang.Object parent = view.getParent();
        final android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        view.getLayoutParams().height = iIntValue;
        android.view.ViewGroup viewGroup2 = this.a;
        int paddingBottom = iIntValue + viewGroup2.getPaddingBottom() + viewGroup2.getPaddingTop();
        int[] iArr = new int[2];
        viewGroup2.getLocationInWindow(iArr);
        final int iMin = java.lang.Math.min(paddingBottom, iArr[1] + viewGroup2.getHeight());
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(i, iMin);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(b);
        valueAnimatorOfInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: rdv
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                aooh.f(valueAnimator, "valueAnimator");
                java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
                aooh.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((java.lang.Integer) animatedValue).intValue();
                android.view.ViewGroup viewGroup3 = this.a.a;
                viewGroup3.getLayoutParams().height = iIntValue2;
                int i2 = iIntValue2 - iMin;
                android.view.View view3 = view2;
                if (view3 != null) {
                    view3.setTranslationY(i2);
                }
                viewGroup3.requestLayout();
            }
        });
        aooh.c(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new defpackage.rdw(view, this, view2));
        return valueAnimatorOfInt;
    }
}
