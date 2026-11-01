package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class btq extends aomh implements aono {
    java.lang.Object a;
    int b;
    final /* synthetic */ aooq c;
    final /* synthetic */ ars d;
    final /* synthetic */ defpackage.btt e;
    final /* synthetic */ float f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btq(aooq aooqVar, ars arsVar, defpackage.btt bttVar, float f, aoln aolnVar) {
        super(3, aolnVar);
        this.c = aooqVar;
        this.d = arsVar;
        this.e = bttVar;
        this.f = f;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.btq btqVar = new defpackage.btq(this.c, this.d, this.e, this.f, (aoln) obj3);
        btqVar.g = (defpackage.apx) obj;
        return btqVar.b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3 = this.g;
        aolu aoluVar = aolu.a;
        if (this.b != 0) {
            obj2 = this.a;
            aooc.af(obj);
        } else {
            aooc.af(obj);
            defpackage.atk atkVar = new defpackage.atk(this.e, obj3, 2);
            aooq aooqVar = this.c;
            ars arsVar = this.d;
            float f = this.f;
            this.g = null;
            this.a = aooqVar;
            this.b = 1;
            java.lang.Object objA = arsVar.a(atkVar, f, this);
            if (objA == aoluVar) {
                return aoluVar;
            }
            obj = objA;
            obj2 = aooqVar;
        }
        ((aooq) obj2).a = ((java.lang.Number) obj).floatValue();
        return aojh.a;
    }
}
