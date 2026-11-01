package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiyu {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static int a(double d, java.math.RoundingMode roundingMode) {
        int i;
        boolean zC;
        int i2 = 0;
        ahvr.bN(d > 0.0d && defpackage.ajee.q(d), "x must be positive and finite");
        int exponent = java.lang.Math.getExponent(d);
        if (java.lang.Math.getExponent(d) < -1022) {
            return a(d * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (defpackage.aiyt.a[roundingMode.ordinal()]) {
            case 1:
                aiql.ad(c(d));
                return exponent;
            case 2:
                return exponent;
            case 3:
                i2 = !c(d) ? 1 : 0;
                if (i2 != 0) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                i = exponent >>> 31;
                zC = c(d);
                i2 = i & (!zC);
                if (i2 != 0) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                i = (exponent ^ (-1)) >>> 31;
                zC = c(d);
                i2 = i & (!zC);
                if (i2 != 0) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = java.lang.Double.longBitsToDouble((java.lang.Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static boolean b(double d) {
        if (defpackage.ajee.q(d)) {
            return d == 0.0d || 52 - java.lang.Long.numberOfTrailingZeros(defpackage.ajee.p(d)) <= java.lang.Math.getExponent(d);
        }
        return false;
    }

    public static boolean c(double d) {
        if (d <= 0.0d || !defpackage.ajee.q(d)) {
            return false;
        }
        long jP = defpackage.ajee.p(d);
        return (jP & ((-1) + jP)) == 0;
    }
}
