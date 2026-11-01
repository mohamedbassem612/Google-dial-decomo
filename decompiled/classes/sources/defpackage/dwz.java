package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dwz {
    public static final int a;

    static {
        baa$.ExternalSyntheticApiModelOutline1.m(30);
        baa$.ExternalSyntheticApiModelOutline1.m(31);
        a = baa$.ExternalSyntheticApiModelOutline1.m(33);
        baa$.ExternalSyntheticApiModelOutline1.m(1000000);
    }

    public static final boolean a(java.lang.String str, java.lang.String str2) {
        defpackage.aooh.f(str2, "buildCodename");
        if (defpackage.aooh.n("REL", str2)) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.US;
        defpackage.aooh.e(locale, "US");
        java.lang.String upperCase = str2.toUpperCase(locale);
        defpackage.aooh.e(upperCase, "toUpperCase(...)");
        java.util.Locale locale2 = java.util.Locale.US;
        defpackage.aooh.e(locale2, "US");
        java.lang.String upperCase2 = str.toUpperCase(locale2);
        defpackage.aooh.e(upperCase2, "toUpperCase(...)");
        java.lang.Integer numD = d(upperCase);
        java.lang.Integer numD2 = d(upperCase2);
        if (numD != null) {
            if (numD2 != null) {
                numD.intValue();
                numD2.intValue();
            }
        } else if (numD2 != null || upperCase.compareTo(upperCase2) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT >= 32) {
            java.lang.String str = android.os.Build.VERSION.CODENAME;
            defpackage.aooh.e(str, "CODENAME");
            if (a("Tiramisu", str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c() {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            java.lang.String str = android.os.Build.VERSION.CODENAME;
            defpackage.aooh.e(str, "CODENAME");
            if (a("VanillaIceCream", str)) {
                return true;
            }
        }
        return false;
    }

    private static final java.lang.Integer d(java.lang.String str) {
        return defpackage.aooh.n(str, "BAKLAVA") ? 0 : null;
    }
}
