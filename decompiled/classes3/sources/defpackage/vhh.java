package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vhh implements defpackage.vhg {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/MailTransportImpl");
    public static final int b;
    public static final int c;
    private static final javax.net.ssl.HostnameVerifier m;
    public final android.net.Network d;
    public final java.lang.String e;
    public final int f;
    public java.net.Socket g;
    public java.io.BufferedInputStream h;
    public java.io.BufferedOutputStream i;
    public final int j;
    public java.net.InetSocketAddress k;
    public final defpackage.vgi l;
    private final android.content.Context n;
    private final boolean o;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        b = defpackage.aehk.NEXT_REQUEST_CODE;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        c = 60000;
        m = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier();
    }

    public vhh(android.content.Context context, boolean z, defpackage.vgi vgiVar, android.net.Network network, java.lang.String str, int i, int i2) {
        this.n = context;
        this.o = z;
        this.l = vgiVar;
        this.d = network;
        this.e = str;
        this.f = i;
        this.j = i2;
    }

    @Override // defpackage.vhg
    public final void a() throws java.io.IOException {
        if (!d()) {
            throw new java.io.IOException("transport is not opened");
        }
        this.i.flush();
    }

    @Override // defpackage.vhg
    public final void b() {
        try {
            a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/MailTransportImpl", "reopenTls", 232, "MailTransportImpl.java").v("open: converting to TLS socket");
            java.net.Socket socketCreateSocket = javax.net.ssl.HttpsURLConnection.getDefaultSSLSocketFactory().createSocket(this.g, this.k.getHostName(), this.k.getPort(), true);
            this.g = socketCreateSocket;
            java.lang.String str = this.e;
            javax.net.ssl.SSLSocket sSLSocket = (javax.net.ssl.SSLSocket) socketCreateSocket;
            sSLSocket.startHandshake();
            javax.net.ssl.SSLSession session = sSLSocket.getSession();
            if (session == null) {
                throw new defpackage.vcx("Cannot verify SSL socket without session", defpackage.vbw.NETWORK_CONNECTION_CANNOT_ESTABLISH_SSL_SESSION);
            }
            if (!m.verify(str, session)) {
                throw new defpackage.vcx(defpackage.vbw.NETWORK_CONNECTION_SSL_INVALID_HOST_NAME, "Certificate hostname not useable for server: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(session.getPeerPrincipal()))));
            }
            this.g.setSoTimeout(c);
            this.h = new java.io.BufferedInputStream(this.g.getInputStream(), 1024);
            this.i = new java.io.BufferedOutputStream(this.g.getOutputStream(), 512);
        } catch (java.io.IOException e) {
            throw new defpackage.vcx(e.getMessage(), defpackage.vbw.NETWORK_CONNECTION_GENERIC_IMAP_IOE);
        }
    }

    @Override // defpackage.vhg
    public final void c(java.lang.String str) {
        akzc.v(str, java.nio.charset.StandardCharsets.US_ASCII).m(this.i);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
        return new defpackage.vhh(this.n, this.o, this.l, this.d, this.e, this.f, this.j);
    }

    @Override // defpackage.vhg
    public final boolean d() {
        java.net.Socket socket;
        return (this.h == null || this.i == null || (socket = this.g) == null || !socket.isConnected() || this.g.isClosed()) ? false : true;
    }

    public final java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.net.Network network = this.d;
            java.lang.String str = this.e;
            java.net.InetAddress[] allByName = network.getAllByName(str);
            if (allByName.length == 0) {
                throw new defpackage.vcx(a.bk(str, "Host name ", "cannot be resolved on designated network"), defpackage.vbw.NETWORK_CONNECTION_GENERIC_IMAP_IOE);
            }
            for (java.net.InetAddress inetAddress : allByName) {
                arrayList.add(new java.net.InetSocketAddress(inetAddress, this.f));
            }
            return arrayList;
        } catch (java.net.UnknownHostException e) {
            throw new defpackage.vcx(e.getMessage(), defpackage.vbw.NETWORK_CONNECTION_CANNOT_RESOLVE_HOST);
        }
    }

    public final void f(java.net.SocketAddress socketAddress) {
        a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/MailTransportImpl", "openSecureConnection", 252, "MailTransportImpl.java").v("MailTransport.openSecureConnection enter");
        try {
            int iAR = a.aR(this.l.a.t);
            if (iAR == 0) {
                iAR = 1;
            }
            int i = iAR - 2;
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance((i == -1 || i == 0 || i == 1) ? "TLSv1.2" : "TLSv1.3");
            sSLContext.init(null, new defpackage.vhm[]{new defpackage.vhm(this.o)}, null);
            java.net.Socket socketCreateSocket = sSLContext.getSocketFactory().createSocket();
            this.g = socketCreateSocket;
            socketCreateSocket.connect(socketAddress, b);
            this.g.setSoTimeout(c);
        } catch (java.io.IOException | java.security.GeneralSecurityException e) {
            throw new defpackage.vcx(e.getMessage(), defpackage.vbw.NETWORK_CONNECTION_GENERIC_IMAP_IOE);
        }
    }
}
