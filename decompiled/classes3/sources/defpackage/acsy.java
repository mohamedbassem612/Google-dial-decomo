package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acsy {
    public bfx a;
    public bfx b;
    public final aii c;
    public float d;
    public bfx e;
    private final ajl f;

    public acsy(bfx bfxVar, ajl ajlVar) {
        aooh.f(bfxVar, "initialShape");
        this.f = ajlVar;
        this.a = bfxVar;
        this.b = bfxVar;
        this.c = aij.a(1.0f);
        this.d = -1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(bfx bfxVar, aoln aolnVar) {
        defpackage.acsx acsxVar;
        float f;
        if (aolnVar instanceof defpackage.acsx) {
            acsxVar = (defpackage.acsx) aolnVar;
            int i = acsxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                acsxVar.d = i - Integer.MIN_VALUE;
            } else {
                acsxVar = new defpackage.acsx(this, aolnVar);
            }
        } else {
            acsxVar = new defpackage.acsx(this, aolnVar);
        }
        defpackage.acsx acsxVar2 = acsxVar;
        java.lang.Object objL = acsxVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = acsxVar2.d;
        if (i2 != 0) {
            if (i2 == 1) {
                f = acsxVar2.a;
                aooc.af(objL);
                aii aiiVar = this.c;
                java.lang.Float f2 = new java.lang.Float(1.0f);
                ajl ajlVar = this.f;
                java.lang.Float f3 = new java.lang.Float(-f);
                acsxVar2.d = 2;
                objL = aii.l(aiiVar, f2, ajlVar, f3, (aonj) null, acsxVar2, 8);
                if (objL == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    aooc.af(objL);
                    aii aiiVar2 = this.c;
                    java.lang.Float f4 = new java.lang.Float(1.0f);
                    ajl ajlVar2 = this.f;
                    acsxVar2.d = 4;
                    objL = aii.l(aiiVar2, f4, ajlVar2, (java.lang.Object) null, (aonj) null, acsxVar2, 12);
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
            if (!aooh.n(this.b, bfxVar)) {
                if (aooh.n(bfxVar, this.a)) {
                    this.a = this.b;
                    this.b = bfxVar;
                    this.e = null;
                    aii aiiVar3 = this.c;
                    float fFloatValue = ((java.lang.Number) aiiVar3.d()).floatValue();
                    float fFloatValue2 = ((java.lang.Number) aiiVar3.e()).floatValue();
                    java.lang.Float f5 = new java.lang.Float(1.0f - fFloatValue);
                    acsxVar2.a = fFloatValue2;
                    acsxVar2.d = 1;
                    if (aiiVar3.f(f5, acsxVar2) == aoluVar) {
                        return aoluVar;
                    }
                    f = fFloatValue2;
                    aii aiiVar4 = this.c;
                    java.lang.Float f6 = new java.lang.Float(1.0f);
                    ajl ajlVar3 = this.f;
                    java.lang.Float f7 = new java.lang.Float(-f);
                    acsxVar2.d = 2;
                    objL = aii.l(aiiVar4, f6, ajlVar3, f7, (aonj) null, acsxVar2, 8);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    aii aiiVar5 = this.c;
                    float fFloatValue3 = ((java.lang.Number) aiiVar5.d()).floatValue();
                    java.lang.Object objP = this.a;
                    bfx bfxVar2 = this.b;
                    if (fFloatValue3 == 1.0f) {
                        objP = bfxVar2;
                    } else if (fFloatValue3 != 0.0f) {
                        objP = sa.p(objP, bfxVar2, fFloatValue3);
                        aooh.d(objP, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
                    }
                    this.a = (bfx) objP;
                    this.b = bfxVar;
                    this.e = null;
                    java.lang.Float f8 = new java.lang.Float(0.0f);
                    acsxVar2.d = 3;
                    if (aiiVar5.f(f8, acsxVar2) == aoluVar) {
                        return aoluVar;
                    }
                    aii aiiVar6 = this.c;
                    java.lang.Float f9 = new java.lang.Float(1.0f);
                    ajl ajlVar4 = this.f;
                    acsxVar2.d = 4;
                    objL = aii.l(aiiVar6, f9, ajlVar4, (java.lang.Object) null, (aonj) null, acsxVar2, 12);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                }
            }
        }
        return aojh.a;
    }
}
