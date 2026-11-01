package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahqq implements java.io.Closeable {
    private final long a;

    public ahqq(long j) {
        this.a = j;
    }

    public final void a() {
        java.util.HashMap map = ahqx.b;
        synchronized (map) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        afec.d(new defpackage.agdr(this, 20), 5000L);
    }
}
