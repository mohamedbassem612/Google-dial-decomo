package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akzb extends java.io.OutputStream {
    private static final byte[] a = new byte[0];
    private final int b;
    private final java.util.ArrayList c;
    private int d;
    private byte[] e;
    private int f;

    public akzb(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Buffer size < 0");
        }
        this.b = i;
        this.c = new java.util.ArrayList();
        this.e = new byte[i];
    }

    private final void c(int i) {
        this.c.add(new akza(this.e));
        int length = this.d + this.e.length;
        this.d = length;
        this.e = new byte[java.lang.Math.max(this.b, java.lang.Math.max(i, length >>> 1))];
        this.f = 0;
    }

    public final synchronized int a() {
        return this.d + this.f;
    }

    public final synchronized akzc b() {
        int i = this.f;
        byte[] bArr = this.e;
        if (i >= bArr.length) {
            this.c.add(new akza(this.e));
            this.e = a;
        } else if (i > 0) {
            this.c.add(new akza(java.util.Arrays.copyOf(bArr, i)));
        }
        this.d += this.f;
        this.f = 0;
        return akzc.s(this.c);
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString.Output@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(a()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        int i3 = this.f;
        int i4 = length - i3;
        if (i2 <= i4) {
            java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f += i2;
            return;
        }
        java.lang.System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        c(i5);
        java.lang.System.arraycopy(bArr, i + i4, this.e, 0, i5);
        this.f = i5;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.f == this.e.length) {
            c(1);
        }
        byte[] bArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
