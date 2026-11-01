package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class pzl extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.pzm b;
    final /* synthetic */ char c;
    final /* synthetic */ j$.time.Duration d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzl(defpackage.pzm pzmVar, char c, j$.time.Duration duration, aoln aolnVar) {
        super(2, aolnVar);
        this.b = pzmVar;
        this.c = c;
        this.d = duration;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.pzm pzmVar = this.b;
            ((defpackage.pqm) pzmVar.c).q(this.c);
            j$.time.Duration duration = this.d;
            long j = aorh.j(aooh.B(duration.getSeconds(), aorj.d), aooh.A(duration.getNano(), aorj.a));
            this.a = 1;
            if (aosv.k(j, this) == aoluVar) {
                return aoluVar;
            }
        }
        ((defpackage.pqm) this.b.c).s();
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.pzl(this.b, this.c, this.d, aolnVar);
    }
}
