package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vn {
    public static final boolean a(long j) {
        return !defpackage.anty.ah(j, -9223372034707292160L);
    }

    /* JADX WARN: Code duplicated, block: B:213:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:215:0x0303  */
    /* JADX WARN: Code duplicated, block: B:216:0x0305  */
    public static final void c(defpackage.cmw cmwVar, bcl bclVar, bbm bbmVar, defpackage.ayy ayyVar, defpackage.ars arsVar, boolean z, defpackage.amn amnVar, defpackage.awh awhVar, defpackage.awa awaVar, defpackage.bdn bdnVar, defpackage.aonj aonjVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        int i4;
        defpackage.cav cavVar2;
        bcl bclVar2;
        boolean z2;
        java.lang.Object bcaVar;
        int i5;
        bcl bclVar3;
        defpackage.aopy aopyVar;
        defpackage.cmw bdiVar;
        defpackage.cav cavVarB = cavVar.b(-225647110);
        if ((i & 6) == 0) {
            i3 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(bclVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != ((i & 512) == 0 ? cavVarB.B(bbmVar) : cavVarB.D(bbmVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.B(ayyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.C(false) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != cavVarB.C(true) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i3 |= true != cavVarB.B(arsVar) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i3 |= true != cavVarB.C(z) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.B(amnVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.B(awhVar) ? 268435456 : 536870912;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cavVarB.B(awaVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.B(bdnVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if (cavVarB.H(((i6 & 306783379) == 306783378 && (i4 & 147) == 146) ? false : true, i6 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            int i7 = i6 >> 3;
            defpackage.cer cerVarG = defpackage.cdh.g(aonjVar, cavVarB);
            int i8 = i7 & 14;
            int i9 = i8 | ((i4 >> 3) & 112);
            boolean z3 = (((i9 & 14) ^ 6) > 4 && cavVarB.B(bclVar)) || (i9 & 6) == 4;
            java.lang.Object objR = cbtVar.R();
            if (z3 || objR == defpackage.cau.a) {
                defpackage.cdu cduVar = defpackage.cdu.a;
                apv apvVar = new apv(cerVarG, 6);
                defpackage.ajxw ajxwVar = defpackage.ceo.a;
                objR = new bbw(new defpackage.cbk(new ny(new defpackage.cbk(apvVar, cduVar), bclVar, 5, (byte[]) null), cduVar));
                cbtVar.ab(objR);
            }
            int i10 = i8 | ((i6 >> 9) & 112);
            defpackage.aopy aopyVar2 = (defpackage.aopy) objR;
            boolean z4 = ((((i10 & 14) ^ 6) > 4 && cavVarB.B(bclVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && cavVarB.C(false)) || (i10 & 48) == 32);
            java.lang.Object objR2 = cbtVar.R();
            if (z4 || objR2 == defpackage.cau.a) {
                objR2 = new bcp(bclVar);
                cbtVar.ab(objR2);
            }
            bcp bcpVar = (bcp) objR2;
            java.lang.Object objR3 = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR3 == obj) {
                defpackage.cdy cdyVar = new defpackage.cdy(cbtVar.v, defpackage.aols.a);
                cbtVar.ab(cdyVar);
                objR3 = cdyVar;
            }
            defpackage.aoss aossVar = (defpackage.aoss) objR3;
            defpackage.apkl apklVar = (defpackage.apkl) cavVarB.e(defpackage.dfo.d);
            boolean zBooleanValue = ((java.lang.Boolean) cavVarB.e(defpackage.dfo.r)).booleanValue();
            int i11 = i6 & 112;
            boolean z5 = i11 == 32;
            boolean z6 = (i4 & 112) == 32;
            java.lang.Object objR4 = cbtVar.R();
            if ((z5 | z6) || objR4 == obj) {
                if (!(bdnVar instanceof defpackage.bcy) && !(bdnVar instanceof defpackage.bdn)) {
                    throw new defpackage.aois();
                }
                objR4 = new bbo(bdnVar);
                cbtVar.ab(objR4);
            }
            bbo bboVar = (bbo) objR4;
            boolean zB = z5 | cavVarB.B(bboVar);
            java.lang.Object objR5 = cbtVar.R();
            if (zB || objR5 == obj) {
                defpackage.beo beoVar = bclVar.i;
                objR5 = new defpackage.beo(new auj(bclVar, 13));
                cbtVar.ab(objR5);
            }
            defpackage.beo beoVar2 = (defpackage.beo) objR5;
            defpackage.den denVar = !zBooleanValue ? defpackage.bfg.a : null;
            int i12 = (i6 & 524272) | ((i4 << 18) & 3670016) | ((i6 >> 6) & 29360128);
            defpackage.den denVar2 = denVar;
            boolean z7 = ((((i12 & 112) ^ 48) > 32 && cavVarB.B(bclVar)) || (i12 & 48) == 32) | ((((i12 & 896) ^ 384) > 256 && cavVarB.B(bbmVar)) || (i12 & 384) == 256) | ((((i12 & 7168) ^ 3072) > 2048 && cavVarB.B(ayyVar)) || (i12 & 3072) == 2048) | ((((57344 & i12) ^ 24576) > 16384 && cavVarB.C(false)) || (i12 & 24576) == 16384);
            if (((458752 & i12) ^ 196608) > 131072) {
                z2 = true;
                if (!cavVarB.C(true)) {
                    if ((i12 & 196608) == 131072) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            } else if ((i12 & 196608) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zB2 = z7 | z2 | ((((3670016 & i12) ^ 1572864) > 1048576 && cavVarB.B(awaVar)) || (i12 & 1572864) == 1048576) | ((((29360128 & i12) ^ 12582912) > 8388608 && cavVarB.B(awhVar)) || (i12 & 12582912) == 8388608) | cavVarB.B(apklVar) | cavVarB.B(beoVar2) | cavVarB.B(bboVar);
            java.lang.Object objR6 = cbtVar.R();
            if (zB2 || objR6 == obj) {
                i5 = 32;
                bcaVar = new bca(bclVar, ayyVar, aopyVar2, bbmVar, awhVar, aossVar, apklVar, denVar2, beoVar2, bboVar);
                bclVar3 = bclVar;
                aopyVar = aopyVar2;
                cbtVar.ab(bcaVar);
            } else {
                bcaVar = objR6;
                aopyVar = aopyVar2;
                i5 = 32;
                bclVar3 = bclVar;
            }
            defpackage.bed bedVar = (defpackage.bed) bcaVar;
            java.lang.Object objR7 = cbtVar.R();
            if (i11 == i5 || objR7 == obj) {
                objR7 = new apv(bclVar3, 7);
                cbtVar.ab(objR7);
            }
            boolean z8 = true;
            defpackage.aqb aqbVarAG = defpackage.den.aG(false, true, (defpackage.aomy) objR7, cavVarB, (i6 >> 12) & 126);
            defpackage.aso asoVar = defpackage.aso.a;
            if (z) {
                cavVarB.u(-624784261);
                if ((((i7 & 14) ^ 6) <= 4 || !cavVarB.B(bclVar3)) && (i7 & 6) != 4) {
                    z8 = false;
                }
                java.lang.Object objR8 = cbtVar.R();
                if (z8 || objR8 == obj) {
                    objR8 = new bbn(bclVar3);
                    cbtVar.ab(objR8);
                }
                bdiVar = new defpackage.bdi((bbn) objR8, bclVar3.p, false, asoVar);
                cbtVar.W(false);
            } else {
                cavVarB.u(-624488056);
                cbtVar.W(false);
                bdiVar = defpackage.cmw.c;
            }
            defpackage.aopy aopyVar3 = aopyVar;
            bcl bclVar4 = bclVar3;
            defpackage.cmw cmwVarBZ = defpackage.den.bZ(cmwVar.a(bclVar3.f).a(bclVar3.g).a(new defpackage.ber(aopyVar, bcpVar, asoVar, z, false)).a(bdiVar), bclVar4, asoVar, amnVar, z, false, arsVar, bclVar3.q, aqbVarAG);
            bclVar2 = bclVar4;
            cavVar2 = cavVarB;
            defpackage.den.aD(aopyVar3, cmwVarBZ.a(new defpackage.bcz(bclVar2.h)), beoVar2, bedVar, cavVar2, 0);
        } else {
            cavVar2 = cavVarB;
            bclVar2 = bclVar;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bby(cmwVar, bclVar2, bbmVar, ayyVar, arsVar, z, amnVar, awhVar, awaVar, bdnVar, aonjVar, i, i2, 0);
        }
    }

    public static final int d(bcc bccVar, defpackage.aso asoVar) {
        return asoVar == defpackage.aso.a ? bccVar.l : bccVar.m;
    }

    public static final defpackage.cmw e(defpackage.cmw cmwVar, defpackage.aonj aonjVar) {
        return cmwVar.a(new defpackage.cyn(aonjVar));
    }

    public static int f(defpackage.cye cyeVar, defpackage.cxf cxfVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new dcm((defpackage.cxe) list.get(i2), 2, 2, 1));
        }
        return cyeVar.e(new cxh(cxfVar, cxfVar.p()), arrayList, defpackage.dpe.c(0, i, 0, Integer.MAX_VALUE)).b();
    }

    public static int g(defpackage.cye cyeVar, defpackage.cxf cxfVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new dcm((defpackage.cxe) list.get(i2), 2, 1, 1));
        }
        return cyeVar.e(new cxh(cxfVar, cxfVar.p()), arrayList, defpackage.dpe.c(0, Integer.MAX_VALUE, 0, i)).c();
    }

    public static int h(defpackage.cye cyeVar, defpackage.cxf cxfVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new dcm((defpackage.cxe) list.get(i2), 1, 2, 1));
        }
        return cyeVar.e(new cxh(cxfVar, cxfVar.p()), arrayList, defpackage.dpe.c(0, i, 0, Integer.MAX_VALUE)).b();
    }

    public static int i(defpackage.cye cyeVar, defpackage.cxf cxfVar, java.util.List list, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new dcm((defpackage.cxe) list.get(i2), 1, 1, 1));
        }
        return cyeVar.e(new cxh(cxfVar, cxfVar.p()), arrayList, defpackage.dpe.c(0, Integer.MAX_VALUE, 0, i)).c();
    }

    public static final defpackage.dbu j(defpackage.dbu dbuVar) {
        defpackage.dbk dbkVarM = dbuVar.M();
        while (true) {
            defpackage.dbk dbkVarK = dbkVarM.k();
            if ((dbkVarK != null ? dbkVarK.j : null) == null) {
                break;
            }
            defpackage.dbk dbkVarK2 = dbkVarM.k();
            defpackage.dbk dbkVar = dbkVarK2 != null ? dbkVarK2.j : null;
            if (dbkVar == null) {
                defpackage.aooh.g();
            }
            if (dbkVar.i) {
                dbkVarM = dbkVarM.k();
                if (dbkVarM == null) {
                    defpackage.aooh.g();
                }
            } else {
                defpackage.dbk dbkVarK3 = dbkVarM.k();
                if (dbkVarK3 == null) {
                    defpackage.aooh.g();
                }
                dbkVarM = dbkVarK3.j;
                if (dbkVarM == null) {
                    defpackage.aooh.g();
                }
            }
        }
        defpackage.dbu dbuVarD = dbkVarM.p().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbuVarD;
    }

    public static final defpackage.aonn k(java.util.List list) {
        return new defpackage.cja(1271844412, true, new defpackage.brg(list, 10));
    }
}
