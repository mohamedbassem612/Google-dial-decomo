package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajny {
    public static final defpackage.ajmk a;
    public static final defpackage.ajmk b;
    public static final defpackage.ajmk c;
    public static final defpackage.ajmk d;
    public static final defpackage.apni e;

    static {
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        defpackage.ajsz.t(defpackage.ajpn.SHA1, defpackage.ajnp.a, map, map2);
        defpackage.ajsz.t(defpackage.ajpn.SHA224, defpackage.ajnp.b, map, map2);
        defpackage.ajsz.t(defpackage.ajpn.SHA256, defpackage.ajnp.c, map, map2);
        defpackage.ajsz.t(defpackage.ajpn.SHA384, defpackage.ajnp.d, map, map2);
        defpackage.ajsz.t(defpackage.ajpn.SHA512, defpackage.ajnp.e, map, map2);
        e = defpackage.ajsz.ah(map, map2);
        a = new defpackage.ajmk(defpackage.ajnr.class, new defpackage.ajhg(14));
        b = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.HmacKey", new defpackage.ajhh(13));
        c = new defpackage.ajmk(defpackage.ajnn.class, new defpackage.ajhi(16));
        d = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.HmacKey", new defpackage.ajhj(15));
    }

    public static defpackage.ajfe a(defpackage.ajnq ajnqVar) {
        if (ajnqVar == defpackage.ajnq.d) {
            return defpackage.ajfe.d;
        }
        if (ajnqVar == defpackage.ajnq.a) {
            return defpackage.ajfe.b;
        }
        if (ajnqVar == defpackage.ajnq.c) {
            return defpackage.ajfe.c;
        }
        if (ajnqVar == defpackage.ajnq.b) {
            return defpackage.ajfe.e;
        }
        throw new java.security.GeneralSecurityException("unknown variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajnqVar))));
    }

    public static defpackage.ajnq b(defpackage.ajfe ajfeVar) throws java.security.GeneralSecurityException {
        if (ajfeVar == defpackage.ajfe.d) {
            return defpackage.ajnq.d;
        }
        if (ajfeVar == defpackage.ajfe.b) {
            return defpackage.ajnq.a;
        }
        if (ajfeVar == defpackage.ajfe.c) {
            return defpackage.ajnq.c;
        }
        if (ajfeVar == defpackage.ajfe.e) {
            return defpackage.ajnq.b;
        }
        throw new java.security.GeneralSecurityException("unknown OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }

    public static ajpq c(defpackage.ajnr ajnrVar) {
        defpackage.akzx akzxVarM = ajpq.a.m();
        akzxVarM.u();
        akzxVarM.b.c = ajnrVar.b;
        defpackage.ajpn ajpnVar = (defpackage.ajpn) e.f(ajnrVar.d);
        akzxVarM.u();
        akzxVarM.b.b = ajpnVar.a();
        return akzxVarM.r();
    }
}
