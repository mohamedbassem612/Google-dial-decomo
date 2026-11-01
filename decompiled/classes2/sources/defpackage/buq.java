package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class buq implements aono {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ defpackage.but b;
    public final /* synthetic */ defpackage.but c;
    public final /* synthetic */ agxr d;

    public /* synthetic */ buq(defpackage.but butVar, defpackage.but butVar2, agxr agxrVar, java.lang.String str) {
        this.b = butVar;
        this.c = butVar2;
        this.d = agxrVar;
        this.a = str;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        aonn aonnVar = (aonn) obj;
        cav cavVar = (cav) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != cavVar.D(aonnVar) ? 2 : 4;
        }
        if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
            agxr agxrVar = this.d;
            defpackage.but butVar = this.c;
            defpackage.but butVar2 = this.b;
            boolean zN = aooh.n(butVar2, butVar);
            ajl ajlVarAi = den.ai(4, cavVar);
            boolean zB = cavVar.B(butVar2) | cavVar.D(agxrVar);
            java.lang.Object objG = cavVar.g();
            if (zB || objG == cau.a) {
                objG = new defpackage.ny(butVar2, agxrVar, 19, null);
                cavVar.w(objG);
            }
            aomy aomyVar = (aomy) objG;
            java.lang.Object objG2 = cavVar.g();
            java.lang.Object obj4 = cau.a;
            if (objG2 == obj4) {
                objG2 = aij.a(true != zN ? 1.0f : 0.0f);
                cavVar.w(objG2);
            }
            aii aiiVar = (aii) objG2;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zN);
            boolean zD = cavVar.D(aiiVar) | cavVar.C(zN) | cavVar.D(ajlVarAi) | cavVar.B(aomyVar);
            java.lang.Object objG3 = cavVar.g();
            if (zD || objG3 == obj4) {
                defpackage.bus busVar = new defpackage.bus(aiiVar, zN, (aiq) ajlVarAi, aomyVar, (aoln) null, 0);
                cavVar.w(busVar);
                objG3 = busVar;
            }
            cbp.g(boolValueOf, (aonn) objG3, cavVar);
            air airVar = aiiVar.b;
            ajl ajlVarAi2 = den.ai(1, cavVar);
            java.lang.Object objG4 = cavVar.g();
            if (objG4 == obj4) {
                objG4 = aij.a(true != zN ? 1.0f : 0.8f);
                cavVar.w(objG4);
            }
            aii aiiVar2 = (aii) objG4;
            boolean zD2 = cavVar.D(aiiVar2) | cavVar.C(zN) | cavVar.D(ajlVarAi2);
            java.lang.Object objG5 = cavVar.g();
            if (zD2 || objG5 == obj4) {
                objG5 = new defpackage.hyg(aiiVar2, zN, (aiq) ajlVarAi2, (aoln) null, 1);
                cavVar.w(objG5);
            }
            java.lang.String str = this.a;
            cbp.g(boolValueOf, (aonn) objG5, cavVar);
            air airVar2 = aiiVar2.b;
            cmw cmwVarK = cfd.K(cmw.c, ((java.lang.Number) airVar2.a()).floatValue(), ((java.lang.Number) airVar2.a()).floatValue(), ((java.lang.Number) airVar.a()).floatValue(), 0.0f, 0.0f, (crd) null, false, 0, 1048568);
            boolean zC = cavVar.C(zN) | cavVar.B(butVar2) | cavVar.B(str);
            java.lang.Object objG6 = cavVar.g();
            if (zC || objG6 == obj4) {
                objG6 = new defpackage.bud(zN, str, butVar2, 2);
                cavVar.w(objG6);
            }
            cmw cmwVarB = dig.b(cmwVarK, false, (aonj) objG6);
            cye cyeVarB = awo.b(cmh.a, false);
            int iM = anty.M(cavVar.a());
            cje cjeVarM = cavVar.M();
            cmw cmwVarM = cfo.m(cavVar, cmwVarB);
            aomy aomyVar2 = dam.a;
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar2);
            } else {
                cavVar.x();
            }
            cev.c(cavVar, cyeVarB, dam.e);
            cev.c(cavVar, cjeVarM, dam.d);
            cev.c(cavVar, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVar, dam.g);
            cev.c(cavVar, cmwVarM, dam.c);
            aonnVar.a(cavVar, java.lang.Integer.valueOf(iIntValue & 14));
            cavVar.n();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
