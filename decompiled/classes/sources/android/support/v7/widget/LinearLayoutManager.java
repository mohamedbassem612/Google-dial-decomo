package android.support.v7.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class LinearLayoutManager extends defpackage.kp implements defpackage.ky {
    private defpackage.js a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final boolean e;
    private final defpackage.jr f;
    private final int g;
    private final int[] h;
    int k;
    defpackage.kb l;
    boolean m;
    int n;
    int o;
    android.support.v7.widget.LinearLayoutManager.SavedState p;
    final defpackage.jq q;

    public LinearLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new defpackage.jq();
        this.f = new defpackage.jr();
        this.g = 2;
        this.h = new int[2];
        ko koVarAC = aC(context, attributeSet, i, i2);
        af(koVarAC.a);
        ag(koVarAC.c);
        t(koVarAC.d);
    }

    private final int bA(defpackage.la laVar) {
        if (aw() == 0) {
            return 0;
        }
        Z();
        defpackage.kb kbVar = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return li.f(laVar, kbVar, ar(z2), aq(z2), this, z);
    }

    private final int bB(int i, defpackage.kt ktVar, defpackage.la laVar, boolean z) {
        int iF;
        int iF2 = this.l.f() - i;
        if (iF2 <= 0) {
            return 0;
        }
        int i2 = -O(-iF2, ktVar, laVar);
        int i3 = i + i2;
        if (!z || (iF = this.l.f() - i3) <= 0) {
            return i2;
        }
        this.l.n(iF);
        return i2 + iF;
    }

    private final int bC(int i, defpackage.kt ktVar, defpackage.la laVar, boolean z) {
        int iJ;
        int iJ2 = i - this.l.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i2 = -O(iJ2, ktVar, laVar);
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.l.j()) <= 0) {
            return i2;
        }
        this.l.n(-iJ);
        return i2 - iJ;
    }

    private final android.view.View bD() {
        return T(0, aw());
    }

    private final android.view.View bE() {
        return T(aw() - 1, -1);
    }

    private final android.view.View bF() {
        return aE(this.m ? 0 : aw() - 1);
    }

    private final android.view.View bG() {
        return aE(this.m ? aw() - 1 : 0);
    }

    private final void bH(defpackage.kt ktVar, defpackage.js jsVar) {
        if (!jsVar.a || jsVar.m) {
            return;
        }
        int i = jsVar.g;
        int i2 = jsVar.i;
        if (jsVar.f == -1) {
            int iAw = aw();
            if (i >= 0) {
                int iE = (this.l.e() - i) + i2;
                if (this.m) {
                    for (int i3 = 0; i3 < iAw; i3++) {
                        android.view.View viewAE = aE(i3);
                        if (this.l.d(viewAE) < iE || this.l.m(viewAE) < iE) {
                            bI(ktVar, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = iAw - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    android.view.View viewAE2 = aE(i5);
                    if (this.l.d(viewAE2) < iE || this.l.m(viewAE2) < iE) {
                        bI(ktVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int iAw2 = aw();
            if (!this.m) {
                for (int i7 = 0; i7 < iAw2; i7++) {
                    android.view.View viewAE3 = aE(i7);
                    if (this.l.a(viewAE3) > i6 || this.l.l(viewAE3) > i6) {
                        bI(ktVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = iAw2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                android.view.View viewAE4 = aE(i9);
                if (this.l.a(viewAE4) > i6 || this.l.l(viewAE4) > i6) {
                    bI(ktVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bI(defpackage.kt ktVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aU(i, ktVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    aU(i2, ktVar);
                }
            }
        }
    }

    private final void bJ(int i, int i2, boolean z, defpackage.la laVar) {
        int iJ;
        this.a.m = am();
        this.a.f = i;
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        Y(laVar, iArr);
        int iMax = java.lang.Math.max(0, iArr[0]);
        int iMax2 = java.lang.Math.max(0, iArr[1]);
        int i3 = i == 1 ? iMax2 : iMax;
        defpackage.js jsVar = this.a;
        jsVar.h = i3;
        if (i != 1) {
            iMax = iMax2;
        }
        jsVar.i = iMax;
        if (i == 1) {
            jsVar.h = i3 + this.l.g();
            android.view.View viewBF = bF();
            defpackage.js jsVar2 = this.a;
            jsVar2.e = true == this.m ? -1 : 1;
            int iEA = ((defpackage.kq) viewBF.getLayoutParams()).eA();
            defpackage.js jsVar3 = this.a;
            jsVar2.d = iEA + jsVar3.e;
            jsVar3.b = this.l.a(viewBF);
            iJ = this.l.a(viewBF) - this.l.f();
        } else {
            android.view.View viewBG = bG();
            this.a.h += this.l.j();
            defpackage.js jsVar4 = this.a;
            jsVar4.e = true != this.m ? -1 : 1;
            int iEA2 = ((defpackage.kq) viewBG.getLayoutParams()).eA();
            defpackage.js jsVar5 = this.a;
            jsVar4.d = iEA2 + jsVar5.e;
            jsVar5.b = this.l.d(viewBG);
            iJ = (-this.l.d(viewBG)) + this.l.j();
        }
        defpackage.js jsVar6 = this.a;
        jsVar6.c = i2;
        if (z) {
            jsVar6.c = i2 - iJ;
        }
        jsVar6.g = iJ;
    }

    private final void bK(defpackage.jq jqVar) {
        bL(jqVar.b, jqVar.c);
    }

    private final void bL(int i, int i2) {
        this.a.c = this.l.f() - i2;
        defpackage.js jsVar = this.a;
        jsVar.e = true != this.m ? 1 : -1;
        jsVar.d = i;
        jsVar.f = 1;
        jsVar.b = i2;
        jsVar.g = Integer.MIN_VALUE;
    }

    private final void bM(defpackage.jq jqVar) {
        bN(jqVar.b, jqVar.c);
    }

    private final void bN(int i, int i2) {
        this.a.c = i2 - this.l.j();
        defpackage.js jsVar = this.a;
        jsVar.d = i;
        jsVar.e = true != this.m ? -1 : 1;
        jsVar.f = -1;
        jsVar.b = i2;
        jsVar.g = Integer.MIN_VALUE;
    }

    private final int c(defpackage.la laVar) {
        if (aw() == 0) {
            return 0;
        }
        Z();
        defpackage.kb kbVar = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return li.d(laVar, kbVar, ar(z2), aq(z2), this, z);
    }

    private final int s(defpackage.la laVar) {
        if (aw() == 0) {
            return 0;
        }
        Z();
        defpackage.kb kbVar = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return li.e(laVar, kbVar, ar(z2), aq(z2), this, z, this.m);
    }

    @Override // defpackage.kp
    public final int D(defpackage.la laVar) {
        return c(laVar);
    }

    @Override // defpackage.kp
    public final int E(defpackage.la laVar) {
        return s(laVar);
    }

    @Override // defpackage.kp
    public final int F(defpackage.la laVar) {
        return bA(laVar);
    }

    @Override // defpackage.kp
    public final int G(defpackage.la laVar) {
        return c(laVar);
    }

    @Override // defpackage.kp
    public final int H(defpackage.la laVar) {
        return s(laVar);
    }

    @Override // defpackage.kp
    public final int I(defpackage.la laVar) {
        return bA(laVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        if (r5.k == 1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int J(int r6) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            if (r6 == r1) goto L32
            r2 = 2
            if (r6 == r2) goto L27
            r2 = 17
            r3 = 0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r2) goto L20
            r2 = 33
            if (r6 == r2) goto L21
            r0 = 66
            if (r6 == r0) goto L1f
            r0 = 130(0x82, float:1.82E-43)
            if (r6 != r0) goto L25
            int r5 = r5.k
            if (r5 != r1) goto L25
            goto L3c
        L1f:
            r0 = r1
        L20:
            r1 = r3
        L21:
            int r5 = r5.k
            if (r5 == r1) goto L3d
        L25:
            r0 = r4
            goto L3d
        L27:
            int r6 = r5.k
            if (r6 == r1) goto L3c
            boolean r5 = r5.ak()
            if (r5 == 0) goto L3c
            goto L3d
        L32:
            int r6 = r5.k
            if (r6 == r1) goto L3d
            boolean r5 = r5.ak()
            if (r5 == 0) goto L3d
        L3c:
            r0 = r1
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.J(int):int");
    }

    final int K(defpackage.kt ktVar, defpackage.js jsVar, defpackage.la laVar, boolean z) {
        int i = jsVar.c;
        int i2 = jsVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                jsVar.g = i2 + i;
            }
            bH(ktVar, jsVar);
        }
        int i3 = jsVar.c + jsVar.h;
        defpackage.jr jrVar = this.f;
        while (true) {
            if ((!jsVar.m && i3 <= 0) || !jsVar.c(laVar)) {
                break;
            }
            jrVar.a = 0;
            jrVar.b = false;
            jrVar.c = false;
            jrVar.d = false;
            l(ktVar, laVar, jsVar, jrVar);
            if (!jrVar.b) {
                int i4 = jsVar.b;
                int i5 = jrVar.a;
                jsVar.b = i4 + (jsVar.f * i5);
                if (!jrVar.c || jsVar.l != null || !laVar.g) {
                    jsVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = jsVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    jsVar.g = i7;
                    int i8 = jsVar.c;
                    if (i8 < 0) {
                        jsVar.g = i7 + i8;
                    }
                    bH(ktVar, jsVar);
                }
                if (z && jrVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - jsVar.c;
    }

    public final int L() {
        android.view.View viewU = U(0, aw(), false, true);
        if (viewU == null) {
            return -1;
        }
        return bl(viewU);
    }

    public final int M() {
        android.view.View viewU = U(aw() - 1, -1, true, false);
        if (viewU != null) {
            return bl(viewU);
        }
        return -1;
    }

    public final int N() {
        android.view.View viewU = U(aw() - 1, -1, false, true);
        if (viewU != null) {
            return bl(viewU);
        }
        return -1;
    }

    final int O(int i, defpackage.kt ktVar, defpackage.la laVar) {
        if (aw() == 0 || i == 0) {
            return 0;
        }
        Z();
        this.a.a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = java.lang.Math.abs(i);
        bJ(i2, iAbs, true, laVar);
        defpackage.js jsVar = this.a;
        int iK = jsVar.g + K(ktVar, jsVar, laVar, false);
        if (iK < 0) {
            return 0;
        }
        if (iAbs > iK) {
            i = i2 * iK;
        }
        this.l.n(-i);
        this.a.k = i;
        return i;
    }

    @Override // defpackage.ky
    public final android.graphics.PointF P(int i) {
        if (aw() == 0) {
            return null;
        }
        float f = (i < bl(aE(0))) != this.m ? -1 : 1;
        return this.k == 0 ? new android.graphics.PointF(f, 0.0f) : new android.graphics.PointF(0.0f, f);
    }

    @Override // defpackage.kp
    public final android.os.Parcelable Q() {
        android.support.v7.widget.LinearLayoutManager.SavedState savedState = this.p;
        if (savedState != null) {
            return new android.support.v7.widget.LinearLayoutManager.SavedState(savedState);
        }
        android.support.v7.widget.LinearLayoutManager.SavedState savedState2 = new android.support.v7.widget.LinearLayoutManager.SavedState();
        if (aw() > 0) {
            Z();
            boolean z = this.b ^ this.m;
            savedState2.c = z;
            if (z) {
                android.view.View viewBF = bF();
                savedState2.b = this.l.f() - this.l.a(viewBF);
                savedState2.a = bl(viewBF);
            } else {
                android.view.View viewBG = bG();
                savedState2.a = bl(viewBG);
                savedState2.b = this.l.d(viewBG) - this.l.j();
            }
        } else {
            savedState2.a();
        }
        return savedState2;
    }

    final android.view.View R() {
        int i;
        int iAw;
        int iAw2;
        if (this.m) {
            iAw2 = aw();
            i = 1;
            iAw = 0;
        } else {
            i = -1;
            iAw = aw() - 1;
            iAw2 = -1;
        }
        while (iAw != iAw2) {
            android.view.View viewAE = aE(iAw);
            if (viewAE != null && viewAE.hasFocusable()) {
                return viewAE;
            }
            iAw += i;
        }
        return null;
    }

    final android.view.View S() {
        int iAw;
        int i;
        int iAw2;
        if (this.m) {
            iAw = -1;
            iAw2 = aw() - 1;
            i = -1;
        } else {
            iAw = aw();
            i = 1;
            iAw2 = 0;
        }
        while (iAw2 != iAw) {
            android.view.View viewAE = aE(iAw2);
            if (viewAE != null && viewAE.hasFocusable()) {
                return viewAE;
            }
            iAw2 += i;
        }
        return null;
    }

    final android.view.View T(int i, int i2) {
        int i3;
        int i4;
        Z();
        if (i2 <= i && i2 >= i) {
            return aE(i);
        }
        if (this.l.d(aE(i)) < this.l.j()) {
            i3 = 16388;
            i4 = 16644;
        } else {
            i3 = 4097;
            i4 = 4161;
        }
        return this.k == 0 ? this.E.q(i, i2, i4, i3) : this.F.q(i, i2, i4, i3);
    }

    final android.view.View U(int i, int i2, boolean z, boolean z2) {
        Z();
        int i3 = this.k;
        int i4 = true != z ? 320 : 24579;
        int i5 = true != z2 ? 0 : 320;
        return i3 == 0 ? this.E.q(i, i2, i4, i5) : this.F.q(i, i2, i4, i5);
    }

    @Override // defpackage.kp
    public final android.view.View V(int i) {
        int iAw = aw();
        if (iAw == 0) {
            return null;
        }
        int iBl = i - bl(aE(0));
        if (iBl >= 0 && iBl < iAw) {
            android.view.View viewAE = aE(iBl);
            if (bl(viewAE) == i) {
                return viewAE;
            }
        }
        return super.V(i);
    }

    public final android.view.View W(int i, defpackage.kt ktVar, defpackage.la laVar) {
        int iJ;
        android.view.View viewBD;
        ad();
        if (aw() == 0 || (iJ = J(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Z();
        bJ(iJ, (int) (this.l.k() * 0.33333334f), false, laVar);
        defpackage.js jsVar = this.a;
        jsVar.g = Integer.MIN_VALUE;
        jsVar.a = false;
        K(ktVar, jsVar, laVar, true);
        boolean z = this.m;
        if (iJ == -1) {
            viewBD = z ? bE() : bD();
            iJ = -1;
        } else {
            viewBD = z ? bD() : bE();
        }
        android.view.View viewBG = iJ == -1 ? bG() : bF();
        if (!viewBG.hasFocusable()) {
            return viewBD;
        }
        if (viewBD != null) {
            return viewBG;
        }
        return null;
    }

    @Override // defpackage.kp
    public final void X(java.lang.String str) {
        if (this.p == null) {
            super.X(str);
        }
    }

    protected final void Y(defpackage.la laVar, int[] iArr) {
        int iK = laVar.a != -1 ? this.l.k() : 0;
        int i = this.a.f;
        int i2 = i == -1 ? 0 : iK;
        if (i != -1) {
            iK = 0;
        }
        iArr[0] = iK;
        iArr[1] = i2;
    }

    final void Z() {
        if (this.a == null) {
            this.a = new defpackage.js();
        }
    }

    @Override // defpackage.kp
    public final void aa(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.aa(accessibilityEvent);
        if (aw() > 0) {
            accessibilityEvent.setFromIndex(L());
            accessibilityEvent.setToIndex(N());
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0202  */
    /* JADX WARN: Code duplicated, block: B:113:0x0209  */
    /* JADX WARN: Code duplicated, block: B:114:0x020f  */
    /* JADX WARN: Code duplicated, block: B:79:0x017a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0180  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v55 */
    public final void ab(defpackage.kt ktVar, defpackage.la laVar) {
        int iA;
        android.view.View viewAF;
        boolean z;
        boolean z2;
        android.view.View viewI;
        defpackage.kq kqVar;
        int i;
        int i2;
        int i3;
        ?? r7;
        int i4;
        int i5;
        int iBB;
        int i6;
        android.view.View viewV;
        int iD;
        int iF;
        int i7 = -1;
        if (!(this.p == null && this.n == -1) && laVar.a() == 0) {
            aR(ktVar);
            return;
        }
        android.support.v7.widget.LinearLayoutManager.SavedState savedState = this.p;
        if (savedState != null && savedState.b()) {
            this.n = savedState.a;
        }
        Z();
        boolean z3 = false;
        this.a.a = false;
        ad();
        android.view.View viewAF2 = aF();
        defpackage.jq jqVar = this.q;
        boolean z4 = true;
        if (!jqVar.e || this.n != -1 || this.p != null) {
            jqVar.d();
            jqVar.d = this.m ^ this.d;
            if (laVar.g || (i = this.n) == -1) {
                if (aw() == 0) {
                    jqVar.a();
                    if (this.d) {
                        iA = laVar.a() - 1;
                    } else {
                        iA = 0;
                    }
                    jqVar.b = iA;
                } else {
                    viewAF = aF();
                    if (viewAF != null) {
                        kqVar = (defpackage.kq) viewAF.getLayoutParams();
                        if (!kqVar.eC() || kqVar.eA() < 0 || kqVar.eA() >= laVar.a()) {
                            z = this.b;
                            z2 = this.d;
                            if (z == z2 || (viewI = i(ktVar, laVar, jqVar.d, z2)) == null) {
                                jqVar.a();
                                if (this.d) {
                                    iA = laVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                jqVar.b = iA;
                            } else {
                                jqVar.b(viewI, ((defpackage.kq) viewI.getLayoutParams()).eA());
                                if (!laVar.g && eM()) {
                                    int iD2 = this.l.d(viewI);
                                    int iA2 = this.l.a(viewI);
                                    int iJ = this.l.j();
                                    int iF2 = this.l.f();
                                    boolean z5 = iA2 <= iJ && iD2 < iJ;
                                    boolean z6 = iD2 >= iF2 && iA2 > iF2;
                                    if (z5 || z6) {
                                        if (true == jqVar.d) {
                                            iJ = iF2;
                                        }
                                        jqVar.c = iJ;
                                    }
                                }
                            }
                        } else {
                            jqVar.c(viewAF, ((defpackage.kq) viewAF.getLayoutParams()).eA());
                        }
                    } else {
                        z = this.b;
                        z2 = this.d;
                        if (z == z2) {
                            jqVar.a();
                            if (this.d) {
                                iA = laVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            jqVar.b = iA;
                        } else {
                            jqVar.a();
                            if (this.d) {
                                iA = laVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            jqVar.b = iA;
                        }
                    }
                }
            } else if (i < 0 || i >= laVar.a()) {
                this.n = -1;
                this.o = Integer.MIN_VALUE;
                if (aw() == 0) {
                    jqVar.a();
                    if (this.d) {
                        iA = laVar.a() - 1;
                    } else {
                        iA = 0;
                    }
                    jqVar.b = iA;
                } else {
                    viewAF = aF();
                    if (viewAF != null) {
                        kqVar = (defpackage.kq) viewAF.getLayoutParams();
                        if (kqVar.eC()) {
                            z = this.b;
                            z2 = this.d;
                            if (z == z2) {
                                jqVar.a();
                                if (this.d) {
                                    iA = laVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                jqVar.b = iA;
                            } else {
                                jqVar.a();
                                if (this.d) {
                                    iA = laVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                jqVar.b = iA;
                            }
                        } else {
                            z = this.b;
                            z2 = this.d;
                            if (z == z2) {
                                jqVar.a();
                                if (this.d) {
                                    iA = laVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                jqVar.b = iA;
                            } else {
                                jqVar.a();
                                if (this.d) {
                                    iA = laVar.a() - 1;
                                } else {
                                    iA = 0;
                                }
                                jqVar.b = iA;
                            }
                        }
                    } else {
                        z = this.b;
                        z2 = this.d;
                        if (z == z2) {
                            jqVar.a();
                            if (this.d) {
                                iA = laVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            jqVar.b = iA;
                        } else {
                            jqVar.a();
                            if (this.d) {
                                iA = laVar.a() - 1;
                            } else {
                                iA = 0;
                            }
                            jqVar.b = iA;
                        }
                    }
                }
            } else {
                int i8 = this.n;
                jqVar.b = i8;
                android.support.v7.widget.LinearLayoutManager.SavedState savedState2 = this.p;
                if (savedState2 != null && savedState2.b()) {
                    boolean z7 = savedState2.c;
                    jqVar.d = z7;
                    defpackage.kb kbVar = this.l;
                    if (z7) {
                        jqVar.c = kbVar.f() - this.p.b;
                    } else {
                        jqVar.c = kbVar.j() + this.p.b;
                    }
                } else if (this.o == Integer.MIN_VALUE) {
                    android.view.View viewV2 = V(i8);
                    if (viewV2 == null) {
                        if (aw() > 0) {
                            jqVar.d = (this.n < ((defpackage.kq) aE(0).getLayoutParams()).eA()) == this.m;
                        }
                        jqVar.a();
                    } else if (this.l.b(viewV2) > this.l.k()) {
                        jqVar.a();
                    } else {
                        int iD3 = this.l.d(viewV2) - this.l.j();
                        defpackage.kb kbVar2 = this.l;
                        if (iD3 < 0) {
                            jqVar.c = kbVar2.j();
                            jqVar.d = false;
                        } else if (kbVar2.f() - this.l.a(viewV2) < 0) {
                            jqVar.c = this.l.f();
                            jqVar.d = true;
                        } else {
                            boolean z8 = jqVar.d;
                            defpackage.kb kbVar3 = this.l;
                            jqVar.c = z8 ? kbVar3.a(viewV2) + this.l.o() : kbVar3.d(viewV2);
                        }
                    }
                } else {
                    boolean z9 = this.m;
                    jqVar.d = z9;
                    defpackage.kb kbVar4 = this.l;
                    if (z9) {
                        jqVar.c = kbVar4.f() - this.o;
                    } else {
                        jqVar.c = kbVar4.j() + this.o;
                    }
                }
            }
            jqVar.e = true;
        } else if (viewAF2 != null && (this.l.d(viewAF2) >= this.l.f() || this.l.a(viewAF2) <= this.l.j())) {
            jqVar.c(viewAF2, ((defpackage.kq) viewAF2.getLayoutParams()).eA());
        }
        defpackage.js jsVar = this.a;
        jsVar.f = jsVar.k >= 0 ? 1 : -1;
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        Y(laVar, iArr);
        int iMax = java.lang.Math.max(0, iArr[0]) + this.l.j();
        int iMax2 = java.lang.Math.max(0, iArr[1]) + this.l.g();
        if (laVar.g && (i6 = this.n) != -1 && this.o != Integer.MIN_VALUE && (viewV = V(i6)) != null) {
            boolean z10 = this.m;
            defpackage.kb kbVar5 = this.l;
            if (z10) {
                iF = kbVar5.f() - this.l.a(viewV);
                iD = this.o;
            } else {
                iD = kbVar5.d(viewV) - this.l.j();
                iF = this.o;
            }
            int i9 = iF - iD;
            if (i9 > 0) {
                iMax += i9;
            } else {
                iMax2 -= i9;
            }
        }
        boolean z11 = jqVar.d;
        boolean z12 = this.m;
        if (!z11 ? true != z12 : true == z12) {
            i7 = 1;
        }
        m(ktVar, laVar, jqVar, i7);
        aI(ktVar);
        this.a.m = am();
        defpackage.js jsVar2 = this.a;
        jsVar2.j = laVar.g;
        jsVar2.i = 0;
        if (jqVar.d) {
            bM(jqVar);
            defpackage.js jsVar3 = this.a;
            jsVar3.h = iMax;
            K(ktVar, jsVar3, laVar, false);
            defpackage.js jsVar4 = this.a;
            i3 = jsVar4.b;
            int i10 = jsVar4.d;
            int i11 = jsVar4.c;
            if (i11 > 0) {
                iMax2 += i11;
            }
            bK(jqVar);
            defpackage.js jsVar5 = this.a;
            jsVar5.h = iMax2;
            jsVar5.d += jsVar5.e;
            K(ktVar, jsVar5, laVar, false);
            defpackage.js jsVar6 = this.a;
            i2 = jsVar6.b;
            int i12 = jsVar6.c;
            if (i12 > 0) {
                bN(i10, i3);
                defpackage.js jsVar7 = this.a;
                jsVar7.h = i12;
                K(ktVar, jsVar7, laVar, false);
                i3 = this.a.b;
            }
        } else {
            bK(jqVar);
            defpackage.js jsVar8 = this.a;
            jsVar8.h = iMax2;
            K(ktVar, jsVar8, laVar, false);
            defpackage.js jsVar9 = this.a;
            i2 = jsVar9.b;
            int i13 = jsVar9.d;
            int i14 = jsVar9.c;
            if (i14 > 0) {
                iMax += i14;
            }
            bM(jqVar);
            defpackage.js jsVar10 = this.a;
            jsVar10.h = iMax;
            jsVar10.d += jsVar10.e;
            K(ktVar, jsVar10, laVar, false);
            defpackage.js jsVar11 = this.a;
            i3 = jsVar11.b;
            int i15 = jsVar11.c;
            if (i15 > 0) {
                bL(i13, i2);
                defpackage.js jsVar12 = this.a;
                jsVar12.h = i15;
                K(ktVar, jsVar12, laVar, false);
                i2 = this.a.b;
            }
        }
        if (aw() > 0) {
            if (this.m ^ this.d) {
                int iBB2 = bB(i2, ktVar, laVar, true);
                i4 = i3 + iBB2;
                i5 = i2 + iBB2;
                iBB = bC(i4, ktVar, laVar, false);
            } else {
                int iBC = bC(i3, ktVar, laVar, true);
                i4 = i3 + iBC;
                i5 = i2 + iBC;
                iBB = bB(i5, ktVar, laVar, false);
            }
            i3 = i4 + iBB;
            i2 = i5 + iBB;
        }
        if (laVar.k && aw() != 0 && !laVar.g && eM()) {
            java.util.List list = ktVar.d;
            int size = list.size();
            int iEA = ((defpackage.kq) aE(0).getLayoutParams()).eA();
            int i16 = 0;
            int iB = 0;
            int iB2 = 0;
            while (i16 < size) {
                defpackage.ld ldVar = (defpackage.ld) list.get(i16);
                if (!ldVar.v()) {
                    boolean z13 = ldVar.c() >= iEA ? z3 : z4;
                    boolean z14 = this.m;
                    defpackage.kb kbVar6 = this.l;
                    if (z13 != z14) {
                        iB += kbVar6.b(ldVar.a);
                    } else {
                        iB2 += kbVar6.b(ldVar.a);
                    }
                }
                i16++;
                z3 = false;
                z4 = true;
            }
            this.a.l = list;
            if (iB > 0) {
                bN(((defpackage.kq) bG().getLayoutParams()).eA(), i3);
                defpackage.js jsVar13 = this.a;
                jsVar13.h = iB;
                r7 = 0;
                jsVar13.c = 0;
                jsVar13.b(null);
                K(ktVar, this.a, laVar, false);
            } else {
                r7 = 0;
            }
            if (iB2 > 0) {
                bL(((defpackage.kq) bF().getLayoutParams()).eA(), i2);
                defpackage.js jsVar14 = this.a;
                jsVar14.h = iB2;
                jsVar14.c = r7;
                jsVar14.b(null);
                K(ktVar, this.a, laVar, r7);
            }
            this.a.l = null;
        }
        if (laVar.g) {
            jqVar.d();
        } else {
            defpackage.kb kbVar7 = this.l;
            kbVar7.b = kbVar7.k();
        }
        this.b = this.d;
    }

    @Override // defpackage.kp
    public final void ac(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.support.v7.widget.LinearLayoutManager.SavedState) {
            android.support.v7.widget.LinearLayoutManager.SavedState savedState = (android.support.v7.widget.LinearLayoutManager.SavedState) parcelable;
            this.p = savedState;
            if (this.n != -1) {
                savedState.a();
            }
            aW();
        }
    }

    final void ad() {
        this.m = (this.k == 1 || !ak()) ? this.c : !this.c;
    }

    @Override // defpackage.kp
    public final void ae(int i) {
        this.n = i;
        this.o = Integer.MIN_VALUE;
        android.support.v7.widget.LinearLayoutManager.SavedState savedState = this.p;
        if (savedState != null) {
            savedState.a();
        }
        aW();
    }

    public final void af(int i) {
        if (i != 0 && i != 1) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "invalid orientation:"));
        }
        X(null);
        if (i != this.k || this.l == null) {
            defpackage.ka kaVar = i != 0 ? new defpackage.ka(this) : new jz(this);
            this.l = kaVar;
            this.q.a = kaVar;
            this.k = i;
            aW();
        }
    }

    public final void ag(boolean z) {
        X(null);
        if (z != this.c) {
            this.c = z;
            aW();
        }
    }

    @Override // defpackage.kp
    public final boolean ah() {
        return this.k == 0;
    }

    @Override // defpackage.kp
    public final boolean ai() {
        return this.k == 1;
    }

    @Override // defpackage.kp
    public final boolean aj() {
        return true;
    }

    protected boolean ak() {
        return az() == 1;
    }

    @Override // defpackage.kp
    public final boolean al() {
        return this.c;
    }

    final boolean am() {
        return this.l.h() == 0 && this.l.e() == 0;
    }

    @Override // defpackage.kp
    public final boolean an() {
        if (this.B == 1073741824 || this.A == 1073741824) {
            return false;
        }
        int iAw = aw();
        for (int i = 0; i < iAw; i++) {
            android.view.ViewGroup.LayoutParams layoutParams = aE(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kp
    public final void ao(int i, int i2, defpackage.la laVar, defpackage.jj jjVar) {
        if (1 == this.k) {
            i = i2;
        }
        if (aw() == 0 || i == 0) {
            return;
        }
        Z();
        bJ(i > 0 ? 1 : -1, java.lang.Math.abs(i), true, laVar);
        x(laVar, this.a, jjVar);
    }

    @Override // defpackage.kp
    public final void ap(int i, defpackage.jj jjVar) {
        boolean z;
        int i2;
        android.support.v7.widget.LinearLayoutManager.SavedState savedState = this.p;
        if (savedState == null || !savedState.b()) {
            ad();
            z = this.m;
            i2 = this.n;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.c;
            i2 = savedState.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.g && i2 >= 0 && i2 < i; i4++) {
            jjVar.a(i2, 0);
            i2 += i3;
        }
    }

    final android.view.View aq(boolean z) {
        return this.m ? U(0, aw(), z, true) : U(aw() - 1, -1, z, true);
    }

    final android.view.View ar(boolean z) {
        return this.m ? U(aw() - 1, -1, z, true) : U(0, aw(), z, true);
    }

    @Override // defpackage.kp
    public final void at(android.support.v7.widget.RecyclerView recyclerView, int i) {
        kz kzVar = new kz(recyclerView.getContext());
        kzVar.a = i;
        bd(kzVar);
    }

    public final void au(int i) {
        this.n = i;
        this.o = 0;
        android.support.v7.widget.LinearLayoutManager.SavedState savedState = this.p;
        if (savedState != null) {
            savedState.a();
        }
        aW();
    }

    @Override // defpackage.kp
    public int d(int i, defpackage.kt ktVar, defpackage.la laVar) {
        if (this.k == 1) {
            return 0;
        }
        return O(i, ktVar, laVar);
    }

    @Override // defpackage.kp
    public int e(int i, defpackage.kt ktVar, defpackage.la laVar) {
        if (this.k == 0) {
            return 0;
        }
        return O(i, ktVar, laVar);
    }

    @Override // defpackage.kp
    public android.view.View eG(int i, defpackage.kt ktVar, defpackage.la laVar) {
        int iJ;
        ad();
        if (aw() == 0 || (iJ = J(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Z();
        int iA = (iJ == -1) ^ this.m ? laVar.a() - 1 : 0;
        if (V(iA) != null) {
            at(this.s, iA);
        } else {
            this.n = iA;
            ab(ktVar, laVar);
        }
        android.view.View viewR = iJ == -1 ? R() : S();
        return (viewR == null || !viewR.hasFocusable()) ? W(i, ktVar, laVar) : viewR;
    }

    @Override // defpackage.kp
    public android.view.View eH(android.view.View view, int i, defpackage.kt ktVar, defpackage.la laVar) {
        return W(i, ktVar, laVar);
    }

    @Override // defpackage.kp
    public void eI(defpackage.kt ktVar, defpackage.la laVar, ebd ebdVar) {
        super.eI(ktVar, laVar, ebdVar);
        defpackage.kh khVar = this.s.m;
        if (khVar == null || khVar.a() <= 0) {
            return;
        }
        ebdVar.i(ebc.l);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    @Override // defpackage.kp
    public boolean eL(int i, android.os.Bundle bundle) {
        int iMin;
        if (super.eL(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.k == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 >= 0) {
                    android.support.v7.widget.RecyclerView recyclerView = this.s;
                    iMin = java.lang.Math.min(i2, eE(recyclerView.e, recyclerView.L) - 1);
                    if (iMin >= 0) {
                        au(iMin);
                        return true;
                    }
                }
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 >= 0) {
                    android.support.v7.widget.RecyclerView recyclerView2 = this.s;
                    iMin = java.lang.Math.min(i3, eD(recyclerView2.e, recyclerView2.L) - 1);
                    if (iMin >= 0) {
                        au(iMin);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.kp
    public boolean eM() {
        return this.p == null && this.b == this.d;
    }

    @Override // defpackage.kp
    public defpackage.kq f() {
        return new defpackage.kq(-2, -2);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    public android.view.View i(defpackage.kt ktVar, defpackage.la laVar, boolean z, boolean z2) {
        int i;
        int i2;
        int iAw;
        Z();
        int iAw2 = aw();
        if (z2) {
            i = -1;
            iAw = aw() - 1;
            i2 = -1;
        } else {
            i = iAw2;
            i2 = 1;
            iAw = 0;
        }
        int iA = laVar.a();
        int iJ = this.l.j();
        int iF = this.l.f();
        android.view.View view = null;
        android.view.View view2 = null;
        android.view.View view3 = null;
        while (iAw != i) {
            android.view.View viewAE = aE(iAw);
            int iBl = bl(viewAE);
            int iD = this.l.d(viewAE);
            int iA2 = this.l.a(viewAE);
            if (iBl >= 0 && iBl < iA) {
                if (!((defpackage.kq) viewAE.getLayoutParams()).eC()) {
                    boolean z3 = iA2 <= iJ && iD < iJ;
                    boolean z4 = iD >= iF && iA2 > iF;
                    if (!z3 && !z4) {
                        return viewAE;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewAE;
                        } else if (view == null) {
                            view = viewAE;
                        }
                    } else if (z3) {
                        view2 = viewAE;
                    } else if (view == null) {
                        view = viewAE;
                    }
                } else if (view3 == null) {
                    view3 = viewAE;
                }
            }
            iAw += i2;
        }
        if (view == null) {
            return view2 != null ? view2 : view3;
        }
        return view;
    }

    public void l(defpackage.kt ktVar, defpackage.la laVar, defpackage.js jsVar, defpackage.jr jrVar) {
        int paddingTop;
        int i;
        int iC;
        int i2;
        int iC2;
        android.view.View viewA = jsVar.a(ktVar);
        if (viewA == null) {
            jrVar.b = true;
            return;
        }
        defpackage.kq kqVar = (defpackage.kq) viewA.getLayoutParams();
        java.util.List list = jsVar.l;
        boolean z = this.m;
        if (list == null) {
            if (z == (jsVar.f == -1)) {
                super.aG(viewA, -1, false);
            } else {
                super.aG(viewA, 0, false);
            }
        } else {
            if (z == (jsVar.f == -1)) {
                super.aG(viewA, -1, true);
            } else {
                super.aG(viewA, 0, true);
            }
        }
        defpackage.kq kqVar2 = (defpackage.kq) viewA.getLayoutParams();
        android.graphics.Rect rectE = this.s.e(viewA);
        int i3 = rectE.left + rectE.right;
        int i4 = rectE.top + rectE.bottom;
        int iAx = defpackage.kp.ax(this.C, this.A, getPaddingLeft() + getPaddingRight() + kqVar2.leftMargin + kqVar2.rightMargin + i3, kqVar2.width, ah());
        int iAx2 = defpackage.kp.ax(this.D, this.B, getPaddingTop() + getPaddingBottom() + kqVar2.topMargin + kqVar2.bottomMargin + i4, kqVar2.height, ai());
        if (bg(viewA, iAx, iAx2, kqVar2)) {
            viewA.measure(iAx, iAx2);
        }
        jrVar.a = this.l.b(viewA);
        if (this.k == 1) {
            if (ak()) {
                iC = this.C - getPaddingRight();
                iC2 = iC - this.l.c(viewA);
            } else {
                int paddingLeft = getPaddingLeft();
                iC = this.l.c(viewA) + paddingLeft;
                iC2 = paddingLeft;
            }
            if (jsVar.f == -1) {
                i2 = jsVar.b;
                paddingTop = i2 - jrVar.a;
            } else {
                paddingTop = jsVar.b;
                i2 = jrVar.a + paddingTop;
            }
        } else {
            paddingTop = getPaddingTop();
            int iC3 = this.l.c(viewA) + paddingTop;
            if (jsVar.f == -1) {
                iC = jsVar.b;
                i = iC - jrVar.a;
            } else {
                i = jsVar.b;
                iC = jrVar.a + i;
            }
            int i5 = i;
            i2 = iC3;
            iC2 = i5;
        }
        bq(viewA, iC2, paddingTop, iC, i2);
        if (kqVar.eC() || kqVar.eB()) {
            jrVar.c = true;
        }
        jrVar.d = viewA.hasFocusable();
    }

    @Override // defpackage.kp
    public void p(defpackage.kt ktVar, defpackage.la laVar) {
        ab(ktVar, laVar);
    }

    @Override // defpackage.kp
    public void q(defpackage.la laVar) {
        this.p = null;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.q.d();
    }

    public void t(boolean z) {
        X(null);
        if (this.d != z) {
            this.d = z;
            aW();
        }
    }

    public void x(defpackage.la laVar, defpackage.js jsVar, defpackage.jj jjVar) {
        int i = jsVar.d;
        if (i < 0 || i >= laVar.a()) {
            return;
        }
        jjVar.a(i, java.lang.Math.max(0, jsVar.g));
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator CREATOR = new v(8);
        int a;
        int b;
        boolean c;

        public SavedState(android.os.Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt() == 1;
        }

        final void a() {
            this.a = -1;
        }

        final boolean b() {
            return this.a >= 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public SavedState(android.support.v7.widget.LinearLayoutManager.SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
            this.c = savedState.c;
        }

        public SavedState() {
        }
    }

    @Override // defpackage.kp
    public final void as(android.support.v7.widget.RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i, boolean z) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new defpackage.jq();
        this.f = new defpackage.jr();
        this.g = 2;
        this.h = new int[2];
        af(i);
        ag(z);
    }

    public void m(defpackage.kt ktVar, defpackage.la laVar, defpackage.jq jqVar, int i) {
    }
}
