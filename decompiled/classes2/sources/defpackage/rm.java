package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class rm {
    public static java.util.Map m(android.app.appsearch.GetSchemaResponse getSchemaResponse) {
        return ae$.ExternalSyntheticApiModelOutline0.m$1(getSchemaResponse);
    }

    public static java.util.Map n(android.app.appsearch.GetSchemaResponse getSchemaResponse) {
        return ae$.ExternalSyntheticApiModelOutline0.m(getSchemaResponse);
    }

    public static java.util.Set o(android.app.appsearch.GetSchemaResponse getSchemaResponse) {
        return ae$.ExternalSyntheticApiModelOutline0.m(getSchemaResponse);
    }

    public static void p(aonn aonnVar, aonn aonnVar2, dkz dkzVar, long j, long j2, cav cavVar, int i) {
        int i2;
        aonn aonnVar3;
        boolean z;
        boolean z2;
        dkz dkzVar2 = dkzVar;
        long j3 = j;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-321841045);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonnVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.B(dkzVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.A(j3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.A(j2) ? 65536 : 131072;
        }
        if (cbtVarB.H((74899 & i2) != 74898, i2 & 1)) {
            cmw cmwVarBa = den.ba(cmw.c, 16.0f, 0.0f, 8.0f, 0.0f);
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new defpackage.bvb();
                cbtVar.ab(objR);
            }
            cye cyeVar = (cye) objR;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarBa);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            aonn aonnVar4 = dam.e;
            cev.c(cbtVarB, cyeVar, aonnVar4);
            aonn aonnVar5 = dam.d;
            cev.c(cbtVarB, cjeVarAi, aonnVar5);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar6 = dam.f;
            cev.c(cbtVarB, numValueOf, aonnVar6);
            aonj aonjVar = dam.g;
            cev.b(cbtVarB, aonjVar);
            int i4 = i2;
            aonn aonnVar7 = dam.c;
            cev.c(cbtVarB, cmwVarM, aonnVar7);
            cmw cmwVarAZ = den.aZ(new defpackage.cxk("text"), 0.0f, 6.0f);
            cmj cmjVar = cmh.a;
            cye cyeVarB = awo.b(cmjVar, false);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarAZ);
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB, aonnVar4);
            cev.c(cbtVarB, cjeVarAi2, aonnVar5);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), aonnVar6);
            cev.b(cbtVarB, aonjVar);
            cev.c(cbtVarB, cmwVarM2, aonnVar7);
            aonnVar.a(cbtVarB, java.lang.Integer.valueOf(i4 & 14));
            cbtVar.W(true);
            if (aonnVar2 != null) {
                cbtVarB.u(989211000);
                defpackage.cxk cxkVar = new defpackage.cxk("action");
                cye cyeVarB2 = awo.b(cmjVar, false);
                int iM3 = anty.M(cbtVar.x);
                cje cjeVarAi3 = cbtVar.ai();
                cmw cmwVarM3 = cfo.m(cbtVarB, cxkVar);
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVarB2, aonnVar4);
                cev.c(cbtVarB, cjeVarAi3, aonnVar5);
                cev.c(cbtVarB, java.lang.Integer.valueOf(iM3), aonnVar6);
                cev.b(cbtVarB, aonjVar);
                cev.c(cbtVarB, cmwVarM3, aonnVar7);
                j3 = j;
                z2 = false;
                dkzVar2 = dkzVar;
                z = true;
                aonnVar3 = aonnVar2;
                den.ac(new cdj[]{boy.a.b(new cqg(j3)), bvt.a.b(dkzVar2)}, aonnVar3, cbtVarB, i4 & 112);
                cbtVar.W(true);
                cbtVar.W(false);
            } else {
                aonnVar3 = aonnVar2;
                dkzVar2 = dkzVar;
                j3 = j;
                z = true;
                z2 = false;
                cbtVarB.u(989526208);
                cbtVar.W(false);
            }
            cbtVarB.u(989843648);
            cbtVar.W(z2);
            cbtVar.W(z);
        } else {
            aonnVar3 = aonnVar2;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bqo(aonnVar, aonnVar3, dkzVar2, j3, j2, i, 2);
        }
    }

    public static void q(final cmw cmwVar, final aonn aonnVar, final crd crdVar, final long j, final long j2, final long j3, final long j4, final aonn aonnVar2, cav cavVar, final int i) {
        int i2;
        aonn aonnVar3;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1218779924);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.C(false) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.B(crdVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.A(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cbtVarB.A(j2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cbtVarB.A(j3) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cbtVarB.A(j4) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            aonnVar3 = aonnVar2;
            i2 |= true != cbtVarB.D(aonnVar3) ? 268435456 : 536870912;
        } else {
            aonnVar3 = aonnVar2;
        }
        if (cbtVarB.H((306783379 & i2) != 306783378, i2 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            final aonn aonnVar4 = aonnVar3;
            bvo.b(cmwVar, crdVar, j, j2, 0.0f, 6.0f, (amu) null, cfo.j(-1343524879, new aonn() { // from class: bux
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar2 = (cav) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i4 = iIntValue & 3;
                    if (cavVar2.H(i4 != 2, iIntValue & 1)) {
                        final long j5 = j4;
                        final long j6 = j3;
                        final aonn aonnVar5 = aonnVar4;
                        final aonn aonnVar6 = aonnVar;
                        dkz dkzVarB = bwp.b(1, cavVar2);
                        final dkz dkzVarB2 = bwp.b(9, cavVar2);
                        den.ab(bvt.a.b(dkzVarB), cfo.j(969655473, new aonn() { // from class: buz
                            public final java.lang.Object a(java.lang.Object obj3, java.lang.Object obj4) {
                                cav cavVar3 = (cav) obj3;
                                int iIntValue2 = ((java.lang.Integer) obj4).intValue();
                                int i5 = iIntValue2 & 3;
                                if (cavVar3.H(i5 != 2, iIntValue2 & 1)) {
                                    long j7 = j5;
                                    long j8 = j6;
                                    dkz dkzVar = dkzVarB2;
                                    aonn aonnVar7 = aonnVar5;
                                    aonn aonnVar8 = aonnVar6;
                                    cavVar3.u(-168956728);
                                    cavVar3.u(-942207887);
                                    defpackage.rm.p(aonnVar7, aonnVar8, dkzVar, j8, j7, cavVar3, 0);
                                    cavVar3.o();
                                    cavVar3.o();
                                } else {
                                    cavVar3.s();
                                }
                                return aojh.a;
                            }
                        }, cavVar2), cavVar2, 56);
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
            }, cbtVarB), cbtVarB, 80);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: buy
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    cmw cmwVar2 = cmwVar;
                    aonn aonnVar5 = aonnVar;
                    crd crdVar2 = crdVar;
                    long j5 = j;
                    int i4 = i;
                    int i5 = i4 | 1;
                    int i6 = 306783378 & i5;
                    int i7 = i5 & 613566756;
                    defpackage.rm.q(cmwVar2, aonnVar5, crdVar2, j5, j2, j3, j4, aonnVar2, (cav) obj, ((i6 << 1) & i7) | (i5 & (-920350135)) | i6 | (i7 >> 1));
                    return aojh.a;
                }
            };
        }
    }

    public static void r(final defpackage.but butVar, cmw cmwVar, crd crdVar, long j, long j2, long j3, long j4, long j5, cav cavVar, final int i) {
        int i2;
        cav cavVar2;
        final cmw cmwVar2;
        final crd crdVar2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        cmw cmwVar3;
        long jE;
        long j11;
        long j12;
        crd crdVar3;
        long j13;
        long j14;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(274621471);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(butVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if (cavVarB.H((38347923 & i4) != 38347922, i4 & 1)) {
            int i5 = i4 & (-268434433);
            cbt cbtVar = (cbt) cavVarB;
            cja cjaVarJ = null;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cavVarB.E()) {
                cmwVar3 = cmw.c;
                crd crdVarB = btj.b(4, cavVarB);
                long jE2 = bos.e(5, cavVarB);
                long jE3 = bos.e(3, cavVarB);
                long jE4 = bos.e(4, cavVarB);
                long jE5 = bos.e(4, cavVarB);
                jE = bos.e(3, cavVarB);
                j11 = jE5;
                j12 = jE3;
                crdVar3 = crdVarB;
                j13 = jE2;
                j14 = jE4;
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar;
                crdVar3 = crdVar;
                j13 = j;
                j12 = j2;
                j14 = j3;
                j11 = j4;
                jE = j5;
            }
            cavVarB.l();
            java.lang.String str = butVar.b.b;
            if (str != null) {
                cavVarB.u(-663827885);
                cjaVarJ = cfo.j(-1378313599, new defpackage.bps(j14, butVar, str, 2), cavVarB);
                cbtVar.W(false);
            } else {
                cavVarB.u(-663528921);
                cbtVar.W(false);
            }
            cja cjaVar = cjaVarJ;
            cavVarB.u(-662527001);
            cbtVar.W(false);
            cavVar2 = cavVarB;
            q(den.aY(cmwVar3, 12.0f), cjaVar, crdVar3, j13, j12, j11, jE, cfo.j(-1266389126, new brg(butVar, 5), cavVarB), cavVar2, ((i5 << 3) & 7168) | 805306368);
            cmwVar2 = cmwVar3;
            j8 = j14;
            crdVar2 = crdVar3;
            j6 = j13;
            j7 = j12;
            j9 = j11;
            j10 = jE;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
            crdVar2 = crdVar;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            j10 = j5;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: buw
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.but butVar2 = butVar;
                    cmw cmwVar4 = cmwVar2;
                    crd crdVar4 = crdVar2;
                    long j15 = j6;
                    int i6 = i;
                    int i7 = i6 | 1;
                    int i8 = 306783378 & i7;
                    long j16 = j9;
                    int i9 = i7 & 613566756;
                    long j17 = j10;
                    defpackage.rm.r(butVar2, cmwVar4, crdVar4, j15, j7, j8, j16, j17, (cav) obj, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 << 1) & i9));
                    return aojh.a;
                }
            };
        }
    }

    public static void s(java.lang.String str, cmw cmwVar, aomy aomyVar, aomy aomyVar2, long j, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        boolean z;
        cmw cmwVarB;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-2078815310);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cbtVarB.D(aomyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != cbtVarB.D(aomyVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != cbtVarB.A(j) ? 8192 : 16384;
        }
        if (cbtVarB.H((i4 & 9363) != 9362, i4 & 1)) {
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cbtVarB.E()) {
                cmwVar2 = cmw.c;
            } else {
                cbtVarB.s();
                cmwVar2 = cmwVar;
            }
            cbtVarB.l();
            if (j != 16) {
                cbtVarB.u(-853219337);
                if (aomyVar != null) {
                    cbtVarB.u(-853120974);
                    int i5 = i4 & 896;
                    cmt cmtVar = cmw.c;
                    java.lang.Object objR = cbtVar.R();
                    if (i5 == 256 || objR == cau.a) {
                        objR = new defpackage.bil(aomyVar, 6);
                        cbtVar.ab(objR);
                    }
                    cmw cmwVarA = cvy.a(cmtVar, aomyVar, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR);
                    boolean z2 = (i4 & 14) == 4;
                    boolean z3 = i5 == 256;
                    java.lang.Object objR2 = cbtVar.R();
                    if ((z2 | z3) || objR2 == cau.a) {
                        objR2 = new bly(str, aomyVar, 10);
                        cbtVar.ab(objR2);
                    }
                    z = true;
                    cmwVarB = dig.b(cmwVarA, true, (aonj) objR2);
                    cbtVar.W(false);
                } else {
                    z = true;
                    cbtVarB.u(-852623672);
                    cbtVar.W(false);
                    cmwVarB = cmw.c;
                }
                cmw cmwVarA2 = azm.c(cmwVar2, 1.0f).a(cmwVarB);
                boolean z4 = ((((57344 & i4) ^ 24576) <= 16384 || !cbtVarB.A(j)) && (i4 & 24576) != 16384) ? false : z;
                if ((i4 & 7168) != 2048) {
                    z = false;
                }
                java.lang.Object objR3 = cbtVar.R();
                if ((z4 | z) || objR3 == cau.a) {
                    objR3 = new aev(j, aomyVar2, 6);
                    cbtVar.ab(objR3);
                }
                defpackage.yt.a(cmwVarA2, (aonj) objR3, cbtVarB, 0);
                cbtVar.W(false);
            } else {
                cbtVarB.u(-852426512);
                cbtVar.W(false);
            }
        } else {
            cbtVarB.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bty(str, cmwVar2, aomyVar, aomyVar2, j, i, 1);
        }
    }

    public static void t(final int i, final aonn aonnVar, aono aonoVar, final aonn aonnVar2, final aonn aonnVar3, azz azzVar, aonn aonnVar4, cav cavVar, int i2) {
        int i3;
        aono aonoVar2;
        azz azzVar2;
        aonn aonnVar5;
        java.lang.Object obj;
        int i4;
        int i5 = i2 & 6;
        cbt cbtVarB = cavVar.b(-280287501);
        if (i5 == 0) {
            i3 = (true != cbtVarB.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cbtVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            aonoVar2 = aonoVar;
            i3 |= true != cbtVarB.D(aonoVar2) ? 128 : 256;
        } else {
            aonoVar2 = aonoVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cbtVarB.D(aonnVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != cbtVarB.D(aonnVar3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            azzVar2 = azzVar;
            i3 |= true != cbtVarB.B(azzVar2) ? 65536 : 131072;
        } else {
            azzVar2 = azzVar;
        }
        if ((1572864 & i2) == 0) {
            aonnVar5 = aonnVar4;
            i3 |= true != cbtVarB.D(aonnVar5) ? 524288 : 1048576;
        } else {
            aonnVar5 = aonnVar4;
        }
        if (cbtVarB.H((599187 & i3) != 599186, i3 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj2 = cau.a;
            if (objR == obj2) {
                objR = new defpackage.btc();
                cbtVar.ab(objR);
            }
            boolean z = (i3 & 458752) == 131072;
            boolean z2 = (i3 & 112) == 32;
            java.lang.Object obj3 = objR;
            boolean z3 = (i3 & 7168) == 2048;
            boolean z4 = (57344 & i3) == 16384;
            boolean z5 = (i3 & 14) == 4;
            boolean z6 = (3670016 & i3) == 1048576;
            final defpackage.btc btcVar = (defpackage.btc) obj3;
            boolean z7 = (i3 & 896) == 256;
            java.lang.Object objR2 = cbtVar.R();
            if (((z | z2 | z3 | z4 | z5 | z6) || z7) || objR2 == obj2) {
                final aono aonoVar3 = aonoVar2;
                final azz azzVar3 = azzVar2;
                i4 = 0;
                final aonn aonnVar6 = aonnVar5;
                obj = new aonn() { // from class: btb
                    public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5) {
                        java.lang.Object obj6;
                        int i6;
                        java.lang.Object obj7;
                        java.lang.Object obj8;
                        defpackage.ux uxVar;
                        java.lang.Object obj9;
                        java.util.ArrayList arrayList;
                        final java.lang.Integer numValueOf;
                        final int iIntValue;
                        float fA;
                        final java.lang.Integer num;
                        int iDp;
                        int iA;
                        java.lang.Object obj10;
                        java.lang.Object obj11;
                        int iDp2;
                        int iDp3;
                        final czo czoVar = (czo) obj4;
                        long j = ((dpd) obj5).a;
                        int iB = dpd.b(j);
                        int iA2 = dpd.a(j);
                        long jK = dpd.k(j, 0, 0, 0, 0, 10);
                        dpq dpqVarP = czoVar.p();
                        int i7 = iB;
                        final azz azzVar4 = azzVar3;
                        int iB2 = azzVar4.b(czoVar, dpqVarP);
                        int iC = azzVar4.c(czoVar, czoVar.p());
                        int iA3 = azzVar4.a(czoVar);
                        java.util.List listS = czoVar.s(defpackage.btd.a, aonnVar);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(listS.size());
                        int size = listS.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            arrayList2.add(((cyd) listS.get(i8)).v(jK));
                        }
                        if (!arrayList2.isEmpty()) {
                            obj6 = arrayList2.get(0);
                            int i9 = ((czc) obj6).b;
                            int iAZ = ajsz.aZ(arrayList2);
                            if (iAZ > 0) {
                                int i10 = 1;
                                while (true) {
                                    java.lang.Object obj12 = arrayList2.get(i10);
                                    int i11 = ((czc) obj12).b;
                                    if (i9 < i11) {
                                        i9 = i11;
                                        obj6 = obj12;
                                    }
                                    if (i10 == iAZ) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } else {
                            obj6 = null;
                        }
                        czc czcVar = (czc) obj6;
                        int i12 = czcVar != null ? czcVar.b : 0;
                        java.util.List listS2 = czoVar.s(defpackage.btd.c, aonnVar2);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(listS2.size());
                        int size2 = listS2.size();
                        int i13 = 0;
                        while (true) {
                            i6 = iC;
                            if (i13 >= size2) {
                                break;
                            }
                            arrayList3.add(((cyd) listS2.get(i13)).v(dpe.g(jK, (-iB2) - i6, -iA3)));
                            i13++;
                            iC = i6;
                            arrayList2 = arrayList2;
                            i7 = i7;
                            iA2 = iA2;
                            listS2 = listS2;
                        }
                        final int i14 = i7;
                        final int i15 = iA2;
                        final java.util.ArrayList arrayList4 = arrayList2;
                        if (!arrayList3.isEmpty()) {
                            obj7 = arrayList3.get(0);
                            int i16 = ((czc) obj7).b;
                            int iAZ2 = ajsz.aZ(arrayList3);
                            if (iAZ2 > 0) {
                                int i17 = 1;
                                while (true) {
                                    java.lang.Object obj13 = arrayList3.get(i17);
                                    int i18 = ((czc) obj13).b;
                                    if (i16 < i18) {
                                        obj7 = obj13;
                                        i16 = i18;
                                    }
                                    if (i17 == iAZ2) {
                                        break;
                                    }
                                    i17++;
                                }
                            }
                        } else {
                            obj7 = null;
                        }
                        czc czcVar2 = (czc) obj7;
                        int i19 = czcVar2 != null ? czcVar2.b : 0;
                        if (!arrayList3.isEmpty()) {
                            obj8 = arrayList3.get(0);
                            int i20 = ((czc) obj8).a;
                            int iAZ3 = ajsz.aZ(arrayList3);
                            if (iAZ3 > 0) {
                                int i21 = 1;
                                while (true) {
                                    java.lang.Object obj14 = arrayList3.get(i21);
                                    int i22 = ((czc) obj14).a;
                                    if (i20 < i22) {
                                        obj8 = obj14;
                                        i20 = i22;
                                    }
                                    if (i21 == iAZ3) {
                                        break;
                                    }
                                    i21++;
                                }
                            }
                        } else {
                            obj8 = null;
                        }
                        czc czcVar3 = (czc) obj8;
                        int i23 = czcVar3 != null ? czcVar3.a : 0;
                        java.util.List listS3 = czoVar.s(defpackage.btd.d, aonnVar3);
                        final java.util.ArrayList arrayList5 = new java.util.ArrayList(listS3.size());
                        int size3 = listS3.size();
                        int i24 = 0;
                        while (i24 < size3) {
                            int i25 = iB2;
                            int i26 = i19;
                            int i27 = iA3;
                            int i28 = i23;
                            czc czcVarV = ((cyd) listS3.get(i24)).v(dpe.g(jK, (-iB2) - i6, -iA3));
                            if (czcVarV.b == 0 || czcVarV.a == 0) {
                                czcVarV = null;
                            }
                            if (czcVarV != null) {
                                arrayList5.add(czcVarV);
                            }
                            i24++;
                            iB2 = i25;
                            iA3 = i27;
                            i19 = i26;
                            i23 = i28;
                        }
                        int i29 = iB2;
                        int i30 = i19;
                        final int i31 = i23;
                        int i32 = i;
                        if (arrayList5.isEmpty()) {
                            uxVar = null;
                        } else {
                            if (!arrayList5.isEmpty()) {
                                obj10 = arrayList5.get(0);
                                int i33 = ((czc) obj10).a;
                                int iAZ4 = ajsz.aZ(arrayList5);
                                if (iAZ4 > 0) {
                                    int i34 = 1;
                                    while (true) {
                                        java.lang.Object obj15 = arrayList5.get(i34);
                                        int i35 = ((czc) obj15).a;
                                        if (i33 < i35) {
                                            i33 = i35;
                                            obj10 = obj15;
                                        }
                                        if (i34 == iAZ4) {
                                            break;
                                        }
                                        i34++;
                                    }
                                }
                            } else {
                                obj10 = null;
                            }
                            aooh.c(obj10);
                            int i36 = ((czc) obj10).a;
                            if (!arrayList5.isEmpty()) {
                                obj11 = arrayList5.get(0);
                                int i37 = ((czc) obj11).b;
                                int iAZ5 = ajsz.aZ(arrayList5);
                                if (iAZ5 > 0) {
                                    int i38 = 1;
                                    while (true) {
                                        java.lang.Object obj16 = arrayList5.get(i38);
                                        int i39 = ((czc) obj16).b;
                                        if (i37 < i39) {
                                            i37 = i39;
                                            obj11 = obj16;
                                        }
                                        if (i38 == iAZ5) {
                                            break;
                                        }
                                        i38++;
                                    }
                                }
                            } else {
                                obj11 = null;
                            }
                            aooh.c(obj11);
                            int i40 = ((czc) obj11).b;
                            if (a.x(i32, 0)) {
                                if (czoVar.p() == dpq.a) {
                                    iDp2 = czoVar.dp(16.0f);
                                    iDp3 = iDp2 + i29;
                                } else {
                                    iDp3 = ((i14 - czoVar.dp(16.0f)) - i36) - i6;
                                }
                            } else if (!a.x(i32, 2) && !a.x(i32, 3)) {
                                iDp3 = (((i14 - i36) + i29) - i6) / 2;
                            } else if (czoVar.p() == dpq.a) {
                                iDp3 = ((i14 - czoVar.dp(16.0f)) - i36) - i6;
                            } else {
                                iDp2 = czoVar.dp(16.0f);
                                iDp3 = iDp2 + i29;
                            }
                            uxVar = new defpackage.ux(iDp3, i40, null);
                        }
                        java.util.List listS4 = czoVar.s(defpackage.btd.e, aonnVar6);
                        final java.util.ArrayList arrayList6 = new java.util.ArrayList(listS4.size());
                        int size4 = listS4.size();
                        for (int i41 = 0; i41 < size4; i41++) {
                            arrayList6.add(((cyd) listS4.get(i41)).v(jK));
                        }
                        if (!arrayList6.isEmpty()) {
                            obj9 = arrayList6.get(0);
                            int i42 = ((czc) obj9).b;
                            int iAZ6 = ajsz.aZ(arrayList6);
                            if (iAZ6 > 0) {
                                int i43 = 1;
                                while (true) {
                                    java.lang.Object obj17 = arrayList6.get(i43);
                                    int i44 = ((czc) obj17).b;
                                    if (i42 < i44) {
                                        i42 = i44;
                                        obj9 = obj17;
                                    }
                                    if (i43 == iAZ6) {
                                        break;
                                    }
                                    i43++;
                                }
                            }
                        } else {
                            obj9 = null;
                        }
                        czc czcVar4 = (czc) obj9;
                        java.lang.Integer numValueOf2 = czcVar4 != null ? java.lang.Integer.valueOf(czcVar4.b) : null;
                        if (uxVar != null) {
                            if (numValueOf2 == null || a.x(i32, 3)) {
                                iDp = uxVar.b + czoVar.dp(16.0f);
                                iA = azzVar4.a(czoVar);
                            } else {
                                iDp = numValueOf2.intValue() + uxVar.b;
                                iA = czoVar.dp(16.0f);
                            }
                            numValueOf = java.lang.Integer.valueOf(iDp + iA);
                            arrayList = arrayList3;
                        } else {
                            arrayList = arrayList3;
                            numValueOf = null;
                        }
                        if (i30 != 0) {
                            iIntValue = i30 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : azzVar4.a(czoVar));
                        } else {
                            iIntValue = 0;
                        }
                        defpackage.aye ayeVar = new defpackage.aye(azzVar4, czoVar);
                        float fD = arrayList4.isEmpty() ? ayeVar.d() : czoVar.dj(i12);
                        if (numValueOf2 != null) {
                            num = numValueOf2;
                            fA = czoVar.dj(numValueOf2.intValue());
                        } else {
                            fA = ayeVar.a();
                            num = null;
                        }
                        aono aonoVar4 = aonoVar3;
                        defpackage.btc btcVar2 = btcVar;
                        final java.util.ArrayList arrayList7 = arrayList;
                        final defpackage.ux uxVar2 = uxVar;
                        btcVar2.a.b(new azc(den.aW(ayeVar, czoVar.p()), fD, den.aV(ayeVar, czoVar.p()), fA));
                        java.util.List listS5 = czoVar.s(defpackage.btd.b, new cja(-278021671, true, new defpackage.awu(aonoVar4, btcVar2, 15, null)));
                        final java.util.ArrayList arrayList8 = new java.util.ArrayList(listS5.size());
                        int size5 = listS5.size();
                        for (int i45 = 0; i45 < size5; i45++) {
                            arrayList8.add(((cyd) listS5.get(i45)).v(jK));
                        }
                        return den.z(czoVar, i14, i15, new aonj() { // from class: bta
                            public final java.lang.Object a(java.lang.Object obj18) {
                                int i46;
                                java.util.List list = arrayList4;
                                czb czbVar = (czb) obj18;
                                int size6 = list.size();
                                for (int i47 = 0; i47 < size6; i47++) {
                                    czbVar.s((czc) list.get(i47), 0, 0, 1.0f);
                                }
                                java.util.List list2 = arrayList8;
                                int size7 = list2.size();
                                for (int i48 = 0; i48 < size7; i48++) {
                                    czbVar.s((czc) list2.get(i48), 0, 0, 0.0f);
                                }
                                java.util.List list3 = arrayList7;
                                int size8 = list3.size();
                                int i49 = 0;
                                while (true) {
                                    i46 = i15;
                                    if (i49 >= size8) {
                                        break;
                                    }
                                    int i50 = iIntValue;
                                    czo czoVar2 = czoVar;
                                    azz azzVar5 = azzVar4;
                                    czbVar.s((czc) list3.get(i49), (((i14 - i31) + azzVar5.b(czoVar2, czoVar2.p())) - azzVar5.c(czoVar2, czoVar2.p())) / 2, i46 - i50, 2.0f);
                                    i49++;
                                }
                                defpackage.ux uxVar3 = uxVar2;
                                if (uxVar3 != null) {
                                    java.util.List list4 = arrayList5;
                                    int size9 = list4.size();
                                    for (int i51 = 0; i51 < size9; i51++) {
                                        java.lang.Integer num2 = numValueOf;
                                        czc czcVar5 = (czc) list4.get(i51);
                                        aooh.c(num2);
                                        czbVar.s(czcVar5, uxVar3.a, i46 - num2.intValue(), 4.0f);
                                    }
                                }
                                java.util.List list5 = arrayList6;
                                int size10 = list5.size();
                                for (int i52 = 0; i52 < size10; i52++) {
                                    java.lang.Integer num3 = num;
                                    czbVar.s((czc) list5.get(i52), 0, i46 - (num3 != null ? num3.intValue() : 0), 3.0f);
                                }
                                return aojh.a;
                            }
                        });
                    }
                };
                cbtVar.ab(obj);
            } else {
                obj = objR2;
                i4 = 0;
            }
            czl.a((cmw) null, (aonn) obj, cbtVarB, i4, 1);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.afa(i, aonnVar, aonoVar, aonnVar2, aonnVar3, azzVar, aonnVar4, i2, 3);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r39v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r39v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r39v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r39v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static void u(cmw r26, aonn r27, aonn r28, aonn r29, aonn r30, int r31, long r32, long r34, azz r36, aono r37, cav r38, int r39) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm.u(cmw, aonn, aonn, aonn, aonn, int, long, long, azz, aono, cav, int):void");
    }

    public static float v(cer cerVar) {
        return ((dpi) cerVar.a()).a;
    }

    public static void w(boolean z, cmw cmwVar, defpackage.bsp bspVar, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        long j;
        float f;
        cbt cbtVarB = cavVar.b(408580840);
        boolean z2 = true;
        if ((i & 6) == 0) {
            i2 = (true != cbtVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.C(true) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.B(bspVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.B((java.lang.Object) null) ? 65536 : 131072;
        }
        if (cbtVarB.H((74899 & i2) != 74898, i2 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            if (z) {
                f = 6.0f;
                j = bspVar.a;
            } else {
                z2 = false;
                j = bspVar.b;
                f = 0.0f;
            }
            cmwVar2 = cmwVar;
            x(z2, cmwVar2, j, f, cbtVarB, (i2 & 8190) | ((i2 << 3) & 3670016));
            z = z2;
        } else {
            cmwVar2 = cmwVar;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bsq(z, cmwVar2, bspVar, i, 0);
        }
    }

    public static void x(final boolean z, final cmw cmwVar, long j, final float f, cav cavVar, final int i) {
        int i2;
        long j2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1062082816);
        if (i3 == 0) {
            i2 = (true != cbtVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.C(true) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.A(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.y(f) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cbtVarB.B((java.lang.Object) null) ? 524288 : 1048576;
        }
        if (cbtVarB.H((599187 & i2) != 599186, i2 & 1)) {
            cer cerVarA = aim.a(f, den.ai(1, cbtVarB), cbtVarB, (i2 >> 15) & 14, 12);
            cbtVarB.u(515408562);
            j2 = j;
            cer cerVarA2 = defpackage.ahp.a(j2, den.ai(3, cbtVarB), cbtVarB, (i2 >> 12) & 14, 12);
            cbt cbtVar = cbtVarB;
            cbtVar.W(false);
            cmw cmwVarP = azm.p(den.aY(azm.q(cmh.e), 2.0f));
            boolean zB = cbtVarB.B(cerVarA2) | cbtVarB.B(cerVarA);
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == cau.a) {
                objR = new bly(cerVarA2, cerVarA, 8);
                cbtVar.ab(objR);
            }
            defpackage.yt.a(cmwVarP, (aonj) objR, cbtVarB, 0);
        } else {
            j2 = j;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            final long j3 = j2;
            cdkVarI.c = new aonn() { // from class: bsr
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar2 = (cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    int i6 = 613566756 & i4;
                    defpackage.rm.x(z, cmwVar, j3, f, cavVar2, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 << 1) & i6));
                    return aojh.a;
                }
            };
        }
    }

    public final int describeContents() {
        return 0;
    }
}
