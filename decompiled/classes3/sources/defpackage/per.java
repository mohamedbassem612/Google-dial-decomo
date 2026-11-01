package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class per implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/incall/background/impl/wear/CallBackgroundWearEnabledFn");
    private final aoin b;

    public per(aoin aoinVar) {
        aooh.f(aoinVar, "enableCallBackgroundWearKillSwitch");
        this.b = aoinVar;
    }

    public final boolean a() {
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/background/impl/wear/CallBackgroundWearEnabledFn", "isEnabled", 24, "CallBackgroundWearEnabledFn.kt").v("CallBackgroundWearEnabledFn is disabled by kill switch.");
            return false;
        }
        int i = android.os.Build.VERSION.SDK_INT;
        aimz aimzVar = a;
        if (i < 34) {
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/background/impl/wear/CallBackgroundWearEnabledFn", "isEnabled", 29, "CallBackgroundWearEnabledFn.kt").v("Unsupported SDK.");
            return false;
        }
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/background/impl/wear/CallBackgroundWearEnabledFn", "isEnabled", 32, "CallBackgroundWearEnabledFn.kt").v("CallBackgroundWearEnabledFn is enabled.");
        return true;
    }
}
