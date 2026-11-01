package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afdx extends javax.net.ssl.SSLServerSocketFactory {
    public static defpackage.afdv a;
    private static final java.lang.String b = "afdy";

    private static final javax.net.ssl.SSLServerSocketFactory a(java.security.Provider provider) {
        try {
            return provider != null ? javax.net.ssl.SSLContext.getInstance("Default", provider).getServerSocketFactory() : javax.net.ssl.SSLContext.getInstance("Default").getServerSocketFactory();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    private static final javax.net.ssl.SSLServerSocketFactory b() {
        javax.net.ssl.SSLServerSocketFactory sSLServerSocketFactoryA;
        defpackage.ahcc ahccVar = defpackage.ahcc.c;
        int i = ahccVar.a;
        a.a(ahccVar);
        javax.net.ssl.SSLServerSocketFactory sSLServerSocketFactoryA2 = a(null);
        if (sSLServerSocketFactoryA2 != null && !(sSLServerSocketFactoryA2 instanceof defpackage.afdx)) {
            return sSLServerSocketFactoryA2;
        }
        for (java.security.Provider provider : java.security.Security.getProviders()) {
            if (!(provider instanceof defpackage.afdw) && ((provider.stringPropertyNames().contains("SSLContext.Default") || provider.getService("SSLContext", "Default") != null) && (sSLServerSocketFactoryA = a(provider)) != null && !(sSLServerSocketFactoryA instanceof defpackage.afdx))) {
                return sSLServerSocketFactoryA;
            }
        }
        java.lang.String strConcat = "[";
        for (java.security.Provider provider2 : java.security.Security.getProviders()) {
            strConcat = strConcat.concat(java.lang.String.valueOf(provider2.toString())).concat((provider2.stringPropertyNames().contains("SSLContext.Default") || provider2.getService("SSLContext", "Default") != null) ? "(true), " : "(false), ");
        }
        android.util.Log.e(b, strConcat.concat("]"));
        throw new java.lang.RuntimeException("Unable to find a default SSL provider.");
    }

    @Override // javax.net.ServerSocketFactory
    public final java.net.ServerSocket createServerSocket(int i) {
        return b().createServerSocket(i);
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
        try {
            return b().getDefaultCipherSuites();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
        try {
            return b().getSupportedCipherSuites();
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // javax.net.ServerSocketFactory
    public final java.net.ServerSocket createServerSocket(int i, int i2) {
        return b().createServerSocket(i, i2);
    }

    @Override // javax.net.ServerSocketFactory
    public final java.net.ServerSocket createServerSocket(int i, int i2, java.net.InetAddress inetAddress) {
        return b().createServerSocket(i, i2, inetAddress);
    }
}
