package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class edv extends aomh implements aonn {
    java.lang.Object a;
    int b;
    int c;
    /* synthetic */ boolean d;
    final /* synthetic */ eei e;
    final /* synthetic */ aonn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edv(eei eeiVar, aonn aonnVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = eeiVar;
        this.f = aonnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        return c(bool, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        int i;
        boolean z = this.d;
        aolu aoluVar = aolu.a;
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                i = this.b;
                obj2 = this.a;
                aooc.af(obj);
            } else {
                aooc.af(obj);
            }
            return new ecr(obj2, i, ((java.lang.Number) obj).intValue());
        }
        aooc.af(obj);
        eei eeiVar = this.e;
        this.d = z;
        this.c = 1;
        obj = eeiVar.g(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        int iHashCode = obj != null ? obj.hashCode() : 0;
        aonn aonnVar = this.f;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        this.a = obj;
        this.d = z;
        this.b = iHashCode;
        this.c = 2;
        java.lang.Object objA = aonnVar.a(boolValueOf, this);
        if (objA == aoluVar) {
            return aoluVar;
        }
        java.lang.Object obj3 = obj;
        obj = objA;
        obj2 = obj3;
        i = iHashCode;
        return new ecr(obj2, i, ((java.lang.Number) obj).intValue());
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.edv edvVar = new defpackage.edv(this.e, this.f, aolnVar);
        edvVar.d = ((java.lang.Boolean) obj).booleanValue();
        return edvVar;
    }
}
