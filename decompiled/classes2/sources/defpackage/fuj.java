package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fuj implements defpackage.ftx {
    private final defpackage.etx a;
    private final defpackage.flv b;
    private final java.lang.String c;
    private final int d;
    private final java.lang.String e;
    private defpackage.fmk f;
    private java.lang.String g;
    private int h = 0;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private int m;
    private long n;

    public fuj(java.lang.String str, int i, java.lang.String str2) {
        defpackage.etx etxVar = new defpackage.etx(4);
        this.a = etxVar;
        etxVar.b[0] = -1;
        this.b = new defpackage.flv();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) {
        ahvr.ci(this.f);
        while (etxVar.d() > 0) {
            int i = this.h;
            if (i == 0) {
                byte[] bArr = etxVar.b;
                int i2 = etxVar.c;
                int i3 = etxVar.d;
                while (true) {
                    if (i2 >= i3) {
                        etxVar.Q(i3);
                        break;
                    }
                    int i4 = i2 + 1;
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        etxVar.Q(i4);
                        this.k = false;
                        this.a.b[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2 = i4;
                }
            } else if (i != 1) {
                int iMin = java.lang.Math.min(etxVar.d(), this.m - this.i);
                this.f.b(etxVar, iMin);
                int i5 = this.i + iMin;
                this.i = i5;
                if (i5 >= this.m) {
                    ahvr.bY(this.n != -9223372036854775807L);
                    this.f.d(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            } else {
                int iMin2 = java.lang.Math.min(etxVar.d(), 4 - this.i);
                defpackage.etx etxVar2 = this.a;
                etxVar.L(etxVar2.b, this.i, iMin2);
                int i6 = this.i + iMin2;
                this.i = i6;
                if (i6 >= 4) {
                    etxVar2.Q(0);
                    defpackage.flv flvVar = this.b;
                    if (flvVar.a(etxVar2.i())) {
                        this.m = flvVar.c;
                        if (!this.j) {
                            this.l = (((long) flvVar.g) * 1000000) / ((long) flvVar.d);
                            defpackage.eqf eqfVar = new defpackage.eqf();
                            eqfVar.a = this.g;
                            eqfVar.a(this.e);
                            eqfVar.c(flvVar.b);
                            eqfVar.o = 4096;
                            eqfVar.F = flvVar.e;
                            eqfVar.H = flvVar.d;
                            eqfVar.d = this.c;
                            eqfVar.f = this.d;
                            this.f.p(new defpackage.eqg(eqfVar));
                            this.j = true;
                        }
                        etxVar2.Q(0);
                        this.f.b(etxVar2, 4);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            }
        }
    }

    @Override // defpackage.ftx
    public final void b(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        fvbVar.c();
        this.g = fvbVar.b();
        this.f = fllVar.r(fvbVar.a(), 1);
    }

    @Override // defpackage.ftx
    public final void e(long j, int i) {
        this.n = j;
    }

    @Override // defpackage.ftx
    public final void f() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void d() {
    }
}
