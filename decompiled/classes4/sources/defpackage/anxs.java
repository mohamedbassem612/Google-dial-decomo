package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anxs {
    private static final java.util.logging.Logger f = java.util.logging.Logger.getLogger(defpackage.anxs.class.getName());
    public final long a;
    public final ahzh b;
    public java.util.Map c = new java.util.LinkedHashMap();
    public boolean d;
    public anqw e;

    public anxs(long j, ahzh ahzhVar) {
        this.a = j;
        this.b = ahzhVar;
    }

    public static void a(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Throwable th) {
            f.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }

    public static void b(aprf aprfVar, java.util.concurrent.Executor executor) {
        a(executor, new defpackage.anwo(aprfVar, 4));
    }
}
