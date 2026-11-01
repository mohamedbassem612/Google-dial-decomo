package com.android.dialer.dialpadview;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ExpandingFrameLayout extends android.widget.FrameLayout {
    private int a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandingFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aooh.f(context, "context");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.mjd.a);
        aooh.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int mode;
        int size;
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int i3 = 1073741824;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = this.b;
                if (size2 >= Integer.MAX_VALUE) {
                    throw new java.lang.IllegalArgumentException("when used with UNSPECIFIED height, maxHeight must be specified");
                }
            }
            int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(size2, mode2);
            mode = android.view.View.MeasureSpec.getMode(i);
            size = android.view.View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                size = java.lang.Math.min(this.a, size);
            } else if (mode != 0) {
                i3 = mode;
            } else {
                size = this.a;
                if (size >= Integer.MAX_VALUE) {
                    throw new java.lang.IllegalArgumentException("when used with UNSPECIFIED width, maxWidth must be specified");
                }
            }
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, i3), iMakeMeasureSpec);
        }
        size2 = java.lang.Math.min(this.b, size2);
        mode2 = 1073741824;
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(size2, mode2);
        mode = android.view.View.MeasureSpec.getMode(i);
        size = android.view.View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            size = java.lang.Math.min(this.a, size);
        } else if (mode != 0) {
            i3 = mode;
        } else {
            size = this.a;
            if (size >= Integer.MAX_VALUE) {
                throw new java.lang.IllegalArgumentException("when used with UNSPECIFIED width, maxWidth must be specified");
            }
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, i3), iMakeMeasureSpec2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandingFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandingFrameLayout(android.content.Context context) {
        this(context, null, 0, 6, null);
        aooh.f(context, "context");
    }

    public /* synthetic */ ExpandingFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, aooc aoocVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
