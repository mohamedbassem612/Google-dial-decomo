package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vss extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public vss(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.vss.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.String str;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        rwo rwoVar = (rwo) list.get(1);
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) list.get(2);
        android.content.Context context2 = rwoVar.b;
        if (rwu.g(context2)) {
            str = "phone_voicemail";
        } else {
            java.lang.String strB = "phone_default";
            if (phoneAccountHandle == null) {
                rwu.a.b().l("com/android/dialer/notification/channel/VoicemailChannelUtils", "getChannelId", 149, "VoicemailChannelUtils.java").v("no phone account on a multi-SIM device, using default channel");
            } else if (rwu.f(context2, phoneAccountHandle)) {
                strB = rwu.b(phoneAccountHandle);
                if (((android.app.NotificationManager) context2.getSystemService(android.app.NotificationManager.class)).getNotificationChannel(strB) == null) {
                    rwu.a.b().l("com/android/dialer/notification/channel/VoicemailChannelUtils", "getChannelId", 162, "VoicemailChannelUtils.java").v("voicemail channel not found for phone account (possible SIM swap?), creating a new one");
                    if (!rwu.h(context2, new aile(strB), (aihd) j$.util.Collection.-EL.stream(((android.app.NotificationManager) context2.getSystemService(android.app.NotificationManager.class)).getNotificationChannels()).map(new defpackage.rat(8)).filter(new mif(20)).collect(aido.b))) {
                        rwu.e(context2, phoneAccountHandle, j$.util.Optional.empty());
                    }
                }
            } else {
                rwu.a.b().l("com/android/dialer/notification/channel/VoicemailChannelUtils", "getChannelId", 155, "VoicemailChannelUtils.java").v("phone account is not for a SIM, using default channel");
            }
            str = strB;
        }
        return aiql.z(new android.content.Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.CHANNEL_ID", str).putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName()).setFlags(536870912));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
