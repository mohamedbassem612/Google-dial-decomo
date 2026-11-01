package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iru implements oul {
    public final iqm a;
    public final defpackage.iwy b;
    public final defpackage.jfc c;
    public final java.lang.String d;
    public final defpackage.mba e;
    public final zij f;
    public final defpackage.iqp g;
    public final defpackage.jif h;
    public final pqm i;
    public final qbe j;
    private final aoss k;
    private final afpl l;

    public iru(iqm iqmVar, defpackage.iwy iwyVar, defpackage.jfc jfcVar, afpl afplVar, aoss aossVar, java.lang.String str, pqm pqmVar, qbe qbeVar, defpackage.mba mbaVar, zij zijVar, defpackage.iqp iqpVar, defpackage.jif jifVar) {
        aooh.f(jfcVar, "beeslyLifecycleControllerV2");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(str, "callId");
        aooh.f(pqmVar, "callController");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(jifVar, "beeslyCallEventClearcutLogger");
        this.a = iqmVar;
        this.b = iwyVar;
        this.c = jfcVar;
        this.l = afplVar;
        this.k = aossVar;
        this.d = str;
        this.i = pqmVar;
        this.j = qbeVar;
        this.e = mbaVar;
        this.f = zijVar;
        this.g = iqpVar;
        this.h = jifVar;
    }

    public final ajcq a() {
        return aosv.F(this.k, 0, new icp(this, (aoln) null, 8), 3);
    }

    public final ajcq b() {
        return aosv.F(this.k, 0, new icp(this, (aoln) null, 9, (byte[]) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.irt irtVar;
        if (aolnVar instanceof defpackage.irt) {
            irtVar = (defpackage.irt) aolnVar;
            int i = irtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                irtVar.c = i - Integer.MIN_VALUE;
            } else {
                irtVar = new defpackage.irt(this, aolnVar);
            }
        } else {
            irtVar = new defpackage.irt(this, aolnVar);
        }
        java.lang.Object objD = irtVar.a;
        aolu aoluVar = aolu.a;
        int i2 = irtVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.l.X();
            irtVar.c = 1;
            objD = aosv.D(ajcqVarX, irtVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.irs.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }
}
