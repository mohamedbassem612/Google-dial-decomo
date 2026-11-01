package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zvf {
    public final defpackage.zvc a;
    public int[] b;
    public long[] c;
    private boolean[] d;
    private long[] e;

    public zvf(defpackage.zvc zvcVar) {
        this.a = zvcVar;
    }

    private static final int A(com.google.android.flexbox.FlexItem flexItem, boolean z) {
        return z ? flexItem.i() : flexItem.g();
    }

    private static final int B(com.google.android.flexbox.FlexItem flexItem, boolean z) {
        return z ? flexItem.g() : flexItem.i();
    }

    private static final int C(com.google.android.flexbox.FlexItem flexItem, boolean z) {
        return z ? flexItem.e() : flexItem.o();
    }

    private static final int D(android.view.View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private static final boolean E(int i, int i2, defpackage.zvd zvdVar) {
        return i == i2 + (-1) && zvdVar.a() != 0;
    }

    static final long k(int i, int i2) {
        return (((long) i2) << 32) | (((long) i) & 4294967295L);
    }

    public static final int l(long j) {
        return (int) (j >> 32);
    }

    public static final int[] m(int i, java.util.List list, android.util.SparseIntArray sparseIntArray) {
        java.util.Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        java.util.Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            defpackage.zve zveVar = (defpackage.zve) it.next();
            int i3 = zveVar.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, zveVar.b);
            i2++;
        }
        return iArr;
    }

    private final int o(int i, com.google.android.flexbox.FlexItem flexItem, int i2) {
        defpackage.zvc zvcVar = this.a;
        int iC = zvcVar.c(i, zvcVar.getPaddingTop() + zvcVar.getPaddingBottom() + flexItem.i() + flexItem.f() + i2, flexItem.e());
        int size = android.view.View.MeasureSpec.getSize(iC);
        if (size > flexItem.j()) {
            return android.view.View.MeasureSpec.makeMeasureSpec(flexItem.j(), android.view.View.MeasureSpec.getMode(iC));
        }
        return size < flexItem.l() ? android.view.View.MeasureSpec.makeMeasureSpec(flexItem.l(), android.view.View.MeasureSpec.getMode(iC)) : iC;
    }

    private final int p(int i, com.google.android.flexbox.FlexItem flexItem, int i2) {
        defpackage.zvc zvcVar = this.a;
        int iG = zvcVar.g(i, zvcVar.getPaddingLeft() + zvcVar.getPaddingRight() + flexItem.g() + flexItem.h() + i2, flexItem.o());
        int size = android.view.View.MeasureSpec.getSize(iG);
        if (size > flexItem.k()) {
            return android.view.View.MeasureSpec.makeMeasureSpec(flexItem.k(), android.view.View.MeasureSpec.getMode(iG));
        }
        return size < flexItem.m() ? android.view.View.MeasureSpec.makeMeasureSpec(flexItem.m(), android.view.View.MeasureSpec.getMode(iG)) : iG;
    }

    private final void q(java.util.List list, defpackage.zvd zvdVar, int i, int i2) {
        zvdVar.m = i2;
        this.a.x(zvdVar);
        zvdVar.p = i;
        list.add(zvdVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private final void r(android.view.View view, int i) {
        boolean z;
        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= flexItem.m()) {
            if (measuredWidth > flexItem.k()) {
                measuredWidth = flexItem.k();
            } else {
                z = false;
            }
            if (measuredHeight < flexItem.l()) {
                measuredHeight = flexItem.l();
            } else if (measuredHeight > flexItem.j()) {
                measuredHeight = flexItem.j();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                w(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.a.J(i, view);
            }
        }
        measuredWidth = flexItem.m();
        z = true;
        if (measuredHeight < flexItem.l()) {
            measuredHeight = flexItem.l();
        } else if (measuredHeight > flexItem.j()) {
            measuredHeight = flexItem.j();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            w(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.a.J(i, view);
        }
    }

    private final void s(int i, int i2, defpackage.zvd zvdVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        float f2;
        int iMax;
        double d;
        double d2;
        float f3 = zvdVar.j;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 < (i5 = zvdVar.e)) {
            return;
        }
        float f5 = (i3 - i5) / f3;
        zvdVar.e = i4 + zvdVar.f;
        int i6 = 0;
        if (!z) {
            zvdVar.g = Integer.MIN_VALUE;
        }
        boolean z2 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < zvdVar.h) {
            int i8 = zvdVar.o + i6;
            defpackage.zvc zvcVar = this.a;
            android.view.View viewT = zvcVar.t(i8);
            if (viewT == null || viewT.getVisibility() == 8) {
                f = f4;
                f2 = f5;
                z2 = z2;
            } else {
                com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) viewT.getLayoutParams();
                int iK = zvcVar.k();
                f = f4;
                if (iK == 0 || iK == 1) {
                    f2 = f5;
                    boolean z3 = z2;
                    int measuredWidth = viewT.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewT.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = l(jArr2[i8]);
                    }
                    if (this.d[i8] || flexItem.b() <= f) {
                        z2 = z3;
                    } else {
                        float fB = measuredWidth + (flexItem.b() * f2);
                        if (i6 == zvdVar.h - 1) {
                            fB += f6;
                            f6 = f;
                        }
                        int iRound = java.lang.Math.round(fB);
                        if (iRound > flexItem.k()) {
                            iRound = flexItem.k();
                            this.d[i8] = true;
                            zvdVar.j -= flexItem.b();
                            z2 = true;
                        } else {
                            f6 += fB - iRound;
                            double d3 = f6;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d = d3 + 1.0d;
                                }
                                z2 = z3;
                            }
                            f6 = (float) d;
                            z2 = z3;
                        }
                        int iO = o(i2, flexItem, zvdVar.m);
                        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewT.measure(iMakeMeasureSpec, iO);
                        int measuredWidth2 = viewT.getMeasuredWidth();
                        int measuredHeight2 = viewT.getMeasuredHeight();
                        w(i8, iMakeMeasureSpec, iO, viewT);
                        zvcVar.J(i8, viewT);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = java.lang.Math.max(i7, measuredHeight + flexItem.i() + flexItem.f() + zvcVar.i(viewT));
                    zvdVar.e += measuredWidth + flexItem.g() + flexItem.h();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewT.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = l(jArr3[i8]);
                    }
                    int measuredWidth3 = viewT.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    f2 = f5;
                    boolean z4 = z2;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (this.d[i8] || flexItem.b() <= f) {
                        z2 = z4;
                    } else {
                        float fB2 = measuredHeight3 + (flexItem.b() * f2);
                        if (i6 == zvdVar.h - 1) {
                            fB2 += f6;
                            f6 = f;
                        }
                        int iRound2 = java.lang.Math.round(fB2);
                        if (iRound2 > flexItem.j()) {
                            iRound2 = flexItem.j();
                            this.d[i8] = true;
                            zvdVar.j -= flexItem.b();
                            z2 = true;
                        } else {
                            f6 += fB2 - iRound2;
                            double d4 = f6;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                }
                                z2 = z4;
                            }
                            f6 = (float) d2;
                            z2 = z4;
                        }
                        int iP = p(i, flexItem, zvdVar.m);
                        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewT.measure(iP, iMakeMeasureSpec2);
                        int measuredWidth4 = viewT.getMeasuredWidth();
                        int measuredHeight4 = viewT.getMeasuredHeight();
                        w(i8, iP, iMakeMeasureSpec2, viewT);
                        zvcVar.J(i8, viewT);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = java.lang.Math.max(i7, measuredWidth3 + flexItem.g() + flexItem.h() + zvcVar.i(viewT));
                    zvdVar.e += measuredHeight3 + flexItem.i() + flexItem.f();
                }
                zvdVar.g = java.lang.Math.max(zvdVar.g, iMax);
                i7 = iMax;
            }
            i6++;
            f4 = f;
            f5 = f2;
        }
        if (!z2 || i5 == zvdVar.e) {
            return;
        }
        s(i, i2, zvdVar, i3, i4, true);
    }

    private final void t(int i, int i2, defpackage.zvd zvdVar, int i3, int i4, boolean z) {
        float f;
        int iMax;
        int i5 = zvdVar.e;
        float f2 = zvdVar.k;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 > i5) {
            return;
        }
        float f4 = (i5 - i3) / f2;
        zvdVar.e = i4 + zvdVar.f;
        int i6 = 0;
        if (!z) {
            zvdVar.g = Integer.MIN_VALUE;
        }
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < zvdVar.h) {
            int i8 = zvdVar.o + i6;
            defpackage.zvc zvcVar = this.a;
            android.view.View viewT = zvcVar.t(i8);
            if (viewT == null || viewT.getVisibility() == 8) {
                f = f3;
            } else {
                com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) viewT.getLayoutParams();
                int iK = zvcVar.k();
                f = f3;
                if (iK == 0 || iK == 1) {
                    int measuredWidth = viewT.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewT.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = l(jArr2[i8]);
                    }
                    if (!this.d[i8] && flexItem.c() > f) {
                        float fC = measuredWidth - (flexItem.c() * f4);
                        if (i6 == zvdVar.h - 1) {
                            fC += f5;
                            f5 = f;
                        }
                        int iRound = java.lang.Math.round(fC);
                        if (iRound < flexItem.m()) {
                            iRound = flexItem.m();
                            this.d[i8] = true;
                            zvdVar.k -= flexItem.c();
                            z2 = true;
                        } else {
                            f5 += fC - iRound;
                            double d = f5;
                            if (d > 1.0d) {
                                iRound++;
                                f5 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f5 += 1.0f;
                            }
                        }
                        int iO = o(i2, flexItem, zvdVar.m);
                        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewT.measure(iMakeMeasureSpec, iO);
                        int measuredWidth2 = viewT.getMeasuredWidth();
                        int measuredHeight2 = viewT.getMeasuredHeight();
                        w(i8, iMakeMeasureSpec, iO, viewT);
                        zvcVar.J(i8, viewT);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = java.lang.Math.max(i7, measuredHeight + flexItem.i() + flexItem.f() + zvcVar.i(viewT));
                    zvdVar.e += measuredWidth + flexItem.g() + flexItem.h();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewT.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = l(jArr3[i8]);
                    }
                    int measuredWidth3 = viewT.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (!this.d[i8] && flexItem.c() > f) {
                        float fC2 = measuredHeight3 - (flexItem.c() * f4);
                        if (i6 == zvdVar.h - 1) {
                            fC2 += f5;
                            f5 = f;
                        }
                        int iRound2 = java.lang.Math.round(fC2);
                        if (iRound2 < flexItem.l()) {
                            iRound2 = flexItem.l();
                            this.d[i8] = true;
                            zvdVar.k -= flexItem.c();
                            z2 = true;
                        } else {
                            f5 += fC2 - iRound2;
                            double d2 = f5;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f5 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f5 += 1.0f;
                            }
                        }
                        int iP = p(i, flexItem, zvdVar.m);
                        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewT.measure(iP, iMakeMeasureSpec2);
                        measuredWidth3 = viewT.getMeasuredWidth();
                        int measuredHeight4 = viewT.getMeasuredHeight();
                        w(i8, iP, iMakeMeasureSpec2, viewT);
                        zvcVar.J(i8, viewT);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = java.lang.Math.max(i7, measuredWidth3 + flexItem.g() + flexItem.h() + zvcVar.i(viewT));
                    zvdVar.e += measuredHeight3 + flexItem.i() + flexItem.f();
                }
                zvdVar.g = java.lang.Math.max(zvdVar.g, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
        }
        if (!z2 || i5 == zvdVar.e) {
            return;
        }
        t(i, i2, zvdVar, i3, i4, true);
    }

    private final void u(android.view.View view, int i, int i2) {
        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) view.getLayoutParams();
        int iG = (i - flexItem.g()) - flexItem.h();
        defpackage.zvc zvcVar = this.a;
        int iMin = java.lang.Math.min(java.lang.Math.max(iG - zvcVar.i(view), flexItem.m()), flexItem.k());
        long[] jArr = this.e;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(jArr != null ? l(jArr[i2]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        w(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        zvcVar.J(i2, view);
    }

    private final void v(android.view.View view, int i, int i2) {
        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) view.getLayoutParams();
        int i3 = (i - flexItem.i()) - flexItem.f();
        defpackage.zvc zvcVar = this.a;
        int iMin = java.lang.Math.min(java.lang.Math.max(i3 - zvcVar.i(view), flexItem.l()), flexItem.j());
        long[] jArr = this.e;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        w(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        zvcVar.J(i2, view);
    }

    private final void w(int i, int i2, int i3, android.view.View view) {
        long[] jArr = this.c;
        if (jArr != null) {
            jArr[i] = k(i2, i3);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = k(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private static final java.util.List x(java.util.List list, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.zvd zvdVar = new defpackage.zvd();
        zvdVar.g = (i - i2) / 2;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            if (i3 == 0) {
                arrayList.add(zvdVar);
                i3 = 0;
            }
            arrayList.add((defpackage.zvd) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(zvdVar);
            }
            i3++;
        }
        return arrayList;
    }

    private static final int y(com.google.android.flexbox.FlexItem flexItem, boolean z) {
        return z ? flexItem.f() : flexItem.h();
    }

    private static final int z(com.google.android.flexbox.FlexItem flexItem, boolean z) {
        return z ? flexItem.h() : flexItem.f();
    }

    public final java.util.List a(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) this.a.s(i2).getLayoutParams();
            defpackage.zve zveVar = new defpackage.zve();
            zveVar.b = flexItem.n();
            zveVar.a = i2;
            arrayList.add(zveVar);
        }
        return arrayList;
    }

    public final void b(java.util.List list, int i) {
        int i2 = this.b[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.b;
        int length = iArr.length - 1;
        if (i > length) {
            java.util.Arrays.fill(iArr, -1);
        } else {
            java.util.Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.c;
        int length2 = jArr.length - 1;
        if (i > length2) {
            java.util.Arrays.fill(jArr, 0L);
        } else {
            java.util.Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public final void c(int i, int i2, int i3) {
        int mode;
        int size;
        int iRound;
        defpackage.zvc zvcVar = this.a;
        int iK = zvcVar.k();
        if (iK == 0 || iK == 1) {
            mode = android.view.View.MeasureSpec.getMode(i2);
            size = android.view.View.MeasureSpec.getSize(i2);
        } else {
            if (iK != 2 && iK != 3) {
                throw new java.lang.IllegalArgumentException(a.bj(iK, "Invalid flex direction: "));
            }
            mode = android.view.View.MeasureSpec.getMode(i);
            size = android.view.View.MeasureSpec.getSize(i);
        }
        java.util.List<defpackage.zvd> listV = zvcVar.v();
        if (mode == 1073741824) {
            int iR = zvcVar.r() + i3;
            int i4 = 0;
            if (listV.size() == 1) {
                ((defpackage.zvd) listV.get(0)).g = size - i3;
                return;
            }
            if (listV.size() >= 2) {
                int iA = zvcVar.a();
                if (iA == 1) {
                    defpackage.zvd zvdVar = new defpackage.zvd();
                    zvdVar.g = size - iR;
                    listV.add(0, zvdVar);
                    return;
                }
                if (iA == 2) {
                    zvcVar.z(x(listV, size, iR));
                    return;
                }
                if (iA == 3) {
                    if (iR < size) {
                        int size2 = listV.size() - 1;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int size3 = listV.size();
                        float f = 0.0f;
                        while (i4 < size3) {
                            arrayList.add((defpackage.zvd) listV.get(i4));
                            if (i4 != listV.size() - 1) {
                                defpackage.zvd zvdVar2 = new defpackage.zvd();
                                float f2 = (size - iR) / size2;
                                if (i4 == listV.size() - 2) {
                                    int iRound2 = java.lang.Math.round(f + f2);
                                    zvdVar2.g = iRound2;
                                    iRound = iRound2;
                                    f = 0.0f;
                                } else {
                                    iRound = java.lang.Math.round(f2);
                                    zvdVar2.g = iRound;
                                }
                                f += f2 - iRound;
                                if (f > 1.0f) {
                                    zvdVar2.g = iRound + 1;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    zvdVar2.g = iRound - 1;
                                    f += 1.0f;
                                }
                                arrayList.add(zvdVar2);
                            }
                            i4++;
                        }
                        zvcVar.z(arrayList);
                        return;
                    }
                    return;
                }
                if (iA == 4) {
                    if (iR >= size) {
                        zvcVar.z(x(listV, size, iR));
                        return;
                    }
                    int size4 = (size - iR) / (listV.size() << 1);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    defpackage.zvd zvdVar3 = new defpackage.zvd();
                    zvdVar3.g = size4;
                    for (defpackage.zvd zvdVar4 : listV) {
                        arrayList2.add(zvdVar3);
                        arrayList2.add(zvdVar4);
                        arrayList2.add(zvdVar3);
                    }
                    zvcVar.z(arrayList2);
                    return;
                }
                if (iA != 5 || iR >= size) {
                    return;
                }
                float size5 = listV.size();
                int size6 = listV.size();
                float f3 = 0.0f;
                while (i4 < size6) {
                    defpackage.zvd zvdVar5 = (defpackage.zvd) listV.get(i4);
                    float f4 = zvdVar5.g + ((size - iR) / size5);
                    if (i4 == listV.size() - 1) {
                        f4 += f3;
                        f3 = 0.0f;
                    }
                    int iRound3 = java.lang.Math.round(f4);
                    f3 += f4 - iRound3;
                    if (f3 > 1.0f) {
                        iRound3++;
                        f3 -= 1.0f;
                    } else if (f3 < -1.0f) {
                        iRound3--;
                        f3 += 1.0f;
                    }
                    zvdVar5.g = iRound3;
                    i4++;
                }
            }
        }
    }

    public final void d(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        defpackage.zvf zvfVar;
        int i4;
        int i5;
        defpackage.zvc zvcVar = this.a;
        int iL = zvcVar.l();
        boolean[] zArr = this.d;
        if (zArr == null) {
            this.d = new boolean[java.lang.Math.max(iL, 10)];
        } else {
            int length = zArr.length;
            if (length < iL) {
                this.d = new boolean[java.lang.Math.max(length << 1, iL)];
            } else {
                java.util.Arrays.fill(zArr, false);
            }
        }
        if (i3 < zvcVar.l()) {
            int iK = zvcVar.k();
            int iK2 = zvcVar.k();
            if (iK2 == 0 || iK2 == 1) {
                int mode = android.view.View.MeasureSpec.getMode(i);
                size = android.view.View.MeasureSpec.getSize(i);
                int iN = zvcVar.n();
                if (mode != 1073741824) {
                    size = java.lang.Math.min(iN, size);
                }
                paddingLeft = zvcVar.getPaddingLeft();
                paddingRight = zvcVar.getPaddingRight();
            } else {
                if (iK2 != 2 && iK2 != 3) {
                    throw new java.lang.IllegalArgumentException(a.bj(iK, "Invalid flex direction: "));
                }
                int mode2 = android.view.View.MeasureSpec.getMode(i2);
                size = android.view.View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    size = zvcVar.n();
                }
                paddingLeft = zvcVar.getPaddingTop();
                paddingRight = zvcVar.getPaddingBottom();
            }
            int i6 = paddingLeft + paddingRight;
            int i7 = size;
            int[] iArr = this.b;
            int i8 = iArr != null ? iArr[i3] : 0;
            java.util.List listV = zvcVar.v();
            int size2 = listV.size();
            while (i8 < size2) {
                defpackage.zvd zvdVar = (defpackage.zvd) listV.get(i8);
                if (zvdVar.e < i7) {
                    zvfVar = this;
                    i4 = i;
                    i5 = i2;
                    zvfVar.s(i4, i5, zvdVar, i7, i6, false);
                } else {
                    zvfVar = this;
                    i4 = i;
                    i5 = i2;
                    zvfVar.t(i4, i5, zvdVar, i7, i6, false);
                }
                i8++;
                this = zvfVar;
                i = i4;
                i2 = i5;
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (iArr == null) {
            this.b = new int[java.lang.Math.max(i, 10)];
            return;
        }
        int length = iArr.length;
        if (length < i) {
            this.b = java.util.Arrays.copyOf(this.b, java.lang.Math.max(length << 1, i));
        }
    }

    public final void f(int i) {
        long[] jArr = this.c;
        if (jArr == null) {
            this.c = new long[java.lang.Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
        if (length < i) {
            this.c = java.util.Arrays.copyOf(this.c, java.lang.Math.max(length << 1, i));
        }
    }

    public final void g(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            this.e = new long[java.lang.Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
        if (length < i) {
            this.e = java.util.Arrays.copyOf(this.e, java.lang.Math.max(length << 1, i));
        }
    }

    public final void h(android.view.View view, defpackage.zvd zvdVar, int i, int i2, int i3, int i4) {
        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) view.getLayoutParams();
        defpackage.zvc zvcVar = this.a;
        int iB = zvcVar.b();
        if (flexItem.d() != -1) {
            iB = flexItem.d();
        }
        int i5 = zvdVar.g;
        if (iB == 0 || iB == 4) {
            if (zvcVar.m() != 2) {
                view.layout(i, i2 + flexItem.i(), i3, i4 + flexItem.i());
                return;
            } else {
                view.layout(i, i2 - flexItem.f(), i3, i4 - flexItem.f());
                return;
            }
        }
        if (iB == 3) {
            if (zvcVar.m() != 2) {
                int iMax = java.lang.Math.max(zvdVar.l - view.getBaseline(), flexItem.i());
                view.layout(i, i2 + iMax, i3, i4 + iMax);
                return;
            } else {
                int iMax2 = java.lang.Math.max((zvdVar.l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.f());
                view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                return;
            }
        }
        if (iB == 1) {
            if (zvcVar.m() == 2) {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.i(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.i());
                return;
            } else {
                int i6 = i2 + i5;
                view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.f(), i3, i6 - flexItem.f());
                return;
            }
        }
        if (iB == 2) {
            int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.i()) - flexItem.f()) / 2;
            if (zvcVar.m() != 2) {
                int i7 = i2 + measuredHeight;
                view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
            } else {
                int i8 = i2 - measuredHeight;
                view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
            }
        }
    }

    public final void i(android.view.View view, defpackage.zvd zvdVar, boolean z, int i, int i2, int i3, int i4) {
        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) view.getLayoutParams();
        int iB = this.a.b();
        if (flexItem.d() != -1) {
            iB = flexItem.d();
        }
        int i5 = zvdVar.g;
        if (iB == 0 || iB == 4 || iB == 3) {
            if (z) {
                view.layout(i - flexItem.h(), i2, i3 - flexItem.h(), i4);
                return;
            } else {
                view.layout(i + flexItem.g(), i2, i3 + flexItem.g(), i4);
                return;
            }
        }
        if (iB == 1) {
            if (z) {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.g(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.g(), i4);
                return;
            } else {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.h(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.h(), i4);
                return;
            }
        }
        if (iB == 2) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int measuredWidth = (((i5 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
            if (z) {
                view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
            } else {
                view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
            }
        }
    }

    public final void j(int i) {
        android.view.View viewT;
        defpackage.zvc zvcVar = this.a;
        if (i < zvcVar.l()) {
            int iK = zvcVar.k();
            if (zvcVar.b() != 4) {
                for (defpackage.zvd zvdVar : zvcVar.v()) {
                    for (java.lang.Integer num : zvdVar.n) {
                        android.view.View viewT2 = zvcVar.t(num.intValue());
                        if (iK == 0 || iK == 1) {
                            v(viewT2, zvdVar.g, num.intValue());
                        } else {
                            if (iK != 2 && iK != 3) {
                                throw new java.lang.IllegalArgumentException(a.bj(iK, "Invalid flex direction: "));
                            }
                            u(viewT2, zvdVar.g, num.intValue());
                        }
                    }
                }
                return;
            }
            int[] iArr = this.b;
            java.util.List listV = zvcVar.v();
            int size = listV.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                defpackage.zvd zvdVar2 = (defpackage.zvd) listV.get(i2);
                int i3 = zvdVar2.h;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = zvdVar2.o + i4;
                    if (i4 < zvcVar.l() && (viewT = zvcVar.t(i5)) != null && viewT.getVisibility() != 8) {
                        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) viewT.getLayoutParams();
                        if (flexItem.d() == -1 || flexItem.d() == 4) {
                            if (iK == 0 || iK == 1) {
                                v(viewT, zvdVar2.g, i5);
                            } else {
                                if (iK != 2 && iK != 3) {
                                    throw new java.lang.IllegalArgumentException(a.bj(iK, "Invalid flex direction: "));
                                }
                                u(viewT, zvdVar2.g, i5);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x012b  */
    public final void n(aizg aizgVar, int i, int i2, int i3, int i4, int i5, java.util.List list) {
        int paddingTop;
        int paddingBottom;
        int paddingStart;
        int paddingEnd;
        int i6;
        int i7;
        int iG;
        boolean z;
        int i8;
        java.util.List list2;
        int i9;
        int i10;
        boolean z2;
        int iO;
        int minimumWidth;
        int minimumHeight;
        int i11 = i;
        defpackage.zvc zvcVar = this.a;
        boolean zK = zvcVar.K();
        int mode = android.view.View.MeasureSpec.getMode(i11);
        int size = android.view.View.MeasureSpec.getSize(i11);
        java.util.List arrayList = list == null ? new java.util.ArrayList() : list;
        aizgVar.b = arrayList;
        boolean z3 = i5 == -1;
        if (zK) {
            paddingTop = zvcVar.getPaddingStart();
            paddingBottom = zvcVar.getPaddingEnd();
            paddingStart = zvcVar.getPaddingTop();
            paddingEnd = zvcVar.getPaddingBottom();
        } else {
            paddingTop = zvcVar.getPaddingTop();
            paddingBottom = zvcVar.getPaddingBottom();
            paddingStart = zvcVar.getPaddingStart();
            paddingEnd = zvcVar.getPaddingEnd();
        }
        defpackage.zvd zvdVar = new defpackage.zvd();
        int i12 = i4;
        boolean z4 = true;
        zvdVar.o = i12;
        int i13 = paddingTop + paddingBottom;
        zvdVar.e = i13;
        int iL = zvcVar.l();
        boolean z5 = z3;
        int i14 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i15 = 0;
        int i16 = 0;
        while (i12 < iL) {
            android.view.View viewT = zvcVar.t(i12);
            if (viewT == null) {
                if (E(i12, iL, zvdVar)) {
                    q(arrayList, zvdVar, i12, i15);
                }
                i6 = i13;
            } else {
                i6 = i13;
                if (viewT.getVisibility() != 8) {
                    int i17 = paddingStart + paddingEnd;
                    if (viewT instanceof android.widget.CompoundButton) {
                        android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) viewT;
                        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) compoundButton.getLayoutParams();
                        int iM = flexItem.m();
                        int iL2 = flexItem.l();
                        android.graphics.drawable.Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        if (buttonDrawable == null) {
                            minimumHeight = 0;
                            minimumWidth = 0;
                        } else {
                            minimumWidth = buttonDrawable.getMinimumWidth();
                            minimumHeight = buttonDrawable.getMinimumHeight();
                        }
                        if (iM == -1) {
                            iM = minimumWidth;
                        }
                        flexItem.q(iM);
                        if (iL2 == -1) {
                            iL2 = minimumHeight;
                        }
                        flexItem.p(iL2);
                    }
                    com.google.android.flexbox.FlexItem flexItem2 = (com.google.android.flexbox.FlexItem) viewT.getLayoutParams();
                    if (flexItem2.d() == 4) {
                        zvdVar.n.add(java.lang.Integer.valueOf(i12));
                    }
                    int iO2 = zK ? flexItem2.o() : flexItem2.e();
                    if (flexItem2.a() != -1.0f) {
                        i7 = 1073741824;
                        if (mode == 1073741824) {
                            iO2 = java.lang.Math.round(size * flexItem2.a());
                        } else {
                            i7 = mode;
                        }
                    } else {
                        i7 = mode;
                    }
                    if (zK) {
                        boolean z6 = z4;
                        iG = zvcVar.g(i11, i6 + B(flexItem2, z6) + z(flexItem2, z6), iO2);
                        int iC = zvcVar.c(i2, i17 + A(flexItem2, z6) + y(flexItem2, z6) + i15, C(flexItem2, z6));
                        viewT.measure(iG, iC);
                        w(i12, iG, iC, viewT);
                        z = true;
                    } else {
                        int iG2 = zvcVar.g(i2, i17 + A(flexItem2, false) + y(flexItem2, false) + i15, C(flexItem2, false));
                        int iC2 = zvcVar.c(i11, i6 + B(flexItem2, false) + z(flexItem2, false), iO2);
                        viewT.measure(iG2, iC2);
                        w(i12, iG2, iC2, viewT);
                        iG = iC2;
                        z = false;
                    }
                    zvcVar.J(i12, viewT);
                    r(viewT, i12);
                    iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, viewT.getMeasuredState());
                    int i18 = zvdVar.e;
                    int iD = D(viewT, z) + B(flexItem2, z) + z(flexItem2, z);
                    int size2 = arrayList.size();
                    if (zvcVar.m() == 0) {
                        i8 = i6;
                        list2 = arrayList;
                        zvdVar.h++;
                        i16++;
                        i9 = i14;
                    } else {
                        if (!flexItem2.r()) {
                            if (i7 != 0 && ((iO = zvcVar.o()) == -1 || iO > size2 + 1)) {
                                int iJ = zvcVar.j(viewT, i12, i16);
                                if (iJ > 0) {
                                    iD += iJ;
                                }
                                if (size < i18 + iD) {
                                }
                            }
                            i8 = i6;
                            list2 = arrayList;
                            zvdVar.h++;
                            i16++;
                            i9 = i14;
                        }
                        if (zvdVar.a() > 0) {
                            list2 = arrayList;
                            q(list2, zvdVar, i12 > 0 ? i12 - 1 : 0, i15);
                            i15 += zvdVar.g;
                        } else {
                            list2 = arrayList;
                        }
                        if (z) {
                            if (flexItem2.e() == -1) {
                                viewT.measure(iG, zvcVar.c(i2, zvcVar.getPaddingTop() + zvcVar.getPaddingBottom() + flexItem2.i() + flexItem2.f() + i15, flexItem2.e()));
                                r(viewT, i12);
                            }
                        } else if (flexItem2.o() == -1) {
                            viewT.measure(zvcVar.g(i2, zvcVar.getPaddingLeft() + zvcVar.getPaddingRight() + flexItem2.g() + flexItem2.h() + i15, flexItem2.o()), iG);
                            r(viewT, i12);
                        }
                        zvdVar = new defpackage.zvd();
                        zvdVar.h = 1;
                        i8 = i6;
                        zvdVar.e = i8;
                        zvdVar.o = i12;
                        i9 = Integer.MIN_VALUE;
                        i16 = 0;
                    }
                    zvdVar.q |= flexItem2.b() != 0.0f;
                    zvdVar.r |= flexItem2.c() != 0.0f;
                    int[] iArr = this.b;
                    if (iArr != null) {
                        iArr[i12] = list2.size();
                    }
                    zvdVar.e += D(viewT, z) + B(flexItem2, z) + z(flexItem2, z);
                    zvdVar.j += flexItem2.b();
                    zvdVar.k += flexItem2.c();
                    zvcVar.w(viewT, i12, i16, zvdVar);
                    int iMax = java.lang.Math.max(i9, (z ? viewT.getMeasuredHeight() : viewT.getMeasuredWidth()) + A(flexItem2, z) + y(flexItem2, z) + zvcVar.i(viewT));
                    zvdVar.g = java.lang.Math.max(zvdVar.g, iMax);
                    if (z) {
                        if (zvcVar.m() != 2) {
                            zvdVar.l = java.lang.Math.max(zvdVar.l, viewT.getBaseline() + flexItem2.i());
                        } else {
                            zvdVar.l = java.lang.Math.max(zvdVar.l, (viewT.getMeasuredHeight() - viewT.getBaseline()) + flexItem2.f());
                        }
                    }
                    i10 = iL;
                    if (E(i12, i10, zvdVar)) {
                        q(list2, zvdVar, i12, i15);
                        i15 += zvdVar.g;
                    }
                    if (i5 == -1 || list2.size() <= 0 || ((defpackage.zvd) list2.get(list2.size() - 1)).p < i5 || i12 < i5) {
                        z2 = z5;
                    } else {
                        if (!z5) {
                            i15 = -zvdVar.g;
                        }
                        z2 = true;
                    }
                    if (i15 > i3 && z2) {
                        break;
                    } else {
                        i14 = iMax;
                    }
                } else {
                    zvdVar.i++;
                    zvdVar.h++;
                    if (E(i12, iL, zvdVar)) {
                        q(arrayList, zvdVar, i12, i15);
                    }
                }
                i12++;
                arrayList = list2;
                z5 = z2;
                mode = mode;
                z4 = true;
                iL = i10;
                i13 = i8;
                i11 = i;
            }
            mode = mode;
            list2 = arrayList;
            i10 = iL;
            i8 = i6;
            z2 = z5;
            i12++;
            arrayList = list2;
            z5 = z2;
            mode = mode;
            z4 = true;
            iL = i10;
            i13 = i8;
            i11 = i;
        }
        aizgVar.a = iCombineMeasuredStates;
    }
}
