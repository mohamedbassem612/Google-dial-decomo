package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class smj {
    private static final defpackage.smi a = new defpackage.smi();

    public static final defpackage.abmv a(defpackage.sko skoVar) {
        float f = skoVar.c;
        float f2 = skoVar.d;
        defpackage.abmv abmvVar = new defpackage.abmv(java.lang.Integer.valueOf(skoVar.e), java.lang.Integer.valueOf(skoVar.f), java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2), java.lang.Float.valueOf(skoVar.g));
        if (abmvVar.a()) {
            return abmvVar;
        }
        return null;
    }

    public static final void b(android.net.Uri uri, final defpackage.abjl abjlVar, final aonj aonjVar, final boolean z, boolean z2, cav cavVar, int i) {
        android.net.Uri uri2;
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-513011874);
        if (i3 == 0) {
            uri2 = uri;
            i2 = (true != cbtVarB.D(uri2) ? 2 : 4) | i;
        } else {
            uri2 = uri;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(abjlVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.C(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.C(z2) ? 8192 : 16384;
        }
        if (cbtVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            int i4 = i2 & 14;
            if (z2) {
                cbtVarB.u(-1642855907);
                wi.a(uri2, den.x(cmw.c, "background_crossfade"), den.bv(500, 0, (ajh) null, 6), "BackgroundImageCrossfade", cfo.j(-656994176, new aono() { // from class: smg
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        int iIntValue = ((java.lang.Integer) obj3).intValue() & 14;
                        defpackage.smj.c((android.net.Uri) obj, abjlVar, aonjVar, z, (cav) obj2, iIntValue);
                        return aojh.a;
                    }
                }, cbtVarB), cbtVarB, i4 | 28080, 0);
                cbtVarB.W(false);
            } else {
                cbtVarB.u(-1642465214);
                c(uri, abjlVar, aonjVar, z, cbtVarB, i2 & 8190);
                cbtVarB.W(false);
            }
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.smh(uri, abjlVar, aonjVar, z, z2, i, 0);
        }
    }

    public static final void c(android.net.Uri uri, defpackage.abjl abjlVar, aonj aonjVar, boolean z, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        defpackage.abjl abjlVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-751692129);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(uri) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abjlVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if (!cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            cavVar2 = cavVarB;
            cavVar2.s();
        } else {
            if (uri == null) {
                cdk cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new bsq(abjlVar, aonjVar, z, i, 19);
                    return;
                }
                return;
            }
            java.lang.String strF = dfa.f(2132017491, cavVarB);
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            ccp ccpVar = (ccp) objR;
            aojh aojhVar = aojh.a;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new defpackage.sge(ccpVar, (aoln) null, 14);
                cbtVar.ab(objR2);
            }
            cbp.g(aojhVar, (aonn) objR2, cavVarB);
            int i4 = i2 & 896;
            java.lang.Object objR3 = cbtVar.R();
            if (i4 == 256 || objR3 == obj) {
                objR3 = new mkm(aonjVar, abjlVar, ccpVar, 7, (short[]) null);
                abjlVar2 = abjlVar;
                cbtVar.ab(objR3);
            } else {
                abjlVar2 = abjlVar;
            }
            aonj aonjVar2 = (aonj) objR3;
            cmt cmtVar = cmw.c;
            cmw cmwVarC = azm.c(cmtVar, 1.0f);
            cye cyeVarB = awo.b(cmh.a, false);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVarC);
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
            cmw cmwVarC2 = azm.c(cmtVar, 1.0f);
            boolean zD = cavVarB.D(uri);
            java.lang.Object objR4 = cbtVar.R();
            if (zD || objR4 == obj) {
                objR4 = new defpackage.skx(uri, 11);
                cbtVar.ab(objR4);
            }
            cmw cmwVarB = dig.b(cmwVarC2, false, (aonj) objR4);
            boolean zB = cavVarB.B(strF);
            java.lang.Object objR5 = cbtVar.R();
            if (zB || objR5 == obj) {
                objR5 = new defpackage.skx(strF, 12);
                cbtVar.ab(objR5);
            }
            cmw cmwVarA = dig.a(cmwVarB, (aonj) objR5);
            defpackage.abjm abjmVar = new defpackage.abjm(uri, strF, abjlVar2);
            java.lang.Object objR6 = cbtVar.R();
            if (objR6 == obj) {
                objR6 = new defpackage.skk(8);
                cbtVar.ab(objR6);
            }
            aonj aonjVar3 = (aonj) objR6;
            cavVar2 = cavVarB;
            aehj.aA(abjmVar, cmwVarA, aonjVar2, aonjVar3, cavVar2, 3072, 0);
            awo.c(den.bo(azm.c(cmtVar, 1.0f), a), cavVar2, 6);
            if (z) {
                cavVar2.u(809247102);
                g(awtVar.a(cmtVar, cmh.e), a.C(ccpVar), cavVar2, 0);
                cbtVar.W(false);
            } else {
                cavVar2.u(809338397);
                cbtVar.W(false);
            }
            cbtVar.W(true);
        }
        cdk cdkVarI2 = cavVar2.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new defpackage.ppv(uri, abjlVar, aonjVar, z, i, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x0110  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114  */
    /* JADX WARN: Code duplicated, block: B:77:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x0157  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180  */
    /* JADX WARN: Code duplicated, block: B:82:0x0191  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void d(defpackage.slh slhVar, defpackage.abjl abjlVar, aonj aonjVar, aomy aomyVar, boolean z, cav cavVar, int i, int i2) {
        int i3;
        aonj aonjVar2;
        int i4;
        aomy aomyVar2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        boolean z3;
        aonj aonjVar3;
        aomy aomyVar3;
        boolean z4;
        cdk cdkVarI;
        aonj aonjVar4;
        aomy aomyVar4;
        boolean z5;
        cbt cbtVar;
        java.lang.Object objR;
        aomy aomyVar5;
        awt awtVar;
        cbt cbtVar2;
        aomy aomyVar6;
        boolean z6;
        boolean z7;
        cbt cbtVar3;
        java.lang.Object objR2;
        aooh.f(abjlVar, "transformationUiData");
        int i9 = i & 6;
        cbt cbtVarB = cavVar.b(1272461010);
        if (i9 == 0) {
            i3 = (true != cbtVarB.B(slhVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cbtVarB.B(abjlVar) ? 16 : 32;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                aonjVar2 = aonjVar;
                i3 |= true != cbtVarB.D(aonjVar2) ? 128 : 256;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    aomyVar2 = aomyVar;
                    if (true != cbtVarB.D(aomyVar2)) {
                        i5 = 1024;
                    } else {
                        i5 = 2048;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (true != cbtVarB.C(z)) {
                        i7 = 8192;
                    } else {
                        i7 = 16384;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (cbtVarB.H(z3, i8 & 1)) {
                    if (i10 != 0) {
                        aonjVar4 = null;
                    } else {
                        aonjVar4 = aonjVar2;
                    }
                    if (i4 != 0) {
                        cbtVar3 = cbtVarB;
                        objR2 = cbtVar3.R();
                        if (objR2 == cau.a) {
                            objR2 = new jaf(19);
                            cbtVar3.ab(objR2);
                        }
                        aomyVar4 = (aomy) objR2;
                    } else {
                        aomyVar4 = aomyVar2;
                    }
                    z5 = z2 & z;
                    cmt cmtVar = cmw.c;
                    cbtVar = cbtVarB;
                    objR = cbtVar.R();
                    if (objR == cau.a) {
                        objR = new defpackage.skk(7);
                        cbtVar.ab(objR);
                    }
                    cmw cmwVarX = den.x(den.bp(azm.c(dig.b(cmtVar, true, (aonj) objR), 1.0f), den.ak(cbtVarB).G), "onboarding_flow_preview");
                    cye cyeVarB = awo.b(cmh.a, false);
                    int iM = anty.M(cbtVar.x);
                    cje cjeVarAi = cbtVar.ai();
                    cmw cmwVarM = cfo.m(cbtVarB, cmwVarX);
                    aomyVar5 = dam.a;
                    cbtVarB.v();
                    if (cbtVar.w) {
                        cbtVarB.j(aomyVar5);
                    } else {
                        cbtVarB.x();
                    }
                    cev.c(cbtVarB, cyeVarB, dam.e);
                    cev.c(cbtVarB, cjeVarAi, dam.d);
                    cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
                    cev.b(cbtVarB, dam.g);
                    cev.c(cbtVarB, cmwVarM, dam.c);
                    awtVar = awt.a;
                    if (slhVar != null) {
                        cbtVarB.u(-1467151924);
                        b(slhVar.a, abjlVar, aonjVar4, slhVar.f, z5, cbtVarB, i8 & 58352);
                        e(slhVar, cbtVarB, i8 & 14);
                        if (slhVar.g != null) {
                            cbtVarB.u(-1466754256);
                            aomyVar6 = aomyVar4;
                            cja cjaVarJ = cfo.j(-161957787, new ata(slhVar, aomyVar6, awtVar, 17, (char[]) null), cbtVarB);
                            z7 = false;
                            cbtVar2 = cbtVar;
                            z6 = true;
                            aaoo.az("kappa_button", (cmw) null, false, cjaVarJ, cbtVarB, 3078, 6);
                            cbtVar2.W(false);
                        } else {
                            z7 = false;
                            cbtVar2 = cbtVar;
                            aomyVar6 = aomyVar4;
                            z6 = true;
                            cbtVarB.u(-1466390998);
                            cbtVar2.W(false);
                        }
                        cbtVar2.W(z7);
                    } else {
                        cbtVar2 = cbtVar;
                        aomyVar6 = aomyVar4;
                        z6 = true;
                        cbtVarB.u(-1466385046);
                        cbtVar2.W(false);
                    }
                    cbtVar2.W(z6);
                    aomyVar3 = aomyVar6;
                    z4 = z5;
                    aonjVar3 = aonjVar4;
                } else {
                    cbtVarB.s();
                    aonjVar3 = aonjVar2;
                    aomyVar3 = aomyVar2;
                    z4 = z;
                }
                cdkVarI = cbtVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new defpackage.abie(slhVar, abjlVar, aonjVar3, aomyVar3, z4, i, i2, 1);
                }
            }
            i3 |= 3072;
            aomyVar2 = aomyVar;
            i6 = i2 & 16;
            if (i6 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i6 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != cbtVarB.C(z)) {
                    i7 = 8192;
                } else {
                    i7 = 16384;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i8 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cbtVarB.H(z3, i8 & 1)) {
                if (i10 != 0) {
                    aonjVar4 = null;
                } else {
                    aonjVar4 = aonjVar2;
                }
                if (i4 != 0) {
                    cbtVar3 = cbtVarB;
                    objR2 = cbtVar3.R();
                    if (objR2 == cau.a) {
                        objR2 = new jaf(19);
                        cbtVar3.ab(objR2);
                    }
                    aomyVar4 = (aomy) objR2;
                } else {
                    aomyVar4 = aomyVar2;
                }
                z5 = z2 & z;
                cmt cmtVar2 = cmw.c;
                cbtVar = cbtVarB;
                objR = cbtVar.R();
                if (objR == cau.a) {
                    objR = new defpackage.skk(7);
                    cbtVar.ab(objR);
                }
                cmw cmwVarX2 = den.x(den.bp(azm.c(dig.b(cmtVar2, true, (aonj) objR), 1.0f), den.ak(cbtVarB).G), "onboarding_flow_preview");
                cye cyeVarB2 = awo.b(cmh.a, false);
                int iM2 = anty.M(cbtVar.x);
                cje cjeVarAi2 = cbtVar.ai();
                cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarX2);
                aomyVar5 = dam.a;
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar5);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVarB2, dam.e);
                cev.c(cbtVarB, cjeVarAi2, dam.d);
                cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), dam.f);
                cev.b(cbtVarB, dam.g);
                cev.c(cbtVarB, cmwVarM2, dam.c);
                awtVar = awt.a;
                if (slhVar != null) {
                    cbtVarB.u(-1467151924);
                    b(slhVar.a, abjlVar, aonjVar4, slhVar.f, z5, cbtVarB, i8 & 58352);
                    e(slhVar, cbtVarB, i8 & 14);
                    if (slhVar.g != null) {
                        cbtVarB.u(-1466754256);
                        aomyVar6 = aomyVar4;
                        cja cjaVarJ2 = cfo.j(-161957787, new ata(slhVar, aomyVar6, awtVar, 17, (char[]) null), cbtVarB);
                        z7 = false;
                        cbtVar2 = cbtVar;
                        z6 = true;
                        aaoo.az("kappa_button", (cmw) null, false, cjaVarJ2, cbtVarB, 3078, 6);
                        cbtVar2.W(false);
                    } else {
                        z7 = false;
                        cbtVar2 = cbtVar;
                        aomyVar6 = aomyVar4;
                        z6 = true;
                        cbtVarB.u(-1466390998);
                        cbtVar2.W(false);
                    }
                    cbtVar2.W(z7);
                } else {
                    cbtVar2 = cbtVar;
                    aomyVar6 = aomyVar4;
                    z6 = true;
                    cbtVarB.u(-1466385046);
                    cbtVar2.W(false);
                }
                cbtVar2.W(z6);
                aomyVar3 = aomyVar6;
                z4 = z5;
                aonjVar3 = aonjVar4;
            } else {
                cbtVarB.s();
                aonjVar3 = aonjVar2;
                aomyVar3 = aomyVar2;
                z4 = z;
            }
            cdkVarI = cbtVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.abie(slhVar, abjlVar, aonjVar3, aomyVar3, z4, i, i2, 1);
            }
        }
        i3 |= 384;
        aonjVar2 = aonjVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                aomyVar2 = aomyVar;
                if (true != cbtVarB.D(aomyVar2)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i6 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != cbtVarB.C(z)) {
                    i7 = 8192;
                } else {
                    i7 = 16384;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i8 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cbtVarB.H(z3, i8 & 1)) {
                if (i10 != 0) {
                    aonjVar4 = null;
                } else {
                    aonjVar4 = aonjVar2;
                }
                if (i4 != 0) {
                    cbtVar3 = cbtVarB;
                    objR2 = cbtVar3.R();
                    if (objR2 == cau.a) {
                        objR2 = new jaf(19);
                        cbtVar3.ab(objR2);
                    }
                    aomyVar4 = (aomy) objR2;
                } else {
                    aomyVar4 = aomyVar2;
                }
                z5 = z2 & z;
                cmt cmtVar3 = cmw.c;
                cbtVar = cbtVarB;
                objR = cbtVar.R();
                if (objR == cau.a) {
                    objR = new defpackage.skk(7);
                    cbtVar.ab(objR);
                }
                cmw cmwVarX3 = den.x(den.bp(azm.c(dig.b(cmtVar3, true, (aonj) objR), 1.0f), den.ak(cbtVarB).G), "onboarding_flow_preview");
                cye cyeVarB3 = awo.b(cmh.a, false);
                int iM3 = anty.M(cbtVar.x);
                cje cjeVarAi3 = cbtVar.ai();
                cmw cmwVarM3 = cfo.m(cbtVarB, cmwVarX3);
                aomyVar5 = dam.a;
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar5);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVarB3, dam.e);
                cev.c(cbtVarB, cjeVarAi3, dam.d);
                cev.c(cbtVarB, java.lang.Integer.valueOf(iM3), dam.f);
                cev.b(cbtVarB, dam.g);
                cev.c(cbtVarB, cmwVarM3, dam.c);
                awtVar = awt.a;
                if (slhVar != null) {
                    cbtVarB.u(-1467151924);
                    b(slhVar.a, abjlVar, aonjVar4, slhVar.f, z5, cbtVarB, i8 & 58352);
                    e(slhVar, cbtVarB, i8 & 14);
                    if (slhVar.g != null) {
                        cbtVarB.u(-1466754256);
                        aomyVar6 = aomyVar4;
                        cja cjaVarJ3 = cfo.j(-161957787, new ata(slhVar, aomyVar6, awtVar, 17, (char[]) null), cbtVarB);
                        z7 = false;
                        cbtVar2 = cbtVar;
                        z6 = true;
                        aaoo.az("kappa_button", (cmw) null, false, cjaVarJ3, cbtVarB, 3078, 6);
                        cbtVar2.W(false);
                    } else {
                        z7 = false;
                        cbtVar2 = cbtVar;
                        aomyVar6 = aomyVar4;
                        z6 = true;
                        cbtVarB.u(-1466390998);
                        cbtVar2.W(false);
                    }
                    cbtVar2.W(z7);
                } else {
                    cbtVar2 = cbtVar;
                    aomyVar6 = aomyVar4;
                    z6 = true;
                    cbtVarB.u(-1466385046);
                    cbtVar2.W(false);
                }
                cbtVar2.W(z6);
                aomyVar3 = aomyVar6;
                z4 = z5;
                aonjVar3 = aonjVar4;
            } else {
                cbtVarB.s();
                aonjVar3 = aonjVar2;
                aomyVar3 = aomyVar2;
                z4 = z;
            }
            cdkVarI = cbtVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new defpackage.abie(slhVar, abjlVar, aonjVar3, aomyVar3, z4, i, i2, 1);
            }
        }
        i3 |= 3072;
        aomyVar2 = aomyVar;
        i6 = i2 & 16;
        if (i6 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (true != cbtVarB.C(z)) {
                i7 = 8192;
            } else {
                i7 = 16384;
            }
            i3 |= i7;
        }
        i8 = i3;
        if ((i8 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (cbtVarB.H(z3, i8 & 1)) {
            if (i10 != 0) {
                aonjVar4 = null;
            } else {
                aonjVar4 = aonjVar2;
            }
            if (i4 != 0) {
                cbtVar3 = cbtVarB;
                objR2 = cbtVar3.R();
                if (objR2 == cau.a) {
                    objR2 = new jaf(19);
                    cbtVar3.ab(objR2);
                }
                aomyVar4 = (aomy) objR2;
            } else {
                aomyVar4 = aomyVar2;
            }
            z5 = z2 & z;
            cmt cmtVar4 = cmw.c;
            cbtVar = cbtVarB;
            objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new defpackage.skk(7);
                cbtVar.ab(objR);
            }
            cmw cmwVarX4 = den.x(den.bp(azm.c(dig.b(cmtVar4, true, (aonj) objR), 1.0f), den.ak(cbtVarB).G), "onboarding_flow_preview");
            cye cyeVarB4 = awo.b(cmh.a, false);
            int iM4 = anty.M(cbtVar.x);
            cje cjeVarAi4 = cbtVar.ai();
            cmw cmwVarM4 = cfo.m(cbtVarB, cmwVarX4);
            aomyVar5 = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar5);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB4, dam.e);
            cev.c(cbtVarB, cjeVarAi4, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM4), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM4, dam.c);
            awtVar = awt.a;
            if (slhVar != null) {
                cbtVarB.u(-1467151924);
                b(slhVar.a, abjlVar, aonjVar4, slhVar.f, z5, cbtVarB, i8 & 58352);
                e(slhVar, cbtVarB, i8 & 14);
                if (slhVar.g != null) {
                    cbtVarB.u(-1466754256);
                    aomyVar6 = aomyVar4;
                    cja cjaVarJ4 = cfo.j(-161957787, new ata(slhVar, aomyVar6, awtVar, 17, (char[]) null), cbtVarB);
                    z7 = false;
                    cbtVar2 = cbtVar;
                    z6 = true;
                    aaoo.az("kappa_button", (cmw) null, false, cjaVarJ4, cbtVarB, 3078, 6);
                    cbtVar2.W(false);
                } else {
                    z7 = false;
                    cbtVar2 = cbtVar;
                    aomyVar6 = aomyVar4;
                    z6 = true;
                    cbtVarB.u(-1466390998);
                    cbtVar2.W(false);
                }
                cbtVar2.W(z7);
            } else {
                cbtVar2 = cbtVar;
                aomyVar6 = aomyVar4;
                z6 = true;
                cbtVarB.u(-1466385046);
                cbtVar2.W(false);
            }
            cbtVar2.W(z6);
            aomyVar3 = aomyVar6;
            z4 = z5;
            aonjVar3 = aonjVar4;
        } else {
            cbtVarB.s();
            aonjVar3 = aonjVar2;
            aomyVar3 = aomyVar2;
            z4 = z;
        }
        cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abie(slhVar, abjlVar, aonjVar3, aomyVar3, z4, i, i2, 1);
        }
    }

    public static final void e(defpackage.slh slhVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1621040065);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(slhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cbtVarB.H((i2 & 3) != 2, i2 & 1)) {
            cmt cmtVar = cmw.c;
            cmw cmwVarX = den.x(azm.c(cmtVar, 1.0f), "onboarding_flow_preview_coordinate_parent");
            cye cyeVarB = awo.b(cmh.a, false);
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
            cev.c(cbtVarB, cyeVarB, aonnVar);
            aonn aonnVar2 = dam.d;
            cev.c(cbtVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar3 = dam.f;
            cev.c(cbtVarB, numValueOf, aonnVar3);
            aonj aonjVar = dam.g;
            cev.b(cbtVarB, aonjVar);
            aonn aonnVar4 = dam.c;
            cev.c(cbtVarB, cmwVarM, aonnVar4);
            cmw cmwVarAZ = den.aZ(bac.b(azm.d(cmtVar, 1.0f)), 12.0f, 0.0f);
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new defpackage.skk(6);
                cbtVar.ab(objR);
            }
            cmw cmwVarB = dig.b(cmwVarAZ, false, (aonj) objR);
            cye cyeVarA = aww.a(awi.c, cmh.k, cbtVarB, 48);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarB);
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarA, aonnVar);
            cev.c(cbtVarB, cjeVarAi2, aonnVar2);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            cev.b(cbtVarB, aonjVar);
            cev.c(cbtVarB, cmwVarM2, aonnVar4);
            boolean z = slhVar.a != null;
            gus.aG(false, z, cfo.j(605577382, new defpackage.rzg(slhVar, 13), cbtVarB), cbtVarB, 384, 1);
            if (slhVar.g == null && slhVar.h) {
                cbtVarB.u(1424879212);
                den.aR(awy.b(cmtVar, 1.0f, true), cbtVarB);
                h(z, den.ba(cmtVar, 0.0f, 0.0f, 0.0f, 128.0f), cbtVarB, 48);
                cbtVar.W(false);
            } else {
                cbtVarB.u(1425141565);
                cbtVar.W(false);
            }
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ryr(slhVar, i, 11);
        }
    }

    public static final void f(java.lang.String str, aomy aomyVar, cmw cmwVar, cav cavVar, int i) {
        int i2;
        aomy aomyVar2;
        cmw cmwVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(685590835);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            ayy ayyVar = acpl.a;
            int i4 = i2 >> 3;
            aomyVar2 = aomyVar;
            cmwVar2 = cmwVar;
            afsq.aN(aomyVar2, cmwVar2, (bnv) null, false, acpl.a(den.ak(cavVarB).c, den.ak(cavVarB).d, cavVarB, 12), (ayy) null, cfo.j(-931918325, new ped(str, 7), cavVarB), cavVarB, (i4 & 14) | 805306368 | (i4 & 112));
            cavVarB = cavVarB;
        } else {
            aomyVar2 = aomyVar;
            cmwVar2 = cmwVar;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ppx(str, aomyVar2, cmwVar2, i, 9);
        }
    }

    public static final void g(cmw cmwVar, boolean z, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        boolean z2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1724552979);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cmwVar2 = cmwVar;
            z2 = z;
            den.bz(z2, cmwVar2, aga.n(den.bv(0, 0, (ajh) null, 6), 2), aga.o(den.bv(500, 0, (ajh) null, 6), 2), (java.lang.String) null, defpackage.slk.a, cavVarB, ((i2 >> 3) & 14) | 200064 | ((i2 << 3) & 112), 16);
        } else {
            cmwVar2 = cmwVar;
            z2 = z;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new oa(cmwVar2, z2, i, 11);
        }
    }

    public static final void h(boolean z, cmw cmwVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1258192235);
        if (i3 == 0) {
            i2 = i | (true != cbtVarB.C(z) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            cmw cmwVarE = azm.e(den.aZ(azm.d(cmwVar, 1.0f), 20.0f, 0.0f), 96.0f);
            long jH = cqg.h(den.ak(cbtVarB).H, true == z ? 0.8f : 1.0f);
            bgc bgcVar = bge.a;
            cmw cmwVarBn = den.bn(cmwVarE, jH, bgcVar);
            cmj cmjVar = cmh.a;
            cye cyeVarB = awo.b(cmjVar, false);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarBn);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            aonn aonnVar = dam.e;
            cev.c(cbtVarB, cyeVarB, aonnVar);
            aonn aonnVar2 = dam.d;
            cev.c(cbtVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar3 = dam.f;
            cev.c(cbtVarB, numValueOf, aonnVar3);
            aonj aonjVar = dam.g;
            cev.b(cbtVarB, aonjVar);
            aonn aonnVar4 = dam.c;
            cev.c(cbtVarB, cmwVarM, aonnVar4);
            awt awtVar = awt.a;
            cmt cmtVar = cmw.c;
            cmj cmjVar2 = cmh.e;
            cmw cmwVarBn2 = den.bn(azm.i(awtVar.a(cmtVar, cmjVar2), 96.0f, 72.0f), -4294967296L, bgcVar);
            cye cyeVarB2 = awo.b(cmjVar, false);
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarBn2);
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB2, aonnVar);
            cev.c(cbtVarB, cjeVarAi2, aonnVar2);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            cev.b(cbtVarB, aonjVar);
            cev.c(cbtVarB, cmwVarM2, aonnVar4);
            aaoo.W(aehj.aL(abja.ah, cbtVarB), (java.lang.String) null, azm.g(awtVar.a(cmtVar, cmjVar2), 32.0f), abts.F(cbtVarB).n, cbtVarB, 48, 0);
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new oa(z, cmwVar, i, 10);
        }
    }

    public static final void i(ccp ccpVar) {
        ccpVar.b(java.lang.Boolean.FALSE);
    }
}
