package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mhu implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/defaultdialer/impl/DefaultDialerEnabledFn");
    private final defpackage.aoin b;

    public mhu(defpackage.aoin aoinVar) {
        this.b = aoinVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/defaultdialer/impl/DefaultDialerEnabledFn", "isEnabled", ' ', "DefaultDialerEnabledFn.java")).v("disabled by defaultDialer flag");
        return false;
    }
}
