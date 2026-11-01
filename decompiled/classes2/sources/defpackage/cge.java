package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cge extends chd {
    public static final defpackage.cge a = new defpackage.cge();

    private cge() {
        super(0, 1);
    }

    protected final void a(chg chgVar, cah cahVar, cfp cfpVar, cjh cjhVar, che cheVar) {
        cfc cfcVar;
        cdk cdkVar = (cdk) chgVar.c(0);
        adw adwVar = cjhVar.i;
        if (adwVar == null || ((defpackage.cjc) adwVar.a(cdkVar)) == null) {
            return;
        }
        java.util.ArrayList arrayList = cjhVar.f;
        if (arrayList != null && (cfcVar = (cfc) arrayList.remove(arrayList.size() - 1)) != null) {
            cjhVar.c = cfcVar;
        }
        adwVar.i(cdkVar);
    }
}
