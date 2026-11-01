package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FillContentLayout extends android.widget.FrameLayout {
    private int a;
    private int b;

    public FillContentLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.h, i, 0);
        defpackage.agfz agfzVarI = defpackage.agfz.i(context);
        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_ILLUSTRATION_MAX_HEIGHT;
        if (agfzVarI.v(agfxVar)) {
            this.b = (int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f);
        } else {
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        defpackage.agfz agfzVarI2 = defpackage.agfz.i(context);
        defpackage.agfx agfxVar2 = defpackage.agfx.CONFIG_ILLUSTRATION_MAX_WIDTH;
        if (agfzVarI2.v(agfxVar2)) {
            this.a = (int) defpackage.agfz.i(context).a(context, agfxVar2, 0.0f);
        } else {
            this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private static int a(int i, int i2, int i3) {
        int iMax = java.lang.Math.max(0, i - i2);
        if (i3 >= 0) {
            return android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        if (i3 == -1) {
            return android.view.View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        }
        if (i3 == -2) {
            return android.view.View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE);
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            childAt.measure(a(java.lang.Math.min(this.a, measuredWidth), getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), a(java.lang.Math.min(this.b, measuredHeight), getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        }
    }

    public FillContentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970602);
    }

    public FillContentLayout(android.content.Context context) {
        this(context, null);
    }
}
