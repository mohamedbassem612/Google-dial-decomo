package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class swv {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioImpl");
    public final defpackage.swt b;
    public final defpackage.ajct c;
    public final defpackage.tbm d;
    public final defpackage.aoin e;
    public final defpackage.rlv f;
    public final defpackage.zpm g;
    public final defpackage.tvn h;
    public final defpackage.gou i;
    private final defpackage.ajct j;
    private final defpackage.aoin k;

    public swv(defpackage.swt swtVar, defpackage.gou gouVar, defpackage.tbm tbmVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.zpm zpmVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.tvn tvnVar, defpackage.rlv rlvVar) {
        this.b = swtVar;
        this.i = gouVar;
        this.c = ajctVar;
        this.j = ajctVar2;
        this.d = tbmVar;
        this.g = zpmVar;
        this.e = aoinVar;
        this.k = aoinVar2;
        this.h = tvnVar;
        this.f = rlvVar;
    }

    public final defpackage.ajcq a(long j, java.util.function.Consumer consumer) {
        defpackage.ahvr.J(defpackage.ahvr.H(this.i.e(), new vmm(this, j, 1), this.j), new jya(this, 9), this.c);
        return this.d.d(j, consumer);
    }

    public final defpackage.ajcq b() {
        defpackage.aoin aoinVar = this.k;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            return defpackage.ahvr.H(this.i.g(), new soi(this, 9), this.c);
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioImpl", "shouldSaveCallAudio", 365, "TidepodsRevelioImpl.java")).y("isCallScreenSavingAudioEnabled %s", aoinVar.a());
        this.f.o(defpackage.rmx.REVELIO_SAVING_AUDIO_DISABLED_BY_FLAG);
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    public final boolean c() {
        return this.d.e().isPresent();
    }
}
