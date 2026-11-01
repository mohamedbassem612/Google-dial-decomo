package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ytm {
    public final android.content.Context a;
    public final defpackage.ytj b;
    public final ahpz c;
    public final aoin d;
    public final aoxh e;
    public final aoxh f;
    private final aolr g;

    public ytm(android.content.Context context, aolr aolrVar, defpackage.ytj ytjVar, ahpz ahpzVar, aoin aoinVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(aoinVar, "enablePackageReplaceChangeFlowEvents");
        this.a = context;
        this.g = aolrVar;
        this.b = ytjVar;
        this.c = ahpzVar;
        this.d = aoinVar;
        this.e = a("com.google.android.aicore");
        this.f = a("com.google.android.as.oss");
    }

    private final aoxh a(java.lang.String str) {
        return aoov.aC(new aowy(new defpackage.agwn(this, str, (aoln) null, 1)), this.g);
    }
}
