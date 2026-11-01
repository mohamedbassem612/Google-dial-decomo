package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apub extends org.chromium.net.Proxy.HttpConnectCallback.Request {
    private final android.net.http.Proxy$HttpConnectCallback.Request a;

    public apub(android.net.http.Proxy$HttpConnectCallback.Request request) {
        if (!org.chromium.net.AndroidProxyOptions.areProxyApisEnabled()) {
            throw new java.lang.AssertionError("AndroidProxy requires the proxy APIs to be enabled");
        }
        this.a = request;
    }

    @Override // org.chromium.net.Proxy.HttpConnectCallback.Request, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // org.chromium.net.Proxy.HttpConnectCallback.Request
    public final void proceed(java.util.List list) {
        this.a.proceed(list);
    }
}
