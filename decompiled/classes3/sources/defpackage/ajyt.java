package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajyt {
    public java.nio.ByteBuffer a;
    public int b;
    int c;
    public int[] d;
    public int e;
    public boolean f;
    boolean g;
    public int h;
    public int[] i;
    public int j;
    int k;
    defpackage.ajyr l;

    public ajyt(int i, defpackage.ajyr ajyrVar, byte[] bArr) {
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.i = new int[16];
        this.j = 0;
        this.k = 0;
        this.l = ajyrVar;
        java.nio.ByteBuffer byteBufferA = ajyrVar.a(i <= 0 ? 1024 : i);
        this.a = byteBufferA;
        this.b = byteBufferA.capacity();
    }

    public final int a(java.lang.CharSequence charSequence) {
        char c;
        boolean z;
        int i;
        int i2;
        int i3;
        char cCharAt;
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && charSequence.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            c = 2048;
            z = true;
            if (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 >= 2048) {
                    int length2 = charSequence.length();
                    int i7 = 0;
                    while (i5 < length2) {
                        char cCharAt3 = charSequence.charAt(i5);
                        if (cCharAt3 < 2048) {
                            i7 += (127 - cCharAt3) >>> 31;
                        } else {
                            i7 += 2;
                            if (cCharAt3 >= 55296 && cCharAt3 <= 57343) {
                                if (java.lang.Character.codePointAt(charSequence, i5) < 65536) {
                                    throw new defpackage.ajyv(i5, length2);
                                }
                                i5++;
                            }
                        }
                        i5++;
                    }
                    i6 += i7;
                    break;
                }
                i6 += (127 - cCharAt2) >>> 31;
                i5++;
            } else {
                break;
            }
        }
        if (i6 < length) {
            throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i6) + 4294967296L));
        }
        i(1, 0);
        java.nio.ByteBuffer byteBuffer = this.a;
        int i8 = this.b - 1;
        this.b = i8;
        byteBuffer.put(i8, (byte) 0);
        m(1, i6, 1);
        java.nio.ByteBuffer byteBuffer2 = this.a;
        int i9 = this.b - i6;
        this.b = i9;
        byteBuffer2.position(i9);
        java.nio.ByteBuffer byteBuffer3 = this.a;
        if (byteBuffer3.hasArray()) {
            int iArrayOffset = byteBuffer3.arrayOffset();
            byte[] bArrArray = byteBuffer3.array();
            int iPosition = byteBuffer3.position() + iArrayOffset;
            int iRemaining = byteBuffer3.remaining();
            int length3 = charSequence.length();
            int i10 = iRemaining + iPosition;
            while (i4 < length3) {
                int i11 = i4 + iPosition;
                if (i11 >= i10 || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                bArrArray[i11] = (byte) cCharAt;
                i4++;
            }
            if (i4 == length3) {
                i = iPosition + length3;
            } else {
                i = iPosition + i4;
                while (i4 < length3) {
                    char cCharAt4 = charSequence.charAt(i4);
                    if (cCharAt4 >= 128 || i >= i10) {
                        if (cCharAt4 < c && i <= i10 - 2) {
                            i2 = i + 2;
                            bArrArray[i] = (byte) ((cCharAt4 >>> 6) | 960);
                            bArrArray[i + 1] = (byte) ((cCharAt4 & '?') | 128);
                        } else {
                            if ((cCharAt4 >= 55296 && cCharAt4 <= 57343) || i > i10 - 3) {
                                z = z;
                                if (i > i10 - 4) {
                                    if (cCharAt4 >= 55296 && cCharAt4 <= 57343 && ((i3 = i4 + 1) == charSequence.length() || !java.lang.Character.isSurrogatePair(cCharAt4, charSequence.charAt(i3)))) {
                                        throw new defpackage.ajyv(i4, length3);
                                    }
                                    throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + cCharAt4 + " at index " + i);
                                }
                                int i12 = i4 + 1;
                                if (i12 != charSequence.length()) {
                                    char cCharAt5 = charSequence.charAt(i12);
                                    if (java.lang.Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                        int i13 = i + 3;
                                        int codePoint = java.lang.Character.toCodePoint(cCharAt4, cCharAt5);
                                        bArrArray[i] = (byte) ((codePoint >>> 18) | 240);
                                        bArrArray[i + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        bArrArray[i + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i += 4;
                                        bArrArray[i13] = (byte) ((codePoint & 63) | 128);
                                        i4 = i12;
                                    } else {
                                        i4 = i12;
                                    }
                                }
                                throw new defpackage.ajyv(i4 - 1, length3);
                            }
                            i2 = i + 3;
                            bArrArray[i] = (byte) ((cCharAt4 >>> '\f') | 480);
                            bArrArray[i + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                            bArrArray[i + 2] = (byte) ((cCharAt4 & '?') | 128);
                        }
                        i = i2;
                    } else {
                        bArrArray[i] = (byte) cCharAt4;
                        z = z;
                        i++;
                    }
                    i4++;
                    z = z;
                    c = 2048;
                }
            }
            byteBuffer3.position(i - iArrayOffset);
        } else {
            defpackage.agwm.r(charSequence, byteBuffer3);
        }
        return b();
    }

    public final int b() {
        if (!this.f) {
            throw new java.lang.AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f = false;
        j(this.k);
        return c();
    }

    public final int c() {
        return this.a.capacity() - this.b;
    }

    public final java.nio.ByteBuffer d() {
        if (this.g) {
            return this.a;
        }
        throw new java.lang.AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
    }

    public final void e(int i) {
        i(4, 0);
        j(i);
    }

    public final void f(int i) {
        i(4, 0);
        j((c() - i) + 4);
    }

    public final void g(short s) {
        i(2, 0);
        java.nio.ByteBuffer byteBuffer = this.a;
        int i = this.b - 2;
        this.b = i;
        byteBuffer.putShort(i, s);
    }

    public final void h() {
        if (this.f) {
            throw new java.lang.AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public final void i(int i, int i2) {
        int i3;
        if (i > this.c) {
            this.c = i;
        }
        int i4 = i - 1;
        int i5 = ~((this.a.capacity() - this.b) + i2);
        while (true) {
            int i6 = (i5 + 1) & i4;
            if (this.b >= i6 + i + i2) {
                for (int i7 = 0; i7 < i6; i7++) {
                    java.nio.ByteBuffer byteBuffer = this.a;
                    int i8 = this.b - 1;
                    this.b = i8;
                    byteBuffer.put(i8, (byte) 0);
                }
                return;
            }
            int iCapacity = this.a.capacity();
            java.nio.ByteBuffer byteBuffer2 = this.a;
            defpackage.ajyr ajyrVar = this.l;
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity2 == 0) {
                i3 = 1024;
            } else {
                i3 = 2147483639;
                if (iCapacity2 == 2147483639) {
                    throw new java.lang.AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & iCapacity2) == 0) {
                    i3 = iCapacity2 << 1;
                }
            }
            byteBuffer2.position(0);
            java.nio.ByteBuffer byteBufferA = ajyrVar.a(i3);
            byteBufferA.position(byteBufferA.clear().capacity() - iCapacity2);
            byteBufferA.put(byteBuffer2);
            this.a = byteBufferA;
            this.b += byteBufferA.capacity() - iCapacity;
        }
    }

    public final void j(int i) {
        java.nio.ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putInt(i2, i);
    }

    public final void k(int i) {
        this.d[i] = c();
    }

    public final void l(int i) {
        h();
        int[] iArr = this.d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
            this.d = iArr;
        }
        this.e = i;
        java.util.Arrays.fill(iArr, 0, i, 0);
        this.f = true;
        this.h = c();
    }

    public final void m(int i, int i2, int i3) {
        h();
        this.k = i2;
        int i4 = i * i2;
        i(4, i4);
        i(i3, i4);
        this.f = true;
    }

    public final void n(int i, int i2) {
        if (i2 != 0) {
            e(i2);
            k(i);
        }
    }

    public final void o(int i, int i2) {
        if (i2 != 0) {
            f(i2);
            k(i);
        }
    }

    public final void p(int i) {
        i(this.c, 4);
        f(i);
        this.a.position(this.b);
        this.g = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ajyt(int i, defpackage.ajyr ajyrVar) {
        this(i, ajyrVar, null);
        defpackage.agwm.s();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ajyt() {
        defpackage.ajys ajysVar = defpackage.ajys.a;
        defpackage.agwm.s();
        this(1024, ajysVar, null);
    }
}
