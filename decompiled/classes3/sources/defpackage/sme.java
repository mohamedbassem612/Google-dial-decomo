package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sme {
    public static final java.util.List a = ajsz.bb(new defpackage.slm[]{defpackage.slm.a, defpackage.slm.b});

    public static final void a(defpackage.smu smuVar, java.lang.String str, css cssVar, boolean z, cav cavVar, int i) {
        int i2;
        boolean z2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1183647277);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(smuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? cavVarB.B(cssVar) : cavVarB.D(cssVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            z2 = z;
            h(z2, smuVar.n, "font_style_custom_text", cfo.j(1586536064, new qyh(cssVar, str, 15), cavVarB), cavVarB, ((i2 >> 9) & 14) | 3456);
        } else {
            z2 = z;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ppv(smuVar, str, cssVar, z2, i, 5);
        }
    }

    public static final void b(defpackage.skf skfVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(93714871);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(skfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cbtVarB.H((i2 & 3) != 2, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new nf((char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            nf nfVar = (nf) objR;
            java.lang.String strF = dfa.f(2132019735, cbtVarB);
            java.lang.String strF2 = dfa.f(2132019734, cbtVarB);
            boolean z = skfVar.b instanceof defpackage.skc;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            boolean zC = cbtVarB.C(z) | cbtVarB.B(strF) | cbtVarB.B(strF2);
            java.lang.Object objR2 = cbtVar.R();
            if (zC || objR2 == obj) {
                bus busVar = new bus(z, nfVar, strF, strF2, (aoln) null, 2);
                cbtVar.ab(busVar);
                objR2 = busVar;
            }
            cbp.g(boolValueOf, (aonn) objR2, cbtVarB);
            den.aj(nfVar, (cmw) null, (aono) null, cbtVarB, 6, 6);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ryr(skfVar, i, 10);
        }
    }

    public static final void c(final defpackage.slo sloVar, defpackage.skf skfVar, cav cavVar, int i) {
        int i2;
        cdk cdkVarI;
        slz slzVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(396191154);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(sloVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(skfVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.slp slpVar = sloVar.a;
            final boolean z = slpVar.e;
            if (!z || skfVar.g) {
                final long j = (skfVar.g ? slpVar.b : slpVar.a) << 32;
                boolean z2 = true;
                boolean z3 = sloVar.b;
                if ((i2 & 14) != 4) {
                    z2 = false;
                }
                boolean zA = z2 | cbtVarB.A(j) | cbtVarB.C(z);
                cbt cbtVar = cbtVarB;
                java.lang.Object objR = cbtVar.R();
                if (zA || objR == cau.a) {
                    objR = new aomy() { // from class: slx
                        public final java.lang.Object a() {
                            java.util.List list = defpackage.sme.a;
                            sloVar.c.a(new defpackage.sms(j, z));
                            return aojh.a;
                        }
                    };
                    cbtVar.ab(objR);
                }
                h(z3, (aomy) objR, "font_color_option_text", cfo.j(-1947954177, new aonn() { // from class: sly
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                        cav cavVar2 = (cav) obj;
                        int iIntValue = ((java.lang.Integer) obj2).intValue();
                        int i4 = iIntValue & 3;
                        int i5 = iIntValue & 1;
                        java.util.List list = defpackage.sme.a;
                        if (cavVar2.H(i4 != 2, i5)) {
                            final long j2 = j;
                            final boolean z4 = z;
                            defpackage.slo sloVar2 = sloVar;
                            final long j3 = den.ak(cavVar2).B;
                            final float fDl = ((dpf) cavVar2.e(dfo.e)).dl(1.0f);
                            cmw cmwVarC = azm.c(cmw.c, 1.0f);
                            java.lang.String strF = dfa.f(sloVar2.a.c, cavVar2);
                            boolean zC = cavVar2.C(z4) | cavVar2.A(j2) | cavVar2.y(fDl) | cavVar2.A(j3);
                            java.lang.Object objG = cavVar2.g();
                            if (zC || objG == cau.a) {
                                aonj aonjVar = new aonj() { // from class: slu
                                    public final java.lang.Object a(java.lang.Object obj3) {
                                        char c;
                                        char c2;
                                        long j4;
                                        csj csjVar = (csj) obj3;
                                        java.util.List list2 = defpackage.sme.a;
                                        aooh.f(csjVar, "$this$Canvas");
                                        long j5 = j2;
                                        if (z4) {
                                            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) / 2.0f;
                                            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)) / 2.0f;
                                            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fIntBitsToFloat);
                                            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fIntBitsToFloat2);
                                            float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)) / 2.0f;
                                            long j6 = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
                                            int i6 = (int) (j6 >> 32);
                                            float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat(i6) - fIntBitsToFloat3;
                                            int i7 = (int) (j6 & 4294967295L);
                                            float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat(i7) - fIntBitsToFloat3;
                                            c = 1;
                                            c2 = 0;
                                            csjVar = csjVar;
                                            csjVar.v(cfd.T(ajsz.bb(new cqg[]{new cqg(-4294967296L), new cqg(-72057594037927936L)}), (java.lang.Float.floatToRawIntBits(fIntBitsToFloat4) << 32) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i6) + fIntBitsToFloat3)) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i7) + fIntBitsToFloat3)) & 4294967295L), 8), fIntBitsToFloat3, j6, csl.a);
                                            j4 = j5;
                                        } else {
                                            c = 1;
                                            c2 = 0;
                                            j4 = j5;
                                            den.R(csjVar, j4, 0.0f, 0L, (den) null, 126);
                                        }
                                        cqg[] cqgVarArr = new cqg[2];
                                        cqgVarArr[c2] = new cqg(-4294967296L);
                                        cqgVarArr[c] = new cqg(-72057594037927936L);
                                        if (ajsz.bb(cqgVarArr).contains(new cqg(j4))) {
                                            den.R(csjVar, j3, 0.0f, 0L, new csm(fDl, 0.0f, 0, 0, 30), 110);
                                        }
                                        return aojh.a;
                                    }
                                };
                                cavVar2.w(aonjVar);
                                objG = aonjVar;
                            }
                            yt.b(cmwVarC, strF, (aonj) objG, cavVar2, 6);
                        } else {
                            cavVar2.s();
                        }
                        return aojh.a;
                    }
                }, cbtVarB), cbtVarB, 3456);
            } else {
                cdkVarI = cbtVarB.I();
                if (cdkVarI == null) {
                    return;
                } else {
                    slzVar = new slz(sloVar, skfVar, i, 1);
                }
            }
            cdkVarI.c = slzVar;
        }
        cbtVarB.s();
        cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            slzVar = new slz(sloVar, skfVar, i, 0);
            cdkVarI.c = slzVar;
        }
    }

    public static final void d(boolean z, aonj aonjVar, defpackage.sko skoVar, int i, cav cavVar, int i2) {
        int i3;
        boolean z2;
        int i4 = i2 & 6;
        cbt cbtVarB = cavVar.b(-157502200);
        if (i4 == 0) {
            i3 = (true != cbtVarB.C(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cbtVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cbtVarB.B(skoVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cbtVarB.z(i) ? 1024 : 2048;
        }
        if (cbtVarB.H((i3 & 1171) != 1170, i3 & 1)) {
            java.lang.String strF = dfa.f(i, cbtVarB);
            boolean z3 = (i3 & 112) == 32;
            boolean z4 = (i3 & 896) == 256;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if ((z3 | z4) || objR == cau.a) {
                objR = new defpackage.qza(aonjVar, skoVar, 15);
                cbtVar.ab(objR);
            }
            z2 = z;
            h(z2, (aomy) objR, "font_style_option_text", cfo.j(744715483, new qyh(strF, skoVar, 13, (byte[]) null), cbtVarB), cbtVarB, (i3 & 14) | 3456);
        } else {
            z2 = z;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abla(z2, aonjVar, skoVar, i, i2, 1);
        }
    }

    public static final void e(final defpackage.skf skfVar, final defpackage.smu smuVar, cav cavVar, int i) {
        int i2;
        final float f;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1541047191);
        if (i3 == 0) {
            i2 = i | (true != cbtVarB.B(skfVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(smuVar) ? 16 : 32;
        }
        int i4 = 0;
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.ske skeVar = skfVar.b;
            defpackage.skd skdVar = skeVar instanceof defpackage.skd ? (defpackage.skd) skeVar : null;
            final float fFloatValue = 1.0f;
            final float fFloatValue2 = 0.0f;
            if (skdVar != null) {
                java.lang.Float f2 = skdVar.g;
                java.lang.Float f3 = f2.floatValue() > 0.0f ? f2 : null;
                if (f3 != null) {
                    fFloatValue = f3.floatValue();
                }
            }
            if (skdVar != null) {
                float fFloatValue3 = skdVar.h.floatValue();
                fFloatValue2 = skdVar.i.floatValue();
                f = fFloatValue3;
            } else {
                f = 0.0f;
            }
            java.lang.Object[] objArr = {java.lang.Float.valueOf(fFloatValue), java.lang.Float.valueOf(f), java.lang.Float.valueOf(fFloatValue2)};
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = cfd.q(new mts(15), new defpackage.skk(5));
                cbtVar.ab(objR);
            }
            ckb ckbVar = (ckb) objR;
            boolean zY = cbtVarB.y(fFloatValue) | cbtVarB.y(f) | cbtVarB.y(fFloatValue2);
            java.lang.Object objR2 = cbtVar.R();
            if (zY || objR2 == obj) {
                objR2 = new aomy() { // from class: slt
                    public final java.lang.Object a() {
                        java.util.List list = defpackage.sme.a;
                        return new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.abjl(fFloatValue, f, fFloatValue2), cdu.c);
                    }
                };
                cbtVar.ab(objR2);
            }
            final ccp ccpVar = (ccp) cfd.n(objArr, ckbVar, (aomy) objR2, cbtVarB, 0);
            final boolean z = skfVar.c;
            final alg algVarD = alk.d(java.lang.Boolean.valueOf(z), cbtVarB, 48);
            f(cfo.j(-160449458, new ata(skfVar, smuVar, ccpVar, 16, (char[]) null), cbtVarB), cfo.j(2023996308, new aono() { // from class: sma
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    defpackage.sml smlVar = (defpackage.sml) obj2;
                    cav cavVar2 = (cav) obj3;
                    int iIntValue = ((java.lang.Integer) obj4).intValue();
                    java.util.List list = defpackage.sme.a;
                    aooh.f(smlVar, "previewPosition");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != cavVar2.B(smlVar) ? 2 : 4;
                    }
                    if (cavVar2.H((iIntValue & 19) != 18, iIntValue & 1)) {
                        defpackage.skf skfVar2 = skfVar;
                        boolean z2 = (z || !snl.g(skfVar2.b) || skfVar2.e) ? false : true;
                        ccp ccpVar2 = ccpVar;
                        int i5 = iIntValue;
                        alg algVar = algVarD;
                        defpackage.smu smuVar2 = smuVar;
                        defpackage.sme.q(algVar, smlVar, z2, smuVar2.k, null, cfo.j(1864512265, new ata(skfVar2, smuVar2, ccpVar2, 15, (char[]) null), cavVar2), cavVar2, ((i5 << 3) & 112) | 196608);
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
            }, cbtVarB), cfo.j(742471120, new defpackage.smc(skfVar, z, smuVar, i4), cbtVarB), cfo.j(-953552239, new defpackage.rzg(skfVar, 12), cbtVarB), cfo.j(1645391698, new qyh(skfVar, smuVar, 18), cbtVarB), algVarD, cbtVarB, 28086);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new slz(skfVar, smuVar, i, 2, (byte[]) null);
        }
    }

    public static final void f(aonn aonnVar, aono aonoVar, aonn aonnVar2, aonn aonnVar3, aonn aonnVar4, alg algVar, cav cavVar, int i) {
        int i2;
        aonn aonnVar5;
        alg algVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1392906882);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonnVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.D(aonnVar3) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            aonnVar5 = aonnVar4;
            i2 |= true != cbtVarB.D(aonnVar5) ? 8192 : 16384;
        } else {
            aonnVar5 = aonnVar4;
        }
        if ((196608 & i) == 0) {
            algVar2 = algVar;
            i2 |= true != cbtVarB.B(algVar2) ? 65536 : 131072;
        } else {
            algVar2 = algVar;
        }
        if (cbtVarB.H((74899 & i2) != 74898, i2 & 1)) {
            dpf dpfVar = (dpf) cbtVarB.e(dfo.e);
            float f = defpackage.smf.a;
            int iDl = (int) dpfVar.dl(defpackage.smf.i);
            boolean z = (((java.lang.Boolean) algVar2.f()).booleanValue() || algVar2.B()) ? false : true;
            cmw cmwVarX = den.x(azm.c(cmw.c, 1.0f), "onboarding_flow_onboarding_container");
            boolean z2 = (i2 & 14) == 4;
            boolean z3 = (i2 & 896) == 256;
            boolean z4 = (i2 & 7168) == 2048;
            boolean zC = z2 | z3 | z4 | ((57344 & i2) == 16384) | ((i2 & 112) == 32) | cbtVarB.C(z) | cbtVarB.z(iDl);
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (zC || objR == cau.a) {
                bxp bxpVar = new bxp(aonnVar, aonnVar2, aonnVar3, aonnVar5, aonoVar, z, iDl, 4);
                cbtVar.ab(bxpVar);
                objR = bxpVar;
            }
            czl.a(cmwVarX, (aonn) objR, cbtVarB, 6, 0);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new axp(aonnVar, aonoVar, aonnVar2, aonnVar3, aonnVar4, algVar, i, 6);
        }
    }

    public static final void g(boolean z, defpackage.ske skeVar, defpackage.smu smuVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1968656042);
        if (i3 == 0) {
            i2 = (true != cbtVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(skeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(smuVar) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            cmt cmtVar = cmw.c;
            cmw cmwVarC = azm.c(cmtVar, 1.0f);
            cye cyeVarB = awo.b(cmh.a, false);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarC);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            cmw cmwVarA = awt.a.a(cmtVar, cmh.h);
            alm almVarBv = den.bv(150, 0, (ajh) null, 6);
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new defpackage.skk(3);
                cbtVar.ab(objR);
            }
            agf agfVarD = aga.d(almVarBv, (aonj) objR);
            alm almVarBv2 = den.bv(150, 0, (ajh) null, 6);
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new defpackage.skk(4);
                cbtVar.ab(objR2);
            }
            den.bz(z, cmwVarA, agfVarD, aga.g(almVarBv2, (aonj) objR2), (java.lang.String) null, cfo.j(1378678584, new bli(skeVar, smuVar, 5), cbtVarB), cbtVarB, (i2 & 14) | 196608, 16);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bsq(z, skeVar, smuVar, i, 17);
        }
    }

    public static final void h(boolean z, aomy aomyVar, java.lang.String str, aonn aonnVar, cav cavVar, int i) {
        int i2;
        long jM;
        long jM2;
        amu amuVarBl;
        boolean z2 = z;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1247620150);
        if (i3 == 0) {
            i2 = (true != cbtVarB.C(z2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(str) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 1024 : 2048;
        }
        if (cbtVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            if (z2) {
                cbtVarB.u(667095583);
                jM = den.ak(cbtVarB).f;
                cbtVarB.W(false);
            } else {
                cbtVarB.u(667096257);
                cbtVarB.W(false);
                jM = cfd.M(0);
            }
            cer cerVarA = ahp.a(jM, den.al(cbtVarB).a(), cbtVarB, 0, 12);
            if (z2) {
                cbtVarB.u(667103110);
                jM2 = den.ak(cbtVarB).F;
                cbtVarB.W(false);
            } else {
                cbtVarB.u(667104001);
                cbtVarB.W(false);
                jM2 = cfd.M(0);
            }
            long j = jM2;
            cmt cmtVar = cmw.c;
            float f = defpackage.smf.a;
            cmw cmwVarX = den.x(rx.l(azm.b(azm.f(cmtVar, defpackage.smf.b, defpackage.smf.c), 1.0f), 1.0f, true), str);
            int i4 = i2 & 14;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (i4 == 4 || objR == cau.a) {
                objR = new skg(z2, 6);
                cbtVar.ab(objR);
            }
            cmw cmwVarB = dig.b(cmwVarX, false, (aonj) objR);
            bfx bfxVar = den.am(cbtVarB).d;
            if (z2) {
                amuVarBl = den.bl(2.0f, a.F(cerVarA));
                z2 = true;
            } else {
                amuVarBl = null;
                z2 = false;
            }
            bvo.d(aomyVar, cmwVarB, false, bfxVar, j, den.ak(cbtVarB).q, 0.0f, 0.0f, amuVarBl, (kaw) null, cfo.j(1743584651, new defpackage.rzg(aonnVar, 11), cbtVarB), cbtVarB, 708);
            cbtVarB = cbtVarB;
        } else {
            cbtVarB.s();
        }
        boolean z3 = z2;
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ppv(z3, aomyVar, str, aonnVar, i, 4);
        }
    }

    public static final void i(defpackage.skf skfVar, defpackage.smu smuVar) {
        aooh.f(smuVar, "callbacks");
        if (skfVar.c) {
            smuVar.b.a();
            return;
        }
        int i = skfVar.a;
        if (i > 0) {
            smuVar.d.a(new defpackage.smr(i - 1));
        } else {
            smuVar.a.a();
        }
    }

    public static final void j(cmw cmwVar, defpackage.slg slgVar, defpackage.smu smuVar, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        defpackage.abim abimVar;
        defpackage.abim abimVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(218221125);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(slgVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(smuVar) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            boolean z = slgVar.b;
            boolean z2 = slgVar.a;
            defpackage.abim[] abimVarArr = new defpackage.abim[4];
            abimVarArr[0] = new defpackage.abim(abja.e, dfa.f(2132017980, cbtVarB), smuVar.h);
            abimVarArr[1] = new defpackage.abim(abja.i, dfa.f(2132018779, cbtVarB), smuVar.e);
            if (z) {
                cbtVarB.u(-742883530);
                abimVar = new defpackage.abim(abja.ek, dfa.f(2132018810, cbtVarB), smuVar.l);
                cbtVarB.W(false);
            } else {
                cbtVarB.u(-1554499784);
                cbtVarB.W(false);
                abimVar = null;
            }
            abimVarArr[2] = abimVar;
            if (z2) {
                cbtVarB.u(-742880693);
                abimVar2 = new defpackage.abim(abja.bd, dfa.f(2132019859, cbtVarB), smuVar.i);
                cbtVarB.W(false);
            } else {
                cbtVarB.u(-1554422408);
                cbtVarB.W(false);
                abimVar2 = null;
            }
            abimVarArr[3] = abimVar2;
            java.util.List listBc = ajsz.bc(abimVarArr);
            if (slgVar.c) {
                cbtVarB.u(-1554339699);
                cmw cmwVarX = den.x(cmwVar, "onboarding_flow_background_menu");
                cye cyeVarA = aww.a(awi.c, cmh.j, cbtVarB, 0);
                cbt cbtVar = cbtVarB;
                int iM = anty.M(cbtVar.x);
                cje cjeVarAi = cbtVar.ai();
                cmw cmwVarM = cfo.m(cbtVarB, cmwVarX);
                aomy aomyVar = dam.a;
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar);
                } else {
                    cbtVarB.x();
                }
                aonn aonnVar = dam.e;
                cev.c(cbtVarB, cyeVarA, aonnVar);
                aonn aonnVar2 = dam.d;
                cev.c(cbtVarB, cjeVarAi, aonnVar2);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                aonn aonnVar3 = dam.f;
                cev.c(cbtVarB, numValueOf, aonnVar3);
                aonj aonjVar = dam.g;
                cev.b(cbtVarB, aonjVar);
                aonn aonnVar4 = dam.c;
                cev.c(cbtVarB, cmwVarM, aonnVar4);
                java.lang.String strF = dfa.f(2132018776, cbtVarB);
                dkz dkzVar = den.an(cbtVarB).m;
                long j = den.ak(cbtVarB).q;
                cmt cmtVar = cmw.c;
                abrz.k(strF, den.aZ(cmtVar, 24.0f, 16.0f), j, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, dkzVar, cbtVarB, 48, 0, 131064);
                cmw cmwVarAZ = den.aZ(azm.d(cmtVar, 1.0f), 16.0f, 0.0f);
                cye cyeVarA2 = azh.a(awi.e, cmh.n, cbtVarB, 54);
                int iM2 = anty.M(cbtVar.x);
                cje cjeVarAi2 = cbtVar.ai();
                cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarAZ);
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVarA2, aonnVar);
                cev.c(cbtVarB, cjeVarAi2, aonnVar2);
                cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
                cev.b(cbtVarB, aonjVar);
                cev.c(cbtVarB, cmwVarM2, aonnVar4);
                aehj.bg(new defpackage.abip(listBc), (cmw) null, (bpw) null, cbtVarB, 0);
                cbtVar.W(true);
                abrz.k(dfa.f(2132018078, cbtVarB), den.aZ(cmtVar, 24.0f, 16.0f), den.ak(cbtVarB).q, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, den.an(cbtVarB).m, cbtVarB, 48, 0, 131064);
                cbtVarB = cbtVarB;
                snl.h((cmw) null, (aonj) null, cbtVarB, 0);
                cbtVar.W(true);
                cbtVar.W(false);
                cmwVar2 = cmwVar;
            } else {
                cbtVarB.u(-1553410629);
                cmwVar2 = cmwVar;
                cmw cmwVarX2 = den.x(den.aZ(cmwVar2, 16.0f, 0.0f), "onboarding_flow_background_menu");
                cye cyeVarA3 = azh.a(awi.e, cmh.n, cbtVarB, 54);
                cbt cbtVar2 = cbtVarB;
                int iM3 = anty.M(cbtVar2.x);
                cje cjeVarAi3 = cbtVar2.ai();
                cmw cmwVarM3 = cfo.m(cbtVarB, cmwVarX2);
                aomy aomyVar2 = dam.a;
                cbtVarB.v();
                if (cbtVar2.w) {
                    cbtVarB.j(aomyVar2);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVarA3, dam.e);
                cev.c(cbtVarB, cjeVarAi3, dam.d);
                cev.c(cbtVarB, java.lang.Integer.valueOf(iM3), dam.f);
                cev.b(cbtVarB, dam.g);
                cev.c(cbtVarB, cmwVarM3, dam.c);
                aehj.bg(new defpackage.abip(listBc), (cmw) null, (bpw) null, cbtVarB, 0);
                cbtVar2.W(true);
                cbtVar2.W(false);
            }
        } else {
            cmwVar2 = cmwVar;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ppx(cmwVar2, slgVar, smuVar, i, 8, null);
        }
    }

    public static final void k(cmw cmwVar, boolean z, aonn aonnVar, cav cavVar, int i) {
        int i2;
        bfx bfxVarD;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-507643091);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            if (z) {
                cbtVarB.u(-615243782);
                bfxVarD = bfx.d(den.am(cbtVarB).e, (bfy) null, (bfy) null, new bfz(0.0f), new bfz(0.0f), 3);
                cbtVarB.W(false);
            } else {
                cbtVarB.u(-615143032);
                bfxVarD = den.am(cbtVarB).e;
                cbtVarB.W(false);
            }
            bvo.b(cmwVar, bfxVarD, den.ak(cbtVarB).p, 0L, 0.0f, 0.0f, (amu) null, aonnVar, cbtVarB, 120);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bsq(cmwVar, z, aonnVar, i, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a6  */
    public static final void l(cmw cmwVar, defpackage.slq slqVar, defpackage.smu smuVar, defpackage.skf skfVar, cav cavVar, int i) {
        defpackage.skf skfVar2;
        boolean z;
        defpackage.smu smuVar2 = smuVar;
        int i2 = i & 6;
        cav cavVarB = cavVar.b(-547883490);
        int i3 = i2 == 0 ? (true != cavVarB.B(cmwVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(slqVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(smuVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.B(skfVar) ? 1024 : 2048;
        }
        int i4 = i3;
        if (cavVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            aon aonVarE = rl.e(cavVarB, 0);
            aon aonVarE2 = rl.e(cavVarB, 0);
            cmw cmwVarX = den.x(cmwVar, "onboarding_flow_font_menu");
            float f = defpackage.smf.a;
            float f2 = (defpackage.smf.a / 2.0f) + 0.0f;
            cmw cmwVarAZ = den.aZ(cmwVarX, 0.0f, f2);
            cye cyeVarA = aww.a(awi.f, cmh.j, cavVarB, 6);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarAZ);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            aonn aonnVar = dam.e;
            cev.c(cavVarB, cyeVarA, aonnVar);
            aonn aonnVar2 = dam.d;
            cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar3 = dam.f;
            cev.c(cavVarB, numValueOf, aonnVar3);
            aonj aonjVar = dam.g;
            cev.b(cavVarB, aonjVar);
            aonn aonnVar4 = dam.c;
            cev.c(cavVarB, cmwVarM, aonnVar4);
            cmt cmtVar = cmw.c;
            cmw cmwVarX2 = den.x(den.aZ(rl.f(awy.b(azm.d(cmtVar, 1.0f), 1.0f, false), aonVarE, false), 20.0f, f2), "onboarding_flow_font_style_menu");
            awb awbVarF = awi.f(2.0f);
            cmn cmnVar = cmh.n;
            cye cyeVarA2 = azh.a(awbVarF, cmnVar, cavVarB, 54);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cavVarB, cmwVarX2);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA2, aonnVar);
            cev.c(cavVarB, cjeVarAi2, aonnVar2);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            cev.b(cavVarB, aonjVar);
            cev.c(cavVarB, cmwVarM2, aonnVar4);
            java.lang.String strF = dfa.f(2132019720, cavVarB);
            css cssVarK = wv.k(2131231378, cavVarB, 0);
            boolean z2 = slqVar.c;
            int i5 = i4 >> 6;
            smuVar2 = smuVar;
            a(smuVar2, strF, cssVarK, z2, cavVarB, (i5 & 14) | 512);
            boolean z3 = !z2 && slqVar.b == null;
            int i6 = i4 & 896;
            java.lang.Object objR = cbtVar.R();
            boolean z4 = z3;
            if (i6 == 256 || objR == cau.a) {
                objR = new defpackage.skx(smuVar2, 9);
                cbtVar.ab(objR);
            }
            cavVarB = cavVarB;
            d(z4, (aonj) objR, null, 2132019722, cavVarB, 384);
            cavVarB.u(1183420889);
            for (defpackage.sjz sjzVar : defpackage.sjz.b) {
                boolean z5 = !z2 && aooh.n(slqVar.b, sjzVar.c);
                boolean zB = (i6 == 256) | cavVarB.B(sjzVar);
                java.lang.Object objR2 = cbtVar.R();
                if (zB || objR2 == cau.a) {
                    objR2 = new defpackage.slv(smuVar2, sjzVar, 2);
                    cbtVar.ab(objR2);
                }
                d(z5, (aonj) objR2, sjzVar.c, sjzVar.d, cavVarB, 0);
            }
            cbtVar.W(false);
            cbtVar.W(true);
            cmw cmwVarX3 = den.x(den.aZ(rl.f(awy.b(azm.d(cmtVar, 1.0f), 1.0f, false), aonVarE2, false), 20.0f, f2), "onboarding_flow_font_color_menu");
            cye cyeVarA3 = azh.a(awi.f(2.0f), cmnVar, cavVarB, 54);
            int iM3 = anty.M(cbtVar.x);
            cje cjeVarAi3 = cbtVar.ai();
            cmw cmwVarM3 = cfo.m(cavVarB, cmwVarX3);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA3, aonnVar);
            cev.c(cavVarB, cjeVarAi3, aonnVar2);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM3), aonnVar3);
            cev.b(cavVarB, aonjVar);
            cev.c(cavVarB, cmwVarM3, aonnVar4);
            cavVarB.u(1944445285);
            for (defpackage.slp slpVar : defpackage.smf.l) {
                if (skfVar.g) {
                    long j = slpVar.b << 32;
                    java.lang.Integer num = slqVar.a;
                    int iL = cfd.L(j);
                    if (num == null || iL != num.intValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    long j2 = slpVar.a << 32;
                    java.lang.Integer num2 = slqVar.a;
                    int iL2 = cfd.L(j2);
                    if (num2 == null || iL2 != num2.intValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                c(new defpackage.slo(slpVar, z, smuVar2.f), skfVar, cavVarB, i5 & 112);
            }
            skfVar2 = skfVar;
            cbtVar.W(false);
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            skfVar2 = skfVar;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new biu(cmwVar, slqVar, smuVar2, skfVar2, i, 18);
        }
    }

    public static final void m(defpackage.skf skfVar, defpackage.smu smuVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-2087256284);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(skfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(smuVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            n(skfVar, smuVar, skfVar.m ? cmwVar : bac.a(den.aZ(cmwVar, 16.0f, 0.0f)), cavVarB, i2 & 126);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ppx(skfVar, smuVar, cmwVar, i, 6);
        }
    }

    public static final void n(defpackage.skf skfVar, defpackage.smu smuVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        cmw cmwVarD;
        aooh.f(smuVar, "callbacks");
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1562140529);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != cavVarB.B(skfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(smuVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            boolean z = skfVar.m;
            if (z) {
                cmwVarD = azm.d(cmwVar, 1.0f);
            } else {
                float f = defpackage.smf.a;
                cmwVarD = azm.d(azm.e(cmwVar, defpackage.smf.k), 1.0f);
            }
            k(cmwVarD, z, cfo.j(1569973976, new defpackage.smc(skfVar, z, smuVar, i4), cavVarB), cavVarB, 384);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ppx(skfVar, smuVar, cmwVar, i, 5);
        }
    }

    public static final void o(cmw cmwVar, java.lang.String str, final float f, final aonj aonjVar, final defpackage.aopm aopmVar, cav cavVar, final int i) {
        java.lang.String str2;
        cav cavVar2;
        final cmw cmwVar2;
        cbt cbtVar;
        cav cavVarB = cavVar.b(-1140161494);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.y(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(aopmVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            cmw cmwVar3 = cmw.c;
            cmw cmwVarAZ = den.aZ(azm.d(cmwVar3, 1.0f), 0.0f, 8.0f);
            cye cyeVarA = aww.a(awi.c, cmh.j, cavVarB, 0);
            cbt cbtVar2 = (cbt) cavVarB;
            int iM = anty.M(cbtVar2.x);
            cje cjeVarAi = cbtVar2.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarAZ);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar2.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            int i3 = i2;
            abrz.k(str, den.ba(cmwVar3, 0.0f, 0.0f, 0.0f, 4.0f), den.ak(cavVarB).q, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, den.an(cavVarB).i, cavVarB, ((i2 >> 3) & 14) | 48, 0, 131064);
            str2 = str;
            cavVar2 = cavVarB;
            int i4 = i3 & 112;
            java.lang.Object objR = cbtVar2.R();
            if (i4 == 32 || objR == cau.a) {
                objR = new defpackage.skx(str2, 5);
                cbtVar = cbtVar2;
                cbtVar.ab(objR);
            } else {
                cbtVar = cbtVar2;
            }
            cmw cmwVarB = dig.b(cmwVar3, false, (aonj) objR);
            long j = den.ak(cavVar2).a;
            long j2 = den.ak(cavVar2).a;
            long j3 = den.ak(cavVar2).h;
            long jT = abrz.t(31, cavVar2);
            long jT2 = abrz.t(25, cavVar2);
            long jP = cfd.P(cqg.h(abrz.t(17, cavVar2), 0.38f), den.ak(cavVar2).p);
            long jH = cqg.h(abrz.t(17, cavVar2), 0.38f);
            long jH2 = cqg.h(abrz.t(17, cavVar2), 0.12f);
            long jH3 = cqg.h(den.ak(cavVar2).q, 0.12f);
            long jH4 = cqg.h(abrz.t(17, cavVar2), 0.38f);
            buc bucVar = buc.a;
            bor borVarAk = den.ak(cavVar2);
            btw btwVar = borVarAk.aj;
            if (btwVar == null) {
                btwVar = new btw(bos.b(borVarAk, 25), bos.b(borVarAk, 25), bos.b(borVarAk, 31), bos.b(borVarAk, 31), bos.b(borVarAk, 25), cfd.P(cqg.h(bos.b(borVarAk, 17), 0.38f), borVarAk.p), cqg.h(bos.b(borVarAk, 17), 0.38f), cqg.h(bos.b(borVarAk, 17), 0.12f), cqg.h(bos.b(borVarAk, 17), 0.12f), cqg.h(bos.b(borVarAk, 17), 0.38f));
                borVarAk.aj = btwVar;
            }
            long j4 = j == 16 ? btwVar.a : j;
            if (j2 == 16) {
                j2 = btwVar.b;
            }
            long j5 = j2;
            long j6 = jT == 16 ? btwVar.c : jT;
            if (j3 == 16) {
                j3 = btwVar.d;
            }
            long j7 = j3;
            long j8 = jT2 != 16 ? jT2 : btwVar.e;
            long j9 = jP != 16 ? jP : btwVar.f;
            long j10 = jH != 16 ? jH : btwVar.g;
            long j11 = jH2 != 16 ? jH2 : btwVar.h;
            long j12 = jH3 != 16 ? jH3 : btwVar.i;
            if (jH4 == 16) {
                jH4 = btwVar.j;
            }
            int i5 = i3 >> 6;
            acqr.b(f, aonjVar, cmwVarB, false, aopmVar, new btw(j4, j5, j6, j7, j8, j9, j10, j11, j12, jH4), (kaw) null, (aono) null, (aono) null, cavVar2, (i5 & 14) | 196608 | (i5 & 112) | (i3 & 57344), 0);
            cbtVar.W(true);
            cmwVar2 = cmwVar3;
        } else {
            str2 = str;
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            final java.lang.String str3 = str2;
            cdkVarI.c = new aonn() { // from class: sls
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar3 = (cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    cmw cmwVar4 = cmwVar2;
                    int i6 = i | 1;
                    int i7 = 306783378 & i6;
                    int i8 = 613566756 & i6;
                    defpackage.sme.o(cmwVar4, str3, f, aonjVar, aopmVar, cavVar3, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 << 1) & i8));
                    return aojh.a;
                }
            };
        }
    }

    public static final void p(cmw cmwVar, defpackage.skf skfVar, defpackage.smu smuVar, cav cavVar, int i) {
        cmw cmwVar2;
        aooh.f(smuVar, "callbacks");
        cbt cbtVarB = cavVar.b(1849306402);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(skfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(smuVar) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.abix abixVar = skfVar.n;
            boolean z = (i2 & 112) == 32;
            boolean z2 = (i2 & 896) == 256;
            cmw cmwVar3 = cmw.c;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            boolean z3 = z | z2;
            byte[] bArr = null;
            if (z3 || objR == cau.a) {
                objR = new defpackage.qza(skfVar, smuVar, 14, bArr);
                cbtVar.ab(objR);
            }
            kj.s(false, (aomy) objR, cbtVarB, 0);
            if (abixVar != null) {
                cbtVarB.u(1141979394);
                aehj.aT(abixVar, (cmw) null, cbtVarB, 0);
                cbtVar.W(false);
            } else {
                cbtVarB.u(1142008224);
                cbtVar.W(false);
            }
            bvo.b(azm.c(cmwVar3, 1.0f), (crd) null, den.ak(cbtVarB).G, 0L, 0.0f, 0.0f, (amu) null, cfo.j(-2066478361, new qyh(skfVar, smuVar, 12), cbtVarB), cbtVarB, 122);
            cmwVar2 = cmwVar3;
        } else {
            cbtVarB.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ppx(cmwVar2, skfVar, smuVar, i, 7, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ajl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ajl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [ajl, java.lang.Object] */
    public static final void q(alg algVar, defpackage.sml smlVar, boolean z, aomy aomyVar, cmw cmwVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        java.lang.Object objF;
        boolean z2;
        java.lang.Object objF2;
        boolean z3;
        java.lang.Object objF3;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1030316488);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(algVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(smlVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.D(aomyVar) ? 1024 : 2048;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 |= true != cbtVarB.D(aonnVar) ? 65536 : 131072;
        }
        int i5 = i4;
        if (cbtVarB.H((i5 & 74899) != 74898, i5 & 1)) {
            int i6 = i5 & 14;
            int i7 = i6 ^ 6;
            cmw cmwVar3 = cmw.c;
            defpackage.smd smdVar = defpackage.smd.c;
            nf nfVar = alo.a;
            if (algVar.C()) {
                cbtVarB.u(1666827533);
                cbtVarB.W(false);
                objF = algVar.f();
            } else {
                cbtVarB.u(1666573488);
                boolean z4 = (i7 > 4 && cbtVarB.B(algVar)) || (i5 & 6) == 4;
                cbt cbtVar = cbtVarB;
                objF = cbtVar.R();
                if (z4 || objF == cau.a) {
                    cko ckoVarG = cfd.g();
                    aonj aonjVarI = ckoVarG != null ? ckoVarG.i() : null;
                    cko ckoVarH = cfd.h(ckoVarG);
                    try {
                        java.lang.Object objF4 = algVar.f();
                        cfd.i(ckoVarG, ckoVarH, aonjVarI);
                        cbtVar.ab(objF4);
                        objF = objF4;
                    } catch (java.lang.Throwable th) {
                        cfd.i(ckoVarG, ckoVarH, aonjVarI);
                        throw th;
                    }
                }
                cbtVar.W(false);
            }
            boolean zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
            cbtVarB.u(-1161365092);
            float f = true != zBooleanValue ? 1.0f : 0.0f;
            cbt cbtVar2 = cbtVarB;
            cbtVar2.W(false);
            java.lang.Float fValueOf = java.lang.Float.valueOf(f);
            boolean z5 = (i7 > 4 && cbtVarB.B(algVar)) || (i5 & 6) == 4;
            java.lang.Object objR = cbtVar2.R();
            if (z5 || objR == cau.a) {
                sky skyVar = new sky(algVar, 3);
                ajxw ajxwVar = ceo.a;
                objR = new cbk(skyVar, (cen) null);
                cbtVar2.ab(objR);
            }
            boolean zBooleanValue2 = ((java.lang.Boolean) ((cer) objR).a()).booleanValue();
            cbtVarB.u(-1161365092);
            float f2 = true != zBooleanValue2 ? 1.0f : 0.0f;
            cbtVar2.W(false);
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(f2);
            boolean z6 = (i7 > 4 && cbtVarB.B(algVar)) || (i5 & 6) == 4;
            java.lang.Object objR2 = cbtVar2.R();
            if (z6 || objR2 == cau.a) {
                bmx bmxVar = new bmx(algVar, 13);
                ajxw ajxwVar2 = ceo.a;
                objR2 = new cbk(bmxVar, (cen) null);
                cbtVar2.ab(objR2);
            }
            cer cerVarE = alk.e(algVar, fValueOf, fValueOf2, (ajl) smdVar.a(((cer) objR2).a(), cbtVarB, 0), nfVar, cbtVarB, i6);
            defpackage.smd smdVar2 = defpackage.smd.a;
            nf nfVar2 = alo.c;
            if (algVar.C()) {
                nfVar2 = nfVar2;
                z2 = false;
                cbtVarB.u(1666827533);
                cbtVar2.W(false);
                objF2 = algVar.f();
            } else {
                cbtVarB.u(1666573488);
                boolean z7 = (i7 > 4 && cbtVarB.B(algVar)) || (i5 & 6) == 4;
                objF2 = cbtVar2.R();
                if (z7 || objF2 == cau.a) {
                    cko ckoVarG2 = cfd.g();
                    aonj aonjVarI2 = ckoVarG2 != null ? ckoVarG2.i() : null;
                    cko ckoVarH2 = cfd.h(ckoVarG2);
                    try {
                        java.lang.Object objF5 = algVar.f();
                        cfd.i(ckoVarG2, ckoVarH2, aonjVarI2);
                        cbtVar2.ab(objF5);
                        objF2 = objF5;
                        z2 = false;
                    } catch (java.lang.Throwable th2) {
                        cfd.i(ckoVarG2, ckoVarH2, aonjVarI2);
                        throw th2;
                    }
                } else {
                    z2 = false;
                }
                cbtVar2.W(z2);
            }
            boolean zBooleanValue3 = ((java.lang.Boolean) objF2).booleanValue();
            cbtVarB.u(-1495784139);
            float f3 = true != zBooleanValue3 ? 16.0f : 0.0f;
            cbtVar2.W(z2);
            dpi dpiVar = new dpi(f3);
            boolean z8 = (i7 > 4 && cbtVarB.B(algVar)) || (i5 & 6) == 4;
            java.lang.Object objR3 = cbtVar2.R();
            if (z8 || objR3 == cau.a) {
                sky skyVar2 = new sky(algVar, 2);
                ajxw ajxwVar3 = ceo.a;
                objR3 = new cbk(skyVar2, (cen) null);
                cbtVar2.ab(objR3);
            }
            boolean zBooleanValue4 = ((java.lang.Boolean) ((cer) objR3).a()).booleanValue();
            cbtVarB.u(-1495784139);
            boolean z9 = true;
            float f4 = true != zBooleanValue4 ? 16.0f : 0.0f;
            cbtVar2.W(false);
            dpi dpiVar2 = new dpi(f4);
            if (i7 <= 4 || !cbtVarB.B(algVar)) {
                z9 = (i5 & 6) == 4;
            }
            java.lang.Object objR4 = cbtVar2.R();
            if (z9 || objR4 == cau.a) {
                bmx bmxVar2 = new bmx(algVar, 12);
                ajxw ajxwVar4 = ceo.a;
                cbk cbkVar = new cbk(bmxVar2, (cen) null);
                cbtVar2.ab(cbkVar);
                objR4 = cbkVar;
            }
            cer cerVarE2 = alk.e(algVar, dpiVar, dpiVar2, (ajl) smdVar2.a(((cer) objR4).a(), cbtVarB, 0), nfVar2, cbtVarB, i6);
            defpackage.smd smdVar3 = defpackage.smd.d;
            nf nfVar3 = alo.a;
            if (algVar.C()) {
                nfVar3 = nfVar3;
                i6 = i6;
                z3 = false;
                cbtVarB.u(1666827533);
                cbtVar2.W(false);
                objF3 = algVar.f();
            } else {
                cbtVarB.u(1666573488);
                boolean z10 = (i7 > 4 && cbtVarB.B(algVar)) || (i5 & 6) == 4;
                objF3 = cbtVar2.R();
                if (z10 || objF3 == cau.a) {
                    cko ckoVarG3 = cfd.g();
                    aonj aonjVarI3 = ckoVarG3 != null ? ckoVarG3.i() : null;
                    cko ckoVarH3 = cfd.h(ckoVarG3);
                    try {
                        java.lang.Object objF6 = algVar.f();
                        cfd.i(ckoVarG3, ckoVarH3, aonjVarI3);
                        cbtVar2.ab(objF6);
                        objF3 = objF6;
                    } catch (java.lang.Throwable th3) {
                        cfd.i(ckoVarG3, ckoVarH3, aonjVarI3);
                        throw th3;
                    }
                }
                z3 = false;
                cbtVar2.W(false);
            }
            boolean zBooleanValue5 = ((java.lang.Boolean) objF3).booleanValue();
            cbtVarB.u(247385940);
            float f5 = zBooleanValue5 ? 1.0f : smlVar.b;
            cbtVar2.W(z3);
            java.lang.Float fValueOf3 = java.lang.Float.valueOf(f5);
            boolean z11 = (i7 > 4 && cbtVarB.B(algVar)) || (i5 & 6) == 4;
            java.lang.Object objR5 = cbtVar2.R();
            if (z11 || objR5 == cau.a) {
                sky skyVar3 = new sky(algVar, 4);
                ajxw ajxwVar5 = ceo.a;
                cbk cbkVar2 = new cbk(skyVar3, (cen) null);
                cbtVar2.ab(cbkVar2);
                objR5 = cbkVar2;
            }
            boolean zBooleanValue6 = ((java.lang.Boolean) ((cer) objR5).a()).booleanValue();
            cbtVarB.u(247385940);
            float f6 = zBooleanValue6 ? 1.0f : smlVar.b;
            cbtVar2.W(false);
            java.lang.Float fValueOf4 = java.lang.Float.valueOf(f6);
            boolean z12 = (i7 > 4 && cbtVarB.B(algVar)) || (i5 & 6) == 4;
            java.lang.Object objR6 = cbtVar2.R();
            if (z12 || objR6 == cau.a) {
                bmx bmxVar3 = new bmx(algVar, 14);
                ajxw ajxwVar6 = ceo.a;
                objR6 = new cbk(bmxVar3, (cen) null);
                cbtVar2.ab(objR6);
            }
            cer cerVarE3 = alk.e(algVar, fValueOf3, fValueOf4, (ajl) smdVar3.a(((cer) objR6).a(), cbtVarB, 0), nfVar3, cbtVarB, i6);
            cmw cmwVarC = azm.c(den.x(cmwVar3, "onboarding_flow_preview_container"), 1.0f);
            boolean zB = ((i5 & 112) == 32) | cbtVarB.B(cerVarE3);
            java.lang.Object objR7 = cbtVar2.R();
            if (zB || objR7 == cau.a) {
                objR7 = new defpackage.slv(smlVar, cerVarE3, 0);
                cbtVar2.ab(objR7);
            }
            cmwVar2 = cmwVar3;
            bvo.d(aomyVar, cfd.J(cmwVarC, (aonj) objR7), z, bge.b(((dpi) cerVarE2.a()).a), den.ak(cbtVarB).G, 0L, 0.0f, 0.0f, den.bl(1.0f, cqg.h(den.ak(cbtVarB).A, a.G(cerVarE))), (kaw) null, aonnVar, cbtVarB, 736);
        } else {
            cbtVarB.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bxp(algVar, smlVar, z, aomyVar, cmwVar2, aonnVar, i, 3);
        }
    }
}
