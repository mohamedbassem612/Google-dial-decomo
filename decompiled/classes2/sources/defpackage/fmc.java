package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fmc implements defpackage.flj {
    private final int a;
    private final int b;
    private final java.lang.String c;
    private int d;
    private int e;
    private defpackage.fll f;
    private defpackage.fmk g;

    public fmc(int i, int i2, java.lang.String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        this.f = fllVar;
        defpackage.fmk fmkVarR = fllVar.r(1024, 4);
        this.g = fmkVarR;
        defpackage.eqf eqfVar = new defpackage.eqf();
        java.lang.String str = this.c;
        eqfVar.a(str);
        eqfVar.c(str);
        fmkVarR.p(new defpackage.eqg(eqfVar));
        this.f.s();
        this.f.y(new defpackage.fmd());
        this.e = 1;
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        int i = this.a;
        ahvr.bY((i == -1 || this.b == -1) ? false : true);
        int i2 = this.b;
        defpackage.etx etxVar = new defpackage.etx(i2);
        ((defpackage.flc) flkVar).n(etxVar.b, 0, i2, false);
        return etxVar.s() == i;
    }

    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) {
        int i = this.e;
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException();
            }
            return -1;
        }
        defpackage.fmk fmkVar = this.g;
        ahvr.ci(fmkVar);
        int iA = fmkVar.a(flkVar, 1024, true);
        if (iA == -1) {
            this.e = 2;
            this.g.d(0L, 1, this.d, 0, null);
            this.d = 0;
        } else {
            this.d += iA;
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
