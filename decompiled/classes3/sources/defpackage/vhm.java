package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vhm implements javax.net.ssl.X509TrustManager {
    private static final java.lang.String[] a = {"RSA", "ECDHE_RSA", "DHE_RSA", "ECDHE_ECDSA"};
    private static final java.lang.String[] b = {"RSA", "ECDHE_RSA", "DHE_RSA", "ECDHE_ECDSA", "GENERIC", "UNKNOWN"};
    private final boolean c;

    public vhm(boolean z) {
        this.c = z;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
        try {
            javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init((java.security.KeyStore) null);
            for (javax.net.ssl.TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                ((javax.net.ssl.X509TrustManager) trustManager).checkClientTrusted(x509CertificateArr, str);
            }
        } catch (java.security.KeyStoreException | java.security.NoSuchAlgorithmException e) {
            throw new java.security.cert.CertificateException(e);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
        if (x509CertificateArr == null) {
            throw new java.lang.IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
        }
        if (x509CertificateArr.length <= 0) {
            throw new java.lang.IllegalArgumentException("checkServerTrusted: X509Certificate is empty");
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            for (java.lang.String str2 : this.c ? b : a) {
                if (ahvr.r(str, str2)) {
                    try {
                        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance("X509");
                        trustManagerFactory.init((java.security.KeyStore) null);
                        for (javax.net.ssl.TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                            ((javax.net.ssl.X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
                        }
                        return;
                    } catch (java.security.KeyStoreException | java.security.NoSuchAlgorithmException e) {
                        throw new java.security.cert.CertificateException(e);
                    }
                }
            }
        }
        throw new java.security.cert.CertificateException("checkServerTrusted: AuthType " + str + " is not supported. Must be one of: " + java.util.Arrays.toString(this.c ? b : a));
    }

    @Override // javax.net.ssl.X509TrustManager
    public final java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
