package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bxm extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.bxn b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxm(defpackage.bxn bxnVar, float f, int i, aoln aolnVar) {
        super(2, aolnVar);
        this.b = bxnVar;
        this.c = f;
        this.d = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [aonj, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.bxn bxnVar;
        aii aiiVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0 && (aiiVar = (bxnVar = this.b).j) != null) {
            float f = this.c;
            java.lang.Float f2 = new java.lang.Float(f);
            float f3 = f + 1.0f;
            java.lang.Float f4 = new java.lang.Float(f3);
            ?? r5 = aiiVar.g.a;
            aiw aiwVar = (aiw) r5.a(f2);
            if (aiwVar == null) {
                aiwVar = aiiVar.c;
            }
            aiw aiwVar2 = (aiw) r5.a(f4);
            if (aiwVar2 == null) {
                aiwVar2 = aiiVar.d;
            }
            int iB = aiwVar.b();
            for (int i2 = 0; i2 < iB; i2++) {
                if (aiwVar.a(i2) > aiwVar2.a(i2)) {
                    defpackage.akf.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + aiwVar + " is greater than upper bound " + aiwVar2 + " on index " + i2);
                }
            }
            aiiVar.e = aiwVar;
            aiiVar.f = aiwVar2;
            if (!aiiVar.k()) {
                java.lang.Object objB = aiiVar.b(aiiVar.d());
                if (!aooh.n(objB, aiiVar.d())) {
                    aiiVar.b.c(objB);
                }
            }
            java.lang.Float f5 = new java.lang.Float(f3);
            ajr ajrVarBw = den.bw(den.bv(this.d, 0, ajk.d, 2), 1, 0L, 4);
            defpackage.bru bruVar = new defpackage.bru(bxnVar, 13);
            this.a = 1;
            if (aii.l(aiiVar, f5, ajrVarBw, (java.lang.Object) null, bruVar, this, 4) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.bxm(this.b, this.c, this.d, aolnVar);
    }
}
