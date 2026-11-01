package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rzg implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ rzg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [abko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [aonn, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.abki abkhVar;
        long j;
        int i = 18;
        defpackage.ablb cqgVar = null;
        int i2 = 3;
        switch (this.$cid) {
            case 0:
                return a.t((aonn) this.a, (cav) obj, ((java.lang.Integer) obj2).intValue());
            case 1:
                cav cavVar = (cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    java.lang.Object obj3 = this.a;
                    boolean zB = cavVar.B(obj3);
                    java.lang.Object objG = cavVar.g();
                    if (zB || objG == cau.a) {
                        objG = new defpackage.pqf(obj3, 13);
                        cavVar.w(objG);
                    }
                    kj.s(false, (aomy) objG, cavVar, 0);
                    snl.U((defpackage.rzf) obj3, cavVar, 0);
                } else {
                    cavVar.s();
                }
                return aojh.a;
            case 2:
                cav cavVar2 = (cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    gus.aG(false, false, cfo.j(1263293818, new defpackage.rzg(this.a, i2), cavVar2), cavVar2, 384, 3);
                } else {
                    cavVar2.s();
                }
                return aojh.a;
            case 3:
                cav cavVar3 = (cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (cavVar3.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    ccp ccpVar = ((com.android.dialer.patrick.impl.settings.ui.CallingCardComposePreferenceCompat) this.a).a;
                    if (((defpackage.sgl) ccpVar.a()).e) {
                        cavVar3.u(-2012219010);
                        snl.C((defpackage.sgl) ccpVar.a(), (cmw) null, cavVar3, 0);
                        cavVar3.o();
                    } else {
                        cavVar3.u(-2012139464);
                        snl.B((defpackage.sgl) ccpVar.a(), (cmw) null, cavVar3, 0);
                        cavVar3.o();
                    }
                } else {
                    cavVar3.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                cav cavVar4 = (cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (cavVar4.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    java.lang.Object obj4 = this.a;
                    defpackage.sgn sgnVar = (defpackage.sgn) obj4;
                    android.net.Uri uri = sgnVar.b;
                    if (uri == null) {
                        cavVar4.u(1589598475);
                        java.lang.String str = sgnVar.a;
                        java.lang.String str2 = sgnVar.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        abkhVar = mni.cr(new lpg(str, str2), cavVar4);
                        cavVar4.o();
                    } else {
                        cavVar4.u(1589755304);
                        cavVar4.o();
                        abkhVar = new abkh(uri, (abjz) null, false, 14);
                    }
                    aaoo.U(cfo.j(-373529318, new defpackage.rzg(obj4, 7), cavVar4), den.aZ(den.bj(cmw.c, true, (java.lang.String) null, (dib) null, sgnVar.d), 0.0f, 2.0f), (aonn) null, cfo.j(-1815368162, new defpackage.rzg(new abkp(abkhVar, android.text.TextUtils.expandTemplate(dfa.f(2132017484, cavVar4), sgnVar.a).toString()), 8), cavVar4), (aonn) null, (bqe) null, cavVar4, 24582, 492);
                } else {
                    cavVar4.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return a.t((aonn) this.a, (cav) obj, ((java.lang.Integer) obj2).intValue());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                cav cavVar5 = (cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (cavVar5.H((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    cmt cmtVar = cmw.c;
                    cmw cmwVarC = azm.c(cmtVar, 1.0f);
                    cye cyeVarB = awo.b(cmh.e, false);
                    int iM = anty.M(cavVar5.a());
                    cje cjeVarM = cavVar5.M();
                    cmw cmwVarM = cfo.m(cavVar5, cmwVarC);
                    aomy aomyVar = dam.a;
                    cavVar5.L();
                    cavVar5.v();
                    if (cavVar5.F()) {
                        cavVar5.j(aomyVar);
                    } else {
                        cavVar5.x();
                    }
                    aonn aonnVar = dam.e;
                    cev.c(cavVar5, cyeVarB, aonnVar);
                    aonn aonnVar2 = dam.d;
                    cev.c(cavVar5, cjeVarM, aonnVar2);
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                    aonn aonnVar3 = dam.f;
                    cev.c(cavVar5, numValueOf, aonnVar3);
                    aonj aonjVar = dam.g;
                    cev.b(cavVar5, aonjVar);
                    aonn aonnVar4 = dam.c;
                    cev.c(cavVar5, cmwVarM, aonnVar4);
                    cmw cmwVarA = bac.a(den.aZ(cmtVar, 12.0f, 0.0f));
                    cye cyeVarA = aww.a(awi.c, cmh.j, cavVar5, 0);
                    int iM2 = anty.M(cavVar5.a());
                    cje cjeVarM2 = cavVar5.M();
                    cmw cmwVarM2 = cfo.m(cavVar5, cmwVarA);
                    cavVar5.L();
                    cavVar5.v();
                    if (cavVar5.F()) {
                        cavVar5.j(aomyVar);
                    } else {
                        cavVar5.x();
                    }
                    java.lang.Object obj5 = this.a;
                    cev.c(cavVar5, cyeVarA, aonnVar);
                    cev.c(cavVar5, cjeVarM2, aonnVar2);
                    cev.c(cavVar5, java.lang.Integer.valueOf(iM2), aonnVar3);
                    cev.b(cavVar5, aonjVar);
                    cev.c(cavVar5, cmwVarM2, aonnVar4);
                    snl.H((cmw) null, cavVar5, 0);
                    den.aR(azm.e(cmtVar, 8.0f), cavVar5);
                    defpackage.sgl sglVar = (defpackage.sgl) obj5;
                    snl.x(sglVar, cavVar5, 0);
                    den.aR(azm.e(cmtVar, 16.0f), cavVar5);
                    snl.u(sglVar, cavVar5, 0);
                    cavVar5.n();
                    if (sglVar.f) {
                        cavVar5.u(1277049188);
                        snl.s(cavVar5, 0);
                        cavVar5.o();
                    } else {
                        cavVar5.u(1277094355);
                        cavVar5.o();
                    }
                    cavVar5.n();
                } else {
                    cavVar5.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                cav cavVar6 = (cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                if (cavVar6.H((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    abrz.k(((defpackage.sgn) this.a).a, (cmw) null, den.ak(cavVar6).q, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVar6, 0, 0, 262138);
                } else {
                    cavVar6.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                cav cavVar7 = (cav) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                if (cavVar7.H((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    aehj.ao((defpackage.abko) this.a, azm.g(cmw.c, 40.0f), (crd) null, cavVar7, 48, 4);
                } else {
                    cavVar7.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                cav cavVar8 = (cav) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                if (cavVar8.H((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    cmt cmtVar2 = cmw.c;
                    cmw cmwVarA2 = bac.a(den.ba(cmtVar2, 16.0f, 0.0f, 16.0f, 0.0f));
                    cye cyeVarA2 = aww.a(awi.c, cmh.j, cavVar8, 0);
                    int iM3 = anty.M(cavVar8.a());
                    cje cjeVarM3 = cavVar8.M();
                    cmw cmwVarM3 = cfo.m(cavVar8, cmwVarA2);
                    aomy aomyVar2 = dam.a;
                    cavVar8.L();
                    cavVar8.v();
                    if (cavVar8.F()) {
                        cavVar8.j(aomyVar2);
                    } else {
                        cavVar8.x();
                    }
                    java.lang.Object obj6 = this.a;
                    cev.c(cavVar8, cyeVarA2, dam.e);
                    cev.c(cavVar8, cjeVarM3, dam.d);
                    cev.c(cavVar8, java.lang.Integer.valueOf(iM3), dam.f);
                    cev.b(cavVar8, dam.g);
                    cev.c(cavVar8, cmwVarM3, dam.c);
                    snl.E((cmw) null, cavVar8, 0);
                    defpackage.sgl sglVar2 = (defpackage.sgl) obj6;
                    java.util.List list = sglVar2.c;
                    if (list.isEmpty()) {
                        cavVar8.u(1615782188);
                        cavVar8.o();
                    } else {
                        cavVar8.u(1615586144);
                        den.aR(azm.e(cmtVar2, 8.0f), cavVar8);
                        snl.y(2132018155, cavVar8, 0);
                        snl.D(list, (cmw) null, cavVar8, 0);
                        cavVar8.o();
                    }
                    snl.F(sglVar2.a, (cmw) null, cavVar8, 0);
                    cavVar8.n();
                } else {
                    cavVar8.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                cav cavVar9 = (cav) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                if (cavVar9.H((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    final defpackage.sle sleVar = (defpackage.sle) this.a;
                    abny.c((aonn) null, (aonn) null, (aonn) null, (aono) null, (aonn) null, (aono) null, (aonq) null, (aono) null, false, (aonn) null, (aonj) null, 0, cfo.j(-664340410, new aonn() { // from class: skw
                        /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                        /* JADX WARN: Code duplicated, block: B:108:0x040f  */
                        /* JADX WARN: Code duplicated, block: B:110:0x044e  */
                        /* JADX WARN: Code duplicated, block: B:52:0x0264  */
                        /* JADX WARN: Code duplicated, block: B:55:0x0273  */
                        /* JADX WARN: Code duplicated, block: B:57:0x0282  */
                        /* JADX WARN: Code duplicated, block: B:58:0x0284  */
                        /* JADX WARN: Code duplicated, block: B:61:0x02b6  */
                        /* JADX WARN: Code duplicated, block: B:62:0x02b9  */
                        /* JADX WARN: Code duplicated, block: B:65:0x02cf  */
                        /* JADX WARN: Code duplicated, block: B:67:0x02d3  */
                        /* JADX WARN: Code duplicated, block: B:69:0x02e3  */
                        /* JADX WARN: Code duplicated, block: B:72:0x02fb  */
                        /* JADX WARN: Code duplicated, block: B:75:0x0301  */
                        /* JADX WARN: Code duplicated, block: B:78:0x0314  */
                        /* JADX WARN: Code duplicated, block: B:84:0x0360  */
                        /* JADX WARN: Code duplicated, block: B:87:0x0374  */
                        /* JADX WARN: Code duplicated, block: B:89:0x039a  */
                        /* JADX WARN: Code duplicated, block: B:91:0x03aa  */
                        /* JADX WARN: Code duplicated, block: B:92:0x03c7  */
                        public final java.lang.Object a(java.lang.Object obj7, java.lang.Object obj8) throws aois {
                            defpackage.skf skfVar;
                            defpackage.abix abixVar;
                            defpackage.abix abixVar2;
                            boolean z;
                            aoin aoinVar;
                            java.lang.String str3;
                            boolean z2;
                            boolean z3;
                            boolean z4;
                            boolean zBooleanValue;
                            boolean zBooleanValue2;
                            java.lang.String str4;
                            android.net.Uri uri2;
                            java.lang.String str5;
                            defpackage.amml ammlVar;
                            akzv akzvVar;
                            defpackage.skn sknVar;
                            defpackage.amml ammlVar2;
                            defpackage.sko skoVar;
                            boolean zBooleanValue3;
                            boolean z5;
                            boolean z6;
                            int i3;
                            java.lang.String strJ;
                            int i4;
                            java.lang.String strC;
                            defpackage.skp skpVar;
                            cav cavVar10 = (cav) obj7;
                            int iIntValue10 = ((java.lang.Integer) obj8).intValue();
                            if (cavVar10.H((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                                final defpackage.sle sleVar2 = sleVar;
                                boolean zD = cavVar10.D(sleVar2);
                                java.lang.Object objG2 = cavVar10.g();
                                int i5 = 3;
                                if (zD || objG2 == cau.a) {
                                    objG2 = new defpackage.sba((java.lang.Object) sleVar2, 3, (short[]) null);
                                    cavVar10.w(objG2);
                                }
                                aonj aonjVar2 = (aonj) objG2;
                                aooh.f(aonjVar2, "onPhotoChosen");
                                pb pbVar = new pb();
                                boolean zB2 = cavVar10.B(aonjVar2);
                                java.lang.Object objG3 = cavVar10.g();
                                if (zB2 || objG3 == cau.a) {
                                    objG3 = new opy(aonjVar2, 0);
                                    cavVar10.w(objG3);
                                }
                                nw nwVarBI = den.bI(pbVar, (aonj) objG3, cavVar10);
                                java.lang.Object objG4 = cavVar10.g();
                                int i6 = 17;
                                int i7 = 16;
                                if (objG4 == cau.a) {
                                    int i8 = 18;
                                    defpackage.smu smuVar = new defpackage.smu(new ovt(sleVar2, 11, (boolean[][]) null), new defpackage.pqf(sleVar2, 20), new aomy() { // from class: skz
                                        public final java.lang.Object a() {
                                            int iAW;
                                            int iAR;
                                            defpackage.amml ammlVar3;
                                            defpackage.skp skpVar2;
                                            defpackage.skp skpVar3;
                                            defpackage.skp skpVar4;
                                            defpackage.skp skpVar5;
                                            defpackage.sle sleVar3 = sleVar2;
                                            aoin aoinVar2 = sleVar3.l;
                                            boolean z7 = true;
                                            if (!((java.lang.Boolean) aoinVar2.a()).booleanValue() ? (iAW = a.aW(sleVar3.d.e)) == 0 || iAW != 5 : sleVar3.t.a().f != defpackage.sjk.d) {
                                                z7 = false;
                                            }
                                            if (!((java.lang.Boolean) aoinVar2.a()).booleanValue() ? !((iAR = a.aR(sleVar3.d.g)) == 0 || iAR != 4) : sleVar3.t.a().e == defpackage.sjj.c) {
                                                if (z7) {
                                                    sleVar3.a().b(mce.hG);
                                                }
                                            }
                                            sleVar3.i.o(rmx.yt);
                                            defpackage.uhp uhpVar = sleVar3.K;
                                            defpackage.whl whlVar = (defpackage.whl) uhpVar.i;
                                            java.lang.Object obj9 = whlVar.a;
                                            java.lang.Float fValueOf = null;
                                            if (obj9 == null || (skpVar5 = ((defpackage.skq) obj9).a) == null || (skpVar5.b & 4) == 0) {
                                                ammlVar3 = null;
                                            } else {
                                                ammlVar3 = skpVar5.e;
                                                if (ammlVar3 == null) {
                                                    ammlVar3 = defpackage.amml.a;
                                                }
                                            }
                                            defpackage.sko skoVarH = uhpVar.h();
                                            java.lang.Object obj10 = whlVar.a;
                                            java.lang.Float fValueOf2 = (obj10 == null || (skpVar4 = ((defpackage.skq) obj10).a) == null) ? null : java.lang.Float.valueOf(skpVar4.i);
                                            java.lang.Object obj11 = whlVar.a;
                                            java.lang.Float fValueOf3 = (obj11 == null || (skpVar3 = ((defpackage.skq) obj11).a) == null) ? null : java.lang.Float.valueOf(skpVar3.j);
                                            java.lang.Object obj12 = whlVar.a;
                                            if (obj12 != null && (skpVar2 = ((defpackage.skq) obj12).a) != null) {
                                                fValueOf = java.lang.Float.valueOf(skpVar2.k);
                                            }
                                            defpackage.vqf vqfVarH = defpackage.abxl.H(defpackage.abxt.a.m());
                                            java.lang.String strJ2 = uhpVar.j();
                                            if (strJ2 != null && !aoov.H(strJ2)) {
                                                defpackage.vqf vqfVarK = defpackage.abxl.K(defpackage.abxp.a.m());
                                                defpackage.vqf vqfVarI = defpackage.abxl.I(defpackage.abxs.a.m());
                                                vqfVarI.P(strJ2);
                                                if (fValueOf2 != null) {
                                                    vqfVarI.R(fValueOf2.floatValue());
                                                }
                                                if (fValueOf3 != null) {
                                                    vqfVarI.S(fValueOf3.floatValue());
                                                }
                                                if (fValueOf != null) {
                                                    vqfVarI.T(fValueOf.floatValue());
                                                }
                                                vqfVarK.ac(vqfVarI.O());
                                                vqfVarH.M(vqfVarK.ab());
                                            }
                                            if (ammlVar3 != null || skoVarH != null) {
                                                defpackage.vqf vqfVarJ = defpackage.abxl.J(defpackage.abxr.a.m());
                                                if (ammlVar3 != null) {
                                                    vqfVarJ.V(ammlVar3);
                                                }
                                                if (skoVarH != null) {
                                                    vqfVarJ.Y(skoVarH.c);
                                                    vqfVarJ.aa(skoVarH.d);
                                                    vqfVarJ.Z(skoVarH.e);
                                                    vqfVarJ.W(skoVarH.f);
                                                    vqfVarJ.X(skoVarH.g);
                                                }
                                                vqfVarH.N(vqfVarJ.U());
                                            }
                                            defpackage.abxt abxtVarL = vqfVarH.L();
                                            if (((java.lang.Boolean) aoinVar2.a()).booleanValue()) {
                                                sleVar3.t.f(new defpackage.rzt(abxtVarL, 19));
                                                sleVar3.s.c();
                                            } else {
                                                android.content.Intent intent = new android.content.Intent();
                                                intent.putExtra("patrickDataKey", abxtVarL.i());
                                                defpackage.skv skvVar = sleVar3.e;
                                                skvVar.H().setResult(-1, intent);
                                                skvVar.H().finish();
                                            }
                                            return aojh.a;
                                        }
                                    }, new defpackage.skx(sleVar2, i5), new defpackage.pqf(sleVar2, i7), new defpackage.rzt(sleVar2, i7), new defpackage.rzt(sleVar2, i6), new defpackage.pqf(sleVar2, i6), new defpackage.pqf(sleVar2, i8), new defpackage.rzt(sleVar2, i8), new defpackage.pqf(sleVar2, 19), new defpackage.qza(sleVar2, nwVarBI, 11), new defpackage.sba((java.lang.Object) sleVar2, 2, (char[]) null), new ovt(sleVar2, 12, (float[][]) null), new defpackage.rzt(sleVar2, 20), new defpackage.skx(sleVar2, 1), new defpackage.skx(sleVar2, 0), new ovt(sleVar2, 13, (byte[][][]) null), new ovt(sleVar2, 14, (char[][][]) null), new defpackage.skx(sleVar2, 2), new sky(sleVar2, 0));
                                    cavVar10.w(smuVar);
                                    objG4 = smuVar;
                                }
                                defpackage.smu smuVar2 = (defpackage.smu) objG4;
                                defpackage.agyy agyyVar = (defpackage.agyy) sleVar2.C.a();
                                java.lang.Boolean bool = (java.lang.Boolean) sleVar2.x.a();
                                int i9 = 5;
                                j$.util.Objects.checkIndex(0, 5);
                                if (agyyVar != null) {
                                    if (agyyVar instanceof defpackage.agyx) {
                                        defpackage.skp skpVar2 = (defpackage.skp) ((defpackage.agyx) agyyVar).a;
                                        int i10 = skpVar2.c;
                                        defpackage.ryg rygVar = sleVar2.H;
                                        int i11 = skpVar2.l;
                                        if (i11 == 0) {
                                            i9 = 2;
                                        } else if (i11 == 1) {
                                            i9 = 3;
                                        } else if (i11 == 2) {
                                            i9 = 4;
                                        } else if (i11 != 3) {
                                            i9 = 0;
                                        }
                                        if (i9 == 0) {
                                            i9 = 1;
                                        }
                                        ovt ovtVar = new ovt(sleVar2, 15, (short[][][]) null);
                                        sky skyVar = new sky(sleVar2, 1);
                                        ovt ovtVar2 = new ovt(sleVar2, 16, (int[][][]) null);
                                        ovt ovtVar3 = new ovt(sleVar2, 17, (boolean[][][]) null);
                                        boolean z7 = !skpVar2.t;
                                        int i12 = i9 - 2;
                                        if (i12 == 1) {
                                            java.lang.Object obj9 = rygVar.a;
                                            abja abjaVar = abja.e;
                                            android.content.Context context = (android.content.Context) obj9;
                                            java.lang.String string = context.getString(2132017984);
                                            java.lang.String string2 = context.getString(2132017981);
                                            aooh.e(string2, "getString(...)");
                                            java.lang.String string3 = context.getString(2132017982);
                                            aooh.e(string3, "getString(...)");
                                            defpackage.abkq abkqVar = new defpackage.abkq(string3, z7, ovtVar);
                                            java.lang.String string4 = context.getString(2132017983);
                                            aooh.e(string4, "getString(...)");
                                            abixVar = new defpackage.abix(string2, null, abjaVar, string, abkqVar, new defpackage.abkq(string4, z7, skyVar), skyVar, 50);
                                        } else if (i12 != 2) {
                                            if (i12 != 3) {
                                                abixVar2 = null;
                                            } else {
                                                android.content.Context context2 = (android.content.Context) rygVar.a;
                                                java.lang.String string5 = context2.getString(2132018337);
                                                java.lang.String string6 = context2.getString(2132018334);
                                                aooh.e(string6, "getString(...)");
                                                java.lang.String string7 = context2.getString(2132018335);
                                                aooh.e(string7, "getString(...)");
                                                defpackage.abkq abkqVar2 = new defpackage.abkq(string7, z7, ovtVar3);
                                                java.lang.String string8 = context2.getString(2132018336);
                                                aooh.e(string8, "getString(...)");
                                                abixVar = new defpackage.abix(string6, null, null, string5, abkqVar2, new defpackage.abkq(string8, z7, skyVar), skyVar, 54);
                                            }
                                            z = skpVar2.h;
                                            aoinVar = sleVar2.l;
                                            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                                                str3 = sleVar2.d.f;
                                                aooh.e(str3, "getGaiaAccountName(...)");
                                                if (str3.length() == 0) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                            } else if (sleVar2.t.a().h.length() > 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            z3 = skpVar2.n;
                                            z4 = skpVar2.o;
                                            java.lang.Object objA = sleVar2.c.a();
                                            aooh.e(objA, "get(...)");
                                            zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                                            java.lang.Object objA2 = aoinVar.a();
                                            aooh.e(objA2, "get(...)");
                                            zBooleanValue2 = ((java.lang.Boolean) objA2).booleanValue();
                                            str4 = skpVar2.d;
                                            aooh.e(str4, "getBackgroundImageUri(...)");
                                            if (aoov.H(str4)) {
                                                uri2 = null;
                                            } else {
                                                java.lang.String str6 = skpVar2.d;
                                                aooh.e(str6, "getBackgroundImageUri(...)");
                                                android.net.Uri uri3 = android.net.Uri.parse(str6);
                                                aooh.e(uri3, "parse(...)");
                                                uri2 = uri3;
                                            }
                                            str5 = skpVar2.r;
                                            ammlVar = skpVar2.e;
                                            if (ammlVar == null) {
                                                ammlVar = defpackage.amml.a;
                                            }
                                            if (ammlVar != null) {
                                                throw new java.lang.IllegalArgumentException("Required value was null.");
                                            }
                                            float f = ammlVar.c;
                                            float f2 = ammlVar.d;
                                            float f3 = ammlVar.e;
                                            akzvVar = ammlVar.f;
                                            if (akzvVar == null) {
                                                akzvVar = akzv.a;
                                            }
                                            int iL = cfd.L(cfd.R(f, f2, f3, akzvVar.b, (crn) null, 16));
                                            sknVar = skpVar2.m;
                                            if (sknVar == null) {
                                                sknVar = defpackage.skn.a;
                                            }
                                            ammlVar2 = sknVar.f;
                                            if (ammlVar2 == null) {
                                                ammlVar2 = defpackage.amml.a;
                                            }
                                            aooh.e(ammlVar2, "getSelectedFontColor(...)");
                                            int iL2 = cfd.L(defpackage.sle.h(ammlVar2));
                                            skoVar = skpVar2.f;
                                            if (skoVar == null) {
                                                skoVar = defpackage.sko.a;
                                            }
                                            defpackage.sko skoVar2 = skoVar;
                                            java.lang.String str7 = skpVar2.g;
                                            aooh.e(str7, "getContactName(...)");
                                            defpackage.skd skdVar = new defpackage.skd(uri2, str5, iL, iL2, skoVar2, str7, java.lang.Float.valueOf(skpVar2.i), java.lang.Float.valueOf(skpVar2.j), java.lang.Float.valueOf(skpVar2.k));
                                            java.lang.Object objA3 = aoinVar.a();
                                            aooh.e(objA3, "get(...)");
                                            zBooleanValue3 = ((java.lang.Boolean) objA3).booleanValue();
                                            if (((java.lang.Boolean) aoinVar.a()).booleanValue() || sleVar2.t.a().e != defpackage.sjj.b) {
                                                z5 = false;
                                            } else {
                                                z5 = true;
                                            }
                                            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                                                z6 = zBooleanValue3;
                                                i3 = i10;
                                                if (sleVar2.t.a().e != defpackage.sjj.b) {
                                                    defpackage.sle.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer", "getRemixButtonLabel", 1119, "OnboardingFlowFragmentPeer.kt").v("Onboarding flow is not for MCC, Kappa button should not be shown");
                                                } else {
                                                    defpackage.uhp uhpVar = sleVar2.K;
                                                    strJ = uhpVar.j();
                                                    if (strJ != null || strJ.length() == 0) {
                                                        defpackage.sle.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer", "getRemixButtonLabel", 1127, "OnboardingFlowFragmentPeer.kt").v("Onboarding flow has no background image, Kappa button should not be shown");
                                                    } else {
                                                        java.lang.Object obj10 = ((defpackage.whl) uhpVar.i).a;
                                                        java.lang.Integer numValueOf2 = (obj10 == null || (skpVar = ((defpackage.skq) obj10).a) == null) ? null : java.lang.Integer.valueOf(skpVar.c);
                                                        if (numValueOf2 != null && numValueOf2.intValue() == 0) {
                                                            j$.util.Optional optionalG = sleVar2.J.g();
                                                            aooh.e(optionalG, "getFeature(...)");
                                                            defpackage.sjc sjcVar = (defpackage.sjc) aooh.q(optionalG);
                                                            if (sjcVar != null) {
                                                                i4 = i3;
                                                                strC = sjcVar.c();
                                                            }
                                                        }
                                                        java.lang.Object objA4 = sleVar2.v.a();
                                                        aooh.e(objA4, "get(...)");
                                                        boolean zBooleanValue4 = ((java.lang.Boolean) objA4).booleanValue();
                                                        aooh.c(bool);
                                                        skfVar = new defpackage.skf(i4, abixVar2, skdVar, z, z2, z3, z4, zBooleanValue, zBooleanValue2, z6, z5, strC, zBooleanValue4, bool.booleanValue());
                                                    }
                                                }
                                            } else {
                                                z6 = zBooleanValue3;
                                                i3 = i10;
                                                defpackage.sle.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer", "getRemixButtonLabel", 1111, "OnboardingFlowFragmentPeer.kt").v("Onboarding refactor disabled, Kappa button should not be shown");
                                            }
                                            i4 = i3;
                                            strC = null;
                                            java.lang.Object objA5 = sleVar2.v.a();
                                            aooh.e(objA5, "get(...)");
                                            boolean zBooleanValue5 = ((java.lang.Boolean) objA5).booleanValue();
                                            aooh.c(bool);
                                            skfVar = new defpackage.skf(i4, abixVar2, skdVar, z, z2, z3, z4, zBooleanValue, zBooleanValue2, z6, z5, strC, zBooleanValue5, bool.booleanValue());
                                        } else {
                                            android.content.Context context3 = (android.content.Context) rygVar.a;
                                            java.lang.String string9 = context3.getString(2132018242);
                                            java.lang.String string10 = context3.getString(2132018239);
                                            aooh.e(string10, "getString(...)");
                                            java.lang.String string11 = context3.getString(2132018240);
                                            aooh.e(string11, "getString(...)");
                                            defpackage.abkq abkqVar3 = new defpackage.abkq(string11, z7, ovtVar2);
                                            java.lang.String string12 = context3.getString(2132018241);
                                            aooh.e(string12, "getString(...)");
                                            abixVar = new defpackage.abix(string10, null, null, string9, abkqVar3, new defpackage.abkq(string12, z7, skyVar), skyVar, 54);
                                        }
                                        abixVar2 = abixVar;
                                        z = skpVar2.h;
                                        aoinVar = sleVar2.l;
                                        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                                            str3 = sleVar2.d.f;
                                            aooh.e(str3, "getGaiaAccountName(...)");
                                            if (str3.length() == 0) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                        } else if (sleVar2.t.a().h.length() > 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        z3 = skpVar2.n;
                                        z4 = skpVar2.o;
                                        java.lang.Object objA6 = sleVar2.c.a();
                                        aooh.e(objA6, "get(...)");
                                        zBooleanValue = ((java.lang.Boolean) objA6).booleanValue();
                                        java.lang.Object objA7 = aoinVar.a();
                                        aooh.e(objA7, "get(...)");
                                        zBooleanValue2 = ((java.lang.Boolean) objA7).booleanValue();
                                        str4 = skpVar2.d;
                                        aooh.e(str4, "getBackgroundImageUri(...)");
                                        if (aoov.H(str4)) {
                                            uri2 = null;
                                        } else {
                                            java.lang.String str8 = skpVar2.d;
                                            aooh.e(str8, "getBackgroundImageUri(...)");
                                            android.net.Uri uri4 = android.net.Uri.parse(str8);
                                            aooh.e(uri4, "parse(...)");
                                            uri2 = uri4;
                                        }
                                        str5 = skpVar2.r;
                                        ammlVar = skpVar2.e;
                                        if (ammlVar == null) {
                                            ammlVar = defpackage.amml.a;
                                        }
                                        if (ammlVar != null) {
                                            throw new java.lang.IllegalArgumentException("Required value was null.");
                                        }
                                        float f4 = ammlVar.c;
                                        float f5 = ammlVar.d;
                                        float f6 = ammlVar.e;
                                        akzvVar = ammlVar.f;
                                        if (akzvVar == null) {
                                            akzvVar = akzv.a;
                                        }
                                        int iL3 = cfd.L(cfd.R(f4, f5, f6, akzvVar.b, (crn) null, 16));
                                        sknVar = skpVar2.m;
                                        if (sknVar == null) {
                                            sknVar = defpackage.skn.a;
                                        }
                                        ammlVar2 = sknVar.f;
                                        if (ammlVar2 == null) {
                                            ammlVar2 = defpackage.amml.a;
                                        }
                                        aooh.e(ammlVar2, "getSelectedFontColor(...)");
                                        int iL4 = cfd.L(defpackage.sle.h(ammlVar2));
                                        skoVar = skpVar2.f;
                                        if (skoVar == null) {
                                            skoVar = defpackage.sko.a;
                                        }
                                        defpackage.sko skoVar3 = skoVar;
                                        java.lang.String str9 = skpVar2.g;
                                        aooh.e(str9, "getContactName(...)");
                                        defpackage.skd skdVar2 = new defpackage.skd(uri2, str5, iL3, iL4, skoVar3, str9, java.lang.Float.valueOf(skpVar2.i), java.lang.Float.valueOf(skpVar2.j), java.lang.Float.valueOf(skpVar2.k));
                                        java.lang.Object objA8 = aoinVar.a();
                                        aooh.e(objA8, "get(...)");
                                        zBooleanValue3 = ((java.lang.Boolean) objA8).booleanValue();
                                        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                                            z6 = zBooleanValue3;
                                            i3 = i10;
                                            defpackage.sle.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer", "getRemixButtonLabel", 1111, "OnboardingFlowFragmentPeer.kt").v("Onboarding refactor disabled, Kappa button should not be shown");
                                        } else {
                                            z6 = zBooleanValue3;
                                            i3 = i10;
                                            if (sleVar2.t.a().e != defpackage.sjj.b) {
                                                defpackage.sle.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer", "getRemixButtonLabel", 1119, "OnboardingFlowFragmentPeer.kt").v("Onboarding flow is not for MCC, Kappa button should not be shown");
                                            } else {
                                                defpackage.uhp uhpVar2 = sleVar2.K;
                                                strJ = uhpVar2.j();
                                                if (strJ != null) {
                                                    defpackage.sle.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer", "getRemixButtonLabel", 1127, "OnboardingFlowFragmentPeer.kt").v("Onboarding flow has no background image, Kappa button should not be shown");
                                                } else {
                                                    defpackage.sle.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer", "getRemixButtonLabel", 1127, "OnboardingFlowFragmentPeer.kt").v("Onboarding flow has no background image, Kappa button should not be shown");
                                                }
                                                java.lang.Object objA9 = sleVar2.v.a();
                                                aooh.e(objA9, "get(...)");
                                                boolean zBooleanValue6 = ((java.lang.Boolean) objA9).booleanValue();
                                                aooh.c(bool);
                                                skfVar = new defpackage.skf(i4, abixVar2, skdVar2, z, z2, z3, z4, zBooleanValue, zBooleanValue2, z6, z5, strC, zBooleanValue6, bool.booleanValue());
                                            }
                                        }
                                        i4 = i3;
                                        strC = null;
                                        java.lang.Object objA10 = sleVar2.v.a();
                                        aooh.e(objA10, "get(...)");
                                        boolean zBooleanValue7 = ((java.lang.Boolean) objA10).booleanValue();
                                        aooh.c(bool);
                                        skfVar = new defpackage.skf(i4, abixVar2, skdVar2, z, z2, z3, z4, zBooleanValue, zBooleanValue2, z6, z5, strC, zBooleanValue7, bool.booleanValue());
                                    } else if (agyyVar instanceof defpackage.agyu) {
                                        defpackage.skc skcVar = new defpackage.skc(((defpackage.agyu) agyyVar).a);
                                        aooh.c(bool);
                                        skfVar = new defpackage.skf(0, null, skcVar, false, false, false, false, false, false, false, false, null, false, bool.booleanValue());
                                    } else if (agyyVar instanceof defpackage.agyv) {
                                        defpackage.skb skbVar = defpackage.skb.a;
                                        aooh.c(bool);
                                        skfVar = new defpackage.skf(0, null, skbVar, false, false, false, false, false, false, false, false, null, false, bool.booleanValue());
                                    } else if (agyyVar instanceof defpackage.agyw) {
                                        defpackage.skb skbVar2 = defpackage.skb.a;
                                        aooh.c(bool);
                                        skfVar = new defpackage.skf(0, null, skbVar2, false, false, false, false, false, false, false, false, null, false, bool.booleanValue());
                                    }
                                    defpackage.sme.p(null, skfVar, smuVar2, cavVar10, 384);
                                }
                                throw new aois();
                            }
                            cavVar10.s();
                            return aojh.a;
                        }
                    }, cavVar9), cavVar9, 0, 384, 4095);
                } else {
                    cavVar9.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                cav cavVar10 = (cav) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                int i3 = iIntValue10 & 3;
                int i4 = iIntValue10 & 1;
                java.util.List list2 = defpackage.sme.a;
                if (cavVar10.H(i3 != 2, i4)) {
                    cmt cmtVar3 = cmw.c;
                    cmw cmwVarC2 = azm.c(cmtVar3, 1.0f);
                    cmj cmjVar = cmh.e;
                    cye cyeVarB2 = awo.b(cmjVar, false);
                    int iM4 = anty.M(cavVar10.a());
                    cje cjeVarM4 = cavVar10.M();
                    cmw cmwVarM4 = cfo.m(cavVar10, cmwVarC2);
                    aomy aomyVar3 = dam.a;
                    cavVar10.L();
                    cavVar10.v();
                    if (cavVar10.F()) {
                        cavVar10.j(aomyVar3);
                    } else {
                        cavVar10.x();
                    }
                    aonn aonnVar5 = dam.e;
                    cev.c(cavVar10, cyeVarB2, aonnVar5);
                    aonn aonnVar6 = dam.d;
                    cev.c(cavVar10, cjeVarM4, aonnVar6);
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iM4);
                    aonn aonnVar7 = dam.f;
                    cev.c(cavVar10, numValueOf2, aonnVar7);
                    aonj aonjVar2 = dam.g;
                    cev.b(cavVar10, aonjVar2);
                    aonn aonnVar8 = dam.c;
                    cev.c(cavVar10, cmwVarM4, aonnVar8);
                    cmw cmwVarG = azm.g(cmtVar3, 40.0f);
                    cye cyeVarB3 = awo.b(cmjVar, false);
                    int iM5 = anty.M(cavVar10.a());
                    cje cjeVarM5 = cavVar10.M();
                    cmw cmwVarM5 = cfo.m(cavVar10, cmwVarG);
                    cavVar10.L();
                    cavVar10.v();
                    if (cavVar10.F()) {
                        cavVar10.j(aomyVar3);
                    } else {
                        cavVar10.x();
                    }
                    ?? r0 = this.a;
                    cev.c(cavVar10, cyeVarB3, aonnVar5);
                    cev.c(cavVar10, cjeVarM5, aonnVar6);
                    cev.c(cavVar10, java.lang.Integer.valueOf(iM5), aonnVar7);
                    cev.b(cavVar10, aonjVar2);
                    cev.c(cavVar10, cmwVarM5, aonnVar8);
                    r0.a(cavVar10, 0);
                    cavVar10.n();
                    cavVar10.n();
                } else {
                    cavVar10.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                cav cavVar11 = (cav) obj;
                int iIntValue11 = ((java.lang.Integer) obj2).intValue();
                int i5 = iIntValue11 & 3;
                int i6 = iIntValue11 & 1;
                java.util.List list3 = defpackage.sme.a;
                if (cavVar11.H(i5 != 2, i6)) {
                    defpackage.sme.b((defpackage.skf) this.a, cavVar11, 0);
                } else {
                    cavVar11.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                cav cavVar12 = (cav) obj;
                int iIntValue12 = ((java.lang.Integer) obj2).intValue();
                if (cavVar12.H((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    java.lang.Object obj7 = this.a;
                    java.lang.String strF = dfa.f(2132019117, cavVar12);
                    dkz dkzVar = abts.I(cavVar12).a;
                    cmt cmtVar4 = cmw.c;
                    float f = defpackage.smf.a;
                    abrz.k(strF, den.ba(cmtVar4, 0.0f, 80.0f, 0.0f, 12.0f), den.ak(cavVar12).s, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 1, 0, (aonj) null, dkzVar, cavVar12, 0, 24576, 114680);
                    defpackage.slh slhVar = (defpackage.slh) obj7;
                    defpackage.abmv abmvVar = slhVar.c;
                    cavVar12.t(2139293994, abmvVar);
                    dmq dmqVarL = abmvVar != null ? abts.L(abmvVar) : null;
                    cavVar12.m();
                    java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(slhVar.d);
                    if (((numValueOf3.intValue() >> 24) & 255) <= 0) {
                        numValueOf3 = null;
                    }
                    cqgVar = numValueOf3 != null ? new cqg(cfd.M(numValueOf3.intValue())) : null;
                    if (cqgVar == null) {
                        cavVar12.u(2139303094);
                        j = den.ak(cavVar12).s;
                        cavVar12.o();
                    } else {
                        cavVar12.u(2139300118);
                        cavVar12.o();
                        j = ((cqg) cqgVar).a;
                    }
                    cer cerVarA = ahp.a(j, den.al(cavVar12).a(), cavVar12, 0, 12);
                    java.lang.String str3 = slhVar.b;
                    dkz dkzVar2 = den.an(cavVar12).q;
                    long jF = a.F(cerVarA);
                    cmw cmwVarX = den.x(cmtVar4, "onboarding_flow_preview_contact_name_text");
                    boolean zB2 = cavVar12.B(obj7);
                    java.lang.Object objG2 = cavVar12.g();
                    if (zB2 || objG2 == cau.a) {
                        objG2 = new defpackage.skx(obj7, 10);
                        cavVar12.w(objG2);
                    }
                    abrz.k(str3, vn.e(cmwVarX, (aonj) objG2), jF, 0L, (dnd) null, dmqVarL, 0L, new dot(3), 0L, 2, false, 2, 0, (aonj) null, dkzVar2, cavVar12, 0, 24960, 109432);
                } else {
                    cavVar12.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                cav cavVar13 = (cav) obj;
                int iIntValue13 = ((java.lang.Integer) obj2).intValue();
                if (cavVar13.H((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    java.lang.Object objF = this.a;
                    csx csxVarAL = aehj.aL(abja.v, cavVar13);
                    if (objF == null) {
                        cavVar13.u(-1229645014);
                        objF = dfa.f(2132017490, cavVar13);
                    } else {
                        cavVar13.u(-1229645696);
                    }
                    cavVar13.o();
                    aaoo.W(csxVarAL, (java.lang.String) objF, (cmw) null, 0L, cavVar13, 0, 12);
                } else {
                    cavVar13.s();
                }
                return aojh.a;
            case 15:
                cav cavVar14 = (cav) obj;
                int iIntValue14 = ((java.lang.Integer) obj2).intValue();
                if (cavVar14.H((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    abrz.l(((defpackage.tfk) this.a).a, (cmw) null, 0L, 0L, 0L, (dot) null, 0L, 2, false, 1, 0, (java.util.Map) null, (aonj) null, (dkz) null, cavVar14, 0, 24960, 503806);
                } else {
                    cavVar14.s();
                }
                return aojh.a;
            case 16:
                cav cavVar15 = (cav) obj;
                int iIntValue15 = ((java.lang.Integer) obj2).intValue();
                if (cavVar15.H((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    defpackage.tfk tfkVar = (defpackage.tfk) this.a;
                    if (tfkVar.k) {
                        cavVar15.u(-615767241);
                        cmn cmnVar = cmh.n;
                        cmt cmtVar5 = cmw.c;
                        cye cyeVarA3 = azh.a(awi.a, cmnVar, cavVar15, 48);
                        int iM6 = anty.M(cavVar15.a());
                        cje cjeVarM6 = cavVar15.M();
                        cmw cmwVarM6 = cfo.m(cavVar15, cmtVar5);
                        aomy aomyVar4 = dam.a;
                        cavVar15.L();
                        cavVar15.v();
                        if (cavVar15.F()) {
                            cavVar15.j(aomyVar4);
                        } else {
                            cavVar15.x();
                        }
                        cev.c(cavVar15, cyeVarA3, dam.e);
                        cev.c(cavVar15, cjeVarM6, dam.d);
                        cev.c(cavVar15, java.lang.Integer.valueOf(iM6), dam.f);
                        cev.b(cavVar15, dam.g);
                        cev.c(cavVar15, cmwVarM6, dam.c);
                        aaoo.V(wv.k(2131232012, cavVar15, 0), dfa.f(2132021045, cavVar15), den.ba(azm.g(cmtVar5, 16.0f), 0.0f, 0.0f, 2.0f, 0.0f), den.ak(cavVar15).s, cavVar15, 392, 0);
                        abrz.l(tfkVar.b, (cmw) null, 0L, 0L, 0L, (dot) null, 0L, 2, false, 1, 0, (java.util.Map) null, (aonj) null, (dkz) null, cavVar15, 0, 24960, 503806);
                        cavVar15.n();
                        cavVar15.o();
                    } else {
                        cavVar15.u(-615257632);
                        abrz.l(tfkVar.b, (cmw) null, 0L, 0L, 0L, (dot) null, 0L, 2, false, 1, 0, (java.util.Map) null, (aonj) null, (dkz) null, cavVar15, 0, 24960, 503806);
                        cavVar15.o();
                    }
                } else {
                    cavVar15.s();
                }
                return aojh.a;
            case 17:
                cav cavVar16 = (cav) obj;
                int iIntValue16 = ((java.lang.Integer) obj2).intValue();
                if (cavVar16.H((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    gus.aG(true, false, cfo.j(-1011191292, new defpackage.rzg(this.a, i), cavVar16), cavVar16, 390, 2);
                } else {
                    cavVar16.s();
                }
                return aojh.a;
            case 18:
                cav cavVar17 = (cav) obj;
                int iIntValue17 = ((java.lang.Integer) obj2).intValue();
                if (cavVar17.H((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    ((defpackage.tgf) this.a).b(null, cavVar17, 0);
                } else {
                    cavVar17.s();
                }
                return aojh.a;
            case 19:
                cav cavVar18 = (cav) obj;
                int iIntValue18 = ((java.lang.Integer) obj2).intValue();
                if (cavVar18.H((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    java.lang.Object obj8 = this.a;
                    cavVar18.u(394035052);
                    bsu bsuVar = (bsu) cavVar18.e(bsw.b);
                    cavVar18.o();
                    den.ac(new cdj[]{abjc.a.b(((defpackage.tgf) obj8).d), bsw.b.b(bsuVar)}, cfo.j(-378696187, new defpackage.rzg(obj8, 17), cavVar18), cavVar18, 48);
                } else {
                    cavVar18.s();
                }
                return aojh.a;
            default:
                cav cavVar19 = (cav) obj;
                int iIntValue19 = ((java.lang.Integer) obj2).intValue();
                if (cavVar19.H((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    java.lang.Object obj9 = this.a;
                    defpackage.tup tupVar = (defpackage.tup) obj9;
                    defpackage.tpj tpjVarA = tupVar.a();
                    if (tpjVarA == null) {
                        cavVar19.u(-395496059);
                    } else {
                        cavVar19.u(-395496058);
                        if ((tpjVarA.b & 1) != 0) {
                            defpackage.tuk tukVar = tupVar.b;
                            boolean zU = abts.U(tukVar.A());
                            defpackage.tpi tpiVar = tpjVarA.d;
                            if (tpiVar == null) {
                                tpiVar = defpackage.tpi.a;
                            }
                            int iCp = wsc.cp(tpiVar.c);
                            if (iCp == 0) {
                                throw null;
                            }
                            if (iCp - 1 != 0) {
                                defpackage.tpi tpiVar2 = tpjVarA.d;
                                if (tpiVar2 == null) {
                                    tpiVar2 = defpackage.tpi.a;
                                }
                                int iCp2 = wsc.cp(tpiVar2.c);
                                wsc.co(iCp2);
                                throw new java.lang.IllegalStateException("Invalid contentType: ".concat(wsc.co(iCp2)));
                            }
                            abja abjaVar = zU ? abja.ca : abja.fg;
                            boolean z = !zU;
                            java.lang.String strY = tukVar.Y(2132019094);
                            aooh.e(strY, "getString(...)");
                            java.lang.String strY2 = tukVar.Y(2132019091);
                            aooh.e(strY2, "getString(...)");
                            java.lang.String strY3 = tukVar.Y(2132019093);
                            aooh.e(strY3, "getString(...)");
                            defpackage.ablc ablcVar = new defpackage.ablc(strY3, abja.ag, new ovt(obj9, 18, (float[][][]) null));
                            java.lang.String strY4 = tukVar.Y(2132019092);
                            aooh.e(strY4, "getString(...)");
                            cqgVar = new defpackage.ablb(abjaVar, z, strY, strY2, aokc.a, ablcVar, new defpackage.abld(strY4, new ovt(obj9, 19, (byte[]) null, (byte[]) null)), false, true != zU ? 2 : 3);
                        } else {
                            defpackage.tup.a.b().l("com/android/dialer/sharpie/impl/ui/SharpieComposeAlertCenterFragmentPeer", "toComposableModel", 172, "SharpieComposeAlertCenterFragmentPeer.kt").v("No alert set, nothing to show");
                        }
                        wsc.ck(new defpackage.tuu(cqgVar), cavVar19, 0);
                    }
                    cavVar19.o();
                } else {
                    cavVar19.s();
                }
                return aojh.a;
        }
    }
}
