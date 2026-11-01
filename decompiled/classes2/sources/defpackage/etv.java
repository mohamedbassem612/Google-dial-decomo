package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class etv {
    public int a;
    public int b;
    public java.lang.Object c;
    private int d;

    public etv(char[] cArr) {
        this.b = 7;
        this.c = new int[8];
    }

    public final int a() {
        return ((this.d - this.a) << 3) - this.b;
    }

    public final int b() {
        ahvr.bY(this.b == 0);
        return this.a;
    }

    public final int c() {
        return (this.a << 3) + this.b;
    }

    public final int d(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.b += i;
        int i3 = 0;
        while (true) {
            i2 = this.b;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.b = i4;
            java.lang.Object obj = this.c;
            int i5 = this.a;
            this.a = i5 + 1;
            i3 |= (((byte[]) obj)[i5] & 255) << i4;
        }
        java.lang.Object obj2 = this.c;
        int i6 = this.a;
        int i7 = i3 | ((((byte[]) obj2)[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.b = 0;
            this.a = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        g();
        return i9;
    }

    public final long e(int i) {
        if (i <= 32) {
            return eum.B(d(i));
        }
        return (eum.B(d(i - 32)) << 32) | eum.B(d(32));
    }

    public final java.lang.String f(int i, java.nio.charset.Charset charset) {
        byte[] bArr = new byte[i];
        r(bArr, i);
        return new java.lang.String(bArr, charset);
    }

    public final void g() {
        int i;
        int i2 = this.a;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.b == 0))) {
            z = true;
        }
        ahvr.bY(z);
    }

    public final void h() {
        if (this.b != 0) {
            this.b = 0;
            this.a++;
            g();
        }
    }

    public final void i(defpackage.etx etxVar) {
        k(etxVar.b, etxVar.d);
        l(etxVar.c << 3);
    }

    public final void j(byte[] bArr) {
        k(bArr, bArr.length);
    }

    public final void k(byte[] bArr, int i) {
        this.c = bArr;
        this.a = 0;
        this.b = 0;
        this.d = i;
    }

    public final void l(int i) {
        int i2 = i / 8;
        this.a = i2;
        this.b = i - (i2 << 3);
        g();
    }

    public final void m() {
        int i = this.b + 1;
        this.b = i;
        if (i == 8) {
            this.b = 0;
            this.a++;
        }
        g();
    }

    public final void n(int i) {
        int i2 = i / 8;
        int i3 = this.a + i2;
        this.a = i3;
        int i4 = this.b + (i - (i2 << 3));
        this.b = i4;
        if (i4 > 7) {
            this.a = i3 + 1;
            this.b = i4 - 8;
        }
        g();
    }

    public final void o(int i) {
        ahvr.bY(this.b == 0);
        this.a += i;
        g();
    }

    public final boolean p() {
        int i = ((byte[]) this.c)[this.a] & (128 >> this.b);
        m();
        return i != 0;
    }

    public final void q(byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i >> 3;
            if (i3 >= i2) {
                break;
            }
            java.lang.Object obj = this.c;
            int i4 = this.a;
            int i5 = i4 + 1;
            this.a = i5;
            byte[] bArr2 = (byte[]) obj;
            byte b = bArr2[i4];
            int i6 = this.b;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (b2 | ((bArr2[i5] & 255) >> (8 - i6)));
            i3++;
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (255 >> i7));
            bArr[i2] = b3;
            int i8 = this.b;
            if (i8 + i7 > 8) {
                java.lang.Object obj2 = this.c;
                int i9 = this.a;
                this.a = i9 + 1;
                b3 = (byte) (b3 | ((((byte[]) obj2)[i9] & 255) << i8));
                bArr[i2] = b3;
                i8 -= 8;
            }
            int i10 = i8 + i7;
            this.b = i10;
            java.lang.Object obj3 = this.c;
            int i11 = this.a;
            bArr[i2] = (byte) (b3 | ((byte) (((((byte[]) obj3)[i11] & 255) >> (8 - i10)) << (8 - i7))));
            if (i10 == 8) {
                this.b = 0;
                this.a = i11 + 1;
            }
            g();
        }
    }

    public final void r(byte[] bArr, int i) {
        ahvr.bY(this.b == 0);
        java.lang.System.arraycopy(this.c, this.a, bArr, 0, i);
        this.a += i;
        g();
    }

    public final int s() {
        int i = this.d;
        if (i == this.a) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        int i2 = ((int[]) this.c)[i];
        this.d = (i + 1) & this.b;
        return i2;
    }

    public final void t(int i) {
        java.lang.Object obj = this.c;
        int i2 = this.a;
        int[] iArr = (int[]) obj;
        iArr[i2] = i;
        int i3 = (i2 + 1) & this.b;
        this.a = i3;
        int i4 = this.d;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            java.lang.System.arraycopy(obj, i4, iArr2, 0, i5);
            java.lang.System.arraycopy(this.c, 0, iArr2, i5, this.d);
            this.c = iArr2;
            this.d = 0;
            this.a = length;
            this.b = i6 - 1;
        }
    }

    public final void u() {
        this.a = this.d;
    }

    public final boolean v() {
        return this.d == this.a;
    }

    public etv(byte[] bArr, int i) {
        this.c = bArr;
        this.d = i;
    }

    public etv() {
        this.c = eum.b;
    }

    public etv(byte[] bArr) {
        this(bArr, bArr.length);
    }
}
