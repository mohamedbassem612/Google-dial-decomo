package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apau implements defpackage.aoxi {
    private final defpackage.aolr a;
    private final java.lang.Object b;
    private final defpackage.aonn c;

    public apau(defpackage.aoxi aoxiVar, defpackage.aolr aolrVar) {
        this.a = aolrVar;
        this.b = defpackage.apcp.a(aolrVar);
        this.c = new defpackage.efu(aoxiVar, (defpackage.aoln) null, 9);
    }

    @Override // defpackage.aoxi
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        java.lang.Object objAo = defpackage.aoov.ao(this.a, obj, this.b, this.c, aolnVar);
        return objAo != defpackage.aolu.a ? defpackage.aojh.a : objAo;
    }
}
