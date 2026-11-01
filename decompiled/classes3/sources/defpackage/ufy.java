package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ufy implements jqh {
    private final defpackage.afpl a;

    public ufy(defpackage.afpl afplVar) {
        aooh.f(afplVar, "inCallProductionBuilder");
        this.a = afplVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aixo aixoVar, aoln aolnVar) {
        defpackage.ufw ufwVar;
        defpackage.uzx uzxVarY;
        defpackage.uzx uzxVar;
        uio uioVarK;
        java.lang.Boolean bool;
        if (aolnVar instanceof defpackage.ufw) {
            ufwVar = (defpackage.ufw) aolnVar;
            int i = ufwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufwVar.c = i - Integer.MIN_VALUE;
            } else {
                ufwVar = new defpackage.ufw(this, aolnVar);
            }
        } else {
            ufwVar = new defpackage.ufw(this, aolnVar);
        }
        java.lang.Object objB = ufwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ufwVar.c;
        if (i2 == 0) {
            aooc.af(objB);
            uzxVarY = airh.y(aixoVar.p());
            ufwVar.d = uzxVarY;
            ufwVar.e = uzxVarY;
            ufwVar.c = 1;
            objB = b(ufwVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            uzxVar = uzxVarY;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uzxVar = ufwVar.e;
            uzxVarY = ufwVar.d;
            aooc.af(objB);
        }
        uip uipVar = (uip) objB;
        boolean zBooleanValue = false;
        if (uipVar != null && (uioVarK = uipVar.k()) != null && (bool = uioVarK.g) != null) {
            zBooleanValue = bool.booleanValue();
        }
        uzxVar.ai(zBooleanValue);
        return uzxVarY.ah();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.ufx ufxVar;
        if (aolnVar instanceof defpackage.ufx) {
            ufxVar = (defpackage.ufx) aolnVar;
            int i = ufxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufxVar.c = i - Integer.MIN_VALUE;
            } else {
                ufxVar = new defpackage.ufx(this, aolnVar);
            }
        } else {
            ufxVar = new defpackage.ufx(this, aolnVar);
        }
        java.lang.Object objD = ufxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ufxVar.c;
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
        ajcq ajcqVarX = this.a.X();
        ufxVar.c = 1;
        objD = aosv.D(ajcqVarX, ufxVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBG = ((defpackage.ufv) aooc.ar(objD, defpackage.ufv.class)).bG();
        ufxVar.c = 2;
        objD = aosv.D(ajcqVarBG, ufxVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }
}
