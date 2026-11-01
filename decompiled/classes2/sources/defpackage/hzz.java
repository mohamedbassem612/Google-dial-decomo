package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hzz implements defpackage.hzo {
    private static final aimz a = aimz.i("com/android/dialer/audio/impl/audiocontroller/pstn/PstnMuteController");
    private final amwu b;
    private final amwu c;

    public hzz(amwu amwuVar, amwu amwuVar2) {
        this.b = amwuVar;
        this.c = amwuVar2;
    }

    @Override // defpackage.hzo
    public final defpackage.hzn c() {
        a.b().l("com/android/dialer/audio/impl/audiocontroller/pstn/PstnMuteController", "getDownlinkController", 31, "PstnMuteController.java").v("using Qualcomm downlink mute controller");
        return (defpackage.hzn) this.c.a();
    }

    @Override // defpackage.hzo
    public final defpackage.hzq d() {
        a.b().l("com/android/dialer/audio/impl/audiocontroller/pstn/PstnMuteController", "getUplinkController", 37, "PstnMuteController.java").v("using system uplink mute controller");
        return (defpackage.hzq) this.b.a();
    }
}
