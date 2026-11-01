package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anyq implements java.lang.Thread.UncaughtExceptionHandler {
    final /* synthetic */ defpackage.anzg a;

    public anyq(defpackage.anzg anzgVar) {
        j$.util.Objects.requireNonNull(anzgVar);
        this.a = anzgVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        java.util.logging.Logger logger = defpackage.anzg.a;
        java.util.logging.Level level = java.util.logging.Level.SEVERE;
        defpackage.anzg anzgVar = this.a;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + java.lang.String.valueOf(anzgVar.h) + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        try {
            if (anzgVar.v) {
                return;
            }
            anzgVar.v = true;
            try {
                anzgVar.f(true);
                anzgVar.k(false);
            } finally {
                anzgVar.l(new anoe(anoh.a(defpackage.anqw.k.f("Panic! This is a bug!").e(th))));
                anzgVar.K.c(null);
                anzgVar.I.a(4, "PANIC! Entering TRANSIENT_FAILURE");
                anzgVar.p.a(defpackage.anmm.c);
            }
        } catch (java.lang.Throwable th2) {
            defpackage.anzg anzgVar2 = this.a;
            defpackage.anzg.a.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + java.lang.String.valueOf(anzgVar2.h) + "] Uncaught exception while panicking", th2);
        }
    }
}
