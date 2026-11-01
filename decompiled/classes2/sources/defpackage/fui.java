package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fui implements defpackage.ftx {
    private final java.lang.String a;
    private final int b;
    private final java.lang.String c = "video/mp2t";
    private final defpackage.etx d;
    private final defpackage.etv e;
    private defpackage.fmk f;
    private java.lang.String g;
    private defpackage.eqg h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private long s;
    private int t;
    private long u;
    private int v;
    private java.lang.String w;

    public fui(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
        defpackage.etx etxVar = new defpackage.etx(1024);
        this.d = etxVar;
        this.e = new defpackage.etv(etxVar.b);
        this.m = -9223372036854775807L;
    }

    private final int g(defpackage.etv etvVar) throws defpackage.era {
        int iA = etvVar.a();
        defpackage.fsi fsiVarB = defpackage.fko.b(etvVar, true);
        this.w = (java.lang.String) fsiVarB.c;
        this.t = fsiVarB.a;
        this.v = fsiVarB.b;
        return iA - etvVar.a();
    }

    private static long h(defpackage.etv etvVar) {
        return etvVar.d((etvVar.d(2) + 1) << 3);
    }

    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) throws defpackage.era {
        int i;
        int i2;
        int iD;
        boolean zP;
        ahvr.ci(this.f);
        while (etxVar.d() > 0) {
            int i3 = this.i;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iN = etxVar.n();
                    if ((iN & 224) == 224) {
                        this.l = iN;
                        this.i = 2;
                    } else if (iN != 86) {
                        this.i = 0;
                    }
                } else if (i3 != 2) {
                    int iMin = java.lang.Math.min(etxVar.d(), this.k - this.j);
                    defpackage.etv etvVar = this.e;
                    etxVar.L((byte[]) etvVar.c, this.j, iMin);
                    int i4 = this.j + iMin;
                    this.j = i4;
                    if (i4 == this.k) {
                        etvVar.l(0);
                        if (etvVar.p()) {
                            if (this.n) {
                            }
                            this.i = 0;
                        } else {
                            this.n = true;
                            int iD2 = etvVar.d(1);
                            if (iD2 == 1) {
                                iD = etvVar.d(1);
                                i2 = 1;
                            } else {
                                i2 = iD2;
                                iD = 0;
                            }
                            this.o = iD;
                            if (iD != 0) {
                                throw new defpackage.era(null, null, true, 1);
                            }
                            if (i2 == 1) {
                                h(etvVar);
                                i2 = 1;
                            }
                            if (!etvVar.p()) {
                                throw new defpackage.era(null, null, true, 1);
                            }
                            this.p = etvVar.d(6);
                            int iD3 = etvVar.d(4);
                            int iD4 = etvVar.d(3);
                            if (iD3 != 0 || iD4 != 0) {
                                throw new defpackage.era(null, null, true, 1);
                            }
                            if (i2 == 0) {
                                int iC = etvVar.c();
                                int iG = g(etvVar);
                                etvVar.l(iC);
                                byte[] bArr = new byte[(iG + 7) / 8];
                                etvVar.q(bArr, iG);
                                defpackage.eqf eqfVar = new defpackage.eqf();
                                eqfVar.a = this.g;
                                eqfVar.a(this.c);
                                eqfVar.c("audio/mp4a-latm");
                                eqfVar.j = this.w;
                                eqfVar.F = this.v;
                                eqfVar.H = this.t;
                                eqfVar.q = java.util.Collections.singletonList(bArr);
                                eqfVar.d = this.a;
                                eqfVar.f = this.b;
                                defpackage.eqg eqgVar = new defpackage.eqg(eqfVar);
                                if (!eqgVar.equals(this.h)) {
                                    this.h = eqgVar;
                                    this.u = 1024000000 / ((long) eqgVar.J);
                                    this.f.p(eqgVar);
                                }
                            } else {
                                etvVar.n(((int) h(etvVar)) - g(etvVar));
                            }
                            int iD5 = etvVar.d(3);
                            this.q = iD5;
                            if (iD5 == 0) {
                                etvVar.n(8);
                            } else if (iD5 == 1) {
                                etvVar.n(9);
                            } else if (iD5 == 3 || iD5 == 4 || iD5 == 5) {
                                etvVar.n(6);
                            } else {
                                if (iD5 != 6 && iD5 != 7) {
                                    throw new java.lang.IllegalStateException();
                                }
                                etvVar.n(1);
                            }
                            boolean zP2 = etvVar.p();
                            this.r = zP2;
                            this.s = 0L;
                            if (zP2) {
                                if (i2 != 1) {
                                    do {
                                        zP = etvVar.p();
                                        this.s = (this.s << 8) + ((long) etvVar.d(8));
                                    } while (zP);
                                } else {
                                    this.s = h(etvVar);
                                }
                            }
                            if (etvVar.p()) {
                                etvVar.n(8);
                            }
                        }
                        if (this.o != 0) {
                            throw new defpackage.era(null, null, true, 1);
                        }
                        if (this.p != 0) {
                            throw new defpackage.era(null, null, true, 1);
                        }
                        if (this.q != 0) {
                            throw new defpackage.era(null, null, true, 1);
                        }
                        int i5 = 0;
                        while (true) {
                            int iD6 = etvVar.d(8);
                            i = i5 + iD6;
                            if (iD6 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iC2 = etvVar.c();
                        int i6 = iC2 & 7;
                        defpackage.etx etxVar2 = this.d;
                        if (i6 == 0) {
                            etxVar2.Q(iC2 >> 3);
                        } else {
                            etvVar.q(etxVar2.b, i << 3);
                            etxVar2.Q(0);
                        }
                        this.f.b(this.d, i);
                        ahvr.bY(this.m != -9223372036854775807L);
                        this.f.d(this.m, 1, i, 0, null);
                        this.m += this.u;
                        if (this.r) {
                            etvVar.n((int) this.s);
                        }
                        this.i = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iN2 = ((this.l & (-225)) << 8) | etxVar.n();
                    this.k = iN2;
                    defpackage.etx etxVar3 = this.d;
                    if (iN2 > etxVar3.b.length) {
                        etxVar3.M(iN2);
                        this.e.j(etxVar3.b);
                    }
                    this.j = 0;
                    this.i = 3;
                }
            } else if (etxVar.n() == 86) {
                this.i = 1;
            }
        }
    }

    @Override // defpackage.ftx
    public final void b(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        fvbVar.c();
        this.f = fllVar.r(fvbVar.a(), 1);
        this.g = fvbVar.b();
    }

    @Override // defpackage.ftx
    public final void e(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.ftx
    public final void f() {
        this.i = 0;
        this.m = -9223372036854775807L;
        this.n = false;
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void d() {
    }
}
