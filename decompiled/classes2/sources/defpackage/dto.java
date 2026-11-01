package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dto extends dtr {
    private static final int[] a = new int[2];

    public dto(dsy dsyVar) {
        super(dsyVar);
        this.h.l = 4;
        this.i.l = 5;
        this.f = 0;
    }

    private static final void n(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i4 - i3;
        int i7 = i2 - i;
        if (i5 != -1) {
            if (i5 != 0) {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            } else {
                iArr[0] = (int) ((i6 * f) + 0.5f);
                iArr[1] = i6;
                return;
            }
        }
        float f2 = (i7 / f) + 0.5f;
        int i8 = (int) ((i6 * f) + 0.5f);
        if (i8 <= i7) {
            iArr[0] = i8;
            iArr[1] = i6;
            return;
        }
        int i9 = (int) f2;
        if (i9 <= i6) {
            iArr[0] = i7;
            iArr[1] = i9;
        }
    }

    public final void b() {
        dsy dsyVar;
        dsy dsyVar2;
        dsy dsyVar3;
        dsy dsyVar4 = this.d;
        if (dsyVar4.e) {
            this.e.c(dsyVar4.j());
        }
        defpackage.dtk dtkVar = this.e;
        if (!dtkVar.i) {
            int iM = this.d.M();
            ((dtr) this).j = iM;
            if (iM != 3) {
                if (this.j == 4 && (dsyVar3 = this.d.U) != null && (dsyVar3.M() == 1 || dsyVar3.M() == 4)) {
                    int iJ = (dsyVar3.j() - this.d.J.b()) - this.d.L.b();
                    j(this.h, dsyVar3.h.h, this.d.J.b());
                    j(this.i, dsyVar3.h.i, -this.d.L.b());
                    dtkVar.c(iJ);
                    return;
                }
                if (this.j == 1) {
                    dtkVar.c(this.d.j());
                }
            }
        } else if (this.j == 4 && (dsyVar = this.d.U) != null && (dsyVar.M() == 1 || dsyVar.M() == 4)) {
            j(this.h, dsyVar.h.h, this.d.J.b());
            j(this.i, dsyVar.h.i, -this.d.L.b());
            return;
        }
        if (dtkVar.i) {
            dsy dsyVar5 = this.d;
            if (dsyVar5.e) {
                dsx[] dsxVarArr = dsyVar5.R;
                dsx dsxVar = dsxVarArr[0];
                if (dsxVar.e == null) {
                    dsx dsxVar2 = dsxVarArr[1];
                    if (dsxVar2.e != null) {
                        defpackage.dtj dtjVarK = k(dsxVar2);
                        if (dtjVarK != null) {
                            defpackage.dtj dtjVar = this.i;
                            j(dtjVar, dtjVarK, -this.d.R[1].b());
                            j(this.h, dtjVar, -dtkVar.f);
                            return;
                        }
                        return;
                    }
                    if ((dsyVar5 instanceof dtc) || dsyVar5.U == null || dsyVar5.K(7).e != null) {
                        return;
                    }
                    dsy dsyVar6 = this.d;
                    defpackage.dtj dtjVar2 = dsyVar6.U.h.h;
                    defpackage.dtj dtjVar3 = this.h;
                    j(dtjVar3, dtjVar2, dsyVar6.k());
                    j(this.i, dtjVar3, dtkVar.f);
                    return;
                }
                if (dsxVarArr[1].e == null) {
                    defpackage.dtj dtjVarK2 = k(dsxVar);
                    if (dtjVarK2 != null) {
                        defpackage.dtj dtjVar4 = this.h;
                        j(dtjVar4, dtjVarK2, this.d.R[0].b());
                        j(this.i, dtjVar4, dtkVar.f);
                        return;
                    }
                    return;
                }
                if (dsyVar5.H()) {
                    this.h.e = this.d.R[0].b();
                    this.i.e = -this.d.R[1].b();
                    return;
                }
                defpackage.dtj dtjVarK3 = k(this.d.R[0]);
                if (dtjVarK3 != null) {
                    j(this.h, dtjVarK3, this.d.R[0].b());
                }
                defpackage.dtj dtjVarK4 = k(this.d.R[1]);
                if (dtjVarK4 != null) {
                    j(this.i, dtjVarK4, -this.d.R[1].b());
                }
                this.h.b = true;
                this.i.b = true;
                return;
            }
        }
        if (this.j == 3) {
            dsy dsyVar7 = this.d;
            int i = dsyVar7.s;
            if (i == 2) {
                dsy dsyVar8 = dsyVar7.U;
                if (dsyVar8 != null) {
                    defpackage.dtk dtkVar2 = dsyVar8.i.e;
                    dtkVar.k.add(dtkVar2);
                    dtkVar2.j.add(dtkVar);
                    dtkVar.b = true;
                    defpackage.dtj dtjVar5 = this.h;
                    java.util.List list = dtkVar.j;
                    list.add(dtjVar5);
                    list.add(this.i);
                }
            } else if (i == 3) {
                if (dsyVar7.t == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    defpackage.dtp dtpVar = dsyVar7.i;
                    dtpVar.h.a = this;
                    dtpVar.i.a = this;
                    dtkVar.a = this;
                    if (dsyVar7.I()) {
                        java.util.List list2 = dtkVar.k;
                        list2.add(this.d.i.e);
                        this.d.i.e.j.add(dtkVar);
                        defpackage.dtp dtpVar2 = this.d.i;
                        dtpVar2.e.a = this;
                        list2.add(dtpVar2.h);
                        list2.add(this.d.i.i);
                        this.d.i.h.j.add(dtkVar);
                        this.d.i.i.j.add(dtkVar);
                    } else {
                        boolean zH = this.d.H();
                        dsy dsyVar9 = this.d;
                        if (zH) {
                            dsyVar9.i.e.k.add(dtkVar);
                            dtkVar.j.add(this.d.i.e);
                        } else {
                            dsyVar9.i.e.k.add(dtkVar);
                        }
                    }
                } else {
                    defpackage.dtk dtkVar3 = dsyVar7.i.e;
                    dtkVar.k.add(dtkVar3);
                    dtkVar3.j.add(dtkVar);
                    this.d.i.h.j.add(dtkVar);
                    this.d.i.i.j.add(dtkVar);
                    dtkVar.b = true;
                    defpackage.dtj dtjVar6 = this.h;
                    java.util.List list3 = dtkVar.j;
                    list3.add(dtjVar6);
                    defpackage.dtj dtjVar7 = this.i;
                    list3.add(dtjVar7);
                    dtjVar6.k.add(dtkVar);
                    dtjVar7.k.add(dtkVar);
                }
            }
        }
        dsy dsyVar10 = this.d;
        dsx[] dsxVarArr2 = dsyVar10.R;
        dsx dsxVar3 = dsxVarArr2[0];
        if (dsxVar3.e == null) {
            dsx dsxVar4 = dsxVarArr2[1];
            if (dsxVar4.e != null) {
                defpackage.dtj dtjVarK5 = k(dsxVar4);
                if (dtjVarK5 != null) {
                    defpackage.dtj dtjVar8 = this.i;
                    j(dtjVar8, dtjVarK5, -this.d.R[1].b());
                    i(this.h, dtjVar8, -1, dtkVar);
                    return;
                }
                return;
            }
            if ((dsyVar10 instanceof dtc) || (dsyVar2 = dsyVar10.U) == null) {
                return;
            }
            defpackage.dtj dtjVar9 = dsyVar2.h.h;
            defpackage.dtj dtjVar10 = this.h;
            j(dtjVar10, dtjVar9, dsyVar10.k());
            i(this.i, dtjVar10, 1, dtkVar);
            return;
        }
        if (dsxVarArr2[1].e == null) {
            defpackage.dtj dtjVarK6 = k(dsxVar3);
            if (dtjVarK6 != null) {
                defpackage.dtj dtjVar11 = this.h;
                j(dtjVar11, dtjVarK6, this.d.R[0].b());
                i(this.i, dtjVar11, 1, dtkVar);
                return;
            }
            return;
        }
        if (dsyVar10.H()) {
            this.h.e = this.d.R[0].b();
            this.i.e = -this.d.R[1].b();
            return;
        }
        defpackage.dtj dtjVarK7 = k(this.d.R[0]);
        defpackage.dtj dtjVarK8 = k(this.d.R[1]);
        if (dtjVarK7 != null) {
            dtjVarK7.a(this);
        }
        if (dtjVarK8 != null) {
            dtjVarK8.a(this);
        }
        this.k = 4;
    }

    public final void c() {
        defpackage.dtj dtjVar = this.h;
        if (dtjVar.i) {
            this.d.Z = dtjVar.f;
        }
    }

    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    public final boolean e() {
        return ((dtr) this).j != 3 || ((dtr) this).d.s == 0;
    }

    public final void f() {
        float f;
        int i = this.k;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            dsy dsyVar = this.d;
            m(dsyVar.J, dsyVar.L, 0);
            return;
        }
        defpackage.dtk dtkVar = this.e;
        if (!dtkVar.i && this.j == 3) {
            dsy dsyVar2 = this.d;
            int i3 = dsyVar2.s;
            if (i3 == 2) {
                dsy dsyVar3 = dsyVar2.U;
                if (dsyVar3 != null) {
                    defpackage.dtk dtkVar2 = dsyVar3.h.e;
                    if (dtkVar2.i) {
                        dtkVar.c((int) ((dtkVar2.f * dsyVar2.x) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = dsyVar2.t;
                if (i4 == 0 || i4 == 3) {
                    defpackage.dtp dtpVar = dsyVar2.i;
                    defpackage.dtj dtjVar = dtpVar.h;
                    defpackage.dtj dtjVar2 = dtpVar.i;
                    boolean z = dsyVar2.J.e != null;
                    boolean z2 = dsyVar2.K.e != null;
                    boolean z3 = dsyVar2.L.e != null;
                    boolean z4 = dsyVar2.M.e != null;
                    int i5 = dsyVar2.Y;
                    if (z && z2 && z3 && z4) {
                        float f2 = dsyVar2.X;
                        if (dtjVar.i && dtjVar2.i) {
                            defpackage.dtj dtjVar3 = this.h;
                            if (dtjVar3.c) {
                                defpackage.dtj dtjVar4 = this.i;
                                if (dtjVar4.c) {
                                    int i6 = ((defpackage.dtj) dtjVar3.k.get(0)).f + dtjVar3.e;
                                    int i7 = ((defpackage.dtj) dtjVar4.k.get(0)).f - dtjVar4.e;
                                    int i8 = dtjVar.f + dtjVar.e;
                                    int i9 = dtjVar2.f - dtjVar2.e;
                                    int[] iArr = a;
                                    n(iArr, i6, i7, i8, i9, f2, i5);
                                    dtkVar.c(iArr[0]);
                                    this.d.i.e.c(iArr[1]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        defpackage.dtj dtjVar5 = this.h;
                        if (dtjVar5.i) {
                            defpackage.dtj dtjVar6 = this.i;
                            if (dtjVar6.i) {
                                if (!dtjVar.c || !dtjVar2.c) {
                                    return;
                                }
                                int i10 = dtjVar5.f + dtjVar5.e;
                                int i11 = dtjVar6.f - dtjVar6.e;
                                int i12 = ((defpackage.dtj) dtjVar.k.get(0)).f + dtjVar.e;
                                int i13 = ((defpackage.dtj) dtjVar2.k.get(0)).f - dtjVar2.e;
                                int[] iArr2 = a;
                                n(iArr2, i10, i11, i12, i13, f2, i5);
                                dtkVar.c(iArr2[0]);
                                this.d.i.e.c(iArr2[1]);
                            }
                        }
                        if (!dtjVar5.c) {
                            return;
                        }
                        defpackage.dtj dtjVar7 = this.i;
                        if (!dtjVar7.c || !dtjVar.c || !dtjVar2.c) {
                            return;
                        }
                        int i14 = ((defpackage.dtj) dtjVar5.k.get(0)).f + dtjVar5.e;
                        int i15 = ((defpackage.dtj) dtjVar7.k.get(0)).f - dtjVar7.e;
                        int i16 = ((defpackage.dtj) dtjVar.k.get(0)).f + dtjVar.e;
                        int i17 = ((defpackage.dtj) dtjVar2.k.get(0)).f - dtjVar2.e;
                        int[] iArr3 = a;
                        n(iArr3, i14, i15, i16, i17, f2, i5);
                        dtkVar.c(iArr3[0]);
                        this.d.i.e.c(iArr3[1]);
                    } else if (z && z3) {
                        defpackage.dtj dtjVar8 = this.h;
                        if (!dtjVar8.c) {
                            return;
                        }
                        defpackage.dtj dtjVar9 = this.i;
                        if (!dtjVar9.c) {
                            return;
                        }
                        float f3 = dsyVar2.X;
                        int i18 = (((defpackage.dtj) dtjVar9.k.get(0)).f - dtjVar9.e) - (((defpackage.dtj) dtjVar8.k.get(0)).f + dtjVar8.e);
                        if (i5 == -1 || i5 == 0) {
                            int iH = h(i18, 0);
                            int i19 = (int) ((iH * f3) + 0.5f);
                            int iH2 = h(i19, 1);
                            if (i19 != iH2) {
                                iH = (int) ((iH2 / f3) + 0.5f);
                            }
                            dtkVar.c(iH);
                            this.d.i.e.c(iH2);
                        } else {
                            int iH3 = h(i18, 0);
                            int i20 = (int) ((iH3 / f3) + 0.5f);
                            int iH4 = h(i20, 1);
                            if (i20 != iH4) {
                                iH3 = (int) ((iH4 * f3) + 0.5f);
                            }
                            dtkVar.c(iH3);
                            this.d.i.e.c(iH4);
                        }
                    } else if (z2 && z4) {
                        if (!dtjVar.c || !dtjVar2.c) {
                            return;
                        }
                        float f4 = dsyVar2.X;
                        int i21 = (((defpackage.dtj) dtjVar2.k.get(0)).f - dtjVar2.e) - (((defpackage.dtj) dtjVar.k.get(0)).f + dtjVar.e);
                        if (i5 != 0) {
                            int iH5 = h(i21, 1);
                            int i22 = (int) ((iH5 / f4) + 0.5f);
                            int iH6 = h(i22, 0);
                            if (i22 != iH6) {
                                iH5 = (int) ((iH6 * f4) + 0.5f);
                            }
                            dtkVar.c(iH6);
                            this.d.i.e.c(iH5);
                        } else {
                            int iH7 = h(i21, 1);
                            int i23 = (int) ((iH7 * f4) + 0.5f);
                            int iH8 = h(i23, 0);
                            if (i23 != iH8) {
                                iH7 = (int) ((iH8 / f4) + 0.5f);
                            }
                            dtkVar.c(iH8);
                            this.d.i.e.c(iH7);
                        }
                    }
                } else {
                    int i24 = dsyVar2.Y;
                    if (i24 == -1 || i24 != 0) {
                        float f5 = dsyVar2.i.e.f;
                        float f6 = dsyVar2.X;
                        f = f5 * f6;
                    } else {
                        f = dsyVar2.i.e.f / dsyVar2.X;
                    }
                    dtkVar.c((int) (f + 0.5f));
                }
            }
        }
        defpackage.dtj dtjVar10 = this.h;
        if (dtjVar10.c) {
            defpackage.dtj dtjVar11 = this.i;
            if (dtjVar11.c) {
                if (dtjVar10.i && dtjVar11.i && dtkVar.i) {
                    return;
                }
                if (!dtkVar.i && this.j == 3) {
                    dsy dsyVar4 = this.d;
                    if (dsyVar4.s == 0 && !dsyVar4.H()) {
                        defpackage.dtj dtjVar12 = (defpackage.dtj) dtjVar10.k.get(0);
                        defpackage.dtj dtjVar13 = (defpackage.dtj) dtjVar11.k.get(0);
                        int i25 = dtjVar12.f + dtjVar10.e;
                        int i26 = dtjVar13.f + dtjVar11.e;
                        dtjVar10.c(i25);
                        dtjVar11.c(i26);
                        dtkVar.c(i26 - i25);
                        return;
                    }
                }
                if (!dtkVar.i && this.j == 3 && this.c == 1) {
                    java.util.List list = dtjVar10.k;
                    if (list.size() > 0) {
                        java.util.List list2 = dtjVar11.k;
                        if (list2.size() > 0) {
                            defpackage.dtj dtjVar14 = (defpackage.dtj) list.get(0);
                            int iMin = java.lang.Math.min((((defpackage.dtj) list2.get(0)).f + dtjVar11.e) - (dtjVar14.f + dtjVar10.e), dtkVar.m);
                            dsy dsyVar5 = this.d;
                            int i27 = dsyVar5.w;
                            int iMax = java.lang.Math.max(dsyVar5.v, iMin);
                            if (i27 > 0) {
                                iMax = java.lang.Math.min(i27, iMax);
                            }
                            dtkVar.c(iMax);
                        }
                    }
                }
                if (dtkVar.i) {
                    defpackage.dtj dtjVar15 = (defpackage.dtj) dtjVar10.k.get(0);
                    defpackage.dtj dtjVar16 = (defpackage.dtj) dtjVar11.k.get(0);
                    int i28 = dtjVar15.f;
                    int i29 = dtjVar10.e + i28;
                    int i30 = dtjVar16.f;
                    int i31 = dtjVar11.e + i30;
                    float f7 = this.d.ae;
                    if (dtjVar15 == dtjVar16) {
                        f7 = 0.5f;
                    } else {
                        i28 = i29;
                        i30 = i31;
                    }
                    dtjVar10.c((int) (i28 + 0.5f + (((i30 - i28) - dtkVar.f) * f7)));
                    dtjVar11.c(dtjVar10.f + dtkVar.f);
                }
            }
        }
    }

    public final void g() {
        this.g = false;
        defpackage.dtj dtjVar = this.h;
        dtjVar.b();
        dtjVar.i = false;
        defpackage.dtj dtjVar2 = this.i;
        dtjVar2.b();
        dtjVar2.i = false;
        this.e.i = false;
    }

    public final java.lang.String toString() {
        return "HorizontalRun ".concat(java.lang.String.valueOf(this.d.ai));
    }
}
