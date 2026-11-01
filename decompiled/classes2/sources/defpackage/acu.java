package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class acu {
    public long[] a = adx.a;
    public long[] b = ada.a;
    public int[] c = acr.a;
    public int d;
    public int e;
    private int f;

    public acu(int i) {
        f(adx.c(i));
    }

    private final int d(int i) {
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

    private final void e() {
        this.f = adx.a(this.d) - this.e;
    }

    private final void f(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            long[] jArr2 = adx.a;
            iMax = java.lang.Math.max(7, (-1) >>> java.lang.Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.d = iMax;
        if (iMax == 0) {
            jArr = adx.a;
        } else {
            jArr = new long[(iMax + 15) >> 3];
            ajsz.dh(jArr, -9187201950435737472L);
        }
        this.a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        e();
        this.b = new long[iMax];
        this.c = new int[iMax];
    }

    public final int a(long j) {
        int iM = anty.M(j);
        int i = (iM ^ (iM >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = this.d;
        int i4 = (i2 >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = (jArr[i6] >>> i7) | ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63));
            long j3 = (((long) (i2 & 127)) * 72340172838076673L) ^ j2;
            for (long j4 = ((-72340172838076673L) + j3) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final int b(long j) {
        int iA = a(j);
        if (iA < 0) {
            un.d(a.bz(j, "Cannot find value for key "));
        }
        return this.c[iA];
    }

    public final void c(long j, int i) {
        long j2;
        int i2;
        int i3;
        long j3;
        int iNumberOfTrailingZeros;
        int iM = anty.M(j);
        int i4 = -862048943;
        int i5 = (iM ^ (iM >>> 16)) * (-862048943);
        int i6 = i5 ^ (i5 >>> 16);
        int i7 = i6 >>> 7;
        int i8 = this.d;
        int i9 = i7 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j4 = jArr[i11] >>> i12;
            int i13 = 1;
            long j5 = jArr[i11 + 1] << (64 - i12);
            int i14 = i10;
            int i15 = 0;
            long j6 = i6 & 127;
            long j7 = j4 | (j5 & ((-i12) >> 63));
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = ((-72340172838076673L) + j8) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i9) & i8;
                int i16 = i4;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j9 &= j9 - 1;
                i4 = i16;
            }
            int i17 = i4;
            long j10 = -9187201950435737472L;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int iD = d(i7);
                if (this.f != 0 || ((this.a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    i2 = 0;
                    i3 = 1;
                    j3 = 128;
                } else {
                    int i18 = this.d;
                    if (i18 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.e) << 5) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.a;
                            int i19 = this.d;
                            long[] jArr3 = this.b;
                            int[] iArr = this.c;
                            int i20 = i19 + 7;
                            j2 = 255;
                            int i21 = 0;
                            while (i21 < (i20 >> 3)) {
                                long j11 = jArr2[i21] & (-9187201950435737472L);
                                jArr2[i21] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                i21++;
                                i15 = i15;
                            }
                            i2 = i15;
                            int iCF = ajsz.cF(jArr2);
                            int i22 = iCF - 1;
                            long j12 = 72057594037927935L;
                            jArr2[i22] = (jArr2[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iCF] = jArr2[i2];
                            int i23 = i2;
                            while (i23 != i19) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j13 = (jArr2[i24] >> i25) & 255;
                                if (j13 == 128 || j13 != 254) {
                                    i23++;
                                } else {
                                    int iM2 = anty.M(jArr3[i23]);
                                    int i26 = (iM2 ^ (iM2 >>> 16)) * i17;
                                    int i27 = i26 ^ (i26 >>> 16);
                                    int i28 = i27 & 127;
                                    int i29 = i27 >>> 7;
                                    int iD2 = d(i29);
                                    int i30 = i29 & i19;
                                    long j14 = j12;
                                    int i31 = i13;
                                    long j15 = i28;
                                    if (((iD2 - i30) & i19) / 8 == ((i23 - i30) & i19) / 8) {
                                        jArr2[i24] = (jArr2[i24] & (~(255 << i25))) | (j15 << i25);
                                        jArr2[ajsz.cF(jArr2)] = (jArr2[i2] & j14) | Long.MIN_VALUE;
                                        i23++;
                                        i13 = i31;
                                        j12 = j14;
                                    } else {
                                        int i32 = iD2 >> 3;
                                        long j16 = jArr2[i32];
                                        int i33 = (iD2 & 7) << 3;
                                        long j17 = j15 << i33;
                                        long j18 = (~(255 << i33)) & j16;
                                        if (((j16 >> i33) & 255) == 128) {
                                            long j19 = ~(255 << i25);
                                            jArr2[i32] = j18 | j17;
                                            jArr2[i24] = (jArr2[i24] & j19) | (128 << i25);
                                            jArr3[iD2] = jArr3[i23];
                                            jArr3[i23] = 0;
                                            iArr[iD2] = iArr[i23];
                                            iArr[i23] = i2;
                                        } else {
                                            jArr2[i32] = j18 | j17;
                                            long j20 = jArr3[iD2];
                                            jArr3[iD2] = jArr3[i23];
                                            jArr3[i23] = j20;
                                            int i34 = iArr[iD2];
                                            iArr[iD2] = iArr[i23];
                                            iArr[i23] = i34;
                                            i23--;
                                        }
                                        jArr2[ajsz.cF(jArr2)] = (jArr2[i2] & j14) | Long.MIN_VALUE;
                                        i23++;
                                        j12 = j14;
                                        i13 = i31;
                                    }
                                }
                            }
                            i3 = i13;
                            e();
                        }
                        iD = d(i7);
                    } else {
                        j3 = 128;
                    }
                    j2 = 255;
                    i2 = 0;
                    i3 = 1;
                    int iB = adx.b(this.d);
                    long[] jArr4 = this.a;
                    long[] jArr5 = this.b;
                    int[] iArr2 = this.c;
                    f(iB);
                    long[] jArr6 = this.a;
                    long[] jArr7 = this.b;
                    int[] iArr3 = this.c;
                    int i35 = this.d;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i36 = 0;
                        while (true) {
                            long j21 = (~jArr4[i36]) & j10;
                            while (j21 != 0) {
                                int iNumberOfTrailingZeros2 = (i36 << 3) + (java.lang.Long.numberOfTrailingZeros(j21) >>> 3);
                                long j22 = jArr5[iNumberOfTrailingZeros2];
                                int iM3 = anty.M(j22);
                                int i37 = (iM3 ^ (iM3 >>> 16)) * i17;
                                int i38 = i37 ^ (i37 >>> 16);
                                int iD3 = d(i38 >>> 7);
                                long[] jArr8 = jArr6;
                                int i39 = i38 & 127;
                                int i40 = iD3 >> 3;
                                int i41 = (iD3 & 7) << 3;
                                int[] iArr4 = iArr2;
                                long j23 = (jArr8[i40] & (~(255 << i41))) | (((long) i39) << i41);
                                jArr8[i40] = j23;
                                jArr8[(((iD3 - 7) & i35) + (i35 & 7)) >> 3] = j23;
                                jArr7[iD3] = j22;
                                iArr3[iD3] = iArr4[iNumberOfTrailingZeros2];
                                j21 &= j21 - 1;
                                jArr6 = jArr8;
                                jArr5 = jArr5;
                                iArr2 = iArr4;
                            }
                            long[] jArr9 = jArr6;
                            long[] jArr10 = jArr5;
                            int[] iArr5 = iArr2;
                            if (i36 == length) {
                                break;
                            }
                            i36++;
                            jArr6 = jArr9;
                            jArr5 = jArr10;
                            iArr2 = iArr5;
                            j10 = -9187201950435737472L;
                        }
                    }
                    iD = d(i7);
                }
                this.e++;
                int i42 = this.f;
                long[] jArr11 = this.a;
                int i43 = iD >> 3;
                long j24 = jArr11[i43];
                int i44 = (iD & 7) << 3;
                if (((j24 >> i44) & j2) == j3) {
                    i2 = i3;
                }
                this.f = i42 - i2;
                int i45 = this.d;
                long j25 = (j24 & (~(j2 << i44))) | (j6 << i44);
                jArr11[i43] = j25;
                jArr11[(((iD - 7) & i45) + (i45 & 7)) >> 3] = j25;
                iNumberOfTrailingZeros = ~iD;
                break;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i17;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = j;
        this.c[iNumberOfTrailingZeros] = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acu) {
            defpackage.acu acuVar = (defpackage.acu) obj;
            if (acuVar.e == this.e) {
                long[] jArr = this.b;
                int[] iArr = this.c;
                long[] jArr2 = this.a;
                int length = jArr2.length - 2;
                if (length < 0) {
                    return true;
                }
                int i = 0;
                loop0: while (true) {
                    long j = ~jArr2[i];
                    long j2 = -9187201950435737472L;
                    while (true) {
                        j &= j2;
                        if (j != 0) {
                            int iNumberOfTrailingZeros = (i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3);
                            long j3 = jArr[iNumberOfTrailingZeros];
                            int i2 = iArr[iNumberOfTrailingZeros];
                            int iA = acuVar.a(j3);
                            if (iA < 0 || i2 != acuVar.c[iA]) {
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
        long[] jArr = this.b;
        int[] iArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        int i = 0;
        if (length < 0) {
            return 0;
        }
        int iM = 0;
        while (true) {
            long j = ~jArr2[i];
            long j2 = -9187201950435737472L;
            while (true) {
                j &= j2;
                if (j == 0) {
                    break;
                }
                int iNumberOfTrailingZeros = (i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3);
                iM += anty.M(jArr[iNumberOfTrailingZeros]) ^ iArr[iNumberOfTrailingZeros];
                j2 = (-1) + j;
            }
            if (i == length) {
                return iM;
            }
            i++;
        }
    }

    public final java.lang.String toString() {
        if (this.e == 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        long[] jArr = this.b;
        int[] iArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = ~jArr2[i];
                long j2 = -9187201950435737472L;
                while (true) {
                    j &= j2;
                    if (j == 0) {
                        break;
                    }
                    int iNumberOfTrailingZeros = (i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3);
                    long j3 = jArr[iNumberOfTrailingZeros];
                    int i3 = iArr[iNumberOfTrailingZeros];
                    sb.append(j3);
                    sb.append('=');
                    sb.append(i3);
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

    public acu() {
    }
}
