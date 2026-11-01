package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aql extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ float d;
    final /* synthetic */ aqm e;
    final /* synthetic */ asv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aql(float f, aqm aqmVar, asv asvVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = f;
        this.e = aqmVar;
        this.f = asvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        float f;
        java.lang.Object obj2;
        java.lang.Object obj3;
        aolu aoluVar = aolu.a;
        if (this.c != 0) {
            obj2 = this.b;
            obj3 = this.a;
            try {
                aooc.af(obj);
            } catch (java.util.concurrent.CancellationException unused) {
                ((aooq) obj3).a = ((java.lang.Number) ((air) obj2).b()).floatValue();
            }
            f = ((aooq) obj3).a;
        } else {
            aooc.af(obj);
            float f2 = this.d;
            if (java.lang.Math.abs(f2) > 1.0f) {
                aooq aooqVar = new aooq();
                aooqVar.a = f2;
                aooq aooqVar2 = new aooq();
                air airVarBr = den.br(0.0f, f2);
                try {
                    aqm aqmVar = this.e;
                    kaw kawVar = aqmVar.b;
                    defpackage.aju ajuVar = new defpackage.aju(aooqVar2, this.f, aooqVar, aqmVar, 2, null);
                    this.a = aooqVar;
                    this.b = airVarBr;
                    this.c = 1;
                    if (defpackage.wx.l(airVarBr, kawVar, false, ajuVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    obj3 = aooqVar;
                    f = ((aooq) obj3).a;
                } catch (java.util.concurrent.CancellationException unused2) {
                    obj2 = airVarBr;
                    obj3 = aooqVar;
                    ((aooq) obj3).a = ((java.lang.Number) ((air) obj2).b()).floatValue();
                }
            } else {
                f = this.d;
            }
        }
        return new java.lang.Float(f);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.aql(this.d, this.e, this.f, aolnVar);
    }
}
