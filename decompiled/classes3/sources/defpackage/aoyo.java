package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aoyo extends aomh implements aono {
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ aonp c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoyo(aoln aolnVar, aonp aonpVar) {
        super(3, aolnVar);
        this.c = aonpVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.aoyo aoyoVar = new defpackage.aoyo((aoln) obj3, this.c);
        aoyoVar.d = (aoxi) obj;
        aoyoVar.b = (java.lang.Object[]) obj2;
        return aoyoVar.b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        ?? r1;
        aolu aoluVar = aolu.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                aooc.af(obj);
            } else {
                java.lang.Object obj3 = this.d;
                aooc.af(obj);
                r1 = obj3;
            }
            return aojh.a;
        }
        aooc.af(obj);
        obj2 = this.d;
        java.lang.Object obj4 = this.b;
        aonp aonpVar = this.c;
        java.lang.Object[] objArr = (java.lang.Object[]) obj4;
        java.lang.Object obj5 = objArr[0];
        java.lang.Object obj6 = objArr[1];
        java.lang.Object obj7 = objArr[2];
        this.a = 1;
        obj = aonpVar.a(obj5, obj6, obj7, this);
        if (obj == aoluVar) {
            r1 = obj2;
            return aoluVar;
        }
        r1 = obj2;
        this.d = null;
        this.a = 2;
        if (r1.a(obj, this) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }
}
