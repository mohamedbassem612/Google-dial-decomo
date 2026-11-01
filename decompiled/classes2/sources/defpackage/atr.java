package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class atr extends aomh implements aonn {
    int a;
    final /* synthetic */ cvr b;
    final /* synthetic */ aono c;
    final /* synthetic */ aonj d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atr(cvr cvrVar, aono aonoVar, aonj aonjVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = cvrVar;
        this.c = aonoVar;
        this.d = aonjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aoss aossVar = (aoss) this.e;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            cvr cvrVar = this.b;
            defpackage.atq atqVar = new defpackage.atq(aossVar, new defpackage.ass(cvrVar), this.c, this.d, null);
            this.e = null;
            this.a = 1;
            if (defpackage.ro.d(cvrVar, atqVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.atr atrVar = new defpackage.atr(this.b, this.c, this.d, aolnVar);
        atrVar.e = obj;
        return atrVar;
    }
}
