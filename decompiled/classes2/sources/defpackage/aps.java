package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aps extends aomh implements aono {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.apt c;
    final /* synthetic */ aooq d;
    final /* synthetic */ float e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aps(defpackage.apt aptVar, aooq aooqVar, float f, aoln aolnVar) {
        super(3, aolnVar);
        this.c = aptVar;
        this.d = aooqVar;
        this.e = f;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.aps apsVar = new defpackage.aps(this.c, this.d, this.e, (aoln) obj3);
        apsVar.f = (defpackage.apx) obj;
        return apsVar.b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3 = this.f;
        aolu aoluVar = aolu.a;
        if (this.b != 0) {
            obj2 = this.a;
            aooc.af(obj);
        } else {
            aooc.af(obj);
            defpackage.apt aptVar = this.c;
            defpackage.atk atkVar = new defpackage.atk(aptVar, (defpackage.apx) obj3, 1);
            ars arsVar = aptVar.c;
            if (arsVar == null) {
                aooh.j("resolvedFlingBehavior");
                arsVar = null;
            }
            aooq aooqVar = this.d;
            float f = this.e;
            this.f = null;
            this.a = aooqVar;
            this.b = 1;
            obj = arsVar.a(atkVar, f, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            obj2 = aooqVar;
        }
        ((aooq) obj2).a = ((java.lang.Number) obj).floatValue();
        return aojh.a;
    }
}
