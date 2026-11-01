package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mnk implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/dobby/enabledfn/DobbyEnabledFn");
    private final defpackage.mnl b;
    private final defpackage.zzx c;

    public mnk(defpackage.zzx zzxVar, defpackage.mnl mnlVar) {
        this.c = zzxVar;
        this.b = mnlVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (this.c.m()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/enabledfn/DobbyEnabledFn", "isEnabled", 19, "DobbyEnabledFn.kt")).v("disabled due to direct boot");
            return false;
        }
        if (this.b.a() != defpackage.mnm.MODE_UNKNOWN) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/enabledfn/DobbyEnabledFn", "isEnabled", 23, "DobbyEnabledFn.kt")).v("disabled by flag");
        return false;
    }
}
