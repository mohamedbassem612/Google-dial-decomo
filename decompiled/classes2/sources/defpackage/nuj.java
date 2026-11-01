package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nuj implements zkd {
    public final defpackage.nvc a;
    private final aoss b;
    private final aoin c;
    private final apni d;
    private final afpl e;

    public nuj(aoss aossVar, apni apniVar, defpackage.nvc nvcVar, afpl afplVar, aoin aoinVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(apniVar, "androidJobs");
        aooh.f(nvcVar, "bamLifecycleStateSyncEventListener");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(aoinVar, "useCoroutinesLaunch");
        this.b = aossVar;
        this.d = apniVar;
        this.a = nvcVar;
        this.e = afplVar;
        this.c = aoinVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.nui nuiVar;
        if (aolnVar instanceof defpackage.nui) {
            nuiVar = (defpackage.nui) aolnVar;
            int i = nuiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nuiVar.c = i - Integer.MIN_VALUE;
            } else {
                nuiVar = new defpackage.nui(this, aolnVar);
            }
        } else {
            nuiVar = new defpackage.nui(this, aolnVar);
        }
        java.lang.Object objD = nuiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nuiVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.e.X();
            nuiVar.c = 1;
            objD = aosv.D(ajcqVarX, nuiVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        aooc.af(objD);
        ajcq ajcqVarAa = ((defpackage.nug) aooc.ar(objD, defpackage.nug.class)).aa();
        nuiVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarAa, nuiVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    public final void b() {
        aoub aoubVarAl;
        nto ntoVar = new nto(this, (aoln) null, 4);
        boolean zBooleanValue = ((java.lang.Boolean) this.c.a()).booleanValue();
        aoss aossVar = this.b;
        if (zBooleanValue) {
            aoubVarAl = aoov.an(aossVar, (aolr) null, 0, new defpackage.nuh((aonn) ntoVar, (aoln) null, 2, (byte[]) null), 3);
        } else {
            aimz aimzVar = zih.a;
            aoubVarAl = aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.nuh((aoln) null, (aonn) ntoVar, 0));
        }
        this.d.i(aoubVarAl);
    }
}
