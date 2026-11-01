package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acil implements adzf {
    public static final aiof a = aiof.i("GnpSdk");
    public final android.content.Context b;
    public final acci c;
    public final aoin d;
    public final achv e;
    private final aolr f;
    private final aoin g;
    private final java.lang.String h;
    private final long i;

    public acil(android.content.Context context, aolr aolrVar, acci acciVar, aoin aoinVar, aoin aoinVar2, achv achvVar) {
        aooh.f(context, "context");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aoinVar, "growthkitEnabled");
        aooh.f(aoinVar2, "syncRetryMs");
        aooh.f(achvVar, "promotionSync");
        this.b = context;
        this.f = aolrVar;
        this.c = acciVar;
        this.d = aoinVar;
        this.g = aoinVar2;
        this.e = achvVar;
        this.h = "GNP_IN_APP_ACCOUNT_SYNC";
        java.lang.Object objA = aoinVar2.a();
        aooh.e(objA, "get(...)");
        this.i = ((java.lang.Number) objA).longValue();
    }

    public final int a() {
        return 16;
    }

    public final long b() {
        return 0L;
    }

    public final java.lang.Long c() {
        return java.lang.Long.valueOf(this.i);
    }

    public final java.lang.Object d(android.os.Bundle bundle, aoln aolnVar) {
        return aoov.aj(this.f, new defpackage.abvg(this, bundle, (aoln) null, 17), aolnVar);
    }

    public final java.lang.String e() {
        return this.h;
    }

    public final boolean f() {
        return false;
    }

    public final boolean g() {
        return true;
    }

    public final int h() {
        return 1;
    }

    public final void i() {
    }

    public final /* synthetic */ void j() {
    }
}
