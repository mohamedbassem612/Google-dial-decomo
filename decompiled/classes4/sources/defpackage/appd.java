package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class appd implements java.io.Closeable {
    public boolean a;
    public int b;
    public final java.util.concurrent.locks.ReentrantLock c = new java.util.concurrent.locks.ReentrantLock();
    private final java.io.RandomAccessFile d;

    public appd(java.io.RandomAccessFile randomAccessFile) {
        this.d = randomAccessFile;
    }

    public final long a() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                throw new java.lang.IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return d();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final apqd b(long j) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                throw new java.lang.IllegalStateException("closed");
            }
            this.b++;
            reentrantLock.unlock();
            return new defpackage.appc(this, j);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    protected final synchronized int c(long j, byte[] bArr, int i, int i2) {
        aooh.f(bArr, "array");
        java.io.RandomAccessFile randomAccessFile = this.d;
        randomAccessFile.seek(j);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = randomAccessFile.read(bArr, i, i2 - i3);
            if (i4 == -1) {
                if (i3 != 0) {
                    break;
                }
                return -1;
            }
            i3 += i4;
        }
        return i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (!this.a) {
                this.a = true;
                if (this.b == 0) {
                    reentrantLock.unlock();
                    e();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    protected final synchronized long d() {
        return this.d.length();
    }

    protected final synchronized void e() {
        this.d.close();
    }
}
