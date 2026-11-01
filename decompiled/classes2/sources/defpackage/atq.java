package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class atq extends aomg implements aonn {
    int a;
    final /* synthetic */ aoss b;
    final /* synthetic */ defpackage.ass c;
    final /* synthetic */ aono d;
    final /* synthetic */ aonj e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atq(aoss aossVar, defpackage.ass assVar, aono aonoVar, aonj aonjVar, aoln aolnVar) {
        super(aolnVar);
        this.b = aossVar;
        this.c = assVar;
        this.d = aonoVar;
        this.e = aonjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((cwc) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        cwc cwcVar = (cwc) this.f;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            aoss aossVar = this.b;
            defpackage.ass assVar = this.c;
            aono aonoVar = this.d;
            aonj aonjVar = this.e;
            this.f = null;
            this.a = 1;
            if (defpackage.atv.f(cwcVar, aossVar, assVar, aonoVar, aonjVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.atq atqVar = new defpackage.atq(this.b, this.c, this.d, this.e, aolnVar);
        atqVar.f = obj;
        return atqVar;
    }
}
