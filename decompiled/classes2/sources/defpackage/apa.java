package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class apa {
    public static final defpackage.aox a;

    static {
        boolean z = true;
        new defpackage.drs(z, z, 1002, 1536);
        a = new defpackage.aox(cqg.h(-72057594037927936L, 0.38f), cqg.h(-72057594037927936L, 0.38f));
    }

    public static final void a(defpackage.aox aoxVar, cmw cmwVar, aono aonoVar, cav cavVar, int i) {
        int i2;
        cmw cogVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-527864079);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(aoxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonoVar) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            long j = defpackage.aoy.a;
            bgc bgcVarB = bge.b(4.0f);
            int iA = dpi.a(3.0f, 0.0f);
            int iA2 = dpi.a(3.0f, 0.0f);
            boolean z = iA > 0;
            if (iA2 > 0) {
                cogVar = new defpackage.cog(bgcVarB, z);
            } else if (z) {
                z = true;
                cogVar = new defpackage.cog(bgcVarB, z);
            } else {
                cogVar = cmwVar;
            }
            long j2 = aoxVar.a;
            cmw cmwVarF = defpackage.rl.f(den.aZ(sl.d(den.bp(cogVar, -4294967296L)), 0.0f, 8.0f), defpackage.rl.e(cbtVarB, 0), true);
            int i4 = (i2 << 3) & 7168;
            cye cyeVarA = aww.a(awi.c, cmh.j, cbtVarB, 0);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarF);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarA, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            aonoVar.a(awy.a, cbtVarB, java.lang.Integer.valueOf(((i4 >> 6) & 112) | 6));
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aoz(aoxVar, cmwVar, aonoVar, i, 0);
        }
    }

    public static final void b(java.lang.String str, boolean z, defpackage.aox aoxVar, cmw cmwVar, aono aonoVar, aomy aomyVar, cav cavVar, int i) {
        int i2;
        long j;
        long j2;
        aono aonoVar2 = aonoVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-2001167027);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.B(aoxVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.B(cmwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.D(aonoVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cbtVarB.D(aomyVar) ? 65536 : 131072;
        }
        if (cbtVarB.H((74899 & i2) != 74898, i2 & 1)) {
            long j3 = defpackage.aoy.a;
            int i4 = i2 & 112;
            cmn cmnVar = defpackage.aoy.e;
            awb awbVarF = awi.f(12.0f);
            boolean z2 = i4 == 32;
            boolean z3 = (458752 & i2) == 131072;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if ((z2 | z3) || objR == cau.a) {
                objR = new defpackage.bfv(z, aomyVar, 1);
                cbtVar.ab(objR);
            }
            cmw cmwVarAZ = den.aZ(azm.j(azm.d(den.bj(cmwVar, z, str, (dib) null, (aomy) objR), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), 12.0f, 0.0f);
            cye cyeVarA = azh.a(awbVarF, cmnVar, cbtVarB, 54);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarAZ);
            aomy aomyVar2 = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar2);
            } else {
                cbtVarB.x();
            }
            aonn aonnVar = dam.e;
            cev.c(cbtVarB, cyeVarA, aonnVar);
            aonn aonnVar2 = dam.d;
            cev.c(cbtVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar3 = dam.f;
            cev.c(cbtVarB, numValueOf, aonnVar3);
            aonj aonjVar = dam.g;
            cev.b(cbtVarB, aonjVar);
            aonn aonnVar4 = dam.c;
            cev.c(cbtVarB, cmwVarM, aonnVar4);
            azk azkVar = azk.a;
            if (aonoVar2 == null) {
                cbtVarB.u(-1597947094);
                cbtVar.W(false);
            } else {
                cbtVarB.u(-1597947093);
                cmw cmwVarN = azm.n(cmw.c, 24.0f, 0.0f, 24.0f, 24.0f, 2);
                cye cyeVarB = awo.b(cmh.a, false);
                int iM2 = anty.M(cbtVar.x);
                cje cjeVarAi2 = cbtVar.ai();
                cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarN);
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar2);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVarB, aonnVar);
                cev.c(cbtVarB, cjeVarAi2, aonnVar2);
                cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
                cev.b(cbtVarB, aonjVar);
                cev.c(cbtVarB, cmwVarM2, aonnVar4);
                if (z) {
                    long j4 = aoxVar.c;
                    j = -72057594037927936L;
                } else {
                    j = aoxVar.e;
                }
                aonoVar2 = aonoVar;
                aonoVar2.a(new cqg(j), cbtVarB, 0);
                cbtVar.W(true);
                cbtVar.W(false);
            }
            if (z) {
                long j5 = aoxVar.b;
                j2 = -72057594037927936L;
            } else {
                j2 = aoxVar.d;
            }
            den.av(str, azkVar.a(cmw.c, 1.0f, true), new dkz(j2, defpackage.aoy.a, defpackage.aoy.b, defpackage.aoy.d, 5, defpackage.aoy.c, 16613240), (aonj) null, 0, false, 1, 0, cbtVarB, (i2 & 14) | 1572864, 952);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bxp(str, z, aoxVar, cmwVar, aonoVar2, aomyVar, i, 1);
        }
    }

    public static final void c(cmw cmwVar, defpackage.aox aoxVar, aonj aonjVar, cav cavVar, int i) {
        int i2 = i & 384;
        int i3 = i | 54;
        cav cavVarB = cavVar.b(-625529233);
        int i4 = 1;
        if (i2 == 0) {
            i3 |= true != cavVarB.D(aonjVar) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            cmwVar = cmw.c;
            aoxVar = a;
            a(aoxVar, cmwVar, cfo.j(-250345048, new defpackage.bli(aonjVar, aoxVar, i4, null), cavVarB), cavVarB, ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112));
        } else {
            cavVarB.s();
        }
        cmw cmwVar2 = cmwVar;
        defpackage.aox aoxVar2 = aoxVar;
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aoz((java.lang.Object) cmwVar2, (java.lang.Object) aoxVar2, (java.lang.Object) aonjVar, i, 2, (byte[]) null);
        }
    }
}
