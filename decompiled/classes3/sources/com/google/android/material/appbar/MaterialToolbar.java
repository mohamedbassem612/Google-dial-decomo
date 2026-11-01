package com.google.android.material.appbar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MaterialToolbar extends android.support.v7.widget.Toolbar {
    private static final android.widget.ImageView.ScaleType[] C = {android.widget.ImageView.ScaleType.MATRIX, android.widget.ImageView.ScaleType.FIT_XY, android.widget.ImageView.ScaleType.FIT_START, android.widget.ImageView.ScaleType.FIT_CENTER, android.widget.ImageView.ScaleType.FIT_END, android.widget.ImageView.ScaleType.CENTER, android.widget.ImageView.ScaleType.CENTER_CROP, android.widget.ImageView.ScaleType.CENTER_INSIDE};
    public java.lang.Integer B;
    private boolean D;
    private boolean E;
    private android.widget.ImageView.ScaleType F;
    private java.lang.Boolean G;

    public MaterialToolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.a(context, attributeSet, i, 2132086177), attributeSet, i);
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, defpackage.afpr.c, i, 2132086177, new int[0]);
        if (typedArrayA.hasValue(2)) {
            this.B = java.lang.Integer.valueOf(typedArrayA.getColor(2, -1));
            android.graphics.drawable.Drawable drawableE = e();
            if (drawableE != null) {
                t(drawableE);
            }
        }
        this.D = typedArrayA.getBoolean(6, false);
        this.E = typedArrayA.getBoolean(5, false);
        int i2 = typedArrayA.getInt(1, -1);
        if (i2 >= 0 && i2 < 8) {
            this.F = C[i2];
        }
        if (typedArrayA.hasValue(0)) {
            this.G = java.lang.Boolean.valueOf(typedArrayA.getBoolean(0, false));
        }
        typedArrayA.recycle();
        agal agalVar = new agal(agal.m(context2, attributeSet, i, 2132086177));
        android.graphics.drawable.Drawable background = getBackground();
        android.content.res.ColorStateList colorStateListValueOf = background == null ? android.content.res.ColorStateList.valueOf(0) : agab.P(background);
        if (colorStateListValueOf != null) {
            agaf agafVar = new agaf(agalVar);
            agafVar.R(colorStateListValueOf);
            agafVar.N(context2);
            agafVar.Q(getElevation());
            setBackground(agafVar);
        }
    }

    private final void E(android.view.View view, android.util.Pair pair) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredWidth2 = view.getMeasuredWidth();
        int i = measuredWidth - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = java.lang.Math.max(java.lang.Math.max(((java.lang.Integer) pair.first).intValue() - i, 0), java.lang.Math.max(i2 - ((java.lang.Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        agab.f(this);
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.widget.ImageView imageView;
        android.graphics.drawable.Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        android.widget.ImageView imageView2 = null;
        if (this.D || this.E) {
            java.util.List listC = afvm.c(this, i());
            android.widget.TextView textView = listC.isEmpty() ? null : (android.widget.TextView) java.util.Collections.min(listC, afvm.a);
            java.util.List listC2 = afvm.c(this, ((android.support.v7.widget.Toolbar) this).r);
            android.widget.TextView textView2 = listC2.isEmpty() ? null : (android.widget.TextView) java.util.Collections.max(listC2, afvm.a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    android.view.View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                android.util.Pair pair = new android.util.Pair(java.lang.Integer.valueOf(paddingLeft), java.lang.Integer.valueOf(paddingRight));
                if (this.D && textView != null) {
                    E(textView, pair);
                }
                if (this.E && textView2 != null) {
                    E(textView2, pair);
                }
            }
        }
        android.widget.ImageView imageView3 = ((android.support.v7.widget.Toolbar) this).d;
        android.graphics.drawable.Drawable drawable2 = imageView3 != null ? imageView3.getDrawable() : null;
        if (drawable2 != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                android.view.View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof android.widget.ImageView) && (drawable = (imageView = (android.widget.ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            java.lang.Boolean bool = this.G;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            android.widget.ImageView.ScaleType scaleType = this.F;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setElevation(float f) {
        super.setElevation(f);
        agab.e(this, f);
    }

    public final void t(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.B != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.B.intValue());
        }
        super.t(drawable);
    }

    public MaterialToolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970933);
    }

    public MaterialToolbar(android.content.Context context) {
        this(context, null);
    }
}
