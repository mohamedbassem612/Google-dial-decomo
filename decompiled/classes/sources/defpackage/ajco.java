package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class ajco extends java.util.concurrent.atomic.AtomicReference implements java.lang.Runnable {
    private static final java.lang.Runnable a;
    private static final java.lang.Runnable b;

    static {
        int i = 7;
        a = new defpackage.aafk(i);
        b = new defpackage.aafk(i);
    }

    private final void c(java.lang.Thread thread) {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        ajcn ajcnVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof ajcn)) {
                if (runnable != b) {
                    break;
                }
            } else {
                ajcnVar = (ajcn) runnable;
            }
            i++;
            if (i > 1000) {
                java.lang.Runnable runnable2 = b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = java.lang.Thread.interrupted() || z;
                    java.util.concurrent.locks.LockSupport.park(ajcnVar);
                }
            } else {
                java.lang.Thread.yield();
            }
            runnable = (java.lang.Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract java.lang.Object a();

    public abstract java.lang.String b();

    public abstract void d(java.lang.Throwable th);

    public abstract void e(java.lang.Object obj);

    public abstract boolean g();

    final void h() {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable instanceof java.lang.Thread) {
            ajcn ajcnVar = new ajcn(this);
            ajcnVar.a(java.lang.Thread.currentThread());
            if (compareAndSet(runnable, ajcnVar)) {
                try {
                    ((java.lang.Thread) runnable).interrupt();
                    if (((java.lang.Runnable) getAndSet(a)) == b) {
                    }
                } finally {
                    if (((java.lang.Runnable) getAndSet(a)) == b) {
                        java.util.concurrent.locks.LockSupport.unpark((java.lang.Thread) runnable);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zG = g();
            if (!zG) {
                try {
                    objA = a();
                } catch (java.lang.Throwable th) {
                    try {
                        defpackage.aiql.p(th);
                        if (!compareAndSet(threadCurrentThread, a)) {
                            c(threadCurrentThread);
                        }
                        d(th);
                        return;
                    } catch (java.lang.Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, a)) {
                            c(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, a)) {
                c(threadCurrentThread);
            }
            if (zG) {
                return;
            }
            e(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof ajcn) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof java.lang.Thread) {
            str = "running=[RUNNING ON " + ((java.lang.Thread) runnable).getName() + ']';
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
