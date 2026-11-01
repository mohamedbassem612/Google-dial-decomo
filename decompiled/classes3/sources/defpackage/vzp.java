package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vzp {
    private static final aimz b = aimz.i("com/android/dialer/wear/audiotransfer/deviceverification/impl/WearDeviceVerificationCache");
    public final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String str, aosy aosyVar) {
        aooh.f(str, "bluetoothDeviceAddress");
        if (this.a.putIfAbsent(str, aosyVar) != null) {
            b.b().l("com/android/dialer/wear/audiotransfer/deviceverification/impl/WearDeviceVerificationCache", "putIfAbsent", 37, "WearDeviceVerificationCache.kt").y("Cache already contains BT address (%s)", str);
        }
    }
}
