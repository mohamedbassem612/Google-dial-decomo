package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apnx extends java.net.ProxySelector {
    public static final defpackage.apnx a = new defpackage.apnx();

    @Override // java.net.ProxySelector
    public final java.util.List select(java.net.URI uri) {
        if (uri != null) {
            return ajsz.aY(java.net.Proxy.NO_PROXY);
        }
        throw new java.lang.IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(java.net.URI uri, java.net.SocketAddress socketAddress, java.io.IOException iOException) {
    }
}
