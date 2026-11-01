package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agpo implements ahjr, ahjm {
    private static final aimz a = aimz.i("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedReceiver");
    private final defpackage.agpn b;

    public agpo(defpackage.agpn agpnVar) {
        this.b = agpnVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        a.b().l("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedReceiver", "onReceive", 40, "DeviceAccountsChangedReceiver.java").v("DeviceAccountsChangedReceiver#onReceive");
        defpackage.agpn agpnVar = this.b;
        if (agpnVar.c()) {
            return aiql.z((java.lang.Object) null);
        }
        agpnVar.b();
        return agpnVar.a();
    }

    public final long b() {
        return -1L;
    }

    public final /* synthetic */ long c() {
        return -1L;
    }
}
