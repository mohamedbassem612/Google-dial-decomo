package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oxg {
    private static final aimz a = aimz.i("com/android/dialer/incall/answer/method/settings/service/SimpleViewChecker");
    private final android.content.Context b;

    public oxg(android.content.Context context) {
        aooh.f(context, "context");
        this.b = context;
    }

    public final boolean a() {
        try {
            return android.provider.Settings.Secure.getInt(this.b.getContentResolver(), "matcha_enable", 0) == 1;
        } catch (java.lang.Exception e) {
            a.d().k(e).l("com/android/dialer/incall/answer/method/settings/service/SimpleViewChecker", "isSimpleViewEnabled", 19, "SimpleViewChecker.kt").v("Failed to read matcha_enable setting");
            return false;
        }
    }
}
