package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class apqv {
    public static final java.math.BigInteger a;
    public static final java.math.BigInteger b;
    public static final java.math.BigInteger c;
    public static final java.math.BigInteger d;
    public static final java.math.BigInteger e;
    public static final java.math.BigInteger f;
    public static final java.math.BigInteger g;
    public static final java.math.BigInteger h;
    public static final java.math.BigInteger i;
    public static final java.math.BigInteger j;

    static {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(1024L);
        a = bigIntegerValueOf;
        java.math.BigInteger bigIntegerMultiply = bigIntegerValueOf.multiply(bigIntegerValueOf);
        b = bigIntegerMultiply;
        java.math.BigInteger bigIntegerMultiply2 = bigIntegerValueOf.multiply(bigIntegerMultiply);
        c = bigIntegerMultiply2;
        java.math.BigInteger bigIntegerMultiply3 = bigIntegerValueOf.multiply(bigIntegerMultiply2);
        d = bigIntegerMultiply3;
        java.math.BigInteger bigIntegerMultiply4 = bigIntegerValueOf.multiply(bigIntegerMultiply3);
        e = bigIntegerMultiply4;
        java.math.BigInteger bigIntegerMultiply5 = bigIntegerValueOf.multiply(bigIntegerMultiply4);
        f = bigIntegerMultiply5;
        java.math.BigInteger bigIntegerMultiply6 = bigIntegerValueOf.multiply(bigIntegerMultiply5);
        g = bigIntegerMultiply6;
        java.math.BigInteger bigIntegerMultiply7 = bigIntegerValueOf.multiply(bigIntegerMultiply6);
        h = bigIntegerMultiply7;
        java.math.BigInteger bigIntegerMultiply8 = bigIntegerValueOf.multiply(bigIntegerMultiply7);
        i = bigIntegerMultiply8;
        j = bigIntegerValueOf.multiply(bigIntegerMultiply8);
    }

    public static java.lang.String a(long j2) {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(j2);
        j$.util.Objects.requireNonNull(bigIntegerValueOf, "size");
        java.math.BigInteger bigInteger = j;
        if (bigIntegerValueOf.divide(bigInteger).compareTo(java.math.BigInteger.ZERO) > 0) {
            return java.lang.String.valueOf(java.lang.String.valueOf(bigIntegerValueOf.divide(bigInteger))).concat(" QB");
        }
        java.math.BigInteger bigInteger2 = i;
        if (bigIntegerValueOf.divide(bigInteger2).compareTo(java.math.BigInteger.ZERO) > 0) {
            return java.lang.String.valueOf(java.lang.String.valueOf(bigIntegerValueOf.divide(bigInteger2))).concat(" RB");
        }
        java.math.BigInteger bigInteger3 = h;
        if (bigIntegerValueOf.divide(bigInteger3).compareTo(java.math.BigInteger.ZERO) > 0) {
            return java.lang.String.valueOf(java.lang.String.valueOf(bigIntegerValueOf.divide(bigInteger3))).concat(" YB");
        }
        java.math.BigInteger bigInteger4 = g;
        if (bigIntegerValueOf.divide(bigInteger4).compareTo(java.math.BigInteger.ZERO) > 0) {
            return java.lang.String.valueOf(java.lang.String.valueOf(bigIntegerValueOf.divide(bigInteger4))).concat(" ZB");
        }
        java.math.BigInteger bigInteger5 = f;
        if (bigIntegerValueOf.divide(bigInteger5).compareTo(java.math.BigInteger.ZERO) > 0) {
            return java.lang.String.valueOf(java.lang.String.valueOf(bigIntegerValueOf.divide(bigInteger5))).concat(" EB");
        }
        java.math.BigInteger bigInteger6 = e;
        if (bigIntegerValueOf.divide(bigInteger6).compareTo(java.math.BigInteger.ZERO) > 0) {
            return java.lang.String.valueOf(java.lang.String.valueOf(bigIntegerValueOf.divide(bigInteger6))).concat(" PB");
        }
        java.math.BigInteger bigInteger7 = d;
        if (bigIntegerValueOf.divide(bigInteger7).compareTo(java.math.BigInteger.ZERO) > 0) {
            return java.lang.String.valueOf(java.lang.String.valueOf(bigIntegerValueOf.divide(bigInteger7))).concat(" TB");
        }
        java.math.BigInteger bigInteger8 = c;
        if (bigIntegerValueOf.divide(bigInteger8).compareTo(java.math.BigInteger.ZERO) > 0) {
            return java.lang.String.valueOf(java.lang.String.valueOf(bigIntegerValueOf.divide(bigInteger8))).concat(" GB");
        }
        java.math.BigInteger bigInteger9 = b;
        if (bigIntegerValueOf.divide(bigInteger9).compareTo(java.math.BigInteger.ZERO) > 0) {
            return java.lang.String.valueOf(java.lang.String.valueOf(bigIntegerValueOf.divide(bigInteger9))).concat(" MB");
        }
        java.math.BigInteger bigInteger10 = a;
        return bigIntegerValueOf.divide(bigInteger10).compareTo(java.math.BigInteger.ZERO) > 0 ? java.lang.String.valueOf(java.lang.String.valueOf(bigIntegerValueOf.divide(bigInteger10))).concat(" KB") : java.lang.String.valueOf(java.lang.String.valueOf(bigIntegerValueOf)).concat(" bytes");
    }
}
