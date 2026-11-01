package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class admf implements defpackage.adfq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ admf(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.adfq
    public final void a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.admg admgVar = (defpackage.admg) this.a;
            admgVar.a.e();
            admgVar.a.h().length();
            ((adnb) obj).g();
            return;
        }
        if (i == 1) {
            ((adgz) obj).b();
            return;
        }
        if (i != 2) {
            java.lang.Object obj2 = defpackage.adnd.a;
            defpackage.adjg adjgVar = (defpackage.adjg) this.a;
            adjgVar.d();
            adjgVar.g();
            adjgVar.e();
            ((adnb) obj).i();
            return;
        }
        long j = defpackage.adna.a;
        java.lang.Object obj3 = this.a;
        defpackage.adia adiaVarE = defpackage.adib.e();
        defpackage.adjg adjgVar2 = (defpackage.adjg) obj3;
        adiaVarE.c(adjgVar2.l());
        adiaVarE.e(adjgVar2.n());
        adiaVarE.d(adjgVar2.m());
        adiaVarE.b(adjgVar2.k());
        adiaVarE.a();
        ((adnb) obj).j();
    }
}
