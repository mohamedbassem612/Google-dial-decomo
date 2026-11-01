package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahdo implements ahbi {
    public final com.google.apps.tiktok.account.AccountId a;
    public final defpackage.ahdr b;
    public final aoin c;
    public final java.lang.String d;
    public final zzx e;
    private final agoo f;
    private final java.util.concurrent.Executor g;

    public ahdo(com.google.apps.tiktok.account.AccountId accountId, agoo agooVar, zzx zzxVar, defpackage.ahdr ahdrVar, aoin aoinVar, java.util.concurrent.Executor executor, java.lang.String str) {
        aooh.f(agooVar, "accountDataService");
        aooh.f(ahdrVar, "userSwitchSerializer");
        aooh.f(aoinVar, "selector");
        aooh.f(executor, "lightweightExecutor");
        aooh.f(str, "configPackage");
        this.a = accountId;
        this.f = agooVar;
        this.e = zzxVar;
        this.b = ahdrVar;
        this.c = aoinVar;
        this.g = executor;
        this.d = str;
    }

    public final ajcq a(java.lang.String str, akzc akzcVar, aexf aexfVar) {
        aooh.f(aexfVar, "commitProperties");
        return this.b.a(aexfVar, akzcVar, str, this.d);
    }

    public final ajcq b(akzc akzcVar, aexf aexfVar) {
        aooh.f(aexfVar, "commitProperties");
        defpackage.aclk aclkVar = new defpackage.aclk(this, akzcVar, aexfVar, 5);
        defpackage.ahdr ahdrVar = this.b;
        ajcq ajcqVarE = ahdrVar.d.e(ahqx.b(new defpackage.adck((aonj) aclkVar, ahdrVar, 16)), ajbm.a);
        aooh.e(ajcqVarE, "submitAsync(...)");
        return ajcqVarE;
    }

    public final ajcq c(akzc akzcVar, com.google.apps.tiktok.account.AccountId accountId, com.google.apps.tiktok.account.AccountId accountId2, aexf aexfVar) {
        if (accountId == null || !aooh.n(accountId2, accountId)) {
            return aiql.z((java.lang.Object) null);
        }
        ajcq ajcqVarB = this.f.b(accountId2);
        final defpackage.aclk aclkVar = new defpackage.aclk(this, aexfVar, akzcVar, 4, null);
        return ahvr.I(ajcqVarB, new ajat() { // from class: ahdn
            /* JADX WARN: Type inference failed for: r0v2, types: [ajcq, java.lang.Object] */
            public final /* synthetic */ ajcq a(java.lang.Object obj) {
                return aclkVar.a(obj);
            }
        }, this.g);
    }
}
