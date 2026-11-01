package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vay implements ahjr {
    private static final aimz a = aimz.i("com/android/dialer/voicemail/notification/receivers/MwiNotificationReceiver");
    private final zjv b;
    private final jna c;
    private final zjm d;
    private final aogc e;

    public vay(jna jnaVar, aogc aogcVar, zjm zjmVar, zjv zjvVar) {
        this.c = jnaVar;
        this.e = aogcVar;
        this.d = zjmVar;
        this.b = zjvVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        ajcq ajcqVar;
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/voicemail/notification/receivers/MwiNotificationReceiver", "onReceive", 77, "MwiNotificationReceiver.java").v("enter");
        zjv zjvVar = this.b;
        zjvVar.c(getClass(), intent, aify.q("android.telephony.extra.NOTIFICATION_COUNT", "android.telephony.extra.IS_REFRESH"), aify.p("android.telephony.extra.VOICEMAIL_NUMBER"));
        zjm zjmVar = this.d;
        if (!zjmVar.g().isPresent()) {
            aimzVar.b().l("com/android/dialer/voicemail/notification/receivers/MwiNotificationReceiver", "onReceive", 87, "MwiNotificationReceiver.java").v("voicemail notification modernization is disabled");
            return ajcm.a;
        }
        ahvr.ci(intent.getAction());
        jna jnaVar = this.c;
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) intent.getParcelableExtra("android.telephony.extra.PHONE_ACCOUNT_HANDLE");
        ahvr.ci(phoneAccountHandle);
        zjvVar.d(getClass(), intent, aify.p(aais.aE(phoneAccountHandle)));
        int intExtra = intent.getIntExtra("android.telephony.extra.NOTIFICATION_COUNT", -1);
        if (intExtra == 0) {
            aimzVar.b().l("com/android/dialer/voicemail/notification/receivers/MwiNotificationReceiver", "handleNotification", 113, "MwiNotificationReceiver.java").v("clear the MWI notification");
            j$.util.Optional optionalG = zjmVar.g();
            defpackage.taj tajVar = new defpackage.taj(phoneAccountHandle, 17);
            if (true == optionalG.isPresent()) {
                optionalG = j$.util.Optional.ofNullable(((val) optionalG.get()).a((android.telecom.PhoneAccountHandle) tajVar.a));
            }
            ajcqVar = (ajcq) optionalG.orElse(ajcm.a);
        } else {
            if (intExtra == -1) {
                aimzVar.b().l("com/android/dialer/voicemail/notification/receivers/MwiNotificationReceiver", "handleNotification", 124, "MwiNotificationReceiver.java").v("voicemail count not present");
                intExtra = 1;
            }
            boolean booleanExtra = intent.getBooleanExtra("android.telephony.extra.IS_REFRESH", false);
            java.lang.String stringExtra = intent.getStringExtra("android.telephony.extra.VOICEMAIL_NUMBER");
            akzx akzxVarM = defpackage.vaj.a.m();
            akzxVarM.u();
            ((defpackage.vaj) akzxVarM.b).c = intExtra;
            akzxVarM.u();
            ((defpackage.vaj) akzxVarM.b).e = booleanExtra;
            if (!android.text.TextUtils.isEmpty(stringExtra)) {
                akzxVarM.u();
                defpackage.vaj vajVar = (defpackage.vaj) akzxVarM.b;
                j$.util.Objects.requireNonNull(stringExtra);
                vajVar.b |= 1;
                vajVar.d = stringExtra;
            }
            j$.util.Optional optionalG2 = zjmVar.g();
            idc idcVar = new idc(phoneAccountHandle, akzxVarM, 12);
            if (true == optionalG2.isPresent()) {
                optionalG2 = j$.util.Optional.ofNullable(((val) optionalG2.get()).c((android.telecom.PhoneAccountHandle) idcVar.a, (defpackage.vaj) ((akzx) idcVar.b).p()));
            }
            ajcqVar = (ajcq) optionalG2.orElse(ajcm.a);
        }
        aogc aogcVar = this.e;
        akzx akzxVarM2 = jmz.a.m();
        akzxVarM2.u();
        jmz jmzVar = akzxVarM2.b;
        jmzVar.b |= 1;
        jmzVar.c = true;
        akzxVarM2.u();
        jmz jmzVar2 = akzxVarM2.b;
        jmzVar2.d = 2;
        jmzVar2.b |= 2;
        return jnaVar.c(ajcqVar, aogcVar, akzxVarM2.p());
    }
}
