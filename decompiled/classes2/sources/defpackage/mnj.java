package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mnj implements zcr {
    public static final aimz a = aimz.i("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn");
    public final aoin b;
    public final aoin c;
    private final aoin d;
    private final aoin f;
    private final aoin g;

    public mnj(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5) {
        aooh.f(aoinVar, "enableWinkyFullFunctionality");
        aooh.f(aoinVar2, "enableWinkyPhaseOne");
        aooh.f(aoinVar3, "enableWinkyPhaseTwo");
        this.b = aoinVar;
        this.d = aoinVar2;
        this.f = aoinVar3;
        this.c = aoinVar4;
        this.g = aoinVar5;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 37) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isEnabled", 30, "WinkyEnabledFn.kt").v("Unsupported SDK");
            return false;
        }
        if (((java.lang.Boolean) this.g.a()).booleanValue()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isEnabled", 38, "WinkyEnabledFn.kt").v("disabled: Pixel device check failed (Pixel 8a or older)");
            return false;
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isEnabled", 46, "WinkyEnabledFn.kt").v("enabled by feature flag ENABLE_WINKY_FULL_FUNCTIONALITY");
        } else {
            boolean zBooleanValue = ((java.lang.Boolean) this.d.a()).booleanValue();
            aimz aimzVar = a;
            if (!zBooleanValue) {
                aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isEnabled", 55, "WinkyEnabledFn.kt").v("disabled by flags");
                return false;
            }
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isEnabled", 51, "WinkyEnabledFn.kt").v("enabled by feature flag ENABLE_WINKY_PHASE_ONE");
        }
        return true;
    }

    public final boolean b() {
        if (!a()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isPhaseTwoEnabled", 62, "WinkyEnabledFn.kt").v("disabled since Winky Phase One is not enabled");
            return false;
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isPhaseTwoEnabled", 70, "WinkyEnabledFn.kt").v("enabled by feature flag ENABLE_WINKY_FULL_FUNCTIONALITY");
        } else {
            boolean zBooleanValue = ((java.lang.Boolean) this.f.a()).booleanValue();
            aimz aimzVar = a;
            if (!zBooleanValue) {
                aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isPhaseTwoEnabled", 79, "WinkyEnabledFn.kt").v("Phase two is disabled by flags");
                return false;
            }
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/clients/winky/enabledfn/WinkyEnabledFn", "isPhaseTwoEnabled", 75, "WinkyEnabledFn.kt").v("enabled by feature flag ENABLE_WINKY_PHASE_TWO");
        }
        return true;
    }
}
