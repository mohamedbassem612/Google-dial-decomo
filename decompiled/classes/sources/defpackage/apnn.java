package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class apnn {
    public static volatile defpackage.apnn b;

    static {
        java.util.Map map = defpackage.apnr.a;
        defpackage.apnr.a();
        b = new defpackage.apnl();
        java.util.logging.Logger.getLogger(defpackage.apje.class.getName());
    }

    public javax.net.ssl.SSLContext a() throws java.security.NoSuchAlgorithmException {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
        defpackage.aooh.e(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public void b(java.lang.String str, java.lang.Throwable th) {
        throw null;
    }

    public final javax.net.ssl.SSLSocketFactory c(javax.net.ssl.X509TrustManager x509TrustManager) {
        if (x509TrustManager == null) {
            defpackage.aooh.i("trustManager");
        }
        try {
            javax.net.ssl.SSLContext sSLContextA = a();
            sSLContextA.init(null, new javax.net.ssl.TrustManager[]{x509TrustManager}, null);
            javax.net.ssl.SSLSocketFactory socketFactory = sSLContextA.getSocketFactory();
            defpackage.aooh.e(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (java.security.GeneralSecurityException e) {
            e.toString();
            throw new java.lang.AssertionError("No System TLS: ".concat(e.toString()), e);
        }
    }

    public final java.lang.String toString() {
        java.lang.String simpleName = getClass().getSimpleName();
        defpackage.aooh.e(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
