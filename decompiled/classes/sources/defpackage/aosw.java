package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aosw extends defpackage.aotr implements java.lang.Runnable {
    private static volatile java.lang.Thread _thread;
    public static final defpackage.aosw a;
    private static volatile int debugStatus;
    private static final long e;

    static {
        java.lang.Long l;
        defpackage.aosw aoswVar = new defpackage.aosw();
        a = aoswVar;
        aoswVar.p(false);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        try {
            l = java.lang.Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (java.lang.SecurityException unused) {
            l = 1000L;
        }
        e = timeUnit.toNanos(l.longValue());
    }

    private final synchronized boolean A() {
        if (B()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private static final boolean B() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private static final void C() {
        throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final synchronized java.lang.Thread y() {
        java.lang.Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        java.lang.Thread thread2 = new java.lang.Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setContextClassLoader(a.getClass().getClassLoader());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    private final synchronized void z() {
        if (B()) {
            debugStatus = 3;
            ((defpackage.aotr) this).c.c(null);
            this.d.c(null);
            notifyAll();
        }
    }

    @Override // defpackage.aotr, defpackage.aota
    public final defpackage.aotj c(long j, java.lang.Runnable runnable, defpackage.aolr aolrVar) {
        return u(j, runnable);
    }

    @Override // defpackage.aotm
    protected final java.lang.Thread h() {
        java.lang.Thread thread = _thread;
        return thread == null ? y() : thread;
    }

    @Override // defpackage.aotr
    public final void j(java.lang.Runnable runnable) {
        if (debugStatus == 4) {
            C();
        }
        super.j(runnable);
    }

    @Override // defpackage.aotm
    protected final void k(long j, aotp aotpVar) {
        C();
    }

    @Override // defpackage.aotr, defpackage.aotm
    public final void l() {
        debugStatus = 4;
        super.l();
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ThreadLocal threadLocal = defpackage.aovj.a;
        defpackage.aovj.a.set(this);
        try {
            if (A()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    java.lang.Thread.interrupted();
                    long jM = m();
                    if (jM == Long.MAX_VALUE) {
                        long jNanoTime = java.lang.System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = e + jNanoTime;
                        }
                        jM = j - jNanoTime;
                        if (jM <= 0) {
                            break;
                        } else if (jM >= Long.MAX_VALUE) {
                            jM = Long.MAX_VALUE;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM > 0) {
                        if (B()) {
                            break;
                        } else {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, jM);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            z();
            if (!x()) {
                h();
            }
        }
    }

    @Override // defpackage.aosp
    public final java.lang.String toString() {
        return "DefaultExecutor";
    }
}
