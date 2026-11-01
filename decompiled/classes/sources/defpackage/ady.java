package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ady {
    public long[] a = defpackage.adx.a;
    public java.lang.Object[] b = defpackage.aei.c;
    public int c;
    public int d;
    public java.util.Set e;
    private int f;

    public ady(int i) {
        p(i);
    }

    private final int m(java.lang.Object obj) {
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        int iNumberOfTrailingZeros;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i3 = -862048943;
        int i4 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
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
            int i13 = i5;
            int i14 = 0;
            long j6 = i5 & 127;
            long j7 = j4 | (j5 & ((-i11) >> 63));
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i8) & i7;
                int i15 = i3;
                if (defpackage.aooh.n(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j9 &= j9 - 1;
                i3 = i15;
            }
            int i16 = i3;
            int i17 = 8;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int iN = n(i6);
                long j10 = 255;
                if (this.f != 0 || ((this.a[iN >> 3] >> ((iN & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i18 = this.c;
                    if (i18 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.d) << 5) ^ Long.MIN_VALUE, (((long) i18) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.a;
                            int i19 = this.c;
                            java.lang.Object[] objArr = this.b;
                            int i20 = i19 + 7;
                            int i21 = 0;
                            while (i21 < (i20 >> 3)) {
                                long j11 = jArr2[i21] & (-9187201950435737472L);
                                jArr2[i21] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                i21++;
                                i17 = i17;
                                j10 = j10;
                            }
                            int i22 = i17;
                            j2 = j10;
                            int iCF = defpackage.ajsz.cF(jArr2);
                            int i23 = iCF - 1;
                            jArr2[i23] = (jArr2[i23] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iCF] = jArr2[0];
                            int i24 = 0;
                            while (i24 != i19) {
                                int i25 = i24 >> 3;
                                int i26 = (i24 & 7) << 3;
                                long j12 = (jArr2[i25] >> i26) & j2;
                                if (j12 == 128 || j12 != 254) {
                                    i24++;
                                } else {
                                    java.lang.Object obj2 = objArr[i24];
                                    int iHashCode2 = obj2 != null ? obj2.hashCode() : i14;
                                    int i27 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i16;
                                    int i28 = i27 ^ (i27 >>> 16);
                                    int i29 = i28 & 127;
                                    int i30 = i28 >>> 7;
                                    int iN2 = n(i30);
                                    int i31 = i30 & i19;
                                    int i32 = i14;
                                    int i33 = ((iN2 - i31) & i19) / 8;
                                    int i34 = ((i24 - i31) & i19) / i22;
                                    int i35 = i22;
                                    int i36 = i12;
                                    long j13 = i29;
                                    if (i33 == i34) {
                                        jArr2[i25] = (jArr2[i25] & (~(j2 << i26))) | (j13 << i26);
                                        jArr2[defpackage.ajsz.cF(jArr2)] = (jArr2[i32] & 72057594037927935L) | Long.MIN_VALUE;
                                        i24++;
                                        i22 = i35;
                                        i14 = i32;
                                        i12 = i36;
                                    } else {
                                        int i37 = iN2 >> 3;
                                        long j14 = jArr2[i37];
                                        int i38 = (iN2 & 7) << 3;
                                        long j15 = j13 << i38;
                                        long j16 = j6;
                                        long[] jArr3 = jArr2;
                                        long j17 = j14 & (~(j2 << i38));
                                        if (((j14 >> i38) & j2) == 128) {
                                            long j18 = ~(j2 << i26);
                                            jArr3[i37] = j17 | j15;
                                            jArr3[i25] = (jArr3[i25] & j18) | (128 << i26);
                                            objArr[iN2] = objArr[i24];
                                            objArr[i24] = null;
                                        } else {
                                            jArr3[i37] = j17 | j15;
                                            java.lang.Object obj3 = objArr[iN2];
                                            objArr[iN2] = objArr[i24];
                                            objArr[i24] = obj3;
                                            i24--;
                                        }
                                        jArr3[defpackage.ajsz.cF(jArr3)] = (jArr3[i32] & 72057594037927935L) | Long.MIN_VALUE;
                                        i24++;
                                        jArr2 = jArr3;
                                        i22 = i35;
                                        i14 = i32;
                                        i12 = i36;
                                        j6 = j16;
                                    }
                                }
                            }
                            j = j6;
                            i = i14;
                            i2 = i12;
                            o();
                        }
                        iN = n(i6);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    int iB = defpackage.adx.b(this.c);
                    long[] jArr4 = this.a;
                    java.lang.Object[] objArr2 = this.b;
                    p(iB);
                    long[] jArr5 = this.a;
                    java.lang.Object[] objArr3 = this.b;
                    int i39 = this.c;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i40 = 0;
                        while (true) {
                            long j19 = (~jArr4[i40]) & (-9187201950435737472L);
                            while (j19 != 0) {
                                java.lang.Object obj4 = objArr2[(i40 << 3) + (java.lang.Long.numberOfTrailingZeros(j19) >>> 3)];
                                int iHashCode3 = obj4 != null ? obj4.hashCode() : 0;
                                int i41 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i16;
                                int i42 = i41 ^ (i41 >>> 16);
                                int iN3 = n(i42 >>> 7);
                                int i43 = iN3 >> 3;
                                int i44 = (iN3 & 7) << 3;
                                long[] jArr6 = jArr5;
                                long j20 = (jArr5[i43] & (~(255 << i44))) | (((long) (i42 & 127)) << i44);
                                jArr6[i43] = j20;
                                jArr6[(((iN3 - 7) & i39) + (i39 & 7)) >> 3] = j20;
                                objArr3[iN3] = obj4;
                                j19 &= j19 - 1;
                                jArr4 = jArr4;
                                jArr5 = jArr6;
                            }
                            long[] jArr7 = jArr5;
                            long[] jArr8 = jArr4;
                            if (i40 == length) {
                                break;
                            }
                            i40++;
                            jArr4 = jArr8;
                            jArr5 = jArr7;
                        }
                    }
                    iN = n(i6);
                }
                iNumberOfTrailingZeros = iN;
                this.d++;
                int i45 = this.f;
                long[] jArr9 = this.a;
                int i46 = iNumberOfTrailingZeros >> 3;
                long j21 = jArr9[i46];
                int i47 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j21 >> i47) & j2) == j3) {
                    i = i2;
                }
                this.f = i45 - i;
                int i48 = this.c;
                long j22 = (j21 & (~(j2 << i47))) | (j << i47);
                jArr9[i46] = j22;
                jArr9[(((iNumberOfTrailingZeros - 7) & i48) + (i48 & 7)) >> 3] = j22;
                break;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i5 = i13;
            i3 = i16;
        }
        return iNumberOfTrailingZeros;
    }

    private final int n(int i) {
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

    private final void o() {
        this.f = defpackage.adx.a(this.c) - this.d;
    }

    private final void p(int i) {
        int iMax;
        long[] jArr;
        int i2 = 0;
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
            int i3 = (iMax + 15) >> 3;
            long[] jArr3 = new long[i3];
            java.util.Arrays.fill(jArr3, 0, i3, -9187201950435737472L);
            i2 = iMax;
            jArr = jArr3;
        }
        this.a = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        o();
        this.b = iMax == 0 ? defpackage.aei.c : new java.lang.Object[iMax];
    }

    public final boolean a(java.lang.Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = this.c;
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
        return this.d == 0;
    }

    public final boolean c() {
        return this.d != 0;
    }

    public final void d() {
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
        java.lang.Object[] objArr = this.b;
        int i3 = this.c;
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.Arrays.fill(objArr, 0, i3, (java.lang.Object) null);
        o();
    }

    public final void e(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.c;
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
            } else {
                i += 8;
                i5 = i6 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            i(iNumberOfTrailingZeros);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ady) {
            defpackage.ady adyVar = (defpackage.ady) obj;
            if (adyVar.d == this.d) {
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
                            if (adyVar.a(objArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)])) {
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

    public final void f(defpackage.ady adyVar) {
        if (adyVar == null) {
            defpackage.aooh.i("elements");
        }
        java.lang.Object[] objArr = adyVar.b;
        long[] jArr = adyVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = ~jArr[i];
            long j2 = -9187201950435737472L;
            while (true) {
                j &= j2;
                if (j == 0) {
                    break;
                }
                h(objArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)]);
                j2 = (-1) + j;
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void g(java.lang.Iterable iterable) {
        if (iterable == null) {
            defpackage.aooh.i("elements");
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }

    public final void h(java.lang.Object obj) {
        this.b[m(obj)] = obj;
    }

    public final int hashCode() {
        java.lang.Object[] objArr = this.b;
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
                java.lang.Object obj = objArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)];
                iHashCode += obj != null ? obj.hashCode() : 0;
                j2 = (-1) + j;
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final void i(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.c;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final boolean j(java.lang.Object obj) {
        int i = this.d;
        this.b[m(obj)] = obj;
        return this.d != i;
    }

    public final boolean k(java.lang.Iterable iterable) {
        if (iterable == null) {
            defpackage.aooh.i("elements");
        }
        int i = this.d;
        g(iterable);
        return i != this.d;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public final boolean l(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.c;
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
            i(iNumberOfTrailingZeros);
        }
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.CharSequence, java.lang.Object] */
    public final java.lang.String toString() {
        defpackage.nm nmVar = new defpackage.nm(this, 4);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.lang.Object[] objArr = this.b;
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
                        java.lang.Object obj = objArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)];
                        if (i2 != 0) {
                            sb.append((java.lang.CharSequence) ", ");
                        }
                        if (i2 == -1) {
                            sb.append((java.lang.CharSequence) "...");
                            break loop0;
                        }
                        sb.append((java.lang.CharSequence) nmVar.a(obj));
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

    public ady() {
    }
}
