package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class izz implements aonp {
    final /* synthetic */ java.util.List a;

    public izz(java.util.List list) {
        this.a = list;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) throws aois {
        int i;
        nf nfVar = (nf) obj;
        int iIntValue = ((java.lang.Number) obj2).intValue();
        cav cavVar = (cav) obj3;
        int iIntValue2 = ((java.lang.Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != cavVar.B(nfVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != cavVar.z(iIntValue) ? 16 : 32;
        }
        if (cavVar.H((i & 147) != 146, i & 1)) {
            defpackage.hhe hheVar = (defpackage.hhe) this.a.get(iIntValue);
            cavVar.u(-913532075);
            ajb ajbVar = defpackage.jaa.a;
            bdf bdfVar = new bdf(den.bv(500, 0, defpackage.jaa.a, 2));
            int iAa = anty.aa(hheVar);
            if (iAa == 0) {
                cavVar.u(-1414928906);
                defpackage.hhe.t((defpackage.jab) hheVar, bdfVar, cavVar, 0);
                cavVar.o();
            } else {
                if (iAa != 1) {
                    cavVar.u(-1414930194);
                    cavVar.o();
                    throw new aois();
                }
                cavVar.u(-1414926639);
                defpackage.hhe.u(bdfVar, cavVar, 0);
                cavVar.o();
            }
            cavVar.o();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
