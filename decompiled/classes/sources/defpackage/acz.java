package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acz {
    public long[] a = defpackage.adx.a;
    public long[] b = defpackage.ada.a;
    public int c;
    public int d;
    private int e;

    public acz(int i) {
        if (i < 0) {
            defpackage.un.a("Capacity must be a positive value.");
        }
        f(defpackage.adx.c(i));
    }

    private final int d(int i) {
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

    private final void e() {
        this.e = defpackage.adx.a(this.c) - this.d;
    }

    private final void f(int i) {
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
        e();
        this.b = new long[iMax];
    }

    public final boolean a(long j) {
        int iM = defpackage.anty.M(j);
        int i = (iM ^ (iM >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = this.c;
        int i4 = (i2 >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            int i8 = i5;
            long j2 = (jArr[i6] >>> i7) | ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63));
            long j3 = (((long) (i2 & 127)) * 72340172838076673L) ^ j2;
            for (long j4 = ((-72340172838076673L) + j3) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    if (iNumberOfTrailingZeros < 0) {
                        break loop0;
                    }
                    return true;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                break;
            }
            i5 = i8 + 8;
            i4 = (i4 + i5) & i3;
        }
        return false;
    }

    public final int b(long j) {
        long j2;
        int i;
        int i2;
        long j3;
        int iNumberOfTrailingZeros;
        int iM = defpackage.anty.M(j);
        int i3 = -862048943;
        int i4 = (iM ^ (iM >>> 16)) * (-862048943);
        int i5 = i4 ^ (i4 >>> 16);
        int i6 = i5 >>> 7;
        int i7 = this.c;
        int i8 = i6 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = jArr[i10] >>> i11;
            int i12 = 1;
            long j5 = jArr[i10 + 1] << (64 - i11);
            int i13 = i9;
            int i14 = 0;
            long j6 = i5 & 127;
            long j7 = j4 | (j5 & ((-i11) >> 63));
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = ((-72340172838076673L) + j8) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i8) & i7;
                int i15 = i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j9 &= j9 - 1;
                i3 = i15;
            }
            int i16 = i3;
            long j10 = -9187201950435737472L;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int iD = d(i6);
                long j11 = 255;
                if (this.e != 0 || ((this.a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i17 = this.c;
                    if (i17 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.d) << 5) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.a;
                            int i18 = this.c;
                            long[] jArr3 = this.b;
                            int i19 = i18 + 7;
                            int i20 = 0;
                            while (i20 < (i19 >> 3)) {
                                long j12 = j11;
                                long j13 = jArr2[i20] & (-9187201950435737472L);
                                jArr2[i20] = ((~j13) + (j13 >>> 7)) & (-72340172838076674L);
                                i20++;
                                i14 = i14;
                                j11 = j12;
                            }
                            j2 = j11;
                            int i21 = i14;
                            int iCF = defpackage.ajsz.cF(jArr2);
                            int i22 = iCF - 1;
                            long j14 = 72057594037927935L;
                            jArr2[i22] = (jArr2[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iCF] = jArr2[i21];
                            int i23 = i21;
                            while (i23 != i18) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j15 = (jArr2[i24] >> i25) & j2;
                                if (j15 == 128 || j15 != 254) {
                                    i23++;
                                } else {
                                    int iM2 = defpackage.anty.M(jArr3[i23]);
                                    int i26 = (iM2 ^ (iM2 >>> 16)) * i16;
                                    int i27 = i26 ^ (i26 >>> 16);
                                    int i28 = i27 & 127;
                                    int i29 = i27 >>> 7;
                                    int iD2 = d(i29);
                                    int i30 = i29 & i18;
                                    int i31 = i21;
                                    long j16 = j14;
                                    long j17 = i28;
                                    if (((iD2 - i30) & i18) / 8 == ((i23 - i30) & i18) / 8) {
                                        jArr2[i24] = (jArr2[i24] & (~(j2 << i25))) | (j17 << i25);
                                        jArr2[defpackage.ajsz.cF(jArr2)] = (jArr2[i31] & j16) | Long.MIN_VALUE;
                                        i23++;
                                        j14 = j16;
                                        i21 = i31;
                                    } else {
                                        int i32 = iD2 >> 3;
                                        long j18 = jArr2[i32];
                                        int i33 = (iD2 & 7) << 3;
                                        long j19 = j17 << i33;
                                        int i34 = i12;
                                        long j20 = (~(j2 << i33)) & j18;
                                        if (((j18 >> i33) & j2) == 128) {
                                            long j21 = ~(j2 << i25);
                                            jArr2[i32] = j20 | j19;
                                            jArr2[i24] = (jArr2[i24] & j21) | (128 << i25);
                                            jArr3[iD2] = jArr3[i23];
                                            jArr3[i23] = 0;
                                        } else {
                                            jArr2[i32] = j20 | j19;
                                            long j22 = jArr3[iD2];
                                            jArr3[iD2] = jArr3[i23];
                                            jArr3[i23] = j22;
                                            i23--;
                                        }
                                        jArr2[defpackage.ajsz.cF(jArr2)] = (jArr2[i31] & j16) | Long.MIN_VALUE;
                                        i23++;
                                        j14 = j16;
                                        i21 = i31;
                                        i12 = i34;
                                    }
                                }
                            }
                            i = i21;
                            i2 = i12;
                            e();
                        }
                        iD = d(i6);
                    } else {
                        j3 = 128;
                    }
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    int iB = defpackage.adx.b(this.c);
                    long[] jArr4 = this.a;
                    long[] jArr5 = this.b;
                    f(iB);
                    long[] jArr6 = this.a;
                    long[] jArr7 = this.b;
                    int i35 = this.c;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i36 = 0;
                        while (true) {
                            long j23 = (~jArr4[i36]) & j10;
                            while (j23 != 0) {
                                long j24 = jArr5[(i36 << 3) + (java.lang.Long.numberOfTrailingZeros(j23) >>> 3)];
                                int iM3 = defpackage.anty.M(j24);
                                int i37 = (iM3 ^ (iM3 >>> 16)) * i16;
                                int i38 = i37 ^ (i37 >>> 16);
                                int iD3 = d(i38 >>> 7);
                                long[] jArr8 = jArr6;
                                int i39 = i38 & 127;
                                int i40 = iD3 >> 3;
                                int i41 = (iD3 & 7) << 3;
                                long[] jArr9 = jArr7;
                                long j25 = (jArr8[i40] & (~(255 << i41))) | (((long) i39) << i41);
                                jArr8[i40] = j25;
                                jArr8[(((iD3 - 7) & i35) + (i35 & 7)) >> 3] = j25;
                                jArr9[iD3] = j24;
                                j23 &= j23 - 1;
                                jArr6 = jArr8;
                                jArr5 = jArr5;
                                jArr7 = jArr9;
                            }
                            long[] jArr10 = jArr6;
                            long[] jArr11 = jArr5;
                            long[] jArr12 = jArr7;
                            if (i36 == length) {
                                break;
                            }
                            i36++;
                            jArr6 = jArr10;
                            jArr5 = jArr11;
                            jArr7 = jArr12;
                            j10 = -9187201950435737472L;
                        }
                    }
                    iD = d(i6);
                }
                iNumberOfTrailingZeros = iD;
                this.d++;
                int i42 = this.e;
                long[] jArr13 = this.a;
                int i43 = iNumberOfTrailingZeros >> 3;
                long j26 = jArr13[i43];
                int i44 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j26 >> i44) & j2) == j3) {
                    i = i2;
                }
                this.e = i42 - i;
                int i45 = this.c;
                long j27 = (j26 & (~(j2 << i44))) | (j6 << i44);
                jArr13[i43] = j27;
                jArr13[(((iNumberOfTrailingZeros - 7) & i45) + (i45 & 7)) >> 3] = j27;
                break;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i16;
        }
        return iNumberOfTrailingZeros;
    }

    public final boolean c(long j) {
        int i = this.d;
        this.b[b(j)] = j;
        return this.d != i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acz) {
            defpackage.acz aczVar = (defpackage.acz) obj;
            if (aczVar.d == this.d) {
                long[] jArr = this.b;
                long[] jArr2 = this.a;
                int length = jArr2.length - 2;
                if (length < 0) {
                    return true;
                }
                int i = 0;
                while (true) {
                    long j = ~jArr2[i];
                    long j2 = -9187201950435737472L;
                    while (true) {
                        j &= j2;
                        if (j != 0) {
                            if (aczVar.a(jArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)])) {
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
        long[] jArr = this.b;
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
                iM += defpackage.anty.M(jArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)]);
                j2 = (-1) + j;
            }
            if (i == length) {
                return iM;
            }
            i++;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = ~jArr2[i];
                long j2 = -9187201950435737472L;
                while (true) {
                    j &= j2;
                    if (j != 0) {
                        long j3 = jArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)];
                        if (i2 != 0) {
                            sb.append((java.lang.CharSequence) ", ");
                        }
                        if (i2 == -1) {
                            sb.append((java.lang.CharSequence) "...");
                            break loop0;
                        }
                        sb.append(j3);
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

    public acz() {
    }
}
