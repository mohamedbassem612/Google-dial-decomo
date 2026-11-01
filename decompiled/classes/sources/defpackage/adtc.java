package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class adtc extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ defpackage.adth a;

    public adtc(defpackage.adth adthVar) {
        j$.util.Objects.requireNonNull(adthVar);
        this.a = adthVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        this.a.g();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        this.a.g();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        this.a.g();
    }
}
