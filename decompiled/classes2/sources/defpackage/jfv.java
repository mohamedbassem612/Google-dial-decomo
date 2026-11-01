package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jfv implements defpackage.jfg {
    private static final aimz a = aimz.i("com/android/dialer/beesly/impl/v2/service/session/BeeslyBluetoothAudioMuter");
    private final android.media.AudioManager b;
    private final zmq c;
    private boolean d;

    public jfv(android.media.AudioManager audioManager, zmq zmqVar) {
        this.b = audioManager;
        this.c = zmqVar;
    }

    private final void a() {
        if (this.d) {
            a.b().l("com/android/dialer/beesly/impl/v2/service/session/BeeslyBluetoothAudioMuter", "unmuteBluetoothAudio", 52, "BeeslyBluetoothAudioMuter.kt").v("unmuting bluetooth audio");
            this.b.adjustStreamVolume(6, 100, 0);
            this.d = false;
        }
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object f(aoln aolnVar) {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final java.lang.Object g(defpackage.jfl jflVar, aoln aolnVar) {
        a();
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final java.lang.Object h(aoln aolnVar) {
        j$.util.Optional optionalA = this.c.a();
        aooh.e(optionalA, "getCallAudioRoute(...)");
        zmw zmwVar = (zmw) aooh.q(optionalA);
        if (zmwVar != null && zmwVar == zmw.b) {
            android.media.AudioManager audioManager = this.b;
            if (!audioManager.isStreamMute(6)) {
                a.b().l("com/android/dialer/beesly/impl/v2/service/session/BeeslyBluetoothAudioMuter", "muteBluetoothAudio", 43, "BeeslyBluetoothAudioMuter.kt").v("muting bluetooth audio");
                audioManager.adjustStreamVolume(6, -100, 0);
                this.d = true;
            }
        }
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object i(aoln aolnVar) {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object q() {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object r() {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object s() {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object t(defpackage.jfo jfoVar) {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final java.lang.Object u() {
        a();
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object v() {
        return aojh.a;
    }
}
