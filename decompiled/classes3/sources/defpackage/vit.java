package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vit extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ dsd a;
    final /* synthetic */ viu b;

    public vit(viu viuVar, dsd dsdVar) {
        this.a = dsdVar;
        j$.util.Objects.requireNonNull(viuVar);
        this.b = viuVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        viu viuVar = this.b;
        if (((java.lang.Boolean) viuVar.b.a()).booleanValue()) {
            viu.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkCallbackImpl$1", "onAvailable", 58, "VvmNetworkCallbackImpl.java").v("Waiting for IPV4 address...");
            viuVar.c.h(mgv.ac, aike.a, gus.aw("waiting"), 2);
        } else {
            viu.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkCallbackImpl$1", "onAvailable", 67, "VvmNetworkCallbackImpl.java").v("Not waiting for IPV4 address...");
            viuVar.c.h(mgv.ac, aike.a, gus.aw("available"), 2);
            viu.a(network, this.a);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
        if (((java.lang.Boolean) this.b.b.a()).booleanValue()) {
            if (linkProperties != null) {
                try {
                    if (linkProperties.isReachable(java.net.InetAddress.getByName("8.8.8.8"))) {
                        viu.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkCallbackImpl$1", "onLinkPropertiesChanged", 118, "VvmNetworkCallbackImpl.java").v("IPV4 address available, stop waiting");
                        viu.a(network, this.a);
                        return;
                    }
                } catch (java.lang.IllegalArgumentException | java.lang.NoClassDefFoundError | java.net.UnknownHostException unused) {
                    viu.a.d().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkCallbackImpl$1", "onLinkPropertiesChanged", 114, "VvmNetworkCallbackImpl.java").v("Could not parse address");
                    return;
                }
            }
            viu.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkCallbackImpl$1", "onLinkPropertiesChanged", 121, "VvmNetworkCallbackImpl.java").v("ignoring non IPV4 address");
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        viu.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkCallbackImpl$1", "onLost", 79, "VvmNetworkCallbackImpl.java").v("onLost");
        this.b.c.h(mgv.ac, aike.a, gus.aw("lost"), 2);
        viu.b("lost", this.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        viu.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkCallbackImpl$1", "onUnavailable", 92, "VvmNetworkCallbackImpl.java").v("onUnavailable");
        this.b.c.h(mgv.ac, aike.a, gus.aw("timeout"), 2);
        viu.b("timeout", this.a);
    }
}
