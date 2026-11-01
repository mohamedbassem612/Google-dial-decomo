package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xyj {
    public java.lang.String a;
    public long b;
    private final boolean c;
    private final boolean d;
    private int e;
    private int f;
    private final java.util.concurrent.ThreadFactory g = new defpackage.xyl(0);

    public xyj(boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        if (z2) {
            this.e = 0;
            this.f = Integer.MAX_VALUE;
        }
    }

    public final defpackage.xyn a() {
        if (android.text.TextUtils.isEmpty(this.a)) {
            throw new java.lang.IllegalArgumentException("Name must be non-null and non-empty, but given: ".concat(java.lang.String.valueOf(this.a)));
        }
        defpackage.xym xymVar = new defpackage.xym(this.g, this.a, this.c);
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(this.e, this.f, this.b, java.util.concurrent.TimeUnit.MILLISECONDS, (java.util.concurrent.BlockingQueue<java.lang.Runnable>) (this.d ? new java.util.concurrent.SynchronousQueue() : new java.util.concurrent.PriorityBlockingQueue()), xymVar);
        if (this.b != 0) {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return new defpackage.xyn(threadPoolExecutor);
    }

    public final void b(int i) {
        if (this.d) {
            throw new java.lang.UnsupportedOperationException("Thread count cannot be configured on an unlimited source executor");
        }
        this.e = i;
        this.f = i;
    }
}
