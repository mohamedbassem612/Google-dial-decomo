package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class iij extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ aosy d;
    final /* synthetic */ aosy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iij(aosy aosyVar, aosy aosyVar2, aoln aolnVar) {
        super(2, aolnVar);
        this.d = aosyVar;
        this.e = aosyVar2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        aosy aosyVar;
        java.lang.Object obj4;
        ?? r3;
        ?? r4;
        aolu aoluVar = aolu.a;
        int i = this.c;
        if (i != 0) {
            java.lang.Object obj5 = this.b;
            if (i != 1) {
                java.lang.Object obj6 = this.a;
                aooc.af(obj);
                obj4 = obj6;
                r4 = obj5;
            } else {
                java.lang.Object obj7 = this.a;
                aooc.af(obj);
                obj2 = obj7;
                r3 = obj5;
            }
            r4.add(obj);
            return obj4;
        }
        aooc.af(obj);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        aosy aosyVar2 = this.d;
        if (aosyVar2 != null) {
            this.a = linkedHashSet;
            this.b = linkedHashSet;
            this.c = 1;
            obj = aosyVar2.a(this);
            if (obj == aoluVar) {
                obj3 = linkedHashSet;
                return aoluVar;
            }
            obj3 = linkedHashSet;
            obj2 = linkedHashSet;
            r3 = linkedHashSet;
        }
        obj3 = linkedHashSet;
        aosyVar = this.e;
        if (aosyVar != null) {
            return obj3;
        }
        this.a = obj3;
        this.b = obj3;
        this.c = 2;
        obj = aosyVar.a(this);
        if (obj != aoluVar) {
            return aoluVar;
        }
        obj4 = obj3;
        r4 = obj3;
        r4.add(obj);
        return obj4;
        r3.add(obj);
        obj3 = obj2;
        obj3 = linkedHashSet;
        aosyVar = this.e;
        if (aosyVar != null) {
            return obj3;
        }
        this.a = obj3;
        this.b = obj3;
        this.c = 2;
        obj = aosyVar.a(this);
        if (obj != aoluVar) {
            return aoluVar;
        }
        obj4 = obj3;
        r4 = obj3;
        r4.add(obj);
        return obj4;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.iij(this.d, this.e, aolnVar);
    }
}
