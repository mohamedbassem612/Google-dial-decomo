package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gvq extends android.net.ConnectivityManager.NetworkCallback {
    public static final defpackage.gvq a = new defpackage.gvq();
    public static final java.lang.Object b = new java.lang.Object();
    public static final java.util.Map c = new java.util.LinkedHashMap();
    public static android.net.NetworkCapabilities d;
    public static boolean e;
    public static java.lang.Boolean f;

    private static final void b() {
        java.util.ArrayList<aoiu> arrayList = new java.util.ArrayList();
        synchronized (b) {
            if (e && f != null) {
                for (java.util.Map.Entry entry : c.entrySet()) {
                    arrayList.add(new aoiu((aonj) entry.getKey(), a.a((android.net.NetworkRequest) entry.getValue(), d) ? defpackage.gvm.a : new defpackage.gvn(7)));
                }
                for (aoiu aoiuVar : arrayList) {
                    ((aonj) aoiuVar.a).a((defpackage.hgt) aoiuVar.b);
                }
                return;
            }
            gsh.a().c(gvs.a, "Not dispatching constraint state yet: isBlocked=" + f + ", capabilitiesInitialized=" + e);
        }
    }

    public final boolean a(android.net.NetworkRequest networkRequest, android.net.NetworkCapabilities networkCapabilities) {
        java.lang.Boolean bool = f;
        aooh.c(bool);
        return !bool.booleanValue() && baa$.ExternalSyntheticApiModelOutline1.m(networkRequest, networkCapabilities);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(android.net.Network network, boolean z) {
        aooh.f(network, "network");
        gsh.a().c(gvs.a, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (b) {
            java.lang.Boolean bool = f;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            if (aooh.n(bool, boolValueOf)) {
                return;
            }
            f = boolValueOf;
            b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        aooh.f(network, "network");
        aooh.f(networkCapabilities, "networkCapabilities");
        gsh.a().c(gvs.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        aooh.f(network, "network");
        gsh.a().c(gvs.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            java.util.Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((aonj) it.next()).a(new defpackage.gvn(7));
            }
        }
    }
}
