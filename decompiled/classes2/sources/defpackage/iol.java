package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iol implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/b2cenrichedcalling/enabledfn/B2cEnrichedCallingEnabledFn");
    private final aoin b;

    public iol(aoin aoinVar) {
        aooh.f(aoinVar, "enableB2cEnrichedCallingOnPixelVTmo");
        this.b = aoinVar;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/b2cenrichedcalling/enabledfn/B2cEnrichedCallingEnabledFn", "isEnabled", 24, "B2cEnrichedCallingEnabledFn.kt").v("unsupported SDK");
            return false;
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/b2cenrichedcalling/enabledfn/B2cEnrichedCallingEnabledFn", "isEnabled", 28, "B2cEnrichedCallingEnabledFn.kt").v("disabled by flag");
        return false;
    }
}
