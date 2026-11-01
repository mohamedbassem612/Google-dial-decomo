package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acj {
    public long[] a = defpackage.adx.a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public acj(int i) {
        int[] iArr = defpackage.acr.a;
        this.b = iArr;
        this.c = iArr;
        g(i);
    }

    private final int e(int i) {
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

    private final void f() {
        this.f = defpackage.adx.a(this.d) - this.e;
    }

    private final void g(int i) {
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
        f();
        this.b = new int[iMax];
        this.c = new int[iMax];
    }

    public final int a(int i) {
        int i2 = ((i >>> 16) ^ i) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = this.d;
        int i5 = (i3 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final void b() {
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
        f();
    }

    public final void c(int i, int i2) {
        long j;
        int i3;
        int i4;
        long j2;
        int iNumberOfTrailingZeros;
        int i5 = i;
        int i6 = -862048943;
        int i7 = ((i5 >>> 16) ^ i5) * (-862048943);
        int i8 = i7 ^ (i7 >>> 16);
        int i9 = i8 >>> 7;
        int i10 = this.d;
        int i11 = i9 & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j3 = jArr[i13] >>> i14;
            int i15 = 1;
            long j4 = jArr[i13 + 1] << (64 - i14);
            int i16 = i12;
            int i17 = 0;
            long j5 = i8 & 127;
            long j6 = j3 | (j4 & ((-i14) >> 63));
            long j7 = (72340172838076673L * j5) ^ j6;
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j8) >> 3) + i11) & i10;
                int i18 = i6;
                if (this.b[iNumberOfTrailingZeros] == i5) {
                    break loop0;
                }
                j8 &= j8 - 1;
                i6 = i18;
            }
            int i19 = i6;
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i9);
                if (this.f != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i3 = 0;
                    i4 = 1;
                    j2 = 128;
                } else {
                    int i20 = this.d;
                    if (i20 > 8) {
                        j2 = 128;
                        if (java.lang.Long.compare((((long) this.e) << 5) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.a;
                            int i21 = this.d;
                            int[] iArr = this.b;
                            int[] iArr2 = this.c;
                            int i22 = i21 + 7;
                            j = 255;
                            int i23 = 0;
                            while (i23 < (i22 >> 3)) {
                                long j9 = jArr2[i23] & (-9187201950435737472L);
                                jArr2[i23] = ((~j9) + (j9 >>> 7)) & (-72340172838076674L);
                                i23++;
                                i17 = i17;
                            }
                            i3 = i17;
                            int iCF = defpackage.ajsz.cF(jArr2);
                            int i24 = iCF - 1;
                            long j10 = 72057594037927935L;
                            jArr2[i24] = (jArr2[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iCF] = jArr2[i3];
                            int i25 = i3;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j11 = (jArr2[i26] >> i27) & 255;
                                if (j11 == 128 || j11 != 254) {
                                    i25++;
                                } else {
                                    int i28 = iArr[i25];
                                    int i29 = (i28 ^ (i28 >>> 16)) * i19;
                                    int i30 = i29 ^ (i29 >>> 16);
                                    int i31 = i30 & 127;
                                    int i32 = i30 >>> 7;
                                    int iE2 = e(i32);
                                    int i33 = i32 & i21;
                                    long j12 = j10;
                                    long[] jArr3 = jArr2;
                                    long j13 = i31;
                                    if (((iE2 - i33) & i21) / 8 == ((i25 - i33) & i21) / 8) {
                                        jArr3[i26] = (jArr3[i26] & (~(255 << i27))) | (j13 << i27);
                                        jArr3[defpackage.ajsz.cF(jArr3)] = (jArr3[i3] & j12) | Long.MIN_VALUE;
                                        i25++;
                                    } else {
                                        int i34 = iE2 >> 3;
                                        long j14 = jArr3[i34];
                                        int i35 = (iE2 & 7) << 3;
                                        long j15 = j13 << i35;
                                        long j16 = (~(255 << i35)) & j14;
                                        if (((j14 >> i35) & 255) == 128) {
                                            long j17 = ~(255 << i27);
                                            jArr3[i34] = j16 | j15;
                                            jArr3[i26] = (jArr3[i26] & j17) | (128 << i27);
                                            iArr[iE2] = iArr[i25];
                                            iArr[i25] = i3;
                                            iArr2[iE2] = iArr2[i25];
                                            iArr2[i25] = i3;
                                        } else {
                                            jArr3[i34] = j16 | j15;
                                            int i36 = iArr[iE2];
                                            iArr[iE2] = iArr[i25];
                                            iArr[i25] = i36;
                                            int i37 = iArr2[iE2];
                                            iArr2[iE2] = iArr2[i25];
                                            iArr2[i25] = i37;
                                            i25--;
                                        }
                                        jArr3[defpackage.ajsz.cF(jArr3)] = (jArr3[i3] & j12) | Long.MIN_VALUE;
                                        i25++;
                                    }
                                    jArr2 = jArr3;
                                    j10 = j12;
                                }
                            }
                            f();
                        }
                        i4 = 1;
                        iE = e(i9);
                    } else {
                        j2 = 128;
                    }
                    j = 255;
                    i3 = 0;
                    int iB = defpackage.adx.b(this.d);
                    long[] jArr4 = this.a;
                    int[] iArr3 = this.b;
                    int[] iArr4 = this.c;
                    g(iB);
                    long[] jArr5 = this.a;
                    int[] iArr5 = this.b;
                    int[] iArr6 = this.c;
                    int i38 = this.d;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i39 = 0;
                        while (true) {
                            long j18 = (~jArr4[i39]) & (-9187201950435737472L);
                            while (j18 != 0) {
                                int iNumberOfTrailingZeros2 = (i39 << 3) + (java.lang.Long.numberOfTrailingZeros(j18) >>> 3);
                                int i40 = iArr3[iNumberOfTrailingZeros2];
                                int i41 = (i40 ^ (i40 >>> 16)) * i19;
                                int i42 = i41 ^ (i41 >>> 16);
                                int i43 = i15;
                                int iE3 = e(i42 >>> 7);
                                long[] jArr6 = jArr5;
                                int i44 = i42 & 127;
                                int i45 = iE3 >> 3;
                                int i46 = (iE3 & 7) << 3;
                                long j19 = (jArr6[i45] & (~(255 << i46))) | (((long) i44) << i46);
                                jArr6[i45] = j19;
                                jArr6[(((iE3 - 7) & i38) + (i38 & 7)) >> 3] = j19;
                                iArr5[iE3] = i40;
                                iArr6[iE3] = iArr4[iNumberOfTrailingZeros2];
                                j18 &= j18 - 1;
                                i15 = i43;
                                jArr5 = jArr6;
                                jArr4 = jArr4;
                                iArr3 = iArr3;
                            }
                            long[] jArr7 = jArr5;
                            long[] jArr8 = jArr4;
                            int[] iArr7 = iArr3;
                            i4 = i15;
                            if (i39 == length) {
                                break;
                            }
                            i39++;
                            i15 = i4;
                            jArr5 = jArr7;
                            jArr4 = jArr8;
                            iArr3 = iArr7;
                        }
                    } else {
                        i4 = 1;
                    }
                    iE = e(i9);
                }
                this.e++;
                int i47 = this.f;
                long[] jArr9 = this.a;
                int i48 = iE >> 3;
                long j20 = jArr9[i48];
                int i49 = (iE & 7) << 3;
                if (((j20 >> i49) & j) != j2) {
                    i4 = i3;
                }
                this.f = i47 - i4;
                int i50 = this.d;
                long j21 = (j20 & (~(j << i49))) | (j5 << i49);
                jArr9[i48] = j21;
                jArr9[(((iE - 7) & i50) + (i50 & 7)) >> 3] = j21;
                iNumberOfTrailingZeros = ~iE;
                break;
            }
            i12 = i16 + 8;
            i11 = (i11 + i12) & i10;
            i5 = i;
            i6 = i19;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = i;
        this.c[iNumberOfTrailingZeros] = i2;
    }

    public final int d(int i) {
        int iA = a(i);
        if (iA >= 0) {
            return this.c[iA];
        }
        return -1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acj) {
            defpackage.acj acjVar = (defpackage.acj) obj;
            if (acjVar.e == this.e) {
                int[] iArr = this.b;
                int[] iArr2 = this.c;
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
                            int i3 = iArr2[iNumberOfTrailingZeros];
                            int iA = acjVar.a(i2);
                            if (iA < 0 || i3 != acjVar.c[iA]) {
                                break loop0;
                            }
                            j2 = (-1) + j;
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
        int[] iArr2 = this.c;
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
                int iNumberOfTrailingZeros = (i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3);
                i2 += iArr[iNumberOfTrailingZeros] ^ iArr2[iNumberOfTrailingZeros];
                j2 = (-1) + j;
            }
            if (i == length) {
                return i2;
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
        int[] iArr2 = this.c;
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
                    int i4 = iArr2[iNumberOfTrailingZeros];
                    sb.append(i3);
                    sb.append('=');
                    sb.append(i4);
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

    public acj() {
        int[] iArr = defpackage.acr.a;
        this.b = iArr;
        this.c = iArr;
    }
}
