package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jcn extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ defpackage.jcp a;

    public jcn(defpackage.jcp jcpVar) {
        this.a = jcpVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        aooh.f(network, "network");
        super.onAvailable(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        aooh.f(network, "network");
        aooh.f(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
        boolean zHasTransport = networkCapabilities.hasTransport(1);
        defpackage.jcp.a.b().l("com/android/dialer/beesly/impl/settings/ui/BeeslySettingsFragmentPeer$networkCallback$<anonymous>", "onCapabilitiesChanged", 210, "BeeslySettingsFragmentPeer.kt").y("New network capability is Wi-Fi?: %b", java.lang.Boolean.valueOf(zHasTransport));
        defpackage.jcp jcpVar = this.a;
        jcpVar.w.i(aoov.am(jcpVar.c, 0, new defpackage.jcm(jcpVar, zHasTransport, (aoln) null, 0), 3));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        aooh.f(network, "network");
        super.onLost(network);
        defpackage.jcp.a.b().l("com/android/dialer/beesly/impl/settings/ui/BeeslySettingsFragmentPeer$networkCallback$<anonymous>", "onLost", 199, "BeeslySettingsFragmentPeer.kt").v("Network connectivity lost");
    }
}
