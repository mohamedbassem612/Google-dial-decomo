package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anvc implements defpackage.anvv {
    public final java.util.concurrent.Executor a;
    private final defpackage.anvv b;

    public anvc(defpackage.anvv anvvVar, java.util.concurrent.Executor executor) {
        if (anvvVar == null) {
            throw new java.lang.NullPointerException("delegate");
        }
        this.b = anvvVar;
        if (executor == null) {
            throw new java.lang.NullPointerException("appExecutor");
        }
        this.a = executor;
    }

    @Override // defpackage.anvv
    public final anwc a(java.net.SocketAddress socketAddress, anvu anvuVar, defpackage.anmd anmdVar) {
        return new anvb(this, this.b.a(socketAddress, anvuVar, anmdVar), anvuVar.a);
    }

    @Override // defpackage.anvv
    public final java.util.Collection b() {
        return this.b.b();
    }

    @Override // defpackage.anvv
    public final java.util.concurrent.ScheduledExecutorService c() {
        return this.b.c();
    }

    @Override // defpackage.anvv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
