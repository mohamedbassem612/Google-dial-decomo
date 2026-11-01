package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dsv extends defpackage.dtc {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    public final int a() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df A[DONT_INVERT, PHI: r14
      0x00df: PHI (r14v8 boolean) = (r14v2 boolean), (r14v9 boolean) binds: [B:69:0x00da, B:71:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    @Override // defpackage.dsy
    public final void b(defpackage.dsq dsqVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        defpackage.dsx[] dsxVarArr = this.R;
        defpackage.dsx dsxVar = this.J;
        dsxVarArr[0] = dsxVar;
        defpackage.dsx dsxVar2 = this.K;
        int i4 = 2;
        dsxVarArr[2] = dsxVar2;
        defpackage.dsx dsxVar3 = this.L;
        dsxVarArr[1] = dsxVar3;
        defpackage.dsx dsxVar4 = this.M;
        dsxVarArr[3] = dsxVar4;
        int i5 = 0;
        while (true) {
            int length = dsxVarArr.length;
            if (i5 >= 6) {
                break;
            }
            defpackage.dsx dsxVar5 = dsxVarArr[i5];
            dsxVar5.h = dsqVar.b(dsxVar5);
            i5++;
        }
        int i6 = this.a;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        defpackage.dsx dsxVar6 = dsxVarArr[i6];
        if (!this.d) {
            c();
        }
        if (this.d) {
            this.d = false;
            int i7 = this.a;
            if (i7 == 0 || i7 == 1) {
                dsqVar.f(dsxVar.h, this.Z);
                dsqVar.f(dsxVar3.h, this.Z);
                return;
            } else {
                if (i7 == 2 || i7 == 3) {
                    dsqVar.f(dsxVar2.h, this.aa);
                    dsqVar.f(dsxVar4.h, this.aa);
                    return;
                }
                return;
            }
        }
        int i8 = 0;
        while (true) {
            if (i8 >= this.as) {
                z2 = false;
                break;
            }
            defpackage.dsy dsyVar = this.ar[i8];
            if ((this.b || dsyVar.d()) && ((((i2 = this.a) == 0 || i2 == 1) && dsyVar.M() == 3 && dsyVar.J.e != null && dsyVar.L.e != null) || (((i3 = this.a) == 2 || i3 == 3) && dsyVar.N() == 3 && dsyVar.K.e != null && dsyVar.M.e != null))) {
                z2 = true;
                break;
            }
            i8++;
        }
        boolean z3 = dsxVar.f() || dsxVar3.f();
        boolean z4 = dsxVar2.f() || dsxVar4.f();
        if (z2) {
            i = 4;
        } else {
            int i9 = this.a;
            i = 5;
            if (i9 != 0) {
                if (i9 != 2) {
                    if ((i9 == 1 || !z3) && (i9 != 3 || !z4)) {
                        i = 4;
                    }
                } else if (!z4) {
                    z4 = false;
                    if (i9 == 1) {
                        i = 4;
                    } else {
                        i = 4;
                    }
                }
            } else if (!z3) {
                i9 = 0;
                z3 = false;
                if (i9 != 2) {
                    if (i9 == 1) {
                        i = 4;
                    } else {
                        i = 4;
                    }
                } else if (!z4) {
                    z4 = false;
                    if (i9 == 1) {
                        i = 4;
                    } else {
                        i = 4;
                    }
                }
            }
        }
        int i10 = 0;
        while (i10 < this.as) {
            defpackage.dsy dsyVar2 = this.ar[i10];
            if (this.b || dsyVar2.d()) {
                defpackage.dsx[] dsxVarArr2 = dsyVar2.R;
                defpackage.dst dstVarB = dsqVar.b(dsxVarArr2[this.a]);
                int i11 = this.a;
                defpackage.dsx dsxVar7 = dsxVarArr2[i11];
                dsxVar7.h = dstVarB;
                defpackage.dsx dsxVar8 = dsxVar7.e;
                int i12 = (dsxVar8 == null || dsxVar8.d != this) ? 0 : dsxVar7.f;
                if (i11 == 0 || i11 == i4) {
                    defpackage.dst dstVar = dsxVar6.h;
                    int i13 = this.c - i12;
                    defpackage.dsp dspVarA = dsqVar.a();
                    defpackage.dst dstVarC = dsqVar.c();
                    dstVarC.e = 0;
                    dspVarA.i(dstVar, dstVarB, dstVarC, i13);
                    dsqVar.e(dspVarA);
                } else {
                    defpackage.dst dstVar2 = dsxVar6.h;
                    int i14 = this.c + i12;
                    defpackage.dsp dspVarA2 = dsqVar.a();
                    defpackage.dst dstVarC2 = dsqVar.c();
                    dstVarC2.e = 0;
                    dspVarA2.h(dstVar2, dstVarB, dstVarC2, i14);
                    dsqVar.e(dspVarA2);
                }
                dsqVar.m(dsxVar6.h, dstVarB, this.c + i12, i);
            }
            i10++;
            i4 = 2;
        }
        int i15 = this.a;
        if (i15 == 0) {
            dsqVar.m(dsxVar3.h, dsxVar.h, 0, 8);
            dsqVar.m(dsxVar.h, this.U.L.h, 0, 4);
            dsqVar.m(dsxVar.h, this.U.J.h, 0, 0);
            return;
        }
        if (i15 == 1) {
            dsqVar.m(dsxVar.h, dsxVar3.h, 0, 8);
            dsqVar.m(dsxVar.h, this.U.J.h, 0, 4);
            dsqVar.m(dsxVar.h, this.U.L.h, 0, 0);
        } else if (i15 == 2) {
            dsqVar.m(dsxVar4.h, dsxVar2.h, 0, 8);
            dsqVar.m(dsxVar2.h, this.U.M.h, 0, 4);
            dsqVar.m(dsxVar2.h, this.U.K.h, 0, 0);
        } else if (i15 == 3) {
            dsqVar.m(dsxVar2.h, dsxVar4.h, 0, 8);
            dsqVar.m(dsxVar2.h, this.U.K.h, 0, 4);
            dsqVar.m(dsxVar2.h, this.U.M.h, 0, 0);
        }
    }

    public final boolean c() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.as;
            if (i4 >= i) {
                break;
            }
            defpackage.dsy dsyVar = this.ar[i4];
            if ((this.b || dsyVar.d()) && ((((i2 = this.a) == 0 || i2 == 1) && !dsyVar.e()) || (((i3 = this.a) == 2 || i3 == 3) && !dsyVar.f()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.as; i5++) {
            defpackage.dsy dsyVar2 = this.ar[i5];
            if (this.b || dsyVar2.d()) {
                if (!z2) {
                    int i6 = this.a;
                    if (i6 == 0) {
                        iMax = dsyVar2.K(2).a();
                    } else if (i6 == 1) {
                        iMax = dsyVar2.K(4).a();
                    } else if (i6 == 2) {
                        iMax = dsyVar2.K(3).a();
                    } else if (i6 == 3) {
                        iMax = dsyVar2.K(5).a();
                    }
                }
                int i7 = this.a;
                if (i7 == 0) {
                    iMax = java.lang.Math.min(iMax, dsyVar2.K(2).a());
                } else if (i7 == 1) {
                    iMax = java.lang.Math.max(iMax, dsyVar2.K(4).a());
                } else if (i7 == 2) {
                    iMax = java.lang.Math.min(iMax, dsyVar2.K(3).a());
                } else if (i7 == 3) {
                    iMax = java.lang.Math.max(iMax, dsyVar2.K(5).a());
                }
                z2 = true;
            }
        }
        int i8 = iMax + this.c;
        int i9 = this.a;
        if (i9 == 0 || i9 == 1) {
            v(i8, i8);
        } else {
            w(i8, i8);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.dsy
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dsy
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.dsy
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.dsy
    public final java.lang.String toString() {
        java.lang.String strConcat = "[Barrier] " + this.ai + " {";
        for (int i = 0; i < this.as; i++) {
            defpackage.dsy dsyVar = this.ar[i];
            if (i > 0) {
                strConcat = strConcat.concat(", ");
            }
            strConcat = strConcat.concat(java.lang.String.valueOf(dsyVar.ai));
        }
        return strConcat.concat("}");
    }
}
