package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aawx extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    public volatile defpackage.aawu a;
    private final java.io.InputStream b;

    public aawx(java.io.InputStream inputStream) {
        this.b = inputStream;
    }

    private final void a(int i) throws defpackage.aavv {
        defpackage.aawu aawuVar;
        if (i == -1 && (aawuVar = this.a) != null) {
            throw new defpackage.aavv(aawuVar.a, aawuVar.b);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.b.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        int i = this.b.read();
        a(i);
        return i;
    }

    @Override // java.io.InputStream
    public final void reset() throws java.io.IOException {
        this.b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.b.skip(j);
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        int i = this.b.read(bArr);
        a(i);
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.b.read(bArr, i, i2);
        a(i3);
        return i3;
    }
}
