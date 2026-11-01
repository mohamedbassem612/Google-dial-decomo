package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ado {
    public long[] a = defpackage.adx.a;
    public java.lang.Object[] b = defpackage.aei.c;
    public int[] c = defpackage.acr.a;
    public int d;
    public int e;
    private int f;

    public ado(int i) {
        if (i < 0) {
            defpackage.un.a("Capacity must be a positive value.");
        }
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
        this.b = new java.lang.Object[iMax];
        this.c = new int[iMax];
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
                if (defpackage.aooh.n(this.b[iNumberOfTrailingZeros], obj)) {
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

    public final int b(java.lang.Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            defpackage.un.d(defpackage.a.bg(obj, "There is no key ", " in the map"));
        }
        return this.c[iA];
    }

    public final int c(java.lang.Object obj, int i) {
        int iA = a(obj);
        return iA >= 0 ? this.c[iA] : i;
    }

    public final boolean d() {
        return this.e != 0;
    }

    public final int e(java.lang.Object obj) {
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i3 = -862048943;
        int i4 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
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
            int i13 = i5;
            int i14 = 0;
            long j6 = i5 & 127;
            long j7 = j4 | (j5 & ((-i11) >> 63));
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i8) & i7;
                int i15 = i3;
                if (defpackage.aooh.n(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i3 = i15;
            }
            int i16 = i3;
            char c = '\b';
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int iJ = j(i6);
                long j10 = 255;
                if (this.f != 0 || ((this.a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) == 254) {
                    j = j6;
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
                            java.lang.Object[] objArr = this.b;
                            int[] iArr = this.c;
                            int i19 = i18 + 7;
                            int i20 = 0;
                            while (i20 < (i19 >> 3)) {
                                char c2 = c;
                                long j11 = jArr2[i20] & (-9187201950435737472L);
                                jArr2[i20] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                i20++;
                                i19 = i19;
                                i14 = i14;
                                c = c2;
                                j10 = j10;
                            }
                            j2 = j10;
                            int i21 = i14;
                            int iCF = defpackage.ajsz.cF(jArr2);
                            int i22 = iCF - 1;
                            jArr2[i22] = (jArr2[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iCF] = jArr2[i21];
                            int i23 = i21;
                            while (i23 != i18) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j12 = (jArr2[i24] >> i25) & j2;
                                if (j12 == 128 || j12 != 254) {
                                    i23++;
                                } else {
                                    java.lang.Object obj2 = objArr[i23];
                                    int iHashCode2 = obj2 != null ? obj2.hashCode() : i21;
                                    int i26 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i16;
                                    int i27 = i26 ^ (i26 >>> 16);
                                    int i28 = i27 & 127;
                                    int i29 = i27 >>> 7;
                                    int iJ2 = j(i29);
                                    int i30 = i29 & i18;
                                    int i31 = i21;
                                    long j13 = j6;
                                    long[] jArr3 = jArr2;
                                    long j14 = i28;
                                    if (((iJ2 - i30) & i18) / 8 == ((i23 - i30) & i18) / 8) {
                                        jArr3[i24] = (jArr3[i24] & (~(j2 << i25))) | (j14 << i25);
                                        jArr3[defpackage.ajsz.cF(jArr3)] = (jArr3[i31] & 72057594037927935L) | Long.MIN_VALUE;
                                        i23++;
                                    } else {
                                        int i32 = iJ2 >> 3;
                                        long j15 = jArr3[i32];
                                        int i33 = (iJ2 & 7) << 3;
                                        long j16 = j14 << i33;
                                        long j17 = (~(j2 << i33)) & j15;
                                        if (((j15 >> i33) & j2) == 128) {
                                            long j18 = ~(j2 << i25);
                                            jArr3[i32] = j17 | j16;
                                            jArr3[i24] = (jArr3[i24] & j18) | (128 << i25);
                                            objArr[iJ2] = objArr[i23];
                                            objArr[i23] = null;
                                            iArr[iJ2] = iArr[i23];
                                            iArr[i23] = i31;
                                        } else {
                                            jArr3[i32] = j17 | j16;
                                            java.lang.Object obj3 = objArr[iJ2];
                                            objArr[iJ2] = objArr[i23];
                                            objArr[i23] = obj3;
                                            int i34 = iArr[iJ2];
                                            iArr[iJ2] = iArr[i23];
                                            iArr[i23] = i34;
                                            i23--;
                                        }
                                        jArr3[defpackage.ajsz.cF(jArr3)] = (jArr3[i31] & 72057594037927935L) | Long.MIN_VALUE;
                                        i23++;
                                    }
                                    jArr2 = jArr3;
                                    i21 = i31;
                                    j6 = j13;
                                }
                            }
                            j = j6;
                            i = i21;
                            k();
                        }
                        i2 = 1;
                        iJ = j(i6);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i = 0;
                    int iB = defpackage.adx.b(this.d);
                    long[] jArr4 = this.a;
                    java.lang.Object[] objArr2 = this.b;
                    int[] iArr2 = this.c;
                    l(iB);
                    long[] jArr5 = this.a;
                    java.lang.Object[] objArr3 = this.b;
                    int[] iArr3 = this.c;
                    int i35 = this.d;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i36 = 0;
                        while (true) {
                            long j19 = (~jArr4[i36]) & (-9187201950435737472L);
                            while (j19 != 0) {
                                int iNumberOfTrailingZeros2 = (i36 << 3) + (java.lang.Long.numberOfTrailingZeros(j19) >>> 3);
                                java.lang.Object obj4 = objArr2[iNumberOfTrailingZeros2];
                                int iHashCode3 = obj4 != null ? obj4.hashCode() : 0;
                                int i37 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i16;
                                int i38 = i37 ^ (i37 >>> 16);
                                int i39 = i12;
                                int iJ3 = j(i38 >>> 7);
                                long[] jArr6 = jArr5;
                                int i40 = i38 & 127;
                                int i41 = iJ3 >> 3;
                                int i42 = (iJ3 & 7) << 3;
                                long j20 = (jArr6[i41] & (~(255 << i42))) | (((long) i40) << i42);
                                jArr6[i41] = j20;
                                jArr6[(((iJ3 - 7) & i35) + (i35 & 7)) >> 3] = j20;
                                objArr3[iJ3] = obj4;
                                iArr3[iJ3] = iArr2[iNumberOfTrailingZeros2];
                                j19 &= j19 - 1;
                                i12 = i39;
                                jArr5 = jArr6;
                                jArr4 = jArr4;
                                objArr2 = objArr2;
                            }
                            long[] jArr7 = jArr5;
                            long[] jArr8 = jArr4;
                            java.lang.Object[] objArr4 = objArr2;
                            i2 = i12;
                            if (i36 == length) {
                                break;
                            }
                            i36++;
                            i12 = i2;
                            jArr5 = jArr7;
                            jArr4 = jArr8;
                            objArr2 = objArr4;
                        }
                    } else {
                        i2 = 1;
                    }
                    iJ = j(i6);
                }
                this.e++;
                int i43 = this.f;
                long[] jArr9 = this.a;
                int i44 = iJ >> 3;
                long j21 = jArr9[i44];
                int i45 = (iJ & 7) << 3;
                if (((j21 >> i45) & j2) == j3) {
                    i = i2;
                }
                this.f = i43 - i;
                int i46 = this.d;
                long j22 = (j21 & (~(j2 << i45))) | (j << i45);
                jArr9[i44] = j22;
                jArr9[(((iJ - 7) & i46) + (i46 & 7)) >> 3] = j22;
                return ~iJ;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i5 = i13;
            i3 = i16;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ado) {
            defpackage.ado adoVar = (defpackage.ado) obj;
            if (adoVar.e == this.e) {
                java.lang.Object[] objArr = this.b;
                int[] iArr = this.c;
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
                            int i2 = iArr[iNumberOfTrailingZeros];
                            int iA = adoVar.a(obj2);
                            if (iA < 0 || i2 != adoVar.c[iA]) {
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
        java.lang.Object[] objArr = this.b;
        int i3 = this.d;
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.Arrays.fill(objArr, 0, i3, (java.lang.Object) null);
        k();
    }

    public final void g(int i) {
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
        this.b[i] = null;
    }

    public final void h(java.lang.Object obj, int i) {
        int iE = e(obj);
        if (iE < 0) {
            iE = ~iE;
        }
        this.b[iE] = obj;
        this.c[iE] = i;
    }

    public final int hashCode() {
        java.lang.Object[] objArr = this.b;
        int[] iArr = this.c;
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
                iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[iNumberOfTrailingZeros];
                j2 = (-1) + j;
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final int i(java.lang.Object obj, int i) {
        int i2;
        int iE = e(obj);
        if (iE < 0) {
            iE = ~iE;
            i2 = -1;
        } else {
            i2 = this.c[iE];
        }
        this.b[iE] = obj;
        this.c[iE] = i;
        return i2;
    }

    public final java.lang.String toString() {
        if (this.e == 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.lang.Object[] objArr = this.b;
        int[] iArr = this.c;
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
                    int i3 = iArr[iNumberOfTrailingZeros];
                    if (obj == this) {
                        obj = "(this)";
                    }
                    sb.append(obj);
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

    public ado() {
    }
}
