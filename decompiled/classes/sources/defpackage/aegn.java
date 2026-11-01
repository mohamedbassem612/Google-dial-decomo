package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aegn implements defpackage.aegg {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    public final defpackage.adzz b;
    public final android.content.Context c;
    public final defpackage.aefv d;
    public final boolean e;
    public final defpackage.aoin f;
    public final defpackage.adao g;
    private final defpackage.aolr h;

    public aegn(defpackage.adzz adzzVar, defpackage.aolr aolrVar, defpackage.adao adaoVar, android.content.Context context, defpackage.aefv aefvVar, boolean z, defpackage.aoin aoinVar) {
        defpackage.aooh.f(adzzVar, "gnpRegistrationHandler");
        defpackage.aooh.f(aolrVar, "backgroundContext");
        defpackage.aooh.f(adaoVar, "gnpRegistrationDataHelper");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aoinVar, "inappPushEnabledFlag");
        this.b = adzzVar;
        this.h = aolrVar;
        this.g = adaoVar;
        this.c = context;
        this.d = aefvVar;
        this.e = z;
        this.f = aoinVar;
    }

    @Override // defpackage.aegg
    public final java.lang.Object a(defpackage.akti aktiVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.h, new defpackage.aeef(this, aktiVar, (defpackage.aoln) null, 2), aolnVar);
    }
}
