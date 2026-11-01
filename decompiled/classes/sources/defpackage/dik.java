package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dik {
    public final defpackage.dbk a;
    public final defpackage.aco b;
    public final defpackage.adq c = new defpackage.adq(2);
    private final defpackage.dhx d;

    public dik(defpackage.dbk dbkVar, defpackage.dhx dhxVar, defpackage.aco acoVar) {
        this.a = dbkVar;
        this.d = dhxVar;
        this.b = acoVar;
    }

    public final defpackage.dij a() {
        defpackage.die dieVar = new defpackage.die();
        return new defpackage.dij(this.d, false, this.a, dieVar);
    }

    public final void b(defpackage.dbk dbkVar, defpackage.die dieVar) {
        defpackage.cnc cncVar;
        defpackage.die dieVar2;
        defpackage.cnc cncVar2;
        defpackage.die dieVar3;
        defpackage.dji djiVar;
        defpackage.dji djiVar2;
        defpackage.adq adqVar = this.c;
        java.lang.Object[] objArr = adqVar.a;
        int i = adqVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cnf cnfVar = (defpackage.cnf) objArr[i2];
            defpackage.die dieVarQ = dbkVar.q();
            int i3 = dbkVar.c;
            if (dieVar != null) {
                cncVar = (defpackage.cnc) dieVar.g(defpackage.din.s);
                dieVar2 = dieVar;
            } else {
                cncVar = null;
                dieVar2 = null;
            }
            if (dieVarQ != null) {
                cncVar2 = (defpackage.cnc) dieVarQ.g(defpackage.din.s);
                dieVar3 = dieVarQ;
            } else {
                cncVar2 = null;
                dieVar3 = null;
            }
            defpackage.cnc cncVar3 = defpackage.cnh.a;
            if (!defpackage.aooh.n(cncVar2, cncVar3)) {
                if (defpackage.aooh.n(cncVar, cncVar3) && !defpackage.aooh.n(cncVar2, cncVar3)) {
                    cnfVar.g.c(cnfVar.b, i3, true);
                }
                java.lang.String str = (dieVar2 == null || (djiVar2 = (defpackage.dji) dieVar2.g(defpackage.din.G)) == null) ? null : djiVar2.c;
                java.lang.String str2 = (dieVar3 == null || (djiVar = (defpackage.dji) dieVar3.g(defpackage.din.G)) == null) ? null : djiVar.c;
                if (str != str2) {
                    if (str == null) {
                        cnfVar.g.c(cnfVar.b, i3, true);
                    } else if (str2 == null) {
                        cnfVar.g.c(cnfVar.b, i3, false);
                    } else if (defpackage.aooh.n(cncVar2, defpackage.cnh.b)) {
                        cnfVar.g.b(cnfVar.b, i3, rs.g(str2));
                    }
                }
                defpackage.dja djaVar = dieVar2 != null ? (defpackage.dja) dieVar2.g(defpackage.din.L) : null;
                defpackage.dja djaVar2 = dieVar3 != null ? (defpackage.dja) dieVar3.g(defpackage.din.L) : null;
                if (djaVar != djaVar2) {
                    if (djaVar == null) {
                        cnfVar.g.c(cnfVar.b, i3, true);
                    } else if (djaVar2 == null) {
                        cnfVar.g.c(cnfVar.b, i3, false);
                    } else if (defpackage.aooh.n(cncVar2, defpackage.cnh.c)) {
                        int iOrdinal = djaVar2.ordinal();
                        java.lang.Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
                        if (bool != null) {
                            cnfVar.g.b(cnfVar.b, i3, aa$.ExternalSyntheticApiModelOutline0.m(bool.booleanValue()));
                        }
                    }
                }
                cne cneVar = dieVar2 != null ? (cne) dieVar2.g(defpackage.din.t) : null;
                cne cneVar2 = dieVar3 != null ? (cne) dieVar3.g(defpackage.din.t) : null;
                if (!defpackage.aooh.n(cneVar, cneVar2)) {
                    if (cneVar == null) {
                        cnfVar.g.c(cnfVar.b, i3, true);
                    } else if (cneVar2 == null) {
                        cnfVar.g.c(cnfVar.b, i3, false);
                    } else {
                        cnfVar.g.b(cnfVar.b, i3, cneVar2.a);
                    }
                }
            } else if (!defpackage.aooh.n(cncVar, cncVar3)) {
                cnfVar.g.c(cnfVar.b, i3, false);
            }
            boolean z = dieVar != null && defpackage.adw.f(dieVar.c, defpackage.din.r);
            boolean z2 = dieVarQ != null && defpackage.adw.f(dieVarQ.c, defpackage.din.r);
            if (z != z2) {
                if (z2) {
                    cnfVar.h.d(i3);
                } else {
                    cnfVar.h.e(i3);
                }
            }
        }
    }
}
