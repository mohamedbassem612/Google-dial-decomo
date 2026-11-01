package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class awx implements defpackage.cye, defpackage.azf {
    public final defpackage.cmi a;
    private final defpackage.awh b;

    public awx(defpackage.awh awhVar, defpackage.cmi cmiVar) {
        this.b = awhVar;
        this.a = cmiVar;
    }

    @Override // defpackage.cye
    public final int a(defpackage.cxf cxfVar, java.util.List list, int i) {
        int iDp = cxfVar.dp(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.cxe cxeVar = (defpackage.cxe) list.get(i3);
            defpackage.azg azgVarAT = defpackage.den.aT(cxeVar);
            float f2 = azgVarAT != null ? azgVarAT.a : 0.0f;
            int iC = cxeVar.c(i);
            if (f2 == 0.0f) {
                i2 += iC;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = java.lang.Math.max(iMax, java.lang.Math.round(iC / f2));
            }
        }
        return java.lang.Math.round(iMax * f) + i2 + ((list.size() - 1) * iDp);
    }

    @Override // defpackage.cye
    public final int b(defpackage.cxf cxfVar, java.util.List list, int i) {
        int iDp = cxfVar.dp(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = java.lang.Math.min((list.size() - 1) * iDp, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.cxe cxeVar = (defpackage.cxe) list.get(i2);
            defpackage.azg azgVarAT = defpackage.den.aT(cxeVar);
            float f2 = azgVarAT != null ? azgVarAT.a : 0.0f;
            if (f2 == 0.0f) {
                int iMin2 = java.lang.Math.min(cxeVar.c(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = java.lang.Math.max(iMax, cxeVar.d(iMin2));
            } else if (f2 > 0.0f) {
                f += f2;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            defpackage.cxe cxeVar2 = (defpackage.cxe) list.get(i3);
            defpackage.azg azgVarAT2 = defpackage.den.aT(cxeVar2);
            float f3 = azgVarAT2 != null ? azgVarAT2.a : 0.0f;
            if (f3 > 0.0f) {
                iMax = java.lang.Math.max(iMax, cxeVar2.d(iRound != Integer.MAX_VALUE ? java.lang.Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.cye
    public final int c(defpackage.cxf cxfVar, java.util.List list, int i) {
        int iDp = cxfVar.dp(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.cxe cxeVar = (defpackage.cxe) list.get(i3);
            defpackage.azg azgVarAT = defpackage.den.aT(cxeVar);
            float f2 = azgVarAT != null ? azgVarAT.a : 0.0f;
            int iE = cxeVar.e(i);
            if (f2 == 0.0f) {
                i2 += iE;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = java.lang.Math.max(iMax, java.lang.Math.round(iE / f2));
            }
        }
        return java.lang.Math.round(iMax * f) + i2 + ((list.size() - 1) * iDp);
    }

    @Override // defpackage.cye
    public final int d(defpackage.cxf cxfVar, java.util.List list, int i) {
        int iDp = cxfVar.dp(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = java.lang.Math.min((list.size() - 1) * iDp, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.cxe cxeVar = (defpackage.cxe) list.get(i2);
            defpackage.azg azgVarAT = defpackage.den.aT(cxeVar);
            float f2 = azgVarAT != null ? azgVarAT.a : 0.0f;
            if (f2 == 0.0f) {
                int iMin2 = java.lang.Math.min(cxeVar.c(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = java.lang.Math.max(iMax, cxeVar.f(iMin2));
            } else if (f2 > 0.0f) {
                f += f2;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            defpackage.cxe cxeVar2 = (defpackage.cxe) list.get(i3);
            defpackage.azg azgVarAT2 = defpackage.den.aT(cxeVar2);
            float f3 = azgVarAT2 != null ? azgVarAT2.a : 0.0f;
            if (f3 > 0.0f) {
                iMax = java.lang.Math.max(iMax, cxeVar2.f(iRound != Integer.MAX_VALUE ? java.lang.Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.cye
    public final defpackage.cyf e(defpackage.cyi cyiVar, java.util.List list, long j) {
        return defpackage.den.aS(this, defpackage.dpd.c(j), defpackage.dpd.d(j), defpackage.dpd.a(j), defpackage.dpd.b(j), cyiVar.dp(this.b.a()), cyiVar, list, new defpackage.czc[list.size()], 0, list.size(), null, 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.awx) {
            defpackage.awx awxVar = (defpackage.awx) obj;
            if (defpackage.aooh.n(this.b, awxVar.b) && defpackage.aooh.n(this.a, awxVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.azf
    public final int f(defpackage.czc czcVar) {
        return czcVar.a;
    }

    @Override // defpackage.azf
    public final int g(defpackage.czc czcVar) {
        return czcVar.b;
    }

    @Override // defpackage.azf
    public final void h(int i, int[] iArr, int[] iArr2, defpackage.cyi cyiVar) {
        this.b.c(cyiVar, i, iArr, iArr2);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.azf
    public final long i(int i, int i2, int i3, boolean z) {
        return !z ? defpackage.dpe.c(0, i3, i, i2) : defpackage.dpe.j(0, i3, i, i2);
    }

    @Override // defpackage.azf
    public final defpackage.cyf j(defpackage.czc[] czcVarArr, defpackage.cyi cyiVar, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return cyiVar.du(i2, i, defpackage.aokd.a, new defpackage.ahcq(czcVarArr, this, i2, cyiVar, iArr, 1));
    }

    public final java.lang.String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.b + ", horizontalAlignment=" + this.a + ')';
    }
}
