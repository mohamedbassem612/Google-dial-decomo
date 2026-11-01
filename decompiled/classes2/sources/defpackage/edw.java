package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class edw extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ aoot d;
    final /* synthetic */ eei e;
    final /* synthetic */ aoor f;
    final /* synthetic */ aonn g;
    final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edw(aoot aootVar, eei eeiVar, aoor aoorVar, aonn aonnVar, boolean z, aoln aolnVar) {
        super(1, aolnVar);
        this.d = aootVar;
        this.e = eeiVar;
        this.f = aoorVar;
        this.g = aonnVar;
        this.h = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.edw(this.d, this.e, this.f, this.g, this.h, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        aoot aootVar;
        aoor aoorVar;
        aolu aoluVar = aolu.a;
        int i = this.c;
        try {
            if (i != 0) {
                if (i == 1) {
                    aootVar = (aoot) this.a;
                    aooc.af(obj);
                } else {
                    if (i != 2) {
                        obj2 = this.b;
                        aooc.af(obj);
                        ((aoor) obj2).a = ((java.lang.Number) obj).intValue();
                        return aojh.a;
                    }
                    aoorVar = (aoor) this.a;
                    aooc.af(obj);
                }
                aoorVar.a = ((java.lang.Number) obj).intValue();
                return aojh.a;
            }
            aooc.af(obj);
            aootVar = this.d;
            eei eeiVar = this.e;
            this.a = aootVar;
            this.c = 1;
            obj = eeiVar.g(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            aootVar.a = obj;
            aoorVar = this.f;
            aonn aonnVar = this.g;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(this.h);
            this.a = aoorVar;
            this.c = 2;
            obj = aonnVar.a(boolValueOf, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            aoorVar.a = ((java.lang.Number) obj).intValue();
        } catch (ecp unused) {
            aoor aoorVar2 = this.f;
            eei eeiVar2 = this.e;
            java.lang.Object obj3 = this.d.a;
            this.a = null;
            this.b = aoorVar2;
            this.c = 3;
            java.lang.Object objI = eeiVar2.i(obj3, true, this);
            if (objI == aoluVar) {
                return aoluVar;
            }
            obj2 = aoorVar2;
            obj = objI;
        }
        return aojh.a;
    }
}
