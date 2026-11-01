package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zmq {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/android/dialershared/incall/core/audiomode/AudioModeController");
    private final defpackage.mgw b;
    private final j$.util.Optional c;
    private final defpackage.zpm d;
    private final defpackage.zzx e;

    public zmq(defpackage.zzx zzxVar, defpackage.mgw mgwVar, defpackage.zpm zpmVar, j$.util.Optional optional) {
        this.e = zzxVar;
        this.b = mgwVar;
        this.d = zpmVar;
        this.c = optional;
    }

    private final void f(int i) {
        pqj pqjVar = new pqj(this, 4, 4);
        j$.util.Optional optional = this.c;
        optional.isPresent();
        java.lang.Object obj = pqjVar.b;
        ((pzo) optional.get()).b(((defpackage.zmq) obj).b(), 4);
    }

    private final void g(int i) {
        pqj pqjVar = new pqj(this, i, 5);
        j$.util.Optional optional = this.c;
        optional.isPresent();
        java.lang.Object obj = pqjVar.b;
        int i2 = pqjVar.a;
        ((pzo) optional.get()).d(((defpackage.zmq) obj).b(), i2);
    }

    public final j$.util.Optional a() {
        j$.util.Optional optionalD = this.e.d();
        if (optionalD.isPresent()) {
            return j$.util.Optional.of(zmw.a(((android.telecom.InCallService) optionalD.orElseThrow()).getCallAudioState().getRoute()));
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/google/android/dialershared/incall/core/audiomode/AudioModeController", "getCallAudioRoute", (char) 129, "AudioModeController.java")).v("inCallService is empty.");
        return j$.util.Optional.empty();
    }

    public final java.lang.String b() {
        j$.util.Optional optionalH = this.d.h();
        if (true == optionalH.isPresent()) {
            optionalH = j$.util.Optional.ofNullable(((apqr) optionalH.get()).b);
        }
        return (java.lang.String) optionalH.orElse((java.lang.Object) null);
    }

    public final void c(boolean z, boolean z2) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/dialershared/incall/core/audiomode/AudioModeController", "mute", 66, "AudioModeController.java")).y("mute: %s.", java.lang.Boolean.valueOf(z));
        j$.util.Optional optionalD = this.e.d();
        if (!optionalD.isPresent()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/google/android/dialershared/incall/core/audiomode/AudioModeController", "mute", 'I', "AudioModeController.java")).v("inCallService is empty.");
            f(4);
            return;
        }
        defpackage.mgw mgwVar = this.b;
        defpackage.gus.ax(z);
        mgwVar.c();
        ((android.telecom.InCallService) optionalD.orElseThrow()).setMuted(z);
        if (z2) {
            g(10);
        }
    }

    public final void d(zmv zmvVar) {
        j$.util.Optional optional = zmvVar.b;
        if (!optional.isPresent()) {
            e(zmvVar.a);
            return;
        }
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) optional.orElseThrow();
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/dialershared/incall/core/audiomode/AudioModeController", "requestBluetoothAudio", 152, "AudioModeController.java")).y("bluetooth device: %s", bluetoothDevice);
        j$.util.Optional optionalD = this.e.d();
        if (optionalD.isPresent()) {
            defpackage.mni.aK(this.b, defpackage.mgv.IN_CALL_SERVICE_REQUEST_BLUETOOTH_AUDIO);
            uyg$.ExternalSyntheticApiModelOutline2.m((android.telecom.InCallService) optionalD.orElseThrow(), bluetoothDevice);
            g(9);
        } else {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/google/android/dialershared/incall/core/audiomode/AudioModeController", "requestBluetoothAudio", (char) 159, "AudioModeController.java")).v("inCallService is empty.");
            f(4);
        }
    }

    public final void e(zmw zmwVar) {
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1226, "AudioModeController_setAudioRoute");
        try {
            defpackage.aimz aimzVar = a;
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/dialershared/incall/core/audiomode/AudioModeController", "setAudioRoute", 101, "AudioModeController.java")).y("audio route: %s", zmwVar);
            j$.util.Optional optionalD = this.e.d();
            if (optionalD.isEmpty()) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/google/android/dialershared/incall/core/audiomode/AudioModeController", "setAudioRoute", 108, "AudioModeController.java")).v("inCallService is empty.");
                f(4);
            } else {
                defpackage.mgw mgwVar = this.b;
                int i = zmwVar.f;
                defpackage.gus.au(i);
                mgwVar.c();
                ((android.telecom.InCallService) optionalD.orElseThrow()).setAudioRoute(i);
                g(9);
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
