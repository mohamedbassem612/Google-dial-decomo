package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajja {
    public static final defpackage.ajmk a = new defpackage.ajmk(defpackage.ajiw.class, new defpackage.ajhg(9));
    public static final defpackage.ajmk b = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.AesSivKey", new defpackage.ajhh(9));
    public static final defpackage.ajmk c = new defpackage.ajmk(defpackage.ajis.class, new defpackage.ajhi(9));
    public static final defpackage.ajmk d = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.AesSivKey", new defpackage.ajhj(9));
    private static final java.util.Map e;

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put(defpackage.ajiv.c, defpackage.ajfe.d);
        map.put(defpackage.ajiv.a, defpackage.ajfe.b);
        map.put(defpackage.ajiv.b, defpackage.ajfe.e);
        e = j$.util.DesugarCollections.unmodifiableMap(map);
    }

    public static defpackage.ajfe a(defpackage.ajiv ajivVar) throws java.security.GeneralSecurityException {
        java.util.Map map = e;
        if (map.containsKey(ajivVar)) {
            return (defpackage.ajfe) map.get(ajivVar);
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajivVar))));
    }

    public static defpackage.ajiv b(defpackage.ajfe ajfeVar) throws java.security.GeneralSecurityException {
        if (ajfeVar == defpackage.ajfe.d) {
            return defpackage.ajiv.c;
        }
        if (ajfeVar == defpackage.ajfe.b) {
            return defpackage.ajiv.a;
        }
        if (ajfeVar == defpackage.ajfe.e || ajfeVar == defpackage.ajfe.c) {
            return defpackage.ajiv.b;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }

    public static defpackage.aogc c(defpackage.ajiw ajiwVar) throws java.security.GeneralSecurityException {
        defpackage.ajfe ajfeVarA = a(ajiwVar.b);
        defpackage.akzx akzxVarM = ajpb.a.m();
        akzxVarM.u();
        akzxVarM.b.b = ajiwVar.a;
        return defpackage.aogc.C("type.googleapis.com/google.crypto.tink.AesSivKey", ajfeVarA, akzxVarM.r().f());
    }

    public static defpackage.ajiw d(defpackage.aogc aogcVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
        }
        try {
            java.lang.Object obj = aogcVar.c;
            ajpb ajpbVarZ = defpackage.alad.z(ajpb.a, (defpackage.akzc) obj, defpackage.akzq.a);
            if (ajpbVarZ.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            defpackage.ajiu ajiuVar = new defpackage.ajiu();
            ajiuVar.b(ajpbVarZ.b);
            ajiuVar.a = b((defpackage.ajfe) aogcVar.a);
            return ajiuVar.a();
        } catch (defpackage.alaz e2) {
            throw new java.security.GeneralSecurityException("Parsing AesSivParameters failed: ", e2);
        }
    }
}
