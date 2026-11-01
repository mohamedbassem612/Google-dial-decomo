package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ibp implements zmp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public ibp(defpackage.ibk ibkVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ibkVar);
        this.a = ibkVar;
    }

    public final void el(android.telecom.CallAudioState callAudioState) {
        if (this.$cid == 0) {
            ((defpackage.ibs) this.a).b();
            return;
        }
        if (callAudioState.isMuted()) {
            defpackage.ibk ibkVar = (defpackage.ibk) this.a;
            if (!ibkVar.j.isPresent() || ((defpackage.ibl) ibkVar.j.orElseThrow()).b) {
                return;
            }
            defpackage.ibk.a.b().l("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer$1", "onAudioStateChanged", 79, "CallAudioPlayer.java").v("call muted, canceling playback");
            agsm.i(androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, ibkVar.l.e(ahqx.b(new defpackage.ibg(this, 3)), ibkVar.d), "playback cancellation failed", new java.lang.Object[0]);
        }
    }

    public /* synthetic */ ibp(defpackage.ibs ibsVar, int i) {
        this.$cid = i;
        this.a = ibsVar;
    }
}
