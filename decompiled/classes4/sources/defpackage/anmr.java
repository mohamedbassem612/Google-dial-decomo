package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anmr implements java.lang.Runnable {
    final defpackage.anmp a;
    public final defpackage.anmv b;
    private final java.util.concurrent.Executor c;

    public anmr(java.util.concurrent.Executor executor, defpackage.anmp anmpVar, defpackage.anmv anmvVar) {
        this.c = executor;
        this.a = anmpVar;
        this.b = anmvVar;
    }

    final void a() {
        try {
            this.c.execute(this);
        } catch (java.lang.Throwable th) {
            defpackage.anmv.c.logp(java.util.logging.Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
