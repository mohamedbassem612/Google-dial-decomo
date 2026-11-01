package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afds {
    public static final java.lang.String a = "afds";
    public static final java.lang.Object b = new java.lang.Object();
    public static final java.lang.String c = defpackage.afdy.class.getName();
    public static final java.lang.String d = defpackage.afdx.class.getName();
    public static defpackage.afdw e;
    public defpackage.afdv f;

    public afds(defpackage.afdv afdvVar) {
        this.f = afdvVar;
    }

    public static final void a() {
        try {
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
            sSLContext.init(null, new javax.net.ssl.TrustManager[]{new defpackage.afdz()}, null);
            javax.net.ssl.SSLContext.setDefault(sSLContext);
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        } catch (java.security.KeyManagementException | java.security.NoSuchAlgorithmException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    private afds() {
    }
}
