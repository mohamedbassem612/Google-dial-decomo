package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cgj extends defpackage.chd {
    public static final defpackage.cgj a = new defpackage.cgj();

    private cgj() {
        super(0, 3);
    }

    @Override // defpackage.chd
    protected final void a(defpackage.chg chgVar, defpackage.cah cahVar, defpackage.cfp cfpVar, defpackage.cjh cjhVar, defpackage.che cheVar) {
        defpackage.che chfVar;
        defpackage.cfm cfmVar = (defpackage.cfm) chgVar.c(1);
        defpackage.cfh cfhVar = (defpackage.cfh) chgVar.c(0);
        defpackage.cfs cfsVar = (defpackage.cfs) chgVar.c(2);
        defpackage.cfp cfpVarF = cfmVar.f();
        if (cheVar != null) {
            try {
                chfVar = new chf(cheVar, cfpVar);
            } catch (java.lang.Throwable th) {
                cfpVarF.x(false);
                throw th;
            }
        } else {
            chfVar = null;
        }
        if (!cfsVar.b.j()) {
            defpackage.cax.b("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cfsVar.a.l(cahVar, cfpVarF, cjhVar, chfVar);
        cfpVarF.x(true);
        cfpVar.w();
        cfpVar.W(cfmVar, cfmVar.d(cfhVar));
        cfpVar.y();
    }
}
