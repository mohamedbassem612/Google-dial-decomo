package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acq {
    public long[] a = defpackage.adx.a;
    public int[] b = defpackage.acr.a;
    public int c;
    public int d;
    private int e;

    public acq(int i) {
        if (i < 0) {
            defpackage.un.a("Capacity must be a positive value.");
        }
        h(defpackage.adx.c(i));
    }

    private final int f(int i) {
        int i2 = this.c;
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

    private final void g() {
        this.e = defpackage.adx.a(this.c) - this.d;
    }

    private final void h(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            long[] jArr2 = defpackage.adx.a;
            iMax = java.lang.Math.max(7, (-1) >>> java.lang.Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.c = iMax;
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
        g();
        this.b = new int[iMax];
    }

    public final boolean a(int i) {
        int i2 = ((i >>> 16) ^ i) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = this.c;
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

    public final void b() {
        this.d = 0;
        if (this.a != defpackage.adx.a) {
            long[] jArr = this.a;
            int length = jArr.length;
            if (jArr == null) {
                defpackage.aooh.i("<this>");
            }
            java.util.Arrays.fill(jArr, 0, length, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        g();
    }

    public final void c(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.c;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(int i) {
        long j;
        int i2;
        long j2;
        int iF;
        int i3 = i;
        int i4 = -862048943;
        int i5 = ((i3 >>> 16) ^ i3) * (-862048943);
        int i6 = i5 ^ (i5 >>> 16);
        int i7 = this.d;
        int i8 = i6 >>> 7;
        int i9 = this.c;
        int i10 = i8 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j3 = jArr[i12] >>> i13;
            long j4 = jArr[i12 + 1] << (64 - i13);
            int i14 = i11;
            int i15 = 0;
            long j5 = i6 & 127;
            long j6 = j3 | (j4 & ((-i13) >> 63));
            long j7 = (72340172838076673L * j5) ^ j6;
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                iF = ((java.lang.Long.numberOfTrailingZeros(j8) >> 3) + i10) & i9;
                int i16 = i4;
                if (this.b[iF] == i3) {
                    i2 = 0;
                    break loop0;
                }
                j8 &= j8 - 1;
                i4 = i16;
            }
            int i17 = i4;
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                int iF2 = f(i8);
                long j9 = 255;
                if (this.e != 0 || ((this.a[iF2 >> 3] >> ((iF2 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i2 = 0;
                    j2 = 128;
                    iF = iF2;
                } else {
                    int i18 = this.c;
                    if (i18 > 8) {
                        j2 = 128;
                        if (java.lang.Long.compare((((long) this.d) << 5) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.a;
                            int i19 = this.c;
                            int[] iArr = this.b;
                            int i20 = i19 + 7;
                            int i21 = 0;
                            while (i21 < (i20 >> 3)) {
                                long j10 = j9;
                                long j11 = jArr2[i21] & (-9187201950435737472L);
                                jArr2[i21] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                i21++;
                                i15 = i15;
                                j9 = j10;
                            }
                            j = j9;
                            int i22 = i15;
                            int iCF = defpackage.ajsz.cF(jArr2);
                            int i23 = iCF - 1;
                            long j12 = 72057594037927935L;
                            jArr2[i23] = (jArr2[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iCF] = jArr2[i22];
                            int i24 = i22;
                            while (i24 != i19) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j13 = (jArr2[i25] >> i26) & j;
                                if (j13 == 128 || j13 != 254) {
                                    i24++;
                                } else {
                                    int i27 = iArr[i24];
                                    int i28 = (i27 ^ (i27 >>> 16)) * i17;
                                    int i29 = i28 ^ (i28 >>> 16);
                                    int i30 = i29 & 127;
                                    int i31 = i29 >>> 7;
                                    int iF3 = f(i31);
                                    int i32 = i31 & i19;
                                    int i33 = i22;
                                    j12 = j12;
                                    long j14 = i30;
                                    if (((iF3 - i32) & i19) / 8 == ((i24 - i32) & i19) / 8) {
                                        jArr2[i25] = (jArr2[i25] & (~(j << i26))) | (j14 << i26);
                                        jArr2[defpackage.ajsz.cF(jArr2)] = (jArr2[i33] & j12) | Long.MIN_VALUE;
                                        i24++;
                                    } else {
                                        int i34 = iF3 >> 3;
                                        long j15 = jArr2[i34];
                                        int i35 = (iF3 & 7) << 3;
                                        long j16 = j14 << i35;
                                        long[] jArr3 = jArr2;
                                        long j17 = (~(j << i35)) & j15;
                                        if (((j15 >> i35) & j) == 128) {
                                            long j18 = ~(j << i26);
                                            jArr3[i34] = j17 | j16;
                                            jArr3[i25] = (jArr3[i25] & j18) | (128 << i26);
                                            iArr[iF3] = iArr[i24];
                                            iArr[i24] = i33;
                                        } else {
                                            jArr3[i34] = j17 | j16;
                                            int i36 = iArr[iF3];
                                            iArr[iF3] = iArr[i24];
                                            iArr[i24] = i36;
                                            i24--;
                                        }
                                        jArr3[defpackage.ajsz.cF(jArr3)] = (jArr3[i33] & j12) | Long.MIN_VALUE;
                                        i24++;
                                        jArr2 = jArr3;
                                    }
                                    i22 = i33;
                                }
                            }
                            i2 = i22;
                            g();
                        }
                        iF = f(i8);
                    } else {
                        j2 = 128;
                    }
                    j = 255;
                    i2 = 0;
                    int iB = defpackage.adx.b(this.c);
                    long[] jArr4 = this.a;
                    int[] iArr2 = this.b;
                    h(iB);
                    long[] jArr5 = this.a;
                    int[] iArr3 = this.b;
                    int i37 = this.c;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i38 = 0;
                        while (true) {
                            long j19 = (~jArr4[i38]) & (-9187201950435737472L);
                            while (j19 != 0) {
                                int i39 = iArr2[(i38 << 3) + (java.lang.Long.numberOfTrailingZeros(j19) >>> 3)];
                                int i40 = ((i39 >>> 16) ^ i39) * i17;
                                int i41 = i40 ^ (i40 >>> 16);
                                long[] jArr6 = jArr5;
                                int iF4 = f(i41 >>> 7);
                                int i42 = iF4 >> 3;
                                int i43 = (iF4 & 7) << 3;
                                long j20 = (jArr6[i42] & (~(255 << i43))) | (((long) (i41 & 127)) << i43);
                                jArr6[i42] = j20;
                                jArr6[(((iF4 - 7) & i37) + (i37 & 7)) >> 3] = j20;
                                iArr3[iF4] = i39;
                                j19 &= j19 - 1;
                                jArr5 = jArr6;
                                jArr4 = jArr4;
                            }
                            long[] jArr7 = jArr5;
                            long[] jArr8 = jArr4;
                            if (i38 == length) {
                                break;
                            }
                            i38++;
                            jArr5 = jArr7;
                            jArr4 = jArr8;
                        }
                    }
                    iF = f(i8);
                }
                this.d++;
                int i44 = this.e;
                long[] jArr9 = this.a;
                int i45 = iF >> 3;
                long j21 = jArr9[i45];
                int i46 = (iF & 7) << 3;
                this.e = i44 - (((j21 >> i46) & j) == j2 ? 1 : i2);
                int i47 = this.c;
                long j22 = (j21 & (~(j << i46))) | (j5 << i46);
                jArr9[i45] = j22;
                jArr9[(((iF - 7) & i47) + (i47 & 7)) >> 3] = j22;
                break;
            }
            i11 = i14 + 8;
            i10 = (i10 + i11) & i9;
            i3 = i;
            i4 = i17;
        }
        this.b[iF] = i;
        if (this.d != i7) {
            return true;
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final boolean e(int i) {
        int iNumberOfTrailingZeros;
        int i2 = ((i >>> 16) ^ i) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = this.c;
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
        int i9 = iNumberOfTrailingZeros ^ (-1);
        ?? r0 = i9 >>> 31;
        if (i9 < 0) {
            c(iNumberOfTrailingZeros);
        }
        return r0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acq) {
            defpackage.acq acqVar = (defpackage.acq) obj;
            if (acqVar.d == this.d) {
                int[] iArr = this.b;
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
                            if (acqVar.a(iArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)])) {
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

    public final int hashCode() {
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        int i = 0;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            long j = ~jArr[i];
            long j2 = -9187201950435737472L;
            while (true) {
                j &= j2;
                if (j == 0) {
                    break;
                }
                i2 += iArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)];
                j2 = (-1) + j;
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = ~jArr[i];
                long j2 = -9187201950435737472L;
                while (true) {
                    j &= j2;
                    if (j != 0) {
                        int i3 = iArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)];
                        if (i2 != 0) {
                            sb.append((java.lang.CharSequence) ", ");
                        }
                        if (i2 == -1) {
                            sb.append((java.lang.CharSequence) "...");
                            break loop0;
                        }
                        sb.append(i3);
                        i2++;
                        j2 = (-1) + j;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((java.lang.CharSequence) "]");
        return sb.toString();
    }

    public acq() {
    }
}
