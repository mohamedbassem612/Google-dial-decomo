package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class khr implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/halo/impl/enabledfn/HaloEnabledFn");
    private final defpackage.aoin b;
    private final defpackage.aoin c;
    private final defpackage.aoin d;

    public khr(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableHalo");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableHaloPostLaunchFix");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("enableRingDirectory");
        }
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/halo/impl/enabledfn/HaloEnabledFn", "isEnabled", 28, "HaloEnabledFn.kt")).v("disabled by flag");
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 36) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/halo/impl/enabledfn/HaloEnabledFn", "isEnabled", 33, "HaloEnabledFn.kt")).v("disabled by major sdk");
            return false;
        }
        if (defpackage.a.D() >= 3600001) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/halo/impl/enabledfn/HaloEnabledFn", "isEnabled", 38, "HaloEnabledFn.kt")).v("disabled by minor sdk");
        return false;
    }

    public final boolean b() {
        if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/halo/impl/enabledfn/HaloEnabledFn", "enablePostLaunchFix", 48, "HaloEnabledFn.kt")).v("disabled by enableHalo");
            return false;
        }
        if (!((java.lang.Boolean) this.c.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/halo/impl/enabledfn/HaloEnabledFn", "enablePostLaunchFix", 52, "HaloEnabledFn.kt")).v("disabled by enableHaloPostLaunchFix");
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 37) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/halo/impl/enabledfn/HaloEnabledFn", "enablePostLaunchFix", 56, "HaloEnabledFn.kt")).v("disabled by sdk");
        return false;
    }

    public final boolean c() {
        if (((java.lang.Boolean) this.d.a()).booleanValue()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/halo/impl/enabledfn/HaloEnabledFn", "enableRingDirectory", 66, "HaloEnabledFn.kt")).v("disabled by enableRingDirectory");
        return false;
    }
}
