package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ntw implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ntw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r2v7, types: [cer, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
        defpackage.nic nicVar;
        defpackage.oid oibVar;
        j$.util.Optional optional;
        pdv pdvVar;
        cav cavVar;
        int i = 14;
        int i2 = 3;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                cav cavVar2 = (cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar2.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    defpackage.nty ntyVar = (defpackage.nty) this.a;
                    ahab ahabVar = (ahae) ntyVar.d.a.a();
                    int iU = anty.U(ahabVar);
                    if (iU != 0) {
                        if (iU == 1) {
                            defpackage.nty.a.d().k(ahabVar.a).l("com/android/dialer/dobby/impl/ui/DobbySummaryCenterFragmentPeer", "summaryModel$<anonymous>", 63, "DobbySummaryCenterFragmentPeer.kt").v("Error loading summary model.");
                        }
                        nicVar = null;
                    } else {
                        nicVar = (defpackage.nic) aooh.q((j$.util.Optional) ((ahad) ahabVar).a);
                    }
                    if (nicVar != null) {
                        defpackage.nty.a.b().l("com/android/dialer/dobby/impl/ui/DobbySummaryCenterFragmentPeer", "onCreateView$<anonymous>$<anonymous>$<anonymous>", 86, "DobbySummaryCenterFragmentPeer.kt").y("summary: %s", nicVar.e);
                        java.lang.String str = nicVar.e;
                        aooh.e(str, "getSummaryText(...)");
                        mni.i(new defpackage.mtn(str, nicVar.f, (nicVar.b & 8) != 0 ? nicVar.g : null, nicVar.h, ((java.lang.Boolean) ntyVar.b.a()).booleanValue() && ((java.lang.Boolean) ntyVar.c.a()).booleanValue()), cavVar2, 0);
                    }
                } else {
                    cavVar2.s();
                }
                return aojh.a;
            case 1:
                cav cavVar3 = (cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (cavVar3.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    gus.aG(true, false, cfo.j(-1287929968, new defpackage.kmh(this.a, 20), cavVar3), cavVar3, 390, 2);
                } else {
                    cavVar3.s();
                }
                return aojh.a;
            case 2:
                cav cavVar4 = (cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (cavVar4.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    gus.aG(true, false, cfo.j(1617542392, new defpackage.ntw(this.a, z ? 1 : 0), cavVar4), cavVar4, 390, 2);
                } else {
                    cavVar4.s();
                }
                return aojh.a;
            case 3:
                cav cavVar5 = (cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (cavVar5.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    java.lang.Object obj3 = this.a;
                    defpackage.ohv ohvVar = (defpackage.ohv) obj3;
                    android.content.Context context = ohvVar.c;
                    java.lang.String string = context.getString(2132018623);
                    aooh.e(string, "getString(...)");
                    java.lang.String string2 = context.getString(2132018624);
                    aooh.e(string2, "getString(...)");
                    int iOrdinal = ((defpackage.ohc) ohvVar.f.a()).a.ordinal();
                    if (iOrdinal == 1) {
                        oibVar = new defpackage.oib(new defpackage.mtr(obj3, i));
                    } else if (iOrdinal == 2) {
                        oibVar = defpackage.oic.a;
                    } else {
                        if (iOrdinal != 3) {
                            throw new java.lang.IllegalStateException("Invalid state for the button");
                        }
                        oibVar = defpackage.oia.a;
                    }
                    gus.aG(false, false, cfo.j(-1986217862, new defpackage.ntw(new defpackage.oie(string, string2, oibVar), 4), cavVar5), cavVar5, 384, 3);
                } else {
                    cavVar5.s();
                }
                return aojh.a;
            case 4:
                cav cavVar6 = (cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                int i3 = iIntValue5 & 3;
                int i4 = iIntValue5 & 1;
                aoqc[] aoqcVarArr = defpackage.ohv.a;
                if (cavVar6.H(i3 != 2, i4)) {
                    pez.aD((defpackage.oie) this.a, cavVar6, 0);
                } else {
                    cavVar6.s();
                }
                return aojh.a;
            case 5:
                cav cavVar7 = (cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                if (cavVar7.H((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    abrz.k(((defpackage.oie) this.a).a, (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 2, false, 2, 0, (aonj) null, den.an(cavVar7).h, cavVar7, 0, 24960, 110590);
                } else {
                    cavVar7.s();
                }
                return aojh.a;
            case 6:
                cav cavVar8 = (cav) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                if (cavVar8.H((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    abrz.k(((defpackage.oie) this.a).b, (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 2, false, 2, 0, (aonj) null, den.an(cavVar8).k, cavVar8, 0, 24960, 110590);
                } else {
                    cavVar8.s();
                }
                return aojh.a;
            case 7:
                cav cavVar9 = (cav) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                if (cavVar9.H((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    cmw cmwVarB = azm.b(cmw.c, 1.0f);
                    cye cyeVarB = awo.b(cmh.e, false);
                    int iM = anty.M(cavVar9.a());
                    cje cjeVarM = cavVar9.M();
                    cmw cmwVarM = cfo.m(cavVar9, cmwVarB);
                    aomy aomyVar = dam.a;
                    cavVar9.L();
                    cavVar9.v();
                    if (cavVar9.F()) {
                        cavVar9.j(aomyVar);
                    } else {
                        cavVar9.x();
                    }
                    java.lang.Object obj4 = this.a;
                    cev.c(cavVar9, cyeVarB, dam.e);
                    cev.c(cavVar9, cjeVarM, dam.d);
                    cev.c(cavVar9, java.lang.Integer.valueOf(iM), dam.f);
                    cev.b(cavVar9, dam.g);
                    cev.c(cavVar9, cmwVarM, dam.c);
                    pez.aC(((defpackage.oie) obj4).c, cavVar9, 0);
                    cavVar9.n();
                } else {
                    cavVar9.s();
                }
                return aojh.a;
            case 8:
                cav cavVar10 = (cav) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                if (cavVar10.H((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    ((ozk) this.a).c(cavVar10, 0);
                } else {
                    cavVar10.s();
                }
                return aojh.a;
            case 9:
                cav cavVar11 = (cav) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                if (cavVar11.H((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    ((ozk) this.a).c(cavVar11, 0);
                } else {
                    cavVar11.s();
                }
                return aojh.a;
            case 10:
                cav cavVar12 = (cav) obj;
                int iIntValue11 = ((java.lang.Integer) obj2).intValue();
                if (cavVar12.H((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    pbp pbpVar = (pbp) this.a;
                    pac pacVarB = pbpVar.b();
                    pom pomVar = pacVarB != null ? pacVarB.k : null;
                    ppb ppbVar = pbpVar.C;
                    aooh.e(ppbVar, "contactGridRenderedListener");
                    boolean zD = cavVar12.D(ppbVar);
                    java.lang.Object objG = cavVar12.g();
                    if (zD || objG == cau.a) {
                        objG = new gbp(ppbVar, 14, (char[][][]) null);
                        cavVar12.w(objG);
                    }
                    pqa pqaVar = new pqa(pomVar, (aonj) objG, new jaf(12), (qty) null, new pmu(14), false);
                    java.lang.Object objA = pbpVar.n.a();
                    aooh.e(objA, "get(...)");
                    boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                    java.lang.Object objA2 = pbpVar.o.a();
                    aooh.e(objA2, "get(...)");
                    pez.J(pqaVar, zBooleanValue, ((java.lang.Boolean) objA2).booleanValue(), cavVar12, 0);
                } else {
                    cavVar12.s();
                }
                return aojh.a;
            case 11:
                cav cavVar13 = (cav) obj;
                int iIntValue12 = ((java.lang.Integer) obj2).intValue();
                if (cavVar13.H((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    java.lang.Object obj5 = this.a;
                    pac pacVarB2 = ((pbp) obj5).b();
                    gus.aG(false, (pacVarB2 == null || (optional = pacVarB2.l) == null || (pdvVar = (pdv) aooh.q(optional)) == null || !pez.d(pdvVar)) ? false : true, cfo.j(1508756202, new defpackage.ntw(obj5, 10), cavVar13), cavVar13, 384, 1);
                } else {
                    cavVar13.s();
                }
                return aojh.a;
            case 12:
                cav cavVar14 = (cav) obj;
                int iIntValue13 = ((java.lang.Integer) obj2).intValue();
                if (cavVar14.H((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    pdv pdvVar2 = (pdv) this.a;
                    pef.a(pdvVar2.b == 1 ? ((java.lang.Integer) pdvVar2.c).intValue() : 0, cavVar14, 0);
                } else {
                    cavVar14.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                cav cavVar15 = (cav) obj;
                int iIntValue14 = ((java.lang.Integer) obj2).intValue();
                if (cavVar15.H((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    pez.m(((java.lang.Integer) this.a).intValue(), cavVar15, 0);
                } else {
                    cavVar15.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return a.H((java.lang.String) this.a, (cav) obj, ((java.lang.Integer) obj2).intValue());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                cav cavVar16 = (cav) obj;
                int iIntValue15 = ((java.lang.Integer) obj2).intValue();
                if (cavVar16.H((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    pdq pdqVar = (pdq) this.a;
                    pdn pdnVarA = pdqVar.a();
                    if (pdnVarA != null) {
                        int iOrdinal2 = pdnVarA.b.ordinal();
                        if (iOrdinal2 == 0) {
                            i2 = 1;
                        } else if (iOrdinal2 == 1) {
                            i2 = 2;
                        } else if (iOrdinal2 != 2) {
                            throw new aois();
                        }
                        pdt pdtVar = new pdt(pdnVarA.a, i2);
                        pdn pdnVarA2 = pdqVar.a();
                        pez.g(pdtVar, (cmw) null, pdnVarA2 != null ? pdnVarA2.c : false, cavVar16, 0);
                    }
                } else {
                    cavVar16.s();
                }
                return aojh.a;
            case 16:
                cav cavVar17 = (cav) obj;
                int iIntValue16 = ((java.lang.Integer) obj2).intValue();
                if (cavVar17.H((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    gus.aG(true, false, cfo.j(-596987024, new defpackage.ntw(this.a, 15), cavVar17), cavVar17, 390, 2);
                } else {
                    cavVar17.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                cav cavVar18 = (cav) obj;
                int iIntValue17 = ((java.lang.Integer) obj2).intValue();
                if (cavVar18.H((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    qty qtyVar = (qty) this.a;
                    aaoo.W(wv.i(qtyVar.d, cavVar18, 6), qtyVar.f, azm.g(cmw.c, 24.0f), 0L, cavVar18, 384, 8);
                } else {
                    cavVar18.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                cav cavVar19 = (cav) obj;
                int iIntValue18 = ((java.lang.Integer) obj2).intValue();
                if (cavVar19.H((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    pez.C((pne) this.a, cavVar19, 0);
                } else {
                    cavVar19.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                cav cavVar20 = (cav) obj;
                int iIntValue19 = ((java.lang.Integer) obj2).intValue();
                if (cavVar20.H((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    cmt cmtVar = cmw.c;
                    cmw cmwVarBa = den.ba(den.ba(den.aY(cmtVar, 8.0f), 0.0f, 0.0f, 0.0f, 6.0f), 0.0f, 0.0f, 8.0f, 0.0f);
                    cye cyeVarA = azh.a(awi.f(8.0f), cmh.n, cavVar20, 54);
                    int iM2 = anty.M(cavVar20.a());
                    cje cjeVarM2 = cavVar20.M();
                    cmw cmwVarM2 = cfo.m(cavVar20, cmwVarBa);
                    aomy aomyVar2 = dam.a;
                    cavVar20.L();
                    cavVar20.v();
                    if (cavVar20.F()) {
                        cavVar20.j(aomyVar2);
                    } else {
                        cavVar20.x();
                    }
                    java.lang.Object obj6 = this.a;
                    aonn aonnVar = dam.e;
                    cev.c(cavVar20, cyeVarA, aonnVar);
                    aonn aonnVar2 = dam.d;
                    cev.c(cavVar20, cjeVarM2, aonnVar2);
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM2);
                    aonn aonnVar3 = dam.f;
                    cev.c(cavVar20, numValueOf, aonnVar3);
                    aonj aonjVar = dam.g;
                    cev.b(cavVar20, aonjVar);
                    aonn aonnVar4 = dam.c;
                    cev.c(cavVar20, cmwVarM2, aonnVar4);
                    pne pneVar = (pne) obj6;
                    java.lang.Integer num = pneVar.b;
                    java.lang.Integer num2 = num.intValue() != 0 ? num : null;
                    if (num2 == null) {
                        cavVar20.u(1515985817);
                        cavVar20.o();
                        cavVar = cavVar20;
                    } else {
                        cavVar20.u(1515985818);
                        int iIntValue20 = num2.intValue();
                        cmw cmwVarBn = den.bn(azm.g(cmtVar, 40.0f), cqg.h(den.ak(cavVar20).g, 0.38f), bge.a);
                        cye cyeVarB2 = awo.b(cmh.e, false);
                        int iM3 = anty.M(cavVar20.a());
                        cje cjeVarM3 = cavVar20.M();
                        cmw cmwVarM3 = cfo.m(cavVar20, cmwVarBn);
                        cavVar20.L();
                        cavVar20.v();
                        if (cavVar20.F()) {
                            cavVar20.j(aomyVar2);
                        } else {
                            cavVar20.x();
                        }
                        cev.c(cavVar20, cyeVarB2, aonnVar);
                        cev.c(cavVar20, cjeVarM3, aonnVar2);
                        cev.c(cavVar20, java.lang.Integer.valueOf(iM3), aonnVar3);
                        cev.b(cavVar20, aonjVar);
                        cev.c(cavVar20, cmwVarM3, aonnVar4);
                        cavVar = cavVar20;
                        defpackage.hgt.q(hcq.d(new defpackage.hcj(iIntValue20), cavVar20).a(), azm.g(cmtVar, 24.0f), false, false, null, 0.0f, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, null, null, null, false, 0, cavVar, 48, 0, 0, 2097084);
                        cavVar.n();
                        cavVar.o();
                    }
                    cav cavVar21 = cavVar;
                    abrz.k(pneVar.a, (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVar21, 0, 0, 262142);
                    cavVar21.n();
                } else {
                    cavVar20.s();
                }
                return aojh.a;
            default:
                cav cavVar22 = (cav) obj;
                int iIntValue21 = ((java.lang.Integer) obj2).intValue();
                if (cavVar22.H((iIntValue21 & 3) != 2, iIntValue21 & 1)) {
                    pez.bU((qvc) this.a, (cmw) null, cavVar22, 0);
                } else {
                    cavVar22.s();
                }
                return aojh.a;
        }
    }
}
