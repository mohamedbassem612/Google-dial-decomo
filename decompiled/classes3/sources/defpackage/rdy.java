package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rdy extends android.transition.Visibility {
    public static final /* synthetic */ int a = 0;
    private static final android.view.animation.PathInterpolator b = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    private final float c;
    private final float d;

    public rdy(float f, float f2) {
        this.c = f;
        this.d = f2;
    }

    private final android.animation.Animator a(android.view.View view) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.c, this.d);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(b);
        valueAnimatorOfFloat.addUpdateListener(new mh(view, 9, (byte[]) null));
        aooh.c(valueAnimatorOfFloat);
        return valueAnimatorOfFloat;
    }

    @Override // android.transition.Visibility
    public final android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, android.transition.TransitionValues transitionValues, android.transition.TransitionValues transitionValues2) {
        aooh.f(viewGroup, "sceneRoot");
        aooh.f(view, "view");
        return a(view);
    }

    @Override // android.transition.Visibility
    public final android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, android.transition.TransitionValues transitionValues, android.transition.TransitionValues transitionValues2) {
        aooh.f(viewGroup, "sceneRoot");
        aooh.f(view, "view");
        return a(view);
    }
}
