package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mnf implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/dobby/clients/dobbyproxy/wear/enabledfn/DobbyProxyEnabledFn");
    private final aoin b;
    private final aoin c;
    private final aoin d;

    public mnf(aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        aooh.f(aoinVar, "enableWinkyFullFunctionality");
        aooh.f(aoinVar2, "enableWinkyPhaseTwo");
        aooh.f(aoinVar3, "enableWinkyPhaseOne");
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/dobbyproxy/wear/enabledfn/DobbyProxyEnabledFn", "isEnabled", 25, "DobbyProxyEnabledFn.kt").v("Unsupported SDK");
            return false;
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/dobbyproxy/wear/enabledfn/DobbyProxyEnabledFn", "isEnabled", 33, "DobbyProxyEnabledFn.kt").v("enabled by feature flag ENABLE_WINKY_FULL_FUNCTIONALITY");
        } else {
            if (!((java.lang.Boolean) this.c.a()).booleanValue() || !((java.lang.Boolean) this.d.a()).booleanValue()) {
                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/dobbyproxy/wear/enabledfn/DobbyProxyEnabledFn", "isEnabled", 42, "DobbyProxyEnabledFn.kt").v("disabled by flags");
                return false;
            }
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/dobbyproxy/wear/enabledfn/DobbyProxyEnabledFn", "isEnabled", 38, "DobbyProxyEnabledFn.kt").v("enabled by winky phase one and phase two flags");
        }
        return true;
    }
}
