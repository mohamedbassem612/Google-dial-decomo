package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mfc implements ahas {
    private final aoss a;
    private final zjm b;

    public mfc(aoss aossVar, zjm zjmVar) {
        aooh.f(aossVar, "lightweightScope");
        this.a = aossVar;
        this.b = zjmVar;
    }

    public final ajcq a(ahau ahauVar) {
        return aosv.F(this.a, 0, new defpackage.inm(ahauVar, this, (aoln) null, 3), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.mfb mfbVar;
        boolean zBooleanValue;
        if (aolnVar instanceof defpackage.mfb) {
            mfbVar = (defpackage.mfb) aolnVar;
            int i = mfbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mfbVar.c = i - Integer.MIN_VALUE;
            } else {
                mfbVar = new defpackage.mfb(this, aolnVar);
            }
        } else {
            mfbVar = new defpackage.mfb(this, aolnVar);
        }
        java.lang.Object objC = mfbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mfbVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            j$.util.Optional optionalG = this.b.g();
            aooh.e(optionalG, "getFeature(...)");
            met metVar = (met) aooh.q(optionalG);
            if (metVar != null) {
                mfbVar.c = 1;
                objC = metVar.c(mfbVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
            } else {
                zBooleanValue = false;
            }
            return java.lang.Boolean.valueOf(zBooleanValue);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objC);
        zBooleanValue = ((java.lang.Boolean) objC).booleanValue();
        return java.lang.Boolean.valueOf(zBooleanValue);
    }
}
