package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class achy implements defpackage.adzf {
    public static final /* synthetic */ int d = 0;
    public final defpackage.aoin a;
    public final defpackage.achv b;
    public final defpackage.amwu c;
    private final defpackage.aoin e;
    private final defpackage.aoin f;
    private final defpackage.aoin g;
    private final defpackage.aolr h;
    private final java.lang.String i;
    private final boolean j;
    private final long k;
    private final java.lang.Long l;

    static {
        defpackage.aiof.i("GnpSdk");
    }

    public achy(defpackage.aoin aoinVar, defpackage.achv achvVar, defpackage.amwu amwuVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aolr aolrVar) {
        defpackage.aooh.f(aoinVar, "growthkitEnabled");
        defpackage.aooh.f(achvVar, "promotionSync");
        defpackage.aooh.f(amwuVar, "gnpJobSchedulingApi");
        defpackage.aooh.f(aoinVar2, "syncPeriodMs");
        defpackage.aooh.f(aoinVar3, "syncRetryMs");
        defpackage.aooh.f(aoinVar4, "inappPushEnabledFlag");
        defpackage.aooh.f(aolrVar, "lightweightContext");
        this.a = aoinVar;
        this.b = achvVar;
        this.c = amwuVar;
        this.e = aoinVar2;
        this.f = aoinVar3;
        this.g = aoinVar4;
        this.h = aolrVar;
        this.i = "GK_PERIODIC_SYNC";
        java.lang.Object objA = aoinVar4.a();
        defpackage.aooh.e(objA, "get(...)");
        this.j = ((java.lang.Boolean) objA).booleanValue();
        java.lang.Object objA2 = aoinVar2.a();
        defpackage.aooh.e(objA2, "get(...)");
        this.k = ((java.lang.Number) objA2).longValue();
        this.l = (java.lang.Long) aoinVar3.a();
    }

    @Override // defpackage.adzf
    public final int a() {
        return 12;
    }

    @Override // defpackage.adzf
    public final long b() {
        return this.k;
    }

    @Override // defpackage.adzf
    public final java.lang.Long c() {
        return this.l;
    }

    @Override // defpackage.adzf
    public final java.lang.Object d(android.os.Bundle bundle, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.h, new acbt(this, (defpackage.aoln) null, 9), aolnVar);
    }

    @Override // defpackage.adzf
    public final java.lang.String e() {
        return this.i;
    }

    @Override // defpackage.adzf
    public final boolean f() {
        return true;
    }

    @Override // defpackage.adzf
    public final boolean g() {
        return this.j;
    }

    @Override // defpackage.adzf
    public final int h() {
        return 1;
    }

    @Override // defpackage.adzf
    public final void i() {
    }

    @Override // defpackage.adzf
    public final /* synthetic */ void j() {
    }
}
