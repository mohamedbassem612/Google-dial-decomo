package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class etx {
    public byte[] b;
    public int c;
    public int d;
    private static final char[] e = {'\r', '\n'};
    private static final char[] f = {'\n'};
    public static final aihd a = aihd.u(java.nio.charset.StandardCharsets.US_ASCII, java.nio.charset.StandardCharsets.UTF_8, java.nio.charset.StandardCharsets.UTF_16, java.nio.charset.StandardCharsets.UTF_16BE, java.nio.charset.StandardCharsets.UTF_16LE);
    private static final java.util.concurrent.atomic.AtomicReference g = new java.util.concurrent.atomic.AtomicReference();

    public etx(int i) {
        this.b = new byte[i];
        this.d = i;
    }

    private final char U(java.nio.charset.Charset charset, char[] cArr) {
        int iX;
        if (d() < W(charset) || (iX = X(charset)) == 0) {
            return (char) 0;
        }
        long j = iX >>> 8;
        ahvr.bQ(true, "out of range: %s", j);
        int i = (int) j;
        if (java.lang.Character.isSupplementaryCodePoint(i)) {
            return (char) 0;
        }
        long j2 = i;
        char c = (char) j2;
        ahvr.bQ(((long) c) == j2, "Out of range: %s", j2);
        for (char c2 : cArr) {
            if (c2 == c) {
                this.c += aiql.P(iX & 255);
                return c;
            }
        }
        return (char) 0;
    }

    private static int V(int i, int i2, int i3, int i4) {
        return ((defpackage.ajee.e(((i & 7) << 2) | ((i2 & 48) >> 4)) & 255) << 16) | ((defpackage.ajee.e(((i2 & 15) << 4) | ((i3 & 60) >> 2)) & 255) << 8) | (defpackage.ajee.e(((i3 & 3) << 6) | (i4 & 63)) & 255);
    }

    private static int W(java.nio.charset.Charset charset) {
        ahvr.bR(a.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(java.nio.charset.StandardCharsets.UTF_8) || charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    private final int X(java.nio.charset.Charset charset) {
        int codePoint;
        int i;
        ahvr.bR(a.contains(charset), "Unsupported charset: %s", charset);
        if (d() < W(charset)) {
            throw new java.lang.IndexOutOfBoundsException("position=" + this.c + ", limit=" + this.d);
        }
        int i2 = 1;
        if (charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            byte b = this.b[this.c];
            if ((b & 128) != 0) {
                return 0;
            }
            codePoint = b & 255;
        } else if (charset.equals(java.nio.charset.StandardCharsets.UTF_8)) {
            byte b2 = this.b[this.c];
            if ((b2 & 128) == 0) {
                i = 1;
            } else if ((b2 & 224) == 192 && d() >= 2 && Z(this.b[this.c + 1])) {
                i = 2;
            } else if ((this.b[this.c] & 240) == 224 && d() >= 3) {
                byte[] bArr = this.b;
                int i3 = this.c;
                if (Z(bArr[i3 + 1]) && Z(bArr[i3 + 2])) {
                    i = 3;
                } else if ((this.b[this.c] & 248) == 240) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if ((this.b[this.c] & 248) == 240 || d() < 4) {
                i = 0;
            } else {
                byte[] bArr2 = this.b;
                int i4 = this.c;
                if (Z(bArr2[i4 + 1]) && Z(bArr2[i4 + 2]) && Z(bArr2[i4 + 3])) {
                    i = 4;
                } else {
                    i = 0;
                }
            }
            if (i == 1) {
                codePoint = this.b[this.c] & 255;
            } else if (i == 2) {
                byte[] bArr3 = this.b;
                int i5 = this.c;
                codePoint = V(0, 0, bArr3[i5], bArr3[i5 + 1]);
            } else if (i == 3) {
                byte[] bArr4 = this.b;
                int i6 = this.c;
                codePoint = V(0, bArr4[i6] & 15, bArr4[i6 + 1], bArr4[i6 + 2]);
            } else {
                if (i != 4) {
                    return 0;
                }
                byte[] bArr5 = this.b;
                int i7 = this.c;
                codePoint = V(bArr5[i7], bArr5[i7 + 1], bArr5[i7 + 2], bArr5[i7 + 3]);
            }
            i2 = i;
        } else {
            java.nio.ByteOrder byteOrder = charset.equals(java.nio.charset.StandardCharsets.UTF_16LE) ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN;
            char cB = b(byteOrder, 0);
            if (!java.lang.Character.isHighSurrogate(cB) || d() < 4) {
                codePoint = cB;
                i2 = 2;
            } else {
                codePoint = java.lang.Character.toCodePoint(cB, b(byteOrder, 2));
                i2 = 4;
            }
        }
        return (codePoint << 8) | i2;
    }

    private final void Y(int i, java.util.function.Function function) {
        java.lang.Boolean bool = (java.lang.Boolean) g.get();
        if (!(bool != null ? bool.booleanValue() : defpackage.eqe.b(8)) || d() >= i) {
            return;
        }
        throw ((java.lang.RuntimeException) aa$.ExternalSyntheticApiModelOutline1.m(function, "bytesNeeded= " + i + ", bytesLeft=" + d()));
    }

    private static boolean Z(byte b) {
        return (b & 192) == 128;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8 A[SYNTHETIC] */
    public final java.lang.String A(java.nio.charset.Charset charset) {
        byte[] bArr;
        ahvr.bR(a.contains(charset), "Unsupported charset: %s", charset);
        if (d() == 0) {
            return null;
        }
        if (!charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            E();
        }
        int i = 1;
        if (!charset.equals(java.nio.charset.StandardCharsets.UTF_8) && !charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            i = 2;
            if (!charset.equals(java.nio.charset.StandardCharsets.UTF_16) && !charset.equals(java.nio.charset.StandardCharsets.UTF_16LE) && !charset.equals(java.nio.charset.StandardCharsets.UTF_16BE)) {
                throw new java.lang.IllegalArgumentException("Unsupported charset: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(charset))));
            }
        }
        int i2 = this.c;
        while (true) {
            int i3 = this.d;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(java.nio.charset.StandardCharsets.UTF_8) || charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) && eum.W(this.b[i2])) {
                break;
            }
            if (charset.equals(java.nio.charset.StandardCharsets.UTF_16) || charset.equals(java.nio.charset.StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.b;
                if (bArr2[i2] == 0 && eum.W(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                    bArr = this.b;
                    if (bArr[i2 + 1] == 0 && eum.W(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                    bArr = this.b;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        java.lang.String strD = D(i2 - this.c, charset);
        if (this.c != this.d && U(charset, e) == '\r') {
            U(charset, f);
        }
        return strD;
    }

    public final java.lang.String B(int i) {
        Y(i, new defpackage.etw(1));
        if (i == 0) {
            return "";
        }
        int i2 = this.c;
        int i3 = (i2 + i) - 1;
        java.lang.String strI = eum.I(this.b, i2, (i3 >= this.d || this.b[i3] != 0) ? i : i - 1);
        this.c += i;
        return strI;
    }

    public final java.lang.String C(int i) {
        return D(i, java.nio.charset.StandardCharsets.UTF_8);
    }

    public final java.lang.String D(int i, java.nio.charset.Charset charset) {
        Y(i, new defpackage.etw(1));
        byte[] bArr = this.b;
        int i2 = this.c;
        java.lang.String str = new java.lang.String(bArr, i2, i, charset);
        this.c = i2 + i;
        return str;
    }

    public final java.nio.charset.Charset E() {
        if (d() >= 3) {
            byte[] bArr = this.b;
            int i = this.c;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.c = i + 3;
                return java.nio.charset.StandardCharsets.UTF_8;
            }
        }
        if (d() >= 2) {
            byte[] bArr2 = this.b;
            int i2 = this.c;
            byte b = bArr2[i2];
            if (b == -2) {
                if (bArr2[i2 + 1] == -1) {
                    this.c = i2 + 2;
                    return java.nio.charset.StandardCharsets.UTF_16BE;
                }
            } else if (b == -1 && bArr2[i2 + 1] == -2) {
                this.c = i2 + 2;
                return java.nio.charset.StandardCharsets.UTF_16LE;
            }
        }
        return null;
    }

    public final short F() {
        I(2);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        this.c = i + 2;
        return (short) (i3 | ((bArr[i2] & 255) << 8));
    }

    public final short G() {
        I(2);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        this.c = i + 2;
        return (short) ((i3 << 8) | (bArr[i2] & 255));
    }

    public final void H(int i) {
        if (i > e()) {
            this.b = java.util.Arrays.copyOf(this.b, i);
        }
    }

    public final void I(int i) {
        Y(i, new defpackage.etw(0));
    }

    public final void J(defpackage.etv etvVar, int i) {
        L((byte[]) etvVar.c, 0, i);
        etvVar.l(0);
    }

    public final void K(java.nio.ByteBuffer byteBuffer, int i) {
        I(i);
        byteBuffer.put(this.b, this.c, i);
        this.c += i;
    }

    public final void L(byte[] bArr, int i, int i2) {
        I(i2);
        java.lang.System.arraycopy(this.b, this.c, bArr, i, i2);
        this.c += i2;
    }

    public final void M(int i) {
        O(e() < i ? new byte[i] : this.b, i);
    }

    public final void N(byte[] bArr) {
        O(bArr, bArr.length);
    }

    public final void O(byte[] bArr, int i) {
        this.b = bArr;
        this.d = i;
        this.c = 0;
    }

    public final void P(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.b.length) {
            z = true;
        }
        ahvr.bM(z);
        this.d = i;
    }

    public final void Q(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.d) {
            z = true;
        }
        ahvr.bM(z);
        this.c = i;
    }

    public final void R(int i) {
        Q(this.c + i);
    }

    public final void S() {
        while ((n() & 128) != 0) {
        }
    }

    public final java.lang.String T() {
        if (d() == 0) {
            return null;
        }
        int i = this.c;
        while (i < this.d && this.b[i] != 0) {
            i++;
        }
        byte[] bArr = this.b;
        int i2 = this.c;
        java.lang.String strI = eum.I(bArr, i2, i - i2);
        this.c = i;
        if (i < this.d) {
            this.c = i + 1;
        }
        return strI;
    }

    public final byte a() {
        if (d() > 0) {
            byte[] bArr = this.b;
            int i = this.c;
            this.c = i + 1;
            return bArr[i];
        }
        throw new java.lang.IndexOutOfBoundsException("position=" + this.c + ", limit=" + this.d);
    }

    public final char b(java.nio.ByteOrder byteOrder, int i) {
        byte b;
        byte b2;
        I(2);
        java.nio.ByteOrder byteOrder2 = java.nio.ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.b;
        if (byteOrder == byteOrder2) {
            int i2 = this.c + i;
            b = bArr[i2];
            b2 = bArr[i2 + 1];
        } else {
            int i3 = this.c + i;
            b = bArr[i3 + 1];
            b2 = bArr[i3];
        }
        return (char) ((b << 8) | (b2 & 255));
    }

    public final double c() {
        return java.lang.Double.longBitsToDouble(v());
    }

    public final int d() {
        return java.lang.Math.max(this.d - this.c, 0);
    }

    public final int e() {
        return this.b.length;
    }

    public final int f(java.nio.charset.Charset charset) {
        int iX = X(charset);
        if (iX != 0) {
            return aiql.P(iX >>> 8);
        }
        return 1114112;
    }

    public final int g() {
        if (d() >= 4) {
            int i = i();
            this.c -= 4;
            return i;
        }
        throw new java.lang.IndexOutOfBoundsException("position=" + this.c + ", limit=" + this.d);
    }

    public final int h() {
        I(1);
        return this.b[this.c] & 255;
    }

    public final int i() {
        I(4);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.c = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.c = i6;
        int i7 = bArr[i4] & 255;
        this.c = i + 4;
        return (i3 << 24) | (i5 << 16) | (i7 << 8) | (bArr[i6] & 255);
    }

    public final int j() {
        I(4);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.c = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.c = i6;
        int i7 = bArr[i4] & 255;
        this.c = i + 4;
        return i3 | (i5 << 8) | (i7 << 16) | ((bArr[i6] & 255) << 24);
    }

    public final int k() {
        int iJ = j();
        if (iJ >= 0) {
            return iJ;
        }
        throw new java.lang.IllegalStateException(a.bj(iJ, "Top bit not zero: "));
    }

    public final int l() {
        I(2);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        this.c = i + 2;
        return i3 | ((bArr[i2] & 255) << 8);
    }

    public final int m() {
        return (n() << 21) | (n() << 14) | (n() << 7) | n();
    }

    public final int n() {
        I(1);
        byte[] bArr = this.b;
        int i = this.c;
        this.c = i + 1;
        return bArr[i] & 255;
    }

    public final int o() {
        I(4);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        this.c = i + 2;
        int i4 = bArr[i2] & 255;
        this.c = i + 4;
        return (i3 << 8) | i4;
    }

    public final int p() {
        I(3);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.c = i4;
        int i5 = bArr[i2] & 255;
        this.c = i + 3;
        return (i3 << 16) | (i5 << 8) | (bArr[i4] & 255);
    }

    public final int q() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new java.lang.IllegalStateException(a.bj(i, "Top bit not zero: "));
    }

    public final int r() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.c == this.d) {
                throw new java.lang.IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jN = n();
            j |= (127 & jN) << (i * 7);
            if ((jN & 128) == 0) {
                break;
            }
        }
        return aiql.P(j);
    }

    public final int s() {
        I(2);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        int i3 = bArr[i] & 255;
        this.c = i + 2;
        return (i3 << 8) | (bArr[i2] & 255);
    }

    public final long t() {
        I(8);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.c = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.c = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.c = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.c = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.c = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.c = i8;
        long j7 = bArr[i7];
        this.c = i + 8;
        return (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40) | ((j7 & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    public final long u() {
        I(4);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.c = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.c = i4;
        long j3 = bArr[i3];
        this.c = i + 4;
        return (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    public final long v() {
        I(8);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.c = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.c = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.c = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.c = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.c = i7;
        long j6 = bArr[i6];
        int i8 = i + 7;
        this.c = i8;
        long j7 = bArr[i7];
        this.c = i + 8;
        return ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public final long w() {
        I(4);
        byte[] bArr = this.b;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.c = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.c = i4;
        long j3 = bArr[i3];
        this.c = i + 4;
        return ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    public final long x() {
        long jV = v();
        if (jV >= 0) {
            return jV;
        }
        throw new java.lang.IllegalStateException(a.bz(jV, "Top bit not zero: "));
    }

    public final long y() {
        int i;
        I(1);
        long j = this.b[this.c];
        int i2 = 7;
        while (true) {
            i = 0;
            if (i2 < 0) {
                break;
            }
            int i3 = 1 << i2;
            if ((((long) i3) & j) == 0) {
                if (i2 >= 6) {
                    if (i2 != 7) {
                        break;
                    }
                    i = 1;
                    break;
                }
                j &= (long) (i3 - 1);
                i = 7 - i2;
                break;
            }
            i2--;
        }
        if (i == 0) {
            throw new java.lang.NumberFormatException(a.bz(j, "Invalid UTF-8 sequence first byte: "));
        }
        I(i);
        for (int i4 = 1; i4 < i; i4++) {
            byte b = this.b[this.c + i4];
            if ((b & 192) != 128) {
                throw new java.lang.NumberFormatException(a.bz(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.c += i;
        return j;
    }

    public final java.lang.String z() {
        return A(java.nio.charset.StandardCharsets.UTF_8);
    }

    public etx() {
        this.b = eum.b;
    }

    public etx(byte[] bArr, int i) {
        this.b = bArr;
        this.d = i;
    }

    public etx(byte[] bArr) {
        this.b = bArr;
        this.d = bArr.length;
    }
}
