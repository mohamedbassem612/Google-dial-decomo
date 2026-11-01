package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zbk extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ zbm d;
    final /* synthetic */ aonj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbk(zbm zbmVar, aonj aonjVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = zbmVar;
        this.e = aonjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [aonj] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        aonj aonjVar;
        apdp apdpVar;
        java.lang.Object obj2;
        ?? r1;
        java.lang.Throwable th;
        java.lang.Object obj3;
        java.lang.Object obj4;
        aolu aoluVar = aolu.a;
        int i = this.c;
        try {
            if (i == 0) {
                aooc.af(obj);
                zbm zbmVar = this.d;
                aonjVar = this.e;
                apdpVar = zbmVar.f;
                this.a = apdpVar;
                this.b = aonjVar;
                this.c = 1;
                if (apdpVar.b(this) == aoluVar) {
                    r1 = aonjVar;
                    obj2 = apdpVar;
                    return aoluVar;
                }
            } else {
                if (i != 1) {
                    obj3 = this.a;
                    try {
                        aooc.af(obj);
                        obj4 = obj3;
                        ((apdp) obj4).d();
                        return aojh.a;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ((apdp) obj3).d();
                        throw th;
                    }
                }
                java.lang.Object obj5 = this.b;
                java.lang.Object obj6 = this.a;
                aooc.af(obj);
                obj2 = obj6;
                r1 = obj5;
            }
            r1 = aonjVar;
            obj2 = apdpVar;
            this.a = obj2;
            this.b = null;
            this.c = 2;
            if (r1.a(this) == aoluVar) {
                return aoluVar;
            }
            obj4 = obj2;
            ((apdp) obj4).d();
            return aojh.a;
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj7 = obj2;
            th = th3;
            obj3 = obj7;
            ((apdp) obj3).d();
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.zbk(this.d, this.e, aolnVar);
    }
}
