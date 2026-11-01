package com.android.dialer.incall.answer.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class FixedAspectSurfaceView extends android.view.SurfaceView {
    private final float a;
    private final boolean b;
    private final boolean c;

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    public FixedAspectSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.pbz.a, 0, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.c = z;
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.b = z2;
        ahvr.bN(z != z2, "Must either scale width or height");
        float f = typedArrayObtainStyledAttributes.getFloat(0, 1.0f);
        ahvr.bN((boolean) (((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) ^ (-1)) >>> 31), "Aspect ratio must be positive");
        this.a = f;
        requestLayout();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z = this.b;
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (z) {
            size = (int) (size2 * this.a);
        } else if (this.c) {
            size2 = (int) (size / this.a);
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(size, i, 0), android.view.View.resolveSizeAndState(size2, i2, 0));
    }
}
