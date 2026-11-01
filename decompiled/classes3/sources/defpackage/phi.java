package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class phi implements svs {
    private final defpackage.phe a;

    public phi(defpackage.phe pheVar) {
        this.a = pheVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.phj phjVar = (defpackage.phj) obj;
        aooh.f(phjVar, "params");
        android.net.Uri uriA = defpackage.ura.a(phjVar.a);
        if (uriA != null) {
            return uriA;
        }
        android.net.Uri uri = android.net.Uri.EMPTY;
        aooh.e(uri, "EMPTY");
        return uri;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj, aoln aolnVar) {
        defpackage.phj phjVar = (defpackage.phj) obj;
        android.telecom.Call.Details details = phjVar.a;
        ajcq ajcqVar = phjVar.b;
        defpackage.phe.a.b().l("com/android/dialer/incall/cachedphonelookup/MultiStagePhoneLookup", "lookup", 117, "MultiStagePhoneLookup.java").v("enter");
        defpackage.phe pheVar = this.a;
        krv krvVar = new krv((rlv) ((hil) pheVar.l.a).a.fq.a());
        ruc rucVar = pheVar.e;
        rucVar.j(ruc.T);
        ahrv ahrvVarG = ahrv.g(pheVar.c.d(pheVar.b, details, ajcqVar));
        oqe oqeVar = new oqe(pheVar, krvVar, 4);
        ajcu ajcuVar = pheVar.d;
        ajcq ajcqVarH = ahrvVarG.h(oqeVar, ajcuVar);
        ahvr.J(ajcqVarH, new defpackage.pgr(pheVar, 3), ajcuVar);
        zpz zpzVar = pheVar.h;
        zpzVar.a(ajcqVarH);
        rucVar.j(ruc.U);
        ajcq ajcqVarE = ahrv.g(aiql.A(ajcqVarH)).j(100L, java.util.concurrent.TimeUnit.MILLISECONDS, ajcuVar).e(java.util.concurrent.TimeoutException.class, new mjl(krvVar, 19), ajcuVar);
        ahvr.J(ajcqVarE, new defpackage.pgr(pheVar, 4, (byte[]) null), ajcuVar);
        rucVar.j(ruc.S);
        ahrv ahrvVarI = ((java.lang.Boolean) pheVar.g.a()).booleanValue() ? ahrv.g(ajcqVarH).e(java.lang.Exception.class, new onp(15), ajcuVar).i(new juo(pheVar, details, ajcqVar, 16), ajcuVar) : pheVar.i.b(details, ajcqVar);
        ahvr.J(ahrvVarI, new kxp(pheVar, details, 4), ajcuVar);
        zpzVar.a(ahrvVarI);
        ahvr.J(ahvr.ai(new ajcq[]{ahrvVarI, ajcqVarH, ajcqVarE}).o(new onq(4), ajcuVar), new defpackage.pgr(pheVar, krvVar, 5), ajcuVar);
        return new defpackage.phm(ahrvVarI, ajcqVarH, ajcqVarE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aosy aosyVar, defpackage.svr svrVar, aoln aolnVar) {
        defpackage.phh phhVar;
        if (aolnVar instanceof defpackage.phh) {
            phhVar = (defpackage.phh) aolnVar;
            int i = phhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                phhVar.c = i - Integer.MIN_VALUE;
            } else {
                phhVar = new defpackage.phh(this, aolnVar);
            }
        } else {
            phhVar = new defpackage.phh(this, aolnVar);
        }
        java.lang.Object objA = phhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = phhVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            if (svrVar == defpackage.svr.a || svrVar == defpackage.svr.b) {
                phhVar.c = 1;
                objA = aosyVar.a(phhVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objA);
        defpackage.phm phmVar = (defpackage.phm) objA;
        phmVar.b.cancel(false);
        phmVar.a.cancel(false);
        phmVar.c.cancel(false);
        return aojh.a;
    }
}
