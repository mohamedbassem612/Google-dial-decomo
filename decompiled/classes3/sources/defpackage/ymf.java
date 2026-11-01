package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ymf {
    public android.content.Context a;
    public java.util.concurrent.Executor b;
    public boolean c;
    public j$.time.Duration d;
    public j$.util.Optional e = j$.util.Optional.empty();
    public byte f;
    private java.util.concurrent.ExecutorService g;
    private java.util.concurrent.ScheduledExecutorService h;

    public final defpackage.ymh a() {
        android.content.Context context;
        java.util.concurrent.ExecutorService executorService;
        java.util.concurrent.Executor executor;
        j$.time.Duration duration;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        java.util.concurrent.ExecutorService executorService2 = this.g;
        if (!(executorService2 == null ? j$.util.Optional.empty() : j$.util.Optional.of(executorService2)).isPresent()) {
            b(java.util.concurrent.Executors.newCachedThreadPool(new defpackage.absn("AiCoreClientWorker", 1)));
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = this.h;
        if (!(scheduledExecutorService2 == null ? j$.util.Optional.empty() : j$.util.Optional.of(scheduledExecutorService2)).isPresent()) {
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService3 = defpackage.yme.a;
            if (scheduledExecutorService3 == null) {
                throw new java.lang.NullPointerException("Null autoUnbindScheduledExecutor");
            }
            this.h = scheduledExecutorService3;
        }
        if (this.f == 1 && (context = this.a) != null && (executorService = this.g) != null && (executor = this.b) != null && (duration = this.d) != null && (scheduledExecutorService = this.h) != null) {
            return new defpackage.ymh(context, executorService, executor, this.c, duration, scheduledExecutorService, this.e);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" context");
        }
        if (this.g == null) {
            sb.append(" workerExecutor");
        }
        if (this.b == null) {
            sb.append(" callbackExecutor");
        }
        if (this.f == 0) {
            sb.append(" bindImportantEnabled");
        }
        if (this.d == null) {
            sb.append(" autoUnbindTimeoutMs");
        }
        if (this.h == null) {
            sb.append(" autoUnbindScheduledExecutor");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.util.concurrent.ExecutorService executorService) {
        if (executorService == null) {
            throw new java.lang.NullPointerException("Null workerExecutor");
        }
        this.g = executorService;
    }
}
