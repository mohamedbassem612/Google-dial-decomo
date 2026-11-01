package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wae implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/wear/bam/enabledfn/BamEnabledFn");
    private final mnk b;
    private final aoin c;

    public wae(mnk mnkVar, aoin aoinVar) {
        aooh.f(aoinVar, "enableBamFullFunctionality");
        this.b = mnkVar;
        this.c = aoinVar;
    }

    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/bam/enabledfn/BamEnabledFn", "isEnabled", 25, "BamEnabledFn.kt").v("Unsupported SDK");
            return false;
        }
        if (!this.b.a()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/bam/enabledfn/BamEnabledFn", "isEnabled", 30, "BamEnabledFn.kt").v("disabled by Dobby");
            return false;
        }
        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/wear/bam/enabledfn/BamEnabledFn", "isEnabled", 35, "BamEnabledFn.kt").v("disabled by full functionality flag");
        return false;
    }
}
