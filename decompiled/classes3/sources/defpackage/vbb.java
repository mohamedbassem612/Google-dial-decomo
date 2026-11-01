package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vbb implements ahjr {
    private static final aimz b = aimz.i("com/android/dialer/voicemail/notification/receivers/VoicemailNotificationDismissalReceiver");
    public final zjm a;
    private final vtv c;
    private final ajct d;
    private final jna e;
    private final aogc f;

    public vbb(vtv vtvVar, jna jnaVar, aogc aogcVar, zjm zjmVar, ajct ajctVar) {
        this.c = vtvVar;
        this.e = jnaVar;
        this.f = aogcVar;
        this.a = zjmVar;
        this.d = ajctVar;
    }

    private static jmz b() {
        akzx akzxVarM = jmz.a.m();
        akzxVarM.u();
        jmz jmzVar = akzxVarM.b;
        jmzVar.b |= 1;
        jmzVar.c = true;
        akzxVarM.u();
        jmz jmzVar2 = akzxVarM.b;
        jmzVar2.d = 4;
        jmzVar2.b |= 2;
        return akzxVarM.p();
    }

    public final ajcq a(android.content.Intent intent, int i) {
        b.b().l("com/android/dialer/voicemail/notification/receivers/VoicemailNotificationDismissalReceiver", "onReceive", 65, "VoicemailNotificationDismissalReceiver.java").v("enter");
        java.lang.String action = intent.getAction();
        ahvr.cj(action, "action is null");
        int iHashCode = action.hashCode();
        if (iHashCode != 660925754) {
            if (iHashCode == 724090758 && action.equals("com.android.dialer.voicemail.notification.receivers.ACTION_MARK_ALL_NEW_VOICEMAILS_AS_OLD")) {
                jna jnaVar = this.e;
                vtv vtvVar = this.c;
                return jnaVar.c(vtvVar.c(), this.f, b());
            }
        } else if (action.equals("com.android.dialer.voicemail.notification.receivers.ACTION_MARK_SINGLE_NEW_VOICEMAIL_AS_OLD")) {
            android.net.Uri data = intent.getData();
            ahvr.cj(data, "Voicemail URI is null");
            jna jnaVar2 = this.e;
            vva vvaVar = this.c;
            vva.b.b().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailDataServiceImpl", "markVoicemailAsOld", 929, "VoicemailDataServiceImpl.java").v("enter");
            return jnaVar2.c(ahvr.I(vvaVar.g(data), new defpackage.udu(this, 18), this.d), this.f, b());
        }
        throw new java.lang.AssertionError("invalid action: ".concat(java.lang.String.valueOf(action)));
    }
}
