package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cgh extends defpackage.chd {
    public static final defpackage.cgh a = new defpackage.cgh();

    private cgh() {
        super(1, 2);
    }

    @Override // defpackage.chd
    protected final void a(defpackage.chg chgVar, defpackage.cah cahVar, defpackage.cfp cfpVar, defpackage.cjh cjhVar, defpackage.che cheVar) {
        java.lang.Object objA = ((defpackage.aomy) chgVar.c(0)).a();
        defpackage.cfh cfhVar = (defpackage.cfh) chgVar.c(1);
        int iA = chgVar.a(0);
        cfpVar.P(cfpVar.a(cfhVar), objA);
        cahVar.j(iA, objA);
        cahVar.d(objA);
    }

    @Override // defpackage.chd
    protected final defpackage.cfh b(defpackage.chg chgVar) {
        return (defpackage.cfh) chgVar.c(1);
    }
}
