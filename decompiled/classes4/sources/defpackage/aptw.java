package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aptw {
    public byte[] a;
    public int b;

    public aptw(byte[] bArr, int i) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i < 0 || i > bArr.length) {
            throw new java.lang.IllegalArgumentException();
        }
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
        this.b = i;
    }

    private final void g(int i) {
        byte[] bArr = new byte[java.lang.Math.max(this.a.length << 1, i)];
        java.lang.System.arraycopy(this.a, 0, bArr, 0, this.b);
        this.a = bArr;
    }

    public final byte a(int i) {
        if (i < 0 || i >= this.b) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return this.a[i];
    }

    public final void b(int i) {
        int i2 = this.b + 1;
        if (i2 > this.a.length) {
            g(i2);
        }
        this.a[this.b] = (byte) i;
        this.b = i2;
    }

    public final void c(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (bArr != null) {
            if (i < 0 || i > (length = bArr.length) || (i3 = i + i2) < 0 || i3 > length) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            int i4 = this.b + i2;
            if (i4 > this.a.length) {
                g(i4);
            }
            java.lang.System.arraycopy(bArr, i, this.a, this.b, i2);
            this.b = i4;
        }
    }

    public final void d() {
        this.b = 0;
    }

    public final byte[] e() {
        int i = this.b;
        byte[] bArr = new byte[i];
        if (i > 0) {
            java.lang.System.arraycopy(this.a, 0, bArr, 0, i);
        }
        return bArr;
    }

    public final void f(int i) {
        int i2 = this.b;
        if (i2 < 0 || i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i != 0) {
            int i3 = i2 - i;
            if (i3 > 0) {
                byte[] bArr = this.a;
                java.lang.System.arraycopy(bArr, i, bArr, 0, i3);
            }
            this.b -= i;
        }
    }

    public final java.lang.String toString() {
        return new java.lang.String(e());
    }

    public aptw(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Buffer capacity may not be negative");
        }
        this.a = new byte[i];
    }
}
