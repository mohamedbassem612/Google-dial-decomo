package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajbp {
    private static final defpackage.ajcp d = new defpackage.ajcp(defpackage.ajbp.class);
    public final defpackage.ahzs a = new defpackage.ahzs();
    public boolean b;
    public defpackage.ajxw c;

    public static void a(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            d.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.ExecutionList", "executeListener", defpackage.a.bK(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (java.lang.Throwable) e);
        }
    }
}
