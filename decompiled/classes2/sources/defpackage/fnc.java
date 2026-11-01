package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fnc implements defpackage.flj {
    private defpackage.fll c;
    private defpackage.fmk d;
    private defpackage.eqy f;
    private defpackage.flo g;
    private int h;
    private int i;
    private int j;
    private long k;
    private defpackage.fkz l;
    private final byte[] a = new byte[42];
    private final defpackage.etx b = new defpackage.etx(new byte[32768], 0);
    private final aesq m = new aesq();
    private int e = 0;

    private final long h(defpackage.etx etxVar, boolean z) {
        boolean zAt;
        ahvr.ci(this.g);
        int i = etxVar.c;
        while (i <= etxVar.d - 16) {
            etxVar.Q(i);
            defpackage.flo floVar = this.g;
            int i2 = this.i;
            aesq aesqVar = this.m;
            if (defpackage.hgu.at(etxVar, floVar, i2, aesqVar)) {
                etxVar.Q(i);
                return aesqVar.a;
            }
            i++;
        }
        if (z) {
            while (true) {
                int i3 = etxVar.d;
                if (i > i3 - this.h) {
                    etxVar.Q(i3);
                    break;
                }
                etxVar.Q(i);
                try {
                    zAt = defpackage.hgu.at(etxVar, this.g, this.i, this.m);
                } catch (java.lang.IndexOutOfBoundsException unused) {
                    zAt = false;
                }
                if (etxVar.c <= etxVar.d && zAt) {
                    etxVar.Q(i);
                    return this.m.a;
                }
                i++;
            }
        } else {
            etxVar.Q(i);
        }
        return -1L;
    }

    private final void i() {
        long j = this.k * 1000000;
        defpackage.flo floVar = this.g;
        java.lang.String str = eum.a;
        this.d.d(j / ((long) floVar.e), 1, this.j, 0, null);
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        this.c = fllVar;
        this.d = fllVar.r(0, 1);
        fllVar.s();
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        if (j == 0) {
            this.e = 0;
        } else {
            defpackage.fkz fkzVar = this.l;
            if (fkzVar != null) {
                fkzVar.a(j2);
            }
        }
        this.k = j2 != 0 ? -1L : 0L;
        this.j = 0;
        this.b.M(0);
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        defpackage.hgu.ah(flkVar, false);
        defpackage.etx etxVar = new defpackage.etx(4);
        ((defpackage.flc) flkVar).n(etxVar.b, 0, 4, false);
        return etxVar.w() == 1716281667;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01a3  */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws defpackage.era {
        int i;
        boolean zP;
        defpackage.flo floVar;
        defpackage.fma flzVar;
        long j;
        boolean z;
        int i2 = this.e;
        if (i2 == 0) {
            i = 0;
            flkVar.k();
            long jE = flkVar.e();
            defpackage.eqy eqyVarAh = defpackage.hgu.ah(flkVar, true);
            ((defpackage.flc) flkVar).p((int) (flkVar.e() - jE), false);
            this.f = eqyVarAh;
            this.e = 1;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        defpackage.flo floVarE = this.g;
                        do {
                            flkVar.k();
                            defpackage.etv etvVar = new defpackage.etv(new byte[4]);
                            defpackage.flc flcVar = (defpackage.flc) flkVar;
                            flcVar.n((byte[]) etvVar.c, 0, 4, false);
                            zP = etvVar.p();
                            int iD = etvVar.d(7);
                            int iD2 = etvVar.d(24) + 4;
                            if (iD == 0) {
                                byte[] bArr = new byte[38];
                                flcVar.o(bArr, 0, 38, false);
                                floVarE = new defpackage.flo(bArr, 4);
                            } else {
                                if (floVarE == null) {
                                    throw new java.lang.IllegalArgumentException();
                                }
                                if (iD == 3) {
                                    defpackage.etx etxVar = new defpackage.etx(iD2);
                                    flcVar.o(etxVar.b, 0, iD2, false);
                                    floVarE = floVarE.e(defpackage.hgu.aF(etxVar));
                                } else {
                                    if (iD == 4) {
                                        defpackage.etx etxVar2 = new defpackage.etx(iD2);
                                        flcVar.o(etxVar2.b, 0, iD2, false);
                                        etxVar2.R(4);
                                        floVar = new defpackage.flo(floVarE.a, floVarE.b, floVarE.c, floVarE.d, floVarE.e, floVarE.g, floVarE.h, floVarE.j, floVarE.k, floVarE.d(defpackage.fmm.a(java.util.Arrays.asList((java.lang.Object[]) defpackage.hgu.aE(etxVar2, false, false).a))));
                                    } else if (iD == 6) {
                                        defpackage.etx etxVar3 = new defpackage.etx(iD2);
                                        flcVar.o(etxVar3.b, 0, iD2, false);
                                        etxVar3.R(4);
                                        floVar = new defpackage.flo(floVarE.a, floVarE.b, floVarE.c, floVarE.d, floVarE.e, floVarE.g, floVarE.h, floVarE.j, floVarE.k, floVarE.d(new defpackage.eqy(aify.p(defpackage.fnx.d(etxVar3)))));
                                    } else {
                                        flcVar.p(iD2, false);
                                    }
                                    floVarE = floVar;
                                }
                            }
                            java.lang.String str = eum.a;
                            this.g = floVarE;
                        } while (!zP);
                        ahvr.ci(floVarE);
                        this.h = java.lang.Math.max(this.g.c, 6);
                        defpackage.eqg eqgVarC = this.g.c(this.a, this.f);
                        defpackage.fmk fmkVar = this.d;
                        defpackage.eqf eqfVar = new defpackage.eqf(eqgVarC);
                        eqfVar.a("audio/flac");
                        fmkVar.p(new defpackage.eqg(eqfVar));
                        defpackage.fmk fmkVar2 = this.d;
                        this.g.a();
                        fmkVar2.z();
                        this.e = 4;
                    } else {
                        if (i2 != 4) {
                            ahvr.ci(this.d);
                            ahvr.ci(this.g);
                            defpackage.fkz fkzVar = this.l;
                            if (fkzVar != null && fkzVar.b()) {
                                return fkzVar.f(flkVar, aesqVar);
                            }
                            if (this.k == -1) {
                                defpackage.flo floVar2 = this.g;
                                flkVar.k();
                                defpackage.flc flcVar2 = (defpackage.flc) flkVar;
                                flcVar2.m(1, false);
                                byte[] bArr2 = new byte[1];
                                flcVar2.n(bArr2, 0, 1, false);
                                int i3 = bArr2[0] & 1;
                                boolean z2 = 1 == i3;
                                flcVar2.m(2, false);
                                int i4 = 1 != i3 ? 6 : 7;
                                defpackage.etx etxVar4 = new defpackage.etx(i4);
                                etxVar4.P(defpackage.hgu.al(flkVar, etxVar4.b, 0, i4));
                                flkVar.k();
                                aesq aesqVar2 = new aesq();
                                if (!defpackage.hgu.as(etxVar4, floVar2, z2, aesqVar2)) {
                                    throw new defpackage.era(null, null, true, 1);
                                }
                                this.k = aesqVar2.a;
                                return 0;
                            }
                            defpackage.etx etxVar5 = this.b;
                            int i5 = etxVar5.d;
                            if (i5 < 32768) {
                                int iA = flkVar.a(etxVar5.b, i5, 32768 - i5);
                                z = iA == -1;
                                if (!z) {
                                    etxVar5.P(i5 + iA);
                                } else if (etxVar5.d() == 0) {
                                    i();
                                    return -1;
                                }
                            } else {
                                z = false;
                            }
                            int i6 = etxVar5.c;
                            int i7 = this.j;
                            int i8 = this.h;
                            if (i7 < i8) {
                                etxVar5.R(java.lang.Math.min(i8 - i7, etxVar5.d()));
                            }
                            long jH = h(etxVar5, z);
                            int i9 = etxVar5.c - i6;
                            etxVar5.Q(i6);
                            this.d.b(etxVar5, i9);
                            this.j += i9;
                            if (jH != -1) {
                                i();
                                this.j = 0;
                                this.k = jH;
                            }
                            int length = etxVar5.b.length - etxVar5.d;
                            if (etxVar5.d() >= 16 || length >= 16) {
                                return 0;
                            }
                            int iD3 = etxVar5.d();
                            byte[] bArr3 = etxVar5.b;
                            java.lang.System.arraycopy(bArr3, etxVar5.c, bArr3, 0, iD3);
                            etxVar5.Q(0);
                            etxVar5.P(iD3);
                            return 0;
                        }
                        flkVar.k();
                        defpackage.etx etxVar6 = new defpackage.etx(2);
                        defpackage.flc flcVar3 = (defpackage.flc) flkVar;
                        flcVar3.n(etxVar6.b, 0, 2, false);
                        int iS = etxVar6.s();
                        if ((iS >> 2) != 16382) {
                            flkVar.k();
                            throw new defpackage.era("First frame does not start with sync code.", null, true, 1);
                        }
                        flkVar.k();
                        this.i = iS;
                        defpackage.fll fllVar = this.c;
                        java.lang.String str2 = eum.a;
                        long j2 = flcVar3.b;
                        long j3 = flcVar3.a;
                        ahvr.ci(this.g);
                        final defpackage.flo floVar3 = this.g;
                        ils ilsVar = floVar3.k;
                        if (ilsVar != null && ((long[]) ilsVar.b).length > 0) {
                            flzVar = new defpackage.fln(floVar3, j2);
                        } else if (j3 != -1) {
                            long j4 = floVar3.j;
                            if (j4 > 0) {
                                int i10 = this.i;
                                j$.util.Objects.requireNonNull(floVar3);
                                defpackage.fkw fkwVar = new defpackage.fkw() { // from class: fna
                                    @Override // defpackage.fkw
                                    public final long a(long j5) {
                                        return floVar3.b(j5);
                                    }
                                };
                                defpackage.fnb fnbVar = new defpackage.fnb(floVar3, i10);
                                long jA = floVar3.a();
                                int i11 = floVar3.d;
                                if (i11 > 0) {
                                    j = ((((long) i11) + ((long) floVar3.c)) / 2) + 1;
                                } else {
                                    int i12 = floVar3.a;
                                    long j5 = 4096;
                                    if (i12 == floVar3.b && i12 > 0) {
                                        j5 = i12;
                                    }
                                    j = (((((long) floVar3.g) * j5) * ((long) floVar3.h)) / 8) + 64;
                                }
                                defpackage.fkz fkzVar2 = new defpackage.fkz(fkwVar, fnbVar, jA, j4, j2, j3, j, java.lang.Math.max(6, floVar3.c));
                                this.l = fkzVar2;
                                flzVar = fkzVar2.a;
                            } else {
                                flzVar = new defpackage.flz(floVar3.a(), 0L);
                            }
                        } else {
                            flzVar = new defpackage.flz(floVar3.a(), 0L);
                        }
                        fllVar.y(flzVar);
                        this.e = 5;
                    }
                } else {
                    defpackage.etx etxVar7 = new defpackage.etx(4);
                    ((defpackage.flc) flkVar).o(etxVar7.b, 0, 4, false);
                    if (etxVar7.w() != 1716281667) {
                        throw new defpackage.era("Failed to read FLAC stream marker.", null, true, 1);
                    }
                    this.e = 3;
                }
                return 0;
            }
            i = 0;
            ((defpackage.flc) flkVar).n(this.a, 0, 42, false);
            flkVar.k();
            this.e = 2;
        }
        return i;
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
