package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class egs extends egv {
    private final byte[] a;
    private final int c;
    private int d;

    public egs(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), 0, java.lang.Integer.valueOf(i)));
        }
        this.a = bArr;
        this.d = 0;
        this.c = i;
    }

    public final void a(byte[] bArr, int i, int i2) throws defpackage.egt {
        d(bArr, i, i2);
    }

    public final int b() {
        return this.c - this.d;
    }

    public final void c(byte b) throws defpackage.egt {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.a[i] = b;
                this.d = i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new defpackage.egt(i, this.c, 1, e);
            }
        } catch (java.lang.IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void d(byte[] bArr, int i, int i2) throws defpackage.egt {
        try {
            java.lang.System.arraycopy(bArr, i, this.a, this.d, i2);
            this.d += i2;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new defpackage.egt(this.d, this.c, i2, e);
        }
    }

    public final void e(int i, boolean z) throws defpackage.egt {
        u(i << 3);
        c(z ? (byte) 1 : (byte) 0);
    }

    public final void f(int i, egm egmVar) throws defpackage.egt {
        u((i << 3) | 2);
        g(egmVar);
    }

    public final void g(egm egmVar) throws defpackage.egt {
        u(egmVar.b());
        egmVar.d(this);
    }

    public final void h(int i, int i2) throws defpackage.egt {
        u((i << 3) | 5);
        i(i2);
    }

    public final void i(int i) throws defpackage.egt {
        int i2 = this.d;
        try {
            byte[] bArr = this.a;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new defpackage.egt(i2, this.c, 4, e);
        }
    }

    public final void j(int i, long j) throws defpackage.egt {
        u((i << 3) | 1);
        k(j);
    }

    public final void k(long j) throws defpackage.egt {
        int i = this.d;
        try {
            byte[] bArr = this.a;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.d = i + 8;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new defpackage.egt(i, this.c, 8, e);
        }
    }

    public final void l(int i, int i2) throws defpackage.egt {
        u(i << 3);
        m(i2);
    }

    public final void m(int i) throws defpackage.egt {
        if (i >= 0) {
            u(i);
            return;
        }
        int i2 = this.d;
        try {
            byte[] bArr = this.a;
            long j = i;
            int i3 = i2 + 1;
            try {
                bArr[i2] = (byte) (((int) j) | 128);
                int i4 = i2 + 2;
                try {
                    bArr[i3] = (byte) (((int) (j >>> 7)) | 128);
                    int i5 = i2 + 3;
                    bArr[i4] = (byte) (((int) (j >>> 14)) | 128);
                    i4 = i2 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | 128);
                    int i6 = i2 + 5;
                    bArr[i4] = (byte) (((int) (j >>> 28)) | 128);
                    int i7 = i2 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i2 + 7;
                        bArr[i7] = -1;
                        i7 = i2 + 8;
                        bArr[i8] = -1;
                        i3 = i2 + 9;
                        bArr[i7] = -1;
                        i2 += 10;
                        bArr[i3] = 1;
                        this.d = i2;
                    } catch (java.lang.IndexOutOfBoundsException e) {
                        e = e;
                        i2 = i7;
                        throw new defpackage.egt(i2, this.c, 10, e);
                    }
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    e = e2;
                    i2 = i4;
                }
            } catch (java.lang.IndexOutOfBoundsException e3) {
                i2 = i3;
                e = e3;
            }
        } catch (java.lang.IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    public final void n(ehw ehwVar) throws defpackage.egt {
        u(ehwVar.h());
        ehwVar.r(this);
    }

    public final void o(int i, ehw ehwVar) throws defpackage.egt {
        u(11);
        t(2, i);
        u(26);
        n(ehwVar);
        u(12);
    }

    public final void p(int i, egm egmVar) throws defpackage.egt {
        u(11);
        t(2, i);
        f(3, egmVar);
        u(12);
    }

    public final void q(int i, java.lang.String str) throws defpackage.egt {
        u((i << 3) | 2);
        r(str);
    }

    public final void r(java.lang.String str) throws defpackage.egt {
        int i = this.d;
        try {
            int iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(str.length() * 3) * 9;
            int iNumberOfLeadingZeros2 = (352 - (java.lang.Integer.numberOfLeadingZeros(str.length()) * 9)) >>> 6;
            if (iNumberOfLeadingZeros2 != ((352 - iNumberOfLeadingZeros) >>> 6)) {
                u(eiz.b(str));
                byte[] bArr = this.a;
                int i2 = this.d;
                this.d = eiz.a(str, bArr, i2, bArr.length - i2);
                return;
            }
            int i3 = i + iNumberOfLeadingZeros2;
            this.d = i3;
            byte[] bArr2 = this.a;
            int iA = eiz.a(str, bArr2, i3, bArr2.length - i3);
            this.d = i;
            u((iA - i) - iNumberOfLeadingZeros2);
            this.d = iA;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new defpackage.egt(e);
        }
    }

    public final void s(int i, int i2) throws defpackage.egt {
        u((i << 3) | i2);
    }

    public final void t(int i, int i2) throws defpackage.egt {
        u(i << 3);
        u(i2);
    }

    public final void u(int i) throws defpackage.egt {
        int i2 = this.d;
        int i3 = i & (-128);
        try {
            byte[] bArr = this.a;
            try {
                if (i3 == 0) {
                    int i4 = i2 + 1;
                    bArr[i2] = (byte) i;
                    this.d = i4;
                    i3 = i4;
                } else {
                    int i5 = i2 + 1;
                    bArr[i2] = (byte) (i | 128);
                    int i6 = i >>> 7;
                    if ((i6 & (-128)) == 0) {
                        int i7 = i2 + 2;
                        bArr[i5] = (byte) i6;
                        this.d = i7;
                        i3 = i5;
                    } else {
                        int i8 = i2 + 2;
                        try {
                            bArr[i5] = (byte) (i6 | 128);
                            int i9 = i >>> 14;
                            if ((i9 & (-128)) == 0) {
                                int i10 = i2 + 3;
                                bArr[i8] = (byte) i9;
                                this.d = i10;
                                i3 = i9;
                            } else {
                                int i11 = i2 + 3;
                                try {
                                    bArr[i8] = (byte) (i9 | 128);
                                    int i12 = i >>> 21;
                                    if ((i12 & (-128)) == 0) {
                                        int i13 = i2 + 4;
                                        bArr[i11] = (byte) i12;
                                        this.d = i13;
                                        i3 = i12;
                                    } else {
                                        i8 = i2 + 4;
                                        byte b = (byte) (i12 | 128);
                                        bArr[i11] = b;
                                        int i14 = i2 + 5;
                                        bArr[i8] = (byte) (i >>> 28);
                                        this.d = i14;
                                        i3 = b;
                                    }
                                } catch (java.lang.IndexOutOfBoundsException e) {
                                    e = e;
                                    i2 = i11;
                                    throw new defpackage.egt(i2, this.c, 1, e);
                                }
                            }
                        } catch (java.lang.IndexOutOfBoundsException e2) {
                            e = e2;
                            i2 = i8;
                        }
                    }
                }
            } catch (java.lang.IndexOutOfBoundsException e3) {
                e = e3;
                i2 = i3;
            }
        } catch (java.lang.IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    public final void v(int i, long j) throws defpackage.egt {
        u(i << 3);
        w(j);
    }

    public final void w(long j) throws defpackage.egt {
        long j2 = j & (-128);
        int i = this.d;
        try {
            byte[] bArr = this.a;
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.d = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j) | 128);
            int i2 = i + 1;
            long j3 = j >>> 7;
            long j4 = j3 & (-128);
            int i3 = (int) j3;
            if (j4 == 0) {
                bArr[i2] = (byte) i3;
                this.d = i + 2;
                return;
            }
            bArr[i2] = (byte) (i3 | 128);
            int i4 = i + 2;
            long j5 = j >>> 14;
            long j6 = j5 & (-128);
            int i5 = (int) j5;
            if (j6 == 0) {
                bArr[i4] = (byte) i5;
                this.d = i + 3;
                return;
            }
            bArr[i4] = (byte) (i5 | 128);
            int i6 = i + 3;
            long j7 = j >>> 21;
            long j8 = j7 & (-128);
            int i7 = (int) j7;
            if (j8 == 0) {
                bArr[i6] = (byte) i7;
                this.d = i + 4;
                return;
            }
            bArr[i6] = (byte) (i7 | 128);
            int i8 = i + 4;
            long j9 = j >>> 28;
            long j10 = j9 & (-128);
            int i9 = (int) j9;
            if (j10 == 0) {
                bArr[i8] = (byte) i9;
                this.d = i + 5;
                return;
            }
            bArr[i8] = (byte) (i9 | 128);
            int i10 = i + 5;
            long j11 = j >>> 35;
            long j12 = j11 & (-128);
            int i11 = (int) j11;
            if (j12 == 0) {
                bArr[i10] = (byte) i11;
                this.d = i + 6;
                return;
            }
            bArr[i10] = (byte) (i11 | 128);
            int i12 = i + 6;
            long j13 = j >>> 42;
            long j14 = j13 & (-128);
            int i13 = (int) j13;
            if (j14 == 0) {
                bArr[i12] = (byte) i13;
                this.d = i + 7;
                return;
            }
            bArr[i12] = (byte) (i13 | 128);
            int i14 = i + 7;
            long j15 = j >>> 49;
            long j16 = j15 & (-128);
            int i15 = (int) j15;
            if (j16 == 0) {
                bArr[i14] = (byte) i15;
                this.d = i + 8;
                return;
            }
            bArr[i14] = (byte) (i15 | 128);
            int i16 = i + 8;
            long j17 = j >>> 56;
            int i17 = (int) j17;
            if (((-128) & j17) == 0) {
                bArr[i16] = (byte) i17;
                this.d = i + 9;
            } else {
                bArr[i16] = (byte) (i17 | 128);
                bArr[i + 9] = (byte) (j >>> 63);
                this.d = i + 10;
            }
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new defpackage.egt(i, this.c, 1, e);
        }
    }

    public final void x(byte[] bArr, int i) throws defpackage.egt {
        u(i);
        d(bArr, 0, i);
    }
}
