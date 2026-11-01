package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class akzd extends defpackage.akzf {
    private final byte[] a;
    private final int b;
    private int c;
    private int j;
    private final int k;
    private int l;
    private int m = Integer.MAX_VALUE;

    public akzd(byte[] bArr, int i, int i2) {
        this.a = bArr;
        int i3 = i2 + i;
        this.b = i3;
        this.c = i3;
        this.j = i;
        this.k = i;
    }

    private final void H(int i) {
        this.m = i;
        int i2 = this.b;
        if (i > i2) {
            i = i2;
        }
        this.c = i;
    }

    @Override // defpackage.akzf
    public final void A(int i) throws defpackage.alaz {
        if (this.l != i) {
            throw new defpackage.alaz("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.akzf
    public final void B(int i) {
        H(i);
    }

    @Override // defpackage.akzf
    public final void C(int i) throws defpackage.alaz {
        if (i < 0) {
            throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.c;
        int i3 = this.j;
        if (i > i2 - i3) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.j = i3 + i;
    }

    @Override // defpackage.akzf
    public final boolean D() {
        return this.j == this.c;
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
            if (this.c - this.j < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new defpackage.alaz("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.a;
                int i4 = this.j;
                this.j = i4 + 1;
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
    public final byte[] G(int i) throws defpackage.alaz {
        if (i <= 0) {
            if (i == 0) {
                return defpackage.alau.a;
            }
            throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.c;
        int i3 = this.j;
        if (i > i2 - i3) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = i + i3;
        this.j = i4;
        return java.util.Arrays.copyOfRange(this.a, i3, i4);
    }

    public final byte a() throws defpackage.alaz {
        int i = this.j;
        if (i == this.c) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.j = i + 1;
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
        int i = this.m;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.j;
    }

    @Override // defpackage.akzf
    public final int e() {
        return this.j - this.k;
    }

    @Override // defpackage.akzf
    public final int f(int i) {
        if (i < 0) {
            throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.j;
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
            if (i > Integer.MAX_VALUE - (i2 - this.k)) {
                throw new defpackage.alaz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
        }
        int i4 = this.m;
        if (i3 > i4) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        H(i3);
        return i4;
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
        int i = this.j;
        if (this.c - i < 4) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.j = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Override // defpackage.akzf
    public final int k() throws defpackage.alaz {
        try {
            int i = this.j;
            byte[] bArr = this.a;
            int i2 = i + 1;
            int i3 = bArr[i];
            if (i3 < 0) {
                int i4 = i + 2;
                int i5 = i3 ^ (bArr[i2] << 7);
                if (i5 < 0) {
                    i3 = i5 ^ (-128);
                } else {
                    i2 = i + 3;
                    int i6 = i5 ^ (bArr[i4] << 14);
                    if (i6 >= 0) {
                        i3 = i6 ^ 16256;
                    } else {
                        i4 = i + 4;
                        int i7 = i6 ^ (bArr[i2] << 21);
                        if (i7 < 0) {
                            i3 = i7 ^ (-2080896);
                        } else {
                            i2 = i + 5;
                            int i8 = bArr[i4];
                            i3 = (i7 ^ (i8 << 28)) ^ 266354560;
                            if (i8 < 0) {
                                i4 = i + 6;
                                if (bArr[i2] < 0) {
                                    i2 = i + 7;
                                    if (bArr[i4] < 0) {
                                        i4 = i + 8;
                                        if (bArr[i2] < 0) {
                                            i2 = i + 9;
                                            if (bArr[i4] < 0) {
                                                int i9 = i + 10;
                                                if (bArr[i2] < 0) {
                                                    throw new defpackage.alaz("CodedInputStream encountered a malformed varint.");
                                                }
                                                i2 = i9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i4;
            }
            this.j = i2;
            if (i2 <= this.c) {
                return i3;
            }
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (defpackage.alaz e) {
            if (this.j > this.c) {
                throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw e;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.akzf
    public final int l() {
        return j();
    }

    @Override // defpackage.akzf
    public final int m() throws defpackage.alaz {
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
    public final int p(byte[] bArr, int i, int i2) {
        defpackage.akzf.L(bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        int iMin = java.lang.Math.min(i2, this.c - this.j);
        if (iMin == 0) {
            return -1;
        }
        java.lang.System.arraycopy(this.a, this.j, bArr, i, iMin);
        this.j += iMin;
        return iMin;
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
        int i = this.j;
        if (this.c - i < 8) {
            throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.j = i + 8;
        return (bArr[i] & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.akzf
    public final long t() throws defpackage.alaz {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        int i2;
        int i3 = this.j;
        int i4 = this.c;
        long j5 = 0;
        if (i4 != i3) {
            byte[] bArr = this.a;
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
                            long j6 = ((long) i9) ^ (((long) bArr[i6]) << 28);
                            if (j6 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i3 + 6;
                                long j7 = j6 ^ (((long) bArr[i]) << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i = i3 + 7;
                                    j6 = j7 ^ (((long) bArr[i10]) << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j7 = j6 ^ (((long) bArr[i]) << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i = i3 + 9;
                                            j6 = j7 ^ (((long) bArr[i10]) << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                byte b2 = bArr[i];
                                                long j8 = j6 ^ (((long) b2) << 63);
                                                if (j8 >= 0) {
                                                    int i11 = i3 + 10;
                                                    if (b2 >= 0) {
                                                        j = j8 ^ (-9151873028817141888L);
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                        j4 = j;
                                    }
                                }
                                j = j7 ^ j3;
                                i = i10;
                                j4 = j;
                            }
                            j = j6 ^ j2;
                            j4 = j;
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
        for (int i12 = 0; i12 < 64; i12 += 7) {
            byte bA = a();
            j5 |= ((long) (bA & 127)) << i12;
            if ((bA & 128) == 0) {
                return j5;
            }
        }
        throw new defpackage.alaz("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.akzf
    public final long u() {
        return s();
    }

    @Override // defpackage.akzf
    public final long v() throws defpackage.alaz {
        long jT = t();
        return (jT >>> 1) ^ (-(jT & 1));
    }

    @Override // defpackage.akzf
    public final long w() {
        return t();
    }

    @Override // defpackage.akzf
    public final defpackage.akzc x() throws defpackage.alaz {
        int iK = k();
        if (iK > 0) {
            int i = this.c;
            int i2 = this.j;
            if (iK <= i - i2) {
                defpackage.akzc akzcVarE = defpackage.akzc.E(this.a, i2, iK);
                this.j += iK;
                return akzcVarE;
            }
        }
        return iK == 0 ? defpackage.akzc.d : defpackage.akzc.G(G(iK));
    }

    @Override // defpackage.akzf
    public final java.lang.String y() throws defpackage.alaz {
        int iK = k();
        if (iK > 0) {
            int i = this.c;
            int i2 = this.j;
            if (iK <= i - i2) {
                java.lang.String str = new java.lang.String(this.a, i2, iK, java.nio.charset.StandardCharsets.UTF_8);
                this.j += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.akzf
    public final java.lang.String z() throws defpackage.alaz {
        int iK = k();
        if (iK > 0) {
            int i = this.c;
            int i2 = this.j;
            if (iK <= i - i2) {
                java.lang.String strN = defpackage.ajsz.N(this.a, i2, iK);
                this.j += iK;
                return strN;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK <= 0) {
            throw new defpackage.alaz("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new defpackage.alaz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
