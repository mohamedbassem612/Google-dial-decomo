package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fqw implements defpackage.flj {
    private defpackage.fll a;
    private defpackage.frc b;
    private boolean c;

    private final boolean h(defpackage.flk flkVar) {
        defpackage.fqy fqyVar = new defpackage.fqy();
        if (fqyVar.b(flkVar, true) && (fqyVar.a & 2) == 2) {
            int iMin = java.lang.Math.min(fqyVar.e, 8);
            defpackage.etx etxVar = new defpackage.etx(iMin);
            ((defpackage.flc) flkVar).n(etxVar.b, 0, iMin, false);
            etxVar.Q(0);
            if (etxVar.d() >= 5 && etxVar.n() == 127 && etxVar.w() == 1179402563) {
                this.b = new defpackage.fqv();
                return true;
            }
            etxVar.Q(0);
            try {
                if (defpackage.hgu.aA(1, etxVar, true)) {
                    this.b = new defpackage.frd();
                    return true;
                }
            } catch (defpackage.era unused) {
            }
            etxVar.Q(0);
            if (defpackage.fra.d(etxVar, defpackage.fra.a)) {
                this.b = new defpackage.fra();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        this.a = fllVar;
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        defpackage.frc frcVar = this.b;
        if (frcVar != null) {
            defpackage.fqx fqxVar = frcVar.b;
            fqxVar.a.a();
            fqxVar.b.M(0);
            fqxVar.c = -1;
            fqxVar.d = false;
            fqxVar.e = false;
            fqxVar.f = -1L;
            if (j == 0) {
                frcVar.b(!frcVar.n);
                return;
            }
            if (frcVar.k != 0) {
                frcVar.f = frcVar.g(j2);
                defpackage.fqz fqzVar = frcVar.e;
                java.lang.String str = eum.a;
                fqzVar.c(frcVar.f);
                frcVar.k = 2;
            }
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        try {
            return h(flkVar);
        } catch (defpackage.era unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x022f A[EDGE_INSN: B:119:0x022f->B:90:0x01ac BREAK  A[LOOP:1: B:93:0x01af->B:100:0x01cf]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0100  */
    /* JADX WARN: Code duplicated, block: B:76:0x0135  */
    /* JADX WARN: Type inference failed for: r2v7, types: [fqz, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws defpackage.era {
        int i;
        boolean z;
        byte[] bArr;
        long j;
        byte[] bArrE;
        ahvr.ci(this.a);
        boolean z2 = true;
        if (this.b == null) {
            if (!h(flkVar)) {
                throw new defpackage.era("Failed to determine bitstream type", null, true, 1);
            }
            flkVar.k();
        }
        if (!this.c) {
            defpackage.fmk fmkVarR = this.a.r(0, 1);
            this.a.s();
            defpackage.frc frcVar = this.b;
            frcVar.d = this.a;
            frcVar.c = fmkVarR;
            frcVar.b(true);
            this.c = true;
        }
        defpackage.frc frcVar2 = this.b;
        ahvr.ci(frcVar2.c);
        java.lang.String str = eum.a;
        int i2 = frcVar2.k;
        if (i2 == 0) {
            i = 0;
            while (true) {
                defpackage.fqx fqxVar = frcVar2.b;
                if (!fqxVar.a(flkVar)) {
                    frcVar2.k = 3;
                    return -1;
                }
                defpackage.flc flcVar = (defpackage.flc) flkVar;
                long j2 = flcVar.b;
                long j3 = frcVar2.g;
                frcVar2.m = j2 - j3;
                defpackage.etx etxVar = fqxVar.b;
                if (!frcVar2.c(etxVar, j3, frcVar2.p)) {
                    defpackage.eqg eqgVar = (defpackage.eqg) frcVar2.p.b;
                    frcVar2.l = eqgVar.J;
                    if (frcVar2.o) {
                        z = true;
                    } else {
                        frcVar2.c.p(eqgVar);
                        z = true;
                        frcVar2.o = true;
                    }
                    ?? r2 = frcVar2.p.a;
                    if (r2 == 0) {
                        long j4 = flcVar.a;
                        if (j4 == -1) {
                            frcVar2.e = new defpackage.frb();
                        } else {
                            defpackage.fqy fqyVar = fqxVar.a;
                            frcVar2.e = new defpackage.fqt(frcVar2, frcVar2.g, j4, fqyVar.d + fqyVar.e, fqyVar.b, (fqyVar.a & 4) != 0 ? z : false);
                        }
                        frcVar2.k = 2;
                        bArr = etxVar.b;
                        if (bArr.length != 65025) {
                            break;
                        }
                        etxVar.O(java.util.Arrays.copyOf(bArr, java.lang.Math.max(65025, etxVar.d)), etxVar.d);
                        break;
                    }
                    frcVar2.e = r2;
                    frcVar2.k = 2;
                    bArr = etxVar.b;
                    if (bArr.length != 65025) {
                        break;
                    }
                    etxVar.O(java.util.Arrays.copyOf(bArr, java.lang.Math.max(65025, etxVar.d)), etxVar.d);
                    break;
                }
                frcVar2.g = flcVar.b;
            }
            return i;
        }
        if (i2 == 1) {
            i = 0;
            ((defpackage.flc) flkVar).p((int) frcVar2.g, false);
            frcVar2.k = 2;
            return i;
        }
        if (i2 == 2) {
            long jA = frcVar2.e.a(flkVar);
            if (jA >= 0) {
                aesqVar.a = jA;
                return 1;
            }
            if (jA < -1) {
                frcVar2.h(-(jA + 2));
            }
            if (!frcVar2.n) {
                defpackage.fma fmaVarB = frcVar2.e.b();
                ahvr.ci(fmaVarB);
                frcVar2.d.y(fmaVarB);
                defpackage.fmk fmkVar = frcVar2.c;
                fmaVarB.a();
                fmkVar.z();
                frcVar2.n = true;
            }
            if (frcVar2.m > 0 || frcVar2.b.a(flkVar)) {
                frcVar2.m = 0L;
                defpackage.fqx fqxVar2 = frcVar2.b;
                long j5 = fqxVar2.f;
                if (j5 > frcVar2.h) {
                    frcVar2.h = j5;
                    frcVar2.i = j5;
                    frcVar2.j = 0L;
                }
                defpackage.etx etxVar2 = fqxVar2.b;
                long jA2 = frcVar2.a(etxVar2);
                defpackage.fqy fqyVar2 = fqxVar2.a;
                if (!fqxVar2.d) {
                    z2 = false;
                    break;
                }
                int i3 = fqxVar2.c;
                if (i3 != -1) {
                    boolean z3 = false;
                    while (true) {
                        if (i3 >= fqyVar2.c) {
                            z2 = true;
                            break;
                        }
                        int i4 = fqyVar2.f[i3];
                        z3 = (!(i4 > 0 ? false : z2)) | z3;
                        if (i4 < 255 && z3) {
                            z2 = false;
                            break;
                        }
                        i3++;
                        z2 = true;
                    }
                }
                if (!z2 || jA2 < 0) {
                    j = 0;
                } else {
                    int i5 = fqyVar2.a;
                    if ((i5 & 1) == 0 || (i5 & 4) != 0) {
                        j = 0;
                    } else {
                        long j6 = fqyVar2.b - jA2;
                        j = 0;
                        if (j6 > frcVar2.h) {
                            frcVar2.h = j6;
                        }
                    }
                }
                if (jA2 >= j) {
                    long j7 = frcVar2.h;
                    if (j7 + jA2 >= frcVar2.f) {
                        long jF = frcVar2.f(j7);
                        if ((fqyVar2.a & 4) == 0 || !z2) {
                            bArrE = null;
                        } else {
                            long j8 = fqyVar2.b;
                            if (j8 >= j) {
                                long j9 = j8 - frcVar2.i;
                                long j10 = frcVar2.j + jA2;
                                if (j9 >= j) {
                                    long j11 = j10 - j9;
                                    if (j11 > j) {
                                        bArrE = frcVar2.e(j11);
                                    } else {
                                        bArrE = null;
                                    }
                                } else {
                                    bArrE = null;
                                }
                            } else {
                                bArrE = null;
                            }
                        }
                        if (bArrE != null) {
                            int i6 = etxVar2.d;
                            frcVar2.c.c(new defpackage.etx(aiql.V(i6)), 4, 2);
                            frcVar2.c.b(etxVar2, i6);
                            defpackage.fmk fmkVar2 = frcVar2.c;
                            defpackage.etx etxVar3 = new defpackage.etx(bArrE);
                            int length = bArrE.length;
                            fmkVar2.c(etxVar3, length, 2);
                            frcVar2.c.d(jF, 268435457, i6 + 4 + length, 0, null);
                        } else {
                            frcVar2.c.b(etxVar2, etxVar2.d);
                            frcVar2.c.d(jF, 1, etxVar2.d, 0, null);
                        }
                        frcVar2.f = -1L;
                    }
                    frcVar2.j += jA2;
                    frcVar2.h += jA2;
                }
                if (!z2) {
                    return 0;
                }
                long j12 = fqyVar2.b;
                if (j12 < j) {
                    return 0;
                }
                frcVar2.i = j12;
                frcVar2.j = j;
                return 0;
            }
            frcVar2.k = 3;
        }
        return -1;
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
