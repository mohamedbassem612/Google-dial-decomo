package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anuc implements anvv {
    private final java.util.concurrent.ScheduledExecutorService a;
    private final java.util.concurrent.Executor b;
    private final int c;
    private final defpackage.anud d;
    private final aodq e;
    private final boolean f;
    private boolean g;

    public anuc(defpackage.anud anudVar, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, int i, aodq aodqVar) {
        boolean z = scheduledExecutorService == null;
        this.f = z;
        this.a = z ? (java.util.concurrent.ScheduledExecutorService) aodf.a.a(anxo.p) : scheduledExecutorService;
        this.c = i;
        this.d = anudVar;
        this.b = executor;
        this.e = aodqVar;
    }

    public final defpackage.anwc a(java.net.SocketAddress socketAddress, defpackage.anvu anvuVar, anmd anmdVar) {
        if (this.g) {
            throw new java.lang.IllegalStateException("The transport factory is closed.");
        }
        return new defpackage.anul(this.d, (java.net.InetSocketAddress) socketAddress, anvuVar.a, anvuVar.c, anvuVar.b, this.b, this.c, this.e);
    }

    public final java.util.Collection b() {
        return java.util.Collections.singleton(java.net.InetSocketAddress.class);
    }

    public final java.util.concurrent.ScheduledExecutorService c() {
        return this.a;
    }

    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        if (this.f) {
            aodf.b(anxo.p, this.a);
        }
    }
}
