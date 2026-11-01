package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajse {
    public static final defpackage.ajse a = new defpackage.ajse(new defpackage.ajsf(1));
    public static final defpackage.ajse b = new defpackage.ajse(new defpackage.ajsf(4));
    public static final defpackage.ajse c = new defpackage.ajse(new defpackage.ajsf(0));
    public static final defpackage.ajse d = new defpackage.ajse(new defpackage.ajsf(3));
    public static final defpackage.ajse e = new defpackage.ajse(new defpackage.ajsf(2));
    private final defpackage.ajsg f;

    public ajse(defpackage.ajsg ajsgVar) {
        this.f = ajsgVar;
    }

    public static java.util.List c(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            java.security.Provider provider = java.security.Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final java.lang.Object a(java.lang.String str) {
        return b(str, java.util.Collections.EMPTY_LIST);
    }

    final java.lang.Object b(java.lang.String str, java.util.List list) throws java.security.GeneralSecurityException {
        if (ajir.a()) {
            list = c("AndroidOpenSSL", "GmsCore_OpenSSL", "Conscrypt");
        } else if (agmc.ak()) {
            list = c("AndroidOpenSSL", "GmsCore_OpenSSL");
        }
        java.util.Iterator it = list.iterator();
        java.security.GeneralSecurityException generalSecurityException = null;
        while (it.hasNext()) {
            try {
                return this.f.a(str, (java.security.Provider) it.next());
            } catch (java.security.GeneralSecurityException e2) {
                if (generalSecurityException == null) {
                    generalSecurityException = e2;
                }
            }
        }
        if (ajir.a()) {
            throw new java.security.GeneralSecurityException("No good Provider found.", generalSecurityException);
        }
        return this.f.a(str, null);
    }
}
