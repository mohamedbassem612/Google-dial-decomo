package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajll {
    private static final java.lang.String[] a = {"AndroidOpenSSL", "GmsCore_OpenSSL", "Conscrypt"};

    public static java.security.Provider a() {
        java.lang.String[] strArr = a;
        for (int i = 0; i < 3; i++) {
            java.security.Provider provider = java.security.Security.getProvider(strArr[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static java.security.Provider b() {
        try {
            return (java.security.Provider) java.lang.Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
