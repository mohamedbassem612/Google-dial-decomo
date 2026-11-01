package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fnj implements defpackage.flj {
    private defpackage.fll b;
    private defpackage.fnq c;
    private defpackage.flk d;
    private defpackage.fmf e;
    private defpackage.fqi f;
    private int h;
    private long i;
    private int j;
    private int l;
    private int n;
    private defpackage.etx o;
    private defpackage.etx p;
    private final defpackage.etx a = new defpackage.etx(16);
    private long k = -1;
    private long m = -1;
    private int g = 0;

    private final void h() {
        defpackage.fll fllVar = this.b;
        ahvr.ci(fllVar);
        fllVar.s();
        this.b.y(new defpackage.flz(-9223372036854775807L, 0L));
        this.g = 5;
    }

    private final void i(long j) {
        long j2 = this.k;
        long j3 = this.l;
        defpackage.fnq fnqVar = new defpackage.fnq(0L, j2 - j3, j, j2, this.i - j3);
        this.c = fnqVar;
        defpackage.fll fllVar = this.b;
        ahvr.ci(fllVar);
        defpackage.fmk fmkVarR = fllVar.r(1024, 4);
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.a("image/heic");
        eqfVar.k = new defpackage.eqy(-9223372036854775807L, fnqVar);
        fmkVarR.p(new defpackage.eqg(eqfVar));
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        this.b = fllVar;
    }

    @Override // defpackage.flj
    public final void c() {
        if (this.f != null) {
            this.f = null;
        }
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        if (j != 0) {
            if (this.g == 3) {
                defpackage.fqi fqiVar = this.f;
                ahvr.ci(fqiVar);
                fqiVar.d(j, j2);
                return;
            }
            return;
        }
        this.g = 0;
        this.j = 0;
        this.k = -1L;
        this.m = -1L;
        this.n = 0;
        this.o = null;
        this.p = null;
        if (this.f != null) {
            this.f = null;
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        return defpackage.hgu.ag(flkVar, true);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x022f A[LOOP:3: B:98:0x01ed->B:121:0x022f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:179:0x0227 A[SYNTHETIC] */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws defpackage.era {
        int iG;
        long j;
        int iS;
        long jX;
        long jX2;
        long j2;
        long jX3;
        java.lang.String strT;
        while (true) {
            int i = this.g;
            int i2 = 3;
            iG = -1;
            int i3 = 8;
            int i4 = 2;
            int i5 = 1;
            if (i == 0) {
                if (this.j == 0) {
                    defpackage.etx etxVar = this.a;
                    if (!flkVar.o(etxVar.b, 0, 8, true)) {
                        h();
                        break;
                    }
                    this.j = 8;
                    etxVar.Q(0);
                    this.i = etxVar.w();
                    this.h = etxVar.i();
                }
                long jX4 = this.i;
                if (jX4 == 1) {
                    defpackage.etx etxVar2 = this.a;
                    ((defpackage.flc) flkVar).o(etxVar2.b, 8, 8, false);
                    this.j += 8;
                    jX4 = etxVar2.x();
                    this.i = jX4;
                }
                int i6 = this.h;
                if (i6 == 1836086884) {
                    this.k = ((defpackage.flc) flkVar).b;
                    this.l = this.j;
                    this.j = 0;
                    defpackage.etx etxVar3 = this.o;
                    defpackage.etx etxVar4 = this.p;
                    if (etxVar3 != null && etxVar4 != null) {
                        etxVar3.Q(0);
                        int i7 = etxVar3.i();
                        int i8 = defpackage.fpz.a;
                        int iS2 = ((i7 >> 24) & 255) == 0 ? etxVar3.s() : etxVar3.q();
                        int i9 = 0;
                        while (true) {
                            if (i9 < iS2 && etxVar3.d() >= i3) {
                                int i10 = etxVar3.c;
                                int i11 = etxVar3.i();
                                if (i11 >= i3) {
                                    if (etxVar3.i() == 1768842853) {
                                        int i12 = (etxVar3.i() >> 24) & 255;
                                        iS = i12 < i2 ? etxVar3.s() : etxVar3.i();
                                        if (i12 >= 2) {
                                            etxVar3.R(2);
                                            int i13 = etxVar3.i();
                                            etxVar3.T();
                                            if (i13 == 1835625829 && (strT = etxVar3.T()) != null && strT.equals("application/rdf+xml")) {
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    etxVar3.Q(i10 + i11);
                                    i9++;
                                    i2 = 3;
                                    i3 = 8;
                                }
                            }
                            iS = -1;
                            break;
                        }
                        if (iS != -1) {
                            etxVar4.Q(0);
                            int i14 = etxVar4.i() >> 24;
                            int iN = etxVar4.n();
                            int i15 = iN >> 4;
                            int i16 = iN & 15;
                            int iN2 = etxVar4.n();
                            int i17 = iN2 >> 4;
                            int i18 = iN2 & 15;
                            int i19 = i14 & 255;
                            int iS3 = i19 < 2 ? etxVar4.s() : etxVar4.i();
                            int i20 = 0;
                            while (i20 < iS3) {
                                int iS4 = i19 < i4 ? etxVar4.s() : etxVar4.i();
                                if (i19 == i5 || i19 == i4) {
                                    etxVar4.R(i4);
                                }
                                etxVar4.R(i4);
                                if (i17 == 4) {
                                    jX = etxVar4.w();
                                } else {
                                    jX = i17 == 8 ? etxVar4.x() : 0L;
                                }
                                int iS5 = etxVar4.s();
                                int i21 = 0;
                                while (i21 < iS5) {
                                    if ((i19 == i5 || i19 == 2) && i18 > 0) {
                                        etxVar4.R(i18);
                                    }
                                    int i22 = 4;
                                    if (i15 == 4) {
                                        jX2 = etxVar4.w();
                                    } else {
                                        jX2 = i15 == 8 ? etxVar4.x() : 0L;
                                        i22 = 4;
                                    }
                                    if (i16 == i22) {
                                        jX3 = etxVar4.w();
                                    } else {
                                        if (i16 == 8) {
                                            jX3 = etxVar4.x();
                                        } else {
                                            j2 = 0;
                                        }
                                        if (iS4 == iS) {
                                            this.m = jX + jX2;
                                            this.n = (int) j2;
                                            break;
                                        }
                                        i21++;
                                        iS5 = iS5;
                                        i5 = 1;
                                    }
                                    j2 = jX3;
                                    if (iS4 == iS) {
                                        this.m = jX + jX2;
                                        this.n = (int) j2;
                                        break;
                                    }
                                    i21++;
                                    iS5 = iS5;
                                    i5 = 1;
                                }
                                if (iS4 == iS) {
                                    break;
                                }
                                i20++;
                                i4 = 2;
                                i5 = 1;
                            }
                        }
                    }
                    if (this.m != -1) {
                        this.g = 4;
                    } else {
                        i(-9223372036854775807L);
                        this.g = 2;
                    }
                } else if (i6 == 1835365473) {
                    ((defpackage.flc) flkVar).p(4, false);
                    this.j = 0;
                    this.g = 0;
                } else if (i6 == 1768517222) {
                    int i23 = (int) (jX4 - ((long) this.j));
                    defpackage.etx etxVar5 = new defpackage.etx(i23);
                    this.o = etxVar5;
                    ((defpackage.flc) flkVar).o(etxVar5.b, 0, i23, false);
                    this.j = 0;
                    this.g = 0;
                } else if (i6 == 1768714083) {
                    int i24 = (int) (jX4 - ((long) this.j));
                    defpackage.etx etxVar6 = new defpackage.etx(i24);
                    this.p = etxVar6;
                    ((defpackage.flc) flkVar).o(etxVar6.b, 0, i24, false);
                    this.j = 0;
                    this.g = 0;
                } else {
                    this.g = 1;
                }
            } else if (i == 1) {
                ((defpackage.flc) flkVar).p((int) (this.i - ((long) this.j)), false);
                this.j = 0;
                this.g = 0;
            } else {
                if (i != 2) {
                    if (i == 3) {
                        if (this.e == null || flkVar != this.d) {
                            this.d = flkVar;
                            this.e = new defpackage.fmf(flkVar, this.k);
                        }
                        defpackage.fqi fqiVar = this.f;
                        ahvr.ci(fqiVar);
                        iG = fqiVar.g(this.e, aesqVar);
                        if (iG != 1) {
                            break;
                        }
                        aesqVar.a += this.k;
                        break;
                    }
                    if (i != 4) {
                        break;
                    }
                    defpackage.flc flcVar = (defpackage.flc) flkVar;
                    long j3 = flcVar.b;
                    long j4 = this.m;
                    if (j3 == j4) {
                        defpackage.etx etxVar7 = new defpackage.etx(this.n);
                        flcVar.o(etxVar7.b, 0, this.n, false);
                        try {
                            defpackage.ajml ajmlVarA = defpackage.fmo.a(etxVar7.C(this.n));
                            j = ajmlVarA != null ? ajmlVarA.a : -9223372036854775807L;
                        } catch (java.io.IOException unused) {
                        }
                        i(j);
                        aesqVar.a = this.k;
                        this.g = 2;
                    } else {
                        aesqVar.a = j4;
                    }
                    return 1;
                }
                if (this.f == null) {
                    this.f = new defpackage.fqi(defpackage.frr.a, 8);
                }
                defpackage.fmf fmfVar = new defpackage.fmf(flkVar, this.k);
                this.e = fmfVar;
                if (this.f.e(fmfVar)) {
                    defpackage.fqi fqiVar2 = this.f;
                    long j5 = this.k;
                    defpackage.fll fllVar = this.b;
                    ahvr.ci(fllVar);
                    fqiVar2.b(new defpackage.fmh(j5, fllVar));
                    this.g = 3;
                } else {
                    h();
                }
            }
        }
        return iG;
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
