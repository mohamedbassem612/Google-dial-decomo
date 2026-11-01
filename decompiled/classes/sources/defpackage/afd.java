package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class afd implements defpackage.aono {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ afd(afe afeVar, defpackage.agf agfVar, defpackage.agg aggVar, int i) {
        this.$cid = i;
        this.a = afeVar;
        this.b = agfVar;
        this.c = aggVar;
        this.d = "animateEnterExit";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [aonp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v35, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v31, types: [cmw, java.lang.Object] */
    @Override // defpackage.aono
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long jM;
        defpackage.cja cjaVar;
        defpackage.cja cjaVar2;
        defpackage.cav cavVar;
        switch (this.$cid) {
            case 0:
                defpackage.cav cavVar2 = (defpackage.cav) obj2;
                ((java.lang.Integer) obj3).intValue();
                cavVar2.u(1840112047);
                defpackage.alg algVar = ((defpackage.aff) this.a).a;
                defpackage.cmw cmwVarA = ((defpackage.cmw) obj).a(defpackage.aga.r(algVar, defpackage.aga.s(algVar, (defpackage.agf) this.b, (defpackage.agg) this.c, null, cavVar2, 0, 8), (java.lang.String) this.d, cavVar2, 64));
                cavVar2.o();
                return cmwVarA;
            case 1:
                afe afeVar = (afe) obj;
                defpackage.cav cavVar3 = (defpackage.cav) obj2;
                int iIntValue = ((java.lang.Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= true == ((iIntValue & 8) == 0 ? cavVar3.B(afeVar) : cavVar3.D(afeVar)) ? 4 : 2;
                }
                if (cavVar3.H((iIntValue & 19) != 18, iIntValue & 1)) {
                    java.lang.Object obj4 = this.a;
                    java.lang.Object obj5 = this.b;
                    java.lang.Object obj6 = this.c;
                    boolean zB = cavVar3.B(obj5) | cavVar3.D(obj6) | cavVar3.D(obj4);
                    java.lang.Object objG = cavVar3.g();
                    if (zB || objG == defpackage.cau.a) {
                        objG = new defpackage.afx(obj5, obj6, obj4, 1, (byte[]) null);
                        cavVar3.w(objG);
                    }
                    defpackage.cbp.b(afeVar, obj6, (defpackage.aonj) objG, cavVar3);
                    defpackage.adw adwVar = ((defpackage.aex) obj4).d;
                    defpackage.aooh.d(afeVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                    adwVar.n(obj6, ((defpackage.aff) afeVar).b);
                    java.lang.Object objG2 = cavVar3.g();
                    if (objG2 == defpackage.cau.a) {
                        objG2 = new defpackage.aer(afeVar);
                        cavVar3.w(objG2);
                    }
                    this.d.a((defpackage.aer) objG2, obj6, cavVar3, 0);
                } else {
                    cavVar3.s();
                }
                return defpackage.aojh.a;
            case 2:
                defpackage.cav cavVar4 = (defpackage.cav) obj2;
                int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.awy) obj, "$this$DropdownMenu");
                if (cavVar4.H((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    int i = 0;
                    for (java.lang.Object obj7 : this.c) {
                        int i2 = i + 1;
                        if (i < 0) {
                            defpackage.ajsz.bh();
                        }
                        ?? r6 = this.d;
                        ?? r8 = this.a;
                        java.lang.Object obj8 = this.b;
                        mkn mknVar = (mkn) obj7;
                        boolean zB2 = cavVar4.B(obj8) | cavVar4.z(i) | cavVar4.B(r8) | cavVar4.B(r6);
                        java.lang.Object objG3 = cavVar4.g();
                        if (zB2 || objG3 == defpackage.cau.a) {
                            acms acmsVar = new acms(i, (defpackage.aonj) r6, (defpackage.cei) obj8, (defpackage.ccp) r8, 1);
                            cavVar4.w(acmsVar);
                            objG3 = acmsVar;
                        }
                        defpackage.aomy aomyVar = (defpackage.aomy) objG3;
                        java.lang.String strF = defpackage.dfa.f(2132020139, cavVar4);
                        defpackage.cmw cmwVarD = defpackage.azm.d(defpackage.cmw.c, 1.0f);
                        if (i == ((defpackage.cei) obj8).c()) {
                            cavVar4.u(-1568088074);
                            jM = defpackage.den.ak(cavVar4).h;
                            cavVar4.o();
                        } else {
                            cavVar4.u(-1568086481);
                            cavVar4.o();
                            jM = defpackage.cfd.M(0);
                        }
                        defpackage.cmw cmwVarA2 = cmwVarD.a(new defpackage.amq(jM, null, defpackage.cqz.a, 2));
                        boolean zB3 = cavVar4.B(strF) | cavVar4.B(aomyVar);
                        java.lang.Object objG4 = cavVar4.g();
                        if (zB3 || objG4 == defpackage.cau.a) {
                            objG4 = new lte(strF, aomyVar, 5);
                            cavVar4.w(objG4);
                        }
                        defpackage.cmw cmwVarB = defpackage.dig.b(cmwVarA2, true, (defpackage.aonj) objG4);
                        boolean z = mknVar.a;
                        drs drsVar = acqc.a;
                        defpackage.crd crdVarA = defpackage.acqn.a(4, cavVar4);
                        android.graphics.drawable.Icon icon = mknVar.d;
                        if (icon == null) {
                            cavVar4.u(-1365323562);
                            cavVar4.o();
                            cjaVar = null;
                        } else {
                            cavVar4.u(-1365323561);
                            defpackage.cja cjaVarJ = defpackage.cfo.j(-988072977, new dqv(mknVar, icon, 17), cavVar4);
                            cavVar4.o();
                            cjaVar = cjaVarJ;
                        }
                        java.lang.String str = mknVar.c;
                        if (str == null) {
                            cavVar4.u(-1364752542);
                            cavVar4.o();
                            cjaVar2 = null;
                        } else {
                            cavVar4.u(-1364752541);
                            defpackage.cja cjaVarJ2 = defpackage.cfo.j(1419891585, new kmh(str, 11), cavVar4);
                            cavVar4.o();
                            cjaVar2 = cjaVarJ2;
                        }
                        defpackage.aaoo.R(aomyVar, defpackage.cfo.j(1719242133, new kmh(mknVar, 8), cavVar4), crdVarA, cmwVarB, cjaVar, z, null, null, null, cjaVar2, cavVar4, 48, 0);
                        i = i2;
                    }
                } else {
                    cavVar4.s();
                }
                return defpackage.aojh.a;
            case 3:
                defpackage.cav cavVar5 = (defpackage.cav) obj2;
                int iIntValue3 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((afe) obj, "$this$AnimatedVisibility");
                if (cavVar5.H((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    java.lang.Object obj9 = this.d;
                    rtj rtjVar = (rtj) ((defpackage.kki) this.c).a;
                    defpackage.rsq rsqVar = (defpackage.rsq) obj9;
                    defpackage.rsr rsrVar = rsqVar.a;
                    boolean zD = cavVar5.D(rsrVar);
                    java.lang.Object objG5 = cavVar5.g();
                    if (zD || objG5 == defpackage.cau.a) {
                        objG5 = new defpackage.ovt((java.lang.Object) rsrVar, 2, (char[]) null);
                        cavVar5.w(objG5);
                    }
                    defpackage.rst rstVar = rsqVar.b;
                    defpackage.aomy aomyVar2 = (defpackage.aomy) objG5;
                    boolean zD2 = cavVar5.D(rstVar);
                    java.lang.Object objG6 = cavVar5.g();
                    if (zD2 || objG6 == defpackage.cau.a) {
                        objG6 = new defpackage.gbp(rstVar, 19, (byte[]) null, (byte[]) null);
                        cavVar5.w(objG6);
                    }
                    java.lang.Object obj10 = this.a;
                    defpackage.aonj aonjVar = (defpackage.aonj) objG6;
                    boolean zD3 = cavVar5.D(obj9) | cavVar5.D(obj10);
                    java.lang.Object objG7 = cavVar5.g();
                    if (zD3 || objG7 == defpackage.cau.a) {
                        objG7 = new oen(obj9, obj10, 19, (byte[]) null);
                        cavVar5.w(objG7);
                    }
                    defpackage.aonj aonjVar2 = (defpackage.aonj) objG7;
                    boolean zD4 = cavVar5.D(obj9) | cavVar5.D(obj10);
                    java.lang.Object objG8 = cavVar5.g();
                    if (zD4 || objG8 == defpackage.cau.a) {
                        objG8 = new qza(obj9, obj10, 5);
                        cavVar5.w(objG8);
                    }
                    defpackage.aomy aomyVar3 = (defpackage.aomy) objG8;
                    boolean zD5 = cavVar5.D(rsrVar);
                    java.lang.Object objG9 = cavVar5.g();
                    if (zD5 || objG9 == defpackage.cau.a) {
                        objG9 = new defpackage.ovt((java.lang.Object) rsrVar, 3, (short[]) null);
                        cavVar5.w(objG9);
                    }
                    defpackage.pez.aY(rtjVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, (defpackage.aomy) objG9, this.b, cavVar5, 0);
                } else {
                    cavVar5.s();
                }
                return defpackage.aojh.a;
            case 4:
                defpackage.cav cavVar6 = (defpackage.cav) obj2;
                int iIntValue4 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.awy) obj, "$this$DropdownMenu");
                if (cavVar6.H((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    java.lang.Object obj11 = this.a;
                    java.lang.Object obj12 = this.d;
                    java.lang.Object obj13 = this.c;
                    java.lang.Object obj14 = this.b;
                    defpackage.abrz.k(((tfj) obj14).a, defpackage.den.ba(defpackage.cmw.c, 16.0f, 0.0f, 0.0f, 0.0f), defpackage.den.ak(cavVar6).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, defpackage.den.an(cavVar6).o, cavVar6, 48, 0, 131064);
                    defpackage.aonn aonnVar = tew.a;
                    boolean zB4 = cavVar6.B(obj13) | cavVar6.B(obj12) | cavVar6.B(obj14) | cavVar6.D(obj11);
                    java.lang.Object objG10 = cavVar6.g();
                    if (zB4 || objG10 == defpackage.cau.a) {
                        ajx ajxVar = new ajx(obj13, obj12, obj14, (android.content.Context) obj11, 8);
                        cavVar6.w(ajxVar);
                        objG10 = ajxVar;
                    }
                    defpackage.aaoo.P(aonnVar, (defpackage.aomy) objG10, null, tew.b, false, null, null, cavVar6, 3078, 500);
                    defpackage.aonn aonnVar2 = tew.c;
                    boolean zB5 = cavVar6.B(obj13) | cavVar6.B(obj12) | cavVar6.B(obj14) | cavVar6.D(obj11);
                    java.lang.Object objG11 = cavVar6.g();
                    if (zB5 || objG11 == defpackage.cau.a) {
                        ajx ajxVar2 = new ajx(obj13, obj12, obj14, (android.content.Context) obj11, 9);
                        cavVar6.w(ajxVar2);
                        objG11 = ajxVar2;
                    }
                    defpackage.aaoo.P(aonnVar2, (defpackage.aomy) objG11, null, tew.d, false, null, null, cavVar6, 3078, 500);
                } else {
                    cavVar6.s();
                }
                return defpackage.aojh.a;
            case 5:
                awv awvVar = (awv) obj;
                defpackage.cav cavVar7 = (defpackage.cav) obj2;
                int iIntValue5 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f(awvVar, "$this$BoxWithConstraints");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= true == cavVar7.B(awvVar) ? 4 : 2;
                }
                if (cavVar7.H((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                    defpackage.cmt cmtVar = defpackage.cmw.c;
                    defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.a, defpackage.cmh.m, cavVar7, 0);
                    int iM = defpackage.anty.M(cavVar7.a());
                    defpackage.cje cjeVarM = cavVar7.M();
                    defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar7, cmtVar);
                    defpackage.aomy aomyVar4 = defpackage.dam.a;
                    cavVar7.L();
                    cavVar7.v();
                    if (cavVar7.F()) {
                        cavVar7.j(aomyVar4);
                    } else {
                        cavVar7.x();
                    }
                    defpackage.aonn aonnVar3 = defpackage.dam.e;
                    defpackage.cev.c(cavVar7, cyeVarA, aonnVar3);
                    defpackage.aonn aonnVar4 = defpackage.dam.d;
                    defpackage.cev.c(cavVar7, cjeVarM, aonnVar4);
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                    defpackage.aonn aonnVar5 = defpackage.dam.f;
                    defpackage.cev.c(cavVar7, numValueOf, aonnVar5);
                    defpackage.aonj aonjVar3 = defpackage.dam.g;
                    defpackage.cev.b(cavVar7, aonjVar3);
                    defpackage.aonn aonnVar6 = defpackage.dam.c;
                    defpackage.cev.c(cavVar7, cmwVarM, aonnVar6);
                    defpackage.azk azkVar = defpackage.azk.a;
                    if (defpackage.dpi.a(awvVar.b(), 328.0f) >= 0) {
                        java.lang.Object obj15 = this.a;
                        cavVar7.u(368352923);
                        defpackage.aehj.bH((abhi) obj15, defpackage.azm.e(defpackage.azm.k(azkVar.b(defpackage.den.x(cmtVar, "promo_graphic"), defpackage.cmh.n), 92.0f), 92.0f), cavVar7, 0);
                        cavVar7.o();
                    } else {
                        cavVar7.u(368625134);
                        cavVar7.o();
                    }
                    defpackage.cmw cmwVarBa = defpackage.den.ba(azkVar.a(cmtVar, 1.0f, true), 16.0f, 4.0f, 0.0f, 0.0f);
                    defpackage.cye cyeVarA2 = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVar7, 0);
                    int iM2 = defpackage.anty.M(cavVar7.a());
                    defpackage.cje cjeVarM2 = cavVar7.M();
                    defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVar7, cmwVarBa);
                    cavVar7.L();
                    cavVar7.v();
                    if (cavVar7.F()) {
                        cavVar7.j(aomyVar4);
                    } else {
                        cavVar7.x();
                    }
                    java.lang.Object obj16 = this.d;
                    java.lang.Object obj17 = this.c;
                    java.lang.Object obj18 = this.b;
                    defpackage.cev.c(cavVar7, cyeVarA2, aonnVar3);
                    defpackage.cev.c(cavVar7, cjeVarM2, aonnVar4);
                    defpackage.cev.c(cavVar7, java.lang.Integer.valueOf(iM2), aonnVar5);
                    defpackage.cev.b(cavVar7, aonjVar3);
                    defpackage.cev.c(cavVar7, cmwVarM2, aonnVar6);
                    defpackage.aehj.bl(null, defpackage.cfo.j(1304908527, new bli(obj17, obj16, 12), cavVar7), cavVar7, 48, 1);
                    if (obj18 != null) {
                        cavVar7.u(644477692);
                        defpackage.aehj.bj((java.lang.String) obj18, defpackage.den.ba(cmtVar, 0.0f, 0.0f, 16.0f, 0.0f), 0L, cavVar7, 48, 4);
                        cavVar = cavVar7;
                        cavVar.o();
                    } else {
                        cavVar = cavVar7;
                        cavVar.u(644577636);
                        cavVar.o();
                    }
                    cavVar.n();
                    cavVar.n();
                } else {
                    cavVar7.s();
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.cav cavVar8 = (defpackage.cav) obj2;
                int iIntValue6 = ((java.lang.Integer) obj3).intValue();
                defpackage.aimz aimzVar = afny.a;
                defpackage.aooh.f((afpl) obj, "$this$VisualElement");
                if (cavVar8.H((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    java.lang.Object obj19 = this.c;
                    ?? r7 = this.b;
                    defpackage.cmw cmwVarX = defpackage.den.x(defpackage.cmw.c, "allClustersScreen");
                    boolean zB6 = cavVar8.B(r7) | cavVar8.B(obj19);
                    java.lang.Object objG12 = cavVar8.g();
                    if (zB6 || objG12 == defpackage.cau.a) {
                        objG12 = new abdu((java.lang.Object) r7, obj19, 17, (byte[]) null);
                        cavVar8.w(objG12);
                    }
                    ?? r9 = this.d;
                    java.lang.Object obj20 = this.a;
                    bcl bclVar = (bcl) obj20;
                    afny.h(cmwVarX, bclVar, (defpackage.aonj) objG12, cavVar8, 6, 0);
                    boolean zB7 = cavVar8.B(obj20) | cavVar8.B(r7) | cavVar8.D(r9);
                    java.lang.Object objG13 = cavVar8.g();
                    if (zB7 || objG13 == defpackage.cau.a) {
                        xhb xhbVar = new xhb(bclVar, (defpackage.cer) r7, (defpackage.aonn) r9, (defpackage.aoln) null, 18);
                        cavVar8.w(xhbVar);
                        objG13 = xhbVar;
                    }
                    defpackage.cbp.g(obj20, (defpackage.aonn) objG13, cavVar8);
                } else {
                    cavVar8.s();
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cav cavVar9 = (defpackage.cav) obj2;
                int iIntValue7 = ((java.lang.Integer) obj3).intValue();
                defpackage.aimz aimzVar2 = afny.a;
                defpackage.aooh.f((bbx) obj, "$this$item");
                if (cavVar9.H((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    ?? r10 = this.a;
                    java.lang.Object obj21 = this.c;
                    ?? r11 = this.d;
                    afot afotVar = (afot) this.b;
                    afmu.a(afotVar.e, defpackage.cfo.j(578724288, new defpackage.afd((defpackage.aonj) r11, (afou) obj21, (defpackage.cmw) r10, afotVar, 8), cavVar9), cavVar9, 48);
                } else {
                    cavVar9.s();
                }
                return defpackage.aojh.a;
            default:
                afpl afplVar = (afpl) obj;
                defpackage.cav cavVar10 = (defpackage.cav) obj2;
                int iIntValue8 = ((java.lang.Integer) obj3).intValue();
                defpackage.aimz aimzVar3 = afny.a;
                defpackage.aooh.f(afplVar, "$this$VisualElement");
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= true == ((iIntValue8 & 8) == 0 ? cavVar10.B(afplVar) : cavVar10.D(afplVar)) ? 4 : 2;
                }
                if (cavVar10.H((iIntValue8 & 19) != 18, iIntValue8 & 1)) {
                    java.lang.Object obj22 = this.c;
                    java.lang.Object obj23 = this.d;
                    boolean zB8 = cavVar10.B(obj23) | cavVar10.D(obj22);
                    java.lang.Object objG14 = cavVar10.g();
                    if (zB8 || objG14 == defpackage.cau.a) {
                        objG14 = new xtu(obj23, obj22, 15, (byte[]) null);
                        cavVar10.w(objG14);
                    }
                    java.lang.Object obj24 = this.b;
                    ?? r0 = this.a;
                    defpackage.aomy aomyVarA = afplVar.a((defpackage.aomy) objG14);
                    defpackage.ayy ayyVar = acpl.a;
                    defpackage.aaoo.an(aomyVarA, defpackage.den.x(r0, ((afot) obj24).d), false, defpackage.bge.b(4.0f), acpl.e(defpackage.den.ak(cavVar10).f, cavVar10, 13), null, new defpackage.azc(1.0f, 1.0f, 1.0f, 1.0f), afnb.b, cavVar10, 817889280);
                } else {
                    cavVar10.s();
                }
                return defpackage.aojh.a;
        }
    }

    public /* synthetic */ afd(afot afotVar, defpackage.aonj aonjVar, afou afouVar, defpackage.cmw cmwVar, int i) {
        this.$cid = i;
        this.b = afotVar;
        this.d = aonjVar;
        this.c = afouVar;
        this.a = cmwVar;
    }

    public /* synthetic */ afd(defpackage.aonj aonjVar, afou afouVar, defpackage.cmw cmwVar, afot afotVar, int i) {
        this.$cid = i;
        this.d = aonjVar;
        this.c = afouVar;
        this.a = cmwVar;
        this.b = afotVar;
    }

    public /* synthetic */ afd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
        this.d = obj4;
    }

    public /* synthetic */ afd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ afd(defpackage.kkk kkkVar, defpackage.rsq rsqVar, android.view.View view, defpackage.cmw cmwVar, int i) {
        this.$cid = i;
        this.c = kkkVar;
        this.d = rsqVar;
        this.a = view;
        this.b = cmwVar;
    }

    public /* synthetic */ afd(tfj tfjVar, defpackage.aomy aomyVar, defpackage.aonn aonnVar, android.app.Activity activity, int i) {
        this.$cid = i;
        this.b = tfjVar;
        this.c = aomyVar;
        this.d = aonnVar;
        this.a = activity;
    }
}
