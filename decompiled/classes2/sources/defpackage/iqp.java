package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iqp {
    private static final aimz a = aimz.i("com/android/dialer/beesly/enabledfn/wear/BeeslyWearEnabledFn");
    private final iqm b;
    private final aoin c;

    public iqp(iqm iqmVar, aoin aoinVar) {
        aooh.f(aoinVar, "enableBeeslyOnWearFullFunctionality");
        this.b = iqmVar;
        this.c = aoinVar;
    }

    public final boolean a() {
        boolean zBooleanValue = ((java.lang.Boolean) this.c.a()).booleanValue();
        aimz aimzVar = a;
        if (zBooleanValue) {
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/wear/BeeslyWearEnabledFn", "isWearSmartNotificationEnabled", 67, "BeeslyWearEnabledFn.kt").v("enabled by feature flag ENABLE_BEESLY_ON_WEAR_FULL_FUNCTIONALITY");
            return true;
        }
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/wear/BeeslyWearEnabledFn", "isWearSmartNotificationEnabled", 70, "BeeslyWearEnabledFn.kt").v("disabled by feature flag");
        return false;
    }

    public final boolean b() {
        if (!this.b.a()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/wear/BeeslyWearEnabledFn", "isWearSyncEnabled", 22, "BeeslyWearEnabledFn.kt").v("disabled by Beesly feature");
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 34) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/wear/BeeslyWearEnabledFn", "isWearSyncEnabled", 27, "BeeslyWearEnabledFn.kt").v("disabled below sdk version U");
            return false;
        }
        boolean zBooleanValue = ((java.lang.Boolean) this.c.a()).booleanValue();
        aimz aimzVar = a;
        if (zBooleanValue) {
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/wear/BeeslyWearEnabledFn", "isWearSyncEnabled", 35, "BeeslyWearEnabledFn.kt").v("enabled by feature flag ENABLE_BEESLY_ON_WEAR_FULL_FUNCTIONALITY");
            return true;
        }
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/wear/BeeslyWearEnabledFn", "isWearSyncEnabled", 38, "BeeslyWearEnabledFn.kt").v("disabled by feature flag");
        return false;
    }

    public final boolean c() {
        if (!b()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/wear/BeeslyWearEnabledFn", "isWearTriggerEnabled", 47, "BeeslyWearEnabledFn.kt").v("disabled by Beesly Wear sync not enabled");
            return false;
        }
        boolean zBooleanValue = ((java.lang.Boolean) this.c.a()).booleanValue();
        aimz aimzVar = a;
        if (zBooleanValue) {
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/wear/BeeslyWearEnabledFn", "isWearTriggerEnabled", 55, "BeeslyWearEnabledFn.kt").v("enabled by feature flag ENABLE_BEESLY_ON_WEAR_FULL_FUNCTIONALITY");
            return true;
        }
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/wear/BeeslyWearEnabledFn", "isWearTriggerEnabled", 58, "BeeslyWearEnabledFn.kt").v("disabled by feature flag");
        return false;
    }
}
