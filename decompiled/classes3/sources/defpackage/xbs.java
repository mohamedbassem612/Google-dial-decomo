package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xbs {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/tidepods/service/callaudiomuter/HoldForMeCallAudioMuter");
    public final android.media.AudioManager b;
    public final ajct c;
    public final ibd e;
    public final idh f;
    public final ajwr g = new ajwr();
    public j$.util.Optional d = j$.util.Optional.empty();

    public xbs(ajct ajctVar, idh idhVar, android.media.AudioManager audioManager, ibd ibdVar) {
        this.c = ajctVar;
        this.f = idhVar;
        this.b = audioManager;
        this.e = ibdVar;
    }

    public final ajcq a() {
        return this.g.e(ahqx.b(new defpackage.viv(this, 19)), this.c);
    }

    public final ajcq b(boolean z) {
        defpackage.qpu qpuVar = new defpackage.qpu(this, z, 5);
        ajct ajctVar = this.c;
        return ahrv.g(ahvr.F(qpuVar, ajctVar)).i(new icz(this, z, 5), ajctVar);
    }

    public final void c(int i, boolean z) {
        android.media.AudioManager audioManager = this.b;
        if (audioManager.isStreamMute(i) != z) {
            a.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudiomuter/HoldForMeCallAudioMuter", "setStreamMuted", 189, "HoldForMeCallAudioMuter.java").C("set muted: [stream: %d, muted: %b]", i, z);
            audioManager.adjustStreamVolume(i, true != z ? 100 : -100, 0);
        }
    }

    public final void d(int i, int i2) {
        android.media.AudioManager audioManager = this.b;
        if (audioManager.getStreamVolume(i) != i2) {
            a.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudiomuter/HoldForMeCallAudioMuter", "setStreamVolume", 182, "HoldForMeCallAudioMuter.java").z("set volume: [stream: %d, index: %d]", i, i2);
            audioManager.setStreamVolume(i, i2, 0);
        }
    }
}
