package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class phl implements svq {
    private final swa a;

    public phl(swa swaVar) {
        aooh.f(swaVar, "phoneLookupCache");
        this.a = swaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(long j, defpackage.svp svpVar, aoln aolnVar) {
        defpackage.phk phkVar;
        if (aolnVar instanceof defpackage.phk) {
            phkVar = (defpackage.phk) aolnVar;
            int i = phkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                phkVar.c = i - Integer.MIN_VALUE;
            } else {
                phkVar = new defpackage.phk(this, aolnVar);
            }
        } else {
            phkVar = new defpackage.phk(this, aolnVar);
        }
        java.lang.Object objC = phkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = phkVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            android.telecom.Call.Details details = svpVar.a;
            if (da$.ExternalSyntheticApiModelOutline0.m(details) == 0 && svpVar.d == null && !defpackage.zcy.b(details.getVideoState()).c()) {
                swa swaVar = this.a;
                aooh.f(svpVar, "details");
                defpackage.phj phjVar = new defpackage.phj(details, svpVar.c);
                phkVar.c = 1;
                objC = swaVar.c(j, phjVar, phkVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objC);
        return aojh.a;
    }

    public final java.lang.Object b(long j, defpackage.svr svrVar, aoln aolnVar) {
        java.lang.Object objF = this.a.f(j, svrVar, aolnVar);
        return objF != aolu.a ? aojh.a : objF;
    }
}
