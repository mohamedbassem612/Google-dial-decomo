package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ftu implements defpackage.ftx {
    private static final byte[] c = {73, 68, 51};
    private final boolean d;
    private final java.lang.String g;
    private final int h;
    private final java.lang.String i;
    private java.lang.String j;
    private defpackage.fmk k;
    private defpackage.fmk l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private int t;
    private boolean u;
    private int v;
    private defpackage.fmk w;
    private long x;
    private final defpackage.etv e = new defpackage.etv(new byte[7]);
    private final defpackage.etx f = new defpackage.etx(java.util.Arrays.copyOf(c, 10));
    private int r = -1;
    private int s = -1;
    public long a = -9223372036854775807L;
    public long b = -9223372036854775807L;

    public ftu(boolean z, java.lang.String str, int i, java.lang.String str2) {
        this.d = z;
        this.g = str;
        this.h = i;
        this.i = str2;
        i();
    }

    public static boolean g(int i) {
        return (i & 65526) == 65520;
    }

    private final void h() {
        this.q = false;
        i();
    }

    private final void i() {
        this.m = 0;
        this.n = 0;
        this.o = 256;
    }

    private final void j() {
        this.m = 3;
        this.n = 0;
    }

    private final void k(defpackage.fmk fmkVar, long j, int i, int i2) {
        this.m = 4;
        this.n = i;
        this.w = fmkVar;
        this.x = j;
        this.v = i2;
    }

    private final boolean l(defpackage.etx etxVar, byte[] bArr, int i) {
        int iMin = java.lang.Math.min(etxVar.d(), i - this.n);
        etxVar.L(bArr, this.n, iMin);
        int i2 = this.n + iMin;
        this.n = i2;
        return i2 == i;
    }

    private static final boolean m(defpackage.etx etxVar, byte[] bArr, int i) {
        if (etxVar.d() < i) {
            return false;
        }
        etxVar.L(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0256  */
    /* JADX WARN: Code duplicated, block: B:105:0x025a  */
    /* JADX WARN: Code duplicated, block: B:107:0x025e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0262  */
    /* JADX WARN: Code duplicated, block: B:138:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x0202  */
    /* JADX WARN: Code duplicated, block: B:82:0x0215  */
    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int iD;
        byte[] bArr;
        int i5;
        int i6;
        byte b;
        int i7;
        int i8;
        int i9;
        byte b2;
        ahvr.ci(this.k);
        java.lang.String str = eum.a;
        while (etxVar.d() > 0) {
            int i10 = this.m;
            int i11 = 4;
            int i12 = 3;
            int i13 = 2;
            if (i10 == 0) {
                byte[] bArr2 = etxVar.b;
                int i14 = etxVar.c;
                int i15 = etxVar.d;
                while (true) {
                    if (i14 < i15) {
                        int i16 = i14 + 1;
                        byte b3 = bArr2[i14];
                        int i17 = b3 & 255;
                        int i18 = i12;
                        if (this.o == 512 && g((((byte) i17) & 255) | 65280)) {
                            if (!this.q) {
                                int i19 = i14 - 1;
                                etxVar.Q(i14);
                                defpackage.etv etvVar = this.e;
                                if (m(etxVar, (byte[]) etvVar.c, 1)) {
                                    etvVar.l(i11);
                                    int iD2 = etvVar.d(1);
                                    int i20 = this.r;
                                    if (i20 == -1 || iD2 == i20) {
                                        if (this.s == -1) {
                                            if (m(etxVar, (byte[]) etvVar.c, i11)) {
                                                etvVar.l(14);
                                                iD = etvVar.d(13);
                                                if (iD >= 7) {
                                                    bArr = etxVar.b;
                                                    i5 = etxVar.d;
                                                    i6 = i19 + iD;
                                                    if (i6 >= i5) {
                                                        b = bArr[i6];
                                                        if (b == -1) {
                                                            i9 = i6 + 1;
                                                            if (i9 != i5) {
                                                                b2 = bArr[i9];
                                                                if (g((b2 & 255) | 65280) || ((b2 & 8) >> 3) != iD2) {
                                                                }
                                                            }
                                                        } else if (b == 73 || ((i7 = i6 + 1) != i5 && (bArr[i7] != 68 || ((i8 = i6 + 2) != i5 && bArr[i8] != 51)))) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (m(etxVar, (byte[]) etvVar.c, 1)) {
                                            etvVar.l(i13);
                                            if (etvVar.d(i11) == this.s) {
                                                etxVar.Q(i14 + 1);
                                                if (m(etxVar, (byte[]) etvVar.c, i11)) {
                                                    etvVar.l(14);
                                                    iD = etvVar.d(13);
                                                    if (iD >= 7) {
                                                        bArr = etxVar.b;
                                                        i5 = etxVar.d;
                                                        i6 = i19 + iD;
                                                        if (i6 >= i5) {
                                                            b = bArr[i6];
                                                            if (b == -1) {
                                                                i9 = i6 + 1;
                                                                if (i9 != i5) {
                                                                    b2 = bArr[i9];
                                                                    if (g((b2 & 255) | 65280)) {
                                                                    }
                                                                }
                                                            } else if (b == 73) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i = this.o;
                                i2 = i17 | i;
                                if (i2 != 329) {
                                    i3 = 2;
                                    i4 = 768;
                                } else if (i2 != 511) {
                                    i3 = 2;
                                    i4 = 512;
                                } else if (i2 != 836) {
                                    i3 = 2;
                                    i4 = 1024;
                                } else if (i2 != 1075) {
                                    this.m = 2;
                                    this.n = i18;
                                    this.v = 0;
                                    this.f.Q(0);
                                    etxVar.Q(i16);
                                } else if (i != 256) {
                                    this.o = 256;
                                    i12 = i18;
                                    i11 = 4;
                                    i13 = 2;
                                } else {
                                    i18 = i18;
                                    i3 = 2;
                                    i12 = i18;
                                    i14 = i16;
                                    i11 = 4;
                                    i13 = i3;
                                }
                                this.o = i4;
                                i12 = i18;
                                i14 = i16;
                                i11 = 4;
                                i13 = i3;
                            }
                            this.t = (b3 & 8) >> 3;
                            this.p = 1 == ((b3 & 1) ^ 1);
                            if (this.q) {
                                j();
                            } else {
                                this.m = 1;
                                this.n = 0;
                            }
                            etxVar.Q(i16);
                        } else {
                            i = this.o;
                            i2 = i17 | i;
                            if (i2 != 329) {
                                i3 = 2;
                                i4 = 768;
                            } else if (i2 != 511) {
                                i3 = 2;
                                i4 = 512;
                            } else if (i2 != 836) {
                                i3 = 2;
                                i4 = 1024;
                            } else if (i2 != 1075) {
                                this.m = 2;
                                this.n = i18;
                                this.v = 0;
                                this.f.Q(0);
                                etxVar.Q(i16);
                            } else if (i != 256) {
                                this.o = 256;
                                i12 = i18;
                                i11 = 4;
                                i13 = 2;
                            } else {
                                i18 = i18;
                                i3 = 2;
                                i12 = i18;
                                i14 = i16;
                                i11 = 4;
                                i13 = i3;
                            }
                            this.o = i4;
                            i12 = i18;
                            i14 = i16;
                            i11 = 4;
                            i13 = i3;
                        }
                    } else {
                        etxVar.Q(i14);
                    }
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    defpackage.etx etxVar2 = this.f;
                    if (l(etxVar, etxVar2.b, 10)) {
                        this.l.b(etxVar2, 10);
                        etxVar2.Q(6);
                        k(this.l, 0L, 10, etxVar2.m() + 10);
                    }
                } else if (i10 != 3) {
                    int iMin = java.lang.Math.min(etxVar.d(), this.v - this.n);
                    this.w.b(etxVar, iMin);
                    int i21 = this.n + iMin;
                    this.n = i21;
                    if (i21 == this.v) {
                        ahvr.bY(this.b != -9223372036854775807L);
                        this.w.d(this.b, 1, this.v, 0, null);
                        this.b += this.x;
                        i();
                    }
                } else {
                    int i22 = true != this.p ? 5 : 7;
                    defpackage.etv etvVar2 = this.e;
                    if (l(etxVar, (byte[]) etvVar2.c, i22)) {
                        etvVar2.l(0);
                        if (this.u) {
                            etvVar2.n(10);
                        } else {
                            int iD3 = etvVar2.d(2) + 1;
                            if (iD3 != 2) {
                                defpackage.etr.f("AdtsReader", a.bs(iD3, "Detected audio object type: ", ", but assuming AAC LC."));
                            }
                            etvVar2.n(5);
                            int iD4 = etvVar2.d(3);
                            int i23 = this.s;
                            int i24 = defpackage.fko.a;
                            byte[] bArr3 = {(byte) (((i23 >> 1) & 7) | 16), (byte) (((i23 << 7) & 128) | ((iD4 << 3) & 120))};
                            defpackage.fsi fsiVarA = defpackage.fko.a(bArr3);
                            defpackage.eqf eqfVar = new defpackage.eqf();
                            eqfVar.a = this.j;
                            eqfVar.a(this.i);
                            eqfVar.c("audio/mp4a-latm");
                            eqfVar.j = (java.lang.String) fsiVarA.c;
                            eqfVar.F = fsiVarA.b;
                            eqfVar.H = fsiVarA.a;
                            eqfVar.q = java.util.Collections.singletonList(bArr3);
                            eqfVar.d = this.g;
                            eqfVar.f = this.h;
                            defpackage.eqg eqgVar = new defpackage.eqg(eqfVar);
                            this.a = 1024000000 / ((long) eqgVar.J);
                            this.k.p(eqgVar);
                            this.u = true;
                        }
                        etvVar2.n(4);
                        int iD5 = etvVar2.d(13);
                        int i25 = iD5 - 7;
                        if (this.p) {
                            i25 = iD5 - 9;
                        }
                        k(this.k, this.a, 0, i25);
                    }
                }
            } else if (etxVar.d() != 0) {
                defpackage.etv etvVar3 = this.e;
                ((byte[]) etvVar3.c)[0] = etxVar.b[etxVar.c];
                etvVar3.l(2);
                int iD6 = etvVar3.d(4);
                int i26 = this.s;
                if (i26 == -1 || iD6 == i26) {
                    if (!this.q) {
                        this.q = true;
                        this.r = this.t;
                        this.s = iD6;
                    }
                    j();
                } else {
                    h();
                }
            }
        }
    }

    @Override // defpackage.ftx
    public final void b(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        fvbVar.c();
        this.j = fvbVar.b();
        defpackage.fmk fmkVarR = fllVar.r(fvbVar.a(), 1);
        this.k = fmkVarR;
        this.w = fmkVarR;
        if (!this.d) {
            this.l = new defpackage.flg();
            return;
        }
        fvbVar.c();
        defpackage.fmk fmkVarR2 = fllVar.r(fvbVar.a(), 5);
        this.l = fmkVarR2;
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.a = fvbVar.b();
        eqfVar.a(this.i);
        eqfVar.c("application/id3");
        fmkVarR2.p(new defpackage.eqg(eqfVar));
    }

    @Override // defpackage.ftx
    public final void e(long j, int i) {
        this.b = j;
    }

    @Override // defpackage.ftx
    public final void f() {
        this.b = -9223372036854775807L;
        h();
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void d() {
    }
}
