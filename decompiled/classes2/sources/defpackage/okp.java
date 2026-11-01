package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class okp {
    private static final aimz a = aimz.i("com/android/dialer/externals/androidapis/telephony/DialerTelephonyReflectedConstants");

    public static final java.lang.String a(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            throw new java.lang.IllegalStateException("Reflective API may only be called on U+");
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.telephony.TelephonyManager");
            aooh.e(cls, "forName(...)");
            java.lang.reflect.Field field = cls.getField(str);
            aooh.e(field, "getField(...)");
            java.lang.String str2 = (java.lang.String) field.get(null);
            if (str2 != null) {
                return str2;
            }
            a.d().l("com/android/dialer/externals/androidapis/telephony/DialerTelephonyReflectedConstants", "get", 2026, "DialerTelephony.kt").y("%s is null", str);
            return null;
        } catch (java.lang.ReflectiveOperationException e) {
            a.d().k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephonyReflectedConstants", "get", 2031, "DialerTelephony.kt").y("Cannot reflect field '%s'", str);
            return null;
        }
    }
}
