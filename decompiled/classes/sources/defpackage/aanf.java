package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aanf implements java.util.concurrent.ThreadFactory {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public aanf(int i, byte[] bArr) {
        this.$cid = i;
        this.a = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        if (this.$cid != 0) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setName("arch_disk_io_" + ((java.util.concurrent.atomic.AtomicInteger) this.a).getAndIncrement());
            return thread;
        }
        java.lang.Thread threadNewThread = this.a.newThread(runnable);
        if (threadNewThread == null) {
            throw new java.lang.NullPointerException("Default ThreadFactory returned null thread");
        }
        threadNewThread.setName("punch".concat(java.lang.String.valueOf(threadNewThread.getName())));
        return threadNewThread;
    }

    public aanf(int i) {
        this.$cid = i;
        this.a = java.util.concurrent.Executors.defaultThreadFactory();
    }
}
