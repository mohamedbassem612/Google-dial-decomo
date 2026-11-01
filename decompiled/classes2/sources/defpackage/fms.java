package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fms implements defpackage.flj {
    public defpackage.fmv[] a;
    private final defpackage.etx b;
    private final boolean c;
    private final defpackage.frr d;
    private int e;
    private defpackage.fll f;
    private defpackage.fmt g;
    private long h;
    private long i;
    private defpackage.fmv j;
    private int k;
    private long l;
    private long m;
    private int n;
    private boolean o;
    private final defpackage.gnu p;

    public fms(int i, defpackage.frr frrVar) {
        this.d = frrVar;
        this.c = 1 == (i ^ 1);
        this.b = new defpackage.etx(12);
        this.p = new defpackage.gnu(null, null);
        this.f = new defpackage.flx(0);
        this.a = new defpackage.fmv[0];
        this.l = -1L;
        this.m = -1L;
        this.k = -1;
        this.h = -9223372036854775807L;
    }

    private final defpackage.fmv h(int i) {
        defpackage.fmv[] fmvVarArr = this.a;
        int length = fmvVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            defpackage.fmv fmvVar = fmvVarArr[i2];
            if (fmvVar.c == i || fmvVar.d == i) {
                return fmvVar;
            }
        }
        return null;
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        this.e = 0;
        if (this.c) {
            fllVar = new defpackage.fru(fllVar, this.d);
        }
        this.f = fllVar;
        this.i = -1L;
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        this.i = -1L;
        this.j = null;
        for (defpackage.fmv fmvVar : this.a) {
            if (fmvVar.k == 0) {
                fmvVar.i = 0;
            } else {
                fmvVar.i = fmvVar.n[eum.ac(fmvVar.m, j, true)];
            }
        }
        if (j == 0) {
            this.e = this.a.length != 0 ? 3 : 0;
        } else {
            this.e = 6;
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        defpackage.etx etxVar = this.b;
        ((defpackage.flc) flkVar).n(etxVar.b, 0, 12, false);
        etxVar.Q(0);
        if (etxVar.j() != 1179011410) {
            return false;
        }
        etxVar.R(4);
        return etxVar.j() == 541677121;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0360  */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws defpackage.era {
        boolean z;
        defpackage.fmv fmvVar;
        long j;
        int i;
        long j2 = this.i;
        if (j2 != -1) {
            defpackage.flc flcVar = (defpackage.flc) flkVar;
            long j3 = flcVar.b;
            if (j2 < j3 || j2 > 262144 + j3) {
                aesqVar.a = j2;
                z = true;
            } else {
                flcVar.p((int) (j2 - j3), false);
                z = false;
            }
        } else {
            z = false;
        }
        this.i = -1L;
        if (z) {
            return 1;
        }
        int i2 = this.e;
        if (i2 == 0) {
            if (!e(flkVar)) {
                throw new defpackage.era("AVI Header List not found", null, true, 1);
            }
            ((defpackage.flc) flkVar).p(12, false);
            this.e = 1;
            return 0;
        }
        if (i2 == 1) {
            defpackage.etx etxVar = this.b;
            ((defpackage.flc) flkVar).o(etxVar.b, 0, 12, false);
            etxVar.Q(0);
            defpackage.gnu gnuVar = this.p;
            gnuVar.d(etxVar);
            int i3 = gnuVar.b;
            if (i3 != 1414744396) {
                throw new defpackage.era(a.bj(i3, "LIST expected, found: "), null, true, 1);
            }
            int iJ = etxVar.j();
            if (iJ != 1819436136) {
                throw new defpackage.era(a.bj(iJ, "hdrl expected, found: "), null, true, 1);
            }
            this.k = gnuVar.a;
            this.e = 2;
        } else if (i2 == 2) {
            int i4 = 2;
            int i5 = this.k - 4;
            defpackage.etx etxVar2 = new defpackage.etx(i5);
            ((defpackage.flc) flkVar).o(etxVar2.b, 0, i5, false);
            defpackage.fmw fmwVarC = defpackage.fmw.c(1819436136, etxVar2);
            int i6 = fmwVarC.b;
            if (i6 != 1819436136) {
                throw new defpackage.era(a.bj(i6, "Unexpected header list type "), null, true, 1);
            }
            defpackage.fmt fmtVar = (defpackage.fmt) fmwVarC.b(defpackage.fmt.class);
            if (fmtVar == null) {
                throw new defpackage.era("AviHeader not found", null, true, 1);
            }
            this.g = fmtVar;
            this.h = ((long) fmtVar.c) * ((long) fmtVar.a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            aike aikeVar = fmwVarC.a;
            int i7 = aikeVar.d;
            int i8 = 0;
            int i9 = 0;
            while (i8 < i7) {
                defpackage.fmq fmqVar = (defpackage.fmq) aikeVar.get(i8);
                if (fmqVar.a() == 1819440243) {
                    defpackage.fmw fmwVar = (defpackage.fmw) fmqVar;
                    int i10 = i9 + 1;
                    defpackage.fmu fmuVar = (defpackage.fmu) fmwVar.b(defpackage.fmu.class);
                    defpackage.fmx fmxVar = (defpackage.fmx) fmwVar.b(defpackage.fmx.class);
                    if (fmuVar == null) {
                        defpackage.etr.f("AviExtractor", "Missing Stream Header");
                    } else if (fmxVar == null) {
                        defpackage.etr.f("AviExtractor", "Missing Stream Format");
                    } else {
                        long jC = fmuVar.c();
                        defpackage.eqg eqgVar = fmxVar.a;
                        defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
                        eqfVar.b(i9);
                        int i11 = fmuVar.e;
                        if (i11 != 0) {
                            eqfVar.o = i11;
                        }
                        defpackage.fmy fmyVar = (defpackage.fmy) fmwVar.b(defpackage.fmy.class);
                        if (fmyVar != null) {
                            eqfVar.b = fmyVar.a;
                        }
                        int iB = defpackage.eqz.b(eqgVar.p);
                        if (iB != 1) {
                            if (iB == i4) {
                                iB = 2;
                            }
                            if (fmvVar != null) {
                                arrayList.add(fmvVar);
                            }
                            i9 = i10;
                        }
                        defpackage.fmk fmkVarR = this.f.r(i9, iB);
                        defpackage.eqg eqgVar2 = new defpackage.eqg(eqfVar);
                        fmkVarR.p(eqgVar2);
                        fmkVarR.z();
                        this.h = java.lang.Math.max(this.h, jC);
                        fmvVar = new defpackage.fmv(i9, fmuVar, fmkVarR, defpackage.eqz.e(eqgVar2.p, eqgVar2.k));
                        if (fmvVar != null) {
                            arrayList.add(fmvVar);
                        }
                        i9 = i10;
                    }
                    fmvVar = null;
                    if (fmvVar != null) {
                        arrayList.add(fmvVar);
                    }
                    i9 = i10;
                }
                i8++;
                i4 = 2;
            }
            this.a = (defpackage.fmv[]) arrayList.toArray(new defpackage.fmv[0]);
            this.f.s();
            this.e = 3;
        } else if (i2 == 3) {
            long j4 = this.l;
            if (j4 == -1 || ((defpackage.flc) flkVar).b == j4) {
                defpackage.etx etxVar3 = this.b;
                defpackage.flc flcVar2 = (defpackage.flc) flkVar;
                flcVar2.n(etxVar3.b, 0, 12, false);
                flkVar.k();
                etxVar3.Q(0);
                defpackage.gnu gnuVar2 = this.p;
                gnuVar2.d(etxVar3);
                int iJ2 = etxVar3.j();
                int i12 = gnuVar2.b;
                if (i12 == 1179011410) {
                    flcVar2.p(12, false);
                } else if (i12 == 1414744396 && iJ2 == 1769369453) {
                    long j5 = flcVar2.b;
                    this.l = j5;
                    this.m = j5 + ((long) gnuVar2.a) + 8;
                    if (this.o) {
                        this.i = flcVar2.b + 12;
                        this.e = 6;
                    } else {
                        defpackage.fmt fmtVar2 = this.g;
                        ahvr.ci(fmtVar2);
                        if ((fmtVar2.b & 16) != 16) {
                            this.f.y(new defpackage.flz(this.h, 0L));
                            this.o = true;
                            this.i = flcVar2.b + 12;
                            this.e = 6;
                        } else {
                            this.e = 4;
                            this.i = this.m;
                        }
                    }
                } else {
                    this.i = flcVar2.b + ((long) gnuVar2.a) + 8;
                }
            } else {
                this.i = j4;
            }
        } else if (i2 == 4) {
            defpackage.etx etxVar4 = this.b;
            defpackage.flc flcVar3 = (defpackage.flc) flkVar;
            flcVar3.o(etxVar4.b, 0, 8, false);
            etxVar4.Q(0);
            int iJ3 = etxVar4.j();
            int iJ4 = etxVar4.j();
            if (iJ3 == 829973609) {
                this.e = 5;
                this.n = iJ4;
            } else {
                this.i = flcVar3.b + ((long) iJ4);
            }
        } else {
            if (i2 != 5) {
                defpackage.flc flcVar4 = (defpackage.flc) flkVar;
                long j6 = flcVar4.b;
                if (j6 >= this.m) {
                    return -1;
                }
                defpackage.fmv fmvVar2 = this.j;
                if (fmvVar2 != null) {
                    int i13 = fmvVar2.h;
                    defpackage.fmk fmkVar = fmvVar2.b;
                    int iA = i13 - fmkVar.a(flkVar, i13, false);
                    fmvVar2.h = iA;
                    if (iA == 0) {
                        if (fmvVar2.g > 0) {
                            fmkVar.d(fmvVar2.a(fmvVar2.i), (fmvVar2.e || java.util.Arrays.binarySearch(fmvVar2.n, fmvVar2.i) >= 0) ? 1 : 0, fmvVar2.g, 0, null);
                        }
                        fmvVar2.i++;
                        this.j = null;
                    }
                } else {
                    if ((j6 & 1) == 1) {
                        flcVar4.p(1, false);
                    }
                    defpackage.etx etxVar5 = this.b;
                    flcVar4.n(etxVar5.b, 0, 12, false);
                    etxVar5.Q(0);
                    int iJ5 = etxVar5.j();
                    if (iJ5 == 1414744396) {
                        etxVar5.Q(8);
                        flcVar4.p(etxVar5.j() != 1769369453 ? 8 : 12, false);
                        flkVar.k();
                    } else {
                        int iJ6 = etxVar5.j();
                        if (iJ5 == 1263424842) {
                            this.i = flcVar4.b + ((long) iJ6) + 8;
                        } else {
                            flcVar4.p(8, false);
                            flkVar.k();
                            defpackage.fmv fmvVarH = h(iJ5);
                            if (fmvVarH == null) {
                                this.i = flcVar4.b + ((long) iJ6);
                            } else {
                                fmvVarH.g = iJ6;
                                fmvVarH.h = iJ6;
                                this.j = fmvVarH;
                            }
                        }
                    }
                }
                return 0;
            }
            defpackage.etx etxVar6 = new defpackage.etx(this.n);
            ((defpackage.flc) flkVar).o(etxVar6.b, 0, this.n, false);
            if (etxVar6.d() < 16) {
                j = 0;
            } else {
                int i14 = etxVar6.c;
                etxVar6.R(8);
                long j7 = etxVar6.j();
                long j8 = this.l;
                j = j7 > j8 ? 0L : j8 + 8;
                etxVar6.Q(i14);
            }
            while (etxVar6.d() >= 16) {
                int iJ7 = etxVar6.j();
                int iJ8 = etxVar6.j();
                long j9 = ((long) etxVar6.j()) + j;
                etxVar6.R(4);
                defpackage.fmv fmvVarH2 = h(iJ7);
                if (fmvVarH2 != null) {
                    int i15 = iJ8 & 16;
                    if (fmvVarH2.l == -1) {
                        fmvVarH2.l = j9;
                    }
                    if (i15 == 16 || fmvVarH2.e) {
                        if (fmvVarH2.k == fmvVarH2.n.length) {
                            long[] jArr = fmvVarH2.m;
                            fmvVarH2.m = java.util.Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                            int[] iArr = fmvVarH2.n;
                            fmvVarH2.n = java.util.Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                        }
                        long[] jArr2 = fmvVarH2.m;
                        int i16 = fmvVarH2.k;
                        jArr2[i16] = j9;
                        fmvVarH2.n[i16] = fmvVarH2.j;
                        fmvVarH2.k = i16 + 1;
                    }
                    fmvVarH2.j++;
                }
            }
            for (defpackage.fmv fmvVar3 : this.a) {
                fmvVar3.m = java.util.Arrays.copyOf(fmvVar3.m, fmvVar3.k);
                fmvVar3.n = java.util.Arrays.copyOf(fmvVar3.n, fmvVar3.k);
                if (fmvVar3.e && fmvVar3.a.f != 0 && (i = fmvVar3.k) > 0) {
                    fmvVar3.f = i;
                }
            }
            this.o = true;
            int length = this.a.length;
            defpackage.fll fllVar = this.f;
            if (length == 0) {
                fllVar.y(new defpackage.flz(this.h, 0L));
            } else {
                fllVar.y(new defpackage.fmr(this, this.h));
            }
            this.e = 6;
            this.i = this.l;
        }
        return 0;
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
