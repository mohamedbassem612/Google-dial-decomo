package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class edr extends aomh implements aonn {
    java.lang.Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ eei d;
    final /* synthetic */ aonn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edr(eei eeiVar, aonn aonnVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = eeiVar;
        this.e = aonnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        return c(bool, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        efd eexVar;
        boolean z = this.c;
        aolu aoluVar = aolu.a;
        int i = this.b;
        try {
            if (i == 0) {
                aooc.af(obj);
                eei eeiVar = this.d;
                aonn aonnVar = this.e;
                this.c = z;
                this.b = 1;
                obj = eeiVar.h(z, aonnVar, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i != 1) {
                    obj2 = this.a;
                    aooc.af(obj);
                    eexVar = new eex((java.lang.Throwable) obj2, ((java.lang.Number) obj).intValue());
                    return new aoiu(eexVar, java.lang.Boolean.valueOf(z));
                }
                aooc.af(obj);
            }
            eexVar = (efd) obj;
        } catch (java.lang.Throwable th) {
            aonn aonnVar2 = this.e;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            this.a = th;
            this.c = z;
            this.b = 2;
            java.lang.Object objA = aonnVar2.a(boolValueOf, this);
            if (objA == aoluVar) {
                return aoluVar;
            }
            obj = objA;
            obj2 = th;
        }
        return new aoiu(eexVar, java.lang.Boolean.valueOf(z));
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.edr edrVar = new defpackage.edr(this.d, this.e, aolnVar);
        edrVar.c = ((java.lang.Boolean) obj).booleanValue();
        return edrVar;
    }
}
