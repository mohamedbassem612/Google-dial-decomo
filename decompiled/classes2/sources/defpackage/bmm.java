package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bmm {
    public static final ayy a = den.bc(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final ayy b = den.bc(0.0f, 0.0f, 0.0f, 16.0f, 7);

    public static final void a(aomy aomyVar, aonn aonnVar, cmw cmwVar, final aonn aonnVar2, final aonn aonnVar3, aonn aonnVar4, aonn aonnVar5, crd crdVar, final long j, final long j2, final long j3, final long j4, float f, defpackage.drh drhVar, cav cavVar, int i, int i2) {
        int i3;
        aonn aonnVar6;
        aonn aonnVar7;
        aonn aonnVar8;
        crd crdVar2;
        int i4;
        float f2;
        defpackage.drh drhVar2;
        int i5 = i & 6;
        cav cavVarB = cavVar.b(-867616355);
        if (i5 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            aonnVar6 = aonnVar;
            i3 |= true != cavVarB.D(aonnVar6) ? 16 : 32;
        } else {
            aonnVar6 = aonnVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.D(aonnVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.D(aonnVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            aonnVar7 = aonnVar4;
            i3 |= true != cavVarB.D(aonnVar7) ? 65536 : 131072;
        } else {
            aonnVar7 = aonnVar4;
        }
        if ((1572864 & i) == 0) {
            aonnVar8 = aonnVar5;
            i3 |= true != cavVarB.D(aonnVar8) ? 524288 : 1048576;
        } else {
            aonnVar8 = aonnVar5;
        }
        if ((12582912 & i) == 0) {
            crdVar2 = crdVar;
            i3 |= true != cavVarB.B(crdVar2) ? 4194304 : 8388608;
        } else {
            crdVar2 = crdVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.A(j) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.A(j2) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cavVarB.A(j3) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.A(j4) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= true != cavVarB.y(f2) ? 128 : 256;
        } else {
            f2 = f;
        }
        if ((i2 & 3072) == 0) {
            drhVar2 = drhVar;
            i4 |= true != cavVarB.B(drhVar2) ? 1024 : 2048;
        } else {
            drhVar2 = drhVar;
        }
        int i6 = i4;
        if (cavVarB.H(((306783379 & i3) == 306783378 && (i6 & 1171) == 1170) ? false : true, i3 & 1)) {
            final aonn aonnVar9 = aonnVar6;
            final float f3 = f2;
            final aonn aonnVar10 = aonnVar7;
            final aonn aonnVar11 = aonnVar8;
            final crd crdVar3 = crdVar2;
            b(aomyVar, cmwVar, drhVar2, cfo.j(527420759, new aonn() { // from class: bml
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar2 = (cav) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i7 = iIntValue & 3;
                    int i8 = iIntValue & 1;
                    ayy ayyVar = defpackage.bmm.a;
                    if (cavVar2.H(i7 != 2, i8)) {
                        aonn aonnVar12 = aonnVar2;
                        aonn aonnVar13 = aonnVar9;
                        long j5 = j4;
                        long j6 = j3;
                        long j7 = j2;
                        float f4 = f3;
                        long j8 = j;
                        crd crdVar4 = crdVar3;
                        aonn aonnVar14 = aonnVar11;
                        defpackage.bmm.c(cfo.j(1367541877, new defpackage.awu(aonnVar13, aonnVar12, 7), cavVar2), null, aonnVar3, aonnVar10, aonnVar14, crdVar4, j8, f4, bos.e(25, cavVar2), j7, j6, j5, cavVar2, 6, 0);
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVarB, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i6 >> 3) & 896));
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bmn(aomyVar, aonnVar, cmwVar, aonnVar2, aonnVar3, aonnVar4, aonnVar5, crdVar, j, j2, j3, j4, f, drhVar, i, i2, 1);
        }
    }

    public static final void b(aomy aomyVar, cmw cmwVar, defpackage.drh drhVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(24925658);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(drhVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.dpm.e(aomyVar, drhVar, cfo.j(784693091, new defpackage.awu(cmwVar, aonnVar, 6), cavVarB), cavVarB, (i2 & 14) | 384 | ((i2 >> 3) & 112));
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.biu(aomyVar, cmwVar, drhVar, aonnVar, i, 2);
        }
    }

    public static final void c(final aonn aonnVar, cmw cmwVar, final aonn aonnVar2, final aonn aonnVar3, final aonn aonnVar4, final crd crdVar, final long j, final float f, final long j2, final long j3, final long j4, final long j5, cav cavVar, final int i, final int i2) {
        int i3;
        aonn aonnVar5;
        int i4;
        final cmw cmwVar2;
        int i5 = i & 6;
        cav cavVarB = cavVar.b(1378716401);
        if (i5 == 0) {
            i3 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        if ((i & 384) == 0) {
            i6 |= true != cavVarB.D(aonnVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i6 |= true != cavVarB.D(aonnVar3) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            aonnVar5 = aonnVar4;
            i6 |= true != cavVarB.D(aonnVar5) ? 8192 : 16384;
        } else {
            aonnVar5 = aonnVar4;
        }
        if ((196608 & i) == 0) {
            i6 |= true != cavVarB.B(crdVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i6 |= true != cavVarB.A(j) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i6 |= true != cavVarB.y(f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i6 |= true != cavVarB.A(j2) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i6 |= true != cavVarB.A(j3) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cavVarB.A(j4) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.A(j5) ? 16 : 32;
        }
        if (cavVarB.H(((306783379 & i6) == 306783378 && (i4 & 19) == 18) ? false : true, i6 & 1)) {
            cmwVar2 = cmw.c;
            final aonn aonnVar6 = aonnVar5;
            bvo.b(cmwVar2, crdVar, j, 0L, f, 0.0f, (amu) null, cfo.j(-652798794, new aonn() { // from class: bmj
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    dkz dkzVarB;
                    aonn aonnVar7;
                    cav cavVar2 = (cav) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i7 = iIntValue & 3;
                    int i8 = iIntValue & 1;
                    ayy ayyVar = defpackage.bmm.a;
                    if (cavVar2.H(i7 != 2, i8)) {
                        cmt cmtVar = cmw.c;
                        ccp ccpVar = bsi.a;
                        float f2 = true != ((java.lang.Boolean) ccpVar.a()).booleanValue() ? 24.0f : 20.0f;
                        cmw cmwVarAX = den.aX(cmtVar, new azc(f2, f2, f2, f2));
                        cye cyeVarA = aww.a(awi.c, cmh.j, cavVar2, 0);
                        int iM = anty.M(cavVar2.a());
                        cje cjeVarM = cavVar2.M();
                        cmw cmwVarM = cfo.m(cavVar2, cmwVarAX);
                        aomy aomyVar = dam.a;
                        cavVar2.L();
                        cavVar2.v();
                        if (cavVar2.F()) {
                            cavVar2.j(aomyVar);
                        } else {
                            cavVar2.x();
                        }
                        aonn aonnVar8 = aonnVar2;
                        aonn aonnVar9 = dam.e;
                        cev.c(cavVar2, cyeVarA, aonnVar9);
                        aonn aonnVar10 = dam.d;
                        cev.c(cavVar2, cjeVarM, aonnVar10);
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                        aonn aonnVar11 = dam.f;
                        cev.c(cavVar2, numValueOf, aonnVar11);
                        aonj aonjVar = dam.g;
                        cev.b(cavVar2, aonjVar);
                        aonn aonnVar12 = dam.c;
                        cev.c(cavVar2, cmwVarM, aonnVar12);
                        if (aonnVar8 == null) {
                            cavVar2.u(346092326);
                            cavVar2.o();
                        } else {
                            long j6 = j3;
                            cavVar2.u(346092327);
                            den.ab(boy.a.b(new cqg(j6)), cfo.j(-1128150638, new axo(aonnVar8, 12), cavVar2), cavVar2, 56);
                            cavVar2.o();
                        }
                        aonn aonnVar13 = aonnVar3;
                        if (aonnVar13 == null) {
                            cavVar2.u(346408309);
                            cavVar2.o();
                            aonnVar7 = aonnVar12;
                        } else {
                            cavVar2.u(346408310);
                            if (((java.lang.Boolean) ccpVar.a()).booleanValue()) {
                                cavVar2.u(1812109189);
                                dkzVarB = dkz.z(den.an(cavVar2).f, 0L, dpy.g(20), (dnd) null, (dmw) null, (dmq) null, (java.lang.String) null, 0L, 0L, (dou) null, 0, dpy.g(26), (dki) null, (dos) null, 0, 0, 16646141);
                                cavVar2.o();
                            } else {
                                cavVar2.u(1812321322);
                                dkzVarB = bwp.b(8, cavVar2);
                                cavVar2.o();
                            }
                            aonnVar7 = aonnVar12;
                            den.af(j4, dkzVarB, cfo.j(71284337, new defpackage.awu(aonnVar8, aonnVar13, 5), cavVar2), cavVar2, 384);
                            cavVar2.o();
                        }
                        aonn aonnVar14 = aonnVar6;
                        if (aonnVar14 == null) {
                            cavVar2.u(347551589);
                            cavVar2.o();
                        } else {
                            long j7 = j5;
                            cavVar2.u(347551590);
                            den.af(j7, bwp.b(1, cavVar2), cfo.j(705583346, new axo(aonnVar14, 11), cavVar2), cavVar2, 384);
                            cavVar2.o();
                        }
                        cmw cmwVarA = awy.a(cmtVar, cmh.l);
                        cye cyeVarB = awo.b(cmh.a, false);
                        int iM2 = anty.M(cavVar2.a());
                        cje cjeVarM2 = cavVar2.M();
                        cmw cmwVarM2 = cfo.m(cavVar2, cmwVarA);
                        cavVar2.L();
                        cavVar2.v();
                        if (cavVar2.F()) {
                            cavVar2.j(aomyVar);
                        } else {
                            cavVar2.x();
                        }
                        aonn aonnVar15 = aonnVar;
                        long j8 = j2;
                        cev.c(cavVar2, cyeVarB, aonnVar9);
                        cev.c(cavVar2, cjeVarM2, aonnVar10);
                        cev.c(cavVar2, java.lang.Integer.valueOf(iM2), aonnVar11);
                        cev.b(cavVar2, aonjVar);
                        cev.c(cavVar2, cmwVarM2, aonnVar7);
                        den.af(j8, bwp.b(9, cavVar2), aonnVar15, cavVar2, 0);
                        cavVar2.n();
                        cavVar2.n();
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVarB, 104);
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: bmk
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    aonn aonnVar7 = aonnVar;
                    cmw cmwVar3 = cmwVar2;
                    aonn aonnVar8 = aonnVar2;
                    aonn aonnVar9 = aonnVar3;
                    aonn aonnVar10 = aonnVar4;
                    crd crdVar2 = crdVar;
                    long j6 = j;
                    float f2 = f;
                    int i7 = i;
                    long j7 = j2;
                    int i8 = i2;
                    int i9 = i7 | 1;
                    int i10 = i8 & 306783378;
                    int i11 = i9 & 306783378;
                    int i12 = i11 << 1;
                    long j8 = j4;
                    int i13 = i8 & 613566756;
                    int i14 = i9 & 613566756;
                    long j9 = j5;
                    defpackage.bmm.c(aonnVar7, cmwVar3, aonnVar8, aonnVar9, aonnVar10, crdVar2, j6, f2, j7, j3, j8, j9, (cav) obj, (i9 & (-920350135)) | i11 | (i14 >> 1) | (i12 & i14), (i8 & (-920350135)) | i10 | (i13 >> 1) | ((i10 << 1) & i13));
                    return aojh.a;
                }
            };
        }
    }

    public static final void d(final float f, final aonn aonnVar, cav cavVar, final int i) {
        int i2;
        dpq dpqVar;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-917637668);
        final int i4 = 1;
        if (i3 == 0) {
            i2 = (true != cavVarB.y(8.0f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.y(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            cbd cbdVar = dfo.j;
            final dpq dpqVar2 = (dpq) cavVarB.e(cbdVar);
            int iOrdinal = dpqVar2.ordinal();
            if (iOrdinal == 0) {
                dpqVar = dpq.b;
            } else {
                if (iOrdinal != 1) {
                    throw new aois();
                }
                dpqVar = dpq.a;
            }
            den.ab(cbdVar.b(dpqVar), cfo.j(-1986402020, new aonn() { // from class: abmc
                /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    if (i4 == 0) {
                        int iIntValue = ((java.lang.Integer) obj2).intValue();
                        return aehj.S(f, (java.lang.String) dpqVar2, (java.util.List) aonnVar, (cav) obj, iIntValue);
                    }
                    cav cavVar2 = (cav) obj;
                    int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                    int i5 = iIntValue2 & 3;
                    int i6 = iIntValue2 & 1;
                    ayy ayyVar = defpackage.bmm.a;
                    int i7 = 2;
                    if (cavVar2.H(i5 != 2, i6)) {
                        java.lang.Object obj3 = aonnVar;
                        sa.f((cmw) null, awi.f(8.0f), awi.f(f), (cmn) null, 0, 0, cfo.j(879927511, new defpackage.bli(dpqVar2, obj3, i7), cavVar2), cavVar2, 1572864, 57);
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
            }, cavVarB), cavVarB, 56);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: abdv
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    if (i4 != 0) {
                        ((java.lang.Integer) obj2).intValue();
                        int i5 = i;
                        aonn aonnVar2 = aonnVar;
                        int i6 = i5 | 1;
                        int i7 = 306783378 & i6;
                        int i8 = 613566756 & i6;
                        defpackage.bmm.d(f, aonnVar2, (cav) obj, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 << 1) & i8));
                        return aojh.a;
                    }
                    ((java.lang.Integer) obj2).intValue();
                    int i9 = i;
                    aonn aonnVar3 = aonnVar;
                    int i10 = i9 | 1;
                    int i11 = 306783378 & i10;
                    int i12 = 613566756 & i10;
                    afsq.bB(f, aonnVar3, (cav) obj, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 << 1) & i12));
                    return aojh.a;
                }
            };
        }
    }
}
