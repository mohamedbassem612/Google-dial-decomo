package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ata implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ata(aooq aooqVar, ato atoVar, apnt apntVar, int i) {
        this.$cid = i;
        this.a = aooqVar;
        this.b = atoVar;
        this.c = apntVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [cjt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [slh] */
    /* JADX WARN: Type inference failed for: r12v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v101, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v128, types: [aws, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v96, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [azj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v60, types: [ccp, cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v83, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v94, types: [abio, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [ccp, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Throwable {
        csg csgVar;
        long j;
        ?? slhVar = 0;
        switch (this.$cid) {
            case 0:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                ((java.lang.Float) obj2).floatValue();
                aooq aooqVar = (aooq) this.a;
                float f = fFloatValue - aooqVar.a;
                ato atoVar = (ato) this.b;
                aooqVar.a += atoVar.a(atoVar.b(((apnt) this.c).w(atoVar.f(atoVar.a(f)))));
                return aojh.a;
            case 1:
                csj csjVar = (csj) obj;
                float fFloatValue2 = ((java.lang.Float) obj2).floatValue();
                java.lang.Object obj3 = this.c;
                cpn cpnVar = (cpn) obj3;
                if (!cpnVar.i()) {
                    java.lang.Object obj4 = this.a;
                    java.lang.Object obj5 = this.b;
                    float fQ = aooc.q(java.lang.Math.min((float) java.lang.Math.ceil(aooc.q(fFloatValue2, 0.0f)), (float) java.lang.Math.ceil(cpnVar.a() / 2.0f)), 0.0f);
                    float f2 = cpnVar.b;
                    float f3 = cpnVar.c;
                    float f4 = fQ / 2.0f;
                    long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f2 + f4);
                    long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f3 + f4);
                    float f5 = cpnVar.d;
                    float f6 = cpnVar.e;
                    long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits((f5 - f2) - fQ);
                    long jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits((f6 - f3) - fQ);
                    float fA = cpnVar.a();
                    csm csmVar = new csm(fQ, 0.0f, 0, 0, 30);
                    long j2 = ((cpo) obj5).e;
                    if (fQ + fQ > fA) {
                        den.Q(csjVar, (cqd) obj4, cpnVar.d(), cpnVar.c(), j2, (den) null, 240);
                    } else if (java.lang.Float.intBitsToFloat((int) (j2 >> 32)) < f4) {
                        float f7 = f2 + fQ;
                        float f8 = f3 + fQ;
                        float f9 = f5 - fQ;
                        float f10 = f6 - fQ;
                        csg csgVarQ = csjVar.q();
                        long jA = csgVarQ.a();
                        csgVarQ.b().g();
                        try {
                            csgVarQ.c.o(f7, f8, f9, f10, 0);
                            j = jA;
                            csgVar = csgVarQ;
                            try {
                                den.Q(csjVar, (cqd) obj4, ((cpn) obj3).d(), ((cpn) obj3).c(), j2, (den) null, 240);
                                csgVar.b().e();
                                csgVar.h(j);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                csgVar.b().e();
                                csgVar.h(j);
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            csgVar = csgVarQ;
                            j = jA;
                        }
                    } else {
                        den.Q(csjVar, (cqd) obj4, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L), mni.bq(j2, f4), csmVar, 208);
                    }
                }
                return aojh.a;
            case 2:
                cav cavVar = (cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    java.lang.Object objG = cavVar.g();
                    if (objG == cau.a) {
                        defpackage.bgf bgfVar = new defpackage.bgf(this.c, 8);
                        cavVar.w(bgfVar);
                        objG = bgfVar;
                    }
                    cmw cmwVarE = vn.e((cmw) this.b, (aonj) objG);
                    cye cyeVarB = awo.b(cmh.a, true);
                    int iM = anty.M(cavVar.a());
                    cje cjeVarM = cavVar.M();
                    cmw cmwVarM = cfo.m(cavVar, cmwVarE);
                    aomy aomyVar = dam.a;
                    cavVar.L();
                    cavVar.v();
                    if (cavVar.F()) {
                        cavVar.j(aomyVar);
                    } else {
                        cavVar.x();
                    }
                    ?? r0 = this.a;
                    cev.c(cavVar, cyeVarB, dam.e);
                    cev.c(cavVar, cjeVarM, dam.d);
                    cev.c(cavVar, java.lang.Integer.valueOf(iM), dam.f);
                    cev.b(cavVar, dam.g);
                    cev.c(cavVar, cmwVarM, dam.c);
                    r0.a(cavVar, 0);
                    cavVar.n();
                } else {
                    cavVar.s();
                }
                return aojh.a;
            case 3:
                cav cavVar2 = (cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    java.lang.Object obj6 = this.a;
                    java.lang.Object obj7 = this.b;
                    java.lang.Object obj8 = this.c;
                    defpackage.wo.b((defpackage.blw) obj8, cfo.j(201187952, new defpackage.ata(obj7, obj6, obj8, 4, (char[]) null), cavVar2), cavVar2, 56);
                } else {
                    cavVar2.s();
                }
                return aojh.a;
            case 4:
                cav cavVar3 = (cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (cavVar3.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    den.ab(bma.a.b(this.b), cfo.j(1199015344, new defpackage.awu(this.a, this.c, 4, slhVar), cavVar3), cavVar3, 48);
                } else {
                    cavVar3.s();
                }
                return aojh.a;
            case 5:
                cav cavVar4 = (cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                int i = iIntValue4 & 3;
                int i2 = iIntValue4 & 1;
                int i3 = defpackage.brj.a;
                if (cavVar4.H(i != 2, i2)) {
                    cmw cmwVarF = defpackage.rl.f(sl.d(den.aZ((cmw) this.b, 0.0f, 8.0f)), (defpackage.aon) this.c, true);
                    cye cyeVarA = aww.a(awi.c, cmh.j, cavVar4, 0);
                    int iM2 = anty.M(cavVar4.a());
                    cje cjeVarM2 = cavVar4.M();
                    cmw cmwVarM2 = cfo.m(cavVar4, cmwVarF);
                    aomy aomyVar2 = dam.a;
                    cavVar4.L();
                    cavVar4.v();
                    if (cavVar4.F()) {
                        cavVar4.j(aomyVar2);
                    } else {
                        cavVar4.x();
                    }
                    ?? r1 = this.a;
                    cev.c(cavVar4, cyeVarA, dam.e);
                    cev.c(cavVar4, cjeVarM2, dam.d);
                    cev.c(cavVar4, java.lang.Integer.valueOf(iM2), dam.f);
                    cev.b(cavVar4, dam.g);
                    cev.c(cavVar4, cmwVarM2, dam.c);
                    r1.a(awy.a, cavVar4, 6);
                    cavVar4.n();
                } else {
                    cavVar4.s();
                }
                return aojh.a;
            case 6:
                cav cavVar5 = (cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                int i4 = iIntValue5 & 3;
                int i5 = iIntValue5 & 1;
                int i6 = defpackage.brj.a;
                if (cavVar5.H(i4 != 2, i5)) {
                    cmw cmwVarBa = den.ba(this.c.a(cmw.c, 1.0f, true), this.b == null ? 0.0f : 12.0f, 0.0f, 0.0f, 0.0f);
                    cye cyeVarB2 = awo.b(cmh.a, false);
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
                    ?? r2 = this.a;
                    cev.c(cavVar5, cyeVarB2, dam.e);
                    cev.c(cavVar5, cjeVarM3, dam.d);
                    cev.c(cavVar5, java.lang.Integer.valueOf(iM3), dam.f);
                    cev.b(cavVar5, dam.g);
                    cev.c(cavVar5, cmwVarM3, dam.c);
                    r2.a(cavVar5, 0);
                    cavVar5.n();
                } else {
                    cavVar5.s();
                }
                return aojh.a;
            case 7:
                cav cavVar6 = (cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                if (cavVar6.H((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    defpackage.hgt.M(this.c, cfo.j(65670941, new defpackage.dqv(this.b, this.a, 4, slhVar), cavVar6), cavVar6, 48);
                } else {
                    cavVar6.s();
                }
                return aojh.a;
            case 8:
                float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                ((java.lang.Float) obj2).floatValue();
                aoov.an((aoss) this.a, (aolr) null, 0, new defpackage.fxo(fFloatValue3, (defpackage.akr) this.c, (defpackage.fvs) this.b, (aoln) null, 2), 3);
                return aojh.a;
            case 9:
                cav cavVar7 = (cav) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                if (cavVar7.H((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    cmt cmtVar = cmw.c;
                    cmw cmwVarX = den.x(azm.l(sl.d(den.aZ(cmtVar, 0.0f, 8.0f)), 112.0f, 280.0f), "call_log_popup_menu_column");
                    cye cyeVarA2 = aww.a(awi.c, cmh.j, cavVar7, 0);
                    int iM4 = anty.M(cavVar7.a());
                    cje cjeVarM4 = cavVar7.M();
                    cmw cmwVarM4 = cfo.m(cavVar7, cmwVarX);
                    aomy aomyVar4 = dam.a;
                    cavVar7.L();
                    cavVar7.v();
                    if (cavVar7.F()) {
                        cavVar7.j(aomyVar4);
                    } else {
                        cavVar7.x();
                    }
                    java.lang.Object obj9 = this.b;
                    cev.c(cavVar7, cyeVarA2, dam.e);
                    cev.c(cavVar7, cjeVarM4, dam.d);
                    cev.c(cavVar7, java.lang.Integer.valueOf(iM4), dam.f);
                    cev.b(cavVar7, dam.g);
                    cev.c(cavVar7, cmwVarM4, dam.c);
                    kby kbyVar = (kby) obj9;
                    java.lang.String str = kbyVar.b;
                    if (str == null) {
                        cavVar7.u(-1740746299);
                        cavVar7.o();
                    } else {
                        cavVar7.u(-1740746298);
                        abrz.k(str, den.x(azm.o(azm.m(den.ba(cmtVar, 16.0f, 12.0f, 16.0f, 4.0f), 0.0f, 36.0f, 1), cmh.n, 2), "call_log_popup_menu_header"), den.ak(cavVar7).q, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, den.an(cavVar7).h, cavVar7, 0, 0, 131064);
                        cavVar7.o();
                    }
                    cavVar7.u(-1718696012);
                    ailk ailkVarY = kbyVar.c.y(0);
                    aooh.e(ailkVarY, "iterator(...)");
                    while (ailkVarY.hasNext()) {
                        java.lang.Object obj10 = this.a;
                        java.lang.Object obj11 = this.c;
                        defpackage.oqx oqxVar = (defpackage.oqx) ailkVarY.next();
                        cmw cmwVarX2 = den.x(cmtVar, "call_log_popup_menu_item");
                        ayy ayyVarBb = den.bb(16.0f, 2);
                        cja cjaVarJ = cfo.j(122647054, new defpackage.izk(oqxVar, 18), cavVar7);
                        boolean zD = cavVar7.D(oqxVar) | cavVar7.D(obj11) | cavVar7.B(obj10);
                        java.lang.Object objG2 = cavVar7.g();
                        if (zD || objG2 == cau.a) {
                            objG2 = new defpackage.af((java.lang.Object) oqxVar, (android.view.View) obj11, obj10, 17);
                            cavVar7.w(objG2);
                        }
                        aaoo.P(cjaVarJ, (aomy) objG2, cmwVarX2, cfo.j(2004368555, new defpackage.izk(oqxVar, 19), cavVar7), false, (defpackage.brb) null, ayyVarBb, cavVar7, 3462, 368);
                    }
                    cavVar7.o();
                    cavVar7.n();
                } else {
                    cavVar7.s();
                }
                return aojh.a;
            case 10:
                cav cavVar8 = (cav) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                if (cavVar8.H((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    java.lang.Object obj12 = this.a;
                    java.lang.Object obj13 = this.c;
                    cmw cmwVarAY = den.aY(den.bn(cmw.c, den.ak(cavVar8).F, den.am(cavVar8).d), 16.0f);
                    defpackage.mtt mttVar = new defpackage.mtt((defpackage.mtu) obj12);
                    boolean zD2 = cavVar8.D(obj13);
                    java.lang.Object objG3 = cavVar8.g();
                    if (zD2 || objG3 == cau.a) {
                        objG3 = new defpackage.mtr(obj13, false ? 1 : 0);
                        cavVar8.w(objG3);
                    }
                    aomy aomyVar5 = (aomy) objG3;
                    java.lang.Object objG4 = cavVar8.g();
                    if (objG4 == cau.a) {
                        objG4 = new defpackage.mts(0);
                        cavVar8.w(objG4);
                    }
                    defpackage.hgz.I((defpackage.krx) this.b, 2, cmwVarAY, null, aomyVar5, (aonn) objG4, mttVar, null, cavVar8, 1572912, 792);
                } else {
                    cavVar8.s();
                }
                return aojh.a;
            case 11:
                cav cavVar9 = (cav) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                if (cavVar9.H((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    gus.aG(false, false, cfo.j(550909030, new defpackage.ata(this.b, this.c, this.a, 10, (byte[]) null), cavVar9), cavVar9, 384, 3);
                } else {
                    cavVar9.s();
                }
                return aojh.a;
            case 12:
                cav cavVar10 = (cav) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                if (cavVar10.H((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    gus.aG(false, false, cfo.j(2014064189, new defpackage.ata(this.b, this.a, this.c, 13, (char[]) null), cavVar10), cavVar10, 384, 3);
                } else {
                    cavVar10.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                cav cavVar11 = (cav) obj;
                int iIntValue11 = ((java.lang.Integer) obj2).intValue();
                if (cavVar11.H((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    ?? r3 = this.c;
                    ?? r4 = this.a;
                    java.lang.Object obj14 = this.b;
                    rtp rtpVar = (rtp) obj14;
                    rtj rtjVarA = rtpVar.a();
                    boolean zD3 = cavVar11.D(obj14) | cavVar11.D((java.lang.Object) r4);
                    java.lang.Object objG5 = cavVar11.g();
                    if (zD3 || objG5 == cau.a) {
                        hcn hcnVar = new hcn(rtpVar, (aoss) r4, (ccp) r3, (aoln) null, 11);
                        cavVar11.w(hcnVar);
                        objG5 = hcnVar;
                    }
                    cbp.g(rtjVarA, (aonn) objG5, cavVar11);
                    rtj rtjVar = (rtj) r3.a();
                    boolean zD4 = cavVar11.D(obj14);
                    java.lang.Object objG6 = cavVar11.g();
                    if (zD4 || objG6 == cau.a) {
                        objG6 = new qji(obj14, 15);
                        cavVar11.w(objG6);
                    }
                    uu.a(rtjVar, (cmw) null, (aonj) objG6, (cmj) null, (java.lang.String) null, (aonj) null, cfo.j(1197148733, new defpackage.bbs(obj14, 5), cavVar11), cavVar11, 1572864, 58);
                } else {
                    cavVar11.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                cav cavVar12 = (cav) obj;
                int iIntValue12 = ((java.lang.Integer) obj2).intValue();
                if (cavVar12.H((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    cmt cmtVar2 = cmw.c;
                    cmw cmwVarAZ = den.aZ(azm.d(cmtVar2, 1.0f), 24.0f, 16.0f);
                    cye cyeVarA3 = aww.a(awi.e, cmh.k, cavVar12, 54);
                    int iM5 = anty.M(cavVar12.a());
                    cje cjeVarM5 = cavVar12.M();
                    cmw cmwVarM5 = cfo.m(cavVar12, cmwVarAZ);
                    aomy aomyVar6 = dam.a;
                    cavVar12.L();
                    cavVar12.v();
                    if (cavVar12.F()) {
                        cavVar12.j(aomyVar6);
                    } else {
                        cavVar12.x();
                    }
                    aonn aonnVar = dam.e;
                    cev.c(cavVar12, cyeVarA3, aonnVar);
                    aonn aonnVar2 = dam.d;
                    cev.c(cavVar12, cjeVarM5, aonnVar2);
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM5);
                    aonn aonnVar3 = dam.f;
                    cev.c(cavVar12, numValueOf, aonnVar3);
                    aonj aonjVar = dam.g;
                    cev.b(cavVar12, aonjVar);
                    aonn aonnVar4 = dam.c;
                    cev.c(cavVar12, cmwVarM5, aonnVar4);
                    dfa.f(2132017965, cavVar12);
                    dfa.f(2132017963, cavVar12);
                    java.lang.String strF = dfa.f(2132017964, cavVar12);
                    cye cyeVarB3 = awo.b(cmh.a, false);
                    int iM6 = anty.M(cavVar12.a());
                    cje cjeVarM6 = cavVar12.M();
                    cmw cmwVarM6 = cfo.m(cavVar12, cmtVar2);
                    cavVar12.L();
                    cavVar12.v();
                    if (cavVar12.F()) {
                        cavVar12.j(aomyVar6);
                    } else {
                        cavVar12.x();
                    }
                    ?? r9 = this.b;
                    ?? r5 = this.c;
                    cev.c(cavVar12, cyeVarB3, aonnVar);
                    cev.c(cavVar12, cjeVarM6, aonnVar2);
                    cev.c(cavVar12, java.lang.Integer.valueOf(iM6), aonnVar3);
                    cev.b(cavVar12, aonjVar);
                    cev.c(cavVar12, cmwVarM6, aonnVar4);
                    aaoo.J(cfo.j(1051302991, new qyh((java.lang.Object) r5, (java.lang.Object) r9, 6), cavVar12), cfo.j(-1466928530, new qyh(strF, (java.lang.Object) r5, 7, (byte[]) null), cavVar12), (cmw) null, 0.0f, cavVar12, 54);
                    boolean zC = a.C((ccp) r5);
                    java.lang.Object objG7 = cavVar12.g();
                    if (objG7 == cau.a) {
                        objG7 = new pqf((java.lang.Object) r5, 10);
                        cavVar12.w(objG7);
                    }
                    aaoo.Q(zC, (aomy) objG7, (cmw) null, 0L, (defpackage.aon) null, (defpackage.drs) null, (crd) null, 0L, 0.0f, cfo.j(1097445929, new jai((ryq) this.a, (ccp) r9, (ccp) r5, 5), cavVar12), cavVar12, 48, 48, 2044);
                    cavVar12.n();
                    cavVar12.n();
                } else {
                    cavVar12.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                cav cavVar13 = (cav) obj;
                int iIntValue13 = ((java.lang.Integer) obj2).intValue();
                int i7 = iIntValue13 & 3;
                int i8 = iIntValue13 & 1;
                java.util.List list = sme.a;
                if (cavVar13.H(i7 != 2, i8)) {
                    skf skfVar = (skf) this.b;
                    skd skdVar = skfVar.b;
                    skd skdVar2 = skdVar instanceof skd ? skdVar : null;
                    java.lang.Object obj15 = this.a;
                    if (skdVar2 != null) {
                        sko skoVar = skdVar2.e;
                        slhVar = new slh(skdVar2.a, skdVar2.b, skdVar2.f, skoVar != null ? smj.a(skoVar) : null, skdVar2.c, ((smu) obj15).t, true, skfVar.c ? null : skfVar.k, skfVar.a != 0);
                    }
                    ?? r6 = this.c;
                    abjl abjlVar = (abjl) r6.a();
                    boolean zB = cavVar13.B(obj15) | cavVar13.B((java.lang.Object) r6);
                    java.lang.Object objG8 = cavVar13.g();
                    if (zB || objG8 == cau.a) {
                        objG8 = new slv(obj15, (java.lang.Object) r6, 1);
                        cavVar13.w(objG8);
                    }
                    smj.d((slh) slhVar, abjlVar, (aonj) objG8, ((smu) obj15).u, skfVar.l, cavVar13, 0, 0);
                } else {
                    cavVar13.s();
                }
                return aojh.a;
            case 16:
                cav cavVar14 = (cav) obj;
                int iIntValue14 = ((java.lang.Integer) obj2).intValue();
                int i9 = iIntValue14 & 3;
                int i10 = iIntValue14 & 1;
                java.util.List list2 = sme.a;
                if (cavVar14.H(i9 != 2, i10)) {
                    cmt cmtVar3 = cmw.c;
                    cmw cmwVarX3 = den.x(cmtVar3, "onboarding_flow_top_bar_measurement");
                    cye cyeVarB4 = awo.b(cmh.a, false);
                    int iM7 = anty.M(cavVar14.a());
                    cje cjeVarM7 = cavVar14.M();
                    cmw cmwVarM7 = cfo.m(cavVar14, cmwVarX3);
                    aomy aomyVar7 = dam.a;
                    cavVar14.L();
                    cavVar14.v();
                    if (cavVar14.F()) {
                        cavVar14.j(aomyVar7);
                    } else {
                        cavVar14.x();
                    }
                    java.lang.Object obj16 = this.c;
                    java.lang.Object obj17 = this.a;
                    cev.c(cavVar14, cyeVarB4, dam.e);
                    cev.c(cavVar14, cjeVarM7, dam.d);
                    cev.c(cavVar14, java.lang.Integer.valueOf(iM7), dam.f);
                    cev.b(cavVar14, dam.g);
                    cev.c(cavVar14, cmwVarM7, dam.c);
                    cmw cmwVarBa2 = den.ba(cmtVar3, 0.0f, 0.0f, 0.0f, 16.0f);
                    boolean zB2 = cavVar14.B(obj17) | cavVar14.B(obj16);
                    java.lang.Object objG9 = cavVar14.g();
                    if (zB2 || objG9 == cau.a) {
                        objG9 = new qza(obj17, obj16, 13);
                        cavVar14.w(objG9);
                    }
                    snl.c((skf) this.b, (smu) obj17, (aomy) objG9, cmwVarBa2, cavVar14, 3072);
                    cavVar14.n();
                } else {
                    cavVar14.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                cav cavVar15 = (cav) obj;
                int iIntValue15 = ((java.lang.Integer) obj2).intValue();
                if (cavVar15.H((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    smj.f(((slh) this.b).g, (aomy) this.a, cfd.K(den.ba(this.c.a(cmw.c, cmh.h), 0.0f, 0.0f, 0.0f, 36.0f), 1.6f, 1.6f, 0.0f, 0.0f, 0.0f, (crd) null, false, 0, 1048572), cavVar15, 0);
                } else {
                    cavVar15.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                cav cavVar16 = (cav) obj;
                int iIntValue16 = ((java.lang.Integer) obj2).intValue();
                if (cavVar16.H((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    java.lang.Object obj18 = this.c;
                    java.lang.Object obj19 = this.a;
                    java.lang.Object obj20 = this.b;
                    int i11 = true != ((tfk) obj20).d ? 2131231060 : 2131231083;
                    boolean zB3 = cavVar16.B(obj19) | cavVar16.B(obj20) | cavVar16.D(obj18);
                    java.lang.Object objG10 = cavVar16.g();
                    if (zB3 || objG10 == cau.a) {
                        defpackage.obp obpVar = new defpackage.obp(obj19, obj20, obj18, 14, (byte[]) null);
                        cavVar16.w(obpVar);
                        objG10 = obpVar;
                    }
                    aaoo.aC((aomy) objG10, (cmw) null, false, (defpackage.bpw) null, (kaw) null, (crd) null, cfo.j(1856259436, new peb(i11, 8), cavVar16), cavVar16, 1572864, 62);
                } else {
                    cavVar16.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                cav cavVar17 = (cav) obj;
                int iIntValue17 = ((java.lang.Integer) obj2).intValue();
                if (cavVar17.H((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    afsq.bg((defpackage.awv) this.c, (defpackage.abgx) this.a, (dpq) this.b, cavVar17, 0);
                } else {
                    cavVar17.s();
                }
                return aojh.a;
            default:
                cav cavVar18 = (cav) obj;
                int iIntValue18 = ((java.lang.Integer) obj2).intValue();
                if (cavVar18.H((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    aehj.bM((vx) this.c, (abio) this.a, (defpackage.bpw) this.b, cavVar18, 0);
                } else {
                    cavVar18.s();
                }
                return aojh.a;
        }
    }

    public /* synthetic */ ata(aoss aossVar, defpackage.akr akrVar, defpackage.fvs fvsVar, int i) {
        this.$cid = i;
        this.a = aossVar;
        this.c = akrVar;
        this.b = fvsVar;
    }

    public /* synthetic */ ata(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ata(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ata(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ata(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }
}
