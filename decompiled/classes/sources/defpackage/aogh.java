package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aogh {
    public final java.security.Provider c;
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.aogh.class.getName());
    private static final java.lang.String[] d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public static final defpackage.aogh b = f();

    public aogh(java.security.Provider provider) {
        this.c = provider;
    }

    public static byte[] e(java.util.List list) {
        defpackage.apoy apoyVar = new defpackage.apoy();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aogi aogiVar = (aogi) list.get(i);
            if (aogiVar != aogi.a) {
                java.lang.String str = aogiVar.e;
                apoyVar.N(str.length());
                apoyVar.ab(str);
            }
        }
        return apoyVar.D();
    }

    private static defpackage.aogh f() {
        java.security.Provider provider;
        int i;
        java.security.Provider[] providers = java.security.Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                provider = null;
                break;
            }
            java.security.Provider provider2 = providers[i2];
            java.lang.String[] strArr = d;
            int length2 = strArr.length;
            for (int i3 = 0; i3 < 5; i3++) {
                java.lang.String str = strArr[i3];
                if (str.equals(provider2.getClass().getName())) {
                    a.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i2++;
        }
        int i4 = 2;
        if (provider != null) {
            defpackage.aogc aogcVar = new defpackage.aogc((java.lang.Object) null, (java.lang.Object) "setUseSessionTickets", (java.lang.Object) new java.lang.Class[]{java.lang.Boolean.TYPE}, (byte[]) null);
            defpackage.aogc aogcVar2 = new defpackage.aogc((java.lang.Object) null, (java.lang.Object) "setHostname", (java.lang.Object) new java.lang.Class[]{java.lang.String.class}, (byte[]) null);
            defpackage.aogc aogcVar3 = new defpackage.aogc((java.lang.Object) byte[].class, (java.lang.Object) "getAlpnSelectedProtocol", (java.lang.Object) new java.lang.Class[0], (byte[]) null);
            defpackage.aogc aogcVar4 = new defpackage.aogc((java.lang.Object) null, (java.lang.Object) "setAlpnProtocols", (java.lang.Object) new java.lang.Class[]{byte[].class}, (byte[]) null);
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", java.net.Socket.class);
                cls.getMethod("untagSocket", java.net.Socket.class);
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    defpackage.aogh.class.getClassLoader().loadClass("android.net.Network");
                } catch (java.lang.ClassNotFoundException e) {
                    a.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (java.lang.Throwable) e);
                    try {
                        defpackage.aogh.class.getClassLoader().loadClass("android.app.ActivityOptions");
                    } catch (java.lang.ClassNotFoundException e2) {
                        a.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (java.lang.Throwable) e2);
                        i4 = 3;
                    }
                    i = i4;
                }
            }
            i = 1;
            return new defpackage.aogd(aogcVar, aogcVar2, aogcVar3, aogcVar4, provider, i);
        }
        try {
            java.security.Provider provider3 = javax.net.ssl.SSLContext.getDefault().getProvider();
            try {
                try {
                    javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS", provider3);
                    sSLContext.init(null, null, null);
                    javax.net.ssl.SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                    return new aoge(provider3, javax.net.ssl.SSLParameters.class.getMethod("setApplicationProtocols", java.lang.String[].class), javax.net.ssl.SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused2) {
                    return new defpackage.aogh(provider3);
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException | java.security.KeyManagementException | java.security.NoSuchAlgorithmException unused3) {
                java.lang.Class<?> cls2 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN");
                java.lang.Class<?> cls3 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                return new aogf(cls2.getMethod("put", javax.net.ssl.SSLSocket.class, cls3), cls2.getMethod("get", javax.net.ssl.SSLSocket.class), cls2.getMethod("remove", javax.net.ssl.SSLSocket.class), java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
            }
        } catch (java.security.NoSuchAlgorithmException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    public java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        return null;
    }

    public int c() {
        return 3;
    }

    public void d(javax.net.ssl.SSLSocket sSLSocket) {
    }

    public void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
    }
}
