package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uij implements defpackage.svs {
    private final defpackage.ucr a;

    public uij(defpackage.ucr ucrVar) {
        this.a = ucrVar;
    }

    @Override // defpackage.svs
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.aooh.f((android.telecom.Call.Details) obj, "params");
        return defpackage.aojh.a;
    }

    @Override // defpackage.svs
    public final /* synthetic */ java.lang.Object c(defpackage.aosy aosyVar, svr svrVar, defpackage.aoln aolnVar) {
        if (svrVar == svr.a || svrVar == svr.b) {
            aosyVar.s(null);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.svs
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object b(android.telecom.Call.Details details, defpackage.aoln aolnVar) throws java.lang.Throwable {
        uii uiiVar;
        if (aolnVar instanceof uii) {
            uiiVar = (uii) aolnVar;
            int i = uiiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uiiVar.c = i - Integer.MIN_VALUE;
            } else {
                uiiVar = new uii(this, aolnVar);
            }
        } else {
            uiiVar = new uii(this, aolnVar);
        }
        java.lang.Object objD = uiiVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = uiiVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarC = this.a.c(details);
            uiiVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarC, uiiVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        defpackage.aooh.e(objD, "await(...)");
        return objD;
    }
}
