package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajhz {
    public static final defpackage.ajmk a = new defpackage.ajmk(defpackage.ajgm.class, new defpackage.ajhg(4));
    public static final defpackage.ajmk b = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.AesGcmKey", new defpackage.ajhh(4));
    public static final defpackage.ajmk c = new defpackage.ajmk(defpackage.ajgi.class, new defpackage.ajhi(4));
    public static final defpackage.ajmk d = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.AesGcmKey", new defpackage.ajhj(4));

    public static defpackage.ajgi a(akxm akxmVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            java.lang.Object obj = akxmVar.d;
            defpackage.ajow ajowVar = (defpackage.ajow) defpackage.alad.z(defpackage.ajow.a, (defpackage.akzc) obj, defpackage.akzq.a);
            if (ajowVar.b != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            defpackage.annk annkVar = new defpackage.annk(null, null);
            annkVar.h(ajowVar.c.c());
            annkVar.g();
            annkVar.i();
            annkVar.c = f((defpackage.ajfe) akxmVar.c);
            return aftt.U(annkVar.f(), ajyi.B(ajowVar.c.D()), (java.lang.Integer) akxmVar.a);
        } catch (defpackage.alaz unused) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static akxm b(defpackage.ajgi ajgiVar) {
        defpackage.ajgm ajgmVar = ajgiVar.a;
        g(ajgmVar);
        defpackage.akzx akzxVarM = defpackage.ajow.a.m();
        defpackage.akzc akzcVarU = defpackage.akzc.u(ajgiVar.d.k());
        akzxVarM.u();
        defpackage.ajow ajowVar = (defpackage.ajow) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        ajowVar.c = akzcVarU;
        return akxm.d("type.googleapis.com/google.crypto.tink.AesGcmKey", ((defpackage.ajow) akzxVarM.r()).f(), ajfd.b, e(ajgmVar.d), ajgiVar.c);
    }

    public static defpackage.aogc c(defpackage.ajgm ajgmVar) throws java.security.GeneralSecurityException {
        g(ajgmVar);
        defpackage.ajfe ajfeVarE = e(ajgmVar.d);
        defpackage.akzx akzxVarM = ajox.a.m();
        akzxVarM.u();
        akzxVarM.b.b = ajgmVar.a;
        return defpackage.aogc.C("type.googleapis.com/google.crypto.tink.AesGcmKey", ajfeVarE, akzxVarM.r().f());
    }

    public static defpackage.ajgm d(defpackage.aogc aogcVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
        }
        try {
            java.lang.Object obj = aogcVar.c;
            ajox ajoxVarZ = defpackage.alad.z(ajox.a, (defpackage.akzc) obj, defpackage.akzq.a);
            if (ajoxVarZ.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
            }
            defpackage.annk annkVar = new defpackage.annk(null, null);
            annkVar.h(ajoxVarZ.b);
            annkVar.g();
            annkVar.i();
            annkVar.c = f((defpackage.ajfe) aogcVar.a);
            return annkVar.f();
        } catch (defpackage.alaz e) {
            throw new java.security.GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    private static defpackage.ajfe e(defpackage.ajgl ajglVar) throws java.security.GeneralSecurityException {
        if (ajglVar.equals(defpackage.ajgl.a)) {
            return defpackage.ajfe.b;
        }
        if (ajglVar.equals(defpackage.ajgl.b)) {
            return defpackage.ajfe.e;
        }
        if (ajglVar.equals(defpackage.ajgl.c)) {
            return defpackage.ajfe.d;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajglVar))));
    }

    private static defpackage.ajgl f(defpackage.ajfe ajfeVar) throws java.security.GeneralSecurityException {
        if (ajfeVar == defpackage.ajfe.b) {
            return defpackage.ajgl.a;
        }
        if (ajfeVar == defpackage.ajfe.e || ajfeVar == defpackage.ajfe.c) {
            return defpackage.ajgl.b;
        }
        if (ajfeVar == defpackage.ajfe.d) {
            return defpackage.ajgl.c;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }

    private static void g(defpackage.ajgm ajgmVar) {
        int i = ajgmVar.c;
        int i2 = ajgmVar.b;
    }
}
