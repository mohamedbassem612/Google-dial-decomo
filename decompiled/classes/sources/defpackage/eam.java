package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class eam extends defpackage.eau {
    final android.view.WindowInsets a;
    defpackage.dwn b;
    int c;
    dyq d;
    int e;
    int f;
    private defpackage.dwn g;
    private defpackage.eax h;
    private android.graphics.Rect[][] k;
    private android.graphics.Rect[][] l;

    public eam(defpackage.eax eaxVar, android.view.WindowInsets windowInsets) {
        super(eaxVar);
        this.g = null;
        this.k = new android.graphics.Rect[10][];
        this.l = new android.graphics.Rect[10][];
        this.a = windowInsets;
    }

    private defpackage.dwn F(int i, boolean z) {
        defpackage.dwn dwnVarB = defpackage.dwn.a;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                dwnVarB = defpackage.dwn.b(dwnVarB, b(i2, z));
            }
        }
        return dwnVarB;
    }

    private defpackage.dwn G() {
        defpackage.eax eaxVar = this.h;
        return eaxVar != null ? eaxVar.h() : defpackage.dwn.a;
    }

    private defpackage.dwn H(android.view.View view) {
        throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private dyq I(android.view.View view) {
        android.view.Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        android.graphics.Point point = new android.graphics.Point();
        display.getRealSize(point);
        if (this.j.b.s()) {
            return dyq.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        dzb dzbVarE = yv.e(display, 0);
        dzb dzbVarE2 = yv.e(display, 1);
        dzb dzbVarE3 = yv.e(display, 2);
        dzb dzbVarE4 = yv.e(display, 3);
        return dyq.a(point.x, point.y, false, dzbVarE != null ? dzbVarE.a : 0, dzbVarE2 != null ? dzbVarE2.a : 0, dzbVarE3 != null ? dzbVarE3.a : 0, dzbVarE4 != null ? dzbVarE4.a : 0);
    }

    private static java.util.List J(android.graphics.Rect[][] rectArr, int i) {
        android.graphics.Rect[] rectArr2;
        android.graphics.Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[defpackage.dzo.g(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    int length = rectArr3.length;
                    int length2 = rectArr2.length;
                    android.graphics.Rect[] rectArr4 = new android.graphics.Rect[length + length2];
                    java.lang.System.arraycopy(rectArr3, 0, rectArr4, 0, length);
                    java.lang.System.arraycopy(rectArr2, 0, rectArr4, length, length2);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? java.util.Collections.EMPTY_LIST : java.util.Arrays.asList(rectArr3);
    }

    private android.graphics.Rect[] K(defpackage.dwn dwnVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = dwnVar.b;
        if (i != 0) {
            arrayList.add(new android.graphics.Rect(0, 0, i, this.e));
        }
        int i2 = dwnVar.c;
        if (i2 != 0) {
            arrayList.add(new android.graphics.Rect(0, 0, this.f, i2));
        }
        int i3 = dwnVar.d;
        if (i3 != 0) {
            int i4 = this.f;
            arrayList.add(new android.graphics.Rect(i4 - i3, 0, i4, this.e));
        }
        int i5 = dwnVar.e;
        if (i5 != 0) {
            int i6 = this.e;
            arrayList.add(new android.graphics.Rect(0, i6 - i5, this.f, i6));
        }
        return (android.graphics.Rect[]) arrayList.toArray(new android.graphics.Rect[arrayList.size()]);
    }

    static boolean v(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.eau
    public defpackage.dwn a(int i) {
        return F(i, false);
    }

    protected defpackage.dwn b(int i, boolean z) {
        defpackage.dwn dwnVar;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    defpackage.dwn dwnVarD = d();
                    defpackage.dwn dwnVarG = G();
                    int i2 = dwnVarD.e;
                    int i3 = dwnVarG.e;
                    if (i2 > i3 || ((dwnVar = this.b) != null && !dwnVar.equals(defpackage.dwn.a) && (i2 = this.b.e) > i3)) {
                        return defpackage.dwn.d(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return D();
                    }
                    if (i == 32) {
                        return C();
                    }
                    if (i == 64) {
                        return E();
                    }
                    if (i == 128) {
                        defpackage.eax eaxVar = this.h;
                        dyo dyoVarK = eaxVar != null ? eaxVar.k() : A();
                        if (dyoVarK != null) {
                            android.view.DisplayCutout displayCutout = dyoVarK.a;
                            return defpackage.dwn.d(ft$.ExternalSyntheticApiModelOutline0.m$1(displayCutout), ft$.ExternalSyntheticApiModelOutline0.m$2(displayCutout), ft$.ExternalSyntheticApiModelOutline0.m$3(displayCutout), ft$.ExternalSyntheticApiModelOutline0.m$4(displayCutout));
                        }
                    }
                }
            } else {
                if (z) {
                    defpackage.dwn dwnVarG2 = G();
                    defpackage.dwn dwnVarW = w();
                    return defpackage.dwn.d(java.lang.Math.max(dwnVarG2.b, dwnVarW.b), 0, java.lang.Math.max(dwnVarG2.d, dwnVarW.d), java.lang.Math.max(dwnVarG2.e, dwnVarW.e));
                }
                if ((this.c & 2) == 0) {
                    defpackage.dwn dwnVarD2 = d();
                    defpackage.eax eaxVar2 = this.h;
                    defpackage.dwn dwnVarH = eaxVar2 != null ? eaxVar2.h() : null;
                    int iMin = dwnVarD2.e;
                    if (dwnVarH != null) {
                        iMin = java.lang.Math.min(iMin, dwnVarH.e);
                    }
                    return defpackage.dwn.d(dwnVarD2.b, 0, dwnVarD2.d, iMin);
                }
            }
        } else {
            if (z) {
                return defpackage.dwn.d(0, java.lang.Math.max(G().c, d().c), 0, 0);
            }
            if ((this.c & 4) == 0) {
                return defpackage.dwn.d(0, d().c, 0, 0);
            }
        }
        return defpackage.dwn.a;
    }

    @Override // defpackage.eau
    public defpackage.dwn c(int i) {
        return F(i, true);
    }

    @Override // defpackage.eau
    public final defpackage.dwn d() {
        defpackage.dwn dwnVar = this.g;
        if (dwnVar != null) {
            return dwnVar;
        }
        android.view.WindowInsets windowInsets = this.a;
        defpackage.dwn dwnVarD = defpackage.dwn.d(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.g = dwnVarD;
        return dwnVarD;
    }

    @Override // defpackage.eau
    public defpackage.eax e(int i, int i2, int i3, int i4) {
        defpackage.eal eahVar;
        defpackage.eax eaxVarQ = defpackage.eax.q(this.a, null);
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            eahVar = new defpackage.eak(eaxVarQ);
        } else if (android.os.Build.VERSION.SDK_INT >= 35) {
            eahVar = new defpackage.eaj(eaxVarQ);
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            eahVar = new defpackage.eai(eaxVarQ);
        } else {
            eahVar = android.os.Build.VERSION.SDK_INT >= 31 ? new defpackage.eah(eaxVarQ) : new defpackage.eag(eaxVarQ);
        }
        eahVar.c(defpackage.eax.j(d(), i, i2, i3, i4));
        eahVar.b(defpackage.eax.j(w(), i, i2, i3, i4));
        return eahVar.a();
    }

    @Override // defpackage.eau
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        defpackage.eam eamVar = (defpackage.eam) obj;
        return j$.util.Objects.equals(this.b, eamVar.b) && v(this.c, eamVar.c);
    }

    @Override // defpackage.eau
    public java.util.List f(int i) {
        return J(this.k, i);
    }

    @Override // defpackage.eau
    public java.util.List g(int i) {
        return J(this.l, i);
    }

    @Override // defpackage.eau
    public void h(android.view.View view) {
        this.f = view.getWidth();
        this.e = view.getHeight();
        defpackage.dwn dwnVarH = H(view);
        if (dwnVarH == null) {
            dwnVarH = defpackage.dwn.a;
        }
        n(dwnVarH);
    }

    @Override // defpackage.eau
    public void i(defpackage.eax eaxVar) {
        eaxVar.t(this.h);
        eaxVar.b.n(this.b);
        eaxVar.u(this.c);
        eaxVar.s(this.d);
        eaxVar.v(this.k);
        eaxVar.w(this.l);
    }

    @Override // defpackage.eau
    public void j(android.view.View view) {
        this.d = I(view);
    }

    @Override // defpackage.eau
    public void k() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iG = defpackage.dzo.g(i);
            this.k[iG] = K(a(i));
            if (i != 8) {
                this.l[iG] = K(c(i));
            }
        }
    }

    @Override // defpackage.eau
    public void l(dyq dyqVar) {
        this.d = dyqVar;
    }

    @Override // defpackage.eau
    public void n(defpackage.dwn dwnVar) {
        this.b = dwnVar;
    }

    @Override // defpackage.eau
    public void o(defpackage.eax eaxVar) {
        this.h = eaxVar;
    }

    @Override // defpackage.eau
    public void p(int i) {
        this.c = i;
    }

    @Override // defpackage.eau
    public void q(android.graphics.Rect[][] rectArr) {
        j$.util.Objects.requireNonNull(rectArr);
        this.k = (android.graphics.Rect[][]) rectArr.clone();
    }

    @Override // defpackage.eau
    public void r(android.graphics.Rect[][] rectArr) {
        j$.util.Objects.requireNonNull(rectArr);
        this.l = (android.graphics.Rect[][]) rectArr.clone();
    }

    @Override // defpackage.eau
    public boolean s() {
        return this.a.isRound();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0012  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    protected boolean t(int i) {
        if (i == 1 || i == 2) {
            if (b(i, false).equals(defpackage.dwn.a)) {
                return false;
            }
        } else {
            if (i == 4) {
                return false;
            }
            if (i == 8 || i == 128) {
                if (b(i, false).equals(defpackage.dwn.a)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.eau
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !t(i2)) {
                return false;
            }
        }
        return true;
    }

    public eam(defpackage.eax eaxVar, defpackage.eam eamVar) {
        this(eaxVar, new android.view.WindowInsets(eamVar.a));
    }

    @Override // defpackage.eau
    public void m(defpackage.dwn[] dwnVarArr) {
    }
}
