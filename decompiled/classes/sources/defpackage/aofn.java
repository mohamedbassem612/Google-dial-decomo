package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class aofn {
    public static final defpackage.aofn b;
    protected final defpackage.aogh c;
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.aofn.class.getName());
    private static final defpackage.aogh d = defpackage.aogh.b;

    static {
        defpackage.aofn aofnVar;
        java.lang.ClassLoader classLoader = defpackage.aofn.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (java.lang.ClassNotFoundException e) {
            a.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (java.lang.Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (java.lang.ClassNotFoundException e2) {
                a.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (java.lang.Throwable) e2);
                aofnVar = new defpackage.aofn(d);
            }
        }
        aofnVar = new defpackage.aofm(d);
        b = aofnVar;
    }

    public aofn(defpackage.aogh aoghVar) {
        if (aoghVar == null) {
            throw new java.lang.NullPointerException("platform");
        }
        this.c = aoghVar;
    }

    public java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        return this.c.a(sSLSocket);
    }

    public java.lang.String b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            java.lang.String strA = a(sSLSocket);
            if (strA == null) {
                throw new java.lang.RuntimeException(defpackage.a.bH(list, "TLS ALPN negotiation failed with protocols: "));
            }
            this.c.d(sSLSocket);
            return strA;
        } catch (java.lang.Throwable th) {
            this.c.d(sSLSocket);
            throw th;
        }
    }

    protected void c(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        this.c.b(sSLSocket, str, list);
    }
}
