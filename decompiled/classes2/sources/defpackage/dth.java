package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dth extends dtr {
    java.util.ArrayList a;
    private int b;

    public dth(dsy dsyVar, int i) {
        dsy dsyVar2;
        java.util.ArrayList arrayList;
        super(dsyVar);
        this.a = new java.util.ArrayList();
        this.f = i;
        dsy dsyVar3 = this.d;
        dsy dsyVarN = dsyVar3.n(i);
        while (true) {
            dsy dsyVar4 = dsyVarN;
            dsyVar2 = dsyVar3;
            dsyVar3 = dsyVar4;
            if (dsyVar3 == null) {
                break;
            } else {
                dsyVarN = dsyVar3.n(this.f);
            }
        }
        this.d = dsyVar2;
        this.a.add(dsyVar2.o(this.f));
        dsy dsyVarM = dsyVar2.m(this.f);
        while (true) {
            arrayList = this.a;
            if (dsyVarM == null) {
                break;
            }
            arrayList.add(dsyVarM.o(this.f));
            dsyVarM = dsyVarM.m(this.f);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dtr dtrVar = (dtr) arrayList.get(i2);
            int i3 = this.f;
            if (i3 == 0) {
                dtrVar.d.f = this;
            } else if (i3 == 1) {
                dtrVar.d.g = this;
            }
        }
        if (this.f == 0 && this.d.U.b && this.a.size() > 1) {
            java.util.ArrayList arrayList2 = this.a;
            this.d = ((dtr) arrayList2.get(arrayList2.size() - 1)).d;
        }
        int i4 = this.f;
        dsy dsyVar5 = this.d;
        this.b = i4 == 0 ? dsyVar5.aj : dsyVar5.ak;
    }

    private final dsy g() {
        for (int i = 0; i < this.a.size(); i++) {
            dsy dsyVar = ((dtr) this.a.get(i)).d;
            if (dsyVar.ah != 8) {
                return dsyVar;
            }
        }
        return null;
    }

    private final dsy n() {
        dsy dsyVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            dsyVar = ((dtr) this.a.get(size)).d;
        } while (dsyVar.ah == 8);
        return dsyVar;
    }

    public final long a() {
        int size = this.a.size();
        long jA = 0;
        for (int i = 0; i < size; i++) {
            dtr dtrVar = (dtr) this.a.get(i);
            jA = jA + ((long) dtrVar.h.e) + dtrVar.a() + ((long) dtrVar.i.e);
        }
        return jA;
    }

    public final void b() {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dtr) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 > 0) {
            dsy dsyVar = ((dtr) this.a.get(0)).d;
            dsy dsyVar2 = ((dtr) this.a.get(size2 - 1)).d;
            if (this.f == 0) {
                dsx dsxVar = dsyVar.J;
                dsx dsxVar2 = dsyVar2.L;
                defpackage.dtj dtjVarL = l(dsxVar, 0);
                int iB = dsxVar.b();
                dsy dsyVarG = g();
                if (dsyVarG != null) {
                    iB = dsyVarG.J.b();
                }
                if (dtjVarL != null) {
                    j(this.h, dtjVarL, iB);
                }
                defpackage.dtj dtjVarL2 = l(dsxVar2, 0);
                int iB2 = dsxVar2.b();
                dsy dsyVarN = n();
                if (dsyVarN != null) {
                    iB2 = dsyVarN.L.b();
                }
                if (dtjVarL2 != null) {
                    j(this.i, dtjVarL2, -iB2);
                }
            } else {
                dsx dsxVar3 = dsyVar.K;
                dsx dsxVar4 = dsyVar2.M;
                defpackage.dtj dtjVarL3 = l(dsxVar3, 1);
                int iB3 = dsxVar3.b();
                dsy dsyVarG2 = g();
                if (dsyVarG2 != null) {
                    iB3 = dsyVarG2.K.b();
                }
                if (dtjVarL3 != null) {
                    j(this.h, dtjVarL3, iB3);
                }
                defpackage.dtj dtjVarL4 = l(dsxVar4, 1);
                int iB4 = dsxVar4.b();
                dsy dsyVarN2 = n();
                if (dsyVarN2 != null) {
                    iB4 = dsyVarN2.M.b();
                }
                if (dtjVarL4 != null) {
                    j(this.i, dtjVarL4, -iB4);
                }
            }
            this.h.a = this;
            this.i.a = this;
        }
    }

    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((dtr) this.a.get(i)).c();
        }
    }

    public final void d() {
        this.l = null;
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dtr) arrayList.get(i)).d();
        }
    }

    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((dtr) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0190  */
    public final void f() {
        int i;
        boolean z;
        float f;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        defpackage.dtj dtjVar = this.h;
        if (!dtjVar.i) {
            return;
        }
        defpackage.dtj dtjVar2 = this.i;
        if (!dtjVar2.i) {
            return;
        }
        dsz dszVar = this.d.U;
        boolean z4 = dszVar instanceof dsz ? dszVar.b : false;
        int i10 = dtjVar2.f - dtjVar.f;
        int size = this.a.size();
        int i11 = 0;
        while (true) {
            i = 8;
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((dtr) this.a.get(i11)).d.ah != 8) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < 0) {
                i13 = -1;
                break;
            } else if (((dtr) this.a.get(i13)).d.ah != 8) {
                break;
            } else {
                i13--;
            }
        }
        int i14 = 0;
        while (true) {
            if (i14 >= 2) {
                z = z4;
                f = 0.0f;
                f2 = 0.0f;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                break;
            }
            i3 = 0;
            int i15 = 0;
            f = 0.0f;
            int i16 = 0;
            int i17 = 0;
            f2 = 0.0f;
            while (i15 < size) {
                dtr dtrVar = (dtr) this.a.get(i15);
                dsy dsyVar = dtrVar.d;
                if (dsyVar.ah != i) {
                    i17++;
                    if (i15 > 0 && i15 >= i11) {
                        i3 += dtrVar.h.e;
                    }
                    defpackage.dtk dtkVar = dtrVar.e;
                    int i18 = dtkVar.f;
                    z2 = z4;
                    int i19 = i3;
                    boolean z5 = dtrVar.j != 3;
                    if (z5) {
                        int i20 = this.f;
                        if (i20 == 0) {
                            if (!dsyVar.h.e.i) {
                                return;
                            }
                        } else if (i20 == 1 && !dsyVar.i.e.i) {
                            return;
                        }
                        z3 = z5;
                    } else {
                        z3 = z5;
                        if (dtrVar.c == 1 && i14 == 0) {
                            i18 = dtkVar.m;
                            i16++;
                        } else if (dtkVar.i) {
                        }
                        z3 = true;
                    }
                    if (z3) {
                        i3 = i19 + i18;
                    } else {
                        i16++;
                        float f4 = dsyVar.al[this.f];
                        if (f4 >= 0.0f) {
                            f2 += f4;
                        }
                        i3 = i19;
                    }
                    if (i15 < i12 && i15 < i13) {
                        i3 += -dtrVar.i.e;
                    }
                } else {
                    z2 = z4;
                }
                i15++;
                z4 = z2;
                i = 8;
            }
            z = z4;
            if (i3 < i10 || i16 == 0) {
                i2 = i16;
                i4 = i17;
                break;
            } else {
                i14++;
                z4 = z;
                i = 8;
            }
        }
        int i21 = dtjVar.f;
        if (z) {
            i21 = dtjVar2.f;
        }
        float f5 = 0.5f;
        if (i3 > i10) {
            int i22 = (int) (((i3 - i10) / 2.0f) + 0.5f);
            i21 = z ? i21 + i22 : i21 - i22;
        }
        if (i2 > 0) {
            float f6 = i10 - i3;
            float f7 = (f6 / i2) + 0.5f;
            int i23 = 0;
            int i24 = 0;
            while (i23 < size) {
                dtr dtrVar2 = (dtr) this.a.get(i23);
                float f8 = f5;
                dsy dsyVar2 = dtrVar2.d;
                int i25 = i21;
                int i26 = i2;
                if (dsyVar2.ah != 8 && dtrVar2.j == 3) {
                    defpackage.dtk dtkVar2 = dtrVar2.e;
                    if (!dtkVar2.i) {
                        int i27 = (int) f7;
                        if (f2 > f) {
                            i27 = (int) (((dsyVar2.al[this.f] * f6) / f2) + f8);
                        }
                        if (this.f == 0) {
                            i8 = dsyVar2.w;
                            i9 = dsyVar2.v;
                        } else {
                            i8 = dsyVar2.z;
                            i9 = dsyVar2.y;
                        }
                        int iMax = java.lang.Math.max(i9, dtrVar2.c == 1 ? java.lang.Math.min(i27, dtkVar2.m) : i27);
                        if (i8 > 0) {
                            iMax = java.lang.Math.min(i8, iMax);
                        }
                        if (iMax != i27) {
                            i24++;
                            i27 = iMax;
                        }
                        dtkVar2.c(i27);
                    }
                }
                i23++;
                f5 = f8;
                i21 = i25;
                i2 = i26;
                i3 = i3;
                f6 = f6;
            }
            i5 = i21;
            f3 = f5;
            int i28 = i2;
            int i29 = i3;
            if (i24 > 0) {
                i2 = i28 - i24;
                int i30 = 0;
                for (int i31 = 0; i31 < size; i31++) {
                    dtr dtrVar3 = (dtr) this.a.get(i31);
                    if (dtrVar3.d.ah != 8) {
                        if (i31 > 0 && i31 >= i11) {
                            i30 += dtrVar3.h.e;
                        }
                        i30 += dtrVar3.e.f;
                        if (i31 < i12 && i31 < i13) {
                            i30 += -dtrVar3.i.e;
                        }
                    }
                }
                i3 = i30;
            } else {
                i2 = i28;
                i3 = i29;
            }
            i7 = 2;
            if (this.b == 2 && i24 == 0) {
                i6 = 0;
                this.b = 0;
            } else {
                i6 = 0;
            }
        } else {
            i5 = i21;
            f3 = 0.5f;
            i6 = 0;
            i7 = 2;
        }
        if (i3 > i10) {
            this.b = i7;
        }
        if (i4 > 0 && i2 == 0) {
            if (i11 == i13) {
                this.b = i7;
            }
            i2 = i6;
        }
        int i32 = this.b;
        if (i32 == 1) {
            int i33 = i4 > 1 ? (i10 - i3) / (i4 - 1) : i4 == 1 ? (i10 - i3) / 2 : i6;
            if (i2 > 0) {
                i33 = i6;
            }
            int i34 = i5;
            for (int i35 = i6; i35 < size; i35++) {
                dtr dtrVar4 = (dtr) this.a.get(z ? size - (i35 + 1) : i35);
                if (dtrVar4.d.ah == 8) {
                    dtrVar4.h.c(i34);
                    dtrVar4.i.c(i34);
                } else {
                    if (i35 > 0) {
                        i34 = z ? i34 - i33 : i34 + i33;
                    }
                    if (i35 > 0 && i35 >= i11) {
                        i34 = z ? i34 - dtrVar4.h.e : i34 + dtrVar4.h.e;
                    }
                    if (z) {
                        dtrVar4.i.c(i34);
                    } else {
                        dtrVar4.h.c(i34);
                    }
                    defpackage.dtk dtkVar3 = dtrVar4.e;
                    int i36 = dtkVar3.f;
                    if (dtrVar4.j == 3 && dtrVar4.c == 1) {
                        i36 = dtkVar3.m;
                    }
                    if (z) {
                        i34 -= i36;
                        dtrVar4.h.c(i34);
                    } else {
                        i34 += i36;
                        dtrVar4.i.c(i34);
                    }
                    dtrVar4.g = true;
                    if (i35 < i12 && i35 < i13) {
                        i34 = z ? i34 - (-dtrVar4.i.e) : i34 + (-dtrVar4.i.e);
                    }
                }
            }
            return;
        }
        if (i32 == 0) {
            int i37 = (i10 - i3) / (i4 + 1);
            if (i2 > 0) {
                i37 = i6;
            }
            int i38 = i5;
            for (int i39 = i6; i39 < size; i39++) {
                dtr dtrVar5 = (dtr) this.a.get(z ? size - (i39 + 1) : i39);
                if (dtrVar5.d.ah == 8) {
                    dtrVar5.h.c(i38);
                    dtrVar5.i.c(i38);
                } else {
                    int i40 = z ? i38 - i37 : i38 + i37;
                    if (i39 > 0 && i39 >= i11) {
                        i40 = z ? i40 - dtrVar5.h.e : i40 + dtrVar5.h.e;
                    }
                    if (z) {
                        dtrVar5.i.c(i40);
                    } else {
                        dtrVar5.h.c(i40);
                    }
                    defpackage.dtk dtkVar4 = dtrVar5.e;
                    int iMin = dtkVar4.f;
                    if (dtrVar5.j == 3 && dtrVar5.c == 1) {
                        iMin = java.lang.Math.min(iMin, dtkVar4.m);
                    }
                    if (z) {
                        i38 = i40 - iMin;
                        dtrVar5.h.c(i38);
                    } else {
                        i38 = i40 + iMin;
                        dtrVar5.i.c(i38);
                    }
                    if (i39 < i12 && i39 < i13) {
                        i38 = z ? i38 - (-dtrVar5.i.e) : i38 + (-dtrVar5.i.e);
                    }
                }
            }
            return;
        }
        if (i32 != 2) {
            return;
        }
        int i41 = i10 - i3;
        int i42 = this.f;
        dsy dsyVar3 = this.d;
        float f9 = i42 == 0 ? dsyVar3.ae : dsyVar3.af;
        if (z) {
            f9 = 1.0f - f9;
        }
        int i43 = (int) ((i41 * f9) + f3);
        if (i43 < 0 || i2 > 0) {
            i43 = i6;
        }
        int i44 = z ? i5 - i43 : i5 + i43;
        while (true) {
            int i45 = i6;
            if (i45 >= size) {
                return;
            }
            i6 = i45 + 1;
            dtr dtrVar6 = (dtr) this.a.get(z ? size - i6 : i45);
            if (dtrVar6.d.ah == 8) {
                dtrVar6.h.c(i44);
                dtrVar6.i.c(i44);
            } else {
                if (i45 > 0 && i45 >= i11) {
                    i44 = z ? i44 - dtrVar6.h.e : i44 + dtrVar6.h.e;
                }
                if (z) {
                    dtrVar6.i.c(i44);
                } else {
                    dtrVar6.h.c(i44);
                }
                defpackage.dtk dtkVar5 = dtrVar6.e;
                int i46 = dtkVar5.f;
                if (dtrVar6.j == 3 && dtrVar6.c == 1) {
                    i46 = dtkVar5.m;
                }
                if (z) {
                    i44 -= i46;
                    dtrVar6.h.c(i44);
                } else {
                    i44 += i46;
                    dtrVar6.i.c(i44);
                }
                if (i45 < i12 && i45 < i13) {
                    i44 = z ? i44 - (-dtrVar6.i.e) : i44 + (-dtrVar6.i.e);
                }
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dtr dtrVar = (dtr) arrayList.get(i);
            sb.append('<');
            sb.append(dtrVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
