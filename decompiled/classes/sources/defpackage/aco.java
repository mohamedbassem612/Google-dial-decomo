package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aco {
    public long[] a = defpackage.adx.a;
    public int[] b = defpackage.acr.a;
    public java.lang.Object[] c = defpackage.aei.c;
    public int d;
    public int e;
    private int f;

    public aco(int i) {
        if (i < 0) {
            defpackage.un.a("Capacity must be a positive value.");
        }
        k(defpackage.adx.c(i));
    }

    private final int i(int i) {
        int i2 = this.d;
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

    private final void j() {
        this.f = defpackage.adx.a(this.d) - this.e;
    }

    private final void k(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            long[] jArr2 = defpackage.adx.a;
            iMax = java.lang.Math.max(7, (-1) >>> java.lang.Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.d = iMax;
        if (iMax == 0) {
            jArr = defpackage.adx.a;
        } else {
            int i2 = (iMax + 15) >> 3;
            long[] jArr3 = new long[i2];
            java.util.Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        j();
        this.b = new int[iMax];
        this.c = new java.lang.Object[iMax];
    }

    public final java.lang.Object a(int i) {
        int iNumberOfTrailingZeros;
        int i2 = ((i >>> 16) ^ i) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = this.d;
        int i5 = (i3 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final boolean b(int i) {
        int i2 = ((i >>> 16) ^ i) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = this.d;
        int i5 = (i3 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            int i9 = i6;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    if (iNumberOfTrailingZeros < 0) {
                        break loop0;
                    }
                    return true;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                break;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
        }
        return false;
    }

    public final int c(int i) {
        long j;
        int i2;
        int i3;
        long j2;
        int i4 = -862048943;
        int i5 = ((i >>> 16) ^ i) * (-862048943);
        int i6 = i5 ^ (i5 >>> 16);
        int i7 = i6 >>> 7;
        int i8 = this.d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j3 = jArr[i11] >>> i12;
            int i13 = 1;
            long j4 = jArr[i11 + 1] << (64 - i12);
            int i14 = i10;
            int i15 = 0;
            long j5 = i6 & 127;
            long j6 = j3 | (j4 & ((-i12) >> 63));
            long j7 = (72340172838076673L * j5) ^ j6;
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j8) >> 3) + i9) & i8;
                int i16 = i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i4 = i16;
            }
            int i17 = i4;
            char c = '\b';
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                int i18 = i(i7);
                long j9 = 255;
                if (this.f != 0 || ((this.a[i18 >> 3] >> ((i18 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i2 = 0;
                    i3 = 1;
                    j2 = 128;
                } else {
                    int i19 = this.d;
                    if (i19 <= 8 || java.lang.Long.compare((((long) this.e) << 5) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) > 0) {
                        j = 255;
                        i2 = 0;
                        j2 = 128;
                        int iB = defpackage.adx.b(this.d);
                        long[] jArr2 = this.a;
                        int[] iArr = this.b;
                        java.lang.Object[] objArr = this.c;
                        k(iB);
                        long[] jArr3 = this.a;
                        int[] iArr2 = this.b;
                        java.lang.Object[] objArr2 = this.c;
                        int i20 = this.d;
                        int length = jArr2.length - 2;
                        if (length >= 0) {
                            int i21 = 0;
                            while (true) {
                                long j10 = (~jArr2[i21]) & (-9187201950435737472L);
                                while (j10 != 0) {
                                    int iNumberOfTrailingZeros2 = (i21 << 3) + (java.lang.Long.numberOfTrailingZeros(j10) >>> 3);
                                    int i22 = iArr[iNumberOfTrailingZeros2];
                                    int i23 = (i22 ^ (i22 >>> 16)) * i17;
                                    int i24 = i23 ^ (i23 >>> 16);
                                    int i25 = i13;
                                    int i26 = i(i24 >>> 7);
                                    long[] jArr4 = jArr3;
                                    int i27 = i24 & 127;
                                    int i28 = i26 >> 3;
                                    int i29 = (i26 & 7) << 3;
                                    long j11 = (jArr4[i28] & (~(255 << i29))) | (((long) i27) << i29);
                                    jArr4[i28] = j11;
                                    jArr4[(((i26 - 7) & i20) + (i20 & 7)) >> 3] = j11;
                                    iArr2[i26] = i22;
                                    objArr2[i26] = objArr[iNumberOfTrailingZeros2];
                                    j10 &= j10 - 1;
                                    i13 = i25;
                                    jArr3 = jArr4;
                                    jArr2 = jArr2;
                                    iArr = iArr;
                                }
                                long[] jArr5 = jArr3;
                                long[] jArr6 = jArr2;
                                int[] iArr3 = iArr;
                                i3 = i13;
                                if (i21 == length) {
                                    break;
                                }
                                i21++;
                                i13 = i3;
                                jArr3 = jArr5;
                                jArr2 = jArr6;
                                iArr = iArr3;
                            }
                        }
                        i18 = i(i7);
                    } else {
                        long[] jArr7 = this.a;
                        int i30 = this.d;
                        int[] iArr4 = this.b;
                        java.lang.Object[] objArr3 = this.c;
                        int i31 = i30 + 7;
                        int i32 = 0;
                        j2 = 128;
                        while (i32 < (i31 >> 3)) {
                            long j12 = jArr7[i32] & (-9187201950435737472L);
                            jArr7[i32] = ((~j12) + (j12 >>> 7)) & (-72340172838076674L);
                            i32++;
                            c = c;
                            j9 = j9;
                        }
                        j = j9;
                        int iCF = defpackage.ajsz.cF(jArr7);
                        int i33 = iCF - 1;
                        jArr7[i33] = (jArr7[i33] & 72057594037927935L) | (-72057594037927936L);
                        jArr7[iCF] = jArr7[0];
                        int i34 = 0;
                        while (i34 != i30) {
                            int i35 = i34 >> 3;
                            int i36 = (i34 & 7) << 3;
                            long j13 = (jArr7[i35] >> i36) & j;
                            if (j13 == 128 || j13 != 254) {
                                i34++;
                            } else {
                                int i37 = iArr4[i34];
                                int i38 = (i37 ^ (i37 >>> 16)) * i17;
                                int i39 = i38 ^ (i38 >>> 16);
                                int i40 = i39 & 127;
                                int i41 = i39 >>> 7;
                                int i42 = i(i41);
                                int i43 = i41 & i30;
                                int i44 = i15;
                                long[] jArr8 = jArr7;
                                int i45 = i30;
                                long j14 = i40;
                                if (((i42 - i43) & i30) / 8 == ((i34 - i43) & i30) / 8) {
                                    jArr8[i35] = (jArr8[i35] & (~(j << i36))) | (j14 << i36);
                                    jArr8[defpackage.ajsz.cF(jArr8)] = (jArr8[i44] & 72057594037927935L) | Long.MIN_VALUE;
                                    i34++;
                                } else {
                                    int i46 = i42 >> 3;
                                    long j15 = jArr8[i46];
                                    int i47 = (i42 & 7) << 3;
                                    long j16 = j14 << i47;
                                    long j17 = j15 & (~(j << i47));
                                    if (((j15 >> i47) & j) == 128) {
                                        long j18 = ~(j << i36);
                                        jArr8[i46] = j17 | j16;
                                        jArr8[i35] = (jArr8[i35] & j18) | (128 << i36);
                                        iArr4[i42] = iArr4[i34];
                                        iArr4[i34] = i44;
                                        objArr3[i42] = objArr3[i34];
                                        objArr3[i34] = null;
                                    } else {
                                        jArr8[i46] = j17 | j16;
                                        int i48 = iArr4[i42];
                                        iArr4[i42] = iArr4[i34];
                                        iArr4[i34] = i48;
                                        java.lang.Object obj = objArr3[i42];
                                        objArr3[i42] = objArr3[i34];
                                        objArr3[i34] = obj;
                                        i34--;
                                    }
                                    jArr8[defpackage.ajsz.cF(jArr8)] = (jArr8[i44] & 72057594037927935L) | Long.MIN_VALUE;
                                    i34++;
                                }
                                jArr7 = jArr8;
                                i30 = i45;
                                i15 = i44;
                            }
                        }
                        i2 = i15;
                        j();
                    }
                    i3 = 1;
                    i18 = i(i7);
                }
                this.e++;
                int i49 = this.f;
                long[] jArr9 = this.a;
                int i50 = i18 >> 3;
                long j19 = jArr9[i50];
                int i51 = (i18 & 7) << 3;
                if (((j19 >> i51) & j) == j2) {
                    i2 = i3;
                }
                this.f = i49 - i2;
                int i52 = this.d;
                long j20 = (j19 & (~(j << i51))) | (j5 << i51);
                jArr9[i50] = j20;
                jArr9[(((i18 - 7) & i52) + (i52 & 7)) >> 3] = j20;
                return ~i18;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i17;
        }
    }

    public final java.lang.Object d(int i) {
        int iNumberOfTrailingZeros;
        int i2 = ((i >>> 16) ^ i) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = this.d;
        int i5 = (i3 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return e(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final java.lang.Object e(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        long j = jArr[i2] >>> i3;
        long j2 = jArr[i2 + 1] << (64 - i3);
        int i4 = (i - 8) & this.d;
        int i5 = i4 >> 3;
        int i6 = (i4 & 7) << 3;
        long j3 = jArr[i5] >>> i6;
        long j4 = jArr[i5 + 1] << (64 - i6);
        long j5 = j | (j2 & ((-i3) >> 63));
        long j6 = j5 & ((~j5) << 6) & (-9187201950435737472L);
        int iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j6);
        long j7 = j3 | (((-i6) >> 63) & j4);
        long j8 = j7 & ((~j7) << 6) & (-9187201950435737472L);
        int iNumberOfLeadingZeros = iNumberOfTrailingZeros + java.lang.Long.numberOfLeadingZeros(j8);
        int i7 = this.d;
        long j9 = jArr[i2] & (~(255 << i3));
        int i8 = (j6 != 0 ? 1 : 0) & (j8 != 0 ? 1 : 0) & ((iNumberOfLeadingZeros >>> 3) < 8 ? 1 : 0);
        long j10 = j9 | ((1 != i8 ? 254L : 128L) << i3);
        jArr[i2] = j10;
        jArr[(((i - 7) & i7) + (i7 & 7)) >> 3] = j10;
        this.f += i8;
        java.lang.Object[] objArr = this.c;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aco) {
            defpackage.aco acoVar = (defpackage.aco) obj;
            if (acoVar.e == this.e) {
                int[] iArr = this.b;
                java.lang.Object[] objArr = this.c;
                long[] jArr = this.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return true;
                }
                int i = 0;
                loop0: while (true) {
                    long j = ~jArr[i];
                    long j2 = -9187201950435737472L;
                    while (true) {
                        j &= j2;
                        if (j != 0) {
                            int iNumberOfTrailingZeros = (i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3);
                            int i2 = iArr[iNumberOfTrailingZeros];
                            java.lang.Object obj2 = objArr[iNumberOfTrailingZeros];
                            if (obj2 == null) {
                                if (acoVar.a(i2) != null || !acoVar.b(i2)) {
                                    break loop0;
                                }
                                j2 = (-1) + j;
                            } else {
                                if (!defpackage.aooh.n(obj2, acoVar.a(i2))) {
                                    break loop0;
                                }
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

    public final void f() {
        this.e = 0;
        if (this.a != defpackage.adx.a) {
            long[] jArr = this.a;
            int length = jArr.length;
            if (jArr == null) {
                defpackage.aooh.i("<this>");
            }
            java.util.Arrays.fill(jArr, 0, length, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        java.lang.Object[] objArr = this.c;
        int i3 = this.d;
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.Arrays.fill(objArr, 0, i3, (java.lang.Object) null);
        j();
    }

    public final void g(int i, java.lang.Object obj) {
        int iC = c(i);
        if (iC < 0) {
            iC = ~iC;
        }
        this.b[iC] = i;
        this.c[iC] = obj;
    }

    public final void h(int i, java.lang.Object obj) {
        int iC = c(i);
        if (iC < 0) {
            iC = ~iC;
        }
        java.lang.Object[] objArr = this.c;
        java.lang.Object obj2 = objArr[iC];
        this.b[iC] = i;
        objArr[iC] = obj;
    }

    public final int hashCode() {
        int[] iArr = this.b;
        java.lang.Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = ~jArr[i];
            long j2 = -9187201950435737472L;
            while (true) {
                j &= j2;
                if (j == 0) {
                    break;
                }
                int iNumberOfTrailingZeros = (i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3);
                int i2 = iArr[iNumberOfTrailingZeros];
                java.lang.Object obj = objArr[iNumberOfTrailingZeros];
                iHashCode += i2 ^ (obj != null ? obj.hashCode() : 0);
                j2 = (-1) + j;
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final java.lang.String toString() {
        if (this.e == 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        int[] iArr = this.b;
        java.lang.Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = ~jArr[i];
                long j2 = -9187201950435737472L;
                while (true) {
                    j &= j2;
                    if (j == 0) {
                        break;
                    }
                    int iNumberOfTrailingZeros = (i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3);
                    int i3 = iArr[iNumberOfTrailingZeros];
                    java.lang.Object obj = objArr[iNumberOfTrailingZeros];
                    sb.append(i3);
                    sb.append('=');
                    if (obj == this) {
                        obj = "(this)";
                    }
                    sb.append(obj);
                    i2++;
                    if (i2 < this.e) {
                        sb.append(", ");
                    }
                    j2 = (-1) + j;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public aco() {
    }
}
