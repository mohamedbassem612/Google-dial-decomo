package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zlu implements defpackage.znc {
    public boolean a;
    public final zzx b;
    private final aoss c;
    private final ahda d;
    private final apni e;
    private final defpackage.afpl f;

    public zlu(apni apniVar, defpackage.afpl afplVar, aoss aossVar, zzx zzxVar) {
        aooh.f(apniVar, "androidJobs");
        aooh.f(afplVar, "inCallProductionBuilder");
        aooh.f(aossVar, "lightweightScope");
        this.e = apniVar;
        this.f = afplVar;
        this.c = aossVar;
        this.b = zzxVar;
        this.d = new ahda((byte[]) null);
    }

    @Override // defpackage.znc
    public final void a() {
        this.e.i(ahvr.ag(this.c, this.d, new defpackage.xtn(this, (aoln) null, 16)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.zlt zltVar;
        if (aolnVar instanceof defpackage.zlt) {
            zltVar = (defpackage.zlt) aolnVar;
            int i = zltVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zltVar.c = i - Integer.MIN_VALUE;
            } else {
                zltVar = new defpackage.zlt(this, aolnVar);
            }
        } else {
            zltVar = new defpackage.zlt(this, aolnVar);
        }
        java.lang.Object objD = zltVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zltVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return java.lang.Boolean.valueOf(((j$.util.Optional) objD).isPresent());
        }
        aooc.af(objD);
        ajcq ajcqVarX = this.f.X();
        zltVar.c = 1;
        objD = aosv.D(ajcqVarX, zltVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBK = ((defpackage.zls) aooc.ar(objD, defpackage.zls.class)).bK();
        zltVar.c = 2;
        objD = aosv.D(ajcqVarBK, zltVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return java.lang.Boolean.valueOf(((j$.util.Optional) objD).isPresent());
    }
}
