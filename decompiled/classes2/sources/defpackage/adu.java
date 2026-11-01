package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class adu extends aomg implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    int d;
    final /* synthetic */ defpackage.adv e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adu(defpackage.adv advVar, aoln aolnVar) {
        super(aolnVar);
        this.e = advVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoqn) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i;
        aoqn aoqnVar = (aoqn) this.f;
        aolu aoluVar = aolu.a;
        if (this.d != 0) {
            i = this.c;
            obj3 = this.b;
            obj2 = this.a;
            aooc.af(obj);
        } else {
            aooc.af(obj);
            ads adsVar = this.e.b;
            obj2 = adsVar.b;
            obj3 = adsVar.c;
            i = adsVar.e;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj3)[i] >> 31;
            java.lang.Object obj4 = ((java.lang.Object[]) obj2)[i];
            this.f = aoqnVar;
            this.a = obj2;
            this.b = obj3;
            i = (int) (j & 2147483647L);
            this.c = i;
            this.d = 1;
            if (aoqnVar.a(obj4, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.adu aduVar = new defpackage.adu(this.e, aolnVar);
        aduVar.f = obj;
        return aduVar;
    }
}
