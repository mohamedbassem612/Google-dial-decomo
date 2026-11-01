package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mdd implements znp {
    public final java.lang.String a;
    public final gpd b;
    private final aoss c;
    private final afpl d;

    public mdd(gpd gpdVar, java.lang.String str, aoss aossVar, afpl afplVar) {
        aooh.f(gpdVar, "loggerFactory");
        aooh.f(str, "callId");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        this.b = gpdVar;
        this.a = str;
        this.c = aossVar;
        this.d = afplVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.mdc mdcVar;
        if (aolnVar instanceof defpackage.mdc) {
            mdcVar = (defpackage.mdc) aolnVar;
            int i = mdcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdcVar.c = i - Integer.MIN_VALUE;
            } else {
                mdcVar = new defpackage.mdc(this, aolnVar);
            }
        } else {
            mdcVar = new defpackage.mdc(this, aolnVar);
        }
        java.lang.Object objD = mdcVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mdcVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aooh.q((j$.util.Optional) objD);
        }
        aooc.af(objD);
        ajcq ajcqVarX = this.d.X();
        mdcVar.c = 1;
        objD = aosv.D(ajcqVarX, mdcVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.mdb.class);
        aooh.e(objAr, "get(...)");
        ajcq ajcqVarW = ((defpackage.mdb) objAr).W();
        mdcVar.c = 2;
        objD = aosv.D(ajcqVarW, mdcVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }

    public final ajcq ek() {
        return aosv.F(this.c, 0, new defpackage.lve(this, (aoln) null, 5), 3);
    }
}
