package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class advs implements adve {
    private final /* synthetic */ int $cid;

    public advs(int i) {
        this.$cid = i;
    }

    public final boolean a(android.content.Intent intent) {
        int i = this.$cid;
        if (i == 0) {
            return aooh.n("android.intent.action.LOCALE_CHANGED", intent.getAction());
        }
        if (i == 1) {
            return aooh.n("android.accounts.LOGIN_ACCOUNTS_CHANGED", intent.getAction());
        }
        if (i != 2) {
            return i != 3 ? aooh.n("android.intent.action.MY_PACKAGE_REPLACED", intent.getAction()) : aooh.n("android.intent.action.TIMEZONE_CHANGED", intent.getAction());
        }
        return aooh.n("android.intent.action.BOOT_COMPLETED", intent.getAction());
    }
}
