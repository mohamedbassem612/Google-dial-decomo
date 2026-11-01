package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajsa implements ajeo {
    static final apni a;
    static final apni b;

    static {
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        ajsz.t(defpackage.ajsb.a, ajjf.a, map, map2);
        ajsz.t(defpackage.ajsb.b, ajjf.b, map, map2);
        ajsz.t(defpackage.ajsb.c, ajjf.c, map, map2);
        a = ajsz.ah(map, map2);
        java.util.HashMap map3 = new java.util.HashMap();
        java.util.HashMap map4 = new java.util.HashMap();
        ajsz.t(defpackage.ajsc.a, ajjh.b, map3, map4);
        ajsz.t(defpackage.ajsc.b, ajjh.a, map3, map4);
        ajsz.t(defpackage.ajsc.c, ajjh.c, map3, map4);
        b = ajsz.ah(map3, map4);
    }

    private ajsa(java.security.interfaces.ECPublicKey eCPublicKey) throws java.security.GeneralSecurityException {
        defpackage.ajlo.f(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    public static ajeo a(ajjl ajjlVar) throws java.security.GeneralSecurityException {
        ajjj ajjjVar = ajjlVar.a;
        defpackage.ajsb ajsbVar = (defpackage.ajsb) a.f(ajjjVar.b);
        java.security.spec.ECPoint eCPoint = ajjlVar.b;
        byte[] byteArray = eCPoint.getAffineX().toByteArray();
        byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
        java.security.spec.ECParameterSpec eCParameterSpecAs = agmc.as(ajsbVar);
        java.security.spec.ECPoint eCPoint2 = new java.security.spec.ECPoint(new java.math.BigInteger(1, byteArray), new java.math.BigInteger(1, byteArray2));
        defpackage.ajlo.f(eCPoint2, eCParameterSpecAs.getCurve());
        java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) ((java.security.KeyFactory) defpackage.ajse.e.a("EC")).generatePublic(new java.security.spec.ECPublicKeySpec(eCPoint2, eCParameterSpecAs));
        defpackage.ajst ajstVar = ajjjVar.f;
        if (ajstVar != null) {
            ajstVar.c();
        }
        b(ajjjVar.c);
        defpackage.ajki.a(ajjjVar);
        ajjlVar.d.c();
        return new defpackage.ajsa(eCPublicKey);
    }

    static final java.lang.String b(ajjg ajjgVar) throws java.security.GeneralSecurityException {
        if (ajjgVar.equals(ajjg.a)) {
            return "HmacSha1";
        }
        if (ajjgVar.equals(ajjg.b)) {
            return "HmacSha224";
        }
        if (ajjgVar.equals(ajjg.c)) {
            return "HmacSha256";
        }
        if (ajjgVar.equals(ajjg.d)) {
            return "HmacSha384";
        }
        if (ajjgVar.equals(ajjg.e)) {
            return "HmacSha512";
        }
        throw new java.security.GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajjgVar))));
    }
}
