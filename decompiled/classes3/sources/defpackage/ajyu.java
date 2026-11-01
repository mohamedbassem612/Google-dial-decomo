package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ajyu {
    public int a;
    public java.nio.ByteBuffer b;
    private int c;
    private int d;

    public ajyu() {
        defpackage.agwm.s();
    }

    public static /* synthetic */ int J(defpackage.ajyu ajyuVar) {
        int iH = ajyuVar.h(6);
        if (iH != 0) {
            return ajyuVar.b.getInt(iH + ajyuVar.a);
        }
        return 0;
    }

    public final java.lang.String A() {
        int iH = h(4);
        if (iH != 0) {
            return k(iH + this.a);
        }
        return null;
    }

    public final java.lang.String B() {
        int iH = h(6);
        if (iH != 0) {
            return k(iH + this.a);
        }
        return null;
    }

    public final boolean C() {
        int iH = h(12);
        return (iH == 0 || this.b.get(iH + this.a) == 0) ? false : true;
    }

    public final defpackage.ajyu D() {
        defpackage.ajyu ajyuVar = new defpackage.ajyu();
        int iH = h(4);
        if (iH == 0) {
            return null;
        }
        int iG = g(iH + this.a);
        java.nio.ByteBuffer byteBuffer = this.b;
        aooh.e(byteBuffer, "bb");
        aooh.f(byteBuffer, "_bb");
        aooh.f(byteBuffer, "_bb");
        ajyuVar.l(iG, byteBuffer);
        return ajyuVar;
    }

    public final defpackage.ajyu E() {
        defpackage.ajyu ajyuVar = new defpackage.ajyu();
        int iH = h(10);
        if (iH == 0) {
            return null;
        }
        int iG = g(iH + this.a);
        java.nio.ByteBuffer byteBuffer = this.b;
        aooh.e(byteBuffer, "bb");
        aooh.f(byteBuffer, "_bb");
        aooh.f(byteBuffer, "_bb");
        ajyuVar.l(iG, byteBuffer);
        return ajyuVar;
    }

    public final defpackage.ajyu F(int i) {
        defpackage.ajyu ajyuVar = new defpackage.ajyu();
        int iH = h(4);
        if (iH == 0) {
            return null;
        }
        int iG = g(i(iH) + (i << 2));
        java.nio.ByteBuffer byteBuffer = this.b;
        aooh.e(byteBuffer, "bb");
        aooh.f(byteBuffer, "_bb");
        aooh.f(byteBuffer, "_bb");
        ajyuVar.l(iG, byteBuffer);
        return ajyuVar;
    }

    public final defpackage.ajyu G() {
        defpackage.ajyu ajyuVar = new defpackage.ajyu();
        int iH = h(6);
        if (iH == 0) {
            return null;
        }
        int iG = g(iH + this.a);
        java.nio.ByteBuffer byteBuffer = this.b;
        aooh.e(byteBuffer, "bb");
        aooh.f(byteBuffer, "_bb");
        aooh.f(byteBuffer, "_bb");
        ajyuVar.l(iG, byteBuffer);
        return ajyuVar;
    }

    public final defpackage.ajyu H(int i) {
        defpackage.ajyu ajyuVar = new defpackage.ajyu();
        int iH = h(4);
        if (iH == 0) {
            return null;
        }
        int iG = g(i(iH) + (i << 2));
        java.nio.ByteBuffer byteBuffer = this.b;
        aooh.e(byteBuffer, "bb");
        aooh.f(byteBuffer, "_bb");
        aooh.f(byteBuffer, "_bb");
        ajyuVar.l(iG, byteBuffer);
        return ajyuVar;
    }

    public final defpackage.ajyu I() {
        defpackage.ajyu ajyuVar = new defpackage.ajyu();
        int iH = h(8);
        if (iH == 0) {
            return null;
        }
        int iG = g(iH + this.a);
        java.nio.ByteBuffer byteBuffer = this.b;
        aooh.e(byteBuffer, "bb");
        aooh.f(byteBuffer, "_bb");
        aooh.f(byteBuffer, "_bb");
        ajyuVar.l(iG, byteBuffer);
        return ajyuVar;
    }

    public int a() {
        int iH = h(14);
        if (iH != 0) {
            return this.b.getInt(iH + this.a);
        }
        return 0;
    }

    public defpackage.ajyu d() {
        defpackage.ajyu ajyuVar = new defpackage.ajyu();
        int iH = h(10);
        if (iH == 0) {
            return null;
        }
        int iG = g(iH + this.a);
        java.nio.ByteBuffer byteBuffer = this.b;
        aooh.e(byteBuffer, "bb");
        ajyuVar.n(iG, byteBuffer);
        return ajyuVar;
    }

    public final int g(int i) {
        return i + this.b.getInt(i);
    }

    public final int h(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }

    public final int i(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    public final int j(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2 + this.b.getInt(i2));
    }

    public final java.lang.String k(int i) {
        char[] cArr;
        int i2;
        int i3;
        int i4;
        java.nio.ByteBuffer byteBuffer = this.b;
        int i5 = i + byteBuffer.getInt(i);
        int i6 = byteBuffer.getInt(i5);
        int i7 = i5 + 4;
        if (byteBuffer.hasArray()) {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + i7;
            int length = bArrArray.length;
            if ((iArrayOffset | i6 | ((length - iArrayOffset) - i6)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(iArrayOffset), java.lang.Integer.valueOf(i6)));
            }
            int i8 = iArrayOffset + i6;
            cArr = new char[i6];
            int i9 = 0;
            while (iArrayOffset < i8) {
                byte b = bArrArray[iArrayOffset];
                if (!defpackage.agmc.R(b)) {
                    break;
                }
                iArrayOffset++;
                defpackage.agmc.O(b, cArr, i9);
                i9++;
            }
            i2 = i9;
            while (iArrayOffset < i8) {
                int i10 = iArrayOffset + 1;
                byte b2 = bArrArray[iArrayOffset];
                if (defpackage.agmc.R(b2)) {
                    defpackage.agmc.O(b2, cArr, i2);
                    i2++;
                    iArrayOffset = i10;
                    while (iArrayOffset < i8) {
                        byte b3 = bArrArray[iArrayOffset];
                        if (!defpackage.agmc.R(b3)) {
                            break;
                        }
                        iArrayOffset++;
                        defpackage.agmc.O(b3, cArr, i2);
                        i2++;
                    }
                } else {
                    if (defpackage.agmc.T(b2)) {
                        if (i10 >= i8) {
                            throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                        }
                        i4 = i2 + 1;
                        iArrayOffset += 2;
                        defpackage.agmc.Q(b2, bArrArray[i10], cArr, i2);
                    } else if (defpackage.agmc.S(b2)) {
                        if (i10 >= i8 - 1) {
                            throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                        }
                        i4 = i2 + 1;
                        int i11 = iArrayOffset + 2;
                        iArrayOffset += 3;
                        defpackage.agmc.P(b2, bArrArray[i10], bArrArray[i11], cArr, i2);
                    } else {
                        if (i10 >= i8 - 2) {
                            throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                        }
                        byte b4 = bArrArray[i10];
                        int i12 = iArrayOffset + 3;
                        byte b5 = bArrArray[iArrayOffset + 2];
                        iArrayOffset += 4;
                        defpackage.agmc.N(b2, b4, b5, bArrArray[i12], cArr, i2);
                        i2 += 2;
                    }
                    i2 = i4;
                }
            }
        } else {
            if ((i7 | i6 | ((byteBuffer.limit() - i7) - i6)) < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i7), java.lang.Integer.valueOf(i6)));
            }
            int i13 = i7 + i6;
            cArr = new char[i6];
            int i14 = 0;
            while (i7 < i13) {
                byte b6 = byteBuffer.get(i7);
                if (!defpackage.agmc.R(b6)) {
                    break;
                }
                i7++;
                defpackage.agmc.O(b6, cArr, i14);
                i14++;
            }
            i2 = i14;
            while (i7 < i13) {
                int i15 = i7 + 1;
                byte b7 = byteBuffer.get(i7);
                if (defpackage.agmc.R(b7)) {
                    defpackage.agmc.O(b7, cArr, i2);
                    i2++;
                    i7 = i15;
                    while (i7 < i13) {
                        byte b8 = byteBuffer.get(i7);
                        if (!defpackage.agmc.R(b8)) {
                            break;
                        }
                        i7++;
                        defpackage.agmc.O(b8, cArr, i2);
                        i2++;
                    }
                } else {
                    if (defpackage.agmc.T(b7)) {
                        if (i15 >= i13) {
                            throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                        }
                        i3 = i2 + 1;
                        i7 += 2;
                        defpackage.agmc.Q(b7, byteBuffer.get(i15), cArr, i2);
                    } else if (defpackage.agmc.S(b7)) {
                        if (i15 >= i13 - 1) {
                            throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                        }
                        i3 = i2 + 1;
                        int i16 = i7 + 2;
                        i7 += 3;
                        defpackage.agmc.P(b7, byteBuffer.get(i15), byteBuffer.get(i16), cArr, i2);
                    } else {
                        if (i15 >= i13 - 2) {
                            throw new java.lang.IllegalArgumentException("Invalid UTF-8");
                        }
                        byte b9 = byteBuffer.get(i15);
                        int i17 = i7 + 3;
                        byte b10 = byteBuffer.get(i7 + 2);
                        i7 += 4;
                        defpackage.agmc.N(b7, b9, b10, byteBuffer.get(i17), cArr, i2);
                        i2 += 2;
                    }
                    i2 = i3;
                }
            }
        }
        return new java.lang.String(cArr, 0, i2);
    }

    public final void l(int i, java.nio.ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            s = this.b.getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.c = 0;
        }
        this.d = s;
    }

    public final long m() {
        int iH = h(4);
        if (iH != 0) {
            return this.b.getLong(iH + this.a);
        }
        return 0L;
    }

    public final void n(int i, java.nio.ByteBuffer byteBuffer) {
        aooh.f(byteBuffer, "_bb");
        aooh.f(byteBuffer, "_bb");
        l(i, byteBuffer);
    }

    public final byte o() {
        int iH = h(4);
        if (iH != 0) {
            return this.b.get(iH + this.a);
        }
        return (byte) 0;
    }

    public final float p(int i) {
        int iH = h(6);
        if (iH != 0) {
            return this.b.getFloat(i(iH) + (i << 2));
        }
        return 0.0f;
    }

    public final int q() {
        int iH = h(6);
        if (iH != 0) {
            return j(iH);
        }
        return 0;
    }

    public final int r() {
        int iH = h(4);
        if (iH != 0) {
            return j(iH);
        }
        return 0;
    }

    public final float s() {
        int iH = h(6);
        if (iH != 0) {
            return this.b.getFloat(iH + this.a);
        }
        return 0.0f;
    }

    public final java.lang.String t() {
        int iH = h(4);
        if (iH != 0) {
            return k(iH + this.a);
        }
        return null;
    }

    public final byte u() {
        int iH = h(4);
        if (iH != 0) {
            return this.b.get(iH + this.a);
        }
        return (byte) 0;
    }

    public final b v() {
        b bVar = new b();
        int iH = h(12);
        if (iH == 0) {
            return null;
        }
        int iG = g(iH + this.a);
        java.nio.ByteBuffer byteBuffer = this.b;
        aooh.e(byteBuffer, "bb");
        aooh.f(byteBuffer, "_bb");
        aooh.f(byteBuffer, "_bb");
        bVar.l(iG, byteBuffer);
        return bVar;
    }

    public final int w() {
        int iH = h(4);
        if (iH != 0) {
            return j(iH);
        }
        return 0;
    }

    public final int x() {
        int iH = h(10);
        if (iH != 0) {
            return this.b.getInt(iH + this.a);
        }
        return 0;
    }

    public final int y() {
        int iH = h(4);
        if (iH != 0) {
            return this.b.getInt(iH + this.a);
        }
        return 0;
    }

    public final int z() {
        int iH = h(14);
        if (iH != 0) {
            return this.b.getInt(iH + this.a);
        }
        return 0;
    }

    public ajyu(int[] iArr) {
        this();
    }

    public ajyu(byte[] bArr) {
        this();
    }

    public ajyu(char[] cArr) {
        this();
    }

    public ajyu(short[] sArr) {
        this();
    }

    public ajyu(boolean[] zArr) {
        this();
    }
}
