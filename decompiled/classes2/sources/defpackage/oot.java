package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oot {
    private static final aimz a = aimz.i("com/android/dialer/gamingmodesupport/impl/GamingModeSupportImpl");
    private final android.content.Context b;

    public oot(android.content.Context context) {
        aooh.f(context, "appContext");
        this.b = context;
    }

    public final boolean a() {
        java.lang.String str = defpackage.oov.a;
        for (java.util.Map.Entry entry : defpackage.oov.e.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            aonj aonjVar = (aonj) entry.getValue();
            android.content.ContentResolver contentResolver = this.b.getContentResolver();
            aooh.e(contentResolver, "getContentResolver(...)");
            if (((java.lang.Boolean) aonjVar.a(contentResolver)).booleanValue()) {
                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/gamingmodesupport/impl/GamingModeSupportImpl", "isGamingModeOn", 18, "GamingModeSupportImpl.kt").y("gaming mode on: %s", str2);
                return true;
            }
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/gamingmodesupport/impl/GamingModeSupportImpl", "isGamingModeOn", 23, "GamingModeSupportImpl.kt").v("gaming mode off");
        return false;
    }
}
