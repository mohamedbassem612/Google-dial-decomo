package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajit {
    public static final defpackage.ajmo a = new defpackage.ajmo(defpackage.ajis.class, defpackage.ajem.class, new defpackage.ajfy(10));
    public static final defpackage.ajep b;
    public static final defpackage.ajmb c;
    public static final defpackage.ajlq d;

    static {
        defpackage.ajpa ajpaVar = defpackage.ajpa.a;
        defpackage.alad.M(defpackage.ajpa.class);
        b = new defpackage.ajlv("type.googleapis.com/google.crypto.tink.AesSivKey", defpackage.ajem.class, 3);
        c = new defpackage.ajgj();
        d = new defpackage.ajge(9);
    }

    public static void a(defpackage.ajiw ajiwVar) {
        int i = ajiwVar.a;
        if (i != 64) {
            throw new java.security.InvalidAlgorithmParameterException(defpackage.a.bs(i, "invalid key size: ", ". Valid keys must have 64 bytes."));
        }
    }
}
