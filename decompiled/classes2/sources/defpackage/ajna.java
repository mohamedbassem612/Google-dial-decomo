package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajna {
    private static final java.lang.ThreadLocal a = new defpackage.ajmz();

    public static java.security.SecureRandom a() {
        java.security.Provider providerA = defpackage.ajll.a();
        if (providerA != null) {
            try {
                return java.security.SecureRandom.getInstance("SHA1PRNG", providerA);
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        java.security.Provider providerB = defpackage.ajll.b();
        if (providerB != null) {
            try {
                return java.security.SecureRandom.getInstance("SHA1PRNG", providerB);
            } catch (java.security.GeneralSecurityException unused2) {
            }
        }
        return new java.security.SecureRandom();
    }

    public static byte[] b(int i) {
        byte[] bArr = new byte[i];
        ((java.security.SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
