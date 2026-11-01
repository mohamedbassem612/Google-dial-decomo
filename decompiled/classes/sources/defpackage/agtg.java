package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agtg implements java.util.concurrent.ExecutorService, java.lang.AutoCloseable {
    private static final defpackage.aimz c = defpackage.aimz.i("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor");
    private final java.util.concurrent.Executor d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private boolean h;
    private defpackage.ajcq i;
    private agtf j;
    public final java.util.Deque a = new java.util.ArrayDeque();
    public int b = 1;
    private final defpackage.ajdb k = new defpackage.ajdb(this, 1);

    public agtg(java.util.concurrent.Executor executor, boolean z, boolean z2, boolean z3) {
        this.d = executor;
        this.f = z2;
        this.g = z3;
        this.e = z;
    }

    public static /* synthetic */ void b(defpackage.ajcq ajcqVar, java.lang.String str) {
        try {
            defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
            defpackage.a.h(ajcqVar);
        } catch (java.util.concurrent.CancellationException unused) {
        } catch (java.util.concurrent.ExecutionException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) c.c()).k(e.getCause())).l("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor", "logOnFailure", (char) 426, "SuspendableUiThreadExecutor.java")).v(str);
        }
    }

    private static void e(defpackage.ajcq ajcqVar, java.lang.String str) {
        ajcqVar.c(defpackage.ahqx.h(new defpackage.abqu(ajcqVar, str, 13)), defpackage.ajbm.INSTANCE);
    }

    public final java.util.Queue a() {
        java.util.ArrayDeque arrayDeque;
        java.util.Deque deque = this.a;
        synchronized (deque) {
            defpackage.ahvr.bZ(this.h, "Executor may only be drained when it is suspended.");
            arrayDeque = new java.util.ArrayDeque(deque);
            deque.clear();
        }
        return arrayDeque;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final void c() throws afeb {
        defpackage.afec.c();
        synchronized (this.a) {
            this.h = false;
        }
        execute(new defpackage.aafk(3));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        defpackage.anty.ak(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public final void d() throws afeb {
        defpackage.afec.c();
        synchronized (this.a) {
            this.h = true;
            this.b = 1;
            if (this.f) {
                agtf agtfVar = this.j;
                if (agtfVar != null) {
                    agtfVar.a();
                    this.j = null;
                }
            } else {
                defpackage.ajcq ajcqVar = this.i;
                if (ajcqVar != null) {
                    ajcqVar.cancel(false);
                    this.i = null;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        boolean z;
        int i;
        runnable.getClass();
        java.util.Deque deque = this.a;
        synchronized (deque) {
            if (this.h || (i = this.b) == 3 || i == 2) {
                deque.add(runnable);
            } else {
                deque.add(runnable);
                if (this.f) {
                    agtf agtfVar = new agtf(this.k);
                    this.j = agtfVar;
                    this.d.execute(defpackage.ahqx.h(agtfVar));
                } else {
                    java.lang.Runnable runnableH = defpackage.ahqx.h(this.k);
                    java.util.concurrent.Executor executor = this.d;
                    defpackage.ajdk ajdkVar = new defpackage.ajdk(java.util.concurrent.Executors.callable(runnableH, null));
                    executor.execute(ajdkVar);
                    this.i = ajdkVar;
                    if (this.g) {
                        e(ajdkVar, "Silently ignored exception in MainImmediateContext.");
                    } else {
                        e(ajdkVar, "Silently ignored exception in SuspendableUiThreadExecutor.");
                    }
                }
                this.b = 2;
            }
        }
        synchronized (this.a) {
            z = false;
            if (defpackage.afec.h(java.lang.Thread.currentThread()) && this.e && !this.h && this.b != 3) {
                if (this.f) {
                    agtf agtfVar2 = this.j;
                    if (agtfVar2 == null) {
                        throw new java.lang.NullPointerException("Should not be possible since the worker must have been scheduled in `executeInternal()`.");
                    }
                    agtfVar2.a();
                    this.j = null;
                } else {
                    defpackage.ajcq ajcqVar = this.i;
                    if (ajcqVar == null) {
                        throw new java.lang.NullPointerException("Should not be possible since the worker must have been scheduled in `executeInternal()`.");
                    }
                    ajcqVar.cancel(false);
                    this.i = null;
                }
                this.b = 2;
                z = true;
            }
        }
        if (z) {
            this.k.run();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return defpackage.aiql.D(new afgu(runnable, obj, 7), this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List invokeAll(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.lang.Object invokeAny(java.util.Collection collection, long j, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return defpackage.aiql.C(runnable, this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return defpackage.aiql.D(callable, this);
    }
}
