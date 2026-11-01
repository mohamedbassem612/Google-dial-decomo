package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajin {
    public static final defpackage.ajmk a = new defpackage.ajmk(defpackage.ajhu.class, new defpackage.ajhg(8));
    public static final defpackage.ajmk b = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", new defpackage.ajhh(8));
    public static final defpackage.ajmk c = new defpackage.ajmk(defpackage.ajhr.class, new defpackage.ajhi(8));
    public static final defpackage.ajmk d = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", new defpackage.ajhj(8));

    public static defpackage.ajhr a(akxm akxmVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            java.lang.Object obj = akxmVar.d;
            defpackage.ajqm ajqmVar = (defpackage.ajqm) defpackage.alad.z(defpackage.ajqm.a, (defpackage.akzc) obj, defpackage.akzq.a);
            if (ajqmVar.b == 0) {
                return defpackage.ajhr.aq(f((defpackage.ajfe) akxmVar.c), ajyi.B(ajqmVar.c.D()), (java.lang.Integer) akxmVar.a);
            }
            throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
        } catch (defpackage.alaz unused) {
            throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static akxm b(defpackage.ajhr ajhrVar) {
        defpackage.akzx akzxVarM = defpackage.ajqm.a.m();
        defpackage.akzc akzcVarU = defpackage.akzc.u(ajhrVar.d.k());
        akzxVarM.u();
        defpackage.ajqm ajqmVar = (defpackage.ajqm) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        ajqmVar.c = akzcVarU;
        return akxm.d("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((defpackage.ajqm) akzxVarM.r()).f(), ajfd.b, e(ajhrVar.a.a), ajhrVar.c);
    }

    public static defpackage.aogc c(defpackage.ajhu ajhuVar) {
        return defpackage.aogc.C("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", e(ajhuVar.a), ajqn.a.f());
    }

    public static defpackage.ajhu d(defpackage.aogc aogcVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
        }
        try {
            java.lang.Object obj = aogcVar.c;
            if (defpackage.alad.z(ajqn.a, (defpackage.akzc) obj, defpackage.akzq.a).b == 0) {
                return new defpackage.ajhu(f((defpackage.ajfe) aogcVar.a));
            }
            throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (defpackage.alaz e) {
            throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    private static defpackage.ajfe e(defpackage.ajht ajhtVar) throws java.security.GeneralSecurityException {
        if (ajhtVar.equals(defpackage.ajht.a)) {
            return defpackage.ajfe.b;
        }
        if (ajhtVar.equals(defpackage.ajht.b)) {
            return defpackage.ajfe.e;
        }
        if (ajhtVar.equals(defpackage.ajht.c)) {
            return defpackage.ajfe.d;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(ajhtVar.d));
    }

    private static defpackage.ajht f(defpackage.ajfe ajfeVar) throws java.security.GeneralSecurityException {
        if (ajfeVar == defpackage.ajfe.b) {
            return defpackage.ajht.a;
        }
        if (ajfeVar == defpackage.ajfe.e || ajfeVar == defpackage.ajfe.c) {
            return defpackage.ajht.b;
        }
        if (ajfeVar == defpackage.ajfe.d) {
            return defpackage.ajht.c;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }
}
