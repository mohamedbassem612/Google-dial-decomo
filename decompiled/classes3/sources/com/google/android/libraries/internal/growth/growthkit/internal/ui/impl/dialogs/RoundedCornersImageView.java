package com.google.android.libraries.internal.growth.growthkit.internal.ui.impl.dialogs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class RoundedCornersImageView extends android.support.v7.widget.AppCompatImageView {
    private android.graphics.RectF a;
    private android.graphics.Path b;
    private float[] c;

    public RoundedCornersImageView(android.content.Context context) {
        super(context);
        b(null);
    }

    private final void b(android.util.AttributeSet attributeSet) {
        this.b = new android.graphics.Path();
        this.a = new android.graphics.RectF();
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.acjz.b);
            float dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
            float dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            float dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
            float dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            a(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3, dimensionPixelOffset4);
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.c = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    protected final void onDraw(android.graphics.Canvas canvas) {
        if (this.c != null) {
            this.a.set(0.0f, 0.0f, getWidth(), getHeight());
            this.b.reset();
            this.b.addRoundRect(this.a, this.c, android.graphics.Path.Direction.CW);
            canvas.clipPath(this.b);
        }
        super.onDraw(canvas);
    }

    public RoundedCornersImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet);
    }

    public RoundedCornersImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet);
    }
}
