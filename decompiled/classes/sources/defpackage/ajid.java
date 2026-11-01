package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajid {
    public static final defpackage.ajmk a = new defpackage.ajmk(defpackage.ajgu.class, new defpackage.ajhg(6));
    public static final defpackage.ajmk b = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", new defpackage.ajhh(6));
    public static final defpackage.ajmk c = new defpackage.ajmk(defpackage.ajgr.class, new defpackage.ajhi(6));
    public static final defpackage.ajmk d = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", new defpackage.ajhj(6));

    public static defpackage.ajgr a(akxm akxmVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            java.lang.Object obj = akxmVar.d;
            defpackage.ajpc ajpcVar = (defpackage.ajpc) defpackage.alad.z(defpackage.ajpc.a, (defpackage.akzc) obj, defpackage.akzq.a);
            if (ajpcVar.b == 0) {
                return defpackage.ajgr.aq(f((defpackage.ajfe) akxmVar.c), ajyi.B(ajpcVar.c.D()), (java.lang.Integer) akxmVar.a);
            }
            throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
        } catch (defpackage.alaz unused) {
            throw new java.security.GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static akxm b(defpackage.ajgr ajgrVar) {
        defpackage.akzx akzxVarM = defpackage.ajpc.a.m();
        defpackage.akzc akzcVarU = defpackage.akzc.u(ajgrVar.d.k());
        akzxVarM.u();
        defpackage.ajpc ajpcVar = (defpackage.ajpc) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        ajpcVar.c = akzcVarU;
        return akxm.d("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((defpackage.ajpc) akzxVarM.r()).f(), ajfd.b, e(ajgrVar.a.a), ajgrVar.c);
    }

    public static defpackage.aogc c(defpackage.ajgu ajguVar) {
        return defpackage.aogc.C("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", e(ajguVar.a), ajpd.a.f());
    }

    public static defpackage.ajgu d(defpackage.aogc aogcVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
        }
        try {
            java.lang.Object obj = aogcVar.c;
            defpackage.alad.z(ajpd.a, (defpackage.akzc) obj, defpackage.akzq.a);
            return new defpackage.ajgu(f((defpackage.ajfe) aogcVar.a));
        } catch (defpackage.alaz e) {
            throw new java.security.GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    private static defpackage.ajfe e(defpackage.ajgt ajgtVar) throws java.security.GeneralSecurityException {
        if (ajgtVar.equals(defpackage.ajgt.a)) {
            return defpackage.ajfe.b;
        }
        if (ajgtVar.equals(defpackage.ajgt.b)) {
            return defpackage.ajfe.e;
        }
        if (ajgtVar.equals(defpackage.ajgt.c)) {
            return defpackage.ajfe.d;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(ajgtVar.d));
    }

    private static defpackage.ajgt f(defpackage.ajfe ajfeVar) throws java.security.GeneralSecurityException {
        if (ajfeVar == defpackage.ajfe.b) {
            return defpackage.ajgt.a;
        }
        if (ajfeVar == defpackage.ajfe.e || ajfeVar == defpackage.ajfe.c) {
            return defpackage.ajgt.b;
        }
        if (ajfeVar == defpackage.ajfe.d) {
            return defpackage.ajgt.c;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }
}
