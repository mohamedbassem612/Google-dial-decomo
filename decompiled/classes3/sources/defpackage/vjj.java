package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vjj implements defpackage.vjc {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/advvm/AdvvmProvisioner");
    public static final vcr b;
    public final defpackage.vka c;
    public final defpackage.vjm d;
    public final vku e;
    public final aolr f;
    public final rlv g;
    private final aoss h;

    static {
        defpackage.uzx uzxVarAN = wsc.aN(vcr.a.m());
        uzxVarAN.c(wsc.aO(vcq.a.m()).e());
        b = uzxVarAN.a();
    }

    public vjj(defpackage.vka vkaVar, defpackage.vjm vjmVar, vku vkuVar, aolr aolrVar, aoss aossVar, rlv rlvVar) {
        aooh.f(vjmVar, "advvmSmsBuilder");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rlvVar, "loggingBindings");
        this.c = vkaVar;
        this.d = vjmVar;
        this.e = vkuVar;
        this.f = aolrVar;
        this.h = aossVar;
        this.g = rlvVar;
    }

    @Override // defpackage.vjc
    public final ajcq a(defpackage.veo veoVar) {
        aooh.f(veoVar, "statusMessage");
        return aosv.F(this.h, 0, new uer(veoVar, (aoln) null, 5), 3);
    }

    @Override // defpackage.vjc
    public final ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.veo veoVar, defpackage.vjb vjbVar) {
        aooh.f(phoneAccountHandle, "phoneAccountHandle");
        aooh.f(veoVar, "statusMessage");
        aooh.f(vjbVar, "status");
        return aosv.F(this.h, 0, new defpackage.uhy(this, vjbVar, phoneAccountHandle, veoVar, (aoln) null, 2), 3);
    }
}
