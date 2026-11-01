package com.google.android.material.card;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MaterialCardView extends androidx.cardview.widget.CardView implements android.widget.Checkable, agaw {
    private static final int[] f = {android.R.attr.state_checkable};
    private static final int[] g = {android.R.attr.state_checked};
    private static final int[] j = {android.R.attr.state_hovered};
    public final defpackage.afrp h;
    public boolean i;
    private boolean k;

    public MaterialCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        defpackage.agbd agbdVarF;
        super(agdv.a(context, attributeSet, i, 2132086089), attributeSet, i);
        this.i = false;
        this.k = true;
        android.content.res.TypedArray typedArrayA = afvl.a(getContext(), attributeSet, defpackage.afrq.a, i, 2132086089, new int[0]);
        defpackage.afrp afrpVar = new defpackage.afrp(this, attributeSet, i);
        this.h = afrpVar;
        afrpVar.e(((androidx.cardview.widget.CardView) this).e.a.e);
        afrpVar.b.set(((androidx.cardview.widget.CardView) this).c.left, ((androidx.cardview.widget.CardView) this).c.top, ((androidx.cardview.widget.CardView) this).c.right, ((androidx.cardview.widget.CardView) this).c.bottom);
        afrpVar.i();
        afrpVar.o = agab.o(afrpVar.a.getContext(), typedArrayA, 11);
        if (afrpVar.o == null) {
            afrpVar.o = android.content.res.ColorStateList.valueOf(-1);
        }
        afrpVar.i = typedArrayA.getDimensionPixelSize(12, 0);
        boolean z = typedArrayA.getBoolean(0, false);
        afrpVar.t = z;
        afrpVar.a.setLongClickable(z);
        afrpVar.m = agab.o(afrpVar.a.getContext(), typedArrayA, 6);
        android.graphics.drawable.Drawable drawableP = agab.p(afrpVar.a.getContext(), typedArrayA, 2);
        if (drawableP != null) {
            afrpVar.k = drawableP.mutate();
            afrpVar.k.setTintList(afrpVar.m);
            afrpVar.f(afrpVar.a.i, false);
        } else {
            afrpVar.k = null;
        }
        android.graphics.drawable.LayerDrawable layerDrawable = afrpVar.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(2131428544, afrpVar.k);
        }
        afrpVar.g = typedArrayA.getDimensionPixelSize(5, 0);
        afrpVar.f = typedArrayA.getDimensionPixelSize(4, 0);
        afrpVar.h = typedArrayA.getInteger(3, 8388661);
        afrpVar.l = agab.o(afrpVar.a.getContext(), typedArrayA, 7);
        if (afrpVar.l == null) {
            afrpVar.l = android.content.res.ColorStateList.valueOf(agab.X(afrpVar.a, 2130968945));
        }
        android.content.res.ColorStateList colorStateListO = agab.o(afrpVar.a.getContext(), typedArrayA, 1);
        afrpVar.d.R(colorStateListO == null ? android.content.res.ColorStateList.valueOf(0) : colorStateListO);
        android.graphics.drawable.Drawable drawable = afrpVar.p;
        if (drawable != null) {
            ((android.graphics.drawable.RippleDrawable) drawable).setColor(afrpVar.l);
        }
        afrpVar.j();
        afrpVar.k();
        super.setBackgroundDrawable(afrpVar.d(afrpVar.c));
        afrpVar.j = afrpVar.p() ? afrpVar.c() : afrpVar.d;
        afrpVar.a.setForeground(afrpVar.d(afrpVar.j));
        if (afrpVar.e == -1.0f && (agbdVarF = defpackage.agbd.f(afrpVar.a.getContext(), typedArrayA, 8)) != null) {
            eka ekaVarD = agab.D(afrpVar.a.getContext(), 2132083461);
            afrpVar.c.P(ekaVarD);
            afrpVar.d.P(ekaVarD);
            agaf agafVar = afrpVar.r;
            if (agafVar != null) {
                agafVar.P(ekaVarD);
            }
            afrpVar.g(agbdVarF);
        }
        typedArrayA.recycle();
    }

    public final void c(int i) {
        this.h.e(android.content.res.ColorStateList.valueOf(i));
    }

    public final agal es() {
        return this.h.n.a();
    }

    public final void g(float f2) {
        abs absVar = ((androidx.cardview.widget.CardView) this).e.a;
        if (f2 != absVar.a) {
            absVar.a = f2;
            absVar.b((android.graphics.Rect) null);
            absVar.invalidateSelf();
        }
        defpackage.afrp afrpVar = this.h;
        afrpVar.e = f2;
        afrpVar.g(afrpVar.n.a().c(f2));
        afrpVar.j.invalidateSelf();
        if (afrpVar.o() || afrpVar.n()) {
            afrpVar.i();
        }
        if (afrpVar.o()) {
            if (!afrpVar.s) {
                super.setBackgroundDrawable(afrpVar.d(afrpVar.c));
            }
            afrpVar.a.setForeground(afrpVar.d(afrpVar.j));
        }
    }

    public final boolean h() {
        defpackage.afrp afrpVar = this.h;
        return afrpVar != null && afrpVar.t;
    }

    public final void i() {
        ((androidx.cardview.widget.CardView) this).e.b.setElevation(0.0f);
        this.h.j();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        defpackage.afrp afrpVar = this.h;
        afrpVar.h();
        agab.h(this, afrpVar.c);
    }

    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 8);
        if (h()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        if (this.i) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                mergeDrawableStates(iArrOnCreateDrawableState, PRESSED_STATE_SET);
            }
            if (isHovered()) {
                mergeDrawableStates(iArrOnCreateDrawableState, j);
            }
            if (isEnabled()) {
                mergeDrawableStates(iArrOnCreateDrawableState, ENABLED_STATE_SET);
            }
            if (isFocused()) {
                mergeDrawableStates(iArrOnCreateDrawableState, FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                mergeDrawableStates(iArrOnCreateDrawableState, SELECTED_STATE_SET);
            }
        }
        return iArrOnCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.i);
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.i);
    }

    protected final void onMeasure(int i, int i2) {
        int iCeil;
        int iCeil2;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        defpackage.afrp afrpVar = this.h;
        if (afrpVar.q != null) {
            com.google.android.material.card.MaterialCardView materialCardView = afrpVar.a;
            if (((androidx.cardview.widget.CardView) materialCardView).a) {
                float fB = afrpVar.b();
                iCeil = (int) java.lang.Math.ceil(fB + fB);
                float fA = afrpVar.a();
                iCeil2 = (int) java.lang.Math.ceil(fA + fA);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i3 = afrpVar.m() ? ((measuredWidth - afrpVar.f) - afrpVar.g) - iCeil2 : afrpVar.f;
            int i4 = afrpVar.l() ? afrpVar.f : ((measuredHeight - afrpVar.f) - afrpVar.g) - iCeil;
            int i5 = afrpVar.m() ? afrpVar.f : ((measuredWidth - afrpVar.f) - afrpVar.g) - iCeil2;
            int i6 = afrpVar.l() ? ((measuredHeight - afrpVar.f) - afrpVar.g) - iCeil : afrpVar.f;
            int layoutDirection = materialCardView.getLayoutDirection();
            afrpVar.q.setLayerInset(2, layoutDirection != 1 ? i3 : i5, i6, layoutDirection == 1 ? i3 : i5, i4);
        }
    }

    public final void q(agal agalVar) {
        android.graphics.RectF rectF = new android.graphics.RectF();
        defpackage.afrp afrpVar = this.h;
        rectF.set(afrpVar.c.getBounds());
        setClipToOutline(agalVar.h(rectF));
        afrpVar.g(agalVar);
    }

    public final void setBackground(android.graphics.drawable.Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (this.k) {
            defpackage.afrp afrpVar = this.h;
            if (!afrpVar.s) {
                android.util.Log.i("MaterialCardView", "Setting a custom background is not supported.");
                afrpVar.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.i != z) {
            toggle();
        }
    }

    public final void setClickable(boolean z) {
        super.setClickable(z);
        defpackage.afrp afrpVar = this.h;
        if (afrpVar != null) {
            afrpVar.h();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (h() && isEnabled()) {
            this.i = !this.i;
            refreshDrawableState();
            defpackage.afrp afrpVar = this.h;
            android.graphics.drawable.Drawable drawable = afrpVar.p;
            if (drawable != null) {
                android.graphics.Rect bounds = drawable.getBounds();
                int i = bounds.bottom;
                afrpVar.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
                afrpVar.p.setBounds(bounds.left, bounds.top, bounds.right, i);
            }
            afrpVar.f(this.i, true);
        }
    }

    public MaterialCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969878);
    }

    public MaterialCardView(android.content.Context context) {
        this(context, null);
    }
}
