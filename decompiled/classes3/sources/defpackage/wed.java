package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wed extends android.view.ViewOutlineProvider {
    public final float a;
    public final float b;
    public final android.graphics.Rect c;
    public final android.graphics.Rect d;
    public final android.graphics.Rect e = new android.graphics.Rect();
    public float f;

    public wed(float f, float f2, android.graphics.Rect rect, android.graphics.Rect rect2) {
        this.a = f;
        this.b = f2;
        this.c = rect;
        this.d = rect2;
    }

    final android.animation.ValueAnimator a(android.view.View view, boolean z) {
        int i = 1;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(true != z ? 0.0f : 1.0f, true != z ? 1.0f : 0.0f);
        valueAnimatorOfFloat.addListener(new defpackage.wec(this, view));
        valueAnimatorOfFloat.addUpdateListener(new defpackage.wer(this, view, i));
        return valueAnimatorOfFloat;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        outline.setRoundRect(this.e, this.f);
    }
}
