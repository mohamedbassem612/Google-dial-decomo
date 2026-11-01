package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vzv implements defpackage.zkc {
    private static final aimz a = aimz.i("com/android/dialer/wear/audiotransfer/switchaudio/SwitchAudioFeatureSyncListener");
    private final zms b;
    private final zmq c;

    public vzv(zms zmsVar, zmq zmqVar, aais aaisVar) {
        aooh.f(zmsVar, "audioModeProvider");
        aooh.f(aaisVar, "sanitizer");
        this.b = zmsVar;
        this.c = zmqVar;
    }

    @Override // defpackage.zkc
    public final void a(defpackage.zki zkiVar) {
        java.lang.Object obj;
        java.lang.Object next;
        aooh.f(zkiVar, "message");
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/wear/audiotransfer/switchaudio/SwitchAudioFeatureSyncListener", "onMessage", 25, "SwitchAudioFeatureSyncListener.kt").v("Received SwitchAudioOnPhone message");
        alat alatVar = zkiVar.d;
        aooh.e(alatVar, "getSharedIncallFeatureDataList(...)");
        java.util.Iterator it = alatVar.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((defpackage.zkh) next).b != 14);
        defpackage.zkh zkhVar = (defpackage.zkh) next;
        if (zkhVar != null) {
            defpackage.zkk zkkVar = zkhVar.b == 14 ? (defpackage.zkk) zkhVar.c : defpackage.zkk.a;
            aooh.e(zkkVar, "getSwitchAudioOnPhone(...)");
            defpackage.zkj zkjVarB = defpackage.zkj.b(zkkVar.b);
            if (zkjVarB == null) {
                zkjVarB = defpackage.zkj.UNRECOGNIZED;
            }
            if (zkjVarB.ordinal() != 1) {
                aimw aimwVarL = aimzVar.d().l("com/android/dialer/wear/audiotransfer/switchaudio/SwitchAudioFeatureSyncListener", "onMessage", 62, "SwitchAudioFeatureSyncListener.kt");
                defpackage.zkj zkjVarB2 = defpackage.zkj.b(zkkVar.b);
                if (zkjVarB2 == null) {
                    zkjVarB2 = defpackage.zkj.UNRECOGNIZED;
                }
                aimwVarL.y("Received SwitchAudioOnPhone message with missing or unsupported audioAction: %s", zkjVarB2);
                return;
            }
            java.lang.String str = zkkVar.c;
            aooh.e(str, "getMacAddress(...)");
            if (str.length() == 0) {
                throw new java.lang.IllegalArgumentException("MAC address is required for PULL_AUDIO_TO_WATCH action.");
            }
            java.lang.String str2 = zkkVar.c;
            aooh.e(str2, "getMacAddress(...)");
            aimzVar.b().l("com/android/dialer/wear/audiotransfer/switchaudio/SwitchAudioFeatureSyncListener", "onMessage", 39, "SwitchAudioFeatureSyncListener.kt").y("Switching audio to watch: %s", aais.aD(str2));
            aihd aihdVarB = this.b.b();
            aooh.e(aihdVarB, "getSupportedBluetoothDevices(...)");
            for (java.lang.Object obj2 : aihdVarB) {
                if (aoov.s(((android.bluetooth.BluetoothDevice) obj2).getAddress(), str2, true)) {
                    obj = obj2;
                    break;
                }
            }
            android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) obj;
            if (bluetoothDevice == null) {
                aimzVar.d().l("com/android/dialer/wear/audiotransfer/switchaudio/SwitchAudioFeatureSyncListener", "onMessage", 47, "SwitchAudioFeatureSyncListener.kt").v("No matching supported Bluetooth device found.");
                return;
            }
            defpackage.zmu zmuVar = new defpackage.zmu();
            zmuVar.a = defpackage.zmw.ROUTE_BLUETOOTH;
            zmuVar.b(j$.util.Optional.of(bluetoothDevice));
            this.c.d(zmuVar.a());
        }
    }
}
