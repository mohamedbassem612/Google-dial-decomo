package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abeb {
    public static final ajb a = new ajb(0.3f, 0.0f, 0.8f, 0.15f);
    public static final ajb b = new ajb(0.05f, 0.65f, 0.1f, 1.0f);
    public static final float c = 0.16666667f;
    public static final float d = 0.46f;
    public static final alm e;
    private static final ajh f;
    private static final alm g;
    private static final alm h;
    private static final abed i;
    private static final alm j;
    private static final alm k;
    private static final alm l;

    static {
        defpackage.abea abeaVar = new defpackage.abea();
        f = abeaVar;
        alm almVar = new alm(1500, 160, abeaVar);
        g = almVar;
        alm almVarBv = den.bv(1500, 0, abeaVar, 2);
        h = almVarBv;
        i = new abed(almVar, almVarBv);
        j = new alm(1250, 250, new ajb(0.05f, 0.65f, 0.1f, 1.0f));
        k = new alm(1250, 250, new ajb(0.05f, 0.65f, 0.1f, 1.0f));
        e = den.bv(150, 0, new ajb(1.0f, 0.0f, 1.0f, 1.0f), 2);
        l = den.bv(800, 0, (ajh) null, 6);
    }

    public static final long a(int i2) {
        if (i2 != 0) {
            return i2 + (-1) != 0 ? mni.bj(0.5f, 0.5f) : mni.bj(0.5f, 0.0f);
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [ajl, java.lang.Object] */
    public static final void b(boolean z, cmw cmwVar, cmw cmwVar2, int i2, aonn aonnVar, cav cavVar, int i3) {
        boolean z2;
        int i4;
        int i5;
        int i6;
        java.lang.Object objF;
        int i7;
        int i8 = i3 & 6;
        cav cavVarB = cavVar.b(-1410085746);
        if (i8 == 0) {
            z2 = z;
            i4 = (true != cavVarB.C(z2) ? 2 : 4) | i3;
        } else {
            z2 = z;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            if (i2 == 0) {
                i7 = -1;
                i5 = 0;
            } else {
                i7 = i2 - 1;
                i5 = i2;
            }
            i4 |= true != cavVarB.z(i7) ? 1024 : 2048;
        } else {
            i5 = i2;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != cavVarB.D(aonnVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i4 & 9363) != 9362, i4 & 1)) {
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new akc(java.lang.Boolean.FALSE);
                cbtVar.ab(objR);
            }
            akc akcVar = (akc) objR;
            akcVar.f(java.lang.Boolean.valueOf(z2));
            alg algVarC = alk.c(akcVar, cavVarB, 48);
            bmq bmqVar = new bmq(19);
            nf nfVar = alo.a;
            if (algVarC.C()) {
                cavVarB.u(1666827533);
                cbtVar.W(false);
                objF = algVarC.f();
            } else {
                cavVarB.u(1666573488);
                boolean zB = cavVarB.B(algVarC);
                objF = cbtVar.R();
                if (zB || objF == obj) {
                    cko ckoVarG = cfd.g();
                    aonj aonjVarI = ckoVarG != null ? ckoVarG.i() : null;
                    cko ckoVarH = cfd.h(ckoVarG);
                    try {
                        java.lang.Object objF2 = algVarC.f();
                        cfd.i(ckoVarG, ckoVarH, aonjVarI);
                        cbtVar.ab(objF2);
                        objF = objF2;
                    } catch (java.lang.Throwable th) {
                        cfd.i(ckoVarG, ckoVarH, aonjVarI);
                        throw th;
                    }
                }
                cbtVar.W(false);
            }
            boolean zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
            cavVarB.u(-1565625785);
            float f2 = true != zBooleanValue ? 0.0f : 1.0f;
            cbtVar.W(false);
            java.lang.Float fValueOf = java.lang.Float.valueOf(f2);
            boolean zB2 = cavVarB.B(algVarC);
            java.lang.Object objR2 = cbtVar.R();
            if (zB2 || objR2 == cau.a) {
                defpackage.xmr xmrVar = new defpackage.xmr(algVarC, 10);
                ajxw ajxwVar = ceo.a;
                objR2 = new cbk(xmrVar, (cen) null);
                cbtVar.ab(objR2);
            }
            boolean zBooleanValue2 = ((java.lang.Boolean) ((cer) objR2).a()).booleanValue();
            cavVarB.u(-1565625785);
            float f3 = true != zBooleanValue2 ? 0.0f : 1.0f;
            cbtVar.W(false);
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(f3);
            boolean zB3 = cavVarB.B(algVarC);
            java.lang.Object objR3 = cbtVar.R();
            if (zB3 || objR3 == cau.a) {
                bmx bmxVar = new bmx(algVarC, 16);
                ajxw ajxwVar2 = ceo.a;
                objR3 = new cbk(bmxVar, (cen) null);
                cbtVar.ab(objR3);
            }
            ?? A = bmqVar.a(((cer) objR3).a(), cavVarB, 0);
            i6 = i5;
            int i9 = i4;
            int i10 = 10;
            cer cerVarE = alk.e(algVarC, fValueOf, fValueOf2, (ajl) A, nfVar, cavVarB, 0);
            java.lang.Object objR4 = cbtVar.R();
            java.lang.Object obj2 = cau.a;
            if (objR4 == obj2) {
                objR4 = new defpackage.yrz(i10);
                cbtVar.ab(objR4);
            }
            aonj aonjVar = (aonj) objR4;
            boolean zB4 = cavVarB.B(cerVarE) | ((i9 & 7168) == 2048);
            java.lang.Object objR5 = cbtVar.R();
            if (zB4 || objR5 == obj2) {
                objR5 = new bxc(cerVarE, i6, 6);
                cbtVar.ab(objR5);
            }
            cmw cmwVarA = cfd.J(cmwVar, (aonj) objR5).a(cmwVar2);
            abed abedVar = i;
            cmj cmjVarD = d(i6);
            java.lang.Object objR6 = cbtVar.R();
            if (objR6 == obj2) {
                objR6 = new defpackage.yrz(11);
                cbtVar.ab(objR6);
            }
            den.by(algVarC, aonjVar, cmwVarA, aga.h(abedVar, cmjVarD, (aonj) objR6, 4).a(aga.n(j, 2)).a(aga.b(k, 0.0f, a(i6))), aga.o(l, 2), cfo.j(2051987543, new ped(aonnVar, 15), cavVarB), cavVarB, 221232, 0);
            cavVarB = cavVarB;
        } else {
            i6 = i5;
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abdz(z, cmwVar, cmwVar2, i6, aonnVar, i3, 2);
        }
    }

    public static final void c(boolean z, cmw cmwVar, cmw cmwVar2, int i2, aonn aonnVar, cav cavVar, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        aooh.f(aonnVar, "content");
        cbt cbtVarB = cavVar.b(-1850873102);
        if ((i3 & 6) == 0) {
            i4 = (true != cbtVarB.C(z) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != cbtVarB.B(cmwVar2) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            if (i2 == 0) {
                i7 = -1;
                i5 = 0;
            } else {
                i7 = i2 - 1;
                i5 = i2;
            }
            i4 |= true != cbtVarB.z(i7) ? 1024 : 2048;
        } else {
            i5 = i2;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != cbtVarB.C(true) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != cbtVarB.D(aonnVar) ? 65536 : 131072;
        }
        if (cbtVarB.H((74899 & i4) != 74898, i4 & 1)) {
            int i8 = i4 >> 3;
            int i9 = i4 & 7168;
            int i10 = i4 & 896;
            int i11 = i4 & 14;
            cbtVarB.u(-570113542);
            cye cyeVarB = awo.b(d(i5), false);
            cbt cbtVar = cbtVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVar);
            int i12 = i4;
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            aonn aonnVar2 = dam.e;
            cev.c(cbtVarB, cyeVarB, aonnVar2);
            aonn aonnVar3 = dam.d;
            cev.c(cbtVarB, cjeVarAi, aonnVar3);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar4 = dam.f;
            cev.c(cbtVarB, numValueOf, aonnVar4);
            aonj aonjVar = dam.g;
            cev.b(cbtVarB, aonjVar);
            i6 = i5;
            aonn aonnVar5 = dam.c;
            cev.c(cbtVarB, cmwVarM, aonnVar5);
            if (z) {
                cbtVarB.u(1677642428);
                cmt cmtVar = cmw.c;
                java.lang.Object objR = cbtVar.R();
                java.lang.Object obj = cau.a;
                if (objR == obj) {
                    objR = new defpackage.yrz(12);
                    cbtVar.ab(objR);
                }
                cmw cmwVarM2 = ru.m(cmtVar, (aonj) objR);
                java.lang.Object objR2 = cbtVar.R();
                if (objR2 == obj) {
                    objR2 = new defpackage.yrz(13);
                    cbtVar.ab(objR2);
                }
                cmw cmwVarA = dig.a(cmwVarM2, (aonj) objR2);
                cye cyeVarB2 = awo.b(cmh.a, false);
                int iM2 = anty.M(cbtVar.x);
                cje cjeVarAi2 = cbtVar.ai();
                cmw cmwVarM3 = cfo.m(cbtVarB, cmwVarA);
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVarB2, aonnVar2);
                cev.c(cbtVarB, cjeVarAi2, aonnVar3);
                cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), aonnVar4);
                cev.b(cbtVarB, aonjVar);
                cev.c(cbtVarB, cmwVarM3, aonnVar5);
                aonnVar.a(cbtVarB, java.lang.Integer.valueOf((i12 >> 15) & 14));
                cbtVar.W(true);
                cbtVar.W(false);
            } else {
                cbtVarB.u(1677847121);
                cbtVar.W(false);
            }
            b(z, cmw.c, cmwVar2, i6, aonnVar, cbtVarB, (i8 & 57344) | i11 | 48 | i10 | i9);
            cbtVar.W(true);
            cbtVar.W(false);
        } else {
            i6 = i5;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abdz(z, cmwVar, cmwVar2, i6, aonnVar, i3, 0);
        }
    }

    private static final cmj d(int i2) {
        if (i2 != 0) {
            return i2 + (-1) != 0 ? cmh.e : cmh.b;
        }
        throw null;
    }
}
