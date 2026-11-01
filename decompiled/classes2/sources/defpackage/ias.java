package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ias implements defpackage.hzn {
    private static final aimz b = aimz.i("com/android/dialer/audio/impl/audiocontroller/voip/VoipDownlinkMuteController");
    public final defpackage.iag a;

    public ias(defpackage.iar iarVar) {
        this.a = iarVar;
    }

    @Override // defpackage.hzn
    public final ajcq a(boolean z) {
        b.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoipDownlinkMuteController", "setDownlinkMuted", 32, "VoipDownlinkMuteController.java").y("%s", true != z ? "unmuting" : "muting");
        return ahrv.g(dff.m(new uhq(this, z, 1))).i(new defpackage.iav(z, 1), ajbm.a);
    }

    @Override // defpackage.hzn
    public final boolean b() {
        return ((defpackage.iar) this.a).d.get();
    }
}
