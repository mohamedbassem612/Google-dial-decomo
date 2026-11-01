package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class efh extends java.io.OutputStream {
    private final java.io.FileOutputStream a;

    public efh(java.io.FileOutputStream fileOutputStream) {
        this.a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (bArr == null) {
            defpackage.aooh.i("bytes");
        }
        this.a.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        defpackage.aooh.f(bArr, "b");
        this.a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        this.a.write(i);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
