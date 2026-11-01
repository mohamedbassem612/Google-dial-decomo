package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fnl implements defpackage.flj {
    private defpackage.fll b;
    private int c;
    private int d;
    private int e;
    private defpackage.fnq g;
    private defpackage.flk h;
    private defpackage.fmf i;
    private defpackage.fqi j;
    private final defpackage.etx a = new defpackage.etx(2);
    private long f = -1;

    private final int h(defpackage.flk flkVar) {
        defpackage.etx etxVar = this.a;
        etxVar.M(2);
        ((defpackage.flc) flkVar).n(etxVar.b, 0, 2, false);
        return etxVar.s();
    }

    private final int i(defpackage.flk flkVar) {
        defpackage.etx etxVar = this.a;
        etxVar.M(2);
        ((defpackage.flc) flkVar).n(etxVar.b, 0, 2, false);
        return etxVar.s() - 2;
    }

    private final void j() {
        defpackage.fll fllVar = this.b;
        ahvr.ci(fllVar);
        fllVar.s();
        this.b.y(new defpackage.flz(-9223372036854775807L, 0L));
        this.c = 6;
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
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            defpackage.fqi fqiVar = this.j;
            ahvr.ci(fqiVar);
            fqiVar.d(j, j2);
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        int i;
        if (h(flkVar) != 65496) {
            return false;
        }
        while (true) {
            int iH = h(flkVar);
            this.d = iH;
            if (iH == 65498 || (i = i(flkVar)) < 0) {
                return false;
            }
            if (this.d != 65505) {
                ((defpackage.flc) flkVar).m(i, false);
            } else {
                defpackage.etx etxVar = this.a;
                etxVar.M(i);
                ((defpackage.flc) flkVar).n(etxVar.b, 0, i, false);
                if (j$.util.Objects.equals(etxVar.T(), "http://ns.adobe.com/xap/1.0/")) {
                    java.lang.String strT = etxVar.T();
                    java.lang.String[] strArr = defpackage.fmo.a;
                    if (strT != null) {
                        java.lang.String[] strArr2 = defpackage.fmo.a;
                        for (int i2 = 0; i2 < 4; i2++) {
                            if (strT.contains(java.lang.String.valueOf(strArr2[i2]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws defpackage.era {
        java.lang.String strT;
        defpackage.ajml ajmlVarA;
        long j;
        int i = this.c;
        long j2 = -1;
        if (i == 0) {
            defpackage.etx etxVar = this.a;
            etxVar.M(2);
            ((defpackage.flc) flkVar).o(etxVar.b, 0, 2, false);
            int iS = etxVar.s();
            this.d = iS;
            if (iS == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                } else {
                    j();
                }
            } else if ((iS < 65488 || iS > 65497) && iS != 65281) {
                this.c = 1;
            }
        } else if (i == 1) {
            this.e = i(flkVar);
            ((defpackage.flc) flkVar).p(2, false);
            this.c = 2;
        } else if (i == 2) {
            if (this.d == 65505) {
                defpackage.etx etxVar2 = new defpackage.etx(this.e);
                defpackage.flc flcVar = (defpackage.flc) flkVar;
                flcVar.o(etxVar2.b, 0, this.e, false);
                if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(etxVar2.T()) && (strT = etxVar2.T()) != null) {
                    long j3 = flcVar.a;
                    defpackage.fnq fnqVar = null;
                    if (j3 != -1 && (ajmlVarA = defpackage.fmo.a(strT)) != null) {
                        ?? r2 = ajmlVarA.b;
                        int i2 = ((aike) r2).d;
                        if (i2 >= 2) {
                            int i3 = i2 - 1;
                            long j4 = -1;
                            long j5 = -1;
                            long j6 = -1;
                            long j7 = -1;
                            while (i3 >= 0) {
                                defpackage.fti ftiVar = (defpackage.fti) r2.get(i3);
                                java.lang.String str = (java.lang.String) ftiVar.c;
                                boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                                long j8 = j2;
                                if (i3 == 0) {
                                    j3 -= ftiVar.a;
                                    j = 0;
                                } else {
                                    j = j3 - ftiVar.b;
                                }
                                long j9 = j;
                                long j10 = j3;
                                j3 = j9;
                                if (z && j3 != j10) {
                                    j7 = j10 - j3;
                                    j6 = j3;
                                }
                                if (i3 == 0) {
                                    j4 = j3;
                                    j5 = j10;
                                }
                                i3--;
                                j2 = j8;
                            }
                            long j11 = j2;
                            if (j6 != j11 && j7 != j11 && j4 != j11 && j5 != j11) {
                                fnqVar = new defpackage.fnq(j4, j5, ajmlVarA.a, j6, j7);
                            }
                        }
                    }
                    this.g = fnqVar;
                    if (fnqVar != null) {
                        this.f = fnqVar.d;
                    }
                }
            } else {
                ((defpackage.flc) flkVar).p(this.e, false);
            }
            this.c = 0;
        } else {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new java.lang.IllegalStateException();
                }
                if (this.i == null || flkVar != this.h) {
                    this.h = flkVar;
                    this.i = new defpackage.fmf(flkVar, this.f);
                }
                defpackage.fqi fqiVar = this.j;
                ahvr.ci(fqiVar);
                int iG = fqiVar.g(this.i, aesqVar);
                if (iG == 1) {
                    aesqVar.a += this.f;
                }
                return iG;
            }
            long j12 = ((defpackage.flc) flkVar).b;
            long j13 = this.f;
            if (j12 != j13) {
                aesqVar.a = j13;
                return 1;
            }
            if (flkVar.n(this.a.b, 0, 1, true)) {
                flkVar.k();
                if (this.j == null) {
                    this.j = new defpackage.fqi(defpackage.frr.a, 8);
                }
                defpackage.fmf fmfVar = new defpackage.fmf(flkVar, this.f);
                this.i = fmfVar;
                if (this.j.e(fmfVar)) {
                    defpackage.fqi fqiVar2 = this.j;
                    long j14 = this.f;
                    defpackage.fll fllVar = this.b;
                    ahvr.ci(fllVar);
                    fqiVar2.b(new defpackage.fmh(j14, fllVar));
                    defpackage.fnq fnqVar2 = this.g;
                    ahvr.ci(fnqVar2);
                    defpackage.fll fllVar2 = this.b;
                    ahvr.ci(fllVar2);
                    defpackage.fmk fmkVarR = fllVar2.r(1024, 4);
                    defpackage.eqf eqfVar = new defpackage.eqf();
                    eqfVar.a("image/jpeg");
                    eqfVar.k = new defpackage.eqy(-9223372036854775807L, fnqVar2);
                    fmkVarR.p(new defpackage.eqg(eqfVar));
                    this.c = 5;
                } else {
                    j();
                }
            } else {
                j();
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
