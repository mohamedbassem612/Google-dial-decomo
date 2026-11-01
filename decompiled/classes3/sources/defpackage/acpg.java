package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acpg {
    public static final /* synthetic */ int a = 0;

    static {
        new ajb(0.8f, 0.0f, 0.8f, 0.15f);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014f  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0103  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:97:0x0125  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    public static final void a(aonn aonnVar, cmw cmwVar, aonn aonnVar2, aono aonoVar, float f, azz azzVar, bwk bwkVar, cav cavVar, int i, int i2) {
        int i3;
        cmw cmwVar2;
        int i4;
        aonn aonnVar3;
        int i5;
        int i6;
        aono aonoVar2;
        int i7;
        int i8;
        float f2;
        int i9;
        azz azzVarAP;
        int i10;
        boolean z;
        cav cavVar2;
        cmw cmwVar3;
        aonn aonnVar4;
        aono aonoVar3;
        float f3;
        azz azzVar2;
        cdk cdkVarI;
        int i11;
        cmw cmwVar4;
        float f4;
        aono aonoVar4;
        cmw cmwVar5;
        int i12;
        int i13;
        int i14;
        int i15 = i & 6;
        cav cavVarB = cavVar.b(1410331364);
        if (i15 == 0) {
            i3 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    aonnVar3 = aonnVar2;
                    if (true != cavVarB.D(aonnVar3)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        aonoVar2 = aonoVar;
                        if (true != cavVarB.D(aonoVar2)) {
                            i7 = 1024;
                        } else {
                            i7 = 2048;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            f2 = f;
                            if (true != cavVarB.y(f2)) {
                                i9 = 8192;
                            } else {
                                i9 = 16384;
                            }
                            i3 |= i9;
                        }
                        if ((196608 & i) == 0) {
                            i14 = 65536;
                            if ((i2 & 32) == 0) {
                                azzVarAP = azzVar;
                                if (cavVarB.B(azzVarAP)) {
                                    i14 = 131072;
                                }
                            } else {
                                azzVarAP = azzVar;
                            }
                            i3 |= i14;
                        } else {
                            azzVarAP = azzVar;
                        }
                        if ((1572864 & i) == 0) {
                            if (true != cavVarB.B(bwkVar)) {
                                i13 = 524288;
                            } else {
                                i13 = 1048576;
                            }
                            i3 |= i13;
                        }
                        i10 = i3 | 12582912;
                        if ((4793491 & i10) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cavVarB.H(z, i10 & 1)) {
                            i11 = i2 & 32;
                            cavVar2 = cavVarB;
                            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                            if ((i & 1) != 0 || cavVar2.E()) {
                                if (i16 != 0) {
                                    cmwVar4 = cmw.c;
                                } else {
                                    cmwVar4 = cmwVar2;
                                }
                                if (i4 != 0) {
                                    aonnVar3 = defpackage.acpt.a;
                                }
                                if (i6 != 0) {
                                    aonoVar2 = defpackage.acpt.b;
                                }
                                if (i8 != 0) {
                                    f2 = 64.0f;
                                }
                                if (i11 != 0) {
                                    azzVarAP = afsq.aP(cavVar2);
                                    aonnVar3 = aonnVar3;
                                    f4 = f2;
                                    aonoVar4 = aonoVar2;
                                    cmwVar5 = cmwVar4;
                                    i12 = i10 & (-458753);
                                } else {
                                    aonnVar3 = aonnVar3;
                                    azzVarAP = azzVarAP;
                                    f4 = f2;
                                    aonoVar4 = aonoVar2;
                                    cmwVar5 = cmwVar4;
                                    i12 = i10;
                                }
                            } else {
                                cavVar2.s();
                                i12 = i11 != 0 ? i10 & (-458753) : i10;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar2;
                            }
                            cavVar2.l();
                            bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                            cmwVar3 = cmwVar5;
                            aonnVar4 = aonnVar3;
                            aonoVar3 = aonoVar4;
                            f3 = f4;
                            azzVar2 = azzVarAP;
                        } else {
                            cavVar2 = cavVarB;
                            cavVar2.s();
                            cmwVar3 = cmwVar2;
                            aonnVar4 = aonnVar3;
                            aonoVar3 = aonoVar2;
                            f3 = f2;
                            azzVar2 = azzVarAP;
                        }
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
                        }
                    }
                    i3 |= 24576;
                    f2 = f;
                    if ((196608 & i) == 0) {
                        i14 = 65536;
                        if ((i2 & 32) == 0) {
                            azzVarAP = azzVar;
                            if (cavVarB.B(azzVarAP)) {
                                i14 = 131072;
                            }
                        } else {
                            azzVarAP = azzVar;
                        }
                        i3 |= i14;
                    } else {
                        azzVarAP = azzVar;
                    }
                    if ((1572864 & i) == 0) {
                        if (true != cavVarB.B(bwkVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 |= i13;
                    }
                    i10 = i3 | 12582912;
                    if ((4793491 & i10) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i10 & 1)) {
                        i11 = i2 & 32;
                        cavVar2 = cavVarB;
                        ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                cmwVar4 = cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i4 != 0) {
                                aonnVar3 = defpackage.acpt.a;
                            }
                            if (i6 != 0) {
                                aonoVar2 = defpackage.acpt.b;
                            }
                            if (i8 != 0) {
                                f2 = 64.0f;
                            }
                            if (i11 != 0) {
                                azzVarAP = afsq.aP(cavVar2);
                                aonnVar3 = aonnVar3;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10 & (-458753);
                            } else {
                                aonnVar3 = aonnVar3;
                                azzVarAP = azzVarAP;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10;
                            }
                        } else {
                            if (i16 != 0) {
                                cmwVar4 = cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i4 != 0) {
                                aonnVar3 = defpackage.acpt.a;
                            }
                            if (i6 != 0) {
                                aonoVar2 = defpackage.acpt.b;
                            }
                            if (i8 != 0) {
                                f2 = 64.0f;
                            }
                            if (i11 != 0) {
                                azzVarAP = afsq.aP(cavVar2);
                                aonnVar3 = aonnVar3;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10 & (-458753);
                            } else {
                                aonnVar3 = aonnVar3;
                                azzVarAP = azzVarAP;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10;
                            }
                        }
                        cavVar2.l();
                        bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                        cmwVar3 = cmwVar5;
                        aonnVar4 = aonnVar3;
                        aonoVar3 = aonoVar4;
                        f3 = f4;
                        azzVar2 = azzVarAP;
                    } else {
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        cmwVar3 = cmwVar2;
                        aonnVar4 = aonnVar3;
                        aonoVar3 = aonoVar2;
                        f3 = f2;
                        azzVar2 = azzVarAP;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
                    }
                }
                i3 |= 3072;
                aonoVar2 = aonoVar;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        f2 = f;
                        if (true != cavVarB.y(f2)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        i14 = 65536;
                        if ((i2 & 32) == 0) {
                            azzVarAP = azzVar;
                            if (cavVarB.B(azzVarAP)) {
                                i14 = 131072;
                            }
                        } else {
                            azzVarAP = azzVar;
                        }
                        i3 |= i14;
                    } else {
                        azzVarAP = azzVar;
                    }
                    if ((1572864 & i) == 0) {
                        if (true != cavVarB.B(bwkVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 |= i13;
                    }
                    i10 = i3 | 12582912;
                    if ((4793491 & i10) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i10 & 1)) {
                        i11 = i2 & 32;
                        cavVar2 = cavVarB;
                        ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                cmwVar4 = cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i4 != 0) {
                                aonnVar3 = defpackage.acpt.a;
                            }
                            if (i6 != 0) {
                                aonoVar2 = defpackage.acpt.b;
                            }
                            if (i8 != 0) {
                                f2 = 64.0f;
                            }
                            if (i11 != 0) {
                                azzVarAP = afsq.aP(cavVar2);
                                aonnVar3 = aonnVar3;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10 & (-458753);
                            } else {
                                aonnVar3 = aonnVar3;
                                azzVarAP = azzVarAP;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10;
                            }
                        } else {
                            if (i16 != 0) {
                                cmwVar4 = cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i4 != 0) {
                                aonnVar3 = defpackage.acpt.a;
                            }
                            if (i6 != 0) {
                                aonoVar2 = defpackage.acpt.b;
                            }
                            if (i8 != 0) {
                                f2 = 64.0f;
                            }
                            if (i11 != 0) {
                                azzVarAP = afsq.aP(cavVar2);
                                aonnVar3 = aonnVar3;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10 & (-458753);
                            } else {
                                aonnVar3 = aonnVar3;
                                azzVarAP = azzVarAP;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10;
                            }
                        }
                        cavVar2.l();
                        bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                        cmwVar3 = cmwVar5;
                        aonnVar4 = aonnVar3;
                        aonoVar3 = aonoVar4;
                        f3 = f4;
                        azzVar2 = azzVarAP;
                    } else {
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        cmwVar3 = cmwVar2;
                        aonnVar4 = aonnVar3;
                        aonoVar3 = aonoVar2;
                        f3 = f2;
                        azzVar2 = azzVarAP;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
                    }
                }
                i3 |= 24576;
                f2 = f;
                if ((196608 & i) == 0) {
                    i14 = 65536;
                    if ((i2 & 32) == 0) {
                        azzVarAP = azzVar;
                        if (cavVarB.B(azzVarAP)) {
                            i14 = 131072;
                        }
                    } else {
                        azzVarAP = azzVar;
                    }
                    i3 |= i14;
                } else {
                    azzVarAP = azzVar;
                }
                if ((1572864 & i) == 0) {
                    if (true != cavVarB.B(bwkVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 |= i13;
                }
                i10 = i3 | 12582912;
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i10 & 1)) {
                    i11 = i2 & 32;
                    cavVar2 = cavVarB;
                    ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonnVar3 = defpackage.acpt.a;
                        }
                        if (i6 != 0) {
                            aonoVar2 = defpackage.acpt.b;
                        }
                        if (i8 != 0) {
                            f2 = 64.0f;
                        }
                        if (i11 != 0) {
                            azzVarAP = afsq.aP(cavVar2);
                            aonnVar3 = aonnVar3;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10 & (-458753);
                        } else {
                            aonnVar3 = aonnVar3;
                            azzVarAP = azzVarAP;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10;
                        }
                    } else {
                        if (i16 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonnVar3 = defpackage.acpt.a;
                        }
                        if (i6 != 0) {
                            aonoVar2 = defpackage.acpt.b;
                        }
                        if (i8 != 0) {
                            f2 = 64.0f;
                        }
                        if (i11 != 0) {
                            azzVarAP = afsq.aP(cavVar2);
                            aonnVar3 = aonnVar3;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10 & (-458753);
                        } else {
                            aonnVar3 = aonnVar3;
                            azzVarAP = azzVarAP;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10;
                        }
                    }
                    cavVar2.l();
                    bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                    cmwVar3 = cmwVar5;
                    aonnVar4 = aonnVar3;
                    aonoVar3 = aonoVar4;
                    f3 = f4;
                    azzVar2 = azzVarAP;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cmwVar3 = cmwVar2;
                    aonnVar4 = aonnVar3;
                    aonoVar3 = aonoVar2;
                    f3 = f2;
                    azzVar2 = azzVarAP;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
                }
            }
            i3 |= 384;
            aonnVar3 = aonnVar2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    aonoVar2 = aonoVar;
                    if (true != cavVarB.D(aonoVar2)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        f2 = f;
                        if (true != cavVarB.y(f2)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        i14 = 65536;
                        if ((i2 & 32) == 0) {
                            azzVarAP = azzVar;
                            if (cavVarB.B(azzVarAP)) {
                                i14 = 131072;
                            }
                        } else {
                            azzVarAP = azzVar;
                        }
                        i3 |= i14;
                    } else {
                        azzVarAP = azzVar;
                    }
                    if ((1572864 & i) == 0) {
                        if (true != cavVarB.B(bwkVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 |= i13;
                    }
                    i10 = i3 | 12582912;
                    if ((4793491 & i10) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i10 & 1)) {
                        i11 = i2 & 32;
                        cavVar2 = cavVarB;
                        ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                cmwVar4 = cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i4 != 0) {
                                aonnVar3 = defpackage.acpt.a;
                            }
                            if (i6 != 0) {
                                aonoVar2 = defpackage.acpt.b;
                            }
                            if (i8 != 0) {
                                f2 = 64.0f;
                            }
                            if (i11 != 0) {
                                azzVarAP = afsq.aP(cavVar2);
                                aonnVar3 = aonnVar3;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10 & (-458753);
                            } else {
                                aonnVar3 = aonnVar3;
                                azzVarAP = azzVarAP;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10;
                            }
                        } else {
                            if (i16 != 0) {
                                cmwVar4 = cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i4 != 0) {
                                aonnVar3 = defpackage.acpt.a;
                            }
                            if (i6 != 0) {
                                aonoVar2 = defpackage.acpt.b;
                            }
                            if (i8 != 0) {
                                f2 = 64.0f;
                            }
                            if (i11 != 0) {
                                azzVarAP = afsq.aP(cavVar2);
                                aonnVar3 = aonnVar3;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10 & (-458753);
                            } else {
                                aonnVar3 = aonnVar3;
                                azzVarAP = azzVarAP;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10;
                            }
                        }
                        cavVar2.l();
                        bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                        cmwVar3 = cmwVar5;
                        aonnVar4 = aonnVar3;
                        aonoVar3 = aonoVar4;
                        f3 = f4;
                        azzVar2 = azzVarAP;
                    } else {
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        cmwVar3 = cmwVar2;
                        aonnVar4 = aonnVar3;
                        aonoVar3 = aonoVar2;
                        f3 = f2;
                        azzVar2 = azzVarAP;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
                    }
                }
                i3 |= 24576;
                f2 = f;
                if ((196608 & i) == 0) {
                    i14 = 65536;
                    if ((i2 & 32) == 0) {
                        azzVarAP = azzVar;
                        if (cavVarB.B(azzVarAP)) {
                            i14 = 131072;
                        }
                    } else {
                        azzVarAP = azzVar;
                    }
                    i3 |= i14;
                } else {
                    azzVarAP = azzVar;
                }
                if ((1572864 & i) == 0) {
                    if (true != cavVarB.B(bwkVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 |= i13;
                }
                i10 = i3 | 12582912;
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i10 & 1)) {
                    i11 = i2 & 32;
                    cavVar2 = cavVarB;
                    ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonnVar3 = defpackage.acpt.a;
                        }
                        if (i6 != 0) {
                            aonoVar2 = defpackage.acpt.b;
                        }
                        if (i8 != 0) {
                            f2 = 64.0f;
                        }
                        if (i11 != 0) {
                            azzVarAP = afsq.aP(cavVar2);
                            aonnVar3 = aonnVar3;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10 & (-458753);
                        } else {
                            aonnVar3 = aonnVar3;
                            azzVarAP = azzVarAP;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10;
                        }
                    } else {
                        if (i16 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonnVar3 = defpackage.acpt.a;
                        }
                        if (i6 != 0) {
                            aonoVar2 = defpackage.acpt.b;
                        }
                        if (i8 != 0) {
                            f2 = 64.0f;
                        }
                        if (i11 != 0) {
                            azzVarAP = afsq.aP(cavVar2);
                            aonnVar3 = aonnVar3;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10 & (-458753);
                        } else {
                            aonnVar3 = aonnVar3;
                            azzVarAP = azzVarAP;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10;
                        }
                    }
                    cavVar2.l();
                    bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                    cmwVar3 = cmwVar5;
                    aonnVar4 = aonnVar3;
                    aonoVar3 = aonoVar4;
                    f3 = f4;
                    azzVar2 = azzVarAP;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cmwVar3 = cmwVar2;
                    aonnVar4 = aonnVar3;
                    aonoVar3 = aonoVar2;
                    f3 = f2;
                    azzVar2 = azzVarAP;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
                }
            }
            i3 |= 3072;
            aonoVar2 = aonoVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (true != cavVarB.y(f2)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    i14 = 65536;
                    if ((i2 & 32) == 0) {
                        azzVarAP = azzVar;
                        if (cavVarB.B(azzVarAP)) {
                            i14 = 131072;
                        }
                    } else {
                        azzVarAP = azzVar;
                    }
                    i3 |= i14;
                } else {
                    azzVarAP = azzVar;
                }
                if ((1572864 & i) == 0) {
                    if (true != cavVarB.B(bwkVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 |= i13;
                }
                i10 = i3 | 12582912;
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i10 & 1)) {
                    i11 = i2 & 32;
                    cavVar2 = cavVarB;
                    ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonnVar3 = defpackage.acpt.a;
                        }
                        if (i6 != 0) {
                            aonoVar2 = defpackage.acpt.b;
                        }
                        if (i8 != 0) {
                            f2 = 64.0f;
                        }
                        if (i11 != 0) {
                            azzVarAP = afsq.aP(cavVar2);
                            aonnVar3 = aonnVar3;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10 & (-458753);
                        } else {
                            aonnVar3 = aonnVar3;
                            azzVarAP = azzVarAP;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10;
                        }
                    } else {
                        if (i16 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonnVar3 = defpackage.acpt.a;
                        }
                        if (i6 != 0) {
                            aonoVar2 = defpackage.acpt.b;
                        }
                        if (i8 != 0) {
                            f2 = 64.0f;
                        }
                        if (i11 != 0) {
                            azzVarAP = afsq.aP(cavVar2);
                            aonnVar3 = aonnVar3;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10 & (-458753);
                        } else {
                            aonnVar3 = aonnVar3;
                            azzVarAP = azzVarAP;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10;
                        }
                    }
                    cavVar2.l();
                    bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                    cmwVar3 = cmwVar5;
                    aonnVar4 = aonnVar3;
                    aonoVar3 = aonoVar4;
                    f3 = f4;
                    azzVar2 = azzVarAP;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cmwVar3 = cmwVar2;
                    aonnVar4 = aonnVar3;
                    aonoVar3 = aonoVar2;
                    f3 = f2;
                    azzVar2 = azzVarAP;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
                }
            }
            i3 |= 24576;
            f2 = f;
            if ((196608 & i) == 0) {
                i14 = 65536;
                if ((i2 & 32) == 0) {
                    azzVarAP = azzVar;
                    if (cavVarB.B(azzVarAP)) {
                        i14 = 131072;
                    }
                } else {
                    azzVarAP = azzVar;
                }
                i3 |= i14;
            } else {
                azzVarAP = azzVar;
            }
            if ((1572864 & i) == 0) {
                if (true != cavVarB.B(bwkVar)) {
                    i13 = 524288;
                } else {
                    i13 = 1048576;
                }
                i3 |= i13;
            }
            i10 = i3 | 12582912;
            if ((4793491 & i10) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i10 & 1)) {
                i11 = i2 & 32;
                cavVar2 = cavVarB;
                ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        aonnVar3 = defpackage.acpt.a;
                    }
                    if (i6 != 0) {
                        aonoVar2 = defpackage.acpt.b;
                    }
                    if (i8 != 0) {
                        f2 = 64.0f;
                    }
                    if (i11 != 0) {
                        azzVarAP = afsq.aP(cavVar2);
                        aonnVar3 = aonnVar3;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10 & (-458753);
                    } else {
                        aonnVar3 = aonnVar3;
                        azzVarAP = azzVarAP;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10;
                    }
                } else {
                    if (i16 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        aonnVar3 = defpackage.acpt.a;
                    }
                    if (i6 != 0) {
                        aonoVar2 = defpackage.acpt.b;
                    }
                    if (i8 != 0) {
                        f2 = 64.0f;
                    }
                    if (i11 != 0) {
                        azzVarAP = afsq.aP(cavVar2);
                        aonnVar3 = aonnVar3;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10 & (-458753);
                    } else {
                        aonnVar3 = aonnVar3;
                        azzVarAP = azzVarAP;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10;
                    }
                }
                cavVar2.l();
                bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                cmwVar3 = cmwVar5;
                aonnVar4 = aonnVar3;
                aonoVar3 = aonoVar4;
                f3 = f4;
                azzVar2 = azzVarAP;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                cmwVar3 = cmwVar2;
                aonnVar4 = aonnVar3;
                aonoVar3 = aonoVar2;
                f3 = f2;
                azzVar2 = azzVarAP;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                aonnVar3 = aonnVar2;
                if (true != cavVarB.D(aonnVar3)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    aonoVar2 = aonoVar;
                    if (true != cavVarB.D(aonoVar2)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        f2 = f;
                        if (true != cavVarB.y(f2)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        i14 = 65536;
                        if ((i2 & 32) == 0) {
                            azzVarAP = azzVar;
                            if (cavVarB.B(azzVarAP)) {
                                i14 = 131072;
                            }
                        } else {
                            azzVarAP = azzVar;
                        }
                        i3 |= i14;
                    } else {
                        azzVarAP = azzVar;
                    }
                    if ((1572864 & i) == 0) {
                        if (true != cavVarB.B(bwkVar)) {
                            i13 = 524288;
                        } else {
                            i13 = 1048576;
                        }
                        i3 |= i13;
                    }
                    i10 = i3 | 12582912;
                    if ((4793491 & i10) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i10 & 1)) {
                        i11 = i2 & 32;
                        cavVar2 = cavVarB;
                        ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                cmwVar4 = cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i4 != 0) {
                                aonnVar3 = defpackage.acpt.a;
                            }
                            if (i6 != 0) {
                                aonoVar2 = defpackage.acpt.b;
                            }
                            if (i8 != 0) {
                                f2 = 64.0f;
                            }
                            if (i11 != 0) {
                                azzVarAP = afsq.aP(cavVar2);
                                aonnVar3 = aonnVar3;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10 & (-458753);
                            } else {
                                aonnVar3 = aonnVar3;
                                azzVarAP = azzVarAP;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10;
                            }
                        } else {
                            if (i16 != 0) {
                                cmwVar4 = cmw.c;
                            } else {
                                cmwVar4 = cmwVar2;
                            }
                            if (i4 != 0) {
                                aonnVar3 = defpackage.acpt.a;
                            }
                            if (i6 != 0) {
                                aonoVar2 = defpackage.acpt.b;
                            }
                            if (i8 != 0) {
                                f2 = 64.0f;
                            }
                            if (i11 != 0) {
                                azzVarAP = afsq.aP(cavVar2);
                                aonnVar3 = aonnVar3;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10 & (-458753);
                            } else {
                                aonnVar3 = aonnVar3;
                                azzVarAP = azzVarAP;
                                f4 = f2;
                                aonoVar4 = aonoVar2;
                                cmwVar5 = cmwVar4;
                                i12 = i10;
                            }
                        }
                        cavVar2.l();
                        bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                        cmwVar3 = cmwVar5;
                        aonnVar4 = aonnVar3;
                        aonoVar3 = aonoVar4;
                        f3 = f4;
                        azzVar2 = azzVarAP;
                    } else {
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        cmwVar3 = cmwVar2;
                        aonnVar4 = aonnVar3;
                        aonoVar3 = aonoVar2;
                        f3 = f2;
                        azzVar2 = azzVarAP;
                    }
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
                    }
                }
                i3 |= 24576;
                f2 = f;
                if ((196608 & i) == 0) {
                    i14 = 65536;
                    if ((i2 & 32) == 0) {
                        azzVarAP = azzVar;
                        if (cavVarB.B(azzVarAP)) {
                            i14 = 131072;
                        }
                    } else {
                        azzVarAP = azzVar;
                    }
                    i3 |= i14;
                } else {
                    azzVarAP = azzVar;
                }
                if ((1572864 & i) == 0) {
                    if (true != cavVarB.B(bwkVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 |= i13;
                }
                i10 = i3 | 12582912;
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i10 & 1)) {
                    i11 = i2 & 32;
                    cavVar2 = cavVarB;
                    ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonnVar3 = defpackage.acpt.a;
                        }
                        if (i6 != 0) {
                            aonoVar2 = defpackage.acpt.b;
                        }
                        if (i8 != 0) {
                            f2 = 64.0f;
                        }
                        if (i11 != 0) {
                            azzVarAP = afsq.aP(cavVar2);
                            aonnVar3 = aonnVar3;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10 & (-458753);
                        } else {
                            aonnVar3 = aonnVar3;
                            azzVarAP = azzVarAP;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10;
                        }
                    } else {
                        if (i16 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonnVar3 = defpackage.acpt.a;
                        }
                        if (i6 != 0) {
                            aonoVar2 = defpackage.acpt.b;
                        }
                        if (i8 != 0) {
                            f2 = 64.0f;
                        }
                        if (i11 != 0) {
                            azzVarAP = afsq.aP(cavVar2);
                            aonnVar3 = aonnVar3;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10 & (-458753);
                        } else {
                            aonnVar3 = aonnVar3;
                            azzVarAP = azzVarAP;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10;
                        }
                    }
                    cavVar2.l();
                    bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                    cmwVar3 = cmwVar5;
                    aonnVar4 = aonnVar3;
                    aonoVar3 = aonoVar4;
                    f3 = f4;
                    azzVar2 = azzVarAP;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cmwVar3 = cmwVar2;
                    aonnVar4 = aonnVar3;
                    aonoVar3 = aonoVar2;
                    f3 = f2;
                    azzVar2 = azzVarAP;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
                }
            }
            i3 |= 3072;
            aonoVar2 = aonoVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (true != cavVarB.y(f2)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    i14 = 65536;
                    if ((i2 & 32) == 0) {
                        azzVarAP = azzVar;
                        if (cavVarB.B(azzVarAP)) {
                            i14 = 131072;
                        }
                    } else {
                        azzVarAP = azzVar;
                    }
                    i3 |= i14;
                } else {
                    azzVarAP = azzVar;
                }
                if ((1572864 & i) == 0) {
                    if (true != cavVarB.B(bwkVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 |= i13;
                }
                i10 = i3 | 12582912;
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i10 & 1)) {
                    i11 = i2 & 32;
                    cavVar2 = cavVarB;
                    ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonnVar3 = defpackage.acpt.a;
                        }
                        if (i6 != 0) {
                            aonoVar2 = defpackage.acpt.b;
                        }
                        if (i8 != 0) {
                            f2 = 64.0f;
                        }
                        if (i11 != 0) {
                            azzVarAP = afsq.aP(cavVar2);
                            aonnVar3 = aonnVar3;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10 & (-458753);
                        } else {
                            aonnVar3 = aonnVar3;
                            azzVarAP = azzVarAP;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10;
                        }
                    } else {
                        if (i16 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonnVar3 = defpackage.acpt.a;
                        }
                        if (i6 != 0) {
                            aonoVar2 = defpackage.acpt.b;
                        }
                        if (i8 != 0) {
                            f2 = 64.0f;
                        }
                        if (i11 != 0) {
                            azzVarAP = afsq.aP(cavVar2);
                            aonnVar3 = aonnVar3;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10 & (-458753);
                        } else {
                            aonnVar3 = aonnVar3;
                            azzVarAP = azzVarAP;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10;
                        }
                    }
                    cavVar2.l();
                    bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                    cmwVar3 = cmwVar5;
                    aonnVar4 = aonnVar3;
                    aonoVar3 = aonoVar4;
                    f3 = f4;
                    azzVar2 = azzVarAP;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cmwVar3 = cmwVar2;
                    aonnVar4 = aonnVar3;
                    aonoVar3 = aonoVar2;
                    f3 = f2;
                    azzVar2 = azzVarAP;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
                }
            }
            i3 |= 24576;
            f2 = f;
            if ((196608 & i) == 0) {
                i14 = 65536;
                if ((i2 & 32) == 0) {
                    azzVarAP = azzVar;
                    if (cavVarB.B(azzVarAP)) {
                        i14 = 131072;
                    }
                } else {
                    azzVarAP = azzVar;
                }
                i3 |= i14;
            } else {
                azzVarAP = azzVar;
            }
            if ((1572864 & i) == 0) {
                if (true != cavVarB.B(bwkVar)) {
                    i13 = 524288;
                } else {
                    i13 = 1048576;
                }
                i3 |= i13;
            }
            i10 = i3 | 12582912;
            if ((4793491 & i10) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i10 & 1)) {
                i11 = i2 & 32;
                cavVar2 = cavVarB;
                ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        aonnVar3 = defpackage.acpt.a;
                    }
                    if (i6 != 0) {
                        aonoVar2 = defpackage.acpt.b;
                    }
                    if (i8 != 0) {
                        f2 = 64.0f;
                    }
                    if (i11 != 0) {
                        azzVarAP = afsq.aP(cavVar2);
                        aonnVar3 = aonnVar3;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10 & (-458753);
                    } else {
                        aonnVar3 = aonnVar3;
                        azzVarAP = azzVarAP;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10;
                    }
                } else {
                    if (i16 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        aonnVar3 = defpackage.acpt.a;
                    }
                    if (i6 != 0) {
                        aonoVar2 = defpackage.acpt.b;
                    }
                    if (i8 != 0) {
                        f2 = 64.0f;
                    }
                    if (i11 != 0) {
                        azzVarAP = afsq.aP(cavVar2);
                        aonnVar3 = aonnVar3;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10 & (-458753);
                    } else {
                        aonnVar3 = aonnVar3;
                        azzVarAP = azzVarAP;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10;
                    }
                }
                cavVar2.l();
                bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                cmwVar3 = cmwVar5;
                aonnVar4 = aonnVar3;
                aonoVar3 = aonoVar4;
                f3 = f4;
                azzVar2 = azzVarAP;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                cmwVar3 = cmwVar2;
                aonnVar4 = aonnVar3;
                aonoVar3 = aonoVar2;
                f3 = f2;
                azzVar2 = azzVarAP;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
            }
        }
        i3 |= 384;
        aonnVar3 = aonnVar2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                aonoVar2 = aonoVar;
                if (true != cavVarB.D(aonoVar2)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (true != cavVarB.y(f2)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    i14 = 65536;
                    if ((i2 & 32) == 0) {
                        azzVarAP = azzVar;
                        if (cavVarB.B(azzVarAP)) {
                            i14 = 131072;
                        }
                    } else {
                        azzVarAP = azzVar;
                    }
                    i3 |= i14;
                } else {
                    azzVarAP = azzVar;
                }
                if ((1572864 & i) == 0) {
                    if (true != cavVarB.B(bwkVar)) {
                        i13 = 524288;
                    } else {
                        i13 = 1048576;
                    }
                    i3 |= i13;
                }
                i10 = i3 | 12582912;
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i10 & 1)) {
                    i11 = i2 & 32;
                    cavVar2 = cavVarB;
                    ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonnVar3 = defpackage.acpt.a;
                        }
                        if (i6 != 0) {
                            aonoVar2 = defpackage.acpt.b;
                        }
                        if (i8 != 0) {
                            f2 = 64.0f;
                        }
                        if (i11 != 0) {
                            azzVarAP = afsq.aP(cavVar2);
                            aonnVar3 = aonnVar3;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10 & (-458753);
                        } else {
                            aonnVar3 = aonnVar3;
                            azzVarAP = azzVarAP;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10;
                        }
                    } else {
                        if (i16 != 0) {
                            cmwVar4 = cmw.c;
                        } else {
                            cmwVar4 = cmwVar2;
                        }
                        if (i4 != 0) {
                            aonnVar3 = defpackage.acpt.a;
                        }
                        if (i6 != 0) {
                            aonoVar2 = defpackage.acpt.b;
                        }
                        if (i8 != 0) {
                            f2 = 64.0f;
                        }
                        if (i11 != 0) {
                            azzVarAP = afsq.aP(cavVar2);
                            aonnVar3 = aonnVar3;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10 & (-458753);
                        } else {
                            aonnVar3 = aonnVar3;
                            azzVarAP = azzVarAP;
                            f4 = f2;
                            aonoVar4 = aonoVar2;
                            cmwVar5 = cmwVar4;
                            i12 = i10;
                        }
                    }
                    cavVar2.l();
                    bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                    cmwVar3 = cmwVar5;
                    aonnVar4 = aonnVar3;
                    aonoVar3 = aonoVar4;
                    f3 = f4;
                    azzVar2 = azzVarAP;
                } else {
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    cmwVar3 = cmwVar2;
                    aonnVar4 = aonnVar3;
                    aonoVar3 = aonoVar2;
                    f3 = f2;
                    azzVar2 = azzVarAP;
                }
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
                }
            }
            i3 |= 24576;
            f2 = f;
            if ((196608 & i) == 0) {
                i14 = 65536;
                if ((i2 & 32) == 0) {
                    azzVarAP = azzVar;
                    if (cavVarB.B(azzVarAP)) {
                        i14 = 131072;
                    }
                } else {
                    azzVarAP = azzVar;
                }
                i3 |= i14;
            } else {
                azzVarAP = azzVar;
            }
            if ((1572864 & i) == 0) {
                if (true != cavVarB.B(bwkVar)) {
                    i13 = 524288;
                } else {
                    i13 = 1048576;
                }
                i3 |= i13;
            }
            i10 = i3 | 12582912;
            if ((4793491 & i10) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i10 & 1)) {
                i11 = i2 & 32;
                cavVar2 = cavVarB;
                ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        aonnVar3 = defpackage.acpt.a;
                    }
                    if (i6 != 0) {
                        aonoVar2 = defpackage.acpt.b;
                    }
                    if (i8 != 0) {
                        f2 = 64.0f;
                    }
                    if (i11 != 0) {
                        azzVarAP = afsq.aP(cavVar2);
                        aonnVar3 = aonnVar3;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10 & (-458753);
                    } else {
                        aonnVar3 = aonnVar3;
                        azzVarAP = azzVarAP;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10;
                    }
                } else {
                    if (i16 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        aonnVar3 = defpackage.acpt.a;
                    }
                    if (i6 != 0) {
                        aonoVar2 = defpackage.acpt.b;
                    }
                    if (i8 != 0) {
                        f2 = 64.0f;
                    }
                    if (i11 != 0) {
                        azzVarAP = afsq.aP(cavVar2);
                        aonnVar3 = aonnVar3;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10 & (-458753);
                    } else {
                        aonnVar3 = aonnVar3;
                        azzVarAP = azzVarAP;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10;
                    }
                }
                cavVar2.l();
                bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                cmwVar3 = cmwVar5;
                aonnVar4 = aonnVar3;
                aonoVar3 = aonoVar4;
                f3 = f4;
                azzVar2 = azzVarAP;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                cmwVar3 = cmwVar2;
                aonnVar4 = aonnVar3;
                aonoVar3 = aonoVar2;
                f3 = f2;
                azzVar2 = azzVarAP;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
            }
        }
        i3 |= 3072;
        aonoVar2 = aonoVar;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                f2 = f;
                if (true != cavVarB.y(f2)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                i14 = 65536;
                if ((i2 & 32) == 0) {
                    azzVarAP = azzVar;
                    if (cavVarB.B(azzVarAP)) {
                        i14 = 131072;
                    }
                } else {
                    azzVarAP = azzVar;
                }
                i3 |= i14;
            } else {
                azzVarAP = azzVar;
            }
            if ((1572864 & i) == 0) {
                if (true != cavVarB.B(bwkVar)) {
                    i13 = 524288;
                } else {
                    i13 = 1048576;
                }
                i3 |= i13;
            }
            i10 = i3 | 12582912;
            if ((4793491 & i10) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i10 & 1)) {
                i11 = i2 & 32;
                cavVar2 = cavVarB;
                ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        aonnVar3 = defpackage.acpt.a;
                    }
                    if (i6 != 0) {
                        aonoVar2 = defpackage.acpt.b;
                    }
                    if (i8 != 0) {
                        f2 = 64.0f;
                    }
                    if (i11 != 0) {
                        azzVarAP = afsq.aP(cavVar2);
                        aonnVar3 = aonnVar3;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10 & (-458753);
                    } else {
                        aonnVar3 = aonnVar3;
                        azzVarAP = azzVarAP;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10;
                    }
                } else {
                    if (i16 != 0) {
                        cmwVar4 = cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        aonnVar3 = defpackage.acpt.a;
                    }
                    if (i6 != 0) {
                        aonoVar2 = defpackage.acpt.b;
                    }
                    if (i8 != 0) {
                        f2 = 64.0f;
                    }
                    if (i11 != 0) {
                        azzVarAP = afsq.aP(cavVar2);
                        aonnVar3 = aonnVar3;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10 & (-458753);
                    } else {
                        aonnVar3 = aonnVar3;
                        azzVarAP = azzVarAP;
                        f4 = f2;
                        aonoVar4 = aonoVar2;
                        cmwVar5 = cmwVar4;
                        i12 = i10;
                    }
                }
                cavVar2.l();
                bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
                cmwVar3 = cmwVar5;
                aonnVar4 = aonnVar3;
                aonoVar3 = aonoVar4;
                f3 = f4;
                azzVar2 = azzVarAP;
            } else {
                cavVar2 = cavVarB;
                cavVar2.s();
                cmwVar3 = cmwVar2;
                aonnVar4 = aonnVar3;
                aonoVar3 = aonoVar2;
                f3 = f2;
                azzVar2 = azzVarAP;
            }
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
            }
        }
        i3 |= 24576;
        f2 = f;
        if ((196608 & i) == 0) {
            i14 = 65536;
            if ((i2 & 32) == 0) {
                azzVarAP = azzVar;
                if (cavVarB.B(azzVarAP)) {
                    i14 = 131072;
                }
            } else {
                azzVarAP = azzVar;
            }
            i3 |= i14;
        } else {
            azzVarAP = azzVar;
        }
        if ((1572864 & i) == 0) {
            if (true != cavVarB.B(bwkVar)) {
                i13 = 524288;
            } else {
                i13 = 1048576;
            }
            i3 |= i13;
        }
        i10 = i3 | 12582912;
        if ((4793491 & i10) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (cavVarB.H(z, i10 & 1)) {
            i11 = i2 & 32;
            cavVar2 = cavVarB;
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    cmwVar4 = cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    aonnVar3 = defpackage.acpt.a;
                }
                if (i6 != 0) {
                    aonoVar2 = defpackage.acpt.b;
                }
                if (i8 != 0) {
                    f2 = 64.0f;
                }
                if (i11 != 0) {
                    azzVarAP = afsq.aP(cavVar2);
                    aonnVar3 = aonnVar3;
                    f4 = f2;
                    aonoVar4 = aonoVar2;
                    cmwVar5 = cmwVar4;
                    i12 = i10 & (-458753);
                } else {
                    aonnVar3 = aonnVar3;
                    azzVarAP = azzVarAP;
                    f4 = f2;
                    aonoVar4 = aonoVar2;
                    cmwVar5 = cmwVar4;
                    i12 = i10;
                }
            } else {
                if (i16 != 0) {
                    cmwVar4 = cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    aonnVar3 = defpackage.acpt.a;
                }
                if (i6 != 0) {
                    aonoVar2 = defpackage.acpt.b;
                }
                if (i8 != 0) {
                    f2 = 64.0f;
                }
                if (i11 != 0) {
                    azzVarAP = afsq.aP(cavVar2);
                    aonnVar3 = aonnVar3;
                    f4 = f2;
                    aonoVar4 = aonoVar2;
                    cmwVar5 = cmwVar4;
                    i12 = i10 & (-458753);
                } else {
                    aonnVar3 = aonnVar3;
                    azzVarAP = azzVarAP;
                    f4 = f2;
                    aonoVar4 = aonoVar2;
                    cmwVar5 = cmwVar4;
                    i12 = i10;
                }
            }
            cavVar2.l();
            bmz.h(aonnVar, cmwVar5, aonnVar3, aonoVar4, f4, azzVarAP, bwkVar, (ayy) null, cavVar2, i12 & 33554430);
            cmwVar3 = cmwVar5;
            aonnVar4 = aonnVar3;
            aonoVar3 = aonoVar4;
            f3 = f4;
            azzVar2 = azzVarAP;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar3 = cmwVar2;
            aonnVar4 = aonnVar3;
            aonoVar3 = aonoVar2;
            f3 = f2;
            azzVar2 = azzVarAP;
        }
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.acpe(aonnVar, cmwVar3, aonnVar4, aonoVar3, f3, azzVar2, bwkVar, i, i2, 0);
        }
    }

    public static final void b(cmw cmwVar, long j, long j2, float f, ayy ayyVar, azz azzVar, aono aonoVar, cav cavVar, int i) {
        cmw cmwVar2;
        long j3;
        float f2;
        ayy ayyVar2;
        azz azzVar2;
        long jR;
        azz aynVar;
        cmw cmwVar3;
        float f3;
        ayy ayyVar3;
        aooh.f(aonoVar, "content");
        cbt cbtVarB = cavVar.b(590887826);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.A(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        int i3 = i2 | 27648;
        if ((196608 & i) == 0) {
            i3 = i2 | 93184;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i) == 0) {
            i4 |= true != cbtVarB.D(aonoVar) ? 4194304 : 8388608;
        }
        if (cbtVarB.H((4793491 & i4) != 4793490, i4 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cbtVarB.E()) {
                cmw cmwVar4 = cmw.c;
                jR = abrz.r(j, cbtVarB);
                ayy ayyVar4 = defpackage.acpi.a;
                ayy ayyVar5 = defpackage.acpi.a;
                aynVar = new ayn(uu.j(cbtVarB), 47);
                cmwVar3 = cmwVar4;
                f3 = 3.0f;
                ayyVar3 = ayyVar5;
            } else {
                cbtVarB.s();
                cmwVar3 = cmwVar;
                jR = j2;
                ayyVar3 = ayyVar;
                aynVar = azzVar;
                f3 = f;
            }
            cbtVarB.l();
            bmz.c(cmwVar3, j, jR, f3, ayyVar3, aynVar, aonoVar, cbtVarB, 33094782 & i4);
            cmwVar2 = cmwVar3;
            azzVar2 = aynVar;
            ayyVar2 = ayyVar3;
            f2 = f3;
            j3 = jR;
        } else {
            cbtVarB.s();
            cmwVar2 = cmwVar;
            j3 = j2;
            f2 = f;
            ayyVar2 = ayyVar;
            azzVar2 = azzVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bwe(cmwVar2, j, j3, f2, ayyVar2, azzVar2, aonoVar, i, 2);
        }
    }

    public static final void c(aonn aonnVar, cmw cmwVar, aonn aonnVar2, aono aonoVar, float f, azz azzVar, bwk bwkVar, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        aono aonoVar2;
        float f2;
        azz azzVar2;
        cmw cmwVar3;
        aono aonoVar3;
        azz azzVarAP;
        float f3;
        aooh.f(aonnVar, "title");
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(32813111);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cbtVarB.D(aonnVar2) ? 128 : 256;
        }
        int i5 = i4 | 27648;
        if ((196608 & i) == 0) {
            i5 = i4 | 93184;
        }
        if ((1572864 & i) == 0) {
            i5 |= true != cbtVarB.B(bwkVar) ? 524288 : 1048576;
        }
        int i6 = i5 | 12582912;
        if (cbtVarB.H((4793491 & i6) != 4793490, i6 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cbtVarB.E()) {
                cmwVar3 = cmw.c;
                aonoVar3 = defpackage.acpt.c;
                azzVarAP = afsq.aP(cbtVarB);
                f3 = 64.0f;
            } else {
                cbtVarB.s();
                cmwVar3 = cmwVar;
                aonoVar3 = aonoVar;
                f3 = f;
                azzVarAP = azzVar;
            }
            cbtVarB.l();
            bmz.g(aonnVar, cmwVar3, aonnVar2, aonoVar3, f3, azzVarAP, bwkVar, (ayy) null, cbtVarB, i6 & 33095678);
            cmwVar2 = cmwVar3;
            azzVar2 = azzVarAP;
            f2 = f3;
            aonoVar2 = aonoVar3;
        } else {
            cbtVarB.s();
            cmwVar2 = cmwVar;
            aonoVar2 = aonoVar;
            f2 = f;
            azzVar2 = azzVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.acpd(aonnVar, cmwVar2, aonnVar2, aonoVar2, f2, azzVar2, bwkVar, i, 0);
        }
    }

    public static final void d(final aonn aonnVar, cmw cmwVar, final aonn aonnVar2, aono aonoVar, final cmi cmiVar, float f, float f2, azz azzVar, final bwk bwkVar, cav cavVar, final int i, final int i2) {
        int i3;
        aonn aonnVar3;
        final cmw cmwVar2;
        final aono aonoVar2;
        final float f3;
        final float f4;
        final azz azzVar2;
        cmw cmwVar3;
        aono aonoVar3;
        azz azzVarAP;
        float f5;
        int i4;
        float f6;
        aooh.f(aonnVar, "title");
        int i5 = i & 6;
        cbt cbtVarB = cavVar.b(1572853963);
        boolean z = true;
        if (i5 == 0) {
            i3 = (true != cbtVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 432;
        if ((i & 3072) == 0) {
            aonnVar3 = aonnVar2;
            i6 |= true != cbtVarB.D(aonnVar3) ? 1024 : 2048;
        } else {
            aonnVar3 = aonnVar2;
        }
        int i7 = i6 | 24576;
        if ((196608 & i) == 0) {
            i7 |= true != cbtVarB.B(cmiVar) ? 65536 : 131072;
        }
        int i8 = 1572864 | i7;
        if ((12582912 & i) == 0) {
            i8 = i7 | 5767168;
        }
        if ((100663296 & i) == 0) {
            i8 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i8 |= true != cbtVarB.B(bwkVar) ? 268435456 : 536870912;
        }
        int i9 = i2 | 6;
        if ((306783379 & i8) == 306783378 && (i9 & 3) == 2) {
            z = false;
        }
        if (cbtVarB.H(z, i8 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cbtVarB.E()) {
                cmwVar3 = cmw.c;
                aonoVar3 = defpackage.acpt.d;
                int i10 = i8;
                azzVarAP = afsq.aP(cbtVarB);
                f5 = 112.0f;
                i4 = i10;
                f6 = 64.0f;
            } else {
                cbtVarB.s();
                cmwVar3 = cmwVar;
                aonoVar3 = aonoVar;
                f6 = f;
                f5 = f2;
                i4 = i8;
                azzVarAP = azzVar;
            }
            cbtVarB.l();
            int i11 = i9 & 14;
            cmw cmwVar4 = cmwVar3;
            bmz.d(aonnVar, cmwVar4, aonnVar3, aonoVar3, cmiVar, f6, f5, azzVarAP, bwkVar, cbtVarB, i4 & 1883242494, i11);
            cmwVar2 = cmwVar4;
            aonoVar2 = aonoVar3;
            azzVar2 = azzVarAP;
            f4 = f5;
            f3 = f6;
        } else {
            cbtVarB.s();
            cmwVar2 = cmwVar;
            aonoVar2 = aonoVar;
            f3 = f;
            f4 = f2;
            azzVar2 = azzVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            final int i12 = 0;
            cdkVarI.c = new aonn() { // from class: acpf
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    if (i12 != 0) {
                        ((java.lang.Integer) obj2).intValue();
                        int i13 = i;
                        int i14 = i2;
                        bwk bwkVar2 = bwkVar;
                        azz azzVar3 = azzVar2;
                        float f7 = f4;
                        float f8 = f3;
                        cmi cmiVar2 = cmiVar;
                        aono aonoVar4 = aonoVar2;
                        aonn aonnVar4 = aonnVar2;
                        cmw cmwVar5 = cmwVar2;
                        int i15 = i13 | 1;
                        int i16 = i14 & 306783378;
                        int i17 = 306783378 & i15;
                        int i18 = i17 << 1;
                        int i19 = i14 & 613566756;
                        int i20 = 613566756 & i15;
                        bmz.d(aonnVar, cmwVar5, aonnVar4, aonoVar4, cmiVar2, f8, f7, azzVar3, bwkVar2, (cav) obj, (i15 & (-920350135)) | i17 | (i20 >> 1) | (i18 & i20), (i14 & (-920350135)) | i16 | (i19 >> 1) | ((i16 << 1) & i19));
                        return aojh.a;
                    }
                    ((java.lang.Integer) obj2).intValue();
                    int i21 = i;
                    int i22 = i2;
                    bwk bwkVar3 = bwkVar;
                    azz azzVar4 = azzVar2;
                    float f9 = f4;
                    float f10 = f3;
                    cmi cmiVar3 = cmiVar;
                    aono aonoVar5 = aonoVar2;
                    aonn aonnVar5 = aonnVar2;
                    cmw cmwVar6 = cmwVar2;
                    int i23 = i21 | 1;
                    int i24 = i22 & 306783378;
                    int i25 = 306783378 & i23;
                    int i26 = i25 << 1;
                    int i27 = i22 & 613566756;
                    int i28 = 613566756 & i23;
                    defpackage.acpg.d(aonnVar, cmwVar6, aonnVar5, aonoVar5, cmiVar3, f10, f9, azzVar4, bwkVar3, (cav) obj, (i23 & (-920350135)) | i25 | (i28 >> 1) | (i26 & i28), (i22 & (-920350135)) | i24 | (i27 >> 1) | ((i24 << 1) & i27));
                    return aojh.a;
                }
            };
        }
    }
}
