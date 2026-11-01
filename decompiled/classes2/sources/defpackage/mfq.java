package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mfq {
    private static final aimz a = aimz.i("com/android/dialer/datasync/impl/ServiceIntegrationClientEnabledFnImpl");
    private final aoin b;

    public mfq(aoin aoinVar) {
        aooh.f(aoinVar, "enableBeeslyOnWearFullFunctionality");
        this.b = aoinVar;
    }

    public final boolean a() {
        java.lang.Object objA = this.b.a();
        java.lang.Boolean bool = (java.lang.Boolean) objA;
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/datasync/impl/ServiceIntegrationClientEnabledFnImpl", "isEnabled$<anonymous>", 27, "ServiceIntegrationClientEnabledFnImpl.kt").y("isEnabled by feature flag ENABLE_BEESLY_ON_WEAR_FULL_FUNCTIONALITY: %b", bool);
        aooh.e(objA, "also(...)");
        return bool.booleanValue();
    }
}
