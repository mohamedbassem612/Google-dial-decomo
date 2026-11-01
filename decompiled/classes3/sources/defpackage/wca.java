package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wca implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/wear/siesta/enabledfn/SiestaEnabledFn");
    private final mnk b;

    public wca(mnk mnkVar) {
        this.b = mnkVar;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/siesta/enabledfn/SiestaEnabledFn", "isEnabled", 15, "SiestaEnabledFn.kt").v("Unsupported SDK");
            return false;
        }
        if (this.b.a()) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/siesta/enabledfn/SiestaEnabledFn", "isEnabled", 20, "SiestaEnabledFn.kt").v("disabled by Dobby");
        return false;
    }
}
