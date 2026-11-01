package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ubr implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ubr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [aonn, java.lang.Object] */
    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        float f = 8.0f;
        int i = 6;
        switch (this.$cid) {
            case 0:
                defpackage.cav cavVar = (defpackage.cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    cavVar.u(-1113788331);
                    defpackage.cmw cmwVarL = defpackage.cmw.c;
                    if (ro.t(cavVar).a.a()) {
                        cavVar.u(541934267);
                        cavVar.o();
                    } else {
                        cavVar.u(-675254950);
                        int i2 = ((android.content.res.Configuration) cavVar.e(defpackage.dep.a)).orientation;
                        cavVar.o();
                        if (i2 == 2) {
                            cmwVarL = defpackage.uu.l(cmwVarL, new ayn(defpackage.uu.f(cavVar), 9));
                        }
                    }
                    java.lang.Object obj3 = this.a;
                    cavVar.o();
                    defpackage.wsc.bW((uch) obj3, cmwVarL, cavVar, 0);
                } else {
                    cavVar.s();
                }
                return defpackage.aojh.a;
            case 1:
                defpackage.cav cavVar2 = (defpackage.cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    defpackage.gus.aG(false, false, defpackage.cfo.j(-29712288, new rzg(this.a, 20), cavVar2), cavVar2, 384, 3);
                } else {
                    cavVar2.s();
                }
                return defpackage.aojh.a;
            case 2:
                defpackage.cav cavVar3 = (defpackage.cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (cavVar3.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    defpackage.cmt cmtVar = defpackage.cmw.c;
                    defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
                    int iM = defpackage.anty.M(cavVar3.a());
                    defpackage.cje cjeVarM = cavVar3.M();
                    defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar3, cmtVar);
                    defpackage.aomy aomyVar = defpackage.dam.a;
                    cavVar3.L();
                    cavVar3.v();
                    if (cavVar3.F()) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    java.lang.Object obj4 = this.a;
                    defpackage.cev.c(cavVar3, cyeVarB, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarM, defpackage.dam.d);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf(iM), defpackage.dam.f);
                    defpackage.cev.b(cavVar3, defpackage.dam.g);
                    defpackage.cev.c(cavVar3, cmwVarM, defpackage.dam.c);
                    ucg ucgVar = (ucg) obj4;
                    defpackage.rd.g(defpackage.wv.i(ucgVar.a, cavVar3, 6), ucgVar.b, defpackage.awt.a.a(defpackage.azm.c(cmtVar, 0.7f), defpackage.cmh.e), cavVar3, 0);
                    cavVar3.n();
                } else {
                    cavVar3.s();
                }
                return defpackage.aojh.a;
            case 3:
                defpackage.cav cavVar4 = (defpackage.cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (cavVar4.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    uch uchVar = (uch) this.a;
                    boolean z = uchVar.c;
                    defpackage.cer cerVarB = defpackage.aim.b(z ? 1.0f : 0.38f, null, null, cavVar4, 0, 30);
                    java.util.List listBP = defpackage.ajsz.bP(uchVar.f, 3);
                    defpackage.cmt cmtVar2 = defpackage.cmw.c;
                    defpackage.cmw cmwVarM2 = defpackage.uu.m(cmtVar2, defpackage.uu.f(cavVar4));
                    defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.f(8.0f), defpackage.cmh.j, cavVar4, 6);
                    int iM2 = defpackage.anty.M(cavVar4.a());
                    defpackage.cje cjeVarM2 = cavVar4.M();
                    defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVar4, cmwVarM2);
                    defpackage.aomy aomyVar2 = defpackage.dam.a;
                    cavVar4.L();
                    cavVar4.v();
                    if (cavVar4.F()) {
                        cavVar4.j(aomyVar2);
                    } else {
                        cavVar4.x();
                    }
                    defpackage.aonn aonnVar = defpackage.dam.e;
                    defpackage.cev.c(cavVar4, cyeVarA, aonnVar);
                    defpackage.aonn aonnVar2 = defpackage.dam.d;
                    defpackage.cev.c(cavVar4, cjeVarM2, aonnVar2);
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM2);
                    defpackage.aonn aonnVar3 = defpackage.dam.f;
                    defpackage.cev.c(cavVar4, numValueOf, aonnVar3);
                    defpackage.aonj aonjVar = defpackage.dam.g;
                    defpackage.cev.b(cavVar4, aonjVar);
                    defpackage.aonn aonnVar4 = defpackage.dam.c;
                    defpackage.cev.c(cavVar4, cmwVarM3, aonnVar4);
                    cavVar4.u(1069843533);
                    java.util.Iterator it = listBP.iterator();
                    while (it.hasNext()) {
                        java.util.List<ucg> list = (java.util.List) it.next();
                        float f2 = f;
                        defpackage.cye cyeVarA2 = defpackage.azh.a(defpackage.awi.f(f2), defpackage.cmh.m, cavVar4, i);
                        int iM3 = defpackage.anty.M(cavVar4.a());
                        defpackage.cje cjeVarM3 = cavVar4.M();
                        defpackage.cmw cmwVarM4 = defpackage.cfo.m(cavVar4, cmtVar2);
                        cavVar4.L();
                        cavVar4.v();
                        if (cavVar4.F()) {
                            cavVar4.j(aomyVar2);
                        } else {
                            cavVar4.x();
                        }
                        defpackage.cev.c(cavVar4, cyeVarA2, aonnVar);
                        defpackage.cev.c(cavVar4, cjeVarM3, aonnVar2);
                        defpackage.cev.c(cavVar4, java.lang.Integer.valueOf(iM3), aonnVar3);
                        defpackage.cev.b(cavVar4, aonjVar);
                        defpackage.cev.c(cavVar4, cmwVarM4, aonnVar4);
                        defpackage.azk azkVar = defpackage.azk.a;
                        cavVar4.u(1114638987);
                        for (ucg ucgVar2 : list) {
                            boolean z2 = z;
                            defpackage.cav cavVar5 = cavVar4;
                            defpackage.wsc.bV(ucgVar2, ucgVar2.c, azkVar.a(defpackage.ru.o(cmtVar2, ((java.lang.Number) cerVarB.a()).floatValue()), 1.0f, true), z2, cavVar5, 0);
                            cavVar4 = cavVar5;
                            it = it;
                            aomyVar2 = aomyVar2;
                            aonnVar4 = aonnVar4;
                            aonnVar = aonnVar;
                            z = z2;
                        }
                        cavVar4.o();
                        cavVar4.n();
                        z = z;
                        f = f2;
                        i = 6;
                        it = it;
                    }
                    cavVar4.o();
                    cavVar4.n();
                } else {
                    cavVar4.s();
                }
                return defpackage.aojh.a;
            case 4:
                defpackage.cav cavVar6 = (defpackage.cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (cavVar6.H((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    java.lang.Object obj5 = this.a;
                    defpackage.den.ab(defpackage.abjc.a.b(((uoo) obj5).z), defpackage.cfo.j(-2106591677, new defpackage.ubr(obj5, 5), cavVar6), cavVar6, 48);
                } else {
                    cavVar6.s();
                }
                return defpackage.aojh.a;
            case 5:
                defpackage.cav cavVar7 = (defpackage.cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                if (cavVar7.H((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    defpackage.gus.aG(true, false, defpackage.cfo.j(-1170842878, new uoi((uoo) this.a), cavVar7), cavVar7, 390, 2);
                } else {
                    cavVar7.s();
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.a.t(this.a, (defpackage.cav) obj, ((java.lang.Integer) obj2).intValue());
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                vgs vgsVar = (vgs) obj2;
                defpackage.akzc akzcVar = ((vci) this.a).e;
                defpackage.aooh.e(akzcVar, "getGreetingAudio(...)");
                defpackage.akzc akzcVar2 = defpackage.akzc.d;
                akzb akzbVar = new akzb(128);
                byte[] bytes = "Content-Type: audio/amr\r\nContent-Transfer-Encoding: binary\r\n\r\n".getBytes(defpackage.aoqv.a);
                defpackage.aooh.e(bytes, "getBytes(...)");
                akzbVar.write(bytes);
                akzbVar.write(akzcVar.D());
                defpackage.akzc akzcVarB = akzbVar.b();
                defpackage.aooh.e(akzcVarB, "toByteString(...)");
                return vgsVar.f(new tbb(vgsVar, akzcVarB, 12));
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cav cavVar8 = (defpackage.cav) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                int i3 = iIntValue7 & 3;
                int i4 = iIntValue7 & 1;
                int i5 = abew.a;
                if (cavVar8.H(i3 != 2, i4)) {
                    defpackage.cmt cmtVar3 = defpackage.cmw.c;
                    defpackage.cmw cmwVarF = rl.f(cmtVar3, rl.e(cavVar8, 6), false);
                    defpackage.cye cyeVarB2 = defpackage.awo.b(defpackage.cmh.a, false);
                    int iM4 = defpackage.anty.M(cavVar8.a());
                    defpackage.cje cjeVarM4 = cavVar8.M();
                    defpackage.cmw cmwVarM5 = defpackage.cfo.m(cavVar8, cmwVarF);
                    defpackage.aomy aomyVar3 = defpackage.dam.a;
                    cavVar8.L();
                    cavVar8.v();
                    if (cavVar8.F()) {
                        cavVar8.j(aomyVar3);
                    } else {
                        cavVar8.x();
                    }
                    java.lang.Object obj6 = this.a;
                    defpackage.cev.c(cavVar8, cyeVarB2, defpackage.dam.e);
                    defpackage.cev.c(cavVar8, cjeVarM4, defpackage.dam.d);
                    defpackage.cev.c(cavVar8, java.lang.Integer.valueOf(iM4), defpackage.dam.f);
                    defpackage.cev.b(cavVar8, defpackage.dam.g);
                    defpackage.cev.c(cavVar8, cmwVarM5, defpackage.dam.c);
                    defpackage.abrz.k((java.lang.String) obj6, defpackage.den.aZ(cmtVar3, 12.0f, 8.0f), defpackage.den.ak(cavVar8).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, defpackage.dkz.z(defpackage.den.an(cavVar8).j, 0L, 0L, null, null, defpackage.dmq.c, null, 0L, 0L, null, 0, defpackage.dpy.g(20), null, null, 0, 0, 16646111), cavVar8, 48, 0, 131064);
                    cavVar8.n();
                } else {
                    cavVar8.s();
                }
                return defpackage.aojh.a;
            case 9:
                defpackage.cav cavVar9 = (defpackage.cav) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                if (cavVar9.H((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    defpackage.aehj.bl(defpackage.cfd.K(defpackage.den.ba(defpackage.azm.f(defpackage.den.aZ(defpackage.azm.d(defpackage.cmw.c, 1.0f), 0.0f, 4.0f), 56.0f, Float.NaN), 16.0f, 0.0f, 0.0f, 0.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 0, 1044479).a(new ahq(new defpackage.aku(1.0f, 400.0f, new defpackage.dpp(4294967297L)), defpackage.cmh.e)), defpackage.cfo.j(-434707714, new defpackage.ped(this.a, 18), cavVar9), cavVar9, 48, 0);
                } else {
                    cavVar9.s();
                }
                return defpackage.aojh.a;
            case 10:
                defpackage.cav cavVar10 = (defpackage.cav) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                if (cavVar10.H((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    java.lang.Object obj7 = this.a;
                    defpackage.cmw cmwVarP = defpackage.azm.p(defpackage.cmw.c);
                    j$.util.Objects.checkIndex(0, 3);
                    cavVar10.u(-10132745);
                    defpackage.css cssVarAM = defpackage.aehj.aM(((abhw) obj7).a, cavVar10);
                    cavVar10.o();
                    defpackage.aaoo.V(cssVarAM, null, cmwVarP, 0L, cavVar10, 392, 8);
                } else {
                    cavVar10.s();
                }
                return defpackage.aojh.a;
            case 11:
                defpackage.cav cavVar11 = (defpackage.cav) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                if (cavVar11.H((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    defpackage.aehj.bu(((abhx) this.a).c, null, false, null, null, cavVar11, 3072, 228);
                } else {
                    cavVar11.s();
                }
                return defpackage.aojh.a;
            case 12:
                defpackage.cav cavVar12 = (defpackage.cav) obj;
                int iIntValue11 = ((java.lang.Integer) obj2).intValue();
                if (cavVar12.H((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    defpackage.aehj.bu(((abhs) this.a).d, null, true, null, null, cavVar12, 3120, 244);
                } else {
                    cavVar12.s();
                }
                return defpackage.aojh.a;
            case 13:
                defpackage.cav cavVar13 = (defpackage.cav) obj;
                int iIntValue12 = ((java.lang.Integer) obj2).intValue();
                if (cavVar13.H((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    defpackage.cmt cmtVar4 = defpackage.cmw.c;
                    defpackage.cye cyeVarA3 = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVar13, 0);
                    int iM5 = defpackage.anty.M(cavVar13.a());
                    defpackage.cje cjeVarM5 = cavVar13.M();
                    defpackage.cmw cmwVarM6 = defpackage.cfo.m(cavVar13, cmtVar4);
                    defpackage.aomy aomyVar4 = defpackage.dam.a;
                    cavVar13.L();
                    cavVar13.v();
                    if (cavVar13.F()) {
                        cavVar13.j(aomyVar4);
                    } else {
                        cavVar13.x();
                    }
                    java.lang.Object obj8 = this.a;
                    defpackage.cev.c(cavVar13, cyeVarA3, defpackage.dam.e);
                    defpackage.cev.c(cavVar13, cjeVarM5, defpackage.dam.d);
                    defpackage.cev.c(cavVar13, java.lang.Integer.valueOf(iM5), defpackage.dam.f);
                    defpackage.cev.b(cavVar13, defpackage.dam.g);
                    defpackage.cev.c(cavVar13, cmwVarM6, defpackage.dam.c);
                    abht abhtVar = (abht) obj8;
                    defpackage.aehj.bK(abhtVar.f, abhtVar.a, abhtVar.d, abhtVar.b, null, cavVar13, 0);
                    defpackage.aehj.bu(abhtVar.c, null, true, null, null, cavVar13, 3120, 244);
                    cavVar13.n();
                } else {
                    cavVar13.s();
                }
                return defpackage.aojh.a;
            case 14:
                defpackage.cav cavVar14 = (defpackage.cav) obj;
                int iIntValue13 = ((java.lang.Integer) obj2).intValue();
                if (cavVar14.H((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    abis abisVar = (abis) this.a;
                    defpackage.aehj.bd(abisVar.b, abisVar.f, cavVar14, 0);
                } else {
                    cavVar14.s();
                }
                return defpackage.aojh.a;
            case 15:
                return defpackage.a.H((java.lang.String) this.a, (defpackage.cav) obj, ((java.lang.Integer) obj2).intValue());
            case 16:
                defpackage.cav cavVar15 = (defpackage.cav) obj;
                int iIntValue14 = ((java.lang.Integer) obj2).intValue();
                if (cavVar15.H((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    defpackage.aehj.aX((abja) this.a, cavVar15, 0);
                } else {
                    cavVar15.s();
                }
                return defpackage.aojh.a;
            case 17:
                defpackage.cav cavVar16 = (defpackage.cav) obj;
                int iIntValue15 = ((java.lang.Integer) obj2).intValue();
                if (cavVar16.H((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    bai.j((defpackage.cmw) null, defpackage.cfo.j(2123339036, new defpackage.ubr(this.a, 15), cavVar16), cavVar16, 48);
                } else {
                    cavVar16.s();
                }
                return defpackage.aojh.a;
            case 18:
                defpackage.cav cavVar17 = (defpackage.cav) obj;
                int iIntValue16 = ((java.lang.Integer) obj2).intValue();
                if (cavVar17.H((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    abix abixVar = (abix) this.a;
                    defpackage.aehj.aV(abixVar.a, abixVar.b, null, false, cavVar17, 0);
                } else {
                    cavVar17.s();
                }
                return defpackage.aojh.a;
            case 19:
                defpackage.cav cavVar18 = (defpackage.cav) obj;
                int iIntValue17 = ((java.lang.Integer) obj2).intValue();
                if (cavVar18.H((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    defpackage.aehj.aU((abkq) this.a, null, cavVar18, 0);
                } else {
                    cavVar18.s();
                }
                return defpackage.aojh.a;
            default:
                defpackage.cav cavVar19 = (defpackage.cav) obj;
                int iIntValue18 = ((java.lang.Integer) obj2).intValue();
                int i6 = iIntValue18 & 3;
                if (cavVar19.H(i6 != 2, iIntValue18 & 1)) {
                    defpackage.aehj.aU(((abix) this.a).e, null, cavVar19, 0);
                } else {
                    cavVar19.s();
                }
                return defpackage.aojh.a;
        }
    }
}
