package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akze extends defpackage.akzf {
    public final byte[] a;
    public int b;
    public int c;
    private final java.io.InputStream j;
    private int k;
    private int l;
    private int m;
    private int n = Integer.MAX_VALUE;

    public akze(java.io.InputStream inputStream, int i) {
        this.j = inputStream;
        this.a = new byte[i < 8 ? 8 : i];
        this.b = 0;
        this.c = 0;
        this.m = 0;
    }

    private static int P(java.io.InputStream inputStream, byte[] bArr, int i, int i2) throws defpackage.alaz {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (defpackage.alaz e) {
            e.a();
            throw e;
        }
    }

    private final java.util.List Q(int i) throws defpackage.alaz {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i > 0) {
            int iMin = java.lang.Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int iP = P(this.j, bArr, i2, iMin - i2);
                if (iP == -1) {
                    throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.m += iP;
                i2 += iP;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void R() {
        int i = this.b + this.k;
        this.b = i;
        int i2 = this.m + i;
        int i3 = this.n;
        if (i2 <= i3) {
            this.k = 0;
            return;
        }
        int i4 = i2 - i3;
        this.k = i4;
        this.b = i - i4;
    }

    private final void S(int i) throws defpackage.alaz {
        if (U(i)) {
            return;
        }
        if (!T(this.m + this.c, i, this.g)) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new defpackage.alaz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private static boolean T(int i, int i2, int i3) {
        return i3 < i || i2 > i3 - i;
    }

    private final boolean U(int i) throws java.io.IOException {
        int i2 = this.c;
        int i3 = i2 + i;
        int i4 = this.b;
        if (i3 <= i4) {
            throw new java.lang.IllegalStateException(defpackage.a.bs(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.m + i2;
        if (T(i5, i, this.g) || T(i5, i, this.n)) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.a;
                java.lang.System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            this.m += i2;
            this.b -= i2;
            this.c = 0;
        }
        while (true) {
            int i6 = this.b;
            if (i6 >= i) {
                return true;
            }
            int i7 = (this.g - this.m) - i6;
            if (i7 <= 0) {
                return false;
            }
            byte[] bArr2 = this.a;
            int length = bArr2.length;
            try {
                int i8 = this.j.read(bArr2, this.b, java.lang.Math.min(length - i6, i7));
                if (i8 == 0 || i8 < -1 || i8 > length) {
                    throw new java.lang.IllegalStateException(java.lang.String.valueOf(this.j.getClass()) + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
                }
                if (i8 <= 0) {
                    return false;
                }
                this.b += i8;
                R();
            } catch (defpackage.alaz e) {
                e.a();
                throw e;
            }
        }
    }

    private final byte[] V(int i) throws java.io.IOException {
        if (i == 0) {
            return defpackage.alau.a;
        }
        if (i < 0) {
            throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.m;
        int i3 = this.c;
        int i4 = i2 + i3;
        if (T(i4, i, this.g)) {
            throw new defpackage.alaz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.n;
        if (T(i4, i, i5)) {
            if (i5 >= i4) {
                C(i5 - i4);
            }
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.b - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.j.available()) {
                    return null;
                }
            } catch (defpackage.alaz e) {
                e.a();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.a, this.c, bArr, 0, i6);
        this.m += this.b;
        this.c = 0;
        this.b = 0;
        while (i6 < i) {
            try {
                int i8 = this.j.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.m += i8;
                i6 += i8;
            } catch (defpackage.alaz e2) {
                e2.a();
                throw e2;
            }
        }
        return bArr;
    }

    @Override // defpackage.akzf
    public final void A(int i) throws defpackage.alaz {
        if (this.l != i) {
            throw new defpackage.alaz("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.akzf
    public final void B(int i) {
        this.n = i;
        R();
    }

    @Override // defpackage.akzf
    public final void C(int i) throws defpackage.alaz {
        int i2 = this.b;
        int i3 = this.c;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.c = i3 + i;
            return;
        }
        if (i < 0) {
            throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.m + i3;
        if (T(i5, i, this.g)) {
            throw new defpackage.alaz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.n;
        if (T(i5, i, i6)) {
            if (i6 >= i5) {
                C(i6 - i5);
            }
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = i5;
        this.b = 0;
        this.c = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.j.skip(j);
                    if (jSkip >= 0 && jSkip <= j) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i4 += (int) jSkip;
                        }
                    } else {
                        throw new java.lang.IllegalStateException(java.lang.String.valueOf(this.j.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (defpackage.alaz e) {
                    e.a();
                    throw e;
                }
            } catch (java.lang.Throwable th) {
                this.m += i4;
                R();
                throw th;
            }
        }
        this.m += i4;
        R();
        if (i4 >= i) {
            return;
        }
        int i7 = this.b;
        int i8 = i7 - this.c;
        this.c = i7;
        S(1);
        while (true) {
            int i9 = i - i8;
            int i10 = this.b;
            if (i9 <= i10) {
                this.c = i9;
                return;
            } else {
                i8 += i10;
                this.c = i10;
                S(1);
            }
        }
    }

    @Override // defpackage.akzf
    public final boolean D() {
        return this.c == this.b && !U(1);
    }

    @Override // defpackage.akzf
    public final boolean E() {
        return t() != 0;
    }

    @Override // defpackage.akzf
    public final boolean F(int i) throws defpackage.alaz {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.b - this.c < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new defpackage.alaz("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.a;
                int i4 = this.c;
                this.c = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new defpackage.alaz("CodedInputStream encountered a malformed varint.");
        }
        if (i2 == 1) {
            C(8);
        } else if (i2 == 2) {
            C(k());
        } else if (i2 == 3) {
            N();
            A(((i >>> 3) << 3) | 4);
        } else {
            if (i2 == 4) {
                M();
                return false;
            }
            if (i2 != 5) {
                throw new defpackage.alay();
            }
            C(4);
        }
        return true;
    }

    @Override // defpackage.akzf
    public final byte[] G(int i) {
        int i2 = this.c;
        if (i > this.b - i2 || i <= 0) {
            return I(i);
        }
        int i3 = i + i2;
        this.c = i3;
        return java.util.Arrays.copyOfRange(this.a, i2, i3);
    }

    final long H() throws defpackage.alaz {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bA = a();
            j |= ((long) (bA & 127)) << i;
            if ((bA & 128) == 0) {
                return j;
            }
        }
        throw new defpackage.alaz("CodedInputStream encountered a malformed varint.");
    }

    public final byte[] I(int i) throws java.io.IOException {
        byte[] bArrV = V(i);
        if (bArrV != null) {
            return bArrV;
        }
        int i2 = this.c;
        int i3 = this.b;
        int i4 = i3 - i2;
        this.m += i3;
        this.c = 0;
        this.b = 0;
        java.util.List<byte[]> listQ = Q(i - i4);
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.a, i2, bArr, 0, i4);
        for (byte[] bArr2 : listQ) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte a() throws defpackage.alaz {
        if (this.c == this.b) {
            S(1);
        }
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        return bArr[i];
    }

    @Override // defpackage.akzf
    public final double b() {
        return java.lang.Double.longBitsToDouble(s());
    }

    @Override // defpackage.akzf
    public final float c() {
        return java.lang.Float.intBitsToFloat(j());
    }

    @Override // defpackage.akzf
    public final int d() {
        int i = this.n;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.m + this.c);
    }

    @Override // defpackage.akzf
    public final int e() {
        return this.m + this.c;
    }

    @Override // defpackage.akzf
    public final int f(int i) throws defpackage.alaz {
        if (i < 0) {
            throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.m + this.c;
        if (i > Integer.MAX_VALUE - i2) {
            throw new defpackage.alaz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.n;
        if (T(i2, i, i3)) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.n = i2 + i;
        R();
        return i3;
    }

    @Override // defpackage.akzf
    public final int g() {
        return k();
    }

    @Override // defpackage.akzf
    public final int h() {
        return j();
    }

    @Override // defpackage.akzf
    public final int i() {
        return k();
    }

    public final int j() throws defpackage.alaz {
        int i = this.c;
        if (this.b - i < 4) {
            S(4);
            i = this.c;
        }
        byte[] bArr = this.a;
        this.c = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L31;
     */
    @Override // defpackage.akzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k() {
        /*
            r6 = this;
            int r0 = r6.c
            int r1 = r6.b
            if (r1 == r0) goto L6b
            byte[] r2 = r6.a
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L11
            r6.c = r3
            goto L70
        L11:
            int r1 = r1 - r3
            r5 = 9
            if (r1 < r5) goto L6b
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r4 = r4 ^ r3
            if (r4 >= 0) goto L22
            r4 = r4 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            r4 = r4 ^ r1
            if (r4 < 0) goto L2f
            r4 = r4 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r0 + 4
            r3 = r2[r3]
            int r3 = r3 << 21
            r4 = r4 ^ r3
            if (r4 >= 0) goto L3d
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r4 = r4 ^ r0
            goto L68
        L3d:
            int r3 = r0 + 5
            r1 = r2[r1]
            int r5 = r1 << 28
            r4 = r4 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r4 = r4 ^ r5
            if (r1 >= 0) goto L2d
            int r1 = r0 + 6
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r0 + 7
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r0 + 8
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r0 + 9
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r0 + 10
            r0 = r2[r3]
            if (r0 < 0) goto L6b
        L68:
            r6.c = r1
            goto L70
        L6b:
            long r0 = r6.H()
            int r4 = (int) r0
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akze.k():int");
    }

    @Override // defpackage.akzf
    public final int l() {
        return j();
    }

    @Override // defpackage.akzf
    public final int m() {
        int iK = k();
        return (iK >>> 1) ^ (-(iK & 1));
    }

    @Override // defpackage.akzf
    public final int n() throws defpackage.alaz {
        if (D()) {
            this.l = 0;
            return 0;
        }
        int iK = k();
        this.l = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new defpackage.alaz("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.akzf
    public final int o() {
        return k();
    }

    @Override // defpackage.akzf
    public final int p(byte[] bArr, int i, int i2) throws defpackage.alaz {
        defpackage.akzf.L(bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.b;
        int i4 = this.c;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int iMin = java.lang.Math.min(i2, i5);
            java.lang.System.arraycopy(this.a, this.c, bArr, i, iMin);
            this.c += iMin;
            return iMin;
        }
        int iMin2 = java.lang.Math.min(this.n, this.g) - (this.m + i4);
        if (iMin2 <= 0) {
            return -1;
        }
        int iP = P(this.j, bArr, i, java.lang.Math.min(i2, iMin2));
        if (iP != -1) {
            this.m += iP;
        }
        return iP;
    }

    @Override // defpackage.akzf
    public final long q() {
        return s();
    }

    @Override // defpackage.akzf
    public final long r() {
        return t();
    }

    public final long s() throws defpackage.alaz {
        int i = this.c;
        if (this.b - i < 8) {
            S(8);
            i = this.c;
        }
        byte[] bArr = this.a;
        this.c = i + 8;
        return (bArr[i] & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.akzf
    public final long t() {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        int i2;
        int i3 = this.c;
        int i4 = this.b;
        if (i4 != i3) {
            byte[] bArr = this.a;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.c = i5;
                return b;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = b ^ (bArr[i5] << 7);
                if (i7 >= 0) {
                    i = i3 + 3;
                    int i8 = i7 ^ (bArr[i6] << 14);
                    if (i8 >= 0) {
                        j4 = i8 ^ 16256;
                    } else {
                        i6 = i3 + 4;
                        int i9 = i8 ^ (bArr[i] << 21);
                        if (i9 < 0) {
                            i2 = i9 ^ (-2080896);
                        } else {
                            i = i3 + 5;
                            long j5 = ((long) i9) ^ (((long) bArr[i6]) << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i3 + 6;
                                long j6 = j5 ^ (((long) bArr[i]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i = i3 + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j6 = j5 ^ (((long) bArr[i]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i = i3 + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                byte b2 = bArr[i];
                                                long j7 = j5 ^ (((long) b2) << 63);
                                                if (j7 >= 0) {
                                                    int i11 = i3 + 10;
                                                    if (b2 >= 0) {
                                                        j = j7 ^ (-9151873028817141888L);
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                        j4 = j;
                                    }
                                }
                                j = j6 ^ j3;
                                i = i10;
                                j4 = j;
                            }
                            j = j5 ^ j2;
                            j4 = j;
                        }
                    }
                    this.c = i;
                    return j4;
                }
                i2 = i7 ^ (-128);
                i = i6;
                j4 = i2;
                this.c = i;
                return j4;
            }
        }
        return H();
    }

    @Override // defpackage.akzf
    public final long u() {
        return s();
    }

    @Override // defpackage.akzf
    public final long v() {
        long jT = t();
        return (jT >>> 1) ^ (-(jT & 1));
    }

    @Override // defpackage.akzf
    public final long w() {
        return t();
    }

    @Override // defpackage.akzf
    public final defpackage.akzc x() throws java.io.IOException {
        int iK = k();
        int i = this.b;
        int i2 = this.c;
        if (iK <= i - i2 && iK > 0) {
            defpackage.akzc akzcVarE = defpackage.akzc.E(this.a, i2, iK);
            this.c += iK;
            return akzcVarE;
        }
        if (iK == 0) {
            return defpackage.akzc.d;
        }
        if (iK < 0) {
            throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrV = V(iK);
        if (bArrV != null) {
            return defpackage.akzc.E(bArrV, 0, bArrV.length);
        }
        int i3 = this.c;
        int i4 = this.b;
        int i5 = i4 - i3;
        this.m += i4;
        this.c = 0;
        this.b = 0;
        java.util.List<byte[]> listQ = Q(iK - i5);
        byte[] bArr = new byte[iK];
        java.lang.System.arraycopy(this.a, i3, bArr, 0, i5);
        for (byte[] bArr2 : listQ) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return defpackage.akzc.y(bArr);
    }

    @Override // defpackage.akzf
    public final java.lang.String y() throws defpackage.alaz {
        int iK = k();
        if (iK > 0) {
            int i = this.b;
            int i2 = this.c;
            if (iK <= i - i2) {
                java.lang.String str = new java.lang.String(this.a, i2, iK, java.nio.charset.StandardCharsets.UTF_8);
                this.c += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iK > this.b) {
            return new java.lang.String(I(iK), java.nio.charset.StandardCharsets.UTF_8);
        }
        S(iK);
        java.lang.String str2 = new java.lang.String(this.a, this.c, iK, java.nio.charset.StandardCharsets.UTF_8);
        this.c += iK;
        return str2;
    }

    @Override // defpackage.akzf
    public final java.lang.String z() throws java.io.IOException {
        byte[] bArrI;
        int iK = k();
        int i = this.c;
        int i2 = this.b;
        if (iK <= i2 - i && iK > 0) {
            bArrI = this.a;
            this.c = i + iK;
        } else {
            if (iK == 0) {
                return "";
            }
            if (iK < 0) {
                throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iK <= i2) {
                S(iK);
                bArrI = this.a;
                this.c = iK;
            } else {
                bArrI = I(iK);
            }
        }
        return iK != 0 ? defpackage.ajsz.N(bArrI, i, iK) : "";
    }
}
