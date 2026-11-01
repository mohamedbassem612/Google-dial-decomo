package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dpm {
    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static /* synthetic */ java.lang.String c(int i) {
        return i != 1 ? "Rtl" : "Ltr";
    }

    public static int d(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 76746) {
            if (iHashCode == 82506 && str.equals("Rtl")) {
                return 2;
            }
        } else if (str.equals("Ltr")) {
            return 1;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static final void e(aomy aomyVar, defpackage.drh drhVar, aonn aonnVar, cav cavVar, int i) {
        aomy aomyVar2;
        int i2;
        boolean z;
        boolean z2;
        cbt cbtVarB = cavVar.b(826668973);
        if ((i & 6) == 0) {
            aomyVar2 = aomyVar;
            i2 = (true != cbtVarB.D(aomyVar2) ? 2 : 4) | i;
        } else {
            aomyVar2 = aomyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(drhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 128 : 256;
        }
        int i3 = i2;
        if (cbtVarB.H((i3 & 147) != 146, i3 & 1)) {
            android.view.View view = (android.view.View) cbtVarB.e(dep.f);
            dpf dpfVar = (dpf) cbtVarB.e(dfo.e);
            dpq dpqVar = (dpq) cbtVarB.e(dfo.j);
            caz cazVarC = cbtVarB.c();
            cer cerVarG = cdh.g(aonnVar, cbtVarB);
            java.lang.Object[] objArr = new java.lang.Object[0];
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = new defpackage.bmt(18);
                cbtVar.ab(objR);
            }
            java.util.UUID uuid = (java.util.UUID) cfd.m(objArr, (aomy) objR, cbtVarB, 48);
            boolean zB = cbtVarB.B(view) | cbtVarB.B(dpfVar) | cbtVarB.z(2) | cbtVarB.B((java.lang.Object) null);
            java.lang.Object objR2 = cbtVar.R();
            if (zB || objR2 == obj) {
                z = false;
                defpackage.drk drkVar = new defpackage.drk(aomyVar2, drhVar, view, dpqVar, dpfVar, uuid);
                z2 = true;
                drkVar.c.c(cazVarC, new cja(-1338939603, true, new brg(cerVarG, 13)));
                cbtVar.ab(drkVar);
                objR2 = drkVar;
            } else {
                z2 = true;
                z = false;
            }
            defpackage.drk drkVar2 = (defpackage.drk) objR2;
            boolean zD = cbtVarB.D(drkVar2);
            java.lang.Object objR3 = cbtVar.R();
            if (zD || objR3 == obj) {
                objR3 = new dih(drkVar2, 8);
                cbtVar.ab(objR3);
            }
            cbp.c(drkVar2, (aonj) objR3, cbtVarB);
            boolean zD2 = cbtVarB.D(drkVar2) | ((i3 & 14) == 4 ? z2 : z);
            if ((i3 & 112) == 32) {
                z = z2;
            }
            boolean z3 = zD2 | z | cbtVarB.z(dpqVar.ordinal()) | cbtVarB.B(dpfVar);
            java.lang.Object objR4 = cbtVar.R();
            if (z3 || objR4 == obj) {
                defpackage.dqu dquVar = new defpackage.dqu(drkVar2, aomyVar, drhVar, dpqVar, dpfVar, 0);
                cbtVar.ab(dquVar);
                objR4 = dquVar;
            }
            cbtVarB.r((aomy) objR4);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aoz((java.lang.Object) aomyVar, (java.lang.Object) drhVar, (java.lang.Object) aonnVar, i, 13, (byte[]) null);
        }
    }

    public static final void f(cmw cmwVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1090521195);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 16 : 32;
        }
        int i4 = 0;
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = defpackage.bgg.d;
                cbtVar.ab(objR);
            }
            cye cyeVar = (cye) objR;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVar);
            int i5 = ((((i2 >> 3) & 14) | 384) | ((i2 << 3) & 112)) << 6;
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
            aonnVar.a(cbtVarB, java.lang.Integer.valueOf(((i5 & 896) >> 6) & 14));
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dqt(cmwVar, aonnVar, i, i4);
        }
    }

    public static final android.view.View g(cmv cmvVar) {
        android.view.View viewH = cfo.A(cmvVar.t).h();
        if (viewH != null) {
            return viewH;
        }
        throw new java.lang.IllegalStateException("Could not fetch interop view");
    }

    public static final boolean h(android.view.View view, android.view.View view2) {
        for (android.view.ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }
}
