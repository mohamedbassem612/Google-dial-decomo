package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dtp extends dtr {
    public final defpackage.dtj a;
    public defpackage.dtk b;

    public dtp(dsy dsyVar) {
        super(dsyVar);
        defpackage.dtj dtjVar = new defpackage.dtj(this);
        this.a = dtjVar;
        this.b = null;
        this.h.l = 6;
        this.i.l = 7;
        dtjVar.l = 8;
        this.f = 1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0269  */
    /* JADX WARN: Code duplicated, block: B:102:0x026f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0275  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:126:0x0313  */
    /* JADX WARN: Code duplicated, block: B:128:0x031a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0320  */
    /* JADX WARN: Code duplicated, block: B:132:0x033b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0343  */
    /* JADX WARN: Code duplicated, block: B:135:0x0349  */
    /* JADX WARN: Code duplicated, block: B:137:0x034f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0361  */
    /* JADX WARN: Code duplicated, block: B:144:0x0381  */
    /* JADX WARN: Code duplicated, block: B:147:0x038c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0394  */
    /* JADX WARN: Code duplicated, block: B:151:0x039a  */
    /* JADX WARN: Code duplicated, block: B:154:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    public final void b() {
        dsy dsyVar;
        dsy dsyVar2;
        dsx[] dsxVarArr;
        dsx dsxVar;
        dsx dsxVar2;
        dsx dsxVar3;
        dsy dsyVar3;
        defpackage.dtj dtjVar;
        dsy dsyVar4;
        defpackage.dto dtoVar;
        defpackage.dtj dtjVarK;
        defpackage.dtj dtjVarK2;
        defpackage.dtj dtjVar2;
        defpackage.dtj dtjVarK3;
        defpackage.dtj dtjVar3;
        dsy dsyVar5;
        defpackage.dto dtoVar2;
        defpackage.dtj dtjVarK4;
        defpackage.dtj dtjVarK5;
        dsy dsyVar6;
        dsy dsyVar7 = this.d;
        if (dsyVar7.e) {
            this.e.c(dsyVar7.h());
        }
        defpackage.dtk dtkVar = this.e;
        if (!dtkVar.i) {
            ((dtr) this).j = this.d.N();
            if (this.d.F) {
                this.b = new defpackage.dtk(this);
            }
            if (((dtr) this).j != 3) {
                if (this.j == 4 && (dsyVar6 = this.d.U) != null && dsyVar6.N() == 1) {
                    int iH = (dsyVar6.h() - this.d.K.b()) - this.d.M.b();
                    j(this.h, dsyVar6.i.h, this.d.K.b());
                    j(this.i, dsyVar6.i.i, -this.d.M.b());
                    dtkVar.c(iH);
                    return;
                }
                if (this.j == 1) {
                    dtkVar.c(this.d.h());
                }
            }
        } else if (this.j == 4 && (dsyVar = this.d.U) != null && dsyVar.N() == 1) {
            j(this.h, dsyVar.i.h, this.d.K.b());
            j(this.i, dsyVar.i.i, -this.d.M.b());
            return;
        }
        if (!dtkVar.i) {
            if (this.j == 3) {
                dsy dsyVar8 = this.d;
                int i = dsyVar8.t;
                if (i == 2) {
                    dsy dsyVar9 = dsyVar8.U;
                    if (dsyVar9 != null) {
                        defpackage.dtk dtkVar2 = dsyVar9.i.e;
                        dtkVar.k.add(dtkVar2);
                        dtkVar2.j.add(dtkVar);
                        dtkVar.b = true;
                        java.util.List list = dtkVar.j;
                        list.add(this.h);
                        list.add(this.i);
                    }
                } else if (i == 3 && !dsyVar8.I()) {
                    dsy dsyVar10 = this.d;
                    if (dsyVar10.s != 3) {
                        defpackage.dtk dtkVar3 = dsyVar10.h.e;
                        dtkVar.k.add(dtkVar3);
                        dtkVar3.j.add(dtkVar);
                        dtkVar.b = true;
                        java.util.List list2 = dtkVar.j;
                        list2.add(this.h);
                        list2.add(this.i);
                    }
                }
            }
            dsyVar2 = this.d;
            dsxVarArr = dsyVar2.R;
            dsxVar = dsxVarArr[2];
            if (dsxVar.e != null) {
                dsxVar2 = dsxVarArr[3];
                if (dsxVar2.e != null) {
                    dtjVarK2 = k(dsxVar2);
                    if (dtjVarK2 != null) {
                        defpackage.dtj dtjVar4 = this.i;
                        j(dtjVar4, dtjVarK2, -this.d.R[3].b());
                        dtjVar2 = this.h;
                        i(dtjVar2, dtjVar4, -1, dtkVar);
                        if (this.d.F) {
                            i(this.a, dtjVar2, 1, this.b);
                        }
                    }
                } else {
                    dsxVar3 = dsxVarArr[4];
                    if (dsxVar3.e != null) {
                        dtjVarK = k(dsxVar3);
                        if (dtjVarK != null) {
                            defpackage.dtj dtjVar5 = this.a;
                            j(dtjVar5, dtjVarK, 0);
                            defpackage.dtj dtjVar6 = this.h;
                            i(dtjVar6, dtjVar5, -1, this.b);
                            i(this.i, dtjVar6, 1, dtkVar);
                        }
                    } else if (!(dsyVar2 instanceof dtc) && (dsyVar3 = dsyVar2.U) != null) {
                        defpackage.dtj dtjVar7 = dsyVar3.i.h;
                        dtjVar = this.h;
                        j(dtjVar, dtjVar7, dsyVar2.l());
                        i(this.i, dtjVar, 1, dtkVar);
                        if (this.d.F) {
                            i(this.a, dtjVar, 1, this.b);
                        }
                        if (this.j == 3) {
                            dsyVar4 = this.d;
                            if (dsyVar4.X > 0.0f) {
                                dtoVar = dsyVar4.h;
                                if (dtoVar.j == 3) {
                                    dtoVar.e.j.add(dtkVar);
                                    dtkVar.k.add(this.d.h.e);
                                    dtkVar.a = this;
                                }
                            }
                        }
                    }
                }
            } else if (dsxVarArr[3].e != null) {
                if (dsyVar2.I()) {
                    this.h.e = this.d.R[2].b();
                    this.i.e = -this.d.R[3].b();
                } else {
                    dtjVarK4 = k(this.d.R[2]);
                    dtjVarK5 = k(this.d.R[3]);
                    if (dtjVarK4 != null) {
                        dtjVarK4.a(this);
                    }
                    if (dtjVarK5 != null) {
                        dtjVarK5.a(this);
                    }
                    this.k = 4;
                }
                if (this.d.F) {
                    i(this.a, this.h, 1, this.b);
                }
            } else {
                dtjVarK3 = k(dsxVar);
                if (dtjVarK3 != null) {
                    dtjVar3 = this.h;
                    j(dtjVar3, dtjVarK3, this.d.R[2].b());
                    i(this.i, dtjVar3, 1, dtkVar);
                    if (this.d.F) {
                        i(this.a, dtjVar3, 1, this.b);
                    }
                    if (this.j == 3) {
                        dsyVar5 = this.d;
                        if (dsyVar5.X > 0.0f) {
                            dtoVar2 = dsyVar5.h;
                            if (dtoVar2.j == 3) {
                                dtoVar2.e.j.add(dtkVar);
                                dtkVar.k.add(this.d.h.e);
                                dtkVar.a = this;
                            }
                        }
                    }
                }
            }
            if (dtkVar.k.size() == 0) {
                dtkVar.c = true;
            }
        }
        dsy dsyVar11 = this.d;
        if (dsyVar11.e) {
            dsx[] dsxVarArr2 = dsyVar11.R;
            dsx dsxVar4 = dsxVarArr2[2];
            if (dsxVar4.e != null) {
                if (dsxVarArr2[3].e == null) {
                    defpackage.dtj dtjVarK6 = k(dsxVar4);
                    if (dtjVarK6 != null) {
                        defpackage.dtj dtjVar8 = this.h;
                        j(dtjVar8, dtjVarK6, this.d.R[2].b());
                        j(this.i, dtjVar8, dtkVar.f);
                        dsy dsyVar12 = this.d;
                        if (dsyVar12.F) {
                            j(this.a, dtjVar8, dsyVar12.ab);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (dsyVar11.I()) {
                    this.h.e = this.d.R[2].b();
                    this.i.e = -this.d.R[3].b();
                } else {
                    defpackage.dtj dtjVarK7 = k(this.d.R[2]);
                    if (dtjVarK7 != null) {
                        j(this.h, dtjVarK7, this.d.R[2].b());
                    }
                    defpackage.dtj dtjVarK8 = k(this.d.R[3]);
                    if (dtjVarK8 != null) {
                        j(this.i, dtjVarK8, -this.d.R[3].b());
                    }
                    this.h.b = true;
                    this.i.b = true;
                }
                dsy dsyVar13 = this.d;
                if (dsyVar13.F) {
                    j(this.a, this.h, dsyVar13.ab);
                    return;
                }
                return;
            }
            dsx dsxVar5 = dsxVarArr2[3];
            if (dsxVar5.e != null) {
                defpackage.dtj dtjVarK9 = k(dsxVar5);
                if (dtjVarK9 != null) {
                    defpackage.dtj dtjVar9 = this.i;
                    j(dtjVar9, dtjVarK9, -this.d.R[3].b());
                    j(this.h, dtjVar9, -dtkVar.f);
                }
                dsy dsyVar14 = this.d;
                if (dsyVar14.F) {
                    j(this.a, this.h, dsyVar14.ab);
                    return;
                }
                return;
            }
            dsx dsxVar6 = dsxVarArr2[4];
            if (dsxVar6.e != null) {
                defpackage.dtj dtjVarK10 = k(dsxVar6);
                if (dtjVarK10 != null) {
                    defpackage.dtj dtjVar10 = this.a;
                    j(dtjVar10, dtjVarK10, 0);
                    defpackage.dtj dtjVar11 = this.h;
                    j(dtjVar11, dtjVar10, -this.d.ab);
                    j(this.i, dtjVar11, dtkVar.f);
                    return;
                }
                return;
            }
            if ((dsyVar11 instanceof dtc) || dsyVar11.U == null || dsyVar11.K(7).e != null) {
                return;
            }
            dsy dsyVar15 = this.d;
            defpackage.dtj dtjVar12 = dsyVar15.U.i.h;
            defpackage.dtj dtjVar13 = this.h;
            j(dtjVar13, dtjVar12, dsyVar15.l());
            j(this.i, dtjVar13, dtkVar.f);
            dsy dsyVar16 = this.d;
            if (dsyVar16.F) {
                j(this.a, dtjVar13, dsyVar16.ab);
                return;
            }
            return;
        }
        dtkVar.a(this);
        dsyVar2 = this.d;
        dsxVarArr = dsyVar2.R;
        dsxVar = dsxVarArr[2];
        if (dsxVar.e != null) {
            dsxVar2 = dsxVarArr[3];
            if (dsxVar2.e != null) {
                dtjVarK2 = k(dsxVar2);
                if (dtjVarK2 != null) {
                    defpackage.dtj dtjVar14 = this.i;
                    j(dtjVar14, dtjVarK2, -this.d.R[3].b());
                    dtjVar2 = this.h;
                    i(dtjVar2, dtjVar14, -1, dtkVar);
                    if (this.d.F) {
                        i(this.a, dtjVar2, 1, this.b);
                    }
                }
            } else {
                dsxVar3 = dsxVarArr[4];
                if (dsxVar3.e != null) {
                    dtjVarK = k(dsxVar3);
                    if (dtjVarK != null) {
                        defpackage.dtj dtjVar15 = this.a;
                        j(dtjVar15, dtjVarK, 0);
                        defpackage.dtj dtjVar16 = this.h;
                        i(dtjVar16, dtjVar15, -1, this.b);
                        i(this.i, dtjVar16, 1, dtkVar);
                    }
                } else if (!(dsyVar2 instanceof dtc)) {
                    defpackage.dtj dtjVar17 = dsyVar3.i.h;
                    dtjVar = this.h;
                    j(dtjVar, dtjVar17, dsyVar2.l());
                    i(this.i, dtjVar, 1, dtkVar);
                    if (this.d.F) {
                        i(this.a, dtjVar, 1, this.b);
                    }
                    if (this.j == 3) {
                        dsyVar4 = this.d;
                        if (dsyVar4.X > 0.0f) {
                            dtoVar = dsyVar4.h;
                            if (dtoVar.j == 3) {
                                dtoVar.e.j.add(dtkVar);
                                dtkVar.k.add(this.d.h.e);
                                dtkVar.a = this;
                            }
                        }
                    }
                }
            }
        } else if (dsxVarArr[3].e != null) {
            if (dsyVar2.I()) {
                this.h.e = this.d.R[2].b();
                this.i.e = -this.d.R[3].b();
            } else {
                dtjVarK4 = k(this.d.R[2]);
                dtjVarK5 = k(this.d.R[3]);
                if (dtjVarK4 != null) {
                    dtjVarK4.a(this);
                }
                if (dtjVarK5 != null) {
                    dtjVarK5.a(this);
                }
                this.k = 4;
            }
            if (this.d.F) {
                i(this.a, this.h, 1, this.b);
            }
        } else {
            dtjVarK3 = k(dsxVar);
            if (dtjVarK3 != null) {
                dtjVar3 = this.h;
                j(dtjVar3, dtjVarK3, this.d.R[2].b());
                i(this.i, dtjVar3, 1, dtkVar);
                if (this.d.F) {
                    i(this.a, dtjVar3, 1, this.b);
                }
                if (this.j == 3) {
                    dsyVar5 = this.d;
                    if (dsyVar5.X > 0.0f) {
                        dtoVar2 = dsyVar5.h;
                        if (dtoVar2.j == 3) {
                            dtoVar2.e.j.add(dtkVar);
                            dtkVar.k.add(this.d.h.e);
                            dtkVar.a = this;
                        }
                    }
                }
            }
        }
        if (dtkVar.k.size() == 0) {
            dtkVar.c = true;
        }
    }

    public final void c() {
        defpackage.dtj dtjVar = this.h;
        if (dtjVar.i) {
            this.d.aa = dtjVar.f;
        }
    }

    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.a.b();
        this.e.b();
        this.g = false;
    }

    public final boolean e() {
        return ((dtr) this).j != 3 || ((dtr) this).d.t == 0;
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
            m(dsyVar.K, dsyVar.M, 1);
            return;
        }
        defpackage.dtk dtkVar = this.e;
        if (dtkVar.c && !dtkVar.i && this.j == 3) {
            dsy dsyVar2 = this.d;
            int i3 = dsyVar2.t;
            if (i3 == 2) {
                dsy dsyVar3 = dsyVar2.U;
                if (dsyVar3 != null) {
                    defpackage.dtk dtkVar2 = dsyVar3.i.e;
                    if (dtkVar2.i) {
                        dtkVar.c((int) ((dtkVar2.f * dsyVar2.A) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                defpackage.dtk dtkVar3 = dsyVar2.h.e;
                if (dtkVar3.i) {
                    int i4 = dsyVar2.Y;
                    if (i4 == -1 || i4 != 0) {
                        float f2 = dtkVar3.f;
                        float f3 = dsyVar2.X;
                        f = f2 / f3;
                    } else {
                        f = dtkVar3.f * dsyVar2.X;
                    }
                    dtkVar.c((int) (f + 0.5f));
                }
            }
        }
        defpackage.dtj dtjVar = this.h;
        if (dtjVar.c) {
            defpackage.dtj dtjVar2 = this.i;
            if (dtjVar2.c) {
                if (dtjVar.i && dtjVar2.i && dtkVar.i) {
                    return;
                }
                if (!dtkVar.i && this.j == 3) {
                    dsy dsyVar4 = this.d;
                    if (dsyVar4.s == 0 && !dsyVar4.I()) {
                        defpackage.dtj dtjVar3 = (defpackage.dtj) dtjVar.k.get(0);
                        defpackage.dtj dtjVar4 = (defpackage.dtj) dtjVar2.k.get(0);
                        int i5 = dtjVar3.f + dtjVar.e;
                        int i6 = dtjVar4.f + dtjVar2.e;
                        dtjVar.c(i5);
                        dtjVar2.c(i6);
                        dtkVar.c(i6 - i5);
                        return;
                    }
                }
                if (!dtkVar.i && this.j == 3 && this.c == 1) {
                    java.util.List list = dtjVar.k;
                    if (list.size() > 0) {
                        java.util.List list2 = dtjVar2.k;
                        if (list2.size() > 0) {
                            defpackage.dtj dtjVar5 = (defpackage.dtj) list.get(0);
                            defpackage.dtj dtjVar6 = (defpackage.dtj) list2.get(0);
                            int i7 = dtjVar5.f + dtjVar.e;
                            int i8 = dtjVar6.f + dtjVar2.e;
                            int i9 = dtkVar.m;
                            int i10 = i8 - i7;
                            if (i10 < i9) {
                                dtkVar.c(i10);
                            } else {
                                dtkVar.c(i9);
                            }
                        }
                    }
                }
                if (dtkVar.i) {
                    java.util.List list3 = dtjVar.k;
                    if (list3.size() > 0) {
                        java.util.List list4 = dtjVar2.k;
                        if (list4.size() > 0) {
                            defpackage.dtj dtjVar7 = (defpackage.dtj) list3.get(0);
                            defpackage.dtj dtjVar8 = (defpackage.dtj) list4.get(0);
                            int i11 = dtjVar7.f;
                            int i12 = dtjVar.e + i11;
                            int i13 = dtjVar8.f;
                            int i14 = dtjVar2.e + i13;
                            float f4 = this.d.af;
                            if (dtjVar7 == dtjVar8) {
                                f4 = 0.5f;
                            } else {
                                i11 = i12;
                                i13 = i14;
                            }
                            dtjVar.c((int) (i11 + 0.5f + (((i13 - i11) - dtkVar.f) * f4)));
                            dtjVar2.c(dtjVar.f + dtkVar.f);
                        }
                    }
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
        defpackage.dtj dtjVar3 = this.a;
        dtjVar3.b();
        dtjVar3.i = false;
        this.e.i = false;
    }

    public final java.lang.String toString() {
        return "VerticalRun ".concat(java.lang.String.valueOf(this.d.ai));
    }
}
