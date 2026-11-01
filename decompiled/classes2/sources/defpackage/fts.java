package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fts implements defpackage.ftx {
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
    private boolean l;
    private long m;
    private defpackage.eqg n;
    private int o;

    public fts(java.lang.String str, int i, java.lang.String str2) {
        defpackage.etv etvVar = new defpackage.etv(new byte[16]);
        this.b = etvVar;
        this.c = new defpackage.etx((byte[]) etvVar.c);
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.l = false;
        this.a = -9223372036854775807L;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) {
        boolean z;
        ahvr.ci(this.h);
        while (etxVar.d() > 0) {
            int i = this.i;
            if (i == 0) {
                while (true) {
                    if (etxVar.d() > 0) {
                        if (this.k) {
                            int iN = etxVar.n();
                            this.k = iN == 172;
                            if (iN == 64) {
                                if (iN != 65) {
                                    z = false;
                                }
                                this.l = z;
                                this.i = 1;
                                byte[] bArr = this.c.b;
                                bArr[0] = -84;
                                bArr[1] = true == this.l ? (byte) 65 : (byte) 64;
                                this.j = 2;
                            } else if (iN == 65) {
                            }
                            z = true;
                            this.l = z;
                            this.i = 1;
                            byte[] bArr2 = this.c.b;
                            bArr2[0] = -84;
                            bArr2[1] = true == this.l ? (byte) 65 : (byte) 64;
                            this.j = 2;
                        } else {
                            this.k = etxVar.n() == 172;
                        }
                    }
                }
            } else if (i != 1) {
                int iMin = java.lang.Math.min(etxVar.d(), this.o - this.j);
                this.h.b(etxVar, iMin);
                int i2 = this.j + iMin;
                this.j = i2;
                if (i2 == this.o) {
                    ahvr.bY(this.a != -9223372036854775807L);
                    this.h.d(this.a, 1, this.o, 0, null);
                    this.a += this.m;
                    this.i = 0;
                }
            } else {
                defpackage.etx etxVar2 = this.c;
                byte[] bArr3 = etxVar2.b;
                int iMin2 = java.lang.Math.min(etxVar.d(), 16 - this.j);
                etxVar.L(bArr3, this.j, iMin2);
                int i3 = this.j + iMin2;
                this.j = i3;
                if (i3 == 16) {
                    defpackage.etv etvVar = this.b;
                    etvVar.l(0);
                    defpackage.ahoz ahozVarC = defpackage.fkr.c(etvVar);
                    defpackage.eqg eqgVar = this.n;
                    if (eqgVar == null || eqgVar.H != 2 || ahozVarC.c != eqgVar.J || !"audio/ac4".equals(eqgVar.p)) {
                        defpackage.eqf eqfVar = new defpackage.eqf();
                        eqfVar.a = this.g;
                        eqfVar.a(this.f);
                        eqfVar.c("audio/ac4");
                        eqfVar.F = 2;
                        eqfVar.H = ahozVarC.c;
                        eqfVar.d = this.d;
                        eqfVar.f = this.e;
                        defpackage.eqg eqgVar2 = new defpackage.eqg(eqfVar);
                        this.n = eqgVar2;
                        this.h.p(eqgVar2);
                    }
                    this.o = ahozVarC.a;
                    this.m = (((long) ahozVarC.b) * 1000000) / ((long) this.n.J);
                    etxVar2.Q(0);
                    this.h.b(etxVar2, 16);
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
        this.l = false;
        this.a = -9223372036854775807L;
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void d() {
    }
}
