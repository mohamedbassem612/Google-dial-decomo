package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xvh extends java.io.FilterInputStream implements j$.io.InputStreamRetargetInterface {
    private static final byte[] a = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    private static final int b = 31;
    private final byte c;
    private int d;

    public xvh(java.io.InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new java.lang.IllegalArgumentException(a.bj(i, "Cannot add invalid orientation: "));
        }
        this.c = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3;
        int i4 = this.d;
        int i5 = b;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.c;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = java.lang.Math.min(i5 - i4, i2);
            java.lang.System.arraycopy(a, this.d - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.d += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.d = (int) (((long) this.d) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        int i;
        int i2;
        int i3 = this.d;
        if (i3 >= 2 && i3 <= (i2 = b)) {
            i = i3 == i2 ? this.c : a[i3 - 2] & 255;
        } else {
            i = super.read();
        }
        if (i != -1) {
            this.d++;
        }
        return i;
    }
}
