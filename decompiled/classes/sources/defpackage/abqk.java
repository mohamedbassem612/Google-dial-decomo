package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abqk implements java.lang.Runnable {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.ahzi b = defpackage.ahvr.bI(new defpackage.tzo(4));
    private static final java.util.logging.Logger c = java.util.logging.Logger.getLogger("ErrorLoggingExecutor");
    private final java.lang.Runnable d;
    private final defpackage.aoin e;

    public abqk(java.lang.Runnable runnable, defpackage.aoin aoinVar) {
        this.d = runnable;
        this.e = aoinVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.run();
        } catch (java.lang.Throwable th) {
            if (((java.lang.Boolean) ((defpackage.ahyn) this.e.a()).d(java.lang.Boolean.FALSE)).booleanValue()) {
                java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                return;
            }
            try {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimz) b.eZ()).c()).k(th)).l("com/google/android/libraries/concurrent/ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", 95, "ExceptionHandlingExecutorFactory.java")).v("Uncaught exception from runnable");
            } catch (java.lang.Throwable th2) {
                java.util.logging.Logger logger = c;
                logger.logp(java.util.logging.Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "GoogleLogger failed to log", th2);
                android.util.Log.e("ErrorLoggingExecutor", "GoogleLogger failed to log", th2);
                logger.logp(java.util.logging.Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "Uncaught exception from runnable", th);
                android.util.Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", th);
            }
        }
    }

    public final java.lang.String toString() {
        return this.d.toString();
    }
}
