package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aobb implements defpackage.anvv {
    private final defpackage.anvv a;
    private final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(1);

    public aobb(defpackage.anvv anvvVar) {
        this.a = anvvVar;
    }

    @Override // defpackage.anvv
    public final anwc a(java.net.SocketAddress socketAddress, anvu anvuVar, defpackage.anmd anmdVar) {
        return this.a.a(socketAddress, anvuVar, anmdVar);
    }

    @Override // defpackage.anvv
    public final java.util.Collection b() {
        return this.a.b();
    }

    @Override // defpackage.anvv
    public final java.util.concurrent.ScheduledExecutorService c() {
        return this.a.c();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    @Override // defpackage.anvv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int iDecrementAndGet = this.b.decrementAndGet();
        defpackage.ahvr.ca((iDecrementAndGet ^ (-1)) >>> 31, "Reference count has gone negative: %s", iDecrementAndGet);
        if (iDecrementAndGet == 0) {
            this.a.close();
        }
    }
}
