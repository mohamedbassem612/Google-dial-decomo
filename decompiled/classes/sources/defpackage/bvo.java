package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bvo {
    public static final defpackage.cbd a = new defpackage.cbn(defpackage.cdu.c, new defpackage.ns(18));

    public static final defpackage.cmw a(defpackage.cmw cmwVar, defpackage.crd crdVar, long j, defpackage.amu amuVar, float f) {
        defpackage.crd crdVar2;
        defpackage.cmw cmwVarK;
        defpackage.cmw amtVar;
        if (f > 0.0f) {
            crdVar2 = crdVar;
            cmwVarK = defpackage.cfd.K(defpackage.cmw.c, 0.0f, 0.0f, 0.0f, f, 0.0f, crdVar2, false, 0, 1042399);
        } else {
            crdVar2 = crdVar;
            cmwVarK = defpackage.cmw.c;
        }
        defpackage.cmw cmwVarA = cmwVar.a(cmwVarK);
        if (amuVar != null) {
            amtVar = new defpackage.amt(amuVar.a, amuVar.b, crdVar2);
        } else {
            amtVar = defpackage.cmw.c;
        }
        return defpackage.cfd.K(cmwVarA.a(amtVar).a(new defpackage.amq(j, null, crdVar2, 2)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, crdVar2, true, 0, 1042431);
    }

    public static final void b(defpackage.cmw cmwVar, defpackage.crd crdVar, long j, long j2, float f, float f2, defpackage.amu amuVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        if ((i & 1) != 0) {
            cmwVar = defpackage.cmw.c;
        }
        if ((i & 2) != 0) {
            crdVar = defpackage.cqz.a;
        }
        if ((i & 4) != 0) {
            j = ((defpackage.bqv) cavVar.e(defpackage.bqx.a)).a.p;
        }
        if ((i & 8) != 0) {
            j2 = defpackage.bos.d(j, cavVar);
        }
        if ((i & 16) != 0) {
            f = 0.0f;
        }
        if ((i & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i & 64) != 0) {
            amuVar = null;
        }
        defpackage.cbd cbdVar = a;
        float f3 = ((defpackage.dpi) cavVar.e(cbdVar)).a + f + 0.0f;
        defpackage.den.ac(new defpackage.cdj[]{defpackage.boy.a.b(new defpackage.cqg(j2)), cbdVar.b(new defpackage.dpi(f3))}, defpackage.cfo.j(421772006, new bvl(cmwVar, crdVar, j, f3, amuVar, f2, aonnVar), cavVar), cavVar, 48);
    }

    public static final void c(final boolean z, final defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z2, defpackage.crd crdVar, long j, float f, defpackage.amu amuVar, defpackage.kaw kawVar, final defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        defpackage.kaw kawVar2;
        final defpackage.cmw cmwVar2 = (i & 4) != 0 ? defpackage.cmw.c : cmwVar;
        final boolean z3 = (!((i & 8) == 0)) | z2;
        defpackage.crd crdVar2 = (i & 16) != 0 ? defpackage.cqz.a : crdVar;
        long j2 = (i & 32) != 0 ? ((defpackage.bqv) cavVar.e(defpackage.bqx.a)).a.p : j;
        long jD = (i & 64) != 0 ? defpackage.bos.d(j2, cavVar) : 0L;
        float f2 = (i & 256) != 0 ? 0.0f : f;
        defpackage.amu amuVar2 = (i & 512) != 0 ? null : amuVar;
        if (kawVar == null) {
            cavVar.u(1528105640);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            kawVar2 = (defpackage.kaw) objR;
            cbtVar.W(false);
        } else {
            cavVar.u(-227801585);
            ((defpackage.cbt) cavVar).W(false);
            kawVar2 = kawVar;
        }
        defpackage.cbd cbdVar = a;
        final float f3 = ((defpackage.dpi) cavVar.e(cbdVar)).a + 0.0f + 0.0f;
        defpackage.cdj[] cdjVarArr = {defpackage.boy.a.b(new defpackage.cqg(jD)), cbdVar.b(new defpackage.dpi(f3))};
        final defpackage.amu amuVar3 = amuVar2;
        final defpackage.kaw kawVar3 = kawVar2;
        final defpackage.crd crdVar3 = crdVar2;
        final long j3 = j2;
        final float f4 = f2;
        defpackage.den.ac(cdjVarArr, defpackage.cfo.j(1508735219, new defpackage.aonn() { // from class: bvk
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                defpackage.cmw cmwVarA;
                defpackage.cav cavVar2 = (defpackage.cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                int i2 = iIntValue & 3;
                int i3 = iIntValue & 1;
                defpackage.cbd cbdVar2 = defpackage.bvo.a;
                if (cavVar2.H(i2 != 2, i3)) {
                    float f5 = f4;
                    defpackage.aomy aomyVar2 = aomyVar;
                    boolean z4 = z3;
                    boolean z5 = z;
                    defpackage.amu amuVar4 = amuVar3;
                    float f6 = f3;
                    long j4 = j3;
                    defpackage.crd crdVar4 = crdVar3;
                    defpackage.kaw kawVar4 = kawVar3;
                    defpackage.cmw cmwVar3 = cmwVar2;
                    defpackage.cxa cxaVar = defpackage.bqd.a;
                    defpackage.cmw cmwVarA2 = cmwVar3.a(defpackage.brl.a);
                    defpackage.cbd cbdVar3 = defpackage.bsw.a;
                    java.lang.Object obj3 = ((defpackage.kaw) cavVar2.e(cbdVar3)).a;
                    defpackage.cmt cmtVar = defpackage.cmw.c;
                    defpackage.cmw cmwVarA3 = defpackage.bvo.a(cmwVarA2.a(cmtVar), crdVar4, defpackage.bos.c(((defpackage.bqv) cavVar2.e(defpackage.bqx.a)).a, j4, f6, cavVar2), amuVar4, ((defpackage.dpf) cavVar2.e(defpackage.dfo.e)).dl(f5));
                    java.lang.Object obj4 = ((defpackage.kaw) cavVar2.e(cbdVar3)).a;
                    defpackage.any anyVarA = defpackage.bsw.a(false, 0.0f, crdVar4, true, 215);
                    if (anyVarA instanceof defpackage.any) {
                        cmwVarA = new defpackage.bfq(z5, kawVar4, anyVarA, z4, aomyVar2);
                    } else if (anyVarA == null) {
                        cmwVarA = new defpackage.bfq(z5, kawVar4, null, z4, aomyVar2);
                    } else {
                        cmwVarA = kawVar4 != null ? defpackage.anu.a(cmtVar, kawVar4, anyVarA).a(new defpackage.bfq(z5, kawVar4, null, z4, aomyVar2)) : new defpackage.cmr(new bfr(anyVarA, z5, z4, aomyVar2));
                    }
                    defpackage.cmw cmwVarA4 = cmwVarA3.a(cmwVarA).a(new defpackage.bxx(new defpackage.aln(18)));
                    defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, true);
                    long jA = cavVar2.a();
                    long j5 = jA ^ (jA >>> 32);
                    defpackage.cje cjeVarM = cavVar2.M();
                    defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar2, cmwVarA4);
                    defpackage.aomy aomyVar3 = defpackage.dam.a;
                    cavVar2.L();
                    cavVar2.v();
                    if (cavVar2.F()) {
                        cavVar2.j(aomyVar3);
                    } else {
                        cavVar2.x();
                    }
                    defpackage.aonn aonnVar2 = aonnVar;
                    defpackage.cev.c(cavVar2, cyeVarB, defpackage.dam.e);
                    defpackage.cev.c(cavVar2, cjeVarM, defpackage.dam.d);
                    defpackage.cev.c(cavVar2, java.lang.Integer.valueOf((int) j5), defpackage.dam.f);
                    cavVar2.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar2, cmwVarM, defpackage.dam.c);
                    aonnVar2.a(cavVar2, 0);
                    cavVar2.n();
                } else {
                    cavVar2.s();
                }
                return defpackage.aojh.a;
            }
        }, cavVar), cavVar, 48);
    }

    public static final void d(final defpackage.aomy aomyVar, defpackage.cmw cmwVar, boolean z, defpackage.crd crdVar, long j, long j2, float f, float f2, defpackage.amu amuVar, defpackage.kaw kawVar, final defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        float f3;
        final defpackage.cmw cmwVar2 = (i & 2) != 0 ? defpackage.cmw.c : cmwVar;
        final boolean z2 = (!((i & 4) == 0)) | z;
        defpackage.crd crdVar2 = (i & 8) != 0 ? defpackage.cqz.a : crdVar;
        long j3 = (i & 16) != 0 ? ((defpackage.bqv) cavVar.e(defpackage.bqx.a)).a.p : j;
        long jD = (i & 32) != 0 ? defpackage.bos.d(j3, cavVar) : j2;
        float f4 = (i & 64) != 0 ? 0.0f : f;
        float f5 = (i & 128) != 0 ? 0.0f : f2;
        defpackage.amu amuVar2 = (i & 256) != 0 ? null : amuVar;
        defpackage.kaw kawVar2 = (i & 512) != 0 ? null : kawVar;
        if (kawVar2 == null) {
            cavVar.u(-1701074900);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
            java.lang.Object objR = cbtVar.R();
            f3 = 0.0f;
            if (objR == defpackage.cau.a) {
                objR = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            cbtVar.W(false);
            kawVar2 = (defpackage.kaw) objR;
        } else {
            f3 = 0.0f;
            cavVar.u(2023335947);
            ((defpackage.cbt) cavVar).W(false);
        }
        defpackage.cbd cbdVar = a;
        final float f6 = ((defpackage.dpi) cavVar.e(cbdVar)).a + f4 + f3;
        defpackage.cdj[] cdjVarArr = {defpackage.boy.a.b(new defpackage.cqg(jD)), cbdVar.b(new defpackage.dpi(f6))};
        final defpackage.crd crdVar3 = crdVar2;
        final defpackage.kaw kawVar3 = kawVar2;
        final long j4 = j3;
        final float f7 = f5;
        final defpackage.amu amuVar3 = amuVar2;
        defpackage.den.ac(cdjVarArr, defpackage.cfo.j(849208527, new defpackage.aonn() { // from class: bvm
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                defpackage.cav cavVar2 = (defpackage.cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                int i2 = iIntValue & 3;
                int i3 = iIntValue & 1;
                defpackage.cbd cbdVar2 = defpackage.bvo.a;
                if (cavVar2.H(i2 != 2, i3)) {
                    float f8 = f7;
                    defpackage.aomy aomyVar2 = aomyVar;
                    boolean z3 = z2;
                    defpackage.amu amuVar4 = amuVar3;
                    float f9 = f6;
                    long j5 = j4;
                    defpackage.crd crdVar4 = crdVar3;
                    defpackage.kaw kawVar4 = kawVar3;
                    defpackage.cmw cmwVar3 = cmwVar2;
                    defpackage.cxa cxaVar = defpackage.bqd.a;
                    defpackage.cmw cmwVarA = cmwVar3.a(defpackage.brl.a);
                    defpackage.cbd cbdVar3 = defpackage.bsw.a;
                    java.lang.Object obj3 = ((defpackage.kaw) cavVar2.e(cbdVar3)).a;
                    defpackage.cmw cmwVarA2 = defpackage.bvo.a(cmwVarA.a(defpackage.cmw.c), crdVar4, defpackage.bos.c(((defpackage.bqv) cavVar2.e(defpackage.bqx.a)).a, j5, f9, cavVar2), amuVar4, ((defpackage.dpf) cavVar2.e(defpackage.dfo.e)).dl(f8));
                    java.lang.Object obj4 = ((defpackage.kaw) cavVar2.e(cbdVar3)).a;
                    defpackage.cmw cmwVarA3 = defpackage.den.ca(cmwVarA2, kawVar4, defpackage.bsw.a(false, 0.0f, crdVar4, true, 215), z3, null, aomyVar2).a(new defpackage.bxx(new defpackage.aln(18)));
                    defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, true);
                    long jA = cavVar2.a();
                    long j6 = jA ^ (jA >>> 32);
                    defpackage.cje cjeVarM = cavVar2.M();
                    defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar2, cmwVarA3);
                    defpackage.aomy aomyVar3 = defpackage.dam.a;
                    cavVar2.L();
                    cavVar2.v();
                    if (cavVar2.F()) {
                        cavVar2.j(aomyVar3);
                    } else {
                        cavVar2.x();
                    }
                    defpackage.aonn aonnVar2 = aonnVar;
                    defpackage.cev.c(cavVar2, cyeVarB, defpackage.dam.e);
                    defpackage.cev.c(cavVar2, cjeVarM, defpackage.dam.d);
                    defpackage.cev.c(cavVar2, java.lang.Integer.valueOf((int) j6), defpackage.dam.f);
                    cavVar2.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
                    defpackage.cev.c(cavVar2, cmwVarM, defpackage.dam.c);
                    aonnVar2.a(cavVar2, 0);
                    cavVar2.n();
                } else {
                    cavVar2.s();
                }
                return defpackage.aojh.a;
            }
        }, cavVar), cavVar, 48);
    }
}
