package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vix {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl");
    public final android.content.Context b;
    public final java.util.concurrent.ScheduledExecutorService c;
    public final java.util.concurrent.Executor d;
    public final defpackage.agsm e;
    public final defpackage.oko f;
    public final defpackage.aoin g;
    public final defpackage.aoin h;
    public android.net.ConnectivityManager.NetworkCallback i;
    public final defpackage.viu j;
    private final defpackage.vaf k;
    private final defpackage.aoin l;
    private final defpackage.aoin m;

    public vix(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.ajct ajctVar, defpackage.viu viuVar, defpackage.agsm agsmVar, defpackage.oko okoVar, defpackage.vaf vafVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = new defpackage.ajdc(ajctVar);
        this.j = viuVar;
        this.e = agsmVar;
        this.f = okoVar;
        this.k = vafVar;
        this.g = aoinVar2;
        this.l = aoinVar;
        this.m = aoinVar3;
        this.h = aoinVar4;
    }

    public final long a() {
        if (((java.lang.Boolean) this.g.a()).booleanValue()) {
            return ((java.lang.Long) this.l.a()).longValue() + 60000;
        }
        return 65000L;
    }

    public final defpackage.ahru b(android.telecom.PhoneAccountHandle phoneAccountHandle, vgi vgiVar) {
        defpackage.ajcq ajcqVarP;
        defpackage.ajcq ajcqVarZ;
        if (((java.lang.Boolean) this.m.a()).booleanValue()) {
            int iA = vgiVar.a();
            defpackage.aimz aimzVar = a;
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "createNetworkRequestNew", 222, "VvmNetworkRequestImpl.java")).w("Adding network capability from ImapConfig: %d", iA);
            android.net.NetworkRequest.Builder builderAddCapability = new android.net.NetworkRequest.Builder().addCapability(iA);
            boolean z = ((java.lang.Boolean) this.h.a()).booleanValue() && (iA == 0 || iA == 5);
            if (z) {
                ajcqVarZ = defpackage.aiql.z(java.lang.Boolean.TRUE);
            } else {
                ajcqVarZ = !vgiVar.e() ? defpackage.aiql.z(java.lang.Boolean.FALSE) : defpackage.ahrv.g(this.k.a(phoneAccountHandle)).h(new vft(17), this.c);
            }
            if (vgiVar.d() || z) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "createNetworkRequestNew", 261, "VvmNetworkRequestImpl.java")).y("Transport type: CELLULAR for %s", phoneAccountHandle);
                builderAddCapability.addTransportType(0);
                defpackage.ahrv ahrvVarI = defpackage.ahrv.g(this.f.m(phoneAccountHandle)).i(new qgk(13), this.c);
                ajcqVarP = defpackage.ahvr.ak(ahrvVarI, ajcqVarZ).o(new defpackage.joq((defpackage.ajcq) ahrvVarI, builderAddCapability, ajcqVarZ, phoneAccountHandle, 14), this.d);
            } else {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/network/impl/VvmNetworkRequestImpl", "createNetworkRequestNew", 246, "VvmNetworkRequestImpl.java")).y("Transport type: ANY for %s", phoneAccountHandle);
                ajcqVarP = defpackage.ahrv.g(ajcqVarZ).h(new vfp(phoneAccountHandle, builderAddCapability, 6), this.d);
            }
        } else {
            ajcqVarP = defpackage.ahvr.P(new tbb(this, vgiVar, phoneAccountHandle, 14), this.d);
        }
        return defpackage.ahru.b(ajcqVarP).d(new vje(this, 1), this.d);
    }
}
