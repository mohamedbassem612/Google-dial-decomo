package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class nqu implements afig {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ alad b;

    public /* synthetic */ nqu(long j, alad aladVar, int i) {
        this.$cid = i;
        this.a = j;
        this.b = aladVar;
    }

    public final java.lang.Object a(adag adagVar) {
        int i = this.$cid;
        if (i == 0) {
            long j = this.a;
            defpackage.nsp nspVarAs = gus.as(adagVar, j);
            alad aladVar = this.b;
            aooh.f(aladVar, "info");
            defpackage.npw npwVarAn = mni.an(defpackage.nsq.a.m());
            npwVarAn.n((defpackage.nsl) aladVar);
            return java.lang.Boolean.valueOf(nri.o(adagVar, j, gus.an(nspVarAs, npwVarAn.l())));
        }
        if (i == 1) {
            long j2 = this.a;
            defpackage.nsp nspVarAs2 = gus.as(adagVar, j2);
            alad aladVar2 = this.b;
            aooh.f(aladVar2, "info");
            defpackage.npw npwVarAn2 = mni.an(defpackage.nsq.a.m());
            npwVarAn2.q((defpackage.nss) aladVar2);
            return java.lang.Boolean.valueOf(nri.o(adagVar, j2, gus.an(nspVarAs2, npwVarAn2.l())));
        }
        long j3 = this.a;
        if (i != 2) {
            return java.lang.Boolean.valueOf(nri.o(adagVar, j3, gus.ap(gus.as(adagVar, j3), (defpackage.nsm) this.b)));
        }
        defpackage.nsp nspVarAs3 = gus.as(adagVar, j3);
        alad aladVar3 = this.b;
        aooh.f(aladVar3, "info");
        defpackage.npw npwVarAn3 = mni.an(defpackage.nsq.a.m());
        npwVarAn3.p((defpackage.nso) aladVar3);
        return java.lang.Boolean.valueOf(nri.o(adagVar, j3, gus.an(nspVarAs3, npwVarAn3.l())));
    }
}
