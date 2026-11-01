package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fun implements defpackage.fus {
    private defpackage.eqg a;
    private defpackage.euk b;
    private defpackage.fmk c;

    public fun(java.lang.String str) {
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.a("video/mp2t");
        eqfVar.c(str);
        this.a = new defpackage.eqg(eqfVar);
    }

    @Override // defpackage.fus
    public final void a(defpackage.etx etxVar) {
        ahvr.ci(this.b);
        java.lang.String str = eum.a;
        long jE = this.b.e();
        long jF = this.b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        defpackage.eqg eqgVar = this.a;
        if (jF != eqgVar.u) {
            defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
            eqfVar.s = jF;
            defpackage.eqg eqgVar2 = new defpackage.eqg(eqfVar);
            this.a = eqgVar2;
            this.c.p(eqgVar2);
        }
        int iD = etxVar.d();
        this.c.b(etxVar, iD);
        this.c.d(jE, 1, iD, 0, null);
    }

    @Override // defpackage.fus
    public final void b(defpackage.euk eukVar, defpackage.fll fllVar, defpackage.fvb fvbVar) {
        this.b = eukVar;
        fvbVar.c();
        defpackage.fmk fmkVarR = fllVar.r(fvbVar.a(), 5);
        this.c = fmkVarR;
        fmkVarR.p(this.a);
    }
}
