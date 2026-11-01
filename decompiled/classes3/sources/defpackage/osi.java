package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class osi implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/incall/accountselectordialog/impl/AccountSelectorDialogEnabledFn");
    private final zzx b;

    public osi(zzx zzxVar) {
        this.b = zzxVar;
    }

    public final boolean a() {
        if (!this.b.m()) {
            return true;
        }
        hgb.c(a.b(), "disabled by direct boot", "com/android/dialer/incall/accountselectordialog/impl/AccountSelectorDialogEnabledFn", "isEnabled", (char) 29, "AccountSelectorDialogEnabledFn.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
        return false;
    }
}
