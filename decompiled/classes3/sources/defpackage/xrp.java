package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public final class xrp {
    public static final aimz a = aimz.i("com/android/voicemail/impl/sms/LegacyModeSmsHandler");

    public static void a(android.content.Context context, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        android.app.PendingIntent activity;
        a.bI(a.b(), "sending voicemail notification", "com/android/voicemail/impl/sms/LegacyModeSmsHandler", "sendLegacyVoicemailNotification", 'l', "LegacyModeSmsHandler.java", zct.a);
        android.content.Intent intent = new android.content.Intent("com.android.voicemail.VoicemailClient.ACTION_SHOW_VOICEMAIL_NOTIFICATION");
        intent.setPackage(context.getPackageName());
        intent.putExtra("is_legacy_mode", true);
        intent.putExtra("android.telephony.extra.PHONE_ACCOUNT_HANDLE", phoneAccountHandle);
        intent.putExtra("android.telephony.extra.NOTIFICATION_COUNT", i);
        j$.util.Optional optionalD = ((xro) agab.aH(context, xro.class)).be().D(phoneAccountHandle);
        if (true == optionalD.isPresent()) {
            optionalD = ((oko) optionalD.get()).C();
            optionalD.getClass();
        }
        android.app.PendingIntent activity2 = null;
        java.lang.String str = (java.lang.String) optionalD.orElse((java.lang.Object) null);
        if (str != null) {
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.CALL", android.net.Uri.fromParts("voicemail", "", null));
            intent2.putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", phoneAccountHandle);
            android.content.ClipData clipData = defpackage.afap.a;
            activity2 = android.app.PendingIntent.getActivity(context, 1, intent2, 201326592);
            activity = null;
        } else {
            android.content.Intent intent3 = new android.content.Intent("android.telephony.action.CONFIGURE_VOICEMAIL");
            intent3.putExtra("android.telephony.extra.HIDE_PUBLIC_SETTINGS", true);
            intent3.putExtra("android.telephony.extra.PHONE_ACCOUNT_HANDLE", phoneAccountHandle);
            activity = android.app.PendingIntent.getActivity(context, 2, intent3, 201326592);
        }
        intent.putExtra("android.telephony.extra.VOICEMAIL_NUMBER", str);
        intent.putExtra("android.telephony.extra.CALL_VOICEMAIL_INTENT", activity2);
        intent.putExtra("android.telephony.extra.LAUNCH_VOICEMAIL_SETTINGS_INTENT", activity);
        context.sendBroadcast(intent);
    }
}
