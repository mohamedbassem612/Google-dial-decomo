package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tbj {
    public static final aimz a = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/soundplayer/RevelioInCallAudioPlayer");
    public final lgg b;
    public final ajct c;
    public final defpackage.uxy d;
    private final defpackage.afpl e;

    public tbj(lgg lggVar, ajct ajctVar, defpackage.uxy uxyVar, defpackage.afpl afplVar) {
        this.b = lggVar;
        this.c = ajctVar;
        this.d = uxyVar;
        this.e = afplVar;
    }

    public final defpackage.tbi a() {
        return (defpackage.tbi) aooc.ar(this.e.Y(), defpackage.tbi.class);
    }

    public final ajcq b(java.io.File file, int i, int i2) {
        if (i < i2) {
            return ahvr.I(this.b.c(), new defpackage.tbh(this, i, file, i2, 1), this.c);
        }
        a.b().l("com/android/dialer/revelio/impl/tidepods/impl/soundplayer/RevelioInCallAudioPlayer", "playRingingSound", 184, "RevelioInCallAudioPlayer.java").w("Reached max ringing sound num loops (%d); no longer playing ringing sound to caller", i2);
        return aiql.z(java.lang.Integer.valueOf(i));
    }
}
