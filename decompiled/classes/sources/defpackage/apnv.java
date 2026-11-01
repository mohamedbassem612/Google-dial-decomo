package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apnv implements defpackage.apnw {
    private defpackage.apnw a;
    private final defpackage.apnt b;

    public apnv(defpackage.apnt apntVar) {
        this.b = apntVar;
    }

    private final synchronized defpackage.apnw f(javax.net.ssl.SSLSocket sSLSocket) {
        if (this.a == null && this.b.a(sSLSocket)) {
            defpackage.aooh.f(sSLSocket, "sslSocket");
            java.lang.Class<?> cls = sSLSocket.getClass();
            java.lang.Class<?> superclass = cls;
            while (superclass != null && !defpackage.aooh.n(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    java.util.Objects.toString(cls);
                    throw new java.lang.AssertionError("No OpenSSLSocketImpl superclass of socket of type ".concat(java.lang.String.valueOf(cls)));
                }
            }
            defpackage.aooh.c(superclass);
            this.a = new defpackage.apnu(superclass);
        }
        return this.a;
    }

    @Override // defpackage.apnw
    public final java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        defpackage.aooh.f(sSLSocket, "sslSocket");
        defpackage.apnw apnwVarF = f(sSLSocket);
        if (apnwVarF != null) {
            return apnwVarF.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.apnw
    public final void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list, defpackage.appb appbVar) {
        defpackage.aooh.f(sSLSocket, "sslSocket");
        defpackage.aooh.f(list, "protocols");
        defpackage.apnw apnwVarF = f(sSLSocket);
        if (apnwVarF != null) {
            apnwVarF.b(sSLSocket, str, list, appbVar);
        }
    }

    @Override // defpackage.apnw
    public final boolean c() {
        return true;
    }

    @Override // defpackage.apnw
    public final boolean d(javax.net.ssl.SSLSocket sSLSocket) {
        defpackage.aooh.f(sSLSocket, "sslSocket");
        return this.b.a(sSLSocket);
    }

    @Override // defpackage.apnw
    public final /* synthetic */ void e() {
    }
}
