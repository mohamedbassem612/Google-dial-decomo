package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hqv extends defpackage.ub {
    public final defpackage.tt f;
    public final defpackage.hqw g;
    public final defpackage.hqs h;
    public final aoss i;
    public final aolr j;
    public aozh k;
    private final aoub l;
    private final gpd m;
    private final apni n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqv(defpackage.tt ttVar, defpackage.hqw hqwVar, defpackage.hqs hqsVar, aoss aossVar, gpd gpdVar, aolr aolrVar, apni apniVar) {
        super(ttVar);
        aooh.f(ttVar, "carContext");
        aooh.f(hqwVar, "converter");
        aooh.f(hqsVar, "model");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(aolrVar, "mainContext");
        aooh.f(apniVar, "androidJobs");
        this.f = ttVar;
        this.g = hqwVar;
        this.h = hqsVar;
        this.i = aossVar;
        this.m = gpdVar;
        this.j = aolrVar;
        this.n = apniVar;
        aoub aoubVarJ = afsq.J(aossVar, new defpackage.hqi(this, (aoln) null, 2));
        this.l = aoubVarJ;
        if (aoubVarJ != null) {
            apniVar.i(aoubVarJ);
        }
    }

    @Override // defpackage.ub
    public final defpackage.ze a() {
        defpackage.ze zeVar;
        aozh aozhVar = this.k;
        return (aozhVar == null || (zeVar = (defpackage.ze) aozhVar.c()) == null) ? this.g.a() : zeVar;
    }

    @Override // defpackage.ub
    public final void b(emp empVar) {
        aoub aoubVar;
        aooh.f(empVar, "event");
        super.b(empVar);
        if (empVar == emp.ON_DESTROY && (aoubVar = this.l) != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        if (empVar == emp.ON_START) {
            this.m.i((java.lang.String) null).b(mce.gd);
        }
    }
}
