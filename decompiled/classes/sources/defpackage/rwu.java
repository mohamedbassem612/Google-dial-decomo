package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rwu {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/notification/channel/VoicemailChannelUtils");

    public static java.lang.String a(java.lang.String str) {
        int i = defpackage.airu.a;
        return "phone_voicemail_account_:".concat(airt.a.b(str, java.nio.charset.StandardCharsets.UTF_8).toString());
    }

    public static java.lang.String b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return android.os.Build.VERSION.SDK_INT < 33 ? a(phoneAccountHandle.getId()) : "phone_voicemail_account_:".concat(java.lang.String.valueOf(phoneAccountHandle.getId()));
    }

    public static java.util.Set c(android.content.Context context) {
        defpackage.acc accVar = new defpackage.acc(0);
        if (g(context)) {
            accVar.add("phone_voicemail");
        } else {
            java.util.Iterator it = j(context).iterator();
            while (it.hasNext()) {
                accVar.add(b((android.telecom.PhoneAccountHandle) it.next()));
            }
        }
        return accVar;
    }

    public static void d(android.content.Context context) {
        if (!g(context)) {
            java.util.Iterator it = j(context).iterator();
            while (it.hasNext()) {
                e(context, (android.telecom.PhoneAccountHandle) it.next(), j$.util.Optional.empty());
            }
            return;
        }
        android.app.NotificationChannel notificationChannelI = i(context, "phone_voicemail", null);
        if (defpackage.zqz.a(context, "android.permission.READ_PHONE_STATE")) {
            j$.util.Optional optionalH = defpackage.ttj.N(context).dO().h("tel");
            if (!optionalH.isPresent()) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/notification/channel/VoicemailChannelUtils", "migrateGlobalVoicemailSoundSettings", 231, "VoicemailChannelUtils.java")).v("phone account is null, not migrating sound settings");
            } else if (f(context, (android.telecom.PhoneAccountHandle) optionalH.orElseThrow())) {
                k(context, notificationChannelI, (android.telecom.PhoneAccountHandle) optionalH.orElseThrow());
            } else {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/notification/channel/VoicemailChannelUtils", "migrateGlobalVoicemailSoundSettings", 235, "VoicemailChannelUtils.java")).v("phone account is not eligible, not migrating sound settings");
            }
        } else {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/notification/channel/VoicemailChannelUtils", "migrateGlobalVoicemailSoundSettings", 223, "VoicemailChannelUtils.java")).v("missing phone permission, not migrating sound settings");
        }
        aa$.ExternalSyntheticApiModelOutline0.m((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class), notificationChannelI);
    }

    public static void e(android.content.Context context, android.telecom.PhoneAccountHandle phoneAccountHandle, j$.util.Optional optional) {
        j$.util.Optional optionalJ = defpackage.ttj.N(context).dO().j(phoneAccountHandle);
        if (optionalJ.isPresent()) {
            android.app.NotificationChannel notificationChannelI = i(context, b(phoneAccountHandle), ((android.telecom.PhoneAccount) optionalJ.orElseThrow()).getLabel());
            android.app.NotificationChannel notificationChannelM = aa$.ExternalSyntheticApiModelOutline0.m(optional.orElse((java.lang.Object) null));
            if (notificationChannelM != null) {
                rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannelI, rs$.ExternalSyntheticApiModelOutline0.m(notificationChannelM));
                rs$.ExternalSyntheticApiModelOutline0.m(notificationChannelI, rs$.ExternalSyntheticApiModelOutline0.m(notificationChannelM), rs$.ExternalSyntheticApiModelOutline0.m(notificationChannelM));
                rs$.ExternalSyntheticApiModelOutline0.m(notificationChannelI, aa$.ExternalSyntheticApiModelOutline0.m(notificationChannelM));
            } else {
                k(context, notificationChannelI, phoneAccountHandle);
            }
            aa$.ExternalSyntheticApiModelOutline0.m((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class), notificationChannelI);
        }
    }

    public static boolean f(android.content.Context context, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalJ = ((defpackage.rwt) defpackage.agab.aH(context, defpackage.rwt.class)).dO().j(phoneAccountHandle);
        return optionalJ.isPresent() && ((android.telecom.PhoneAccount) optionalJ.orElseThrow()).hasCapabilities(4);
    }

    public static boolean g(android.content.Context context) {
        defpackage.aify aifyVar = defpackage.zqz.a;
        return (defpackage.dvx.c(context, "android.permission.READ_PHONE_STATE") == 0 && ((defpackage.rwt) defpackage.agab.aH(context, defpackage.rwt.class)).be().Z()) ? false : true;
    }

    public static boolean h(android.content.Context context, java.util.Set set, java.util.Set set2) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/notification/channel/VoicemailChannelUtils", "migrateAllChannelsForT", 346, "VoicemailChannelUtils.java")).v("enter");
        if (android.os.Build.VERSION.SDK_INT >= 33 && !g(context)) {
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(set).filter(new mif(18));
            j$.util.stream.Collector collector = defpackage.aido.a;
            defpackage.aify aifyVar = (defpackage.aify) streamFilter.collect(collector);
            defpackage.aify aifyVar2 = (defpackage.aify) j$.util.Collection.-EL.stream(set2).filter(new mif(19)).collect(collector);
            if (!defpackage.ahvr.aP(aifyVar, aifyVar2)) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/notification/channel/VoicemailChannelUtils", "migrateAllChannelsForT", 365, "VoicemailChannelUtils.java")).v("start migration");
                java.util.List listJ = j(context);
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/notification/channel/VoicemailChannelUtils", "createAndMigrateAllChannelsForT", 387, "VoicemailChannelUtils.java")).v("enter");
                j$.util.Collection.-EL.stream(listJ).forEach(new rh(context, aifyVar2, 15));
                j$.lang.Iterable.-EL.forEach(aifyVar2, new oxs(context, 12));
                return true;
            }
        }
        return false;
    }

    private static android.app.NotificationChannel i(android.content.Context context, java.lang.String str, java.lang.CharSequence charSequence) {
        java.lang.CharSequence text = context.getText(2132019512);
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            text = android.text.TextUtils.concat(text, ": ", charSequence);
        }
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(str, text, 3);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, android.provider.Settings.System.DEFAULT_NOTIFICATION_URI, new android.media.AudioAttributes.Builder().setUsage(5).build());
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            ae$.ExternalSyntheticApiModelOutline0.m(notificationChannel, true);
        }
        return notificationChannel;
    }

    private static java.util.List j(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.telecom.PhoneAccountHandle phoneAccountHandle : ((defpackage.rwt) defpackage.agab.aH(context, defpackage.rwt.class)).dO().s()) {
            if (f(context, phoneAccountHandle)) {
                arrayList.add(phoneAccountHandle);
            }
        }
        return arrayList;
    }

    private static void k(android.content.Context context, android.app.NotificationChannel notificationChannel, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.oko okoVarBe = defpackage.ttj.N(context).be();
        defpackage.mgu mguVarH = okoVarBe.h();
        android.telephony.TelephonyManager telephonyManager = okoVarBe.j;
        java.lang.Object objF = new defpackage.mgf(mguVarH, fh$.ExternalSyntheticApiModelOutline0.m(telephonyManager, phoneAccountHandle)).a(defpackage.mgv.TELEPHONY_IS_VOICEMAIL_VIBRATION_ENABLED).f();
        defpackage.aooh.e(objF, "ifTrue(...)");
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, ((java.lang.Boolean) objF).booleanValue());
        java.lang.Object objG = new defpackage.mgr(okoVarBe.h(), j$.util.Optional.ofNullable(fh$.ExternalSyntheticApiModelOutline0.m(telephonyManager, phoneAccountHandle))).a(defpackage.mgv.TELEPHONY_GET_VOICEMAIL_RINGTONE_URI).g(new mig(13));
        defpackage.aooh.e(objG, "asStringUserdataIfPresent(...)");
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) ((j$.util.Optional) objG).orElse((java.lang.Object) null), new android.media.AudioAttributes.Builder().setUsage(5).build());
    }
}
