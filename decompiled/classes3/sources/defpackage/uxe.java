package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uxe implements ahlb {
    public static final aimz a = aimz.i("com/android/dialer/tts/api/resourceManagement/TtsResourceKeeperSynclet");
    public final rlv b;
    public final aoin c;
    public final defpackage.uxc d;
    public final zzx e;
    public final defpackage.rai f;
    private final aoss g;

    public uxe(aoss aossVar, zzx zzxVar, defpackage.rai raiVar, defpackage.uxc uxcVar, rlv rlvVar, aoin aoinVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(raiVar, "ttsSessionFactory");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enablePrewarmSynthesisModeFix");
        this.g = aossVar;
        this.e = zzxVar;
        this.f = raiVar;
        this.d = uxcVar;
        this.b = rlvVar;
        this.c = aoinVar;
    }

    public final ajcq a() {
        return aosv.F(this.g, 0, new defpackage.uxd(this, null), 3);
    }
}
