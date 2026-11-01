package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abha extends aomh implements aonp {
    int a;
    /* synthetic */ java.lang.Object b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ apy d;
    final /* synthetic */ aiq e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abha(apy apyVar, aiq aiqVar, aoln aolnVar) {
        super(4, aolnVar);
        this.d = apyVar;
        this.e = aiqVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        defpackage.abha abhaVar = new defpackage.abha(this.d, this.e, (aoln) obj4);
        abhaVar.f = (apx) obj;
        abhaVar.b = (aqj) obj2;
        abhaVar.c = obj3;
        return abhaVar.b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objC;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            java.lang.Object obj2 = this.f;
            java.lang.Object obj3 = this.b;
            java.lang.Object obj4 = this.c;
            apy apyVar = this.d;
            aiq aiqVar = this.e;
            float fB = apyVar.b();
            this.f = null;
            this.b = null;
            this.a = 1;
            float fC = ((aqj) obj3).c(obj4);
            defpackage.aooq aooqVar = new defpackage.aooq();
            aooqVar.a = java.lang.Float.isNaN(apyVar.c()) ? 0.0f : apyVar.c();
            if (java.lang.Float.isNaN(fC)) {
                objC = aojh.a;
            } else {
                float f = aooqVar.a;
                if (f == fC || (objC = wx.c(f, fC, fB, aiqVar, new defpackage.zjn(obj2, aooqVar, 5, null), this)) != aoluVar) {
                    objC = aojh.a;
                }
            }
            if (objC == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
