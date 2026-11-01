package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajim {
    public static final defpackage.ajmk a = new defpackage.ajmk(defpackage.ajhq.class, new defpackage.ajhg(7));
    public static final defpackage.ajmk b = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.XAesGcmKey", new defpackage.ajhh(7));
    public static final defpackage.ajmk c = new defpackage.ajmk(defpackage.ajhn.class, new defpackage.ajhi(7));
    public static final defpackage.ajmk d = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.XAesGcmKey", new defpackage.ajhj(7));

    public static defpackage.ajhn a(akxm akxmVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) akxmVar.b).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            java.lang.Object obj = akxmVar.d;
            ajqj ajqjVarZ = defpackage.alad.z(ajqj.a, (defpackage.akzc) obj, defpackage.akzq.a);
            if (ajqjVarZ.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (ajqjVarZ.e.c() != 32) {
                throw new java.security.GeneralSecurityException("Only 32 byte key size is accepted");
            }
            defpackage.ajhp ajhpVarF = f((defpackage.ajfe) akxmVar.c);
            ajql ajqlVar = ajqjVarZ.d;
            if (ajqlVar == null) {
                ajqlVar = ajql.a;
            }
            return defpackage.ajhn.aq(defpackage.ajhq.c(ajhpVarF, ajqlVar.b), ajyi.B(ajqjVarZ.e.D()), (java.lang.Integer) akxmVar.a);
        } catch (defpackage.alaz unused) {
            throw new java.security.GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static akxm b(defpackage.ajhn ajhnVar) {
        defpackage.akzx akzxVarM = ajqj.a.m();
        defpackage.akzc akzcVarU = defpackage.akzc.u(ajhnVar.d.k());
        akzxVarM.u();
        ajqj ajqjVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(akzcVarU);
        ajqjVar.e = akzcVarU;
        defpackage.akzx akzxVarM2 = ajql.a.m();
        akzxVarM2.u();
        ajql ajqlVar = akzxVarM2.b;
        defpackage.ajhq ajhqVar = ajhnVar.a;
        ajqlVar.b = ajhqVar.b;
        ajql ajqlVarR = akzxVarM2.r();
        akzxVarM.u();
        ajqj ajqjVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(ajqlVarR);
        ajqjVar2.d = ajqlVarR;
        ajqjVar2.b |= 1;
        return akxm.d("type.googleapis.com/google.crypto.tink.XAesGcmKey", akzxVarM.r().f(), ajfd.b, e(ajhqVar.a), ajhnVar.c);
    }

    public static defpackage.aogc c(defpackage.ajhq ajhqVar) throws java.security.GeneralSecurityException {
        defpackage.ajfe ajfeVarE = e(ajhqVar.a);
        defpackage.akzx akzxVarM = ajqk.a.m();
        defpackage.akzx akzxVarM2 = ajql.a.m();
        akzxVarM2.u();
        akzxVarM2.b.b = ajhqVar.b;
        ajql ajqlVarR = akzxVarM2.r();
        akzxVarM.u();
        ajqk ajqkVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(ajqlVarR);
        ajqkVar.d = ajqlVarR;
        ajqkVar.b |= 1;
        return defpackage.aogc.C("type.googleapis.com/google.crypto.tink.XAesGcmKey", ajfeVarE, akzxVarM.r().f());
    }

    public static defpackage.ajhq d(defpackage.aogc aogcVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) aogcVar.b).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(java.lang.String.valueOf(aogcVar.b)));
        }
        try {
            java.lang.Object obj = aogcVar.c;
            ajqk ajqkVarZ = defpackage.alad.z(ajqk.a, (defpackage.akzc) obj, defpackage.akzq.a);
            if (ajqkVarZ.c != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
            }
            defpackage.ajhp ajhpVarF = f((defpackage.ajfe) aogcVar.a);
            ajql ajqlVar = ajqkVarZ.d;
            if (ajqlVar == null) {
                ajqlVar = ajql.a;
            }
            return defpackage.ajhq.c(ajhpVarF, ajqlVar.b);
        } catch (defpackage.alaz e) {
            throw new java.security.GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
        }
    }

    private static defpackage.ajfe e(defpackage.ajhp ajhpVar) throws java.security.GeneralSecurityException {
        if (j$.util.Objects.equals(ajhpVar, defpackage.ajhp.a)) {
            return defpackage.ajfe.b;
        }
        if (j$.util.Objects.equals(ajhpVar, defpackage.ajhp.b)) {
            return defpackage.ajfe.d;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(ajhpVar.c));
    }

    private static defpackage.ajhp f(defpackage.ajfe ajfeVar) throws java.security.GeneralSecurityException {
        if (ajfeVar == defpackage.ajfe.b) {
            return defpackage.ajhp.a;
        }
        if (ajfeVar == defpackage.ajfe.d) {
            return defpackage.ajhp.b;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }
}
