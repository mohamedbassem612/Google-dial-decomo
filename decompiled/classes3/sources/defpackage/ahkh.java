package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahkh implements defpackage.akbp {
    private ajcq a;

    static {
        anoz anozVar = anph.b;
        int i = anpc.d;
        new anoy("Authorization", anozVar);
        new anoy("X-Auth-Time", anph.b);
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcc a() {
        return defpackage.akcc.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd b() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd c() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcc d() {
        return defpackage.akcc.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd e() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd f() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final defpackage.akcc g(defpackage.aljf aljfVar) {
        anqt anqtVar;
        try {
            throw null;
        } catch (java.util.concurrent.ExecutionException e) {
            if (((akaw) ((anmb) aljfVar.a).f(defpackage.akax.a)).h()) {
                anqtVar = e.getCause() instanceof android.accounts.NetworkErrorException ? anqt.o : anqt.q;
            } else {
                anqtVar = anqt.c;
            }
            java.util.List list = anqw.a;
            return defpackage.akcc.b(anqtVar.a().e(e.getCause()).f("Could not obtain auth token"), new anph());
        }
    }

    @Override // defpackage.akbp
    public final defpackage.akcc h(defpackage.aljf aljfVar) {
        anmb anmbVar = (anmb) aljfVar.a;
        ajcq ajcqVar = (ajcq) anmbVar.f(defpackage.ahjx.a);
        anmb anmbVarE = anmbVar.e(defpackage.akad.a, new defpackage.akad());
        if (ajcqVar == null) {
            return new defpackage.akcc(1, null, null, anmbVarE);
        }
        this.a = ajcqVar;
        ahvr.ci(ajcqVar);
        return new defpackage.akcc(4, null, ajcqVar, anmbVarE);
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd i(apjb apjbVar) {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd j(apjb apjbVar) {
        return defpackage.akcd.a;
    }
}
