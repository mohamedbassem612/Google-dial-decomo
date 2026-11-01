package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahjy implements defpackage.anme {
    private final defpackage.akaw a;

    public ahjy(defpackage.akaw akawVar) {
        this.a = akawVar;
    }

    @Override // defpackage.anme
    public final defpackage.ajsz b(anpk anpkVar, defpackage.anmb anmbVar, defpackage.anmc anmcVar) {
        defpackage.aooh.f(anmbVar, "callOptions");
        defpackage.akaw akawVar = this.a;
        long jA = akawVar.a();
        defpackage.anmb anmbVarE = anmbVar.e(akax.a, akawVar);
        if (jA > 0) {
            anmbVarE = anmbVarE.e(anuj.d, java.lang.Integer.valueOf((int) jA));
        }
        return anmcVar.b(anpkVar, anmbVarE);
    }
}
