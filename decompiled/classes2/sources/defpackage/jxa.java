package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jxa {
    private static final aimz a = aimz.i("com/android/dialer/callintent/CallIntentParser");

    public static defpackage.jxb a(android.os.Bundle bundle) {
        if (bundle == null || !bundle.containsKey("com.android.dialer.callintent.CALL_SPECIFIC_APP_DATA")) {
            return null;
        }
        if (bundle.getByteArray("com.android.dialer.callintent.CALL_SPECIFIC_APP_DATA") != null) {
            return sns.s(bundle, "com.android.dialer.callintent.CALL_SPECIFIC_APP_DATA", defpackage.jxb.b);
        }
        a.b().l("com/android/dialer/callintent/CallIntentParser", "getCallSpecificAppData", 42, "CallIntentParser.java").v("unexpected null byte array for call specific app data proto");
        return null;
    }
}
