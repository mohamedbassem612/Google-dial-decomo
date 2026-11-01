package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class edq extends aomh implements aonj {
    java.lang.Object a;
    int b;
    final /* synthetic */ eei c;
    final /* synthetic */ aonn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edq(eei eeiVar, aonn aonnVar, aoln aolnVar) {
        super(1, aolnVar);
        this.c = eeiVar;
        this.d = aonnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.edq(this.c, this.d, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        efd eexVar;
        aolu aoluVar = aolu.a;
        int i = this.b;
        try {
            if (i == 0) {
                aooc.af(obj);
                eei eeiVar = this.c;
                aonn aonnVar = this.d;
                this.b = 1;
                obj = eeiVar.h(true, aonnVar, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i != 1) {
                    obj2 = this.a;
                    aooc.af(obj);
                    eexVar = new eex((java.lang.Throwable) obj2, ((java.lang.Number) obj).intValue());
                    return new aoiu(eexVar, java.lang.Boolean.TRUE);
                }
                aooc.af(obj);
            }
            eexVar = (efd) obj;
        } catch (java.lang.Throwable th) {
            aonn aonnVar2 = this.d;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            this.a = th;
            this.b = 2;
            java.lang.Object objA = aonnVar2.a(bool, this);
            if (objA == aoluVar) {
                return aoluVar;
            }
            obj = objA;
            obj2 = th;
        }
        return new aoiu(eexVar, java.lang.Boolean.TRUE);
    }
}
