package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cgv extends chd {
    public static final defpackage.cgv a = new defpackage.cgv();

    private cgv() {
        super(0, 1);
    }

    protected final void a(chg chgVar, cah cahVar, cfp cfpVar, cjh cjhVar, che cheVar) {
        cdk cdkVar = (cdk) chgVar.c(0);
        adw adwVar = cjhVar.i;
        defpackage.cjc cjcVar = adwVar != null ? (defpackage.cjc) adwVar.a(cdkVar) : null;
        if (cjcVar != null) {
            java.util.ArrayList arrayList = cjhVar.f;
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                cjhVar.f = arrayList;
            }
            arrayList.add(cjhVar.c);
            cjhVar.c = cjcVar.a;
        }
    }
}
