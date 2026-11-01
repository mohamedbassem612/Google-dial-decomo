package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class achx implements defpackage.adzf {
    public static final /* synthetic */ int d = 0;
    public final defpackage.aoin a;
    public final defpackage.achv b;
    public final defpackage.amwu c;
    private final defpackage.aoin e;
    private final defpackage.aolr f;
    private final java.lang.String g;
    private final java.lang.Long h;

    static {
        defpackage.aiof.i("GnpSdk");
    }

    public achx(defpackage.aoin aoinVar, defpackage.achv achvVar, defpackage.amwu amwuVar, defpackage.aazc aazcVar, defpackage.aoin aoinVar2, defpackage.aolr aolrVar) {
        defpackage.aooh.f(aoinVar, "growthkitEnabled");
        defpackage.aooh.f(achvVar, "promotionSync");
        defpackage.aooh.f(amwuVar, "syncDataStore");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(aoinVar2, "syncRetryMs");
        defpackage.aooh.f(aolrVar, "lightweightContext");
        this.a = aoinVar;
        this.b = achvVar;
        this.c = amwuVar;
        this.e = aoinVar2;
        this.f = aolrVar;
        this.g = "GK_ONEOFF_SYNC";
        this.h = (java.lang.Long) aoinVar2.a();
    }

    @Override // defpackage.adzf
    public final int a() {
        return 11;
    }

    @Override // defpackage.adzf
    public final long b() {
        return 0L;
    }

    @Override // defpackage.adzf
    public final java.lang.Long c() {
        return this.h;
    }

    @Override // defpackage.adzf
    public final java.lang.Object d(android.os.Bundle bundle, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.f, new abvg(this, bundle, (defpackage.aoln) null, 12), aolnVar);
    }

    @Override // defpackage.adzf
    public final java.lang.String e() {
        return this.g;
    }

    @Override // defpackage.adzf
    public final boolean f() {
        return false;
    }

    @Override // defpackage.adzf
    public final boolean g() {
        return true;
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
