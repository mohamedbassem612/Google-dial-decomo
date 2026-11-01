package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vjg implements defpackage.viy {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/advvm/AdvvmGreetingProcessor");
    public final vgu b;
    public final aoss c;
    public final aolr d;
    public final ajct e;
    public final vpq f;
    public final rsr g;

    public vjg(vgu vguVar, rsr rsrVar, aoss aossVar, aolr aolrVar, ajct ajctVar, vpq vpqVar) {
        aooh.f(vguVar, "imapOperationsFactory");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(ajctVar, "lightweightExecutor");
        this.b = vguVar;
        this.g = rsrVar;
        this.c = aossVar;
        this.d = aolrVar;
        this.e = ajctVar;
        this.f = vpqVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoit */
    @Override // defpackage.viy
    public final /* bridge */ /* synthetic */ ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) throws aoit {
        aooh.f(phoneAccountHandle, "phoneAccountHandle");
        throw new aoit("An operation is not implemented.");
    }

    @Override // defpackage.viy
    public final ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        aooh.f(phoneAccountHandle, "phoneAccountHandle");
        return aosv.F(this.c, 0, new defpackage.vjf(this, phoneAccountHandle, (aoln) null, 0), 3);
    }

    @Override // defpackage.viy
    public final ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.vci vciVar) {
        aooh.f(phoneAccountHandle, "phoneAccountHandle");
        aooh.f(vciVar, "vvmGreeting");
        return aosv.F(this.c, 0, new defpackage.ugg(this, phoneAccountHandle, vciVar, (aoln) null, 14), 3);
    }
}
