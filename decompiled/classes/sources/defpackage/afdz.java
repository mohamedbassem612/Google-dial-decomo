package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class afdz implements javax.net.ssl.TrustManager, javax.net.ssl.X509TrustManager {
    private static final java.lang.String a = "afdz";

    private static final void a() {
        android.util.Log.e(a, "App is using openSSL stack, but is not using ProviderInstaller. Please Fix.");
        throw new java.lang.RuntimeException("Unsafe use of platform SSL stack.");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) {
        a();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) {
        a();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return new java.security.cert.X509Certificate[0];
    }
}
