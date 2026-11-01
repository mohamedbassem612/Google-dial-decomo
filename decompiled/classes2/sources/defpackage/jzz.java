package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jzz {
    private static final java.lang.String a;

    static {
        java.lang.String strFlattenToString = new android.content.ComponentName("com.google.android.apps.tachyon", "com.google.android.apps.tachyon.telecom.TachyonTelecomConnectionService").flattenToString();
        aooh.e(strFlattenToString, "flattenToString(...)");
        a = strFlattenToString;
    }

    public static final boolean a(java.lang.String str, java.lang.String str2) {
        aooh.f(str, "componentName");
        aooh.f(str2, "id");
        return aooh.n(a, str) && aooh.n(str2, "0");
    }
}
