package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wch implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/wear/simulatedringing/enabledfn/SimulatedRingingEnabledFn");
    private final aoin b;

    public wch(aoin aoinVar) {
        aooh.f(aoinVar, "dialerWearSimulatedRingingControlEnabled");
        this.b = aoinVar;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 37) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/simulatedringing/enabledfn/SimulatedRingingEnabledFn", "isEnabled", 22, "SimulatedRingingEnabledFn.kt").v("disabled below Cinnamon Bun");
            return false;
        }
        boolean zBooleanValue = ((java.lang.Boolean) this.b.a()).booleanValue();
        aimz aimzVar = a;
        if (zBooleanValue) {
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/simulatedringing/enabledfn/SimulatedRingingEnabledFn", "isEnabled", 31, "SimulatedRingingEnabledFn.kt").v("enabled by feature flag");
            return true;
        }
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/simulatedringing/enabledfn/SimulatedRingingEnabledFn", "isEnabled", 27, "SimulatedRingingEnabledFn.kt").v("disabled by feature flag");
        return false;
    }
}
