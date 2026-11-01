package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class qkl implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/incall/statusbarnotification/liveupdate/LiveUpdateNotificationsEnabledFn");
    private final defpackage.aoin b;

    public qkl(defpackage.aoin aoinVar) {
        defpackage.aooh.f(aoinVar, "enableLiveUpdateNotifications");
        this.b = aoinVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/statusbarnotification/liveupdate/LiveUpdateNotificationsEnabledFn", "isEnabled", 28, "LiveUpdateNotificationsEnabledFn.kt")).v("disabled by flag");
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/statusbarnotification/liveupdate/LiveUpdateNotificationsEnabledFn", "isEnabled", 32, "LiveUpdateNotificationsEnabledFn.kt")).v("disabled by major sdk");
        return false;
    }
}
