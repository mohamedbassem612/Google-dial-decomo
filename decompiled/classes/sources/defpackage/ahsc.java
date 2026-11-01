package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahsc implements defpackage.anme {
    private final /* synthetic */ int $cid;

    public ahsc(int i) {
        this.$cid = i;
    }

    @Override // defpackage.anme
    public final defpackage.ajsz b(anpk anpkVar, defpackage.anmb anmbVar, defpackage.anmc anmcVar) {
        int i = this.$cid;
        if (i == 0) {
            return new ahsf(anmcVar.b(anpkVar, anmbVar));
        }
        if (i == 1) {
            return new ahkc(anmcVar.b(anpkVar, anmbVar), "gRPC:".concat(anpkVar.b), defpackage.ahqz.b());
        }
        if (i == 2) {
            return anmbVar.f(ajzy.a) == null ? anmcVar.b(anpkVar, anmbVar) : new akbb(this, anmcVar, anpkVar, anmbVar, anmv.k());
        }
        defpackage.akar akarVar = (defpackage.akar) anmbVar.f(defpackage.akar.a);
        return akarVar != null ? defpackage.ajsz.dt(anmcVar, new defpackage.akbq(new defpackage.aeur(new zlk(akarVar, 16), 8), defpackage.albh.class, defpackage.albh.class)).b(anpkVar, anmbVar) : anmcVar.b(anpkVar, anmbVar);
    }
}
