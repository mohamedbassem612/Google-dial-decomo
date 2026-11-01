package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahkg implements defpackage.anme {
    public final defpackage.akaw a;
    public long b;
    public final defpackage.aogc c;
    private final defpackage.ahyn d;
    private final defpackage.ahyn e;

    public ahkg(defpackage.aogc aogcVar, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.akaw akawVar) {
        this.c = aogcVar;
        this.d = ahynVar;
        this.e = ahynVar2;
        this.a = akawVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [aoin, java.lang.Object] */
    @Override // defpackage.anme
    public final defpackage.ajsz b(anpk anpkVar, defpackage.anmb anmbVar, defpackage.anmc anmcVar) {
        if (!((java.lang.Boolean) ((defpackage.ahys) this.d).a).booleanValue()) {
            return anmcVar.b(anpkVar, anmbVar);
        }
        return new ahkf(this, anmcVar.b(anpkVar, anmbVar), (ahix) ((defpackage.ahys) this.e).a.a(), anpkVar);
    }
}
