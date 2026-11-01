package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class swq implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioEnabledFn");
    private final defpackage.lbw b;
    private final defpackage.aoin c;
    private final defpackage.zzx d;

    public swq(defpackage.lbw lbwVar, defpackage.zzx zzxVar, defpackage.aoin aoinVar) {
        this.b = lbwVar;
        this.d = zzxVar;
        this.c = aoinVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (this.d.m()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioEnabledFn", "isEnabled", '%', "TidepodsRevelioEnabledFn.java")).v("tidepods revelio disabled due to direct boot");
            return false;
        }
        if (!((java.lang.Boolean) this.c.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioEnabledFn", "isEnabled", '*', "TidepodsRevelioEnabledFn.java")).v("tidepods revelio disabled by flag");
            return false;
        }
        if (this.b.a()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioEnabledFn", "isEnabled", '/', "TidepodsRevelioEnabledFn.java")).v("tidepods revelio disabled by CallScreenI18nTidepods");
        return false;
    }
}
