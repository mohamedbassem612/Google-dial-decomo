package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vzd extends android.telephony.PhoneStateListener {
    private final aogc a;
    private final aogc b;

    public vzd(aogc aogcVar, aogc aogcVar2) {
        this.a = aogcVar;
        this.b = aogcVar2;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(android.telephony.ServiceState serviceState) {
        vze.a.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataServiceImpl$ServiceStateListener", "onServiceStateChanged", 431, "VoicemailStatusDataServiceImpl.java").v("enter");
        this.a.t(this.b.bk(), new agxj("VoicemailStatus"));
    }
}
