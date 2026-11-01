package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abrf extends java.util.concurrent.AbstractExecutorService implements java.lang.AutoCloseable {
    public final java.util.Set a;
    public final abrj b;
    public final abrn c;
    public final boolean d;
    public final ajcu e;
    private final java.util.concurrent.atomic.AtomicInteger f;
    private final defpackage.abrh g;
    private final java.util.concurrent.ExecutorService h;
    private final defpackage.aprf i;

    public abrf(abrj abrjVar, abrn abrnVar, boolean z, ajcu ajcuVar, defpackage.abrh abrhVar, java.util.Set set, java.util.concurrent.ExecutorService executorService, defpackage.aprf aprfVar) {
        this.g = abrhVar;
        this.a = set;
        this.h = executorService;
        this.i = aprfVar;
        this.b = abrjVar;
        this.c = abrnVar;
        this.d = z;
        this.e = ajcuVar;
        abrnVar.b();
        this.f = new java.util.concurrent.atomic.AtomicInteger(1000);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.h.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        anty.aj(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        abrn abrnVar = this.c;
        abrnVar.c();
        boolean zB = abri.b();
        java.util.concurrent.ExecutorService executorService = this.h;
        if (zB) {
            executorService.execute(new defpackage.abre(this, runnable));
        } else {
            executorService.execute(runnable);
        }
        abrnVar.a();
        if (!abri.b()) {
            return;
        }
        int i = ((aitw) this.i.a).d.get();
        abrnVar.b();
        if (i < 1000) {
            return;
        }
        while (true) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f;
            int i2 = atomicInteger.get();
            if (i < i2) {
                return;
            }
            if (atomicInteger.compareAndSet(i2, i2 << 1)) {
                abrnVar.b();
                abri.a(this.b, this.g.a(), new defpackage.abrk(a.bs(i, "Queue size of ", " exceeds starvation threshold of 1000")));
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.h.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.h.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.h.b(false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        return this.h.shutdownNow();
    }

    public final java.lang.String toString() {
        return "Monitoring[" + this.h.toString() + ']';
    }
}
