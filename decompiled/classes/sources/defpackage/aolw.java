package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aolw extends defpackage.aomd {
    final /* synthetic */ defpackage.dsm a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aolw(defpackage.aoln aolnVar, defpackage.aolr aolrVar, defpackage.aonj aonjVar) {
        super(aolnVar, aolrVar);
        this.a = (defpackage.dsm) aonjVar;
    }

    @Override // defpackage.aomb
    protected final java.lang.Object b(java.lang.Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("This coroutine had already completed");
            }
            this.b = 2;
            defpackage.aooc.af(obj);
            return obj;
        }
        this.b = 1;
        defpackage.aooc.af(obj);
        defpackage.dsm dsmVar = this.a;
        defpackage.aoov.f(dsmVar, 1);
        return dsmVar.a(this);
    }
}
