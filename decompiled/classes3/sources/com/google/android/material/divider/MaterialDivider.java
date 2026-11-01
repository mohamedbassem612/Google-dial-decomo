package com.google.android.material.divider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MaterialDivider extends android.view.View {
    private final agaf a;
    private int b;
    private int c;
    private int d;
    private int e;

    public MaterialDivider(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.a(context, attributeSet, i, 2132086134), attributeSet, i);
        android.content.Context context2 = getContext();
        agaf agafVar = new agaf();
        this.a = agafVar;
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, defpackage.afsp.a, i, 2132086134, new int[0]);
        this.b = typedArrayA.getDimensionPixelSize(3, getResources().getDimensionPixelSize(2131166961));
        this.d = typedArrayA.getDimensionPixelOffset(2, 0);
        this.e = typedArrayA.getDimensionPixelOffset(1, 0);
        int defaultColor = agab.o(context2, typedArrayA, 0).getDefaultColor();
        if (this.c != defaultColor) {
            this.c = defaultColor;
            agafVar.R(android.content.res.ColorStateList.valueOf(defaultColor));
            invalidate();
        }
        typedArrayA.recycle();
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        int i;
        int width;
        int i2;
        super.onDraw(canvas);
        if (getLayoutDirection() == 1) {
            i = this.e;
            width = getWidth();
            i2 = this.d;
        } else {
            i = this.d;
            width = getWidth();
            i2 = this.e;
        }
        int i3 = width - i2;
        agaf agafVar = this.a;
        agafVar.setBounds(i, 0, i3, getBottom() - getTop());
        agafVar.draw(canvas);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.b;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public MaterialDivider(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969883);
    }

    public MaterialDivider(android.content.Context context) {
        this(context, null);
    }
}
