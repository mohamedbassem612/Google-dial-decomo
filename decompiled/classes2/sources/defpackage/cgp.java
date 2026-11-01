package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cgp extends chd {
    public static final defpackage.cgp a = new defpackage.cgp();

    private cgp() {
        super(0, 1);
    }

    protected final void a(chg chgVar, cah cahVar, cfp cfpVar, cjh cjhVar, che cheVar) {
        cdk cdkVar = (cdk) chgVar.c(0);
        java.util.Set set = cjhVar.a;
        if (set != null) {
            defpackage.cjc cjcVar = new defpackage.cjc(set);
            adw adwVar = cjhVar.i;
            if (adwVar == null) {
                long[] jArr = adx.a;
                adwVar = new adw(6);
                cjhVar.i = adwVar;
            }
            adwVar.n(cdkVar, cjcVar);
            cjhVar.c.n(new cbx(cjcVar, -1));
        }
    }
}
