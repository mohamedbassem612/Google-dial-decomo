package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ppy implements aono {
    public final /* synthetic */ defpackage.pqa a;
    public final /* synthetic */ defpackage.pom b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ppy(defpackage.pqa pqaVar, defpackage.pom pomVar, boolean z, boolean z2) {
        this.a = pqaVar;
        this.b = pomVar;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0143  */
    /* JADX WARN: Code duplicated, block: B:40:0x0147  */
    /* JADX WARN: Code duplicated, block: B:43:0x0175  */
    /* JADX WARN: Code duplicated, block: B:45:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x0207  */
    /* JADX WARN: Code duplicated, block: B:54:0x020a  */
    /* JADX WARN: Code duplicated, block: B:59:0x022f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0240  */
    /* JADX WARN: Code duplicated, block: B:64:0x0248  */
    /* JADX WARN: Code duplicated, block: B:66:0x025e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0276  */
    /* JADX WARN: Code duplicated, block: B:71:0x0290  */
    /* JADX WARN: Code duplicated, block: B:73:0x0297  */
    /* JADX WARN: Code duplicated, block: B:75:0x029b  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a4 A[DONT_INVERT] */
    /* JADX WARN: Type inference failed for: r15v0, types: [boolean, int] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        cmw cmwVarM;
        cmi cmiVar;
        awh awhVar;
        aomy aomyVar;
        boolean z;
        aonn aonnVar;
        aonn aonnVar2;
        aonn aonnVar3;
        aonj aonjVar;
        aonn aonnVar4;
        float f;
        cmw cmwVar;
        defpackage.pzp pzpVar;
        float f2;
        defpackage.pne pneVar;
        cmt cmtVar;
        float f3;
        cer cerVarB;
        boolean zB;
        java.lang.Object objG;
        cmw cmwVarAN;
        int i;
        java.lang.Object objG2;
        defpackage.pqb pqbVar = (defpackage.pqb) obj;
        cav cavVar = (cav) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        aooh.f(pqbVar, "variant");
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != cavVar.z(pqbVar.ordinal()) ? 2 : 4;
        }
        if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
            defpackage.pom pomVar = this.b;
            defpackage.pqa pqaVar = this.a;
            boolean z2 = pqaVar.d != null;
            int iA = dpi.a(dpk.a(((dgn) cavVar.e(dfo.o)).a()), 600.0f);
            ?? r15 = iA >>> 31;
            android.content.Context context = (android.content.Context) cavVar.e(dep.b);
            aooh.f(context, "context");
            pps ppsVar = (pps) agab.aH(context, pps.class);
            boolean zB2 = cavVar.B(pqaVar) | cavVar.D(pomVar);
            java.lang.Object objG3 = cavVar.g();
            if (zB2 || objG3 == cau.a) {
                objG3 = new ofa(pqaVar, pomVar, (aoln) null, 18);
                cavVar.w(objG3);
            }
            cbp.g(pomVar, (aonn) objG3, cavVar);
            if (((java.lang.Boolean) ppsVar.hG().a()).booleanValue()) {
                cavVar.u(1977764732);
                int i2 = ((android.content.res.Configuration) cavVar.e(dep.a)).orientation;
                cavVar.o();
                if (i2 == 1) {
                    cavVar.u(1977767655);
                    cmt cmtVar2 = cmw.c;
                    java.lang.Object objG4 = cavVar.g();
                    if (objG4 == cau.a) {
                        objG4 = new defpackage.pmu(11);
                        cavVar.w(objG4);
                    }
                    cmwVarM = dig.b(cmtVar2, false, (aonj) objG4);
                    cavVar.o();
                }
                cmiVar = cmh.k;
                awhVar = awi.c;
                cye cyeVarA = aww.a(awhVar, cmiVar, cavVar, 48);
                int iM = anty.M(cavVar.a());
                cje cjeVarM = cavVar.M();
                cmw cmwVarM2 = cfo.m(cavVar, cmwVarM);
                aomyVar = dam.a;
                cavVar.L();
                cavVar.v();
                if (cavVar.F()) {
                    cavVar.j(aomyVar);
                } else {
                    cavVar.x();
                }
                int i3 = iIntValue;
                z = this.c;
                aonnVar = dam.e;
                cev.c(cavVar, cyeVarA, aonnVar);
                aonnVar2 = dam.d;
                cev.c(cavVar, cjeVarM, aonnVar2);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
                aonnVar3 = dam.f;
                cev.c(cavVar, numValueOf, aonnVar3);
                aonjVar = dam.g;
                cev.b(cavVar, aonjVar);
                aonnVar4 = dam.c;
                cev.c(cavVar, cmwVarM2, aonnVar4);
                f = 0.0f;
                if (z) {
                    cavVar.u(-1905520494);
                    pneVar = pomVar.q;
                    cmj cmjVar = cmh.h;
                    cmtVar = cmw.c;
                    cye cyeVarB = awo.b(cmjVar, false);
                    int iM2 = anty.M(cavVar.a());
                    cje cjeVarM2 = cavVar.M();
                    cmw cmwVarM3 = cfo.m(cavVar, cmtVar);
                    cavVar.L();
                    cavVar.v();
                    if (cavVar.F()) {
                        cavVar.j(aomyVar);
                    } else {
                        cavVar.x();
                    }
                    cev.c(cavVar, cyeVarB, aonnVar);
                    cev.c(cavVar, cjeVarM2, aonnVar2);
                    cev.c(cavVar, java.lang.Integer.valueOf(iM2), aonnVar3);
                    cev.b(cavVar, aonjVar);
                    cev.c(cavVar, cmwVarM3, aonnVar4);
                    cye cyeVarA2 = aww.a(awhVar, cmiVar, cavVar, 48);
                    int iM3 = anty.M(cavVar.a());
                    cje cjeVarM3 = cavVar.M();
                    cmw cmwVarM4 = cfo.m(cavVar, cmtVar);
                    cavVar.L();
                    cavVar.v();
                    if (cavVar.F()) {
                        cavVar.j(aomyVar);
                    } else {
                        cavVar.x();
                    }
                    cev.c(cavVar, cyeVarA2, aonnVar);
                    cev.c(cavVar, cjeVarM3, aonnVar2);
                    cev.c(cavVar, java.lang.Integer.valueOf(iM3), aonnVar3);
                    cev.b(cavVar, aonjVar);
                    cev.c(cavVar, cmwVarM4, aonnVar4);
                    pez.L(pomVar, z2, (boolean) r15, ppsVar, cavVar);
                    if (pneVar == null) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    cmwVar = null;
                    cerVarB = aim.b(f3, (aiq) null, (java.lang.String) null, cavVar, 0, 30);
                    cavVar = cavVar;
                    cavVar.u(431662158);
                    zB = cavVar.B(cerVarB);
                    objG = cavVar.g();
                    if (zB || objG == cau.a) {
                        objG = new defpackage.pqf(cerVarB, 1);
                        cavVar.w(objG);
                    }
                    cmwVarAN = aehj.aN(cmtVar, (aomy) objG);
                    if (pneVar != null) {
                        objG2 = cavVar.g();
                        if (objG2 == cau.a) {
                            objG2 = new defpackage.pmu(13);
                            cavVar.w(objG2);
                        }
                        i = 0;
                        cmwVarAN = cmwVarAN.a(dig.b(cmtVar, false, (aonj) objG2));
                    } else {
                        i = 0;
                    }
                    cavVar.o();
                    pez.K(pqaVar, pomVar, cmwVarAN, cavVar, i);
                    cavVar.n();
                    pez.H(pneVar, pqaVar.f, cavVar, i);
                    cavVar.n();
                    cavVar.o();
                } else {
                    cmwVar = null;
                    cavVar.u(-1904675124);
                    pez.L(pomVar, z2, (boolean) r15, ppsVar, cavVar);
                    pez.K(pqaVar, pomVar, (cmw) null, cavVar, 1);
                    cavVar.o();
                }
                pzpVar = pomVar.p;
                cmt cmtVar3 = cmw.c;
                if (iA < 0) {
                    f = 4.0f;
                } else {
                    f2 = 12.0f;
                    if (pzpVar != null) {
                        defpackage.pqb pqbVar2 = defpackage.pqb.a;
                        if (pzpVar.ordinal() != 3) {
                            if (!z2) {
                            }
                            boolean z3 = this.d;
                            den.aR(azm.e(cmtVar3, f2), cavVar);
                            pez.N(pomVar.e, cmtVar3, (boolean) r15, pqbVar, cavVar, ((i3 << 9) & 7168) | 48);
                            den.aR(azm.e(cmtVar3, 8.0f), cavVar);
                            pez.Q(pomVar, cmwVar, z3, cavVar, 0);
                            pez.R(pomVar.r, cmwVar, cavVar, 0);
                            cavVar.n();
                        }
                    } else {
                        if (!z2) {
                        }
                        boolean z4 = this.d;
                        den.aR(azm.e(cmtVar3, f2), cavVar);
                        pez.N(pomVar.e, cmtVar3, (boolean) r15, pqbVar, cavVar, ((i3 << 9) & 7168) | 48);
                        den.aR(azm.e(cmtVar3, 8.0f), cavVar);
                        pez.Q(pomVar, cmwVar, z4, cavVar, 0);
                        pez.R(pomVar.r, cmwVar, cavVar, 0);
                        cavVar.n();
                    }
                    boolean z5 = this.d;
                    den.aR(azm.e(cmtVar3, f2), cavVar);
                    pez.N(pomVar.e, cmtVar3, (boolean) r15, pqbVar, cavVar, ((i3 << 9) & 7168) | 48);
                    den.aR(azm.e(cmtVar3, 8.0f), cavVar);
                    pez.Q(pomVar, cmwVar, z5, cavVar, 0);
                    pez.R(pomVar.r, cmwVar, cavVar, 0);
                    cavVar.n();
                }
                f2 = f;
                boolean z6 = this.d;
                den.aR(azm.e(cmtVar3, f2), cavVar);
                pez.N(pomVar.e, cmtVar3, (boolean) r15, pqbVar, cavVar, ((i3 << 9) & 7168) | 48);
                den.aR(azm.e(cmtVar3, 8.0f), cavVar);
                pez.Q(pomVar, cmwVar, z6, cavVar, 0);
                pez.R(pomVar.r, cmwVar, cavVar, 0);
                cavVar.n();
            } else {
                cavVar.u(1181165785);
                cavVar.o();
            }
            cavVar.u(1977771820);
            cmt cmtVar4 = cmw.c;
            java.lang.Object objG5 = cavVar.g();
            if (objG5 == cau.a) {
                objG5 = new defpackage.pmu(12);
                cavVar.w(objG5);
            }
            cmwVarM = uu.m(dig.b(cmtVar4, false, (aonj) objG5), new azr(uu.f(cavVar), uu.j(cavVar)));
            cavVar.o();
            cmiVar = cmh.k;
            awhVar = awi.c;
            cye cyeVarA3 = aww.a(awhVar, cmiVar, cavVar, 48);
            int iM4 = anty.M(cavVar.a());
            cje cjeVarM4 = cavVar.M();
            cmw cmwVarM5 = cfo.m(cavVar, cmwVarM);
            aomyVar = dam.a;
            cavVar.L();
            cavVar.v();
            if (cavVar.F()) {
                cavVar.j(aomyVar);
            } else {
                cavVar.x();
            }
            int i4 = iIntValue;
            z = this.c;
            aonnVar = dam.e;
            cev.c(cavVar, cyeVarA3, aonnVar);
            aonnVar2 = dam.d;
            cev.c(cavVar, cjeVarM4, aonnVar2);
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iM4);
            aonnVar3 = dam.f;
            cev.c(cavVar, numValueOf2, aonnVar3);
            aonjVar = dam.g;
            cev.b(cavVar, aonjVar);
            aonnVar4 = dam.c;
            cev.c(cavVar, cmwVarM5, aonnVar4);
            f = 0.0f;
            if (z) {
                cavVar.u(-1905520494);
                pneVar = pomVar.q;
                cmj cmjVar2 = cmh.h;
                cmtVar = cmw.c;
                cye cyeVarB2 = awo.b(cmjVar2, false);
                int iM5 = anty.M(cavVar.a());
                cje cjeVarM5 = cavVar.M();
                cmw cmwVarM6 = cfo.m(cavVar, cmtVar);
                cavVar.L();
                cavVar.v();
                if (cavVar.F()) {
                    cavVar.j(aomyVar);
                } else {
                    cavVar.x();
                }
                cev.c(cavVar, cyeVarB2, aonnVar);
                cev.c(cavVar, cjeVarM5, aonnVar2);
                cev.c(cavVar, java.lang.Integer.valueOf(iM5), aonnVar3);
                cev.b(cavVar, aonjVar);
                cev.c(cavVar, cmwVarM6, aonnVar4);
                cye cyeVarA4 = aww.a(awhVar, cmiVar, cavVar, 48);
                int iM6 = anty.M(cavVar.a());
                cje cjeVarM6 = cavVar.M();
                cmw cmwVarM7 = cfo.m(cavVar, cmtVar);
                cavVar.L();
                cavVar.v();
                if (cavVar.F()) {
                    cavVar.j(aomyVar);
                } else {
                    cavVar.x();
                }
                cev.c(cavVar, cyeVarA4, aonnVar);
                cev.c(cavVar, cjeVarM6, aonnVar2);
                cev.c(cavVar, java.lang.Integer.valueOf(iM6), aonnVar3);
                cev.b(cavVar, aonjVar);
                cev.c(cavVar, cmwVarM7, aonnVar4);
                pez.L(pomVar, z2, (boolean) r15, ppsVar, cavVar);
                if (pneVar == null) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                cmwVar = null;
                cerVarB = aim.b(f3, (aiq) null, (java.lang.String) null, cavVar, 0, 30);
                cavVar = cavVar;
                cavVar.u(431662158);
                zB = cavVar.B(cerVarB);
                objG = cavVar.g();
                if (zB) {
                    objG = new defpackage.pqf(cerVarB, 1);
                    cavVar.w(objG);
                } else {
                    objG = new defpackage.pqf(cerVarB, 1);
                    cavVar.w(objG);
                }
                cmwVarAN = aehj.aN(cmtVar, (aomy) objG);
                if (pneVar != null) {
                    objG2 = cavVar.g();
                    if (objG2 == cau.a) {
                        objG2 = new defpackage.pmu(13);
                        cavVar.w(objG2);
                    }
                    i = 0;
                    cmwVarAN = cmwVarAN.a(dig.b(cmtVar, false, (aonj) objG2));
                } else {
                    i = 0;
                }
                cavVar.o();
                pez.K(pqaVar, pomVar, cmwVarAN, cavVar, i);
                cavVar.n();
                pez.H(pneVar, pqaVar.f, cavVar, i);
                cavVar.n();
                cavVar.o();
            } else {
                cmwVar = null;
                cavVar.u(-1904675124);
                pez.L(pomVar, z2, (boolean) r15, ppsVar, cavVar);
                pez.K(pqaVar, pomVar, (cmw) null, cavVar, 1);
                cavVar.o();
            }
            pzpVar = pomVar.p;
            cmt cmtVar5 = cmw.c;
            if (iA < 0) {
                f = 4.0f;
            } else {
                f2 = 12.0f;
                if (pzpVar != null) {
                    defpackage.pqb pqbVar3 = defpackage.pqb.a;
                    if (pzpVar.ordinal() != 3) {
                        if (!z2) {
                        }
                        boolean z7 = this.d;
                        den.aR(azm.e(cmtVar5, f2), cavVar);
                        pez.N(pomVar.e, cmtVar5, (boolean) r15, pqbVar, cavVar, ((i4 << 9) & 7168) | 48);
                        den.aR(azm.e(cmtVar5, 8.0f), cavVar);
                        pez.Q(pomVar, cmwVar, z7, cavVar, 0);
                        pez.R(pomVar.r, cmwVar, cavVar, 0);
                        cavVar.n();
                    }
                } else {
                    if (!z2) {
                    }
                    boolean z8 = this.d;
                    den.aR(azm.e(cmtVar5, f2), cavVar);
                    pez.N(pomVar.e, cmtVar5, (boolean) r15, pqbVar, cavVar, ((i4 << 9) & 7168) | 48);
                    den.aR(azm.e(cmtVar5, 8.0f), cavVar);
                    pez.Q(pomVar, cmwVar, z8, cavVar, 0);
                    pez.R(pomVar.r, cmwVar, cavVar, 0);
                    cavVar.n();
                }
                boolean z9 = this.d;
                den.aR(azm.e(cmtVar5, f2), cavVar);
                pez.N(pomVar.e, cmtVar5, (boolean) r15, pqbVar, cavVar, ((i4 << 9) & 7168) | 48);
                den.aR(azm.e(cmtVar5, 8.0f), cavVar);
                pez.Q(pomVar, cmwVar, z9, cavVar, 0);
                pez.R(pomVar.r, cmwVar, cavVar, 0);
                cavVar.n();
            }
            f2 = f;
            boolean z10 = this.d;
            den.aR(azm.e(cmtVar5, f2), cavVar);
            pez.N(pomVar.e, cmtVar5, (boolean) r15, pqbVar, cavVar, ((i4 << 9) & 7168) | 48);
            den.aR(azm.e(cmtVar5, 8.0f), cavVar);
            pez.Q(pomVar, cmwVar, z10, cavVar, 0);
            pez.R(pomVar.r, cmwVar, cavVar, 0);
            cavVar.n();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
