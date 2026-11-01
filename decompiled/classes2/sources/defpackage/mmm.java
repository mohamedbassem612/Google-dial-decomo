package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mmm implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/display/settings/impl/DisplayOptionsSettingsEnabledFn");
    private final zzx b;

    public mmm(zzx zzxVar) {
        this.b = zzxVar;
    }

    public final boolean a() {
        boolean zM = this.b.m();
        aimz aimzVar = a;
        if (zM) {
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/display/settings/impl/DisplayOptionsSettingsEnabledFn", "isEnabled", 19, "DisplayOptionsSettingsEnabledFn.kt").v("directboot; disabled");
            return false;
        }
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/display/settings/impl/DisplayOptionsSettingsEnabledFn", "isEnabled", 22, "DisplayOptionsSettingsEnabledFn.kt").v("enabled");
        return true;
    }
}
