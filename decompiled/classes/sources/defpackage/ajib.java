package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajib {
    public static final defpackage.ajmk a = new defpackage.ajmk(defpackage.ajgq.class, new defpackage.ajhg(5));
    public static final defpackage.ajmk b = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.AesGcmSivKey", new defpackage.ajhh(5));
    public static final defpackage.ajmk c = new defpackage.ajmk(defpackage.ajgn.class, new defpackage.ajhi(5));
    public static final defpackage.ajmk d = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.AesGcmSivKey", new defpackage.ajhj(5));

    public static defpackage.ajgn a(akxm akxmVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            java.lang.Object obj = akxmVar.d;
            defpackage.ajoy ajoyVar = (defpackage.ajoy) defpackage.alad.z(defpackage.ajoy.a, (defpackage.akzc) obj, defpackage.akzq.a);
            if (ajoyVar.b != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            defpackage.ajiu ajiuVar = new defpackage.ajiu((byte[]) null);
            ajiuVar.d(ajoyVar.c.c());
            ajiuVar.a = f((defpackage.ajfe) akxmVar.c);
            return aftt.T(ajiuVar.c(), ajyi.B(ajoyVar.c.D()), (java.lang.Integer) akxmVar.a);
        } catch (defpackage.alaz unused) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static akxm b(defpackage.ajgn ajgnVar) {
        defpackage.akzx akzxVarM = defpackage.ajoy.a.m();
        defpackage.akzc akzcVarU = defpackage.akzc.u(ajgnVar.d.k());
        akzxVarM.u();
        defpackage.ajoy ajoyVar = (defpackage.ajoy) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        ajoyVar.c = akzcVarU;
        return akxm.d("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((defpackage.ajoy) akzxVarM.r()).f(), ajfd.b, e(ajgnVar.a.b), ajgnVar.c);
    }

    public static defpackage.aogc c(defpackage.ajgq ajgqVar) throws java.security.GeneralSecurityException {
        defpackage.ajfe ajfeVarE = e(ajgqVar.b);
        defpackage.akzx akzxVarM = ajoz.a.m();
        akzxVarM.u();
        akzxVarM.b.b = ajgqVar.a;
        return defpackage.aogc.C("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ajfeVarE, akzxVarM.r().f());
    }

    public static defpackage.ajgq d(defpackage.aogc aogcVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
        }
        try {
            java.lang.Object obj = aogcVar.c;
            ajoz ajozVarZ = defpackage.alad.z(ajoz.a, (defpackage.akzc) obj, defpackage.akzq.a);
            if (ajozVarZ.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
            }
            defpackage.ajiu ajiuVar = new defpackage.ajiu((byte[]) null);
            ajiuVar.d(ajozVarZ.b);
            ajiuVar.a = f((defpackage.ajfe) aogcVar.a);
            return ajiuVar.c();
        } catch (defpackage.alaz e) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    private static defpackage.ajfe e(defpackage.ajgp ajgpVar) throws java.security.GeneralSecurityException {
        if (ajgpVar.equals(defpackage.ajgp.a)) {
            return defpackage.ajfe.b;
        }
        if (ajgpVar.equals(defpackage.ajgp.b)) {
            return defpackage.ajfe.e;
        }
        if (ajgpVar.equals(defpackage.ajgp.c)) {
            return defpackage.ajfe.d;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajgpVar))));
    }

    private static defpackage.ajgp f(defpackage.ajfe ajfeVar) throws java.security.GeneralSecurityException {
        if (ajfeVar == defpackage.ajfe.b) {
            return defpackage.ajgp.a;
        }
        if (ajfeVar == defpackage.ajfe.e || ajfeVar == defpackage.ajfe.c) {
            return defpackage.ajgp.b;
        }
        if (ajfeVar == defpackage.ajfe.d) {
            return defpackage.ajgp.c;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }
}
