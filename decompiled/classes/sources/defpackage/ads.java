package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ads {
    public long[] a = defpackage.adx.a;
    public java.lang.Object[] b = defpackage.aei.c;
    public long[] c = defpackage.aeb.a;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f;
    public int g;
    private int h;

    public ads(int i) {
        if (i < 0) {
            defpackage.un.a("Capacity must be a positive value.");
        }
        l(defpackage.adx.c(i));
    }

    private final int i(java.lang.Object obj) {
        long j;
        long j2;
        int i;
        long j3;
        int iNumberOfTrailingZeros;
        int i2;
        int i3;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i4 = -862048943;
        int i5 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i6 = i5 ^ (i5 >>> 16);
        int i7 = i6 >>> 7;
        int i8 = this.f;
        int i9 = i7 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            int i14 = i6;
            long j4 = i6 & 127;
            long j5 = (jArr[i11] >>> i12) | ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63));
            long j6 = (72340172838076673L * j4) ^ j5;
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j7) >> 3) + i9) & i8;
                int i15 = i4;
                if (defpackage.aooh.n(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
                i4 = i15;
            }
            int i16 = i4;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int iJ = j(i7);
                if (this.h != 0 || ((this.a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) == 254) {
                    j = j4;
                    j2 = 255;
                    i = 1;
                    j3 = 128;
                } else {
                    int i17 = this.f;
                    if (i17 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.g) << 5) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.a;
                            if (jArr2 == null) {
                                j = j4;
                                i3 = i7;
                                j2 = 255;
                                i = 1;
                            } else {
                                int i18 = this.f;
                                java.lang.Object[] objArr = this.b;
                                long[] jArr3 = this.c;
                                long[] jArr4 = new long[i18];
                                j2 = 255;
                                java.util.Arrays.fill(jArr4, 0, i18, 9223372034707292159L);
                                int i19 = (i18 + 7) >> 3;
                                int i20 = 0;
                                while (i20 < i19) {
                                    long j8 = jArr2[i20] & (-9187201950435737472L);
                                    jArr2[i20] = ((~j8) + (j8 >>> 7)) & (-72340172838076674L);
                                    i20++;
                                    i13 = i13;
                                }
                                i = i13;
                                int iCF = defpackage.ajsz.cF(jArr2);
                                int i21 = iCF - 1;
                                jArr2[i21] = (jArr2[i21] & 72057594037927935L) | (-72057594037927936L);
                                jArr2[iCF] = jArr2[0];
                                int i22 = 0;
                                while (i22 != i18) {
                                    int i23 = i22 >> 3;
                                    int i24 = (i22 & 7) << 3;
                                    long j9 = (jArr2[i23] >> i24) & 255;
                                    if (j9 == 128 || j9 != 254) {
                                        i22++;
                                    } else {
                                        java.lang.Object obj2 = objArr[i22];
                                        int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
                                        int i25 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i16;
                                        int i26 = i25 ^ (i25 >>> 16);
                                        int i27 = i26 & 127;
                                        int i28 = i26 >>> 7;
                                        int iJ2 = j(i28);
                                        int i29 = i28 & i18;
                                        int i30 = i7;
                                        long j10 = i27;
                                        if (((iJ2 - i29) & i18) / 8 == ((i22 - i29) & i18) / 8) {
                                            int i31 = i22 + 1;
                                            jArr2[i23] = (jArr2[i23] & (~(255 << i24))) | (j10 << i24);
                                            if (jArr4[i22] == 9223372034707292159L) {
                                                long j11 = i22;
                                                jArr4[i22] = (j11 << 32) | j11;
                                            }
                                            jArr2[jArr2.length - 1] = jArr2[0];
                                            i22 = i31;
                                            i7 = i30;
                                        } else {
                                            long j12 = i22;
                                            long j13 = j4;
                                            long j14 = iJ2;
                                            int i32 = iJ2 >> 3;
                                            long j15 = jArr2[i32];
                                            int i33 = (iJ2 & 7) << 3;
                                            long j16 = j10 << i33;
                                            long j17 = j15 & (~(255 << i33));
                                            if (((j15 >> i33) & 255) == 128) {
                                                long j18 = j12 << 32;
                                                long j19 = ~(255 << i24);
                                                jArr2[i32] = j17 | j16;
                                                jArr2[i23] = (jArr2[i23] & j19) | (128 << i24);
                                                objArr[iJ2] = objArr[i22];
                                                objArr[i22] = null;
                                                jArr3[iJ2] = jArr3[i22];
                                                jArr3[i22] = 4611686018427387903L;
                                                int i34 = (int) ((jArr4[i22] >> 32) & 4294967295L);
                                                if (i34 != Integer.MAX_VALUE) {
                                                    jArr4[i34] = (jArr4[i34] & (-4294967296L)) | j14;
                                                    jArr4[i22] = (jArr4[i22] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    jArr4[i22] = j14 | 9223372032559808512L;
                                                }
                                                jArr4[iJ2] = j18 | 2147483647L;
                                            } else {
                                                long j20 = j14 << 32;
                                                jArr2[i32] = j17 | j16;
                                                java.lang.Object obj3 = objArr[iJ2];
                                                objArr[iJ2] = objArr[i22];
                                                objArr[i22] = obj3;
                                                long j21 = jArr3[iJ2];
                                                jArr3[iJ2] = jArr3[i22];
                                                jArr3[i22] = j21;
                                                int i35 = (int) ((jArr4[i22] >> 32) & 4294967295L);
                                                if (i35 != Integer.MAX_VALUE) {
                                                    jArr4[i35] = (jArr4[i35] & (-4294967296L)) | j14;
                                                    jArr4[i22] = j20 | (jArr4[i22] & 4294967295L);
                                                } else {
                                                    jArr4[i22] = j20 | j14;
                                                    i35 = i22;
                                                }
                                                jArr4[iJ2] = (((long) i35) << 32) | j12;
                                                i22--;
                                            }
                                            jArr2[jArr2.length - 1] = jArr2[0];
                                            i22++;
                                            i7 = i30;
                                            j4 = j13;
                                        }
                                    }
                                }
                                j = j4;
                                i2 = i7;
                                k();
                                long[] jArr5 = this.c;
                                int length = jArr5.length;
                                for (int i36 = 0; i36 < length; i36++) {
                                    long j22 = jArr5[i36];
                                    int i37 = (int) ((j22 >> 31) & 2147483647L);
                                    int i38 = (int) (j22 & 2147483647L);
                                    jArr5[i36] = (((j22 & (-4611686018427387904L)) | ((long) (i37 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr4[i37] & 4294967295L)))) << 31) | ((long) (i38 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr4[i38] & 4294967295L)));
                                }
                                int i39 = this.d;
                                if (i39 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr4[i39] & 4294967295L);
                                }
                                int i40 = this.e;
                                if (i40 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr4[i40] & 4294967295L);
                                }
                            }
                            iJ = j(i3);
                        }
                        i3 = i2;
                        iJ = j(i3);
                    } else {
                        j3 = 128;
                    }
                    j = j4;
                    i2 = i7;
                    j2 = 255;
                    i = 1;
                    int i41 = 0;
                    int iB = defpackage.adx.b(this.f);
                    long[] jArr6 = this.a;
                    java.lang.Object[] objArr2 = this.b;
                    long[] jArr7 = this.c;
                    int[] iArr = new int[this.f];
                    l(iB);
                    long[] jArr8 = this.a;
                    java.lang.Object[] objArr3 = this.b;
                    long[] jArr9 = this.c;
                    int i42 = this.f;
                    int length2 = jArr6.length - 2;
                    if (length2 >= 0) {
                        int i43 = 0;
                        while (true) {
                            long j23 = (~jArr6[i43]) & (-9187201950435737472L);
                            while (j23 != 0) {
                                int iNumberOfTrailingZeros2 = (i43 << 3) + (java.lang.Long.numberOfTrailingZeros(j23) >>> 3);
                                java.lang.Object obj4 = objArr2[iNumberOfTrailingZeros2];
                                int iHashCode3 = obj4 != null ? obj4.hashCode() : i41;
                                int i44 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i16;
                                int i45 = i44 ^ (i44 >>> 16);
                                int iJ3 = j(i45 >>> 7);
                                long[] jArr10 = jArr8;
                                int i46 = i45 & 127;
                                int i47 = iJ3 >> 3;
                                int i48 = (iJ3 & 7) << 3;
                                long j24 = (jArr10[i47] & (~(255 << i48))) | (((long) i46) << i48);
                                jArr10[i47] = j24;
                                jArr10[(((iJ3 - 7) & i42) + (i42 & 7)) >> 3] = j24;
                                objArr3[iJ3] = obj4;
                                jArr9[iJ3] = jArr7[iNumberOfTrailingZeros2];
                                iArr[iNumberOfTrailingZeros2] = iJ3;
                                j23 &= j23 - 1;
                                jArr8 = jArr10;
                                jArr6 = jArr6;
                                objArr2 = objArr2;
                                i41 = 0;
                            }
                            long[] jArr11 = jArr8;
                            long[] jArr12 = jArr6;
                            java.lang.Object[] objArr4 = objArr2;
                            if (i43 == length2) {
                                break;
                            }
                            i43++;
                            jArr8 = jArr11;
                            jArr6 = jArr12;
                            objArr2 = objArr4;
                            i41 = 0;
                        }
                    }
                    long[] jArr13 = this.c;
                    int length3 = jArr13.length;
                    for (int i49 = 0; i49 < length3; i49++) {
                        long j25 = jArr13[i49];
                        int i50 = (int) ((j25 >> 31) & 2147483647L);
                        int i51 = (int) (j25 & 2147483647L);
                        jArr13[i49] = (((j25 & (-4611686018427387904L)) | ((long) (i50 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i50]))) << 31) | ((long) (i51 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i51]));
                    }
                    int i52 = this.d;
                    if (i52 != Integer.MAX_VALUE) {
                        this.d = iArr[i52];
                    }
                    int i53 = this.e;
                    if (i53 != Integer.MAX_VALUE) {
                        this.e = iArr[i53];
                    }
                    i3 = i2;
                    iJ = j(i3);
                }
                iNumberOfTrailingZeros = iJ;
                this.g++;
                int i54 = this.h;
                long[] jArr14 = this.a;
                int i55 = iNumberOfTrailingZeros >> 3;
                long j26 = jArr14[i55];
                int i56 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j26 >> i56) & j2) != j3) {
                    i = 0;
                }
                this.h = i54 - i;
                int i57 = this.f;
                long j27 = (j26 & (~(j2 << i56))) | (j << i56);
                jArr14[i55] = j27;
                jArr14[(((iNumberOfTrailingZeros - 7) & i57) + (i57 & 7)) >> 3] = j27;
                break;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
            i6 = i14;
            i4 = i16;
        }
        return iNumberOfTrailingZeros;
    }

    private final int j(int i) {
        int i2 = this.f;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = (jArr[i5] >>> i6) | ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63));
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (java.lang.Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void k() {
        this.h = defpackage.adx.a(this.f) - this.g;
    }

    private final void l(int i) {
        int iMax;
        long[] jArr;
        int i2;
        int i3;
        java.lang.Object[] objArr;
        long[] jArr2;
        if (i > 0) {
            long[] jArr3 = defpackage.adx.a;
            iMax = java.lang.Math.max(7, (-1) >>> java.lang.Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.f = iMax;
        if (iMax == 0) {
            jArr = defpackage.adx.a;
            i2 = 0;
        } else {
            int i4 = (iMax + 15) >> 3;
            long[] jArr4 = new long[i4];
            java.util.Arrays.fill(jArr4, 0, i4, -9187201950435737472L);
            jArr = jArr4;
            i2 = iMax;
        }
        this.a = jArr;
        int i5 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i5] = (jArr[i5] & (~j)) | j;
        k();
        if (iMax == 0) {
            objArr = defpackage.aei.c;
            i3 = 0;
        } else {
            i3 = iMax;
            objArr = new java.lang.Object[iMax];
        }
        this.b = objArr;
        if (i3 == 0) {
            jArr2 = defpackage.aeb.a;
        } else {
            jArr2 = new long[i3];
            java.util.Arrays.fill(jArr2, 0, i3, 4611686018427387903L);
        }
        this.c = jArr2;
    }

    public final boolean a(java.lang.Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = this.f;
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = (i3 >>> 7) & i;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            int i8 = i3;
            long j = (jArr[i6] >>> i7) | ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63));
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i4) & i;
                if (defpackage.aooh.n(this.b[iNumberOfTrailingZeros], obj)) {
                    if (iNumberOfTrailingZeros < 0) {
                        break loop0;
                    }
                    return true;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i;
            i3 = i8;
        }
        return false;
    }

    public final boolean b() {
        return this.g == 0;
    }

    public final void c() {
        this.g = 0;
        if (this.a != defpackage.adx.a) {
            defpackage.ajsz.dh(this.a, -9187201950435737472L);
            long[] jArr = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        defpackage.ajsz.dm(this.b, 0, this.f);
        defpackage.ajsz.dh(this.c, 4611686018427387903L);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        k();
    }

    public final void d(java.lang.Object obj) {
        int i = i(obj);
        this.b[i] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[i] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = (jArr[i2] & (-4611686016279904257L)) | ((((long) i) & 2147483647L) << 31);
        }
        this.d = i;
        if (this.e == Integer.MAX_VALUE) {
            this.e = i;
        }
    }

    public final void e(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.f;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | ((long) i6);
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = (jArr2[i6] & (-4611686016279904257L)) | (((long) i5) << 31);
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ads) {
            defpackage.ads adsVar = (defpackage.ads) obj;
            if (adsVar.g == this.g) {
                java.lang.Object[] objArr = this.b;
                long[] jArr = this.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return true;
                }
                int i = 0;
                while (true) {
                    long j = ~jArr[i];
                    long j2 = -9187201950435737472L;
                    while (true) {
                        j &= j2;
                        if (j != 0) {
                            if (adsVar.a(objArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)])) {
                                j2 = (-1) + j;
                            }
                        }
                    }
                    if (i == length) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public final boolean f(java.lang.Object obj) {
        int i = this.g;
        int i2 = i(obj);
        this.b[i2] = obj;
        long[] jArr = this.c;
        int i3 = this.d;
        jArr[i2] = (((long) i3) & 2147483647L) | 4611686016279904256L;
        if (i3 != Integer.MAX_VALUE) {
            jArr[i3] = (jArr[i3] & (-4611686016279904257L)) | ((((long) i2) & 2147483647L) << 31);
        }
        this.d = i2;
        if (this.e == Integer.MAX_VALUE) {
            this.e = i2;
        }
        return this.g != i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public final boolean g(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.f;
        int i3 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i4 = i3 ^ (i3 >>> 16);
        int i5 = i4 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i2;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) (i4 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i6) & i2;
                if (defpackage.aooh.n(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        int i9 = iNumberOfTrailingZeros ^ (-1);
        ?? r0 = i9 >>> 31;
        if (i9 < 0) {
            e(iNumberOfTrailingZeros);
        }
        return r0;
    }

    public final boolean h(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        java.lang.Object[] objArr = this.b;
        int i = this.g;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = ~jArr[i2];
                long j2 = -9187201950435737472L;
                while (true) {
                    j &= j2;
                    if (j == 0) {
                        break;
                    }
                    int iNumberOfTrailingZeros = (i2 << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3);
                    if (!defpackage.ajsz.cj(collection, objArr[iNumberOfTrailingZeros])) {
                        e(iNumberOfTrailingZeros);
                    }
                    j2 = (-1) + j;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this.g;
    }

    public final int hashCode() {
        int iHashCode = (this.f * 31) + this.g;
        java.lang.Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = ~jArr[i];
                long j2 = -9187201950435737472L;
                while (true) {
                    j &= j2;
                    if (j == 0) {
                        break;
                    }
                    java.lang.Object obj = objArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)];
                    if (!defpackage.aooh.n(obj, this)) {
                        iHashCode += obj != null ? obj.hashCode() : 0;
                    }
                    j2 = (-1) + j;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.CharSequence, java.lang.Object] */
    public final java.lang.String toString() {
        defpackage.nm nmVar = new defpackage.nm(this, 3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.lang.Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (i != Integer.MAX_VALUE) {
            long j = jArr[i] >> 31;
            java.lang.Object obj = objArr[i];
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            sb.append((java.lang.CharSequence) nmVar.a(obj));
            i2++;
            i = (int) (j & 2147483647L);
        }
        sb.append((java.lang.CharSequence) "]");
        return sb.toString();
    }

    public ads() {
    }
}
