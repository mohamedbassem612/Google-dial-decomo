package com.google.android.flexbox;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FlexboxLayout extends android.view.ViewGroup implements defpackage.zvc {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private android.graphics.drawable.Drawable g;
    private android.graphics.drawable.Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int[] m;
    private android.util.SparseIntArray n;
    private defpackage.zvf o;
    private java.util.List p;
    private aizg q;

    public FlexboxLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.o = new defpackage.zvf(this);
        this.p = new java.util.ArrayList();
        this.q = new aizg();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.zvi.a, i, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 4);
        this.e = typedArrayObtainStyledAttributes.getInt(0, 5);
        this.f = typedArrayObtainStyledAttributes.getInt(8, -1);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            e(drawable);
            f(drawable);
        }
        android.graphics.drawable.Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            e(drawable2);
        }
        android.graphics.drawable.Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            f(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.j = i2;
            this.i = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.j = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.i = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e0  */
    private final void A(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        float measuredHeight;
        float f2;
        float fMax;
        int i5;
        android.view.View viewD;
        char c;
        float f3;
        int i6;
        int i7;
        int i8;
        android.view.View view;
        com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams;
        boolean z3;
        boolean z4;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int size = this.p.size();
        for (int i9 = 0; i9 < size; i9++) {
            defpackage.zvd zvdVar = (defpackage.zvd) this.p.get(i9);
            if (E(i9)) {
                int i10 = this.l;
                paddingLeft += i10;
                paddingRight -= i10;
            }
            int i11 = paddingRight;
            int i12 = i4 - i2;
            int i13 = this.c;
            char c2 = 4;
            if (i13 == 0) {
                f = paddingTop;
                measuredHeight = i12 - paddingBottom;
            } else if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = i12 - paddingBottom;
                    float f4 = (i12 - zvdVar.e) / 2.0f;
                    measuredHeight = i14 - f4;
                    f = paddingTop + f4;
                } else if (i13 == 3) {
                    c2 = 4;
                    int i15 = i12 - paddingBottom;
                    f = paddingTop;
                    int iA = zvdVar.a();
                    measuredHeight = i15;
                    f2 = (i12 - zvdVar.e) / (iA != 1 ? iA - 1 : 1.0f);
                } else if (i13 == 4) {
                    int i16 = i12 - paddingBottom;
                    float f5 = paddingTop;
                    int iA2 = zvdVar.a();
                    c2 = 4;
                    f2 = iA2 != 0 ? (i12 - zvdVar.e) / iA2 : 0.0f;
                    float f6 = f2 / 2.0f;
                    f = f5 + f6;
                    measuredHeight = i16 - f6;
                } else {
                    if (i13 != 5) {
                        throw new java.lang.IllegalStateException(a.bj(i13, "Invalid justifyContent is set: "));
                    }
                    int i17 = i12 - paddingBottom;
                    float f7 = paddingTop;
                    int iA3 = zvdVar.a();
                    f2 = iA3 != 0 ? (i12 - zvdVar.e) / (iA3 + 1) : 0.0f;
                    f = f7 + f2;
                    measuredHeight = i17 - f2;
                    c2 = 4;
                }
                fMax = java.lang.Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < zvdVar.h) {
                    int i18 = zvdVar.o + i5;
                    viewD = d(i18);
                    if (viewD != null || viewD.getVisibility() == 8) {
                        c = c2;
                        f3 = fMax;
                        i6 = i5;
                        i7 = i11;
                    } else {
                        com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams2 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) viewD.getLayoutParams();
                        float f8 = f + layoutParams2.topMargin;
                        float f9 = measuredHeight - layoutParams2.bottomMargin;
                        if (D(i18, i5)) {
                            int i19 = this.k;
                            float f10 = i19;
                            f8 += f10;
                            f9 -= f10;
                            i8 = i19;
                        } else {
                            i8 = 0;
                        }
                        float f11 = f8;
                        int i20 = (i5 != zvdVar.h + (-1) || (this.i & 4) <= 0) ? 0 : this.k;
                        if (z) {
                            int i21 = i5;
                            defpackage.zvf zvfVar = this.o;
                            if (z2) {
                                i6 = i21;
                                view = viewD;
                                c = c2;
                                f3 = fMax;
                                layoutParams = layoutParams2;
                                z3 = true;
                                zvfVar.i(view, zvdVar, true, i11 - viewD.getMeasuredWidth(), java.lang.Math.round(f9) - viewD.getMeasuredHeight(), i11, java.lang.Math.round(f9));
                                i7 = i11;
                                z4 = z3;
                            } else {
                                c = c2;
                                f3 = fMax;
                                i6 = i21;
                                view = viewD;
                                layoutParams = layoutParams2;
                                zvfVar.i(view, zvdVar, true, i11 - view.getMeasuredWidth(), java.lang.Math.round(f11), i11, view.getMeasuredHeight() + java.lang.Math.round(f11));
                                i7 = i11;
                                z4 = false;
                            }
                        } else {
                            c = c2;
                            f3 = fMax;
                            i6 = i5;
                            view = viewD;
                            layoutParams = layoutParams2;
                            i7 = i11;
                            z3 = true;
                            defpackage.zvf zvfVar2 = this.o;
                            if (z2) {
                                zvfVar2.i(view, zvdVar, false, paddingLeft, java.lang.Math.round(f9) - view.getMeasuredHeight(), paddingLeft + view.getMeasuredWidth(), java.lang.Math.round(f9));
                                z4 = z3;
                            } else {
                                int i22 = paddingLeft;
                                zvfVar2.i(view, zvdVar, false, i22, java.lang.Math.round(f11), i22 + view.getMeasuredWidth(), java.lang.Math.round(f11) + view.getMeasuredHeight());
                                paddingLeft = i22;
                                z4 = false;
                            }
                        }
                        float measuredHeight2 = f11 + view.getMeasuredHeight() + f3 + layoutParams.bottomMargin;
                        measuredHeight = f9 - ((view.getMeasuredHeight() + f3) + layoutParams.topMargin);
                        defpackage.zvd zvdVar2 = zvdVar;
                        if (z4) {
                            zvdVar2.b(view, 0, i20, 0, i8);
                        } else {
                            zvdVar2.b(view, 0, i8, 0, i20);
                        }
                        zvdVar = zvdVar2;
                        f = measuredHeight2;
                    }
                    i5 = i6 + 1;
                    fMax = f3;
                    c2 = c;
                    i11 = i7;
                }
                int i23 = zvdVar.g;
                paddingLeft += i23;
                paddingRight = i11 - i23;
            } else {
                int i24 = zvdVar.e;
                int i25 = (i12 - i24) + paddingBottom;
                measuredHeight = i24 - paddingTop;
                f = i25;
            }
            f2 = 0.0f;
            fMax = java.lang.Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < zvdVar.h) {
                int i110 = zvdVar.o + i5;
                viewD = d(i110);
                if (viewD != null) {
                    c = c2;
                    f3 = fMax;
                    i6 = i5;
                    i7 = i11;
                } else {
                    c = c2;
                    f3 = fMax;
                    i6 = i5;
                    i7 = i11;
                }
                i5 = i6 + 1;
                fMax = f3;
                c2 = c;
                i11 = i7;
            }
            int i26 = zvdVar.g;
            paddingLeft += i26;
            paddingRight = i11 - i26;
        }
    }

    private final void B(int i, int i2, int i3, int i4) {
        int iR;
        int iN;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i3);
        int size2 = android.view.View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            iR = r() + getPaddingTop() + getPaddingBottom();
            iN = n();
        } else {
            if (i != 2 && i != 3) {
                throw new java.lang.IllegalArgumentException(a.bj(i, "Invalid flex direction: "));
            }
            iR = n();
            iN = r() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < iN) {
                i4 = android.view.View.combineMeasuredStates(i4, 16777216);
            } else {
                size = iN;
            }
            iResolveSizeAndState = android.view.View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = android.view.View.resolveSizeAndState(iN, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new java.lang.IllegalStateException(a.bj(mode, "Unknown width mode is set: "));
            }
            if (size < iN) {
                i4 = android.view.View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = android.view.View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < iR) {
                i4 = android.view.View.combineMeasuredStates(i4, 256);
            } else {
                size2 = iR;
            }
            iResolveSizeAndState2 = android.view.View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = android.view.View.resolveSizeAndState(iR, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new java.lang.IllegalStateException(a.bj(mode2, "Unknown height mode is set: "));
            }
            if (size2 < iR) {
                i4 = android.view.View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = android.view.View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private final void C() {
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private final boolean D(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            android.view.View viewD = d(i - i3);
            if (viewD != null && viewD.getVisibility() != 8) {
                if (K()) {
                    if ((this.j & 2) != 0) {
                        return true;
                    }
                } else if ((this.i & 2) != 0) {
                    return true;
                }
                return false;
            }
        }
        if (K()) {
            if ((this.j & 1) != 0) {
                return true;
            }
        } else if ((this.i & 1) != 0) {
            return true;
        }
        return false;
    }

    private final boolean E(int i) {
        if (i < 0 || i >= this.p.size()) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (((defpackage.zvd) this.p.get(i2)).a() > 0) {
                if (K()) {
                    if ((this.i & 2) == 0) {
                        return false;
                    }
                } else if ((this.j & 2) == 0) {
                    return false;
                }
                return true;
            }
        }
        if (K()) {
            if ((this.i & 1) == 0) {
                return false;
            }
        } else if ((this.j & 1) == 0) {
            return false;
        }
        return true;
    }

    private final boolean F(int i) {
        if (i < 0 || i >= this.p.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.p.size(); i2++) {
            if (((defpackage.zvd) this.p.get(i2)).a() > 0) {
                return false;
            }
        }
        if (K()) {
            if ((this.i & 4) == 0) {
                return false;
            }
        } else if ((this.j & 4) == 0) {
            return false;
        }
        return true;
    }

    private final void h(android.graphics.Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = java.lang.Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            defpackage.zvd zvdVar = (defpackage.zvd) this.p.get(i);
            for (int i2 = 0; i2 < zvdVar.h; i2++) {
                int i3 = zvdVar.o + i2;
                android.view.View viewD = d(i3);
                if (viewD != null && viewD.getVisibility() != 8) {
                    com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams = (com.google.android.flexbox.FlexboxLayout.LayoutParams) viewD.getLayoutParams();
                    if (D(i3, i2)) {
                        u(canvas, z ? viewD.getRight() + layoutParams.rightMargin : (viewD.getLeft() - layoutParams.leftMargin) - this.l, zvdVar.b, zvdVar.g);
                    }
                    if (i2 == zvdVar.h - 1 && (this.j & 4) > 0) {
                        u(canvas, z ? (viewD.getLeft() - layoutParams.leftMargin) - this.l : viewD.getRight() + layoutParams.rightMargin, zvdVar.b, zvdVar.g);
                    }
                }
            }
            if (E(i)) {
                q(canvas, paddingLeft, z2 ? zvdVar.d : zvdVar.b - this.k, iMax);
            }
            if (F(i) && (this.i & 4) > 0) {
                q(canvas, paddingLeft, z2 ? zvdVar.b - this.k : zvdVar.d, iMax);
            }
        }
    }

    private final void p(android.graphics.Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = java.lang.Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            defpackage.zvd zvdVar = (defpackage.zvd) this.p.get(i);
            for (int i2 = 0; i2 < zvdVar.h; i2++) {
                int i3 = zvdVar.o + i2;
                android.view.View viewD = d(i3);
                if (viewD != null && viewD.getVisibility() != 8) {
                    com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams = (com.google.android.flexbox.FlexboxLayout.LayoutParams) viewD.getLayoutParams();
                    if (D(i3, i2)) {
                        q(canvas, zvdVar.a, z2 ? viewD.getBottom() + layoutParams.bottomMargin : (viewD.getTop() - layoutParams.topMargin) - this.k, zvdVar.g);
                    }
                    if (i2 == zvdVar.h - 1 && (this.i & 4) > 0) {
                        q(canvas, zvdVar.a, z2 ? (viewD.getTop() - layoutParams.topMargin) - this.k : viewD.getBottom() + layoutParams.bottomMargin, zvdVar.g);
                    }
                }
            }
            if (E(i)) {
                u(canvas, z ? zvdVar.c : zvdVar.a - this.l, paddingTop, iMax);
            }
            if (F(i) && (this.j & 4) > 0) {
                u(canvas, z ? zvdVar.a - this.l : zvdVar.c, paddingTop, iMax);
            }
        }
    }

    private final void q(android.graphics.Canvas canvas, int i, int i2, int i3) {
        android.graphics.drawable.Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.k + i2);
            this.g.draw(canvas);
        }
    }

    private final void u(android.graphics.Canvas canvas, int i, int i2, int i3) {
        android.graphics.drawable.Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.l + i, i3 + i2);
            this.h.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d6  */
    private final void y(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float measuredWidth;
        float f2;
        int i5;
        android.view.View viewD;
        int i6;
        int i7;
        int i8;
        com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams;
        android.view.View view;
        boolean z2;
        boolean z3;
        defpackage.zvd zvdVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.p.size();
        int i9 = 0;
        while (i9 < size) {
            defpackage.zvd zvdVar2 = (defpackage.zvd) this.p.get(i9);
            if (E(i9)) {
                int i10 = this.k;
                paddingBottom -= i10;
                paddingTop += i10;
            }
            int i11 = paddingBottom;
            int i12 = i3 - i;
            int i13 = this.c;
            if (i13 == 0) {
                f = paddingLeft;
                measuredWidth = i12 - paddingRight;
            } else if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = i12 - paddingRight;
                    float f3 = (i12 - zvdVar2.e) / 2.0f;
                    measuredWidth = i14 - f3;
                    f = paddingLeft + f3;
                } else if (i13 == 3) {
                    int i15 = i12 - paddingRight;
                    f = paddingLeft;
                    int iA = zvdVar2.a();
                    measuredWidth = i15;
                    f2 = (i12 - zvdVar2.e) / (iA != 1 ? iA - 1 : 1.0f);
                } else if (i13 == 4) {
                    int i16 = i12 - paddingRight;
                    float f4 = paddingLeft;
                    int iA2 = zvdVar2.a();
                    f2 = iA2 != 0 ? (i12 - zvdVar2.e) / iA2 : 0.0f;
                    float f5 = f2 / 2.0f;
                    f = f4 + f5;
                    measuredWidth = i16 - f5;
                } else {
                    if (i13 != 5) {
                        throw new java.lang.IllegalStateException(a.bj(i13, "Invalid justifyContent is set: "));
                    }
                    int i17 = i12 - paddingRight;
                    float f6 = paddingLeft;
                    int iA3 = zvdVar2.a();
                    f2 = iA3 != 0 ? (i12 - zvdVar2.e) / (iA3 + 1) : 0.0f;
                    f = f6 + f2;
                    measuredWidth = i17 - f2;
                }
                float fMax = java.lang.Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < zvdVar2.h) {
                    int i18 = zvdVar2.o + i5;
                    viewD = d(i18);
                    if (viewD != null || viewD.getVisibility() == 8) {
                        i6 = paddingLeft;
                        i7 = i11;
                    } else {
                        com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams2 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) viewD.getLayoutParams();
                        float f7 = f + layoutParams2.leftMargin;
                        float f8 = measuredWidth - layoutParams2.rightMargin;
                        if (D(i18, i5)) {
                            int i19 = this.l;
                            float f9 = i19;
                            f7 += f9;
                            f8 -= f9;
                            i8 = i19;
                        } else {
                            i8 = 0;
                        }
                        float f10 = f7;
                        int i20 = (i5 != zvdVar2.h + (-1) || (this.j & 4) <= 0) ? 0 : this.l;
                        if (this.b == 2) {
                            defpackage.zvf zvfVar = this.o;
                            if (z) {
                                view = viewD;
                                i6 = paddingLeft;
                                layoutParams = layoutParams2;
                                z2 = true;
                                zvfVar.h(view, zvdVar2, java.lang.Math.round(f8) - viewD.getMeasuredWidth(), i11 - viewD.getMeasuredHeight(), java.lang.Math.round(f8), i11);
                                i7 = i11;
                                z3 = z2;
                            } else {
                                i6 = paddingLeft;
                                layoutParams = layoutParams2;
                                view = viewD;
                                zvfVar.h(view, zvdVar2, java.lang.Math.round(f10), i11 - view.getMeasuredHeight(), java.lang.Math.round(f10) + view.getMeasuredWidth(), i11);
                                i7 = i11;
                                z3 = false;
                            }
                        } else {
                            i6 = paddingLeft;
                            layoutParams = layoutParams2;
                            view = viewD;
                            i7 = i11;
                            z2 = true;
                            defpackage.zvf zvfVar2 = this.o;
                            if (z) {
                                zvfVar2.h(view, zvdVar2, java.lang.Math.round(f8) - view.getMeasuredWidth(), paddingTop, java.lang.Math.round(f8), paddingTop + view.getMeasuredHeight());
                                z3 = z2;
                            } else {
                                int i21 = paddingTop;
                                zvfVar2.h(view, zvdVar2, java.lang.Math.round(f10), i21, view.getMeasuredWidth() + java.lang.Math.round(f10), i21 + view.getMeasuredHeight());
                                paddingTop = i21;
                                z3 = false;
                            }
                        }
                        float measuredWidth2 = f10 + view.getMeasuredWidth() + fMax + layoutParams.rightMargin;
                        measuredWidth = f8 - ((view.getMeasuredWidth() + fMax) + layoutParams.leftMargin);
                        if (z3) {
                            zvdVar = zvdVar2;
                            zvdVar.b(view, i20, 0, i8, 0);
                        } else {
                            zvdVar = zvdVar2;
                            zvdVar.b(view, i8, 0, i20, 0);
                        }
                        zvdVar2 = zvdVar;
                        f = measuredWidth2;
                    }
                    i5++;
                    paddingLeft = i6;
                    i11 = i7;
                }
                int i22 = paddingLeft;
                int i23 = zvdVar2.g;
                paddingTop += i23;
                paddingBottom = i11 - i23;
                i9++;
                paddingLeft = i22;
            } else {
                int i24 = zvdVar2.e;
                int i25 = (i12 - i24) + paddingRight;
                measuredWidth = i24 - paddingLeft;
                f = i25;
            }
            f2 = 0.0f;
            float fMax2 = java.lang.Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < zvdVar2.h) {
                int i110 = zvdVar2.o + i5;
                viewD = d(i110);
                if (viewD != null) {
                    i6 = paddingLeft;
                    i7 = i11;
                } else {
                    i6 = paddingLeft;
                    i7 = i11;
                }
                i5++;
                paddingLeft = i6;
                i11 = i7;
            }
            int i26 = paddingLeft;
            int i27 = zvdVar2.g;
            paddingTop += i27;
            paddingBottom = i11 - i27;
            i9++;
            paddingLeft = i26;
        }
    }

    @Override // defpackage.zvc
    public final boolean K() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    @Override // defpackage.zvc
    public final int a() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        android.util.SparseIntArray sparseIntArray = this.n;
        if (sparseIntArray == null) {
            sparseIntArray = new android.util.SparseIntArray(getChildCount());
            this.n = sparseIntArray;
        }
        defpackage.zvf zvfVar = this.o;
        defpackage.zvc zvcVar = zvfVar.a;
        int iL = zvcVar.l();
        java.util.List listA = zvfVar.a(iL);
        defpackage.zve zveVar = new defpackage.zve();
        if (view == null || !(layoutParams instanceof com.google.android.flexbox.FlexItem)) {
            zveVar.b = 1;
        } else {
            zveVar.b = ((com.google.android.flexbox.FlexItem) layoutParams).n();
        }
        if (i == -1 || i == iL || i >= zvcVar.l()) {
            zveVar.a = iL;
        } else {
            zveVar.a = i;
            for (int i2 = i; i2 < iL; i2++) {
                ((defpackage.zve) listA.get(i2)).a++;
            }
        }
        listA.add(zveVar);
        this.m = defpackage.zvf.m(iL + 1, listA, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // defpackage.zvc
    public final int b() {
        return this.d;
    }

    @Override // defpackage.zvc
    public final int c(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof com.google.android.flexbox.FlexboxLayout.LayoutParams;
    }

    public final android.view.View d(int i) {
        if (i >= 0) {
            int[] iArr = this.m;
            if (i < iArr.length) {
                return getChildAt(iArr[i]);
            }
        }
        return null;
    }

    public final void e(android.graphics.drawable.Drawable drawable) {
        if (drawable != this.g) {
            this.g = drawable;
            this.k = drawable.getIntrinsicHeight();
            C();
            requestLayout();
        }
    }

    public final void f(android.graphics.drawable.Drawable drawable) {
        if (drawable != this.h) {
            this.h = drawable;
            this.l = drawable.getIntrinsicWidth();
            C();
            requestLayout();
        }
    }

    @Override // defpackage.zvc
    public final int g(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof com.google.android.flexbox.FlexboxLayout.LayoutParams) {
            return new com.google.android.flexbox.FlexboxLayout.LayoutParams((com.google.android.flexbox.FlexboxLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new com.google.android.flexbox.FlexboxLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new com.google.android.flexbox.FlexboxLayout.LayoutParams(layoutParams);
    }

    @Override // defpackage.zvc
    public final int i(android.view.View view) {
        return 0;
    }

    @Override // defpackage.zvc
    public final int j(android.view.View view, int i, int i2) {
        int i3;
        int i4;
        if (K()) {
            i3 = D(i, i2) ? this.l : 0;
            if ((this.j & 4) <= 0) {
                return i3;
            }
            i4 = this.l;
        } else {
            i3 = D(i, i2) ? this.k : 0;
            if ((this.i & 4) <= 0) {
                return i3;
            }
            i4 = this.k;
        }
        return i3 + i4;
    }

    @Override // defpackage.zvc
    public final int k() {
        return this.a;
    }

    @Override // defpackage.zvc
    public final int l() {
        return getChildCount();
    }

    @Override // defpackage.zvc
    public final int m() {
        return this.b;
    }

    @Override // defpackage.zvc
    public final int n() {
        java.util.Iterator it = this.p.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = java.lang.Math.max(iMax, ((defpackage.zvd) it.next()).e);
        }
        return iMax;
    }

    @Override // defpackage.zvc
    public final int o() {
        return this.f;
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        if (this.h == null && this.g == null) {
            return;
        }
        if (this.i == 0 && this.j == 0) {
            return;
        }
        int i = dzs.a;
        int layoutDirection = getLayoutDirection();
        int i2 = this.a;
        if (i2 == 0) {
            h(canvas, layoutDirection == 1, this.b == 2);
            return;
        }
        if (i2 == 1) {
            h(canvas, layoutDirection != 1, this.b == 2);
            return;
        }
        if (i2 == 2) {
            boolean z = layoutDirection != 1;
            boolean z2 = layoutDirection == 1;
            if (this.b != 2) {
                z = z2;
            }
            p(canvas, z, false);
            return;
        }
        if (i2 == 3) {
            boolean z3 = layoutDirection != 1;
            boolean z4 = layoutDirection == 1;
            if (this.b != 2) {
                z3 = z4;
            }
            p(canvas, z3, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = dzs.a;
        int layoutDirection = getLayoutDirection();
        int i6 = this.a;
        if (i6 == 0) {
            y(layoutDirection == 1, i, i2, i3, i4);
            return;
        }
        if (i6 == 1) {
            y(layoutDirection != 1, i, i2, i3, i4);
            return;
        }
        if (i6 == 2) {
            A(this.b != 2 ? layoutDirection == 1 : layoutDirection != 1, false, i, i2, i3, i4);
        } else {
            if (i6 != 3) {
                throw new java.lang.IllegalStateException(a.bj(i6, "Invalid flex direction is set: "));
            }
            A(this.b != 2 ? layoutDirection == 1 : layoutDirection != 1, true, i, i2, i3, i4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        android.util.SparseIntArray sparseIntArray = this.n;
        if (sparseIntArray == null) {
            sparseIntArray = new android.util.SparseIntArray(getChildCount());
            this.n = sparseIntArray;
        }
        defpackage.zvc zvcVar = this.o.a;
        int iL = zvcVar.l();
        if (sparseIntArray.size() != iL) {
            defpackage.zvf zvfVar = this.o;
            android.util.SparseIntArray sparseIntArray2 = this.n;
            int iL2 = zvfVar.a.l();
            this.m = defpackage.zvf.m(iL2, zvfVar.a(iL2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < iL; i3++) {
            android.view.View viewS = zvcVar.s(i3);
            if (viewS != null && ((com.google.android.flexbox.FlexItem) viewS.getLayoutParams()).n() != sparseIntArray.get(i3)) {
                defpackage.zvf zvfVar2 = this.o;
                android.util.SparseIntArray sparseIntArray3 = this.n;
                int iL3 = zvfVar2.a.l();
                this.m = defpackage.zvf.m(iL3, zvfVar2.a(iL3), sparseIntArray3);
                break;
            }
        }
        int i4 = this.a;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                throw new java.lang.IllegalStateException(a.bj(i4, "Invalid value for the flex direction is set: "));
            }
            this.p.clear();
            this.q.h();
            this.o.n(this.q, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.p = this.q.b;
            this.o.d(i, i2, 0);
            this.o.c(i, i2, getPaddingLeft() + getPaddingRight());
            this.o.j(0);
            B(this.a, i, i2, this.q.a);
            return;
        }
        this.p.clear();
        this.q.h();
        this.o.n(this.q, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.p = this.q.b;
        this.o.d(i, i2, 0);
        if (this.d == 3) {
            for (defpackage.zvd zvdVar : this.p) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < zvdVar.h; i5++) {
                    android.view.View viewD = d(zvdVar.o + i5);
                    if (viewD != null && viewD.getVisibility() != 8) {
                        com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams = (com.google.android.flexbox.FlexboxLayout.LayoutParams) viewD.getLayoutParams();
                        iMax = this.b != 2 ? java.lang.Math.max(iMax, viewD.getMeasuredHeight() + java.lang.Math.max(zvdVar.l - viewD.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin) : java.lang.Math.max(iMax, viewD.getMeasuredHeight() + layoutParams.topMargin + java.lang.Math.max((zvdVar.l - viewD.getMeasuredHeight()) + viewD.getBaseline(), layoutParams.bottomMargin));
                    }
                }
                zvdVar.g = iMax;
            }
        }
        this.o.c(i, i2, getPaddingTop() + getPaddingBottom());
        this.o.j(0);
        B(this.a, i, i2, this.q.a);
    }

    @Override // defpackage.zvc
    public final int r() {
        int size = this.p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.zvd zvdVar = (defpackage.zvd) this.p.get(i2);
            if (E(i2)) {
                i += K() ? this.k : this.l;
            }
            if (F(i2)) {
                i += K() ? this.k : this.l;
            }
            i += zvdVar.g;
        }
        return i;
    }

    @Override // defpackage.zvc
    public final android.view.View s(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.zvc
    public final android.view.View t(int i) {
        return d(i);
    }

    @Override // defpackage.zvc
    public final java.util.List v() {
        return this.p;
    }

    @Override // defpackage.zvc
    public final void w(android.view.View view, int i, int i2, defpackage.zvd zvdVar) {
        int i3;
        int i4;
        if (D(i, i2)) {
            if (K()) {
                i3 = zvdVar.e;
                i4 = this.l;
            } else {
                i3 = zvdVar.e;
                i4 = this.k;
            }
            zvdVar.e = i3 + i4;
            zvdVar.f += i4;
        }
    }

    @Override // defpackage.zvc
    public final void x(defpackage.zvd zvdVar) {
        int i;
        int i2;
        if (K()) {
            if ((this.j & 4) <= 0) {
                return;
            }
            i = zvdVar.e;
            i2 = this.l;
        } else {
            if ((this.i & 4) <= 0) {
                return;
            }
            i = zvdVar.e;
            i2 = this.k;
        }
        zvdVar.e = i + i2;
        zvdVar.f += i2;
    }

    @Override // defpackage.zvc
    public final void z(java.util.List list) {
        this.p = list;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.google.android.flexbox.FlexboxLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.zvc
    public final void J(int i, android.view.View view) {
    }

    /* JADX INFO: compiled from: PG */
    public class LayoutParams extends android.view.ViewGroup.MarginLayoutParams implements com.google.android.flexbox.FlexItem {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(19);
        private int a;
        private float b;
        private float c;
        private int d;
        private float e;
        private int f;
        private int g;
        private int h;
        private int i;
        private boolean j;

        public LayoutParams(android.os.Parcel parcel) {
            super(0, 0);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            this.a = parcel.readInt();
            this.b = parcel.readFloat();
            this.c = parcel.readFloat();
            this.d = parcel.readInt();
            this.e = parcel.readFloat();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float a() {
            return this.e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float b() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float c() {
            return this.c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int d() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int e() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return this.bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int g() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int i() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int l() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int m() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void p(int i) {
            this.g = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void q(int i) {
            this.f = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean r() {
            return this.j;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d);
            parcel.writeFloat(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.zvi.b);
            this.a = typedArrayObtainStyledAttributes.getInt(8, 1);
            this.b = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
            this.c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            this.d = typedArrayObtainStyledAttributes.getInt(0, -1);
            this.e = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.j = typedArrayObtainStyledAttributes.getBoolean(9, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            this.a = layoutParams.a;
            this.b = layoutParams.b;
            this.c = layoutParams.c;
            this.d = layoutParams.d;
            this.e = layoutParams.e;
            this.f = layoutParams.f;
            this.g = layoutParams.g;
            this.h = layoutParams.h;
            this.i = layoutParams.i;
            this.j = layoutParams.j;
        }
    }

    public FlexboxLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(android.content.Context context) {
        this(context, null);
    }
}
