package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class jai implements defpackage.aono {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ jai(defpackage.aonj aonjVar, uow uowVar, defpackage.ccp ccpVar, int i) {
        this.$cid = i;
        this.c = aonjVar;
        this.b = uowVar;
        this.a = ccpVar;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v37, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [ccp, java.lang.Object] */
    @Override // defpackage.aono
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        izs izsVar;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                defpackage.cav cavVar = (defpackage.cav) obj2;
                int iIntValue = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((afe) obj, "$this$AnimatedVisibility");
                if (cavVar.H((iIntValue & 17) != 16, iIntValue & 1)) {
                    java.lang.Object obj4 = this.a;
                    defpackage.cmw cmwVarBa = defpackage.den.ba(defpackage.cmw.c, 0.0f, 8.0f, 0.0f, 0.0f);
                    if (obj4 == jac.c) {
                        java.lang.Object obj5 = this.c;
                        java.lang.Object obj6 = this.b;
                        cavVar.u(260287859);
                        boolean zB = cavVar.B(obj6) | cavVar.B(obj5);
                        java.lang.Object objG = cavVar.g();
                        if (zB || objG == defpackage.cau.a) {
                            objG = new hpc(obj6, obj5, 14);
                            cavVar.w(objG);
                        }
                        izsVar = new izs((defpackage.aomy) objG, ((jad) obj6).e);
                        cavVar.o();
                    } else {
                        cavVar.u(260556846);
                        cavVar.o();
                        izsVar = izr.a;
                    }
                    hhe.j(cmwVarBa, izsVar, cavVar, 6);
                } else {
                    cavVar.s();
                }
                break;
            case 1:
                defpackage.cav cavVar2 = (defpackage.cav) obj2;
                int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                if (cavVar2.H((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    bsh bshVar = (bsh) this.b;
                    int iA = bshVar.a();
                    for (int iB = bshVar.b(); iB < iA; iB++) {
                        ((defpackage.vx) defpackage.rd.u(this.c).b.get(iB)).H((oq) this.a, cavVar2, 6);
                    }
                } else {
                    cavVar2.s();
                }
                break;
            case 2:
                afe afeVar = (afe) obj;
                defpackage.cav cavVar3 = (defpackage.cav) obj2;
                int iIntValue3 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f(afeVar, "$this$ExpandableEntry");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= true == ((iIntValue3 & 8) == 0 ? cavVar3.B(afeVar) : cavVar3.D(afeVar)) ? 4 : 2;
                }
                if (cavVar3.H((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    jlr.u((defpackage.ahj) this.a, (kbx) this.b, afeVar, (defpackage.aonj) this.c, cavVar3, (iIntValue3 << 6) & 896);
                } else {
                    cavVar3.s();
                }
                break;
            case 3:
                defpackage.cav cavVar4 = (defpackage.cav) obj2;
                int iIntValue4 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.nf) obj, "$this$item");
                if (cavVar4.H((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    java.lang.Object obj7 = this.b;
                    ?? r3 = this.c;
                    java.lang.Object obj8 = this.a;
                    oui ouiVar = (oui) obj8;
                    ouj oujVar = ouiVar.a;
                    defpackage.aooh.e(oujVar, "priority(...)");
                    j$.util.Optional optional = ouiVar.h;
                    defpackage.aooh.e(optional, "stateDescription(...)");
                    java.lang.String str = (java.lang.String) defpackage.aooh.q(optional);
                    j$.util.Optional optional2 = ouiVar.f;
                    defpackage.aooh.e(optional2, "growthkitViewTag(...)");
                    pbx pbxVar = (pbx) obj7;
                    defpackage.pez.n(oujVar, str, (java.lang.String) defpackage.aooh.q(optional2), r3, pbxVar.d, pbxVar.e, defpackage.cfo.j(1645134457, new defpackage.ped(obj8, z ? 1 : 0), cavVar4), cavVar4, 1572864);
                } else {
                    cavVar4.s();
                }
                break;
            case 4:
                defpackage.ayy ayyVar = (defpackage.ayy) obj;
                defpackage.cav cavVar5 = (defpackage.cav) obj2;
                int iIntValue5 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f(ayyVar, "innerPadding");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= true == cavVar5.B(ayyVar) ? 4 : 2;
                }
                if (cavVar5.H((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                    defpackage.cmt cmtVar = defpackage.cmw.c;
                    defpackage.cmw cmwVarAX = defpackage.den.aX(defpackage.azm.d(cmtVar, 1.0f), ayyVar);
                    defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVar5, 0);
                    int iM = defpackage.anty.M(cavVar5.a());
                    defpackage.cje cjeVarM = cavVar5.M();
                    defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar5, cmwVarAX);
                    defpackage.aomy aomyVar = defpackage.dam.a;
                    cavVar5.L();
                    cavVar5.v();
                    if (cavVar5.F()) {
                        cavVar5.j(aomyVar);
                    } else {
                        cavVar5.x();
                    }
                    java.lang.Object obj9 = this.b;
                    java.lang.Object obj10 = this.a;
                    java.lang.Object obj11 = this.c;
                    defpackage.cev.c(cavVar5, cyeVarA, defpackage.dam.e);
                    defpackage.cev.c(cavVar5, cjeVarM, defpackage.dam.d);
                    defpackage.cev.c(cavVar5, java.lang.Integer.valueOf(iM), defpackage.dam.f);
                    defpackage.cev.b(cavVar5, defpackage.dam.g);
                    defpackage.cev.c(cavVar5, cmwVarM, defpackage.dam.c);
                    defpackage.abrz.k(defpackage.dfa.f(2132017961, cavVar5), defpackage.den.aZ(cmtVar, 40.0f, 12.0f), 0L, 0L, null, null, 0L, new defpackage.dot(3), 0L, 0, false, 0, 0, null, defpackage.den.an(cavVar5).j, cavVar5, 48, 0, 130044);
                    defpackage.bvo.b(defpackage.awy.b(defpackage.den.aZ(defpackage.azm.d(cmtVar, 1.0f), 12.0f, 0.0f), 1.0f, true), defpackage.bge.c(48.0f, 48.0f, 0.0f, 0.0f), 0L, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(1564528607, new qxy(obj11, 15), cavVar5), cavVar5, 124);
                    defpackage.bvo.b(defpackage.azm.d(defpackage.den.ba(cmtVar, 12.0f, 4.0f, 12.0f, 24.0f), 1.0f), defpackage.bge.c(8.0f, 8.0f, 48.0f, 48.0f), defpackage.den.ak(cavVar5).p, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(649682056, new ata(obj10, obj9, obj11, 14), cavVar5), cavVar5, 120);
                    defpackage.afsq.bo(defpackage.dfa.f(2132017962, cavVar5), defpackage.den.aY(cmtVar, 24.0f), 0L, 0L, new defpackage.dot(3), 0, false, 0, defpackage.den.an(cavVar5).l, cavVar5, 48, 0);
                    cavVar5.n();
                } else {
                    cavVar5.s();
                }
                break;
            case 5:
                defpackage.cav cavVar6 = (defpackage.cav) obj2;
                int iIntValue6 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.awy) obj, "$this$DropdownMenu");
                if (cavVar6.H((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    for (ryt rytVar : ((ryq) this.c).g) {
                        defpackage.cja cjaVarJ = defpackage.cfo.j(-1852132169, new qxy(rytVar, 16), cavVar6);
                        boolean zB2 = cavVar6.B(rytVar);
                        java.lang.Object objG2 = cavVar6.g();
                        if (zB2 || objG2 == defpackage.cau.a) {
                            java.lang.Object obpVar = new obp(rytVar, (defpackage.ccp) this.a, (defpackage.ccp) this.b, 11);
                            cavVar6.w(obpVar);
                            objG2 = obpVar;
                        }
                        defpackage.aaoo.P(cjaVarJ, (defpackage.aomy) objG2, null, null, false, null, null, cavVar6, 6, 508);
                    }
                } else {
                    cavVar6.s();
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.cav cavVar7 = (defpackage.cav) obj2;
                int iIntValue7 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.nf) obj, "$this$item");
                if (cavVar7.H((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    java.lang.Object obj12 = this.c;
                    java.lang.Object obj13 = this.b;
                    java.lang.Object obj14 = this.a;
                    tha thaVar = (tha) obj13;
                    java.util.List list = thaVar.d;
                    tei teiVar = thaVar.a;
                    long j = thaVar.e;
                    int i = ((defpackage.aoor) obj12).a;
                    java.lang.String str2 = teiVar.b;
                    ((tgf) obj14).a(list, new tfj(str2, i, str2, 5, teiVar.c, j), cavVar7, 0);
                } else {
                    cavVar7.s();
                }
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                afe afeVar2 = (afe) obj;
                defpackage.cav cavVar8 = (defpackage.cav) obj2;
                int iIntValue8 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f(afeVar2, "$this$AnimatedContactsContainer");
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= true == ((iIntValue8 & 8) == 0 ? cavVar8.B(afeVar2) : cavVar8.D(afeVar2)) ? 4 : 2;
                }
                if (cavVar8.H((iIntValue8 & 19) != 18, iIntValue8 & 1)) {
                    ?? r4 = this.b;
                    ?? r5 = this.c;
                    defpackage.uox uoxVar = (defpackage.uox) this.a;
                    defpackage.ttj.y(afeVar2, uoxVar.a, r5, r4, null, uoxVar.f, uoxVar.g, uoxVar.h, uoxVar.c, uoxVar.d, uoxVar.b, cavVar8, iIntValue8 & 14, 0);
                } else {
                    cavVar8.s();
                }
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cav cavVar9 = (defpackage.cav) obj2;
                int iIntValue9 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f((defpackage.awy) obj, "$this$DropdownMenu");
                if (cavVar9.H((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    java.lang.Object obj15 = this.a;
                    java.lang.Object obj16 = this.b;
                    java.lang.Object obj17 = this.c;
                    boolean zB3 = cavVar9.B(obj17) | cavVar9.B(obj16) | cavVar9.B(obj15);
                    java.lang.Object objG3 = cavVar9.g();
                    if (zB3 || objG3 == defpackage.cau.a) {
                        obp obpVar2 = new obp(obj17, obj16, obj15, 18, (byte[]) null);
                        cavVar9.w(obpVar2);
                        objG3 = obpVar2;
                    }
                    defpackage.ttj.A((defpackage.aomy) objG3, cavVar9, 0);
                } else {
                    cavVar9.s();
                }
                break;
            case 9:
                defpackage.azj azjVar = (defpackage.azj) obj;
                defpackage.cav cavVar10 = (defpackage.cav) obj2;
                int iIntValue10 = ((java.lang.Integer) obj3).intValue();
                defpackage.aooh.f(azjVar, "$this$BannerHeader");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= true == cavVar10.B(azjVar) ? 4 : 2;
                }
                if (cavVar10.H((iIntValue10 & 19) != 18, iIntValue10 & 1)) {
                    ?? r6 = this.c;
                    java.lang.Object obj18 = this.b;
                    defpackage.aehj.bJ((abhw) this.a, 0L, cavVar10, 0);
                    defpackage.aehj.bw(azjVar, (java.lang.String) obj18, null, 0L, cavVar10, iIntValue10 & 14);
                    defpackage.aehj.bv(r6, null, 0L, cavVar10, 0);
                } else {
                    cavVar10.s();
                }
                break;
            default:
                java.lang.Object obj19 = this.a;
                if (obj19 != defpackage.aowg.l) {
                    aoil.e(((defpackage.aowe) this.b).a, obj19, ((defpackage.apdm) this.c).a);
                }
                break;
        }
        return defpackage.aojh.a;
    }

    public /* synthetic */ jai(bsh bshVar, oq oqVar, defpackage.cer cerVar, int i) {
        this.$cid = i;
        this.b = bshVar;
        this.a = oqVar;
        this.c = cerVar;
    }

    public /* synthetic */ jai(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ jai(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ jai(ryq ryqVar, defpackage.ccp ccpVar, defpackage.ccp ccpVar2, int i) {
        this.$cid = i;
        this.c = ryqVar;
        this.a = ccpVar;
        this.b = ccpVar2;
    }
}
