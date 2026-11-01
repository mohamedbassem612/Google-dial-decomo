package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class acg {
    public long[] a;
    public float[] b;
    public int c;
    public int d;

    public acg(byte[] bArr) {
        long[] jArr = adx.a;
        this.a = jArr;
        this.b = defpackage.ach.a;
        int iC = adx.c(0);
        int iMax = iC > 0 ? java.lang.Math.max(7, (-1) >>> java.lang.Integer.numberOfLeadingZeros(iC)) : 0;
        this.c = iMax;
        if (iMax != 0) {
            jArr = new long[(iMax + 15) >> 3];
            ajsz.dh(jArr, -9187201950435737472L);
        }
        this.a = jArr;
        int i = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        this.b = new float[iMax];
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z;
        long j;
        int iNumberOfTrailingZeros;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acg) {
            defpackage.acg acgVar = (defpackage.acg) obj;
            int i = acgVar.d;
            float[] fArr = this.b;
            long[] jArr = this.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                loop0: while (true) {
                    long j2 = -9187201950435737472L;
                    long j3 = (~jArr[i2]) & (-9187201950435737472L);
                    while (true) {
                        long j4 = 0;
                        if (j3 != 0) {
                            float f = fArr[(i2 << 3) + (java.lang.Long.numberOfTrailingZeros(j3) >>> 3)];
                            int iFloatToIntBits = java.lang.Float.floatToIntBits(f);
                            int i3 = acgVar.c;
                            int i4 = (iFloatToIntBits ^ (iFloatToIntBits >>> 16)) * (-862048943);
                            int i5 = i4 ^ (i4 >>> 16);
                            int i6 = (i5 >>> 7) & i3;
                            int i7 = 0;
                            while (true) {
                                long[] jArr2 = acgVar.a;
                                int i8 = i6 >> 3;
                                j = j2;
                                int i9 = (i6 & 7) << 3;
                                long j5 = j4;
                                long j6 = (jArr2[i8] >>> i9) | ((jArr2[i8 + 1] << (64 - i9)) & ((-i9) >> 63));
                                long j7 = (((long) (i5 & 127)) * 72340172838076673L) ^ j6;
                                long j8 = (j7 - 72340172838076673L) & (~j7) & j;
                                while (true) {
                                    if (j8 == j5) {
                                        if ((j6 & ((~j6) << 6) & j) != j5) {
                                            break loop0;
                                        }
                                        i7 += 8;
                                        i6 = (i6 + i7) & i3;
                                        j2 = j;
                                        j4 = j5;
                                    } else {
                                        iNumberOfTrailingZeros = (i6 + (java.lang.Long.numberOfTrailingZeros(j8) >> 3)) & i3;
                                        if (acgVar.b[iNumberOfTrailingZeros] == f) {
                                            break;
                                        }
                                        j8 &= j8 - 1;
                                    }
                                }
                            }
                            if (iNumberOfTrailingZeros < 0) {
                                break loop0;
                            }
                            j3 &= (-1) + j3;
                            j2 = j;
                        }
                    }
                    z = true;
                    if (i2 != length) {
                        i2++;
                    }
                }
            } else {
                z = true;
            }
            return z;
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        int i = 0;
        if (length < 0) {
            return 0;
        }
        int iFloatToIntBits = 0;
        while (true) {
            long j = ~jArr[i];
            long j2 = -9187201950435737472L;
            while (true) {
                j &= j2;
                if (j == 0) {
                    break;
                }
                iFloatToIntBits += java.lang.Float.floatToIntBits(fArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)]);
                j2 = (-1) + j;
            }
            if (i == length) {
                return iFloatToIntBits;
            }
            i++;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        float[] fArr = this.b;
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
                        float f = fArr[(i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3)];
                        if (i2 != 0) {
                            sb.append((java.lang.CharSequence) ", ");
                        }
                        if (i2 == -1) {
                            sb.append((java.lang.CharSequence) "...");
                            break loop0;
                        }
                        sb.append(f);
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

    public acg() {
        this.a = adx.a;
        this.b = defpackage.ach.a;
    }
}
