package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vmx implements ahjr {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/service/receivers/DataSubscriptionChangeReceiver");
    public final ajct b;
    public final okj c;
    public final zjm d;
    private final zjs e;
    private final aoin f;
    private final jna g;
    private final zjm h;
    private final zzx i;
    private final aogc j;

    public vmx(jna jnaVar, zjm zjmVar, ajct ajctVar, zzx zzxVar, aogc aogcVar, okj okjVar, zjs zjsVar, zjm zjmVar2, aoin aoinVar) {
        this.g = jnaVar;
        this.h = zjmVar;
        this.b = ajctVar;
        this.i = zzxVar;
        this.j = aogcVar;
        this.c = okjVar;
        this.e = zjsVar;
        this.d = zjmVar2;
        this.f = aoinVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        ahrv ahrvVarH;
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/voicemail/service/receivers/DataSubscriptionChangeReceiver", "onReceive", 93, "DataSubscriptionChangeReceiver.java").v("Received ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED");
        if (!intent.getAction().equals("android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED")) {
            a.bt(aimzVar.d(), "Received unexpected action: %s", intent.getAction(), "com/android/dialer/voicemail/service/receivers/DataSubscriptionChangeReceiver", "onReceive", 'b', "DataSubscriptionChangeReceiver.java", zct.b);
            return ajcm.a;
        }
        if (this.i.m()) {
            aimzVar.b().l("com/android/dialer/voicemail/service/receivers/DataSubscriptionChangeReceiver", "onReceive", 102, "DataSubscriptionChangeReceiver.java").v("Received broadcast during direct boot, ignoring");
            return ajcm.a;
        }
        if (!this.h.g().isPresent()) {
            return ajcm.a;
        }
        zjs zjsVar = this.e;
        aoin aoinVar = this.f;
        ajcq ajcqVarD = zjsVar.d();
        int i2 = 6;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            ahrv ahrvVarG = ahrv.g(this.c.e());
            vmv vmvVar = new vmv(this, ajcqVarD, 3, (byte[]) null);
            ajct ajctVar = this.b;
            ahrvVarH = ahrvVarG.i(vmvVar, ajctVar).h(new defpackage.vmj(10), ajctVar);
        } else {
            ahrv ahrvVarG2 = ahrv.g(ajcqVarD);
            defpackage.vmq vmqVar = new defpackage.vmq(this, 5);
            ajct ajctVar2 = this.b;
            ahrvVarH = ahrvVarG2.i(vmqVar, ajctVar2).i(new defpackage.vmq(this, i2), ajctVar2).h(new defpackage.vmj(8), ajctVar2);
        }
        jna jnaVar = this.g;
        ajcq ajcqVarO = ahvr.ak(new ajcq[]{ahrvVarH, ajcm.a}).o(new defpackage.vnc(1), this.b);
        aogc aogcVar = this.j;
        akzx akzxVarM = jmz.a.m();
        akzxVarM.u();
        jmz jmzVar = akzxVarM.b;
        jmzVar.b |= 1;
        jmzVar.c = true;
        akzxVarM.u();
        jmz jmzVar2 = akzxVarM.b;
        jmzVar2.d = 6;
        jmzVar2.b |= 2;
        return jnaVar.c(ajcqVarO, aogcVar, akzxVarM.p());
    }

    public final ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ahrv.g(this.d.k(phoneAccountHandle)).i(new defpackage.vmq(phoneAccountHandle, 7), this.b);
    }

    public final ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ahvr.I(this.d.l(phoneAccountHandle), new defpackage.vmq(phoneAccountHandle, 4), this.b);
    }
}
