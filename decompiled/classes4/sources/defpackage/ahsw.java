package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ahsw {
    public final ahqy d;
    public final float e;
    public ahop i;
    public ahop j;
    public final aify k;
    public final boolean l;
    private final android.util.SparseArray n;
    private final long[] o;
    private final boolean[] p;
    public final java.util.Map a = new java.util.HashMap();
    public java.lang.Long b = null;
    public final java.util.Map c = new java.util.HashMap();
    public final akzx m = apfr.a.m();
    public long f = 0;
    public long g = Long.MAX_VALUE;
    public long h = Long.MIN_VALUE;
    private long q = 1;
    private long r = 2;

    public ahsw(ahqy ahqyVar, android.util.SparseArray sparseArray, float f, aify aifyVar, boolean z) {
        this.d = ahqyVar;
        this.n = sparseArray;
        this.e = f;
        this.k = aifyVar;
        this.l = z;
        this.p = new boolean[ahqyVar.e.size()];
        this.o = new long[ahqyVar.e.size()];
    }

    private final long c(long j, akzm akzmVar, java.lang.String str) {
        long j2 = this.q;
        this.q = 1 + j2;
        akzx akzxVarM = defpackage.apfv.a.m();
        akzxVarM.u();
        defpackage.apfv apfvVar = (defpackage.apfv) akzxVarM.b;
        apfvVar.b |= 2;
        apfvVar.d = j;
        akzxVarM.u();
        defpackage.apfv apfvVar2 = (defpackage.apfv) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        apfvVar2.b |= 1;
        apfvVar2.c = str;
        k(j2, akzmVar, (defpackage.apfv) akzxVarM.p());
        akzx akzxVarN = n(j2);
        akzxVarN.u();
        defpackage.apgz apgzVar = (defpackage.apgz) akzxVarN.b;
        defpackage.apgz apgzVar2 = defpackage.apgz.a;
        apgzVar.b |= 16;
        apgzVar.g = true;
        return j2;
    }

    private final long d(int i) {
        long[] jArr = this.o;
        long j = jArr[i];
        if (j != 0) {
            return j;
        }
        long j2 = this.q;
        this.q = 1 + j2;
        jArr[i] = j2;
        return j2;
    }

    private final long e(ahop ahopVar) {
        return d(ahopVar.d);
    }

    private static long f(ahop ahopVar) {
        long j = ahopVar.f + ahopVar.h;
        return (j * 1000000) + ((long) ahopVar.g) + ((long) ahopVar.i);
    }

    private static long g(ahop ahopVar) {
        return (ahopVar.f * 1000000) + ((long) ahopVar.g);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    private final defpackage.ahsv h(ahop ahopVar) {
        boolean z;
        int i = ahopVar.e;
        if (i == -1) {
            return new defpackage.ahsv(0L, ahwt.a);
        }
        boolean z2 = ahopVar.m;
        alat alatVar = this.d.e;
        do {
            if (i == -1) {
                break;
            }
            ahop ahopVar2 = (ahop) alatVar.get(i);
            int iAN = a.aN(ahopVar2.l);
            if (iAN == 0) {
                iAN = 1;
            }
            int i2 = iAN - 1;
            if (i2 == 1) {
                z = true;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        throw new java.lang.AssertionError("Markers are not expected to be ancestors.");
                    }
                    throw new java.lang.AssertionError("Invalid span kind for span: " + ahopVar2.d);
                }
                z2 = ahopVar2.m & z2;
                i = ahopVar2.e;
                z = false;
            }
        } while (!z);
        ahvr.bD(((long) i) != -1);
        ahop ahopVar3 = (ahop) alatVar.get(i);
        long jG = g(ahopVar3);
        long jG2 = g(ahopVar);
        if (jG <= jG2) {
            long jF = f(ahopVar3);
            if (jG2 <= jF) {
                int iAN2 = a.aN(ahopVar.l);
                if (iAN2 != 0 && iAN2 == 2) {
                    long jF2 = f(ahopVar);
                    if (jG <= jF2 && jF2 <= jF) {
                        if (z2) {
                            return new defpackage.ahsv(e(ahopVar3), ahwt.a);
                        }
                    }
                } else if (z2) {
                    return new defpackage.ahsv(e(ahopVar3), ahwt.a);
                }
            }
        }
        akzm akzmVarJ = j(ahopVar, 0L);
        akzm akzmVarI = i(ahopVar3);
        akzm akzmVar = aldf.a;
        if (akmr.i(akzmVarJ, akzmVarI) >= 0) {
            akzmVarJ = akzmVarI;
        }
        long jC = c(e(ahopVar3), akzmVarJ, java.lang.String.valueOf(ahopVar.c).concat("-dispatch"));
        long jE = e(ahopVar3);
        aldf.g(akzmVarJ);
        return new defpackage.ahsv(jE, ahyn.h(new defpackage.ahsu(jC, a.d(ajsz.dL(akzmVarJ.b, 1000000000L), akzmVarJ.c))));
    }

    private static akzm i(ahop ahopVar) {
        return aldf.e(f(ahopVar));
    }

    private static akzm j(ahop ahopVar, long j) {
        return aldf.e(g(ahopVar) + j);
    }

    private final void k(long j, akzm akzmVar, defpackage.apfv apfvVar) {
        akzx akzxVarM = defpackage.apfw.a.m();
        akzxVarM.u();
        defpackage.apfw apfwVar = (defpackage.apfw) akzxVarM.b;
        apfwVar.b |= 1;
        apfwVar.e = j;
        akzxVarM.u();
        defpackage.apfw apfwVar2 = (defpackage.apfw) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVar);
        apfwVar2.f = akzmVar;
        apfwVar2.b |= 2;
        akzx akzxVarM2 = defpackage.apfs.a.m();
        akzxVarM2.u();
        defpackage.apfs apfsVar = (defpackage.apfs) akzxVarM2.b;
        j$.util.Objects.requireNonNull(apfvVar);
        apfsVar.c = apfvVar;
        apfsVar.b |= 1;
        akzxVarM.u();
        defpackage.apfw apfwVar3 = (defpackage.apfw) akzxVarM.b;
        defpackage.apfs apfsVar2 = (defpackage.apfs) akzxVarM2.p();
        j$.util.Objects.requireNonNull(apfsVar2);
        apfwVar3.d = apfsVar2;
        apfwVar3.c = 5;
        this.m.bK(akzxVarM);
    }

    private final void l(ahop ahopVar, long j, long j2, long j3, java.lang.String str, long j4) {
        long jE = e(ahopVar);
        akzm akzmVarJ = j(ahopVar, j4);
        akzx akzxVarM = defpackage.apft.a.m();
        defpackage.apfv apfvVarM = m(ahopVar, j);
        akzxVarM.u();
        defpackage.apft apftVar = (defpackage.apft) akzxVarM.b;
        j$.util.Objects.requireNonNull(apfvVarM);
        apftVar.c = apfvVarM;
        apftVar.b |= 1;
        if (j2 != 0) {
            akzxVarM.u();
            defpackage.apft apftVar2 = (defpackage.apft) akzxVarM.b;
            apftVar2.b |= 2;
            apftVar2.d = j2;
        }
        if (j3 != 0 && str != null) {
            akzxVarM.u();
            defpackage.apft apftVar3 = (defpackage.apft) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            apftVar3.b |= 8;
            apftVar3.e = str;
            akzxVarM.u();
            defpackage.apft apftVar4 = (defpackage.apft) akzxVarM.b;
            apftVar4.b |= 32;
            apftVar4.g = 1L;
            akzxVarM.u();
            defpackage.apft apftVar5 = (defpackage.apft) akzxVarM.b;
            apftVar5.f = 3;
            apftVar5.b |= 16;
        }
        akzx akzxVar = this.m;
        defpackage.apfw apfwVar = defpackage.apfw.a;
        akzx akzxVarM2 = apfwVar.m();
        akzxVarM2.u();
        defpackage.apfw apfwVar2 = (defpackage.apfw) akzxVarM2.b;
        apfwVar2.b |= 1;
        apfwVar2.e = jE;
        akzxVarM2.u();
        defpackage.apfw apfwVar3 = (defpackage.apfw) akzxVarM2.b;
        j$.util.Objects.requireNonNull(akzmVarJ);
        apfwVar3.f = akzmVarJ;
        apfwVar3.b |= 2;
        akzxVarM2.u();
        defpackage.apfw apfwVar4 = (defpackage.apfw) akzxVarM2.b;
        defpackage.apft apftVar6 = (defpackage.apft) akzxVarM.p();
        j$.util.Objects.requireNonNull(apftVar6);
        apfwVar4.d = apftVar6;
        apfwVar4.c = 3;
        akzxVar.bK(akzxVarM2);
        if ((ahopVar.b & 32) != 0) {
            if (ahopVar.h > 0 || ahopVar.i > 0) {
                akzmVarJ = i(ahopVar);
            }
            akzx akzxVarM3 = defpackage.apfu.a.m();
            if ((ahopVar.b & 128) != 0) {
                akzm akzmVarC = aldf.c(ahopVar.j);
                akzxVarM3.u();
                defpackage.apfu apfuVar = (defpackage.apfu) akzxVarM3.b;
                j$.util.Objects.requireNonNull(akzmVarC);
                apfuVar.c = akzmVarC;
                apfuVar.b |= 1;
            }
            akzx akzxVarM4 = apfwVar.m();
            akzxVarM4.u();
            defpackage.apfw apfwVar5 = (defpackage.apfw) akzxVarM4.b;
            apfwVar5.b |= 1;
            apfwVar5.e = jE;
            akzxVarM4.u();
            defpackage.apfw apfwVar6 = (defpackage.apfw) akzxVarM4.b;
            j$.util.Objects.requireNonNull(akzmVarJ);
            apfwVar6.f = akzmVarJ;
            apfwVar6.b |= 2;
            akzxVarM4.u();
            defpackage.apfw apfwVar7 = (defpackage.apfw) akzxVarM4.b;
            defpackage.apfu apfuVar2 = (defpackage.apfu) akzxVarM3.p();
            j$.util.Objects.requireNonNull(apfuVar2);
            apfwVar7.d = apfuVar2;
            apfwVar7.c = 4;
            akzxVar.bK(akzxVarM4);
        }
    }

    private static final defpackage.apfv m(ahop ahopVar, long j) {
        akzx akzxVarM = defpackage.apfv.a.m();
        java.lang.String str = ahopVar.c;
        akzxVarM.u();
        defpackage.apfv apfvVar = (defpackage.apfv) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        apfvVar.b |= 1;
        apfvVar.c = str;
        akzxVarM.u();
        defpackage.apfv apfvVar2 = (defpackage.apfv) akzxVarM.b;
        apfvVar2.b |= 2;
        apfvVar2.d = j;
        int i = ahopVar.b;
        if ((i & 2048) != 0 && (i & 4096) != 0 && (i & 8192) != 0) {
            akzx akzxVarM2 = defpackage.apfk.a.m();
            int i2 = ahopVar.n;
            akzxVarM2.u();
            defpackage.apfk apfkVar = (defpackage.apfk) akzxVarM2.b;
            apfkVar.b |= 8;
            apfkVar.d = i2;
            int i3 = ahopVar.o;
            akzxVarM2.u();
            defpackage.apfk apfkVar2 = (defpackage.apfk) akzxVarM2.b;
            apfkVar2.b |= 16;
            apfkVar2.e = i3;
            int i4 = ahopVar.p;
            akzxVarM2.u();
            defpackage.apfk apfkVar3 = (defpackage.apfk) akzxVarM2.b;
            apfkVar3.b |= 4;
            apfkVar3.c = i4;
            akzxVarM.u();
            defpackage.apfv apfvVar3 = (defpackage.apfv) akzxVarM.b;
            defpackage.apfk apfkVar4 = (defpackage.apfk) akzxVarM2.p();
            j$.util.Objects.requireNonNull(apfkVar4);
            apfvVar3.e = apfkVar4;
            apfvVar3.b |= 4;
        }
        return (defpackage.apfv) akzxVarM.p();
    }

    private final akzx n(long j) {
        java.util.Map map = this.a;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        akzx akzxVar = (akzx) map.get(lValueOf);
        if (akzxVar != null) {
            return akzxVar;
        }
        akzx akzxVarM = defpackage.apgz.a.m();
        akzxVarM.u();
        defpackage.apgz apgzVar = (defpackage.apgz) akzxVarM.b;
        apgzVar.b |= 1;
        apgzVar.c = j;
        map.put(lValueOf, akzxVarM);
        return akzxVarM;
    }

    public final ahyn a(ahop ahopVar) {
        ahor ahorVarJ = ahou.j(defpackage.ahsq.a, (ahou) this.n.get(ahopVar.d, ahot.a));
        return ahorVarJ.b() ? ((defpackage.ahsq) ahorVarJ.a()).a() : ahwt.a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x0111  */
    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0141  */
    /* JADX WARN: Code duplicated, block: B:57:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0155  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x017c  */
    public final void b(ahop ahopVar) {
        long j;
        int iAN;
        int iAN2;
        boolean z;
        defpackage.ahsv ahsvVarH;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        ahyn ahynVar;
        long j5;
        long j6;
        int i3;
        long jD;
        defpackage.ahsu ahsuVar;
        boolean[] zArr = this.p;
        int i4 = ahopVar.d;
        if (zArr[i4]) {
            return;
        }
        int i5 = ahopVar.e;
        if (i5 > i4) {
            b((ahop) this.d.e.get(i5));
        }
        int iAN3 = a.aN(ahopVar.l);
        if (iAN3 == 0) {
            iAN3 = 1;
        }
        int i6 = iAN3 - 1;
        if (i6 == 1) {
            j = -1;
            int iAN4 = a.aN(ahopVar.l);
            ahvr.bY((iAN4 == 0 && iAN4 == 2) || ((iAN = a.aN(ahopVar.l)) != 0 && iAN == 4));
            iAN2 = a.aN(ahopVar.l);
            if (iAN2 == 0 && iAN2 == 2) {
                z = true;
            } else {
                z = false;
            }
            ahsvVarH = h(ahopVar);
            j2 = ahsvVarH.a;
            if (ahopVar.k) {
                i = 4;
                i2 = 2;
                j3 = 1;
            } else {
                i = 4;
                i2 = 2;
                if (ahopVar.e == -1) {
                    j4 = this.r;
                    this.r = j4 + 1;
                } else if (ahsvVarH.b.f()) {
                    j4 = this.r;
                    this.r = j4 + 1;
                } else {
                    j3 = 0;
                }
                j3 = j4;
            }
            ahynVar = ahsvVarH.b;
            if (ahynVar.f()) {
                ahsuVar = (defpackage.ahsu) ahynVar.b();
                j5 = ahsuVar.a;
                if (g(ahopVar) == ahsuVar.b) {
                    z = true;
                    j6 = 1;
                } else {
                    z = true;
                }
                i3 = ahopVar.e;
                if (i3 != -1) {
                    jD = d(i3);
                    if (jD != j5) {
                        akzx akzxVarN = n(e(ahopVar));
                        akzxVarN.u();
                        defpackage.apgz apgzVar = (defpackage.apgz) akzxVarN.b;
                        defpackage.apgz apgzVar2 = defpackage.apgz.a;
                        apgzVar.b |= 32;
                        apgzVar.h = jD;
                    }
                }
                if (z) {
                    l(ahopVar, j5, j3, 0L, null, j6);
                } else {
                    k(e(ahopVar), j(ahopVar, 0L), m(ahopVar, j5));
                }
            } else {
                j5 = j2;
            }
            j6 = 0;
            i3 = ahopVar.e;
            if (i3 != -1) {
                jD = d(i3);
                if (jD != j5) {
                    akzx akzxVarN2 = n(e(ahopVar));
                    akzxVarN2.u();
                    defpackage.apgz apgzVar3 = (defpackage.apgz) akzxVarN2.b;
                    defpackage.apgz apgzVar4 = defpackage.apgz.a;
                    apgzVar3.b |= 32;
                    apgzVar3.h = jD;
                }
            }
            if (z) {
                l(ahopVar, j5, j3, 0L, null, j6);
            } else {
                k(e(ahopVar), j(ahopVar, 0L), m(ahopVar, j5));
            }
        } else if (i6 != 2) {
            if (i6 != 3) {
                throw new java.lang.AssertionError("Invalid span kind for span: " + ahopVar.d);
            }
            j = -1;
            int iAN5 = a.aN(ahopVar.l);
            ahvr.bY((iAN5 == 0 && iAN5 == 2) || ((iAN = a.aN(ahopVar.l)) != 0 && iAN == 4));
            iAN2 = a.aN(ahopVar.l);
            if (iAN2 == 0) {
                z = false;
            } else {
                z = false;
            }
            ahsvVarH = h(ahopVar);
            j2 = ahsvVarH.a;
            if (ahopVar.k) {
                i = 4;
                i2 = 2;
                j3 = 1;
            } else {
                i = 4;
                i2 = 2;
                if (ahopVar.e == -1) {
                    j4 = this.r;
                    this.r = j4 + 1;
                } else if (ahsvVarH.b.f()) {
                    j4 = this.r;
                    this.r = j4 + 1;
                } else {
                    j3 = 0;
                }
                j3 = j4;
            }
            ahynVar = ahsvVarH.b;
            if (ahynVar.f()) {
                ahsuVar = (defpackage.ahsu) ahynVar.b();
                j5 = ahsuVar.a;
                if (g(ahopVar) == ahsuVar.b) {
                    z = true;
                    j6 = 1;
                } else {
                    z = true;
                }
                i3 = ahopVar.e;
                if (i3 != -1) {
                    jD = d(i3);
                    if (jD != j5) {
                        akzx akzxVarN3 = n(e(ahopVar));
                        akzxVarN3.u();
                        defpackage.apgz apgzVar5 = (defpackage.apgz) akzxVarN3.b;
                        defpackage.apgz apgzVar6 = defpackage.apgz.a;
                        apgzVar5.b |= 32;
                        apgzVar5.h = jD;
                    }
                }
                if (z) {
                    l(ahopVar, j5, j3, 0L, null, j6);
                } else {
                    k(e(ahopVar), j(ahopVar, 0L), m(ahopVar, j5));
                }
            } else {
                j5 = j2;
            }
            j6 = 0;
            i3 = ahopVar.e;
            if (i3 != -1) {
                jD = d(i3);
                if (jD != j5) {
                    akzx akzxVarN4 = n(e(ahopVar));
                    akzxVarN4.u();
                    defpackage.apgz apgzVar7 = (defpackage.apgz) akzxVarN4.b;
                    defpackage.apgz apgzVar8 = defpackage.apgz.a;
                    apgzVar7.b |= 32;
                    apgzVar7.h = jD;
                }
            }
            if (z) {
                l(ahopVar, j5, j3, 0L, null, j6);
            } else {
                k(e(ahopVar), j(ahopVar, 0L), m(ahopVar, j5));
            }
        } else {
            int iAN6 = a.aN(ahopVar.l);
            ahvr.bY(iAN6 != 0 && iAN6 == 3);
            defpackage.ahsv ahsvVarH2 = h(ahopVar);
            ahyn ahynVar2 = ahsvVarH2.b;
            long jC = ahynVar2.f() ? ((defpackage.ahsu) ahynVar2.b()).a : c(ahsvVarH2.a, j(ahopVar, 0L), java.lang.String.valueOf(ahopVar.c).concat("-start"));
            akzx akzxVarN5 = n(e(ahopVar));
            long jD2 = d(ahopVar.e);
            akzxVarN5.u();
            defpackage.apgz apgzVar9 = (defpackage.apgz) akzxVarN5.b;
            defpackage.apgz apgzVar10 = defpackage.apgz.a;
            apgzVar9.b |= 32;
            apgzVar9.h = jD2;
            long j7 = this.r;
            this.r = 1 + j7;
            i2 = 2;
            j = -1;
            l(ahopVar, jC, j7, 1L, "Intervals", 0L);
            i = 4;
        }
        ahyn ahynVarA = a(ahopVar);
        if (ahynVarA.f()) {
            akzx akzxVarN6 = n(e(ahopVar));
            apev apevVar = (apev) ahynVarA.b();
            akzxVarN6.u();
            defpackage.apgz apgzVar11 = (defpackage.apgz) akzxVarN6.b;
            defpackage.apgz apgzVar12 = defpackage.apgz.a;
            j$.util.Objects.requireNonNull(apevVar);
            apgzVar11.d = apevVar;
            apgzVar11.b |= 2;
        }
        if (ahopVar.e == j) {
            this.i = ahopVar;
        } else if (this.j == null) {
            ahor ahorVarJ = ahou.j(defpackage.ahsq.a, (ahou) this.n.get(ahopVar.d, ahot.a));
            if (ahorVarJ.b() && ((defpackage.ahsq) ahorVarJ.a()).b()) {
                this.j = ahopVar;
                akzx akzxVarN7 = n(e(ahopVar));
                akzxVarN7.u();
                defpackage.apgz apgzVar13 = (defpackage.apgz) akzxVarN7.b;
                defpackage.apgz apgzVar14 = defpackage.apgz.a;
                apgzVar13.b |= i;
                apgzVar13.e = true;
            }
        }
        android.util.SparseArray sparseArray = this.n;
        agab agabVar = defpackage.aeng.a;
        int i7 = ahopVar.d;
        ahou ahouVar = ahot.a;
        ahor ahorVarJ2 = ahou.j(agabVar, (ahou) sparseArray.get(i7, ahouVar));
        if (ahorVarJ2.b()) {
            java.lang.Long l = (java.lang.Long) ahorVarJ2.a();
            l.longValue();
            java.lang.Long l2 = this.b;
            if (l2 == null) {
                this.b = l;
            } else {
                boolean zEquals = l2.equals(l);
                java.lang.Long l3 = this.b;
                if (!zEquals) {
                    java.lang.Object[] objArr = new java.lang.Object[i2];
                    objArr[0] = l3;
                    objArr[1] = l;
                    throw new java.lang.IllegalStateException(ahvr.bK("Expected all spans in a TikTok trace to share the same Dapper Trace ID, but found %s and %s", objArr));
                }
            }
        }
        ahor ahorVarJ3 = ahou.j(defpackage.aeng.b, (ahou) sparseArray.get(ahopVar.d, ahouVar));
        if (ahorVarJ3.b()) {
            this.c.put(java.lang.Long.valueOf(e(ahopVar)), (java.lang.Long) ahorVarJ3.a());
        }
        if ((ahopVar.b & 256) != 0) {
            akzx akzxVarN8 = n(e(ahopVar));
            boolean z2 = ahopVar.k;
            akzxVarN8.u();
            defpackage.apgz apgzVar15 = (defpackage.apgz) akzxVarN8.b;
            defpackage.apgz apgzVar16 = defpackage.apgz.a;
            apgzVar15.b |= 8;
            apgzVar15.f = z2;
        }
        long jG = g(ahopVar);
        long jF = f(ahopVar);
        if (jG < this.g) {
            this.g = jG;
        }
        if (jF > this.h) {
            this.h = jF;
        }
        long j8 = ahopVar.f + ahopVar.h;
        if (j8 > this.f) {
            this.f = j8;
        }
        zArr[ahopVar.d] = true;
    }
}
