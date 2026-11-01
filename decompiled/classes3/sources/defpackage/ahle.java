package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahle implements defpackage.ahld {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public ahle(android.content.Context context, android.net.ConnectivityManager connectivityManager, int i) {
        this.$cid = i;
        if (context.checkPermission("android.permission.INTERNET", android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
            ahvr.bZ(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0, "An app using the NETWORK_CONNECTED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }

    @Override // defpackage.ahld
    public final boolean a() {
        int i = this.$cid;
        if (i != 0) {
            java.lang.Object obj = this.a;
            if (i == 1) {
                return ((android.os.BatteryManager) obj).isCharging();
            }
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) obj;
            boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (zIsActiveNetworkMetered || activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getDetailedState() == android.net.NetworkInfo.DetailedState.BLOCKED) {
                return false;
            }
        } else {
            android.net.NetworkInfo activeNetworkInfo2 = ((android.net.ConnectivityManager) this.a).getActiveNetworkInfo();
            if (activeNetworkInfo2 == null || !activeNetworkInfo2.isConnected() || activeNetworkInfo2.getDetailedState() == android.net.NetworkInfo.DetailedState.BLOCKED) {
                return false;
            }
        }
        return true;
    }

    public ahle(android.content.Context context, int i) {
        this.$cid = i;
        this.a = (android.os.BatteryManager) context.getSystemService("batterymanager");
    }

    public ahle(android.content.Context context, android.net.ConnectivityManager connectivityManager, int i, byte[] bArr) {
        this.$cid = i;
        if (context.checkPermission("android.permission.INTERNET", android.os.Process.myPid(), android.os.Process.myUid()) == 0) {
            ahvr.bZ(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0, "An app using the NETWORK_UNMETERED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }
}
