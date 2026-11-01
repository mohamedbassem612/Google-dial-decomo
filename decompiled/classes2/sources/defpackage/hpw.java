package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hpw implements znp {
    public static final aimz a = aimz.i("com/android/dialer/androidauto/impl/incall/listener/CarCallDisconnectedListener");
    public final ipc b;
    private final aoss c;
    private final ipc d;
    private final afpl e;

    public hpw(aoss aossVar, afpl afplVar, ipc ipcVar, ipc ipcVar2) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(afplVar, "inCallProductionBuilder");
        aooh.f(ipcVar, "carCallErrorMessageFlow");
        aooh.f(ipcVar2, "carAccountSelectorDataFlow");
        this.c = aossVar;
        this.e = afplVar;
        this.d = ipcVar;
        this.b = ipcVar2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [aoyq, java.lang.Object] */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.hpv hpvVar;
        java.lang.String str;
        ?? r6;
        if (aolnVar instanceof defpackage.hpv) {
            hpvVar = (defpackage.hpv) aolnVar;
            int i = hpvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hpvVar.c = i - Integer.MIN_VALUE;
            } else {
                hpvVar = new defpackage.hpv(this, aolnVar);
            }
        } else {
            hpvVar = new defpackage.hpv(this, aolnVar);
        }
        java.lang.Object objD = hpvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hpvVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else if (i2 == 2) {
                aooc.af(objD);
                str = (java.lang.String) aooh.q((j$.util.Optional) objD);
                if (str != null) {
                    r6 = this.d.a;
                    hpvVar.c = 3;
                    if (r6.a(str, hpvVar) == aoluVar) {
                        return aoluVar;
                    }
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
        ajcq ajcqVarX = this.e.X();
        hpvVar.c = 1;
        objD = aosv.D(ajcqVarX, hpvVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBN = ((defpackage.hpu) aooc.ar(objD, defpackage.hpu.class)).bN();
        hpvVar.c = 2;
        objD = aosv.D(ajcqVarBN, hpvVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        str = (java.lang.String) aooh.q((j$.util.Optional) objD);
        if (str != null) {
            r6 = this.d.a;
            hpvVar.c = 3;
            if (r6.a(str, hpvVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final ajcq ek() {
        return aosv.F(this.c, 0, new defpackage.hnt(this, (aoln) null, 5), 3);
    }
}
