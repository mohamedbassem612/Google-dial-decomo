package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wby implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/wear/sharpie/enabledfn/SharpieWearEnabledFn");
    private final tkk b;

    public wby(tkk tkkVar) {
        this.b = tkkVar;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/sharpie/enabledfn/SharpieWearEnabledFn", "isEnabled", 21, "SharpieWearEnabledFn.kt").v("Unsupported SDK");
            return false;
        }
        if (this.b.a()) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/sharpie/enabledfn/SharpieWearEnabledFn", "isEnabled", 26, "SharpieWearEnabledFn.kt").v("disabled by Sharpie");
        return false;
    }
}
