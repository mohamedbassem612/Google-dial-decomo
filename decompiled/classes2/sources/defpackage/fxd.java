package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fxd implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ fxd(cei ceiVar, aciv acivVar, defpackage.bwj bwjVar, ccp ccpVar, aoos aoosVar, int i) {
        this.$cid = i;
        this.a = ceiVar;
        this.e = acivVar;
        this.c = bwjVar;
        this.d = ccpVar;
        this.b = aoosVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [cjt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [aomy, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        int i2 = 3;
        if (i == 0) {
            cav cavVar = (cav) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            int i3 = iIntValue & 3;
            if (cavVar.H(i3 != 2, iIntValue & 1)) {
                java.lang.Object obj3 = this.b;
                java.lang.Object obj4 = this.a;
                boolean zD = cavVar.D(obj4) | cavVar.D(obj3);
                java.lang.Object objG = cavVar.g();
                if (zD || objG == cau.a) {
                    objG = new afx(this.d, obj4, obj3, 18, (char[]) null);
                    cavVar.w(objG);
                }
                java.lang.Object obj5 = this.e;
                ?? r0 = this.c;
                cbp.c(obj4, (aonj) objG, cavVar);
                defpackage.hgt.L((defpackage.fvs) obj4, r0, cfo.j(-497631156, new defpackage.dqv(obj5, obj4, i2), cavVar), cavVar, 384);
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        int i4 = 6;
        if (i == 1) {
            cav cavVar2 = (cav) obj;
            int iIntValue2 = ((java.lang.Integer) obj2).intValue();
            if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                java.lang.Object objG2 = cavVar2.g();
                if (objG2 == cau.a) {
                    defpackage.bgf bgfVar = new defpackage.bgf(this.d, 10);
                    cavVar2.w(bgfVar);
                    objG2 = bgfVar;
                }
                cmw cmwVarE = vn.e((cmw) this.a, (aonj) objG2);
                cye cyeVarB = awo.b(cmh.a, true);
                int iM = anty.M(cavVar2.a());
                cje cjeVarM = cavVar2.M();
                cmw cmwVarM = cfo.m(cavVar2, cmwVarE);
                aomy aomyVar = dam.a;
                cavVar2.L();
                cavVar2.v();
                if (cavVar2.F()) {
                    cavVar2.j(aomyVar);
                } else {
                    cavVar2.x();
                }
                ?? r8 = this.e;
                java.lang.Object obj6 = this.c;
                ?? r1 = this.b;
                cev.c(cavVar2, cyeVarB, dam.e);
                cev.c(cavVar2, cjeVarM, dam.d);
                cev.c(cavVar2, java.lang.Integer.valueOf(iM), dam.f);
                cev.b(cavVar2, dam.g);
                cev.c(cavVar2, cmwVarM, dam.c);
                r1.a(cavVar2, 0);
                ((defpackage.bis) obj6).c(r8, cavVar2, 6);
                cavVar2.n();
            } else {
                cavVar2.s();
            }
            return aojh.a;
        }
        int i5 = 9;
        if (i == 2) {
            cav cavVar3 = (cav) obj;
            int iIntValue3 = ((java.lang.Integer) obj2).intValue();
            if (cavVar3.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                java.lang.Object objG3 = cavVar3.g();
                java.lang.Object obj7 = cau.a;
                if (objG3 == obj7) {
                    defpackage.jpi jpiVar = new defpackage.jpi(this.c, i4);
                    cavVar3.w(jpiVar);
                    objG3 = jpiVar;
                }
                java.lang.Object obj8 = this.a;
                java.lang.Object obj9 = this.d;
                aonj aonjVar = (aonj) objG3;
                boolean zB = cavVar3.B(obj9) | cavVar3.B(obj8);
                java.lang.Object objG4 = cavVar3.g();
                if (zB || objG4 == obj7) {
                    objG4 = new defpackage.dqv(obj9, obj8, i5, null);
                    cavVar3.w(objG4);
                }
                defpackage.jlr.s((defpackage.kbx) this.e, this.b, aonjVar, (aonn) objG4, cavVar3, 384);
            } else {
                cavVar3.s();
            }
            return aojh.a;
        }
        if (i != 3) {
            cav cavVar4 = (cav) obj;
            int iIntValue4 = ((java.lang.Integer) obj2).intValue();
            if (cavVar4.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                cmw cmwVarK = azm.k(cmw.c, ((dpf) cavVar4.e(dfo.e)).dj(((cei) this.a).c()));
                cye cyeVarA = azh.a(awi.b, cmh.m, cavVar4, 6);
                int iM2 = anty.M(cavVar4.a());
                cje cjeVarM2 = cavVar4.M();
                cmw cmwVarM2 = cfo.m(cavVar4, cmwVarK);
                aomy aomyVar2 = dam.a;
                cavVar4.L();
                cavVar4.v();
                if (cavVar4.F()) {
                    cavVar4.j(aomyVar2);
                } else {
                    cavVar4.x();
                }
                java.lang.Object obj10 = this.c;
                java.lang.Object obj11 = this.e;
                cev.c(cavVar4, cyeVarA, dam.e);
                cev.c(cavVar4, cjeVarM2, dam.d);
                cev.c(cavVar4, java.lang.Integer.valueOf(iM2), dam.f);
                cev.b(cavVar4, dam.g);
                cev.c(cavVar4, cmwVarM2, dam.c);
                boolean zD2 = cavVar4.D(obj11) | cavVar4.D(obj10);
                java.lang.Object objG5 = cavVar4.g();
                if (zD2 || objG5 == cau.a) {
                    objG5 = new defpackage.acri((aciv) obj11, (defpackage.bwj) obj10, (ccp) this.d, 1);
                    cavVar4.w(objG5);
                }
                den.aq((aomy) objG5, (cmw) null, false, (crd) null, (bni) null, (ayy) null, cfo.j(-1247707291, new defpackage.bli(obj11, this.b, 16), cavVar4), cavVar4, 805306368, 510);
                cavVar4.n();
            } else {
                cavVar4.s();
            }
            return aojh.a;
        }
        cav cavVar5 = (cav) obj;
        int iIntValue5 = ((java.lang.Integer) obj2).intValue();
        if (cavVar5.H((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
            cmt cmtVar = cmw.c;
            cmw cmwVarBa = den.ba(cmtVar, 0.0f, 4.0f, 0.0f, 0.0f);
            cye cyeVarA2 = aww.a(awi.c, cmh.j, cavVar5, 0);
            int iM3 = anty.M(cavVar5.a());
            cje cjeVarM3 = cavVar5.M();
            cmw cmwVarM3 = cfo.m(cavVar5, cmwVarBa);
            aomy aomyVar3 = dam.a;
            cavVar5.L();
            cavVar5.v();
            if (cavVar5.F()) {
                cavVar5.j(aomyVar3);
            } else {
                cavVar5.x();
            }
            java.lang.Object obj12 = this.e;
            java.lang.Object obj13 = this.a;
            java.lang.Object obj14 = this.c;
            ?? r14 = this.b;
            java.lang.Object obj15 = this.d;
            cev.c(cavVar5, cyeVarA2, dam.e);
            cev.c(cavVar5, cjeVarM3, dam.d);
            cev.c(cavVar5, java.lang.Integer.valueOf(iM3), dam.f);
            cev.b(cavVar5, dam.g);
            cev.c(cavVar5, cmwVarM3, dam.c);
            aehj.bl(den.ba(cmtVar, 16.0f, 0.0f, 0.0f, 0.0f), cfo.j(1971160467, new jai(obj14, obj13, obj12, 9), cavVar5), cavVar5, 54, 0);
            aehj.bj((java.lang.String) obj15, den.aZ(den.ba(cmtVar, 40.0f, 0.0f, 0.0f, 0.0f), 16.0f, 0.0f), 0L, cavVar5, 48, 4);
            r14.a(cavVar5, 0);
            cavVar5.n();
        } else {
            cavVar5.s();
        }
        return aojh.a;
    }

    public /* synthetic */ fxd(cmw cmwVar, ccp ccpVar, aonn aonnVar, defpackage.bis bisVar, aomy aomyVar, int i) {
        this.$cid = i;
        this.a = cmwVar;
        this.d = ccpVar;
        this.b = aonnVar;
        this.c = bisVar;
        this.e = aomyVar;
    }

    public /* synthetic */ fxd(defpackage.fvs fvsVar, defpackage.fxg fxgVar, cjt cjtVar, androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, defpackage.fxf fxfVar, int i) {
        this.$cid = i;
        this.a = fvsVar;
        this.b = fxgVar;
        this.c = cjtVar;
        this.d = snapshotStateList;
        this.e = fxfVar;
    }

    public /* synthetic */ fxd(java.lang.String str, aonn aonnVar, abhw abhwVar, java.lang.String str2, aomy aomyVar, int i) {
        this.$cid = i;
        this.d = str;
        this.b = aonnVar;
        this.c = abhwVar;
        this.a = str2;
        this.e = aomyVar;
    }

    public /* synthetic */ fxd(defpackage.kbx kbxVar, aonj aonjVar, ceg cegVar, ceg cegVar2, ccp ccpVar, int i) {
        this.$cid = i;
        this.e = kbxVar;
        this.b = aonjVar;
        this.d = cegVar;
        this.a = cegVar2;
        this.c = ccpVar;
    }
}
