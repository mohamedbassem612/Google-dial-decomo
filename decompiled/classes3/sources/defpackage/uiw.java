package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uiw {
    public static final aimz a = aimz.i("com/android/dialer/spam/status/incall/impl/service/SpamStatusInCallUpdater");
    public final aoss b;
    private final uhs c;
    private final defpackage.vaa d;
    private final defpackage.afpl e;

    public uiw(aoss aossVar, uhs uhsVar, defpackage.vaa vaaVar, defpackage.afpl afplVar) {
        aooh.f(aossVar, "backgroundScope");
        aooh.f(uhsVar, "spamSettings");
        aooh.f(afplVar, "inCallProductionBuilder");
        this.b = aossVar;
        this.c = uhsVar;
        this.d = vaaVar;
        this.e = afplVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.uit uitVar;
        defpackage.vaa vaaVar;
        if (aolnVar instanceof defpackage.uit) {
            uitVar = (defpackage.uit) aolnVar;
            int i = uitVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uitVar.c = i - Integer.MIN_VALUE;
            } else {
                uitVar = new defpackage.uit(this, aolnVar);
            }
        } else {
            uitVar = new defpackage.uit(this, aolnVar);
        }
        java.lang.Object objD = uitVar.a;
        aolu aoluVar = aolu.a;
        int i2 = uitVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else if (i2 == 2) {
                vaaVar = uitVar.d;
                aooc.af(objD);
                uitVar.d = null;
                uitVar.c = 3;
                objD = ((ajml) vaaVar.a).b((android.telecom.Call.Details) objD, uitVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aojh.a;
        }
        aooc.af(objD);
        ajcq ajcqVarC = this.c.c();
        aooh.e(ajcqVarC, "isSpamEnabled(...)");
        uitVar.c = 1;
        objD = aosv.D(ajcqVarC, uitVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) objD).booleanValue()) {
            a.b().l("com/android/dialer/spam/status/incall/impl/service/SpamStatusInCallUpdater", "checkSpamStatus", 69, "SpamStatusInCallUpdater.kt").v("Spam disabled");
            return aojh.a;
        }
        defpackage.vaa vaaVar2 = this.d;
        uitVar.d = vaaVar2;
        uitVar.c = 2;
        java.lang.Object objB = b(uitVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        objD = objB;
        vaaVar = vaaVar2;
        uitVar.d = null;
        uitVar.c = 3;
        objD = ((ajml) vaaVar.a).b((android.telecom.Call.Details) objD, uitVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.uiu uiuVar;
        if (aolnVar instanceof defpackage.uiu) {
            uiuVar = (defpackage.uiu) aolnVar;
            int i = uiuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uiuVar.c = i - Integer.MIN_VALUE;
            } else {
                uiuVar = new defpackage.uiu(this, aolnVar);
            }
        } else {
            uiuVar = new defpackage.uiu(this, aolnVar);
        }
        java.lang.Object objC = uiuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = uiuVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            uiuVar.c = 1;
            objC = c(uiuVar);
            if (objC != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
            return objC;
        }
        aooc.af(objC);
        ajcq ajcqVarQ = ((defpackage.uis) objC).q();
        uiuVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarQ, uiuVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.uiv uivVar;
        if (aolnVar instanceof defpackage.uiv) {
            uivVar = (defpackage.uiv) aolnVar;
            int i = uivVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uivVar.c = i - Integer.MIN_VALUE;
            } else {
                uivVar = new defpackage.uiv(this, aolnVar);
            }
        } else {
            uivVar = new defpackage.uiv(this, aolnVar);
        }
        java.lang.Object objD = uivVar.a;
        aolu aoluVar = aolu.a;
        int i2 = uivVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.e.X();
            uivVar.c = 1;
            objD = aosv.D(ajcqVarX, uivVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.uis.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }
}
