package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class slr implements aonn {
    public final /* synthetic */ defpackage.ske a;
    public final /* synthetic */ defpackage.smu b;

    public /* synthetic */ slr(defpackage.ske skeVar, defpackage.smu smuVar) {
        this.a = skeVar;
        this.b = smuVar;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        float f;
        float f2;
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int i = iIntValue & 3;
        int i2 = iIntValue & 1;
        java.util.List list = defpackage.sme.a;
        if (cavVar.H(i != 2, i2)) {
            cmt cmtVar = cmw.c;
            cmw cmwVarA = bac.a(den.aZ(azm.d(cmtVar, 1.0f), 32.0f, 32.0f));
            cye cyeVarA = aww.a(awi.c, cmh.j, cavVar, 0);
            int iM = anty.M(cavVar.a());
            cje cjeVarM = cavVar.M();
            cmw cmwVarM = cfo.m(cavVar, cmwVarA);
            aomy aomyVar = dam.a;
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar);
            } else {
                cavVar.x();
            }
            defpackage.smu smuVar = this.b;
            defpackage.ske skeVar = this.a;
            aonn aonnVar = dam.e;
            cev.c(cavVar, cyeVarA, aonnVar);
            aonn aonnVar2 = dam.d;
            cev.c(cavVar, cjeVarM, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar3 = dam.f;
            cev.c(cavVar, numValueOf, aonnVar3);
            aonj aonjVar = dam.g;
            cev.b(cavVar, aonjVar);
            aonn aonnVar4 = dam.c;
            cev.c(cavVar, cmwVarM, aonnVar4);
            if (skeVar instanceof defpackage.skd) {
                cavVar.u(1554184951);
                java.lang.String strF = dfa.f(2132019732, cavVar);
                defpackage.sko skoVar = ((defpackage.skd) skeVar).e;
                float f3 = skoVar != null ? skoVar.d : defpackage.sjz.a.c.d;
                aonj aonjVar2 = smuVar.o;
                float f4 = defpackage.smf.a;
                f2 = 16.0f;
                f = 0.0f;
                defpackage.sme.o(null, strF, f3, aonjVar2, new defpackage.aopm(defpackage.smf.d, defpackage.smf.e), cavVar, 0);
                den.aR(azm.e(cmtVar, 16.0f), cavVar);
                java.lang.String strF2 = dfa.f(2132019731, cavVar);
                float f5 = skoVar != null ? skoVar.e : defpackage.sjz.a.c.e;
                boolean zB = cavVar.B(smuVar);
                java.lang.Object objG = cavVar.g();
                if (zB || objG == cau.a) {
                    objG = new defpackage.skx(smuVar, 6);
                    cavVar.w(objG);
                }
                defpackage.sme.o(null, strF2, f5, (aonj) objG, new defpackage.aopm(defpackage.smf.f, defpackage.smf.g), cavVar, 0);
                den.aR(azm.e(cmtVar, 16.0f), cavVar);
                defpackage.sme.o(null, dfa.f(2132019719, cavVar), skoVar != null ? skoVar.g : defpackage.sjz.a.c.g, smuVar.q, new defpackage.aopm(0.0f, defpackage.smf.h), cavVar, 0);
                cavVar.o();
            } else {
                f = 0.0f;
                f2 = 16.0f;
                cavVar.u(1555530351);
                cavVar.o();
            }
            den.aR(azm.e(cmtVar, f2), cavVar);
            cmw cmwVarD = azm.d(cmtVar, 1.0f);
            cye cyeVarA2 = azh.a(awi.b, cmh.m, cavVar, 6);
            int iM2 = anty.M(cavVar.a());
            cje cjeVarM2 = cavVar.M();
            cmw cmwVarM2 = cfo.m(cavVar, cmwVarD);
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar);
            } else {
                cavVar.x();
            }
            cev.c(cavVar, cyeVarA2, aonnVar);
            cev.c(cavVar, cjeVarM2, aonnVar2);
            cev.c(cavVar, java.lang.Integer.valueOf(iM2), aonnVar3);
            cev.b(cavVar, aonjVar);
            cev.c(cavVar, cmwVarM2, aonnVar4);
            aomy aomyVar2 = smuVar.s;
            ayy ayyVar = acpl.a;
            aaoo.ak(aomyVar2, den.ba(cmtVar, f, f, 8.0f, f), false, (crd) null, acpl.a(den.ak(cavVar).p, den.ak(cavVar).a, cavVar, 12), (bnm) null, (amu) null, (ayy) null, defpackage.slj.a, cavVar, 805306416, 492);
            aaoo.ak(smuVar.r, (cmw) null, false, (crd) null, acpl.a(den.ak(cavVar).a, den.ak(cavVar).b, cavVar, 12), (bnm) null, (amu) null, (ayy) null, defpackage.slj.b, cavVar, 805306368, 494);
            cavVar.n();
            cavVar.n();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
