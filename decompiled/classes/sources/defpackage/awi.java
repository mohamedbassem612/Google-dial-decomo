package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class awi {
    public static final defpackage.awa a = new defpackage.awf(0);
    public static final defpackage.awa b = new defpackage.awf(1);
    public static final defpackage.awh c = new defpackage.awg(0);
    public static final defpackage.awh d = new defpackage.awg(1);
    public static final defpackage.awb e = new defpackage.awc(1);
    public static final defpackage.awb f = new defpackage.awc(2);
    public static final defpackage.awb g = new defpackage.awc(0);

    public static final void a(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        float f2 = (i - i4) / 2.0f;
        if (!z) {
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = java.lang.Math.round(f2);
                f2 += i6;
                i2++;
                i5++;
            }
            return;
        }
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            int i7 = iArr[length];
            iArr2[length] = java.lang.Math.round(f2);
            f2 += i7;
        }
    }

    public static final void b(int[] iArr, int[] iArr2, boolean z) {
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i3] = i2;
                i2 += i4;
                i++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            int i5 = iArr[length2];
            iArr2[length2] = i;
            i += i5;
        }
    }

    public static final void c(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        int i5 = i - i4;
        if (!z) {
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            int i8 = iArr[length];
            iArr2[length] = i5;
            i5 += i8;
        }
    }

    public static final void d(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length != 0) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 : iArr) {
                i3 += i4;
            }
            int length = iArr.length;
            int i5 = length - 1;
            float fMax = (i - i3) / java.lang.Math.max(i5, 1);
            float f2 = 0.0f;
            if (z && length == 1) {
                f2 = fMax;
                length = 1;
            }
            if (z) {
                while (i5 >= 0) {
                    int i6 = iArr[i5];
                    iArr2[i5] = java.lang.Math.round(f2);
                    f2 += i6 + fMax;
                    i5--;
                }
                return;
            }
            int i7 = 0;
            while (i2 < length) {
                int i8 = iArr[i2];
                iArr2[i7] = java.lang.Math.round(f2);
                f2 += i8 + fMax;
                i2++;
                i7++;
            }
        }
    }

    public static final void e(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        float f2 = (i - i4) / (length + 1);
        if (z) {
            float f3 = f2;
            for (int i5 = length - 1; i5 >= 0; i5--) {
                int i6 = iArr[i5];
                iArr2[i5] = java.lang.Math.round(f3);
                f3 += i6 + f2;
            }
            return;
        }
        float f4 = f2;
        int i7 = 0;
        while (i2 < length) {
            int i8 = iArr[i2];
            iArr2[i7] = java.lang.Math.round(f4);
            f4 += i8 + f2;
            i2++;
            i7++;
        }
    }

    public static final defpackage.awb f(float f2) {
        return new awd(f2, true, new avx());
    }

    public static final defpackage.awa g(float f2, defpackage.cmi cmiVar) {
        return new awd(f2, true, new avw(cmiVar, 1));
    }
}
