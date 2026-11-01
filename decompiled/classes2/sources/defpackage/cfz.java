package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cfz extends chd {
    public static final defpackage.cfz a = new defpackage.cfz();

    private cfz() {
        super(0, 2);
    }

    protected final void a(chg chgVar, cah cahVar, cfp cfpVar, cjh cjhVar, che cheVar) {
        int i;
        cjb cjbVar = (cjb) chgVar.c(0);
        int iA = cfpVar.a((cfh) chgVar.c(1));
        if (cfpVar.o >= iA) {
            cax.b("Check failed");
        }
        defpackage.cjq.b(cfpVar, cahVar, iA);
        int i2 = cfpVar.o;
        int iL = cfpVar.q;
        while (iL >= 0 && !cfpVar.S(iL)) {
            iL = cfpVar.l(iL);
        }
        int iJ = iL + 1;
        int iM = 0;
        while (iJ < i2) {
            if (cfpVar.R(i2, iJ)) {
                if (true == cfpVar.S(iJ)) {
                    iM = 0;
                }
                iJ++;
            } else {
                iM += cfpVar.S(iJ) ? 1 : cfpVar.k(iJ);
                iJ += cfpVar.j(iJ);
            }
        }
        while (true) {
            i = cfpVar.o;
            if (i >= iA) {
                break;
            }
            if (cfpVar.R(iA, i)) {
                int i3 = cfpVar.o;
                if (i3 < cfpVar.p && (cfpVar.b[(cfpVar.h(i3) * 5) + 1] & 1073741824) != 0) {
                    cahVar.d(cfpVar.t(i3));
                    iM = 0;
                }
                cfpVar.J();
            } else {
                iM += cfpVar.m();
            }
        }
        if (i != iA) {
            cax.b("Check failed");
        }
        cjbVar.a = iM;
    }
}
