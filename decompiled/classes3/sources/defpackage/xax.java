package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xax implements zcr {
    private static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/tidepods/HoldForMeTidepodsInternalsEnabledFn");
    private final wyc b;

    public xax(wyc wycVar) {
        this.b = wycVar;
    }

    public final boolean a() {
        if (this.b.a()) {
            return true;
        }
        hgb.c(a.b(), "Hold For Me Tidepods internals disabled", "com/android/incallui/atlas/ui/impl/tidepods/HoldForMeTidepodsInternalsEnabledFn", "isEnabled", (char) 25, "HoldForMeTidepodsInternalsEnabledFn.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
        return false;
    }
}
