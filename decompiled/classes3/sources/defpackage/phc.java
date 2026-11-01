package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class phc extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public phc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.phc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        swa swaVar = (swa) list.get(0);
        android.telecom.Call.Details details = (android.telecom.Call.Details) list.get(1);
        defpackage.pqo pqoVar = (defpackage.pqo) list.get(2);
        aooh.f(swaVar, "phoneLookupCache");
        aooh.f(details, "details");
        aooh.f(pqoVar, "callDirection");
        ahoq ahoqVarW = ahvr.W(485, "producePhoneLookupStages");
        try {
            long creationTimeMillis = details.getCreationTimeMillis();
            ajcq ajcqVar = pqoVar.b;
            aooh.e(ajcqVar, "getDirection(...)");
            ajcq ajcqVarB = swaVar.b(creationTimeMillis, new defpackage.phj(details, ajcqVar));
            ahoqVarW.a(ajcqVarB);
            aooh.e(ajcqVarB, "attachToFuture(...)");
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            return ajcqVarB;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
