package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uzj implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/vip/impl/VipMarqueeEnabledFn");
    private final defpackage.aoin b;

    public uzj(defpackage.aoin aoinVar) {
        this.b = aoinVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/vip/impl/VipMarqueeEnabledFn", "isEnabled", 22, "VipMarqueeEnabledFn.kt")).v("disabled by flag");
        return false;
    }
}
