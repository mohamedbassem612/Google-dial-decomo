package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nvx implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveEnabledFn");
    private final aoin b;

    public nvx(aoin aoinVar) {
        aooh.f(aoinVar, "enableSecondCallOriginationOnSecondSim");
        this.b = aoinVar;
    }

    public final boolean a() {
        if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveEnabledFn", "isEnabled", 23, "DualSimDualActiveEnabledFn.kt").v("disabled by flag");
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveEnabledFn", "isEnabled", 28, "DualSimDualActiveEnabledFn.kt").v("unsupported SDK");
        return false;
    }
}
