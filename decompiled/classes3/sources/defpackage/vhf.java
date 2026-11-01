package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vhf extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    public final int a;
    private final java.io.InputStream b;
    private int c;

    public vhf(java.io.InputStream inputStream, int i) {
        this.b = inputStream;
        this.a = i;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a - this.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.c;
        int i5 = this.a;
        if (i4 >= i5 || (i3 = this.b.read(bArr, i, java.lang.Math.min(i5 - i4, i2))) == -1) {
            return -1;
        }
        this.c += i3;
        return i3;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "FixedLengthInputStream(in=%s, length=%d)", this.b.toString(), java.lang.Integer.valueOf(this.a));
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
        int i = this.c;
        if (i >= this.a) {
            return -1;
        }
        this.c = i + 1;
        return this.b.read();
    }
}
