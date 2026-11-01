package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afev implements java.io.Closeable {
    public java.util.concurrent.Semaphore a;

    public afev(java.util.concurrent.Semaphore semaphore) {
        this.a = semaphore;
    }

    public final java.util.concurrent.Semaphore a() {
        java.util.concurrent.Semaphore semaphore = this.a;
        this.a = null;
        return semaphore;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.Semaphore semaphore = this.a;
        if (semaphore != null) {
            semaphore.release();
            this.a = null;
        }
    }
}
