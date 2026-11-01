package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ghs extends defpackage.aomh implements defpackage.aonn {
    int a;
    final /* synthetic */ defpackage.aolr b;
    final /* synthetic */ defpackage.gfy c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ defpackage.aonj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghs(defpackage.aolr aolrVar, defpackage.gfy gfyVar, boolean z, boolean z2, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.b = aolrVar;
        this.c = gfyVar;
        this.d = z;
        this.e = z2;
        this.f = aonjVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ghs) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        defpackage.aolr aolrVar = this.b;
        defpackage.ghr ghrVar = new defpackage.ghr(this.c, this.d, this.e, this.f, (defpackage.aoln) null, 0);
        this.a = 1;
        java.lang.Object objAj = defpackage.aoov.aj(aolrVar, ghrVar, this);
        return objAj == aoluVar ? aoluVar : objAj;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return new defpackage.ghs(this.b, this.c, this.d, this.e, this.f, aolnVar);
    }
}
