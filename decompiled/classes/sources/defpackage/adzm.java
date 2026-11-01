package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adzm implements defpackage.adzh {
    public final android.content.Context a;
    public final defpackage.adzg b;
    private final defpackage.aolr c;

    static {
        defpackage.aiof.i("GnpSdk");
    }

    public adzm(android.content.Context context, defpackage.aolr aolrVar, defpackage.adzg adzgVar, defpackage.aduu aduuVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aolrVar, "lightweightContext");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        this.a = context;
        this.c = aolrVar;
        this.b = adzgVar;
    }

    @Override // defpackage.adzh
    public final java.lang.Object a(int i, defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.c, new hxo(this, i, (defpackage.aoln) null, 10), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    @Override // defpackage.adzh
    public final java.lang.Object b(defpackage.adzf adzfVar, defpackage.aduy aduyVar, android.os.Bundle bundle, java.lang.Long l, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new yud(adzfVar, this, aduyVar, bundle, l, (defpackage.aoln) null, 5), aolnVar);
    }
}
