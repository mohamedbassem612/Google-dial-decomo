package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cfv extends chd {
    public static final defpackage.cfv a = new defpackage.cfv();

    private cfv() {
        super(0, 2);
    }

    protected final void a(chg chgVar, cah cahVar, cfp cfpVar, cjh cjhVar, che cheVar) {
        cjb cjbVar = (cjb) chgVar.c(1);
        int i = cjbVar != null ? cjbVar.a : 0;
        can canVar = (can) chgVar.c(0);
        if (i > 0) {
            cahVar = new defpackage.ccr(cahVar, i);
        }
        canVar.l(cahVar, cfpVar, cjhVar, cheVar != null ? new defpackage.chf(cheVar, cfpVar) : null);
    }
}
