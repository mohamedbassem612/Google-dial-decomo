package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoax extends java.io.InputStream implements j$.io.InputStreamRetargetInterface, defpackage.annz {
    private final defpackage.aoaw a;

    public aoax(defpackage.aoaw aoawVar) {
        ahvr.cj(aoawVar, "buffer");
        this.a = aoawVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((defpackage.anwa) this.a).a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        defpackage.aoaw aoawVar = this.a;
        int i3 = ((defpackage.anwa) aoawVar).a;
        if (i3 == 0) {
            return -1;
        }
        int iMin = java.lang.Math.min(i3, i2);
        aoawVar.j(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        defpackage.aoaw aoawVar = this.a;
        int iMin = (int) java.lang.Math.min(((defpackage.anwa) aoawVar).a, j);
        aoawVar.k(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        defpackage.aoaw aoawVar = this.a;
        if (((defpackage.anwa) aoawVar).a == 0) {
            return -1;
        }
        return aoawVar.e();
    }
}
