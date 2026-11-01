package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cha extends defpackage.chd {
    public static final defpackage.cha a = new defpackage.cha();

    private cha() {
        super(1, 1);
    }

    @Override // defpackage.chd
    protected final void a(defpackage.chg chgVar, defpackage.cah cahVar, defpackage.cfp cfpVar, defpackage.cjh cjhVar, defpackage.che cheVar) {
        java.lang.Object objC = chgVar.c(0);
        boolean z = objC instanceof defpackage.cdw;
        int iA = chgVar.a(0);
        if (z) {
            cjhVar.h((defpackage.cdw) objC);
        }
        java.lang.Object objU = cfpVar.u(cfpVar.o, iA, objC);
        if (objU instanceof defpackage.cdw) {
            cjhVar.e((defpackage.cdw) objU);
        } else if (objU instanceof defpackage.cdk) {
            ((defpackage.cdk) objU).c();
        }
    }
}
