package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zln implements zog {
    public final zzx a;
    public final defpackage.afpl b;
    private final aoss c;
    private final apni d;
    private final defpackage.afpl e;

    public zln(defpackage.afpl afplVar, defpackage.afpl afplVar2, apni apniVar, aoss aossVar, zzx zzxVar) {
        aooh.f(afplVar, "inCallSharedFeatureModelCache");
        aooh.f(afplVar2, "inCallProductionComponentBuilder");
        aooh.f(apniVar, "androidJobs");
        aooh.f(aossVar, "lightweightScope");
        this.b = afplVar;
        this.e = afplVar2;
        this.d = apniVar;
        this.c = aossVar;
        this.a = zzxVar;
    }

    public final /* synthetic */ int a() {
        return 0;
    }

    public final void b(android.telecom.Call.Details details) {
        aimz aimzVar = zih.a;
        this.d.i(aoov.al(this.c, zih.b.plus(aols.a), 1, new defpackage.uke((aoln) null, this, 15)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.zlm zlmVar;
        if (aolnVar instanceof defpackage.zlm) {
            zlmVar = (defpackage.zlm) aolnVar;
            int i = zlmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zlmVar.c = i - Integer.MIN_VALUE;
            } else {
                zlmVar = new defpackage.zlm(this, aolnVar);
            }
        } else {
            zlmVar = new defpackage.zlm(this, aolnVar);
        }
        java.lang.Object objD = zlmVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zlmVar.c;
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
        ajcq ajcqVarX = this.e.X();
        zlmVar.c = 1;
        objD = aosv.D(ajcqVarX, zlmVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBK = ((defpackage.zll) aooc.ar(objD, defpackage.zll.class)).bK();
        zlmVar.c = 2;
        objD = aosv.D(ajcqVarBK, zlmVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }
}
