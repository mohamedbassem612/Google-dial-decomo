package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class omt implements zcr {
    private final omv a;

    public omt(omv omvVar) {
        this.a = omvVar;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            omv.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatEnabledFn", "shouldBindCallLogModules", 26, "FermatEnabledFn.kt").v("unsupported SDK");
            return false;
        }
        if (!this.a.b.m()) {
            return true;
        }
        omv.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fermat/enabledfn/FermatEnabledFn", "shouldBindCallLogModules", 30, "FermatEnabledFn.kt").v("disabled in direct boot mode");
        return false;
    }
}
