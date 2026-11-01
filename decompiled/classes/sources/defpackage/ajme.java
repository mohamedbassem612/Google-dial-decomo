package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajme {
    public static final defpackage.ajme a = new defpackage.ajme();
    private final java.util.Map b = new java.util.HashMap();

    public final synchronized void a(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            b((java.lang.String) entry.getKey(), (defpackage.ajsz) entry.getValue());
        }
    }

    public final synchronized void b(java.lang.String str, defpackage.ajsz ajszVar) {
        java.util.Map map = this.b;
        if (!map.containsKey(str)) {
            map.put(str, ajszVar);
            return;
        }
        if (((defpackage.ajsz) map.get(str)).equals(ajszVar)) {
            return;
        }
        throw new java.security.GeneralSecurityException("Parameters object with name " + str + " already exists (" + java.lang.String.valueOf(map.get(str)) + "), cannot insert " + java.lang.String.valueOf(ajszVar));
    }

    public final synchronized defpackage.ajsz c() {
        java.util.Map map;
        map = this.b;
        if (!map.containsKey("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM")) {
            throw new java.security.GeneralSecurityException("Name ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM does not exist");
        }
        return (defpackage.ajsz) map.get("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM");
    }
}
