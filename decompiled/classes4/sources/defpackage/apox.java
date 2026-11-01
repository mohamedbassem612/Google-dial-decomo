package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apox extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    final /* synthetic */ apoy a;

    public apox(apoy apoyVar) {
        this.a = apoyVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) java.lang.Math.min(this.a.b, 2147483647L);
    }

    @Override // java.io.InputStream
    public final int read() {
        apoy apoyVar = this.a;
        if (apoyVar.b > 0) {
            return apoyVar.d() & 255;
        }
        return -1;
    }

    public final java.lang.String toString() {
        apoy apoyVar = this.a;
        java.util.Objects.toString(apoyVar);
        return apoyVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        aooh.f(bArr, "sink");
        return this.a.e(bArr, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
