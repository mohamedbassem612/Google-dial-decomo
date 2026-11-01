package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ftv implements defpackage.ftx {
    private final defpackage.etx a;
    private final java.lang.String c;
    private final int d;
    private java.lang.String f;
    private defpackage.fmk g;
    private int i;
    private int j;
    private int k;
    private long l;
    private defpackage.eqg m;
    private int n;
    private int o;
    private int p;
    private boolean s;
    private boolean v;
    private boolean w;
    private int h = 0;
    private long t = -9223372036854775807L;
    private long u = -9223372036854775807L;
    private final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger();
    private int q = -1;
    private int r = -1;
    private final java.lang.String e = "video/mp2t";

    public ftv(java.lang.String str, int i, int i2) {
        this.a = new defpackage.etx(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    private final void g(int i) {
        byte[] bArr = this.a.b;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.i = 4;
    }

    private final void h(defpackage.flh flhVar) {
        int i;
        int i2 = flhVar.b;
        if (i2 == -2147483647 || (i = flhVar.c) == -1) {
            return;
        }
        java.lang.String str = flhVar.a;
        if (str == null) {
            defpackage.eqg eqgVar = this.m;
            str = eqgVar != null ? eqgVar.p : null;
        }
        defpackage.eqg eqgVar2 = this.m;
        if (eqgVar2 != null && !this.s && i == eqgVar2.H && i2 == eqgVar2.J && j$.util.Objects.equals(str, eqgVar2.p)) {
            return;
        }
        defpackage.eqg eqgVar3 = this.m;
        defpackage.eqf eqfVar = eqgVar3 == null ? new defpackage.eqf() : new defpackage.eqf(eqgVar3);
        eqfVar.a = this.f;
        eqfVar.a(this.e);
        eqfVar.c(str);
        eqfVar.F = i;
        eqfVar.H = i2;
        eqfVar.d = this.c;
        eqfVar.f = this.d;
        defpackage.eqg eqgVar4 = new defpackage.eqg(eqfVar);
        this.m = eqgVar4;
        this.g.p(eqgVar4);
        this.s = false;
    }

    private final boolean i(defpackage.etx etxVar, byte[] bArr, int i) {
        int iMin = java.lang.Math.min(etxVar.d(), i - this.i);
        etxVar.L(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) throws defpackage.era {
        int i;
        int i2;
        byte b;
        int i3;
        int iD;
        long jZ;
        int i4;
        int i5;
        int i6;
        ahvr.ci(this.g);
        while (etxVar.d() > 0) {
            int i7 = 2;
            switch (this.h) {
                case 0:
                    while (etxVar.d() > 0) {
                        int i8 = this.k << 8;
                        this.k = i8;
                        int iN = i8 | etxVar.n();
                        this.k = iN;
                        int iB = defpackage.fli.b(iN);
                        this.p = iB;
                        if (iB != 0) {
                            g(this.k);
                            this.k = 0;
                            if (!this.w || this.p != 2) {
                                int i9 = this.p;
                                if (i9 == 1) {
                                    this.w = false;
                                    i9 = 1;
                                }
                                int i10 = i9;
                                if (i9 != 3 && i9 != 4) {
                                    if (i10 == 1) {
                                        this.h = 1;
                                    } else {
                                        this.h = 2;
                                    }
                                }
                                this.h = 4;
                            }
                            this.i = 0;
                        }
                        break;
                    }
                    break;
                case 1:
                    defpackage.etx etxVar2 = this.a;
                    if (i(etxVar, etxVar2.b, 18)) {
                        this.v = true;
                        byte[] bArr = etxVar2.b;
                        if (this.m == null) {
                            java.lang.String str = this.f;
                            java.lang.String str2 = this.c;
                            int i11 = this.d;
                            defpackage.etv etvVarE = defpackage.fli.e(bArr);
                            etvVarE.n(60);
                            int i12 = defpackage.fli.a[etvVarE.d(6)];
                            int i13 = defpackage.fli.b[etvVarE.d(4)];
                            int iD2 = etvVarE.d(5);
                            int i14 = iD2 >= 29 ? -1 : (defpackage.fli.c[iD2] * 1000) / 2;
                            etvVarE.n(10);
                            int i15 = i12 + (etvVarE.d(2) > 0 ? 1 : 0);
                            defpackage.eqf eqfVar = new defpackage.eqf();
                            eqfVar.a = str;
                            eqfVar.a("video/mp2t");
                            eqfVar.c("audio/vnd.dts");
                            eqfVar.h = i14;
                            eqfVar.F = i15;
                            eqfVar.H = i13;
                            eqfVar.r = null;
                            eqfVar.d = str2;
                            eqfVar.f = i11;
                            this.m = new defpackage.eqg(eqfVar);
                            this.s = true;
                        }
                        this.n = defpackage.fli.a(bArr);
                        byte b2 = bArr[0];
                        if (b2 != -2) {
                            if (b2 != -1) {
                                if (b2 != 31) {
                                    i2 = (bArr[4] & 1) << 6;
                                    i3 = bArr[5] & 252;
                                } else {
                                    i2 = (bArr[r7] & 7) << 4;
                                    b = bArr[6];
                                }
                                i = i2 | (i3 >> 2);
                            } else {
                                i2 = (bArr[4] & 7) << 4;
                                b = bArr[7];
                            }
                            i3 = b & 60;
                            i = i2 | (i3 >> 2);
                        } else {
                            i = ((bArr[r7] & 1) << 6) | ((bArr[4] & 252) >> 2);
                        }
                        this.l = aiql.P(eum.y((i + 1) << 5, this.m.J));
                        etxVar2.Q(0);
                        this.g.b(etxVar2, 18);
                        this.h = 6;
                    }
                    break;
                case 2:
                    defpackage.etx etxVar3 = this.a;
                    if (i(etxVar, etxVar3.b, 7)) {
                        this.q = defpackage.fli.c(etxVar3.b);
                        this.h = 3;
                    }
                    break;
                case 3:
                    defpackage.etx etxVar4 = this.a;
                    if (i(etxVar, etxVar4.b, this.q)) {
                        defpackage.flh flhVarF = defpackage.fli.f(etxVar4.b);
                        h(flhVarF);
                        this.n = flhVarF.d;
                        long j = flhVarF.e;
                        if (j != -9223372036854775807L) {
                            this.l = j;
                        }
                        etxVar4.Q(0);
                        this.g.b(etxVar4, this.q);
                        this.h = 6;
                    }
                    break;
                case 4:
                    defpackage.etx etxVar5 = this.a;
                    if (i(etxVar, etxVar5.b, 6)) {
                        defpackage.etv etvVarE2 = defpackage.fli.e(etxVar5.b);
                        etvVarE2.n(32);
                        int iH = defpackage.fli.h(etvVarE2, defpackage.fli.h) + 1;
                        this.r = iH;
                        int i16 = this.i;
                        if (i16 > iH) {
                            int i17 = i16 - iH;
                            this.i = i16 - i17;
                            etxVar.Q(etxVar.c - i17);
                        }
                        this.h = 5;
                    }
                    break;
                case 5:
                    defpackage.etx etxVar6 = this.a;
                    if (i(etxVar, etxVar6.b, this.r)) {
                        byte[] bArr2 = etxVar6.b;
                        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.b;
                        defpackage.etv etvVarE3 = defpackage.fli.e(bArr2);
                        int iD3 = etvVarE3.d(32);
                        int iH2 = defpackage.fli.h(etvVarE3, defpackage.fli.d);
                        int i18 = iH2 + 1;
                        char c = iD3 == 1078008818 ? (char) 1 : (char) 0;
                        if (c == 0) {
                            iD = -2147483647;
                            jZ = -9223372036854775807L;
                        } else {
                            if (!etvVarE3.p()) {
                                throw new defpackage.era("Only supports full channel mask-based audio presentation", null, false, 1);
                            }
                            int i19 = iH2 - 1;
                            int i20 = bArr2[i19] << 8;
                            int i21 = bArr2[iH2] & 255;
                            java.lang.String str3 = eum.a;
                            int iD4 = 65535;
                            for (int i22 = 0; i22 < i19; i22++) {
                                byte b3 = bArr2[i22];
                                iD4 = eum.d(b3 & 15, eum.d((b3 & 255) >> 4, iD4));
                            }
                            if ((((char) i20) | i21) != iD4) {
                                throw new defpackage.era("CRC check failed", null, true, 1);
                            }
                            int iD5 = etvVarE3.d(2);
                            if (iD5 == 0) {
                                i4 = 512;
                            } else if (iD5 == 1) {
                                i4 = 480;
                            } else {
                                if (iD5 != 2) {
                                    throw new defpackage.era("Unsupported base duration index in DTS UHD header: " + iD5, null, true, 1);
                                }
                                i4 = 384;
                            }
                            int iD6 = etvVarE3.d(3) + 1;
                            int iD7 = etvVarE3.d(2);
                            if (iD7 == 0) {
                                i5 = 32000;
                            } else if (iD7 == 1) {
                                i5 = 44100;
                            } else {
                                if (iD7 != 2) {
                                    throw new defpackage.era("Unsupported clock rate index in DTS UHD header: " + iD7, null, true, 1);
                                }
                                i5 = 48000;
                            }
                            if (etvVarE3.p()) {
                                etvVarE3.n(36);
                            }
                            iD = (1 << etvVarE3.d(2)) * i5;
                            jZ = eum.z(i4 * iD6, 1000000L, i5);
                        }
                        int i23 = iD;
                        int iH3 = 0;
                        for (char c2 = 0; c2 < c; c2 = 1) {
                            iH3 += defpackage.fli.h(etvVarE3, defpackage.fli.e);
                        }
                        if (c != 0) {
                            atomicInteger.set(defpackage.fli.h(etvVarE3, defpackage.fli.f));
                        }
                        defpackage.flh flhVar = new defpackage.flh("audio/vnd.dts.uhd;profile=p2", 2, i23, i18 + iH3 + (atomicInteger.get() != 0 ? defpackage.fli.h(etvVarE3, defpackage.fli.g) : 0), jZ);
                        if (this.p == 3) {
                            h(flhVar);
                        }
                        this.n = flhVar.d;
                        long j2 = flhVar.e;
                        if (j2 == -9223372036854775807L) {
                            j2 = 0;
                        }
                        this.l = j2;
                        etxVar6.Q(0);
                        this.g.b(etxVar6, this.r);
                        this.h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = java.lang.Math.min(etxVar.d(), this.n - this.i);
                    this.g.b(etxVar, iMin);
                    int i24 = this.i + iMin;
                    this.i = i24;
                    int i25 = this.n;
                    if (i24 == i25) {
                        if (this.p == 1) {
                            this.o = i25;
                            this.i = 0;
                            this.j = 0;
                            this.h = 7;
                        } else {
                            ahvr.bY(this.t != -9223372036854775807L);
                            int i26 = this.n;
                            int i27 = this.p;
                            if (i27 == 2) {
                                i6 = this.o;
                            } else {
                                i7 = i27;
                                i6 = 0;
                            }
                            int i28 = i26 + i6;
                            long j3 = this.t;
                            this.g.d(j3, i7 == 4 ? 0 : 1, i28, 0, null);
                            this.t += this.l;
                            long j4 = this.u;
                            if (j4 != -9223372036854775807L) {
                                if (j4 != j3) {
                                    this.t = j4;
                                }
                                this.u = -9223372036854775807L;
                            }
                            this.o = 0;
                            this.h = 0;
                        }
                    }
                    break;
                default:
                    for (int i29 = 4; etxVar.d() > 0 && this.i < i29; i29 = 4) {
                        int i30 = this.j << 8;
                        this.j = i30;
                        this.j = i30 | etxVar.n();
                        this.i++;
                    }
                    if (this.i == 4) {
                        if (defpackage.fli.b(this.j) == 2) {
                            g(this.j);
                            this.p = 2;
                            this.j = 0;
                            this.h = 2;
                        } else {
                            if (this.s) {
                                defpackage.fmk fmkVar = this.g;
                                defpackage.eqg eqgVar = this.m;
                                ahvr.ci(eqgVar);
                                fmkVar.p(eqgVar);
                                this.s = false;
                            }
                            ahvr.bY(this.t != -9223372036854775807L);
                            long j5 = this.t;
                            this.g.d(j5, 1, this.o, 0, null);
                            this.t += this.l;
                            long j6 = this.u;
                            if (j6 != -9223372036854775807L) {
                                if (j6 != j5) {
                                    this.t = j6;
                                }
                                this.u = -9223372036854775807L;
                            }
                            this.o = 0;
                            int i31 = this.j;
                            this.k = i31;
                            this.j = 0;
                            int iB2 = defpackage.fli.b(i31);
                            this.p = iB2;
                            if (iB2 == 3 || iB2 == 4) {
                                g(i31);
                                this.k = 0;
                                this.h = 4;
                            } else if (iB2 == 1) {
                                g(i31);
                                this.k = 0;
                                this.h = 1;
                            } else {
                                this.i = 0;
                                this.h = 0;
                            }
                        }
                    }
                    break;
            }
        }
    }

    @Override // defpackage.ftx
    public final void b(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        fvbVar.c();
        this.f = fvbVar.b();
        this.g = fllVar.r(fvbVar.a(), 1);
    }

    @Override // defpackage.ftx
    public final void c() {
        if (this.h == 7) {
            ahvr.ci(this.g);
            if (this.s) {
                defpackage.fmk fmkVar = this.g;
                defpackage.eqg eqgVar = this.m;
                ahvr.ci(eqgVar);
                fmkVar.p(eqgVar);
                this.s = false;
            }
            long j = this.t;
            if (j != -9223372036854775807L) {
                this.g.d(j, 1, this.o, 0, null);
                this.t += this.l;
            }
            this.o = 0;
            this.i = 0;
            this.k = 0;
            this.j = 0;
            this.h = 0;
        }
    }

    @Override // defpackage.ftx
    public final void e(long j, int i) {
        if (j != -9223372036854775807L) {
            if (this.h != 0) {
                this.u = j;
            } else {
                this.t = j;
                this.u = -9223372036854775807L;
            }
        }
    }

    @Override // defpackage.ftx
    public final void f() {
        this.h = 0;
        this.i = 0;
        this.k = 0;
        this.j = 0;
        this.o = 0;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.b.set(0);
        this.s = false;
        this.w = this.v;
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void d() {
    }
}
