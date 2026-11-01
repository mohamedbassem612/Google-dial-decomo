package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agee implements defpackage.ageg {
    private final int a;

    public agee(int i) {
        this.a = i;
    }

    private static android.animation.Animator c(android.view.View view, float f, float f2, float f3) {
        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(view, android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_X, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new defpackage.aged(view, f3));
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static boolean d(android.view.View view) {
        return view.getLayoutDirection() == 1;
    }

    private static final int e(android.content.Context context) {
        return context.getResources().getDimensionPixelSize(2131167213);
    }

    @Override // defpackage.ageg
    public final android.animation.Animator a(android.view.ViewGroup viewGroup, android.view.View view) {
        int iE = e(view.getContext());
        float translationX = view.getTranslationX();
        view.getTranslationY();
        int i = this.a;
        if (i == 8388611) {
            float f = iE;
            return c(view, d(viewGroup) ? f + translationX : translationX - f, translationX, translationX);
        }
        if (i != 8388613) {
            throw new java.lang.IllegalArgumentException(a.bj(i, "Invalid slide direction: "));
        }
        float f2 = iE;
        return c(view, d(viewGroup) ? translationX - f2 : f2 + translationX, translationX, translationX);
    }

    @Override // defpackage.ageg
    public final android.animation.Animator b(android.view.ViewGroup viewGroup, android.view.View view) {
        int iE = e(view.getContext());
        float translationX = view.getTranslationX();
        view.getTranslationY();
        int i = this.a;
        if (i == 8388611) {
            float f = iE;
            return c(view, translationX, d(viewGroup) ? translationX - f : f + translationX, translationX);
        }
        if (i != 8388613) {
            throw new java.lang.IllegalArgumentException(a.bj(i, "Invalid slide direction: "));
        }
        float f2 = iE;
        return c(view, translationX, d(viewGroup) ? f2 + translationX : translationX - f2, translationX);
    }
}
