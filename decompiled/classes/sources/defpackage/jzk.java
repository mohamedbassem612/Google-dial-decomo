package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jzk {
    public static final defpackage.aenj a = defpackage.ruc.s;
    public static final java.lang.String b;
    public static final java.lang.String c;

    static {
        java.lang.String strFlattenToString = new android.content.ComponentName("com.android.phone", "com.android.services.telephony.TelephonyConnectionService").flattenToString();
        defpackage.aooh.e(strFlattenToString, "flattenToString(...)");
        b = strFlattenToString;
        java.lang.String strFlattenToString2 = new android.content.ComponentName("com.whatsapp", "com.whatsapp").flattenToString();
        defpackage.aooh.e(strFlattenToString2, "flattenToString(...)");
        c = strFlattenToString2;
    }
}
