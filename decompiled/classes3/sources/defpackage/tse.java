package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tse extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ tsg a;

    public tse(tsg tsgVar) {
        this.a = tsgVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        aooh.f(network, "network");
        super.onAvailable(network);
        this.a.f();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        aooh.f(network, "network");
        aooh.f(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
        this.a.f();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        aooh.f(network, "network");
        super.onLost(network);
        this.a.f();
    }
}
