package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ped implements defpackage.aono {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ped(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [bry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [aono, java.lang.Object] */
    @Override // defpackage.aono
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        long jM;
        abhk abhkVar;
        java.lang.String strValueOf;
        long j;
        xua xuaVar = null;
        switch (this.$cid) {
            case 0:
                defpackage.cav cavVar = (defpackage.cav) obj2;
                int iIntValue = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((afe) obj, "$this$AnimatedVisibility");
                if (cavVar.H((iIntValue & 17) != 16, iIntValue & 1)) {
                    defpackage.cmt cmtVar = defpackage.cmw.c;
                    defpackage.cmw cmwVarC = defpackage.azm.c(defpackage.den.x(cmtVar, "image_background_tag"), 1.0f);
                    defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.e, false);
                    int iM = defpackage.anty.M(cavVar.a());
                    defpackage.cje cjeVarM = cavVar.M();
                    defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar, cmwVarC);
                    defpackage.aomy aomyVar = defpackage.dam.a;
                    cavVar.L();
                    cavVar.v();
                    if (cavVar.F()) {
                        cavVar.j(aomyVar);
                    } else {
                        cavVar.x();
                    }
                    java.lang.Object obj4 = this.a;
                    defpackage.cev.c(cavVar, cyeVarB, defpackage.dam.e);
                    defpackage.cev.c(cavVar, cjeVarM, defpackage.dam.d);
                    defpackage.cev.c(cavVar, java.lang.Integer.valueOf(iM), defpackage.dam.f);
                    defpackage.cev.b(cavVar, defpackage.dam.g);
                    defpackage.cev.c(cavVar, cmwVarM, defpackage.dam.c);
                    defpackage.cmw cmwVarC2 = defpackage.azm.c(cmtVar, 1.0f);
                    peh pehVar = (peh) obj4;
                    android.net.Uri uri = pehVar.a;
                    boolean zD = cavVar.D(uri);
                    java.lang.Object objG = cavVar.g();
                    if (zD || objG == defpackage.cau.a) {
                        objG = new opy(uri, 12);
                        cavVar.w(objG);
                    }
                    defpackage.aehj.aA(new abjm(uri, defpackage.dfa.f(2132017635, cavVar), new abjl(pehVar.d, pehVar.b, pehVar.c)), defpackage.dig.b(cmwVarC2, false, (defpackage.aonj) objG), null, null, cavVar, 0, 12);
                    defpackage.awo.c(defpackage.azm.c(cmtVar, 1.0f).a(new defpackage.amq(0L, pef.a, defpackage.cqz.a, 1)), cavVar, 6);
                    cavVar.n();
                } else {
                    cavVar.s();
                }
                return defpackage.aojh.a;
            case 1:
                defpackage.cav cavVar2 = (defpackage.cav) obj2;
                int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.azj) obj, "$this$IncomingChip");
                if (cavVar2.H((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    java.lang.Object obj5 = this.a;
                    cavVar2.u(426250415);
                    defpackage.cmt cmtVar2 = defpackage.cmw.c;
                    defpackage.cmw cmwVarG = defpackage.azm.g(cmtVar2, 20.0f);
                    oui ouiVar = (oui) obj5;
                    boolean z = ouiVar.g;
                    if (z) {
                        cmwVarG = cmwVarG.a(defpackage.aehj.aO(cmtVar2, defpackage.abts.F(cavVar2).w));
                    }
                    defpackage.cmw cmwVar = cmwVarG;
                    cavVar2.o();
                    defpackage.csx csxVarI = defpackage.wv.i(ouiVar.b, cavVar2, 6);
                    if (z) {
                        cavVar2.u(426261284);
                        cavVar2.o();
                        jM = defpackage.cfd.S();
                    } else {
                        cavVar2.u(426261834);
                        cavVar2.u(-2042619617);
                        if (ouiVar.c) {
                            cavVar2.u(-584277423);
                            jM = defpackage.den.ak(cavVar2).a;
                            cavVar2.o();
                        } else {
                            cavVar2.u(-584229373);
                            cavVar2.o();
                            j$.util.Optional optional = ouiVar.d;
                            defpackage.aooh.e(optional, "tint(...)");
                            java.lang.Integer num = (java.lang.Integer) defpackage.aooh.q(optional);
                            jM = num != null ? defpackage.cfd.M(num.intValue()) : defpackage.cfd.S();
                        }
                        cavVar2.o();
                        cavVar2.o();
                    }
                    defpackage.aaoo.W(csxVarI, null, cmwVar, jM, cavVar2, 0, 0);
                    defpackage.ayy ayyVar = acpl.a;
                    defpackage.den.aR(defpackage.azm.k(cmtVar2, acpl.m), cavVar2);
                    java.lang.String str = ouiVar.e;
                    defpackage.aooh.e(str, "label(...)");
                    defpackage.abrz.k(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, null, cavVar2, 0, 24576, 245758);
                } else {
                    cavVar2.s();
                }
                return defpackage.aojh.a;
            case 2:
                defpackage.cav cavVar3 = (defpackage.cav) obj2;
                ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.alc) obj, "$this$animateFloat");
                cavVar3.u(-1031318201);
                defpackage.ajl ajlVarB = this.a.b();
                cavVar3.o();
                return ajlVarB;
            case 3:
                defpackage.cav cavVar4 = (defpackage.cav) obj2;
                int iIntValue3 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.azj) obj, "$this$Button");
                if (cavVar4.H((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    defpackage.awb awbVar = defpackage.awi.e;
                    defpackage.cmn cmnVar = defpackage.cmh.n;
                    defpackage.cmt cmtVar3 = defpackage.cmw.c;
                    defpackage.cye cyeVarA = defpackage.azh.a(awbVar, cmnVar, cavVar4, 54);
                    int iM2 = defpackage.anty.M(cavVar4.a());
                    defpackage.cje cjeVarM2 = cavVar4.M();
                    defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVar4, cmtVar3);
                    defpackage.aomy aomyVar2 = defpackage.dam.a;
                    cavVar4.L();
                    cavVar4.v();
                    if (cavVar4.F()) {
                        cavVar4.j(aomyVar2);
                    } else {
                        cavVar4.x();
                    }
                    java.lang.Object obj6 = this.a;
                    defpackage.cev.c(cavVar4, cyeVarA, defpackage.dam.e);
                    defpackage.cev.c(cavVar4, cjeVarM2, defpackage.dam.d);
                    defpackage.cev.c(cavVar4, java.lang.Integer.valueOf(iM2), defpackage.dam.f);
                    defpackage.cev.b(cavVar4, defpackage.dam.g);
                    defpackage.cev.c(cavVar4, cmwVarM2, defpackage.dam.c);
                    defpackage.abrz.k((java.lang.String) obj6, defpackage.azk.a.a(cmtVar3, 1.0f, false), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, defpackage.den.an(cavVar4).h, cavVar4, 0, 24960, 110588);
                    defpackage.den.aR(defpackage.azm.g(cmtVar3, 8.0f), cavVar4);
                    defpackage.aaoo.V(defpackage.aehj.aM(abja.cK, cavVar4), null, defpackage.azm.g(cmtVar3, 18.0f), defpackage.den.ak(cavVar4).s, cavVar4, 392, 0);
                    cavVar4.n();
                } else {
                    cavVar4.s();
                }
                return defpackage.aojh.a;
            case 4:
                defpackage.cav cavVar5 = (defpackage.cav) obj2;
                int iIntValue4 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.azj) obj, "$this$Button");
                if (!cavVar5.H((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    cavVar5.s();
                } else if (((ryq) this.a).h) {
                    cavVar5.u(1194883665);
                    defpackage.aaoo.S(defpackage.afsq.bE(defpackage.azm.g(defpackage.cmw.c, 16.0f), defpackage.dfa.f(2132017956, cavVar5), null), ((defpackage.cqg) cavVar5.e(defpackage.boy.a)).a, null, cavVar5, 0, 4);
                    cavVar5.o();
                } else {
                    cavVar5.u(1194792215);
                    defpackage.abrz.k(defpackage.dfa.f(2132017952, cavVar5), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, cavVar5, 0, 0, 262142);
                    cavVar5.o();
                }
                return defpackage.aojh.a;
            case 5:
                defpackage.cav cavVar6 = (defpackage.cav) obj2;
                int iIntValue5 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.azj) obj, "$this$OutlinedTrailingButton");
                if (cavVar6.H((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    defpackage.cer cerVarB = defpackage.aim.b(true != defpackage.a.C(this.a) ? 0.0f : 180.0f, null, null, cavVar6, 0, 30);
                    defpackage.csx csxVarAL = defpackage.aehj.aL(abja.cJ, cavVar6);
                    defpackage.cmt cmtVar4 = defpackage.cmw.c;
                    acqt acqtVar = acqt.a;
                    defpackage.bfy bfyVar = acte.a;
                    defpackage.cmw cmwVarG2 = defpackage.azm.g(cmtVar4, acte.g);
                    boolean zB = cavVar6.B(cerVarB);
                    java.lang.Object objG2 = cavVar6.g();
                    if (zB || objG2 == defpackage.cau.a) {
                        objG2 = new qji(cerVarB, 18);
                        cavVar6.w(objG2);
                    }
                    defpackage.aaoo.W(csxVarAL, defpackage.dfa.f(2132017966, cavVar6), defpackage.cfd.J(cmwVarG2, (defpackage.aonj) objG2), 0L, cavVar6, 0, 8);
                } else {
                    cavVar6.s();
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.cav cavVar7 = (defpackage.cav) obj2;
                int iIntValue6 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.azj) obj, "$this$OutlinedLeadingButton");
                if (cavVar7.H((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    defpackage.cmi cmiVar = defpackage.cmh.k;
                    defpackage.cmt cmtVar5 = defpackage.cmw.c;
                    defpackage.cye cyeVarA2 = defpackage.aww.a(defpackage.awi.c, cmiVar, cavVar7, 48);
                    int iM3 = defpackage.anty.M(cavVar7.a());
                    defpackage.cje cjeVarM3 = cavVar7.M();
                    defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVar7, cmtVar5);
                    defpackage.aomy aomyVar3 = defpackage.dam.a;
                    cavVar7.L();
                    cavVar7.v();
                    if (cavVar7.F()) {
                        cavVar7.j(aomyVar3);
                    } else {
                        cavVar7.x();
                    }
                    ?? r0 = this.a;
                    defpackage.cev.c(cavVar7, cyeVarA2, defpackage.dam.e);
                    defpackage.cev.c(cavVar7, cjeVarM3, defpackage.dam.d);
                    defpackage.cev.c(cavVar7, java.lang.Integer.valueOf(iM3), defpackage.dam.f);
                    defpackage.cev.b(cavVar7, defpackage.dam.g);
                    defpackage.cev.c(cavVar7, cmwVarM3, defpackage.dam.c);
                    defpackage.abrz.k(defpackage.dfa.f(2132017968, cavVar7), null, 0L, 0L, null, null, 0L, new defpackage.dot(3), 0L, 0, false, 0, 0, null, defpackage.den.an(cavVar7).l, cavVar7, 0, 0, 130046);
                    defpackage.abrz.k(defpackage.snl.V(r0).b, null, 0L, 0L, null, null, 0L, new defpackage.dot(3), 0L, 0, false, 0, 0, null, defpackage.den.an(cavVar7).j, cavVar7, 0, 0, 130046);
                    cavVar7.n();
                } else {
                    cavVar7.s();
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cav cavVar8 = (defpackage.cav) obj2;
                int iIntValue7 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.azj) obj, "$this$EnergyButton");
                if (cavVar8.H((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    java.lang.Object obj7 = this.a;
                    defpackage.csx csxVarAL2 = defpackage.aehj.aL(abja.gB, cavVar8);
                    long j2 = defpackage.den.ak(cavVar8).d;
                    defpackage.cmt cmtVar6 = defpackage.cmw.c;
                    defpackage.aaoo.W(csxVarAL2, null, defpackage.azm.g(cmtVar6, 18.0f), j2, cavVar8, 432, 0);
                    defpackage.den.aR(defpackage.azm.k(cmtVar6, 8.0f), cavVar8);
                    defpackage.abrz.k((java.lang.String) obj7, null, defpackage.den.ak(cavVar8).d, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, cavVar8, 0, 0, 262138);
                } else {
                    cavVar8.s();
                }
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cav cavVar9 = (defpackage.cav) obj2;
                int iIntValue8 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.azj) obj, "$this$FilledTonalButton");
                if (cavVar9.H((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    defpackage.abrz.k((java.lang.String) this.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, cavVar9, 0, 0, 262142);
                } else {
                    cavVar9.s();
                }
                return defpackage.aojh.a;
            case 9:
                return defpackage.afsq.cd(this.a, (afe) obj, (defpackage.cav) obj2, ((java.lang.Integer) obj3).intValue());
            case 10:
                defpackage.cav cavVar10 = (defpackage.cav) obj2;
                int iIntValue9 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((afe) obj, "$this$AnimatedHeaderContainer");
                if (cavVar10.H((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    defpackage.uox uoxVar = (defpackage.uox) this.a;
                    defpackage.ttj.z(uoxVar.j, uoxVar.k, uoxVar.e, uoxVar.i, null, cavVar10, 0);
                } else {
                    cavVar10.s();
                }
                return defpackage.aojh.a;
            case 11:
                return defpackage.afsq.cd(this.a, (afe) obj, (defpackage.cav) obj2, ((java.lang.Integer) obj3).intValue());
            case 12:
                return defpackage.afsq.cd(this.a, (afe) obj, (defpackage.cav) obj2, ((java.lang.Integer) obj3).intValue());
            case 13:
                defpackage.cav cavVar11 = (defpackage.cav) obj2;
                int iIntValue10 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.awy) obj, "$this$Card");
                if (cavVar11.H((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    this.a.a(cavVar11, 0);
                } else {
                    cavVar11.s();
                }
                return defpackage.aojh.a;
            case 14:
                defpackage.cyi cyiVar = (defpackage.cyi) obj;
                defpackage.cyd cydVar = (defpackage.cyd) obj2;
                defpackage.aooh.f(cyiVar, "$this$layout");
                defpackage.aooh.f(cydVar, "measurable");
                long j3 = ((defpackage.dpd) obj3).a;
                int iB = defpackage.dpd.h(j3) ? defpackage.dpd.b(j3) : Integer.MIN_VALUE;
                int iA = defpackage.dpd.g(j3) ? defpackage.dpd.a(j3) : Integer.MIN_VALUE;
                if (ygc.k(iB) && ygc.k(iA)) {
                    xuaVar = new xua(iB, iA);
                }
                if (xuaVar != null) {
                    ((defpackage.aoul) ((defpackage.xtq) this.a).a).Q(xuaVar);
                }
                defpackage.czc czcVarV = cydVar.v(j3);
                return cyiVar.du(czcVarV.a, czcVarV.b, defpackage.aokd.a, new xms(czcVarV, 5));
            case 15:
                defpackage.cav cavVar12 = (defpackage.cav) obj2;
                int iIntValue11 = ((java.lang.Integer) obj3).intValue();
                defpackage.ajb ajbVar = abeb.a;
                defpackage.aooh.f((afe) obj, "$this$AnimatedVisibility");
                if (cavVar12.H((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    this.a.a(cavVar12, 0);
                } else {
                    cavVar12.s();
                }
                return defpackage.aojh.a;
            case 16:
                defpackage.cav cavVar13 = (defpackage.cav) obj2;
                int iIntValue12 = ((java.lang.Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= true != ((iIntValue12 & 8) == 0 ? cavVar13.B(obj) : cavVar13.D(obj)) ? 2 : 4;
                }
                if (cavVar13.H((iIntValue12 & 19) != 18, iIntValue12 & 1)) {
                    this.a.a(obj, cavVar13, java.lang.Integer.valueOf(iIntValue12 & 14));
                } else {
                    cavVar13.s();
                }
                return defpackage.aojh.a;
            case 17:
                awv awvVar = (awv) obj;
                defpackage.cav cavVar14 = (defpackage.cav) obj2;
                int iIntValue13 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f(awvVar, "$this$BoxWithConstraints");
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= true != cavVar14.B(awvVar) ? 2 : 4;
                }
                if (cavVar14.H((iIntValue13 & 19) != 18, iIntValue13 & 1)) {
                    java.lang.Object obj8 = this.a;
                    int i = iIntValue13 & 14;
                    float fB = awvVar.b();
                    defpackage.ajh ajhVar = abft.a;
                    int iA2 = defpackage.dpi.a(fB, abft.g);
                    abgx abgxVar = (abgx) obj8;
                    if (abgxVar.i || iA2 < 0) {
                        cavVar14.u(-1062427017);
                        defpackage.afsq.aZ(awvVar, abgxVar, null, cavVar14, i);
                        cavVar14.o();
                    } else {
                        cavVar14.u(-1062483406);
                        defpackage.afsq.bh(awvVar, abgxVar, cavVar14, i);
                        cavVar14.o();
                    }
                } else {
                    cavVar14.s();
                }
                return defpackage.aojh.a;
            case 18:
                defpackage.azj azjVar = (defpackage.azj) obj;
                defpackage.cav cavVar15 = (defpackage.cav) obj2;
                int iIntValue14 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f(azjVar, "$this$BannerHeader");
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= true != cavVar15.B(azjVar) ? 2 : 4;
                }
                if (cavVar15.H((iIntValue14 & 19) != 18, iIntValue14 & 1)) {
                    java.lang.Object obj9 = this.a;
                    j$.util.Objects.checkIndex(0, 4);
                    if (obj9 instanceof abhm) {
                        abhkVar = abhk.a;
                    } else if (obj9 instanceof abhn) {
                        abhkVar = abhk.c;
                    } else {
                        if (!(obj9 instanceof abho)) {
                            throw new defpackage.aois();
                        }
                        abhkVar = abhk.b;
                    }
                    abhk abhkVar2 = abhkVar;
                    java.lang.Object objG3 = cavVar15.g();
                    if (objG3 == defpackage.cau.a) {
                        objG3 = new yrz(17);
                        cavVar15.w(objG3);
                    }
                    defpackage.uu.a(abhkVar2, null, (defpackage.aonj) objG3, null, null, null, abhj.a, cavVar15, 1573248, 58);
                    int iAX = defpackage.afsq.aX(obj9);
                    if (iAX == 0) {
                        cavVar15.u(-1050098275);
                        strValueOf = ((abhm) obj9).a;
                        j = defpackage.den.ak(cavVar15).z;
                        cavVar15.o();
                    } else if (iAX == 1) {
                        cavVar15.u(-1049931402);
                        strValueOf = java.lang.String.valueOf(((abho) obj9).a);
                        j = defpackage.den.ak(cavVar15).q;
                        cavVar15.o();
                    } else {
                        if (iAX != 2) {
                            cavVar15.u(-1142254596);
                            cavVar15.o();
                            throw new defpackage.aois();
                        }
                        cavVar15.u(-1049610428);
                        strValueOf = ((abhn) obj9).a;
                        j = defpackage.den.ak(cavVar15).q;
                        cavVar15.o();
                    }
                    java.lang.String str2 = strValueOf;
                    long j4 = j;
                    defpackage.cmt cmtVar7 = defpackage.cmw.c;
                    defpackage.aehj.bj(str2, azjVar.a(cmtVar7, 1.0f, true), j4, cavVar15, 0, 0);
                    int iAX2 = defpackage.afsq.aX(obj9);
                    if (iAX2 == 0) {
                        cavVar15.u(-1049334497);
                        abhh abhhVar = ((abhm) obj9).b;
                        if (abhhVar != null) {
                            cavVar15.u(-1049289640);
                            defpackage.ayy ayyVar2 = acpl.a;
                            defpackage.aehj.bn(abhhVar, acpl.f(defpackage.den.ak(cavVar15).z, cavVar15, 13), null, cavVar15, 0, 4);
                            cavVar15.o();
                        } else {
                            cavVar15.u(-1049032092);
                            cavVar15.o();
                        }
                        cavVar15.o();
                    } else if (iAX2 == 1) {
                        cavVar15.u(-1048955956);
                        cavVar15.u(-1048758300);
                        cavVar15.o();
                        cavVar15.o();
                    } else {
                        if (iAX2 != 2) {
                            cavVar15.u(-1142230075);
                            cavVar15.o();
                            throw new defpackage.aois();
                        }
                        cavVar15.u(-1048688829);
                        cavVar15.o();
                    }
                    defpackage.den.aR(defpackage.azm.k(cmtVar7, 4.0f), cavVar15);
                } else {
                    cavVar15.s();
                }
                return defpackage.aojh.a;
            case 19:
                defpackage.cav cavVar16 = (defpackage.cav) obj2;
                int iIntValue15 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.azj) obj, "$this$Button");
                if (cavVar16.H((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    defpackage.aehj.bk(((abhh) this.a).a, cavVar16, 0);
                } else {
                    cavVar16.s();
                }
                return defpackage.aojh.a;
            default:
                defpackage.cav cavVar17 = (defpackage.cav) obj2;
                int iIntValue16 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.azj) obj, "$this$TextButton");
                int i2 = iIntValue16 & 17;
                if (cavVar17.H(i2 != 16, iIntValue16 & 1)) {
                    defpackage.aehj.bk(((abhh) this.a).a, cavVar17, 0);
                } else {
                    cavVar17.s();
                }
                return defpackage.aojh.a;
        }
    }
}
