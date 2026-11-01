package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aocn implements defpackage.aocy {
    @Override // defpackage.aodm
    public final void d(defpackage.aodl aodlVar) {
        while (true) {
            java.io.InputStream inputStreamG = aodlVar.g();
            if (inputStreamG == null) {
                return;
            }
            try {
                inputStreamG.close();
            } catch (java.io.IOException e) {
                while (true) {
                    java.io.InputStream inputStreamG2 = aodlVar.g();
                    if (inputStreamG2 == null) {
                        throw new java.lang.RuntimeException(e);
                    }
                    try {
                        inputStreamG2.close();
                    } catch (java.io.IOException e2) {
                        defpackage.aoct.b.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ServerImpl$NoopListener", "messagesAvailable", "Exception closing stream", (java.lang.Throwable) e2);
                    }
                }
            }
        }
    }

    @Override // defpackage.aocy
    public final void b() {
    }

    @Override // defpackage.aodm
    public final void e() {
    }

    @Override // defpackage.aocy
    public final void a(anqw anqwVar) {
    }
}
