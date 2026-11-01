package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class meo implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/darpa/impl/DarpaEnabledFn");
    private final defpackage.zzx b;

    public meo(defpackage.zzx zzxVar) {
        this.b = zzxVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (this.b.m()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/darpa/impl/DarpaEnabledFn", "isEnabled", 20, "DarpaEnabledFn.kt")).v("disabled in direct boot");
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/darpa/impl/DarpaEnabledFn", "isEnabled", 24, "DarpaEnabledFn.kt")).v("unsupported SDK");
        return false;
    }
}
