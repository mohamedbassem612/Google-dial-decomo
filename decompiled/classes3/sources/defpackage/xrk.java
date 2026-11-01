package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xrk implements ahjr {
    public static final aimz a = aimz.i("com/android/voicemail/impl/VoicemailClientReceiver");
    public final android.content.Context b;
    public final ajct c;
    public final zjm d;
    public final ahbv e;
    private final zzx f;
    private final kaw g;

    public xrk(android.content.Context context, kaw kawVar, ajct ajctVar, ahbv ahbvVar, zjm zjmVar, zzx zzxVar) {
        this.b = context;
        this.g = kawVar;
        this.c = ajctVar;
        this.e = ahbvVar;
        this.d = zjmVar;
        this.f = zzxVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        boolean zM = this.f.m();
        aimz aimzVar = a;
        if (zM) {
            aimzVar.b().l("com/android/voicemail/impl/VoicemailClientReceiver", "onReceive", 86, "VoicemailClientReceiver.java").v("In direct boot, ignoring");
            return ajcm.a;
        }
        aimzVar.b().l("com/android/voicemail/impl/VoicemailClientReceiver", "doUpload", 94, "VoicemailClientReceiver.java").v("ACTION_UPLOAD received");
        ajcq ajcqVarO = this.g.o(aihd.o(((android.telecom.TelecomManager) this.b.getSystemService(android.telecom.TelecomManager.class)).getCallCapablePhoneAccounts()), new defpackage.xcv(this, 12));
        defpackage.zqi zqiVar = new defpackage.zqi(new aift(4), 1);
        ajct ajctVar = this.c;
        return ahvr.I(ahvr.H(ajcqVarO, zqiVar, ajctVar), new defpackage.xcv(this, 11), ajctVar);
    }
}
