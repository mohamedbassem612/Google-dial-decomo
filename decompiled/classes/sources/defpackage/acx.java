package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acx {
    public long[] a = defpackage.adx.a;
    public long[] b = defpackage.ada.a;
    public java.lang.Object[] c = defpackage.aei.c;
    public int d;
    public int e;
    private int f;

    public acx(int i) {
        l(defpackage.adx.c(i));
    }

    private final int j(int i) {
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

    private final void k() {
        this.f = defpackage.adx.a(this.d) - this.e;
    }

    private final void l(int i) {
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
        k();
        this.b = new long[iMax];
        this.c = new java.lang.Object[iMax];
    }

    public final java.lang.Object a(long j) {
        int iNumberOfTrailingZeros;
        int iM = defpackage.anty.M(j);
        int i = (iM ^ (iM >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = this.d;
        int i4 = (i2 >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = (jArr[i6] >>> i7) | ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63));
            long j3 = (((long) (i2 & 127)) * 72340172838076673L) ^ j2;
            for (long j4 = ((-72340172838076673L) + j3) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final boolean b(long j) {
        int iM = defpackage.anty.M(j);
        int i = (iM ^ (iM >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = this.d;
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

    public final boolean c() {
        return this.e == 0;
    }

    public final int d(long j) {
        long j2;
        int i;
        int i2;
        long j3;
        int iM = defpackage.anty.M(j);
        int i3 = -862048943;
        int i4 = (iM ^ (iM >>> 16)) * (-862048943);
        int i5 = i4 ^ (i4 >>> 16);
        int i6 = i5 >>> 7;
        int i7 = this.d;
        int i8 = i6 & i7;
        int i9 = 0;
        while (true) {
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
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i8) & i7;
                int i15 = i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i3 = i15;
            }
            int i16 = i3;
            long j10 = -9187201950435737472L;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int iJ = j(i6);
                if (this.f != 0 || ((this.a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i17 = this.d;
                    if (i17 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.e) << 5) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.a;
                            int i18 = this.d;
                            long[] jArr3 = this.b;
                            java.lang.Object[] objArr = this.c;
                            int i19 = i18 + 7;
                            j2 = 255;
                            int i20 = 0;
                            while (i20 < (i19 >> 3)) {
                                long j11 = jArr2[i20] & (-9187201950435737472L);
                                jArr2[i20] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                i20++;
                                i14 = i14;
                            }
                            i = i14;
                            int iCF = defpackage.ajsz.cF(jArr2);
                            int i21 = iCF - 1;
                            long j12 = 72057594037927935L;
                            jArr2[i21] = (jArr2[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iCF] = jArr2[i];
                            int i22 = i;
                            while (i22 != i18) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j13 = (jArr2[i23] >> i24) & 255;
                                if (j13 == 128 || j13 != 254) {
                                    i22++;
                                } else {
                                    int iM2 = defpackage.anty.M(jArr3[i22]);
                                    int i25 = (iM2 ^ (iM2 >>> 16)) * i16;
                                    int i26 = i25 ^ (i25 >>> 16);
                                    int i27 = i26 & 127;
                                    int i28 = i26 >>> 7;
                                    int iJ2 = j(i28);
                                    int i29 = i28 & i18;
                                    long j14 = j12;
                                    int i30 = i12;
                                    long j15 = i27;
                                    if (((iJ2 - i29) & i18) / 8 == ((i22 - i29) & i18) / 8) {
                                        jArr2[i23] = (jArr2[i23] & (~(255 << i24))) | (j15 << i24);
                                        jArr2[defpackage.ajsz.cF(jArr2)] = (jArr2[i] & j14) | Long.MIN_VALUE;
                                        i22++;
                                        i12 = i30;
                                        j12 = j14;
                                    } else {
                                        int i31 = iJ2 >> 3;
                                        long j16 = jArr2[i31];
                                        int i32 = (iJ2 & 7) << 3;
                                        long j17 = j15 << i32;
                                        long j18 = (~(255 << i32)) & j16;
                                        if (((j16 >> i32) & 255) == 128) {
                                            long j19 = ~(255 << i24);
                                            jArr2[i31] = j18 | j17;
                                            jArr2[i23] = (jArr2[i23] & j19) | (128 << i24);
                                            jArr3[iJ2] = jArr3[i22];
                                            jArr3[i22] = 0;
                                            objArr[iJ2] = objArr[i22];
                                            objArr[i22] = null;
                                        } else {
                                            jArr2[i31] = j18 | j17;
                                            long j20 = jArr3[iJ2];
                                            jArr3[iJ2] = jArr3[i22];
                                            jArr3[i22] = j20;
                                            java.lang.Object obj = objArr[iJ2];
                                            objArr[iJ2] = objArr[i22];
                                            objArr[i22] = obj;
                                            i22--;
                                        }
                                        jArr2[defpackage.ajsz.cF(jArr2)] = (jArr2[i] & j14) | Long.MIN_VALUE;
                                        i22++;
                                        j12 = j14;
                                        i12 = i30;
                                    }
                                }
                            }
                            i2 = i12;
                            k();
                        }
                        iJ = j(i6);
                    } else {
                        j3 = 128;
                    }
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    int iB = defpackage.adx.b(this.d);
                    long[] jArr4 = this.a;
                    long[] jArr5 = this.b;
                    java.lang.Object[] objArr2 = this.c;
                    l(iB);
                    long[] jArr6 = this.a;
                    long[] jArr7 = this.b;
                    java.lang.Object[] objArr3 = this.c;
                    int i33 = this.d;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i34 = 0;
                        while (true) {
                            long j21 = (~jArr4[i34]) & j10;
                            while (j21 != 0) {
                                int iNumberOfTrailingZeros2 = (i34 << 3) + (java.lang.Long.numberOfTrailingZeros(j21) >>> 3);
                                long j22 = jArr5[iNumberOfTrailingZeros2];
                                int iM3 = defpackage.anty.M(j22);
                                int i35 = (iM3 ^ (iM3 >>> 16)) * i16;
                                int i36 = i35 ^ (i35 >>> 16);
                                int iJ3 = j(i36 >>> 7);
                                long[] jArr8 = jArr6;
                                int i37 = i36 & 127;
                                int i38 = iJ3 >> 3;
                                int i39 = (iJ3 & 7) << 3;
                                java.lang.Object[] objArr4 = objArr2;
                                long j23 = (jArr8[i38] & (~(255 << i39))) | (((long) i37) << i39);
                                jArr8[i38] = j23;
                                jArr8[(((iJ3 - 7) & i33) + (i33 & 7)) >> 3] = j23;
                                jArr7[iJ3] = j22;
                                objArr3[iJ3] = objArr4[iNumberOfTrailingZeros2];
                                j21 &= j21 - 1;
                                jArr6 = jArr8;
                                jArr5 = jArr5;
                                objArr2 = objArr4;
                            }
                            long[] jArr9 = jArr6;
                            long[] jArr10 = jArr5;
                            java.lang.Object[] objArr5 = objArr2;
                            if (i34 == length) {
                                break;
                            }
                            i34++;
                            jArr6 = jArr9;
                            jArr5 = jArr10;
                            objArr2 = objArr5;
                            j10 = -9187201950435737472L;
                        }
                    }
                    iJ = j(i6);
                }
                this.e++;
                int i40 = this.f;
                long[] jArr11 = this.a;
                int i41 = iJ >> 3;
                long j24 = jArr11[i41];
                int i42 = (iJ & 7) << 3;
                if (((j24 >> i42) & j2) == j3) {
                    i = i2;
                }
                this.f = i40 - i;
                int i43 = this.d;
                long j25 = (j24 & (~(j2 << i42))) | (j6 << i42);
                jArr11[i41] = j25;
                jArr11[(((iJ - 7) & i43) + (i43 & 7)) >> 3] = j25;
                return ~iJ;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i16;
        }
    }

    public final java.lang.Object e(long j) {
        int iNumberOfTrailingZeros;
        int iM = defpackage.anty.M(j);
        int i = (iM ^ (iM >>> 16)) * (-862048943);
        int i2 = i ^ (i >>> 16);
        int i3 = this.d;
        int i4 = (i2 >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = (jArr[i6] >>> i7) | ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63));
            long j3 = (((long) (i2 & 127)) * 72340172838076673L) ^ j2;
            for (long j4 = ((-72340172838076673L) + j3) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return f(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acx) {
            defpackage.acx acxVar = (defpackage.acx) obj;
            if (acxVar.e == this.e) {
                long[] jArr = this.b;
                java.lang.Object[] objArr = this.c;
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
                            java.lang.Object obj2 = objArr[iNumberOfTrailingZeros];
                            if (obj2 == null) {
                                if (acxVar.a(j3) != null || !acxVar.b(j3)) {
                                    break loop0;
                                }
                                j2 = (-1) + j;
                            } else {
                                if (!defpackage.aooh.n(obj2, acxVar.a(j3))) {
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

    public final java.lang.Object f(int i) {
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

    public final void g() {
        this.e = 0;
        if (this.a != defpackage.adx.a) {
            defpackage.ajsz.dh(this.a, -9187201950435737472L);
            long[] jArr = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        defpackage.ajsz.dm(this.c, 0, this.d);
        k();
    }

    public final void h(long j, java.lang.Object obj) {
        int iD = d(j);
        if (iD < 0) {
            iD = ~iD;
        }
        this.b[iD] = j;
        this.c[iD] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        java.lang.Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
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
                long j3 = jArr[iNumberOfTrailingZeros];
                java.lang.Object obj = objArr[iNumberOfTrailingZeros];
                iM += defpackage.anty.M(j3) ^ (obj != null ? obj.hashCode() : 0);
                j2 = (-1) + j;
            }
            if (i == length) {
                return iM;
            }
            i++;
        }
    }

    public final void i(long j, java.lang.Object obj) {
        int iD = d(j);
        if (iD < 0) {
            iD = ~iD;
        }
        java.lang.Object[] objArr = this.c;
        java.lang.Object obj2 = objArr[iD];
        this.b[iD] = j;
        objArr[iD] = obj;
    }

    public final java.lang.String toString() {
        if (c()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        long[] jArr = this.b;
        java.lang.Object[] objArr = this.c;
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
                    java.lang.Object obj = objArr[iNumberOfTrailingZeros];
                    sb.append(j3);
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

    public acx() {
    }
}
