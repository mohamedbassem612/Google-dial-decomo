package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vnd implements ahjr {
    private static final aimz c = aimz.i("com/android/dialer/voicemail/service/receivers/MwiReceiver");
    public final ajct a;
    public final zjm b;
    private final zjs d;
    private final jna e;
    private final zjm f;
    private final zzx g;
    private final aogc h;

    public vnd(jna jnaVar, zjm zjmVar, zzx zzxVar, ajct ajctVar, aogc aogcVar, zjm zjmVar2, zjs zjsVar) {
        this.e = jnaVar;
        this.f = zjmVar;
        this.g = zzxVar;
        this.a = ajctVar;
        this.h = aogcVar;
        this.b = zjmVar2;
        this.d = zjsVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        aimz aimzVar = c;
        aimzVar.b().l("com/android/dialer/voicemail/service/receivers/MwiReceiver", "onReceive", 74, "MwiReceiver.java").v("Received ACTION_SHOW_VOICEMAIL_NOTIFICATION");
        if (!intent.getAction().equals("android.telephony.action.SHOW_VOICEMAIL_NOTIFICATION")) {
            a.bt(aimzVar.d(), "Received unexpected action: %s", intent.getAction(), "com/android/dialer/voicemail/service/receivers/MwiReceiver", "onReceive", 'O', "MwiReceiver.java", zct.b);
            return ajcm.a;
        }
        if (this.g.m()) {
            aimzVar.b().l("com/android/dialer/voicemail/service/receivers/MwiReceiver", "onReceive", 83, "MwiReceiver.java").v("In direct boot");
            return ajcm.a;
        }
        if (!this.f.g().isPresent()) {
            aimzVar.b().l("com/android/dialer/voicemail/service/receivers/MwiReceiver", "onReceive", 87, "MwiReceiver.java").v("Feature not available");
            return ajcm.a;
        }
        ahrv ahrvVarG = ahrv.g(this.d.d());
        defpackage.vmb vmbVar = new defpackage.vmb(this, 8);
        ajct ajctVar = this.a;
        ahrv ahrvVarI = ahrvVarG.h(vmbVar, ajctVar).i(new defpackage.vmq(this, 10), ajctVar);
        jna jnaVar = this.e;
        aogc aogcVar = this.h;
        akzx akzxVarM = jmz.a.m();
        akzxVarM.u();
        jmz jmzVar = akzxVarM.b;
        jmzVar.b |= 1;
        jmzVar.c = true;
        akzxVarM.u();
        jmz jmzVar2 = akzxVarM.b;
        jmzVar2.d = 5;
        jmzVar2.b |= 2;
        return jnaVar.c(ahrvVarI, aogcVar, akzxVarM.p());
    }
}
