package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class whi implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/xatu/impl/XatuShowAheadEnabledFn");
    private final aoin b;
    private final whh c;

    public whi(whh whhVar, aoin aoinVar) {
        this.c = whhVar;
        this.b = aoinVar;
    }

    public final boolean a() {
        if (this.c.a() && ((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        hgb.c(a.b(), "Xatu Show Ahead disabled", "com/android/dialer/xatu/impl/XatuShowAheadEnabledFn", "isEnabled", ' ', "XatuShowAheadEnabledFn.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
        return false;
    }
}
