package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uyi implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/videocallintro/impl/VideoCallIntroEnabledFn");
    private final aoin b;

    public uyi(aoin aoinVar) {
        this.b = aoinVar;
    }

    public final boolean a() {
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        hgb.c(a.b(), "disabled by flag", "com/android/dialer/videocallintro/impl/VideoCallIntroEnabledFn", "isEnabled", (char) 29, "VideoCallIntroEnabledFn.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
        return false;
    }
}
