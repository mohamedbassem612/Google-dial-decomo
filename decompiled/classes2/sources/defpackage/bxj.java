package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bxj {
    private final ajl a;
    private bfx b;
    private bfx c;
    private final aii d = aij.a(1.0f);
    private float e = -1.0f;
    private bfx f;

    public bxj(bfx bfxVar, ajl ajlVar) {
        this.a = ajlVar;
        this.b = bfxVar;
        this.c = bfxVar;
    }

    public final bfx a() {
        float fFloatValue = ((java.lang.Number) this.d.d()).floatValue();
        bfx bfxVar = this.f;
        if (fFloatValue == this.e && bfxVar != null) {
            return bfxVar;
        }
        java.lang.Object objP = sa.p(this.b, this.c, fFloatValue);
        aooh.d(objP, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        this.e = fFloatValue;
        bfx bfxVar2 = (bfx) objP;
        this.f = bfxVar2;
        return bfxVar2;
    }

    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(bfx bfxVar, aoln aolnVar) {
        defpackage.bxi bxiVar;
        float f;
        float fFloatValue;
        float f2;
        if (aolnVar instanceof defpackage.bxi) {
            bxiVar = (defpackage.bxi) aolnVar;
            int i = bxiVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bxiVar.e = i - Integer.MIN_VALUE;
            } else {
                bxiVar = new defpackage.bxi(this, aolnVar);
            }
        } else {
            bxiVar = new defpackage.bxi(this, aolnVar);
        }
        defpackage.bxi bxiVar2 = bxiVar;
        java.lang.Object objL = bxiVar2.c;
        aolu aoluVar = aolu.a;
        int i2 = bxiVar2.e;
        if (i2 != 0) {
            if (i2 == 1) {
                f2 = bxiVar2.b;
                fFloatValue = bxiVar2.a;
                aooc.af(objL);
                aii aiiVar = this.d;
                java.lang.Float f3 = new java.lang.Float(1.0f);
                ajl ajlVar = this.a;
                java.lang.Float f4 = new java.lang.Float(-f2);
                bxiVar2.a = fFloatValue;
                bxiVar2.b = f2;
                bxiVar2.e = 2;
                objL = aii.l(aiiVar, f3, ajlVar, f4, (aonj) null, bxiVar2, 8);
                if (objL == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    f = bxiVar2.a;
                    aooc.af(objL);
                    aii aiiVar2 = this.d;
                    java.lang.Float f5 = new java.lang.Float(1.0f);
                    ajl ajlVar2 = this.a;
                    bxiVar2.a = f;
                    bxiVar2.e = 4;
                    objL = aii.l(aiiVar2, f5, ajlVar2, (java.lang.Object) null, (aonj) null, bxiVar2, 12);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objL);
                }
            } else {
                aooc.af(objL);
            }
        } else {
            aooc.af(objL);
            if (!aooh.n(this.c, bfxVar)) {
                if (aooh.n(bfxVar, this.b)) {
                    this.b = this.c;
                    this.c = bfxVar;
                    this.f = null;
                    aii aiiVar3 = this.d;
                    fFloatValue = ((java.lang.Number) aiiVar3.d()).floatValue();
                    float fFloatValue2 = ((java.lang.Number) aiiVar3.e()).floatValue();
                    java.lang.Float f6 = new java.lang.Float(1.0f - fFloatValue);
                    bxiVar2.a = fFloatValue;
                    bxiVar2.b = fFloatValue2;
                    bxiVar2.e = 1;
                    if (aiiVar3.f(f6, bxiVar2) == aoluVar) {
                        return aoluVar;
                    }
                    f2 = fFloatValue2;
                    aii aiiVar4 = this.d;
                    java.lang.Float f7 = new java.lang.Float(1.0f);
                    ajl ajlVar3 = this.a;
                    java.lang.Float f8 = new java.lang.Float(-f2);
                    bxiVar2.a = fFloatValue;
                    bxiVar2.b = f2;
                    bxiVar2.e = 2;
                    objL = aii.l(aiiVar4, f7, ajlVar3, f8, (aonj) null, bxiVar2, 8);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    aii aiiVar5 = this.d;
                    float fFloatValue3 = ((java.lang.Number) aiiVar5.d()).floatValue();
                    java.lang.Object objP = this.b;
                    bfx bfxVar2 = this.c;
                    if (fFloatValue3 == 1.0f) {
                        objP = bfxVar2;
                    } else if (fFloatValue3 != 0.0f) {
                        objP = sa.p(objP, bfxVar2, fFloatValue3);
                        aooh.d(objP, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
                    }
                    this.b = (bfx) objP;
                    this.c = bfxVar;
                    this.f = null;
                    java.lang.Float f9 = new java.lang.Float(0.0f);
                    bxiVar2.a = fFloatValue3;
                    bxiVar2.e = 3;
                    if (aiiVar5.f(f9, bxiVar2) == aoluVar) {
                        return aoluVar;
                    }
                    f = fFloatValue3;
                    aii aiiVar6 = this.d;
                    java.lang.Float f10 = new java.lang.Float(1.0f);
                    ajl ajlVar4 = this.a;
                    bxiVar2.a = f;
                    bxiVar2.e = 4;
                    objL = aii.l(aiiVar6, f10, ajlVar4, (java.lang.Object) null, (aonj) null, bxiVar2, 12);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                }
            }
        }
        return aojh.a;
    }
}
