package android.support.v7.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class GridLayoutManager extends android.support.v7.widget.LinearLayoutManager {
    private static final java.util.Set G = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(17, 66, 33, 130)));
    private int H;
    boolean a;
    int b;
    int[] c;
    android.view.View[] d;
    final android.util.SparseIntArray e;
    final android.util.SparseIntArray f;
    final android.graphics.Rect g;
    int h;
    int i;
    final vx j;

    public GridLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new android.util.SparseIntArray();
        this.f = new android.util.SparseIntArray();
        this.j = new vx((byte[]) null);
        this.g = new android.graphics.Rect();
        this.H = -1;
        this.h = -1;
        this.i = -1;
        s(aC(context, attributeSet, i, i2).b);
    }

    private final int bA(int i) {
        int i2 = this.k;
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        return i2 == 0 ? bC(recyclerView.e, recyclerView.L, i) : bD(recyclerView.e, recyclerView.L, i);
    }

    private final int bB(int i) {
        int i2 = this.k;
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        return i2 == 1 ? bC(recyclerView.e, recyclerView.L, i) : bD(recyclerView.e, recyclerView.L, i);
    }

    private final int bC(kt ktVar, la laVar, int i) {
        if (laVar.g) {
            int iA = ktVar.a(i);
            if (iA == -1) {
                android.util.Log.w("GridLayoutManager", a.bj(i, "Cannot find span size for pre layout position. "));
                return 0;
            }
            i = iA;
        }
        int i2 = this.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3++;
            if (i4 >= i) {
                break;
            }
            if (i3 == i2) {
                i5++;
                i3 = 0;
            } else if (i3 > i2) {
                i5++;
                i3 = 1;
            }
            i4++;
        }
        return i3 > i2 ? i5 + 1 : i5;
    }

    private final int bD(kt ktVar, la laVar, int i) {
        if (!laVar.g) {
            return i % this.b;
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA = ktVar.a(i);
        if (iA != -1) {
            return iA % this.b;
        }
        android.util.Log.w("GridLayoutManager", a.bj(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 0;
    }

    private final int bE(kt ktVar, la laVar, int i) {
        if (!laVar.g) {
            return 1;
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (ktVar.a(i) != -1) {
            return 1;
        }
        android.util.Log.w("GridLayoutManager", a.bj(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 1;
    }

    private final android.view.View bF(android.view.View view, int i, kt ktVar, la laVar) {
        int i2;
        int i3;
        int iAw;
        int i4;
        int iAw2;
        int i5;
        android.view.View view2 = view;
        kt ktVar2 = ktVar;
        la laVar2 = laVar;
        if (view2 != null) {
            defpackage.jm jmVar = (defpackage.jm) view2.getLayoutParams();
            i3 = jmVar.a;
            i2 = jmVar.b + i3;
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (super.W(i, ktVar2, laVar2) == null) {
            return null;
        }
        int i6 = -1;
        if ((J(i) == 1) != this.m) {
            iAw2 = aw() - 1;
            iAw = -1;
            i4 = -1;
        } else {
            iAw = aw();
            i4 = 1;
            iAw2 = 0;
        }
        boolean z = this.k == 1 && ak();
        int iBC = bC(ktVar2, laVar2, iAw2);
        int i7 = -1;
        int iMin = 0;
        int iMin2 = 0;
        android.view.View view3 = null;
        android.view.View view4 = null;
        while (iAw2 != iAw) {
            int iBC2 = bC(ktVar2, laVar2, iAw2);
            android.view.View viewAE = aE(iAw2);
            if (viewAE == view2) {
                break;
            }
            if (viewAE.hasFocusable() && iBC2 != iBC) {
                if (view3 != null) {
                    break;
                }
                i5 = iAw2;
                view3 = null;
            } else {
                defpackage.jm jmVar2 = (defpackage.jm) viewAE.getLayoutParams();
                int i8 = jmVar2.a;
                i5 = iAw2;
                int i9 = jmVar2.b + i8;
                if (view != null && viewAE.hasFocusable() && i8 == i3 && i9 == i2) {
                    return viewAE;
                }
                if (viewAE.hasFocusable() && view3 == null) {
                    view3 = null;
                } else if (viewAE.hasFocusable() || view4 != null) {
                    if (view != null) {
                        int iMin3 = java.lang.Math.min(i9, i2) - java.lang.Math.max(i8, i3);
                        if (viewAE.hasFocusable()) {
                            if (iMin3 <= iMin) {
                                if (iMin3 == iMin) {
                                    if (z == (i8 > i6)) {
                                    }
                                }
                            }
                        } else if (view3 == null && bp(viewAE)) {
                            if (iMin3 <= iMin2) {
                                if (iMin3 == iMin2) {
                                    if (z == (i8 > i7)) {
                                    }
                                }
                            }
                        }
                    } else if (viewAE.hasFocusable()) {
                        if (z == (i8 > i6)) {
                        }
                    } else if (view3 == null && bp(viewAE)) {
                        if (z == (i8 > i7)) {
                        }
                    }
                }
                if (viewAE.hasFocusable()) {
                    int i10 = jmVar2.a;
                    iMin = java.lang.Math.min(i9, i2) - java.lang.Math.max(i8, i3);
                    view3 = viewAE;
                    i6 = i10;
                } else {
                    int i11 = jmVar2.a;
                    iMin2 = java.lang.Math.min(i9, i2) - java.lang.Math.max(i8, i3);
                    view4 = viewAE;
                    i7 = i11;
                }
            }
            iAw2 = i5 + i4;
            view2 = view;
            ktVar2 = ktVar;
            laVar2 = laVar;
        }
        return view3 != null ? view3 : view4;
    }

    private final java.util.Set bG(int i) {
        return bI(bA(i), i);
    }

    private final java.util.Set bH(int i) {
        return bI(bB(i), i);
    }

    private final java.util.Set bI(int i, int i2) {
        java.util.HashSet hashSet = new java.util.HashSet();
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        int iBE = bE(recyclerView.e, recyclerView.L, i2);
        for (int i3 = i; i3 < i + iBE; i3++) {
            hashSet.add(java.lang.Integer.valueOf(i3));
        }
        return hashSet;
    }

    private final void bJ(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = i3 + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 <= 0 || i3 - i5 >= i7) {
                i2 = i6;
            } else {
                i2 = i6 + 1;
                i5 -= i3;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.c = iArr;
    }

    private final void bK() {
        android.view.View[] viewArr = this.d;
        if (viewArr != null) {
            if (viewArr.length == this.b) {
                return;
            }
        }
        this.d = new android.view.View[this.b];
    }

    private final void bL(android.view.View view, int i, boolean z) {
        int iAx;
        int iAx2;
        defpackage.jm jmVar = (defpackage.jm) view.getLayoutParams();
        android.graphics.Rect rect = jmVar.d;
        int i2 = rect.top + rect.bottom + jmVar.topMargin + jmVar.bottomMargin;
        int i3 = rect.left + rect.right + jmVar.leftMargin + jmVar.rightMargin;
        int iC = c(jmVar.a, jmVar.b);
        if (this.k == 1) {
            iAx2 = ax(iC, i, i3, jmVar.width, false);
            iAx = ax(this.l.k(), ((kp) this).B, i2, jmVar.height, true);
        } else {
            int iAx3 = ax(iC, i, i2, jmVar.height, false);
            int iAx4 = ax(this.l.k(), ((kp) this).A, i3, jmVar.width, true);
            iAx = iAx3;
            iAx2 = iAx4;
        }
        bM(view, iAx2, iAx, z);
    }

    private final void bM(android.view.View view, int i, int i2, boolean z) {
        boolean zBg;
        kq layoutParams = view.getLayoutParams();
        if (z) {
            zBg = true;
            if (((kp) this).w && afsq.bI(view.getMeasuredWidth(), i, layoutParams.width) && afsq.bI(view.getMeasuredHeight(), i2, layoutParams.height)) {
                zBg = false;
            }
        } else {
            zBg = bg(view, i, i2, layoutParams);
        }
        if (zBg) {
            view.measure(i, i2);
        }
    }

    private final void bN() {
        int paddingBottom;
        int paddingTop;
        if (((android.support.v7.widget.LinearLayoutManager) this).k == 1) {
            paddingBottom = ((kp) this).C - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = ((kp) this).D - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        bJ(paddingBottom - paddingTop);
    }

    public final void A(int i, int i2) {
        vx vxVar = this.j;
        vxVar.g();
        vxVar.f();
    }

    public final void B(int i, int i2) {
        vx vxVar = this.j;
        vxVar.g();
        vxVar.f();
    }

    public final void C(int i, int i2) {
        vx vxVar = this.j;
        vxVar.g();
        vxVar.f();
    }

    final int c(int i, int i2) {
        if (this.k != 1 || !ak()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    public final int d(int i, kt ktVar, la laVar) {
        bN();
        bK();
        return super.d(i, ktVar, laVar);
    }

    public final int e(int i, kt ktVar, la laVar) {
        bN();
        bK();
        return super.e(i, ktVar, laVar);
    }

    public final int eD(kt ktVar, la laVar) {
        if (this.k == 1) {
            return java.lang.Math.min(this.b, ay());
        }
        if (laVar.a() <= 0) {
            return 0;
        }
        return bC(ktVar, laVar, laVar.a() - 1) + 1;
    }

    public final int eE(kt ktVar, la laVar) {
        if (this.k == 0) {
            return java.lang.Math.min(this.b, ay());
        }
        if (laVar.a() <= 0) {
            return 0;
        }
        return bC(ktVar, laVar, laVar.a() - 1) + 1;
    }

    public final kq eF(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.jm((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.jm(layoutParams);
    }

    public final android.view.View eG(int i, kt ktVar, la laVar) {
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
            p(ktVar, laVar);
        }
        android.view.View viewR = iJ == -1 ? R() : S();
        return (viewR == null || !viewR.hasFocusable()) ? bF(null, i, ktVar, laVar) : viewR;
    }

    public final android.view.View eH(android.view.View view, int i, kt ktVar, la laVar) {
        android.view.View viewAD = aD(view);
        if (viewAD == null) {
            return null;
        }
        return bF(viewAD, i, ktVar, laVar);
    }

    public final void eI(kt ktVar, la laVar, defpackage.ebd ebdVar) {
        super.eI(ktVar, laVar, ebdVar);
        ebdVar.s(android.widget.GridView.class.getName());
        kh khVar = this.s.m;
        if (khVar == null || khVar.a() <= 1) {
            return;
        }
        ebdVar.i(defpackage.ebc.r);
    }

    public void eJ(kt ktVar, la laVar, android.view.View view, defpackage.ebd ebdVar) {
        java.lang.Object layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof defpackage.jm)) {
            super.aO(view, ebdVar);
            return;
        }
        defpackage.jm jmVar = (defpackage.jm) layoutParams;
        int iBC = bC(ktVar, laVar, jmVar.eA());
        if (this.k == 0) {
            ebdVar.v(defpackage.ni.r(jmVar.a, jmVar.b, iBC, 1, false, false));
        } else {
            ebdVar.v(defpackage.ni.r(iBC, 1, jmVar.a, jmVar.b, false, false));
        }
    }

    public final void eK(android.graphics.Rect rect, int i, int i2) {
        int iAv;
        int iAv2;
        if (this.c == null) {
            super.eK(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.k == 1) {
            iAv2 = av(i2, rect.height() + paddingTop, aA());
            int[] iArr = this.c;
            iAv = av(i, iArr[iArr.length - 1] + paddingLeft, aB());
        } else {
            iAv = av(i, rect.width() + paddingLeft, aB());
            int[] iArr2 = this.c;
            iAv2 = av(i2, iArr2[iArr2.length - 1] + paddingTop, aA());
        }
        ba(iAv, iAv2);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x024e A[EDGE_INSN: B:145:0x024e->B:146:0x024f BREAK  A[LOOP:2: B:111:0x0194->B:119:0x01bc]] */
    /* JADX WARN: Code duplicated, block: B:152:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x0260  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a7  */
    public final boolean eL(int i, android.os.Bundle bundle) {
        int i2;
        android.view.View viewAE;
        ld ldVarH;
        int iIntValue;
        int i3 = -1;
        if (i != defpackage.ebc.r.a()) {
            if (i == 16908343) {
                if (bundle != null) {
                    i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                    int i4 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                    if (i2 == -1 && i4 != -1) {
                        int iA = this.s.m.a();
                        for (int i5 = 0; i5 < iA; i5++) {
                            android.support.v7.widget.RecyclerView recyclerView = this.s;
                            int iBD = bD(recyclerView.e, recyclerView.L, i5);
                            android.support.v7.widget.RecyclerView recyclerView2 = this.s;
                            int iBC = bC(recyclerView2.e, recyclerView2.L, i5);
                            if (this.k != 1) {
                                if (iBD == i2 && iBC == i4) {
                                    i3 = i5;
                                    break;
                                }
                            } else {
                                if (iBD == i4 && iBC == i2) {
                                    i3 = i5;
                                    break;
                                }
                            }
                        }
                        if (i3 < 0) {
                            return false;
                        }
                        au(i3);
                    }
                } else {
                    i = 16908343;
                }
            }
            return super.eL(i, bundle);
        }
        if (i == -1) {
            i = -1;
            if (i == 16908343) {
                if (bundle != null) {
                    i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                    int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                    return i2 == -1 ? false : false;
                }
                i = 16908343;
            }
            return super.eL(i, bundle);
        }
        int i7 = 0;
        while (true) {
            if (i7 >= aw()) {
                viewAE = null;
                break;
            }
            if (((android.view.View) j$.util.Objects.requireNonNull(aE(i7))).isAccessibilityFocused()) {
                viewAE = aE(i7);
                break;
            }
            i7++;
        }
        if (viewAE == null || bundle == null) {
            return false;
        }
        int i8 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!G.contains(java.lang.Integer.valueOf(i8)) || (ldVarH = this.s.h(viewAE)) == null) {
            return false;
        }
        int iA2 = ldVarH.a();
        int iBB = bB(iA2);
        int iBA = bA(iA2);
        if (iBB < 0 || iBA < 0) {
            return false;
        }
        if (!bH(iA2).contains(java.lang.Integer.valueOf(this.h)) || !bG(iA2).contains(java.lang.Integer.valueOf(this.i))) {
            this.h = iBB;
            this.i = iBA;
        }
        int i9 = this.h;
        if (i9 == -1) {
            i9 = iBB;
        }
        int i10 = this.i;
        if (i10 != -1) {
            iBA = i10;
        }
        if (i8 == 17) {
            iIntValue = iA2 - 1;
            while (true) {
                if (iIntValue >= 0) {
                    int iBB2 = bB(iIntValue);
                    int iBA2 = bA(iIntValue);
                    if (iBB2 >= 0 && iBA2 >= 0) {
                        if (this.k != 1) {
                            if (bH(iIntValue).contains(java.lang.Integer.valueOf(i9)) && iBA2 < iBA) {
                                this.i = iBA2;
                                break;
                            }
                            iIntValue--;
                        } else {
                            if ((iBB2 == i9 && iBA2 < iBA) || iBB2 < i9) {
                                this.h = iBB2;
                                this.i = iBA2;
                                break;
                            }
                            iIntValue--;
                        }
                    }
                }
                iIntValue = -1;
                break;
            }
        }
        if (i8 == 33) {
            iIntValue = iA2 - 1;
            while (true) {
                if (iIntValue >= 0) {
                    int iBB3 = bB(iIntValue);
                    int iBA3 = bA(iIntValue);
                    if (iBB3 >= 0 && iBA3 >= 0) {
                        if (this.k != 1) {
                            if (iBB3 < i9 && iBA3 == iBA) {
                                this.h = ((java.lang.Integer) java.util.Collections.max(bH(iIntValue))).intValue();
                                break;
                            }
                            iIntValue--;
                        } else {
                            if (iBB3 < i9 && bG(iIntValue).contains(java.lang.Integer.valueOf(iBA))) {
                                this.h = iBB3;
                                break;
                            }
                            iIntValue--;
                        }
                    }
                }
                iIntValue = -1;
                break;
            }
        }
        if (i8 == 66) {
            iIntValue = iA2 + 1;
            while (true) {
                if (iIntValue < ay()) {
                    int iBB4 = bB(iIntValue);
                    int iBA4 = bA(iIntValue);
                    if (iBB4 >= 0 && iBA4 >= 0) {
                        if (this.k != 1) {
                            if (iBA4 > iBA && bH(iIntValue).contains(java.lang.Integer.valueOf(i9))) {
                                this.i = iBA4;
                                break;
                            }
                            iIntValue++;
                        } else {
                            if ((iBB4 == i9 && iBA4 > iBA) || iBB4 > i9) {
                                this.h = iBB4;
                                this.i = iBA4;
                                break;
                            }
                            iIntValue++;
                        }
                    }
                }
                iIntValue = -1;
                break;
            }
        }
        if (i8 != 130) {
            return false;
        }
        iIntValue = iA2 + 1;
        while (true) {
            if (iIntValue < ay()) {
                int iBB5 = bB(iIntValue);
                int iBA5 = bA(iIntValue);
                if (iBB5 >= 0 && iBA5 >= 0) {
                    if (this.k != 1) {
                        if (iBB5 > i9 && iBA5 == iBA) {
                            this.h = bB(iIntValue);
                            break;
                        }
                        iIntValue++;
                    } else {
                        if (iBB5 > i9 && (iBA5 == iBA || bG(iIntValue).contains(java.lang.Integer.valueOf(iBA)))) {
                            this.h = iBB5;
                            break;
                        }
                        iIntValue++;
                    }
                }
            }
            iIntValue = -1;
            break;
        }
        if (iIntValue == -1) {
            if (this.k == 0) {
                if (i8 != 17) {
                    if (i8 != 66) {
                        iIntValue = -1;
                        break;
                    }
                    java.util.TreeMap treeMap = new java.util.TreeMap();
                    int i11 = 0;
                    loop5: while (true) {
                        if (i11 < ay()) {
                            java.util.Iterator it = bH(i11).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    java.lang.Integer num = (java.lang.Integer) it.next();
                                    if (num.intValue() >= 0) {
                                        if (!treeMap.containsKey(num)) {
                                            treeMap.put(num, java.lang.Integer.valueOf(i11));
                                        }
                                    }
                                } else {
                                    i11++;
                                }
                            }
                        } else {
                            java.util.Iterator it2 = treeMap.keySet().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    java.lang.Integer num2 = (java.lang.Integer) it2.next();
                                    int iIntValue2 = num2.intValue();
                                    if (iIntValue2 > iBB) {
                                        iIntValue = ((java.lang.Integer) treeMap.get(num2)).intValue();
                                        this.h = iIntValue2;
                                        this.i = 0;
                                        break;
                                    }
                                }
                            }
                        }
                        iIntValue = -1;
                        break;
                    }
                }
                java.util.TreeMap treeMap2 = new java.util.TreeMap(java.util.Collections.reverseOrder());
                int i12 = 0;
                loop2: while (true) {
                    if (i12 < ay()) {
                        java.util.Iterator it3 = bH(i12).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                java.lang.Integer num3 = (java.lang.Integer) it3.next();
                                if (num3.intValue() >= 0) {
                                    treeMap2.put(num3, java.lang.Integer.valueOf(i12));
                                }
                            } else {
                                i12++;
                            }
                        }
                    } else {
                        java.util.Iterator it4 = treeMap2.keySet().iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                java.lang.Integer num4 = (java.lang.Integer) it4.next();
                                int iIntValue3 = num4.intValue();
                                if (iIntValue3 < iBB) {
                                    iIntValue = ((java.lang.Integer) treeMap2.get(num4)).intValue();
                                    this.h = iIntValue3;
                                    this.i = bA(iIntValue);
                                    break;
                                }
                            }
                        }
                    }
                    iIntValue = -1;
                    break;
                }
            }
            iIntValue = -1;
            break;
        }
        if (iIntValue == -1) {
            return false;
        }
        ae(iIntValue);
        this.H = iIntValue;
        return true;
    }

    public final boolean eM() {
        return this.p == null && !this.a;
    }

    public final void eN() {
        vx vxVar = this.j;
        vxVar.g();
        vxVar.f();
    }

    public final kq f() {
        return this.k == 0 ? new defpackage.jm(-2, -1) : new defpackage.jm(-1, -2);
    }

    public final kq h(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.jm(context, attributeSet);
    }

    public final android.view.View i(kt ktVar, la laVar, boolean z, boolean z2) {
        int i;
        int iAw;
        int i2;
        int iAw2 = aw();
        if (z2) {
            i = -1;
            iAw = aw() - 1;
            i2 = -1;
        } else {
            i = iAw2;
            iAw = 0;
            i2 = 1;
        }
        int iA = laVar.a();
        Z();
        int iJ = this.l.j();
        int iF = this.l.f();
        android.view.View view = null;
        android.view.View view2 = null;
        while (iAw != i) {
            android.view.View viewAE = aE(iAw);
            int iBl = bl(viewAE);
            if (iBl >= 0 && iBl < iA && bD(ktVar, laVar, iBl) == 0) {
                if (viewAE.getLayoutParams().eC()) {
                    if (view2 == null) {
                        view2 = viewAE;
                    }
                } else {
                    if (this.l.d(viewAE) < iF && this.l.a(viewAE) >= iJ) {
                        return viewAE;
                    }
                    if (view == null) {
                        view = viewAE;
                    }
                }
            }
            iAw += i2;
        }
        return view == null ? view2 : view;
    }

    public final void l(kt ktVar, la laVar, js jsVar, jr jrVar) {
        int i;
        int i2;
        int i3;
        int iC;
        int paddingLeft;
        int i4;
        int iAx;
        int iAx2;
        boolean z;
        android.view.View viewA;
        int i5 = this.l.i();
        int i6 = aw() > 0 ? this.c[this.b] : 0;
        boolean z2 = i5 != 1073741824;
        if (z2) {
            bN();
        }
        int i7 = jsVar.e;
        int iBD = this.b;
        if (i7 != 1) {
            iBD = bD(ktVar, laVar, jsVar.d) + bE(ktVar, laVar, jsVar.d);
        }
        int i8 = 0;
        while (i8 < this.b && jsVar.c(laVar) && iBD > 0) {
            int i9 = jsVar.d;
            int iBE = bE(ktVar, laVar, i9);
            if (iBE > this.b) {
                throw new java.lang.IllegalArgumentException("Item at position " + i9 + " requires " + iBE + " spans but GridLayoutManager has only " + this.b + " spans.");
            }
            iBD -= iBE;
            if (iBD < 0 || (viewA = jsVar.a(ktVar)) == null) {
                break;
            }
            this.d[i8] = viewA;
            i8++;
        }
        if (i8 == 0) {
            jrVar.b = true;
            return;
        }
        if (i7 == 1) {
            i3 = 1;
            i2 = i8;
            i = 0;
        } else {
            i = i8 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i10 = 0;
        while (i != i2) {
            android.view.View view = this.d[i];
            defpackage.jm jmVar = (defpackage.jm) view.getLayoutParams();
            int iBE2 = bE(ktVar, laVar, bl(view));
            jmVar.b = iBE2;
            jmVar.a = i10;
            i10 += iBE2;
            i += i3;
        }
        float f = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            android.view.View view2 = this.d[i12];
            if (jsVar.l != null) {
                z = false;
                if (i7 == 1) {
                    super/*kp*/.aG(view2, -1, true);
                } else {
                    super/*kp*/.aG(view2, 0, true);
                }
            } else if (i7 == 1) {
                z = false;
                super/*kp*/.aG(view2, -1, false);
            } else {
                z = false;
                super/*kp*/.aG(view2, 0, false);
            }
            aH(view2, this.g);
            bL(view2, i5, z);
            int iB = this.l.b(view2);
            if (iB > i11) {
                i11 = iB;
            }
            float fC = this.l.c(view2) / ((defpackage.jm) view2.getLayoutParams()).b;
            if (fC > f) {
                f = fC;
            }
        }
        if (z2) {
            bJ(java.lang.Math.max(java.lang.Math.round(f * this.b), i6));
            i11 = 0;
            for (int i13 = 0; i13 < i8; i13++) {
                android.view.View view3 = this.d[i13];
                bL(view3, 1073741824, true);
                int iB2 = this.l.b(view3);
                if (iB2 > i11) {
                    i11 = iB2;
                }
            }
        }
        for (int i14 = 0; i14 < i8; i14++) {
            android.view.View view4 = this.d[i14];
            if (this.l.b(view4) != i11) {
                defpackage.jm jmVar2 = (defpackage.jm) view4.getLayoutParams();
                android.graphics.Rect rect = jmVar2.d;
                int i15 = rect.top + rect.bottom + jmVar2.topMargin + jmVar2.bottomMargin;
                int i16 = rect.left + rect.right + jmVar2.leftMargin + jmVar2.rightMargin;
                int iC2 = c(jmVar2.a, jmVar2.b);
                if (this.k == 1) {
                    iAx2 = ax(iC2, 1073741824, i16, jmVar2.width, false);
                    iAx = android.view.View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                } else {
                    int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i11 - i16, 1073741824);
                    iAx = ax(iC2, 1073741824, i15, jmVar2.height, false);
                    iAx2 = iMakeMeasureSpec;
                }
                bM(view4, iAx2, iAx, true);
            }
        }
        int iC3 = 0;
        jrVar.a = i11;
        if (this.k == 1) {
            if (jsVar.f == -1) {
                int i17 = jsVar.b;
                i4 = i17 - i11;
                iC3 = i17;
            } else {
                i4 = jsVar.b;
                iC3 = i4 + i11;
            }
            paddingLeft = 0;
            iC = 0;
        } else {
            if (jsVar.f == -1) {
                int i18 = jsVar.b;
                paddingLeft = i18 - i11;
                iC = i18;
            } else {
                int i19 = jsVar.b;
                iC = i19 + i11;
                paddingLeft = i19;
            }
            i4 = iC3;
        }
        int i20 = 0;
        while (true) {
            android.view.View[] viewArr = this.d;
            if (i20 >= i8) {
                java.util.Arrays.fill(viewArr, (java.lang.Object) null);
                return;
            }
            android.view.View view5 = viewArr[i20];
            defpackage.jm jmVar3 = (defpackage.jm) view5.getLayoutParams();
            if (this.k != 1) {
                int paddingTop = getPaddingTop() + this.c[jmVar3.a];
                i4 = paddingTop;
                iC3 = this.l.c(view5) + paddingTop;
            } else if (ak()) {
                int paddingLeft2 = getPaddingLeft() + this.c[this.b - jmVar3.a];
                iC = paddingLeft2;
                paddingLeft = paddingLeft2 - this.l.c(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.c[jmVar3.a];
                iC = this.l.c(view5) + paddingLeft;
            }
            bq(view5, paddingLeft, i4, iC, iC3);
            if (jmVar3.eC() || jmVar3.eB()) {
                jrVar.c = true;
            }
            jrVar.d |= view5.hasFocusable();
            i20++;
        }
    }

    public final void m(kt ktVar, la laVar, jq jqVar, int i) {
        bN();
        if (laVar.a() > 0 && !laVar.g) {
            int iBD = bD(ktVar, laVar, jqVar.b);
            if (i == 1) {
                while (iBD > 0) {
                    int i2 = jqVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    jqVar.b = i3;
                    iBD = bD(ktVar, laVar, i3);
                }
            } else {
                int iA = laVar.a() - 1;
                int i4 = jqVar.b;
                while (i4 < iA) {
                    int i5 = i4 + 1;
                    int iBD2 = bD(ktVar, laVar, i5);
                    if (iBD2 <= iBD) {
                        break;
                    }
                    i4 = i5;
                    iBD = iBD2;
                }
                jqVar.b = i4;
            }
        }
        bK();
    }

    public final void p(kt ktVar, la laVar) {
        if (laVar.g) {
            int iAw = aw();
            for (int i = 0; i < iAw; i++) {
                defpackage.jm jmVar = (defpackage.jm) aE(i).getLayoutParams();
                int iEA = jmVar.eA();
                this.e.put(iEA, jmVar.b);
                this.f.put(iEA, jmVar.a);
            }
        }
        super.ab(ktVar, laVar);
        this.e.clear();
        this.f.clear();
    }

    public final void q(la laVar) {
        android.view.View viewV;
        super.q(laVar);
        this.a = false;
        int i = this.H;
        if (i == -1 || (viewV = V(i)) == null) {
            return;
        }
        viewV.sendAccessibilityEvent(67108864);
        this.H = -1;
    }

    public final void s(int i) {
        if (i != this.b) {
            this.a = true;
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException(a.bj(i, "Span count should be at least 1. Provided "));
            }
            this.b = i;
            this.j.g();
            aW();
        }
    }

    public final void t(boolean z) {
        if (z) {
            throw new java.lang.UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.t(false);
    }

    public final boolean u(kq kqVar) {
        return kqVar instanceof defpackage.jm;
    }

    public final void x(la laVar, js jsVar, jj jjVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && jsVar.c(laVar) && i > 0; i2++) {
            jjVar.a(jsVar.d, java.lang.Math.max(0, jsVar.g));
            i--;
            jsVar.d += jsVar.e;
        }
    }

    public final void y(int i, int i2) {
        vx vxVar = this.j;
        vxVar.g();
        vxVar.f();
    }

    public GridLayoutManager(int i) {
        super(1, true);
        this.a = false;
        this.b = -1;
        this.e = new android.util.SparseIntArray();
        this.f = new android.util.SparseIntArray();
        this.j = new vx((byte[]) null);
        this.g = new android.graphics.Rect();
        this.H = -1;
        this.h = -1;
        this.i = -1;
        s(i);
    }

    public GridLayoutManager() {
        super(1, false);
        this.a = false;
        this.b = -1;
        this.e = new android.util.SparseIntArray();
        this.f = new android.util.SparseIntArray();
        this.j = new vx((byte[]) null);
        this.g = new android.graphics.Rect();
        this.H = -1;
        this.h = -1;
        this.i = -1;
        s(3);
    }
}
