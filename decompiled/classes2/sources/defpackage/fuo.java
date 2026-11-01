package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fuo implements defpackage.fvc {
    public int b;
    private final defpackage.ftx c;
    private int e;
    private defpackage.euk f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private long l;
    private final defpackage.etv d = new defpackage.etv(new byte[10]);
    public int a = 0;

    public fuo(defpackage.ftx ftxVar) {
        this.c = ftxVar;
    }

    private final void d(int i) {
        this.a = i;
        this.e = 0;
    }

    private final boolean e(defpackage.etx etxVar, byte[] bArr, int i) {
        int iMin = java.lang.Math.min(etxVar.d(), i - this.e);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            etxVar.R(iMin);
        } else {
            etxVar.L(bArr, this.e, iMin);
        }
        int i2 = this.e + iMin;
        this.e = i2;
        return i2 == i;
    }

    @Override // defpackage.fvc
    public final void a(defpackage.etx etxVar, int i) {
        int i2;
        int i3;
        long j;
        long jB;
        long j2;
        ahvr.ci(this.f);
        int i4 = -1;
        int i5 = 2;
        if ((i & 1) != 0) {
            int i6 = this.a;
            if (i6 != 0 && i6 != 1) {
                if (i6 != 2) {
                    int i7 = this.b;
                    if (i7 != -1) {
                        defpackage.etr.f("PesReader", a.bs(i7, "Unexpected start indicator: expected ", " more bytes"));
                    }
                    this.c.d();
                } else {
                    defpackage.etr.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            if (etxVar.d == 0) {
                this.c.c();
            }
            d(1);
        }
        int i8 = i;
        while (etxVar.d() > 0) {
            int i9 = this.a;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != i5) {
                        int iD = etxVar.d();
                        int i10 = this.b;
                        int i11 = i10 != i4 ? iD - i10 : 0;
                        if (i11 > 0) {
                            iD -= i11;
                            etxVar.P(etxVar.c + iD);
                        }
                        defpackage.ftx ftxVar = this.c;
                        ftxVar.a(etxVar);
                        int i12 = this.b;
                        if (i12 != i4) {
                            int i13 = i12 - iD;
                            this.b = i13;
                            if (i13 == 0) {
                                ftxVar.d();
                                d(1);
                            }
                        }
                    } else {
                        int iMin = java.lang.Math.min(10, this.j);
                        defpackage.etv etvVar = this.d;
                        if (e(etxVar, (byte[]) etvVar.c, iMin) && e(etxVar, null, this.j)) {
                            etvVar.l(0);
                            this.l = -9223372036854775807L;
                            if (this.g) {
                                etvVar.n(4);
                                long jD = etvVar.d(3);
                                etvVar.n(1);
                                j = -9223372036854775807L;
                                int iD2 = etvVar.d(15) << 15;
                                etvVar.n(1);
                                long jD2 = etvVar.d(15);
                                etvVar.n(1);
                                if (this.i || !this.h) {
                                    j2 = jD;
                                } else {
                                    etvVar.n(4);
                                    j2 = jD;
                                    long jD3 = ((long) etvVar.d(3)) << 30;
                                    etvVar.n(1);
                                    int iD3 = etvVar.d(15) << 15;
                                    etvVar.n(1);
                                    long jD4 = etvVar.d(15);
                                    etvVar.n(1);
                                    if (this.f.b(jD3 | ((long) iD3) | jD4) != -9223372036854775807L) {
                                        this.i = true;
                                    }
                                }
                                jB = this.f.b((j2 << 30) | ((long) iD2) | jD2);
                                this.l = jB;
                            } else {
                                j = -9223372036854775807L;
                                jB = -9223372036854775807L;
                            }
                            if (jB != j || this.f.j()) {
                                i8 |= true != this.k ? 0 : 4;
                                this.c.e(this.l, i8);
                                d(3);
                                i4 = -1;
                                i5 = 2;
                            } else {
                                d(0);
                                i3 = -1;
                                i2 = 2;
                            }
                        }
                    }
                    i2 = i5;
                    i3 = i4;
                } else {
                    defpackage.etv etvVar2 = this.d;
                    if (e(etxVar, (byte[]) etvVar2.c, 9)) {
                        int i14 = 0;
                        etvVar2.l(0);
                        int iD4 = etvVar2.d(24);
                        if (iD4 != 1) {
                            defpackage.etr.f("PesReader", a.bj(iD4, "Unexpected start code prefix: "));
                            this.b = -1;
                            i3 = -1;
                            i2 = 2;
                        } else {
                            etvVar2.n(8);
                            int iD5 = etvVar2.d(16);
                            etvVar2.n(5);
                            this.k = etvVar2.p();
                            i2 = 2;
                            etvVar2.n(2);
                            this.g = etvVar2.p();
                            this.h = etvVar2.p();
                            etvVar2.n(6);
                            int iD6 = etvVar2.d(8);
                            this.j = iD6;
                            i3 = -1;
                            if (iD5 == 0) {
                                this.b = -1;
                            } else {
                                int i15 = (iD5 - 3) - iD6;
                                this.b = i15;
                                if (i15 < 0) {
                                    defpackage.etr.f("PesReader", a.bj(i15, "Found negative packet payload size: "));
                                    this.b = -1;
                                }
                            }
                            i14 = 2;
                        }
                        d(i14);
                    } else {
                        i3 = -1;
                        i2 = 2;
                    }
                }
            } else {
                i2 = i5;
                i3 = i4;
                etxVar.R(etxVar.d());
            }
            i4 = i3;
            i5 = i2;
        }
    }

    @Override // defpackage.fvc
    public final void b(defpackage.euk eukVar, defpackage.fll fllVar, defpackage.fvb fvbVar) {
        this.f = eukVar;
        this.c.b(fllVar, fvbVar);
    }

    @Override // defpackage.fvc
    public final void c() {
        this.a = 0;
        this.e = 0;
        this.i = false;
        this.c.f();
    }
}
