package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajul implements java.util.concurrent.ThreadFactory {
    private static final java.util.concurrent.ThreadFactory c = java.util.concurrent.Executors.defaultThreadFactory();
    public final int a;
    public final android.os.StrictMode.ThreadPolicy b;
    private final java.util.concurrent.atomic.AtomicLong d = new java.util.concurrent.atomic.AtomicLong();
    private final java.lang.String e;

    public ajul(java.lang.String str, int i, android.os.StrictMode.ThreadPolicy threadPolicy) {
        this.e = str;
        this.a = i;
        this.b = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = c.newThread(new defpackage.abqu(this, runnable, 18));
        threadNewThread.setName(java.lang.String.format(java.util.Locale.ROOT, "%s Thread #%d", this.e, java.lang.Long.valueOf(this.d.getAndIncrement())));
        return threadNewThread;
    }
}
