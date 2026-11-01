package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajlo {
    public static final java.security.spec.ECParameterSpec a = h("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    public static final java.security.spec.ECParameterSpec b = h("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    public static final java.security.spec.ECParameterSpec c = h("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    private static final java.math.BigInteger d = java.math.BigInteger.valueOf(2);
    private static final java.math.BigInteger e = java.math.BigInteger.valueOf(3);
    private static final java.math.BigInteger f = java.math.BigInteger.valueOf(4);
    private static final java.math.BigInteger g = java.math.BigInteger.valueOf(8);

    static defpackage.ajln a(defpackage.ajln ajlnVar, defpackage.ajln ajlnVar2, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        if (ajlnVar.a()) {
            return ajlnVar2;
        }
        if (ajlnVar2.a()) {
            return ajlnVar;
        }
        java.math.BigInteger bigInteger3 = ajlnVar.d;
        java.math.BigInteger bigIntegerMod = bigInteger3.multiply(bigInteger3).mod(bigInteger2);
        java.math.BigInteger bigInteger4 = ajlnVar2.d;
        java.math.BigInteger bigIntegerMod2 = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        java.math.BigInteger bigIntegerMod3 = ajlnVar.b.multiply(bigIntegerMod2).mod(bigInteger2);
        java.math.BigInteger bigIntegerMod4 = ajlnVar2.b.multiply(bigIntegerMod).mod(bigInteger2);
        java.math.BigInteger bigIntegerMod5 = ajlnVar.c.multiply(bigInteger4).mod(bigInteger2).multiply(bigIntegerMod2).mod(bigInteger2);
        java.math.BigInteger bigIntegerMod6 = ajlnVar2.c.multiply(bigInteger3).mod(bigInteger2).multiply(bigIntegerMod).mod(bigInteger2);
        if (bigIntegerMod3.equals(bigIntegerMod4)) {
            return !bigIntegerMod5.equals(bigIntegerMod6) ? defpackage.ajln.a : b(ajlnVar, bigInteger, bigInteger2);
        }
        java.math.BigInteger bigIntegerMod7 = bigIntegerMod4.subtract(bigIntegerMod3).mod(bigInteger2);
        java.math.BigInteger bigIntegerMod8 = bigIntegerMod7.multiply(f).multiply(bigIntegerMod7).mod(bigInteger2);
        java.math.BigInteger bigIntegerMod9 = bigIntegerMod7.multiply(bigIntegerMod8).mod(bigInteger2);
        java.math.BigInteger bigIntegerSubtract = bigIntegerMod6.subtract(bigIntegerMod5);
        java.math.BigInteger bigInteger5 = d;
        java.math.BigInteger bigIntegerMod10 = bigIntegerSubtract.multiply(bigInteger5).mod(bigInteger2);
        java.math.BigInteger bigIntegerMod11 = bigIntegerMod3.multiply(bigIntegerMod8).mod(bigInteger2);
        java.math.BigInteger bigIntegerMod12 = bigIntegerMod10.multiply(bigIntegerMod10).mod(bigInteger2).subtract(bigIntegerMod9).subtract(bigIntegerMod11.multiply(bigInteger5)).mod(bigInteger2);
        java.math.BigInteger bigIntegerMod13 = bigIntegerMod10.multiply(bigIntegerMod11.subtract(bigIntegerMod12)).subtract(bigIntegerMod5.multiply(bigInteger5).multiply(bigIntegerMod9)).mod(bigInteger2);
        java.math.BigInteger bigIntegerAdd = bigInteger3.add(bigInteger4);
        return new defpackage.ajln(bigIntegerMod12, bigIntegerMod13, bigIntegerAdd.multiply(bigIntegerAdd).mod(bigInteger2).subtract(bigIntegerMod).subtract(bigIntegerMod2).multiply(bigIntegerMod7).mod(bigInteger2));
    }

    static defpackage.ajln b(defpackage.ajln ajlnVar, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger bigInteger3 = ajlnVar.c;
        if (bigInteger3.equals(java.math.BigInteger.ZERO)) {
            return defpackage.ajln.a;
        }
        java.math.BigInteger bigInteger4 = ajlnVar.b;
        java.math.BigInteger bigIntegerMod = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        java.math.BigInteger bigIntegerMod2 = bigInteger3.multiply(bigInteger3).mod(bigInteger2);
        java.math.BigInteger bigIntegerMod3 = bigIntegerMod2.multiply(bigIntegerMod2).mod(bigInteger2);
        java.math.BigInteger bigInteger5 = ajlnVar.d;
        java.math.BigInteger bigIntegerMod4 = bigInteger5.multiply(bigInteger5).mod(bigInteger2);
        java.math.BigInteger bigIntegerAdd = bigInteger4.add(bigIntegerMod2);
        java.math.BigInteger bigIntegerSubtract = bigIntegerAdd.multiply(bigIntegerAdd).mod(bigInteger2).subtract(bigIntegerMod).subtract(bigIntegerMod3);
        java.math.BigInteger bigInteger6 = d;
        java.math.BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigInteger6);
        java.math.BigInteger bigIntegerAdd2 = bigIntegerMod.multiply(e).add(bigInteger.multiply(bigIntegerMod4).multiply(bigIntegerMod4).mod(bigInteger2));
        java.math.BigInteger bigIntegerMod5 = bigIntegerAdd2.multiply(bigIntegerAdd2).mod(bigInteger2).subtract(bigIntegerMultiply.multiply(bigInteger6)).mod(bigInteger2);
        java.math.BigInteger bigIntegerMod6 = bigIntegerAdd2.multiply(bigIntegerMultiply.subtract(bigIntegerMod5)).mod(bigInteger2).subtract(bigIntegerMod3.multiply(g)).mod(bigInteger2);
        java.math.BigInteger bigIntegerAdd3 = bigInteger3.add(bigInteger5);
        return new defpackage.ajln(bigIntegerMod5, bigIntegerMod6, bigIntegerAdd3.multiply(bigIntegerAdd3).mod(bigInteger2).subtract(bigIntegerMod2).subtract(bigIntegerMod4).mod(bigInteger2));
    }

    static defpackage.ajln c(java.security.spec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        if (eCPoint.equals(java.security.spec.ECPoint.POINT_INFINITY)) {
            return defpackage.ajln.a;
        }
        java.math.BigInteger bigIntegerMod = new java.math.BigInteger(1, defpackage.ajna.b((bigInteger.bitLength() + 8) / 8)).mod(bigInteger);
        java.math.BigInteger bigIntegerMod2 = bigIntegerMod.multiply(bigIntegerMod).mod(bigInteger);
        return new defpackage.ajln(eCPoint.getAffineX().multiply(bigIntegerMod2).mod(bigInteger), eCPoint.getAffineY().multiply(bigIntegerMod2.multiply(bigIntegerMod).mod(bigInteger)).mod(bigInteger), bigIntegerMod);
    }

    public static java.math.BigInteger d(java.security.spec.EllipticCurve ellipticCurve) throws java.security.GeneralSecurityException {
        java.security.spec.ECField field = ellipticCurve.getField();
        if (field instanceof java.security.spec.ECFieldFp) {
            return ((java.security.spec.ECFieldFp) field).getP();
        }
        throw new java.security.GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static java.security.spec.ECPoint e(java.math.BigInteger bigInteger, java.security.spec.ECParameterSpec eCParameterSpec) throws java.security.GeneralSecurityException {
        java.security.spec.ECPoint eCPoint;
        if (!g(eCParameterSpec, a) && !g(eCParameterSpec, b) && !g(eCParameterSpec, c)) {
            throw new java.security.GeneralSecurityException("spec must be NIST P256, P384 or P521");
        }
        if (bigInteger.signum() != 1) {
            throw new java.security.GeneralSecurityException("k must be positive");
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            throw new java.security.GeneralSecurityException("k must be smaller than the order of the generator");
        }
        java.security.spec.EllipticCurve curve = eCParameterSpec.getCurve();
        java.security.spec.ECPoint generator = eCParameterSpec.getGenerator();
        f(generator, curve);
        java.math.BigInteger a2 = eCParameterSpec.getCurve().getA();
        java.math.BigInteger bigIntegerD = d(curve);
        defpackage.ajln ajlnVarC = c(java.security.spec.ECPoint.POINT_INFINITY, bigIntegerD);
        defpackage.ajln ajlnVarC2 = c(generator, bigIntegerD);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                ajlnVarC = a(ajlnVarC, ajlnVarC2, a2, bigIntegerD);
                ajlnVarC2 = b(ajlnVarC2, a2, bigIntegerD);
            } else {
                ajlnVarC2 = a(ajlnVarC, ajlnVarC2, a2, bigIntegerD);
                ajlnVarC = b(ajlnVarC, a2, bigIntegerD);
            }
        }
        if (ajlnVarC.a()) {
            eCPoint = java.security.spec.ECPoint.POINT_INFINITY;
        } else {
            java.math.BigInteger bigIntegerModInverse = ajlnVarC.d.modInverse(bigIntegerD);
            java.math.BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerD);
            eCPoint = new java.security.spec.ECPoint(ajlnVarC.b.multiply(bigIntegerMod).mod(bigIntegerD), ajlnVarC.c.multiply(bigIntegerMod).mod(bigIntegerD).multiply(bigIntegerModInverse).mod(bigIntegerD));
        }
        f(eCPoint, curve);
        return eCPoint;
    }

    public static void f(java.security.spec.ECPoint eCPoint, java.security.spec.EllipticCurve ellipticCurve) throws java.security.GeneralSecurityException {
        java.math.BigInteger bigIntegerD = d(ellipticCurve);
        java.math.BigInteger affineX = eCPoint.getAffineX();
        java.math.BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new java.security.GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(bigIntegerD) >= 0) {
            throw new java.security.GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(bigIntegerD) >= 0) {
            throw new java.security.GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(bigIntegerD).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(bigIntegerD))) {
            throw new java.security.GeneralSecurityException("Point is not on curve");
        }
    }

    public static boolean g(java.security.spec.ECParameterSpec eCParameterSpec, java.security.spec.ECParameterSpec eCParameterSpec2) {
        return eCParameterSpec.getCurve().equals(eCParameterSpec2.getCurve()) && eCParameterSpec.getGenerator().equals(eCParameterSpec2.getGenerator()) && eCParameterSpec.getOrder().equals(eCParameterSpec2.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec2.getCofactor();
    }

    private static java.security.spec.ECParameterSpec h(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.math.BigInteger bigInteger = new java.math.BigInteger(str);
        return new java.security.spec.ECParameterSpec(new java.security.spec.EllipticCurve(new java.security.spec.ECFieldFp(bigInteger), bigInteger.subtract(new java.math.BigInteger("3")), new java.math.BigInteger(str3, 16)), new java.security.spec.ECPoint(new java.math.BigInteger(str4, 16), new java.math.BigInteger(str5, 16)), new java.math.BigInteger(str2), 1);
    }
}
