package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class wo {
    public static boolean a(defpackage.ain ainVar, long j) {
        return j >= ainVar.a();
    }

    public static final void b(defpackage.blw blwVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-954926513);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(blwVar) : cavVarB.D(blwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            c(blwVar, aonnVar, cavVarB, (i2 & 14) | 8 | (i2 & 112));
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(blwVar, aonnVar, i, 5);
        }
    }

    public static final void c(defpackage.blw blwVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-614342087);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(blwVar) : cbtVarB.D(blwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            cbtVarB.u(-1009319487);
            defpackage.yt.e(new defpackage.bik(new defpackage.blp(blwVar, null)).a(new defpackage.bio(blwVar.o, new defpackage.blq(blwVar, (aoln) null, 0), new defpackage.bln(blwVar, 6))), aonnVar, cbtVarB, i2 & 112);
            cbtVarB.W(false);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(blwVar, aonnVar, i, i4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final java.util.List d(cxf cxfVar) throws aois {
        if (cxfVar == null) {
            aooh.h("null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        }
        dbk dbkVarM = ((dby) cxfVar).M();
        boolean zJ = j(dbkVarM);
        java.util.List listV = dbkVarM.v();
        java.util.ArrayList arrayList = new java.util.ArrayList(listV.size());
        int size = listV.size();
        for (int i = 0; i < size; i++) {
            dbk dbkVar = (dbk) listV.get(i);
            arrayList.add(zJ ? dbkVar.s() : dbkVar.t());
        }
        return arrayList;
    }

    public static final int e(dbt dbtVar, cwk cwkVar) {
        dbt dbtVarN = dbtVar.N();
        if (dbtVarN == null) {
            cwh.d(a.bg(dbtVar, "Child of ", " cannot be null when calculating alignment line"));
        }
        if (dbtVar.L().f().containsKey(cwkVar)) {
            java.lang.Integer num = (java.lang.Integer) dbtVar.L().f().get(cwkVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iDm = dbtVarN.dm(cwkVar);
        if (iDm == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = dbtVar.m;
        boolean z2 = dbtVar.n;
        dbtVarN.m = true;
        dbtVar.n = true;
        dbtVar.R();
        dbtVarN.m = z;
        dbtVar.n = z2;
        return iDm + ((int) (cwkVar instanceof cxa ? dbtVarN.J() & 4294967295L : dbtVarN.J() >> 32));
    }

    public static int f(dbd dbdVar, cxf cxfVar, cxe cxeVar, int i) {
        return ddt.c(new defpackage.dbc(dbdVar), cxfVar, cxeVar, i);
    }

    public static int g(dbd dbdVar, cxf cxfVar, cxe cxeVar, int i) {
        return ddt.d(new defpackage.dbc(dbdVar), cxfVar, cxeVar, i);
    }

    public static int h(dbd dbdVar, cxf cxfVar, cxe cxeVar, int i) {
        return ddt.e(new defpackage.dbc(dbdVar), cxfVar, cxeVar, i);
    }

    public static int i(dbd dbdVar, cxf cxfVar, cxe cxeVar, int i) {
        return ddt.f(new defpackage.dbc(dbdVar), cxfVar, cxeVar, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    private static final boolean j(dbk dbkVar) throws aois {
        int iAv = dbkVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i != 2) {
                if (i == 3) {
                    return true;
                }
                if (i != 4) {
                    throw new aois();
                }
                dbk dbkVarK = dbkVar.k();
                if (dbkVarK != null) {
                    return j(dbkVarK);
                }
                throw new java.lang.IllegalArgumentException("no parent for idle node");
            }
        }
        return false;
    }
}
