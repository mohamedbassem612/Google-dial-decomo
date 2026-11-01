package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajle {
    private static final apni a;
    private static final apni b;
    private static final apni c;

    static {
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        ajsz.t(defpackage.ajpt.DHKEM_P256_HKDF_SHA256, ajjp.a, map, map2);
        ajsz.t(defpackage.ajpt.DHKEM_P384_HKDF_SHA384, ajjp.b, map, map2);
        ajsz.t(defpackage.ajpt.DHKEM_P521_HKDF_SHA512, ajjp.c, map, map2);
        ajsz.t(defpackage.ajpt.DHKEM_X25519_HKDF_SHA256, ajjp.f, map, map2);
        ajsz.t(defpackage.ajpt.X_WING, ajjp.g, map, map2);
        a = ajsz.ah(map, map2);
        java.util.HashMap map3 = new java.util.HashMap();
        java.util.HashMap map4 = new java.util.HashMap();
        ajsz.t(defpackage.ajps.HKDF_SHA256, ajjo.a, map3, map4);
        ajsz.t(defpackage.ajps.HKDF_SHA384, ajjo.b, map3, map4);
        ajsz.t(defpackage.ajps.HKDF_SHA512, ajjo.c, map3, map4);
        b = ajsz.ah(map3, map4);
        java.util.HashMap map5 = new java.util.HashMap();
        java.util.HashMap map6 = new java.util.HashMap();
        ajsz.t(defpackage.ajpr.AES_128_GCM, ajjm.a, map5, map6);
        ajsz.t(defpackage.ajpr.AES_256_GCM, ajjm.b, map5, map6);
        ajsz.t(defpackage.ajpr.CHACHA20_POLY1305, ajjm.c, map5, map6);
        c = ajsz.ah(map5, map6);
    }

    public static ajju a(akxm akxmVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ".concat(java.lang.String.valueOf(akxmVar.b)));
        }
        try {
            java.lang.Object obj = akxmVar.d;
            ajpx ajpxVarZ = alad.z(ajpx.a, (akzc) obj, akzq.a);
            if (ajpxVarZ.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            java.lang.Object obj2 = akxmVar.c;
            defpackage.ajpv ajpvVar = ajpxVarZ.d;
            if (ajpvVar == null) {
                ajpvVar = defpackage.ajpv.a;
            }
            ajjr ajjrVarH = h((ajfe) obj2, ajpvVar);
            return ajju.ap(ajjrVarH, k(ajjrVarH.a, ajpxVarZ.e.D()), (java.lang.Integer) akxmVar.a);
        } catch (alaz unused) {
            throw new java.security.GeneralSecurityException("Parsing HpkePublicKey failed");
        }
    }

    public static akxm b(ajju ajjuVar) {
        return akxm.d("type.googleapis.com/google.crypto.tink.HpkePublicKey", j(ajjuVar).f(), defpackage.ajfd.d, g(ajjuVar.a.d), ajjuVar.d);
    }

    public static ajjs c(akxm akxmVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ".concat(java.lang.String.valueOf(akxmVar.b)));
        }
        try {
            java.lang.Object obj = akxmVar.d;
            ajpw ajpwVarZ = alad.z(ajpw.a, (akzc) obj, akzq.a);
            if (ajpwVarZ.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            ajpx ajpxVar = ajpwVarZ.d;
            if (ajpxVar == null) {
                ajpxVar = ajpx.a;
            }
            if (ajpxVar.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            java.lang.Object obj2 = akxmVar.c;
            defpackage.ajpv ajpvVar = ajpxVar.d;
            if (ajpvVar == null) {
                ajpvVar = defpackage.ajpv.a;
            }
            ajjr ajjrVarH = h((ajfe) obj2, ajpvVar);
            ajjp ajjpVar = ajjrVarH.a;
            return ajjs.ar(ajju.ap(ajjrVarH, k(ajjpVar, ajpxVar.e.D()), (java.lang.Integer) akxmVar.a), ajyi.B(aftt.I(new java.math.BigInteger(1, ajpwVarZ.e.D()), defpackage.ajks.b(ajjpVar))));
        } catch (alaz unused) {
            throw new java.security.GeneralSecurityException("Parsing HpkePrivateKey failed");
        }
    }

    public static akxm d(ajjs ajjsVar) {
        akzx akzxVarM = ajpw.a.m();
        akzxVarM.u();
        akzxVarM.b.c = 0;
        ajpx ajpxVarJ = j(ajjsVar.a);
        akzxVarM.u();
        ajpw ajpwVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(ajpxVarJ);
        ajpwVar.d = ajpxVarJ;
        ajpwVar.b |= 1;
        akzc akzcVarU = akzc.u(ajjsVar.b.k());
        akzxVarM.u();
        ajpw ajpwVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        ajpwVar2.e = akzcVarU;
        return akxm.d("type.googleapis.com/google.crypto.tink.HpkePrivateKey", akzxVarM.p().f(), defpackage.ajfd.c, g(ajjsVar.ap().d), ajjsVar.m());
    }

    public static aogc e(ajjr ajjrVar) throws java.security.GeneralSecurityException {
        ajfe ajfeVarG = g(ajjrVar.d);
        akzx akzxVarM = defpackage.ajpu.a.m();
        defpackage.ajpv ajpvVarI = i(ajjrVar);
        akzxVarM.u();
        defpackage.ajpu ajpuVar = (defpackage.ajpu) akzxVarM.b;
        j$.util.Objects.requireNonNull(ajpvVarI);
        ajpuVar.c = ajpvVarI;
        ajpuVar.b |= 1;
        return aogc.C("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ajfeVarG, ((defpackage.ajpu) akzxVarM.p()).f());
    }

    public static ajjr f(aogc aogcVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
        }
        try {
            java.lang.Object obj = aogcVar.c;
            defpackage.ajpu ajpuVar = (defpackage.ajpu) alad.z(defpackage.ajpu.a, (akzc) obj, akzq.a);
            java.lang.Object obj2 = aogcVar.a;
            defpackage.ajpv ajpvVar = ajpuVar.c;
            if (ajpvVar == null) {
                ajpvVar = defpackage.ajpv.a;
            }
            return h((ajfe) obj2, ajpvVar);
        } catch (alaz e) {
            throw new java.security.GeneralSecurityException("Parsing HpkeParameters failed: ", e);
        }
    }

    private static ajfe g(ajjq ajjqVar) throws java.security.GeneralSecurityException {
        if (ajjqVar.equals(ajjq.c)) {
            return ajfe.d;
        }
        if (ajjqVar.equals(ajjq.a)) {
            return ajfe.b;
        }
        if (ajjqVar.equals(ajjq.b)) {
            return ajfe.e;
        }
        throw new java.security.GeneralSecurityException("unknown variant: ".concat(ajjqVar.d));
    }

    private static ajjr h(ajfe ajfeVar, defpackage.ajpv ajpvVar) throws java.security.GeneralSecurityException {
        ajjq ajjqVar;
        defpackage.ajpt ajptVar;
        defpackage.ajps ajpsVar;
        if (ajfeVar.equals(ajfe.d)) {
            ajjqVar = ajjq.c;
        } else if (ajfeVar.equals(ajfe.b)) {
            ajjqVar = ajjq.a;
        } else {
            if (!ajfeVar.equals(ajfe.e) && !ajfeVar.equals(ajfe.c)) {
                throw new java.security.GeneralSecurityException("unknown variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
            }
            ajjqVar = ajjq.b;
        }
        apni apniVar = a;
        defpackage.ajpr ajprVar = null;
        switch (ajpvVar.b) {
            case 0:
                ajptVar = defpackage.ajpt.KEM_UNKNOWN;
                break;
            case 1:
                ajptVar = defpackage.ajpt.DHKEM_X25519_HKDF_SHA256;
                break;
            case 2:
                ajptVar = defpackage.ajpt.DHKEM_P256_HKDF_SHA256;
                break;
            case 3:
                ajptVar = defpackage.ajpt.DHKEM_P384_HKDF_SHA384;
                break;
            case 4:
                ajptVar = defpackage.ajpt.DHKEM_P521_HKDF_SHA512;
                break;
            case 5:
                ajptVar = defpackage.ajpt.X_WING;
                break;
            case 6:
                ajptVar = defpackage.ajpt.ML_KEM768;
                break;
            case 7:
                ajptVar = defpackage.ajpt.ML_KEM1024;
                break;
            default:
                ajptVar = null;
                break;
        }
        if (ajptVar == null) {
            ajptVar = defpackage.ajpt.UNRECOGNIZED;
        }
        ajjp ajjpVar = (ajjp) apniVar.g(ajptVar);
        apni apniVar2 = b;
        int i = ajpvVar.c;
        if (i == 0) {
            ajpsVar = defpackage.ajps.KDF_UNKNOWN;
        } else if (i == 1) {
            ajpsVar = defpackage.ajps.HKDF_SHA256;
        } else if (i != 2) {
            ajpsVar = i != 3 ? null : defpackage.ajps.HKDF_SHA512;
        } else {
            ajpsVar = defpackage.ajps.HKDF_SHA384;
        }
        if (ajpsVar == null) {
            ajpsVar = defpackage.ajps.UNRECOGNIZED;
        }
        ajjo ajjoVar = (ajjo) apniVar2.g(ajpsVar);
        apni apniVar3 = c;
        int i2 = ajpvVar.d;
        if (i2 == 0) {
            ajprVar = defpackage.ajpr.AEAD_UNKNOWN;
        } else if (i2 == 1) {
            ajprVar = defpackage.ajpr.AES_128_GCM;
        } else if (i2 == 2) {
            ajprVar = defpackage.ajpr.AES_256_GCM;
        } else if (i2 == 3) {
            ajprVar = defpackage.ajpr.CHACHA20_POLY1305;
        }
        if (ajprVar == null) {
            ajprVar = defpackage.ajpr.UNRECOGNIZED;
        }
        return ajsz.v(ajjpVar, ajjoVar, (ajjm) apniVar3.g(ajprVar), ajjqVar);
    }

    private static defpackage.ajpv i(ajjr ajjrVar) {
        akzx akzxVarM = defpackage.ajpv.a.m();
        defpackage.ajpt ajptVar = (defpackage.ajpt) a.f(ajjrVar.a);
        akzxVarM.u();
        ((defpackage.ajpv) akzxVarM.b).b = ajptVar.a();
        defpackage.ajps ajpsVar = (defpackage.ajps) b.f(ajjrVar.b);
        akzxVarM.u();
        ((defpackage.ajpv) akzxVarM.b).c = ajpsVar.a();
        defpackage.ajpr ajprVar = (defpackage.ajpr) c.f(ajjrVar.c);
        akzxVarM.u();
        ((defpackage.ajpv) akzxVarM.b).d = ajprVar.a();
        return (defpackage.ajpv) akzxVarM.p();
    }

    private static ajpx j(ajju ajjuVar) {
        akzx akzxVarM = ajpx.a.m();
        akzxVarM.u();
        akzxVarM.b.c = 0;
        defpackage.ajpv ajpvVarI = i(ajjuVar.a);
        akzxVarM.u();
        ajpx ajpxVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(ajpvVarI);
        ajpxVar.d = ajpvVarI;
        ajpxVar.b |= 1;
        akzc akzcVarU = akzc.u(ajjuVar.b.c());
        akzxVarM.u();
        ajpx ajpxVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        ajpxVar2.e = akzcVarU;
        return akzxVarM.p();
    }

    private static defpackage.ajst k(ajjp ajjpVar, byte[] bArr) throws java.security.GeneralSecurityException {
        int i;
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        byte[] bArr2 = defpackage.ajks.a;
        if (ajjpVar == ajjp.f) {
            i = 32;
        } else if (ajjpVar == ajjp.a) {
            i = 65;
        } else if (ajjpVar == ajjp.b) {
            i = 97;
        } else if (ajjpVar == ajjp.c) {
            i = 133;
        } else {
            if (ajjpVar != ajjp.g) {
                throw new java.security.GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i = 1216;
        }
        return defpackage.ajst.b(aftt.I(bigInteger, i));
    }
}
