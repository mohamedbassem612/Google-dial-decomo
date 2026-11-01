package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agea implements defpackage.ageg {
    private static android.animation.Animator c(android.view.View view, float f, float f2, float f3, float f4, float f5) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new defpackage.agdy(view, f, f2, f3, f4));
        valueAnimatorOfFloat.addListener(new defpackage.agdz(view, f5));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.ageg
    public final android.animation.Animator a(android.view.ViewGroup viewGroup, android.view.View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, 0.35f, 1.0f, alpha);
    }

    @Override // defpackage.ageg
    public final android.animation.Animator b(android.view.ViewGroup viewGroup, android.view.View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, 0.35f, alpha);
    }
}
