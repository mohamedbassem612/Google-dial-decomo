package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajbn extends defpackage.ajak {
    private final defpackage.ahzt a = new defpackage.ahzt();
    private int b = 0;
    private boolean c = false;

    private final void a() {
        defpackage.ahzt ahztVar = this.a;
        synchronized (ahztVar) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                ahztVar.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.ahzt ahztVar = this.a;
        long nanos = timeUnit.toNanos(j);
        synchronized (ahztVar) {
            while (true) {
                if (this.c && this.b == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long jNanoTime = java.lang.System.nanoTime();
                java.util.concurrent.TimeUnit.NANOSECONDS.timedWait(ahztVar, nanos);
                nanos -= java.lang.System.nanoTime() - jNanoTime;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        synchronized (this.a) {
            if (this.c) {
                throw new java.util.concurrent.RejectedExecutionException("Executor already shutdown");
            }
            this.b++;
        }
        try {
            runnable.run();
        } finally {
            a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.b == 0) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        defpackage.ahzt ahztVar = this.a;
        synchronized (ahztVar) {
            this.c = true;
            if (this.b == 0) {
                ahztVar.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        shutdown();
        return defpackage.aike.a;
    }
}
