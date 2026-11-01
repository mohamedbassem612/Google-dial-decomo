package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ocy {
    public static final aimz a = aimz.i("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteSOSEndCallButtonBehavior");
    public final defpackage.ocq b;
    public final defpackage.oci c;
    public final aoss d;
    public final defpackage.mba e;
    public final pqm f;
    private final afpl g;

    public ocy(pqm pqmVar, defpackage.ocq ocqVar, defpackage.oci ociVar, aoss aossVar, afpl afplVar, defpackage.mba mbaVar) {
        aooh.f(pqmVar, "callController");
        aooh.f(ocqVar, "displayEmergencyMessageEventListener");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        this.f = pqmVar;
        this.b = ocqVar;
        this.c = ociVar;
        this.d = aossVar;
        this.g = afplVar;
        this.e = mbaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ocx ocxVar;
        if (aolnVar instanceof defpackage.ocx) {
            ocxVar = (defpackage.ocx) aolnVar;
            int i = ocxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ocxVar.c = i - Integer.MIN_VALUE;
            } else {
                ocxVar = new defpackage.ocx(this, aolnVar);
            }
        } else {
            ocxVar = new defpackage.ocx(this, aolnVar);
        }
        java.lang.Object objD = ocxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ocxVar.c;
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
        ajcq ajcqVarX = this.g.X();
        ocxVar.c = 1;
        objD = aosv.D(ajcqVarX, ocxVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBl = ((defpackage.ocw) aooc.ar(objD, defpackage.ocw.class)).bl();
        ocxVar.c = 2;
        objD = aosv.D(ajcqVarBl, ocxVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }
}
