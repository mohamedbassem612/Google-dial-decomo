package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class eed extends defpackage.aomh implements defpackage.aonj {
    int a;
    final /* synthetic */ defpackage.eei b;
    final /* synthetic */ defpackage.aolr c;
    final /* synthetic */ defpackage.aonn d;
    final /* synthetic */ defpackage.gjy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eed(defpackage.eei eeiVar, defpackage.gjy gjyVar, defpackage.aolr aolrVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.b = eeiVar;
        this.e = gjyVar;
        this.c = aolrVar;
        this.d = aonnVar;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.eed(this.b, this.e, this.c, this.d, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        defpackage.eec eecVar = new defpackage.eec(this.b, this.c, this.d, null);
        this.a = 1;
        java.lang.Object objO = defpackage.dpy.o(eecVar, this);
        return objO == aoluVar ? aoluVar : objO;
    }
}
