package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fvg implements defpackage.flj {
    private defpackage.fll a;
    private defpackage.fmk b;
    private defpackage.fve e;
    private int c = 0;
    private long d = -1;
    private int f = -1;
    private long g = -1;

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        this.a = fllVar;
        this.b = fllVar.r(0, 1);
        fllVar.s();
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        defpackage.fve fveVar = this.e;
        if (fveVar != null) {
            fveVar.b(j2);
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        return defpackage.fvi.a(flkVar);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0204  */
    /* JADX WARN: Code duplicated, block: B:68:0x0209  */
    /* JADX WARN: Code duplicated, block: B:69:0x020c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0211  */
    /* JADX WARN: Code duplicated, block: B:73:0x0219  */
    /* JADX WARN: Code duplicated, block: B:75:0x0232  */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws defpackage.era {
        byte[] bArr;
        int i;
        byte[] bArr2;
        defpackage.fvh fvhVar;
        int i2;
        int i3;
        int iO;
        int i4;
        ahvr.ci(this.b);
        java.lang.String str = eum.a;
        int i5 = this.c;
        int i6 = 0;
        if (i5 != 0) {
            long jT = -1;
            if (i5 == 1) {
                byte[] bArr3 = defpackage.fvi.a;
                defpackage.etx etxVar = new defpackage.etx(8);
                ygr ygrVarB = ygr.b(flkVar, etxVar);
                if (ygrVarB.a != 1685272116) {
                    flkVar.k();
                } else {
                    defpackage.flc flcVar = (defpackage.flc) flkVar;
                    flcVar.m(8, false);
                    etxVar.Q(0);
                    flcVar.n(etxVar.b, 0, 8, false);
                    jT = etxVar.t();
                    flcVar.p(((int) ygrVarB.b) + 8, false);
                }
                this.d = jT;
                this.c = 2;
            } else if (i5 == 2) {
                byte[] bArr4 = defpackage.fvi.a;
                defpackage.etx etxVar2 = new defpackage.etx(16);
                long j = defpackage.fvi.b(1718449184, flkVar, etxVar2).b;
                ahvr.bY((boolean) (((j > 16L ? 1 : (j == 16L ? 0 : -1)) ^ (-1)) >>> 31));
                defpackage.flc flcVar2 = (defpackage.flc) flkVar;
                flcVar2.n(etxVar2.b, 0, 16, false);
                etxVar2.Q(0);
                int iL = etxVar2.l();
                int iL2 = etxVar2.l();
                int iK = etxVar2.k();
                etxVar2.k();
                int iL3 = etxVar2.l();
                int iL4 = etxVar2.l();
                int i7 = ((int) j) - 16;
                if (i7 > 0) {
                    bArr = new byte[i7];
                    flcVar2.n(bArr, 0, i7, false);
                    if (iL == 65534) {
                        if (i7 == 24) {
                            defpackage.etx etxVar3 = new defpackage.etx(bArr);
                            etxVar3.l();
                            int iL5 = etxVar3.l();
                            if (iL5 != 0 && iL5 != iL4) {
                                throw new defpackage.era("validBits ( " + iL5 + ")  != bitsPerSample( " + iL4 + ") are not supported", null, false, 1);
                            }
                            int iK2 = etxVar3.k();
                            if (!defpackage.esv.h(iK2, iL2)) {
                                throw new defpackage.era("Channel mask " + iK2 + " is invalid or does not match channel count " + iL2, null, false, 1);
                            }
                            int iL6 = etxVar3.l();
                            byte[] bArr5 = new byte[14];
                            etxVar3.L(bArr5, 0, 14);
                            if (!java.util.Arrays.equals(bArr5, defpackage.fvi.a) && !java.util.Arrays.equals(bArr5, defpackage.fvi.b)) {
                                throw new defpackage.era("invalid wav format extension guid", null, false, 1);
                            }
                            i6 = iK2;
                            bArr2 = bArr;
                            i = iL6;
                        } else {
                            i = 65534;
                        }
                        flcVar2.p((int) (flkVar.e() - flcVar2.b), false);
                        fvhVar = new defpackage.fvh(i, iL2, iK, iL3, iL4, bArr2, i6);
                        i2 = fvhVar.a;
                        if (i2 == 17) {
                            this.e = new defpackage.fvd(this.a, this.b, fvhVar);
                        } else if (i2 == 6) {
                            this.e = new defpackage.fvf(this.a, this.b, fvhVar, "audio/g711-alaw", -1);
                        } else if (i2 == 7) {
                            this.e = new defpackage.fvf(this.a, this.b, fvhVar, "audio/g711-mlaw", -1);
                        } else {
                            i3 = fvhVar.e;
                            if (i2 == 1) {
                                iO = eum.o(i3);
                                i4 = iO;
                            } else if (i2 == 3) {
                                iO = eum.m(i3);
                                i4 = iO;
                            } else if (i2 != 65534) {
                                i4 = 0;
                            } else {
                                iO = eum.o(i3);
                                i4 = iO;
                            }
                            if (i4 == 0) {
                                throw new defpackage.era(a.bj(i2, "Unsupported WAV format type: "), null, false, 1);
                            }
                            this.e = new defpackage.fvf(this.a, this.b, fvhVar, "audio/raw", i4);
                        }
                        this.c = 3;
                    }
                    bArr2 = bArr;
                    flcVar2.p((int) (flkVar.e() - flcVar2.b), false);
                    fvhVar = new defpackage.fvh(i, iL2, iK, iL3, iL4, bArr2, i6);
                    i2 = fvhVar.a;
                    if (i2 == 17) {
                        this.e = new defpackage.fvd(this.a, this.b, fvhVar);
                    } else if (i2 == 6) {
                        this.e = new defpackage.fvf(this.a, this.b, fvhVar, "audio/g711-alaw", -1);
                    } else if (i2 == 7) {
                        this.e = new defpackage.fvf(this.a, this.b, fvhVar, "audio/g711-mlaw", -1);
                    } else {
                        i3 = fvhVar.e;
                        if (i2 == 1) {
                            iO = eum.o(i3);
                            i4 = iO;
                        } else if (i2 == 3) {
                            iO = eum.m(i3);
                            i4 = iO;
                        } else if (i2 != 65534) {
                            i4 = 0;
                        } else {
                            iO = eum.o(i3);
                            i4 = iO;
                        }
                        if (i4 == 0) {
                            throw new defpackage.era(a.bj(i2, "Unsupported WAV format type: "), null, false, 1);
                        }
                        this.e = new defpackage.fvf(this.a, this.b, fvhVar, "audio/raw", i4);
                    }
                    this.c = 3;
                } else {
                    bArr = eum.b;
                }
                i = iL;
                bArr2 = bArr;
                flcVar2.p((int) (flkVar.e() - flcVar2.b), false);
                fvhVar = new defpackage.fvh(i, iL2, iK, iL3, iL4, bArr2, i6);
                i2 = fvhVar.a;
                if (i2 == 17) {
                    this.e = new defpackage.fvd(this.a, this.b, fvhVar);
                } else if (i2 == 6) {
                    this.e = new defpackage.fvf(this.a, this.b, fvhVar, "audio/g711-alaw", -1);
                } else if (i2 == 7) {
                    this.e = new defpackage.fvf(this.a, this.b, fvhVar, "audio/g711-mlaw", -1);
                } else {
                    i3 = fvhVar.e;
                    if (i2 == 1) {
                        iO = eum.o(i3);
                        i4 = iO;
                    } else if (i2 == 3) {
                        iO = eum.m(i3);
                        i4 = iO;
                    } else if (i2 != 65534) {
                        i4 = 0;
                    } else {
                        iO = eum.o(i3);
                        i4 = iO;
                    }
                    if (i4 == 0) {
                        throw new defpackage.era(a.bj(i2, "Unsupported WAV format type: "), null, false, 1);
                    }
                    this.e = new defpackage.fvf(this.a, this.b, fvhVar, "audio/raw", i4);
                }
                this.c = 3;
            } else if (i5 != 3) {
                ahvr.bY(this.g != -1);
                long j2 = this.g - ((defpackage.flc) flkVar).b;
                defpackage.fve fveVar = this.e;
                ahvr.ci(fveVar);
                if (fveVar.c(flkVar, j2)) {
                    return -1;
                }
            } else {
                byte[] bArr6 = defpackage.fvi.a;
                flkVar.k();
                ygr ygrVarB2 = defpackage.fvi.b(1684108385, flkVar, new defpackage.etx(8));
                defpackage.flc flcVar3 = (defpackage.flc) flkVar;
                flcVar3.p(8, false);
                android.util.Pair pairCreate = android.util.Pair.create(java.lang.Long.valueOf(flcVar3.b), java.lang.Long.valueOf(ygrVarB2.b));
                this.f = ((java.lang.Long) pairCreate.first).intValue();
                long jLongValue = ((java.lang.Long) pairCreate.second).longValue();
                long j3 = this.d;
                if (j3 != -1 && jLongValue == 4294967295L) {
                    jLongValue = j3;
                }
                long j4 = ((long) this.f) + jLongValue;
                this.g = j4;
                long j5 = flcVar3.a;
                if (j5 != -1 && j4 > j5) {
                    defpackage.etr.f("WavExtractor", "Data exceeds input length: " + j4 + ", " + j5);
                    this.g = j5;
                }
                defpackage.fve fveVar2 = this.e;
                ahvr.ci(fveVar2);
                fveVar2.a(this.f, this.g);
                this.c = 4;
            }
        } else {
            defpackage.flc flcVar4 = (defpackage.flc) flkVar;
            ahvr.bY(flcVar4.b == 0);
            int i8 = this.f;
            if (i8 != -1) {
                flcVar4.p(i8, false);
                this.c = 4;
            } else {
                if (!defpackage.fvi.a(flkVar)) {
                    throw new defpackage.era("Unsupported or unrecognized wav file type.", null, true, 1);
                }
                flcVar4.p((int) (flkVar.e() - flcVar4.b), false);
                this.c = 1;
            }
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
