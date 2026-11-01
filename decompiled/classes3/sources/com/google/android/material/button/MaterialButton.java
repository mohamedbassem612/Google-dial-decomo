package com.google.android.material.button;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MaterialButton extends hj implements android.widget.Checkable, agaw {
    public static final /* synthetic */ int o = 0;
    private static final int[] p = {android.R.attr.state_checkable};
    private static final int[] q = {android.R.attr.state_checked};
    private static final ejy r = new defpackage.afrf();
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private float I;
    private int J;
    private int K;
    private android.widget.LinearLayout.LayoutParams L;
    private float M;
    private ejz N;
    private int O;
    public final defpackage.afrl b;
    public android.graphics.drawable.Drawable c;
    public java.lang.String d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public int j;
    public defpackage.agbf k;
    public int l;
    public float m;
    public defpackage.aprf n;
    private final java.util.LinkedHashSet s;
    private android.graphics.PorterDuff.Mode t;
    private android.content.res.ColorStateList u;
    private android.graphics.PorterDuff.Mode v;
    private android.content.res.ColorStateList w;
    private android.graphics.drawable.Drawable x;
    private boolean y;
    private int z;

    public MaterialButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.b(context, attributeSet, i, 2132086076, new int[]{2130969893}), attributeSet, i);
        this.s = new java.util.LinkedHashSet();
        this.f = false;
        this.E = false;
        this.H = Integer.MIN_VALUE;
        this.I = -2.1474836E9f;
        this.J = Integer.MIN_VALUE;
        this.K = Integer.MIN_VALUE;
        this.j = Integer.MIN_VALUE;
        this.O = 4;
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, defpackage.afrn.a, i, 2132086076, new int[0]);
        this.B = typedArrayA.getDimensionPixelSize(13, 0);
        this.t = a.q(typedArrayA.getInt(16, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.u = agab.o(getContext(), typedArrayA, 15);
        this.c = agab.p(getContext(), typedArrayA, 11);
        this.F = typedArrayA.getInteger(12, 1);
        this.e = typedArrayA.getDimensionPixelSize(14, 0);
        this.v = a.q(typedArrayA.getInt(22, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.w = typedArrayA.hasValue(21) ? agab.o(getContext(), typedArrayA, 21) : this.u;
        int i2 = 3;
        this.G = typedArrayA.getInteger(20, 3);
        android.graphics.drawable.Drawable drawableP = agab.p(getContext(), typedArrayA, 19);
        this.x = drawableP;
        this.y = drawableP == null;
        defpackage.agbd agbdVarF = defpackage.agbd.f(context2, typedArrayA, 23);
        agbdVarF = agbdVarF == null ? new agal(agal.m(context2, attributeSet, i, 2132086076)) : agbdVarF;
        boolean z = typedArrayA.getBoolean(17, false);
        defpackage.afrl afrlVar = new defpackage.afrl(this, agbdVarF);
        this.b = afrlVar;
        afrlVar.d = typedArrayA.getDimensionPixelOffset(2, 0);
        afrlVar.e = typedArrayA.getDimensionPixelOffset(3, 0);
        afrlVar.f = typedArrayA.getDimensionPixelOffset(4, 0);
        afrlVar.g = typedArrayA.getDimensionPixelOffset(5, 0);
        if (typedArrayA.hasValue(9)) {
            int dimensionPixelSize = typedArrayA.getDimensionPixelSize(9, -1);
            afrlVar.h = dimensionPixelSize;
            afrlVar.e(afrlVar.b.c(dimensionPixelSize));
            afrlVar.p = true;
        }
        afrlVar.i = typedArrayA.getDimensionPixelSize(26, 0);
        afrlVar.j = a.q(typedArrayA.getInt(8, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        afrlVar.k = agab.o(afrlVar.a.getContext(), typedArrayA, 7);
        afrlVar.l = agab.o(afrlVar.a.getContext(), typedArrayA, 25);
        afrlVar.m = agab.o(afrlVar.a.getContext(), typedArrayA, 18);
        afrlVar.q = typedArrayA.getBoolean(6, false);
        afrlVar.s = typedArrayA.getDimensionPixelSize(10, 0);
        afrlVar.r = typedArrayA.getBoolean(27, true);
        int paddingStart = afrlVar.a.getPaddingStart();
        int paddingTop = afrlVar.a.getPaddingTop();
        int paddingEnd = afrlVar.a.getPaddingEnd();
        int paddingBottom = afrlVar.a.getPaddingBottom();
        if (typedArrayA.hasValue(0)) {
            afrlVar.b();
        } else {
            afrlVar.f();
        }
        afrlVar.a.setPaddingRelative(paddingStart + afrlVar.d, paddingTop + afrlVar.f, paddingEnd + afrlVar.e, paddingBottom + afrlVar.g);
        j(typedArrayA.getBoolean(1, false));
        if (agbdVarF instanceof defpackage.agbd) {
            afrlVar.c(e());
        }
        if (this.g != z) {
            this.g = z;
            if (z) {
                afrlVar.h(new defpackage.aprf(this));
            } else {
                afrlVar.h(null);
            }
            post(new defpackage.aflt(this, i2));
        }
        typedArrayA.recycle();
        setCompoundDrawablePadding(this.B);
        E(this.c != null);
        G(this.x != null);
    }

    private final int A() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = java.lang.Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) java.lang.Math.ceil(fMax);
    }

    private final android.graphics.drawable.Drawable B(int i) {
        if (i == 0) {
            android.graphics.drawable.Drawable drawable = this.x;
            if (drawable == null || !P()) {
                return null;
            }
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = this.x;
        if (i != 1) {
            if (drawable2 == null || !O()) {
                return null;
            }
        } else if (drawable2 == null || !Q()) {
            return null;
        }
        return drawable2;
    }

    private final android.graphics.drawable.Drawable C(int i) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (i != 0) {
            if (drawable != null && K()) {
                return drawable;
            }
        } else if (drawable != null && L()) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r2 != 8388613) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
    
        if (r0 != 4) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.text.Layout.Alignment D() {
        /*
            r2 = this;
            int r0 = r2.getTextAlignment()
            r1 = 1
            if (r0 == r1) goto L11
            r2 = 6
            if (r0 == r2) goto L26
            r2 = 3
            if (r0 == r2) goto L26
            r2 = 4
            if (r0 == r2) goto L29
            goto L23
        L11:
            int r2 = r2.getGravity()
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r0
            if (r2 == r1) goto L29
            r0 = 5
            if (r2 == r0) goto L26
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r2 == r0) goto L26
        L23:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L2b
        L26:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L2b
        L29:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.D():android.text.Layout$Alignment");
    }

    private final void E(boolean z) {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
            this.c = drawableMutate;
            drawableMutate.setTintList(this.u);
            android.graphics.PorterDuff.Mode mode = this.t;
            if (mode != null) {
                this.c.setTintMode(mode);
            }
            int intrinsicWidth = this.e;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.c.getIntrinsicWidth();
            }
            int intrinsicHeight = this.e;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.c.getIntrinsicHeight();
            }
            android.graphics.drawable.Drawable drawable2 = this.c;
            int i = this.z;
            int i2 = this.A;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.c.setVisible(true, z);
        }
        android.graphics.drawable.Drawable drawable3 = this.c;
        if (drawable3 != null && this.x != null && I()) {
            throw new java.lang.IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
        }
        if (drawable3 == null && this.x != null && I()) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (L() && compoundDrawablesRelative[0] != this.c) || (K() && compoundDrawablesRelative[2] != this.c) || (M() && compoundDrawablesRelative[1] != this.c);
        if (z || z2) {
            if (L()) {
                setCompoundDrawablesRelative(this.c, B(1), B(2), null);
            } else if (K()) {
                setCompoundDrawablesRelative(B(0), B(1), this.c, null);
            } else if (M()) {
                setCompoundDrawablesRelative(B(0), this.c, B(2), null);
            }
        }
    }

    private final void F(int i, int i2) {
        if (this.c == null || getLayout() == null) {
            return;
        }
        if (L() || K()) {
            this.A = 0;
            if (J(this.F)) {
                this.z = 0;
                E(false);
                return;
            }
            int iY = y(i, this.F);
            if (this.z != iY) {
                this.z = iY;
                E(false);
                return;
            }
            return;
        }
        if (M()) {
            this.z = 0;
            if (this.F == 16) {
                this.A = 0;
                E(false);
                return;
            }
            int intrinsicHeight = this.e;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.c.getIntrinsicHeight();
            }
            int iZ = z(i2, intrinsicHeight);
            if (this.A != iZ) {
                this.A = iZ;
                E(false);
            }
        }
    }

    private final void G(boolean z) {
        android.graphics.drawable.Drawable drawable = this.x;
        if (drawable != null) {
            android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
            this.x = drawableMutate;
            drawableMutate.setTintList(this.w);
            android.graphics.PorterDuff.Mode mode = this.v;
            if (mode != null) {
                this.x.setTintMode(mode);
            }
            int intrinsicWidth = this.e;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.x.getIntrinsicWidth();
            }
            int intrinsicHeight = this.e;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.x.getIntrinsicHeight();
            }
            android.graphics.drawable.Drawable drawable2 = this.x;
            int i = this.C;
            int i2 = this.D;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.x.setVisible(true, z);
        }
        android.graphics.drawable.Drawable drawable3 = this.x;
        if (drawable3 != null && this.c != null && I()) {
            throw new java.lang.IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
        }
        if (drawable3 == null) {
            if (this.y) {
                return;
            }
            if (this.c != null && I()) {
                return;
            }
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (P() && compoundDrawablesRelative[0] != this.x) || (O() && compoundDrawablesRelative[2] != this.x) || (Q() && compoundDrawablesRelative[1] != this.x);
        if (z || z2) {
            if (P()) {
                setCompoundDrawablesRelative(this.x, C(1), C(2), null);
            } else if (O()) {
                setCompoundDrawablesRelative(C(0), C(1), this.x, null);
            } else if (Q()) {
                setCompoundDrawablesRelative(C(0), this.x, C(2), null);
            }
        }
    }

    private final void H(int i, int i2) {
        if (this.x == null || getLayout() == null) {
            return;
        }
        if (P() || O()) {
            this.D = 0;
            if (J(this.G)) {
                this.C = 0;
                G(false);
                return;
            }
            int iY = y(i, this.G);
            if (this.C != iY) {
                this.C = iY;
                G(false);
                return;
            }
            return;
        }
        if (Q()) {
            this.C = 0;
            if (this.G == 16) {
                this.D = 0;
                G(false);
                return;
            }
            int intrinsicHeight = this.e;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.x.getIntrinsicHeight();
            }
            int iZ = z(i2, intrinsicHeight);
            if (this.D != iZ) {
                this.D = iZ;
                G(false);
            }
        }
    }

    private final boolean I() {
        if (L() && P()) {
            return true;
        }
        if (K() && O()) {
            return true;
        }
        return M() && Q();
    }

    private final boolean J(int i) {
        android.text.Layout.Alignment alignmentD = D();
        if (i == 1 || i == 3) {
            return true;
        }
        if (i == 2) {
            if (alignmentD == android.text.Layout.Alignment.ALIGN_NORMAL) {
                return true;
            }
        } else if (i == 4 && alignmentD == android.text.Layout.Alignment.ALIGN_OPPOSITE) {
            return true;
        }
        return false;
    }

    private final boolean K() {
        int i = this.F;
        return i == 3 || i == 4;
    }

    private final boolean L() {
        int i = this.F;
        return i == 1 || i == 2;
    }

    private final boolean M() {
        int i = this.F;
        return i == 16 || i == 32;
    }

    private final boolean N() {
        return getLayoutDirection() == 1;
    }

    private final boolean O() {
        int i = this.G;
        return i == 3 || i == 4;
    }

    private final boolean P() {
        int i = this.G;
        return i == 1 || i == 2;
    }

    private final boolean Q() {
        int i = this.G;
        return i == 16 || i == 32;
    }

    private final boolean R(java.lang.Runnable runnable) {
        ejz ejzVar = this.N;
        if (ejzVar == null || !((ejx) ejzVar).n) {
            return false;
        }
        post(new defpackage.aekf(this, runnable, 16));
        return true;
    }

    private final int y(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            intrinsicWidth = this.e;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        android.graphics.drawable.Drawable drawable2 = this.x;
        if (drawable2 != null) {
            intrinsicWidth2 = this.e;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int iA = (((((i - A()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.B) - getPaddingStart();
        if (D() == android.text.Layout.Alignment.ALIGN_CENTER) {
            iA /= 2;
        }
        return N() != (i2 == 4) ? -iA : iA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int z(int i, int i2) {
        int iMin;
        if (getLineCount() > 1) {
            iMin = getLayout().getHeight();
        } else {
            android.text.TextPaint paint = getPaint();
            java.lang.String string = getText().toString();
            if (getTransformationMethod() != null) {
                string = getTransformationMethod().getTransformation(string, this).toString();
            }
            android.graphics.Rect rect = new android.graphics.Rect();
            paint.getTextBounds(string, 0, string.length(), rect);
            iMin = java.lang.Math.min(rect.height(), getLayout().getHeight());
        }
        return java.lang.Math.max(0, (((((i - iMin) - getPaddingTop()) - i2) - this.B) - getPaddingBottom()) / 2);
    }

    public final int c() {
        if (w()) {
            return this.b.i;
        }
        return 0;
    }

    public final android.content.res.ColorStateList d() {
        defpackage.lq lqVar;
        if (w()) {
            return this.b.k;
        }
        hi hiVar = ((hj) this).a;
        if (hiVar == null || (lqVar = hiVar.a) == null) {
            return null;
        }
        return lqVar.a;
    }

    public final eka e() {
        return agab.D(getContext(), 2132083461);
    }

    public final agal es() {
        if (w()) {
            return this.b.b.a();
        }
        throw new java.lang.IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    final java.lang.String g() {
        if (android.text.TextUtils.isEmpty(this.d)) {
            return (true != v() ? android.widget.Button.class : android.widget.CompoundButton.class).getName();
        }
        return this.d;
    }

    public final android.content.res.ColorStateList getBackgroundTintList() {
        return d();
    }

    public final android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        defpackage.lq lqVar;
        if (w()) {
            return this.b.j;
        }
        hi hiVar = ((hj) this).a;
        if (hiVar == null || (lqVar = hiVar.a) == null) {
            return null;
        }
        return lqVar.b;
    }

    public final void h(boolean z) {
        int i;
        if (this.k != null) {
            if (this.N == null) {
                ejz ejzVar = new ejz(this, r);
                this.N = ejzVar;
                ejzVar.t = e();
            }
            if (this.i) {
                int i2 = this.O;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i3 == 1 || i3 == 2) {
                    i = this.l / 2;
                } else {
                    i = i3 != 3 ? 0 : this.l;
                }
                defpackage.agbf agbfVar = this.k;
                int iA = agbfVar.a(getDrawableState());
                if (iA < 0) {
                    iA = agbfVar.a(android.util.StateSet.WILD_CARD);
                }
                java.lang.Object obj = (iA < 0 ? agbfVar.c : agbfVar.d[iA]).a;
                int width = getWidth();
                defpackage.agbe agbeVar = (defpackage.agbe) obj;
                int i4 = agbeVar.b;
                float f = agbeVar.a;
                if (i4 == 1) {
                    f *= width;
                }
                this.N.j(java.lang.Math.min(i, (int) f));
                if (z) {
                    this.N.k();
                }
            }
        }
    }

    public final void i() {
        android.widget.LinearLayout.LayoutParams layoutParams = this.L;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.L = null;
            this.I = -2.1474836E9f;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f;
    }

    public final void j(boolean z) {
        if (!v() || this.f == z) {
            return;
        }
        this.f = z;
        refreshDrawableState();
        if (getParent() instanceof com.google.android.material.button.MaterialButtonToggleGroup) {
            com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup = (com.google.android.material.button.MaterialButtonToggleGroup) getParent();
            boolean z2 = this.f;
            if (!materialButtonToggleGroup.f) {
                materialButtonToggleGroup.j(getId(), z2);
            }
        }
        if (this.E) {
            return;
        }
        this.E = true;
        java.util.Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((defpackage.afrg) it.next()).a();
        }
        this.E = false;
    }

    public final void k(int i) {
        if (w()) {
            defpackage.afrl afrlVar = this.b;
            if (afrlVar.p && afrlVar.h == i) {
                return;
            }
            afrlVar.h = i;
            afrlVar.p = true;
            afrlVar.e(afrlVar.b.c(i));
        }
    }

    public final void l(int i) {
        this.M = java.lang.Math.min(i, this.j);
        u();
        invalidate();
    }

    public final void m(android.graphics.drawable.Drawable drawable) {
        if (this.c == drawable || R(new defpackage.aekf(this, drawable, 17, null))) {
            return;
        }
        this.I = -2.1474836E9f;
        this.c = drawable;
        E(true);
        F(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void n(int i) {
        m(i != 0 ? den.bO(getContext(), i) : null);
    }

    public final void o(int i) {
        if (this.e == i || R(new eyd(this, i, 19))) {
            return;
        }
        this.I = -2.1474836E9f;
        this.e = i;
        E(true);
        G(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (w()) {
            agab.h(this, this.b.a(false));
        }
    }

    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (v()) {
            mergeDrawableStates(iArrOnCreateDrawableState, p);
        }
        if (this.f) {
            mergeDrawableStates(iArrOnCreateDrawableState, q);
        }
        return iArrOnCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(g());
        accessibilityEvent.setChecked(this.f);
    }

    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(g());
        accessibilityNodeInfo.setCheckable(v());
        accessibilityNodeInfo.setChecked(this.f);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        F(getMeasuredWidth(), getMeasuredHeight());
        H(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.H != i6) {
            this.H = i6;
            this.I = -2.1474836E9f;
        }
        if (this.I == -2.1474836E9f) {
            this.I = getMeasuredWidth();
            if (this.L == null && (getParent() instanceof defpackage.afrk) && ((defpackage.afrk) getParent()).b != null) {
                this.L = (android.widget.LinearLayout.LayoutParams) getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(this.L);
                layoutParams.width = (int) this.I;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.j == Integer.MIN_VALUE) {
            android.graphics.drawable.Drawable drawable = this.c;
            if (drawable == null) {
                i5 = 0;
            } else {
                int i7 = this.B;
                int intrinsicWidth = this.e;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                i5 = i7 + intrinsicWidth;
            }
            this.j = (getMeasuredWidth() - A()) - i5;
        }
        if (this.J == Integer.MIN_VALUE) {
            this.J = getPaddingStart();
        }
        if (this.K == Integer.MIN_VALUE) {
            this.K = getPaddingEnd();
        }
        if ((getParent() instanceof defpackage.afrk) && ((defpackage.afrk) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.i = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.button.MaterialButton.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.button.MaterialButton.SavedState savedState = (com.google.android.material.button.MaterialButton.SavedState) parcelable;
        super.onRestoreInstanceState(((androidx.customview.view.AbsSavedState) savedState).d);
        j(savedState.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, com.google.android.material.button.MaterialButton$SavedState] */
    public final android.os.Parcelable onSaveInstanceState() {
        ?? savedState = new com.google.android.material.button.MaterialButton.SavedState(super.onSaveInstanceState());
        savedState.a = this.f;
        return savedState;
    }

    protected final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        F(getMeasuredWidth(), getMeasuredHeight());
        H(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void p(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.b.r) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean zPerformClick = super.performClick();
        if (z && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    public final void q(agal agalVar) {
        if (!w()) {
            throw new java.lang.IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.b.e(agalVar);
    }

    public final void r(boolean z) {
        if (w()) {
            defpackage.afrl afrlVar = this.b;
            afrlVar.n = z;
            afrlVar.g();
        }
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.c != null) {
            if (this.c.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final void s(android.content.res.ColorStateList colorStateList) {
        if (w()) {
            defpackage.afrl afrlVar = this.b;
            if (afrlVar.k != colorStateList) {
                afrlVar.k = colorStateList;
                if (afrlVar.a(false) != null) {
                    afrlVar.a(false).setTintList(afrlVar.k);
                    return;
                }
                return;
            }
            return;
        }
        hi hiVar = ((hj) this).a;
        if (hiVar != null) {
            if (hiVar.a == null) {
                hiVar.a = new defpackage.lq();
            }
            defpackage.lq lqVar = hiVar.a;
            lqVar.a = colorStateList;
            lqVar.d = true;
            hiVar.a();
        }
    }

    public final void setBackground(android.graphics.drawable.Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundColor(int i) {
        if (!w()) {
            super.setBackgroundColor(i);
            return;
        }
        defpackage.afrl afrlVar = this.b;
        if (afrlVar.a(false) != null) {
            afrlVar.a(false).setTint(i);
        }
    }

    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (!w()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            android.util.Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.b.b();
            super.setBackgroundDrawable(drawable);
        }
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? den.bO(getContext(), i) : null);
    }

    public final void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        s(colorStateList);
    }

    public final void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        t(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        j(z);
    }

    public final void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.I = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        if (w()) {
            this.b.a(false).Q(f);
        }
    }

    public final void setPressed(boolean z) {
        defpackage.aprf aprfVar = this.n;
        if (aprfVar != null) {
            ((defpackage.afrk) aprfVar.a).invalidate();
        }
        super.setPressed(z);
        h(false);
    }

    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        this.I = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        F(getMeasuredWidth(), getMeasuredHeight());
        H(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void setTextAppearance(android.content.Context context, int i) {
        this.I = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    public final void setTextSize(int i, float f) {
        this.I = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public final void setWidth(int i) {
        this.I = -2.1474836E9f;
        super.setWidth(i);
    }

    public final void t(android.graphics.PorterDuff.Mode mode) {
        if (w()) {
            defpackage.afrl afrlVar = this.b;
            if (afrlVar.j != mode) {
                afrlVar.j = mode;
                if (afrlVar.a(false) == null || afrlVar.j == null) {
                    return;
                }
                afrlVar.a(false).setTintMode(afrlVar.j);
                return;
            }
            return;
        }
        hi hiVar = ((hj) this).a;
        if (hiVar != null) {
            if (hiVar.a == null) {
                hiVar.a = new defpackage.lq();
            }
            defpackage.lq lqVar = hiVar.a;
            lqVar.b = mode;
            lqVar.c = true;
            hiVar.a();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        j(!this.f);
    }

    public final void u() {
        float f = this.m - this.M;
        boolean zN = N();
        int i = this.h;
        if (zN) {
            i = -i;
        }
        int i2 = (int) f;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.I + i2);
        }
        int i3 = (i2 / 2) + i;
        setPaddingRelative(this.J + i3, getPaddingTop(), (this.K + i2) - i3, getPaddingBottom());
    }

    public final boolean v() {
        defpackage.afrl afrlVar = this.b;
        return afrlVar != null && afrlVar.q;
    }

    public final boolean w() {
        defpackage.afrl afrlVar = this.b;
        return (afrlVar == null || afrlVar.o) ? false : true;
    }

    public final void x(int i) {
        if (this.O != i) {
            this.O = i;
            h(true);
        }
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.afqt(2);
        boolean a;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.a = parcel.readInt() == 1;
        }

        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969857);
    }

    public MaterialButton(android.content.Context context) {
        this(context, null);
    }
}
