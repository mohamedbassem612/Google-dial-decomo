package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public final class rlt {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/location/LegacyCountryDetector");
    private final defpackage.oko b;

    public rlt(defpackage.oko okoVar) {
        this.b = okoVar;
    }

    @java.lang.Deprecated
    public static java.lang.String a(android.content.Context context, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        java.lang.String strC = ((defpackage.rls) defpackage.agab.aH(context, defpackage.rls.class)).br().c(phoneAccountHandle);
        if (android.text.TextUtils.isEmpty(strC)) {
            java.util.Locale locale = java.util.Locale.getDefault();
            strC = locale != null ? locale.getCountry() : null;
        }
        if (true == android.text.TextUtils.isEmpty(strC)) {
            strC = "US";
        }
        java.lang.String upperCase = strC.toUpperCase(java.util.Locale.US);
        defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/location/LegacyCountryDetector", "getCurrentCountryIso", 98, "LegacyCountryDetector.java");
        ((defpackage.rls) defpackage.agab.aH(context, defpackage.rls.class)).ji();
        aimwVar.y("returning %s", defpackage.aais.aD(upperCase));
        return upperCase;
    }

    @java.lang.Deprecated
    public static java.lang.String b(android.content.Context context) {
        java.lang.String strC = ((defpackage.rls) defpackage.agab.aH(context, defpackage.rls.class)).br().c(null);
        defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/location/LegacyCountryDetector", "getCurrentPhysicalCountryIso", 143, "LegacyCountryDetector.java");
        ((defpackage.rls) defpackage.agab.aH(context, defpackage.rls.class)).ji();
        aimwVar.y("returning %s", defpackage.aais.aD(strC));
        return strC;
    }

    private final java.lang.String c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        try {
            defpackage.oko okoVarI = this.b.i(phoneAccountHandle);
            java.lang.String str = okoVarI.b() == 1 ? (java.lang.String) okoVarI.x().orElse((java.lang.Object) null) : null;
            if (android.text.TextUtils.isEmpty(str)) {
                str = (java.lang.String) okoVarI.z().orElse((java.lang.Object) null);
            }
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            return str.toUpperCase(java.util.Locale.US);
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }
}
