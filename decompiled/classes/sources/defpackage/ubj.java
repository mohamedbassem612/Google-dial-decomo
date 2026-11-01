package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ubj {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sonic/impl/settings/SonicSettingsMddDownloader");
    public final defpackage.tzq b;
    public final defpackage.ajct c;
    private final defpackage.uav d;
    private final defpackage.agsm e;
    private final defpackage.agtc f;
    private final defpackage.aoin g;

    public ubj(defpackage.uav uavVar, defpackage.tzq tzqVar, defpackage.agsm agsmVar, defpackage.ajct ajctVar, defpackage.aoin aoinVar) {
        this.d = uavVar;
        this.b = tzqVar;
        this.e = agsmVar;
        this.c = ajctVar;
        this.f = new defpackage.agtc(new plx(this, 15), ajctVar);
        this.g = aoinVar;
    }

    public final defpackage.ajcq a() {
        return defpackage.ahrv.g(this.d.b()).i(new tct(this, 19), this.c);
    }

    public final void b() {
        if (((java.lang.Boolean) this.g.a()).booleanValue()) {
            defpackage.agsm.i(902, this.f.a(), "Sonic.Download.Failure", new java.lang.Object[0]);
        } else {
            this.e.g(this.f.a(), 60L, java.util.concurrent.TimeUnit.SECONDS);
        }
    }
}
