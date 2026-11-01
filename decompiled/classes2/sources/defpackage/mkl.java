package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mkl implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ ccp f;

    public /* synthetic */ mkl(aomy aomyVar, ccp ccpVar, defpackage.mkn mknVar, java.util.List list, cei ceiVar, aonj aonjVar, int i) {
        this.$cid = i;
        this.a = aomyVar;
        this.b = ccpVar;
        this.c = mknVar;
        this.d = list;
        this.f = ceiVar;
        this.e = aonjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [cer, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = 9;
        int i2 = 0;
        if (this.$cid == 0) {
            cav cavVar = (cav) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            int i3 = iIntValue & 3;
            if (cavVar.H(i3 != 2, iIntValue & 1)) {
                cmt cmtVar = cmw.c;
                cmw cmwVarX = den.x(cmtVar, "DIALPAD_SIM_SELECTOR");
                cye cyeVarB = awo.b(cmh.a, false);
                int iM = anty.M(cavVar.a());
                cje cjeVarM = cavVar.M();
                cmw cmwVarM = cfo.m(cavVar, cmwVarX);
                aomy aomyVar = dam.a;
                cavVar.L();
                cavVar.v();
                if (cavVar.F()) {
                    cavVar.j(aomyVar);
                } else {
                    cavVar.x();
                }
                ?? r10 = this.b;
                java.lang.Object obj3 = this.a;
                cev.c(cavVar, cyeVarB, dam.e);
                cev.c(cavVar, cjeVarM, dam.d);
                cev.c(cavVar, java.lang.Integer.valueOf(iM), dam.f);
                cev.b(cavVar, dam.g);
                cev.c(cavVar, cmwVarM, dam.c);
                boolean zB = cavVar.B((java.lang.Object) r10) | cavVar.B(obj3);
                java.lang.Object objG = cavVar.g();
                aonn aonnVarJ = null;
                if (zB || objG == cau.a) {
                    objG = new defpackage.ksu(obj3, r10, 7, null == true ? 1 : 0);
                    cavVar.w(objG);
                }
                aomy aomyVar2 = (aomy) objG;
                java.lang.String strF = dfa.f(true != a.C((ccp) r10) ? 2132020141 : 2132020142, cavVar);
                java.lang.String strF2 = dfa.f(2132020140, cavVar);
                boolean zB2 = cavVar.B(strF) | cavVar.B(strF2) | cavVar.B(aomyVar2);
                java.lang.Object objG2 = cavVar.g();
                if (zB2 || objG2 == cau.a) {
                    objG2 = new defpackage.mkm(strF, strF2, aomyVar2, i2);
                    cavVar.w(objG2);
                }
                java.lang.Object obj4 = this.c;
                cmw cmwVarB = dig.b(cmtVar, true, (aonj) objG2);
                android.graphics.drawable.Icon icon = ((defpackage.mkn) obj4).d;
                if (icon == null) {
                    cavVar.u(-701694981);
                    cavVar.o();
                } else {
                    cavVar.u(-701694980);
                    aonnVarJ = cfo.j(308814598, new defpackage.kmh(icon, i), cavVar);
                    cavVar.o();
                }
                abrz.v(false, aomyVar2, cfo.j(-848505509, new defpackage.kmh(obj4, 10), cavVar), cmwVarB, false, aonnVarJ, defpackage.mkk.a, (crd) null, (bte) null, (btg) null, (amu) null, (awa) null, (ayy) null, cavVar, 1573254, 0, 16272);
                cmw cmwVarL = azm.l(cmtVar, 200.0f, Float.NaN);
                bfx bfxVar = den.am(cavVar).d;
                boolean zC = a.C((ccp) r10);
                boolean zB3 = cavVar.B((java.lang.Object) r10);
                java.lang.Object objG3 = cavVar.g();
                if (zB3 || objG3 == cau.a) {
                    objG3 = new defpackage.kgq(r10, 19);
                    cavVar.w(objG3);
                }
                aaoo.Q(zC, (aomy) objG3, cmwVarL, 0L, (defpackage.aon) null, (defpackage.drs) null, bfxVar, 0L, 0.0f, cfo.j(-1013182551, new afd(this.d, this.f, (java.lang.Object) r10, this.e, 2), cavVar), cavVar, 100663680, 48, 1720);
                cavVar.n();
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        cav cavVar2 = (cav) obj;
        int iIntValue2 = ((java.lang.Integer) obj2).intValue();
        int i4 = iIntValue2 & 3;
        int i5 = iIntValue2 & 1;
        ayy ayyVar = defpackage.bwh.a;
        if (cavVar2.H(i4 != 2, i5)) {
            cmt cmtVar2 = cmw.c;
            java.lang.Object objG4 = cavVar2.g();
            java.lang.Object obj5 = cau.a;
            if (objG4 == obj5) {
                defpackage.bru bruVar = new defpackage.bru(this.f, i);
                cavVar2.w(bruVar);
                objG4 = bruVar;
            }
            cmw cmwVarE = vn.e(cmtVar2, (aonj) objG4);
            cmj cmjVar = cmh.a;
            cye cyeVarB2 = awo.b(cmjVar, false);
            int iM2 = anty.M(cavVar2.a());
            cje cjeVarM2 = cavVar2.M();
            cmw cmwVarM2 = cfo.m(cavVar2, cmwVarE);
            aomy aomyVar3 = dam.a;
            cavVar2.L();
            cavVar2.v();
            if (cavVar2.F()) {
                cavVar2.j(aomyVar3);
            } else {
                cavVar2.x();
            }
            ?? r11 = this.a;
            java.lang.Object obj6 = this.d;
            java.lang.Object obj7 = this.c;
            aonn aonnVar = dam.e;
            cev.c(cavVar2, cyeVarB2, aonnVar);
            aonn aonnVar2 = dam.d;
            cev.c(cavVar2, cjeVarM2, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM2);
            aonn aonnVar3 = dam.f;
            cev.c(cavVar2, numValueOf, aonnVar3);
            aonj aonjVar = dam.g;
            cev.b(cavVar2, aonjVar);
            aonn aonnVar4 = dam.c;
            cev.c(cavVar2, cmwVarM2, aonnVar4);
            cavVar2.t(-1350495383, java.lang.Integer.valueOf(((java.lang.Number) r11.a()).intValue()));
            boolean zB4 = cavVar2.B(obj7) | cavVar2.B(obj6);
            java.lang.Object objG5 = cavVar2.g();
            if (zB4 || objG5 == obj5) {
                objG5 = new bly(obj7, obj6, 13);
                cavVar2.w(objG5);
            }
            cmw cmwVarJ = cfd.J(cmtVar2, (aonj) objG5);
            cye cyeVarB3 = awo.b(cmjVar, false);
            int iM3 = anty.M(cavVar2.a());
            cje cjeVarM3 = cavVar2.M();
            cmw cmwVarM3 = cfo.m(cavVar2, cmwVarJ);
            cavVar2.L();
            cavVar2.v();
            if (cavVar2.F()) {
                cavVar2.j(aomyVar3);
            } else {
                cavVar2.x();
            }
            java.lang.Object obj8 = this.b;
            ?? r0 = this.e;
            cev.c(cavVar2, cyeVarB3, aonnVar);
            cev.c(cavVar2, cjeVarM3, aonnVar2);
            cev.c(cavVar2, java.lang.Integer.valueOf(iM3), aonnVar3);
            cev.b(cavVar2, aonjVar);
            cev.c(cavVar2, cmwVarM3, aonnVar4);
            r0.a(obj8, cavVar2, 6);
            cavVar2.n();
            cavVar2.m();
            cavVar2.n();
        } else {
            cavVar2.s();
        }
        return aojh.a;
    }

    public /* synthetic */ mkl(ccp ccpVar, cer cerVar, cer cerVar2, cer cerVar3, aono aonoVar, vx vxVar, int i) {
        this.$cid = i;
        this.f = ccpVar;
        this.c = cerVar;
        this.d = cerVar2;
        this.a = cerVar3;
        this.e = aonoVar;
        this.b = vxVar;
    }
}
