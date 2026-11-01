package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aocd implements java.util.concurrent.Executor, java.lang.Runnable {
    private static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.aocd.class.getName());
    private static final defpackage.aoca c;
    private final java.util.concurrent.Executor d;
    private final java.util.Queue e = new j$.util.concurrent.ConcurrentLinkedQueue();
    public volatile int a = 0;

    static {
        defpackage.aoca aoccVar;
        try {
            aoccVar = new defpackage.aocb(java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.aocd.class, "a"));
        } catch (java.lang.Throwable th) {
            b.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            aoccVar = new defpackage.aocc();
        }
        c = aoccVar;
    }

    public aocd(java.util.concurrent.Executor executor) {
        ahvr.cj(executor, "'executor' must not be null.");
        this.d = executor;
    }

    private final void a(java.lang.Runnable runnable) {
        if (c.a(this)) {
            try {
                this.d.execute(this);
            } catch (java.lang.Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.b(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        ahvr.cj(runnable, "'r' must not be null.");
        this.e.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                java.lang.Runnable runnable = (java.lang.Runnable) this.e.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (java.lang.RuntimeException e) {
                    b.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.SerializingExecutor", "run", hgb.k(runnable, "Exception while executing runnable "), (java.lang.Throwable) e);
                }
            } catch (java.lang.Throwable th) {
                c.b(this);
                throw th;
            }
        }
        c.b(this);
        if (this.e.isEmpty()) {
            return;
        }
        a(null);
    }
}
