package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public interface anvv extends java.io.Closeable {
    anwc a(java.net.SocketAddress socketAddress, anvu anvuVar, defpackage.anmd anmdVar);

    java.util.Collection b();

    java.util.concurrent.ScheduledExecutorService c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
