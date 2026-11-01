package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aofa extends defpackage.annc {
    static final defpackage.aofz a;
    static final defpackage.aofz b;
    public static final long c;
    public static final defpackage.aoag d;
    private static final defpackage.aode o;
    public defpackage.aoag e;
    public defpackage.aoag f;
    public defpackage.aofz g;
    public long h;
    public long i;
    public int j;
    public int k;
    public int l;
    public int m;
    public defpackage.zzx n;
    private final defpackage.anzn p;
    private javax.net.ssl.SSLSocketFactory q;

    static {
        java.util.logging.Logger.getLogger(defpackage.aofa.class.getName());
        defpackage.aofy aofyVar = new defpackage.aofy(defpackage.aofz.a);
        aofyVar.a(defpackage.aofx.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, defpackage.aofx.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, defpackage.aofx.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, defpackage.aofx.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, defpackage.aofx.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, defpackage.aofx.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, defpackage.aofx.TLS_AES_128_GCM_SHA256, defpackage.aofx.TLS_AES_256_GCM_SHA384, defpackage.aofx.TLS_CHACHA20_POLY1305_SHA256);
        aofyVar.c(defpackage.aogj.TLS_1_3, defpackage.aogj.TLS_1_2);
        aofyVar.b();
        a = new defpackage.aofz(aofyVar);
        defpackage.aofy aofyVar2 = new defpackage.aofy(defpackage.aofz.a);
        aofyVar2.a(defpackage.aofx.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, defpackage.aofx.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, defpackage.aofx.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, defpackage.aofx.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, defpackage.aofx.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, defpackage.aofx.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        aofyVar2.c(defpackage.aogj.TLS_1_2);
        aofyVar2.b();
        b = new defpackage.aofz(aofyVar2);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        c = 86400000000000000L;
        defpackage.aoew aoewVar = new defpackage.aoew(0);
        o = aoewVar;
        d = new defpackage.aodg(aoewVar, 0);
        java.util.EnumSet.of(defpackage.anre.b, defpackage.anre.c);
    }

    public aofa(java.lang.String str) {
        this.n = defpackage.aodq.i;
        this.e = d;
        this.f = new defpackage.aodg(defpackage.anxo.p, 0);
        this.g = defpackage.aofn.b instanceof defpackage.aofm ? a : b;
        this.m = 1;
        this.h = Long.MAX_VALUE;
        this.i = defpackage.anxo.l;
        this.j = 65535;
        this.k = 4194304;
        this.l = Integer.MAX_VALUE;
        this.p = new defpackage.anzn(str, new defpackage.aoey(this), new defpackage.aoex(this));
    }

    @Override // defpackage.annc
    public final defpackage.anot b() {
        return this.p;
    }

    final javax.net.ssl.SSLSocketFactory h() {
        int i = this.m;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            throw new java.lang.RuntimeException("Unknown negotiation type: TLS");
        }
        try {
            javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.q;
            if (sSLSocketFactory != null) {
                return sSLSocketFactory;
            }
            javax.net.ssl.SSLSocketFactory socketFactory = javax.net.ssl.SSLContext.getInstance("Default", defpackage.aogh.b.c).getSocketFactory();
            this.q = socketFactory;
            return socketFactory;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.RuntimeException("TLS Provider failure", e);
        }
    }

    public aofa(java.lang.String str, int i) {
        this(defpackage.anxo.d(str, i));
    }
}
