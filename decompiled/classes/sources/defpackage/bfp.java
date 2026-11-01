package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bfp extends defpackage.cmv implements defpackage.dhd, defpackage.dbb {
    public final defpackage.aqi a;
    private boolean b;

    public bfp(defpackage.aqi aqiVar) {
        this.a = aqiVar;
    }

    public static final defpackage.cpn b(defpackage.bfp bfpVar, defpackage.cxi cxiVar, defpackage.aomy aomyVar) {
        java.lang.Object objA;
        if (!bfpVar.D || !bfpVar.b) {
            return null;
        }
        defpackage.cxi cxiVarY = defpackage.cfo.y(bfpVar);
        if (true != cxiVar.u()) {
            cxiVar = null;
        }
        if (cxiVar == null || (objA = aomyVar.a()) == null) {
            return null;
        }
        return ((defpackage.cpn) objA).g(cxiVarY.q(cxiVar, false).d());
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.dhd
    public final java.lang.Object d(defpackage.cxi cxiVar, defpackage.aomy aomyVar, defpackage.aoln aolnVar) {
        bfn bfnVar;
        if (aolnVar instanceof bfn) {
            bfnVar = (bfn) aolnVar;
            int i = bfnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bfnVar.c = i - Integer.MIN_VALUE;
            } else {
                bfnVar = new bfn(this, aolnVar);
            }
        } else {
            bfnVar = new bfn(this, aolnVar);
        }
        java.lang.Object obj = bfnVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = bfnVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ito itoVar = new ito(this, cxiVar, aomyVar, new af(this, cxiVar, aomyVar, 3), (defpackage.aoln) null, 1);
            bfnVar.c = 1;
            if (defpackage.aosv.m(itoVar, bfnVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.dbb
    public final void g(defpackage.cxi cxiVar) {
        this.b = true;
    }

    @Override // defpackage.dbz
    public final /* synthetic */ void h(long j) {
    }
}
