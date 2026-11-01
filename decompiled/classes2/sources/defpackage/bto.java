package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bto {
    public static final /* synthetic */ int a = 0;

    static {
        den.bv(300, 0, ajk.a, 2);
    }

    public static final void a(cmw cmwVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1361920385);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 16 : 32;
        }
        int i4 = 18;
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            java.lang.String strAe = den.ae(2132019208, cbtVarB);
            cmw cmwVarD = azm.d(cmw.c, 1.0f);
            cye cyeVarB = awo.b(cmh.e, false);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarD);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            float f = defpackage.bwa.a;
            int i5 = i2;
            defpackage.bwh.b(defpackage.bwa.a(1, cbtVarB), cfo.j(1497042086, new defpackage.ant(strAe, 7), cbtVarB), defpackage.bwh.c(false, false, cbtVarB, 0, 7), cmwVar, false, false, aonnVar, cbtVarB, ((i5 << 9) & 7168) | 48 | ((i5 << 21) & 234881024), 240);
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(cmwVar, aonnVar, i, i4);
        }
    }

    public static final defpackage.btt b(java.util.Set set, aonj aonjVar, defpackage.btu btuVar, cav cavVar, int i, int i2) {
        aonj aonjVar2;
        final int i3 = 0;
        final int i4 = 1;
        java.util.Set setCW = (i2 & 1) != 0 ? ajsz.cW(new defpackage.btu[]{defpackage.btu.a, defpackage.btu.c, defpackage.btu.b}) : set;
        if ((i2 & 2) != 0) {
            java.lang.Object objG = cavVar.g();
            if (objG == cau.a) {
                objG = new defpackage.bpr(17);
                cavVar.w(objG);
            }
            aonjVar2 = (aonj) objG;
        } else {
            aonjVar2 = aonjVar;
        }
        defpackage.btu btuVar2 = (i2 & 4) != 0 ? defpackage.btu.a : btuVar;
        final float f = (i2 & 8) != 0 ? 56.0f : 0.0f;
        final float f2 = (i2 & 16) != 0 ? 125.0f : 0.0f;
        boolean z = (i2 & 32) != 0;
        final dpf dpfVar = (dpf) cavVar.e(dfo.e);
        boolean zB = cavVar.B(dpfVar) | ((((i & 7168) ^ 3072) > 2048 && cavVar.y(f)) || (i & 3072) == 2048);
        java.lang.Object objG2 = cavVar.g();
        if (zB || objG2 == cau.a) {
            objG2 = new aomy() { // from class: btk
                public final java.lang.Object a() {
                    if (i4 != 0) {
                        int i5 = defpackage.bto.a;
                        return java.lang.Float.valueOf(dpfVar.dl(f));
                    }
                    int i6 = defpackage.bto.a;
                    return java.lang.Float.valueOf(dpfVar.dl(f));
                }
            };
            cavVar.w(objG2);
        }
        aomy aomyVar = (aomy) objG2;
        boolean zB2 = cavVar.B(dpfVar) | ((((57344 & i) ^ 24576) > 16384 && cavVar.y(f2)) || (i & 24576) == 16384);
        java.lang.Object objG3 = cavVar.g();
        if (zB2 || objG3 == cau.a) {
            objG3 = new aomy() { // from class: btk
                public final java.lang.Object a() {
                    if (i3 != 0) {
                        int i5 = defpackage.bto.a;
                        return java.lang.Float.valueOf(dpfVar.dl(f2));
                    }
                    int i6 = defpackage.bto.a;
                    return java.lang.Float.valueOf(dpfVar.dl(f2));
                }
            };
            cavVar.w(objG3);
        }
        aomy aomyVar2 = (aomy) objG3;
        java.lang.Object[] objArr = {setCW, aonjVar2, java.lang.Boolean.valueOf(z)};
        dko dkoVar = new dko(new defpackage.aem(19), new defpackage.bjx(setCW, aomyVar, aonjVar2, z, 2), 1);
        int i5 = (((((i & 14) ^ 6) <= 4 || !cavVar.D(setCW)) && (i & 6) != 4) ? 0 : 1) | (cavVar.B(aomyVar) ? 1 : 0) | (cavVar.B(aomyVar2) ? 1 : 0) | (((((i & 896) ^ 384) <= 256 || !cavVar.z(btuVar2.ordinal())) && (i & 384) != 256) ? 0 : 1) | (((((i & 112) ^ 48) <= 32 || !cavVar.B(aonjVar2)) && (i & 48) != 32) ? 0 : 1);
        if ((((458752 & i) ^ 196608) <= 131072 || !cavVar.C(z)) && (i & 196608) != 131072) {
            i4 = 0;
        }
        int i6 = i5 | i4;
        java.lang.Object objG4 = cavVar.g();
        if (i6 != 0 || objG4 == cau.a) {
            defpackage.mlx mlxVar = new defpackage.mlx(setCW, aomyVar, btuVar2, aonjVar2, z, 1);
            cavVar.w(mlxVar);
            objG4 = mlxVar;
        }
        return (defpackage.btt) cfd.n(objArr, dkoVar, (aomy) objG4, cavVar, 0);
    }
}
