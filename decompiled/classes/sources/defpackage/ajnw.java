package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajnw {
    public static final defpackage.ajmk a = new defpackage.ajmk(defpackage.ajnk.class, new defpackage.ajhg(13));
    public static final defpackage.ajmk b = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.AesCmacKey", new defpackage.ajhh(12));
    public static final defpackage.ajmk c = new defpackage.ajmk(defpackage.ajng.class, new defpackage.ajhi(15));
    public static final defpackage.ajmk d = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.AesCmacKey", new defpackage.ajhj(14));

    public static defpackage.ajfe a(defpackage.ajnj ajnjVar) {
        if (ajnjVar.equals(defpackage.ajnj.a)) {
            return defpackage.ajfe.b;
        }
        if (ajnjVar.equals(defpackage.ajnj.b)) {
            return defpackage.ajfe.e;
        }
        if (ajnjVar.equals(defpackage.ajnj.d)) {
            return defpackage.ajfe.d;
        }
        if (ajnjVar.equals(defpackage.ajnj.c)) {
            return defpackage.ajfe.c;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajnjVar))));
    }

    public static defpackage.ajnj b(defpackage.ajfe ajfeVar) throws java.security.GeneralSecurityException {
        if (ajfeVar == defpackage.ajfe.b) {
            return defpackage.ajnj.a;
        }
        if (ajfeVar == defpackage.ajfe.e) {
            return defpackage.ajnj.b;
        }
        if (ajfeVar == defpackage.ajfe.c) {
            return defpackage.ajnj.c;
        }
        if (ajfeVar == defpackage.ajfe.d) {
            return defpackage.ajnj.d;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }

    public static ajoh c(defpackage.ajnk ajnkVar) {
        defpackage.akzx akzxVarM = ajoh.a.m();
        akzxVarM.u();
        akzxVarM.b.b = ajnkVar.b;
        return akzxVarM.r();
    }
}
