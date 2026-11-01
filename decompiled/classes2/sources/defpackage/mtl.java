package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mtl implements aonn {
    public final /* synthetic */ defpackage.mtn a;

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        csx csxVarI;
        long jS;
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        boolean z = true;
        if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
            cmt cmtVar = cmw.c;
            cmw cmwVarD = azm.d(den.ba(cmtVar, 20.0f, 16.0f, 20.0f, 24.0f), 1.0f);
            cye cyeVarA = aww.a(awi.c, cmh.j, cavVar, 0);
            int iM = anty.M(cavVar.a());
            cje cjeVarM = cavVar.M();
            cmw cmwVarM = cfo.m(cavVar, cmwVarD);
            aomy aomyVar = dam.a;
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar);
            } else {
                cavVar.x();
            }
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
            cmw cmwVarD2 = azm.d(cmtVar, 1.0f);
            cye cyeVarA2 = azh.a(awi.f(8.0f), cmh.n, cavVar, 54);
            int iM2 = anty.M(cavVar.a());
            cje cjeVarM2 = cavVar.M();
            cmw cmwVarM2 = cfo.m(cavVar, cmwVarD2);
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar);
            } else {
                cavVar.x();
            }
            defpackage.mtn mtnVar = this.a;
            cev.c(cavVar, cyeVarA2, aonnVar);
            cev.c(cavVar, cjeVarM2, aonnVar2);
            cev.c(cavVar, java.lang.Integer.valueOf(iM2), aonnVar3);
            cev.b(cavVar, aonjVar);
            cev.c(cavVar, cmwVarM2, aonnVar4);
            boolean z2 = mtnVar.d;
            if (z2) {
                cavVar.u(-943800753);
                csxVarI = aehj.aL(defpackage.abja.fs, cavVar);
                cavVar.o();
            } else {
                cavVar.u(-943734010);
                csxVarI = wv.i(2131231550, cavVar, 6);
                cavVar.o();
            }
            cavVar.u(662299856);
            cmw cmwVarG = azm.g(cmtVar, 16.0f);
            if (z2) {
                cmwVarG = cmwVarG.a(aehj.aO(cmtVar, abts.F(cavVar).w));
            } else {
                z = false;
            }
            cavVar.o();
            if (z) {
                cavVar.u(662305730);
                cavVar.o();
                jS = cfd.S();
            } else {
                cavVar.u(662307104);
                jS = den.ak(cavVar).f;
                cavVar.o();
            }
            aaoo.W(csxVarI, (java.lang.String) null, cmwVarG, jS, cavVar, 48, 0);
            java.lang.String strF = mtnVar.c;
            if (strF == null || strF.length() <= 0) {
                strF = null;
            }
            if (strF == null) {
                cavVar.u(662311155);
                strF = dfa.f(2132018364, cavVar);
            } else {
                cavVar.u(662309264);
            }
            cavVar.o();
            abrz.k(strF, (cmw) null, den.ak(cavVar).f, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, den.an(cavVar).n, cavVar, 0, 0, 131066);
            cavVar.n();
            long j = den.ak(cavVar).A;
            java.lang.String strF2 = dfa.f(2132018472, cavVar);
            boolean zB = cavVar.B(mtnVar) | cavVar.A(j) | cavVar.B(strF2);
            java.lang.Object objG = cavVar.g();
            if (zB || objG == cau.a) {
                defpackage.kiy kiyVar = new defpackage.kiy(mtnVar, j, strF2, 2);
                cavVar.w(kiyVar);
                objG = kiyVar;
            }
            afsq.bm(afsq.bl((aonj) objG), den.ba(cmtVar, 0.0f, 12.0f, 0.0f, 0.0f), den.ak(cavVar).q, 0L, (dot) null, 0, false, 0, den.an(cavVar).h, cavVar, 48, 504);
            cavVar.n();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
