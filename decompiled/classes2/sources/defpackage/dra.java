package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dra {
    private static final cbd b = new cbn(cdu.c, new defpackage.bmt(19));
    public static final cbd a = new cbn(cdu.c, new defpackage.bmt(20));

    public static final int a(defpackage.drs drsVar, boolean z) {
        boolean z2 = drsVar.b;
        int i = drsVar.a;
        return z ? i | 8192 : i & (-8193);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    /* JADX WARN: Code duplicated, block: B:68:0x017c  */
    /* JADX WARN: Code duplicated, block: B:71:0x019e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:89:0x0207  */
    /* JADX WARN: Code duplicated, block: B:92:0x0228  */
    /* JADX WARN: Code duplicated, block: B:93:0x022c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0253  */
    /* JADX WARN: Code duplicated, block: B:98:0x025d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(defpackage.drr drrVar, aomy aomyVar, defpackage.drs drsVar, aonn aonnVar, cav cavVar, int i, int i2) {
        int i3;
        aomy aomyVar2;
        defpackage.drs drsVar2;
        boolean z;
        aomy aomyVar3;
        cdk cdkVarI;
        aomy aomyVar4;
        android.view.View view;
        dpf dpfVar;
        java.lang.String str;
        dpq dpqVar;
        caz cazVarC;
        cer cerVarG;
        cbt cbtVar;
        java.lang.Object objR;
        java.lang.Object obj;
        java.util.UUID uuid;
        boolean zBooleanValue;
        java.lang.Object objR2;
        dpf dpfVar2;
        int i4;
        defpackage.drq drqVar;
        int i5;
        int i6;
        boolean z2;
        java.lang.Object objR3;
        boolean z3;
        java.lang.Object objR4;
        int i7;
        int i8;
        java.lang.Object objR5;
        aoln aolnVar;
        boolean zD;
        java.lang.Object objR6;
        boolean zD2;
        java.lang.Object objR7;
        boolean zD3;
        java.lang.Object objR8;
        aomy aomyVar5;
        int i9;
        int i10;
        defpackage.drr drrVar2 = drrVar;
        int i11 = i & 6;
        cbt cbtVarB = cavVar.b(-1772091631);
        int i12 = 2;
        int i13 = 1;
        if (i11 == 0) {
            i3 = (true != cbtVarB.B(drrVar2) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 48) == 0) {
                aomyVar2 = aomyVar;
                i3 |= true != cbtVarB.D(aomyVar2) ? 16 : 32;
            }
            if ((i & 384) == 0) {
                drsVar2 = drsVar;
                if (true != cbtVarB.B(drsVar2)) {
                    i10 = 128;
                } else {
                    i10 = 256;
                }
                i3 |= i10;
            } else {
                drsVar2 = drsVar;
            }
            if ((i & 3072) == 0) {
                if (true != cbtVarB.D(aonnVar)) {
                    i9 = 1024;
                } else {
                    i9 = 2048;
                }
                i3 |= i9;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (cbtVarB.H(z, i3 & 1)) {
                if (i14 != 0) {
                    aomyVar4 = null;
                } else {
                    aomyVar4 = aomyVar2;
                }
                view = (android.view.View) cbtVarB.e(dep.f);
                dpfVar = (dpf) cbtVarB.e(dfo.e);
                str = (java.lang.String) cbtVarB.e(b);
                dpqVar = (dpq) cbtVarB.e(dfo.j);
                cazVarC = cbtVarB.c();
                cerVarG = cdh.g(aonnVar, cbtVarB);
                java.lang.Object[] objArr = new java.lang.Object[0];
                cbtVar = cbtVarB;
                objR = cbtVar.R();
                obj = cau.a;
                if (objR == obj) {
                    objR = new defpackage.eli(i13);
                    cbtVar.ab(objR);
                }
                uuid = (java.util.UUID) cfd.m(objArr, (aomy) objR, cbtVarB, 48);
                zBooleanValue = ((java.lang.Boolean) cbtVarB.e(a)).booleanValue();
                objR2 = cbtVar.R();
                if (objR2 == obj) {
                    int i15 = i3;
                    defpackage.drs drsVar3 = drsVar2;
                    dpfVar2 = dpfVar;
                    defpackage.drq drqVar2 = new defpackage.drq(aomyVar4, drsVar3, view, dpfVar2, drrVar2, uuid, zBooleanValue);
                    drrVar2 = drrVar2;
                    drqVar2.l(cazVarC, new cja(-297523940, true, new defpackage.dqv(drqVar2, cerVarG, i12)));
                    cbtVar.ab(drqVar2);
                    str = str;
                    i4 = 0;
                    objR2 = drqVar2;
                    i3 = i15;
                } else {
                    dpfVar2 = dpfVar;
                    i4 = 0;
                }
                drqVar = (defpackage.drq) objR2;
                boolean zD4 = cbtVarB.D(drqVar);
                if ((i3 & 112) == 32) {
                    i5 = 1;
                } else {
                    i5 = i4;
                }
                int i16 = (zD4 ? 1 : 0) | i5;
                if ((i3 & 896) == 256) {
                    i6 = 1;
                } else {
                    i6 = i4;
                }
                z2 = (((i16 | i6) | (cbtVarB.B(str) ? 1 : 0)) == true ? 1 : 0) | (cbtVarB.z(dpqVar.ordinal()) ? 1 : 0) | (cbtVarB.B(dpfVar2) ? 1 : 0);
                objR3 = cbtVar.R();
                if (z2 == 0 || objR3 == obj) {
                    objR3 = new defpackage.dqw(drqVar, aomyVar4, drsVar, dpqVar, dpfVar2, 0);
                    cbtVar.ab(objR3);
                }
                cbp.c(drqVar, (aonj) objR3, cbtVarB);
                z3 = (((((cbtVarB.D(drqVar) ? 1 : 0) | i5) | i6) | (cbtVarB.B(str) ? 1 : 0)) == true ? 1 : 0) | (cbtVarB.z(dpqVar.ordinal()) ? 1 : 0) | (cbtVarB.B(dpfVar2) ? 1 : 0);
                objR4 = cbtVar.R();
                if (z3 == 0 || objR4 == obj) {
                    objR4 = new defpackage.dqu(drqVar, aomyVar4, drsVar, dpqVar, dpfVar2, 2);
                    cbtVar.ab(objR4);
                }
                cbtVarB.r((aomy) objR4);
                boolean zD5 = cbtVarB.D(drqVar);
                if ((i3 & 14) == 4) {
                    i7 = 1;
                } else {
                    i7 = i4;
                }
                i8 = (zD5 ? 1 : 0) | i7;
                objR5 = cbtVar.R();
                if (i8 == 0 || objR5 == obj) {
                    aolnVar = null;
                    objR5 = new dpz(drqVar, drrVar2, 5, (byte[]) null);
                    cbtVar.ab(objR5);
                } else {
                    aolnVar = null;
                }
                cbp.c(drrVar2, (aonj) objR5, cbtVarB);
                zD = cbtVarB.D(drqVar);
                objR6 = cbtVar.R();
                if (zD || objR6 == obj) {
                    objR6 = new defpackage.dqx(drqVar, aolnVar, i4);
                    cbtVar.ab(objR6);
                }
                cbp.g(drqVar, (aonn) objR6, cbtVarB);
                cmt cmtVar = cmw.c;
                zD2 = cbtVarB.D(drqVar);
                objR7 = cbtVar.R();
                if (zD2 || objR7 == obj) {
                    objR7 = new dih(drqVar, 10);
                    cbtVar.ab(objR7);
                }
                cmw cmwVarE = vn.e(cmtVar, (aonj) objR7);
                zD3 = cbtVarB.D(drqVar) | cbtVarB.z(dpqVar.ordinal());
                objR8 = cbtVar.R();
                if (zD3 || objR8 == obj) {
                    objR8 = new defpackage.dqy(drqVar, dpqVar, i4);
                    cbtVar.ab(objR8);
                }
                cye cyeVar = (cye) objR8;
                int iM = anty.M(cbtVar.x);
                cje cjeVarAi = cbtVar.ai();
                cmw cmwVarM = cfo.m(cbtVarB, cmwVarE);
                aomyVar5 = dam.a;
                cbtVarB.v();
                if (cbtVar.w) {
                    cbtVarB.j(aomyVar5);
                } else {
                    cbtVarB.x();
                }
                cev.c(cbtVarB, cyeVar, dam.e);
                cev.c(cbtVarB, cjeVarAi, dam.d);
                cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
                cev.b(cbtVarB, dam.g);
                cev.c(cbtVarB, cmwVarM, dam.c);
                cbtVar.W(true);
                aomyVar3 = aomyVar4;
            } else {
                cbtVarB.s();
                aomyVar3 = aomyVar2;
            }
            cdkVarI = cbtVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new abje(drrVar2, aomyVar3, drsVar, aonnVar, i, i2, 1);
            }
        }
        i3 |= 48;
        aomyVar2 = aomyVar;
        if ((i & 384) == 0) {
            drsVar2 = drsVar;
            if (true != cbtVarB.B(drsVar2)) {
                i10 = 128;
            } else {
                i10 = 256;
            }
            i3 |= i10;
        } else {
            drsVar2 = drsVar;
        }
        if ((i & 3072) == 0) {
            if (true != cbtVarB.D(aonnVar)) {
                i9 = 1024;
            } else {
                i9 = 2048;
            }
            i3 |= i9;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (cbtVarB.H(z, i3 & 1)) {
            if (i14 != 0) {
                aomyVar4 = null;
            } else {
                aomyVar4 = aomyVar2;
            }
            view = (android.view.View) cbtVarB.e(dep.f);
            dpfVar = (dpf) cbtVarB.e(dfo.e);
            str = (java.lang.String) cbtVarB.e(b);
            dpqVar = (dpq) cbtVarB.e(dfo.j);
            cazVarC = cbtVarB.c();
            cerVarG = cdh.g(aonnVar, cbtVarB);
            java.lang.Object[] objArr2 = new java.lang.Object[0];
            cbtVar = cbtVarB;
            objR = cbtVar.R();
            obj = cau.a;
            if (objR == obj) {
                objR = new defpackage.eli(i13);
                cbtVar.ab(objR);
            }
            uuid = (java.util.UUID) cfd.m(objArr2, (aomy) objR, cbtVarB, 48);
            zBooleanValue = ((java.lang.Boolean) cbtVarB.e(a)).booleanValue();
            objR2 = cbtVar.R();
            if (objR2 == obj) {
                int i17 = i3;
                defpackage.drs drsVar4 = drsVar2;
                dpfVar2 = dpfVar;
                defpackage.drq drqVar3 = new defpackage.drq(aomyVar4, drsVar4, view, dpfVar2, drrVar2, uuid, zBooleanValue);
                drrVar2 = drrVar2;
                drqVar3.l(cazVarC, new cja(-297523940, true, new defpackage.dqv(drqVar3, cerVarG, i12)));
                cbtVar.ab(drqVar3);
                str = str;
                i4 = 0;
                objR2 = drqVar3;
                i3 = i17;
            } else {
                dpfVar2 = dpfVar;
                i4 = 0;
            }
            drqVar = (defpackage.drq) objR2;
            boolean zD6 = cbtVarB.D(drqVar);
            if ((i3 & 112) == 32) {
                i5 = 1;
            } else {
                i5 = i4;
            }
            int i18 = (zD6 ? 1 : 0) | i5;
            if ((i3 & 896) == 256) {
                i6 = 1;
            } else {
                i6 = i4;
            }
            z2 = (((i18 | i6) | (cbtVarB.B(str) ? 1 : 0)) == true ? 1 : 0) | (cbtVarB.z(dpqVar.ordinal()) ? 1 : 0) | (cbtVarB.B(dpfVar2) ? 1 : 0);
            objR3 = cbtVar.R();
            if (z2 == 0) {
                objR3 = new defpackage.dqw(drqVar, aomyVar4, drsVar, dpqVar, dpfVar2, 0);
                cbtVar.ab(objR3);
            } else {
                objR3 = new defpackage.dqw(drqVar, aomyVar4, drsVar, dpqVar, dpfVar2, 0);
                cbtVar.ab(objR3);
            }
            cbp.c(drqVar, (aonj) objR3, cbtVarB);
            z3 = (((((cbtVarB.D(drqVar) ? 1 : 0) | i5) | i6) | (cbtVarB.B(str) ? 1 : 0)) == true ? 1 : 0) | (cbtVarB.z(dpqVar.ordinal()) ? 1 : 0) | (cbtVarB.B(dpfVar2) ? 1 : 0);
            objR4 = cbtVar.R();
            if (z3 == 0) {
                objR4 = new defpackage.dqu(drqVar, aomyVar4, drsVar, dpqVar, dpfVar2, 2);
                cbtVar.ab(objR4);
            } else {
                objR4 = new defpackage.dqu(drqVar, aomyVar4, drsVar, dpqVar, dpfVar2, 2);
                cbtVar.ab(objR4);
            }
            cbtVarB.r((aomy) objR4);
            boolean zD7 = cbtVarB.D(drqVar);
            if ((i3 & 14) == 4) {
                i7 = 1;
            } else {
                i7 = i4;
            }
            i8 = (zD7 ? 1 : 0) | i7;
            objR5 = cbtVar.R();
            if (i8 == 0) {
                aolnVar = null;
                objR5 = new dpz(drqVar, drrVar2, 5, (byte[]) null);
                cbtVar.ab(objR5);
            } else {
                aolnVar = null;
                objR5 = new dpz(drqVar, drrVar2, 5, (byte[]) null);
                cbtVar.ab(objR5);
            }
            cbp.c(drrVar2, (aonj) objR5, cbtVarB);
            zD = cbtVarB.D(drqVar);
            objR6 = cbtVar.R();
            if (zD) {
                objR6 = new defpackage.dqx(drqVar, aolnVar, i4);
                cbtVar.ab(objR6);
            } else {
                objR6 = new defpackage.dqx(drqVar, aolnVar, i4);
                cbtVar.ab(objR6);
            }
            cbp.g(drqVar, (aonn) objR6, cbtVarB);
            cmt cmtVar2 = cmw.c;
            zD2 = cbtVarB.D(drqVar);
            objR7 = cbtVar.R();
            if (zD2) {
                objR7 = new dih(drqVar, 10);
                cbtVar.ab(objR7);
            } else {
                objR7 = new dih(drqVar, 10);
                cbtVar.ab(objR7);
            }
            cmw cmwVarE2 = vn.e(cmtVar2, (aonj) objR7);
            zD3 = cbtVarB.D(drqVar) | cbtVarB.z(dpqVar.ordinal());
            objR8 = cbtVar.R();
            if (zD3) {
                objR8 = new defpackage.dqy(drqVar, dpqVar, i4);
                cbtVar.ab(objR8);
            } else {
                objR8 = new defpackage.dqy(drqVar, dpqVar, i4);
                cbtVar.ab(objR8);
            }
            cye cyeVar2 = (cye) objR8;
            int iM2 = anty.M(cbtVar.x);
            cje cjeVarAi2 = cbtVar.ai();
            cmw cmwVarM2 = cfo.m(cbtVarB, cmwVarE2);
            aomyVar5 = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar5);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVar2, dam.e);
            cev.c(cbtVarB, cjeVarAi2, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM2), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM2, dam.c);
            cbtVar.W(true);
            aomyVar3 = aomyVar4;
        } else {
            cbtVarB.s();
            aomyVar3 = aomyVar2;
        }
        cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abje(drrVar2, aomyVar3, drsVar, aonnVar, i, i2, 1);
        }
    }

    public static final void c(android.view.WindowManager.LayoutParams layoutParams) {
        layoutParams.flags &= -3;
        layoutParams.dimAmount = 0.0f;
    }

    public static final void d(cmj cmjVar, aomy aomyVar, defpackage.drs drsVar, aonn aonnVar, cav cavVar, int i) {
        aomy aomyVar2;
        defpackage.drs drsVar2;
        aonn aonnVar2;
        cbt cbtVarB = cavVar.b(71005054);
        int i2 = i | 54;
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aomyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.B(drsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 8192 : 16384;
        }
        if (cbtVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            int i3 = drsVar.e;
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            cmj cmjVar2 = cmh.a;
            boolean z3 = z | z2 | cbtVarB.z(i3) | cbtVarB.B((java.lang.Object) null);
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (z3 || objR == cau.a) {
                objR = new defpackage.dqs(cmjVar2, 0);
                cbtVar.ab(objR);
            }
            defpackage.dqs dqsVar = (defpackage.dqs) objR;
            aomyVar2 = aomyVar;
            drsVar2 = drsVar;
            aonnVar2 = aonnVar;
            b(dqsVar, aomyVar2, drsVar2, aonnVar2, cbtVarB, (i2 >> 3) & 8176, 0);
            cmjVar = cmjVar2;
        } else {
            aomyVar2 = aomyVar;
            drsVar2 = drsVar;
            aonnVar2 = aonnVar;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            aonn aonnVar3 = aonnVar2;
            defpackage.drs drsVar3 = drsVar2;
            cdkVarI.c = new defpackage.biu(cmjVar, aomyVar2, drsVar3, aonnVar3, i, 5);
        }
    }
}
