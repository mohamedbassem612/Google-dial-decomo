package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class afdt extends javax.net.ssl.SSLContextSpi {
    private javax.net.ssl.KeyManager[] a;
    private javax.net.ssl.TrustManager[] b;
    private java.security.SecureRandom c;

    @Override // javax.net.ssl.SSLContextSpi
    public final javax.net.ssl.SSLEngine engineCreateSSLEngine() {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final /* bridge */ /* synthetic */ javax.net.ssl.SSLSessionContext engineGetClientSessionContext() {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final /* bridge */ /* synthetic */ javax.net.ssl.SSLSessionContext engineGetServerSessionContext() {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final javax.net.ssl.SSLServerSocketFactory engineGetServerSocketFactory() {
        return null;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final javax.net.ssl.SSLSocketFactory engineGetSocketFactory() {
        return new defpackage.afdy(this.a, this.b, this.c);
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final void engineInit(javax.net.ssl.KeyManager[] keyManagerArr, javax.net.ssl.TrustManager[] trustManagerArr, java.security.SecureRandom secureRandom) {
        this.a = keyManagerArr;
        this.b = trustManagerArr;
        this.c = secureRandom;
    }

    @Override // javax.net.ssl.SSLContextSpi
    public final javax.net.ssl.SSLEngine engineCreateSSLEngine(java.lang.String str, int i) {
        return null;
    }
}
