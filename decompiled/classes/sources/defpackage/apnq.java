package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apnq extends defpackage.apod {
    private final javax.net.ssl.X509TrustManager a;
    private final android.net.http.X509TrustManagerExtensions b;

    public apnq(javax.net.ssl.X509TrustManager x509TrustManager, android.net.http.X509TrustManagerExtensions x509TrustManagerExtensions) {
        if (x509TrustManager == null) {
            defpackage.aooh.i("trustManager");
        }
        this.a = x509TrustManager;
        this.b = x509TrustManagerExtensions;
    }

    @Override // defpackage.apod
    public final java.util.List a(java.util.List list, java.lang.String str) throws javax.net.ssl.SSLPeerUnverifiedException {
        defpackage.aooh.f(list, "chain");
        try {
            java.util.List<java.security.cert.X509Certificate> listCheckServerTrusted = this.b.checkServerTrusted((java.security.cert.X509Certificate[]) list.toArray(new java.security.cert.X509Certificate[0]), "RSA", str);
            defpackage.aooh.e(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (java.security.cert.CertificateException e) {
            javax.net.ssl.SSLPeerUnverifiedException sSLPeerUnverifiedException = new javax.net.ssl.SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.apnq) && ((defpackage.apnq) obj).a == this.a;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.a);
    }
}
