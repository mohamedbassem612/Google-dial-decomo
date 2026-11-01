package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adw {
    public long[] a = defpackage.adx.a;
    public java.lang.Object[] b;
    public java.lang.Object[] c;
    public int d;
    public int e;
    private java.util.Map f;
    private int g;

    public adw(int i) {
        java.lang.Object[] objArr = defpackage.aei.c;
        this.b = objArr;
        this.c = objArr;
        if (i < 0) {
            defpackage.un.a("Capacity must be a positive value.");
        }
        q(defpackage.adx.c(i));
    }

    public static /* synthetic */ boolean f(defpackage.adw adwVar, java.lang.Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = adwVar.d;
        int i2 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i3 = i2 ^ (i2 >>> 16);
        int i4 = (i3 >>> 7) & i;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = adwVar.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            int i8 = i3;
            long j = (jArr[i6] >>> i7) | ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63));
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = ((-72340172838076673L) + j2) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i4) & i;
                if (defpackage.aooh.n(adwVar.b[iNumberOfTrailingZeros], obj)) {
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

    private final int o(int i) {
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

    private final void p() {
        this.g = defpackage.adx.a(this.d) - this.e;
    }

    private final void q(int i) {
        int iMax;
        long[] jArr;
        java.lang.Object[] objArr;
        int i2 = 0;
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
            int i3 = (iMax + 15) >> 3;
            long[] jArr3 = new long[i3];
            java.util.Arrays.fill(jArr3, 0, i3, -9187201950435737472L);
            int i4 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr3[i4] = (jArr3[i4] & (~j)) | j;
            jArr = jArr3;
        }
        this.a = jArr;
        p();
        if (iMax == 0) {
            objArr = defpackage.aei.c;
        } else {
            i2 = iMax;
            objArr = new java.lang.Object[iMax];
        }
        this.b = objArr;
        this.c = i2 == 0 ? defpackage.aei.c : new java.lang.Object[i2];
    }

    public final java.lang.Object a(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.d;
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
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final java.util.Map b() {
        java.util.Map map = this.f;
        if (map != null) {
            return map;
        }
        defpackage.adf adfVar = new defpackage.adf(this);
        this.f = adfVar;
        return adfVar;
    }

    public final boolean c(java.lang.Object obj) {
        java.lang.Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            long j = ~jArr[i];
            long j2 = -9187201950435737472L;
            while (true) {
                j &= j2;
                if (j != 0) {
                    if (defpackage.aooh.n(obj, objArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)])) {
                        return true;
                    }
                    j2 = (-1) + j;
                }
            }
            if (i == length) {
                return false;
            }
            i++;
        }
    }

    public final boolean d() {
        return this.e == 0;
    }

    public final boolean e() {
        return this.e != 0;
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z;
        long j;
        long j2;
        int iNumberOfTrailingZeros;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adw) {
            defpackage.adw adwVar = (defpackage.adw) obj;
            if (adwVar.e == this.e) {
                java.lang.Object[] objArr = this.b;
                java.lang.Object[] objArr2 = this.c;
                long[] jArr = this.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    loop0: while (true) {
                        long j3 = -9187201950435737472L;
                        long j4 = (~jArr[i]) & (-9187201950435737472L);
                        while (true) {
                            long j5 = 0;
                            if (j4 != 0) {
                                int iNumberOfTrailingZeros2 = (i << 3) + (java.lang.Long.numberOfTrailingZeros(j4) >>> 3);
                                java.lang.Object obj2 = objArr[iNumberOfTrailingZeros2];
                                java.lang.Object obj3 = objArr2[iNumberOfTrailingZeros2];
                                int iHashCode = obj2 != null ? obj2.hashCode() : 0;
                                int i2 = adwVar.d;
                                int i3 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
                                int i4 = i3 ^ (i3 >>> 16);
                                int i5 = (i4 >>> 7) & i2;
                                int i6 = 0;
                                while (true) {
                                    j = j3;
                                    long[] jArr2 = adwVar.a;
                                    int i7 = i5 >> 3;
                                    long j6 = j5;
                                    int i8 = (i5 & 7) << 3;
                                    long j7 = (jArr2[i7] >>> i8) | ((jArr2[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
                                    long j8 = (((long) (i4 & 127)) * 72340172838076673L) ^ j7;
                                    for (long j9 = (j8 - 72340172838076673L) & (~j8) & j; j9 != j6; j9 &= j9 - 1) {
                                        iNumberOfTrailingZeros = (i5 + (java.lang.Long.numberOfTrailingZeros(j9) >> 3)) & i2;
                                        j2 = -1;
                                        if (defpackage.aooh.n(adwVar.b[iNumberOfTrailingZeros], obj2)) {
                                            break;
                                        }
                                    }
                                    j2 = -1;
                                    if ((j7 & ((~j7) << 6) & j) != j6) {
                                        iNumberOfTrailingZeros = -1;
                                        break;
                                    }
                                    i6 += 8;
                                    i5 = (i5 + i6) & i2;
                                    j3 = j;
                                    j5 = j6;
                                }
                                if (iNumberOfTrailingZeros < 0 || !defpackage.aooh.n(obj3, adwVar.c[iNumberOfTrailingZeros])) {
                                    break loop0;
                                }
                                j4 &= j4 + j2;
                                j3 = j;
                            }
                        }
                        z = true;
                        if (i != length) {
                            i++;
                        }
                    }
                } else {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    public final int g(java.lang.Object obj) {
        long j;
        long j2;
        int i;
        long j3;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = -862048943;
        int i3 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
        int i4 = i3 ^ (i3 >>> 16);
        int i5 = i4 >>> 7;
        int i6 = this.d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = jArr[i9] >>> i10;
            long j5 = jArr[i9 + 1] << (64 - i10);
            int i11 = i4;
            int i12 = 0;
            long j6 = i4 & 127;
            long j7 = j4 | (j5 & ((-i10) >> 63));
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i7) & i6;
                int i13 = i2;
                if (defpackage.aooh.n(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i2 = i13;
            }
            int i14 = i2;
            char c = '\b';
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int iO = o(i5);
                long j10 = 255;
                if (this.g != 0 || ((this.a[iO >> 3] >> ((iO & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    j3 = 128;
                } else {
                    int i15 = this.d;
                    if (i15 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.e) << 5) ^ Long.MIN_VALUE, (((long) i15) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.a;
                            int i16 = this.d;
                            java.lang.Object[] objArr = this.b;
                            java.lang.Object[] objArr2 = this.c;
                            int i17 = i16 + 7;
                            int i18 = 0;
                            while (i18 < (i17 >> 3)) {
                                char c2 = c;
                                long j11 = jArr2[i18] & (-9187201950435737472L);
                                jArr2[i18] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                i18++;
                                i17 = i17;
                                i12 = i12;
                                c = c2;
                                j10 = j10;
                            }
                            j2 = j10;
                            int i19 = i12;
                            int iCF = defpackage.ajsz.cF(jArr2);
                            int i20 = iCF - 1;
                            jArr2[i20] = (jArr2[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iCF] = jArr2[i19];
                            int i21 = i19;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr2[i22] >> i23) & j2;
                                if (j12 == 128 || j12 != 254) {
                                    i21++;
                                } else {
                                    java.lang.Object obj2 = objArr[i21];
                                    int iHashCode2 = obj2 != null ? obj2.hashCode() : i19;
                                    int i24 = (iHashCode2 ^ (iHashCode2 >>> 16)) * i14;
                                    int i25 = i24 ^ (i24 >>> 16);
                                    int i26 = i25 & 127;
                                    int i27 = i25 >>> 7;
                                    int iO2 = o(i27);
                                    int i28 = i27 & i16;
                                    int i29 = i19;
                                    long j13 = j6;
                                    long[] jArr3 = jArr2;
                                    long j14 = i26;
                                    if (((iO2 - i28) & i16) / 8 == ((i21 - i28) & i16) / 8) {
                                        jArr3[i22] = (jArr3[i22] & (~(j2 << i23))) | (j14 << i23);
                                        jArr3[defpackage.ajsz.cF(jArr3)] = jArr3[i29];
                                        i21++;
                                    } else {
                                        int i30 = iO2 >> 3;
                                        long j15 = jArr3[i30];
                                        int i31 = (iO2 & 7) << 3;
                                        long j16 = j14 << i31;
                                        long j17 = (~(j2 << i31)) & j15;
                                        if (((j15 >> i31) & j2) == 128) {
                                            long j18 = ~(j2 << i23);
                                            jArr3[i30] = j17 | j16;
                                            jArr3[i22] = (jArr3[i22] & j18) | (128 << i23);
                                            objArr[iO2] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr2[iO2] = objArr2[i21];
                                            objArr2[i21] = null;
                                        } else {
                                            jArr3[i30] = j17 | j16;
                                            java.lang.Object obj3 = objArr[iO2];
                                            objArr[iO2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            java.lang.Object obj4 = objArr2[iO2];
                                            objArr2[iO2] = objArr2[i21];
                                            objArr2[i21] = obj4;
                                            i21--;
                                        }
                                        jArr3[defpackage.ajsz.cF(jArr3)] = jArr3[i29];
                                        i21++;
                                    }
                                    jArr2 = jArr3;
                                    i19 = i29;
                                    j6 = j13;
                                }
                            }
                            j = j6;
                            i = i19;
                            p();
                        }
                        iO = o(i5);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i = 0;
                    m(defpackage.adx.b(this.d));
                    iO = o(i5);
                }
                this.e++;
                int i32 = this.g;
                long[] jArr4 = this.a;
                int i33 = iO >> 3;
                long j19 = jArr4[i33];
                int i34 = (iO & 7) << 3;
                this.g = i32 - (((j19 >> i34) & j2) != j3 ? i : 1);
                int i35 = this.d;
                long j20 = (j19 & (~(j2 << i34))) | (j << i34);
                jArr4[i33] = j20;
                jArr4[(((iO - 7) & i35) + (i35 & 7)) >> 3] = j20;
                return ~iO;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i4 = i11;
            i2 = i14;
        }
    }

    public final java.lang.Object h(java.lang.Object obj, java.lang.Object obj2) {
        int iG = g(obj);
        if (iG < 0) {
            iG = ~iG;
        }
        java.lang.Object[] objArr = this.c;
        java.lang.Object obj3 = objArr[iG];
        this.b[iG] = obj;
        objArr[iG] = obj2;
        return obj3;
    }

    public final int hashCode() {
        java.lang.Object[] objArr = this.b;
        java.lang.Object[] objArr2 = this.c;
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
                java.lang.Object obj2 = objArr2[iNumberOfTrailingZeros];
                iHashCode += (obj != null ? obj.hashCode() : 0) ^ (obj2 != null ? obj2.hashCode() : 0);
                j2 = (-1) + j;
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final java.lang.Object i(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.d;
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
        if (iNumberOfTrailingZeros >= 0) {
            return j(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final java.lang.Object j(int i) {
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
        this.g += i8;
        this.b[i] = null;
        java.lang.Object[] objArr = this.c;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void k() {
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
        java.lang.Object[] objArr2 = this.b;
        int i4 = this.d;
        if (objArr2 == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.Arrays.fill(objArr2, 0, i4, (java.lang.Object) null);
        p();
    }

    public final void l(defpackage.adw adwVar) {
        int iC = defpackage.adx.c(this.e);
        int i = 0;
        int iNumberOfLeadingZeros = iC > 0 ? (-1) >>> java.lang.Integer.numberOfLeadingZeros(iC) : 0;
        if (iNumberOfLeadingZeros < this.d) {
            m(iNumberOfLeadingZeros);
        }
        java.lang.Object[] objArr = adwVar.b;
        java.lang.Object[] objArr2 = adwVar.c;
        long[] jArr = adwVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        while (true) {
            long j = ~jArr[i];
            long j2 = -9187201950435737472L;
            while (true) {
                j &= j2;
                if (j == 0) {
                    break;
                }
                int iNumberOfTrailingZeros = (i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3);
                n(objArr[iNumberOfTrailingZeros], objArr2[iNumberOfTrailingZeros]);
                j2 = (-1) + j;
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void m(int i) {
        defpackage.adw adwVar = this;
        long[] jArr = adwVar.a;
        java.lang.Object[] objArr = adwVar.b;
        java.lang.Object[] objArr2 = adwVar.c;
        q(i);
        long[] jArr2 = adwVar.a;
        java.lang.Object[] objArr3 = adwVar.b;
        java.lang.Object[] objArr4 = adwVar.c;
        int i2 = adwVar.d;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = (~jArr[i3]) & (-9187201950435737472L);
            while (j != 0) {
                int iNumberOfTrailingZeros = (i3 << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3);
                java.lang.Object obj = objArr[iNumberOfTrailingZeros];
                int iHashCode = obj != null ? obj.hashCode() : 0;
                int i4 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
                int i5 = i4 ^ (i4 >>> 16);
                int iO = adwVar.o(i5 >>> 7);
                int i6 = iO >> 3;
                int i7 = (iO & 7) << 3;
                long j2 = (jArr2[i6] & (~(255 << i7))) | (((long) (i5 & 127)) << i7);
                jArr2[i6] = j2;
                jArr2[(((iO - 7) & i2) + (i2 & 7)) >> 3] = j2;
                objArr3[iO] = obj;
                objArr4[iO] = objArr2[iNumberOfTrailingZeros];
                j &= (-1) + j;
                adwVar = this;
                jArr = jArr;
            }
            long[] jArr3 = jArr;
            if (i3 == length) {
                return;
            }
            i3++;
            adwVar = this;
            jArr = jArr3;
        }
    }

    public final void n(java.lang.Object obj, java.lang.Object obj2) {
        int iG = g(obj);
        if (iG < 0) {
            iG = ~iG;
        }
        this.b[iG] = obj;
        this.c[iG] = obj2;
    }

    public final java.lang.String toString() {
        if (d()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.lang.Object[] objArr = this.b;
        java.lang.Object[] objArr2 = this.c;
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
                    java.lang.Object obj2 = objArr2[iNumberOfTrailingZeros];
                    if (obj == this) {
                        obj = "(this)";
                    }
                    sb.append(obj);
                    sb.append('=');
                    if (obj2 == this) {
                        obj2 = "(this)";
                    }
                    sb.append(obj2);
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

    public adw() {
        java.lang.Object[] objArr = defpackage.aei.c;
        this.b = objArr;
        this.c = objArr;
    }
}
