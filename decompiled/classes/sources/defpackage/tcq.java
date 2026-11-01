package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tcq implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/rtt/settings/impl/RttSettingsEnabledFn");
    private final defpackage.aoin b;

    public tcq(defpackage.aoin aoinVar) {
        this.b = aoinVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (!android.os.Build.ID.startsWith("QQ1")) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/rtt/settings/impl/RttSettingsEnabledFn", "isEnabled", ' ', "RttSettingsEnabledFn.java")).v("qpr2 build or higher, enabling");
            return true;
        }
        if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
            return false;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/rtt/settings/impl/RttSettingsEnabledFn", "isEnabled", '%', "RttSettingsEnabledFn.java")).v("enabled by flag");
        return true;
    }
}
