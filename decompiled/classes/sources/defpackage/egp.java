package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class egp extends defpackage.egq {
    private final java.io.InputStream f;
    private final byte[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m = Integer.MAX_VALUE;

    public egp(java.io.InputStream inputStream) {
        byte[] bArr = defpackage.ehl.a;
        this.f = inputStream;
        this.g = new byte[4096];
        this.h = 0;
        this.j = 0;
        this.l = 0;
    }

    private static int I(java.io.InputStream inputStream, byte[] bArr, int i, int i2) throws defpackage.eho {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (defpackage.eho e) {
            e.a();
            throw e;
        }
    }

    private final java.util.List J(int i) throws defpackage.eho {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i > 0) {
            int iMin = java.lang.Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int I = I(this.f, bArr, i2, iMin - i2);
                if (I == -1) {
                    throw new defpackage.eho("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.l += I;
                i2 += I;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void K() {
        int i = this.h + this.i;
        this.h = i;
        int i2 = this.l + i;
        int i3 = this.m;
        if (i2 <= i3) {
            this.i = 0;
            return;
        }
        int i4 = i2 - i3;
        this.i = i4;
        this.h = i - i4;
    }

    private final void L(int i) throws defpackage.eho {
        if (N(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.l) - this.j) {
            throw new defpackage.eho("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new defpackage.eho("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private static boolean M(int i, int i2, int i3) {
        return i3 < i || i2 > i3 - i;
    }

    private final boolean N(int i) throws defpackage.eho {
        int i2 = this.j;
        int i3 = i2 + i;
        int i4 = this.h;
        if (i3 <= i4) {
            throw new java.lang.IllegalStateException(defpackage.a.bs(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.l;
        int i6 = i5 + i2;
        if (M(i6, i, Integer.MAX_VALUE) || M(i6, i, this.m)) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.g;
                java.lang.System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.l + i2;
            this.l = i5;
            i4 = this.h - i2;
            this.h = i4;
            this.j = 0;
        }
        java.io.InputStream inputStream = this.f;
        int I = I(inputStream, this.g, i4, java.lang.Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
        if (I != 0 && I >= -1 && I <= 4096) {
            if (I <= 0) {
                return false;
            }
            this.h += I;
            K();
            return this.h >= i || N(i);
        }
        throw new java.lang.IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
    }

    private final byte[] O(int i) throws defpackage.eho {
        if (i == 0) {
            return defpackage.ehl.a;
        }
        int i2 = this.l;
        int i3 = this.j;
        int i4 = i2 + i3;
        if (M(i4, i, Integer.MAX_VALUE)) {
            throw new defpackage.eho("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.m;
        if (M(i4, i, i5)) {
            if (i5 >= i4) {
                E(i5 - i4);
            }
            throw new defpackage.eho("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.h - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.f.available()) {
                    return null;
                }
            } catch (defpackage.eho e) {
                e.a();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.g, this.j, bArr, 0, i6);
        this.l += this.h;
        this.j = 0;
        this.h = 0;
        while (i6 < i) {
            int I = I(this.f, bArr, i6, i - i6);
            if (I == -1) {
                throw new defpackage.eho("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.l += I;
            i6 += I;
        }
        return bArr;
    }

    private final byte[] P(int i) throws defpackage.eho {
        byte[] bArrO = O(i);
        if (bArrO != null) {
            return bArrO;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i3 - i2;
        this.l += i3;
        this.j = 0;
        this.h = 0;
        java.util.List<byte[]> listJ = J(i - i4);
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.g, i2, bArr, 0, i4);
        for (byte[] bArr2 : listJ) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    @Override // defpackage.egq
    public final boolean A() {
        return this.j == this.h && !N(1);
    }

    @Override // defpackage.egq
    public final boolean B() {
        return z() != 0;
    }

    @Override // defpackage.egq
    public final boolean C(int i) throws defpackage.eho {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.h - this.j < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new defpackage.eho("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.g;
                int i4 = this.j;
                this.j = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new defpackage.eho("CodedInputStream encountered a malformed varint.");
        }
        if (i2 == 1) {
            E(8);
        } else if (i2 == 2) {
            E(j());
        } else if (i2 == 3) {
            H();
            x(((i >>> 3) << 3) | 4);
        } else {
            if (i2 == 4) {
                G();
                return false;
            }
            if (i2 != 5) {
                throw new defpackage.ehn();
            }
            E(4);
        }
        return true;
    }

    final long D() throws defpackage.eho {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bA = a();
            j |= ((long) (bA & 127)) << i;
            if ((bA & 128) == 0) {
                return j;
            }
        }
        throw new defpackage.eho("CodedInputStream encountered a malformed varint.");
    }

    public final void E(int i) throws defpackage.eho {
        int i2 = this.h;
        int i3 = this.j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.j = i3 + i;
            return;
        }
        if (i < 0) {
            throw new defpackage.eho("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.l + i3;
        if (M(i5, i, Integer.MAX_VALUE)) {
            throw new defpackage.eho("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.m;
        if (M(i5, i, i6)) {
            if (i6 >= i5) {
                E(i6 - i5);
            }
            throw new defpackage.eho("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.l = i5;
        this.h = 0;
        this.j = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.f.skip(j);
                    if (jSkip >= 0 && jSkip <= j) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i4 += (int) jSkip;
                        }
                    } else {
                        throw new java.lang.IllegalStateException(this.f.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (defpackage.eho e) {
                    e.a();
                    throw e;
                }
            } catch (java.lang.Throwable th) {
                this.l += i4;
                K();
                throw th;
            }
        }
        this.l += i4;
        K();
        if (i4 >= i) {
            return;
        }
        int i7 = this.h;
        int i8 = i7 - this.j;
        this.j = i7;
        L(1);
        while (true) {
            int i9 = i - i8;
            int i10 = this.h;
            if (i9 <= i10) {
                this.j = i9;
                return;
            } else {
                i8 += i10;
                this.j = i10;
                L(1);
            }
        }
    }

    public final byte a() throws defpackage.eho {
        if (this.j == this.h) {
            L(1);
        }
        byte[] bArr = this.g;
        int i = this.j;
        this.j = i + 1;
        return bArr[i];
    }

    @Override // defpackage.egq
    public final double b() {
        return java.lang.Double.longBitsToDouble(q());
    }

    @Override // defpackage.egq
    public final float c() {
        return java.lang.Float.intBitsToFloat(i());
    }

    @Override // defpackage.egq
    public final int d() {
        return this.l + this.j;
    }

    @Override // defpackage.egq
    public final int e(int i) throws defpackage.eho {
        if (i < 0) {
            throw new defpackage.eho("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.l + this.j;
        if (i > Integer.MAX_VALUE - i2) {
            throw new defpackage.eho("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.m;
        if (M(i2, i, i3)) {
            throw new defpackage.eho("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = i2 + i;
        K();
        return i3;
    }

    @Override // defpackage.egq
    public final int f() {
        return j();
    }

    @Override // defpackage.egq
    public final int g() {
        return i();
    }

    @Override // defpackage.egq
    public final int h() {
        return j();
    }

    public final int i() throws defpackage.eho {
        int i = this.j;
        if (this.h - i < 4) {
            L(4);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            r6 = this;
            int r0 = r6.j
            int r1 = r6.h
            if (r1 == r0) goto L6b
            byte[] r2 = r6.g
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L11
            r6.j = r3
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
            r6.j = r1
            goto L70
        L6b:
            long r0 = r6.D()
            int r4 = (int) r0
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egp.j():int");
    }

    @Override // defpackage.egq
    public final int k() {
        return i();
    }

    @Override // defpackage.egq
    public final int l() {
        int iJ = j();
        return (iJ >>> 1) ^ (-(iJ & 1));
    }

    @Override // defpackage.egq
    public final int m() throws defpackage.eho {
        if (A()) {
            this.k = 0;
            return 0;
        }
        int iJ = j();
        this.k = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new defpackage.eho("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.egq
    public final int n() {
        return j();
    }

    @Override // defpackage.egq
    public final long o() {
        return q();
    }

    @Override // defpackage.egq
    public final long p() {
        return z();
    }

    public final long q() throws defpackage.eho {
        int i = this.j;
        if (this.h - i < 8) {
            L(8);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 8;
        return (bArr[i] & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.egq
    public final long r() {
        return q();
    }

    @Override // defpackage.egq
    public final long s() {
        long jZ = z();
        return (jZ >>> 1) ^ (-(jZ & 1));
    }

    @Override // defpackage.egq
    public final long t() {
        return z();
    }

    @Override // defpackage.egq
    public final defpackage.egm u() throws defpackage.eho {
        int iJ = j();
        int i = this.h;
        int i2 = this.j;
        if (iJ <= i - i2 && iJ > 0) {
            defpackage.egm egmVarK = defpackage.egm.k(this.g, i2, iJ);
            this.j += iJ;
            return egmVarK;
        }
        if (iJ == 0) {
            return defpackage.egm.d;
        }
        if (iJ < 0) {
            throw new defpackage.eho("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrO = O(iJ);
        if (bArrO != null) {
            return defpackage.egm.k(bArrO, 0, bArrO.length);
        }
        int i3 = this.j;
        int i4 = this.h;
        int i5 = i4 - i3;
        this.l += i4;
        this.j = 0;
        this.h = 0;
        java.util.List<byte[]> listJ = J(iJ - i5);
        byte[] bArr = new byte[iJ];
        java.lang.System.arraycopy(this.g, i3, bArr, 0, i5);
        for (byte[] bArr2 : listJ) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return defpackage.egm.i(bArr);
    }

    @Override // defpackage.egq
    public final java.lang.String v() throws defpackage.eho {
        int iJ = j();
        if (iJ > 0) {
            int i = this.h;
            int i2 = this.j;
            if (iJ <= i - i2) {
                java.lang.String str = new java.lang.String(this.g, i2, iJ, java.nio.charset.StandardCharsets.UTF_8);
                this.j += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw new defpackage.eho("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iJ > this.h) {
            return new java.lang.String(P(iJ), java.nio.charset.StandardCharsets.UTF_8);
        }
        L(iJ);
        java.lang.String str2 = new java.lang.String(this.g, this.j, iJ, java.nio.charset.StandardCharsets.UTF_8);
        this.j += iJ;
        return str2;
    }

    @Override // defpackage.egq
    public final java.lang.String w() throws defpackage.eho {
        byte[] bArrP;
        int iJ = j();
        int i = this.j;
        int i2 = this.h;
        if (iJ <= i2 - i && iJ > 0) {
            bArrP = this.g;
            this.j = i + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw new defpackage.eho("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iJ <= i2) {
                L(iJ);
                bArrP = this.g;
                this.j = iJ;
            } else {
                bArrP = P(iJ);
            }
        }
        return defpackage.eiz.c(bArrP, i, iJ);
    }

    @Override // defpackage.egq
    public final void x(int i) throws defpackage.eho {
        if (this.k != i) {
            throw new defpackage.eho("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.egq
    public final void y(int i) {
        this.m = i;
        K();
    }

    public final long z() {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        int i2;
        int i3 = this.j;
        int i4 = this.h;
        if (i4 != i3) {
            byte[] bArr = this.g;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.j = i5;
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
                                    j = -34093383808L;
                                } else {
                                    i = i3 + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j6 = j5 ^ (((long) bArr[i]) << 49);
                                        if (j6 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            i = i3 + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                i10 = i3 + 10;
                                                j6 = j5 ^ (((long) bArr[i]) << 63);
                                                if (j6 >= 0) {
                                                    j = -9151873028817141888L;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j6 ^ j;
                                i = i10;
                                j4 = j3;
                            }
                            j3 = j5 ^ j2;
                            j4 = j3;
                        }
                    }
                    this.j = i;
                    return j4;
                }
                i2 = i7 ^ (-128);
                i = i6;
                j4 = i2;
                this.j = i;
                return j4;
            }
        }
        return D();
    }
}
