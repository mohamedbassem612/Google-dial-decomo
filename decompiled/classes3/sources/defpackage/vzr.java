package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vzr implements defpackage.vzo {
    public static final aimz a = aimz.i("com/android/dialer/wear/audiotransfer/deviceverification/impl/WearDeviceVerifierImpl");
    public static final aihd b;
    public final defpackage.aawd c;
    public final aoss d;
    public final aoss e;
    public final android.content.Context f;
    public final defpackage.vzp g;
    public final zrw h;
    public final zog i;
    public final zpz j;
    public final defpackage.voc k;
    public final apni l;

    static {
        aihd aihdVarS = aihd.s(7, 8, 15);
        aooh.e(aihdVarS, "of(...)");
        b = aihdVarS;
    }

    public vzr(defpackage.aawd aawdVar, aoss aossVar, aoss aossVar2, android.content.Context context, defpackage.vzp vzpVar, zpz zpzVar, apni apniVar, defpackage.voc vocVar, aazc aazcVar, zrw zrwVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "blockingExecutor");
        aooh.f(context, "appContext");
        aooh.f(vzpVar, "wearDeviceVerificationCache");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(apniVar, "androidJobs");
        aooh.f(vocVar, "wearAudioTransferMetricsCoordinator");
        aooh.f(aazcVar, "clock");
        this.c = aawdVar;
        this.d = aossVar;
        this.e = aossVar2;
        this.f = context;
        this.g = vzpVar;
        this.j = zpzVar;
        this.l = apniVar;
        this.k = vocVar;
        this.h = zrwVar;
        this.i = new les(this, 14);
    }

    @Override // defpackage.vzo
    public final boolean a(android.bluetooth.BluetoothDevice bluetoothDevice) {
        aooh.f(bluetoothDevice, "bluetoothDevice");
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/wear/audiotransfer/deviceverification/impl/WearDeviceVerifierImpl", "verifyAndCacheIsWearDevice", 59, "WearDeviceVerifierImpl.kt").y("Bluetooth device address: %s", bluetoothDevice.getAddress());
        java.lang.String address = bluetoothDevice.getAddress();
        aooh.e(address, "getAddress(...)");
        aooh.f(address, "bluetoothDeviceAddress");
        defpackage.vzp vzpVar = this.g;
        aosy aosyVar = (aosy) vzpVar.a.get(address);
        if (aosyVar != null) {
            if (aosyVar.x()) {
                return ((java.lang.Boolean) aosyVar.b()).booleanValue();
            }
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/audiotransfer/deviceverification/impl/WearDeviceVerifierImpl", "verifyAndCacheIsWearDevice", 78, "WearDeviceVerifierImpl.kt").y("Wear bluetooth device verification in progress.", bluetoothDevice.getAddress());
            return false;
        }
        aimzVar.b().l("com/android/dialer/wear/audiotransfer/deviceverification/impl/WearDeviceVerifierImpl", "verifyAndCacheIsWearDevice", 67, "WearDeviceVerifierImpl.kt").v("Bluetooth device address absent in cache, starting verification.");
        java.lang.String address2 = bluetoothDevice.getAddress();
        aooh.e(address2, "getAddress(...)");
        vzpVar.a(address2, b(bluetoothDevice, 1));
        return false;
    }

    public final aosy b(android.bluetooth.BluetoothDevice bluetoothDevice, int i) {
        return aoov.am(this.d, 0, new defpackage.vzq(this, bluetoothDevice, i, null), 3);
    }
}
