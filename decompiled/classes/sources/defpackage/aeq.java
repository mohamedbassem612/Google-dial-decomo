package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeq implements defpackage.cye {
    public final defpackage.aex a;
    public defpackage.czc[] b;
    public defpackage.czc[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    private final defpackage.aonj h = new defpackage.nm(this, 6);
    private final defpackage.aonj i = new defpackage.nm(this, 7);

    public aeq(defpackage.aex aexVar) {
        this.a = aexVar;
    }

    @Override // defpackage.cye
    public final int a(defpackage.cxf cxfVar, java.util.List list, int i) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((defpackage.cxe) list.get(0)).c(i));
            int iAZ = defpackage.ajsz.aZ(list);
            if (iAZ > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((defpackage.cxe) list.get(i2)).c(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iAZ) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cye
    public final int b(defpackage.cxf cxfVar, java.util.List list, int i) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((defpackage.cxe) list.get(0)).d(i));
            int iAZ = defpackage.ajsz.aZ(list);
            if (iAZ > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((defpackage.cxe) list.get(i2)).d(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iAZ) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cye
    public final int c(defpackage.cxf cxfVar, java.util.List list, int i) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((defpackage.cxe) list.get(0)).e(i));
            int iAZ = defpackage.ajsz.aZ(list);
            if (iAZ > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((defpackage.cxe) list.get(i2)).e(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iAZ) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cye
    public final int d(defpackage.cxf cxfVar, java.util.List list, int i) {
        java.lang.Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = java.lang.Integer.valueOf(((defpackage.cxe) list.get(0)).f(i));
            int iAZ = defpackage.ajsz.aZ(list);
            if (iAZ > 0) {
                int i2 = 1;
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((defpackage.cxe) list.get(i2)).f(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iAZ) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.cye
    public final defpackage.cyf e(defpackage.cyi cyiVar, java.util.List list, long j) {
        defpackage.aoiu aoiuVar;
        defpackage.aex aexVar = this.a;
        defpackage.cmj cmjVar = aexVar.b;
        int size = list.size();
        defpackage.czc[] czcVarArr = new defpackage.czc[size];
        int size2 = list.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            defpackage.cyd cydVar = (defpackage.cyd) list.get(i);
            java.lang.Object objG = cydVar.g();
            defpackage.aet aetVar = objG instanceof defpackage.aet ? (defpackage.aet) objG : null;
            if (aetVar != null && ((java.lang.Boolean) aetVar.a.a()).booleanValue()) {
                defpackage.czc czcVarV = cydVar.v(j);
                long j3 = ((long) czcVarV.a) << 32;
                long j4 = ((long) czcVarV.b) & 4294967295L;
                czcVarArr[i] = czcVarV;
                j2 = j3 | j4;
            }
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            defpackage.cyd cydVar2 = (defpackage.cyd) list.get(i2);
            if (czcVarArr[i2] == null) {
                czcVarArr[i2] = cydVar2.v(j);
            }
        }
        if (cyiVar.dw()) {
            aoiuVar = new defpackage.aoiu(java.lang.Integer.valueOf((int) (j2 >> 32)), java.lang.Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                defpackage.czc czcVar = czcVarArr[i5];
                if (czcVar != null) {
                    java.lang.Object objG2 = ((defpackage.cyd) list.get(i5)).g();
                    defpackage.aet aetVar2 = objG2 instanceof defpackage.aet ? (defpackage.aet) objG2 : null;
                    if (aetVar2 == null || !((java.lang.Boolean) aetVar2.b.a()).booleanValue()) {
                        int i6 = czcVar.a;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = czcVar.b;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            aoiuVar = new defpackage.aoiu(java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4));
        }
        int iIntValue = ((java.lang.Number) aoiuVar.a).intValue();
        int iIntValue2 = ((java.lang.Number) aoiuVar.b).intValue();
        if (cyiVar.dw()) {
            this.b = czcVarArr;
            this.d = iIntValue;
            this.f = iIntValue2;
            return cyiVar.du(iIntValue, iIntValue2, defpackage.aokd.a, this.h);
        }
        aexVar.c.b(new defpackage.dpp((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        this.c = czcVarArr;
        this.e = iIntValue;
        this.g = iIntValue2;
        return cyiVar.du(iIntValue, iIntValue2, defpackage.aokd.a, this.i);
    }
}
