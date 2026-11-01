package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aur extends aomh implements aonn {
    float a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.auu d;
    final /* synthetic */ float e;
    final /* synthetic */ aonj f;
    final /* synthetic */ asv g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aur(defpackage.auu auuVar, float f, aonj aonjVar, asv asvVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = auuVar;
        this.e = f;
        this.f = aonjVar;
        this.g = asvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        float fCb;
        defpackage.aur aurVar;
        java.lang.Object obj2;
        aolu aoluVar = aolu.a;
        int i = this.c;
        int i2 = 2;
        byte[] bArr = null;
        if (i == 0) {
            aooc.af(obj);
            defpackage.auu auuVar = this.d;
            float f = this.e;
            fCb = den.cb(auuVar.c, f);
            aooq aooqVar = new aooq();
            float fSignum = java.lang.Math.signum(f) * 0.0f;
            aooqVar.a = fSignum;
            aonj aonjVar = this.f;
            aonjVar.a(new java.lang.Float(fSignum));
            asv asvVar = this.g;
            float f2 = aooqVar.a;
            defpackage.aum aumVar = new defpackage.aum(aooqVar, aonjVar, i2, bArr);
            this.b = aooqVar;
            this.a = fCb;
            this.c = 1;
            aurVar = this;
            java.lang.Object objD = auuVar.d(asvVar, f2, f, aumVar, aurVar);
            if (objD != aoluVar) {
                obj2 = aooqVar;
                obj = objD;
            }
            return aoluVar;
        }
        if (i != 1) {
            aooc.af(obj);
            return obj;
        }
        fCb = this.a;
        obj2 = this.b;
        aooc.af(obj);
        aurVar = this;
        defpackage.auu auuVar2 = aurVar.d;
        air airVar = (air) obj;
        float fA = auuVar2.a.a(((java.lang.Number) airVar.b()).floatValue());
        if (java.lang.Float.isNaN(fA)) {
            defpackage.avo.d("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        ((aooq) obj2).a = fA;
        asv asvVar2 = aurVar.g;
        air airVarBs = den.bs(airVar, 0.0f, 0.0f, 30);
        aiq aiqVar = auuVar2.b;
        defpackage.aur aurVar2 = aurVar;
        defpackage.aum aumVar2 = new defpackage.aum(obj2, aurVar.f, 3, bArr);
        aurVar2.b = null;
        aurVar2.a = fCb;
        aurVar2.c = 2;
        java.lang.Object objF = defpackage.rv.f(asvVar2, fA, fA, airVarBs, aiqVar, aumVar2, aurVar2);
        if (objF != aoluVar) {
            return objF;
        }
        return aoluVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.aur(this.d, this.e, this.f, this.g, aolnVar);
    }
}
