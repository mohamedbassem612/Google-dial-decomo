package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class axo implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ axo(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
    /* JADX WARN: Type inference failed for: r0v1, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [bgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [cxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v77, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [awa, java.lang.Object] */
    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.dky dkyVar;
        defpackage.dji djiVar;
        long j;
        long jFloatToRawIntBits;
        long jI;
        long jFloatToRawIntBits2;
        btu btuVar;
        bmd bmdVar = null;
        switch (this.$cid) {
            case 0:
                defpackage.cav cavVar = (defpackage.cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    this.a.a(axx.a, cavVar, 6);
                } else {
                    cavVar.s();
                }
                return defpackage.aojh.a;
            case 1:
                defpackage.afr afrVar = (defpackage.afr) obj;
                defpackage.afr afrVar2 = (defpackage.afr) obj2;
                defpackage.afr afrVar3 = defpackage.afr.c;
                return java.lang.Boolean.valueOf(afrVar == afrVar3 && afrVar2 == afrVar3 && !((defpackage.agg) this.a).b.f);
            case 2:
                defpackage.dpf dpfVar = (defpackage.dpf) obj;
                long j2 = ((defpackage.dpd) obj2).a;
                if (defpackage.dpd.b(j2) == Integer.MAX_VALUE) {
                    avo.c("LazyVerticalGrid's width should be bound by parent.");
                }
                ?? r6 = this.a;
                int iB = defpackage.dpd.b(j2);
                int iDp = dpfVar.dp(((awd) r6).a) * 3;
                java.util.ArrayList arrayList = new java.util.ArrayList(4);
                int i = 0;
                while (i < 4) {
                    int i2 = iB - iDp;
                    arrayList.add(java.lang.Integer.valueOf((i2 / 4) + (i < i2 % 4 ? 1 : 0)));
                    i++;
                }
                int[] iArrCm = defpackage.ajsz.cm(arrayList);
                int[] iArr = new int[iArrCm.length];
                r6.b(dpfVar, iB, iArrCm, defpackage.dpq.a, iArr);
                return new defpackage.vx(iArrCm, iArr, (char[]) null);
            case 3:
                ((java.lang.Integer) obj2).intValue();
                return (bbl) this.a.a((bcg) obj);
            case 4:
                java.lang.Long l = (java.lang.Long) obj2;
                long jLongValue = l.longValue();
                defpackage.cbd cbdVar = defpackage.bma.a;
                defpackage.acx acxVarB = ((blz) this.a).b();
                if (acxVarB == null || !acxVarB.b(jLongValue)) {
                    return null;
                }
                return l;
            case 5:
                this.a.b(((defpackage.cpm) obj2).a);
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.cav cavVar2 = (defpackage.cav) obj;
                ((java.lang.Integer) obj2).intValue();
                int i3 = bhu.a;
                cavVar2.u(666084174);
                java.lang.String str = ((bhf) this.a).b;
                cavVar2.o();
                return str;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                bkl bklVar = (bkl) obj;
                ((java.lang.Boolean) obj2).booleanValue();
                return ((bko) this.a).c ? bklVar.c(bklVar.a(), 0) : bklVar.c(0, bklVar.a());
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((cvm) obj).b();
                ((defpackage.aoos) this.a).a = ((defpackage.cpm) obj2).a;
                return defpackage.aojh.a;
            case 9:
                defpackage.vx vxVar = (defpackage.vx) obj;
                android.content.Context context = (android.content.Context) obj2;
                java.lang.Object obj3 = this.a;
                blw blwVar = (blw) obj3;
                defpackage.aoiu aoiuVarL = blwVar.l();
                if (aoiuVarL != null) {
                    djiVar = (defpackage.dji) aoiuVarL.a;
                    dkyVar = (defpackage.dky) aoiuVarL.b;
                } else {
                    dkyVar = null;
                    djiVar = null;
                }
                bkj bkjVar = blwVar.m;
                defpackage.bly blyVar = new defpackage.bly(obj3, context, 3, null);
                defpackage.aonp aonpVar = bkk.a;
                if (djiVar == null || dkyVar == null || bkjVar == null) {
                    blyVar.a(vxVar);
                    if (djiVar != null && dkyVar != null) {
                        wx.k(vxVar, context, djiVar, dkyVar.b);
                    }
                } else {
                    long j3 = dkyVar.b;
                    defpackage.apdp apdpVar = bkjVar.e;
                    if (apdpVar.c()) {
                        bmd bmdVarC = bkjVar.c();
                        if (bmdVarC != null && bkk.a(bmdVarC, djiVar, j3)) {
                            bmdVar = bmdVarC;
                        }
                        apdpVar.d();
                    }
                    if (bmdVar == null) {
                        blyVar.a(vxVar);
                    } else {
                        android.view.textclassifier.TextClassification textClassification = bmdVar.c;
                        if (!ft$.ExternalSyntheticApiModelOutline0.m(textClassification).isEmpty()) {
                            xa.k(vxVar, bkjVar.d, textClassification, 0, (android.graphics.drawable.Drawable) bmdVar.d.get(0));
                        } else if ((aa$.ExternalSyntheticApiModelOutline0.m(textClassification) != null || !android.text.TextUtils.isEmpty(aa$.ExternalSyntheticApiModelOutline0.m(textClassification))) && (aa$.ExternalSyntheticApiModelOutline0.m(textClassification) != null || aa$.ExternalSyntheticApiModelOutline0.m(textClassification) != null)) {
                            xa.k(vxVar, bkjVar.d, textClassification, -1, aa$.ExternalSyntheticApiModelOutline0.m(textClassification));
                        }
                        blyVar.a(vxVar);
                        java.util.List listM = ft$.ExternalSyntheticApiModelOutline0.m(textClassification);
                        int size = listM.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            aa$.ExternalSyntheticApiModelOutline0.m(listM.get(i4));
                            if (i4 > 0) {
                                xa.k(vxVar, bkjVar.d, textClassification, i4, (android.graphics.drawable.Drawable) bmdVar.d.get(i4));
                            }
                        }
                    }
                    wx.k(vxVar, context, djiVar, j3);
                }
                return defpackage.aojh.a;
            case 10:
                defpackage.cxi cxiVarG = ((bke) obj).g();
                defpackage.cxi cxiVarG2 = ((bke) obj2).g();
                ?? r0 = this.a;
                long jI2 = 0;
                if (cxiVarG != null) {
                    jI = r0.i(cxiVarG, 0L);
                    j = 4294967295L;
                    jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (jI >> 32)) + ((int) (cxiVarG.h() >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (jI & 4294967295L)) + ((int) (cxiVarG.h() & 4294967295L)))) & 4294967295L);
                } else {
                    j = 4294967295L;
                    jFloatToRawIntBits = 0;
                    jI = 0;
                }
                if (cxiVarG2 != null) {
                    jI2 = r0.i(cxiVarG2, 0L);
                    jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (jI2 & j)) + ((int) (cxiVarG2.h() & j)))) & j) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (jI2 >> 32)) + ((int) (cxiVarG2.h() >> 32)))) << 32);
                } else {
                    jFloatToRawIntBits2 = 0;
                }
                int i5 = (int) (jFloatToRawIntBits & j);
                int i6 = (int) (jI & j);
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i5) - java.lang.Float.intBitsToFloat(i6);
                int i7 = (int) (jFloatToRawIntBits >> 32);
                int i8 = (int) (jI >> 32);
                float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i7) - java.lang.Float.intBitsToFloat(i8);
                int i9 = (int) (jFloatToRawIntBits2 & j);
                int i10 = (int) (jI2 & j);
                float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat(i9) - java.lang.Float.intBitsToFloat(i10);
                int i11 = (int) (jFloatToRawIntBits2 >> 32);
                int i12 = (int) (jI2 >> 32);
                float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat(i11) - java.lang.Float.intBitsToFloat(i12);
                float fMax = java.lang.Math.max(0.0f, java.lang.Math.min(java.lang.Float.intBitsToFloat(i5), java.lang.Float.intBitsToFloat(i9)) - java.lang.Math.max(java.lang.Float.intBitsToFloat(i6), java.lang.Float.intBitsToFloat(i10)));
                float f = fIntBitsToFloat * 0.5f;
                float fMax2 = java.lang.Math.max(0.0f, java.lang.Math.min(java.lang.Float.intBitsToFloat(i7), java.lang.Float.intBitsToFloat(i11)) - java.lang.Math.max(java.lang.Float.intBitsToFloat(i8), java.lang.Float.intBitsToFloat(i12)));
                return java.lang.Integer.valueOf((((fMax > f ? 1 : (fMax == f ? 0 : -1)) >= 0 || (fMax > (fIntBitsToFloat3 * 0.5f) ? 1 : (fMax == (fIntBitsToFloat3 * 0.5f) ? 0 : -1)) >= 0) && ((fMax2 > (fIntBitsToFloat2 * 0.5f) ? 1 : (fMax2 == (fIntBitsToFloat2 * 0.5f) ? 0 : -1)) < 0 && (fMax2 > (fIntBitsToFloat4 * 0.5f) ? 1 : (fMax2 == (fIntBitsToFloat4 * 0.5f) ? 0 : -1)) < 0)) ? defpackage.ajsz.au(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(i8)), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(i12))) : defpackage.ajsz.au(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(i6)), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(i10))));
            case 11:
                defpackage.cav cavVar3 = (defpackage.cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                int i13 = iIntValue2 & 3;
                int i14 = iIntValue2 & 1;
                defpackage.ayy ayyVar = bmm.a;
                if (cavVar3.H(i13 != 2, i14)) {
                    defpackage.cmw cmwVarA = defpackage.awy.a(defpackage.den.aX(defpackage.awy.b(defpackage.cmw.c, 1.0f, false), defpackage.den.bc(0.0f, 0.0f, 0.0f, true != ((java.lang.Boolean) defpackage.bsi.a.a()).booleanValue() ? 24.0f : 16.0f, 7)), defpackage.cmh.j);
                    defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
                    int iM = defpackage.anty.M(cavVar3.a());
                    defpackage.cje cjeVarM = cavVar3.M();
                    defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar3, cmwVarA);
                    defpackage.aomy aomyVar = defpackage.dam.a;
                    cavVar3.L();
                    cavVar3.v();
                    if (cavVar3.F()) {
                        cavVar3.j(aomyVar);
                    } else {
                        cavVar3.x();
                    }
                    ?? r1 = this.a;
                    defpackage.cev.c(cavVar3, cyeVarB, defpackage.dam.e);
                    defpackage.cev.c(cavVar3, cjeVarM, defpackage.dam.d);
                    defpackage.cev.c(cavVar3, java.lang.Integer.valueOf(iM), defpackage.dam.f);
                    defpackage.cev.b(cavVar3, defpackage.dam.g);
                    defpackage.cev.c(cavVar3, cmwVarM, defpackage.dam.c);
                    r1.a(cavVar3, 0);
                    cavVar3.n();
                } else {
                    cavVar3.s();
                }
                return defpackage.aojh.a;
            case 12:
                defpackage.cav cavVar4 = (defpackage.cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                int i15 = iIntValue3 & 3;
                int i16 = iIntValue3 & 1;
                defpackage.ayy ayyVar2 = bmm.a;
                if (cavVar4.H(i15 != 2, i16)) {
                    defpackage.cmw cmwVarA2 = defpackage.awy.a(defpackage.den.aX(defpackage.cmw.c, bmm.a), defpackage.cmh.k);
                    defpackage.cye cyeVarB2 = defpackage.awo.b(defpackage.cmh.a, false);
                    int iM2 = defpackage.anty.M(cavVar4.a());
                    defpackage.cje cjeVarM2 = cavVar4.M();
                    defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVar4, cmwVarA2);
                    defpackage.aomy aomyVar2 = defpackage.dam.a;
                    cavVar4.L();
                    cavVar4.v();
                    if (cavVar4.F()) {
                        cavVar4.j(aomyVar2);
                    } else {
                        cavVar4.x();
                    }
                    ?? r2 = this.a;
                    defpackage.cev.c(cavVar4, cyeVarB2, defpackage.dam.e);
                    defpackage.cev.c(cavVar4, cjeVarM2, defpackage.dam.d);
                    defpackage.cev.c(cavVar4, java.lang.Integer.valueOf(iM2), defpackage.dam.f);
                    defpackage.cev.b(cavVar4, defpackage.dam.g);
                    defpackage.cev.c(cavVar4, cmwVarM2, defpackage.dam.c);
                    r2.a(cavVar4, 0);
                    cavVar4.n();
                } else {
                    cavVar4.s();
                }
                return defpackage.aojh.a;
            case 13:
                return bmz.b((defpackage.aono) this.a, (defpackage.cav) obj, ((java.lang.Integer) obj2).intValue());
            case 14:
                return bmz.b((defpackage.aono) this.a, (defpackage.cav) obj, ((java.lang.Integer) obj2).intValue());
            case 15:
                int iA = defpackage.dpd.a(((defpackage.dpd) obj2).a);
                long j4 = ((defpackage.dpp) obj).a & 4294967295L;
                btt bttVar = (btt) this.a;
                aqj aqjVarB = app.b(new byh(iA, bttVar, (int) j4, 1));
                int iOrdinal = bttVar.d().ordinal();
                if (iOrdinal == 0) {
                    btuVar = btu.a;
                } else if (iOrdinal == 1) {
                    btuVar = btu.b;
                    if (!aqjVarB.g(btuVar)) {
                        btuVar = btu.a;
                    }
                } else {
                    if (iOrdinal != 2) {
                        throw new defpackage.aois();
                    }
                    btuVar = btu.c;
                    if (!aqjVarB.g(btuVar)) {
                        btuVar = btu.b;
                        if (!aqjVarB.g(btuVar)) {
                            btuVar = btu.a;
                        }
                    }
                }
                return new defpackage.aoiu(aqjVarB, btuVar);
            case 16:
                defpackage.cav cavVar5 = (defpackage.cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (cavVar5.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    ?? r3 = defpackage.rd.u(this.a).b;
                    int size2 = r3.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        ((defpackage.vx) r3.get(i17)).G(cavVar5, 0);
                    }
                } else {
                    cavVar5.s();
                }
                return defpackage.aojh.a;
            case 17:
                return defpackage.rd.n(this.a, (defpackage.cav) obj, ((java.lang.Integer) obj2).intValue());
            case 18:
                return defpackage.rd.n(this.a, (defpackage.cav) obj, ((java.lang.Integer) obj2).intValue());
            case 19:
                defpackage.cav cavVar6 = (defpackage.cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (cavVar6.H((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    defpackage.cmw cmwVarA3 = defpackage.azm.a(defpackage.cmw.c, 56.0f, 56.0f);
                    defpackage.cye cyeVarB3 = defpackage.awo.b(defpackage.cmh.e, false);
                    int iM3 = defpackage.anty.M(cavVar6.a());
                    defpackage.cje cjeVarM3 = cavVar6.M();
                    defpackage.cmw cmwVarM3 = defpackage.cfo.m(cavVar6, cmwVarA3);
                    defpackage.aomy aomyVar3 = defpackage.dam.a;
                    cavVar6.L();
                    cavVar6.v();
                    if (cavVar6.F()) {
                        cavVar6.j(aomyVar3);
                    } else {
                        cavVar6.x();
                    }
                    ?? r4 = this.a;
                    defpackage.cev.c(cavVar6, cyeVarB3, defpackage.dam.e);
                    defpackage.cev.c(cavVar6, cjeVarM3, defpackage.dam.d);
                    defpackage.cev.c(cavVar6, java.lang.Integer.valueOf(iM3), defpackage.dam.f);
                    defpackage.cev.b(cavVar6, defpackage.dam.g);
                    defpackage.cev.c(cavVar6, cmwVarM3, defpackage.dam.c);
                    r4.a(cavVar6, 0);
                    cavVar6.n();
                } else {
                    cavVar6.s();
                }
                return defpackage.aojh.a;
            default:
                defpackage.cav cavVar7 = (defpackage.cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                if (cavVar7.H((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    defpackage.cmw cmwVarH = defpackage.azm.h(defpackage.cmw.c, rk.i());
                    defpackage.cye cyeVarB4 = defpackage.awo.b(defpackage.cmh.e, false);
                    int iM4 = defpackage.anty.M(cavVar7.a());
                    defpackage.cje cjeVarM4 = cavVar7.M();
                    defpackage.cmw cmwVarM4 = defpackage.cfo.m(cavVar7, cmwVarH);
                    defpackage.aomy aomyVar4 = defpackage.dam.a;
                    cavVar7.L();
                    cavVar7.v();
                    if (cavVar7.F()) {
                        cavVar7.j(aomyVar4);
                    } else {
                        cavVar7.x();
                    }
                    ?? r5 = this.a;
                    defpackage.cev.c(cavVar7, cyeVarB4, defpackage.dam.e);
                    defpackage.cev.c(cavVar7, cjeVarM4, defpackage.dam.d);
                    defpackage.cev.c(cavVar7, java.lang.Integer.valueOf(iM4), defpackage.dam.f);
                    defpackage.cev.b(cavVar7, defpackage.dam.g);
                    defpackage.cev.c(cavVar7, cmwVarM4, defpackage.dam.c);
                    r5.a(cavVar7, 0);
                    cavVar7.n();
                } else {
                    cavVar7.s();
                }
                return defpackage.aojh.a;
        }
    }
}
