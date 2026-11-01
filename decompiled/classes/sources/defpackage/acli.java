package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acli implements defpackage.aegf {
    private final defpackage.aolr a;

    public acli(defpackage.abzy abzyVar, defpackage.aolr aolrVar) {
        defpackage.aooh.f(abzyVar, "accountManager");
        defpackage.aooh.f(aolrVar, "lightweightContext");
        this.a = aolrVar;
    }

    @Override // defpackage.aegf
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.a, new acbt(this, (defpackage.aoln) null, 13), aolnVar);
    }

    @Override // defpackage.aegf
    public final void b() {
    }
}
