package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lby implements defpackage.kif {
    private final defpackage.aoin a;
    private final defpackage.aoin b;
    private final defpackage.rsr c;

    public lby(defpackage.rsr rsrVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        defpackage.aooh.f(aoinVar, "enableAgenticCallScreen");
        defpackage.aooh.f(aoinVar2, "gacsUseGeminiBranding");
        this.c = rsrVar;
        this.a = aoinVar;
        this.b = aoinVar2;
    }

    @Override // defpackage.kif
    public final kie a(defpackage.kiu kiuVar) {
        int i;
        defpackage.aooh.f(kiuVar, "row");
        defpackage.rsr rsrVar = this.c;
        defpackage.mmy mmyVarO = rsrVar.O(kiuVar);
        if (hgu.aH(rsrVar, kiuVar) || mmyVarO.j) {
            int iAR = defpackage.a.aR(mmyVarO.n);
            i = (iAR == 0 || iAR != 4) ? 1 : 2;
        } else {
            i = 3;
        }
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                jhw jhwVarF = hgt.F(kie.a.m());
                jhwVarF.u(2131231357);
                jhwVarF.v(2);
                jhwVarF.t(2132017194);
                return jhwVarF.s();
            }
        } else if (!((java.lang.Boolean) this.a.a()).booleanValue() || !((java.lang.Boolean) this.b.a()).booleanValue()) {
            jhw jhwVarF2 = hgt.F(kie.a.m());
            jhwVarF2.u(2131231909);
            jhwVarF2.v(1);
            jhwVarF2.t(2132017196);
            return jhwVarF2.s();
        }
        return null;
    }

    @Override // defpackage.kif
    public final /* synthetic */ kie b(kip kipVar) {
        defpackage.aooh.f(kipVar, "row");
        return null;
    }
}
