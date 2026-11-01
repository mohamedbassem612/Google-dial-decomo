package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apan extends defpackage.aomd implements defpackage.aoxi, defpackage.aome {
    public final defpackage.aoxi a;
    public final defpackage.aolr b;
    private defpackage.aolr c;
    private defpackage.aoln d;

    public apan(defpackage.aoxi aoxiVar, defpackage.aolr aolrVar) {
        super(defpackage.apak.a, defpackage.aols.a);
        this.a = aoxiVar;
        this.b = aolrVar;
    }

    @Override // defpackage.aoxi
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        try {
            defpackage.aolr aolrVarU = aolnVar.u();
            defpackage.aooc.Y(aolrVarU);
            defpackage.aolr aolrVar = this.c;
            if (aolrVar != aolrVarU) {
                if (aolrVar instanceof defpackage.apah) {
                    throw new java.lang.IllegalStateException(defpackage.aoov.l("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((defpackage.apah) aolrVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
                defpackage.aolr aolrVar2 = this.b;
                if (aolrVarU != aolrVar2 && ((java.lang.Number) aolrVarU.fold(0, new defpackage.apaq(this, 0))).intValue() != ((java.lang.Number) aolrVar2.fold(0, new defpackage.dkm(20))).intValue()) {
                    throw new java.lang.IllegalStateException(defpackage.a.bl(aolrVarU, aolrVar2, "Flow invariant is violated:\n\t\tFlow was collected in ", ",\n\t\tbut emission happened in ", ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead"));
                }
                this.c = aolrVarU;
            }
            this.d = aolnVar;
            defpackage.aono aonoVar = defpackage.apap.a;
            defpackage.aoxi aoxiVar = this.a;
            if (aoxiVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
            }
            java.lang.Object objA = aonoVar.a(aoxiVar, obj, this);
            if (!defpackage.aooh.n(objA, defpackage.aolu.a)) {
                this.d = null;
            }
            defpackage.aolu aoluVar = defpackage.aolu.a;
            if (objA == aoluVar && aolnVar == null) {
                defpackage.aooh.i("frame");
            }
            return objA != aoluVar ? defpackage.aojh.a : objA;
        } catch (java.lang.Throwable th) {
            this.c = new defpackage.apah(th, aolnVar.u());
            throw th;
        }
    }

    @Override // defpackage.aomb
    protected final java.lang.Object b(java.lang.Object obj) {
        java.lang.Throwable thC = defpackage.aoiw.c(obj);
        if (thC != null) {
            this.c = new defpackage.apah(thC, u());
        }
        defpackage.aoln aolnVar = this.d;
        if (aolnVar != null) {
            aolnVar.w(obj);
        }
        return defpackage.aolu.a;
    }

    @Override // defpackage.aomb, defpackage.aome
    public final java.lang.StackTraceElement cJ() {
        return null;
    }

    @Override // defpackage.aomb, defpackage.aome
    public final defpackage.aome cK() {
        defpackage.aoln aolnVar = this.d;
        if (aolnVar instanceof defpackage.aome) {
            return (defpackage.aome) aolnVar;
        }
        return null;
    }

    @Override // defpackage.aomd, defpackage.aomb
    public final void f() {
        super.f();
    }

    @Override // defpackage.aomd, defpackage.aoln
    public final defpackage.aolr u() {
        defpackage.aolr aolrVar = this.c;
        return aolrVar == null ? defpackage.aols.a : aolrVar;
    }
}
