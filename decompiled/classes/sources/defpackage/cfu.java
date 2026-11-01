package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cfu extends defpackage.chd {
    public static final defpackage.cfu a = new defpackage.cfu();

    private cfu() {
        super(0, 2);
    }

    @Override // defpackage.chd
    protected final void a(defpackage.chg chgVar, defpackage.cah cahVar, defpackage.cfp cfpVar, defpackage.cjh cjhVar, defpackage.che cheVar) {
        defpackage.cfh cfhVar = (defpackage.cfh) chgVar.c(0);
        java.lang.Object objC = chgVar.c(1);
        if (objC instanceof defpackage.cdw) {
            cjhVar.h((defpackage.cdw) objC);
        }
        if (cfpVar.m != 0) {
            defpackage.cax.b("Can only append a slot if not current inserting");
        }
        int i = cfpVar.h;
        int i2 = cfpVar.i;
        int iA = cfpVar.a(cfhVar);
        int iD = cfpVar.d(cfpVar.b, cfpVar.h(iA + 1));
        cfpVar.h = iD;
        cfpVar.i = iD;
        cfpVar.C(1, iA);
        if (i >= iD) {
            i++;
            i2++;
        }
        cfpVar.c[iD] = objC;
        cfpVar.h = i;
        cfpVar.i = i2;
    }
}
