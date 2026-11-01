package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adm {
    public long[] a = adx.a;
    public java.lang.Object[] b = aei.c;
    public float[] c = defpackage.ach.a;
    public int d;
    public int e;
    public int f;

    public adm(int i) {
        e(adx.c(i));
    }

    private final int c(int i) {
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

    private final void d() {
        this.f = adx.a(this.d) - this.e;
    }

    private final void e(int i) {
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
        d();
        this.b = new java.lang.Object[iMax];
        this.c = new float[iMax];
    }

    public final int a(java.lang.Object obj) {
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.d;
        int i3 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i4 = i3 ^ (i3 >>> 16);
        int i5 = i4 >>> 7;
        while (true) {
            int i6 = i5 & i2;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (((long) (i4 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i6) & i2;
                if (aooh.n(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final void b(java.lang.Object obj, float f) {
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        int iNumberOfTrailingZeros;
        java.lang.Object obj2 = obj;
        int iHashCode = obj2 != null ? obj2.hashCode() : 0;
        int i3 = -862048943;
        int i4 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i5 = i4 ^ (i4 >>> 16);
        int i6 = i5 >>> 7;
        int i7 = this.d;
        int i8 = i6 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = jArr[i10] >>> i11;
            int i12 = 1;
            long j5 = jArr[i10 + 1] << (64 - i11);
            int i13 = i5;
            int i14 = 0;
            long j6 = i5 & 127;
            long j7 = j4 | (j5 & ((-i11) >> 63));
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i8) & i7;
                int i15 = i3;
                if (aooh.n(this.b[iNumberOfTrailingZeros], obj2)) {
                    break loop0;
                }
                j9 &= j9 - 1;
                i3 = i15;
            }
            int i16 = i3;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int iC = c(i6);
                if (this.f != 0 || ((this.a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i17 = this.d;
                    if (i17 > 8) {
                        j3 = 128;
                        char c = '\b';
                        j2 = 255;
                        if (java.lang.Long.compare((((long) this.e) << 5) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.a;
                            int i18 = this.d;
                            java.lang.Object[] objArr = this.b;
                            float[] fArr = this.c;
                            int i19 = i18 + 7;
                            int i20 = 0;
                            while (i20 < (i19 >> 3)) {
                                int i21 = i14;
                                long j10 = jArr2[i20] & (-9187201950435737472L);
                                jArr2[i20] = ((~j10) + (j10 >>> 7)) & (-72340172838076674L);
                                i20++;
                                i14 = i21;
                                i12 = i12;
                                c = c;
                            }
                            int i22 = i14;
                            i2 = i12;
                            int iCF = ajsz.cF(jArr2);
                            int i23 = iCF - 1;
                            long j11 = 72057594037927935L;
                            jArr2[i23] = (jArr2[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iCF] = jArr2[i22];
                            int i24 = i22;
                            while (i24 != i18) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j12 = (jArr2[i25] >> i26) & 255;
                                if (j12 == 128 || j12 != 254) {
                                    i24++;
                                } else {
                                    java.lang.Object obj3 = objArr[i24];
                                    int iHashCode2 = obj3 != null ? obj3.hashCode() : i22;
                                    int i27 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i16;
                                    int i28 = i27 ^ (i27 >>> 16);
                                    int i29 = i28 & 127;
                                    int i30 = i28 >>> 7;
                                    int iC2 = c(i30);
                                    int i31 = i30 & i18;
                                    int i32 = i22;
                                    long j13 = j11;
                                    long j14 = i29;
                                    if (((iC2 - i31) & i18) / 8 == ((i24 - i31) & i18) / 8) {
                                        jArr2[i25] = (jArr2[i25] & (~(255 << i26))) | (j14 << i26);
                                        jArr2[ajsz.cF(jArr2)] = (jArr2[i32] & j13) | Long.MIN_VALUE;
                                        i24++;
                                        j11 = j13;
                                        i22 = i32;
                                    } else {
                                        int i33 = iC2 >> 3;
                                        long j15 = jArr2[i33];
                                        int i34 = (iC2 & 7) << 3;
                                        long j16 = j14 << i34;
                                        long j17 = j6;
                                        long j18 = (~(255 << i34)) & j15;
                                        if (((j15 >> i34) & 255) == 128) {
                                            long j19 = ~(255 << i26);
                                            jArr2[i33] = j18 | j16;
                                            jArr2[i25] = (jArr2[i25] & j19) | (128 << i26);
                                            objArr[iC2] = objArr[i24];
                                            objArr[i24] = null;
                                            fArr[iC2] = fArr[i24];
                                            fArr[i24] = 0.0f;
                                        } else {
                                            jArr2[i33] = j18 | j16;
                                            java.lang.Object obj4 = objArr[iC2];
                                            objArr[iC2] = objArr[i24];
                                            objArr[i24] = obj4;
                                            float f2 = fArr[iC2];
                                            fArr[iC2] = fArr[i24];
                                            fArr[i24] = f2;
                                            i24--;
                                        }
                                        jArr2[ajsz.cF(jArr2)] = (jArr2[i32] & j13) | Long.MIN_VALUE;
                                        i24++;
                                        j11 = j13;
                                        i22 = i32;
                                        j6 = j17;
                                    }
                                }
                            }
                            j = j6;
                            i = i22;
                            d();
                        }
                        iC = c(i6);
                    } else {
                        j2 = 255;
                        j3 = 128;
                    }
                    j = j6;
                    i = 0;
                    i2 = 1;
                    int iB = adx.b(this.d);
                    long[] jArr3 = this.a;
                    java.lang.Object[] objArr2 = this.b;
                    float[] fArr2 = this.c;
                    e(iB);
                    long[] jArr4 = this.a;
                    java.lang.Object[] objArr3 = this.b;
                    float[] fArr3 = this.c;
                    int i35 = this.d;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i36 = 0;
                        while (true) {
                            long j20 = (~jArr3[i36]) & (-9187201950435737472L);
                            while (j20 != 0) {
                                int iNumberOfTrailingZeros2 = (i36 << 3) + (java.lang.Long.numberOfTrailingZeros(j20) >>> 3);
                                java.lang.Object obj5 = objArr2[iNumberOfTrailingZeros2];
                                int iHashCode3 = obj5 != null ? obj5.hashCode() : 0;
                                int i37 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i16;
                                int i38 = i37 ^ (i37 >>> 16);
                                long[] jArr5 = jArr4;
                                int iC3 = c(i38 >>> 7);
                                int i39 = iC3 >> 3;
                                int i40 = (iC3 & 7) << 3;
                                long j21 = (jArr5[i39] & (~(j2 << i40))) | (((long) (i38 & 127)) << i40);
                                jArr5[i39] = j21;
                                jArr5[(((iC3 - 7) & i35) + (i35 & 7)) >> 3] = j21;
                                objArr3[iC3] = obj5;
                                fArr3[iC3] = fArr2[iNumberOfTrailingZeros2];
                                j20 &= j20 - 1;
                                jArr4 = jArr5;
                                jArr3 = jArr3;
                            }
                            long[] jArr6 = jArr4;
                            long[] jArr7 = jArr3;
                            if (i36 == length) {
                                break;
                            }
                            i36++;
                            jArr4 = jArr6;
                            jArr3 = jArr7;
                        }
                    }
                    iC = c(i6);
                }
                this.e++;
                int i41 = this.f;
                long[] jArr8 = this.a;
                int i42 = iC >> 3;
                long j22 = jArr8[i42];
                int i43 = (iC & 7) << 3;
                if (((j22 >> i43) & j2) != j3) {
                    i2 = i;
                }
                this.f = i41 - i2;
                int i44 = this.d;
                long j23 = (j22 & (~(j2 << i43))) | (j << i43);
                jArr8[i42] = j23;
                jArr8[(((iC - 7) & i44) + (i44 & 7)) >> 3] = j23;
                iNumberOfTrailingZeros = ~iC;
                break;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            obj2 = obj;
            i5 = i13;
            i3 = i16;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = obj;
        this.c[iNumberOfTrailingZeros] = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adm) {
            defpackage.adm admVar = (defpackage.adm) obj;
            if (admVar.e == this.e) {
                java.lang.Object[] objArr = this.b;
                float[] fArr = this.c;
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
                            java.lang.Object obj2 = objArr[iNumberOfTrailingZeros];
                            float f = fArr[iNumberOfTrailingZeros];
                            int iA = admVar.a(obj2);
                            if (iA < 0 || f != admVar.c[iA]) {
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
        java.lang.Object[] objArr = this.b;
        float[] fArr = this.c;
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
                java.lang.Object obj = objArr[iNumberOfTrailingZeros];
                iHashCode += (obj != null ? obj.hashCode() : 0) ^ java.lang.Float.floatToIntBits(fArr[iNumberOfTrailingZeros]);
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
        java.lang.Object[] objArr = this.b;
        float[] fArr = this.c;
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
                    java.lang.Object obj = objArr[iNumberOfTrailingZeros];
                    float f = fArr[iNumberOfTrailingZeros];
                    if (obj == this) {
                        obj = "(this)";
                    }
                    sb.append(obj);
                    sb.append('=');
                    sb.append(f);
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

    public adm() {
    }
}
