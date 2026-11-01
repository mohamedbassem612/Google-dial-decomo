package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hun {
    public static final aimz a = aimz.i("com/android/dialer/assisteddialing/impl/LocationDetector");
    public final oko b;
    private final java.lang.String c;

    public hun(oko okoVar, java.lang.String str) {
        this.b = okoVar;
        this.c = str;
    }

    public final java.lang.String a() {
        java.lang.String str = this.c;
        if (str != null && str.length() != 0) {
            a.b().l("com/android/dialer/assisteddialing/impl/LocationDetector", "getUpperCaseUserHomeCountry", 42, "LocationDetector.kt").v("user provided home country code");
            java.util.Locale locale = java.util.Locale.US;
            aooh.e(locale, "US");
            java.lang.String upperCase = str.toUpperCase(locale);
            aooh.e(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        java.lang.String str2 = (java.lang.String) aooh.q(this.b.z());
        if (str2 == null || str2.length() == 0) {
            a.b().l("com/android/dialer/assisteddialing/impl/LocationDetector", "getUpperCaseUserHomeCountry", 52, "LocationDetector.kt").v("user home country was null");
            return null;
        }
        a.b().l("com/android/dialer/assisteddialing/impl/LocationDetector", "getUpperCaseUserHomeCountry", 48, "LocationDetector.kt").v("using sim country iso");
        java.util.Locale locale2 = java.util.Locale.US;
        aooh.e(locale2, "US");
        java.lang.String upperCase2 = str2.toUpperCase(locale2);
        aooh.e(upperCase2, "toUpperCase(...)");
        return upperCase2;
    }
}
