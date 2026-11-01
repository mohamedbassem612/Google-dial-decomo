package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afey implements java.io.Closeable {
    public java.io.Closeable a;

    public afey(java.io.Closeable closeable) {
        this.a = closeable;
    }

    public final java.io.Closeable a() {
        java.io.Closeable closeable = this.a;
        this.a = null;
        return closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.io.Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
