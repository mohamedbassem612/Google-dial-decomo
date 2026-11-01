package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class qyh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ qyh(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [abko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [afe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [pez] */
    /* JADX WARN: Type inference failed for: r2v17, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v80, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v87, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String strE;
        abmv abmvVarA;
        int i = 9;
        int i2 = 6;
        ?? qyiVar = 0;
        dmqVarL = null;
        defpackage.dmq dmqVarL = null;
        int i3 = 3;
        switch (this.$cid) {
            case 0:
                defpackage.cav cavVar = (defpackage.cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    defpackage.cmt cmtVar = defpackage.cmw.c;
                    defpackage.cmw cmwVarAZ = defpackage.den.aZ(defpackage.azm.m(cmtVar, 0.0f, 88.0f, 1), 16.0f, 4.0f);
                    defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.f(16.0f), defpackage.cmh.n, cavVar, 54);
                    int iM = defpackage.anty.M(cavVar.a());
                    defpackage.cje cjeVarM = cavVar.M();
                    defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar, cmwVarAZ);
                    defpackage.aomy aomyVar = defpackage.dam.a;
                    cavVar.L();
                    cavVar.v();
                    if (cavVar.F()) {
                        cavVar.j(aomyVar);
                    } else {
                        cavVar.x();
                    }
                    java.lang.Object obj3 = this.a;
                    defpackage.cev.c(cavVar, cyeVarA, defpackage.dam.e);
                    defpackage.cev.c(cavVar, cjeVarM, defpackage.dam.d);
                    defpackage.cev.c(cavVar, java.lang.Integer.valueOf(iM), defpackage.dam.f);
                    defpackage.cev.b(cavVar, defpackage.dam.g);
                    defpackage.cev.c(cavVar, cmwVarM, defpackage.dam.c);
                    defpackage.azk azkVar = defpackage.azk.a;
                    quf qufVar = (quf) obj3;
                    int i4 = qufVar.c;
                    if (i4 != 0) {
                        if (i4 != 2) {
                            i3 = i4 != 13 ? 0 : 2;
                        } else {
                            i3 = 1;
                        }
                    }
                    if (i3 == 0) {
                        throw null;
                    }
                    int i5 = i3 - 1;
                    if (i5 == 0) {
                        qyiVar = new qyi(i4 == 2 ? ((java.lang.Integer) qufVar.d).intValue() : 0);
                    } else if (i5 == 1) {
                        qyiVar = new qyj(i4 == 13 ? ((java.lang.Integer) qufVar.d).intValue() : 0);
                    } else if (i5 != 2) {
                        throw new defpackage.aois();
                    }
                    java.lang.String str = qufVar.g;
                    defpackage.aooh.e(str, "getLabel(...)");
                    defpackage.pez.co(qyiVar, str, defpackage.azm.g(cmtVar, 56.0f), qufVar.i, qufVar.j, cavVar, 384);
                    defpackage.pez.bH(qufVar, azkVar.a(cmtVar, 1.0f, true), qufVar.i, cavVar, 0);
                    if (qufVar.j) {
                        cavVar.u(-396375536);
                        qug qugVarB = qug.b(qufVar.e);
                        if (qugVarB == null) {
                            qugVarB = qug.a;
                        }
                        defpackage.pez.bK(qugVarB, this.b, null, qufVar.i, cavVar, 0);
                        cavVar.o();
                    } else {
                        cavVar.u(-396216971);
                        cavVar.o();
                    }
                    cavVar.n();
                } else {
                    cavVar.s();
                }
                return defpackage.aojh.a;
            case 1:
                defpackage.cav cavVar2 = (defpackage.cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    defpackage.mni.cf(((qvc) this.b).d, defpackage.den.x(this.a, "audio_route_selector"), cavVar2, 0);
                } else {
                    cavVar2.s();
                }
                return defpackage.aojh.a;
            case 2:
                defpackage.cav cavVar3 = (defpackage.cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (cavVar3.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    java.lang.Object obj4 = this.a;
                    cavVar3.u(-1127081439);
                    defpackage.cmt cmtVar2 = defpackage.cmw.c;
                    defpackage.cmw cmwVarL = defpackage.uu.l(cmtVar2, new ayn(defpackage.uu.h(cavVar3), 32));
                    if (((gnk) obj4).a()) {
                        cavVar3.u(190268114);
                        cavVar3.o();
                    } else {
                        cavVar3.u(1945800291);
                        int i6 = ((android.content.res.Configuration) cavVar3.e(defpackage.dep.a)).orientation;
                        cavVar3.o();
                        if (i6 == 2) {
                            cmwVarL = cmwVarL.a(defpackage.uu.l(cmtVar2, new ayn(defpackage.uu.h(cavVar3), 9)));
                        }
                    }
                    java.lang.Object obj5 = this.b;
                    cavVar3.o();
                    defpackage.pez.bE((qyz) obj5, cmwVarL, cavVar3, 0);
                } else {
                    cavVar3.s();
                }
                return defpackage.aojh.a;
            case 3:
                defpackage.cav cavVar4 = (defpackage.cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (cavVar4.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    defpackage.mni.cg(((qzm) this.b).d, defpackage.uu.m(defpackage.den.x(this.a, "more_menu"), defpackage.uu.f(cavVar4)), cavVar4, 0);
                } else {
                    cavVar4.s();
                }
                return defpackage.aojh.a;
            case 4:
                defpackage.cav cavVar5 = (defpackage.cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (cavVar5.H((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    java.lang.Object obj6 = this.b;
                    java.lang.Object obj7 = this.a;
                    rdk rdkVar = (rdk) obj6;
                    java.lang.Object objA = rdkVar.q.a();
                    defpackage.aooh.e(objA, "get(...)");
                    boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                    java.lang.Object objA2 = rdkVar.r.a();
                    defpackage.aooh.e(objA2, "get(...)");
                    defpackage.pez.J((pqa) obj7, zBooleanValue, ((java.lang.Boolean) objA2).booleanValue(), cavVar5, 0);
                } else {
                    cavVar5.s();
                }
                return defpackage.aojh.a;
            case 5:
                defpackage.cav cavVar6 = (defpackage.cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                if (cavVar6.H((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    java.lang.Object obj8 = this.a;
                    java.lang.Object obj9 = this.b;
                    pdv pdvVar = (pdv) obj8;
                    pdu pduVar = pdvVar.b == 2 ? (pdu) pdvVar.c : pdu.a;
                    defpackage.aooh.e(pduVar, "getBackgroundImage(...)");
                    rdk rdkVar2 = (rdk) obj9;
                    rcc rccVarD = rdkVar2.d();
                    if (rccVarD == null || (strE = rccVarD.a) == null) {
                        strE = rdkVar2.e();
                    }
                    pef.b(rdkVar2.K.t(pduVar, strE, false), cavVar6, 0);
                } else {
                    cavVar6.s();
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.cav cavVar7 = (defpackage.cav) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                if (cavVar7.H((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    acqt acqtVar = acqt.a;
                    java.lang.Object objG = cavVar7.g();
                    if (objG == defpackage.cau.a) {
                        pqf pqfVar = new pqf(this.a, 12);
                        cavVar7.w(pqfVar);
                        objG = pqfVar;
                    }
                    acqtVar.e((defpackage.aomy) objG, (defpackage.cmw) null, false, (bvi) null, (defpackage.bni) null, (defpackage.ayy) null, defpackage.cfo.j(-207762827, new defpackage.ped(this.b, i2), cavVar7), cavVar7, 806879238, 6);
                } else {
                    cavVar7.s();
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cav cavVar8 = (defpackage.cav) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                if (cavVar8.H((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    ?? r2 = this.a;
                    java.lang.Object obj10 = this.b;
                    acqt acqtVar2 = acqt.a;
                    boolean zC = defpackage.a.C(r2);
                    defpackage.cmt cmtVar3 = defpackage.cmw.c;
                    boolean zB = cavVar8.B(obj10);
                    java.lang.Object objG2 = cavVar8.g();
                    if (zB || objG2 == defpackage.cau.a) {
                        objG2 = new qji(obj10, 19);
                        cavVar8.w(objG2);
                    }
                    defpackage.cmw cmwVarB = defpackage.dig.b(cmtVar3, false, (defpackage.aonj) objG2);
                    java.lang.Object objG3 = cavVar8.g();
                    if (objG3 == defpackage.cau.a) {
                        objG3 = new qji((java.lang.Object) r2, 20);
                        cavVar8.w(objG3);
                    }
                    acqtVar2.f(zC, (defpackage.aonj) objG3, cmwVarB, false, (bvi) null, (defpackage.bni) null, (defpackage.ayy) null, defpackage.cfo.j(1059982018, new defpackage.ped(r2, 5), cavVar8), cavVar8, 12582960, 54);
                } else {
                    cavVar8.s();
                }
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cav cavVar9 = (defpackage.cav) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                if (cavVar9.H((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    defpackage.snl.W((ryq) this.b, defpackage.snl.V(this.a).a, cavVar9, 0);
                } else {
                    cavVar9.s();
                }
                return defpackage.aojh.a;
            case 9:
                defpackage.cav cavVar10 = (defpackage.cav) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                if (cavVar10.H((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    defpackage.snl.T(defpackage.cfo.j(-29274909, new defpackage.qyh(this.a, this.b, 10), cavVar10), cavVar10, 6);
                } else {
                    cavVar10.s();
                }
                return defpackage.aojh.a;
            case 10:
                defpackage.cav cavVar11 = (defpackage.cav) obj;
                int iIntValue11 = ((java.lang.Integer) obj2).intValue();
                if (cavVar11.H((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    java.lang.Object obj11 = this.b;
                    java.lang.Object obj12 = this.a;
                    defpackage.aesg.h(new aejq(((rza) obj12).h, (aekp) obj11), defpackage.cfo.j(598474589, new qxy(obj12, 19), cavVar11), cavVar11, 48);
                } else {
                    cavVar11.s();
                }
                return defpackage.aojh.a;
            case 11:
                defpackage.cav cavVar12 = (defpackage.cav) obj;
                int iIntValue12 = ((java.lang.Integer) obj2).intValue();
                if (cavVar12.H((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    defpackage.abny.c(null, null, null, null, null, null, null, null, false, null, null, 0, defpackage.cfo.j(624422450, new defpackage.qyh(this.a, this.b, i), cavVar12), cavVar12, 0, 384, 4095);
                } else {
                    cavVar12.s();
                }
                return defpackage.aojh.a;
            case 12:
                defpackage.cav cavVar13 = (defpackage.cav) obj;
                int iIntValue13 = ((java.lang.Integer) obj2).intValue();
                int i7 = iIntValue13 & 3;
                int i8 = iIntValue13 & 1;
                java.util.List list = sme.a;
                if (cavVar13.H(i7 != 2, i8)) {
                    sme.e((skf) this.a, (smu) this.b, cavVar13, 0);
                } else {
                    cavVar13.s();
                }
                return defpackage.aojh.a;
            case 13:
                defpackage.cav cavVar14 = (defpackage.cav) obj;
                int iIntValue14 = ((java.lang.Integer) obj2).intValue();
                int i9 = iIntValue14 & 3;
                int i10 = iIntValue14 & 1;
                java.util.List list2 = sme.a;
                if (cavVar14.H(i9 != 2, i10)) {
                    java.lang.Object obj13 = this.a;
                    java.lang.Object obj14 = this.b;
                    defpackage.cbd cbdVar = defpackage.dfo.e;
                    defpackage.den.ab(cbdVar.b(new defpackage.dpg(((defpackage.dpf) cavVar14.e(cbdVar)).a(), 1.0f)), defpackage.cfo.j(1168091163, new defpackage.qyh(obj14, obj13, 17, qyiVar), cavVar14), cavVar14, 56);
                } else {
                    cavVar14.s();
                }
                return defpackage.aojh.a;
            case 14:
                defpackage.cav cavVar15 = (defpackage.cav) obj;
                int iIntValue15 = ((java.lang.Integer) obj2).intValue();
                int i11 = iIntValue15 & 3;
                int i12 = iIntValue15 & 1;
                java.util.List list3 = sme.a;
                if (cavVar15.H(i11 != 2, i12)) {
                    java.lang.Object obj15 = this.b;
                    java.lang.Object obj16 = this.a;
                    defpackage.cmw cmwVarG = defpackage.un.g(defpackage.cmw.c, 0.0f, 2.0f);
                    defpackage.dpf dpfVar = (defpackage.dpf) cavVar15.e(defpackage.dfo.e);
                    long j = sll.a;
                    defpackage.aaoo.V((defpackage.css) obj16, (java.lang.String) obj15, defpackage.azm.g(cmwVarG, dpfVar.dh(sll.a)), defpackage.den.ak(cavVar15).q, cavVar15, 8, 0);
                } else {
                    cavVar15.s();
                }
                return defpackage.aojh.a;
            case 15:
                defpackage.cav cavVar16 = (defpackage.cav) obj;
                int iIntValue16 = ((java.lang.Integer) obj2).intValue();
                int i13 = iIntValue16 & 3;
                int i14 = iIntValue16 & 1;
                java.util.List list4 = sme.a;
                if (cavVar16.H(i13 != 2, i14)) {
                    defpackage.cmt cmtVar4 = defpackage.cmw.c;
                    defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
                    int iM2 = defpackage.anty.M(cavVar16.a());
                    defpackage.cje cjeVarM2 = cavVar16.M();
                    defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVar16, cmtVar4);
                    defpackage.aomy aomyVar2 = defpackage.dam.a;
                    cavVar16.L();
                    cavVar16.v();
                    if (cavVar16.F()) {
                        cavVar16.j(aomyVar2);
                    } else {
                        cavVar16.x();
                    }
                    java.lang.Object obj17 = this.b;
                    java.lang.Object obj18 = this.a;
                    defpackage.cev.c(cavVar16, cyeVarB, defpackage.dam.e);
                    defpackage.cev.c(cavVar16, cjeVarM2, defpackage.dam.d);
                    defpackage.cev.c(cavVar16, java.lang.Integer.valueOf(iM2), defpackage.dam.f);
                    defpackage.cev.b(cavVar16, defpackage.dam.g);
                    defpackage.cev.c(cavVar16, cmwVarM2, defpackage.dam.c);
                    defpackage.cbd cbdVar2 = defpackage.dfo.e;
                    defpackage.den.ab(cbdVar2.b(new defpackage.dpg(((defpackage.dpf) cavVar16.e(cbdVar2)).a(), 1.0f)), defpackage.cfo.j(-423470854, new defpackage.qyh(obj18, obj17, 14), cavVar16), cavVar16, 56);
                    cavVar16.n();
                } else {
                    cavVar16.s();
                }
                return defpackage.aojh.a;
            case 16:
                defpackage.cav cavVar17 = (defpackage.cav) obj;
                int iIntValue17 = ((java.lang.Integer) obj2).intValue();
                int i15 = iIntValue17 & 3;
                int i16 = iIntValue17 & 1;
                java.util.List list5 = sme.a;
                if (cavVar17.H(i15 != 2, i16)) {
                    this.b.a(this.a, cavVar17, 0);
                } else {
                    cavVar17.s();
                }
                return defpackage.aojh.a;
            case 17:
                defpackage.cav cavVar18 = (defpackage.cav) obj;
                int iIntValue18 = ((java.lang.Integer) obj2).intValue();
                int i17 = iIntValue18 & 3;
                int i18 = iIntValue18 & 1;
                java.util.List list6 = sme.a;
                if (cavVar18.H(i17 != 2, i18)) {
                    java.lang.Object obj19 = this.b;
                    defpackage.cmt cmtVar5 = defpackage.cmw.c;
                    boolean zB2 = cavVar18.B(obj19);
                    java.lang.Object objG4 = cavVar18.g();
                    if (zB2 || objG4 == defpackage.cau.a) {
                        objG4 = new skx(obj19, 8);
                        cavVar18.w(objG4);
                    }
                    java.lang.Object obj20 = this.a;
                    defpackage.cmw cmwVarB2 = defpackage.dig.b(cmtVar5, false, (defpackage.aonj) objG4);
                    defpackage.dkz dkzVar = defpackage.den.an(cavVar18).d;
                    long j2 = sll.a;
                    long jH = defpackage.dpy.h(4294967296L, defpackage.dps.a(sll.a) / ((defpackage.dpf) cavVar18.e(defpackage.dfo.e)).b());
                    if (obj20 != null && (abmvVarA = smj.a((sko) obj20)) != null) {
                        dmqVarL = defpackage.abts.L(abmvVarA);
                    }
                    defpackage.abrz.k("A", cmwVarB2, 0L, jH, null, dmqVarL, 0L, null, 0L, 0, false, 0, 0, null, dkzVar, cavVar18, 6, 0, 130924);
                } else {
                    cavVar18.s();
                }
                return defpackage.aojh.a;
            case 18:
                defpackage.cav cavVar19 = (defpackage.cav) obj;
                int iIntValue19 = ((java.lang.Integer) obj2).intValue();
                int i19 = iIntValue19 & 3;
                int i20 = iIntValue19 & 1;
                java.util.List list7 = sme.a;
                if (cavVar19.H(i19 != 2, i20)) {
                    java.lang.Object obj21 = this.b;
                    skf skfVar = (skf) this.a;
                    sme.g(skfVar.e, skfVar.b, (smu) obj21, cavVar19, 0);
                } else {
                    cavVar19.s();
                }
                return defpackage.aojh.a;
            case 19:
                defpackage.cav cavVar20 = (defpackage.cav) obj;
                int iIntValue20 = ((java.lang.Integer) obj2).intValue();
                if (cavVar20.H((iIntValue20 & 3) != 2, iIntValue20 & 1)) {
                    defpackage.aehj.ao(this.a, (defpackage.cmw) ((defpackage.aoot) this.b).a, null, cavVar20, 0, 4);
                } else {
                    cavVar20.s();
                }
                return defpackage.aojh.a;
            default:
                defpackage.cav cavVar21 = (defpackage.cav) obj;
                int iIntValue21 = ((java.lang.Integer) obj2).intValue();
                if (cavVar21.H((iIntValue21 & 3) != 2, iIntValue21 & 1)) {
                    defpackage.cmi cmiVar = defpackage.cmh.k;
                    defpackage.cmt cmtVar6 = defpackage.cmw.c;
                    defpackage.cye cyeVarA2 = defpackage.aww.a(defpackage.awi.c, cmiVar, cavVar21, 48);
                    int iM3 = defpackage.anty.M(cavVar21.a());
                    defpackage.cje cjeVarM3 = cavVar21.M();
                    defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVar21, cmtVar6);
                    defpackage.aomy aomyVar3 = defpackage.dam.a;
                    cavVar21.L();
                    cavVar21.v();
                    if (cavVar21.F()) {
                        cavVar21.j(aomyVar3);
                    } else {
                        cavVar21.x();
                    }
                    ?? r7 = this.b;
                    ?? r0 = this.a;
                    defpackage.cev.c(cavVar21, cyeVarA2, defpackage.dam.e);
                    defpackage.cev.c(cavVar21, cjeVarM3, defpackage.dam.d);
                    defpackage.cev.c(cavVar21, java.lang.Integer.valueOf(iM3), defpackage.dam.f);
                    defpackage.cev.b(cavVar21, defpackage.dam.g);
                    defpackage.cev.c(cavVar21, cmwVarM3, defpackage.dam.c);
                    defpackage.ttj.n(r0, defpackage.uot.d, cavVar21, 48);
                    defpackage.den.aR(defpackage.azm.e(cmtVar6, 8.0f), cavVar21);
                    defpackage.ttj.s(r0, defpackage.dfa.f(2132018665, cavVar21), r7, 0, cavVar21, 0, 4);
                    cavVar21.n();
                } else {
                    cavVar21.s();
                }
                return defpackage.aojh.a;
        }
    }

    public /* synthetic */ qyh(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
