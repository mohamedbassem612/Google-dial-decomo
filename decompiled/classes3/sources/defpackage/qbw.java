package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qbw implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/incall/logging/impl/datalogger/TidepodsMetricsDarkLaunchEnabledFn");
    private final aoin b;
    private final aoin c;

    public qbw(aoin aoinVar, aoin aoinVar2) {
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    public final boolean a() {
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            hgb.c(a.b(), "Tidepods-Metrics dark launch disabled due to Tidepods-Metrics being enabled", "com/android/dialer/incall/logging/impl/datalogger/TidepodsMetricsDarkLaunchEnabledFn", "isEnabled", '\"', "TidepodsMetricsDarkLaunchEnabledFn.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
            return false;
        }
        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
            return true;
        }
        hgb.c(a.b(), "Tidepods-Metrics dark launch disabled by flag", "com/android/dialer/incall/logging/impl/datalogger/TidepodsMetricsDarkLaunchEnabledFn", "isEnabled", '(', "TidepodsMetricsDarkLaunchEnabledFn.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
        return false;
    }
}
