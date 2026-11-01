package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajhw {
    public static final defpackage.ajmk a = new defpackage.ajmk(defpackage.ajgh.class, new defpackage.ajhg(3));
    public static final defpackage.ajmk b = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.AesEaxKey", new defpackage.ajhh(3));
    public static final defpackage.ajmk c = new defpackage.ajmk(defpackage.ajgd.class, new defpackage.ajhi(3));
    public static final defpackage.ajmk d = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.AesEaxKey", new defpackage.ajhj(3));

    public static defpackage.ajgd a(akxm akxmVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            java.lang.Object obj = akxmVar.d;
            defpackage.ajoq ajoqVar = (defpackage.ajoq) defpackage.alad.z(defpackage.ajoq.a, (defpackage.akzc) obj, defpackage.akzq.a);
            if (ajoqVar.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            defpackage.annk annkVar = new defpackage.annk((char[]) null);
            annkVar.l(ajoqVar.e.c());
            ajos ajosVar = ajoqVar.d;
            if (ajosVar == null) {
                ajosVar = ajos.a;
            }
            annkVar.k(ajosVar.b);
            annkVar.m();
            annkVar.a = f((defpackage.ajfe) akxmVar.c);
            return aftt.V(annkVar.j(), ajyi.B(ajoqVar.e.D()), (java.lang.Integer) akxmVar.a);
        } catch (defpackage.alaz unused) {
            throw new java.security.GeneralSecurityException("Parsing AesEaxKey failed");
        }
    }

    public static akxm b(defpackage.ajgd ajgdVar) {
        defpackage.akzx akzxVarM = defpackage.ajoq.a.m();
        defpackage.ajgh ajghVar = ajgdVar.a;
        ajos ajosVarG = g(ajghVar);
        akzxVarM.u();
        defpackage.ajoq ajoqVar = (defpackage.ajoq) akzxVarM.b;
        j$.util.Objects.requireNonNull(ajosVarG);
        ajoqVar.d = ajosVarG;
        ajoqVar.b |= 1;
        defpackage.akzc akzcVarU = defpackage.akzc.u(ajgdVar.d.k());
        akzxVarM.u();
        defpackage.ajoq ajoqVar2 = (defpackage.ajoq) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        ajoqVar2.e = akzcVarU;
        return akxm.d("type.googleapis.com/google.crypto.tink.AesEaxKey", ((defpackage.ajoq) akzxVarM.r()).f(), ajfd.b, e(ajghVar.d), ajgdVar.c);
    }

    public static defpackage.aogc c(defpackage.ajgh ajghVar) throws java.security.GeneralSecurityException {
        defpackage.ajfe ajfeVarE = e(ajghVar.d);
        defpackage.akzx akzxVarM = ajor.a.m();
        ajos ajosVarG = g(ajghVar);
        akzxVarM.u();
        ajor ajorVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(ajosVarG);
        ajorVar.c = ajosVarG;
        ajorVar.b |= 1;
        akzxVarM.u();
        akzxVarM.b.d = ajghVar.a;
        return defpackage.aogc.C("type.googleapis.com/google.crypto.tink.AesEaxKey", ajfeVarE, akzxVarM.r().f());
    }

    public static defpackage.ajgh d(defpackage.aogc aogcVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
        }
        try {
            java.lang.Object obj = aogcVar.c;
            ajor ajorVarZ = defpackage.alad.z(ajor.a, (defpackage.akzc) obj, defpackage.akzq.a);
            defpackage.annk annkVar = new defpackage.annk((char[]) null);
            annkVar.l(ajorVarZ.d);
            ajos ajosVar = ajorVarZ.c;
            if (ajosVar == null) {
                ajosVar = ajos.a;
            }
            annkVar.k(ajosVar.b);
            annkVar.m();
            annkVar.a = f((defpackage.ajfe) aogcVar.a);
            return annkVar.j();
        } catch (defpackage.alaz e) {
            throw new java.security.GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    private static defpackage.ajfe e(defpackage.ajgg ajggVar) throws java.security.GeneralSecurityException {
        if (ajggVar.equals(defpackage.ajgg.a)) {
            return defpackage.ajfe.b;
        }
        if (ajggVar.equals(defpackage.ajgg.b)) {
            return defpackage.ajfe.e;
        }
        if (ajggVar.equals(defpackage.ajgg.c)) {
            return defpackage.ajfe.d;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajggVar))));
    }

    private static defpackage.ajgg f(defpackage.ajfe ajfeVar) throws java.security.GeneralSecurityException {
        if (ajfeVar == defpackage.ajfe.b) {
            return defpackage.ajgg.a;
        }
        if (ajfeVar == defpackage.ajfe.e || ajfeVar == defpackage.ajfe.c) {
            return defpackage.ajgg.b;
        }
        if (ajfeVar == defpackage.ajfe.d) {
            return defpackage.ajgg.c;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }

    private static ajos g(defpackage.ajgh ajghVar) {
        int i = ajghVar.c;
        defpackage.akzx akzxVarM = ajos.a.m();
        akzxVarM.u();
        akzxVarM.b.b = ajghVar.b;
        return akzxVarM.r();
    }
}
