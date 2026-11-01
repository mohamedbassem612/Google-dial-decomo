package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agvw extends defpackage.aolj implements kotlinx.coroutines.CoroutineExceptionHandler {
    public static final defpackage.agvw a = new defpackage.agvw();

    private agvw() {
        super(kotlinx.coroutines.CoroutineExceptionHandler.c);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(defpackage.aolr aolrVar, java.lang.Throwable th) {
        defpackage.aooh.f(aolrVar, "context");
        defpackage.aooh.f(th, "exception");
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
        defpackage.aooh.c(uncaughtExceptionHandler);
        uncaughtExceptionHandler.uncaughtException(threadCurrentThread, th);
    }
}
