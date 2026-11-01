package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bvf {
    public static final defpackage.bvf a = new defpackage.bvf();
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        int i = defpackage.cac.a;
        int i2 = defpackage.cae.a;
        int i3 = defpackage.cab.a;
        int i4 = defpackage.caa.a;
        int i5 = defpackage.cad.a;
        bfx bfxVar = bth.a;
        den.bc(16.0f, 0.0f, 12.0f, 0.0f, 10);
        den.bc(12.0f, 0.0f, 10.0f, 0.0f, 10);
        den.bc(16.0f, 0.0f, 12.0f, 0.0f, 10);
        den.bc(24.0f, 0.0f, 24.0f, 0.0f, 10);
        den.bc(48.0f, 0.0f, 48.0f, 0.0f, 10);
        den.bc(64.0f, 0.0f, 64.0f, 0.0f, 10);
        den.bc(13.0f, 0.0f, 13.0f, 0.0f, 10);
        den.bc(13.0f, 0.0f, 13.0f, 0.0f, 10);
        den.bc(15.0f, 0.0f, 15.0f, 0.0f, 10);
        den.bc(29.0f, 0.0f, 29.0f, 0.0f, 10);
        den.bc(43.0f, 0.0f, 43.0f, 0.0f, 10);
        den.bc(13.0f, 0.0f, 13.0f, 0.0f, 10);
        b = 48.0f;
        c = 40.0f;
        d = 48.0f;
        bgc bgcVar = bge.a;
    }

    public final void a(aomy aomyVar, cmw cmwVar, boolean z, defpackage.bvi bviVar, bni bniVar, ayy ayyVar, aono aonoVar, cav cavVar, int i, int i2) {
        aomy aomyVar2;
        int i3;
        ayy ayyVar2;
        int i4;
        cav cavVar2;
        int i5 = i & 6;
        cav cavVarB = cavVar.b(1842194067);
        if (i5 == 0) {
            aomyVar2 = aomyVar;
            i3 = (true != cavVarB.D(aomyVar2) ? 2 : 4) | i;
        } else {
            aomyVar2 = aomyVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.B(bviVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.B(bniVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cavVarB.B((java.lang.Object) null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cavVarB.B((java.lang.Object) null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            ayyVar2 = ayyVar;
            i3 |= true != cavVarB.B(ayyVar2) ? 4194304 : 8388608;
        } else {
            ayyVar2 = ayyVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.B((java.lang.Object) null) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.D(aonoVar) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cavVarB.B(this) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if (cavVarB.H(((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            cbt cbtVar = (cbt) cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVarB.u(-287986488);
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            kaw kawVar = (kaw) objR;
            cbtVar.W(false);
            ajl ajlVarAi = den.ai(3, cavVarB);
            cer cerVarM = defpackage.rv.m(kawVar, cavVarB, 0);
            long jB = bniVar.b(z);
            long jA = bniVar.a(z);
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new defpackage.bpr(19);
                cbtVar.ab(objR2);
            }
            cmw cmwVarB = dig.b(cmwVar, false, (aonj) objR2);
            crd crdVarV = defpackage.ro.v(bviVar, a.y(cerVarM), false, ajlVarAi, cavVarB);
            cavVarB.u(-287245341);
            cbtVar.W(false);
            cavVar2 = cavVarB;
            bvo.d(aomyVar2, cmwVarB, z, crdVarV, jA, jB, 0.0f, 0.0f, (amu) null, kawVar, cfo.j(-1929660706, new defpackage.bps(jB, ayyVar2, aonoVar, 3), cavVarB), cavVar2, 64);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpq(this, aomyVar, cmwVar, z, bviVar, bniVar, ayyVar, aonoVar, i, i2, 1);
        }
    }

    public final void b(final boolean z, final aonj aonjVar, cmw cmwVar, final boolean z2, defpackage.bvi bviVar, bni bniVar, ayy ayyVar, aono aonoVar, cav cavVar, int i, int i2) {
        int i3;
        int i4;
        final crd crdVar;
        java.lang.Object obj;
        final long j;
        boolean z3;
        final kaw kawVar;
        int i5 = i & 6;
        cbt cbtVarB = cavVar.b(1676067170);
        if (i5 == 0) {
            i3 = (true != cbtVarB.C(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cbtVarB.D(aonjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cbtVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cbtVarB.C(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cbtVarB.B(bviVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != cbtVarB.B(bniVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != cbtVarB.B((java.lang.Object) null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cbtVarB.B((java.lang.Object) null) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cbtVarB.B(ayyVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cbtVarB.B((java.lang.Object) null) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != cbtVarB.D(aonoVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cbtVarB.B(this) ? 16 : 32;
        }
        if (cbtVarB.H(((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true, i3 & 1)) {
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            cbtVarB.u(-1572006375);
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj2 = cau.a;
            if (objR == obj2) {
                objR = new kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            kaw kawVar2 = (kaw) objR;
            cbtVar.W(false);
            int i6 = i3;
            ajl ajlVarAi = den.ai(3, cbtVarB);
            cer cerVarM = defpackage.rv.m(kawVar2, cbtVarB, 0);
            final dpq dpqVar = (dpq) cbtVarB.e(dfo.j);
            final dpf dpfVar = (dpf) cbtVarB.e(dfo.e);
            crd crdVarV = defpackage.ro.v(bviVar, a.y(cerVarM), z, ajlVarAi, cbtVarB);
            long jB = bniVar.b(z2);
            final long jA = bniVar.a(z2);
            boolean zB = ((i6 & 14) == 4) | cbtVarB.B(crdVarV) | cbtVarB.z(dpqVar.ordinal()) | cbtVarB.B(dpfVar) | cbtVarB.A(jB);
            java.lang.Object objR2 = cbtVar.R();
            if (zB || objR2 == obj2) {
                crdVar = crdVarV;
                j = jB;
                z3 = false;
                obj = new aonj() { // from class: bvd
                    public final java.lang.Object a(java.lang.Object obj3) {
                        dbm dbmVar = (dbm) obj3;
                        defpackage.bvf bvfVar = defpackage.bvf.a;
                        dbmVar.D();
                        if (z) {
                            long j2 = j;
                            dpf dpfVar2 = dpfVar;
                            cfd.H(dbmVar, crdVar.a(dbmVar.o(), dpqVar, dpfVar2), j2, 0.1f, 56);
                        }
                        return aojh.a;
                    }
                };
                cbtVar.ab(obj);
            } else {
                crdVar = crdVarV;
                obj = objR2;
                z3 = false;
                j = jB;
            }
            cmw cmwVarM = ru.m(cmwVar, (aonj) obj);
            java.lang.Object objR3 = cbtVar.R();
            java.lang.Object obj3 = objR3;
            if (objR3 == obj2) {
                defpackage.bpr bprVar = new defpackage.bpr(20);
                cbtVar.ab(bprVar);
                obj3 = bprVar;
            }
            final cmw cmwVarB = dig.b(cmwVarM, z3, (aonj) obj3);
            cbtVarB.u(-1570611500);
            cbtVar.W(z3);
            final cja cjaVarJ = cfo.j(1245690872, new defpackage.bve(j, crdVar, ayyVar, dpqVar, aonoVar, 0), cbtVarB);
            cbd cbdVar = bvo.a;
            if (r22 == 0) {
                cbtVarB.u(643383721);
                java.lang.Object objR4 = cbtVar.R();
                if (objR4 == obj2) {
                    objR4 = new kaw((byte[]) null, (char[]) null, (byte[]) null);
                    cbtVar.ab(objR4);
                }
                kawVar = (kaw) objR4;
                cbtVar.W(z3);
            } else {
                cbtVarB.u(-533435666);
                cbtVar.W(z3);
                kawVar = kawVar2;
            }
            cbd cbdVar2 = bvo.a;
            float f = ((dpi) cbtVarB.e(cbdVar2)).a + 0.0f;
            cdj[] cdjVarArr = new cdj[2];
            cdjVarArr[z3 ? 1 : 0] = boy.a.b(new cqg(j));
            final float f2 = f + 0.0f;
            cdjVarArr[1] = cbdVar2.b(new dpi(f2));
            final crd crdVar2 = crdVar;
            den.ac(cdjVarArr, cfo.j(-1839065134, new aonn() { // from class: bvn
                public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5) {
                    cav cavVar2 = (cav) obj4;
                    int iIntValue = ((java.lang.Integer) obj5).intValue();
                    int i7 = iIntValue & 3;
                    int i8 = iIntValue & 1;
                    cbd cbdVar3 = bvo.a;
                    if (cavVar2.H(i7 != 2, i8)) {
                        aonj aonjVar2 = aonjVar;
                        boolean z4 = z2;
                        boolean z5 = z;
                        float f3 = f2;
                        long j2 = jA;
                        crd crdVar3 = crdVar2;
                        kaw kawVar3 = kawVar;
                        cmw cmwVar2 = cmwVarB;
                        cxa cxaVar = bqd.a;
                        cmw cmwVarA = cmwVar2.a(brl.a);
                        cbd cbdVar4 = bsw.a;
                        java.lang.Object obj6 = ((kaw) cavVar2.e(cbdVar4)).a;
                        cmw cmwVarA2 = bvo.a(cmwVarA.a(cmw.c), crdVar3, bos.c(((bqv) cavVar2.e(bqx.a)).a, j2, f3, cavVar2), (amu) null, ((dpf) cavVar2.e(dfo.e)).dl(0.0f));
                        java.lang.Object obj7 = ((kaw) cavVar2.e(cbdVar4)).a;
                        cmw cmwVarA3 = wl.j(cmwVarA2, z5, kawVar3, bsw.a(false, 0.0f, crdVar3, true, 215), z4, (dib) null, aonjVar2).a(new bxx(new aln(18)));
                        cye cyeVarB = awo.b(cmh.a, true);
                        long jA2 = cavVar2.a();
                        long j3 = jA2 ^ (jA2 >>> 32);
                        cje cjeVarM = cavVar2.M();
                        cmw cmwVarM2 = cfo.m(cavVar2, cmwVarA3);
                        aomy aomyVar = dam.a;
                        cavVar2.L();
                        cavVar2.v();
                        if (cavVar2.F()) {
                            cavVar2.j(aomyVar);
                        } else {
                            cavVar2.x();
                        }
                        aonn aonnVar = cjaVarJ;
                        cev.c(cavVar2, cyeVarB, dam.e);
                        cev.c(cavVar2, cjeVarM, dam.d);
                        cev.c(cavVar2, java.lang.Integer.valueOf((int) j3), dam.f);
                        cavVar2.i(aojh.a, new bae(dam.g, 7));
                        cev.c(cavVar2, cmwVarM2, dam.c);
                        aonnVar.a(cavVar2, 0);
                        cavVar2.n();
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
            }, cbtVarB), cbtVarB, 48);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acqs(this, z, aonjVar, cmwVar, z2, bviVar, bniVar, ayyVar, aonoVar, i, i2, 1);
        }
    }
}
