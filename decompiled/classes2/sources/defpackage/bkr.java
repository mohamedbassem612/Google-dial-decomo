package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bkr {
    public static final defpackage.bks a;
    public static final defpackage.bks b;
    public static final defpackage.bks c;
    public static final defpackage.bks d;

    static {
        final int i = 1;
        a = new defpackage.bks() { // from class: bkp
            /* JADX WARN: Code duplicated, block: B:44:0x009b  */
            /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
            /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
            /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:63:0x0100  */
            /* JADX WARN: Code duplicated, block: B:70:0x0112  */
            /* JADX WARN: Code duplicated, block: B:71:0x0117  */
            /* JADX WARN: Code duplicated, block: B:74:0x0121  */
            /* JADX WARN: Code duplicated, block: B:75:0x012a  */
            @Override // defpackage.bks
            public final defpackage.bko a(defpackage.blg blgVar) {
                defpackage.bkn bknVar;
                defpackage.bkn bknVarI;
                defpackage.bkn bknVar2;
                defpackage.bkn bknVar3;
                defpackage.bkl bklVarE;
                java.lang.String strD;
                int i2;
                int length;
                defpackage.bko bkoVarJ;
                int iC;
                int i3 = i;
                if (i3 == 0) {
                    return defpackage.bkr.a(blgVar);
                }
                boolean z = false;
                int i4 = 1;
                if (i3 == 1) {
                    return new defpackage.bko(blgVar.h().b(blgVar.h().c), blgVar.f().b(blgVar.f().d), blgVar.n() == 1);
                }
                if (i3 == 2) {
                    return defpackage.avo.j(blgVar, defpackage.bkq.b);
                }
                defpackage.bko bkoVarJ2 = blgVar.j();
                if (bkoVarJ2 == null) {
                    return defpackage.bkr.a(blgVar);
                }
                if (blgVar.l()) {
                    bknVar = bkoVarJ2.a;
                    bknVarI = defpackage.avo.i(blgVar, blgVar.h(), bknVar);
                    bknVar3 = bkoVarJ2.b;
                    bknVar2 = bknVarI;
                } else {
                    bknVar = bkoVarJ2.b;
                    bknVarI = defpackage.avo.i(blgVar, blgVar.f(), bknVar);
                    bknVar2 = bkoVarJ2.a;
                    bknVar3 = bknVarI;
                }
                if (aooh.n(bknVarI, bknVar)) {
                    return bkoVarJ2;
                }
                defpackage.bko bkoVar = new defpackage.bko(bknVar2, bknVar3, blgVar.n() == 1 || (blgVar.n() == 3 && bknVar2.a > bknVar3.a));
                defpackage.bkn bknVar4 = bkoVar.a;
                defpackage.bkn bknVar5 = bkoVar.b;
                if (bknVar4.b == bknVar5.b) {
                    if (bknVar4.a == bknVar5.a) {
                        java.lang.String strD2 = blgVar.e().d();
                        if (blgVar.b() <= 1 && blgVar.j() != null && strD2.length() != 0) {
                            bklVarE = blgVar.e();
                            strD = bklVarE.d();
                            i2 = bklVarE.c;
                            length = strD.length();
                            if (i2 == 0) {
                                int iC2 = wv.c(strD, 0);
                                return blgVar.l() ? defpackage.bko.a(bkoVar, defpackage.avo.h(bknVar4, bklVarE, iC2), null, true, 2) : defpackage.bko.a(bkoVar, null, defpackage.avo.h(bknVar5, bklVarE, iC2), false, 1);
                            }
                            if (i2 == length) {
                                int iD = wv.d(strD, length);
                                return blgVar.l() ? defpackage.bko.a(bkoVar, defpackage.avo.h(bknVar4, bklVarE, iD), null, false, 2) : defpackage.bko.a(bkoVar, null, defpackage.avo.h(bknVar5, bklVarE, iD), true, 1);
                            }
                            bkoVarJ = blgVar.j();
                            if (bkoVarJ != null && bkoVarJ.c) {
                                z = true;
                            }
                            if (blgVar.l() ^ z) {
                                iC = wv.d(strD, i2);
                            } else {
                                iC = wv.c(strD, i2);
                            }
                            return blgVar.l() ? defpackage.bko.a(bkoVar, defpackage.avo.h(bknVar4, bklVarE, iC), null, z, 2) : defpackage.bko.a(bkoVar, null, defpackage.avo.h(bknVar5, bklVarE, iC), z, 1);
                        }
                    }
                } else {
                    boolean z2 = bkoVar.c;
                    if ((true != z2 ? bknVar5 : bknVar4).a == 0) {
                        if (blgVar.g().a() == (true != z2 ? bknVar4 : bknVar5).a) {
                            aoop aoopVar = new aoop();
                            aoopVar.a = true;
                            blgVar.k(new defpackage.bln(aoopVar, i4));
                            if (aoopVar.a) {
                                java.lang.String strD3 = blgVar.e().d();
                                if (blgVar.b() <= 1) {
                                    bklVarE = blgVar.e();
                                    strD = bklVarE.d();
                                    i2 = bklVarE.c;
                                    length = strD.length();
                                    if (i2 == 0) {
                                        int iC3 = wv.c(strD, 0);
                                        if (blgVar.l()) {
                                        }
                                    }
                                    if (i2 == length) {
                                        int iD2 = wv.d(strD, length);
                                        if (blgVar.l()) {
                                        }
                                    }
                                    bkoVarJ = blgVar.j();
                                    if (bkoVarJ != null) {
                                        z = true;
                                    }
                                    if (blgVar.l() ^ z) {
                                        iC = wv.d(strD, i2);
                                    } else {
                                        iC = wv.c(strD, i2);
                                    }
                                    if (blgVar.l()) {
                                    }
                                }
                            }
                        }
                    }
                }
                return bkoVar;
            }
        };
        final int i2 = 0;
        b = new defpackage.bks() { // from class: bkp
            /* JADX WARN: Code duplicated, block: B:44:0x009b  */
            /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
            /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
            /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:63:0x0100  */
            /* JADX WARN: Code duplicated, block: B:70:0x0112  */
            /* JADX WARN: Code duplicated, block: B:71:0x0117  */
            /* JADX WARN: Code duplicated, block: B:74:0x0121  */
            /* JADX WARN: Code duplicated, block: B:75:0x012a  */
            @Override // defpackage.bks
            public final defpackage.bko a(defpackage.blg blgVar) {
                defpackage.bkn bknVar;
                defpackage.bkn bknVarI;
                defpackage.bkn bknVar2;
                defpackage.bkn bknVar3;
                defpackage.bkl bklVarE;
                java.lang.String strD;
                int i3;
                int length;
                defpackage.bko bkoVarJ;
                int iC;
                int i4 = i2;
                if (i4 == 0) {
                    return defpackage.bkr.a(blgVar);
                }
                boolean z = false;
                int i5 = 1;
                if (i4 == 1) {
                    return new defpackage.bko(blgVar.h().b(blgVar.h().c), blgVar.f().b(blgVar.f().d), blgVar.n() == 1);
                }
                if (i4 == 2) {
                    return defpackage.avo.j(blgVar, defpackage.bkq.b);
                }
                defpackage.bko bkoVarJ2 = blgVar.j();
                if (bkoVarJ2 == null) {
                    return defpackage.bkr.a(blgVar);
                }
                if (blgVar.l()) {
                    bknVar = bkoVarJ2.a;
                    bknVarI = defpackage.avo.i(blgVar, blgVar.h(), bknVar);
                    bknVar3 = bkoVarJ2.b;
                    bknVar2 = bknVarI;
                } else {
                    bknVar = bkoVarJ2.b;
                    bknVarI = defpackage.avo.i(blgVar, blgVar.f(), bknVar);
                    bknVar2 = bkoVarJ2.a;
                    bknVar3 = bknVarI;
                }
                if (aooh.n(bknVarI, bknVar)) {
                    return bkoVarJ2;
                }
                defpackage.bko bkoVar = new defpackage.bko(bknVar2, bknVar3, blgVar.n() == 1 || (blgVar.n() == 3 && bknVar2.a > bknVar3.a));
                defpackage.bkn bknVar4 = bkoVar.a;
                defpackage.bkn bknVar5 = bkoVar.b;
                if (bknVar4.b == bknVar5.b) {
                    if (bknVar4.a == bknVar5.a) {
                        java.lang.String strD3 = blgVar.e().d();
                        if (blgVar.b() <= 1 && blgVar.j() != null && strD3.length() != 0) {
                            bklVarE = blgVar.e();
                            strD = bklVarE.d();
                            i3 = bklVarE.c;
                            length = strD.length();
                            if (i3 == 0) {
                                int iC3 = wv.c(strD, 0);
                                return blgVar.l() ? defpackage.bko.a(bkoVar, defpackage.avo.h(bknVar4, bklVarE, iC3), null, true, 2) : defpackage.bko.a(bkoVar, null, defpackage.avo.h(bknVar5, bklVarE, iC3), false, 1);
                            }
                            if (i3 == length) {
                                int iD2 = wv.d(strD, length);
                                return blgVar.l() ? defpackage.bko.a(bkoVar, defpackage.avo.h(bknVar4, bklVarE, iD2), null, false, 2) : defpackage.bko.a(bkoVar, null, defpackage.avo.h(bknVar5, bklVarE, iD2), true, 1);
                            }
                            bkoVarJ = blgVar.j();
                            if (bkoVarJ != null && bkoVarJ.c) {
                                z = true;
                            }
                            if (blgVar.l() ^ z) {
                                iC = wv.d(strD, i3);
                            } else {
                                iC = wv.c(strD, i3);
                            }
                            return blgVar.l() ? defpackage.bko.a(bkoVar, defpackage.avo.h(bknVar4, bklVarE, iC), null, z, 2) : defpackage.bko.a(bkoVar, null, defpackage.avo.h(bknVar5, bklVarE, iC), z, 1);
                        }
                    }
                } else {
                    boolean z2 = bkoVar.c;
                    if ((true != z2 ? bknVar5 : bknVar4).a == 0) {
                        if (blgVar.g().a() == (true != z2 ? bknVar4 : bknVar5).a) {
                            aoop aoopVar = new aoop();
                            aoopVar.a = true;
                            blgVar.k(new defpackage.bln(aoopVar, i5));
                            if (aoopVar.a) {
                                java.lang.String strD4 = blgVar.e().d();
                                if (blgVar.b() <= 1) {
                                    bklVarE = blgVar.e();
                                    strD = bklVarE.d();
                                    i3 = bklVarE.c;
                                    length = strD.length();
                                    if (i3 == 0) {
                                        int iC4 = wv.c(strD, 0);
                                        if (blgVar.l()) {
                                        }
                                    }
                                    if (i3 == length) {
                                        int iD3 = wv.d(strD, length);
                                        if (blgVar.l()) {
                                        }
                                    }
                                    bkoVarJ = blgVar.j();
                                    if (bkoVarJ != null) {
                                        z = true;
                                    }
                                    if (blgVar.l() ^ z) {
                                        iC = wv.d(strD, i3);
                                    } else {
                                        iC = wv.c(strD, i3);
                                    }
                                    if (blgVar.l()) {
                                    }
                                }
                            }
                        }
                    }
                }
                return bkoVar;
            }
        };
        final int i3 = 2;
        c = new defpackage.bks() { // from class: bkp
            /* JADX WARN: Code duplicated, block: B:44:0x009b  */
            /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
            /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
            /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:63:0x0100  */
            /* JADX WARN: Code duplicated, block: B:70:0x0112  */
            /* JADX WARN: Code duplicated, block: B:71:0x0117  */
            /* JADX WARN: Code duplicated, block: B:74:0x0121  */
            /* JADX WARN: Code duplicated, block: B:75:0x012a  */
            @Override // defpackage.bks
            public final defpackage.bko a(defpackage.blg blgVar) {
                defpackage.bkn bknVar;
                defpackage.bkn bknVarI;
                defpackage.bkn bknVar2;
                defpackage.bkn bknVar3;
                defpackage.bkl bklVarE;
                java.lang.String strD;
                int i4;
                int length;
                defpackage.bko bkoVarJ;
                int iC;
                int i5 = i3;
                if (i5 == 0) {
                    return defpackage.bkr.a(blgVar);
                }
                boolean z = false;
                int i6 = 1;
                if (i5 == 1) {
                    return new defpackage.bko(blgVar.h().b(blgVar.h().c), blgVar.f().b(blgVar.f().d), blgVar.n() == 1);
                }
                if (i5 == 2) {
                    return defpackage.avo.j(blgVar, defpackage.bkq.b);
                }
                defpackage.bko bkoVarJ2 = blgVar.j();
                if (bkoVarJ2 == null) {
                    return defpackage.bkr.a(blgVar);
                }
                if (blgVar.l()) {
                    bknVar = bkoVarJ2.a;
                    bknVarI = defpackage.avo.i(blgVar, blgVar.h(), bknVar);
                    bknVar3 = bkoVarJ2.b;
                    bknVar2 = bknVarI;
                } else {
                    bknVar = bkoVarJ2.b;
                    bknVarI = defpackage.avo.i(blgVar, blgVar.f(), bknVar);
                    bknVar2 = bkoVarJ2.a;
                    bknVar3 = bknVarI;
                }
                if (aooh.n(bknVarI, bknVar)) {
                    return bkoVarJ2;
                }
                defpackage.bko bkoVar = new defpackage.bko(bknVar2, bknVar3, blgVar.n() == 1 || (blgVar.n() == 3 && bknVar2.a > bknVar3.a));
                defpackage.bkn bknVar4 = bkoVar.a;
                defpackage.bkn bknVar5 = bkoVar.b;
                if (bknVar4.b == bknVar5.b) {
                    if (bknVar4.a == bknVar5.a) {
                        java.lang.String strD4 = blgVar.e().d();
                        if (blgVar.b() <= 1 && blgVar.j() != null && strD4.length() != 0) {
                            bklVarE = blgVar.e();
                            strD = bklVarE.d();
                            i4 = bklVarE.c;
                            length = strD.length();
                            if (i4 == 0) {
                                int iC4 = wv.c(strD, 0);
                                return blgVar.l() ? defpackage.bko.a(bkoVar, defpackage.avo.h(bknVar4, bklVarE, iC4), null, true, 2) : defpackage.bko.a(bkoVar, null, defpackage.avo.h(bknVar5, bklVarE, iC4), false, 1);
                            }
                            if (i4 == length) {
                                int iD3 = wv.d(strD, length);
                                return blgVar.l() ? defpackage.bko.a(bkoVar, defpackage.avo.h(bknVar4, bklVarE, iD3), null, false, 2) : defpackage.bko.a(bkoVar, null, defpackage.avo.h(bknVar5, bklVarE, iD3), true, 1);
                            }
                            bkoVarJ = blgVar.j();
                            if (bkoVarJ != null && bkoVarJ.c) {
                                z = true;
                            }
                            if (blgVar.l() ^ z) {
                                iC = wv.d(strD, i4);
                            } else {
                                iC = wv.c(strD, i4);
                            }
                            return blgVar.l() ? defpackage.bko.a(bkoVar, defpackage.avo.h(bknVar4, bklVarE, iC), null, z, 2) : defpackage.bko.a(bkoVar, null, defpackage.avo.h(bknVar5, bklVarE, iC), z, 1);
                        }
                    }
                } else {
                    boolean z2 = bkoVar.c;
                    if ((true != z2 ? bknVar5 : bknVar4).a == 0) {
                        if (blgVar.g().a() == (true != z2 ? bknVar4 : bknVar5).a) {
                            aoop aoopVar = new aoop();
                            aoopVar.a = true;
                            blgVar.k(new defpackage.bln(aoopVar, i6));
                            if (aoopVar.a) {
                                java.lang.String strD5 = blgVar.e().d();
                                if (blgVar.b() <= 1) {
                                    bklVarE = blgVar.e();
                                    strD = bklVarE.d();
                                    i4 = bklVarE.c;
                                    length = strD.length();
                                    if (i4 == 0) {
                                        int iC5 = wv.c(strD, 0);
                                        if (blgVar.l()) {
                                        }
                                    }
                                    if (i4 == length) {
                                        int iD4 = wv.d(strD, length);
                                        if (blgVar.l()) {
                                        }
                                    }
                                    bkoVarJ = blgVar.j();
                                    if (bkoVarJ != null) {
                                        z = true;
                                    }
                                    if (blgVar.l() ^ z) {
                                        iC = wv.d(strD, i4);
                                    } else {
                                        iC = wv.c(strD, i4);
                                    }
                                    if (blgVar.l()) {
                                    }
                                }
                            }
                        }
                    }
                }
                return bkoVar;
            }
        };
        final int i4 = 3;
        d = new defpackage.bks() { // from class: bkp
            /* JADX WARN: Code duplicated, block: B:44:0x009b  */
            /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
            /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
            /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
            /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:63:0x0100  */
            /* JADX WARN: Code duplicated, block: B:70:0x0112  */
            /* JADX WARN: Code duplicated, block: B:71:0x0117  */
            /* JADX WARN: Code duplicated, block: B:74:0x0121  */
            /* JADX WARN: Code duplicated, block: B:75:0x012a  */
            @Override // defpackage.bks
            public final defpackage.bko a(defpackage.blg blgVar) {
                defpackage.bkn bknVar;
                defpackage.bkn bknVarI;
                defpackage.bkn bknVar2;
                defpackage.bkn bknVar3;
                defpackage.bkl bklVarE;
                java.lang.String strD;
                int i5;
                int length;
                defpackage.bko bkoVarJ;
                int iC;
                int i6 = i4;
                if (i6 == 0) {
                    return defpackage.bkr.a(blgVar);
                }
                boolean z = false;
                int i7 = 1;
                if (i6 == 1) {
                    return new defpackage.bko(blgVar.h().b(blgVar.h().c), blgVar.f().b(blgVar.f().d), blgVar.n() == 1);
                }
                if (i6 == 2) {
                    return defpackage.avo.j(blgVar, defpackage.bkq.b);
                }
                defpackage.bko bkoVarJ2 = blgVar.j();
                if (bkoVarJ2 == null) {
                    return defpackage.bkr.a(blgVar);
                }
                if (blgVar.l()) {
                    bknVar = bkoVarJ2.a;
                    bknVarI = defpackage.avo.i(blgVar, blgVar.h(), bknVar);
                    bknVar3 = bkoVarJ2.b;
                    bknVar2 = bknVarI;
                } else {
                    bknVar = bkoVarJ2.b;
                    bknVarI = defpackage.avo.i(blgVar, blgVar.f(), bknVar);
                    bknVar2 = bkoVarJ2.a;
                    bknVar3 = bknVarI;
                }
                if (aooh.n(bknVarI, bknVar)) {
                    return bkoVarJ2;
                }
                defpackage.bko bkoVar = new defpackage.bko(bknVar2, bknVar3, blgVar.n() == 1 || (blgVar.n() == 3 && bknVar2.a > bknVar3.a));
                defpackage.bkn bknVar4 = bkoVar.a;
                defpackage.bkn bknVar5 = bkoVar.b;
                if (bknVar4.b == bknVar5.b) {
                    if (bknVar4.a == bknVar5.a) {
                        java.lang.String strD5 = blgVar.e().d();
                        if (blgVar.b() <= 1 && blgVar.j() != null && strD5.length() != 0) {
                            bklVarE = blgVar.e();
                            strD = bklVarE.d();
                            i5 = bklVarE.c;
                            length = strD.length();
                            if (i5 == 0) {
                                int iC5 = wv.c(strD, 0);
                                return blgVar.l() ? defpackage.bko.a(bkoVar, defpackage.avo.h(bknVar4, bklVarE, iC5), null, true, 2) : defpackage.bko.a(bkoVar, null, defpackage.avo.h(bknVar5, bklVarE, iC5), false, 1);
                            }
                            if (i5 == length) {
                                int iD4 = wv.d(strD, length);
                                return blgVar.l() ? defpackage.bko.a(bkoVar, defpackage.avo.h(bknVar4, bklVarE, iD4), null, false, 2) : defpackage.bko.a(bkoVar, null, defpackage.avo.h(bknVar5, bklVarE, iD4), true, 1);
                            }
                            bkoVarJ = blgVar.j();
                            if (bkoVarJ != null && bkoVarJ.c) {
                                z = true;
                            }
                            if (blgVar.l() ^ z) {
                                iC = wv.d(strD, i5);
                            } else {
                                iC = wv.c(strD, i5);
                            }
                            return blgVar.l() ? defpackage.bko.a(bkoVar, defpackage.avo.h(bknVar4, bklVarE, iC), null, z, 2) : defpackage.bko.a(bkoVar, null, defpackage.avo.h(bknVar5, bklVarE, iC), z, 1);
                        }
                    }
                } else {
                    boolean z2 = bkoVar.c;
                    if ((true != z2 ? bknVar5 : bknVar4).a == 0) {
                        if (blgVar.g().a() == (true != z2 ? bknVar4 : bknVar5).a) {
                            aoop aoopVar = new aoop();
                            aoopVar.a = true;
                            blgVar.k(new defpackage.bln(aoopVar, i7));
                            if (aoopVar.a) {
                                java.lang.String strD6 = blgVar.e().d();
                                if (blgVar.b() <= 1) {
                                    bklVarE = blgVar.e();
                                    strD = bklVarE.d();
                                    i5 = bklVarE.c;
                                    length = strD.length();
                                    if (i5 == 0) {
                                        int iC6 = wv.c(strD, 0);
                                        if (blgVar.l()) {
                                        }
                                    }
                                    if (i5 == length) {
                                        int iD5 = wv.d(strD, length);
                                        if (blgVar.l()) {
                                        }
                                    }
                                    bkoVarJ = blgVar.j();
                                    if (bkoVarJ != null) {
                                        z = true;
                                    }
                                    if (blgVar.l() ^ z) {
                                        iC = wv.d(strD, i5);
                                    } else {
                                        iC = wv.c(strD, i5);
                                    }
                                    if (blgVar.l()) {
                                    }
                                }
                            }
                        }
                    }
                }
                return bkoVar;
            }
        };
    }

    static final defpackage.bko a(defpackage.blg blgVar) {
        return defpackage.avo.j(blgVar, defpackage.bkq.a);
    }
}
