package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qgg extends amzm {
    private final amzg b;

    public qgg(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qgg.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.qgd qgdVar = (defpackage.qgd) obj;
        ahoq ahoqVarW = ahvr.W(604, "RttProducerModule_produceRttConfiguration");
        try {
            ajcq ajcqVarD = qgdVar.h.d(new defpackage.qfe(qgdVar, 4), qgdVar.d);
            ahoqVarW.a(ajcqVarD);
            ahoqVarW.close();
            return ajcqVarD;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
