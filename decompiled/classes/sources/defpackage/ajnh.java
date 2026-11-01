package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajnh {
    public static final defpackage.ajlq a = new defpackage.ajge(13);
    public static final defpackage.ajmo b = new defpackage.ajmo(defpackage.ajng.class, defpackage.ajnl.class, new defpackage.ajfy(18));
    public static final defpackage.ajmo c = new defpackage.ajmo(defpackage.ajng.class, defpackage.ajfb.class, new defpackage.ajfy(19));
    public static final defpackage.ajep d;

    static {
        defpackage.ajof ajofVar = defpackage.ajof.a;
        defpackage.alad.M(defpackage.ajof.class);
        d = new defpackage.ajlv("type.googleapis.com/google.crypto.tink.AesCmacKey", defpackage.ajfb.class, 3);
    }

    public static void a(defpackage.ajnk ajnkVar) {
        if (ajnkVar.a != 32) {
            throw new java.security.GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
