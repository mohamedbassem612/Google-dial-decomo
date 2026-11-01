package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dqi {
    public static final aonj a = new defpackage.dkq(8);

    public static final void a(aonj aonjVar, cmw cmwVar, aonj aonjVar2, cav cavVar, int i, int i2) {
        int i3;
        aonj aonjVar3;
        cmw cmwVar2;
        aonj aonjVar4;
        int i4 = i & 6;
        cav cavVarB = cavVar.b(-1783766393);
        if (i4 == 0) {
            i3 = (true != cavVarB.D(aonjVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != cavVarB.D(aonjVar2) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                cmwVar = cmw.c;
            }
            if (i6 != 0) {
                aonjVar2 = a;
            }
            aonj aonjVar5 = aonjVar2;
            aonjVar3 = aonjVar;
            cmwVar2 = cmwVar;
            b(aonjVar3, cmwVar2, null, a, aonjVar5, cavVarB, (i3 & 14) | 3072 | (i3 & 112) | ((i3 << 6) & 57344), 4);
            aonjVar4 = aonjVar5;
        } else {
            aonjVar3 = aonjVar;
            cavVarB.s();
            cmwVar2 = cmwVar;
            aonjVar4 = aonjVar2;
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqg((java.lang.Object) aonjVar3, (java.lang.Object) cmwVar2, aonjVar4, i, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:69:0x0100  */
    /* JADX WARN: Code duplicated, block: B:70:0x0104  */
    /* JADX WARN: Code duplicated, block: B:72:0x013e  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    /* JADX WARN: Code duplicated, block: B:78:0x018d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0199  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void b(aonj aonjVar, cmw cmwVar, aonj aonjVar2, aonj aonjVar3, aonj aonjVar4, cav cavVar, int i, int i2) {
        int i3;
        cmw cmwVar2;
        int i4;
        aonj aonjVar5;
        int i5;
        int i6;
        aonj aonjVar6;
        int i7;
        boolean z;
        cmw cmwVar3;
        aonj aonjVar7;
        aonj aonjVar8;
        cdk cdkVarI;
        int i8;
        cmw cmwVar4;
        aonj aonjVar9;
        cbt cbtVar;
        int iM;
        cmw cmwVarM;
        dpf dpfVar;
        dpq dpqVar;
        cje cjeVarAi;
        emx emxVar;
        gii giiVar;
        aonj aonjVar10;
        aonj aonjVar11;
        aomy aomyVarD;
        aomy aomyVarD2;
        int i9;
        int i10 = i & 6;
        cbt cbtVarB = cavVar.b(-180024211);
        if (i10 == 0) {
            i3 = (true != cbtVarB.D(aonjVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cbtVarB.B(cmwVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    aonjVar5 = aonjVar2;
                    if (true != cbtVarB.D(aonjVar5)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        aonjVar6 = aonjVar3;
                        if (true != cbtVarB.D(aonjVar6)) {
                            i7 = 1024;
                        } else {
                            i7 = 2048;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if (true != cbtVarB.D(aonjVar4)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cbtVarB.H(z, i3 & 1)) {
                        i8 = i3 & 14;
                        if (i11 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonjVar5 = null;
                        }
                        if (i6 != 0) {
                            aonjVar9 = a;
                        } else {
                            aonjVar9 = aonjVar6;
                        }
                        cbtVar = cbtVarB;
                        iM = anty.M(cbtVar.x);
                        cmwVarM = cfo.m(cbtVarB, defpackage.rv.j(cmwVar4.a(defpackage.dqm.a)).a(defpackage.dqq.a).a(defpackage.dqo.a));
                        dpfVar = (dpf) cbtVarB.e(dfo.e);
                        dpqVar = (dpq) cbtVarB.e(dfo.j);
                        cjeVarAi = cbtVar.ai();
                        emxVar = (emx) cbtVarB.e(eom.a);
                        giiVar = (gii) cbtVarB.e(gik.a);
                        if (aonjVar5 != null) {
                            cbtVarB.u(1313917368);
                            aomyVarD2 = d(aonjVar, cbtVarB, i8);
                            cbtVarB.v();
                            if (cbtVar.w) {
                                cbtVarB.j(aomyVarD2);
                            } else {
                                cbtVarB.x();
                            }
                            aonjVar10 = aonjVar5;
                            aonjVar11 = aonjVar9;
                            e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                            cev.c(cbtVarB, aonjVar10, new defpackage.cmp(17));
                            cev.c(cbtVarB, aonjVar4, new defpackage.cmp(8));
                            cev.c(cbtVarB, aonjVar11, new defpackage.cmp(9));
                            cbtVar.W(true);
                            cbtVar.W(false);
                        } else {
                            aonjVar10 = aonjVar5;
                            aonjVar11 = aonjVar9;
                            cbtVarB.u(1314774735);
                            aomyVarD = d(aonjVar, cbtVarB, i8);
                            cbtVar.Z(125, (java.lang.Object) null, 1, (java.lang.Object) null);
                            cbtVar.i = true;
                            if (cbtVar.w) {
                                cbtVarB.j(aomyVarD);
                            } else {
                                cbtVarB.x();
                            }
                            e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                            cev.c(cbtVarB, aonjVar4, new defpackage.cmp(10));
                            cev.c(cbtVarB, aonjVar11, new defpackage.cmp(11));
                            cbtVar.W(true);
                            cbtVar.W(false);
                        }
                        cmwVar3 = cmwVar4;
                        aonjVar7 = aonjVar10;
                        aonjVar8 = aonjVar11;
                    } else {
                        cbtVarB.s();
                        cmwVar3 = cmwVar2;
                        aonjVar7 = aonjVar5;
                        aonjVar8 = aonjVar6;
                    }
                    cdkVarI = cbtVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new defpackage.dqf(aonjVar, cmwVar3, aonjVar7, aonjVar8, aonjVar4, i, i2, 0);
                    }
                }
                i3 |= 3072;
                aonjVar6 = aonjVar3;
                if ((i & 24576) == 0) {
                    if (true != cbtVarB.D(aonjVar4)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (cbtVarB.H(z, i3 & 1)) {
                    i8 = i3 & 14;
                    if (i11 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        aonjVar5 = null;
                    }
                    if (i6 != 0) {
                        aonjVar9 = a;
                    } else {
                        aonjVar9 = aonjVar6;
                    }
                    cbtVar = cbtVarB;
                    iM = anty.M(cbtVar.x);
                    cmwVarM = cfo.m(cbtVarB, defpackage.rv.j(cmwVar4.a(defpackage.dqm.a)).a(defpackage.dqq.a).a(defpackage.dqo.a));
                    dpfVar = (dpf) cbtVarB.e(dfo.e);
                    dpqVar = (dpq) cbtVarB.e(dfo.j);
                    cjeVarAi = cbtVar.ai();
                    emxVar = (emx) cbtVarB.e(eom.a);
                    giiVar = (gii) cbtVarB.e(gik.a);
                    if (aonjVar5 != null) {
                        cbtVarB.u(1313917368);
                        aomyVarD2 = d(aonjVar, cbtVarB, i8);
                        cbtVarB.v();
                        if (cbtVar.w) {
                            cbtVarB.j(aomyVarD2);
                        } else {
                            cbtVarB.x();
                        }
                        aonjVar10 = aonjVar5;
                        aonjVar11 = aonjVar9;
                        e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                        cev.c(cbtVarB, aonjVar10, new defpackage.cmp(17));
                        cev.c(cbtVarB, aonjVar4, new defpackage.cmp(8));
                        cev.c(cbtVarB, aonjVar11, new defpackage.cmp(9));
                        cbtVar.W(true);
                        cbtVar.W(false);
                    } else {
                        aonjVar10 = aonjVar5;
                        aonjVar11 = aonjVar9;
                        cbtVarB.u(1314774735);
                        aomyVarD = d(aonjVar, cbtVarB, i8);
                        cbtVar.Z(125, (java.lang.Object) null, 1, (java.lang.Object) null);
                        cbtVar.i = true;
                        if (cbtVar.w) {
                            cbtVarB.j(aomyVarD);
                        } else {
                            cbtVarB.x();
                        }
                        e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                        cev.c(cbtVarB, aonjVar4, new defpackage.cmp(10));
                        cev.c(cbtVarB, aonjVar11, new defpackage.cmp(11));
                        cbtVar.W(true);
                        cbtVar.W(false);
                    }
                    cmwVar3 = cmwVar4;
                    aonjVar7 = aonjVar10;
                    aonjVar8 = aonjVar11;
                } else {
                    cbtVarB.s();
                    cmwVar3 = cmwVar2;
                    aonjVar7 = aonjVar5;
                    aonjVar8 = aonjVar6;
                }
                cdkVarI = cbtVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.dqf(aonjVar, cmwVar3, aonjVar7, aonjVar8, aonjVar4, i, i2, 0);
                }
            }
            i3 |= 384;
            aonjVar5 = aonjVar2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    aonjVar6 = aonjVar3;
                    if (true != cbtVarB.D(aonjVar6)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (true != cbtVarB.D(aonjVar4)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (cbtVarB.H(z, i3 & 1)) {
                    i8 = i3 & 14;
                    if (i11 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        aonjVar5 = null;
                    }
                    if (i6 != 0) {
                        aonjVar9 = a;
                    } else {
                        aonjVar9 = aonjVar6;
                    }
                    cbtVar = cbtVarB;
                    iM = anty.M(cbtVar.x);
                    cmwVarM = cfo.m(cbtVarB, defpackage.rv.j(cmwVar4.a(defpackage.dqm.a)).a(defpackage.dqq.a).a(defpackage.dqo.a));
                    dpfVar = (dpf) cbtVarB.e(dfo.e);
                    dpqVar = (dpq) cbtVarB.e(dfo.j);
                    cjeVarAi = cbtVar.ai();
                    emxVar = (emx) cbtVarB.e(eom.a);
                    giiVar = (gii) cbtVarB.e(gik.a);
                    if (aonjVar5 != null) {
                        cbtVarB.u(1313917368);
                        aomyVarD2 = d(aonjVar, cbtVarB, i8);
                        cbtVarB.v();
                        if (cbtVar.w) {
                            cbtVarB.j(aomyVarD2);
                        } else {
                            cbtVarB.x();
                        }
                        aonjVar10 = aonjVar5;
                        aonjVar11 = aonjVar9;
                        e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                        cev.c(cbtVarB, aonjVar10, new defpackage.cmp(17));
                        cev.c(cbtVarB, aonjVar4, new defpackage.cmp(8));
                        cev.c(cbtVarB, aonjVar11, new defpackage.cmp(9));
                        cbtVar.W(true);
                        cbtVar.W(false);
                    } else {
                        aonjVar10 = aonjVar5;
                        aonjVar11 = aonjVar9;
                        cbtVarB.u(1314774735);
                        aomyVarD = d(aonjVar, cbtVarB, i8);
                        cbtVar.Z(125, (java.lang.Object) null, 1, (java.lang.Object) null);
                        cbtVar.i = true;
                        if (cbtVar.w) {
                            cbtVarB.j(aomyVarD);
                        } else {
                            cbtVarB.x();
                        }
                        e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                        cev.c(cbtVarB, aonjVar4, new defpackage.cmp(10));
                        cev.c(cbtVarB, aonjVar11, new defpackage.cmp(11));
                        cbtVar.W(true);
                        cbtVar.W(false);
                    }
                    cmwVar3 = cmwVar4;
                    aonjVar7 = aonjVar10;
                    aonjVar8 = aonjVar11;
                } else {
                    cbtVarB.s();
                    cmwVar3 = cmwVar2;
                    aonjVar7 = aonjVar5;
                    aonjVar8 = aonjVar6;
                }
                cdkVarI = cbtVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.dqf(aonjVar, cmwVar3, aonjVar7, aonjVar8, aonjVar4, i, i2, 0);
                }
            }
            i3 |= 3072;
            aonjVar6 = aonjVar3;
            if ((i & 24576) == 0) {
                if (true != cbtVarB.D(aonjVar4)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (cbtVarB.H(z, i3 & 1)) {
                i8 = i3 & 14;
                if (i11 != 0) {
                    cmwVar4 = cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    aonjVar5 = null;
                }
                if (i6 != 0) {
                    aonjVar9 = a;
                } else {
                    aonjVar9 = aonjVar6;
                }
                cbtVar = cbtVarB;
                iM = anty.M(cbtVar.x);
                cmwVarM = cfo.m(cbtVarB, defpackage.rv.j(cmwVar4.a(defpackage.dqm.a)).a(defpackage.dqq.a).a(defpackage.dqo.a));
                dpfVar = (dpf) cbtVarB.e(dfo.e);
                dpqVar = (dpq) cbtVarB.e(dfo.j);
                cjeVarAi = cbtVar.ai();
                emxVar = (emx) cbtVarB.e(eom.a);
                giiVar = (gii) cbtVarB.e(gik.a);
                if (aonjVar5 != null) {
                    cbtVarB.u(1313917368);
                    aomyVarD2 = d(aonjVar, cbtVarB, i8);
                    cbtVarB.v();
                    if (cbtVar.w) {
                        cbtVarB.j(aomyVarD2);
                    } else {
                        cbtVarB.x();
                    }
                    aonjVar10 = aonjVar5;
                    aonjVar11 = aonjVar9;
                    e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                    cev.c(cbtVarB, aonjVar10, new defpackage.cmp(17));
                    cev.c(cbtVarB, aonjVar4, new defpackage.cmp(8));
                    cev.c(cbtVarB, aonjVar11, new defpackage.cmp(9));
                    cbtVar.W(true);
                    cbtVar.W(false);
                } else {
                    aonjVar10 = aonjVar5;
                    aonjVar11 = aonjVar9;
                    cbtVarB.u(1314774735);
                    aomyVarD = d(aonjVar, cbtVarB, i8);
                    cbtVar.Z(125, (java.lang.Object) null, 1, (java.lang.Object) null);
                    cbtVar.i = true;
                    if (cbtVar.w) {
                        cbtVarB.j(aomyVarD);
                    } else {
                        cbtVarB.x();
                    }
                    e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                    cev.c(cbtVarB, aonjVar4, new defpackage.cmp(10));
                    cev.c(cbtVarB, aonjVar11, new defpackage.cmp(11));
                    cbtVar.W(true);
                    cbtVar.W(false);
                }
                cmwVar3 = cmwVar4;
                aonjVar7 = aonjVar10;
                aonjVar8 = aonjVar11;
            } else {
                cbtVarB.s();
                cmwVar3 = cmwVar2;
                aonjVar7 = aonjVar5;
                aonjVar8 = aonjVar6;
            }
            cdkVarI = cbtVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.dqf(aonjVar, cmwVar3, aonjVar7, aonjVar8, aonjVar4, i, i2, 0);
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                aonjVar5 = aonjVar2;
                if (true != cbtVarB.D(aonjVar5)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    aonjVar6 = aonjVar3;
                    if (true != cbtVarB.D(aonjVar6)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (true != cbtVarB.D(aonjVar4)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (cbtVarB.H(z, i3 & 1)) {
                    i8 = i3 & 14;
                    if (i11 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        aonjVar5 = null;
                    }
                    if (i6 != 0) {
                        aonjVar9 = a;
                    } else {
                        aonjVar9 = aonjVar6;
                    }
                    cbtVar = cbtVarB;
                    iM = anty.M(cbtVar.x);
                    cmwVarM = cfo.m(cbtVarB, defpackage.rv.j(cmwVar4.a(defpackage.dqm.a)).a(defpackage.dqq.a).a(defpackage.dqo.a));
                    dpfVar = (dpf) cbtVarB.e(dfo.e);
                    dpqVar = (dpq) cbtVarB.e(dfo.j);
                    cjeVarAi = cbtVar.ai();
                    emxVar = (emx) cbtVarB.e(eom.a);
                    giiVar = (gii) cbtVarB.e(gik.a);
                    if (aonjVar5 != null) {
                        cbtVarB.u(1313917368);
                        aomyVarD2 = d(aonjVar, cbtVarB, i8);
                        cbtVarB.v();
                        if (cbtVar.w) {
                            cbtVarB.j(aomyVarD2);
                        } else {
                            cbtVarB.x();
                        }
                        aonjVar10 = aonjVar5;
                        aonjVar11 = aonjVar9;
                        e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                        cev.c(cbtVarB, aonjVar10, new defpackage.cmp(17));
                        cev.c(cbtVarB, aonjVar4, new defpackage.cmp(8));
                        cev.c(cbtVarB, aonjVar11, new defpackage.cmp(9));
                        cbtVar.W(true);
                        cbtVar.W(false);
                    } else {
                        aonjVar10 = aonjVar5;
                        aonjVar11 = aonjVar9;
                        cbtVarB.u(1314774735);
                        aomyVarD = d(aonjVar, cbtVarB, i8);
                        cbtVar.Z(125, (java.lang.Object) null, 1, (java.lang.Object) null);
                        cbtVar.i = true;
                        if (cbtVar.w) {
                            cbtVarB.j(aomyVarD);
                        } else {
                            cbtVarB.x();
                        }
                        e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                        cev.c(cbtVarB, aonjVar4, new defpackage.cmp(10));
                        cev.c(cbtVarB, aonjVar11, new defpackage.cmp(11));
                        cbtVar.W(true);
                        cbtVar.W(false);
                    }
                    cmwVar3 = cmwVar4;
                    aonjVar7 = aonjVar10;
                    aonjVar8 = aonjVar11;
                } else {
                    cbtVarB.s();
                    cmwVar3 = cmwVar2;
                    aonjVar7 = aonjVar5;
                    aonjVar8 = aonjVar6;
                }
                cdkVarI = cbtVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.dqf(aonjVar, cmwVar3, aonjVar7, aonjVar8, aonjVar4, i, i2, 0);
                }
            }
            i3 |= 3072;
            aonjVar6 = aonjVar3;
            if ((i & 24576) == 0) {
                if (true != cbtVarB.D(aonjVar4)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (cbtVarB.H(z, i3 & 1)) {
                i8 = i3 & 14;
                if (i11 != 0) {
                    cmwVar4 = cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    aonjVar5 = null;
                }
                if (i6 != 0) {
                    aonjVar9 = a;
                } else {
                    aonjVar9 = aonjVar6;
                }
                cbtVar = cbtVarB;
                iM = anty.M(cbtVar.x);
                cmwVarM = cfo.m(cbtVarB, defpackage.rv.j(cmwVar4.a(defpackage.dqm.a)).a(defpackage.dqq.a).a(defpackage.dqo.a));
                dpfVar = (dpf) cbtVarB.e(dfo.e);
                dpqVar = (dpq) cbtVarB.e(dfo.j);
                cjeVarAi = cbtVar.ai();
                emxVar = (emx) cbtVarB.e(eom.a);
                giiVar = (gii) cbtVarB.e(gik.a);
                if (aonjVar5 != null) {
                    cbtVarB.u(1313917368);
                    aomyVarD2 = d(aonjVar, cbtVarB, i8);
                    cbtVarB.v();
                    if (cbtVar.w) {
                        cbtVarB.j(aomyVarD2);
                    } else {
                        cbtVarB.x();
                    }
                    aonjVar10 = aonjVar5;
                    aonjVar11 = aonjVar9;
                    e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                    cev.c(cbtVarB, aonjVar10, new defpackage.cmp(17));
                    cev.c(cbtVarB, aonjVar4, new defpackage.cmp(8));
                    cev.c(cbtVarB, aonjVar11, new defpackage.cmp(9));
                    cbtVar.W(true);
                    cbtVar.W(false);
                } else {
                    aonjVar10 = aonjVar5;
                    aonjVar11 = aonjVar9;
                    cbtVarB.u(1314774735);
                    aomyVarD = d(aonjVar, cbtVarB, i8);
                    cbtVar.Z(125, (java.lang.Object) null, 1, (java.lang.Object) null);
                    cbtVar.i = true;
                    if (cbtVar.w) {
                        cbtVarB.j(aomyVarD);
                    } else {
                        cbtVarB.x();
                    }
                    e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                    cev.c(cbtVarB, aonjVar4, new defpackage.cmp(10));
                    cev.c(cbtVarB, aonjVar11, new defpackage.cmp(11));
                    cbtVar.W(true);
                    cbtVar.W(false);
                }
                cmwVar3 = cmwVar4;
                aonjVar7 = aonjVar10;
                aonjVar8 = aonjVar11;
            } else {
                cbtVarB.s();
                cmwVar3 = cmwVar2;
                aonjVar7 = aonjVar5;
                aonjVar8 = aonjVar6;
            }
            cdkVarI = cbtVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.dqf(aonjVar, cmwVar3, aonjVar7, aonjVar8, aonjVar4, i, i2, 0);
            }
        }
        i3 |= 384;
        aonjVar5 = aonjVar2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                aonjVar6 = aonjVar3;
                if (true != cbtVarB.D(aonjVar6)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (true != cbtVarB.D(aonjVar4)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (cbtVarB.H(z, i3 & 1)) {
                i8 = i3 & 14;
                if (i11 != 0) {
                    cmwVar4 = cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    aonjVar5 = null;
                }
                if (i6 != 0) {
                    aonjVar9 = a;
                } else {
                    aonjVar9 = aonjVar6;
                }
                cbtVar = cbtVarB;
                iM = anty.M(cbtVar.x);
                cmwVarM = cfo.m(cbtVarB, defpackage.rv.j(cmwVar4.a(defpackage.dqm.a)).a(defpackage.dqq.a).a(defpackage.dqo.a));
                dpfVar = (dpf) cbtVarB.e(dfo.e);
                dpqVar = (dpq) cbtVarB.e(dfo.j);
                cjeVarAi = cbtVar.ai();
                emxVar = (emx) cbtVarB.e(eom.a);
                giiVar = (gii) cbtVarB.e(gik.a);
                if (aonjVar5 != null) {
                    cbtVarB.u(1313917368);
                    aomyVarD2 = d(aonjVar, cbtVarB, i8);
                    cbtVarB.v();
                    if (cbtVar.w) {
                        cbtVarB.j(aomyVarD2);
                    } else {
                        cbtVarB.x();
                    }
                    aonjVar10 = aonjVar5;
                    aonjVar11 = aonjVar9;
                    e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                    cev.c(cbtVarB, aonjVar10, new defpackage.cmp(17));
                    cev.c(cbtVarB, aonjVar4, new defpackage.cmp(8));
                    cev.c(cbtVarB, aonjVar11, new defpackage.cmp(9));
                    cbtVar.W(true);
                    cbtVar.W(false);
                } else {
                    aonjVar10 = aonjVar5;
                    aonjVar11 = aonjVar9;
                    cbtVarB.u(1314774735);
                    aomyVarD = d(aonjVar, cbtVarB, i8);
                    cbtVar.Z(125, (java.lang.Object) null, 1, (java.lang.Object) null);
                    cbtVar.i = true;
                    if (cbtVar.w) {
                        cbtVarB.j(aomyVarD);
                    } else {
                        cbtVarB.x();
                    }
                    e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                    cev.c(cbtVarB, aonjVar4, new defpackage.cmp(10));
                    cev.c(cbtVarB, aonjVar11, new defpackage.cmp(11));
                    cbtVar.W(true);
                    cbtVar.W(false);
                }
                cmwVar3 = cmwVar4;
                aonjVar7 = aonjVar10;
                aonjVar8 = aonjVar11;
            } else {
                cbtVarB.s();
                cmwVar3 = cmwVar2;
                aonjVar7 = aonjVar5;
                aonjVar8 = aonjVar6;
            }
            cdkVarI = cbtVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.dqf(aonjVar, cmwVar3, aonjVar7, aonjVar8, aonjVar4, i, i2, 0);
            }
        }
        i3 |= 3072;
        aonjVar6 = aonjVar3;
        if ((i & 24576) == 0) {
            if (true != cbtVarB.D(aonjVar4)) {
                i9 = 8192;
            } else {
                i9 = 16384;
            }
            i3 |= i9;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (cbtVarB.H(z, i3 & 1)) {
            i8 = i3 & 14;
            if (i11 != 0) {
                cmwVar4 = cmw.c;
            } else {
                cmwVar4 = cmwVar2;
            }
            if (i4 != 0) {
                aonjVar5 = null;
            }
            if (i6 != 0) {
                aonjVar9 = a;
            } else {
                aonjVar9 = aonjVar6;
            }
            cbtVar = cbtVarB;
            iM = anty.M(cbtVar.x);
            cmwVarM = cfo.m(cbtVarB, defpackage.rv.j(cmwVar4.a(defpackage.dqm.a)).a(defpackage.dqq.a).a(defpackage.dqo.a));
            dpfVar = (dpf) cbtVarB.e(dfo.e);
            dpqVar = (dpq) cbtVarB.e(dfo.j);
            cjeVarAi = cbtVar.ai();
            emxVar = (emx) cbtVarB.e(eom.a);
            giiVar = (gii) cbtVarB.e(gik.a);
            if (aonjVar5 != null) {
                cbtVarB.u(1313917368);
                aomyVarD2 = d(aonjVar, cbtVarB, i8);
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVarD2);
                } else {
                    cbtVarB.x();
                }
                aonjVar10 = aonjVar5;
                aonjVar11 = aonjVar9;
                e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                cev.c(cbtVarB, aonjVar10, new defpackage.cmp(17));
                cev.c(cbtVarB, aonjVar4, new defpackage.cmp(8));
                cev.c(cbtVarB, aonjVar11, new defpackage.cmp(9));
                cbtVar.W(true);
                cbtVar.W(false);
            } else {
                aonjVar10 = aonjVar5;
                aonjVar11 = aonjVar9;
                cbtVarB.u(1314774735);
                aomyVarD = d(aonjVar, cbtVarB, i8);
                cbtVar.Z(125, (java.lang.Object) null, 1, (java.lang.Object) null);
                cbtVar.i = true;
                if (cbtVar.w) {
                    cbtVarB.j(aomyVarD);
                } else {
                    cbtVarB.x();
                }
                e(cbtVarB, cmwVarM, iM, dpfVar, emxVar, giiVar, dpqVar, cjeVarAi);
                cev.c(cbtVarB, aonjVar4, new defpackage.cmp(10));
                cev.c(cbtVarB, aonjVar11, new defpackage.cmp(11));
                cbtVar.W(true);
                cbtVar.W(false);
            }
            cmwVar3 = cmwVar4;
            aonjVar7 = aonjVar10;
            aonjVar8 = aonjVar11;
        } else {
            cbtVarB.s();
            cmwVar3 = cmwVar2;
            aonjVar7 = aonjVar5;
            aonjVar8 = aonjVar6;
        }
        cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqf(aonjVar, cmwVar3, aonjVar7, aonjVar8, aonjVar4, i, i2, 0);
        }
    }

    public static final defpackage.dqc c(dbk dbkVar) {
        defpackage.dqc dqcVar = dbkVar.l;
        if (dqcVar != null) {
            return dqcVar;
        }
        cwh.b("Required value was null.");
        throw new aoiq();
    }

    private static final aomy d(final aonj aonjVar, cav cavVar, int i) {
        cbt cbtVar = (cbt) cavVar;
        final int iM = anty.M(cbtVar.x);
        final android.content.Context context = (android.content.Context) cavVar.e(dep.b);
        final caz cazVarC = cavVar.c();
        final cjx cjxVar = (cjx) cavVar.e(cjz.a);
        final android.view.View view = (android.view.View) cavVar.e(dep.f);
        boolean zD = cavVar.D(context);
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !cavVar.B(aonjVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zD2 = zD | z | cavVar.D(cazVarC) | cavVar.D(cjxVar) | cavVar.z(iM) | cavVar.D(view);
        java.lang.Object objR = cbtVar.R();
        if (zD2 || objR == cau.a) {
            aomy aomyVar = new aomy() { // from class: dqh
                public final java.lang.Object a() {
                    dcv dcvVar = view;
                    aooh.d(dcvVar, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
                    aonj aonjVar2 = aonjVar;
                    android.content.Context context2 = context;
                    dcv dcvVar2 = dcvVar;
                    return new defpackage.dqc(context2, cazVarC, (android.view.View) aonjVar2.a(context2), new cuq(), cjxVar, iM, dcvVar2).x;
                }
            };
            cbtVar.ab(aomyVar);
            objR = aomyVar;
        }
        return (aomy) objR;
    }

    private static final void e(cav cavVar, cmw cmwVar, int i, dpf dpfVar, emx emxVar, gii giiVar, dpq dpqVar, cje cjeVar) {
        cev.c(cavVar, cjeVar, dam.d);
        cev.c(cavVar, cmwVar, new defpackage.cmp(12));
        cev.c(cavVar, dpfVar, new defpackage.cmp(13));
        cev.c(cavVar, emxVar, new defpackage.cmp(14));
        cev.c(cavVar, giiVar, new defpackage.cmp(15));
        cev.c(cavVar, dpqVar, new defpackage.cmp(16));
        cev.c(cavVar, java.lang.Integer.valueOf(i), dam.f);
    }
}
