package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bmz {
    public static final ajb a = new ajb(0.8f, 0.0f, 0.8f, 0.15f);
    public static final float b = 12.0f;

    public static final void a(final cmw cmwVar, final defpackage.bym bymVar, final long j, final long j2, final long j3, long j4, final aonn aonnVar, final dkz dkzVar, final aonn aonnVar2, final dkz dkzVar2, aomy aomyVar, final awh awhVar, final cmi cmiVar, final int i, boolean z, final aonn aonnVar3, aonn aonnVar4, final float f, final ayy ayyVar, cav cavVar, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        awh awhVar2;
        int i7;
        boolean z4;
        boolean z5;
        aonn aonnVar5;
        cav cavVar2;
        long j5;
        aomy aomyVar2;
        final boolean z6;
        cbt cbtVar;
        aonn aonnVar6;
        aonn aonnVar7;
        aomy aomyVar3;
        aonn aonnVar8;
        boolean z7;
        aonj aonjVar;
        boolean z8;
        cmw cmwVarB;
        boolean z9;
        int i8 = i2 & 6;
        cav cavVarB = cavVar.b(239553141);
        if (i8 == 0) {
            i4 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != ((i2 & 64) == 0 ? cavVarB.B(bymVar) : cavVarB.D(bymVar)) ? 16 : 32;
        }
        int i9 = i4;
        if ((i2 & 384) == 0) {
            i5 = i9 | (true != cavVarB.A(j) ? 128 : 256);
        } else {
            i5 = i9;
        }
        if ((i2 & 3072) == 0) {
            i5 |= true != cavVarB.A(j2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i5 |= true != cavVarB.A(j3) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            i5 |= true != cavVarB.A(j4) ? 65536 : 131072;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= true != cavVarB.D(aonnVar) ? 524288 : 1048576;
        }
        if ((i2 & 12582912) == 0) {
            z2 = true;
            i5 |= true != cavVarB.B(dkzVar) ? 4194304 : 8388608;
        } else {
            z2 = true;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= z2 != cavVarB.D(aonnVar2) ? 33554432 : 67108864;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= true != cavVarB.B(dkzVar2) ? 268435456 : 536870912;
        }
        int i10 = i5;
        if ((i3 & 6) == 0) {
            z3 = true;
            i6 = i3 | (true != cavVarB.D(aomyVar) ? 2 : 4);
        } else {
            z3 = true;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            awhVar2 = awhVar;
            i6 |= z3 != cavVarB.B(awhVar2) ? 16 : 32;
        } else {
            awhVar2 = awhVar;
        }
        if ((i3 & 384) == 0) {
            i7 = i6 | (true == cavVarB.B(cmiVar) ? 256 : 128);
        } else {
            i7 = i6;
        }
        if ((i3 & 3072) == 0) {
            i7 |= true != cavVarB.z(i) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            z4 = true;
            i7 |= true != cavVarB.C(z) ? 8192 : 16384;
        } else {
            z4 = true;
        }
        if ((i3 & 196608) == 0) {
            i7 |= z4 != cavVarB.D(aonnVar3) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i7 |= true != cavVarB.D(aonnVar4) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            z5 = true;
            i7 |= true != cavVarB.y(f) ? 4194304 : 8388608;
        } else {
            z5 = true;
        }
        if ((100663296 & i3) == 0) {
            i7 |= z5 != cavVarB.B(ayyVar) ? 33554432 : 67108864;
        }
        if (cavVarB.H(((i10 & 306783379) == 306783378 && (38347923 & i7) == 38347922) ? false : true, i10 & 1)) {
            int i11 = i10 >> 12;
            int i12 = i10 >> 18;
            int i13 = i10 >> 9;
            int i14 = i7 & 14;
            boolean z10 = (i10 & 112) == 32 || ((i10 & 64) != 0 && cavVarB.B(bymVar));
            int i15 = i7 & 896;
            boolean z11 = (i7 & 112) == 32;
            boolean z12 = i15 == 256;
            boolean z13 = z10;
            boolean z14 = (i7 & 7168) == 2048;
            boolean z15 = (29360128 & i7) == 8388608;
            cbt cbtVar2 = (cbt) cavVarB;
            java.lang.Object objR = cbtVar2.R();
            if (((z13 | z11 | z12 | z14) || z15) || objR == cau.a) {
                cbtVar = cbtVar2;
                objR = new defpackage.bwn(bymVar, awhVar2, cmiVar, i, f, ayyVar);
                cbtVar.ab(objR);
            } else {
                cbtVar = cbtVar2;
            }
            defpackage.bwn bwnVar = (defpackage.bwn) objR;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVar);
            aomy aomyVar4 = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar4);
            } else {
                cavVarB.x();
            }
            aonn aonnVar9 = dam.e;
            cev.c(cavVarB, bwnVar, aonnVar9);
            aonn aonnVar10 = dam.d;
            cev.c(cavVarB, cjeVarAi, aonnVar10);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar11 = dam.f;
            cev.c(cavVarB, numValueOf, aonnVar11);
            aonj aonjVar2 = dam.g;
            cev.b(cavVarB, aonjVar2);
            aonn aonnVar12 = dam.c;
            cev.c(cavVarB, cmwVarM, aonnVar12);
            cmw cmwVarA = cmw.c;
            cmw cmwVarBa = den.ba(new defpackage.cxk("navigationIcon"), 4.0f, 0.0f, 0.0f, 0.0f);
            cmj cmjVar = cmh.a;
            cye cyeVarB = awo.b(cmjVar, false);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cavVarB, cmwVarBa);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar4);
            } else {
                cavVarB.x();
            }
            int i16 = i12 & 112;
            int i17 = i11 & 896;
            cev.c(cavVarB, cyeVarB, aonnVar9);
            cev.c(cavVarB, cjeVarAi2, aonnVar10);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar11);
            cev.b(cavVarB, aonjVar2);
            cev.c(cavVarB, cmwVarM2, aonnVar12);
            cbd cbdVar = boy.a;
            den.ab(cbdVar.b(new cqg(j)), aonnVar3, cavVarB, ((i7 >> 12) & 112) | 8);
            cbtVar.W(true);
            int i18 = (i13 & 14) | i16;
            if (aonnVar2 != null) {
                cavVarB.u(407505833);
                cmw cmwVarAZ = den.aZ(new defpackage.cxk("title"), 4.0f, 0.0f);
                if (z) {
                    cavVarB.u(407747292);
                    java.lang.Object objR2 = cbtVar.R();
                    if (objR2 == cau.a) {
                        objR2 = new defpackage.bcm(13);
                        cbtVar.ab(objR2);
                    }
                    cmwVarB = dig.a(cmwVarA, (aonj) objR2);
                    cbtVar.W(false);
                    z9 = true;
                } else {
                    cavVarB.u(407856846);
                    java.lang.Object objR3 = cbtVar.R();
                    if (objR3 == cau.a) {
                        objR3 = new defpackage.bcm(15);
                        cbtVar.ab(objR3);
                    }
                    cmwVarB = dig.b(cmwVarA, false, (aonj) objR3);
                    cbtVar.W(false);
                    z9 = false;
                }
                cmw cmwVarA2 = cmwVarAZ.a(cmwVarB);
                java.lang.Object objR4 = cbtVar.R();
                boolean z16 = z9;
                if (i14 == 4 || objR4 == cau.a) {
                    aomyVar2 = aomyVar;
                    objR4 = new defpackage.bln(aomyVar2, 14);
                    cbtVar.ab(objR4);
                } else {
                    aomyVar2 = aomyVar;
                }
                cmw cmwVarJ = cfd.J(cmwVarA2, (aonj) objR4);
                cye cyeVarA = aww.a(awi.c, cmiVar, cavVarB, (i15 >> 3) & 112);
                int iM3 = anty.M(cbtVar.x);
                cje cjeVarAi3 = cbtVar.ai();
                cmw cmwVarM3 = cfo.m(cavVarB, cmwVarJ);
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar4);
                } else {
                    cavVarB.x();
                }
                cev.c(cavVarB, cyeVarA, aonnVar9);
                cev.c(cavVarB, cjeVarAi3, aonnVar10);
                cev.c(cavVarB, java.lang.Integer.valueOf(iM3), aonnVar11);
                cev.b(cavVarB, aonjVar2);
                cev.c(cavVarB, cmwVarM3, aonnVar12);
                aonnVar6 = aonnVar10;
                aonnVar7 = aonnVar11;
                aomyVar3 = aomyVar4;
                cavVar2 = cavVarB;
                aonnVar8 = aonnVar9;
                den.af(j2, dkzVar, aonnVar, cavVar2, i18 | i17);
                den.af(j3, dkzVar2, aonnVar2, cavVar2, (i11 & 14) | ((i10 >> 24) & 112) | (i12 & 896));
                cbtVar.W(true);
                z8 = false;
                cbtVar.W(false);
                aonjVar = aonjVar2;
                z7 = z16;
            } else {
                aomyVar2 = aomyVar;
                aonnVar6 = aonnVar10;
                aonnVar7 = aonnVar11;
                aomyVar3 = aomyVar4;
                cavVar2 = cavVarB;
                aonnVar8 = aonnVar9;
                cavVar2.u(408669108);
                cmw cmwVarAZ2 = den.aZ(new defpackage.cxk("title"), 4.0f, 0.0f);
                if (z) {
                    cavVar2.u(-402448939);
                    java.lang.Object objR5 = cbtVar.R();
                    if (objR5 == cau.a) {
                        objR5 = new defpackage.bcm(17);
                        cbtVar.ab(objR5);
                    }
                    cmwVarA = dig.a(cmwVarA, (aonj) objR5);
                    cbtVar.W(false);
                    z7 = true;
                } else {
                    cavVar2.u(-402447002);
                    cbtVar.W(false);
                    z7 = false;
                }
                cmw cmwVarA3 = cmwVarAZ2.a(cmwVarA);
                java.lang.Object objR6 = cbtVar.R();
                if (i14 == 4 || objR6 == cau.a) {
                    objR6 = new defpackage.bln(aomyVar2, 16);
                    cbtVar.ab(objR6);
                }
                cmw cmwVarJ2 = cfd.J(cmwVarA3, (aonj) objR6);
                cye cyeVarB2 = awo.b(cmjVar, false);
                int iM4 = anty.M(cbtVar.x);
                cje cjeVarAi4 = cbtVar.ai();
                cmw cmwVarM4 = cfo.m(cavVar2, cmwVarJ2);
                cavVar2.v();
                if (cbtVar.w) {
                    cavVar2.j(aomyVar3);
                } else {
                    cavVar2.x();
                }
                cev.c(cavVar2, cyeVarB2, aonnVar8);
                cev.c(cavVar2, cjeVarAi4, aonnVar6);
                cev.c(cavVar2, java.lang.Integer.valueOf(iM4), aonnVar7);
                cev.b(cavVar2, aonjVar2);
                cev.c(cavVar2, cmwVarM4, aonnVar12);
                aonjVar = aonjVar2;
                den.af(j2, dkzVar, aonnVar, cavVar2, i18 | i17);
                cbtVar.W(true);
                z8 = false;
                cbtVar.W(false);
            }
            cmw cmwVarBa2 = den.ba(new defpackage.cxk("actionIcons"), 0.0f, 0.0f, 4.0f, 0.0f);
            cye cyeVarB3 = awo.b(cmjVar, z8);
            int iM5 = anty.M(cbtVar.x);
            cje cjeVarAi5 = cbtVar.ai();
            cmw cmwVarM5 = cfo.m(cavVar2, cmwVarBa2);
            cavVar2.v();
            if (cbtVar.w) {
                cavVar2.j(aomyVar3);
            } else {
                cavVar2.x();
            }
            cev.c(cavVar2, cyeVarB3, aonnVar8);
            cev.c(cavVar2, cjeVarAi5, aonnVar6);
            cev.c(cavVar2, java.lang.Integer.valueOf(iM5), aonnVar7);
            cev.b(cavVar2, aonjVar);
            cev.c(cavVar2, cmwVarM5, aonnVar12);
            j5 = j4;
            aonnVar5 = aonnVar4;
            den.ab(cbdVar.b(new cqg(j5)), aonnVar5, cavVar2, ((i7 >> 15) & 112) | 8);
            cbtVar.W(true);
            cbtVar.W(true);
            z6 = z7;
        } else {
            aonnVar5 = aonnVar4;
            cavVar2 = cavVarB;
            j5 = j4;
            aomyVar2 = aomyVar;
            cavVar2.s();
            z6 = z;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            final aonn aonnVar13 = aonnVar5;
            final aomy aomyVar5 = aomyVar2;
            final long j6 = j5;
            cdkVarI.c = new aonn() { // from class: bmr
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    cmw cmwVar2 = cmwVar;
                    defpackage.bym bymVar2 = bymVar;
                    long j7 = j;
                    long j8 = j2;
                    long j9 = j3;
                    long j10 = j6;
                    aonn aonnVar14 = aonnVar;
                    dkz dkzVar3 = dkzVar;
                    aonn aonnVar15 = aonnVar2;
                    dkz dkzVar4 = dkzVar2;
                    aomy aomyVar6 = aomyVar5;
                    awh awhVar3 = awhVar;
                    cmi cmiVar2 = cmiVar;
                    int i19 = i;
                    boolean z17 = z6;
                    int i20 = i2;
                    aonn aonnVar16 = aonnVar3;
                    int i21 = i3;
                    int i22 = i20 | 1;
                    int i23 = i21 & 306783378;
                    int i24 = i22 & 306783378;
                    int i25 = i24 << 1;
                    float f2 = f;
                    int i26 = i21 & 613566756;
                    int i27 = i22 & 613566756;
                    ayy ayyVar2 = ayyVar;
                    defpackage.bmz.a(cmwVar2, bymVar2, j7, j8, j9, j10, aonnVar14, dkzVar3, aonnVar15, dkzVar4, aomyVar6, awhVar3, cmiVar2, i19, z17, aonnVar16, aonnVar13, f2, ayyVar2, (cav) obj, (i22 & (-920350135)) | i24 | (i27 >> 1) | (i25 & i27), (i21 & (-920350135)) | i23 | (i26 >> 1) | ((i23 << 1) & i26));
                    return aojh.a;
                }
            };
        }
    }

    public static /* synthetic */ aojh b(aono aonoVar, cav cavVar, int i) {
        if (cavVar.H((i & 3) != 2, i & 1)) {
            awa awaVar = awi.b;
            cmn cmnVar = cmh.n;
            cmt cmtVar = cmw.c;
            cye cyeVarA = azh.a(awaVar, cmnVar, cavVar, 54);
            int iM = anty.M(cavVar.a());
            cje cjeVarM = cavVar.M();
            cmw cmwVarM = cfo.m(cavVar, cmtVar);
            aomy aomyVar = dam.a;
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar);
            } else {
                cavVar.x();
            }
            cev.c(cavVar, cyeVarA, dam.e);
            cev.c(cavVar, cjeVarM, dam.d);
            cev.c(cavVar, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVar, dam.g);
            cev.c(cavVar, cmwVarM, dam.c);
            aonoVar.a(azk.a, cavVar, 6);
            cavVar.n();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }

    public static final void c(cmw cmwVar, long j, long j2, float f, ayy ayyVar, azz azzVar, aono aonoVar, cav cavVar, int i) {
        int i2;
        aono aonoVar2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1562683362);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.A(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.A(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.y(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(ayyVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B(azzVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B((java.lang.Object) null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            aonoVar2 = aonoVar;
            i2 |= true != cavVarB.D(aonoVar2) ? 4194304 : 8388608;
        } else {
            aonoVar2 = aonoVar;
        }
        if (cavVarB.H((4793491 & i2) != 4793490, i2 & 1)) {
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            int i4 = i2 << 6;
            cavVar2 = cavVarB;
            f(awi.a, cmwVar, j, j2, f, ayyVar, azzVar, aonoVar2, cavVar2, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192));
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bwe(cmwVar, j, j2, f, ayyVar, azzVar, aonoVar, i, 1);
        }
    }

    public static final void d(aonn aonnVar, cmw cmwVar, aonn aonnVar2, aono aonoVar, cmi cmiVar, float f, float f2, azz azzVar, defpackage.bwk bwkVar, cav cavVar, int i, int i2) {
        int i3;
        aonn aonnVar3;
        aono aonoVar2;
        cmi cmiVar2;
        defpackage.bwk bwkVar2;
        int i4;
        cav cavVar2;
        float f3;
        float f4;
        int i5 = i & 6;
        cav cavVarB = cavVar.b(-1895470263);
        if (i5 == 0) {
            i3 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.D((java.lang.Object) null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            aonnVar3 = aonnVar2;
            i3 |= true != cavVarB.D(aonnVar3) ? 1024 : 2048;
        } else {
            aonnVar3 = aonnVar2;
        }
        if ((i & 24576) == 0) {
            aonoVar2 = aonoVar;
            i3 |= true != cavVarB.D(aonoVar2) ? 8192 : 16384;
        } else {
            aonoVar2 = aonoVar;
        }
        if ((196608 & i) == 0) {
            cmiVar2 = cmiVar;
            i3 |= true != cavVarB.B(cmiVar2) ? 65536 : 131072;
        } else {
            cmiVar2 = cmiVar;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.y(f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.y(f2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.B(azzVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            bwkVar2 = bwkVar;
            i3 |= true != cavVarB.B(bwkVar2) ? 268435456 : 536870912;
        } else {
            bwkVar2 = bwkVar;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cavVarB.B((java.lang.Object) null) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (cavVarB.H(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            int i6 = i3;
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            dkz dkzVarB = bwp.b(7, cavVarB);
            dkz dkzVarB2 = bwp.b(12, cavVarB);
            aonn aonnVar4 = defpackage.bou.a;
            dkz dkzVarB3 = bwp.b(9, cavVarB);
            aonn aonnVar5 = defpackage.bou.b;
            dkz dkzVarB4 = bwp.b(10, cavVarB);
            if (dpi.c(f, Float.NaN) || dpi.c(f, Float.POSITIVE_INFINITY)) {
                ayy ayyVar = defpackage.bwl.a;
                f3 = defpackage.bwl.c;
            } else {
                f3 = f;
            }
            if (dpi.c(f2, Float.NaN) || dpi.c(f2, Float.POSITIVE_INFINITY)) {
                ayy ayyVar2 = defpackage.bwl.a;
                f4 = defpackage.bwl.d;
            } else {
                f4 = f2;
            }
            int i7 = i6 >> 6;
            int i8 = i6 >> 9;
            cavVar2 = cavVarB;
            i(cmwVar, aonnVar, dkzVarB, aonnVar, dkzVarB2, aonnVar4, dkzVarB3, aonnVar5, dkzVarB4, cmiVar2, aonnVar3, aonoVar2, f3, f4, azzVar, bwkVar2, cavVar2, ((i6 >> 3) & 14) | ((i6 << 3) & 112) | ((i6 << 12) & 57344), ((i6 >> 15) & 14) | (i7 & 112) | (i7 & 896) | (i8 & 458752) | (i8 & 3670016) | ((i4 << 21) & 29360128));
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpf(aonnVar, cmwVar, aonnVar2, aonoVar, cmiVar, f, f2, azzVar, bwkVar, i, i2, 1);
        }
    }

    public static final void e(final cmw cmwVar, final aonn aonnVar, final dkz dkzVar, final dkz dkzVar2, final cmi cmiVar, final aonn aonnVar2, final aono aonoVar, final float f, final ayy ayyVar, final azz azzVar, final defpackage.bwk bwkVar, cav cavVar, final int i, final int i2) {
        int i3;
        aonn aonnVar3;
        float f2;
        int i4;
        int i5 = i & 6;
        cbt cbtVarB = cavVar.b(703932376);
        if (i5 == 0) {
            i3 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cbtVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cbtVarB.B(dkzVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cbtVarB.D((java.lang.Object) null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cbtVarB.B(dkzVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cbtVarB.B(cmiVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            aonnVar3 = aonnVar2;
            i3 |= true != cbtVarB.D(aonnVar3) ? 524288 : 1048576;
        } else {
            aonnVar3 = aonnVar2;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cbtVarB.D(aonoVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= true != cbtVarB.y(f2) ? 33554432 : 67108864;
        } else {
            f2 = f;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cbtVarB.B(ayyVar) ? 268435456 : 536870912;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cbtVarB.B(azzVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cbtVarB.B(bwkVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != cbtVarB.B((java.lang.Object) null) ? 128 : 256;
        }
        if (!cbtVarB.H(((i6 & 306783379) == 306783378 && (i4 & 147) == 146) ? false : true, i6 & 1)) {
            cbtVarB.s();
        } else {
            if (java.lang.Float.isNaN(f2) || (java.lang.Float.floatToRawIntBits(f2) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                throw new java.lang.IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            boolean z = (i4 & 112) == 32;
            int i7 = i4 & 896;
            boolean z2 = i7 == 256;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if ((z | z2) || objR == cau.a) {
                defpackage.bmx bmxVar = new defpackage.bmx(bwkVar, 0);
                ajxw ajxwVar = ceo.a;
                objR = new cbk(bmxVar, (cen) null);
                cbtVar.ab(objR);
            }
            cer cerVarA = defpackage.ahp.a(a.F((cer) objR), den.ai(3, cbtVarB), cbtVarB, 0, 12);
            cja cjaVarJ = cfo.j(1222546095, new axo(aonoVar, 13), cbtVarB);
            cbtVarB.u(-1473335574);
            cbtVar.W(false);
            cmt cmtVar = cmw.c;
            boolean zB = cbtVarB.B(cerVarA);
            java.lang.Object objR2 = cbtVar.R();
            if (zB || objR2 == cau.a) {
                objR2 = new defpackage.bln(cerVarA, 12);
                cbtVar.ab(objR2);
            }
            cmw cmwVarK = ru.k(cmtVar, (aonj) objR2);
            java.lang.Object objR3 = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR3 == obj) {
                objR3 = new defpackage.bcm(14);
                cbtVar.ab(objR3);
            }
            cmw cmwVarB = dig.b(cmwVarK, false, (aonj) objR3);
            aojh aojhVar = aojh.a;
            java.lang.Object objR4 = cbtVar.R();
            if (objR4 == obj) {
                objR4 = defpackage.bmy.b;
                cbtVar.ab(objR4);
            }
            cmw cmwVarA = cvy.a(cmwVarB, aojhVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR4);
            cye cyeVarB = awo.b(cmh.a, false);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarA);
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
            cmw cmwVarK2 = cfd.K(uu.m(cmtVar, azzVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (crd) null, true, 0, 1044479);
            java.lang.Object objR5 = cbtVar.R();
            if (i7 == 256 || objR5 == obj) {
                objR5 = new defpackage.bmu(1);
                cbtVar.ab(objR5);
            }
            long j = bwkVar.c;
            long j2 = bwkVar.d;
            long j3 = bwkVar.e;
            long j4 = bwkVar.f;
            defpackage.bym bymVar = (defpackage.bym) objR5;
            awb awbVar = awi.e;
            java.lang.Object objR6 = cbtVar.R();
            if (objR6 == obj) {
                objR6 = new defpackage.bmt(1);
                cbtVar.ab(objR6);
            }
            int i8 = i6 >> 3;
            a(cmwVarK2, bymVar, j, j2, j4, j3, aonnVar, dkzVar, null, dkzVar2, (aomy) objR6, awbVar, cmiVar, 0, false, aonnVar3, cjaVarJ, f, ayyVar, cbtVarB, (i6 << 15) & 2146959360, ((i6 >> 9) & 896) | 1600566 | (i8 & 458752) | (i8 & 29360128) | (i8 & 234881024));
            cbtVar.W(true);
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: bms
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).intValue();
                    cmw cmwVar2 = cmwVar;
                    aonn aonnVar4 = aonnVar;
                    dkz dkzVar3 = dkzVar;
                    dkz dkzVar4 = dkzVar2;
                    cmi cmiVar2 = cmiVar;
                    aonn aonnVar5 = aonnVar2;
                    aono aonoVar2 = aonoVar;
                    int i9 = i;
                    float f3 = f;
                    int i10 = i2;
                    int i11 = i9 | 1;
                    int i12 = i10 & 306783378;
                    int i13 = 306783378 & i11;
                    int i14 = i13 << 1;
                    azz azzVar2 = azzVar;
                    int i15 = i10 & 613566756;
                    int i16 = i11 & 613566756;
                    defpackage.bwk bwkVar2 = bwkVar;
                    defpackage.bmz.e(cmwVar2, aonnVar4, dkzVar3, dkzVar4, cmiVar2, aonnVar5, aonoVar2, f3, ayyVar, azzVar2, bwkVar2, (cav) obj2, (i11 & (-920350135)) | i13 | (i16 >> 1) | (i14 & i16), (i10 & (-920350135)) | i12 | (i15 >> 1) | ((i12 << 1) & i15));
                    return aojh.a;
                }
            };
        }
    }

    public static final void f(awa awaVar, cmw cmwVar, long j, long j2, float f, ayy ayyVar, azz azzVar, aono aonoVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-141162176);
        if (i3 == 0) {
            i2 = (true != cavVarB.y(80.0f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(awaVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.A(j) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.A(j2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.y(f) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(ayyVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.B(azzVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cavVarB.B((java.lang.Object) null) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 268435456 : 536870912;
        }
        if (cavVarB.H((306783379 & i2) != 306783378, i2 & 1)) {
            a.y(defpackage.ro.s(false, cavVarB));
            cavVarB.u(-588035454);
            cbt cbtVar = (cbt) cavVarB;
            cbtVar.W(false);
            cmt cmtVar = cmw.c;
            crd crdVarB = btj.b(13, cavVarB);
            boolean zB = cavVarB.B((java.lang.Object) null);
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == cau.a) {
                objR = new bmq(0);
                cbtVar.ab(objR);
            }
            cavVar2 = cavVarB;
            bvo.b(den.C(cmwVar, (aono) objR).a(cmtVar), crdVarB, j, j2, f, 0.0f, (amu) null, cfo.j(1054101083, new defpackage.bit(azzVar, ayyVar, awaVar, aonoVar, 2), cavVarB), cavVar2, 96);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bwr(awaVar, cmwVar, j, j2, f, ayyVar, azzVar, aonoVar, i, 1);
        }
    }

    public static final void g(aonn aonnVar, cmw cmwVar, aonn aonnVar2, aono aonoVar, float f, azz azzVar, defpackage.bwk bwkVar, ayy ayyVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        ayy ayyVar2;
        ayy ayyVar3;
        float f2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-1109867978);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonnVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.y(f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B(azzVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(bwkVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.B((java.lang.Object) null) ? 4194304 : 8388608;
        }
        int i4 = i2 | 100663296;
        if (cavVarB.H((38347923 & i4) != 38347922, i4 & 1)) {
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cavVarB.E()) {
                ayy ayyVar4 = defpackage.bwl.a;
                ayyVar3 = defpackage.bwl.a;
            } else {
                cavVarB.s();
                ayyVar3 = ayyVar;
            }
            cavVarB.l();
            dkz dkzVarB = bwp.b(12, cavVarB);
            dkz dkzVar = dkz.a;
            cmi cmiVar = cmh.k;
            if (dpi.c(f, Float.NaN) || dpi.c(f, Float.POSITIVE_INFINITY)) {
                ayy ayyVar5 = defpackage.bwl.a;
                f2 = defpackage.bwl.b;
            } else {
                f2 = f;
            }
            int i5 = i4 << 3;
            int i6 = i4 << 12;
            cavVar2 = cavVarB;
            e(cmwVar, aonnVar, dkzVarB, dkzVar, cmiVar, aonnVar2, aonoVar, f2, ayyVar3, azzVar, bwkVar, cavVar2, ((i4 >> 3) & 14) | 224256 | (i5 & 112) | (i6 & 3670016) | (i6 & 29360128) | (i5 & 1879048192), (i4 >> 15) & 1022);
            ayyVar2 = ayyVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            ayyVar2 = ayyVar;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bmw(aonnVar, cmwVar, aonnVar2, aonoVar, f, azzVar, bwkVar, ayyVar2, i, 1);
        }
    }

    public static final void h(aonn aonnVar, cmw cmwVar, aonn aonnVar2, aono aonoVar, float f, azz azzVar, defpackage.bwk bwkVar, ayy ayyVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        ayy ayyVar2;
        ayy ayyVar3;
        float f2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(660588393);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonnVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.y(f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B(azzVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(bwkVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.B((java.lang.Object) null) ? 4194304 : 8388608;
        }
        int i4 = i2 | 100663296;
        if (cavVarB.H((38347923 & i4) != 38347922, i4 & 1)) {
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cavVarB.E()) {
                ayy ayyVar4 = defpackage.bwl.a;
                ayyVar3 = defpackage.bwl.a;
            } else {
                cavVarB.s();
                ayyVar3 = ayyVar;
            }
            cavVarB.l();
            dkz dkzVarB = bwp.b(12, cavVarB);
            dkz dkzVar = dkz.a;
            cmi cmiVar = cmh.j;
            if (dpi.c(f, Float.NaN) || dpi.c(f, Float.POSITIVE_INFINITY)) {
                ayy ayyVar5 = defpackage.bwl.a;
                f2 = defpackage.bwl.b;
            } else {
                f2 = f;
            }
            int i5 = i4 << 3;
            int i6 = i4 << 12;
            cavVar2 = cavVarB;
            e(cmwVar, aonnVar, dkzVarB, dkzVar, cmiVar, aonnVar2, aonoVar, f2, ayyVar3, azzVar, bwkVar, cavVar2, ((i4 >> 3) & 14) | 224256 | (i5 & 112) | (i6 & 3670016) | (i6 & 29360128) | (i5 & 1879048192), (i4 >> 15) & 1022);
            ayyVar2 = ayyVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            ayyVar2 = ayyVar;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bmw(aonnVar, cmwVar, aonnVar2, aonoVar, f, azzVar, bwkVar, ayyVar2, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0237  */
    /* JADX WARN: Code duplicated, block: B:174:0x0253  */
    /* JADX WARN: Code duplicated, block: B:179:0x0271  */
    /* JADX WARN: Code duplicated, block: B:184:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:190:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:193:0x030a  */
    /* JADX WARN: Code duplicated, block: B:194:0x030e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0350  */
    /* JADX WARN: Code duplicated, block: B:198:0x0354  */
    /* JADX WARN: Code duplicated, block: B:201:0x038b  */
    /* JADX WARN: Code duplicated, block: B:205:0x041f  */
    public static final void i(final cmw cmwVar, final aonn aonnVar, final dkz dkzVar, final aonn aonnVar2, final dkz dkzVar2, final aonn aonnVar3, final dkz dkzVar3, final aonn aonnVar4, final dkz dkzVar4, final cmi cmiVar, final aonn aonnVar5, final aono aonoVar, final float f, final float f2, final azz azzVar, final defpackage.bwk bwkVar, cav cavVar, final int i, final int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        cav cavVar2;
        int i6;
        aomy aomyVar;
        boolean zB;
        java.lang.Object objR;
        boolean zB2;
        java.lang.Object objR2;
        boolean zB3;
        java.lang.Object objR3;
        boolean zB4;
        java.lang.Object objR4;
        java.lang.Object objR5;
        java.lang.Object obj;
        java.lang.Object objR6;
        aomy aomyVar2;
        java.lang.Object objR7;
        java.lang.Object objR8;
        int i7 = i & 6;
        cav cavVarB = cavVar.b(1092180406);
        if (i7 == 0) {
            i3 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(dkzVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.y(24.0f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.D(aonnVar2) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != cavVarB.B(dkzVar2) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i3 |= true != cavVarB.D(aonnVar3) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            z = true;
            i3 |= true != cavVarB.B(dkzVar3) ? 4194304 : 8388608;
        } else {
            z = true;
        }
        if ((i & 100663296) == 0) {
            i3 |= z != cavVarB.D(aonnVar4) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            i3 |= true != cavVarB.B(dkzVar4) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            z2 = true;
            i4 = (true != cavVarB.B(cmiVar) ? 2 : 4) | i2;
        } else {
            z2 = true;
            i4 = i2;
        }
        int i8 = i4;
        if ((i2 & 48) == 0) {
            i5 = i8 | (z2 != cavVarB.D(aonnVar5) ? 16 : 32);
        } else {
            i5 = i8;
        }
        if ((i2 & 384) == 0) {
            z3 = true;
            i5 |= true == cavVarB.D(aonoVar) ? 256 : 128;
        } else {
            z3 = true;
        }
        if ((i2 & 3072) == 0) {
            i5 |= z3 == cavVarB.y(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= z3 != cavVarB.y(f2) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            i5 |= z3 != cavVarB.B(azzVar) ? 65536 : 131072;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= z3 != cavVarB.B(bwkVar) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i5 |= true != cavVarB.B((java.lang.Object) null) ? 4194304 : 8388608;
        }
        if (!cavVarB.H(((306783379 & i3) == 306783378 && (4793491 & i5) == 4793490) ? false : true, i3 & 1)) {
            cavVar2 = cavVarB;
            cavVar2.s();
        } else {
            if (java.lang.Float.isNaN(f) || (java.lang.Float.floatToRawIntBits(f) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                throw new java.lang.IllegalArgumentException("The collapsedHeight is expected to be specified and finite");
            }
            if (java.lang.Float.isNaN(f2) || (java.lang.Float.floatToRawIntBits(f2) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                throw new java.lang.IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            if (dpi.a(f2, f) < 0) {
                throw new java.lang.IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight");
            }
            int iDp = ((dpf) cavVarB.e(dfo.e)).dp(24.0f);
            int i9 = 29360128 & i5;
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR9 = cbtVar.R();
            if (i9 == 8388608 || objR9 == cau.a) {
                objR9 = new defpackage.bmt(0);
                cbtVar.ab(objR9);
            }
            aomy aomyVar3 = (aomy) objR9;
            boolean zB5 = ((3670016 & i5) == 1048576) | cavVarB.B(aomyVar3);
            java.lang.Object objR10 = cbtVar.R();
            if (zB5) {
                i6 = i5;
            } else {
                i6 = i5;
                if (objR10 == cau.a) {
                }
                aomyVar = (aomy) objR10;
                cja cjaVarJ = cfo.j(1206534349, new axo(aonoVar, 14), cavVarB);
                zB = cavVarB.B(aomyVar3);
                objR = cbtVar.R();
                if (zB || objR == cau.a) {
                    objR = new defpackage.bll(aomyVar3, 9);
                    cbtVar.ab(objR);
                }
                aomy aomyVar4 = (aomy) objR;
                zB2 = cavVarB.B(aomyVar3);
                objR2 = cbtVar.R();
                if (zB2 || objR2 == cau.a) {
                    objR2 = new defpackage.bll(aomyVar3, 10);
                    cbtVar.ab(objR2);
                }
                aomy aomyVar5 = (aomy) objR2;
                zB3 = cavVarB.B(aomyVar3);
                objR3 = cbtVar.R();
                if (zB3 || objR3 == cau.a) {
                    defpackage.bll bllVar = new defpackage.bll(aomyVar3, 11);
                    ajxw ajxwVar = ceo.a;
                    cbk cbkVar = new cbk(bllVar, (cen) null);
                    cbtVar.ab(cbkVar);
                    objR3 = cbkVar;
                }
                cer cerVar = (cer) objR3;
                boolean z4 = !a.y(cerVar);
                cavVarB.u(-1522488724);
                cbtVar.W(false);
                cmt cmtVar = cmw.c;
                zB4 = cavVarB.B(aomyVar);
                objR4 = cbtVar.R();
                if (zB4 || objR4 == cau.a) {
                    objR4 = new defpackage.bln(aomyVar, 15);
                    cbtVar.ab(objR4);
                }
                cmw cmwVarK = ru.k(cmtVar, (aonj) objR4);
                objR5 = cbtVar.R();
                obj = cau.a;
                if (objR5 == obj) {
                    objR5 = new defpackage.bcm(16);
                    cbtVar.ab(objR5);
                }
                cmw cmwVarB = dig.b(cmwVarK, false, (aonj) objR5);
                aojh aojhVar = aojh.a;
                objR6 = cbtVar.R();
                if (objR6 == obj) {
                    objR6 = defpackage.bmy.a;
                    cbtVar.ab(objR6);
                }
                cmw cmwVarA = cvy.a(cmwVarB, aojhVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR6);
                cye cyeVarB = awo.b(cmh.a, false);
                int i10 = i3;
                int iM = anty.M(cbtVar.x);
                cje cjeVarAi = cbtVar.ai();
                cmw cmwVarM = cfo.m(cavVarB, cmwVarA);
                aomyVar2 = dam.a;
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar2);
                } else {
                    cavVarB.x();
                }
                aonn aonnVar6 = dam.e;
                cev.c(cavVarB, cyeVarB, aonnVar6);
                aonn aonnVar7 = dam.d;
                cev.c(cavVarB, cjeVarAi, aonnVar7);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                aonn aonnVar8 = dam.f;
                cev.c(cavVarB, numValueOf, aonnVar8);
                aonj aonjVar = dam.g;
                cev.b(cavVarB, aonjVar);
                aonn aonnVar9 = dam.c;
                cev.c(cavVarB, cmwVarM, aonnVar9);
                cye cyeVarA = aww.a(awi.c, cmh.j, cavVarB, 0);
                int iM2 = anty.M(cbtVar.x);
                cje cjeVarAi2 = cbtVar.ai();
                cmw cmwVarM2 = cfo.m(cavVarB, cmtVar);
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar2);
                } else {
                    cavVarB.x();
                }
                cev.c(cavVarB, cyeVarA, aonnVar6);
                cev.c(cavVarB, cjeVarAi2, aonnVar7);
                cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar8);
                cev.b(cavVarB, aonjVar);
                cev.c(cavVarB, cmwVarM2, aonnVar9);
                cmw cmwVarK2 = cfd.K(uu.m(cmtVar, azzVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (crd) null, true, 0, 1044479);
                objR7 = cbtVar.R();
                if (objR7 == obj) {
                    objR7 = new defpackage.bmu(0);
                    cbtVar.ab(objR7);
                }
                long j = bwkVar.c;
                long j2 = bwkVar.d;
                long j3 = bwkVar.e;
                cavVar2 = cavVarB;
                long j4 = bwkVar.f;
                defpackage.bym bymVar = (defpackage.bym) objR7;
                awb awbVar = awi.e;
                boolean zY = a.y(cerVar);
                ayy ayyVar = defpackage.bwl.a;
                int i11 = i10 << 6;
                int i12 = i6 << 6;
                int i13 = i6 << 12;
                int i14 = i12 & 896;
                ayy ayyVar2 = defpackage.bwl.a;
                a(cmwVarK2, bymVar, j, j2, j4, j3, aonnVar2, dkzVar2, aonnVar4, dkzVar4, aomyVar4, awbVar, cmiVar, 0, zY, aonnVar5, cjaVarJ, f, ayyVar2, cavVar2, (i11 & 33030144) | (i10 & 234881024) | (i10 & 1879048192), i14 | 102239280 | (i13 & 458752) | (i13 & 29360128));
                cmw cmwVarK3 = cfd.K(uu.m(cmtVar, new defpackage.ayn(azzVar, 15)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (crd) null, true, 0, 1044479);
                objR8 = cbtVar.R();
                if (i9 != 8388608 || objR8 == obj) {
                    objR8 = new defpackage.bmu(2);
                    cbtVar.ab(objR8);
                }
                a(cmwVarK3, (defpackage.bym) objR8, j, j2, j4, j3, aonnVar, dkzVar, aonnVar3, dkzVar3, aomyVar5, awi.d, cmiVar, iDp, z4, defpackage.bou.c, defpackage.bou.d, (f2 - f) + 0.0f, ayyVar2, cavVar2, ((i10 << 15) & 33030144) | (234881024 & i11) | (i11 & 1879048192), i14 | 102432816);
                cbtVar.W(true);
                cbtVar.W(true);
            }
            objR10 = new defpackage.jll(bwkVar, aomyVar3, 1);
            cbtVar.ab(objR10);
            aomyVar = (aomy) objR10;
            cja cjaVarJ2 = cfo.j(1206534349, new axo(aonoVar, 14), cavVarB);
            zB = cavVarB.B(aomyVar3);
            objR = cbtVar.R();
            if (zB) {
                objR = new defpackage.bll(aomyVar3, 9);
                cbtVar.ab(objR);
            } else {
                objR = new defpackage.bll(aomyVar3, 9);
                cbtVar.ab(objR);
            }
            aomy aomyVar6 = (aomy) objR;
            zB2 = cavVarB.B(aomyVar3);
            objR2 = cbtVar.R();
            if (zB2) {
                objR2 = new defpackage.bll(aomyVar3, 10);
                cbtVar.ab(objR2);
            } else {
                objR2 = new defpackage.bll(aomyVar3, 10);
                cbtVar.ab(objR2);
            }
            aomy aomyVar7 = (aomy) objR2;
            zB3 = cavVarB.B(aomyVar3);
            objR3 = cbtVar.R();
            if (zB3) {
                defpackage.bll bllVar2 = new defpackage.bll(aomyVar3, 11);
                ajxw ajxwVar2 = ceo.a;
                cbk cbkVar2 = new cbk(bllVar2, (cen) null);
                cbtVar.ab(cbkVar2);
                objR3 = cbkVar2;
            } else {
                defpackage.bll bllVar3 = new defpackage.bll(aomyVar3, 11);
                ajxw ajxwVar3 = ceo.a;
                cbk cbkVar3 = new cbk(bllVar3, (cen) null);
                cbtVar.ab(cbkVar3);
                objR3 = cbkVar3;
            }
            cer cerVar2 = (cer) objR3;
            boolean z5 = !a.y(cerVar2);
            cavVarB.u(-1522488724);
            cbtVar.W(false);
            cmt cmtVar2 = cmw.c;
            zB4 = cavVarB.B(aomyVar);
            objR4 = cbtVar.R();
            if (zB4) {
                objR4 = new defpackage.bln(aomyVar, 15);
                cbtVar.ab(objR4);
            } else {
                objR4 = new defpackage.bln(aomyVar, 15);
                cbtVar.ab(objR4);
            }
            cmw cmwVarK4 = ru.k(cmtVar2, (aonj) objR4);
            objR5 = cbtVar.R();
            obj = cau.a;
            if (objR5 == obj) {
                objR5 = new defpackage.bcm(16);
                cbtVar.ab(objR5);
            }
            cmw cmwVarB2 = dig.b(cmwVarK4, false, (aonj) objR5);
            aojh aojhVar2 = aojh.a;
            objR6 = cbtVar.R();
            if (objR6 == obj) {
                objR6 = defpackage.bmy.a;
                cbtVar.ab(objR6);
            }
            cmw cmwVarA2 = cvy.a(cmwVarB2, aojhVar2, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR6);
            cye cyeVarB2 = awo.b(cmh.a, false);
            int i15 = i3;
            int iM3 = anty.M(cbtVar.x);
            cje cjeVarAi3 = cbtVar.ai();
            cmw cmwVarM3 = cfo.m(cavVarB, cmwVarA2);
            aomyVar2 = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            aonn aonnVar10 = dam.e;
            cev.c(cavVarB, cyeVarB2, aonnVar10);
            aonn aonnVar11 = dam.d;
            cev.c(cavVarB, cjeVarAi3, aonnVar11);
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iM3);
            aonn aonnVar12 = dam.f;
            cev.c(cavVarB, numValueOf2, aonnVar12);
            aonj aonjVar2 = dam.g;
            cev.b(cavVarB, aonjVar2);
            aonn aonnVar13 = dam.c;
            cev.c(cavVarB, cmwVarM3, aonnVar13);
            cye cyeVarA2 = aww.a(awi.c, cmh.j, cavVarB, 0);
            int iM4 = anty.M(cbtVar.x);
            cje cjeVarAi4 = cbtVar.ai();
            cmw cmwVarM4 = cfo.m(cavVarB, cmtVar2);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            cev.c(cavVarB, cyeVarA2, aonnVar10);
            cev.c(cavVarB, cjeVarAi4, aonnVar11);
            cev.c(cavVarB, java.lang.Integer.valueOf(iM4), aonnVar12);
            cev.b(cavVarB, aonjVar2);
            cev.c(cavVarB, cmwVarM4, aonnVar13);
            cmw cmwVarK5 = cfd.K(uu.m(cmtVar2, azzVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (crd) null, true, 0, 1044479);
            objR7 = cbtVar.R();
            if (objR7 == obj) {
                objR7 = new defpackage.bmu(0);
                cbtVar.ab(objR7);
            }
            long j5 = bwkVar.c;
            long j6 = bwkVar.d;
            long j7 = bwkVar.e;
            cavVar2 = cavVarB;
            long j8 = bwkVar.f;
            defpackage.bym bymVar2 = (defpackage.bym) objR7;
            awb awbVar2 = awi.e;
            boolean zY2 = a.y(cerVar2);
            ayy ayyVar3 = defpackage.bwl.a;
            int i16 = i15 << 6;
            int i17 = i6 << 6;
            int i18 = i6 << 12;
            int i19 = i17 & 896;
            ayy ayyVar4 = defpackage.bwl.a;
            a(cmwVarK5, bymVar2, j5, j6, j8, j7, aonnVar2, dkzVar2, aonnVar4, dkzVar4, aomyVar6, awbVar2, cmiVar, 0, zY2, aonnVar5, cjaVarJ2, f, ayyVar4, cavVar2, (i16 & 33030144) | (i15 & 234881024) | (i15 & 1879048192), i19 | 102239280 | (i18 & 458752) | (i18 & 29360128));
            cmw cmwVarK6 = cfd.K(uu.m(cmtVar2, new defpackage.ayn(azzVar, 15)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (crd) null, true, 0, 1044479);
            objR8 = cbtVar.R();
            if (i9 != 8388608) {
                objR8 = new defpackage.bmu(2);
                cbtVar.ab(objR8);
            } else {
                objR8 = new defpackage.bmu(2);
                cbtVar.ab(objR8);
            }
            a(cmwVarK6, (defpackage.bym) objR8, j5, j6, j8, j7, aonnVar, dkzVar, aonnVar3, dkzVar3, aomyVar7, awi.d, cmiVar, iDp, z5, defpackage.bou.c, defpackage.bou.d, (f2 - f) + 0.0f, ayyVar4, cavVar2, ((i15 << 15) & 33030144) | (234881024 & i16) | (i16 & 1879048192), i19 | 102432816);
            cbtVar.W(true);
            cbtVar.W(true);
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: bmv
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).intValue();
                    cmw cmwVar2 = cmwVar;
                    aonn aonnVar14 = aonnVar;
                    dkz dkzVar5 = dkzVar;
                    aonn aonnVar15 = aonnVar2;
                    dkz dkzVar6 = dkzVar2;
                    aonn aonnVar16 = aonnVar3;
                    dkz dkzVar7 = dkzVar3;
                    aonn aonnVar17 = aonnVar4;
                    dkz dkzVar8 = dkzVar4;
                    cmi cmiVar2 = cmiVar;
                    aonn aonnVar18 = aonnVar5;
                    aono aonoVar2 = aonoVar;
                    int i20 = i;
                    float f3 = f;
                    int i21 = i2;
                    int i22 = i20 | 1;
                    int i23 = i21 & 306783378;
                    int i24 = i22 & 306783378;
                    int i25 = i24 << 1;
                    azz azzVar2 = azzVar;
                    int i26 = i21 & 613566756;
                    int i27 = i22 & 613566756;
                    defpackage.bwk bwkVar2 = bwkVar;
                    defpackage.bmz.i(cmwVar2, aonnVar14, dkzVar5, aonnVar15, dkzVar6, aonnVar16, dkzVar7, aonnVar17, dkzVar8, cmiVar2, aonnVar18, aonoVar2, f3, f2, azzVar2, bwkVar2, (cav) obj2, (i22 & (-920350135)) | i24 | (i27 >> 1) | (i25 & i27), (i21 & (-920350135)) | i23 | (i26 >> 1) | ((i23 << 1) & i26));
                    return aojh.a;
                }
            };
        }
    }
}
