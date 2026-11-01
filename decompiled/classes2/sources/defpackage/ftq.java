package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ftq implements defpackage.ftx {
    public long a;
    private final defpackage.etv b;
    private final defpackage.etx c;
    private final java.lang.String d;
    private final int e;
    private final java.lang.String f;
    private java.lang.String g;
    private defpackage.fmk h;
    private int i;
    private int j;
    private boolean k;
    private long l;
    private defpackage.eqg m;
    private int n;

    public ftq(java.lang.String str, int i, java.lang.String str2) {
        defpackage.etv etvVar = new defpackage.etv(new byte[128]);
        this.b = etvVar;
        this.c = new defpackage.etx((byte[]) etvVar.c);
        this.i = 0;
        this.a = -9223372036854775807L;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x023f  */
    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) {
        java.lang.String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ahvr.ci(this.h);
        while (etxVar.d() > 0) {
            int i14 = this.i;
            if (i14 == 0) {
                while (etxVar.d() > 0) {
                    if (this.k) {
                        int iN = etxVar.n();
                        if (iN == 119) {
                            this.k = false;
                            this.i = 1;
                            byte[] bArr = this.c.b;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.j = 2;
                            break;
                        }
                        this.k = iN == 11;
                    } else {
                        this.k = etxVar.n() == 11;
                    }
                }
            } else if (i14 != 1) {
                int iMin = java.lang.Math.min(etxVar.d(), this.n - this.j);
                this.h.b(etxVar, iMin);
                int i15 = this.j + iMin;
                this.j = i15;
                if (i15 == this.n) {
                    ahvr.bY(this.a != -9223372036854775807L);
                    this.h.d(this.a, 1, this.n, 0, null);
                    this.a += this.l;
                    this.i = 0;
                }
            } else {
                defpackage.etx etxVar2 = this.c;
                byte[] bArr2 = etxVar2.b;
                int iMin2 = java.lang.Math.min(etxVar.d(), 128 - this.j);
                etxVar.L(bArr2, this.j, iMin2);
                int i16 = this.j + iMin2;
                this.j = i16;
                if (i16 == 128) {
                    defpackage.etv etvVar = this.b;
                    etvVar.l(0);
                    int[] iArr = defpackage.fkp.a;
                    int iC = etvVar.c();
                    etvVar.n(40);
                    int iD = etvVar.d(5);
                    etvVar.l(iC);
                    if (iD > 10) {
                        etvVar.n(16);
                        int iD2 = etvVar.d(2);
                        if (iD2 == 0) {
                            b = 0;
                        } else if (iD2 != 1) {
                            b = iD2 != 2 ? (byte) -1 : (byte) 2;
                        } else {
                            b = 1;
                        }
                        etvVar.n(3);
                        int iD3 = etvVar.d(11) + 1;
                        int iD4 = etvVar.d(2);
                        if (iD4 == 3) {
                            i8 = defpackage.fkp.c[etvVar.d(2)];
                            i7 = 3;
                            i6 = 6;
                        } else {
                            int iD5 = etvVar.d(2);
                            i6 = defpackage.fkp.a[iD5];
                            i7 = iD5;
                            i8 = defpackage.fkp.b[iD4];
                        }
                        i5 = iD3 << 1;
                        int i17 = (i5 * i8) / (i6 << 5);
                        int iD6 = etvVar.d(3);
                        boolean zP = etvVar.p();
                        i3 = defpackage.fkp.d[iD6] + (zP ? 1 : 0);
                        etvVar.n(10);
                        if (etvVar.p()) {
                            etvVar.n(8);
                        }
                        if (iD6 == 0) {
                            etvVar.n(5);
                            if (etvVar.p()) {
                                etvVar.n(8);
                            }
                            i9 = 0;
                            iD6 = 0;
                        } else {
                            i9 = iD6;
                        }
                        if (b == 1) {
                            if (etvVar.p()) {
                                etvVar.n(16);
                            }
                            b = 1;
                        }
                        if (etvVar.p()) {
                            if (i9 > 2) {
                                etvVar.n(2);
                            }
                            if ((i9 & 1) == 0 || i9 <= 2) {
                                i13 = 6;
                            } else {
                                i13 = 6;
                                etvVar.n(6);
                            }
                            if ((i9 & 4) != 0) {
                                etvVar.n(i13);
                            }
                            if (zP && etvVar.p()) {
                                etvVar.n(5);
                            }
                            if (b == 0) {
                                if (etvVar.p()) {
                                    etvVar.n(6);
                                }
                                if (i9 == 0 && etvVar.p()) {
                                    etvVar.n(6);
                                }
                                if (etvVar.p()) {
                                    etvVar.n(6);
                                }
                                int iD7 = etvVar.d(2);
                                if (iD7 == 1) {
                                    etvVar.n(5);
                                } else if (iD7 == 2) {
                                    etvVar.n(12);
                                } else if (iD7 == 3) {
                                    int iD8 = etvVar.d(5);
                                    if (etvVar.p()) {
                                        etvVar.n(5);
                                        if (etvVar.p()) {
                                            etvVar.n(4);
                                        }
                                        if (etvVar.p()) {
                                            etvVar.n(4);
                                        }
                                        if (etvVar.p()) {
                                            etvVar.n(4);
                                        }
                                        if (etvVar.p()) {
                                            etvVar.n(4);
                                        }
                                        if (etvVar.p()) {
                                            etvVar.n(4);
                                        }
                                        if (etvVar.p()) {
                                            etvVar.n(4);
                                        }
                                        if (etvVar.p()) {
                                            etvVar.n(4);
                                        }
                                        if (etvVar.p()) {
                                            if (etvVar.p()) {
                                                etvVar.n(4);
                                            }
                                            if (etvVar.p()) {
                                                etvVar.n(4);
                                            }
                                        }
                                    }
                                    if (etvVar.p()) {
                                        etvVar.n(5);
                                        if (etvVar.p()) {
                                            etvVar.n(7);
                                            if (etvVar.p()) {
                                                etvVar.n(8);
                                            }
                                        }
                                    }
                                    etvVar.n((iD8 + 2) << 3);
                                    etvVar.h();
                                }
                                if (i9 < 2) {
                                    if (etvVar.p()) {
                                        etvVar.n(14);
                                    }
                                    if (iD6 == 0 && etvVar.p()) {
                                        etvVar.n(14);
                                    }
                                }
                                if (!etvVar.p()) {
                                    i10 = i7;
                                    b = 0;
                                } else if (i7 == 0) {
                                    etvVar.n(5);
                                    b = 0;
                                    i10 = 0;
                                } else {
                                    for (int i18 = 0; i18 < i6; i18++) {
                                        if (etvVar.p()) {
                                            etvVar.n(5);
                                        }
                                    }
                                    i10 = i7;
                                    b = 0;
                                }
                            } else {
                                i10 = i7;
                            }
                        } else {
                            i10 = i7;
                        }
                        if (etvVar.p()) {
                            etvVar.n(5);
                            if (i9 == 2) {
                                etvVar.n(4);
                                i9 = 2;
                            }
                            if (i9 >= 6) {
                                etvVar.n(2);
                            }
                            if (etvVar.p()) {
                                i12 = 8;
                                etvVar.n(8);
                            } else {
                                i12 = 8;
                            }
                            if (i9 == 0 && etvVar.p()) {
                                etvVar.n(i12);
                            }
                            if (iD4 < 3) {
                                etvVar.m();
                            }
                        }
                        if (b == 0 && i10 != 3) {
                            etvVar.m();
                        }
                        if (b == 2 && (i10 == 3 || etvVar.p())) {
                            i11 = 6;
                            etvVar.n(6);
                        } else {
                            i11 = 6;
                        }
                        str = (etvVar.p() && etvVar.d(i11) == 1 && etvVar.d(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i4 = i6 << 8;
                        i2 = i8;
                        i = i17;
                    } else {
                        etvVar.n(32);
                        int iD9 = etvVar.d(2);
                        str = iD9 == 3 ? null : "audio/ac3";
                        int iD10 = etvVar.d(6);
                        i = defpackage.fkp.e[iD10 / 2] * 1000;
                        int iA = defpackage.fkp.a(iD9, iD10);
                        etvVar.n(8);
                        int iD11 = etvVar.d(3);
                        if ((iD11 & 1) != 0 && iD11 != 1) {
                            etvVar.n(2);
                        }
                        if ((iD11 & 4) != 0) {
                            etvVar.n(2);
                        }
                        if (iD11 == 2) {
                            etvVar.n(2);
                        }
                        i2 = iD9 < 3 ? defpackage.fkp.b[iD9] : -1;
                        i3 = defpackage.fkp.d[iD11] + (etvVar.p() ? 1 : 0);
                        i4 = 1536;
                        i5 = iA;
                    }
                    int i19 = i3;
                    defpackage.eqg eqgVar = this.m;
                    if (eqgVar == null || i19 != eqgVar.H || i2 != eqgVar.J || !j$.util.Objects.equals(str, eqgVar.p)) {
                        defpackage.eqf eqfVar = new defpackage.eqf();
                        eqfVar.a = this.g;
                        eqfVar.a(this.f);
                        eqfVar.c(str);
                        eqfVar.F = i19;
                        eqfVar.H = i2;
                        eqfVar.d = this.d;
                        eqfVar.f = this.e;
                        eqfVar.i = i;
                        if ("audio/ac3".equals(str)) {
                            eqfVar.h = i;
                        }
                        defpackage.eqg eqgVar2 = new defpackage.eqg(eqfVar);
                        this.m = eqgVar2;
                        this.h.p(eqgVar2);
                    }
                    this.n = i5;
                    this.l = (((long) i4) * 1000000) / ((long) this.m.J);
                    etxVar2.Q(0);
                    this.h.b(etxVar2, 128);
                    this.i = 2;
                }
            }
        }
    }

    @Override // defpackage.ftx
    public final void b(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        fvbVar.c();
        this.g = fvbVar.b();
        this.h = fllVar.r(fvbVar.a(), 1);
    }

    @Override // defpackage.ftx
    public final void e(long j, int i) {
        this.a = j;
    }

    @Override // defpackage.ftx
    public final void f() {
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.a = -9223372036854775807L;
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void d() {
    }
}
