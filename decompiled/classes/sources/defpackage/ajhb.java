package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajhb {
    public static final defpackage.ajmk a = new defpackage.ajmk(defpackage.ajha.class, new defpackage.ajhg(1));
    public static final defpackage.ajmk b = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.KmsAeadKey", new defpackage.ajhh(1));
    public static final defpackage.ajmk c = new defpackage.ajmk(defpackage.ajgy.class, new defpackage.ajhi(1));
    public static final defpackage.ajmk d = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.KmsAeadKey", new defpackage.ajhj(1));

    public static defpackage.ajfe a(ajgz ajgzVar) {
        if (ajgzVar.equals(ajgz.a)) {
            return defpackage.ajfe.b;
        }
        if (ajgzVar.equals(ajgz.b)) {
            return defpackage.ajfe.d;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(ajgzVar.c));
    }

    public static ajgz b(defpackage.ajfe ajfeVar) throws java.security.GeneralSecurityException {
        if (ajfeVar == defpackage.ajfe.b) {
            return ajgz.a;
        }
        if (ajfeVar == defpackage.ajfe.d) {
            return ajgz.b;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }
}
