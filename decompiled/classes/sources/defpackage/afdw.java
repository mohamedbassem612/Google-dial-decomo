package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afdw extends java.security.Provider {
    public afdw(byte[] bArr) {
        super("Ssl_Guard", 1.01d, "Makes SSL Connections wait for security patches.");
        java.lang.String name = defpackage.afdt.class.getName();
        put("SSLContext.SSL", name);
        put("SSLContext.SSLv3", name);
        put("SSLContext.TLS", name);
        put("SSLContext.TLSv1", name);
        put("SSLContext.TLSv1.1", name);
        put("SSLContext.TLSv1.2", name);
        put("SSLContext.Default", name);
    }

    public afdw() {
        throw null;
    }
}
