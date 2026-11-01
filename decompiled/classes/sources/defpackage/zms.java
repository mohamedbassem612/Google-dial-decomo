package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zms {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/dialershared/incall/core/audiomode/AudioModeProvider");
    public static final android.telecom.CallAudioState b = new android.telecom.CallAudioState(false, 1, 15);
    public final j$.util.Optional c;
    public final defpackage.ajct d;
    public final defpackage.zpz f;
    public final defpackage.zpm g;
    public final java.util.concurrent.atomic.AtomicReference e = new java.util.concurrent.atomic.AtomicReference(b);
    private final j$.util.concurrent.ConcurrentHashMap h = new j$.util.concurrent.ConcurrentHashMap();

    public zms(defpackage.zpz zpzVar, j$.util.Optional optional, defpackage.zpm zpmVar, defpackage.ajct ajctVar) {
        this.f = zpzVar;
        this.c = optional;
        this.g = zpmVar;
        this.d = ajctVar;
    }

    public final zmw a() {
        return zmw.a(((android.telecom.CallAudioState) this.e.get()).getRoute());
    }

    public final defpackage.aihd b() {
        return defpackage.aihd.o(uyg$.ExternalSyntheticApiModelOutline2.m((android.telecom.CallAudioState) this.e.get()));
    }

    public final defpackage.aihd c() {
        defpackage.acc accVar = new defpackage.acc(0);
        int supportedRouteMask = ((android.telecom.CallAudioState) this.e.get()).getSupportedRouteMask();
        if ((supportedRouteMask & 1) != 0) {
            accVar.add(zmw.a);
        }
        if ((supportedRouteMask & 2) != 0) {
            accVar.add(zmw.b);
        }
        if ((supportedRouteMask & 4) != 0) {
            accVar.add(zmw.c);
        }
        if ((supportedRouteMask & 8) != 0) {
            accVar.add(zmw.d);
        }
        if ((supportedRouteMask & 5) != 0) {
            accVar.add(zmw.e);
        }
        return defpackage.aihd.o(accVar);
    }

    public final j$.util.Optional d() {
        return j$.util.Optional.ofNullable(uyg$.ExternalSyntheticApiModelOutline2.m((android.telecom.CallAudioState) this.e.get()));
    }

    public final j$.util.Optional e(android.bluetooth.BluetoothDevice bluetoothDevice) {
        java.lang.String str = (java.lang.String) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(this.h, bluetoothDevice, new yoz(14));
        return j$.util.Objects.equals(str, "") ? j$.util.Optional.empty() : j$.util.Optional.ofNullable(str);
    }

    public final void f() {
        this.h.clear();
        this.f.a(defpackage.ajcm.a);
    }

    public final boolean g() {
        return ((android.telecom.CallAudioState) this.e.get()).isMuted();
    }
}
