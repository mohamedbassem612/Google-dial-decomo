package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fuk implements defpackage.ftx {
    private java.lang.String f;
    private defpackage.fmk g;
    private boolean j;
    private int l;
    private int m;
    private int o;
    private int p;
    private int t;
    private boolean v;
    private final java.lang.String a = "video/mp2t";
    private int e = 0;
    private final defpackage.etx b = new defpackage.etx(new byte[15], 2);
    private final defpackage.etv c = new defpackage.etv();
    private final defpackage.etx d = new defpackage.etx();
    private final defpackage.ful q = new defpackage.ful();
    private int r = -2147483647;
    private int s = -1;
    private long u = -1;
    private boolean k = true;
    private boolean n = true;
    private double h = -9.223372036854776E18d;
    private double i = -9.223372036854776E18d;

    private static final void g(defpackage.etx etxVar, defpackage.etx etxVar2, boolean z) {
        int i = etxVar.c;
        int iMin = java.lang.Math.min(etxVar.d(), etxVar2.d());
        etxVar.L(etxVar2.b, etxVar2.c, iMin);
        etxVar2.R(iMin);
        if (z) {
            etxVar.Q(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:191:0x03a6  */
    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) throws defpackage.era {
        int i;
        int i2;
        int iD;
        int iD2;
        int i3;
        char c;
        byte[] bArr;
        double d;
        int i4;
        int iD3;
        char c2;
        long jE;
        ahvr.ci(this.g);
        while (etxVar.d() > 0) {
            int i5 = this.e;
            int i6 = 8;
            int i7 = 1;
            if (i5 == 0) {
                int i8 = this.l;
                if ((i8 & 2) != 0) {
                    if ((i8 & 4) == 0) {
                        while (etxVar.d() > 0) {
                            int i9 = this.m << 8;
                            this.m = i9;
                            int iN = i9 | etxVar.n();
                            this.m = iN;
                            if ((iN & 16777215) == 12583333) {
                                etxVar.Q(etxVar.c - 3);
                                this.m = 0;
                            }
                        }
                    }
                    this.e = 1;
                    break;
                }
                etxVar.Q(etxVar.d);
            } else {
                int i10 = 3;
                if (i5 != 1) {
                    defpackage.ful fulVar = this.q;
                    int i11 = fulVar.a;
                    if (i11 == 1 || i11 == 17) {
                        g(etxVar, this.d, true);
                    }
                    int iMin = java.lang.Math.min(etxVar.d(), fulVar.c - this.o);
                    this.g.b(etxVar, iMin);
                    int i12 = this.o + iMin;
                    this.o = i12;
                    if (i12 != fulVar.c) {
                        continue;
                    } else {
                        int i13 = fulVar.a;
                        if (i13 == 1) {
                            defpackage.etv etvVar = new defpackage.etv(this.d.b);
                            int iD4 = etvVar.d(8);
                            int iD5 = etvVar.d(5);
                            if (iD5 != 31) {
                                switch (iD5) {
                                    case 0:
                                        iD2 = 96000;
                                        break;
                                    case 1:
                                        iD2 = 88200;
                                        break;
                                    case 2:
                                        iD2 = 64000;
                                        break;
                                    case 3:
                                        iD2 = 48000;
                                        break;
                                    case 4:
                                        iD2 = 44100;
                                        break;
                                    case 5:
                                        iD2 = 32000;
                                        break;
                                    case 6:
                                        iD2 = 24000;
                                        break;
                                    case 7:
                                        iD2 = 22050;
                                        break;
                                    case 8:
                                        iD2 = 16000;
                                        break;
                                    case 9:
                                        iD2 = 12000;
                                        break;
                                    case 10:
                                        iD2 = 11025;
                                        break;
                                    case 11:
                                        iD2 = 8000;
                                        break;
                                    case 12:
                                        iD2 = 7350;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                                    default:
                                        throw new defpackage.era(a.bj(iD5, "Unsupported sampling rate index "), null, false, 1);
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                                        iD2 = 57600;
                                        break;
                                    case 16:
                                        iD2 = 51200;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                        iD2 = 40000;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                        iD2 = 38400;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                        iD2 = 34150;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                                        iD2 = 28800;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                                        iD2 = 25600;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                                        iD2 = 20000;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                                        iD2 = 19200;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                        iD2 = 17075;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                                        iD2 = 14400;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                        iD2 = 12800;
                                        break;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                        iD2 = 9600;
                                        break;
                                }
                            } else {
                                iD2 = etvVar.d(24);
                            }
                            int iD6 = etvVar.d(3);
                            int i14 = 4;
                            if (iD6 == 0) {
                                i3 = 768;
                            } else if (iD6 == 1) {
                                i3 = 1024;
                            } else if (iD6 == 2 || iD6 == 3) {
                                i3 = 2048;
                            } else {
                                if (iD6 != 4) {
                                    throw new defpackage.era(a.bj(iD6, "Unsupported coreSbrFrameLengthIndex "), null, false, 1);
                                }
                                i3 = 4096;
                            }
                            int i15 = i3;
                            if (iD6 == 0 || iD6 == 1) {
                                c = 0;
                            } else if (iD6 == 2) {
                                c = 2;
                            } else if (iD6 == 3) {
                                c = 3;
                            } else {
                                if (iD6 != 4) {
                                    throw new defpackage.era(a.bj(iD6, "Unsupported coreSbrFrameLengthIndex "), null, false, 1);
                                }
                                c = 1;
                            }
                            etvVar.n(2);
                            defpackage.fsu.f(etvVar);
                            int iD7 = etvVar.d(5);
                            int i16 = 0;
                            int iD8 = 0;
                            while (true) {
                                int i17 = i7;
                                int i18 = 16;
                                if (i16 < iD7 + 1) {
                                    int iD9 = etvVar.d(3);
                                    iD8 += defpackage.fsu.d(etvVar, 5, 8, 16) + 1;
                                    if ((iD9 == 0 || iD9 == 2) && etvVar.p()) {
                                        defpackage.fsu.f(etvVar);
                                    }
                                    i16++;
                                    i7 = i17;
                                } else {
                                    int iD10 = defpackage.fsu.d(etvVar, 4, 8, 16) + 1;
                                    etvVar.m();
                                    int i19 = 0;
                                    while (i19 < iD10) {
                                        int iD11 = etvVar.d(2);
                                        if (iD11 == 0) {
                                            i4 = i10;
                                            defpackage.fsu.g(etvVar);
                                            if (c > 0) {
                                                defpackage.fsu.e(etvVar);
                                            }
                                        } else if (iD11 != i17) {
                                            if (iD11 == i10) {
                                                defpackage.fsu.d(etvVar, i14, i6, i18);
                                                int iD12 = defpackage.fsu.d(etvVar, i14, i6, i18);
                                                if (etvVar.p()) {
                                                    defpackage.fsu.d(etvVar, i6, i18, 0);
                                                }
                                                etvVar.m();
                                                if (iD12 > 0) {
                                                    etvVar.n(iD12 << 3);
                                                }
                                            }
                                            i4 = i10;
                                        } else {
                                            if (defpackage.fsu.g(etvVar)) {
                                                etvVar.m();
                                            }
                                            if (c > 0) {
                                                defpackage.fsu.e(etvVar);
                                                iD3 = etvVar.d(2);
                                                c2 = c;
                                            } else {
                                                iD3 = 0;
                                                c2 = 0;
                                            }
                                            if (iD3 > 0) {
                                                etvVar.n(6);
                                                int iD13 = etvVar.d(2);
                                                etvVar.n(i14);
                                                if (etvVar.p()) {
                                                    etvVar.n(5);
                                                }
                                                if (iD3 == 2 || iD3 == i10) {
                                                    etvVar.n(6);
                                                }
                                                if (iD13 == 2) {
                                                    etvVar.m();
                                                }
                                            }
                                            i4 = i10;
                                            int iFloor = ((int) java.lang.Math.floor(java.lang.Math.log(iD8 - 1) / 0.6931471805599453d)) + 1;
                                            int iD14 = etvVar.d(2);
                                            if (iD14 > 0 && etvVar.p()) {
                                                etvVar.n(iFloor);
                                            }
                                            if (etvVar.p()) {
                                                etvVar.n(iFloor);
                                            }
                                            if (c2 == 0 && iD14 == 0) {
                                                etvVar.m();
                                            }
                                        }
                                        i19++;
                                        i10 = i4;
                                        i6 = 8;
                                        i18 = 16;
                                        i14 = 4;
                                        i17 = 1;
                                    }
                                    int i20 = i10;
                                    if (etvVar.p()) {
                                        int i21 = 8;
                                        int iD15 = defpackage.fsu.d(etvVar, 2, 4, 8) + 1;
                                        bArr = null;
                                        int i22 = 0;
                                        while (i22 < iD15) {
                                            int iD16 = defpackage.fsu.d(etvVar, 4, i21, 16);
                                            int iD17 = defpackage.fsu.d(etvVar, 4, i21, 16);
                                            if (iD16 == 7) {
                                                int iD18 = etvVar.d(4) + 1;
                                                etvVar.n(4);
                                                byte[] bArr2 = new byte[iD18];
                                                int i23 = 0;
                                                while (i23 < iD18) {
                                                    bArr2[i23] = (byte) etvVar.d(i21);
                                                    i23++;
                                                    i21 = 8;
                                                }
                                                bArr = bArr2;
                                            } else {
                                                etvVar.n(iD17 << i20);
                                            }
                                            i22++;
                                            i21 = 8;
                                        }
                                    } else {
                                        bArr = null;
                                    }
                                    switch (iD2) {
                                        case 14700:
                                        case 16000:
                                            d = 3.0d;
                                            break;
                                        case 22050:
                                        case 24000:
                                            d = 2.0d;
                                            break;
                                        case 29400:
                                        case 32000:
                                        case 58800:
                                        case 64000:
                                            d = 1.5d;
                                            break;
                                        case 44100:
                                        case 48000:
                                        case 88200:
                                        case 96000:
                                            d = 1.0d;
                                            break;
                                        default:
                                            throw new defpackage.era(a.bj(iD2, "Unsupported sampling rate "), null, false, 1);
                                    }
                                    this.r = (int) (((double) iD2) * d);
                                    this.s = (int) (((double) i15) * d);
                                    long j = this.u;
                                    long j2 = fulVar.b;
                                    if (j != j2) {
                                        this.u = j2;
                                        java.lang.String strConcat = iD4 != -1 ? "mhm1".concat(java.lang.String.valueOf(java.lang.String.format(".%02X", java.lang.Integer.valueOf(iD4)))) : "mhm1";
                                        aify aifyVarQ = (bArr == null || bArr.length <= 0) ? null : aify.q(eum.b, bArr);
                                        defpackage.eqf eqfVar = new defpackage.eqf();
                                        eqfVar.a = this.f;
                                        eqfVar.a(this.a);
                                        eqfVar.c("audio/mhm1");
                                        eqfVar.H = this.r;
                                        eqfVar.j = strConcat;
                                        eqfVar.q = aifyVarQ;
                                        this.g.p(new defpackage.eqg(eqfVar));
                                    }
                                    i2 = 1;
                                    this.v = true;
                                }
                            }
                        } else {
                            if (i13 == 17) {
                                defpackage.etv etvVar2 = new defpackage.etv(this.d.b);
                                if (etvVar2.p()) {
                                    etvVar2.n(2);
                                    iD = etvVar2.d(13);
                                } else {
                                    iD = 0;
                                }
                                this.t = iD;
                            } else if (i13 == 2) {
                                if (this.v) {
                                    this.k = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                int i24 = this.s - this.t;
                                double d2 = this.r;
                                long jRound = java.lang.Math.round(this.h);
                                double d3 = i24;
                                if (this.j) {
                                    this.j = false;
                                    this.h = this.i;
                                } else {
                                    this.h += (d3 * 1000000.0d) / d2;
                                }
                                this.g.d(jRound, i, this.p, 0, null);
                                this.v = false;
                                this.t = 0;
                                this.p = 0;
                            }
                            i2 = 1;
                        }
                        this.e = i2;
                    }
                } else {
                    defpackage.etx etxVar2 = this.b;
                    g(etxVar, etxVar2, false);
                    if (etxVar2.d() == 0) {
                        int i25 = etxVar2.d;
                        defpackage.etv etvVar3 = this.c;
                        etvVar3.k(etxVar2.b, i25);
                        defpackage.ful fulVar2 = this.q;
                        etvVar3.b();
                        int iD19 = defpackage.fsu.d(etvVar3, 3, 8, 8);
                        fulVar2.a = iD19;
                        if (iD19 != -1) {
                            ahvr.bM(true);
                            a.d(a.d(3L, 255L), 4294967296L);
                            if (etvVar3.a() >= 2) {
                                jE = etvVar3.e(2);
                                if (jE == 3) {
                                    if (etvVar3.a() >= 8) {
                                        long jE2 = etvVar3.e(8);
                                        long j3 = jE2 + 3;
                                        if (jE2 != 255) {
                                            jE = j3;
                                        } else if (etvVar3.a() < 32) {
                                            jE = -1;
                                        } else {
                                            jE = j3 + etvVar3.e(32);
                                        }
                                    } else {
                                        jE = -1;
                                    }
                                }
                            } else {
                                jE = -1;
                            }
                            fulVar2.b = jE;
                            if (jE != -1) {
                                if (jE > 16) {
                                    throw new defpackage.era(a.bz(jE, "Contains sub-stream with an invalid packet label "), null, false, 1);
                                }
                                if (jE == 0) {
                                    int i26 = fulVar2.a;
                                    if (i26 == 1) {
                                        throw new defpackage.era("Mpegh3daConfig packet with invalid packet label 0", null, true, 1);
                                    }
                                    if (i26 == 2) {
                                        throw new defpackage.era("Mpegh3daFrame packet with invalid packet label 0", null, true, 1);
                                    }
                                    if (i26 == 17) {
                                        throw new defpackage.era("AudioTruncation packet with invalid packet label 0", null, true, 1);
                                    }
                                }
                                int iD20 = defpackage.fsu.d(etvVar3, 11, 24, 24);
                                fulVar2.c = iD20;
                                if (iD20 != -1) {
                                    this.o = 0;
                                    this.p += iD20 + i25;
                                    etxVar2.Q(0);
                                    this.g.b(etxVar2, etxVar2.d);
                                    etxVar2.M(2);
                                    this.d.M(fulVar2.c);
                                    this.n = true;
                                    this.e = 2;
                                }
                            }
                        }
                        int i27 = etxVar2.d;
                        if (i27 < 15) {
                            etxVar2.P(i27 + 1);
                            this.n = false;
                        }
                    } else {
                        this.n = false;
                    }
                }
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
    public final void e(long j, int i) {
        this.l = i;
        if (!this.k && (this.p != 0 || !this.n)) {
            this.j = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.j) {
                this.i = d;
            } else {
                this.h = d;
            }
        }
    }

    @Override // defpackage.ftx
    public final void f() {
        this.e = 0;
        this.m = 0;
        this.b.M(2);
        this.o = 0;
        this.p = 0;
        this.r = -2147483647;
        this.s = -1;
        this.t = 0;
        this.u = -1L;
        this.v = false;
        this.j = false;
        this.n = true;
        this.k = true;
        this.h = -9.223372036854776E18d;
        this.i = -9.223372036854776E18d;
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void d() {
    }
}
