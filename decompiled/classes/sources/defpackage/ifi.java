package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ifi {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/audioplayback/impl/ui/AudioDevices");
    public final android.content.Context b;
    public final defpackage.aolr c;
    public final defpackage.zrw d;
    public final android.bluetooth.BluetoothManager e;

    public ifi(android.content.Context context, defpackage.aolr aolrVar, defpackage.zrw zrwVar, android.bluetooth.BluetoothManager bluetoothManager) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        this.b = context;
        this.c = aolrVar;
        this.d = zrwVar;
        this.e = bluetoothManager;
    }

    public static final int a(int i) {
        if (i == 1) {
            return 2131231547;
        }
        if (i == 2) {
            return 2131231671;
        }
        if (i != 3 && i != 4) {
            if (i == 7 || i == 26) {
                return 2131231322;
            }
            if (i != 22) {
                if (i == 23) {
                    return 2131231454;
                }
                throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "Unsupported audio device type: "));
            }
        }
        return 2131231453;
    }
}
