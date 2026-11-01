package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class afwx extends android.widget.FrameLayout {
    public final defpackage.afwn a;
    public final defpackage.afwq b;
    public final defpackage.afws c;
    public defpackage.afww d;
    private android.view.MenuInflater e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:213:0x03a1  */
    public afwx(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize;
        super(defpackage.agdv.b(context, attributeSet, i, i2, new int[0]), attributeSet, i);
        int i3 = defpackage.agdv.a;
        defpackage.afws afwsVar = new defpackage.afws();
        this.c = afwsVar;
        android.content.Context context2 = getContext();
        int[] iArr = defpackage.afxc.b;
        defpackage.afvl.b(context2, attributeSet, i, i2);
        defpackage.afvl.d(context2, attributeSet, iArr, i, i2, 17, 15);
        defpackage.ajxw ajxwVar = new defpackage.ajxw(context2, context2.obtainStyledAttributes(attributeSet, iArr, i, i2));
        defpackage.afwn afwnVar = new defpackage.afwn(context2, getClass(), a(), h());
        this.a = afwnVar;
        defpackage.afwq afwqVarB = b(context2);
        this.b = afwqVarB;
        afwqVarB.setMinimumHeight(getSuggestedMinimumHeight());
        afwqVarB.M = c();
        afwsVar.a = afwqVarB;
        afwsVar.c = 1;
        afwqVarB.G = afwsVar;
        afwnVar.g(afwsVar);
        afwsVar.c(getContext(), afwnVar);
        if (ajxwVar.z(11)) {
            afwqVarB.h(ajxwVar.s(11));
        } else {
            afwqVarB.h(afwqVarB.k());
        }
        int iN = ajxwVar.n(10, getResources().getDimensionPixelSize(2131167140));
        afwqVarB.h = iN;
        defpackage.afwp[] afwpVarArr = afwqVarB.e;
        if (afwpVarArr != null) {
            for (defpackage.afwp afwpVar : afwpVarArr) {
                if (afwpVar instanceof defpackage.afwm) {
                    ((defpackage.afwm) afwpVar).v(iN);
                }
            }
        }
        if (ajxwVar.z(17)) {
            int iR = ajxwVar.r(17, 0);
            defpackage.afwq afwqVar = this.b;
            afwqVar.j = iR;
            defpackage.afwp[] afwpVarArr2 = afwqVar.e;
            if (afwpVarArr2 != null) {
                for (defpackage.afwp afwpVar2 : afwpVarArr2) {
                    if (afwpVar2 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar2).K(iR);
                    }
                }
            }
        }
        if (ajxwVar.z(15)) {
            int iR2 = ajxwVar.r(15, 0);
            defpackage.afwq afwqVar2 = this.b;
            afwqVar2.k = iR2;
            defpackage.afwp[] afwpVarArr3 = afwqVar2.e;
            if (afwpVarArr3 != null) {
                for (defpackage.afwp afwpVar3 : afwpVarArr3) {
                    if (afwpVar3 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar3).I(iR2);
                    }
                }
            }
        }
        if (ajxwVar.z(4)) {
            int iR3 = ajxwVar.r(4, 0);
            defpackage.afwq afwqVar3 = this.b;
            afwqVar3.l = iR3;
            defpackage.afwp[] afwpVarArr4 = afwqVar3.e;
            if (afwpVarArr4 != null) {
                for (defpackage.afwp afwpVar4 : afwpVarArr4) {
                    if (afwpVar4 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar4).t(iR3);
                    }
                }
            }
        }
        if (ajxwVar.z(3)) {
            int iR4 = ajxwVar.r(3, 0);
            defpackage.afwq afwqVar4 = this.b;
            afwqVar4.m = iR4;
            defpackage.afwp[] afwpVarArr5 = afwqVar4.e;
            if (afwpVarArr5 != null) {
                for (defpackage.afwp afwpVar5 : afwpVarArr5) {
                    if (afwpVar5 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar5).s(iR4);
                    }
                }
            }
        }
        boolean zY = ajxwVar.y(16, true);
        defpackage.afwq afwqVar5 = this.b;
        afwqVar5.n = zY;
        defpackage.afwp[] afwpVarArr6 = afwqVar5.e;
        if (afwpVarArr6 != null) {
            for (defpackage.afwp afwpVar6 : afwpVarArr6) {
                if (afwpVar6 instanceof defpackage.afwm) {
                    ((defpackage.afwm) afwpVar6).J(zY);
                }
            }
        }
        if (ajxwVar.z(18)) {
            android.content.res.ColorStateList colorStateListS = ajxwVar.s(18);
            defpackage.afwq afwqVar6 = this.b;
            afwqVar6.i = colorStateListS;
            defpackage.afwp[] afwpVarArr7 = afwqVar6.e;
            if (afwpVarArr7 != null) {
                for (defpackage.afwp afwpVar7 : afwpVarArr7) {
                    if (afwpVar7 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar7).L(colorStateListS);
                    }
                }
            }
        }
        android.graphics.drawable.Drawable background = getBackground();
        android.content.res.ColorStateList colorStateListP = defpackage.agab.P(background);
        if (background == null || colorStateListP != null) {
            defpackage.agaf agafVar = new defpackage.agaf(new defpackage.agal(defpackage.agal.k(context2, attributeSet, i, i2, new defpackage.afzw(0.0f))));
            if (colorStateListP != null) {
                agafVar.R(colorStateListP);
            }
            agafVar.N(context2);
            setBackground(agafVar);
        }
        if (ajxwVar.z(13)) {
            g(ajxwVar.n(13, 0));
        }
        if (ajxwVar.z(12)) {
            f(ajxwVar.n(12, 0));
        }
        if (ajxwVar.z(0)) {
            int iN2 = ajxwVar.n(0, 0);
            defpackage.afwq afwqVar7 = this.b;
            afwqVar7.t = iN2;
            defpackage.afwp[] afwpVarArr8 = afwqVar7.e;
            if (afwpVarArr8 != null) {
                for (defpackage.afwp afwpVar8 : afwpVarArr8) {
                    if (afwpVar8 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar8).m(iN2);
                    }
                }
            }
        }
        if (ajxwVar.z(5)) {
            int iN3 = ajxwVar.n(5, 0);
            defpackage.afwq afwqVar8 = this.b;
            afwqVar8.u = iN3;
            defpackage.afwp[] afwpVarArr9 = afwqVar8.e;
            if (afwpVarArr9 != null) {
                for (defpackage.afwp afwpVar9 : afwpVarArr9) {
                    if (afwpVar9 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar9).u(iN3);
                    }
                }
            }
        }
        if (ajxwVar.z(2)) {
            setElevation(ajxwVar.n(2, 0));
        }
        getBackground().mutate().setTintList(defpackage.agab.av(context2, ajxwVar, 1));
        int iP = ajxwVar.p(21, -1);
        defpackage.afwq afwqVar9 = this.b;
        if (afwqVar9.c != iP) {
            afwqVar9.c = iP;
            this.c.f(false);
        }
        e(ajxwVar.p(9, 0));
        d(ajxwVar.p(8, 49));
        int iR5 = ajxwVar.r(7, 0);
        if (iR5 != 0) {
            defpackage.afwq afwqVar10 = this.b;
            afwqVar10.p = iR5;
            defpackage.afwp[] afwpVarArr10 = afwqVar10.e;
            if (afwpVarArr10 != null) {
                for (defpackage.afwp afwpVar10 : afwpVarArr10) {
                    if (afwpVar10 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar10).x(iR5);
                    }
                }
            }
        } else {
            android.content.res.ColorStateList colorStateListAv = defpackage.agab.av(context2, ajxwVar, 14);
            defpackage.afwq afwqVar11 = this.b;
            afwqVar11.o = colorStateListAv;
            defpackage.afwp[] afwpVarArr11 = afwqVar11.e;
            if (afwpVarArr11 != null) {
                for (defpackage.afwp afwpVar11 : afwpVarArr11) {
                    if (afwpVar11 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar11).C(colorStateListAv);
                    }
                }
            }
        }
        boolean zY2 = ajxwVar.y(22, true);
        defpackage.afwq afwqVar12 = this.b;
        afwqVar12.I = zY2;
        defpackage.afwp[] afwpVarArr12 = afwqVar12.e;
        if (afwpVarArr12 != null) {
            for (defpackage.afwp afwpVar12 : afwpVarArr12) {
                if (afwpVar12 instanceof defpackage.afwm) {
                    ((defpackage.afwm) afwpVar12).G(zY2);
                }
            }
        }
        boolean zY3 = ajxwVar.y(19, false);
        defpackage.afwq afwqVar13 = this.b;
        afwqVar13.J = zY3;
        defpackage.afwp[] afwpVarArr13 = afwqVar13.e;
        if (afwpVarArr13 != null) {
            for (defpackage.afwp afwpVar13 : afwpVarArr13) {
                if (afwpVar13 instanceof defpackage.afwm) {
                    ((defpackage.afwm) afwpVar13).D(zY3);
                }
            }
        }
        int iP2 = ajxwVar.p(20, 1);
        defpackage.afwq afwqVar14 = this.b;
        afwqVar14.K = iP2;
        defpackage.afwp[] afwpVarArr14 = afwqVar14.e;
        if (afwpVarArr14 != null) {
            for (defpackage.afwp afwpVar14 : afwpVarArr14) {
                if (afwpVar14 instanceof defpackage.afwm) {
                    ((defpackage.afwm) afwpVar14).E(iP2);
                }
            }
        }
        int iR6 = ajxwVar.r(6, 0);
        if (iR6 != 0) {
            defpackage.afwq afwqVar15 = this.b;
            afwqVar15.v = true;
            defpackage.afwp[] afwpVarArr15 = afwqVar15.e;
            if (afwpVarArr15 != null) {
                for (defpackage.afwp afwpVar15 : afwpVarArr15) {
                    if (afwpVar15 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar15).h(true);
                    }
                }
            }
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iR6, defpackage.afxc.a);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            defpackage.afwq afwqVar16 = this.b;
            afwqVar16.w = dimensionPixelSize2;
            defpackage.afwp[] afwpVarArr16 = afwqVar16.e;
            if (afwpVarArr16 != null) {
                for (defpackage.afwp afwpVar16 : afwpVarArr16) {
                    if (afwpVar16 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar16).p(dimensionPixelSize2);
                    }
                }
            }
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            defpackage.afwq afwqVar17 = this.b;
            afwqVar17.x = dimensionPixelSize3;
            defpackage.afwp[] afwpVarArr17 = afwqVar17.e;
            if (afwpVarArr17 != null) {
                for (defpackage.afwp afwpVar17 : afwpVarArr17) {
                    if (afwpVar17 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar17).l(dimensionPixelSize3);
                    }
                }
            }
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
            defpackage.afwq afwqVar18 = this.b;
            afwqVar18.A = dimensionPixelOffset;
            defpackage.afwp[] afwpVarArr18 = afwqVar18.e;
            if (afwpVarArr18 != null) {
                for (defpackage.afwp afwpVar18 : afwpVarArr18) {
                    if (afwpVar18 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar18).n(dimensionPixelOffset);
                    }
                }
            }
            java.lang.String string = typedArrayObtainStyledAttributes.getString(9);
            if (string == null) {
                dimensionPixelSize = -2;
            } else if ("-1".equals(string)) {
                dimensionPixelSize = -1;
            } else if ("-2".equals(string)) {
                dimensionPixelSize = -2;
            } else {
                dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -2);
            }
            defpackage.afwq afwqVar19 = this.b;
            afwqVar19.y = dimensionPixelSize;
            defpackage.afwp[] afwpVarArr19 = afwqVar19.e;
            if (afwpVarArr19 != null) {
                for (defpackage.afwp afwpVar19 : afwpVarArr19) {
                    if (afwpVar19 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar19).k(dimensionPixelSize);
                    }
                }
            }
            int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize2);
            defpackage.afwq afwqVar20 = this.b;
            afwqVar20.z = dimensionPixelSize4;
            defpackage.afwp[] afwpVarArr20 = afwqVar20.e;
            if (afwpVarArr20 != null) {
                for (defpackage.afwp afwpVar20 : afwpVarArr20) {
                    if (afwpVar20 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar20).i(dimensionPixelSize4);
                    }
                }
            }
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelOffset);
            defpackage.afwq afwqVar21 = this.b;
            afwqVar21.B = dimensionPixelOffset2;
            defpackage.afwp[] afwpVarArr21 = afwqVar21.e;
            if (afwpVarArr21 != null) {
                for (defpackage.afwp afwpVar21 : afwpVarArr21) {
                    if (afwpVar21 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar21).j(dimensionPixelOffset2);
                    }
                }
            }
            int dimensionPixelSize5 = getResources().getDimensionPixelSize(2131166780);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize5);
            int dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize5);
            int i4 = getLayoutDirection() == 1 ? dimensionPixelOffset4 : dimensionPixelOffset3;
            int dimensionPixelOffset5 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            dimensionPixelOffset3 = getLayoutDirection() != 1 ? dimensionPixelOffset4 : dimensionPixelOffset3;
            int dimensionPixelOffset6 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            defpackage.afwq afwqVar22 = this.b;
            afwqVar22.O.left = i4;
            afwqVar22.O.top = dimensionPixelOffset5;
            afwqVar22.O.right = dimensionPixelOffset3;
            afwqVar22.O.bottom = dimensionPixelOffset6;
            defpackage.afwp[] afwpVarArr22 = afwqVar22.e;
            if (afwpVarArr22 != null) {
                for (defpackage.afwp afwpVar22 : afwpVarArr22) {
                    if (afwpVar22 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar22).q = afwqVar22.O;
                    }
                }
            }
            android.content.res.ColorStateList colorStateListO = defpackage.agab.o(context2, typedArrayObtainStyledAttributes, 2);
            defpackage.afwq afwqVar23 = this.b;
            afwqVar23.F = colorStateListO;
            defpackage.afwp[] afwpVarArr23 = afwqVar23.e;
            if (afwpVarArr23 != null) {
                for (defpackage.afwp afwpVar23 : afwpVarArr23) {
                    if (afwpVar23 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar23).g(afwqVar23.d());
                    }
                }
            }
            defpackage.agal agalVar = new defpackage.agal(defpackage.agal.j(context2, typedArrayObtainStyledAttributes.getResourceId(11, 0), 0, new defpackage.afzw(0.0f)));
            defpackage.afwq afwqVar24 = this.b;
            afwqVar24.D = agalVar;
            defpackage.afwp[] afwpVarArr24 = afwqVar24.e;
            if (afwpVarArr24 != null) {
                for (defpackage.afwp afwpVar24 : afwpVarArr24) {
                    if (afwpVar24 instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar24).g(afwqVar24.d());
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (ajxwVar.z(23)) {
            int iR7 = ajxwVar.r(23, 0);
            this.c.b = true;
            if (this.e == null) {
                this.e = new defpackage.fe(getContext());
            }
            this.e.inflate(iR7, this.a);
            defpackage.afws afwsVar2 = this.c;
            afwsVar2.b = false;
            afwsVar2.f(true);
        }
        ajxwVar.x();
        if (!i()) {
            addView(this.b);
        }
        this.a.b = new defpackage.afwv(this);
    }

    public abstract int a();

    protected abstract defpackage.afwq b(android.content.Context context);

    public int c() {
        return a();
    }

    public void d(int i) {
        defpackage.afwq afwqVar = this.b;
        if (afwqVar.C != i) {
            afwqVar.i(i);
            this.c.f(false);
        }
    }

    public void e(int i) {
        defpackage.afwq afwqVar = this.b;
        if (afwqVar.d != i) {
            afwqVar.d = i;
            defpackage.afwp[] afwpVarArr = afwqVar.e;
            if (afwpVarArr != null) {
                for (defpackage.afwp afwpVar : afwpVarArr) {
                    if (afwpVar instanceof defpackage.afwm) {
                        ((defpackage.afwm) afwpVar).z(i);
                    }
                }
            }
            this.c.f(false);
        }
    }

    public final void f(int i) {
        defpackage.afwq afwqVar = this.b;
        afwqVar.s = i;
        defpackage.afwp[] afwpVarArr = afwqVar.e;
        if (afwpVarArr != null) {
            for (defpackage.afwp afwpVar : afwpVarArr) {
                if (afwpVar instanceof defpackage.afwm) {
                    ((defpackage.afwm) afwpVar).A(afwqVar.s);
                }
            }
        }
    }

    public final void g(int i) {
        defpackage.afwq afwqVar = this.b;
        afwqVar.r = i;
        defpackage.afwp[] afwpVarArr = afwqVar.e;
        if (afwpVarArr != null) {
            for (defpackage.afwp afwpVar : afwpVarArr) {
                if (afwpVar instanceof defpackage.afwm) {
                    ((defpackage.afwm) afwpVar).B(i);
                }
            }
        }
    }

    protected boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        defpackage.agab.f(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.navigation.NavigationBarView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.navigation.NavigationBarView$SavedState navigationBarView$SavedState = (com.google.android.material.navigation.NavigationBarView$SavedState) parcelable;
        super.onRestoreInstanceState(navigationBarView$SavedState.d);
        this.a.j(navigationBarView$SavedState.a);
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.navigation.NavigationBarView$SavedState navigationBarView$SavedState = new com.google.android.material.navigation.NavigationBarView$SavedState(super.onSaveInstanceState());
        navigationBarView$SavedState.a = new android.os.Bundle();
        this.a.k(navigationBarView$SavedState.a);
        return navigationBarView$SavedState;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        defpackage.agab.e(this, f);
    }
}
