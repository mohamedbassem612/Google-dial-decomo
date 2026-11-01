package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aey implements defpackage.cye {
    private final defpackage.aff a;
    private boolean b;

    public aey(defpackage.aff affVar) {
        this.a = affVar;
    }

    @Override // defpackage.cye
    public final int a(defpackage.cxf cxfVar, java.util.List list, int i) {
        int iC = 0;
        if (!list.isEmpty()) {
            iC = ((defpackage.cxe) list.get(0)).c(i);
            int iAZ = defpackage.ajsz.aZ(list);
            if (iAZ > 0) {
                int i2 = 1;
                while (true) {
                    int iC2 = ((defpackage.cxe) list.get(i2)).c(i);
                    if (iC2 > iC) {
                        iC = iC2;
                    }
                    if (i2 == iAZ) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return iC;
    }

    @Override // defpackage.cye
    public final int b(defpackage.cxf cxfVar, java.util.List list, int i) {
        int iD = 0;
        if (!list.isEmpty()) {
            iD = ((defpackage.cxe) list.get(0)).d(i);
            int iAZ = defpackage.ajsz.aZ(list);
            if (iAZ > 0) {
                int i2 = 1;
                while (true) {
                    int iD2 = ((defpackage.cxe) list.get(i2)).d(i);
                    if (iD2 > iD) {
                        iD = iD2;
                    }
                    if (i2 == iAZ) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return iD;
    }

    @Override // defpackage.cye
    public final int c(defpackage.cxf cxfVar, java.util.List list, int i) {
        int iE = 0;
        if (!list.isEmpty()) {
            iE = ((defpackage.cxe) list.get(0)).e(i);
            int iAZ = defpackage.ajsz.aZ(list);
            if (iAZ > 0) {
                int i2 = 1;
                while (true) {
                    int iE2 = ((defpackage.cxe) list.get(i2)).e(i);
                    if (iE2 > iE) {
                        iE = iE2;
                    }
                    if (i2 == iAZ) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return iE;
    }

    @Override // defpackage.cye
    public final int d(defpackage.cxf cxfVar, java.util.List list, int i) {
        int iF = 0;
        if (!list.isEmpty()) {
            iF = ((defpackage.cxe) list.get(0)).f(i);
            int iAZ = defpackage.ajsz.aZ(list);
            if (iAZ > 0) {
                int i2 = 1;
                while (true) {
                    int iF2 = ((defpackage.cxe) list.get(i2)).f(i);
                    if (iF2 > iF) {
                        iF = iF2;
                    }
                    if (i2 == iAZ) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return iF;
    }

    @Override // defpackage.cye
    public final defpackage.cyf e(defpackage.cyi cyiVar, java.util.List list, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            defpackage.czc czcVarV = ((defpackage.cyd) list.get(i)).v(j);
            iMax2 = java.lang.Math.max(iMax2, czcVarV.a);
            iMax = java.lang.Math.max(iMax, czcVarV.b);
            arrayList.add(czcVarV);
        }
        if (cyiVar.dw()) {
            this.b = true;
            this.a.b.b(new defpackage.dpp((((long) iMax2) << 32) | (((long) iMax) & 4294967295L)));
        } else if (!this.b) {
            this.a.b.b(new defpackage.dpp((((long) iMax2) << 32) | (((long) iMax) & 4294967295L)));
        }
        return cyiVar.du(iMax2, iMax, defpackage.aokd.a, new defpackage.nm(arrayList, 10));
    }
}
