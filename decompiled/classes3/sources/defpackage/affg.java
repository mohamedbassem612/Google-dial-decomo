package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class affg extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private final java.util.concurrent.Callable a;
    private volatile boolean b = false;
    private java.io.InputStream c;

    public affg(java.util.concurrent.Callable callable) {
        this.a = callable;
    }

    private final void a() throws java.io.IOException {
        if (this.b) {
            return;
        }
        this.b = true;
        try {
            this.c = new java.io.ByteArrayInputStream((byte[]) this.a.call());
        } catch (java.io.IOException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.io.IOException(e2);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.b) {
            return this.c.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        a();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        if (this.b) {
            this.c.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        a();
        return this.c.read();
    }

    @Override // java.io.InputStream
    public final void reset() throws java.io.IOException {
        a();
        this.c.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        a();
        return this.c.skip(j);
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        a();
        return this.c.read(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        a();
        return this.c.read(bArr, i, i2);
    }
}
