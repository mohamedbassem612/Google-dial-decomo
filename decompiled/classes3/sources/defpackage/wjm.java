package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wjm extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.wjo b;
    final /* synthetic */ char c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjm(defpackage.wjo wjoVar, char c, long j, aoln aolnVar) {
        super(2, aolnVar);
        this.b = wjoVar;
        this.c = c;
        this.d = j;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.wjo wjoVar = this.b;
            char c = this.c;
            long j = this.d;
            this.a = 1;
            java.lang.Object objAj = aoov.aj(wjoVar.b, new defpackage.wjl(wjoVar, j, c, null), this);
            if (objAj != aoluVar) {
                objAj = aojh.a;
            }
            if (objAj == aoluVar) {
                return aoluVar;
            }
        }
        return null;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.wjm(this.b, this.c, this.d, aolnVar);
    }
}
