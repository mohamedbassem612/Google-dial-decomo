package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hgf implements java.util.concurrent.ThreadFactory {
    private static final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.lang.ThreadGroup b;
    private final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.lang.String d;

    public hgf() {
        java.lang.SecurityManager securityManager = java.lang.System.getSecurityManager();
        this.b = securityManager == null ? java.lang.Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.d = "lottie-" + a.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(this.b, runnable, this.d + this.c.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
