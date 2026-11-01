package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anmf extends defpackage.anmc {
    private final defpackage.anmc a;
    private final defpackage.anme b;

    public anmf(defpackage.anmc anmcVar, defpackage.anme anmeVar) {
        this.a = anmcVar;
        if (anmeVar == null) {
            throw new java.lang.NullPointerException("interceptor");
        }
        this.b = anmeVar;
    }

    @Override // defpackage.anmc
    public final java.lang.String a() {
        return this.a.a();
    }

    @Override // defpackage.anmc
    public final defpackage.ajsz b(anpk anpkVar, defpackage.anmb anmbVar) {
        return this.b.b(anpkVar, anmbVar, this.a);
    }
}
