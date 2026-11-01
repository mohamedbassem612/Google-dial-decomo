package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cgw extends chd {
    public static final defpackage.cgw a = new defpackage.cgw();

    private cgw() {
        super(1, 0);
    }

    protected final void a(chg chgVar, cah cahVar, cfp cfpVar, cjh cjhVar, che cheVar) {
        int iA = chgVar.a(0);
        int i = cfpVar.q;
        int iO = cfpVar.o(i);
        int iD = cfpVar.d(cfpVar.b, cfpVar.h(i + 1));
        for (int iMax = java.lang.Math.max(iO, iD - iA); iMax < iD; iMax++) {
            java.lang.Object obj = cfpVar.c[cfpVar.e(iMax)];
            if (obj instanceof cdw) {
                cjhVar.e((cdw) obj);
            } else if (obj instanceof cdk) {
                ((cdk) obj).c();
            }
        }
        if (iA <= 0) {
            cax.b("Check failed");
        }
        int i2 = cfpVar.q;
        int iN = cfpVar.n(cfpVar.b, cfpVar.h(i2));
        int iD2 = cfpVar.d(cfpVar.b, cfpVar.h(i2 + 1)) - iA;
        if (iD2 < iN) {
            cax.b("Check failed");
        }
        cfpVar.H(iD2, iA, i2);
        int i3 = cfpVar.h;
        if (i3 >= iN) {
            cfpVar.h = i3 - iA;
        }
    }
}
