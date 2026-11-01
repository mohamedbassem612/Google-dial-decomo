package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nzt {
    public static final aimz a = aimz.i("com/android/dialer/emergencycalling/calllocation/service/EmergencyCallLocationListener");
    public final android.content.Context b;
    public final aoin c;
    public final oac d;
    public final aoss e;
    public final defpackage.mba f;
    public final zog g;
    public final java.util.concurrent.atomic.AtomicReference h;
    public final java.util.concurrent.atomic.AtomicReference i;
    public final java.util.concurrent.atomic.AtomicReference j;
    public final defpackage.ope k;
    public final zpz l;
    public final qbe m;
    private final afpl n;

    public nzt(android.content.Context context, defpackage.ope opeVar, zpz zpzVar, aoin aoinVar, oac oacVar, aoss aossVar, afpl afplVar, qbe qbeVar, defpackage.mba mbaVar) {
        aooh.f(context, "appContext");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aoinVar, "batteryThreshold");
        aooh.f(oacVar, "emergencyLocationUpdater");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(qbeVar, "inCallLogging");
        this.b = context;
        this.k = opeVar;
        this.l = zpzVar;
        this.c = aoinVar;
        this.d = oacVar;
        this.e = aossVar;
        this.n = afplVar;
        this.m = qbeVar;
        this.f = mbaVar;
        this.g = new defpackage.les(this, 3);
        this.h = new java.util.concurrent.atomic.AtomicReference(null);
        this.i = new java.util.concurrent.atomic.AtomicReference(null);
        this.j = new java.util.concurrent.atomic.AtomicReference(defpackage.jxr.LOCATION_FAILURE_NONE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.nzs nzsVar;
        if (aolnVar instanceof defpackage.nzs) {
            nzsVar = (defpackage.nzs) aolnVar;
            int i = nzsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nzsVar.c = i - Integer.MIN_VALUE;
            } else {
                nzsVar = new defpackage.nzs(this, aolnVar);
            }
        } else {
            nzsVar = new defpackage.nzs(this, aolnVar);
        }
        java.lang.Object objD = nzsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nzsVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return ((j$.util.Optional) objD).orElse((java.lang.Object) null);
        }
        aooc.af(objD);
        ajcq ajcqVarX = this.n.X();
        nzsVar.c = 1;
        objD = aosv.D(ajcqVarX, nzsVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarAd = ((defpackage.nzr) aooc.ar(objD, defpackage.nzr.class)).ad();
        nzsVar.c = 2;
        objD = aosv.D(ajcqVarAd, nzsVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return ((j$.util.Optional) objD).orElse((java.lang.Object) null);
    }
}
