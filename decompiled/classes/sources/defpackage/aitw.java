package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aitw extends java.util.concurrent.AbstractExecutorService implements java.lang.AutoCloseable {
    public static final java.lang.Object a = new java.lang.Object();
    public static final java.lang.Object b = new java.lang.Object();
    public boolean g;
    public final java.util.concurrent.ThreadFactory i;
    public final boolean j;
    public final java.lang.Runnable k;
    public final java.lang.Runnable l;
    public final defpackage.aitu[] m;
    public final defpackage.aitu[] n;
    public final java.util.concurrent.CountDownLatch o;
    public final java.util.concurrent.atomic.AtomicReference p;
    private final int q;
    private boolean r;
    private final boolean s;
    private final defpackage.aitv[] t;
    public final j$.util.concurrent.ConcurrentLinkedQueue c = new j$.util.concurrent.ConcurrentLinkedQueue();
    public final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger e = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean();

    public aitw(int i, java.util.concurrent.ThreadFactory threadFactory, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "numThreads must be positive: "));
        }
        this.q = Integer.MAX_VALUE;
        this.i = threadFactory;
        this.j = true;
        this.k = runnable;
        this.l = runnable2;
        this.s = true;
        this.o = new java.util.concurrent.CountDownLatch(i);
        int i2 = i + 1;
        defpackage.aitu[] aituVarArr = new defpackage.aitu[i2];
        defpackage.aitu[] aituVarArr2 = new defpackage.aitu[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            aituVarArr[i4] = new defpackage.aitu(b, i4);
            aituVarArr2[i4] = new defpackage.aitu(a, i4);
        }
        this.m = aituVarArr;
        this.n = aituVarArr2;
        defpackage.aitv[] aitvVarArr = new defpackage.aitv[i];
        defpackage.aitu aituVar = aituVarArr[0];
        while (i3 < i) {
            defpackage.aitu aituVar2 = new defpackage.aitu(aituVar, i3);
            aitvVarArr[i3] = new defpackage.aitv(this, i3);
            i3++;
            aituVar = aituVar2;
        }
        this.t = aitvVarArr;
        this.p = new java.util.concurrent.atomic.AtomicReference(aituVar);
    }

    public final void a() {
        if (this.s) {
            this.d.decrementAndGet();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.o.await(j, timeUnit);
    }

    public final void b(boolean z) {
        this.r = true;
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.p;
            defpackage.aitu aituVar = (defpackage.aitu) atomicReference.get();
            java.lang.Object obj = aituVar.a;
            if (obj == a) {
                return;
            }
            java.lang.Object obj2 = b;
            if (defpackage.anty.Q(atomicReference, aituVar, (obj != obj2 || z) ? this.n[0] : this.n[aituVar.b])) {
                while (aituVar.a != obj2) {
                    defpackage.aitv aitvVar = this.t[aituVar.b];
                    java.lang.Thread thread = aitvVar.b;
                    aitvVar.i = 3;
                    if (thread != null) {
                        java.util.concurrent.locks.LockSupport.unpark(thread);
                    } else {
                        aitvVar.a();
                    }
                    aituVar = (defpackage.aitu) aituVar.a;
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        defpackage.anty.aj(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i;
        runnable.getClass();
        if (!this.r) {
            if (this.s) {
                int i2 = this.q;
                if (i2 != Integer.MAX_VALUE) {
                    do {
                        atomicInteger = this.d;
                        i = atomicInteger.get();
                        if (i != i2) {
                        }
                    } while (!atomicInteger.compareAndSet(i, i + 1));
                } else {
                    this.d.incrementAndGet();
                }
            }
            defpackage.aitu aituVar = new defpackage.aitu(runnable, -1);
            j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
            concurrentLinkedQueue.add(aituVar);
            while (true) {
                java.util.concurrent.atomic.AtomicReference atomicReference = this.p;
                defpackage.aitu aituVar2 = (defpackage.aitu) atomicReference.get();
                java.lang.Object obj = aituVar2.a;
                if (obj == b) {
                    int i3 = aituVar2.b;
                    int iMin = java.lang.Math.min(i3 + 1, this.t.length);
                    if (iMin == i3 || defpackage.anty.Q(atomicReference, aituVar2, this.m[iMin])) {
                        return;
                    }
                } else {
                    if (obj == a) {
                        if (concurrentLinkedQueue.remove(aituVar)) {
                            a();
                            throw new java.util.concurrent.RejectedExecutionException();
                        }
                        return;
                    }
                    int i4 = aituVar2.b;
                    if (defpackage.anty.Q(atomicReference, aituVar2, (defpackage.aitu) obj)) {
                        defpackage.aitv aitvVar = this.t[i4];
                        java.lang.Thread thread = aitvVar.b;
                        aitvVar.i = 1;
                        if (thread != null) {
                            java.util.concurrent.locks.LockSupport.unpark(thread);
                            return;
                        } else {
                            aitvVar.h.e.incrementAndGet();
                            aitvVar.b();
                            return;
                        }
                    }
                }
            }
        }
        throw new java.util.concurrent.RejectedExecutionException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return ((defpackage.aitu) this.p.get()).a == a;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.o.getCount() == 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        b(false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        b(true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.h.compareAndSet(false, true)) {
            while (true) {
                defpackage.aitu aituVar = (defpackage.aitu) this.c.poll();
                if (aituVar == null) {
                    break;
                }
                a();
                arrayList.add((java.lang.Runnable) aituVar.a);
            }
            this.g = true;
            for (defpackage.aitv aitvVar : this.t) {
                java.lang.Thread thread = aitvVar.c;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        return arrayList;
    }
}
