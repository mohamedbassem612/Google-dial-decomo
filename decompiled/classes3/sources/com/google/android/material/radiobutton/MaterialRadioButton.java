package com.google.android.material.radiobutton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MaterialRadioButton extends hv {
    private static final int[][] a = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private android.content.res.ColorStateList b;
    private boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public MaterialRadioButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.content.res.ColorStateList colorStateListO;
        super(agdv.a(context, attributeSet, i, 2132086102), attributeSet, i);
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, defpackage.afyv.a, i, 2132086102, new int[0]);
        if (typedArrayA.hasValue(0)) {
            setButtonTintList(agab.o(context2, typedArrayA, 0));
        }
        if (typedArrayA.hasValue(1) && (colorStateListO = agab.o(context2, typedArrayA, 1)) != null) {
            android.graphics.drawable.Drawable background = getBackground();
            background = background instanceof android.graphics.drawable.DrawableWrapper ? ((android.graphics.drawable.DrawableWrapper) background).getDrawable() : background;
            if (background instanceof android.graphics.drawable.RippleDrawable) {
                ((android.graphics.drawable.RippleDrawable) background).setColor(colorStateListO);
            }
        }
        this.c = typedArrayA.getBoolean(2, false);
        typedArrayA.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && getButtonTintList() == null) {
            this.c = true;
            android.content.res.ColorStateList colorStateList = this.b;
            if (colorStateList == null) {
                int iX = agab.X(this, 2130968944);
                int iX2 = agab.X(this, 2130969053);
                int iX3 = agab.X(this, 2130969105);
                int[][] iArr = a;
                int length = iArr.length;
                android.content.res.ColorStateList colorStateList2 = new android.content.res.ColorStateList(iArr, new int[]{agab.ab(iX3, iX, 1.0f), agab.ab(iX3, iX2, 0.54f), agab.ab(iX3, iX2, 0.38f), agab.ab(iX3, iX2, 0.38f)});
                this.b = colorStateList2;
                colorStateList = colorStateList2;
            }
            setButtonTintList(colorStateList);
        }
    }

    public MaterialRadioButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970272);
    }

    public MaterialRadioButton(android.content.Context context) {
        this(context, null);
    }
}
