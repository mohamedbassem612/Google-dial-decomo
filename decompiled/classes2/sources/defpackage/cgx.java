package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cgx extends chd {
    public static final defpackage.cgx a = new defpackage.cgx();

    private cgx() {
        super(1, 2);
    }

    protected final void a(chg chgVar, cah cahVar, cfp cfpVar, cjh cjhVar, che cheVar) {
        java.lang.Object objC = chgVar.c(0);
        cfh cfhVar = (cfh) chgVar.c(1);
        boolean z = objC instanceof cdw;
        int iA = chgVar.a(0);
        if (z) {
            cjhVar.h((cdw) objC);
        }
        java.lang.Object objU = cfpVar.u(cfpVar.a(cfhVar), iA, objC);
        if (objU instanceof cdw) {
            cjhVar.e((cdw) objU);
        } else if (objU instanceof cdk) {
            ((cdk) objU).c();
        }
    }
}
