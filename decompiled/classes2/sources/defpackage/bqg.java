package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bqg {
    public static final /* synthetic */ int a = 0;

    static {
        ((java.lang.Boolean) bsi.a.a()).booleanValue();
        ((java.lang.Boolean) bsi.a.a()).booleanValue();
    }

    public static final float a(int i) {
        return a.x(i, 3) ? 12.0f : 8.0f;
    }

    public static final int b(cxf cxfVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        float f;
        if (a.x(i6, 1)) {
            f = 56.0f;
        } else {
            f = a.x(i6, 2) ? 72.0f : 88.0f;
        }
        return aooc.u(java.lang.Math.max(java.lang.Math.max(dpd.c(j), cxfVar.dp(f)), i7 + java.lang.Math.max(i, java.lang.Math.max(i3 + i4 + i5, i2))), dpd.a(j));
    }

    public static final void c(long j, int i, aonn aonnVar, cav cavVar, int i2) {
        int i3;
        long j2;
        aonn aonnVar2;
        int i4 = i2 & 6;
        cav cavVarB = cavVar.b(1222481856);
        if (i4 == 0) {
            i3 = (true != cavVarB.A(j) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.z(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            j2 = j;
            aonnVar2 = aonnVar;
            den.af(j2, bwp.b(i, cavVarB), aonnVar2, cavVarB, i3 & 910);
        } else {
            j2 = j;
            aonnVar2 = aonnVar;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abij(j2, i, aonnVar2, i2, 1);
        }
    }

    public static final boolean d(dpf dpfVar, int i) {
        return i > dpfVar.do(dpy.g(30));
    }

    public static final int e(int i, int i2, int i3, int i4, int i5, int i6, long j) {
        if (dpd.h(j)) {
            return dpd.b(j);
        }
        return i6 + i + java.lang.Math.max(i3, java.lang.Math.max(i4, i5)) + i2;
    }

    public static final void f(aonn aonnVar, cmw cmwVar, aonn aonnVar2, aonn aonnVar3, aonn aonnVar4, defpackage.bqe bqeVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        aonn aonnVar5;
        aonn aonnVar6;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(487133126);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        aonn aonnVarJ = null;
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D((java.lang.Object) null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonnVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonnVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.D(aonnVar4) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(bqeVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.y(0.0f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cavVarB.y(0.0f) ? 33554432 : 67108864;
        }
        if (cavVarB.H((38347923 & i2) != 38347922, i2 & 1)) {
            cbt cbtVar = (cbt) cavVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cja cjaVarJ = cfo.j(629852750, new defpackage.awu(bqeVar, aonnVar, 10), cavVarB);
            if (aonnVar2 == null) {
                cavVarB.u(-510700881);
                cbtVar.W(false);
                aonnVar5 = null;
            } else {
                cavVarB.u(-510700880);
                aonn aonnVarJ2 = cfo.j(-1291211644, new defpackage.awu(bqeVar, aonnVar2, 11), cavVarB);
                cbtVar.W(false);
                aonnVar5 = aonnVarJ2;
            }
            cavVarB.u(-510294874);
            cbtVar.W(false);
            if (aonnVar3 == null) {
                cavVarB.u(-509967545);
                cbtVar.W(false);
                aonnVar6 = null;
            } else {
                cavVarB.u(-509967544);
                aonn aonnVarJ3 = cfo.j(449548451, new defpackage.awu(bqeVar, aonnVar3, 12), cavVarB);
                cbtVar.W(false);
                aonnVar6 = aonnVarJ3;
            }
            if (aonnVar4 == null) {
                cavVarB.u(-509423836);
                cbtVar.W(false);
            } else {
                cavVarB.u(-509423835);
                aonnVarJ = cfo.j(1946411067, new defpackage.awu(bqeVar, aonnVar4, 13), cavVarB);
                cbtVar.W(false);
            }
            aonn aonnVar7 = aonnVarJ;
            cmt cmtVar = cmw.c;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new defpackage.bpr(3);
                cbtVar.ab(objR);
            }
            cmw cmwVarA = dig.b(cmtVar, true, (aonj) objR).a(cmwVar);
            crd crdVarB = btj.b(13, cavVarB);
            long j = bqeVar.a;
            long j2 = bqeVar.b;
            cja cjaVarJ2 = cfo.j(1192488737, new defpackage.bit(aonnVar6, aonnVar7, (aonn) cjaVarJ, aonnVar5, 4), cavVarB);
            cavVar2 = cavVarB;
            bvo.b(cmwVarA, crdVarB, j, j2, 0.0f, 0.0f, (amu) null, cjaVarJ2, cavVar2, 64);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.axp(aonnVar, cmwVar, aonnVar2, aonnVar3, aonnVar4, bqeVar, i, 2);
        }
    }

    public static final void g(aonn aonnVar, aonn aonnVar2, aonn aonnVar3, aonn aonnVar4, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-61277522);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonnVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonnVar3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.D(aonnVar4) ? 8192 : 16384;
        }
        if (cbtVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new defpackage.bql();
                cbtVar.ab(objR);
            }
            defpackage.bql bqlVar = (defpackage.bql) objR;
            aonn[] aonnVarArr = new aonn[5];
            aonnVarArr[0] = aonnVar3;
            aonnVarArr[1] = defpackage.bov.a;
            aonnVarArr[2] = aonnVar4 == null ? defpackage.bov.b : aonnVar4;
            aonnVarArr[3] = aonnVar == null ? defpackage.bov.c : aonnVar;
            aonnVarArr[4] = aonnVar2 == null ? defpackage.bov.d : aonnVar2;
            java.util.List listBb = ajsz.bb(aonnVarArr);
            cmt cmtVar = cmw.c;
            aonn aonnVarK = vn.k(listBb);
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new defpackage.cyl(bqlVar);
                cbtVar.ab(objR2);
            }
            cye cyeVar = (cye) objR2;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmtVar);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVar, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            aonnVarK.a(cbtVarB, 0);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.biu(aonnVar, aonnVar2, aonnVar3, aonnVar4, i, 3);
        }
    }
}
