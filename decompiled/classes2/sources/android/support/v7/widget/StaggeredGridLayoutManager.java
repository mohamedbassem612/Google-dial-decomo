package android.support.v7.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class StaggeredGridLayoutManager extends kp implements ky {
    private int[] J;
    defpackage.lm[] a;
    public kb b;
    kb c;
    private int i;
    private int j;
    private int k;
    private final defpackage.jn l;
    private java.util.BitSet m;
    private boolean o;
    private boolean p;
    private android.support.v7.widget.StaggeredGridLayoutManager.SavedState q;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = Integer.MIN_VALUE;
    defpackage.tw h = new defpackage.tw();
    private int n = 2;
    private final android.graphics.Rect G = new android.graphics.Rect();
    private final defpackage.lk H = new defpackage.lk(this);
    private boolean I = true;
    private final java.lang.Runnable K = new defpackage.jd(this, 7);

    public StaggeredGridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        defpackage.ko koVarAC = aC(context, attributeSet, i, i2);
        int i3 = koVarAC.a;
        if (i3 != 0 && i3 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation.");
        }
        X((java.lang.String) null);
        if (i3 != this.j) {
            this.j = i3;
            kb kbVar = this.b;
            this.b = this.c;
            this.c = kbVar;
            aW();
        }
        int i4 = koVarAC.b;
        X((java.lang.String) null);
        if (i4 != this.i) {
            this.h.c();
            aW();
            this.i = i4;
            this.m = new java.util.BitSet(i4);
            this.a = new defpackage.lm[this.i];
            for (int i5 = 0; i5 < this.i; i5++) {
                this.a[i5] = new defpackage.lm(this, i5);
            }
            aW();
        }
        J(koVarAC.c);
        this.l = new defpackage.jn();
        this.b = kb.p(this, this.j);
        this.c = kb.p(this, 1 - this.j);
    }

    private final int N(int i) {
        if (aw() != 0) {
            if ((i < c()) != this.e) {
                return -1;
            }
        } else if (!this.e) {
            return -1;
        }
        return 1;
    }

    private final int O(la laVar) {
        if (aw() == 0) {
            return 0;
        }
        return defpackage.li.d(laVar, this.b, s(!this.I), m(!this.I), this, this.I);
    }

    private final int R(la laVar) {
        if (aw() == 0) {
            return 0;
        }
        return defpackage.li.e(laVar, this.b, s(!this.I), m(!this.I), this, this.I, this.e);
    }

    private final int S(la laVar) {
        if (aw() == 0) {
            return 0;
        }
        return defpackage.li.f(laVar, this.b, s(!this.I), m(!this.I), this, this.I);
    }

    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        if (r5.j == 1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int T(int r6) {
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
            int r5 = r5.j
            if (r5 != r1) goto L25
            goto L3c
        L1f:
            r0 = r1
        L20:
            r1 = r3
        L21:
            int r5 = r5.j
            if (r5 == r1) goto L3d
        L25:
            r0 = r4
            goto L3d
        L27:
            int r6 = r5.j
            if (r6 == r1) goto L3c
            boolean r5 = r5.M()
            if (r5 == 0) goto L3c
            goto L3d
        L32:
            int r6 = r5.j
            if (r6 == r1) goto L3d
            boolean r5 = r5.M()
            if (r5 == 0) goto L3d
        L3c:
            r0 = r1
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.T(int):int");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v28 */
    private final int U(kt ktVar, defpackage.jn jnVar, la laVar) {
        int i;
        defpackage.lm lmVar;
        ?? r8;
        int iF;
        int iB;
        int iJ;
        int iB2;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 1;
        this.m.set(0, this.i, true);
        defpackage.jn jnVar2 = this.l;
        int i7 = jnVar2.i ? jnVar.e == 1 ? androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY : Integer.MIN_VALUE : jnVar.e == 1 ? jnVar.g + jnVar.b : jnVar.f - jnVar.b;
        int i8 = jnVar.e;
        for (int i9 = 0; i9 < this.i; i9++) {
            if (!this.a[i9].a.isEmpty()) {
                bB(this.a[i9], i8, i7);
            }
        }
        boolean z = this.e;
        kb kbVar = this.b;
        int iF2 = z ? kbVar.f() : kbVar.j();
        boolean z2 = false;
        while (jnVar.a(laVar) && (jnVar2.i || !this.m.isEmpty())) {
            android.view.View viewN = ktVar.n(jnVar.c);
            jnVar.c += jnVar.d;
            defpackage.ll llVar = (defpackage.ll) viewN.getLayoutParams();
            int iEA = llVar.eA();
            java.lang.Object obj = this.h.b;
            if (obj != null) {
                int[] iArr = (int[]) obj;
                if (iEA < iArr.length) {
                    i = iArr[iEA];
                } else {
                    i = -1;
                }
            } else {
                i = -1;
            }
            int i10 = i == -1 ? i6 : i5;
            if (i10 != 0) {
                boolean z3 = llVar.b;
                boolean zBC = bC(jnVar.e);
                int i11 = this.i;
                if (zBC) {
                    i4 = i11 - 1;
                    i3 = -1;
                    i2 = -1;
                } else {
                    i2 = i6;
                    i3 = i11;
                    i4 = i5;
                }
                int i12 = jnVar.e;
                kb kbVar2 = this.b;
                defpackage.lm lmVar2 = null;
                if (i12 == i6) {
                    int iJ2 = kbVar2.j();
                    int i13 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
                    while (i4 != i3) {
                        defpackage.lm lmVar3 = this.a[i4];
                        int iD = lmVar3.d(iJ2);
                        if (iD < i13) {
                            i13 = iD;
                            lmVar2 = lmVar3;
                        }
                        i4 += i2;
                    }
                } else {
                    int iF3 = kbVar2.f();
                    int i14 = Integer.MIN_VALUE;
                    while (i4 != i3) {
                        defpackage.lm lmVar4 = this.a[i4];
                        int iF4 = lmVar4.f(iF3);
                        if (iF4 > i14) {
                            lmVar2 = lmVar4;
                            i14 = iF4;
                        }
                        i4 += i2;
                    }
                }
                lmVar = lmVar2;
                defpackage.tw twVar = this.h;
                twVar.d(iEA);
                ((int[]) twVar.b)[iEA] = lmVar.e;
            } else {
                lmVar = this.a[i];
            }
            llVar.a = lmVar;
            if (jnVar.e == 1) {
                r8 = 0;
                super.aG(viewN, -1, false);
            } else {
                r8 = 0;
                super.aG(viewN, 0, false);
            }
            boolean z4 = llVar.b;
            if (this.j == 1) {
                bD(viewN, ax(this.k, ((kp) this).A, r8, llVar.width, r8), ax(((kp) this).D, ((kp) this).B, getPaddingTop() + getPaddingBottom(), llVar.height, true));
            } else {
                bD(viewN, ax(((kp) this).C, ((kp) this).A, getPaddingLeft() + getPaddingRight(), llVar.width, true), ax(this.k, ((kp) this).B, 0, llVar.height, false));
            }
            if (jnVar.e == 1) {
                boolean z5 = llVar.b;
                iB = lmVar.d(iF2);
                iF = this.b.b(viewN) + iB;
                if (i10 != 0) {
                    boolean z6 = llVar.b;
                }
            } else {
                boolean z7 = llVar.b;
                iF = lmVar.f(iF2);
                iB = iF - this.b.b(viewN);
                if (i10 != 0) {
                    boolean z8 = llVar.b;
                }
            }
            boolean z9 = llVar.b;
            if (jnVar.e == 1) {
                defpackage.lm lmVar5 = llVar.a;
                defpackage.ll llVarN = defpackage.lm.n(viewN);
                llVarN.a = lmVar5;
                java.util.ArrayList arrayList = lmVar5.a;
                arrayList.add(viewN);
                lmVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    lmVar5.b = Integer.MIN_VALUE;
                }
                if (llVarN.eC() || llVarN.eB()) {
                    lmVar5.d += lmVar5.f.b.b(viewN);
                }
            } else {
                defpackage.lm lmVar6 = llVar.a;
                defpackage.ll llVarN2 = defpackage.lm.n(viewN);
                llVarN2.a = lmVar6;
                java.util.ArrayList arrayList2 = lmVar6.a;
                arrayList2.add(0, viewN);
                lmVar6.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    lmVar6.c = Integer.MIN_VALUE;
                }
                if (llVarN2.eC() || llVarN2.eB()) {
                    lmVar6.d += lmVar6.f.b.b(viewN);
                }
            }
            if (M() && this.j == 1) {
                boolean z10 = llVar.b;
                iB2 = this.c.f() - (((this.i - 1) - lmVar.e) * this.k);
                iJ = iB2 - this.c.b(viewN);
            } else {
                boolean z11 = llVar.b;
                iJ = this.c.j() + (lmVar.e * this.k);
                iB2 = this.c.b(viewN) + iJ;
            }
            if (this.j == 1) {
                bq(viewN, iJ, iB, iB2, iF);
            } else {
                bq(viewN, iB, iJ, iF, iB2);
            }
            boolean z12 = llVar.b;
            bB(lmVar, jnVar2.e, i7);
            ak(ktVar, jnVar2);
            if (jnVar2.h && viewN.hasFocusable()) {
                boolean z13 = llVar.b;
                this.m.set(lmVar.e, false);
                i5 = 0;
                i6 = 1;
                z2 = true;
            } else {
                i6 = 1;
                z2 = true;
                i5 = 0;
            }
        }
        int i15 = i5;
        if (!z2) {
            ak(ktVar, jnVar2);
        }
        int i16 = jnVar2.e;
        kb kbVar3 = this.b;
        int iJ3 = i16 == -1 ? this.b.j() - Y(kbVar3.j()) : W(kbVar3.f()) - this.b.f();
        return iJ3 > 0 ? java.lang.Math.min(jnVar.b, iJ3) : i15;
    }

    private final int W(int i) {
        int iD = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iD2 = this.a[i2].d(i);
            if (iD2 > iD) {
                iD = iD2;
            }
        }
        return iD;
    }

    private final int Y(int i) {
        int iF = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iF2 = this.a[i2].f(i);
            if (iF2 < iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d7 A[LOOP:2: B:61:0x00d7->B:74:0x00fc, LOOP_START, PHI: r5
      0x00d7: PHI (r5v8 int) = (r5v7 int), (r5v9 int) binds: [B:46:0x00ac, B:74:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00db  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x00d4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private final android.view.View Z(android.view.View view, int i, kt ktVar, la laVar) {
        defpackage.lm lmVar;
        android.view.View viewG;
        boolean z;
        boolean z2;
        defpackage.lm[] lmVarArr;
        int iB;
        android.view.View viewV;
        int i2;
        defpackage.lm[] lmVarArr2;
        int iB2;
        android.view.View viewV2;
        int iB3;
        ar();
        int iT = T(i);
        if (iT == Integer.MIN_VALUE) {
            return null;
        }
        if (view != null) {
            defpackage.ll llVar = (defpackage.ll) view.getLayoutParams();
            boolean z3 = llVar.b;
            lmVar = llVar.a;
        } else {
            lmVar = null;
        }
        int i3 = iT == 1 ? i() : c();
        bA(i3, laVar);
        au(iT);
        defpackage.jn jnVar = this.l;
        jnVar.c = jnVar.d + i3;
        jnVar.b = (int) (this.b.k() * 0.33333334f);
        jnVar.h = true;
        jnVar.a = false;
        U(ktVar, jnVar, laVar);
        this.o = this.e;
        if (view == null || (viewV2 = lmVar.g(i3, iT)) == null || viewV2 == view) {
            if (!bC(iT)) {
                for (int i4 = 0; i4 < this.i; i4++) {
                    viewG = this.a[i4].g(i3, iT);
                    if (viewG != null && viewG != view) {
                        return viewG;
                    }
                }
                boolean z4 = !this.d;
                if (iT != -1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z4 == z) {
                }
                if (view == null) {
                    if (bC(iT)) {
                        while (i < this.i) {
                            if (view != null) {
                                lmVarArr = this.a;
                                if (z2) {
                                    iB = lmVarArr[i].a();
                                } else {
                                    iB = lmVarArr[i].b();
                                }
                                viewV = V(iB);
                                if (viewV == null) {
                                    continue;
                                }
                            } else {
                                lmVarArr = this.a;
                                if (z2) {
                                    iB = lmVarArr[i].a();
                                } else {
                                    iB = lmVarArr[i].b();
                                }
                                viewV = V(iB);
                                if (viewV == null) {
                                    continue;
                                }
                            }
                        }
                        return null;
                    }
                    while (i2 >= 0) {
                        if (view != null) {
                            lmVarArr2 = this.a;
                            if (z2) {
                                iB2 = lmVarArr2[i2].a();
                            } else {
                                iB2 = lmVarArr2[i2].b();
                            }
                            viewV2 = V(iB2);
                            if (viewV2 != null) {
                                continue;
                            }
                        } else {
                            lmVarArr2 = this.a;
                            if (z2) {
                                iB2 = lmVarArr2[i2].a();
                            } else {
                                iB2 = lmVarArr2[i2].b();
                            }
                            viewV2 = V(iB2);
                            if (viewV2 != null) {
                                continue;
                            }
                        }
                    }
                    return null;
                }
                if (z2) {
                    iB3 = lmVar.a();
                } else {
                    iB3 = lmVar.b();
                }
                viewV2 = V(iB3);
                if (viewV2 != null) {
                    if (bC(iT)) {
                        while (i < this.i) {
                            if (view != null) {
                                lmVarArr = this.a;
                                if (z2) {
                                    iB = lmVarArr[i].a();
                                } else {
                                    iB = lmVarArr[i].b();
                                }
                                viewV = V(iB);
                                if (viewV == null) {
                                    continue;
                                }
                            } else {
                                lmVarArr = this.a;
                                if (z2) {
                                    iB = lmVarArr[i].a();
                                } else {
                                    iB = lmVarArr[i].b();
                                }
                                viewV = V(iB);
                                if (viewV == null) {
                                    continue;
                                }
                            }
                        }
                        return null;
                    }
                    while (i2 >= 0) {
                        if (view != null) {
                            lmVarArr2 = this.a;
                            if (z2) {
                                iB2 = lmVarArr2[i2].a();
                            } else {
                                iB2 = lmVarArr2[i2].b();
                            }
                            viewV2 = V(iB2);
                            if (viewV2 != null) {
                                continue;
                            }
                        } else {
                            lmVarArr2 = this.a;
                            if (z2) {
                                iB2 = lmVarArr2[i2].a();
                            } else {
                                iB2 = lmVarArr2[i2].b();
                            }
                            viewV2 = V(iB2);
                            if (viewV2 != null) {
                                continue;
                            }
                        }
                    }
                    return null;
                }
                if (bC(iT)) {
                    while (i < this.i) {
                        if (view != null) {
                            lmVarArr = this.a;
                            if (z2) {
                                iB = lmVarArr[i].a();
                            } else {
                                iB = lmVarArr[i].b();
                            }
                            viewV = V(iB);
                            if (viewV == null) {
                                continue;
                            }
                        } else {
                            lmVarArr = this.a;
                            if (z2) {
                                iB = lmVarArr[i].a();
                            } else {
                                iB = lmVarArr[i].b();
                            }
                            viewV = V(iB);
                            if (viewV == null) {
                                continue;
                            }
                        }
                    }
                    return null;
                }
                while (i2 >= 0) {
                    if (view != null) {
                        lmVarArr2 = this.a;
                        if (z2) {
                            iB2 = lmVarArr2[i2].a();
                        } else {
                            iB2 = lmVarArr2[i2].b();
                        }
                        viewV2 = V(iB2);
                        if (viewV2 != null) {
                            continue;
                        }
                    } else {
                        lmVarArr2 = this.a;
                        if (z2) {
                            iB2 = lmVarArr2[i2].a();
                        } else {
                            iB2 = lmVarArr2[i2].b();
                        }
                        viewV2 = V(iB2);
                        if (viewV2 != null) {
                            continue;
                        }
                    }
                }
                return null;
            }
            for (int i5 = this.i - 1; i5 >= 0; i5--) {
                viewG = this.a[i5].g(i3, iT);
                if (viewG != null && viewG != view) {
                    return viewG;
                }
            }
            boolean z5 = !this.d;
            if (iT != -1) {
                z = false;
            } else {
                z = true;
            }
            z2 = z5 == z;
            if (view == null) {
                if (bC(iT)) {
                    for (i2 = this.i - 1; i2 >= 0; i2--) {
                        if (view != null || i2 != lmVar.e) {
                            lmVarArr2 = this.a;
                            if (z2) {
                                iB2 = lmVarArr2[i2].a();
                            } else {
                                iB2 = lmVarArr2[i2].b();
                            }
                            viewV2 = V(iB2);
                            if (viewV2 != null || viewV2 == view) {
                            }
                        }
                    }
                    return null;
                }
                for (int i6 = 0; i6 < this.i; i6++) {
                    if (view != null || i6 != lmVar.e) {
                        lmVarArr = this.a;
                        if (z2) {
                            iB = lmVarArr[i6].a();
                        } else {
                            iB = lmVarArr[i6].b();
                        }
                        viewV = V(iB);
                        if (viewV == null && viewV != view) {
                            return viewV;
                        }
                    }
                }
                return null;
            }
            if (z2) {
                iB3 = lmVar.a();
            } else {
                iB3 = lmVar.b();
            }
            viewV2 = V(iB3);
            if (viewV2 != null || viewV2 == view) {
                if (bC(iT)) {
                    while (i6 < this.i) {
                        if (view != null) {
                            lmVarArr = this.a;
                            if (z2) {
                                iB = lmVarArr[i6].a();
                            } else {
                                iB = lmVarArr[i6].b();
                            }
                            viewV = V(iB);
                            if (viewV == null) {
                                continue;
                            }
                        } else {
                            lmVarArr = this.a;
                            if (z2) {
                                iB = lmVarArr[i6].a();
                            } else {
                                iB = lmVarArr[i6].b();
                            }
                            viewV = V(iB);
                            if (viewV == null) {
                                continue;
                            }
                        }
                    }
                    return null;
                }
                while (i2 >= 0) {
                    if (view != null) {
                        lmVarArr2 = this.a;
                        if (z2) {
                            iB2 = lmVarArr2[i2].a();
                        } else {
                            iB2 = lmVarArr2[i2].b();
                        }
                        viewV2 = V(iB2);
                        if (viewV2 != null) {
                            continue;
                        }
                    } else {
                        lmVarArr2 = this.a;
                        if (z2) {
                            iB2 = lmVarArr2[i2].a();
                        } else {
                            iB2 = lmVarArr2[i2].b();
                        }
                        viewV2 = V(iB2);
                        if (viewV2 != null) {
                            continue;
                        }
                    }
                }
                return null;
            }
        }
        return viewV2;
    }

    private final void ab(kt ktVar, la laVar, boolean z) {
        int iF;
        int i;
        int iW = W(Integer.MIN_VALUE);
        if (iW == Integer.MIN_VALUE || (iF = this.b.f() - iW) <= 0) {
            return;
        }
        int i2 = -l(-iF, ktVar, laVar);
        if (!z || (i = iF - i2) <= 0) {
            return;
        }
        this.b.n(i);
    }

    private final void ad(kt ktVar, la laVar, boolean z) {
        int iJ;
        int iY = Y(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        if (iY == Integer.MAX_VALUE || (iJ = iY - this.b.j()) <= 0) {
            return;
        }
        int iL = iJ - l(iJ, ktVar, laVar);
        if (!z || iL <= 0) {
            return;
        }
        this.b.n(-iL);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041 A[LOOP:0: B:20:0x0033->B:23:0x0041, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[LOOP:1: B:28:0x0053->B:31:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0045 A[EDGE_INSN: B:55:0x0045->B:25:0x0045 BREAK  A[LOOP:0: B:20:0x0033->B:23:0x0041], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0065 A[EDGE_INSN: B:57:0x0065->B:33:0x0065 BREAK  A[LOOP:1: B:28:0x0053->B:31:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    private final void af(int i, int i2, int i3) {
        int i4;
        int i5;
        defpackage.tw twVar;
        java.lang.Object obj;
        int i6;
        ?? r5;
        int i7;
        int size;
        android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        int size2;
        int i8;
        int i9 = this.e ? i() : c();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            twVar = this.h;
            obj = twVar.b;
            if (obj != null && i5 < ((int[]) obj).length) {
                r5 = twVar.a;
                if (r5 != 0) {
                    size = r5.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                            break;
                        }
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) twVar.a.get(size);
                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a != i5) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                        twVar.a.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                    }
                    size2 = twVar.a.size();
                    i8 = 0;
                    while (true) {
                        if (i8 < size2) {
                            i8 = -1;
                            break;
                        } else if (((android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) twVar.a.get(i8)).a < i5) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    if (i8 != -1) {
                        android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) twVar.a.get(i8);
                        twVar.a.remove(i8);
                        i7 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.a;
                    } else {
                        i7 = -1;
                    }
                } else {
                    i7 = -1;
                }
                if (i7 == -1) {
                    int[] iArr = (int[]) twVar.b;
                    java.util.Arrays.fill(iArr, i5, iArr.length, -1);
                    int length = ((int[]) twVar.b).length;
                } else {
                    java.util.Arrays.fill((int[]) twVar.b, i5, java.lang.Math.min(i7 + 1, ((int[]) twVar.b).length), -1);
                }
            }
            if (i3 != 1) {
                this.h.e(i, i2);
            } else if (i3 != 2) {
                this.h.f(i, i2);
            } else if (i3 == 8) {
                this.h.f(i, 1);
                this.h.e(i2, 1);
            }
            if (i4 > i9) {
                if (this.e) {
                    i6 = c();
                } else {
                    i6 = i();
                }
                if (i5 <= i6) {
                    aW();
                }
            }
        }
        i4 = i + i2;
        i5 = i;
        twVar = this.h;
        obj = twVar.b;
        if (obj != null) {
            r5 = twVar.a;
            if (r5 != 0) {
                size = r5.size() - 1;
                while (true) {
                    if (size >= 0) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                        break;
                    }
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) twVar.a.get(size);
                    if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a != i5) {
                        break;
                        break;
                    }
                    size--;
                }
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                    twVar.a.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                }
                size2 = twVar.a.size();
                i8 = 0;
                while (true) {
                    if (i8 < size2) {
                        i8 = -1;
                        break;
                    } else {
                        if (((android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) twVar.a.get(i8)).a < i5) {
                            break;
                            break;
                        }
                        i8++;
                    }
                }
                if (i8 != -1) {
                    android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) twVar.a.get(i8);
                    twVar.a.remove(i8);
                    i7 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem3.a;
                } else {
                    i7 = -1;
                }
            } else {
                i7 = -1;
            }
            if (i7 == -1) {
                int[] iArr2 = (int[]) twVar.b;
                java.util.Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) twVar.b).length;
            } else {
                java.util.Arrays.fill((int[]) twVar.b, i5, java.lang.Math.min(i7 + 1, ((int[]) twVar.b).length), -1);
            }
        }
        if (i3 != 1) {
            this.h.e(i, i2);
        } else if (i3 != 2) {
            this.h.f(i, i2);
        } else if (i3 == 8) {
            this.h.f(i, 1);
            this.h.e(i2, 1);
        }
        if (i4 > i9) {
            if (this.e) {
                i6 = c();
            } else {
                i6 = i();
            }
            if (i5 <= i6) {
                aW();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:167:0x0282 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x0284  */
    /* JADX WARN: Code duplicated, block: B:225:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:236:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x01e2 A[SYNTHETIC] */
    private final void ag(kt ktVar, la laVar, boolean z) {
        boolean z2;
        android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState;
        defpackage.lm[] lmVarArr;
        int iAw;
        int i;
        int iBl;
        int iBl2;
        int iAw2;
        int i2;
        defpackage.lk lkVar = this.H;
        if (!(this.q == null && this.f == -1) && laVar.a() == 0) {
            aR(ktVar);
            lkVar.a();
            return;
        }
        boolean z3 = (lkVar.e && this.f == -1 && this.q == null) ? false : true;
        if (z3) {
            lkVar.a();
            android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState2 = this.q;
            if (savedState2 != null) {
                int i3 = savedState2.c;
                if (i3 > 0) {
                    if (i3 == this.i) {
                        for (int i4 = 0; i4 < this.i; i4++) {
                            this.a[i4].j();
                            android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState3 = this.q;
                            int iF = savedState3.d[i4];
                            if (iF != Integer.MIN_VALUE) {
                                boolean z4 = savedState3.i;
                                kb kbVar = this.b;
                                iF += z4 ? kbVar.f() : kbVar.j();
                            }
                            this.a[i4].l(iF);
                        }
                    } else {
                        savedState2.b();
                        android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState4 = this.q;
                        savedState4.a = savedState4.b;
                    }
                }
                android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState5 = this.q;
                this.p = savedState5.j;
                J(savedState5.h);
                ar();
                android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState6 = this.q;
                int i5 = savedState6.a;
                if (i5 != -1) {
                    this.f = i5;
                    lkVar.c = savedState6.i;
                } else {
                    lkVar.c = this.e;
                }
                if (savedState6.e > 1) {
                    defpackage.tw twVar = this.h;
                    twVar.b = savedState6.f;
                    twVar.a = savedState6.g;
                }
            } else {
                ar();
                lkVar.c = this.e;
            }
            if (laVar.g || (i2 = this.f) == -1) {
                if (this.o) {
                    int iA = laVar.a();
                    iAw2 = aw() - 1;
                    while (true) {
                        if (iAw2 < 0) {
                            iBl2 = 0;
                            break;
                        }
                        iBl2 = bl(aE(iAw2));
                        if (iBl2 < 0 && iBl2 < iA) {
                            break;
                        } else {
                            iAw2--;
                        }
                    }
                } else {
                    int iA2 = laVar.a();
                    iAw = aw();
                    i = 0;
                    while (true) {
                        if (i >= iAw) {
                            iBl2 = 0;
                            break;
                        }
                        iBl = bl(aE(i));
                        if (iBl < 0 && iBl < iA2) {
                            iBl2 = iBl;
                            break;
                        }
                        i++;
                    }
                }
                lkVar.a = iBl2;
                lkVar.b = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= laVar.a()) {
                this.f = -1;
                this.g = Integer.MIN_VALUE;
                if (this.o) {
                    int iA3 = laVar.a();
                    iAw2 = aw() - 1;
                    while (true) {
                        if (iAw2 < 0) {
                            iBl2 = 0;
                            break;
                        } else {
                            iBl2 = bl(aE(iAw2));
                            if (iBl2 < 0) {
                            }
                            iAw2--;
                        }
                    }
                } else {
                    int iA4 = laVar.a();
                    iAw = aw();
                    i = 0;
                    while (true) {
                        if (i >= iAw) {
                            iBl2 = 0;
                            break;
                        } else {
                            iBl = bl(aE(i));
                            if (iBl < 0) {
                            }
                            i++;
                        }
                    }
                }
                lkVar.a = iBl2;
                lkVar.b = Integer.MIN_VALUE;
            } else {
                android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState7 = this.q;
                if (savedState7 == null || savedState7.a == -1 || savedState7.c <= 0) {
                    android.view.View viewV = V(this.f);
                    if (viewV != null) {
                        lkVar.a = this.e ? i() : c();
                        if (this.g != Integer.MIN_VALUE) {
                            boolean z5 = lkVar.c;
                            kb kbVar2 = this.b;
                            if (z5) {
                                lkVar.b = (kbVar2.f() - this.g) - this.b.a(viewV);
                            } else {
                                lkVar.b = (kbVar2.j() + this.g) - this.b.d(viewV);
                            }
                        } else if (this.b.b(viewV) > this.b.k()) {
                            boolean z6 = lkVar.c;
                            kb kbVar3 = this.b;
                            lkVar.b = z6 ? kbVar3.f() : kbVar3.j();
                        } else {
                            int iD = this.b.d(viewV) - this.b.j();
                            if (iD < 0) {
                                lkVar.b = -iD;
                            } else {
                                int iF2 = this.b.f() - this.b.a(viewV);
                                if (iF2 < 0) {
                                    lkVar.b = iF2;
                                } else {
                                    lkVar.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f;
                        lkVar.a = i6;
                        int i7 = this.g;
                        if (i7 == Integer.MIN_VALUE) {
                            boolean z7 = N(i6) == 1;
                            lkVar.c = z7;
                            lkVar.b = z7 ? lkVar.g.b.f() : lkVar.g.b.j();
                        } else if (lkVar.c) {
                            lkVar.b = lkVar.g.b.f() - i7;
                        } else {
                            lkVar.b = lkVar.g.b.j() + i7;
                        }
                        lkVar.d = true;
                    }
                } else {
                    lkVar.b = Integer.MIN_VALUE;
                    lkVar.a = this.f;
                }
            }
            lkVar.e = true;
        }
        if (this.q == null && this.f == -1 && (lkVar.c != this.o || M() != this.p)) {
            this.h.c();
            lkVar.d = true;
        }
        if (aw() > 0 && ((savedState = this.q) == null || savedState.c <= 0)) {
            if (lkVar.d) {
                for (int i8 = 0; i8 < this.i; i8++) {
                    this.a[i8].j();
                    int i9 = lkVar.b;
                    if (i9 != Integer.MIN_VALUE) {
                        this.a[i8].l(i9);
                    }
                }
            } else if (z3 || lkVar.f == null) {
                int i10 = 0;
                while (true) {
                    int i11 = this.i;
                    lmVarArr = this.a;
                    if (i10 >= i11) {
                        break;
                    }
                    defpackage.lm lmVar = lmVarArr[i10];
                    boolean z8 = this.e;
                    int i12 = lkVar.b;
                    int iD2 = z8 ? lmVar.d(Integer.MIN_VALUE) : lmVar.f(Integer.MIN_VALUE);
                    lmVar.j();
                    if (iD2 != Integer.MIN_VALUE) {
                        if (z8) {
                            if (iD2 >= lmVar.f.b.f()) {
                                if (i12 != Integer.MIN_VALUE) {
                                    iD2 += i12;
                                }
                                lmVar.c = iD2;
                                lmVar.b = iD2;
                            }
                        } else if (iD2 <= lmVar.f.b.j()) {
                            if (i12 != Integer.MIN_VALUE) {
                                iD2 += i12;
                            }
                            lmVar.c = iD2;
                            lmVar.b = iD2;
                        }
                    }
                    i10++;
                }
                int length = lmVarArr.length;
                int[] iArr = lkVar.f;
                if (iArr == null || iArr.length < length) {
                    lkVar.f = new int[lkVar.g.a.length];
                }
                for (int i13 = 0; i13 < length; i13++) {
                    lkVar.f[i13] = lmVarArr[i13].f(Integer.MIN_VALUE);
                }
            } else {
                for (int i14 = 0; i14 < this.i; i14++) {
                    defpackage.lm lmVar2 = this.a[i14];
                    lmVar2.j();
                    lmVar2.l(lkVar.f[i14]);
                }
            }
        }
        aI(ktVar);
        defpackage.jn jnVar = this.l;
        jnVar.a = false;
        K(this.c.k());
        bA(lkVar.a, laVar);
        if (lkVar.c) {
            au(-1);
            U(ktVar, jnVar, laVar);
            au(1);
            jnVar.c = lkVar.a + jnVar.d;
            U(ktVar, jnVar, laVar);
        } else {
            au(1);
            U(ktVar, jnVar, laVar);
            au(-1);
            jnVar.c = lkVar.a + jnVar.d;
            U(ktVar, jnVar, laVar);
        }
        if (this.c.h() != 1073741824) {
            int iAw3 = aw();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < iAw3; i15++) {
                android.view.View viewAE = aE(i15);
                float fB = this.c.b(viewAE);
                if (fB >= fMax) {
                    fMax = java.lang.Math.max(fMax, fB);
                }
            }
            int i16 = this.k;
            int iRound = java.lang.Math.round(fMax * this.i);
            if (this.c.h() == Integer.MIN_VALUE) {
                iRound = java.lang.Math.min(iRound, this.c.k());
            }
            K(iRound);
            if (this.k != i16) {
                for (int i17 = 0; i17 < iAw3; i17++) {
                    android.view.View viewAE2 = aE(i17);
                    defpackage.ll llVar = (defpackage.ll) viewAE2.getLayoutParams();
                    boolean z9 = llVar.b;
                    if (M() && this.j == 1) {
                        int i18 = -((this.i - 1) - llVar.a.e);
                        viewAE2.offsetLeftAndRight((this.k * i18) - (i18 * i16));
                    } else {
                        int i19 = llVar.a.e;
                        int i20 = this.j;
                        int i21 = (this.k * i19) - (i19 * i16);
                        if (i20 == 1) {
                            viewAE2.offsetLeftAndRight(i21);
                        } else {
                            viewAE2.offsetTopAndBottom(i21);
                        }
                    }
                }
            }
        }
        if (aw() > 0) {
            if (this.e) {
                ab(ktVar, laVar, true);
                ad(ktVar, laVar, false);
            } else {
                ad(ktVar, laVar, true);
                ab(ktVar, laVar, false);
            }
        }
        if (z && !laVar.g && this.n != 0 && aw() > 0 && t() != null) {
            bu(this.K);
            z2 = L();
        }
        if (laVar.g) {
            lkVar.a();
        }
        this.o = lkVar.c;
        this.p = M();
        if (z2) {
            lkVar.a();
            ag(ktVar, laVar, false);
        }
    }

    private final void ak(kt ktVar, defpackage.jn jnVar) {
        int iMin;
        if (!jnVar.a || jnVar.i) {
            return;
        }
        if (jnVar.b == 0) {
            if (jnVar.e == -1) {
                am(ktVar, jnVar.g);
                return;
            } else {
                aq(ktVar, jnVar.f);
                return;
            }
        }
        int i = 1;
        if (jnVar.e == -1) {
            int i2 = jnVar.f;
            int iF = this.a[0].f(i2);
            while (i < this.i) {
                int iF2 = this.a[i].f(i2);
                if (iF2 > iF) {
                    iF = iF2;
                }
                i++;
            }
            int i3 = i2 - iF;
            am(ktVar, i3 < 0 ? jnVar.g : jnVar.g - java.lang.Math.min(i3, jnVar.b));
            return;
        }
        int i4 = jnVar.g;
        int iD = this.a[0].d(i4);
        while (i < this.i) {
            int iD2 = this.a[i].d(i4);
            if (iD2 < iD) {
                iD = iD2;
            }
            i++;
        }
        int i5 = iD - jnVar.g;
        if (i5 < 0) {
            iMin = jnVar.f;
        } else {
            iMin = java.lang.Math.min(i5, jnVar.b) + jnVar.f;
        }
        aq(ktVar, iMin);
    }

    private final void am(kt ktVar, int i) {
        int iAw = aw();
        while (true) {
            iAw--;
            if (iAw < 0) {
                return;
            }
            android.view.View viewAE = aE(iAw);
            if (this.b.d(viewAE) < i || this.b.m(viewAE) < i) {
                return;
            }
            defpackage.ll llVar = (defpackage.ll) viewAE.getLayoutParams();
            boolean z = llVar.b;
            if (llVar.a.a.size() == 1) {
                return;
            }
            defpackage.lm lmVar = llVar.a;
            java.util.ArrayList arrayList = lmVar.a;
            int size = arrayList.size();
            android.view.View view = (android.view.View) arrayList.remove(size - 1);
            defpackage.ll llVarN = defpackage.lm.n(view);
            llVarN.a = null;
            if (llVarN.eC() || llVarN.eB()) {
                lmVar.d -= lmVar.f.b.b(view);
            }
            if (size == 1) {
                lmVar.b = Integer.MIN_VALUE;
            }
            lmVar.c = Integer.MIN_VALUE;
            aT(viewAE, ktVar);
        }
    }

    private final void aq(kt ktVar, int i) {
        while (aw() > 0) {
            android.view.View viewAE = aE(0);
            if (this.b.a(viewAE) > i || this.b.l(viewAE) > i) {
                return;
            }
            defpackage.ll llVar = (defpackage.ll) viewAE.getLayoutParams();
            boolean z = llVar.b;
            if (llVar.a.a.size() == 1) {
                return;
            }
            defpackage.lm lmVar = llVar.a;
            java.util.ArrayList arrayList = lmVar.a;
            android.view.View view = (android.view.View) arrayList.remove(0);
            defpackage.ll llVarN = defpackage.lm.n(view);
            llVarN.a = null;
            if (arrayList.size() == 0) {
                lmVar.c = Integer.MIN_VALUE;
            }
            if (llVarN.eC() || llVarN.eB()) {
                lmVar.d -= lmVar.f.b.b(view);
            }
            lmVar.b = Integer.MIN_VALUE;
            aT(viewAE, ktVar);
        }
    }

    private final void ar() {
        this.e = (this.j == 1 || !M()) ? this.d : !this.d;
    }

    private final void au(int i) {
        defpackage.jn jnVar = this.l;
        jnVar.e = i;
        jnVar.d = this.e != (i == -1) ? -1 : 1;
    }

    private final void bA(int i, la laVar) {
        int iK;
        int iK2;
        int i2;
        defpackage.jn jnVar = this.l;
        boolean z = false;
        jnVar.b = 0;
        jnVar.c = i;
        if (!be() || (i2 = laVar.a) == -1) {
            iK = 0;
            iK2 = 0;
        } else {
            boolean z2 = this.e;
            boolean z3 = i2 < i;
            kb kbVar = this.b;
            if (z2 == z3) {
                iK = kbVar.k();
                iK2 = 0;
            } else {
                iK2 = kbVar.k();
                iK = 0;
            }
        }
        android.support.v7.widget.RecyclerView recyclerView = ((kp) this).s;
        if (recyclerView == null || !recyclerView.i) {
            jnVar.g = this.b.e() + iK;
            jnVar.f = -iK2;
        } else {
            jnVar.f = this.b.j() - iK2;
            jnVar.g = this.b.f() + iK;
        }
        jnVar.h = false;
        jnVar.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z = true;
        }
        jnVar.i = z;
    }

    private final void bB(defpackage.lm lmVar, int i, int i2) {
        int i3 = lmVar.d;
        if (i == -1) {
            if (lmVar.e() + i3 <= i2) {
                this.m.set(lmVar.e, false);
            }
        } else if (lmVar.c() - i3 >= i2) {
            this.m.set(lmVar.e, false);
        }
    }

    private final boolean bC(int i) {
        int i2 = this.j;
        boolean z = i == -1;
        boolean z2 = this.e;
        if (i2 != 0) {
            if ((z == z2) != M()) {
                return false;
            }
        } else if (z == z2) {
            return false;
        }
        return true;
    }

    private final void bD(android.view.View view, int i, int i2) {
        android.graphics.Rect rect = this.G;
        aH(view, rect);
        defpackage.ll llVar = (defpackage.ll) view.getLayoutParams();
        int iBE = bE(i, llVar.leftMargin + rect.left, llVar.rightMargin + rect.right);
        int iBE2 = bE(i2, llVar.topMargin + rect.top, llVar.bottomMargin + rect.bottom);
        if (bg(view, iBE, iBE2, llVar)) {
            view.measure(iBE, iBE2);
        }
    }

    private static final int bE(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return i;
            }
            i2 = 0;
        }
        int mode = android.view.View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return i;
            }
            mode = 1073741824;
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    public final void A(int i, int i2) {
        af(i, i2, 8);
    }

    public final void B(int i, int i2) {
        af(i, i2, 2);
    }

    public final void C(int i, int i2) {
        af(i, i2, 4);
    }

    public final int D(la laVar) {
        return O(laVar);
    }

    public final int E(la laVar) {
        return R(laVar);
    }

    public final int F(la laVar) {
        return S(laVar);
    }

    public final int G(la laVar) {
        return O(laVar);
    }

    public final int H(la laVar) {
        return R(laVar);
    }

    public final int I(la laVar) {
        return S(laVar);
    }

    public final void J(boolean z) {
        X((java.lang.String) null);
        android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState = this.q;
        if (savedState != null && savedState.h != z) {
            savedState.h = z;
        }
        this.d = z;
        aW();
    }

    final void K(int i) {
        this.k = i / this.i;
        this.c.h();
    }

    public final boolean L() {
        int iC;
        if (aw() != 0 && this.n != 0 && ((kp) this).v) {
            if (this.e) {
                iC = i();
                c();
            } else {
                iC = c();
                i();
            }
            if (iC == 0 && t() != null) {
                this.h.c();
                aX();
                aW();
                return true;
            }
        }
        return false;
    }

    final boolean M() {
        return az() == 1;
    }

    public final android.graphics.PointF P(int i) {
        int iN = N(i);
        android.graphics.PointF pointF = new android.graphics.PointF();
        if (iN == 0) {
            return null;
        }
        float f = iN;
        if (this.j == 0) {
            pointF.x = f;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = f;
        return pointF;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.List] */
    public final android.os.Parcelable Q() {
        int iF;
        int iJ;
        java.lang.Object obj;
        android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState = this.q;
        if (savedState != null) {
            return new android.support.v7.widget.StaggeredGridLayoutManager.SavedState(savedState);
        }
        android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState2 = new android.support.v7.widget.StaggeredGridLayoutManager.SavedState();
        savedState2.h = this.d;
        savedState2.i = this.o;
        savedState2.j = this.p;
        defpackage.tw twVar = this.h;
        if (twVar == null || (obj = twVar.b) == null) {
            savedState2.e = 0;
        } else {
            savedState2.f = (int[]) obj;
            savedState2.e = savedState2.f.length;
            savedState2.g = twVar.a;
        }
        if (aw() > 0) {
            savedState2.a = this.o ? i() : c();
            android.view.View viewM = this.e ? m(true) : s(true);
            savedState2.b = viewM != null ? bl(viewM) : -1;
            int i = this.i;
            savedState2.c = i;
            savedState2.d = new int[i];
            for (int i2 = 0; i2 < this.i; i2++) {
                boolean z = this.o;
                defpackage.lm[] lmVarArr = this.a;
                if (z) {
                    iF = lmVarArr[i2].d(Integer.MIN_VALUE);
                    if (iF != Integer.MIN_VALUE) {
                        iJ = this.b.f();
                        iF -= iJ;
                    }
                } else {
                    iF = lmVarArr[i2].f(Integer.MIN_VALUE);
                    if (iF != Integer.MIN_VALUE) {
                        iJ = this.b.j();
                        iF -= iJ;
                    }
                }
                savedState2.d[i2] = iF;
            }
        } else {
            savedState2.a = -1;
            savedState2.b = -1;
            savedState2.c = 0;
        }
        return savedState2;
    }

    public final void X(java.lang.String str) {
        if (this.q == null) {
            super.X(str);
        }
    }

    public final void aL(int i) {
        super.aL(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    public final void aM(int i) {
        super.aM(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    public final void aP(int i) {
        if (i == 0) {
            L();
        }
    }

    public final void aa(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.aa(accessibilityEvent);
        if (aw() > 0) {
            android.view.View viewS = s(false);
            android.view.View viewM = m(false);
            if (viewS == null || viewM == null) {
                return;
            }
            int iBl = bl(viewS);
            int iBl2 = bl(viewM);
            if (iBl < iBl2) {
                accessibilityEvent.setFromIndex(iBl);
                accessibilityEvent.setToIndex(iBl2);
            } else {
                accessibilityEvent.setFromIndex(iBl2);
                accessibilityEvent.setToIndex(iBl);
            }
        }
    }

    public final void ac(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.support.v7.widget.StaggeredGridLayoutManager.SavedState) {
            android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState = (android.support.v7.widget.StaggeredGridLayoutManager.SavedState) parcelable;
            this.q = savedState;
            if (this.f != -1) {
                savedState.a();
                this.q.b();
            }
            aW();
        }
    }

    public final void ae(int i) {
        android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState = this.q;
        if (savedState != null && savedState.a != i) {
            savedState.a();
        }
        this.f = i;
        this.g = Integer.MIN_VALUE;
        aW();
    }

    public final boolean ah() {
        return this.j == 0;
    }

    public final boolean ai() {
        return this.j == 1;
    }

    public final boolean aj() {
        return this.n != 0;
    }

    public final boolean al() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final void ao(int i, int i2, la laVar, jj jjVar) {
        int iD;
        if (1 == this.j) {
            i = i2;
        }
        if (aw() == 0 || i == 0) {
            return;
        }
        x(i, laVar);
        int[] iArr = this.J;
        if (iArr != null) {
            if (iArr.length < this.i) {
                this.J = new int[this.i];
            }
        } else {
            this.J = new int[this.i];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.i; i4++) {
            defpackage.jn jnVar = this.l;
            if (jnVar.d == -1) {
                int i5 = jnVar.f;
                iD = i5 - this.a[i4].f(i5);
            } else {
                iD = this.a[i4].d(jnVar.g) - jnVar.g;
            }
            if (iD >= 0) {
                this.J[i3] = iD;
                i3++;
            }
        }
        java.util.Arrays.sort(this.J, 0, i3);
        for (int i6 = 0; i6 < i3; i6++) {
            defpackage.jn jnVar2 = this.l;
            if (!jnVar2.a(laVar)) {
                return;
            }
            jjVar.a(jnVar2.c, this.J[i6]);
            jnVar2.c += jnVar2.d;
        }
    }

    public final void as(android.support.v7.widget.RecyclerView recyclerView) {
        bu(this.K);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    public final void at(android.support.v7.widget.RecyclerView recyclerView, int i) {
        defpackage.kz kzVar = new defpackage.kz(recyclerView.getContext());
        kzVar.a = i;
        bd(kzVar);
    }

    public final void br() {
        this.h.c();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    final int c() {
        if (aw() != 0) {
            return bl(aE(0));
        }
        return 0;
    }

    public final int d(int i, kt ktVar, la laVar) {
        return l(i, ktVar, laVar);
    }

    public final int e(int i, kt ktVar, la laVar) {
        return l(i, ktVar, laVar);
    }

    public final int eD(kt ktVar, la laVar) {
        if (this.j == 1) {
            return java.lang.Math.min(this.i, laVar.a());
        }
        return -1;
    }

    public final int eE(kt ktVar, la laVar) {
        if (this.j == 0) {
            return java.lang.Math.min(this.i, laVar.a());
        }
        return -1;
    }

    public final kq eF(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.ll((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.ll(layoutParams);
    }

    public final android.view.View eG(int i, kt ktVar, la laVar) {
        int iT;
        android.view.View viewAE;
        ar();
        if (aw() == 0 || (iT = T(i)) == Integer.MIN_VALUE) {
            return null;
        }
        int i2 = 1;
        int iAw = 0;
        int iAw2 = -1;
        int iA = (iT == -1) ^ this.e ? laVar.a() - 1 : 0;
        if (V(iA) != null) {
            at(this.s, iA);
        } else {
            this.f = iA;
            ag(ktVar, laVar, true);
        }
        boolean z = this.e;
        if (iT != -1) {
            if (z) {
                iAw = aw() - 1;
                i2 = -1;
            } else {
                iAw2 = aw();
            }
            while (true) {
                if (iAw != iAw2) {
                    viewAE = aE(iAw);
                    if (viewAE != null && viewAE.hasFocusable()) {
                        break;
                    }
                    iAw += i2;
                } else {
                    viewAE = null;
                    break;
                }
            }
        } else {
            if (z) {
                iAw2 = aw();
            } else {
                iAw = aw() - 1;
                i2 = -1;
            }
            while (true) {
                if (iAw != iAw2) {
                    viewAE = aE(iAw);
                    if (viewAE != null && viewAE.hasFocusable()) {
                        break;
                    }
                    iAw += i2;
                } else {
                    viewAE = null;
                    break;
                }
            }
        }
        return (viewAE == null || !viewAE.hasFocusable()) ? Z(null, i, ktVar, laVar) : viewAE;
    }

    public final android.view.View eH(android.view.View view, int i, kt ktVar, la laVar) {
        android.view.View viewAD;
        if (aw() == 0 || (viewAD = aD(view)) == null) {
            return null;
        }
        return Z(viewAD, i, ktVar, laVar);
    }

    public final void eI(kt ktVar, la laVar, defpackage.ebd ebdVar) {
        super.eI(ktVar, laVar, ebdVar);
        ebdVar.s("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    public final void eJ(kt ktVar, la laVar, android.view.View view, defpackage.ebd ebdVar) {
        java.lang.Object layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof defpackage.ll)) {
            super.aO(view, ebdVar);
            return;
        }
        defpackage.ll llVar = (defpackage.ll) layoutParams;
        if (this.j == 0) {
            int iD = llVar.d();
            boolean z = llVar.b;
            ebdVar.v(defpackage.ni.r(iD, 1, -1, -1, false, false));
        } else {
            int iD2 = llVar.d();
            boolean z2 = llVar.b;
            ebdVar.v(defpackage.ni.r(-1, -1, iD2, 1, false, false));
        }
    }

    public final void eK(android.graphics.Rect rect, int i, int i2) {
        int iAv;
        int iAv2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j == 1) {
            iAv2 = av(i2, rect.height() + paddingTop, aA());
            iAv = av(i, (this.k * this.i) + paddingLeft, aB());
        } else {
            iAv = av(i, rect.width() + paddingLeft, aB());
            iAv2 = av(i2, (this.k * this.i) + paddingTop, aA());
        }
        ba(iAv, iAv2);
    }

    public final boolean eM() {
        return this.q == null;
    }

    public final void eN() {
        this.h.c();
        aW();
    }

    public final kq f() {
        return this.j == 0 ? new defpackage.ll(-2, -1) : new defpackage.ll(-1, -2);
    }

    public final kq h(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.ll(context, attributeSet);
    }

    final int i() {
        int iAw = aw();
        if (iAw == 0) {
            return 0;
        }
        return bl(aE(iAw - 1));
    }

    final int l(int i, kt ktVar, la laVar) {
        if (aw() == 0 || i == 0) {
            return 0;
        }
        x(i, laVar);
        defpackage.jn jnVar = this.l;
        int iU = U(ktVar, jnVar, laVar);
        if (jnVar.b >= iU) {
            i = i < 0 ? -iU : iU;
        }
        this.b.n(-i);
        this.o = this.e;
        jnVar.b = 0;
        ak(ktVar, jnVar);
        return i;
    }

    final android.view.View m(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        android.view.View view = null;
        for (int iAw = aw() - 1; iAw >= 0; iAw--) {
            android.view.View viewAE = aE(iAw);
            int iD = this.b.d(viewAE);
            int iA = this.b.a(viewAE);
            if (iA > iJ && iD < iF) {
                if (iA <= iF || !z) {
                    return viewAE;
                }
                if (view == null) {
                    view = viewAE;
                }
            }
        }
        return view;
    }

    public final void p(kt ktVar, la laVar) {
        ag(ktVar, laVar, true);
    }

    public final void q(la laVar) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.q = null;
        this.H.a();
    }

    final android.view.View s(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        int iAw = aw();
        android.view.View view = null;
        for (int i = 0; i < iAw; i++) {
            android.view.View viewAE = aE(i);
            int iD = this.b.d(viewAE);
            if (this.b.a(viewAE) > iJ && iD < iF) {
                if (iD >= iJ || !z) {
                    return viewAE;
                }
                if (view == null) {
                    view = viewAE;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x002c A[SYNTHETIC] */
    final android.view.View t() {
        int iAw = aw();
        int i = iAw - 1;
        java.util.BitSet bitSet = new java.util.BitSet(this.i);
        bitSet.set(0, this.i, true);
        int i2 = (this.j == 1 && M()) ? 1 : -1;
        if (this.e) {
            iAw = -1;
        } else {
            i = 0;
        }
        int i3 = i >= iAw ? -1 : 1;
        while (i != iAw) {
            android.view.View viewAE = aE(i);
            defpackage.ll llVar = (defpackage.ll) viewAE.getLayoutParams();
            if (bitSet.get(llVar.a.e)) {
                defpackage.lm lmVar = llVar.a;
                if (this.e) {
                    if (lmVar.c() < this.b.f()) {
                        java.util.ArrayList arrayList = lmVar.a;
                        boolean z = defpackage.lm.n((android.view.View) arrayList.get(arrayList.size() - 1)).b;
                        return viewAE;
                    }
                } else if (lmVar.e() > this.b.j()) {
                    boolean z2 = defpackage.lm.n((android.view.View) lmVar.a.get(0)).b;
                    return viewAE;
                }
                bitSet.clear(llVar.a.e);
            }
            boolean z3 = llVar.b;
            i += i3;
            if (i != iAw) {
                android.view.View viewAE2 = aE(i);
                boolean z4 = this.e;
                kb kbVar = this.b;
                if (z4) {
                    int iA = kbVar.a(viewAE);
                    int iA2 = this.b.a(viewAE2);
                    if (iA < iA2) {
                        return viewAE;
                    }
                    if (iA == iA2) {
                        if (((llVar.a.e - ((defpackage.ll) viewAE2.getLayoutParams()).a.e) >>> 31) == (i2 >>> 31)) {
                            return viewAE;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iD = kbVar.d(viewAE);
                    int iD2 = this.b.d(viewAE2);
                    if (iD > iD2) {
                        return viewAE;
                    }
                    if (iD == iD2) {
                        if (((llVar.a.e - ((defpackage.ll) viewAE2.getLayoutParams()).a.e) >>> 31) == (i2 >>> 31)) {
                            return viewAE;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final boolean u(kq kqVar) {
        return kqVar instanceof defpackage.ll;
    }

    final void x(int i, la laVar) {
        int iC;
        int i2;
        if (i > 0) {
            iC = i();
            i2 = 1;
        } else {
            iC = c();
            i2 = -1;
        }
        defpackage.jn jnVar = this.l;
        jnVar.a = true;
        bA(iC, laVar);
        au(i2);
        jnVar.c = iC + jnVar.d;
        jnVar.b = java.lang.Math.abs(i);
    }

    public final void y(int i, int i2) {
        af(i, i2, 1);
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(10);
        int a;
        int b;
        int c;
        int[] d;
        int e;
        int[] f;
        java.util.List g;
        boolean h;
        boolean i;
        boolean j;

        public SavedState(android.os.Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            int i = parcel.readInt();
            this.c = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.e = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.g = parcel.readArrayList(android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        }

        final void a() {
            this.d = null;
            this.c = 0;
            this.a = -1;
            this.b = -1;
        }

        final void b() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }

        public SavedState(android.support.v7.widget.StaggeredGridLayoutManager.SavedState savedState) {
            this.c = savedState.c;
            this.a = savedState.a;
            this.b = savedState.b;
            this.d = savedState.d;
            this.e = savedState.e;
            this.f = savedState.f;
            this.h = savedState.h;
            this.i = savedState.i;
            this.j = savedState.j;
            this.g = savedState.g;
        }

        public SavedState() {
        }
    }
}
