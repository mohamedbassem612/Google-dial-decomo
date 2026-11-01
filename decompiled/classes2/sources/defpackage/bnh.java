package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bnh implements ars {
    final /* synthetic */ dgk a;
    final /* synthetic */ defpackage.btt b;
    final /* synthetic */ dpf c;
    final /* synthetic */ defpackage.atw d;
    final /* synthetic */ aomy e;

    public bnh(dgk dgkVar, defpackage.btt bttVar, dpf dpfVar, defpackage.atw atwVar, aomy aomyVar) {
        this.a = dgkVar;
        this.b = bttVar;
        this.c = dpfVar;
        this.d = atwVar;
        this.e = aomyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(asv asvVar, float f, aoln aolnVar) {
        defpackage.bng bngVar;
        if (aolnVar instanceof defpackage.bng) {
            bngVar = (defpackage.bng) aolnVar;
            int i = bngVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bngVar.c = i - Integer.MIN_VALUE;
            } else {
                bngVar = new defpackage.bng(this, aolnVar);
            }
        } else {
            bngVar = new defpackage.bng(this, aolnVar);
        }
        java.lang.Object objA = bngVar.a;
        aolu aoluVar = aolu.a;
        int i2 = bngVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objA);
                float fA = this.a.a();
                aooq aooqVar = new aooq();
                float fS = aooc.s(f, -fA, fA);
                aooqVar.a = fS;
                if (fS > 0.0f) {
                    defpackage.btt bttVar = this.b;
                    defpackage.aqj aqjVarP = bttVar.d.p();
                    defpackage.btu btuVar = defpackage.btu.a;
                    if (aqjVarP.g(btuVar)) {
                        float fMax = java.lang.Math.max(0.0f, bttVar.d.p().c(btuVar) - bttVar.b());
                        dpf dpfVar = this.c;
                        float fDl = dpfVar.dl(125.0f);
                        if (fMax < fDl) {
                            float f2 = fMax / fDl;
                            aooqVar.a *= f2 * f2;
                            float fDl2 = dpfVar.dl(125.0f);
                            if (f >= fDl2) {
                                aooqVar.a = java.lang.Math.max(aooqVar.a, fDl2);
                            }
                        }
                    }
                }
                defpackage.atw atwVar = this.d;
                float f3 = aooqVar.a;
                bngVar.c = 1;
                objA = atwVar.a(asvVar, f3, bngVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            float fFloatValue = ((java.lang.Number) objA).floatValue();
            if (!this.b.m()) {
                this.e.a();
            }
            return new java.lang.Float(fFloatValue);
        } catch (java.lang.Throwable th) {
            if (!this.b.m()) {
                this.e.a();
            }
            throw th;
        }
    }
}
