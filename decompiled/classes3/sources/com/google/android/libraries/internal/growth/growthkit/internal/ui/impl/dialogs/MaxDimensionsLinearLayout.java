package com.google.android.libraries.internal.growth.growthkit.internal.ui.impl.dialogs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class MaxDimensionsLinearLayout extends android.widget.LinearLayout {
    public int a;
    public int b;

    public MaxDimensionsLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        a(context, attributeSet);
    }

    private final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.acjz.a);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static final int b(int i, int i2) {
        return (i2 == -1 || i2 >= android.view.View.MeasureSpec.getSize(i)) ? i : android.view.View.MeasureSpec.makeMeasureSpec(i2, android.view.View.MeasureSpec.getMode(i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(b(i, this.b), b(i2, this.a));
    }

    public MaxDimensionsLinearLayout(android.content.Context context) {
        super(context);
        this.a = -1;
        this.b = -1;
    }

    public MaxDimensionsLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1;
        this.b = -1;
        a(context, attributeSet);
    }

    public MaxDimensionsLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = -1;
        this.b = -1;
        a(context, attributeSet);
    }
}
