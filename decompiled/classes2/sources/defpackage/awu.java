package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class awu implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ awu(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:250:0x0747  */
    /* JADX WARN: Type inference failed for: r0v1, types: [cye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [ayy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [bhi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v102, types: [ayy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v43, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v63, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v65, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v67, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [aonn, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        long jC;
        den csmVar;
        defpackage.bkn bknVar;
        defpackage.bke bkeVarE;
        float fA;
        float f;
        defpackage.bkn bknVar2;
        defpackage.bke bkeVarE2;
        int i = 8;
        int i2 = 11;
        byte[] bArr = null;
        int i3 = 2;
        switch (this.$cid) {
            case 0:
                czo czoVar = (czo) obj;
                long j = ((dpd) obj2).a;
                return this.a.e(czoVar, czoVar.s(aojh.a, new cja(-431986394, true, new defpackage.awu(this.b, new defpackage.awv(czoVar, j), i3, bArr))), j);
            case 1:
                csj csjVar = (csj) obj;
                float fFloatValue = ((java.lang.Float) obj2).floatValue();
                cpn cpnVar = (cpn) this.a;
                if (cpnVar.i()) {
                    return aojh.a;
                }
                float fQ = aooc.q(java.lang.Math.min((float) java.lang.Math.ceil(aooc.q(fFloatValue, 0.0f)), (float) java.lang.Math.ceil(cpnVar.a() / 2.0f)), 0.0f);
                float f2 = cpnVar.b;
                float f3 = cpnVar.c;
                float f4 = fQ / 2.0f;
                long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f2 + f4);
                long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f4 + f3);
                float f5 = cpnVar.d;
                float f6 = cpnVar.e;
                long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits((f5 - f2) - fQ);
                long jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits((f6 - f3) - fQ);
                boolean z = fQ + fQ > cpnVar.a();
                long jD = z ? cpnVar.d() : (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
                long j2 = jFloatToRawIntBits4 & 4294967295L;
                long j3 = jFloatToRawIntBits3 << 32;
                if (z) {
                    jC = cpnVar.c();
                    csmVar = csl.a;
                } else {
                    jC = j3 | j2;
                    csmVar = new csm(fQ, 0.0f, 0, 0, 30);
                }
                den.P(csjVar, (cqd) this.b, jD, jC, 0.0f, csmVar, 0, 104);
                return aojh.a;
            case 2:
                cav cavVar = (cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    this.b.a(this.a, cavVar, 0);
                } else {
                    cavVar.s();
                }
                return aojh.a;
            case 3:
                cav cavVar2 = (cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                int i4 = iIntValue2 & 3;
                int i5 = iIntValue2 & 1;
                int i6 = defpackage.bhu.a;
                if (cavVar2.H(i4 != 2, i5)) {
                    java.lang.Object obj3 = this.b;
                    boolean zB = cavVar2.B(obj3);
                    java.lang.Object objG = cavVar2.g();
                    if (zB || objG == cau.a) {
                        defpackage.coo cooVar = new defpackage.coo(obj3, 1, (byte[]) null);
                        ajxw ajxwVar = ceo.a;
                        objG = new cbk(cooVar, (cen) null);
                        cavVar2.w(objG);
                    }
                    defpackage.bhu.a(this.a, (defpackage.bhe) ((cer) objG).a(), cavVar2, 64);
                } else {
                    cavVar2.s();
                }
                return aojh.a;
            case 4:
                cav cavVar3 = (cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (cavVar3.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    java.lang.Object obj4 = this.a;
                    this.b.a(cavVar3, 0);
                    defpackage.blw blwVar = (defpackage.blw) obj4;
                    if (blwVar.A() && blwVar.y() && !blwVar.C()) {
                        cavVar3.u(1202520707);
                        defpackage.bko bkoVarC = blwVar.c();
                        if (bkoVarC == null) {
                            cavVar3.u(-1376563746);
                            cavVar3.o();
                        } else {
                            cavVar3.u(-1376563745);
                            cavVar3.u(1202522235);
                            java.util.List listBb = ajsz.bb(new java.lang.Boolean[]{java.lang.Boolean.TRUE, java.lang.Boolean.FALSE});
                            int size = listBb.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                boolean zBooleanValue = ((java.lang.Boolean) listBb.get(i7)).booleanValue();
                                boolean zC = cavVar3.C(zBooleanValue);
                                java.lang.Object objG2 = cavVar3.g();
                                if (zC || objG2 == cau.a) {
                                    objG2 = new defpackage.blr(zBooleanValue, blwVar);
                                    cavVar3.w(objG2);
                                }
                                defpackage.bgw bgwVar = (defpackage.bgw) objG2;
                                boolean zC2 = cavVar3.C(zBooleanValue);
                                java.lang.Object objG3 = cavVar3.g();
                                if (zC2 || objG3 == cau.a) {
                                    objG3 = zBooleanValue ? new defpackage.bhl(obj4, 18) : new defpackage.bhl(obj4, 19);
                                    cavVar3.w(objG3);
                                }
                                aomy aomyVar = (aomy) objG3;
                                int i8 = zBooleanValue ? bkoVarC.a.c : bkoVarC.b.c;
                                if (zBooleanValue) {
                                    defpackage.bko bkoVarC2 = blwVar.c();
                                    if (bkoVarC2 == null || (bkeVarE2 = blwVar.E((bknVar2 = bkoVarC2.a))) == null) {
                                        f = 0.0f;
                                    } else {
                                        fA = bkeVarE2.a(bknVar2.a);
                                        f = fA;
                                    }
                                } else {
                                    defpackage.bko bkoVarC3 = blwVar.c();
                                    if (bkoVarC3 == null || (bkeVarE = blwVar.E((bknVar = bkoVarC3.b))) == null) {
                                        f = 0.0f;
                                    } else {
                                        fA = bkeVarE.a(bknVar.a);
                                        f = fA;
                                    }
                                }
                                defpackage.bkv bkvVar = new defpackage.bkv(aomyVar);
                                boolean z2 = bkoVarC.c;
                                cmt cmtVar = cmw.c;
                                boolean zD = cavVar3.D(bgwVar);
                                java.lang.Object objG4 = cavVar3.g();
                                if (zD || objG4 == cau.a) {
                                    objG4 = new defpackage.bil(bgwVar, 3);
                                    cavVar3.w(objG4);
                                }
                                defpackage.aaf.c(bkvVar, zBooleanValue, i8, z2, 0L, f, cvy.a(cmtVar, bgwVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objG4), cavVar3, 0);
                            }
                            cavVar3.o();
                            cavVar3.o();
                        }
                        cavVar3.o();
                    } else {
                        cavVar3.u(-1374590254);
                        cavVar3.o();
                    }
                } else {
                    cavVar3.s();
                }
                return aojh.a;
            case 5:
                cav cavVar4 = (cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                int i9 = iIntValue4 & 3;
                int i10 = iIntValue4 & 1;
                ayy ayyVar = defpackage.bmm.a;
                if (cavVar4.H(i9 != 2, i10)) {
                    cmw cmwVarA = awy.a(den.aX(cmw.c, defpackage.bmm.b), this.a == null ? cmh.j : cmh.k);
                    cye cyeVarB = awo.b(cmh.a, false);
                    int iM = anty.M(cavVar4.a());
                    cje cjeVarM = cavVar4.M();
                    cmw cmwVarM = cfo.m(cavVar4, cmwVarA);
                    aomy aomyVar2 = dam.a;
                    cavVar4.L();
                    cavVar4.v();
                    if (cavVar4.F()) {
                        cavVar4.j(aomyVar2);
                    } else {
                        cavVar4.x();
                    }
                    ?? r0 = this.b;
                    cev.c(cavVar4, cyeVarB, dam.e);
                    cev.c(cavVar4, cjeVarM, dam.d);
                    cev.c(cavVar4, java.lang.Integer.valueOf(iM), dam.f);
                    cev.b(cavVar4, dam.g);
                    cev.c(cavVar4, cmwVarM, dam.c);
                    r0.a(cavVar4, 0);
                    cavVar4.n();
                } else {
                    cavVar4.s();
                }
                return aojh.a;
            case 6:
                cav cavVar5 = (cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                int i11 = iIntValue5 & 3;
                int i12 = iIntValue5 & 1;
                ayy ayyVar2 = defpackage.bmm.a;
                if (cavVar5.H(i11 != 2, i12)) {
                    ?? r2 = this.a;
                    java.lang.String strAe = den.ae(2132019243, cavVar5);
                    cmw cmwVarJ = azm.j((cmw) r2, 280.0f, Float.NaN, 560.0f, Float.NaN);
                    cmt cmtVar2 = cmw.c;
                    boolean zB2 = cavVar5.B(strAe);
                    java.lang.Object objG5 = cavVar5.g();
                    if (zB2 || objG5 == cau.a) {
                        objG5 = new defpackage.bln(strAe, i2);
                        cavVar5.w(objG5);
                    }
                    cmw cmwVarA2 = cmwVarJ.a(dig.b(cmtVar2, false, (aonj) objG5));
                    cye cyeVarB2 = awo.b(cmh.a, true);
                    int iM2 = anty.M(cavVar5.a());
                    cje cjeVarM2 = cavVar5.M();
                    cmw cmwVarM2 = cfo.m(cavVar5, cmwVarA2);
                    aomy aomyVar3 = dam.a;
                    cavVar5.L();
                    cavVar5.v();
                    if (cavVar5.F()) {
                        cavVar5.j(aomyVar3);
                    } else {
                        cavVar5.x();
                    }
                    ?? r1 = this.b;
                    cev.c(cavVar5, cyeVarB2, dam.e);
                    cev.c(cavVar5, cjeVarM2, dam.d);
                    cev.c(cavVar5, java.lang.Integer.valueOf(iM2), dam.f);
                    cev.b(cavVar5, dam.g);
                    cev.c(cavVar5, cmwVarM2, dam.c);
                    r1.a(cavVar5, 0);
                    cavVar5.n();
                } else {
                    cavVar5.s();
                }
                return aojh.a;
            case 7:
                cav cavVar6 = (cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                int i13 = iIntValue6 & 3;
                int i14 = iIntValue6 & 1;
                ayy ayyVar3 = defpackage.bmm.a;
                if (cavVar6.H(i13 != 2, i14)) {
                    float f7 = ((dpi) cavVar6.e(bqd.c)).a;
                    if (true == java.lang.Float.isNaN(f7)) {
                        f7 = 0.0f;
                    }
                    ayy ayyVar4 = bnj.a;
                    dpi dpiVar = new dpi((8.0f - ((f7 - bnj.c()) + 0.0f)) + 0.0f);
                    dpi dpiVar2 = new dpi(0.0f);
                    dpi dpiVar3 = new dpi(8.0f);
                    if (dpiVar2.compareTo(dpiVar3) > 0) {
                        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + dpiVar3 + " is less than minimum " + dpiVar2 + '.');
                    }
                    if (dpiVar.compareTo(dpiVar2) < 0) {
                        dpiVar = dpiVar2;
                    } else if (dpiVar.compareTo(dpiVar3) > 0) {
                        dpiVar = dpiVar3;
                    }
                    defpackage.bmm.d(dpiVar.a, cfo.j(-459506658, new defpackage.awu(this.a, this.b, i), cavVar6), cavVar6, 384);
                } else {
                    cavVar6.s();
                }
                return aojh.a;
            case 8:
                cav cavVar7 = (cav) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                int i15 = iIntValue7 & 3;
                int i16 = iIntValue7 & 1;
                ayy ayyVar5 = defpackage.bmm.a;
                if (cavVar7.H(i15 != 2, i16)) {
                    ?? r3 = this.b;
                    this.a.a(cavVar7, 0);
                    if (r3 == 0) {
                        cavVar7.u(-1102003461);
                    } else {
                        cavVar7.u(795735494);
                        r3.a(cavVar7, 0);
                    }
                    cavVar7.o();
                } else {
                    cavVar7.s();
                }
                return aojh.a;
            case 9:
                return den.ao((ayy) this.a, (aono) this.b, (cav) obj, ((java.lang.Integer) obj2).intValue());
            case 10:
                cav cavVar8 = (cav) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                int i17 = iIntValue8 & 3;
                int i18 = iIntValue8 & 1;
                int i19 = defpackage.bqg.a;
                if (cavVar8.H(i17 != 2, i18)) {
                    defpackage.bqg.c(((defpackage.bqe) this.a).b, 0, this.b, cavVar8, 0);
                } else {
                    cavVar8.s();
                }
                return aojh.a;
            case 11:
                cav cavVar9 = (cav) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                int i20 = iIntValue9 & 3;
                int i21 = iIntValue9 & 1;
                int i22 = defpackage.bqg.a;
                if (cavVar9.H(i20 != 2, i21)) {
                    defpackage.bqg.c(((defpackage.bqe) this.a).f, 1, this.b, cavVar9, 0);
                } else {
                    cavVar9.s();
                }
                return aojh.a;
            case 12:
                cav cavVar10 = (cav) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                int i23 = iIntValue10 & 3;
                int i24 = iIntValue10 & 1;
                int i25 = defpackage.bqg.a;
                if (cavVar10.H(i23 != 2, i24)) {
                    cmw cmwVarBa = den.ba(cmw.c, 0.0f, 0.0f, 16.0f, 0.0f);
                    cye cyeVarB3 = awo.b(cmh.a, false);
                    int iM3 = anty.M(cavVar10.a());
                    cje cjeVarM3 = cavVar10.M();
                    cmw cmwVarM3 = cfo.m(cavVar10, cmwVarBa);
                    aomy aomyVar4 = dam.a;
                    cavVar10.L();
                    cavVar10.v();
                    if (cavVar10.F()) {
                        cavVar10.j(aomyVar4);
                    } else {
                        cavVar10.x();
                    }
                    ?? r7 = this.b;
                    java.lang.Object obj5 = this.a;
                    cev.c(cavVar10, cyeVarB3, dam.e);
                    cev.c(cavVar10, cjeVarM3, dam.d);
                    cev.c(cavVar10, java.lang.Integer.valueOf(iM3), dam.f);
                    cev.b(cavVar10, dam.g);
                    cev.c(cavVar10, cmwVarM3, dam.c);
                    den.ab(boy.a.b(new cqg(((defpackage.bqe) obj5).c)), (aonn) r7, cavVar10, 8);
                    cavVar10.n();
                } else {
                    cavVar10.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                cav cavVar11 = (cav) obj;
                int iIntValue11 = ((java.lang.Integer) obj2).intValue();
                int i26 = iIntValue11 & 3;
                int i27 = iIntValue11 & 1;
                int i28 = defpackage.bqg.a;
                if (cavVar11.H(i26 != 2, i27)) {
                    cmw cmwVarBa2 = den.ba(cmw.c, 16.0f, 0.0f, 0.0f, 0.0f);
                    cye cyeVarB4 = awo.b(cmh.a, false);
                    int iM4 = anty.M(cavVar11.a());
                    cje cjeVarM4 = cavVar11.M();
                    cmw cmwVarM4 = cfo.m(cavVar11, cmwVarBa2);
                    aomy aomyVar5 = dam.a;
                    cavVar11.L();
                    cavVar11.v();
                    if (cavVar11.F()) {
                        cavVar11.j(aomyVar5);
                    } else {
                        cavVar11.x();
                    }
                    ?? r15 = this.b;
                    java.lang.Object obj6 = this.a;
                    cev.c(cavVar11, cyeVarB4, dam.e);
                    cev.c(cavVar11, cjeVarM4, dam.d);
                    cev.c(cavVar11, java.lang.Integer.valueOf(iM4), dam.f);
                    cev.b(cavVar11, dam.g);
                    cev.c(cavVar11, cmwVarM4, dam.c);
                    defpackage.bqg.c(((defpackage.bqe) obj6).d, 11, r15, cavVar11, 0);
                    cavVar11.n();
                } else {
                    cavVar11.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                cav cavVar12 = (cav) obj;
                int iIntValue12 = ((java.lang.Integer) obj2).intValue();
                int i29 = iIntValue12 & 3;
                int i30 = iIntValue12 & 1;
                int i31 = defpackage.brj.a;
                if (cavVar12.H(i29 != 2, i30)) {
                    cmj cmjVar = cmh.d;
                    cmt cmtVar3 = cmw.c;
                    cye cyeVarB5 = awo.b(cmjVar, false);
                    int iM5 = anty.M(cavVar12.a());
                    cje cjeVarM5 = cavVar12.M();
                    cmw cmwVarM5 = cfo.m(cavVar12, cmtVar3);
                    aomy aomyVar6 = dam.a;
                    cavVar12.L();
                    cavVar12.v();
                    if (cavVar12.F()) {
                        cavVar12.j(aomyVar6);
                    } else {
                        cavVar12.x();
                    }
                    ?? r8 = this.b;
                    ?? r4 = this.a;
                    cev.c(cavVar12, cyeVarB5, dam.e);
                    cev.c(cavVar12, cjeVarM5, dam.d);
                    cev.c(cavVar12, java.lang.Integer.valueOf(iM5), dam.f);
                    cev.b(cavVar12, dam.g);
                    cev.c(cavVar12, cmwVarM5, dam.c);
                    if (r4 != 0) {
                        cavVar12.u(2096555443);
                        defpackage.brj.a(r4, cmtVar3, r8, cavVar12, 48);
                        cavVar12.o();
                    } else {
                        cavVar12.u(2096828553);
                        r8.a(cavVar12, 0);
                        cavVar12.o();
                    }
                    cavVar12.n();
                } else {
                    cavVar12.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                cav cavVar13 = (cav) obj;
                int iIntValue13 = ((java.lang.Integer) obj2).intValue();
                if (cavVar13.H((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    this.b.a(this.a, cavVar13, 6);
                } else {
                    cavVar13.s();
                }
                return aojh.a;
            case 16:
                cav cavVar14 = (cav) obj;
                int iIntValue14 = ((java.lang.Integer) obj2).intValue();
                if (cavVar14.H((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    java.lang.Object obj7 = this.a;
                    ?? r5 = this.b;
                    aooh.c(obj7);
                    r5.a(obj7, cavVar14, 0);
                } else {
                    cavVar14.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                cav cavVar15 = (cav) obj;
                int iIntValue15 = ((java.lang.Integer) obj2).intValue();
                int i32 = iIntValue15 & 3;
                int i33 = iIntValue15 & 1;
                defpackage.bvf bvfVar = defpackage.bvf.a;
                if (cavVar15.H(i32 != 2, i33)) {
                    cmw cmwVarAX = den.aX(azm.a(cmw.c, defpackage.bvf.b, defpackage.bvf.c), (ayy) this.a);
                    cye cyeVarA = azh.a(awi.e, cmh.n, cavVar15, 54);
                    int iM6 = anty.M(cavVar15.a());
                    cje cjeVarM6 = cavVar15.M();
                    cmw cmwVarM6 = cfo.m(cavVar15, cmwVarAX);
                    aomy aomyVar7 = dam.a;
                    cavVar15.L();
                    cavVar15.v();
                    if (cavVar15.F()) {
                        cavVar15.j(aomyVar7);
                    } else {
                        cavVar15.x();
                    }
                    ?? r6 = this.b;
                    cev.c(cavVar15, cyeVarA, dam.e);
                    cev.c(cavVar15, cjeVarM6, dam.d);
                    cev.c(cavVar15, java.lang.Integer.valueOf(iM6), dam.f);
                    cev.b(cavVar15, dam.g);
                    cev.c(cavVar15, cmwVarM6, dam.c);
                    r6.a(azk.a, cavVar15, 6);
                    cavVar15.n();
                } else {
                    cavVar15.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                cav cavVar16 = (cav) obj;
                int iIntValue16 = ((java.lang.Integer) obj2).intValue();
                if (cavVar16.H((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    defpackage.cxk cxkVar = new defpackage.cxk("LeadingButton");
                    cmj cmjVar2 = cmh.e;
                    cye cyeVarB6 = awo.b(cmjVar2, true);
                    int iM7 = anty.M(cavVar16.a());
                    cje cjeVarM7 = cavVar16.M();
                    cmw cmwVarM7 = cfo.m(cavVar16, cxkVar);
                    aomy aomyVar8 = dam.a;
                    cavVar16.L();
                    cavVar16.v();
                    if (cavVar16.F()) {
                        cavVar16.j(aomyVar8);
                    } else {
                        cavVar16.x();
                    }
                    ?? r9 = this.a;
                    aonn aonnVar = dam.e;
                    cev.c(cavVar16, cyeVarB6, aonnVar);
                    aonn aonnVar2 = dam.d;
                    cev.c(cavVar16, cjeVarM7, aonnVar2);
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM7);
                    aonn aonnVar3 = dam.f;
                    cev.c(cavVar16, numValueOf, aonnVar3);
                    aonj aonjVar = dam.g;
                    cev.b(cavVar16, aonjVar);
                    aonn aonnVar4 = dam.c;
                    cev.c(cavVar16, cmwVarM7, aonnVar4);
                    r9.a(cavVar16, 0);
                    cavVar16.n();
                    defpackage.cxk cxkVar2 = new defpackage.cxk("TrailingButton");
                    cye cyeVarB7 = awo.b(cmjVar2, true);
                    int iM8 = anty.M(cavVar16.a());
                    cje cjeVarM8 = cavVar16.M();
                    cmw cmwVarM8 = cfo.m(cavVar16, cxkVar2);
                    cavVar16.L();
                    cavVar16.v();
                    if (cavVar16.F()) {
                        cavVar16.j(aomyVar8);
                    } else {
                        cavVar16.x();
                    }
                    ?? r10 = this.b;
                    cev.c(cavVar16, cyeVarB7, aonnVar);
                    cev.c(cavVar16, cjeVarM8, aonnVar2);
                    cev.c(cavVar16, java.lang.Integer.valueOf(iM8), aonnVar3);
                    cev.b(cavVar16, aonjVar);
                    cev.c(cavVar16, cmwVarM8, aonnVar4);
                    r10.a(cavVar16, 0);
                    cavVar16.n();
                } else {
                    cavVar16.s();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                cav cavVar17 = (cav) obj;
                int iIntValue17 = ((java.lang.Integer) obj2).intValue();
                int i34 = iIntValue17 & 3;
                int i35 = iIntValue17 & 1;
                ayy ayyVar6 = defpackage.bwh.a;
                if (cavVar17.H(i34 != 2, i35)) {
                    cmt cmtVar4 = cmw.c;
                    java.lang.Object objG6 = cavVar17.g();
                    if (objG6 == cau.a) {
                        defpackage.bru bruVar = new defpackage.bru(this.a, i2);
                        cavVar17.w(bruVar);
                        objG6 = bruVar;
                    }
                    cmw cmwVarE = vn.e(cmtVar4, (aonj) objG6);
                    cye cyeVarB8 = awo.b(cmh.a, false);
                    int iM9 = anty.M(cavVar17.a());
                    cje cjeVarM9 = cavVar17.M();
                    cmw cmwVarM9 = cfo.m(cavVar17, cmwVarE);
                    aomy aomyVar9 = dam.a;
                    cavVar17.L();
                    cavVar17.v();
                    if (cavVar17.F()) {
                        cavVar17.j(aomyVar9);
                    } else {
                        cavVar17.x();
                    }
                    ?? r11 = this.b;
                    cev.c(cavVar17, cyeVarB8, dam.e);
                    cev.c(cavVar17, cjeVarM9, dam.d);
                    cev.c(cavVar17, java.lang.Integer.valueOf(iM9), dam.f);
                    cev.b(cavVar17, dam.g);
                    cev.c(cavVar17, cmwVarM9, dam.c);
                    r11.a(cavVar17, 0);
                    cavVar17.n();
                } else {
                    cavVar17.s();
                }
                return aojh.a;
            default:
                cav cavVar18 = (cav) obj;
                int iIntValue18 = ((java.lang.Integer) obj2).intValue();
                if (cavVar18.H((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    java.lang.Object obj8 = this.a;
                    cmt cmtVar5 = cmw.c;
                    boolean zB3 = cavVar18.B(obj8);
                    java.lang.Object objG7 = cavVar18.g();
                    if (zB3 || objG7 == cau.a) {
                        objG7 = new defpackage.bru(obj8, 15);
                        cavVar18.w(objG7);
                    }
                    cmw cmwVarB = dig.b(cmtVar5, false, (aonj) objG7);
                    cye cyeVarB9 = awo.b(cmh.a, false);
                    int iM10 = anty.M(cavVar18.a());
                    cje cjeVarM10 = cavVar18.M();
                    cmw cmwVarM10 = cfo.m(cavVar18, cmwVarB);
                    aomy aomyVar10 = dam.a;
                    cavVar18.L();
                    cavVar18.v();
                    if (cavVar18.F()) {
                        cavVar18.j(aomyVar10);
                    } else {
                        cavVar18.x();
                    }
                    ?? r12 = this.b;
                    cev.c(cavVar18, cyeVarB9, dam.e);
                    cev.c(cavVar18, cjeVarM10, dam.d);
                    cev.c(cavVar18, java.lang.Integer.valueOf(iM10), dam.f);
                    cev.b(cavVar18, dam.g);
                    cev.c(cavVar18, cmwVarM10, dam.c);
                    r12.a(cavVar18, 0);
                    cavVar18.n();
                } else {
                    cavVar18.s();
                }
                return aojh.a;
        }
    }

    public /* synthetic */ awu(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
