package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mlw implements znp {
    private static final aimz c = aimz.i("com/android/dialer/disconnectprompt/service/DisconnectPromptCallDisconnectedListener");
    public final pxo a;
    public final qbe b;
    private final aoss d;
    private final afpl e;

    public mlw(afpl afplVar, aoss aossVar, pxo pxoVar, qbe qbeVar) {
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(qbeVar, "inCallLogging");
        this.e = afplVar;
        this.d = aossVar;
        this.a = pxoVar;
        this.b = qbeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.mlv mlvVar;
        if (aolnVar instanceof defpackage.mlv) {
            mlvVar = (defpackage.mlv) aolnVar;
            int i = mlvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mlvVar.c = i - Integer.MIN_VALUE;
            } else {
                mlvVar = new defpackage.mlv(this, aolnVar);
            }
        } else {
            mlvVar = new defpackage.mlv(this, aolnVar);
        }
        java.lang.Object objD = mlvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mlvVar.c;
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
        mlvVar.c = 1;
        objD = aosv.D(ajcqVarX, mlvVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarX2 = ((defpackage.mlu) aooc.ar((defpackage.hkl) objD, defpackage.mlu.class)).X();
        mlvVar.c = 2;
        objD = aosv.D(ajcqVarX2, mlvVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }

    public final ajcq ek() {
        c.b().l("com/android/dialer/disconnectprompt/service/DisconnectPromptCallDisconnectedListener", "onCallDisconnected", 49, "DisconnectPromptCallDisconnectedListener.kt").v("onCallDisconnected");
        return aosv.F(this.d, 0, new defpackage.lve(this, (aoln) null, 12), 3);
    }
}
