package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dwm {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();

    public static double a(int i, int i2) {
        if (android.graphics.Color.alpha(i2) != 255) {
            throw new java.lang.IllegalArgumentException("background can not be translucent: #".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i2))));
        }
        if (android.graphics.Color.alpha(i) < 255) {
            i = g(i, i2);
        }
        double dB = b(i) + 0.05d;
        double dB2 = b(i2) + 0.05d;
        return java.lang.Math.max(dB, dB2) / java.lang.Math.min(dB, dB2);
    }

    public static double b(int i) {
        java.lang.ThreadLocal threadLocal = b;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        j(android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i), dArr);
        return dArr[1] / 100.0d;
    }

    public static double c(double d) {
        return d > 0.008856d ? java.lang.Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    public static int d(float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4;
        int iRound5;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float fAbs = (1.0f - java.lang.Math.abs((f3 + f3) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * fAbs);
        float fAbs2 = (1.0f - java.lang.Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        float f5 = fAbs + f4;
        switch (((int) f) / 60) {
            case 0:
                iRound = java.lang.Math.round(f5 * 255.0f);
                iRound2 = java.lang.Math.round((fAbs2 + f4) * 255.0f);
                iRound3 = java.lang.Math.round(f4 * 255.0f);
                int i = iRound2;
                iRound4 = iRound3;
                iRound5 = i;
                break;
            case 1:
                iRound = java.lang.Math.round((fAbs2 + f4) * 255.0f);
                iRound2 = java.lang.Math.round(f5 * 255.0f);
                iRound3 = java.lang.Math.round(f4 * 255.0f);
                int i2 = iRound2;
                iRound4 = iRound3;
                iRound5 = i2;
                break;
            case 2:
                float f6 = fAbs2 + f4;
                iRound = java.lang.Math.round(f4 * 255.0f);
                iRound5 = java.lang.Math.round(f5 * 255.0f);
                iRound4 = java.lang.Math.round(f6 * 255.0f);
                break;
            case 3:
                iRound = java.lang.Math.round(f4 * 255.0f);
                iRound5 = java.lang.Math.round((fAbs2 + f4) * 255.0f);
                iRound4 = java.lang.Math.round(f5 * 255.0f);
                break;
            case 4:
                iRound = java.lang.Math.round((fAbs2 + f4) * 255.0f);
                iRound5 = java.lang.Math.round(f4 * 255.0f);
                iRound4 = java.lang.Math.round(f5 * 255.0f);
                break;
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                float f7 = fAbs2 + f4;
                iRound = java.lang.Math.round(f5 * 255.0f);
                iRound5 = java.lang.Math.round(f4 * 255.0f);
                iRound4 = java.lang.Math.round(f7 * 255.0f);
                break;
            default:
                iRound5 = 0;
                iRound = 0;
                iRound4 = 0;
                break;
        }
        return android.graphics.Color.rgb(iRound < 0 ? 0 : java.lang.Math.min(iRound, 255), iRound5 < 0 ? 0 : java.lang.Math.min(iRound5, 255), iRound4 >= 0 ? java.lang.Math.min(iRound4, 255) : 0);
    }

    public static int e(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return android.graphics.Color.rgb(m((int) java.lang.Math.round((d4 > 0.0031308d ? (java.lang.Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), m((int) java.lang.Math.round((d5 > 0.0031308d ? (java.lang.Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), m((int) java.lang.Math.round((d6 > 0.0031308d ? (java.lang.Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    public static int f(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return android.graphics.Color.argb((int) ((android.graphics.Color.alpha(i) * f2) + (android.graphics.Color.alpha(i2) * f)), (int) ((android.graphics.Color.red(i) * f2) + (android.graphics.Color.red(i2) * f)), (int) ((android.graphics.Color.green(i) * f2) + (android.graphics.Color.green(i2) * f)), (int) ((android.graphics.Color.blue(i) * f2) + (android.graphics.Color.blue(i2) * f)));
    }

    public static int g(int i, int i2) {
        int iAlpha = android.graphics.Color.alpha(i2);
        int iAlpha2 = android.graphics.Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha) * (255 - iAlpha2)) / 255);
        return android.graphics.Color.argb(i3, l(android.graphics.Color.red(i), iAlpha2, android.graphics.Color.red(i2), iAlpha, i3), l(android.graphics.Color.green(i), iAlpha2, android.graphics.Color.green(i2), iAlpha, i3), l(android.graphics.Color.blue(i), iAlpha2, android.graphics.Color.blue(i2), iAlpha, i3));
    }

    public static int h(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new java.lang.IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static void i(int i, int i2, int i3, float[] fArr) {
        float f;
        float fAbs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float fMax = java.lang.Math.max(f2, java.lang.Math.max(f3, f4));
        float fMin = java.lang.Math.min(f2, java.lang.Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else {
                f = fMax == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            }
            fAbs = f5 / (1.0f - java.lang.Math.abs((f6 + f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = f7 < 0.0f ? 0.0f : java.lang.Math.min(f7, 360.0f);
        fArr[1] = fAbs < 0.0f ? 0.0f : java.lang.Math.min(fAbs, 1.0f);
        fArr[2] = f6 >= 0.0f ? java.lang.Math.min(f6, 1.0f) : 0.0f;
    }

    public static void j(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            throw new java.lang.IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) i) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : java.lang.Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) i2) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : java.lang.Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) i3) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : java.lang.Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    public static void k(int i, float[] fArr) {
        i(android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i), fArr);
    }

    private static int l(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    private static int m(int i) {
        if (i < 0) {
            return 0;
        }
        return java.lang.Math.min(i, 255);
    }
}
