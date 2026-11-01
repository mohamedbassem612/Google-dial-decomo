package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afdy extends javax.net.ssl.SSLSocketFactory {
    public static defpackage.afdv a = null;
    private static final java.lang.String b = "afdy";
    private final javax.net.ssl.KeyManager[] c;
    private final javax.net.ssl.TrustManager[] d;
    private final java.security.SecureRandom e;

    public afdy(javax.net.ssl.KeyManager[] keyManagerArr, javax.net.ssl.TrustManager[] trustManagerArr, java.security.SecureRandom secureRandom) {
        this.c = keyManagerArr;
        this.d = trustManagerArr;
        this.e = secureRandom;
    }

    private final javax.net.ssl.SSLSocketFactory a(java.security.Provider provider) {
        try {
            javax.net.ssl.SSLContext sSLContext = provider != null ? javax.net.ssl.SSLContext.getInstance("TLS", provider) : javax.net.ssl.SSLContext.getInstance("TLS");
            javax.net.ssl.TrustManager[] trustManagerArr = this.d;
            if (trustManagerArr == null || trustManagerArr.length <= 0 || !(trustManagerArr[0] instanceof defpackage.afdz)) {
                sSLContext.init(this.c, trustManagerArr, this.e);
            } else {
                sSLContext.init(null, null, null);
            }
            return sSLContext.getSocketFactory();
        } catch (java.security.KeyManagementException | java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    private final javax.net.ssl.SSLSocketFactory b() {
        javax.net.ssl.SSLSocketFactory sSLSocketFactoryA;
        defpackage.ahcc ahccVar = defpackage.ahcc.c;
        int i = ahccVar.a;
        a.a(ahccVar);
        javax.net.ssl.SSLSocketFactory sSLSocketFactoryA2 = a(null);
        if (sSLSocketFactoryA2 != null && !(sSLSocketFactoryA2 instanceof defpackage.afdy)) {
            return sSLSocketFactoryA2;
        }
        for (java.security.Provider provider : java.security.Security.getProviders()) {
            if (!(provider instanceof defpackage.afdw) && ((provider.stringPropertyNames().contains("SSLContext.TLS") || provider.getService("SSLContext", "TLS") != null) && (sSLSocketFactoryA = a(provider)) != null && !(sSLSocketFactoryA instanceof defpackage.afdy))) {
                return sSLSocketFactoryA;
            }
        }
        java.lang.String strConcat = "[";
        for (java.security.Provider provider2 : java.security.Security.getProviders()) {
            strConcat = strConcat.concat(java.lang.String.valueOf(provider2.toString())).concat((provider2.stringPropertyNames().contains("SSLContext.TLS") || provider2.getService("SSLContext", "TLS") != null) ? "(true), " : "(false), ");
        }
        android.util.Log.e(b, strConcat.concat("]"));
        throw new java.lang.RuntimeException("Unable to find a default SSL provider.");
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket() {
        return b().createSocket();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
        try {
            return b().getDefaultCipherSuites();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
        try {
            return b().getSupportedCipherSuites();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i) {
        return b().createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i, java.net.InetAddress inetAddress, int i2) {
        return b().createSocket(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i) {
        return b().createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i, java.net.InetAddress inetAddress2, int i2) {
        return b().createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.net.Socket createSocket(java.net.Socket socket, java.lang.String str, int i, boolean z) {
        return b().createSocket(socket, str, i, z);
    }
}
