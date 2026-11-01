package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class li {
    public static int b() {
        return a.D();
    }

    public static /* synthetic */ defpackage.ni c() {
        return new defpackage.ni(new nq(1));
    }

    public static int d(la laVar, kb kbVar, android.view.View view, android.view.View view2, kp kpVar, boolean z) {
        if (kpVar.aw() == 0 || laVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return java.lang.Math.abs(kp.bl(view) - kp.bl(view2)) + 1;
        }
        return java.lang.Math.min(kbVar.k(), kbVar.a(view2) - kbVar.d(view));
    }

    public static int e(la laVar, kb kbVar, android.view.View view, android.view.View view2, kp kpVar, boolean z, boolean z2) {
        if (kpVar.aw() == 0 || laVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? java.lang.Math.max(0, (laVar.a() - java.lang.Math.max(kp.bl(view), kp.bl(view2))) - 1) : java.lang.Math.max(0, java.lang.Math.min(kp.bl(view), kp.bl(view2)));
        if (z) {
            return java.lang.Math.round((iMax * (java.lang.Math.abs(kbVar.a(view2) - kbVar.d(view)) / (java.lang.Math.abs(kp.bl(view) - kp.bl(view2)) + 1))) + (kbVar.j() - kbVar.d(view)));
        }
        return iMax;
    }

    public static int f(la laVar, kb kbVar, android.view.View view, android.view.View view2, kp kpVar, boolean z) {
        if (kpVar.aw() == 0 || laVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return laVar.a();
        }
        return (int) (((kbVar.a(view2) - kbVar.d(view)) / (java.lang.Math.abs(kp.bl(view) - kp.bl(view2)) + 1)) * laVar.a());
    }

    public static void h(cmw cmwVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1854833411);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = defpackage.bgg.c;
                cbtVar.ab(objR);
            }
            cye cyeVar = (cye) objR;
            long j = cbtVar.x;
            long j2 = j ^ (j >>> 32);
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
            cev.c(cbtVarB, java.lang.Integer.valueOf((int) j2), dam.f);
            cbtVarB.i(aojh.a, new bae(dam.g, 7));
            cev.c(cbtVarB, cmwVarM, dam.c);
            aonnVar.a(cbtVarB, java.lang.Integer.valueOf(((i5 & 896) >> 6) & 14));
            cbtVar.W(true);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(cmwVar, aonnVar, i, i4);
        }
    }

    public static acx i(defpackage.bko bkoVar, java.util.List list, aonj aonjVar, aonn aonnVar, aonp aonpVar) {
        long j;
        defpackage.bko bkoVar2;
        aonj aonjVar2 = aonjVar;
        defpackage.bkn bknVar = bkoVar.a;
        long j2 = bknVar.b;
        defpackage.bkn bknVar2 = bkoVar.b;
        long j3 = bknVar2.b;
        if (j2 == j3) {
            return acy.b(j2, bkoVar);
        }
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((java.lang.Number) aonjVar2.a(it.next())).longValue() == j2) {
                break;
            }
            i++;
        }
        java.util.Iterator it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            if (((java.lang.Number) aonjVar2.a(it2.next())).longValue() == j3) {
                break;
            }
            i2++;
        }
        if (i == -1 || i2 == -1) {
            return acy.a();
        }
        int iMin = java.lang.Math.min(i, i2);
        int iMax = java.lang.Math.max(i, i2);
        boolean z = i > i2;
        int i3 = acy.a;
        acx acxVar = new acx(6);
        if (iMin <= iMax) {
            while (true) {
                java.lang.Object obj = list.get(iMin);
                long jLongValue = ((java.lang.Number) aonjVar2.a(obj)).longValue();
                if (jLongValue == j2) {
                    j = j2;
                    bkoVar2 = (defpackage.bko) aonpVar.a(obj, java.lang.Boolean.TRUE, java.lang.Integer.valueOf(bknVar.a), java.lang.Boolean.valueOf(z));
                } else {
                    j = j2;
                    bkoVar2 = jLongValue == j3 ? (defpackage.bko) aonpVar.a(obj, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(bknVar2.a), java.lang.Boolean.valueOf(z)) : (defpackage.bko) aonnVar.a(obj, java.lang.Boolean.valueOf(z));
                }
                if (bkoVar2 != null) {
                    acxVar.h(jLongValue, bkoVar2);
                }
                if (iMin == iMax) {
                    break;
                }
                iMin++;
                aonjVar2 = aonjVar;
                j2 = j;
            }
        }
        return acxVar;
    }

    public static int j(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            int i4 = i - 1;
            if (i4 == 0) {
                return 1;
            }
            if (i4 == 1) {
                return 2;
            }
        }
        return 3;
    }

    public static int k(dkw dkwVar, int i) {
        dji djiVar = dkwVar.a.a;
        if (djiVar.a() != 0) {
            int iE = dkwVar.e(i);
            if ((i != 0 && iE == dkwVar.e(i - 1)) || (i != djiVar.a() && iE == dkwVar.e(i + 1))) {
                return dkwVar.n(i);
            }
        }
        return dkwVar.o(i);
    }

    public static void l(vx vxVar, android.content.Context context, defpackage.bgv bgvVar, boolean z, aomy aomyVar, aomy aomyVar2) {
        android.content.res.Resources resources = context.getResources();
        bly blyVar = new bly(aomyVar2, aomyVar, 0);
        if (z) {
            defpackage.xa.j(vxVar, bgvVar.f, resources.getString(bgvVar.g), bgvVar.h, blyVar);
        }
    }

    public void g(android.support.v7.widget.RecyclerView recyclerView, int i) {
    }

    public void a(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
    }
}
