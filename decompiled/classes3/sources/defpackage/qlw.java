package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qlw extends amzm {
    private final amzg b;
    private final amzg c;

    public qlw(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qlw.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.Set set = (java.util.Set) list.get(0);
        ajct ajctVar = (ajct) list.get(1);
        aooh.f(set, "safeContentCandidates");
        aooh.f(ajctVar, "lightweightExecutor");
        ahoq ahoqVarW = ahvr.W(617, "StatusBarNotificationProducerModule_produceSafeContents");
        try {
            ajcq ajcqVarB = defpackage.zkb.b(set, ajctVar);
            ahoqVarW.a(ajcqVarB);
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
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
