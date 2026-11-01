package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apoh extends java.net.URLStreamHandler {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ apor b;

    public apoh(apor aporVar, java.lang.String str) {
        this.a = str;
        j$.util.Objects.requireNonNull(aporVar);
        this.b = aporVar;
    }

    @Override // java.net.URLStreamHandler
    protected final int getDefaultPort() {
        java.lang.String str = this.a;
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        throw new java.lang.AssertionError();
    }

    @Override // java.net.URLStreamHandler
    protected final java.net.URLConnection openConnection(java.net.URL url) {
        return this.b.c(url);
    }

    @Override // java.net.URLStreamHandler
    protected final java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy) {
        return this.b.d(url, proxy);
    }
}
