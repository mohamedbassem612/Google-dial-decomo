package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajcr extends java.util.concurrent.FutureTask implements defpackage.ajcq {
    private final defpackage.ajbp a;

    public ajcr(java.lang.Runnable runnable) {
        super(runnable, null);
        this.a = new defpackage.ajbp();
    }

    @Override // defpackage.ajcq
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        if (runnable == null) {
            throw new java.lang.NullPointerException("Runnable was null.");
        }
        if (executor == null) {
            throw new java.lang.NullPointerException("Executor was null.");
        }
        defpackage.ajbp ajbpVar = this.a;
        synchronized (ajbpVar.a) {
            if (ajbpVar.b) {
                defpackage.ajbp.a(runnable, executor);
            } else {
                ajbpVar.c = new defpackage.ajxw(runnable, executor, ajbpVar.c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        defpackage.ajbp ajbpVar = this.a;
        synchronized (ajbpVar.a) {
            if (ajbpVar.b) {
                return;
            }
            ajbpVar.b = true;
            java.lang.Object obj = ajbpVar.c;
            java.lang.Object obj2 = null;
            ajbpVar.c = null;
            while (obj != null) {
                defpackage.ajxw ajxwVar = (defpackage.ajxw) obj;
                java.lang.Object obj3 = ajxwVar.c;
                ajxwVar.c = obj2;
                obj2 = obj;
                obj = obj3;
            }
            while (obj2 != null) {
                defpackage.ajxw ajxwVar2 = (defpackage.ajxw) obj2;
                defpackage.ajbp.a(ajxwVar2.b, ajxwVar2.a);
                obj2 = ajxwVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(java.lang.Math.min(nanos, 2147483647999999999L), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public ajcr(java.util.concurrent.Callable callable) {
        super(callable);
        this.a = new defpackage.ajbp();
    }
}
