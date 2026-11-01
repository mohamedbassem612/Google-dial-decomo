package com.google.android.material.materialswitch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MaterialSwitch extends android.support.v7.widget.SwitchCompat {
    private static final int[] m = {2130970458};
    private android.graphics.drawable.Drawable n;
    private android.graphics.drawable.Drawable o;
    private int p;
    private android.graphics.drawable.Drawable q;
    private android.graphics.drawable.Drawable r;
    private android.content.res.ColorStateList s;
    private android.content.res.ColorStateList t;
    private android.graphics.PorterDuff.Mode u;
    private android.content.res.ColorStateList v;
    private android.content.res.ColorStateList w;
    private android.graphics.PorterDuff.Mode x;
    private int[] y;
    private int[] z;

    /* JADX WARN: Multi-variable type inference failed */
    public MaterialSwitch(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.a(context, attributeSet, i, 2132085841), attributeSet, i);
        this.p = -1;
        android.content.Context context2 = getContext();
        this.n = ((android.support.v7.widget.SwitchCompat) this).a;
        this.s = ((android.support.v7.widget.SwitchCompat) this).b;
        ((android.support.v7.widget.SwitchCompat) this).b = null;
        ((android.support.v7.widget.SwitchCompat) this).d = true;
        super.a();
        this.q = ((android.support.v7.widget.SwitchCompat) this).e;
        this.v = ((android.support.v7.widget.SwitchCompat) this).f;
        ((android.support.v7.widget.SwitchCompat) this).f = null;
        ((android.support.v7.widget.SwitchCompat) this).h = true;
        super.b();
        ajxw ajxwVarF = afvl.f(context2, attributeSet, defpackage.afvr.a, i, 2132085841, new int[0]);
        this.o = ajxwVarF.t(0);
        this.p = ajxwVarF.n(1, -1);
        this.t = ajxwVarF.s(2);
        this.u = a.q(ajxwVarF.o(3, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.r = ajxwVarF.t(4);
        this.w = ajxwVarF.s(5);
        this.x = a.q(ajxwVarF.o(6, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        ajxwVarF.x();
        ((android.support.v7.widget.SwitchCompat) this).k = false;
        invalidate();
        this.n = agab.U(this.n, this.s, ((android.support.v7.widget.SwitchCompat) this).c);
        this.o = agab.U(this.o, this.t, this.u);
        j();
        android.graphics.drawable.Drawable drawable = this.n;
        android.graphics.drawable.Drawable drawable2 = this.o;
        int i2 = this.p;
        android.graphics.drawable.Drawable drawableR = agab.R(drawable, drawable2, i2, i2);
        android.graphics.drawable.Drawable drawable3 = ((android.support.v7.widget.SwitchCompat) this).a;
        if (drawable3 != null) {
            drawable3.setCallback(null);
        }
        ((android.support.v7.widget.SwitchCompat) this).a = drawableR;
        if (drawableR != null) {
            drawableR.setCallback(this);
        }
        requestLayout();
        refreshDrawableState();
        this.q = agab.U(this.q, this.v, ((android.support.v7.widget.SwitchCompat) this).g);
        this.r = agab.U(this.r, this.w, this.x);
        j();
        android.graphics.drawable.Drawable layerDrawable = this.q;
        android.graphics.drawable.Drawable drawable4 = this.r;
        if (layerDrawable == null) {
            layerDrawable = drawable4;
        } else if (drawable4 != null) {
            layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{layerDrawable, drawable4});
        }
        if (layerDrawable != null) {
            ((android.support.v7.widget.SwitchCompat) this).i = layerDrawable.getIntrinsicWidth();
            requestLayout();
        }
        android.graphics.drawable.Drawable drawable5 = ((android.support.v7.widget.SwitchCompat) this).e;
        if (drawable5 != null) {
            drawable5.setCallback(null);
        }
        ((android.support.v7.widget.SwitchCompat) this).e = layerDrawable;
        if (layerDrawable != null) {
            layerDrawable.setCallback(this);
        }
        requestLayout();
    }

    private static void i(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable != null) {
            drawable.setTint(dwm.f(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
        }
    }

    private final void j() {
        android.content.res.ColorStateList colorStateList = this.s;
        if (colorStateList == null && this.t == null && this.v == null && this.w == null) {
            return;
        }
        float f = ((android.support.v7.widget.SwitchCompat) this).j;
        if (colorStateList != null) {
            i(this.n, colorStateList, this.y, this.z, f);
        }
        android.content.res.ColorStateList colorStateList2 = this.t;
        if (colorStateList2 != null) {
            i(this.o, colorStateList2, this.y, this.z, f);
        }
        android.content.res.ColorStateList colorStateList3 = this.v;
        if (colorStateList3 != null) {
            i(this.q, colorStateList3, this.y, this.z, f);
        }
        android.content.res.ColorStateList colorStateList4 = this.w;
        if (colorStateList4 != null) {
            i(this.r, colorStateList4, this.y, this.z, f);
        }
    }

    public final void invalidate() {
        j();
        super.invalidate();
    }

    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.o != null) {
            mergeDrawableStates(iArrOnCreateDrawableState, m);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.y = iArr;
        this.z = agab.T(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.google.android.material.focus.FocusRingDrawable focusRingDrawableB;
        super.onLayout(z, i, i2, i3, i4);
        if (this.q == null || (focusRingDrawableB = com.google.android.material.focus.FocusRingDrawable.b(getBackground())) == null) {
            return;
        }
        focusRingDrawableB.mutate();
        focusRingDrawableB.c.w = this.q.getBounds();
    }

    public MaterialSwitch(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969899);
    }

    public MaterialSwitch(android.content.Context context) {
        this(context, null);
    }
}
