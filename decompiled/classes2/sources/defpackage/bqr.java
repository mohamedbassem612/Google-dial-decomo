package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bqr extends aomh implements aonn {
    int a;
    final /* synthetic */ aii b;
    final /* synthetic */ java.util.List c;
    final /* synthetic */ aii d;
    final /* synthetic */ cei e;
    final /* synthetic */ ceg f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqr(aii aiiVar, java.util.List list, cei ceiVar, ceg cegVar, aii aiiVar2, aoln aolnVar) {
        super(2, aolnVar);
        this.b = aiiVar;
        this.c = list;
        this.e = ceiVar;
        this.f = cegVar;
        this.d = aiiVar2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aoss aossVar = (aoss) this.g;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.dqu dquVar = new defpackage.dqu(aossVar, this.b, this.c, this.e, this.f, 1);
            defpackage.ny nyVar = new defpackage.ny(aossVar, this.d, 18, null);
            defpackage.dfx dfxVar = (defpackage.dfx) aossVar.c().get(defpackage.dfx.a);
            if (dfxVar == null) {
                dquVar.a();
                nyVar.a();
            } else {
                new defpackage.bqp(dquVar, nyVar, (aoln) null, 0);
                this.g = null;
                this.a = 1;
                if (dfxVar.a() == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.bqr bqrVar = new defpackage.bqr(this.b, this.c, this.e, this.f, this.d, aolnVar);
        bqrVar.g = obj;
        return bqrVar;
    }
}
