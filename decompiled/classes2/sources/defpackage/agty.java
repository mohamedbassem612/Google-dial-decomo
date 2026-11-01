package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agty extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ aolr e;
    final /* synthetic */ aonj f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agty(aolr aolrVar, aonj aonjVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = aolrVar;
        this.f = aonjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [aolr] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v2, types: [aonj] */
    public final java.lang.Object b(java.lang.Object obj) {
        aoud aoudVar;
        java.lang.Object cancellationSignal;
        java.lang.Object obj2;
        ?? r2;
        aolu aoluVar = aolu.a;
        int i = this.d;
        if (i == 0) {
            aooc.af(obj);
            aoub aoubVar = ((aoss) this.g).c().get(aoub.d);
            aooh.c(aoubVar);
            aoudVar = new aoud(aoubVar);
            cancellationSignal = new android.os.CancellationSignal();
            aoudVar.p(new agkc(cancellationSignal, 9));
            aolr aolrVar = this.e;
            obj2 = this.f;
            this.g = aoudVar;
            this.a = cancellationSignal;
            this.b = aolrVar;
            this.c = obj2;
            this.d = 1;
            if (ahre.a(aolrVar, this) != aoluVar) {
                r2 = aolrVar;
            }
            return aoluVar;
        }
        if (i != 1) {
            aooc.af(obj);
            return obj;
        }
        obj2 = this.c;
        java.lang.Object obj3 = this.b;
        cancellationSignal = this.a;
        aoudVar = (aoud) this.g;
        aooc.af(obj);
        r2 = obj3;
        java.lang.Object obj4 = cancellationSignal;
        aoud aoudVar2 = aoudVar;
        ?? r3 = obj2;
        aolr aolrVarK = afsq.K((aolr) r2);
        defpackage.agts agtsVar = new defpackage.agts((aoln) null, (aonj) r3, (android.os.CancellationSignal) obj4, aoudVar2, 2);
        this.g = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 2;
        java.lang.Object objAj = aoov.aj(aolrVarK, agtsVar, this);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.agty agtyVar = new defpackage.agty(this.e, this.f, aolnVar);
        agtyVar.g = obj;
        return agtyVar;
    }
}
