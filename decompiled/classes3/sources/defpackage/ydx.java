package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ydx extends android.net.ConnectivityManager.NetworkCallback {
    public final /* synthetic */ defpackage.aeok a;

    public ydx(defpackage.aeok aeokVar) {
        j$.util.Objects.requireNonNull(aeokVar);
        this.a = aeokVar;
    }

    private final void a(boolean z) {
        defpackage.ygc.h(new gql(this, z, 10));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        a(false);
    }
}
