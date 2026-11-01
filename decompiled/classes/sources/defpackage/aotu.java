package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aotu extends defpackage.aott implements defpackage.aota {
    private final java.util.concurrent.Executor a;

    public aotu(java.util.concurrent.Executor executor) {
        java.lang.reflect.Method method;
        this.a = executor;
        java.lang.reflect.Method method2 = defpackage.apbg.a;
        try {
            java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof java.util.concurrent.ScheduledThreadPoolExecutor ? (java.util.concurrent.ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = defpackage.apbg.a) == null) {
                return;
            }
            method.invoke(scheduledThreadPoolExecutor, java.lang.Boolean.TRUE);
        } catch (java.lang.Throwable unused) {
        }
    }

    private static final void j(defpackage.aolr aolrVar, java.util.concurrent.RejectedExecutionException rejectedExecutionException) {
        defpackage.aooc.W(aolrVar, defpackage.aodc.l("The task was rejected", rejectedExecutionException));
    }

    private static final java.util.concurrent.ScheduledFuture k(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.lang.Runnable runnable, defpackage.aolr aolrVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            j(aolrVar, e);
            return null;
        }
    }

    @Override // defpackage.aosp
    public final void a(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            j(aolrVar, e);
            defpackage.aosp aospVar = defpackage.aoth.a;
            defpackage.apcz.a.a(aolrVar, runnable);
        }
    }

    @Override // defpackage.aota
    public final defpackage.aotj c(long j, java.lang.Runnable runnable, defpackage.aolr aolrVar) {
        java.util.concurrent.Executor executor = this.a;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executor instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executor : null;
        java.util.concurrent.ScheduledFuture scheduledFutureK = scheduledExecutorService != null ? k(scheduledExecutorService, runnable, aolrVar, j) : null;
        return scheduledFutureK != null ? new defpackage.aoti(scheduledFutureK) : defpackage.aosw.a.u(j, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.Executor executor = this.a;
        java.util.concurrent.ExecutorService executorService = executor instanceof java.util.concurrent.ExecutorService ? (java.util.concurrent.ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.aota
    public final void d(long j, defpackage.aosb aosbVar) {
        java.util.concurrent.Executor executor = this.a;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = executor instanceof java.util.concurrent.ScheduledExecutorService ? (java.util.concurrent.ScheduledExecutorService) executor : null;
        java.util.concurrent.ScheduledFuture scheduledFutureK = scheduledExecutorService != null ? k(scheduledExecutorService, new defpackage.gyk(this, aosbVar, 2), ((defpackage.aosc) aosbVar).b, j) : null;
        if (scheduledFutureK != null) {
            ((defpackage.aosc) aosbVar).A(new defpackage.aorz(scheduledFutureK, 1));
        } else {
            defpackage.aosw.a.d(j, aosbVar);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aotu) && ((defpackage.aotu) obj).a == this.a;
    }

    @Override // defpackage.aott
    public final java.util.concurrent.Executor h() {
        return this.a;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.a);
    }

    @Override // defpackage.aosp
    public final java.lang.String toString() {
        return this.a.toString();
    }
}
