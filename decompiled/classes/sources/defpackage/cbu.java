package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbu {
    public static final java.util.Comparator a = new defpackage.beg(2);

    public static final int a(defpackage.cfl cflVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = cflVar.e(i);
            i3++;
        }
        return i3;
    }

    public static final int b(java.util.List list, int i) {
        int iC = c(list, i);
        return iC < 0 ? -(iC + 1) : iC;
    }

    public static final int c(java.util.List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iA = defpackage.aooh.a(((defpackage.aodd) list.get(i3)).b, i);
            if (iA < 0) {
                i2 = i3 + 1;
            } else {
                if (iA <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final defpackage.cbx d(defpackage.cdw cdwVar) {
        defpackage.cbx cbxVar = cdwVar instanceof defpackage.cbx ? (defpackage.cbx) cdwVar : null;
        if (cbxVar != null) {
            return cbxVar;
        }
        defpackage.cax.a("Inconsistent composition");
        throw new defpackage.aoiq();
    }

    public static final java.lang.Object e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ccc cccVar = obj instanceof ccc ? (ccc) obj : null;
        if (cccVar == null) {
            return null;
        }
        java.lang.Object obj4 = cccVar.a;
        if (defpackage.aooh.n(obj4, obj2) && defpackage.aooh.n(cccVar.b, obj3)) {
            return obj;
        }
        java.lang.Object objE = e(obj4, obj2, obj3);
        return objE == null ? e(cccVar.b, obj2, obj3) : objE;
    }

    public static final void f(defpackage.cfl cflVar, java.util.List list, int i) {
        if (cflVar.B(i)) {
            list.add(cflVar.o(i));
            return;
        }
        int iC = i + 1;
        int iC2 = i + cflVar.c(i);
        while (iC < iC2) {
            f(cflVar, list, iC);
            iC += cflVar.c(iC);
        }
    }

    public static final void g(java.util.List list, int i, int i2) {
        int iB = b(list, i);
        while (iB < list.size() && ((defpackage.aodd) list.get(iB)).b < i2) {
        }
    }

    public static final void h(defpackage.cfp cfpVar, defpackage.cjh cjhVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = cfpVar.o;
        int iL = cfpVar.l(i5);
        int iG = cfpVar.g();
        int iJ = cfpVar.j(i5) + i5;
        defpackage.acq acqVar = null;
        int i6 = i5;
        defpackage.acm acmVar = null;
        while (i6 < iJ) {
            int i7 = i6 + 1;
            int iC = cfpVar.c(i7);
            for (int iC2 = cfpVar.c(i6); iC2 < iC; iC2++) {
                java.lang.Object obj = cfpVar.c[cfpVar.e(iC2)];
                boolean z = obj instanceof defpackage.cdw;
                if (z && (i4 = d((defpackage.cdw) obj).a) >= 0) {
                    int iB = cfpVar.b(i6, i4);
                    if (acqVar == null) {
                        int[] iArr = defpackage.acr.a;
                        acqVar = new defpackage.acq(6);
                    }
                    if (acmVar == null) {
                        acmVar = new defpackage.acm(16);
                    }
                    acqVar.d(iB);
                    acmVar.f(iB);
                    acmVar.f(iC2);
                } else if (obj instanceof defpackage.cap) {
                    cjhVar.f((defpackage.cap) obj);
                } else if (!(obj instanceof defpackage.cdz)) {
                    if (z) {
                        k(cfpVar, iC2, obj);
                        cjhVar.e((defpackage.cdw) obj);
                    } else if (obj instanceof defpackage.cdk) {
                        k(cfpVar, iC2, obj);
                        ((defpackage.cdk) obj).c();
                    }
                }
            }
            int iL2 = i7 < iG ? cfpVar.l(i7) : -1;
            if (iL2 == i6) {
                i = iG;
                i2 = iJ;
            } else {
                while (true) {
                    if (acmVar == null || acqVar == null || !acqVar.e(i6)) {
                        i = iG;
                        i2 = iJ;
                    } else {
                        int i8 = acmVar.b;
                        int i9 = i8 / 2;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < i9) {
                            int i12 = i10 << 1;
                            int i13 = iG;
                            int iA = acmVar.a(i12);
                            if (iA == i6) {
                                int iA2 = acmVar.a(i12 + 1);
                                java.lang.Object obj2 = cfpVar.c[cfpVar.e(iA2)];
                                i3 = iJ;
                                if (obj2 instanceof defpackage.cap) {
                                    cjhVar.f((defpackage.cap) obj2);
                                } else if (!(obj2 instanceof defpackage.cdz)) {
                                    if (obj2 instanceof defpackage.cdw) {
                                        k(cfpVar, iA2, obj2);
                                        cjhVar.e((defpackage.cdw) obj2);
                                    } else if (obj2 instanceof defpackage.cdk) {
                                        k(cfpVar, iA2, obj2);
                                        ((defpackage.cdk) obj2).c();
                                    }
                                }
                            } else {
                                i3 = iJ;
                                if (i12 != i11) {
                                    int i14 = i11 + 1;
                                    acmVar.i(i11, iA);
                                    i11 += 2;
                                    acmVar.i(i14, acmVar.a(i12 + 1));
                                } else {
                                    i11 += 2;
                                }
                            }
                            i10++;
                            iG = i13;
                            iJ = i3;
                        }
                        i = iG;
                        i2 = iJ;
                        if (i11 != i8) {
                            acmVar.d(i11, i8);
                        }
                    }
                    if (i6 == i5 || iL == iL2) {
                        break;
                    }
                    i6 = iL;
                    iL = cfpVar.l(iL);
                    iG = i;
                    iJ = i2;
                }
            }
            iL = iL2;
            i6 = i7;
            iG = i;
            iJ = i2;
        }
    }

    public static final defpackage.aodd i(java.util.List list, int i, int i2) {
        int iB = b(list, i);
        if (iB < list.size()) {
            defpackage.aodd aoddVar = (defpackage.aodd) list.get(iB);
            if (aoddVar.b < i2) {
                return aoddVar;
            }
        }
        return null;
    }

    public static final defpackage.aodd j(java.util.List list, int i) {
        int iC = c(list, i);
        if (iC >= 0) {
            return (defpackage.aodd) list.remove(iC);
        }
        return null;
    }

    private static final void k(defpackage.cfp cfpVar, int i, java.lang.Object obj) {
        int iE = cfpVar.e(i);
        java.lang.Object[] objArr = cfpVar.c;
        java.lang.Object obj2 = objArr[iE];
        objArr[iE] = defpackage.cau.a;
        if (obj != obj2) {
            defpackage.cax.b(defpackage.a.bm((byte) 41, obj2, obj, "Slot table is out of sync (expected ", ", got "));
        }
    }
}
