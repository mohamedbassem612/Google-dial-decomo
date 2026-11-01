package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adsp {
    public static final aimz a = aimz.i("com/google/android/libraries/micore/telephony/common/uplinkaudioplayback/UplinkAudioPlaybackManagerImpl");
    public final adqu b;
    public j$.util.Optional c = j$.util.Optional.empty();
    public aesg d;
    private final ajct e;
    private boolean f;

    public adsp(ajct ajctVar) {
        this.e = ajctVar;
        this.b = new adqu(ajctVar);
    }

    private final synchronized boolean f() {
        return this.c.isPresent();
    }

    public final synchronized ajcq a(java.io.File file, defpackage.adsm adsmVar, adqu adquVar, int i) {
        if (!e()) {
            throw new defpackage.adso("UplinkAudioPlaybackManager isn't running");
        }
        return this.b.a(new defpackage.adsn(this.d, file, adsmVar, adquVar, i), (java.lang.Object) null);
    }

    public final synchronized ajcq b() {
        return c(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized ajcq c(ajct ajctVar) {
        ajcq ajcqVarZ;
        if (f()) {
            a.d().l("com/google/android/libraries/micore/telephony/common/uplinkaudioplayback/UplinkAudioPlaybackManagerImpl", "shutdown", 69, "UplinkAudioPlaybackManagerImpl.java").v("Shutdown called but UplinkAudioPlaybackManagerImpl is already shutting down");
            ajcqVarZ = this.c.get();
        } else if (this.f) {
            this.f = false;
            a.b().l("com/google/android/libraries/micore/telephony/common/uplinkaudioplayback/UplinkAudioPlaybackManagerImpl", "shutdown", 79, "UplinkAudioPlaybackManagerImpl.java").v("shutdown(): Shutting down uplink audio playback manager");
            j$.util.Optional optionalOf = j$.util.Optional.of(ajctVar.eU(new defpackage.zpk(this, 14)));
            this.c = optionalOf;
            ajcqVarZ = optionalOf.get();
        } else {
            a.d().l("com/google/android/libraries/micore/telephony/common/uplinkaudioplayback/UplinkAudioPlaybackManagerImpl", "shutdown", 75, "UplinkAudioPlaybackManagerImpl.java").v("Shutdown called but UplinkAudioPlaybackManagerImpl isn't running");
            ajcqVarZ = aiql.z((java.lang.Object) null);
        }
        return ajcqVarZ;
    }

    public final synchronized void d(defpackage.adph adphVar) {
        if (f()) {
            throw new defpackage.adso("start() called but UplinkAudioPlaybackManagerImpl is currently shutting down");
        }
        if (this.f) {
            a.d().l("com/google/android/libraries/micore/telephony/common/uplinkaudioplayback/UplinkAudioPlaybackManagerImpl", "start", 50, "UplinkAudioPlaybackManagerImpl.java").v("start() called but UplinkAudioPlaybackManagerImpl is already running");
            return;
        }
        this.f = true;
        this.d = new defpackage.adsj(adphVar);
        a.b().l("com/google/android/libraries/micore/telephony/common/uplinkaudioplayback/UplinkAudioPlaybackManagerImpl", "start", 57, "UplinkAudioPlaybackManagerImpl.java").v("start(): starting uplink audio playback manager");
    }

    public final synchronized boolean e() {
        return this.f && !f();
    }
}
