package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class waf implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/wear/bam/phaseone/impl/BamPhaseOneEnabledFn");
    private final mnk b;
    private final aoin c;

    public waf(mnk mnkVar, aoin aoinVar) {
        aooh.f(aoinVar, "enableBamFullFunctionality");
        this.b = mnkVar;
        this.c = aoinVar;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/bam/phaseone/impl/BamPhaseOneEnabledFn", "isEnabled", 25, "BamPhaseOneEnabledFn.kt").v("Unsupported SDK");
            return false;
        }
        if (!this.b.a()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/bam/phaseone/impl/BamPhaseOneEnabledFn", "isEnabled", 30, "BamPhaseOneEnabledFn.kt").v("disabled by Dobby");
            return false;
        }
        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/bam/phaseone/impl/BamPhaseOneEnabledFn", "isEnabled", 35, "BamPhaseOneEnabledFn.kt").v("disabled by full functionality flag");
        return false;
    }
}
