package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uiq implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/spam/status/incall/impl/SpamStatusInCallEnableFn");
    private final zzx b;

    public uiq(zzx zzxVar) {
        this.b = zzxVar;
    }

    public final boolean a() {
        if (!this.b.m()) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spam/status/incall/impl/SpamStatusInCallEnableFn", "isEnabled", 18, "SpamStatusInCallEnableFn.kt").v("SpamStatus in call disabled in direct boot");
        return false;
    }
}
