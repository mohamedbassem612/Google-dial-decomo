package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apoy implements java.lang.Cloneable, java.nio.channels.ByteChannel, defpackage.appa, defpackage.apoz {
    public defpackage.appy a;
    public long b;

    @Override // defpackage.appa
    public final void A(long j) throws java.io.EOFException {
        while (j > 0) {
            defpackage.appy appyVar = this.a;
            if (appyVar == null) {
                throw new java.io.EOFException();
            }
            int iMin = (int) java.lang.Math.min(j, appyVar.c - appyVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = appyVar.b + iMin;
            appyVar.b = i;
            if (i == appyVar.c) {
                this.a = appyVar.a();
                defpackage.appz.b(appyVar);
            }
        }
    }

    @Override // defpackage.appa
    public final boolean B() {
        return this.b == 0;
    }

    @Override // defpackage.appa
    public final boolean C(long j) {
        throw null;
    }

    public final byte[] D() {
        return E(this.b);
    }

    public final byte[] E(long j) throws java.io.EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bz(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new java.io.EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iE = e(bArr, i2, i - i2);
            if (iE == -1) {
                throw new java.io.EOFException();
            }
            i2 += iE;
        }
        return bArr;
    }

    public final void F(defpackage.apoy apoyVar, long j, long j2) {
        long j3 = j;
        defpackage.aoov.aV(this.b, j3, j2);
        if (j2 != 0) {
            apoyVar.b += j2;
            defpackage.appy appyVar = this.a;
            while (true) {
                defpackage.aooh.c(appyVar);
                long j4 = appyVar.c - appyVar.b;
                if (j3 < j4) {
                    break;
                }
                appyVar = appyVar.f;
                j3 -= j4;
            }
            long j5 = j2;
            while (j5 > 0) {
                defpackage.aooh.c(appyVar);
                defpackage.appy appyVarB = appyVar.b();
                int i = appyVarB.b + ((int) j3);
                appyVarB.b = i;
                appyVarB.c = java.lang.Math.min(i + ((int) j5), appyVarB.c);
                defpackage.appy appyVar2 = apoyVar.a;
                if (appyVar2 == null) {
                    appyVarB.g = appyVarB;
                    appyVarB.f = appyVarB.g;
                    apoyVar.a = appyVarB.f;
                } else {
                    defpackage.appy appyVar3 = appyVar2.g;
                    defpackage.aooh.c(appyVar3);
                    appyVar3.d(appyVarB);
                }
                j5 -= (long) (appyVarB.c - appyVarB.b);
                appyVar = appyVar.f;
                j3 = 0;
            }
        }
    }

    public final boolean G(defpackage.appb appbVar) {
        defpackage.aooh.f(appbVar, "bytes");
        return H(0L, appbVar, appbVar.c());
    }

    public final boolean H(long j, defpackage.appb appbVar, int i) {
        defpackage.aooh.f(appbVar, "bytes");
        if (i < 0 || j < 0 || ((long) i) + j > this.b || i > appbVar.c()) {
            return false;
        }
        return i == 0 || apqh.b(this, appbVar, j, j + 1, i) != -1;
    }

    @Override // defpackage.apoz
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void J(defpackage.appb appbVar) {
        if (appbVar == null) {
            defpackage.aooh.i("byteString");
        }
        appbVar.t(this, appbVar.c());
    }

    @Override // defpackage.apoz
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void L(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            defpackage.aooh.i("source");
        }
        long j = i2;
        defpackage.aoov.aV(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            defpackage.appy appyVarV = v(1);
            int iMin = java.lang.Math.min(i3 - i, 8192 - appyVarV.c);
            int i4 = i + iMin;
            defpackage.ajsz.cZ(bArr, appyVarV.a, appyVarV.c, i, i4);
            appyVarV.c += iMin;
            i = i4;
        }
        this.b += j;
    }

    public final void M(defpackage.apqd apqdVar) {
        while (apqdVar.b(this, 8192L) != -1) {
        }
    }

    public final void N(int i) {
        defpackage.appy appyVarV = v(1);
        byte[] bArr = appyVarV.a;
        int i2 = appyVarV.c;
        appyVarV.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    @Override // defpackage.apoz
    public final /* bridge */ /* synthetic */ void O(int i) {
        throw null;
    }

    public final void P(int i) {
        defpackage.appy appyVarV = v(4);
        byte[] bArr = appyVarV.a;
        int i2 = appyVarV.c;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        appyVarV.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.apoz
    public final /* bridge */ /* synthetic */ void Q(int i) {
        throw null;
    }

    @Override // defpackage.apoz
    public final /* bridge */ /* synthetic */ void R(int i) {
        throw null;
    }

    public final void S(java.io.OutputStream outputStream, long j) throws java.io.IOException {
        defpackage.aooh.f(outputStream, "out");
        defpackage.aoov.aV(this.b, 0L, j);
        defpackage.appy appyVar = this.a;
        long j2 = j;
        while (j2 > 0) {
            defpackage.aooh.c(appyVar);
            int iMin = (int) java.lang.Math.min(j2, appyVar.c - appyVar.b);
            outputStream.write(appyVar.a, appyVar.b, iMin);
            int i = appyVar.b + iMin;
            appyVar.b = i;
            long j3 = iMin;
            this.b -= j3;
            j2 -= j3;
            if (i == appyVar.c) {
                defpackage.appy appyVarA = appyVar.a();
                this.a = appyVarA;
                defpackage.appz.b(appyVar);
                appyVar = appyVarA;
            }
        }
    }

    public final void U(java.lang.String str, int i, int i2) {
        if (str == null) {
            defpackage.aooh.i("string");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bf(i, i2, "endIndex < beginIndex: ", " < "));
        }
        if (i2 > str.length()) {
            throw new java.lang.IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                defpackage.appy appyVarV = v(1);
                byte[] bArr = appyVarV.a;
                int i4 = appyVarV.c - i;
                int iMin = java.lang.Math.min(i2, 8192 - i4);
                bArr[i + i4] = (byte) cCharAt;
                i = i3;
                while (i < iMin) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i + i4] = (byte) cCharAt2;
                    i++;
                }
                int i5 = appyVarV.c;
                int i6 = (i4 + i) - i5;
                appyVarV.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt < 2048) {
                    defpackage.appy appyVarV2 = v(2);
                    byte[] bArr2 = appyVarV2.a;
                    int i7 = appyVarV2.c;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | 128);
                    appyVarV2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt >= 55296 && cCharAt < 56320) {
                    char cCharAt3 = i3 < i2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        N(63);
                    } else {
                        defpackage.appy appyVarV3 = v(4);
                        byte[] bArr3 = appyVarV3.a;
                        int i8 = appyVarV3.c;
                        int i9 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        bArr3[i8] = (byte) ((i9 >> 18) | 240);
                        bArr3[i8 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                        bArr3[i8 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                        bArr3[i8 + 3] = (byte) ((i9 & 63) | 128);
                        appyVarV3.c = i8 + 4;
                        this.b += 4;
                        i += 2;
                    }
                } else if (cCharAt < 56320 || cCharAt >= 57344) {
                    defpackage.appy appyVarV4 = v(3);
                    byte[] bArr4 = appyVarV4.a;
                    int i10 = appyVarV4.c;
                    bArr4[i10] = (byte) ((cCharAt >> '\f') | 224);
                    bArr4[i10 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                    bArr4[i10 + 2] = (byte) ((cCharAt & '?') | 128);
                    appyVarV4.c = i10 + 3;
                    this.b += 3;
                } else {
                    N(63);
                }
                i = i3;
            }
        }
    }

    public final void V(int i) {
        if (i < 128) {
            N(i);
            return;
        }
        if (i < 2048) {
            defpackage.appy appyVarV = v(2);
            byte[] bArr = appyVarV.a;
            int i2 = appyVarV.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            appyVarV.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (i >= 55296 && i < 57344) {
            N(63);
            return;
        }
        if (i < 65536) {
            defpackage.appy appyVarV2 = v(3);
            byte[] bArr2 = appyVarV2.a;
            int i3 = appyVarV2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            appyVarV2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            throw new java.lang.IllegalArgumentException("Unexpected code point: 0x".concat(defpackage.aoov.aU(i)));
        }
        defpackage.appy appyVarV3 = v(4);
        byte[] bArr3 = appyVarV3.a;
        int i4 = appyVarV3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        appyVarV3.c = i4 + 4;
        this.b += 4;
    }

    @Override // defpackage.apoz
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final void aa(byte[] bArr) {
        defpackage.aooh.f(bArr, "source");
        L(bArr, 0, bArr.length);
    }

    public final void X(long j) {
        if (j == 0) {
            N(48);
            return;
        }
        byte[] bArr = apqh.a;
        int iNumberOfLeadingZeros = ((64 - java.lang.Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > apqh.b[iNumberOfLeadingZeros] ? 1 : 0);
        defpackage.appy appyVarV = v(i);
        byte[] bArr2 = appyVarV.a;
        int i2 = appyVarV.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = apqh.a[(int) (j % 10)];
            j /= 10;
        }
        appyVarV.c += i;
        this.b += (long) i;
    }

    public final void Y(long j) {
        if (j == 0) {
            N(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) >> 2);
        defpackage.appy appyVarV = v(i);
        byte[] bArr = appyVarV.a;
        int i2 = appyVarV.c;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 < i2) {
                appyVarV.c += i;
                this.b += (long) i;
                return;
            } else {
                bArr[i3] = apqh.a[(int) (15 & j)];
                j >>>= 4;
            }
        }
    }

    @Override // defpackage.apoz
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final void ab(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("string");
        }
        U(str, 0, str.length());
    }

    @Override // defpackage.apqd
    public final long b(defpackage.apoy apoyVar, long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bz(j, "byteCount < 0: "));
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        apoyVar.fQ(this, j);
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[PHI: r0 r7
      0x0042: PHI (r0v5 long) = (r0v3 long), (r0v7 long) binds: [B:21:0x0040, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r7v4 appy) = (r7v2 appy), (r7v11 appy) binds: [B:21:0x0040, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    public final byte c(long j) {
        defpackage.aoov.aV(this.b, j, 1L);
        defpackage.appy appyVar = this.a;
        if (appyVar == null) {
            defpackage.aooh.g();
            throw null;
        }
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                appyVar = appyVar.g;
                if (appyVar == null) {
                    defpackage.aooh.g();
                }
                j2 -= (long) (appyVar.c - appyVar.b);
            }
            if (appyVar == null) {
                defpackage.aooh.g();
            }
        } else {
            j2 = 0;
            while (true) {
                long j3 = ((long) (appyVar.c - appyVar.b)) + j2;
                if (j3 > j) {
                    break;
                }
                appyVar = appyVar.f;
                if (appyVar == null) {
                    defpackage.aooh.g();
                }
                j2 = j3;
            }
            if (appyVar == null) {
                defpackage.aooh.g();
            }
        }
        return appyVar.a[(int) ((((long) appyVar.b) + j) - j2)];
    }

    public final /* synthetic */ java.lang.Object clone() {
        defpackage.apoy apoyVar = new defpackage.apoy();
        if (this.b != 0) {
            defpackage.appy appyVar = this.a;
            defpackage.aooh.c(appyVar);
            defpackage.appy appyVarB = appyVar.b();
            apoyVar.a = appyVarB;
            appyVarB.g = appyVarB;
            appyVarB.f = appyVarB.g;
            for (defpackage.appy appyVar2 = appyVar.f; appyVar2 != appyVar; appyVar2 = appyVar2.f) {
                defpackage.appy appyVar3 = appyVarB.g;
                defpackage.aooh.c(appyVar3);
                defpackage.aooh.c(appyVar2);
                appyVar3.d(appyVar2.b());
            }
            apoyVar.b = this.b;
        }
        return apoyVar;
    }

    @Override // defpackage.appa
    public final byte d() throws java.io.EOFException {
        if (this.b == 0) {
            throw new java.io.EOFException();
        }
        defpackage.appy appyVar = this.a;
        if (appyVar == null) {
            defpackage.aooh.g();
        }
        int i = appyVar.b;
        int i2 = i + 1;
        int i3 = appyVar.c;
        byte b = appyVar.a[i];
        this.b--;
        if (i2 == i3) {
            this.a = appyVar.a();
            defpackage.appz.b(appyVar);
        } else {
            appyVar.b = i2;
        }
        return b;
    }

    public final int e(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            defpackage.aooh.i("sink");
        }
        defpackage.aoov.aV(bArr.length, i, i2);
        defpackage.appy appyVar = this.a;
        if (appyVar == null) {
            return -1;
        }
        int iMin = java.lang.Math.min(i2, appyVar.c - appyVar.b);
        int i3 = appyVar.b;
        defpackage.ajsz.cZ(appyVar.a, bArr, i, i3, i3 + iMin);
        int i4 = appyVar.b + iMin;
        appyVar.b = i4;
        this.b -= (long) iMin;
        if (i4 == appyVar.c) {
            this.a = appyVar.a();
            defpackage.appz.b(appyVar);
        }
        return iMin;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.apoy) {
            long j = this.b;
            defpackage.apoy apoyVar = (defpackage.apoy) obj;
            if (j == apoyVar.b) {
                if (j == 0) {
                    return true;
                }
                defpackage.appy appyVar = this.a;
                defpackage.aooh.c(appyVar);
                defpackage.appy appyVar2 = apoyVar.a;
                defpackage.aooh.c(appyVar2);
                int i = appyVar.b;
                int i2 = appyVar2.b;
                long j2 = 0;
                while (j2 < this.b) {
                    long jMin = java.lang.Math.min(appyVar.c - i, appyVar2.c - i2);
                    long j3 = 0;
                    while (j3 < jMin) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (appyVar.a[i] == appyVar2.a[i2]) {
                            j3++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == appyVar.c) {
                        appyVar = appyVar.f;
                        defpackage.aooh.c(appyVar);
                        i = appyVar.b;
                    }
                    if (i2 == appyVar2.c) {
                        appyVar2 = appyVar2.f;
                        defpackage.aooh.c(appyVar2);
                        i2 = appyVar2.b;
                    }
                    j2 += jMin;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.appa
    public final int f() throws java.io.EOFException {
        if (this.b < 4) {
            throw new java.io.EOFException();
        }
        defpackage.appy appyVar = this.a;
        if (appyVar == null) {
            defpackage.aooh.g();
        }
        int i = appyVar.b;
        int i2 = appyVar.c;
        if (i2 - i < 4) {
            return ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8) | (d() & 255);
        }
        byte[] bArr = appyVar.a;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = (bArr[i + 1] & 255) << 16;
        int i5 = (bArr[i + 2] & 255) << 8;
        int i6 = bArr[i + 3] & 255;
        this.b -= 4;
        int i7 = i6 | i3 | i4 | i5;
        int i8 = i + 4;
        if (i8 == i2) {
            this.a = appyVar.a();
            defpackage.appz.b(appyVar);
        } else {
            appyVar.b = i8;
        }
        return i7;
    }

    @Override // defpackage.apqd
    public final defpackage.apqf fP() {
        return defpackage.apqf.k;
    }

    @Override // defpackage.apqb
    public final void fQ(defpackage.apoy apoyVar, long j) {
        defpackage.appy appyVarA;
        if (apoyVar == null) {
            defpackage.aooh.i("source");
        }
        if (apoyVar == this) {
            throw new java.lang.IllegalArgumentException("source == this");
        }
        defpackage.aoov.aV(apoyVar.b, 0L, j);
        while (j > 0) {
            defpackage.appy appyVar = apoyVar.a;
            if (appyVar == null) {
                defpackage.aooh.g();
            }
            int i = appyVar.c;
            defpackage.appy appyVar2 = apoyVar.a;
            if (appyVar2 == null) {
                defpackage.aooh.g();
            }
            long j2 = i - appyVar2.b;
            int i2 = 0;
            if (j < j2) {
                defpackage.appy appyVar3 = this.a;
                defpackage.appy appyVar4 = appyVar3 != null ? appyVar3.g : null;
                int i3 = (int) j;
                if (appyVar4 != null && appyVar4.e) {
                    if ((((long) appyVar4.c) + j) - ((long) (appyVar4.d ? 0 : appyVar4.b)) <= 8192) {
                        defpackage.appy appyVar5 = apoyVar.a;
                        if (appyVar5 == null) {
                            defpackage.aooh.g();
                        }
                        appyVar5.c(appyVar4, i3);
                        apoyVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                defpackage.appy appyVar6 = apoyVar.a;
                if (appyVar6 == null) {
                    defpackage.aooh.g();
                }
                if (i3 > appyVar6.c - appyVar6.b) {
                    throw new java.lang.IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    appyVarA = appyVar6.b();
                } else {
                    appyVarA = defpackage.appz.a();
                    byte[] bArr = appyVar6.a;
                    byte[] bArr2 = appyVarA.a;
                    int i4 = appyVar6.b;
                    defpackage.ajsz.cZ(bArr, bArr2, 0, i4, i4 + i3);
                }
                appyVarA.c = appyVarA.b + i3;
                appyVar6.b += i3;
                defpackage.appy appyVar7 = appyVar6.g;
                if (appyVar7 == null) {
                    defpackage.aooh.g();
                }
                appyVar7.d(appyVarA);
                apoyVar.a = appyVarA;
            }
            defpackage.appy appyVar8 = apoyVar.a;
            if (appyVar8 == null) {
                defpackage.aooh.g();
            }
            int i5 = appyVar8.c - appyVar8.b;
            apoyVar.a = appyVar8.a();
            defpackage.appy appyVar9 = this.a;
            if (appyVar9 == null) {
                this.a = appyVar8;
                appyVar8.g = appyVar8;
                appyVar8.f = appyVar8.g;
            } else {
                defpackage.appy appyVar10 = appyVar9.g;
                if (appyVar10 == null) {
                    defpackage.aooh.g();
                }
                appyVar10.d(appyVar8);
                defpackage.appy appyVar11 = appyVar8.g;
                if (appyVar11 == appyVar8) {
                    throw new java.lang.IllegalStateException("cannot compact");
                }
                if (appyVar11 == null) {
                    defpackage.aooh.g();
                }
                if (appyVar11.e) {
                    int i6 = appyVar8.c - appyVar8.b;
                    defpackage.appy appyVar12 = appyVar8.g;
                    if (appyVar12 == null) {
                        defpackage.aooh.g();
                    }
                    int i7 = 8192 - appyVar12.c;
                    defpackage.appy appyVar13 = appyVar8.g;
                    if (appyVar13 == null) {
                        defpackage.aooh.g();
                    }
                    if (!appyVar13.d) {
                        defpackage.appy appyVar14 = appyVar8.g;
                        if (appyVar14 == null) {
                            defpackage.aooh.g();
                        }
                        i2 = appyVar14.b;
                    }
                    if (i6 <= i7 + i2) {
                        defpackage.appy appyVar15 = appyVar8.g;
                        if (appyVar15 == null) {
                            defpackage.aooh.g();
                        }
                        appyVar8.c(appyVar15, i6);
                        appyVar8.a();
                        defpackage.appz.b(appyVar8);
                    }
                }
            }
            long j3 = i5;
            apoyVar.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    @Override // defpackage.appa
    public final int g() {
        throw null;
    }

    public final long h() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        defpackage.appy appyVar = this.a;
        if (appyVar == null) {
            defpackage.aooh.g();
        }
        defpackage.appy appyVar2 = appyVar.g;
        if (appyVar2 == null) {
            defpackage.aooh.g();
        }
        int i = appyVar2.c;
        return (i >= 8192 || !appyVar2.e) ? j : j - ((long) (i - appyVar2.b));
    }

    public final int hashCode() {
        defpackage.appy appyVar = this.a;
        if (appyVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = appyVar.c;
            for (int i3 = appyVar.b; i3 < i2; i3++) {
                i = (i * 31) + appyVar.a[i3];
            }
            appyVar = appyVar.f;
            defpackage.aooh.c(appyVar);
        } while (appyVar != this.a);
        return i;
    }

    public final long i(byte b, long j, long j2) {
        defpackage.appy appyVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 < 0 || j3 > j4) {
            throw new java.lang.IllegalArgumentException("size=" + this.b + " fromIndex=" + j3 + " toIndex=" + j4);
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 != j4 && (appyVar = this.a) != null) {
            if (j6 - j3 < j3) {
                while (j6 > j3) {
                    appyVar = appyVar.g;
                    defpackage.aooh.c(appyVar);
                    j6 -= (long) (appyVar.c - appyVar.b);
                }
                if (appyVar != null) {
                    while (j6 < j4) {
                        byte[] bArr = appyVar.a;
                        int iMin = (int) java.lang.Math.min(appyVar.c, (((long) appyVar.b) + j4) - j6);
                        for (int i = (int) ((((long) appyVar.b) + j3) - j6); i < iMin; i++) {
                            if (bArr[i] == b) {
                                return ((long) (i - appyVar.b)) + j6;
                            }
                        }
                        j6 += (long) (appyVar.c - appyVar.b);
                        appyVar = appyVar.f;
                        defpackage.aooh.c(appyVar);
                        j3 = j6;
                    }
                }
            } else {
                while (true) {
                    long j7 = ((long) (appyVar.c - appyVar.b)) + j5;
                    if (j7 > j3) {
                        break;
                    }
                    appyVar = appyVar.f;
                    defpackage.aooh.c(appyVar);
                    j5 = j7;
                }
                if (appyVar != null) {
                    while (j5 < j4) {
                        byte[] bArr2 = appyVar.a;
                        int iMin2 = (int) java.lang.Math.min(appyVar.c, (((long) appyVar.b) + j4) - j5);
                        for (int i2 = (int) ((((long) appyVar.b) + j3) - j5); i2 < iMin2; i2++) {
                            if (bArr2[i2] == b) {
                                return ((long) (i2 - appyVar.b)) + j5;
                            }
                        }
                        j5 += (long) (appyVar.c - appyVar.b);
                        appyVar = appyVar.f;
                        defpackage.aooh.c(appyVar);
                        j3 = j5;
                    }
                }
            }
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.appa
    public final long j(defpackage.appb appbVar) {
        defpackage.aooh.f(appbVar, "targetBytes");
        return k(appbVar, 0L);
    }

    public final long k(defpackage.appb appbVar, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        defpackage.aooh.f(appbVar, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bz(j, "fromIndex < 0: "));
        }
        defpackage.appy appyVar = this.a;
        if (appyVar == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                appyVar = appyVar.g;
                defpackage.aooh.c(appyVar);
                j3 -= (long) (appyVar.c - appyVar.b);
            }
            if (appyVar == null) {
                return -1L;
            }
            if (appbVar.c() == 2) {
                byte bA = appbVar.a(0);
                byte bA2 = appbVar.a(1);
                while (j3 < this.b) {
                    byte[] bArr = appyVar.a;
                    long j4 = ((long) appyVar.b) + j;
                    int i5 = appyVar.c;
                    i3 = (int) (j4 - j3);
                    while (i3 < i5) {
                        byte b = bArr[i3];
                        if (b == bA || b == bA2) {
                            i4 = appyVar.b;
                        } else {
                            i3++;
                        }
                    }
                    j3 += (long) (appyVar.c - appyVar.b);
                    appyVar = appyVar.f;
                    defpackage.aooh.c(appyVar);
                    j = j3;
                }
                return -1L;
            }
            byte[] bArr2 = appbVar.b;
            while (j3 < this.b) {
                byte[] bArr3 = appyVar.a;
                long j5 = ((long) appyVar.b) + j;
                int i6 = appyVar.c;
                i3 = (int) (j5 - j3);
                while (i3 < i6) {
                    byte b2 = bArr3[i3];
                    for (byte b3 : bArr2) {
                        if (b2 == b3) {
                            i4 = appyVar.b;
                        }
                    }
                    i3++;
                }
                j3 += (long) (appyVar.c - appyVar.b);
                appyVar = appyVar.f;
                defpackage.aooh.c(appyVar);
                j = j3;
            }
            return -1L;
            return ((long) (i3 - i4)) + j3;
        }
        while (true) {
            long j6 = ((long) (appyVar.c - appyVar.b)) + j2;
            if (j6 > j) {
                break;
            }
            appyVar = appyVar.f;
            defpackage.aooh.c(appyVar);
            j2 = j6;
        }
        if (appyVar == null) {
            return -1L;
        }
        if (appbVar.c() == 2) {
            byte bA3 = appbVar.a(0);
            byte bA4 = appbVar.a(1);
            while (j2 < this.b) {
                byte[] bArr4 = appyVar.a;
                long j7 = ((long) appyVar.b) + j;
                int i7 = appyVar.c;
                i = (int) (j7 - j2);
                while (i < i7) {
                    byte b4 = bArr4[i];
                    if (b4 == bA3 || b4 == bA4) {
                        i2 = appyVar.b;
                    } else {
                        i++;
                    }
                }
                j2 += (long) (appyVar.c - appyVar.b);
                appyVar = appyVar.f;
                defpackage.aooh.c(appyVar);
                j = j2;
            }
            return -1L;
        }
        byte[] bArr5 = appbVar.b;
        while (j2 < this.b) {
            byte[] bArr6 = appyVar.a;
            long j8 = ((long) appyVar.b) + j;
            int i8 = appyVar.c;
            i = (int) (j8 - j2);
            while (i < i8) {
                byte b5 = bArr6[i];
                for (byte b6 : bArr5) {
                    if (b5 == b6) {
                        i2 = appyVar.b;
                    }
                }
                i++;
            }
            j2 += (long) (appyVar.c - appyVar.b);
            appyVar = appyVar.f;
            defpackage.aooh.c(appyVar);
            j = j2;
        }
        return -1L;
        return ((long) (i - i2)) + j2;
    }

    @Override // defpackage.appa
    public final long l() {
        throw null;
    }

    @Override // defpackage.appa
    public final java.io.InputStream m() {
        return new apox(this);
    }

    public final java.lang.String n(long j, java.nio.charset.Charset charset) throws java.io.EOFException {
        if (charset == null) {
            defpackage.aooh.i("charset");
        }
        if (j < 0 || j > 2147483647L) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bz(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new java.io.EOFException();
        }
        if (j == 0) {
            return "";
        }
        defpackage.appy appyVar = this.a;
        if (appyVar == null) {
            defpackage.aooh.g();
        }
        int i = appyVar.b;
        long j2 = ((long) i) + j;
        int i2 = appyVar.c;
        if (j2 > i2) {
            return new java.lang.String(E(j), charset);
        }
        int i3 = (int) j;
        java.lang.String str = new java.lang.String(appyVar.a, i, i3, charset);
        int i4 = i + i3;
        appyVar.b = i4;
        this.b -= j;
        if (i4 == i2) {
            this.a = appyVar.a();
            defpackage.appz.b(appyVar);
        }
        return str;
    }

    public final java.lang.String o() {
        return n(this.b, defpackage.aoqv.a);
    }

    @Override // defpackage.appa
    public final java.lang.String p(long j) {
        return n(j, defpackage.aoqv.a);
    }

    @Override // defpackage.appa
    public final java.lang.String q(long j) {
        throw null;
    }

    public final defpackage.appb r() {
        return s(this.b);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) {
        defpackage.aooh.f(byteBuffer, "sink");
        defpackage.appy appyVar = this.a;
        if (appyVar == null) {
            return -1;
        }
        int iMin = java.lang.Math.min(byteBuffer.remaining(), appyVar.c - appyVar.b);
        byteBuffer.put(appyVar.a, appyVar.b, iMin);
        int i = appyVar.b + iMin;
        appyVar.b = i;
        this.b -= (long) iMin;
        if (i == appyVar.c) {
            this.a = appyVar.a();
            defpackage.appz.b(appyVar);
        }
        return iMin;
    }

    @Override // defpackage.appa
    public final defpackage.appb s(long j) throws java.io.EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bz(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new java.io.EOFException();
        }
        if (j < 4096) {
            return new defpackage.appb(E(j));
        }
        defpackage.appb appbVarU = u((int) j);
        A(j);
        return appbVarU;
    }

    public final defpackage.appb t() {
        long j = this.b;
        if (j <= 2147483647L) {
            return u((int) j);
        }
        throw new java.lang.IllegalStateException(defpackage.a.bz(j, "size > Int.MAX_VALUE: "));
    }

    public final java.lang.String toString() {
        return t().toString();
    }

    public final defpackage.appb u(int i) {
        if (i == 0) {
            return defpackage.appb.a;
        }
        defpackage.aoov.aV(this.b, 0L, i);
        defpackage.appy appyVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            defpackage.aooh.c(appyVar);
            int i5 = appyVar.c;
            int i6 = appyVar.b;
            if (i5 == i6) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            appyVar = appyVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 << 1];
        defpackage.appy appyVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            defpackage.aooh.c(appyVar2);
            bArr[i7] = appyVar2.a;
            i2 += appyVar2.c - appyVar2.b;
            iArr[i7] = java.lang.Math.min(i2, i);
            iArr[i7 + i4] = appyVar2.b;
            appyVar2.d = true;
            i7++;
            appyVar2 = appyVar2.f;
        }
        return new apqa(bArr, iArr);
    }

    public final defpackage.appy v(int i) {
        if (i <= 0 || i > 8192) {
            throw new java.lang.IllegalArgumentException("unexpected capacity");
        }
        defpackage.appy appyVar = this.a;
        if (appyVar == null) {
            defpackage.appy appyVarA = defpackage.appz.a();
            this.a = appyVarA;
            appyVarA.g = appyVarA;
            appyVarA.f = appyVarA;
            return appyVarA;
        }
        defpackage.appy appyVar2 = appyVar.g;
        if (appyVar2 == null) {
            defpackage.aooh.g();
        }
        if (appyVar2.c + i <= 8192 && appyVar2.e) {
            return appyVar2;
        }
        defpackage.appy appyVarA2 = defpackage.appz.a();
        appyVar2.d(appyVarA2);
        return appyVarA2;
    }

    @Override // defpackage.appa
    public final short w() throws java.io.EOFException {
        if (this.b < 2) {
            throw new java.io.EOFException();
        }
        defpackage.appy appyVar = this.a;
        if (appyVar == null) {
            defpackage.aooh.g();
        }
        int i = appyVar.b;
        int i2 = appyVar.c;
        if (i2 - i < 2) {
            return (short) (((d() & 255) << 8) | (d() & 255));
        }
        byte[] bArr = appyVar.a;
        int i3 = (bArr[i] & 255) << 8;
        int i4 = bArr[i + 1] & 255;
        this.b -= 2;
        int i5 = i + 2;
        if (i5 == i2) {
            this.a = appyVar.a();
            defpackage.appz.b(appyVar);
        } else {
            appyVar.b = i5;
        }
        return (short) (i3 | i4);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) {
        defpackage.aooh.f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            defpackage.appy appyVarV = v(1);
            int iMin = java.lang.Math.min(i, 8192 - appyVarV.c);
            byteBuffer.get(appyVarV.a, appyVarV.c, iMin);
            i -= iMin;
            appyVarV.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.appa
    public final short x() {
        throw null;
    }

    public final void y() throws java.io.EOFException {
        A(this.b);
    }

    @Override // defpackage.appa
    public final void z(long j) {
        throw null;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.apqd
    public final void close() {
    }

    @Override // defpackage.apoz, defpackage.apqb, java.io.Flushable
    public final void flush() {
    }
}
