package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bit implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ bit(android.content.Context context, kby kbyVar, android.view.View view, aonj aonjVar, int i) {
        this.$cid = i;
        this.d = context;
        this.a = kbyVar;
        this.b = view;
        this.c = aonjVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [appa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [awa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v80, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [ayy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v37, types: [ayy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v59, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [azz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v51, types: [azj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v57, types: [azj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v61, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [aono, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois, java.io.IOException {
        int i = 7;
        aomy aomyVar = null;
        int i2 = 6;
        switch (this.$cid) {
            case 0:
                cav cavVar = (cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    java.lang.Object obj3 = this.b;
                    java.lang.Object objG = cavVar.g();
                    java.lang.Object obj4 = cau.a;
                    if (objG == obj4) {
                        objG = new defpackage.bgf(obj3, 16);
                        cavVar.w(objG);
                    }
                    cmw cmwVarE = vn.e((cmw) this.a, (aonj) objG);
                    cye cyeVarB = awo.b(cmh.a, true);
                    int iM = anty.M(cavVar.a());
                    cje cjeVarM = cavVar.M();
                    cmw cmwVarM = cfo.m(cavVar, cmwVarE);
                    aomy aomyVar2 = dam.a;
                    cavVar.L();
                    cavVar.v();
                    if (cavVar.F()) {
                        cavVar.j(aomyVar2);
                    } else {
                        cavVar.x();
                    }
                    ?? r11 = this.c;
                    cev.c(cavVar, cyeVarB, dam.e);
                    cev.c(cavVar, cjeVarM, dam.d);
                    cev.c(cavVar, java.lang.Integer.valueOf(iM), dam.f);
                    cev.b(cavVar, dam.g);
                    cev.c(cavVar, cmwVarM, dam.c);
                    r11.a(cavVar, 0);
                    java.lang.Object objG2 = cavVar.g();
                    if (objG2 == obj4) {
                        objG2 = new defpackage.bhl(obj3, i);
                        cavVar.w(objG2);
                    }
                    ((defpackage.bis) this.d).c((aomy) objG2, cavVar, 6);
                    cavVar.n();
                } else {
                    cavVar.s();
                }
                return aojh.a;
            case 1:
                cav cavVar2 = (cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    java.lang.Object obj5 = this.c;
                    java.lang.Object obj6 = this.b;
                    cqb cqbVar = new cqb(new defpackage.aum(obj6, obj5, 14));
                    java.lang.Object objG3 = cavVar2.g();
                    java.lang.Object obj7 = cau.a;
                    if (objG3 == obj7) {
                        objG3 = new defpackage.bcm(4);
                        cavVar2.w(objG3);
                    }
                    java.lang.Object obj8 = this.a;
                    java.lang.Object obj9 = this.d;
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = dig.a;
                    kaw kawVar = (kaw) obj9;
                    cmw cmwVarP = uu.p(cqbVar.a(new dhs(false, (aonj) objG3)).a(new defpackage.bha(new defpackage.ebw((defpackage.bgy) obj6, (djg) obj5))).a(new defpackage.ann(kawVar)), cvj.c);
                    boolean zD = cavVar2.D(obj6) | cavVar2.B(obj5) | cavVar2.D(obj8);
                    java.lang.Object objG4 = cavVar2.g();
                    if (zD || objG4 == obj7) {
                        objG4 = new defpackage.ny(obj5, obj8, i, null == true ? 1 : 0);
                        cavVar2.w(objG4);
                    }
                    awo.c(cmwVarP.a(new defpackage.ana(kawVar, false, null, null, (aomy) objG4, null, null)), cavVar2, 0);
                } else {
                    cavVar2.s();
                }
                return aojh.a;
            case 2:
                cav cavVar3 = (cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                int i3 = iIntValue3 & 3;
                int i4 = iIntValue3 & 1;
                ajb ajbVar = defpackage.bmz.a;
                if (cavVar3.H(i3 != 2, i4)) {
                    ?? r2 = this.d;
                    cmw cmwVarAX = den.aX(azm.e(uu.m(azm.d(cmw.c, 1.0f), (azz) this.a), 80.0f), (ayy) this.b);
                    cye cyeVarA = azh.a((awa) r2, cmh.n, cavVar3, 48);
                    int iM2 = anty.M(cavVar3.a());
                    cje cjeVarM2 = cavVar3.M();
                    cmw cmwVarM2 = cfo.m(cavVar3, cmwVarAX);
                    aomy aomyVar3 = dam.a;
                    cavVar3.L();
                    cavVar3.v();
                    if (cavVar3.F()) {
                        cavVar3.j(aomyVar3);
                    } else {
                        cavVar3.x();
                    }
                    ?? r0 = this.c;
                    cev.c(cavVar3, cyeVarA, dam.e);
                    cev.c(cavVar3, cjeVarM2, dam.d);
                    cev.c(cavVar3, java.lang.Integer.valueOf(iM2), dam.f);
                    cev.b(cavVar3, dam.g);
                    cev.c(cavVar3, cmwVarM2, dam.c);
                    r0.a(azk.a, cavVar3, 6);
                    cavVar3.n();
                } else {
                    cavVar3.s();
                }
                return aojh.a;
            case 3:
                cav cavVar4 = (cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (cavVar4.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    cmt cmtVar = cmw.c;
                    cye cyeVarB2 = awo.b(cmh.a, false);
                    int iM3 = anty.M(cavVar4.a());
                    cje cjeVarM3 = cavVar4.M();
                    cmw cmwVarM3 = cfo.m(cavVar4, cmtVar);
                    aomy aomyVar4 = dam.a;
                    cavVar4.L();
                    cavVar4.v();
                    if (cavVar4.F()) {
                        cavVar4.j(aomyVar4);
                    } else {
                        cavVar4.x();
                    }
                    java.lang.Object obj10 = this.d;
                    ?? r8 = this.c;
                    cev.c(cavVar4, cyeVarB2, dam.e);
                    cev.c(cavVar4, cjeVarM3, dam.d);
                    cev.c(cavVar4, java.lang.Integer.valueOf(iM3), dam.f);
                    cev.b(cavVar4, dam.g);
                    cev.c(cavVar4, cmwVarM3, dam.c);
                    r8.a(obj10, cavVar4, 6);
                    defpackage.oq oqVar = (defpackage.oq) obj10;
                    boolean zBooleanValue = ((java.lang.Boolean) oqVar.a.a()).booleanValue();
                    java.lang.Object objG5 = cavVar4.g();
                    if (objG5 == cau.a) {
                        objG5 = new defpackage.bll(obj10, 13);
                        cavVar4.w(objG5);
                    }
                    pf.h(zBooleanValue, (aomy) objG5, (cmw) null, 0L, (defpackage.aon) null, (defpackage.drs) null, (crd) null, 0L, 0.0f, cfo.j(1656627541, new jai((defpackage.bsh) this.b, oqVar, (cer) this.a, 1), cavVar4), cavVar4, 48, 48, 2044);
                    cavVar4.n();
                } else {
                    cavVar4.s();
                }
                return aojh.a;
            case 4:
                cav cavVar5 = (cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                int i5 = iIntValue5 & 3;
                int i6 = iIntValue5 & 1;
                int i7 = defpackage.bqg.a;
                if (cavVar5.H(i5 != 2, i6)) {
                    defpackage.bqg.g(this.d, this.b, this.a, this.c, cavVar5, 384);
                } else {
                    cavVar5.s();
                }
                return aojh.a;
            case 5:
                cav cavVar6 = (cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                int i8 = iIntValue6 & 3;
                int i9 = iIntValue6 & 1;
                defpackage.bvf bvfVar = defpackage.bvf.a;
                if (cavVar6.H(i8 != 2, i9)) {
                    java.lang.Object obj11 = this.a;
                    ?? r3 = this.d;
                    java.lang.Object obj12 = this.b;
                    cmw cmwVarC = cmw.c;
                    cmw cmwVarA = azm.a(cmwVarC, defpackage.bvf.d, defpackage.bvf.c);
                    if (obj12 instanceof defpackage.bxh) {
                        dpq dpqVar = (dpq) obj11;
                        final float fAW = den.aW((ayy) r3, dpqVar);
                        final float fAV = den.aV((ayy) r3, dpqVar);
                        final defpackage.bxh bxhVar = (defpackage.bxh) obj12;
                        cmwVarC = den.C(cmwVarC, new aono() { // from class: bpu
                            public final java.lang.Object a(java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15) {
                                final cyi cyiVar = (cyi) obj13;
                                final czc czcVarV = ((cyd) obj14).v(((dpd) obj15).a);
                                int i10 = czcVarV.a;
                                int i11 = czcVarV.b;
                                long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(i10);
                                long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(i11);
                                final float f = -cyiVar.dl(fAW);
                                final float fDl = cyiVar.dl(fAV);
                                final defpackage.bxh bxhVar2 = bxhVar;
                                final long j = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
                                return den.z(cyiVar, i10, i11, new aonj() { // from class: bpv
                                    public final java.lang.Object a(java.lang.Object obj16) {
                                        long j2 = j;
                                        aopm aopmVar = new aopm(0.0f, java.lang.Float.intBitsToFloat((int) (4294967295L & j2)) / 2.0f);
                                        bfx bfxVarA = bxhVar2.a.a();
                                        bfy bfyVar = bfxVarA.a;
                                        cyi cyiVar2 = cyiVar;
                                        float fFloatValue = ((java.lang.Number) aooc.D(java.lang.Float.valueOf(bfyVar.a(j2, cyiVar2)), aopmVar)).floatValue();
                                        float fFloatValue2 = ((java.lang.Number) aooc.D(java.lang.Float.valueOf(bfxVarA.b.a(j2, cyiVar2)), aopmVar)).floatValue();
                                        ((czb) obj16).u(czcVarV, aopc.i(aooc.s((((fFloatValue + ((java.lang.Number) aooc.D(java.lang.Float.valueOf(bfxVarA.d.a(j2, cyiVar2)), aopmVar)).floatValue()) / 2.0f) - ((fFloatValue2 + ((java.lang.Number) aooc.D(java.lang.Float.valueOf(bfxVarA.c.a(j2, cyiVar2)), aopmVar)).floatValue()) / 2.0f)) * 0.11f, f, fDl)), 0, 0.0f);
                                        return aojh.a;
                                    }
                                });
                            }
                        });
                    }
                    cmw cmwVarAX2 = den.aX(cmwVarA.a(cmwVarC), (ayy) r3);
                    cye cyeVarA2 = azh.a(awi.e, cmh.n, cavVar6, 54);
                    int iM4 = anty.M(cavVar6.a());
                    cje cjeVarM4 = cavVar6.M();
                    cmw cmwVarM4 = cfo.m(cavVar6, cmwVarAX2);
                    aomy aomyVar5 = dam.a;
                    cavVar6.L();
                    cavVar6.v();
                    if (cavVar6.F()) {
                        cavVar6.j(aomyVar5);
                    } else {
                        cavVar6.x();
                    }
                    ?? r1 = this.c;
                    cev.c(cavVar6, cyeVarA2, dam.e);
                    cev.c(cavVar6, cjeVarM4, dam.d);
                    cev.c(cavVar6, java.lang.Integer.valueOf(iM4), dam.f);
                    cev.b(cavVar6, dam.g);
                    cev.c(cavVar6, cmwVarM4, dam.c);
                    r1.a(azk.a, cavVar6, 6);
                    cavVar6.n();
                } else {
                    cavVar6.s();
                }
                return aojh.a;
            case 6:
                cav cavVar7 = (cav) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                if (cavVar7.H((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    gus.aG(false, false, cfo.j(2045261556, new defpackage.bit((defpackage.iss) this.c, (defpackage.isr) this.a, (android.view.View) this.d, (android.view.View) this.b, 7), cavVar7), cavVar7, 384, 3);
                } else {
                    cavVar7.s();
                }
                return aojh.a;
            case 7:
                cav cavVar8 = (cav) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                if (cavVar8.H((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    java.lang.Object obj13 = this.d;
                    java.lang.Object obj14 = this.a;
                    java.lang.Object obj15 = this.c;
                    cmw cmwVarAZ = den.aZ(cmw.c, 16.0f, 0.0f);
                    int i10 = 3;
                    if (obj13 != null) {
                        cavVar8.u(1981556506);
                        boolean zD2 = cavVar8.D(obj14) | cavVar8.B(obj15);
                        java.lang.Object objG6 = cavVar8.g();
                        if (zD2 || objG6 == cau.a) {
                            objG6 = new defpackage.hpc(obj14, obj15, i10);
                            cavVar8.w(objG6);
                        }
                        aomyVar = (aomy) objG6;
                        cavVar8.o();
                    } else {
                        cavVar8.u(1982044136);
                        cavVar8.o();
                    }
                    aomy aomyVar6 = aomyVar;
                    java.lang.Object obj16 = this.b;
                    boolean zD3 = cavVar8.D(obj16);
                    java.lang.Object objG7 = cavVar8.g();
                    if (zD3 || objG7 == cau.a) {
                        objG7 = new defpackage.hll(obj16, i2);
                        cavVar8.w(objG7);
                    }
                    aomy aomyVar7 = (aomy) objG7;
                    java.lang.Object objG8 = cavVar8.g();
                    if (objG8 == cau.a) {
                        objG8 = new defpackage.fxb(3);
                        cavVar8.w(objG8);
                    }
                    defpackage.hgz.I(((defpackage.iss) obj15).a, 1, cmwVarAZ, aomyVar6, aomyVar7, (aonn) objG8, ((defpackage.isr) obj14).g, (android.view.View) obj13, cavVar8, 1573296, 264);
                } else {
                    cavVar8.s();
                }
                return aojh.a;
            case 8:
                cav cavVar9 = (cav) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                if (cavVar9.H((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    bvo.b((cmw) null, bge.b(8.0f), cfd.M(urg.c((android.content.Context) this.d, android.R.attr.colorBackgroundFloating)), 0L, 0.0f, 8.0f, (amu) null, cfo.j(1023246262, new defpackage.ata(this.a, this.b, this.c, 9, (byte[]) null), cavVar9), cavVar9, 89);
                } else {
                    cavVar9.s();
                }
                return aojh.a;
            case 9:
                cav cavVar10 = (cav) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                if (cavVar10.H((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    java.lang.Object obj17 = this.a;
                    cmw cmwVarA2 = this.d.a(cmw.c, 1.0f, true);
                    qxp qxpVar = ((qyl) obj17).c;
                    if (qxpVar == null) {
                        qxpVar = qxp.a;
                    }
                    java.lang.Object obj18 = this.b;
                    java.lang.Object obj19 = this.c;
                    java.lang.String str = qxpVar.d;
                    aooh.e(str, "getLabel(...)");
                    boolean zB = cavVar10.B(obj19) | cavVar10.z(((qtr) obj18).k);
                    java.lang.Object objG9 = cavVar10.g();
                    if (zB || objG9 == cau.a) {
                        objG9 = new qza(obj19, obj18, 0);
                        cavVar10.w(objG9);
                    }
                    pez.bD(cmwVarA2, str, (aomy) objG9, cavVar10, 0);
                } else {
                    cavVar10.s();
                }
                return aojh.a;
            case 10:
                cav cavVar11 = (cav) obj;
                int iIntValue11 = ((java.lang.Integer) obj2).intValue();
                if (cavVar11.H((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    java.lang.Object obj20 = this.a;
                    cmw cmwVarA3 = this.d.a(cmw.c, 1.0f, true);
                    qxp qxpVar2 = ((qyl) obj20).c;
                    if (qxpVar2 == null) {
                        qxpVar2 = qxp.a;
                    }
                    java.lang.Object obj21 = this.b;
                    java.lang.Object obj22 = this.c;
                    java.lang.String str2 = qxpVar2.d;
                    aooh.e(str2, "getLabel(...)");
                    boolean zB2 = cavVar11.B(obj22) | cavVar11.z(((qtr) obj21).k);
                    java.lang.Object objG10 = cavVar11.g();
                    if (zB2 || objG10 == cau.a) {
                        objG10 = new qza(obj22, obj21, 1);
                        cavVar11.w(objG10);
                    }
                    pez.bD(cmwVarA3, str2, (aomy) objG10, cavVar11, 0);
                } else {
                    cavVar11.s();
                }
                return aojh.a;
            case 11:
                cav cavVar12 = (cav) obj;
                int iIntValue12 = ((java.lang.Integer) obj2).intValue();
                int i11 = iIntValue12 & 3;
                int i12 = iIntValue12 & 1;
                java.util.List list = sme.a;
                if (cavVar12.H(i11 != 2, i12)) {
                    ?? r4 = this.c;
                    ?? r5 = this.a;
                    ?? r6 = this.b;
                    this.d.a(cavVar12, 0);
                    r6.a(cavVar12, 0);
                    r5.a(cavVar12, 0);
                    r4.a(cavVar12, 0);
                } else {
                    cavVar12.s();
                }
                return aojh.a;
            case 12:
                cav cavVar13 = (cav) obj;
                int iIntValue13 = ((java.lang.Integer) obj2).intValue();
                int i13 = iIntValue13 & 3;
                if (cavVar13.H(i13 != 2, iIntValue13 & 1)) {
                    java.lang.Object objG11 = cavVar13.g();
                    java.lang.Object obj23 = cau.a;
                    if (objG11 == obj23) {
                        objG11 = cbp.a(aols.a, cavVar13);
                        cavVar13.w(objG11);
                    }
                    aoss aossVar = (aoss) objG11;
                    android.content.Context context = (android.content.Context) cavVar13.e(dep.b);
                    java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(new defpackage.fwn[0], 0);
                    dko dkoVar = new dko(new defpackage.fxi(), new dih(context, 18), 1);
                    boolean zD4 = cavVar13.D(context);
                    java.lang.Object objG12 = cavVar13.g();
                    if (zD4 || objG12 == obj23) {
                        objG12 = new defpackage.dqk(context, 19);
                        cavVar13.w(objG12);
                    }
                    defpackage.fvx fvxVar = (defpackage.fvx) cfd.n(objArrCopyOf, dkoVar, (aomy) objG12, cavVar13, 0);
                    java.lang.Object obj24 = this.b;
                    cmw cmwVarX = den.x(azm.b(defpackage.bac.b(cmw.c), 1.0f), "bottomSheet");
                    defpackage.btt bttVarJ = defpackage.rl.j(true, cavVar13, 2);
                    boolean zD5 = cavVar13.D(obj24);
                    java.lang.Object objG13 = cavVar13.g();
                    if (zD5 || objG13 == obj23) {
                        objG13 = new addr(obj24, 6);
                        cavVar13.w(objG13);
                    }
                    aaoo.O((aomy) objG13, cmwVarX, bttVarJ, 0.0f, false, (crd) null, 0L, 0L, 0.0f, 0L, (aonn) null, new agjd(1), (defpackage.brt) null, cfo.j(130752992, new defpackage.afnc((com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity) obj24, fvxVar, (android.accounts.Account) this.d, (akpg) this.c, (akoq) this.a, aossVar, 0), cavVar13), cavVar13, 0, 3072, 6136);
                } else {
                    cavVar13.s();
                }
                return aojh.a;
            default:
                int iIntValue14 = ((java.lang.Integer) obj).intValue();
                long jLongValue = ((java.lang.Long) obj2).longValue();
                if (iIntValue14 == 1) {
                    aoot aootVar = (aoot) this.d;
                    if (aootVar.a != null) {
                        throw new java.io.IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue != 24) {
                        throw new java.io.IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    java.lang.Object obj25 = this.a;
                    java.lang.Object obj26 = this.b;
                    ?? r7 = this.c;
                    aootVar.a = java.lang.Long.valueOf(r7.l());
                    ((aoot) obj26).a = java.lang.Long.valueOf(r7.l());
                    ((aoot) obj25).a = java.lang.Long.valueOf(r7.l());
                }
                return aojh.a;
        }
    }

    public /* synthetic */ bit(aonn aonnVar, aonn aonnVar2, aonn aonnVar3, aonn aonnVar4, int i) {
        this.$cid = i;
        this.d = aonnVar;
        this.b = aonnVar2;
        this.a = aonnVar3;
        this.c = aonnVar4;
    }

    public /* synthetic */ bit(aono aonoVar, defpackage.oq oqVar, defpackage.bsh bshVar, cer cerVar, int i) {
        this.$cid = i;
        this.c = aonoVar;
        this.d = oqVar;
        this.b = bshVar;
        this.a = cerVar;
    }

    public /* synthetic */ bit(aoot aootVar, appa appaVar, aoot aootVar2, aoot aootVar3, int i) {
        this.$cid = i;
        this.d = aootVar;
        this.c = appaVar;
        this.b = aootVar2;
        this.a = aootVar3;
    }

    public /* synthetic */ bit(azj azjVar, qyl qylVar, qyz qyzVar, qtr qtrVar, int i) {
        this.$cid = i;
        this.d = azjVar;
        this.a = qylVar;
        this.c = qyzVar;
        this.b = qtrVar;
    }

    public /* synthetic */ bit(azz azzVar, ayy ayyVar, awa awaVar, aono aonoVar, int i) {
        this.$cid = i;
        this.a = azzVar;
        this.b = ayyVar;
        this.d = awaVar;
        this.c = aonoVar;
    }

    public /* synthetic */ bit(defpackage.bgy bgyVar, djg djgVar, kaw kawVar, defpackage.oq oqVar, int i) {
        this.$cid = i;
        this.b = bgyVar;
        this.c = djgVar;
        this.d = kawVar;
        this.a = oqVar;
    }

    public /* synthetic */ bit(cmw cmwVar, ccp ccpVar, aonn aonnVar, defpackage.bis bisVar, int i) {
        this.$cid = i;
        this.a = cmwVar;
        this.b = ccpVar;
        this.c = aonnVar;
        this.d = bisVar;
    }

    public /* synthetic */ bit(com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity googlePhotosBottomSheetActivity, android.accounts.Account account, akpg akpgVar, akoq akoqVar, int i) {
        this.$cid = i;
        this.b = googlePhotosBottomSheetActivity;
        this.d = account;
        this.c = akpgVar;
        this.a = akoqVar;
    }

    public /* synthetic */ bit(crd crdVar, ayy ayyVar, dpq dpqVar, aono aonoVar, int i) {
        this.$cid = i;
        this.b = crdVar;
        this.d = ayyVar;
        this.a = dpqVar;
        this.c = aonoVar;
    }

    public /* synthetic */ bit(defpackage.iss issVar, defpackage.isr isrVar, android.view.View view, android.view.View view2, int i) {
        this.$cid = i;
        this.c = issVar;
        this.a = isrVar;
        this.d = view;
        this.b = view2;
    }
}
