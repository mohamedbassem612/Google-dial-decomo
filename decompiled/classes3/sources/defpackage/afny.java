package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afny {
    private static final cbd b = new cbn(cdu.c, new defpackage.abna(16));
    public static final aimz a = aimz.i("com/google/android/libraries/user/profile/photopicker/components/googlephotos/GooglePhotosPickerKt");

    public static final defpackage.xsv a(defpackage.xsv xsvVar) {
        int iA = (int) defpackage.anhk.a.eZ().a();
        if (iA <= 0) {
            return xsvVar;
        }
        defpackage.xsv xsvVarB = xsvVar.i(new defpackage.yep().D(defpackage.yad.a, java.lang.Integer.valueOf(iA)));
        aooh.c(xsvVarB);
        return xsvVarB;
    }

    public static final defpackage.afoe b(cer cerVar) {
        return (defpackage.afoe) cerVar.a();
    }

    public static final defpackage.afoe c(cer cerVar) {
        return (defpackage.afoe) cerVar.a();
    }

    public static final defpackage.afop d(cer cerVar) {
        return (defpackage.afop) cerVar.a();
    }

    public static final void e(aozh aozhVar, aonn aonnVar, aonj aonjVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-996318524);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(aozhVar) : cavVarB.D(aozhVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(aonnVar) : cavVarB.D(aonnVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            cavVar2 = cavVarB;
            defpackage.afmu.a(89733, cfo.j(-406346578, new afd(bco.a(cavVar2), cdh.h(aozhVar, (aolr) null, (cen) null, cavVarB, i2 & 14, 3), aonjVar, aonnVar, 6, (byte[]) null), cavVar2), cavVar2, 54);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abif(aozhVar, aonnVar, aonjVar, i, 9);
        }
    }

    public static final void f(final defpackage.afov afovVar, final aonj aonjVar, aonj aonjVar2, aonj aonjVar3, defpackage.afow afowVar, cav cavVar, int i) {
        int i2;
        aonj aonjVar4;
        aonj aonjVar5;
        defpackage.afow afowVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1475983917);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(afovVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            aonjVar4 = aonjVar2;
            i2 |= true != cavVarB.D(aonjVar4) ? 128 : 256;
        } else {
            aonjVar4 = aonjVar2;
        }
        if ((i & 3072) == 0) {
            aonjVar5 = aonjVar3;
            i2 |= true != cavVarB.D(aonjVar5) ? 1024 : 2048;
        } else {
            aonjVar5 = aonjVar3;
        }
        if ((i & 24576) == 0) {
            afowVar2 = afowVar;
            i2 |= true != cavVarB.D(afowVar2) ? 8192 : 16384;
        } else {
            afowVar2 = afowVar;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            final cer cerVarH = cdh.h(afovVar.f, (aolr) null, (cen) null, cavVarB, 0, 3);
            final aonj aonjVar6 = aonjVar4;
            final aonj aonjVar7 = aonjVar5;
            final defpackage.afow afowVar3 = afowVar2;
            defpackage.afmu.a(109564, cfo.j(-1099544041, new aono() { // from class: afnf
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    cav cavVar2 = (cav) obj2;
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    aimz aimzVar = defpackage.afny.a;
                    aooh.f((defpackage.afpl) obj, "$this$VisualElement");
                    if (cavVar2.H((iIntValue & 17) != 16, iIntValue & 1)) {
                        defpackage.afow afowVar4 = afowVar3;
                        cer cerVar = cerVarH;
                        int i4 = defpackage.afny.d(cerVar).b - 1;
                        if (i4 == 0 || i4 == 1) {
                            cavVar2.u(1199111378);
                            aaoo.N((cmw) null, 0L, den.ak(cavVar2).a, 0, 0.0f, cavVar2, 0);
                            cavVar2.o();
                        } else if (i4 == 3) {
                            cavVar2.u(1199242167);
                            if (defpackage.afny.d(cerVar).a.isEmpty()) {
                                cavVar2.u(1199263092);
                                defpackage.afny.g(2131231457, 2132019644, null, cavVar2, 0, 4);
                                cavVar2.o();
                            } else {
                                cavVar2.u(1199430089);
                                boolean z = defpackage.afny.d(cerVar).a.size() > 1 || !(((defpackage.afou) defpackage.afny.d(cerVar).a.get(0)).a instanceof defpackage.afoq);
                                aonj aonjVar8 = aonjVar7;
                                aonj aonjVar9 = aonjVar;
                                aonj aonjVar10 = aonjVar6;
                                boolean zB = cavVar2.B(cerVar) | cavVar2.B(aonjVar10) | cavVar2.B(aonjVar9) | cavVar2.C(z) | cavVar2.B(aonjVar8);
                                java.lang.Object objG = cavVar2.g();
                                if (zB || objG == cau.a) {
                                    fxq fxqVar = new fxq(aonjVar10, aonjVar9, z, aonjVar8, cerVar, 2);
                                    cavVar2.w(fxqVar);
                                    objG = fxqVar;
                                }
                                defpackage.afny.h(null, null, (aonj) objG, cavVar2, 0, 3);
                                cavVar2.o();
                            }
                            java.lang.Boolean bool = java.lang.Boolean.TRUE;
                            boolean zD = cavVar2.D(afowVar4) | cavVar2.B(cerVar);
                            java.lang.Object objG2 = cavVar2.g();
                            if (zD || objG2 == cau.a) {
                                objG2 = new defpackage.zjr(afowVar4, cerVar, (aoln) null, 6);
                                cavVar2.w(objG2);
                            }
                            cbp.g(bool, (aonn) objG2, cavVar2);
                            cavVar2.o();
                        } else if (i4 != 4) {
                            cavVar2.u(1200202857);
                            cavVar2.o();
                        } else {
                            defpackage.afov afovVar2 = afovVar;
                            cavVar2.u(1200022623);
                            int i5 = defpackage.afny.d(cerVar).c;
                            boolean zD2 = cavVar2.D(afovVar2);
                            java.lang.Object objG3 = cavVar2.g();
                            if (zD2 || objG3 == cau.a) {
                                objG3 = new defpackage.addr(afovVar2, 7);
                                cavVar2.w(objG3);
                            }
                            defpackage.afny.m(i5, (aomy) objG3, cavVar2, 0);
                            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                            boolean zD3 = cavVar2.D(afowVar4) | cavVar2.B(cerVar);
                            java.lang.Object objG4 = cavVar2.g();
                            if (zD3 || objG4 == cau.a) {
                                defpackage.zjr zjrVar = new defpackage.zjr(afowVar4, cerVar, (aoln) null, 7, (byte[]) null);
                                cavVar2.w(zjrVar);
                                objG4 = zjrVar;
                            }
                            cbp.g(bool2, (aonn) objG4, cavVar2);
                            cavVar2.o();
                        }
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVarB, 54);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.afng(afovVar, aonjVar, aonjVar2, aonjVar3, afowVar, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x0135  */
    /* JADX WARN: Code duplicated, block: B:45:0x013f  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    public static final void g(final int i, final int i2, aono aonoVar, cav cavVar, final int i3, final int i4) {
        int i5;
        aono aonoVar2;
        boolean z;
        final aono aonoVar3;
        cdk cdkVarI;
        aono aonoVar4;
        cbt cbtVar;
        aomy aomyVar;
        int i6 = i3 & 6;
        cav cavVarB = cavVar.b(-1973555542);
        if (i6 == 0) {
            i5 = (true != cavVarB.z(i) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != cavVarB.z(i2) ? 16 : 32;
        }
        int i7 = i4 & 4;
        if (i7 == 0) {
            if ((i3 & 384) == 0) {
                aonoVar2 = aonoVar;
                i5 |= true != cavVarB.D(aonoVar2) ? 128 : 256;
            }
            if ((i5 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i5 & 1)) {
                if (i7 != 0) {
                    aonoVar4 = defpackage.afnb.e;
                } else {
                    aonoVar4 = aonoVar2;
                }
                cmi cmiVar = cmh.k;
                awb awbVar = awi.e;
                cmt cmtVar = cmw.c;
                cmw cmwVarC = azm.c(cmtVar, 1.0f);
                cye cyeVarA = aww.a(awbVar, cmiVar, cavVarB, 54);
                cbtVar = (cbt) cavVarB;
                int iM = anty.M(cbtVar.x);
                cje cjeVarAi = cbtVar.ai();
                cmw cmwVarM = cfo.m(cavVarB, cmwVarC);
                aomyVar = dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                cev.c(cavVarB, cyeVarA, dam.e);
                cev.c(cavVarB, cjeVarAi, dam.d);
                cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
                cev.b(cavVarB, dam.g);
                cev.c(cavVarB, cmwVarM, dam.c);
                awy awyVar = awy.a;
                aaoo.V(wv.k(i, cavVarB, i5 & 14), (java.lang.String) null, den.ba(azm.g(cmtVar, 96.0f), 0.0f, 16.0f, 0.0f, 0.0f), 0L, cavVarB, 440, 8);
                int i8 = i5 >> 3;
                aono aonoVar5 = aonoVar4;
                abrz.k(dfa.f(i2, cavVarB), den.ba(cmtVar, 0.0f, 24.0f, 0.0f, 0.0f), 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVarB, 48, 0, 262140);
                cavVarB = cavVarB;
                aonoVar5.a(awyVar, cavVarB, java.lang.Integer.valueOf((i8 & 112) | 6));
                cbtVar.W(true);
                aonoVar3 = aonoVar5;
            } else {
                cavVarB.s();
                aonoVar3 = aonoVar2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new aonn() { // from class: afnk
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                        cav cavVar2 = (cav) obj;
                        ((java.lang.Integer) obj2).intValue();
                        int i9 = i3 | 1;
                        int i10 = 306783378 & i9;
                        int i11 = 613566756 & i9;
                        defpackage.afny.g(i, i2, aonoVar3, cavVar2, (i9 & (-920350135)) | i10 | (i11 >> 1) | ((i10 << 1) & i11), i4);
                        return aojh.a;
                    }
                };
            }
        }
        i5 |= 384;
        aonoVar2 = aonoVar;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (cavVarB.H(z, i5 & 1)) {
            if (i7 != 0) {
                aonoVar4 = defpackage.afnb.e;
            } else {
                aonoVar4 = aonoVar2;
            }
            cmi cmiVar2 = cmh.k;
            awb awbVar2 = awi.e;
            cmt cmtVar2 = cmw.c;
            cmw cmwVarC2 = azm.c(cmtVar2, 1.0f);
            cye cyeVarA2 = aww.a(awbVar2, cmiVar2, cavVarB, 54);
            cbtVar = (cbt) cavVarB;
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cavVarB, cmwVarC2);
            aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA2, dam.e);
            cev.c(cavVarB, cjeVarAi2, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM2), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM2, dam.c);
            awy awyVar2 = awy.a;
            aaoo.V(wv.k(i, cavVarB, i5 & 14), (java.lang.String) null, den.ba(azm.g(cmtVar2, 96.0f), 0.0f, 16.0f, 0.0f, 0.0f), 0L, cavVarB, 440, 8);
            int i9 = i5 >> 3;
            aono aonoVar6 = aonoVar4;
            abrz.k(dfa.f(i2, cavVarB), den.ba(cmtVar2, 0.0f, 24.0f, 0.0f, 0.0f), 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVarB, 48, 0, 262140);
            cavVarB = cavVarB;
            aonoVar6.a(awyVar2, cavVarB, java.lang.Integer.valueOf((i9 & 112) | 6));
            cbtVar.W(true);
            aonoVar3 = aonoVar6;
        } else {
            cavVarB.s();
            aonoVar3 = aonoVar2;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: afnk
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar2 = (cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    int i10 = i3 | 1;
                    int i11 = 306783378 & i10;
                    int i12 = 613566756 & i10;
                    defpackage.afny.g(i, i2, aonoVar3, cavVar2, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 << 1) & i12), i4);
                    return aojh.a;
                }
            };
        }
    }

    public static final void h(cmw cmwVar, bcl bclVar, aonj aonjVar, cav cavVar, int i, int i2) {
        cmw cmwVar2;
        int i3;
        bcl bclVarA;
        cav cavVar2;
        cmw cmwVar3;
        cmw cmwVar4;
        int i4;
        int i5 = i2 & 1;
        cav cavVarB = cavVar.b(-1266275111);
        if (i5 != 0) {
            i3 = i | 6;
            cmwVar2 = cmwVar;
        } else if ((i & 6) == 0) {
            cmwVar2 = cmwVar;
            i3 = (true != cavVarB.B(cmwVar2) ? 2 : 4) | i;
        } else {
            cmwVar2 = cmwVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i6 = 16;
            if ((i2 & 2) == 0) {
                bclVarA = bclVar;
                if (cavVarB.B(bclVarA)) {
                    i6 = 32;
                }
            } else {
                bclVarA = bclVar;
            }
            i3 |= i6;
        } else {
            bclVarA = bclVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            int i7 = i2 & 2;
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cavVarB.E()) {
                cmw cmwVar5 = i5 != 0 ? cmw.c : cmwVar2;
                if (i7 != 0) {
                    int i8 = i3 & (-113);
                    cmwVar4 = cmwVar5;
                    i4 = i8;
                    bclVarA = bco.a(cavVarB);
                } else {
                    int i9 = i3;
                    cmwVar4 = cmwVar5;
                    i4 = i9;
                }
            } else {
                cavVarB.s();
                if (i7 != 0) {
                    i3 &= -113;
                }
                i4 = i3;
                cmwVar4 = cmwVar2;
            }
            cavVarB.l();
            int i10 = i4 << 3;
            cavVar2 = cavVarB;
            bai.c(new bbk(), cmwVar4, bclVarA, den.bc(6.0f, 0.0f, 6.0f, 2.0f, 2), awi.f(4.0f), awi.f(4.0f), (ars) null, false, (amn) null, (bdn) null, aonjVar, cavVar2, (i10 & 112) | 1772544 | (i10 & 896), (i4 >> 3) & 112);
            cmwVar3 = cmwVar4;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar3 = cmwVar2;
        }
        bcl bclVar2 = bclVarA;
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new dqg(cmwVar3, bclVar2, aonjVar, i, i2, 8);
        }
    }

    public static final void i(cav cavVar, int i) {
        cav cavVarB = cavVar.b(-1265595813);
        if (cavVarB.H(i != 0, i & 1)) {
            awo.c(den.bo(azm.c(cmw.c, 1.0f), cfd.U(new aoiu[]{new aoiu(java.lang.Float.valueOf(0.0f), new cqg(cfd.M(0))), new aoiu(java.lang.Float.valueOf(0.8f), new cqg(-8502796096475496448L)), new aoiu(java.lang.Float.valueOf(1.0f), new cqg(-8502796096475496448L))})), cavVarB, 6);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.peb(i, 11);
        }
    }

    public static final void j(aozh aozhVar, aonn aonnVar, aonj aonjVar, java.lang.String str, int i, cav cavVar, int i2) {
        int i3;
        cav cavVar2;
        aooh.f(aonnVar, "fetchMore");
        aooh.f(aonjVar, "onPhotoSelected");
        int i4 = i2 & 6;
        cav cavVarB = cavVar.b(446218484);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? cavVarB.B(aozhVar) : cavVarB.D(aozhVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? cavVarB.B(aonnVar) : cavVarB.D(aonnVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cavVarB.B(str) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != cavVarB.z(i) ? 8192 : 16384;
        }
        int i5 = i3;
        if (cavVarB.H((i5 & 9363) != 9362, i5 & 1)) {
            cavVar2 = cavVarB;
            defpackage.afmu.a(i, cfo.j(-678885814, new defpackage.afnh(str, bco.a(cavVar2), cdh.h(aozhVar, (aolr) null, (cen) null, cavVarB, i5 & 14, 3), aonjVar, aonnVar, 0), cavVar2), cavVar2, ((i5 >> 12) & 14) | 48);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abje(aozhVar, aonnVar, aonjVar, str, i, i2, 6);
        }
    }

    public static final void k(cmw cmwVar, defpackage.aklp aklpVar, aonj aonjVar, cav cavVar, int i) {
        cmw cmwVar2;
        int i2;
        java.lang.String strF;
        boolean z;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1571663864);
        if (i3 == 0) {
            cmwVar2 = cmwVar;
            i2 = (true != cavVarB.B(cmwVar2) ? 2 : 4) | i;
        } else {
            cmwVar2 = cmwVar;
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(aklpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            cmw cmwVarK = cfd.K(cmwVar2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, bge.b(4.0f), true, 0, 1042431);
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 112) == 32;
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            boolean z4 = z2 | z3;
            byte[] bArr = null;
            if (z4 || objR == cau.a) {
                objR = new defpackage.xtu(aonjVar, aklpVar, i4, bArr);
                cbtVar.ab(objR);
            }
            cmw cmwVarBj = den.bj(cmwVarK, true, (java.lang.String) null, (dib) null, (aomy) objR);
            cye cyeVarB = awo.b(cmh.a, false);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarBj);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarB, dam.e);
            cev.c(cavVarB, cjeVarAi, dam.d);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVarB, dam.g);
            cev.c(cavVarB, cmwVarM, dam.c);
            awt awtVar = awt.a;
            defpackage.akmc akmcVar = aklpVar.d;
            if (akmcVar == null) {
                akmcVar = defpackage.akmc.a;
            }
            aooh.e(akmcVar, "getSamplePhoto(...)");
            defpackage.abys abysVarP = p(akmcVar, cavVarB);
            if ((aklpVar.b & 4) != 0) {
                cavVarB.u(831427260);
                cbtVar.W(false);
                strF = aklpVar.e;
                aooh.c(strF);
            } else {
                cavVarB.u(4467171);
                strF = dfa.f(2132019642, cavVarB);
                cbtVar.W(false);
            }
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == cau.a) {
                objR2 = defpackage.afnq.a;
                cbtVar.ab(objR2);
            }
            defpackage.xtm.a(abysVarP, strF, null, null, null, 0.0f, (aonj) objR2, cavVarB, 805306368, 508);
            java.lang.String str = aklpVar.e;
            aooh.e(str, "getName(...)");
            if (aoov.H(str)) {
                z = true;
                cavVarB.u(1151589744);
                cbtVar.W(false);
            } else {
                cavVarB.u(1151260121);
                i(cavVarB, 0);
                java.lang.String str2 = aklpVar.e;
                aooh.e(str2, "getName(...)");
                z = true;
                abrz.k(str2, den.ba(awtVar.a(cmw.c, cmh.h), 4.0f, 0.0f, 4.0f, 8.0f), -4294967296L, 0L, (dnd) null, (dmq) null, 0L, new dot(3), 0L, 0, false, 2, 0, (aonj) null, den.an(cavVarB).m, cavVarB, 384, 24576, 113656);
                cavVarB = cavVarB;
                cbtVar.W(false);
            }
            cbtVar.W(z);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abif(cmwVar, (alad) aklpVar, aonjVar, i, 11);
        }
    }

    public static final void l(cmw cmwVar, defpackage.akmc akmcVar, aonj aonjVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1144921416);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(akmcVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonjVar) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            boolean z = (i2 & 896) == 256;
            boolean z2 = (i2 & 112) == 32;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            boolean z3 = z | z2;
            byte[] bArr = null;
            if (z3 || objR == cau.a) {
                objR = new defpackage.xtu(aonjVar, akmcVar, 17, bArr);
                cbtVar.ab(objR);
            }
            cmw cmwVarBj = den.bj(cmwVar, true, (java.lang.String) null, (dib) null, (aomy) objR);
            defpackage.abys abysVarP = p(akmcVar, cbtVarB);
            alcf alcfVar = akmcVar.f;
            if (alcfVar == null) {
                alcfVar = alcf.a;
            }
            java.util.Date date = new java.util.Date(aldi.b(alcfVar));
            java.text.DateFormat dateTimeInstance = java.text.DateFormat.getDateTimeInstance();
            dateTimeInstance.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
            java.lang.String str = dateTimeInstance.format(date);
            aooh.e(str, "getTalkbackDateString(...)");
            java.lang.String strG = dfa.g(2132019645, new java.lang.Object[]{str}, cbtVarB);
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == cau.a) {
                objR2 = defpackage.afnw.a;
                cbtVar.ab(objR2);
            }
            defpackage.xtm.a(abysVarP, strG, cmwVarBj, null, null, 0.0f, (aonj) objR2, cbtVarB, 805306368, 504);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abif(cmwVar, (alad) akmcVar, aonjVar, i, 10);
        }
    }

    public static final void m(int i, aomy aomyVar, cav cavVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i2 & 6;
        cav cavVarB = cavVar.b(-1920415793);
        int i10 = 0;
        if (i9 == 0) {
            if (i == 0) {
                i8 = -1;
                i3 = 0;
            } else {
                i3 = i;
                i8 = i - 1;
            }
            i4 = (true != cavVarB.z(i8) ? 2 : 4) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            if (i3 == 0) {
                i6 = 0;
            } else {
                if (i3 - 1 != 2) {
                    i6 = i3;
                } else {
                    i5 = 2131231369;
                    i6 = i3;
                }
                i7 = 2132019673;
                if (i6 != 0 && i6 - 1 == 2) {
                    i7 = 2132019622;
                }
                g(i5, i7, cfo.j(-2097849130, new defpackage.afnj(i6, aomyVar, i10), cavVarB), cavVarB, 384, 0);
            }
            i5 = 2131231674;
            i7 = 2132019673;
            if (i6 != 0) {
                i7 = 2132019622;
            }
            g(i5, i7, cfo.j(-2097849130, new defpackage.afnj(i6, aomyVar, i10), cavVarB), cavVarB, 384, 0);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.pbt(i3, aomyVar, i2, 8);
        }
    }

    public static final void n(final defpackage.vaa vaaVar, defpackage.acmg acmgVar, final fvx fvxVar, final cmw cmwVar, final android.accounts.Account account, boolean z, final defpackage.akpg akpgVar, final defpackage.akoq akoqVar, defpackage.afov afovVar, defpackage.afow afowVar, final aonj aonjVar, cav cavVar, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        defpackage.afov afovVar2;
        defpackage.afow afowVar2;
        char c;
        final defpackage.afow afowVar3;
        boolean z3;
        final defpackage.afov afovVar3;
        aooh.f(vaaVar, "ve");
        aooh.f(acmgVar, "interactionLogger");
        aooh.f(fvxVar, "navController");
        aooh.f(akpgVar, "contactsHost");
        aooh.f(akoqVar, "contactsClient");
        aooh.f(aonjVar, "onPhotoSelected");
        int i5 = i & 6;
        cbt cbtVarB = cavVar.b(-226630403);
        if (i5 == 0) {
            i3 = (true != cbtVarB.B(vaaVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cbtVarB.D(acmgVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cbtVarB.D(fvxVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cbtVarB.B(cmwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cbtVarB.D(account) ? 8192 : 16384;
        }
        int i6 = i3 | 196608;
        if ((1572864 & i) == 0) {
            i6 |= true != cbtVarB.B(akpgVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i6 |= true != cbtVarB.B(akoqVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i6 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i6 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cbtVarB.D(aonjVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (cbtVarB.H(((306783379 & i6) == 306783378 && (i4 & 3) == 2) ? false : true, i6 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cbtVarB.E()) {
                java.lang.String strValueOf = java.lang.String.valueOf(account.name);
                eos eosVarO = o(cbtVarB);
                c = 0;
                android.os.Bundle bundleR = dpe.r(new aoiu[]{new aoiu("profiles_account", account), new aoiu("include_me_cluster", java.lang.Boolean.TRUE)});
                defpackage.akmr.u(bundleR, "contacts_host", akpgVar);
                defpackage.akmr.u(bundleR, "contacts_client", akoqVar);
                eop eopVar = env.c;
                android.os.Bundle bundle = (android.os.Bundle) eosVarO.a(eopVar);
                if (bundle != null) {
                    bundle.putAll(bundleR);
                    bundleR = bundle;
                }
                eosVarO.b(eopVar, bundleR);
                cbd cbdVar = eov.a;
                eoi eoiVarA = eov.a(cbtVarB);
                if (eoiVarA == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                java.lang.String strConcat = "GooglePhotosHomeViewModel-".concat(strValueOf);
                aopu[] aopuVarArr = aoou.a;
                defpackage.afov afovVar4 = (defpackage.afov) dzl.m(new aooa(defpackage.afov.class), eoiVarA, strConcat, (eoe) null, eosVarO);
                java.lang.String strValueOf2 = java.lang.String.valueOf(account.name);
                eos eosVarO2 = o(cbtVarB);
                android.os.Bundle bundleR2 = dpe.r(new aoiu[]{new aoiu("profiles_account", account)});
                defpackage.akmr.u(bundleR2, "contacts_host", akpgVar);
                defpackage.akmr.u(bundleR2, "contacts_client", akoqVar);
                android.os.Bundle bundle2 = (android.os.Bundle) eosVarO2.a(eopVar);
                if (bundle2 != null) {
                    bundle2.putAll(bundleR2);
                    bundleR2 = bundle2;
                }
                eosVarO2.b(eopVar, bundleR2);
                eoi eoiVarA2 = eov.a(cbtVarB);
                if (eoiVarA2 == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                afowVar3 = (defpackage.afow) dzl.m(new aooa(defpackage.afow.class), eoiVarA2, "LoggingViewModel-".concat(strValueOf2), (eoe) null, eosVarO2);
                z3 = true;
                afovVar3 = afovVar4;
            } else {
                cbtVarB.s();
                z3 = z;
                afovVar3 = afovVar;
                c = 0;
                afowVar3 = afowVar;
            }
            cbtVarB.l();
            cdj[] cdjVarArr = new cdj[3];
            cdjVarArr[c] = b.b(account);
            cdjVarArr[1] = defpackage.afmu.a.b(vaaVar);
            cdjVarArr[2] = defpackage.afmu.b.b(acmgVar);
            den.ac(cdjVarArr, cfo.j(656136253, new aonn() { // from class: afni
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar2 = (cav) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i7 = iIntValue & 3;
                    int i8 = iIntValue & 1;
                    aimz aimzVar = defpackage.afny.a;
                    if (cavVar2.H(i7 != 2, i8)) {
                        defpackage.afov afovVar5 = afovVar3;
                        boolean zD = cavVar2.D(afovVar5);
                        java.lang.Object objG = cavVar2.g();
                        if (zD || objG == cau.a) {
                            objG = new defpackage.abvk(afovVar5, (aoln) null, 4);
                            cavVar2.w(objG);
                        }
                        fvx fvxVar2 = fvxVar;
                        android.accounts.Account account2 = account;
                        cbp.g(account2, (aonn) objG, cavVar2);
                        boolean zD2 = cavVar2.D(fvxVar2);
                        java.lang.Object objG2 = cavVar2.g();
                        if (zD2 || objG2 == cau.a) {
                            objG2 = new defpackage.abph(fvxVar2, 13);
                            cavVar2.w(objG2);
                        }
                        aonj aonjVar2 = (aonj) objG2;
                        java.lang.Object objG3 = cavVar2.g();
                        if (objG3 == cau.a) {
                            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState("Google Photos", cdu.c);
                            cavVar2.w(parcelableSnapshotMutableState);
                            objG3 = parcelableSnapshotMutableState;
                        }
                        defpackage.afow afowVar4 = afowVar3;
                        ccp ccpVar = (ccp) objG3;
                        android.app.Activity activity = (android.app.Activity) cavVar2.e(nr.a);
                        defpackage.wyw wywVar = afowVar4.c;
                        akzx akzxVarM = defpackage.akpa.a.m();
                        aooh.f(akzxVarM, "builder");
                        akzxVarM.u();
                        defpackage.akpa akpaVar = (defpackage.akpa) akzxVarM.b;
                        akpaVar.c = 10;
                        akpaVar.b |= 1;
                        alad aladVarP = akzxVarM.p();
                        aooh.e(aladVarP, "build(...)");
                        defpackage.akpa akpaVar2 = (defpackage.akpa) aladVarP;
                        akzx akzxVarG = wywVar.g();
                        akzx akzxVarM2 = defpackage.akok.a.m();
                        akzx akzxVarM3 = defpackage.akor.a.m();
                        akzxVarM3.u();
                        defpackage.akor akorVar = (defpackage.akor) akzxVarM3.b;
                        akorVar.c = 4;
                        akorVar.b |= 1;
                        akzxVarM3.u();
                        defpackage.akor akorVar2 = (defpackage.akor) akzxVarM3.b;
                        j$.util.Objects.requireNonNull(akpaVar2);
                        akorVar2.d = akpaVar2;
                        akorVar2.b |= 2;
                        akzxVarM2.u();
                        defpackage.akok akokVar = (defpackage.akok) akzxVarM2.b;
                        defpackage.akor akorVar3 = (defpackage.akor) akzxVarM3.p();
                        j$.util.Objects.requireNonNull(akorVar3);
                        akokVar.c = akorVar3;
                        akokVar.b |= 1;
                        akzxVarG.u();
                        defpackage.akoi akoiVar = (defpackage.akoi) akzxVarG.b;
                        defpackage.akok akokVar2 = (defpackage.akok) akzxVarM2.p();
                        defpackage.akoi akoiVar2 = defpackage.akoi.a;
                        j$.util.Objects.requireNonNull(akokVar2);
                        akoiVar.d = akokVar2;
                        akoiVar.b |= 2;
                        wywVar.f((defpackage.akoi) akzxVarG.p());
                        ajml ajmlVar = new ajml(afowVar4.b);
                        akzx akzxVarM4 = defpackage.akpf.a.m();
                        aooh.f(akzxVarM4, "builder");
                        akzxVarM4.u();
                        defpackage.akpf akpfVar = (defpackage.akpf) akzxVarM4.b;
                        akpfVar.c = 6;
                        akpfVar.b |= 1;
                        akzxVarM4.u();
                        defpackage.akpf akpfVar2 = (defpackage.akpf) akzxVarM4.b;
                        akpfVar2.d = 12;
                        akpfVar2.b |= 2;
                        alad aladVarP2 = akzxVarM4.p();
                        aooh.e(aladVarP2, "build(...)");
                        defpackage.akpf akpfVar3 = (defpackage.akpf) aladVarP2;
                        aooh.f(akpfVar3, "metadata");
                        akzx akzxVar = (akzx) ajmlVar.b;
                        akzxVar.u();
                        akow akowVar = akzxVar.b;
                        akow akowVar2 = akow.a;
                        j$.util.Objects.requireNonNull(akpfVar3);
                        akowVar.d = akpfVar3;
                        akowVar.c = 1;
                        afowVar4.a = ajmlVar;
                        cmt cmtVar = cmw.c;
                        cye cyeVarA = aww.a(awi.c, cmh.j, cavVar2, 0);
                        int iM = anty.M(cavVar2.a());
                        cje cjeVarM = cavVar2.M();
                        cmw cmwVarM = cfo.m(cavVar2, cmtVar);
                        aomy aomyVar = dam.a;
                        cavVar2.L();
                        cavVar2.v();
                        if (cavVar2.F()) {
                            cavVar2.j(aomyVar);
                        } else {
                            cavVar2.x();
                        }
                        aonj aonjVar3 = aonjVar;
                        cmw cmwVar2 = cmwVar;
                        defpackage.akoq akoqVar2 = akoqVar;
                        defpackage.akpg akpgVar2 = akpgVar;
                        defpackage.vaa vaaVar2 = vaaVar;
                        cev.c(cavVar2, cyeVarA, dam.e);
                        cev.c(cavVar2, cjeVarM, dam.d);
                        cev.c(cavVar2, java.lang.Integer.valueOf(iM), dam.f);
                        cev.b(cavVar2, dam.g);
                        cev.c(cavVar2, cmwVarM, dam.c);
                        defpackage.acpg.c(cfo.j(606049026, new defpackage.abkv(ccpVar, 12), cavVar2), null, cfo.j(993208256, new defpackage.zjn(fvxVar2, activity, 19), cavVar2), null, 0.0f, null, afsq.aQ(den.ak(cavVar2).I, cavVar2), cavVar2, 390);
                        acmc[] acmcVarArr = {aaoo.ar("obake_android"), abrz.g(account2.name)};
                        apdi apdiVar = defpackage.afmy.a;
                        akzx akzxVarM5 = defpackage.akol.a.m();
                        aooh.f(akzxVarM5, "builder");
                        akzx akzxVarM6 = defpackage.akoh.a.m();
                        aooh.f(akzxVarM6, "builder");
                        aooh.f(akpgVar2, "value");
                        akzxVarM6.u();
                        defpackage.akoh akohVar = (defpackage.akoh) akzxVarM6.b;
                        j$.util.Objects.requireNonNull(akpgVar2);
                        akohVar.d = akpgVar2;
                        akohVar.b |= 2;
                        aooh.f(akoqVar2, "value");
                        akzxVarM6.u();
                        defpackage.akoh akohVar2 = (defpackage.akoh) akzxVarM6.b;
                        j$.util.Objects.requireNonNull(akoqVar2);
                        akohVar2.e = akoqVar2;
                        akohVar2.b |= 4;
                        alad aladVarP3 = akzxVarM6.p();
                        aooh.e(aladVarP3, "build(...)");
                        defpackage.akoh akohVar3 = (defpackage.akoh) aladVarP3;
                        aooh.f(akohVar3, "value");
                        akzxVarM5.u();
                        defpackage.akol akolVar = (defpackage.akol) akzxVarM5.b;
                        j$.util.Objects.requireNonNull(akohVar3);
                        akolVar.c = akohVar3;
                        akolVar.b |= 1;
                        alad aladVarP4 = akzxVarM5.p();
                        aooh.e(aladVarP4, "build(...)");
                        vaaVar2.L(224910, new defpackage.acmb[]{new defpackage.acmb(apdiVar, (defpackage.akol) aladVarP4)}, acmcVarArr, null, cfo.j(-805106147, new afnl(cmwVar2, fvxVar2, afovVar5, afowVar4, aonjVar2, aonjVar3, ccpVar, 0), cavVar2), cavVar2, 12582918, 120);
                        cavVar2.n();
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
            }, cbtVarB), cbtVarB, 48);
            afovVar2 = afovVar3;
            afowVar2 = afowVar3;
            z2 = z3;
        } else {
            cbtVarB.s();
            z2 = z;
            afovVar2 = afovVar;
            afowVar2 = afowVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bby(vaaVar, acmgVar, fvxVar, cmwVar, account, z2, akpgVar, akoqVar, afovVar2, afowVar2, aonjVar, i, i2, 6);
        }
    }

    private static final eos o(cav cavVar) {
        cbd cbdVar = eov.a;
        emn emnVarA = eov.a(cavVar);
        aooh.c(emnVarA);
        return new eos(emnVarA instanceof emn ? emnVarA.T() : eoo.a);
    }

    private static final defpackage.abys p(defpackage.akmc akmcVar, cav cavVar) {
        java.lang.String string = aehj.w(akmcVar).toString();
        defpackage.abyy abyyVar = new defpackage.abyy();
        abyyVar.b |= 33554432;
        abyyVar.c |= 33554432;
        return new defpackage.abys(string, abyyVar, new defpackage.abyr((android.accounts.Account) cavVar.e(b)));
    }
}
