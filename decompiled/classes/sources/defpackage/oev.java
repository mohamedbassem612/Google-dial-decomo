package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oev implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/expresso/enablefn/ExpressoEnabledFn");
    private final defpackage.aoin b;
    private final defpackage.zzx c;

    public oev(defpackage.zzx zzxVar, defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableUnifiedExpresso");
        }
        this.c = zzxVar;
        this.b = aoinVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (this.c.m()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/enablefn/ExpressoEnabledFn", "isEnabled", 23, "ExpressoEnabledFn.kt")).v("disabled due to direct boot");
            return false;
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/expresso/enablefn/ExpressoEnabledFn", "isEnabled", 28, "ExpressoEnabledFn.kt")).v("disabled by flag");
        return false;
    }
}
