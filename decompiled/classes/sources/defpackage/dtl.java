package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dtl {
    public static final defpackage.dtg a = new defpackage.dtg();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, defpackage.dsy dsyVar, defpackage.dtw dtwVar, boolean z) {
        defpackage.dsx dsxVar;
        defpackage.dsx dsxVar2;
        float f;
        boolean z2;
        boolean z3;
        defpackage.dsx dsxVar3;
        defpackage.dsx dsxVar4;
        if (dsyVar.n) {
            return;
        }
        boolean z4 = true;
        b++;
        if (!(dsyVar instanceof defpackage.dsz) && dsyVar.J() && c(dsyVar)) {
            defpackage.dsz.X(dsyVar, dtwVar, new defpackage.dtg());
        }
        defpackage.dsx dsxVarK = dsyVar.K(2);
        defpackage.dsx dsxVarK2 = dsyVar.K(4);
        int iA = dsxVarK.a();
        int iA2 = dsxVarK2.a();
        java.util.HashSet<defpackage.dsx> hashSet = dsxVarK.a;
        if (hashSet != null && dsxVarK.c) {
            for (defpackage.dsx dsxVar5 : hashSet) {
                int i2 = i + 1;
                defpackage.dsy dsyVar2 = dsxVar5.d;
                boolean zC = c(dsyVar2);
                if (dsyVar2.J() && zC) {
                    f = 0.0f;
                    defpackage.dsz.X(dsyVar2, dtwVar, new defpackage.dtg());
                } else {
                    f = 0.0f;
                }
                defpackage.dsx dsxVar6 = dsyVar2.J;
                if ((dsxVar5 == dsxVar6 && (dsxVar4 = dsyVar2.L.e) != null && dsxVar4.c) || (dsxVar5 == dsyVar2.L && (dsxVar3 = dsxVar6.e) != null && dsxVar3.c)) {
                    z3 = z4;
                    z2 = z3;
                } else {
                    z2 = z4;
                    z3 = false;
                }
                if (dsyVar2.M() != 3 || zC) {
                    if (!dsyVar2.J()) {
                        if (dsxVar5 == dsxVar6 && dsyVar2.L.e == null) {
                            int iB = dsxVar6.b() + iA;
                            dsyVar2.v(iB, dsyVar2.j() + iB);
                            a(i2, dsyVar2, dtwVar, z);
                        } else {
                            defpackage.dsx dsxVar7 = dsyVar2.L;
                            if (dsxVar5 == dsxVar7 && dsxVar6.e == null) {
                                int iB2 = iA - dsxVar7.b();
                                dsyVar2.v(iB2 - dsyVar2.j(), iB2);
                                a(i2, dsyVar2, dtwVar, z);
                            } else if (z3 && !dsyVar2.H()) {
                                e(i2, dtwVar, dsyVar2, z);
                            }
                        }
                    }
                } else if (dsyVar2.M() == 3 && dsyVar2.w >= 0 && dsyVar2.v >= 0 && ((dsyVar2.ah == 8 || (dsyVar2.s == 0 && dsyVar2.X == f)) && !dsyVar2.H() && z3 && !dsyVar2.H())) {
                    f(i2, dsyVar, dtwVar, dsyVar2, z);
                }
                z4 = z2;
            }
        }
        boolean z5 = z4;
        if (dsyVar instanceof defpackage.dtb) {
            return;
        }
        java.util.HashSet<defpackage.dsx> hashSet2 = dsxVarK2.a;
        if (hashSet2 != null && dsxVarK2.c) {
            for (defpackage.dsx dsxVar8 : hashSet2) {
                int i3 = i + 1;
                defpackage.dsy dsyVar3 = dsxVar8.d;
                boolean zC2 = c(dsyVar3);
                if (dsyVar3.J() && zC2) {
                    defpackage.dsz.X(dsyVar3, dtwVar, new defpackage.dtg());
                }
                defpackage.dsx dsxVar9 = dsyVar3.J;
                boolean z6 = ((dsxVar8 == dsxVar9 && (dsxVar2 = dsyVar3.L.e) != null && dsxVar2.c) || (dsxVar8 == dsyVar3.L && (dsxVar = dsxVar9.e) != null && dsxVar.c)) ? z5 : false;
                if (dsyVar3.M() != 3 || zC2) {
                    if (!dsyVar3.J()) {
                        if (dsxVar8 == dsxVar9 && dsyVar3.L.e == null) {
                            int iB3 = dsxVar9.b() + iA2;
                            dsyVar3.v(iB3, dsyVar3.j() + iB3);
                            a(i3, dsyVar3, dtwVar, z);
                        } else {
                            defpackage.dsx dsxVar10 = dsyVar3.L;
                            if (dsxVar8 == dsxVar10 && dsxVar9.e == null) {
                                int iB4 = iA2 - dsxVar10.b();
                                dsyVar3.v(iB4 - dsyVar3.j(), iB4);
                                a(i3, dsyVar3, dtwVar, z);
                            } else if (z6 && !dsyVar3.H()) {
                                e(i3, dtwVar, dsyVar3, z);
                            }
                        }
                    }
                } else if (dsyVar3.M() == 3 && dsyVar3.w >= 0 && dsyVar3.v >= 0 && (dsyVar3.ah == 8 || (dsyVar3.s == 0 && dsyVar3.X == 0.0f))) {
                    if (!dsyVar3.H() && z6 && !dsyVar3.H()) {
                        f(i3, dsyVar, dtwVar, dsyVar3, z);
                    }
                }
            }
        }
        dsyVar.n = z5;
    }

    public static void b(int i, defpackage.dsy dsyVar, defpackage.dtw dtwVar) {
        defpackage.dsx dsxVar;
        defpackage.dsx dsxVar2;
        defpackage.dsx dsxVar3;
        defpackage.dsx dsxVar4;
        defpackage.dsx dsxVar5;
        if (dsyVar.o) {
            return;
        }
        c++;
        if (!(dsyVar instanceof defpackage.dsz) && dsyVar.J() && c(dsyVar)) {
            defpackage.dsz.X(dsyVar, dtwVar, new defpackage.dtg());
        }
        defpackage.dsx dsxVarK = dsyVar.K(3);
        defpackage.dsx dsxVarK2 = dsyVar.K(5);
        int iA = dsxVarK.a();
        int iA2 = dsxVarK2.a();
        java.util.HashSet<defpackage.dsx> hashSet = dsxVarK.a;
        if (hashSet != null && dsxVarK.c) {
            for (defpackage.dsx dsxVar6 : hashSet) {
                int i2 = i + 1;
                defpackage.dsy dsyVar2 = dsxVar6.d;
                boolean zC = c(dsyVar2);
                if (dsyVar2.J() && zC) {
                    defpackage.dsz.X(dsyVar2, dtwVar, new defpackage.dtg());
                }
                defpackage.dsx dsxVar7 = dsyVar2.K;
                boolean z = (dsxVar6 == dsxVar7 && (dsxVar5 = dsyVar2.M.e) != null && dsxVar5.c) || (dsxVar6 == dsyVar2.M && (dsxVar4 = dsxVar7.e) != null && dsxVar4.c);
                if (dsyVar2.N() != 3 || zC) {
                    if (!dsyVar2.J()) {
                        if (dsxVar6 == dsxVar7 && dsyVar2.M.e == null) {
                            int iB = dsxVar7.b() + iA;
                            dsyVar2.w(iB, dsyVar2.h() + iB);
                            b(i2, dsyVar2, dtwVar);
                        } else {
                            defpackage.dsx dsxVar8 = dsyVar2.M;
                            if (dsxVar6 == dsxVar8 && dsxVar7.e == null) {
                                int iB2 = iA - dsxVar8.b();
                                dsyVar2.w(iB2 - dsyVar2.h(), iB2);
                                b(i2, dsyVar2, dtwVar);
                            } else if (z && !dsyVar2.I()) {
                                g(i2, dtwVar, dsyVar2);
                            }
                        }
                    }
                } else if (dsyVar2.N() == 3 && dsyVar2.z >= 0 && dsyVar2.y >= 0 && (dsyVar2.ah == 8 || (dsyVar2.t == 0 && dsyVar2.X == 0.0f))) {
                    if (!dsyVar2.I() && z && !dsyVar2.I()) {
                        h(i2, dsyVar, dtwVar, dsyVar2);
                    }
                }
            }
        }
        if (dsyVar instanceof defpackage.dtb) {
            return;
        }
        java.util.HashSet<defpackage.dsx> hashSet2 = dsxVarK2.a;
        if (hashSet2 != null && dsxVarK2.c) {
            for (defpackage.dsx dsxVar9 : hashSet2) {
                int i3 = i + 1;
                defpackage.dsy dsyVar3 = dsxVar9.d;
                boolean zC2 = c(dsyVar3);
                if (dsyVar3.J() && zC2) {
                    defpackage.dsz.X(dsyVar3, dtwVar, new defpackage.dtg());
                }
                defpackage.dsx dsxVar10 = dsyVar3.K;
                boolean z2 = (dsxVar9 == dsxVar10 && (dsxVar3 = dsyVar3.M.e) != null && dsxVar3.c) || (dsxVar9 == dsyVar3.M && (dsxVar2 = dsxVar10.e) != null && dsxVar2.c);
                if (dsyVar3.N() != 3 || zC2) {
                    if (dsyVar3.J()) {
                        continue;
                    } else if (dsxVar9 == dsxVar10 && dsyVar3.M.e == null) {
                        int iB3 = dsxVar10.b() + iA2;
                        dsyVar3.w(iB3, dsyVar3.h() + iB3);
                        b(i3, dsyVar3, dtwVar);
                    } else {
                        defpackage.dsx dsxVar11 = dsyVar3.M;
                        if (dsxVar9 == dsxVar11 && dsxVar10.e == null) {
                            int iB4 = iA2 - dsxVar11.b();
                            dsyVar3.w(iB4 - dsyVar3.h(), iB4);
                            b(i3, dsyVar3, dtwVar);
                        } else if (z2 && !dsyVar3.I()) {
                            g(i3, dtwVar, dsyVar3);
                        }
                    }
                } else if (dsyVar3.N() == 3 && dsyVar3.z >= 0 && dsyVar3.y >= 0 && (dsyVar3.ah == 8 || (dsyVar3.t == 0 && dsyVar3.X == 0.0f))) {
                    if (!dsyVar3.I() && z2 && !dsyVar3.I()) {
                        h(i3, dsyVar, dtwVar, dsyVar3);
                    }
                }
            }
        }
        defpackage.dsx dsxVarK3 = dsyVar.K(6);
        if (dsxVarK3.a != null && dsxVarK3.c) {
            int iA3 = dsxVarK3.a();
            for (defpackage.dsx dsxVar12 : dsxVarK3.a) {
                int i4 = i + 1;
                defpackage.dsy dsyVar4 = dsxVar12.d;
                boolean zC3 = c(dsyVar4);
                if (dsyVar4.J() && zC3) {
                    defpackage.dsz.X(dsyVar4, dtwVar, new defpackage.dtg());
                }
                if (dsyVar4.N() != 3 || zC3) {
                    if (!dsyVar4.J() && dsxVar12 == (dsxVar = dsyVar4.N)) {
                        int iB5 = dsxVar12.b() + iA3;
                        if (dsyVar4.F) {
                            int i5 = iB5 - dsyVar4.ab;
                            int i6 = dsyVar4.W + i5;
                            dsyVar4.aa = i5;
                            dsyVar4.K.e(i5);
                            dsyVar4.M.e(i6);
                            dsxVar.e(iB5);
                            dsyVar4.m = true;
                        }
                        b(i4, dsyVar4, dtwVar);
                    }
                }
            }
        }
        dsyVar.o = true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    public static boolean c(defpackage.dsy dsyVar) {
        boolean z;
        boolean z2;
        int iM = dsyVar.M();
        int iN = dsyVar.N();
        defpackage.dsy dsyVar2 = dsyVar.U;
        if (dsyVar2 == null) {
            dsyVar2 = null;
        }
        if (dsyVar2 != null) {
            dsyVar2.M();
            dsyVar2.N();
        }
        if (iM == 1 || dsyVar.e() || iM == 2) {
            z = true;
        } else {
            if (iM == 3) {
                if (dsyVar.s != 0 || dsyVar.X != 0.0f || !dsyVar.F(0)) {
                }
                z = true;
            } else {
                if (iM == 3) {
                }
                z = false;
            }
            if (dsyVar.s == 1 && dsyVar.G(0, dsyVar.j())) {
                z = true;
            } else {
                z = false;
            }
        }
        if (iN == 1 || dsyVar.f() || iN == 2) {
            z2 = true;
        } else {
            if (iN == 3) {
                if (dsyVar.t != 0 || dsyVar.X != 0.0f || !dsyVar.F(1)) {
                }
                z2 = true;
            } else {
                if (iN == 3) {
                }
                z2 = false;
            }
            if (dsyVar.t == 1 && dsyVar.G(1, dsyVar.h())) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (dsyVar.X <= 0.0f) {
            if (z || !z2) {
            }
        } else if (!z && !z2) {
            z = false;
            z2 = false;
            return z ? false : false;
        }
        return true;
    }

    public static void d(defpackage.dsv dsvVar, defpackage.dtw dtwVar, int i, boolean z) {
        if (dsvVar.c()) {
            if (i == 0) {
                a(1, dsvVar, dtwVar, z);
            } else {
                b(1, dsvVar, dtwVar);
            }
        }
    }

    private static void e(int i, defpackage.dtw dtwVar, defpackage.dsy dsyVar, boolean z) {
        float f = dsyVar.ae;
        defpackage.dsx dsxVar = dsyVar.J;
        int iA = dsxVar.e.a();
        defpackage.dsx dsxVar2 = dsyVar.L;
        int iA2 = dsxVar2.e.a();
        int iB = dsxVar.b() + iA;
        int iB2 = iA2 - dsxVar2.b();
        if (iA == iA2) {
            f = 0.5f;
        } else {
            iA = iB;
            iA2 = iB2;
        }
        int iJ = dsyVar.j();
        int i2 = (iA2 - iA) - iJ;
        if (iA > iA2) {
            i2 = (iA - iA2) - iJ;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iA;
        int i4 = i3 + iJ;
        if (iA > iA2) {
            i4 = i3 - iJ;
        }
        dsyVar.v(i3, i4);
        a(i + 1, dsyVar, dtwVar, z);
    }

    private static void f(int i, defpackage.dsy dsyVar, defpackage.dtw dtwVar, defpackage.dsy dsyVar2, boolean z) {
        float f = dsyVar2.ae;
        defpackage.dsx dsxVar = dsyVar2.J;
        int iA = dsxVar.e.a() + dsxVar.b();
        defpackage.dsx dsxVar2 = dsyVar2.L;
        int iA2 = dsxVar2.e.a() - dsxVar2.b();
        if (iA2 >= iA) {
            int iJ = dsyVar2.j();
            int i2 = iA2 - iA;
            if (dsyVar2.ah != 8) {
                int i3 = dsyVar2.s;
                if (i3 == 2) {
                    iJ = (int) (dsyVar2.ae * 0.5f * (dsyVar instanceof defpackage.dsz ? dsyVar.j() : dsyVar.U.j()));
                } else if (i3 == 0) {
                    iJ = i2;
                }
                iJ = java.lang.Math.max(dsyVar2.v, iJ);
                int i4 = dsyVar2.w;
                if (i4 > 0) {
                    iJ = java.lang.Math.min(i4, iJ);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iJ)) + 0.5f));
            dsyVar2.v(i5, iJ + i5);
            a(i + 1, dsyVar2, dtwVar, z);
        }
    }

    private static void g(int i, defpackage.dtw dtwVar, defpackage.dsy dsyVar) {
        float f = dsyVar.af;
        defpackage.dsx dsxVar = dsyVar.K;
        int iA = dsxVar.e.a();
        defpackage.dsx dsxVar2 = dsyVar.M;
        int iA2 = dsxVar2.e.a();
        int iB = dsxVar.b() + iA;
        int iB2 = iA2 - dsxVar2.b();
        if (iA == iA2) {
            f = 0.5f;
        } else {
            iA = iB;
            iA2 = iB2;
        }
        int iH = dsyVar.h();
        int i2 = (iA2 - iA) - iH;
        if (iA > iA2) {
            i2 = (iA - iA2) - iH;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iA + i3;
        int i5 = i4 + iH;
        if (iA > iA2) {
            i4 = iA - i3;
            i5 = i4 - iH;
        }
        dsyVar.w(i4, i5);
        b(i + 1, dsyVar, dtwVar);
    }

    private static void h(int i, defpackage.dsy dsyVar, defpackage.dtw dtwVar, defpackage.dsy dsyVar2) {
        float f = dsyVar2.af;
        defpackage.dsx dsxVar = dsyVar2.K;
        int iA = dsxVar.e.a() + dsxVar.b();
        defpackage.dsx dsxVar2 = dsyVar2.M;
        int iA2 = dsxVar2.e.a() - dsxVar2.b();
        if (iA2 >= iA) {
            int iH = dsyVar2.h();
            int i2 = iA2 - iA;
            if (dsyVar2.ah != 8) {
                int i3 = dsyVar2.t;
                if (i3 == 2) {
                    iH = (int) (f * 0.5f * (dsyVar instanceof defpackage.dsz ? dsyVar.h() : dsyVar.U.h()));
                } else if (i3 == 0) {
                    iH = i2;
                }
                iH = java.lang.Math.max(dsyVar2.y, iH);
                int i4 = dsyVar2.z;
                if (i4 > 0) {
                    iH = java.lang.Math.min(i4, iH);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iH)) + 0.5f));
            dsyVar2.w(i5, iH + i5);
            b(i + 1, dsyVar2, dtwVar);
        }
    }
}
