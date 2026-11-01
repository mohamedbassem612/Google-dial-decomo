package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfr extends amzm {
    private final amzg b;

    public lfr(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.lfr.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        ahoq ahoqVarW = ahvr.W(279, "CallScreenProducerModule_provideIsCallScreenAudioDownloaded");
        try {
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(optional.isPresent());
            ahoqVarW.close();
            return aiql.z(boolValueOf);
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
