package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class way implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/wear/echo/impl/enabledfn/EchoEnabledFn");
    private final aoin b;

    public way(aoin aoinVar) {
        aooh.f(aoinVar, "enableBamFullFunctionality");
        this.b = aoinVar;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/echo/impl/enabledfn/EchoEnabledFn", "isEnabled", 23, "EchoEnabledFn.kt").v("Disabled below Android U.");
            return false;
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/echo/impl/enabledfn/EchoEnabledFn", "isEnabled", 31, "EchoEnabledFn.kt").v("Disabled by feature flag ENABLE_BAM_FULL_FUNCTIONALITY.");
        return false;
    }

    public final boolean b() {
        if (!a()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/echo/impl/enabledfn/EchoEnabledFn", "isBidirectionalSyncEnabled", 43, "EchoEnabledFn.kt").v("BidirectionalSync is disabled by EchoEnabledFn.isEnabled.");
            return false;
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/echo/impl/enabledfn/EchoEnabledFn", "isBidirectionalSyncEnabled", 51, "EchoEnabledFn.kt").v("BidirectionalSync is disabled by feature flag ENABLE_BAM_FULL_FUNCTIONALITY.");
        return false;
    }
}
