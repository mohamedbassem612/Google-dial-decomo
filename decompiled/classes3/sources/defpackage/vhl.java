package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vhl extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    public boolean a;
    public int b;
    private final java.io.InputStream c;

    public vhl(java.io.InputStream inputStream) {
        this.c = inputStream;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (!this.a) {
            return this.c.read(bArr, i, i2);
        }
        bArr[0] = (byte) this.b;
        this.a = false;
        int i3 = this.c.read(bArr, i + 1, i2 - 1);
        if (i3 == -1) {
            return 1;
        }
        return i3 + 1;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "PeekableInputStream(in=%s, peeked=%b, peekedByte=%d)", this.c.toString(), java.lang.Boolean.valueOf(this.a), java.lang.Integer.valueOf(this.b));
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.a) {
            return this.c.read();
        }
        this.a = false;
        return this.b;
    }
}
