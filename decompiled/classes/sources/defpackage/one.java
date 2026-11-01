package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class one implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/fides/impl/FidesEnabledFn");
    private final defpackage.aoin b;

    public one(defpackage.aoin aoinVar) {
        this.b = aoinVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/fides/impl/FidesEnabledFn", "isEnabled", (char) 27, "FidesEnabledFn.java")).v("disabled by flag");
        return false;
    }
}
