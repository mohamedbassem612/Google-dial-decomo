package com.google.android.flexbox;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FlexboxLayoutManager extends kp implements defpackage.zvc, ky {
    private static final android.graphics.Rect h = new android.graphics.Rect();
    private final android.content.Context K;
    private android.view.View L;
    public int a;
    public int b;
    public boolean c;
    public kb f;
    public kb g;
    private int i;
    private boolean k;
    private kt l;
    private la m;
    private defpackage.zvh n;
    private com.google.android.flexbox.FlexboxLayoutManager.SavedState p;
    private final int j = -1;
    public java.util.List d = new java.util.ArrayList();
    public final defpackage.zvf e = new defpackage.zvf(this);
    private final defpackage.zvg o = new defpackage.zvg(this);
    private int q = -1;
    private int G = Integer.MIN_VALUE;
    private int H = Integer.MIN_VALUE;
    private int I = Integer.MIN_VALUE;
    private final android.util.SparseArray J = new android.util.SparseArray();
    private int M = -1;
    private final aizg N = new aizg();

    public FlexboxLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        ko koVarAC = aC(context, attributeSet, i, i2);
        int i3 = koVarAC.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (koVarAC.c) {
                    M(3);
                } else {
                    M(2);
                }
            }
        } else if (koVarAC.c) {
            M(1);
        } else {
            M(0);
        }
        if (this.b != 1) {
            aQ();
            ak();
            this.b = 1;
            this.f = null;
            this.g = null;
            aW();
        }
        if (this.i != 4) {
            aQ();
            ak();
            this.i = 4;
            aW();
        }
        this.K = context;
    }

    private final int N(la laVar) {
        if (aw() != 0) {
            int iA = laVar.a();
            aq();
            android.view.View viewZ = Z(iA);
            android.view.View viewAd = ad(iA);
            if (laVar.a() != 0 && viewZ != null && viewAd != null) {
                return java.lang.Math.min(this.f.k(), this.f.a(viewAd) - this.f.d(viewZ));
            }
        }
        return 0;
    }

    private final int O(la laVar) {
        if (aw() != 0) {
            int iA = laVar.a();
            android.view.View viewZ = Z(iA);
            android.view.View viewAd = ad(iA);
            if (laVar.a() != 0 && viewZ != null && viewAd != null) {
                int iBl = bl(viewZ);
                int iBl2 = bl(viewAd);
                int iA2 = this.f.a(viewAd) - this.f.d(viewZ);
                defpackage.zvf zvfVar = this.e;
                int iAbs = java.lang.Math.abs(iA2);
                int[] iArr = zvfVar.b;
                int i = iArr[iBl];
                if (i != 0 && i != -1) {
                    return java.lang.Math.round((i * (iAbs / ((iArr[iBl2] - i) + 1))) + (this.f.j() - this.f.d(viewZ)));
                }
            }
        }
        return 0;
    }

    private final int R(la laVar) {
        if (aw() == 0) {
            return 0;
        }
        int iA = laVar.a();
        android.view.View viewZ = Z(iA);
        android.view.View viewAd = ad(iA);
        if (laVar.a() == 0 || viewZ == null || viewAd == null) {
            return 0;
        }
        android.view.View viewBF = bF(0, aw());
        return (int) ((java.lang.Math.abs(this.f.a(viewAd) - this.f.d(viewZ)) / ((L() - (viewBF == null ? -1 : bl(viewBF))) + 1)) * laVar.a());
    }

    private final int S(kt ktVar, la laVar, defpackage.zvh zvhVar) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        com.google.android.flexbox.FlexboxLayoutManager.LayoutParams layoutParams;
        int i9 = zvhVar.f;
        if (i9 != Integer.MIN_VALUE) {
            int i10 = zvhVar.a;
            if (i10 < 0) {
                zvhVar.f = i9 + i10;
            }
            ar(ktVar, zvhVar);
        }
        int i11 = zvhVar.a;
        boolean zK = K();
        int i12 = i11;
        int i13 = 0;
        while (true) {
            if (i12 <= 0 && !this.n.b) {
                break;
            }
            java.util.List list = this.d;
            int i14 = zvhVar.d;
            if (i14 < 0 || i14 >= laVar.a() || (i = zvhVar.c) < 0 || i >= list.size()) {
                break;
            }
            defpackage.zvd zvdVar = (defpackage.zvd) this.d.get(zvhVar.c);
            zvhVar.d = zvdVar.o;
            int i15 = 1;
            if (K()) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i16 = ((kp) this).C;
                int i17 = zvhVar.e;
                if (zvhVar.i == -1) {
                    i17 -= zvdVar.g;
                }
                int i18 = i17;
                int i19 = zvhVar.d;
                int i20 = i16 - paddingRight;
                float f2 = this.o.d;
                int i21 = zvdVar.h;
                float measuredWidth = i20 - f2;
                float measuredWidth2 = paddingLeft - f2;
                int i22 = i19;
                int i23 = 0;
                while (i22 < i19 + i21) {
                    android.view.View viewS = s(i22);
                    int i24 = i11;
                    int i25 = zvhVar.i;
                    int i26 = i18;
                    android.graphics.Rect rect = h;
                    if (i25 == i15) {
                        aH(viewS, rect);
                        super.aG(viewS, -1, false);
                    } else {
                        aH(viewS, rect);
                        int i27 = i23;
                        super.aG(viewS, i27, false);
                        i23 = i27 + 1;
                    }
                    float f3 = measuredWidth2;
                    defpackage.zvf zvfVar = this.e;
                    int i28 = i22;
                    long j = zvfVar.c[i28];
                    int i29 = (int) j;
                    int iL = defpackage.zvf.l(j);
                    com.google.android.flexbox.FlexboxLayoutManager.LayoutParams layoutParams2 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) viewS.getLayoutParams();
                    if (bE(viewS, i29, iL, layoutParams2)) {
                        viewS.measure(i29, iL);
                    }
                    float fBk = f3 + layoutParams2.leftMargin + bk(viewS);
                    float fBm = measuredWidth - (layoutParams2.rightMargin + bm(viewS));
                    int iBn = i26 + bn(viewS);
                    if (this.c) {
                        f = fBk;
                        layoutParams = layoutParams2;
                        zvfVar.h(viewS, zvdVar, java.lang.Math.round(fBm) - viewS.getMeasuredWidth(), iBn, java.lang.Math.round(fBm), iBn + viewS.getMeasuredHeight());
                    } else {
                        f = fBk;
                        layoutParams = layoutParams2;
                        zvfVar.h(viewS, zvdVar, java.lang.Math.round(f), iBn, java.lang.Math.round(f) + viewS.getMeasuredWidth(), viewS.getMeasuredHeight() + iBn);
                    }
                    measuredWidth2 = f + viewS.getMeasuredWidth() + layoutParams.rightMargin + bm(viewS) + 0.0f;
                    measuredWidth = fBm - (((viewS.getMeasuredWidth() + layoutParams.leftMargin) + bk(viewS)) + 0.0f);
                    i22 = i28 + 1;
                    i19 = i19;
                    i11 = i24;
                    i18 = i26;
                    i15 = 1;
                }
                i2 = i11;
                zvhVar.c += this.n.i;
                i5 = zvdVar.g;
                z = zK;
            } else {
                i2 = i11;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i30 = ((kp) this).D;
                int i31 = zvhVar.e;
                if (zvhVar.i == -1) {
                    int i32 = zvdVar.g;
                    i4 = i31 + i32;
                    i3 = i31 - i32;
                } else {
                    i3 = i31;
                    i4 = i3;
                }
                int i33 = zvhVar.d;
                int i34 = i30 - paddingBottom;
                float f4 = this.o.d;
                int i35 = zvdVar.h;
                float measuredHeight = i34 - f4;
                float measuredHeight2 = paddingTop - f4;
                int i36 = i33;
                int i37 = 0;
                while (i36 < i33 + i35) {
                    int i38 = i33;
                    android.view.View viewS2 = s(i36);
                    float f5 = measuredHeight;
                    defpackage.zvf zvfVar2 = this.e;
                    float f6 = measuredHeight2;
                    long j2 = zvfVar2.c[i36];
                    boolean z2 = zK;
                    int i39 = (int) j2;
                    int iL2 = defpackage.zvf.l(j2);
                    com.google.android.flexbox.FlexboxLayoutManager.LayoutParams layoutParams3 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) viewS2.getLayoutParams();
                    if (bE(viewS2, i39, iL2, layoutParams3)) {
                        viewS2.measure(i39, iL2);
                    }
                    float fBn = f6 + layoutParams3.topMargin + bn(viewS2);
                    float fBh = f5 - (layoutParams3.rightMargin + bh(viewS2));
                    int i40 = zvhVar.i;
                    android.graphics.Rect rect2 = h;
                    int i41 = i35;
                    if (i40 == 1) {
                        aH(viewS2, rect2);
                        super.aG(viewS2, -1, false);
                    } else {
                        aH(viewS2, rect2);
                        super.aG(viewS2, i37, false);
                        i37++;
                    }
                    int iBk = i3 + bk(viewS2);
                    int iBm = i4 - bm(viewS2);
                    boolean z3 = this.c;
                    boolean z4 = this.k;
                    if (!z3) {
                        i6 = i36;
                        i7 = i38;
                        i8 = i41;
                        if (z4) {
                            zvfVar2.i(viewS2, zvdVar, false, iBk, java.lang.Math.round(fBh) - viewS2.getMeasuredHeight(), iBk + viewS2.getMeasuredWidth(), java.lang.Math.round(fBh));
                        } else {
                            zvfVar2.i(viewS2, zvdVar, false, iBk, java.lang.Math.round(fBn), iBk + viewS2.getMeasuredWidth(), java.lang.Math.round(fBn) + viewS2.getMeasuredHeight());
                        }
                    } else if (z4) {
                        i7 = i38;
                        i8 = i41;
                        i6 = i36;
                        zvfVar2.i(viewS2, zvdVar, true, iBm - viewS2.getMeasuredWidth(), java.lang.Math.round(fBh) - viewS2.getMeasuredHeight(), iBm, java.lang.Math.round(fBh));
                    } else {
                        i6 = i36;
                        i7 = i38;
                        i8 = i41;
                        zvfVar2.i(viewS2, zvdVar, true, iBm - viewS2.getMeasuredWidth(), java.lang.Math.round(fBn), iBm, java.lang.Math.round(fBn) + viewS2.getMeasuredHeight());
                    }
                    measuredHeight2 = fBn + viewS2.getMeasuredHeight() + layoutParams3.topMargin + bh(viewS2) + 0.0f;
                    measuredHeight = fBh - (((viewS2.getMeasuredHeight() + layoutParams3.bottomMargin) + bn(viewS2)) + 0.0f);
                    i36 = i6 + 1;
                    i35 = i8;
                    zK = z2;
                    i33 = i7;
                }
                z = zK;
                zvhVar.c += this.n.i;
                i5 = zvdVar.g;
            }
            i13 += i5;
            if (z || !this.c) {
                zvhVar.e += zvdVar.g * zvhVar.i;
            } else {
                zvhVar.e -= zvdVar.g * zvhVar.i;
            }
            i12 -= zvdVar.g;
            i11 = i2;
            zK = z;
        }
        int i42 = i11;
        int i43 = zvhVar.a - i13;
        zvhVar.a = i43;
        int i44 = zvhVar.f;
        if (i44 != Integer.MIN_VALUE) {
            int i45 = i44 + i13;
            zvhVar.f = i45;
            if (i43 < 0) {
                zvhVar.f = i45 + i43;
            }
            ar(ktVar, zvhVar);
        }
        return i42 - zvhVar.a;
    }

    private final int T(int i, kt ktVar, la laVar, boolean z) {
        int iW;
        int iF;
        if (K() || !this.c) {
            int iF2 = this.f.f() - i;
            if (iF2 <= 0) {
                return 0;
            }
            iW = -W(-iF2, ktVar, laVar);
        } else {
            int iJ = i - this.f.j();
            if (iJ <= 0) {
                return 0;
            }
            iW = W(iJ, ktVar, laVar);
        }
        int i2 = iW;
        int i3 = i + i2;
        if (!z || (iF = this.f.f() - i3) <= 0) {
            return i2;
        }
        this.f.n(iF);
        return i2 + iF;
    }

    private final int U(int i, kt ktVar, la laVar, boolean z) {
        int iW;
        int iJ;
        if (K() || !this.c) {
            int iJ2 = i - this.f.j();
            if (iJ2 <= 0) {
                return 0;
            }
            iW = -W(iJ2, ktVar, laVar);
        } else {
            int iF = this.f.f() - i;
            if (iF <= 0) {
                return 0;
            }
            iW = W(-iF, ktVar, laVar);
        }
        int i2 = iW;
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.f.j()) <= 0) {
            return i2;
        }
        this.f.n(-iJ);
        return i2 - iJ;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01de  */
    private final int W(int i, kt ktVar, la laVar) {
        int i2;
        if (aw() == 0 || i == 0) {
            return 0;
        }
        aq();
        this.n.j = true;
        boolean z = !K() && this.c;
        int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
        int iAbs = java.lang.Math.abs(i);
        this.n.i = i3;
        boolean zK = K();
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(((kp) this).C, ((kp) this).A);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(((kp) this).D, ((kp) this).B);
        boolean z2 = !zK && this.c;
        if (i3 == 1) {
            android.view.View viewAE = aE(aw() - 1);
            if (viewAE != null) {
                this.n.e = this.f.a(viewAE);
                boolean z3 = z2;
                defpackage.zvf zvfVar = this.e;
                int iBl = bl(viewAE);
                android.view.View viewAf = af(viewAE, (defpackage.zvd) this.d.get(zvfVar.b[iBl]));
                this.n.h = 1;
                defpackage.zvh zvhVar = this.n;
                int i4 = iBl + zvhVar.h;
                zvhVar.d = i4;
                int[] iArr = zvfVar.b;
                if (iArr.length <= i4) {
                    zvhVar.c = -1;
                } else {
                    zvhVar.c = iArr[i4];
                }
                kb kbVar = this.f;
                if (z3) {
                    zvhVar.e = kbVar.d(viewAf);
                    this.n.f = (-this.f.d(viewAf)) + this.f.j();
                    defpackage.zvh zvhVar2 = this.n;
                    zvhVar2.f = java.lang.Math.max(zvhVar2.f, 0);
                } else {
                    zvhVar.e = kbVar.a(viewAf);
                    this.n.f = this.f.a(viewAf) - this.f.f();
                }
                int i5 = this.n.c;
                if ((i5 == -1 || i5 > this.d.size() - 1) && this.n.d <= l()) {
                    int i6 = iAbs - this.n.f;
                    aizg aizgVar = this.N;
                    aizgVar.h();
                    if (i6 > 0) {
                        defpackage.zvh zvhVar3 = this.n;
                        if (zK) {
                            zvfVar.n(aizgVar, iMakeMeasureSpec, iMakeMeasureSpec2, i6, zvhVar3.d, -1, this.d);
                        } else {
                            zvfVar.n(aizgVar, iMakeMeasureSpec2, iMakeMeasureSpec, i6, zvhVar3.d, -1, this.d);
                            iMakeMeasureSpec2 = iMakeMeasureSpec2;
                            iMakeMeasureSpec = iMakeMeasureSpec;
                        }
                        zvfVar.d(iMakeMeasureSpec, iMakeMeasureSpec2, this.n.d);
                        zvfVar.j(this.n.d);
                    }
                }
                defpackage.zvh zvhVar4 = this.n;
                zvhVar4.a = iAbs - zvhVar4.f;
            }
        } else {
            boolean z4 = z2;
            android.view.View viewAE2 = aE(0);
            if (viewAE2 != null) {
                this.n.e = this.f.d(viewAE2);
                defpackage.zvf zvfVar2 = this.e;
                int iBl2 = bl(viewAE2);
                android.view.View viewAb = ab(viewAE2, (defpackage.zvd) this.d.get(zvfVar2.b[iBl2]));
                this.n.h = 1;
                int i7 = zvfVar2.b[iBl2];
                if (i7 == -1) {
                    i7 = 0;
                }
                if (i7 > 0) {
                    this.n.d = iBl2 - ((defpackage.zvd) this.d.get(i7 - 1)).h;
                } else {
                    this.n.d = -1;
                }
                defpackage.zvh zvhVar5 = this.n;
                zvhVar5.c = i7 > 0 ? i7 - 1 : 0;
                kb kbVar2 = this.f;
                if (z4) {
                    zvhVar5.e = kbVar2.a(viewAb);
                    this.n.f = this.f.a(viewAb) - this.f.f();
                    defpackage.zvh zvhVar6 = this.n;
                    zvhVar6.f = java.lang.Math.max(zvhVar6.f, 0);
                } else {
                    zvhVar5.e = kbVar2.d(viewAb);
                    this.n.f = (-this.f.d(viewAb)) + this.f.j();
                }
                defpackage.zvh zvhVar7 = this.n;
                zvhVar7.a = iAbs - zvhVar7.f;
            }
        }
        defpackage.zvh zvhVar8 = this.n;
        int iS = zvhVar8.f + S(ktVar, laVar, zvhVar8);
        if (iS < 0) {
            return 0;
        }
        if (z) {
            if (iAbs > iS) {
                i2 = (-i3) * iS;
            } else {
                i2 = i;
            }
        } else if (iAbs > iS) {
            i2 = i3 * iS;
        } else {
            i2 = i;
        }
        this.f.n(-i2);
        this.n.g = i2;
        return i2;
    }

    private final int Y(int i) {
        int height;
        int i2;
        int iMin;
        if (aw() == 0 || i == 0) {
            return 0;
        }
        aq();
        boolean zK = K();
        android.view.View view = this.L;
        if (zK) {
            height = view.getWidth();
            i2 = ((kp) this).C;
        } else {
            height = view.getHeight();
            i2 = ((kp) this).D;
        }
        if (az() == 1) {
            int iAbs = java.lang.Math.abs(i);
            defpackage.zvg zvgVar = this.o;
            if (i < 0) {
                iMin = java.lang.Math.min((i2 + zvgVar.d) - height, iAbs);
            } else {
                iMin = zvgVar.d;
                if (iMin + i <= 0) {
                    return i;
                }
            }
        } else {
            defpackage.zvg zvgVar2 = this.o;
            if (i > 0) {
                return java.lang.Math.min((i2 - zvgVar2.d) - height, i);
            }
            iMin = zvgVar2.d;
            if (iMin + i >= 0) {
                return i;
            }
        }
        return -iMin;
    }

    private final android.view.View Z(int i) {
        android.view.View viewAg = ag(0, aw(), i);
        if (viewAg != null) {
            defpackage.zvf zvfVar = this.e;
            int i2 = zvfVar.b[bl(viewAg)];
            if (i2 != -1) {
                return ab(viewAg, (defpackage.zvd) this.d.get(i2));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    private final android.view.View ab(android.view.View view, defpackage.zvd zvdVar) {
        boolean zK = K();
        int i = zvdVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            android.view.View viewAE = aE(i2);
            if (viewAE != null && viewAE.getVisibility() != 8) {
                if (!this.c || zK) {
                    if (this.f.d(view) > this.f.d(viewAE)) {
                        view = viewAE;
                    }
                } else if (this.f.a(view) < this.f.a(viewAE)) {
                    view = viewAE;
                }
            }
        }
        return view;
    }

    private final android.view.View ad(int i) {
        android.view.View viewAg = ag(aw() - 1, -1, i);
        if (viewAg == null) {
            return null;
        }
        return af(viewAg, (defpackage.zvd) this.d.get(this.e.b[bl(viewAg)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    private final android.view.View af(android.view.View view, defpackage.zvd zvdVar) {
        boolean zK = K();
        int iAw = aw() - zvdVar.h;
        for (int iAw2 = aw() - 2; iAw2 > iAw - 1; iAw2--) {
            android.view.View viewAE = aE(iAw2);
            if (viewAE != null && viewAE.getVisibility() != 8) {
                if (!this.c || zK) {
                    if (this.f.a(view) < this.f.a(viewAE)) {
                        view = viewAE;
                    }
                } else if (this.f.d(view) > this.f.d(viewAE)) {
                    view = viewAE;
                }
            }
        }
        return view;
    }

    private final android.view.View ag(int i, int i2, int i3) {
        int iBl;
        aq();
        am();
        int iJ = this.f.j();
        int iF = this.f.f();
        android.view.View view = null;
        int i4 = i;
        android.view.View view2 = null;
        while (i4 != i2) {
            android.view.View viewAE = aE(i4);
            if (viewAE != null && (iBl = bl(viewAE)) >= 0 && iBl < i3) {
                if (viewAE.getLayoutParams().eC()) {
                    if (view2 == null) {
                        view2 = viewAE;
                    }
                } else {
                    if (this.f.d(viewAE) >= iJ && this.f.a(viewAE) <= iF) {
                        return viewAE;
                    }
                    if (view == null) {
                        view = viewAE;
                    }
                }
            }
            i4 += i2 > i ? 1 : -1;
        }
        return view == null ? view2 : view;
    }

    private final void ak() {
        this.d.clear();
        defpackage.zvg zvgVar = this.o;
        zvgVar.b();
        zvgVar.d = 0;
    }

    private final void am() {
        if (this.n == null) {
            this.n = new defpackage.zvh();
        }
    }

    private final void aq() {
        if (this.f == null) {
            boolean zK = K();
            int i = this.b;
            if (zK) {
                if (i == 0) {
                    this.f = new jz(this);
                    this.g = new ka(this);
                    return;
                } else {
                    this.f = new ka(this);
                    this.g = new jz(this);
                    return;
                }
            }
            if (i == 0) {
                this.f = new ka(this);
                this.g = new jz(this);
            } else {
                this.f = new jz(this);
                this.g = new ka(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec A[SYNTHETIC] */
    private final void ar(kt ktVar, defpackage.zvh zvhVar) {
        int iAw;
        android.view.View viewAE;
        int i;
        int iAw2;
        int i2;
        android.view.View viewAE2;
        int i3;
        if (zvhVar.j) {
            if (zvhVar.i == -1) {
                if (zvhVar.f < 0 || (iAw2 = aw()) == 0 || (viewAE2 = aE((i2 = iAw2 - 1))) == null || (i3 = this.e.b[bl(viewAE2)]) == -1) {
                    return;
                }
                defpackage.zvd zvdVar = (defpackage.zvd) this.d.get(i3);
                for (int i4 = i2; i4 >= 0; i4--) {
                    android.view.View viewAE3 = aE(i4);
                    if (viewAE3 != null) {
                        int i5 = zvhVar.f;
                        if (!K() && this.c) {
                            if (this.f.a(viewAE3) > i5) {
                                break;
                            }
                            if (zvdVar.o != bl(viewAE3)) {
                                continue;
                            } else if (i3 <= 0) {
                                iAw2 = i4;
                                break;
                            } else {
                                i3 += zvhVar.i;
                                zvdVar = (defpackage.zvd) this.d.get(i3);
                                iAw2 = i4;
                            }
                        } else {
                            if (this.f.d(viewAE3) < this.f.e() - i5) {
                                break;
                            }
                            if (zvdVar.o != bl(viewAE3)) {
                                continue;
                            } else if (i3 <= 0) {
                                iAw2 = i4;
                                break;
                            } else {
                                i3 += zvhVar.i;
                                zvdVar = (defpackage.zvd) this.d.get(i3);
                                iAw2 = i4;
                            }
                        }
                    }
                }
                au(ktVar, iAw2, i2);
                return;
            }
            if (zvhVar.f < 0 || (iAw = aw()) == 0 || (viewAE = aE(0)) == null || (i = this.e.b[bl(viewAE)]) == -1) {
                return;
            }
            defpackage.zvd zvdVar2 = (defpackage.zvd) this.d.get(i);
            int i6 = -1;
            int i7 = 0;
            while (i7 < iAw) {
                android.view.View viewAE4 = aE(i7);
                if (viewAE4 != null) {
                    int i8 = zvhVar.f;
                    if (K() || !this.c) {
                        if (this.f.a(viewAE4) > i8) {
                            break;
                        }
                        if (zvdVar2.p != bl(viewAE4)) {
                            continue;
                        } else if (i < this.d.size() - 1) {
                            i += zvhVar.i;
                            zvdVar2 = (defpackage.zvd) this.d.get(i);
                            i6 = i7;
                        }
                        au(ktVar, 0, i7);
                    }
                    if (this.f.e() - this.f.d(viewAE4) > i8) {
                        break;
                    }
                    if (zvdVar2.p != bl(viewAE4)) {
                        continue;
                    } else if (i < this.d.size() - 1) {
                        i += zvhVar.i;
                        zvdVar2 = (defpackage.zvd) this.d.get(i);
                        i6 = i7;
                    }
                    au(ktVar, 0, i7);
                }
                i7++;
            }
            i7 = i6;
            au(ktVar, 0, i7);
        }
    }

    private final void au(kt ktVar, int i, int i2) {
        while (i2 >= i) {
            aU(i2, ktVar);
            i2--;
        }
    }

    private final void bA() {
        int i = K() ? ((kp) this).B : ((kp) this).A;
        defpackage.zvh zvhVar = this.n;
        boolean z = true;
        if (i != 0 && i != Integer.MIN_VALUE) {
            z = false;
        }
        zvhVar.b = z;
    }

    private final void bB(int i) {
        if (i < L()) {
            int iAw = aw();
            defpackage.zvf zvfVar = this.e;
            zvfVar.f(iAw);
            zvfVar.g(iAw);
            zvfVar.e(iAw);
            if (i < zvfVar.b.length) {
                this.M = i;
                android.view.View viewAE = aE(0);
                if (viewAE != null) {
                    this.q = bl(viewAE);
                    if (K() || !this.c) {
                        this.G = this.f.d(viewAE) - this.f.j();
                    } else {
                        this.G = this.f.a(viewAE) + this.f.g();
                    }
                }
            }
        }
    }

    private final void bC(defpackage.zvg zvgVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            bA();
        } else {
            this.n.b = false;
        }
        if (K() || !this.c) {
            this.n.a = this.f.f() - zvgVar.c;
        } else {
            this.n.a = zvgVar.c - getPaddingRight();
        }
        defpackage.zvh zvhVar = this.n;
        zvhVar.d = zvgVar.a;
        zvhVar.h = 1;
        defpackage.zvh zvhVar2 = this.n;
        zvhVar2.i = 1;
        zvhVar2.e = zvgVar.c;
        zvhVar2.f = Integer.MIN_VALUE;
        zvhVar2.c = zvgVar.b;
        if (!z || this.d.size() <= 1 || (i = zvgVar.b) < 0 || i >= this.d.size() - 1) {
            return;
        }
        defpackage.zvd zvdVar = (defpackage.zvd) this.d.get(zvgVar.b);
        defpackage.zvh zvhVar3 = this.n;
        zvhVar3.c++;
        zvhVar3.d += zvdVar.h;
    }

    private final void bD(defpackage.zvg zvgVar, boolean z, boolean z2) {
        if (z2) {
            bA();
        } else {
            this.n.b = false;
        }
        if (K() || !this.c) {
            this.n.a = zvgVar.c - this.f.j();
        } else {
            this.n.a = (this.L.getWidth() - zvgVar.c) - this.f.j();
        }
        defpackage.zvh zvhVar = this.n;
        zvhVar.d = zvgVar.a;
        zvhVar.h = 1;
        defpackage.zvh zvhVar2 = this.n;
        zvhVar2.i = -1;
        zvhVar2.e = zvgVar.c;
        zvhVar2.f = Integer.MIN_VALUE;
        zvhVar2.c = zvgVar.b;
        if (!z || zvgVar.b <= 0) {
            return;
        }
        int size = this.d.size();
        int i = zvgVar.b;
        if (size > i) {
            defpackage.zvd zvdVar = (defpackage.zvd) this.d.get(i);
            defpackage.zvh zvhVar3 = this.n;
            zvhVar3.c--;
            zvhVar3.d -= zvdVar.h;
        }
    }

    private final boolean bE(android.view.View view, int i, int i2, kq kqVar) {
        return (!view.isLayoutRequested() && ((kp) this).w && afsq.bI(view.getWidth(), i, kqVar.width) && afsq.bI(view.getHeight(), i2, kqVar.height)) ? false : true;
    }

    private final android.view.View bF(int i, int i2) {
        int i3 = i;
        while (i3 != i2) {
            android.view.View viewAE = aE(i3);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = ((kp) this).C - getPaddingRight();
            int paddingBottom = ((kp) this).D - getPaddingBottom();
            int iBx = bx(viewAE) - viewAE.getLayoutParams().leftMargin;
            int iBz = bz(viewAE) - viewAE.getLayoutParams().topMargin;
            int iBy = by(viewAE) + viewAE.getLayoutParams().rightMargin;
            int iBw = bw(viewAE) + viewAE.getLayoutParams().bottomMargin;
            int i4 = 1;
            boolean z = iBx >= paddingRight || iBy >= paddingLeft;
            boolean z2 = iBz >= paddingBottom || iBw >= paddingTop;
            if (z && z2) {
                return viewAE;
            }
            if (i2 <= i) {
                i4 = -1;
            }
            i3 += i4;
        }
        return null;
    }

    public final void A(int i, int i2) {
        bB(java.lang.Math.min(i, i2));
    }

    public final void B(int i, int i2) {
        bB(i);
    }

    public final void C(int i, int i2) {
        bs(i);
        bB(i);
    }

    public final int D(la laVar) {
        return N(laVar);
    }

    public final int E(la laVar) {
        return O(laVar);
    }

    public final int F(la laVar) {
        return R(laVar);
    }

    public final int G(la laVar) {
        return N(laVar);
    }

    public final int H(la laVar) {
        return O(laVar);
    }

    public final int I(la laVar) {
        return R(laVar);
    }

    @Override // defpackage.zvc
    public final void J(int i, android.view.View view) {
        this.J.put(i, view);
    }

    @Override // defpackage.zvc
    public final boolean K() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public final int L() {
        android.view.View viewBF = bF(aw() - 1, -1);
        if (viewBF != null) {
            return bl(viewBF);
        }
        return -1;
    }

    public final void M(int i) {
        if (this.a != i) {
            aQ();
            this.a = i;
            this.f = null;
            this.g = null;
            ak();
            aW();
        }
    }

    public final android.graphics.PointF P(int i) {
        android.view.View viewAE;
        if (aw() == 0 || (viewAE = aE(0)) == null) {
            return null;
        }
        float f = i < bl(viewAE) ? -1 : 1;
        return K() ? new android.graphics.PointF(0.0f, f) : new android.graphics.PointF(f, 0.0f);
    }

    public final android.os.Parcelable Q() {
        com.google.android.flexbox.FlexboxLayoutManager.SavedState savedState = this.p;
        if (savedState != null) {
            return new com.google.android.flexbox.FlexboxLayoutManager.SavedState(savedState);
        }
        com.google.android.flexbox.FlexboxLayoutManager.SavedState savedState2 = new com.google.android.flexbox.FlexboxLayoutManager.SavedState();
        if (aw() > 0) {
            android.view.View viewAE = aE(0);
            savedState2.a = bl(viewAE);
            savedState2.b = this.f.d(viewAE) - this.f.j();
        } else {
            savedState2.a();
        }
        return savedState2;
    }

    @Override // defpackage.zvc
    public final int a() {
        return 5;
    }

    public final void aN(android.support.v7.widget.RecyclerView recyclerView) {
        this.L = (android.view.View) recyclerView.getParent();
    }

    public final void ac(android.os.Parcelable parcelable) {
        if (parcelable instanceof com.google.android.flexbox.FlexboxLayoutManager.SavedState) {
            this.p = (com.google.android.flexbox.FlexboxLayoutManager.SavedState) parcelable;
            aW();
        }
    }

    public final void ae(int i) {
        this.q = i;
        this.G = Integer.MIN_VALUE;
        com.google.android.flexbox.FlexboxLayoutManager.SavedState savedState = this.p;
        if (savedState != null) {
            savedState.a();
        }
        aW();
    }

    public final boolean ah() {
        if (this.b == 0) {
            return K();
        }
        if (K()) {
            int i = ((kp) this).C;
            android.view.View view = this.L;
            if (i <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    public final boolean ai() {
        if (this.b == 0) {
            if (!K()) {
                return true;
            }
        } else {
            if (K()) {
                return true;
            }
            int i = ((kp) this).D;
            android.view.View view = this.L;
            if (i > (view != null ? view.getHeight() : 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean aj() {
        return true;
    }

    public final void at(android.support.v7.widget.RecyclerView recyclerView, int i) {
        kz kzVar = new kz(recyclerView.getContext());
        kzVar.a = i;
        bd(kzVar);
    }

    @Override // defpackage.zvc
    public final int b() {
        return this.i;
    }

    public final void br() {
        aQ();
    }

    public final void bs(int i) {
        bB(i);
    }

    @Override // defpackage.zvc
    public final int c(int i, int i2, int i3) {
        return ax(((kp) this).D, ((kp) this).B, i2, i3, ai());
    }

    public final int d(int i, kt ktVar, la laVar) {
        if (!K() || this.b == 0) {
            int iW = W(i, ktVar, laVar);
            this.J.clear();
            return iW;
        }
        int iY = Y(i);
        this.o.d += iY;
        this.g.n(-iY);
        return iY;
    }

    public final int e(int i, kt ktVar, la laVar) {
        if (K() || (this.b == 0 && !K())) {
            int iW = W(i, ktVar, laVar);
            this.J.clear();
            return iW;
        }
        int iY = Y(i);
        this.o.d += iY;
        this.g.n(-iY);
        return iY;
    }

    public final kq f() {
        return new com.google.android.flexbox.FlexboxLayoutManager.LayoutParams();
    }

    @Override // defpackage.zvc
    public final int g(int i, int i2, int i3) {
        return ax(((kp) this).C, ((kp) this).A, i2, i3, ah());
    }

    public final kq h(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.google.android.flexbox.FlexboxLayoutManager.LayoutParams(context, attributeSet);
    }

    @Override // defpackage.zvc
    public final int i(android.view.View view) {
        int iBk;
        int iBm;
        if (K()) {
            iBk = bn(view);
            iBm = bh(view);
        } else {
            iBk = bk(view);
            iBm = bm(view);
        }
        return iBk + iBm;
    }

    @Override // defpackage.zvc
    public final int j(android.view.View view, int i, int i2) {
        int iBn;
        int iBh;
        if (K()) {
            iBn = bk(view);
            iBh = bm(view);
        } else {
            iBn = bn(view);
            iBh = bh(view);
        }
        return iBn + iBh;
    }

    @Override // defpackage.zvc
    public final int k() {
        return this.a;
    }

    @Override // defpackage.zvc
    public final int l() {
        return this.m.a();
    }

    @Override // defpackage.zvc
    public final int m() {
        return this.b;
    }

    @Override // defpackage.zvc
    public final int n() {
        if (this.d.size() == 0) {
            return 0;
        }
        int size = this.d.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = java.lang.Math.max(iMax, ((defpackage.zvd) this.d.get(i)).e);
        }
        return iMax;
    }

    @Override // defpackage.zvc
    public final int o() {
        return this.j;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:173:0x033d  */
    /* JADX WARN: Code duplicated, block: B:174:0x034c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0360  */
    /* JADX WARN: Code duplicated, block: B:179:0x0364  */
    /* JADX WARN: Code duplicated, block: B:180:0x036d  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX WARN: Code duplicated, block: B:83:0x0164  */
    /* JADX WARN: Code duplicated, block: B:85:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x0171  */
    /* JADX WARN: Code duplicated, block: B:88:0x017b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0181  */
    /* JADX WARN: Code duplicated, block: B:91:0x0184  */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.List] */
    public final void p(kt ktVar, la laVar) {
        boolean z;
        android.view.View viewZ;
        com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager;
        kb kbVar;
        int iBl;
        int i;
        int size;
        int i2;
        int i3;
        android.view.View viewAE;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        defpackage.zvh zvhVar;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        this.l = ktVar;
        this.m = laVar;
        int iA = laVar.a();
        if (iA == 0) {
            if (laVar.g) {
                return;
            } else {
                iA = 0;
            }
        }
        int iAz = az();
        int i12 = this.a;
        if (i12 == 0) {
            if (iAz == 1) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
            this.k = false;
        } else if (i12 == 1) {
            if (iAz != 1) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
            this.k = false;
        } else if (i12 != 2) {
            this.c = iAz == 1;
            this.k = true;
        } else {
            if (iAz == 1) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
            this.k = false;
        }
        aq();
        am();
        defpackage.zvf zvfVar = this.e;
        zvfVar.f(iA);
        zvfVar.g(iA);
        zvfVar.e(iA);
        this.n.j = false;
        com.google.android.flexbox.FlexboxLayoutManager.SavedState savedState = this.p;
        if (savedState != null && savedState.b(iA)) {
            this.q = savedState.a;
        }
        defpackage.zvg zvgVar = this.o;
        if (!zvgVar.f || this.q != -1 || savedState != null) {
            zvgVar.b();
            com.google.android.flexbox.FlexboxLayoutManager.SavedState savedState2 = this.p;
            if (laVar.g || (i3 = this.q) == -1) {
                if (aw() == 0) {
                    zvgVar.a();
                    zvgVar.a = 0;
                    zvgVar.b = 0;
                } else {
                    if (zvgVar.e) {
                        viewZ = ad(laVar.a());
                    } else {
                        viewZ = Z(laVar.a());
                    }
                    if (viewZ != null) {
                        flexboxLayoutManager = zvgVar.h;
                        if (flexboxLayoutManager.b == 0) {
                            kbVar = flexboxLayoutManager.g;
                        } else {
                            kbVar = flexboxLayoutManager.f;
                        }
                        if (flexboxLayoutManager.K() && flexboxLayoutManager.c) {
                            if (zvgVar.e) {
                                zvgVar.c = kbVar.d(viewZ) + kbVar.o();
                            } else {
                                zvgVar.c = kbVar.a(viewZ);
                            }
                        } else if (zvgVar.e) {
                            zvgVar.c = kbVar.a(viewZ) + kbVar.o();
                        } else {
                            zvgVar.c = kbVar.d(viewZ);
                        }
                        iBl = bl(viewZ);
                        zvgVar.a = iBl;
                        zvgVar.g = false;
                        defpackage.zvf zvfVar2 = flexboxLayoutManager.e;
                        if (iBl == -1) {
                            iBl = 0;
                        }
                        i = zvfVar2.b[iBl];
                        if (i == -1) {
                            i = 0;
                        }
                        zvgVar.b = i;
                        size = flexboxLayoutManager.d.size();
                        i2 = zvgVar.b;
                        if (size > i2) {
                            zvgVar.a = ((defpackage.zvd) flexboxLayoutManager.d.get(i2)).o;
                        }
                        boolean z4 = laVar.g;
                    } else {
                        zvgVar.a();
                        zvgVar.a = 0;
                        zvgVar.b = 0;
                    }
                }
            } else if (i3 < 0 || i3 >= laVar.a()) {
                this.q = -1;
                this.G = Integer.MIN_VALUE;
                if (aw() == 0) {
                    zvgVar.a();
                    zvgVar.a = 0;
                    zvgVar.b = 0;
                } else {
                    if (zvgVar.e) {
                        viewZ = ad(laVar.a());
                    } else {
                        viewZ = Z(laVar.a());
                    }
                    if (viewZ != null) {
                        flexboxLayoutManager = zvgVar.h;
                        if (flexboxLayoutManager.b == 0) {
                            kbVar = flexboxLayoutManager.g;
                        } else {
                            kbVar = flexboxLayoutManager.f;
                        }
                        if (flexboxLayoutManager.K()) {
                            if (zvgVar.e) {
                                zvgVar.c = kbVar.a(viewZ) + kbVar.o();
                            } else {
                                zvgVar.c = kbVar.d(viewZ);
                            }
                        } else if (zvgVar.e) {
                            zvgVar.c = kbVar.a(viewZ) + kbVar.o();
                        } else {
                            zvgVar.c = kbVar.d(viewZ);
                        }
                        iBl = bl(viewZ);
                        zvgVar.a = iBl;
                        zvgVar.g = false;
                        defpackage.zvf zvfVar3 = flexboxLayoutManager.e;
                        if (iBl == -1) {
                            iBl = 0;
                        }
                        i = zvfVar3.b[iBl];
                        if (i == -1) {
                            i = 0;
                        }
                        zvgVar.b = i;
                        size = flexboxLayoutManager.d.size();
                        i2 = zvgVar.b;
                        if (size > i2) {
                            zvgVar.a = ((defpackage.zvd) flexboxLayoutManager.d.get(i2)).o;
                        }
                        boolean z5 = laVar.g;
                    } else {
                        zvgVar.a();
                        zvgVar.a = 0;
                        zvgVar.b = 0;
                    }
                }
            } else {
                int i13 = this.q;
                zvgVar.a = i13;
                zvgVar.b = zvfVar.b[i13];
                com.google.android.flexbox.FlexboxLayoutManager.SavedState savedState3 = this.p;
                if (savedState3 == null || !savedState3.b(laVar.a())) {
                    int i14 = this.G;
                    if (i14 == Integer.MIN_VALUE) {
                        android.view.View viewV = V(this.q);
                        if (viewV == null) {
                            if (aw() > 0 && (viewAE = aE(0)) != null) {
                                zvgVar.e = this.q < bl(viewAE);
                            }
                            zvgVar.a();
                        } else if (this.f.b(viewV) > this.f.k()) {
                            zvgVar.a();
                        } else {
                            int iD = this.f.d(viewV) - this.f.j();
                            kb kbVar2 = this.f;
                            if (iD < 0) {
                                zvgVar.c = kbVar2.j();
                                zvgVar.e = false;
                            } else if (kbVar2.f() - this.f.a(viewV) < 0) {
                                zvgVar.c = this.f.f();
                                zvgVar.e = true;
                            } else {
                                boolean z6 = zvgVar.e;
                                kb kbVar3 = this.f;
                                zvgVar.c = z6 ? kbVar3.a(viewV) + this.f.o() : kbVar3.d(viewV);
                            }
                        }
                    } else if (K() || !this.c) {
                        zvgVar.c = this.f.j() + this.G;
                    } else {
                        zvgVar.c = i14 - this.f.g();
                    }
                } else {
                    zvgVar.c = this.f.j() + savedState2.b;
                    zvgVar.g = true;
                    zvgVar.b = -1;
                }
            }
            zvgVar.f = true;
        }
        aI(ktVar);
        if (zvgVar.e) {
            bD(zvgVar, false, true);
        } else {
            bC(zvgVar, false, true);
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(((kp) this).C, ((kp) this).A);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(((kp) this).D, ((kp) this).B);
        int i15 = ((kp) this).C;
        int i16 = ((kp) this).D;
        if (K()) {
            int i17 = this.H;
            z2 = (i17 == Integer.MIN_VALUE || i17 == i15) ? false : true;
            defpackage.zvh zvhVar2 = this.n;
            i4 = zvhVar2.b ? this.K.getResources().getDisplayMetrics().heightPixels : zvhVar2.a;
        } else {
            int i18 = this.I;
            z2 = (i18 == Integer.MIN_VALUE || i18 == i16) ? false : true;
            defpackage.zvh zvhVar3 = this.n;
            i4 = zvhVar3.b ? this.K.getResources().getDisplayMetrics().widthPixels : zvhVar3.a;
        }
        this.H = i15;
        this.I = i16;
        int i19 = this.M;
        if (i19 == -1) {
            if (this.q == -1 && !z2) {
                i5 = -1;
            } else if (!zvgVar.e) {
                this.d.clear();
                aizg aizgVar = this.N;
                aizgVar.h();
                if (K()) {
                    i11 = iMakeMeasureSpec;
                    zvfVar.n(aizgVar, i11, iMakeMeasureSpec2, i4, 0, zvgVar.a, this.d);
                    i10 = iMakeMeasureSpec2;
                } else {
                    zvfVar.n(aizgVar, iMakeMeasureSpec2, iMakeMeasureSpec, i4, 0, zvgVar.a, this.d);
                    i10 = iMakeMeasureSpec2;
                    i11 = iMakeMeasureSpec;
                }
                this.d = aizgVar.b;
                zvfVar.d(i11, i10, 0);
                zvfVar.j(0);
                int i20 = zvfVar.b[zvgVar.a];
                zvgVar.b = i20;
                this.n.c = i20;
            }
            S(ktVar, laVar, this.n);
            z3 = zvgVar.e;
            zvhVar = this.n;
            if (z3) {
                i7 = zvhVar.e;
                bC(zvgVar, true, false);
                S(ktVar, laVar, this.n);
                i6 = this.n.e;
            } else {
                i6 = zvhVar.e;
                bD(zvgVar, true, false);
                S(ktVar, laVar, this.n);
                i7 = this.n.e;
            }
            if (aw() > 0) {
                if (zvgVar.e) {
                    U(i7 + T(i6, ktVar, laVar, true), ktVar, laVar, false);
                } else {
                    T(i6 + U(i7, ktVar, laVar, true), ktVar, laVar, false);
                }
            }
        }
        i5 = i19;
        int i21 = i4;
        int iMin = i5 != -1 ? java.lang.Math.min(i5, zvgVar.a) : zvgVar.a;
        aizg aizgVar2 = this.N;
        aizgVar2.h();
        boolean zK = K();
        java.util.List list = this.d;
        if (!zK) {
            i8 = iMin;
            if (list.size() > 0) {
                zvfVar.b(this.d, i8);
                iMin = i8;
                zvfVar.n(aizgVar2, iMakeMeasureSpec2, iMakeMeasureSpec, i21, iMin, zvgVar.a, this.d);
                i9 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                i8 = iMin;
            } else {
                zvfVar.e(iA);
                zvfVar.n(aizgVar2, iMakeMeasureSpec2, iMakeMeasureSpec, i21, 0, -1, this.d);
                i9 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
        } else if (list.size() > 0) {
            zvfVar.b(this.d, iMin);
            i9 = iMakeMeasureSpec2;
            zvfVar.n(aizgVar2, iMakeMeasureSpec, i9, i21, iMin, zvgVar.a, this.d);
            i8 = iMin;
        } else {
            i9 = iMakeMeasureSpec2;
            i8 = iMin;
            zvfVar.e(iA);
            zvfVar.n(aizgVar2, iMakeMeasureSpec, i9, i21, 0, -1, this.d);
        }
        this.d = aizgVar2.b;
        zvfVar.d(iMakeMeasureSpec, i9, i8);
        zvfVar.j(i8);
        S(ktVar, laVar, this.n);
        z3 = zvgVar.e;
        zvhVar = this.n;
        if (z3) {
            i7 = zvhVar.e;
            bC(zvgVar, true, false);
            S(ktVar, laVar, this.n);
            i6 = this.n.e;
        } else {
            i6 = zvhVar.e;
            bD(zvgVar, true, false);
            S(ktVar, laVar, this.n);
            i7 = this.n.e;
        }
        if (aw() > 0) {
            if (zvgVar.e) {
                U(i7 + T(i6, ktVar, laVar, true), ktVar, laVar, false);
            } else {
                T(i6 + U(i7, ktVar, laVar, true), ktVar, laVar, false);
            }
        }
    }

    public final void q(la laVar) {
        this.p = null;
        this.q = -1;
        this.G = Integer.MIN_VALUE;
        this.M = -1;
        this.o.b();
        this.J.clear();
    }

    @Override // defpackage.zvc
    public final int r() {
        int size = this.d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((defpackage.zvd) this.d.get(i2)).g;
        }
        return i;
    }

    @Override // defpackage.zvc
    public final android.view.View s(int i) {
        android.view.View view = (android.view.View) this.J.get(i);
        return view == null ? this.l.n(i) : view;
    }

    @Override // defpackage.zvc
    public final android.view.View t(int i) {
        return s(i);
    }

    public final boolean u(kq kqVar) {
        return kqVar instanceof com.google.android.flexbox.FlexboxLayoutManager.LayoutParams;
    }

    @Override // defpackage.zvc
    public final java.util.List v() {
        return this.d;
    }

    @Override // defpackage.zvc
    public final void w(android.view.View view, int i, int i2, defpackage.zvd zvdVar) {
        aH(view, h);
        if (K()) {
            int iBk = bk(view) + bm(view);
            zvdVar.e += iBk;
            zvdVar.f += iBk;
        } else {
            int iBn = bn(view) + bh(view);
            zvdVar.e += iBn;
            zvdVar.f += iBn;
        }
    }

    public final void y(int i, int i2) {
        bB(i);
    }

    @Override // defpackage.zvc
    public final void z(java.util.List list) {
        this.d = list;
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkh(1);
        public int a;
        public int b;

        public SavedState(android.os.Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }

        public final void a() {
            this.a = -1;
        }

        public final boolean b(int i) {
            int i2 = this.a;
            return i2 >= 0 && i2 < i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final java.lang.String toString() {
            return "SavedState{mAnchorPosition=" + this.a + ", mAnchorOffset=" + this.b + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        public SavedState(com.google.android.flexbox.FlexboxLayoutManager.SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
        }

        public SavedState() {
        }
    }

    public final void as(android.support.v7.widget.RecyclerView recyclerView) {
    }

    @Override // defpackage.zvc
    public final void x(defpackage.zvd zvdVar) {
    }

    /* JADX INFO: compiled from: PG */
    public class LayoutParams extends kq implements com.google.android.flexbox.FlexItem {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkg(20);
        private float a;
        private float b;
        private int g;
        private float h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;

        public LayoutParams(android.os.Parcel parcel) {
            super(-2, -2);
            this.a = 0.0f;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
            this.a = parcel.readFloat();
            this.b = parcel.readFloat();
            this.g = parcel.readInt();
            this.h = parcel.readFloat();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float a() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float b() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float c() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int d() {
            return this.g;
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
            return this.l;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k() {
            return this.k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int l() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int m() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void p(int i) {
            this.j = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void q(int i) {
            this.i = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean r() {
            return this.m;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeInt(this.g);
            parcel.writeFloat(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0.0f;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
        }

        public LayoutParams() {
            super(-2, -2);
            this.a = 0.0f;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
        }
    }
}
