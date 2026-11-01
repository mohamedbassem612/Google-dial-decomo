package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uym implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/videohandoverdialog/impl/VideoHandoverDialogEnabledFn");
    private final aoin b;

    public uym(aoin aoinVar) {
        this.b = aoinVar;
    }

    public final boolean a() {
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return true;
        }
        hgb.c(a.b(), "disabled by flag", "com/android/dialer/videohandoverdialog/impl/VideoHandoverDialogEnabledFn", "isEnabled", (char) 29, "VideoHandoverDialogEnabledFn.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
        return false;
    }
}
