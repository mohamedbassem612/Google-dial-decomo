package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yfr extends java.io.FilterInputStream implements j$.io.InputStreamRetargetInterface {
    private final long a;
    private int b;

    public yfr(java.io.InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    private final void a(int i) throws java.io.IOException {
        if (i >= 0) {
            this.b += i;
            return;
        }
        long j = this.a;
        int i2 = this.b;
        if (j - ((long) i2) <= 0) {
            return;
        }
        throw new java.io.IOException("Failed to read all expected data, expected: " + j + ", but read: " + i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) java.lang.Math.max(this.a - this.b, this.in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        a(i3);
        return i3;
    }
}
