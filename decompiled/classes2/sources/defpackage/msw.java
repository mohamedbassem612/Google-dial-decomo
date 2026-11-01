package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class msw extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.msy c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msw(defpackage.msy msyVar, long j, aoln aolnVar) {
        super(2, aolnVar);
        this.c = msyVar;
        this.d = j;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                aooc.af(obj);
            } else {
                obj2 = this.a;
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.msy msyVar = this.c;
        obj2 = msyVar.e;
        this.a = obj2;
        this.b = 1;
        obj = msyVar.b(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        long j = this.d;
        this.a = null;
        this.b = 2;
        if (((defpackage.nrj) obj2).a((defpackage.aivr) obj, j, this) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.msw(this.c, this.d, aolnVar);
    }
}
