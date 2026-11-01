package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class avu extends cmv implements dbd {
    public cwk a;
    public float b;
    public float c;

    public avu(cwk cwkVar, float f, float f2) {
        this.a = cwkVar;
        this.b = f;
        this.c = f2;
    }

    public final cyf cX(cyi cyiVar, cyd cydVar, long j) {
        long j2;
        long jK;
        int i;
        boolean z;
        int iMax;
        int iMax2;
        final cwk cwkVar = this.a;
        boolean z2 = cwkVar instanceof cxa;
        final float f = this.b;
        float f2 = this.c;
        if (z2) {
            j2 = j;
            jK = dpd.k(j2, 0, 0, 0, 0, 11);
        } else {
            j2 = j;
            jK = dpd.k(j2, 0, 0, 0, 0, 14);
        }
        final czc czcVarV = cydVar.v(jK);
        int iDm = czcVarV.dm(cwkVar);
        if (iDm == Integer.MIN_VALUE) {
            iDm = 0;
        }
        if (z2) {
            i = czcVarV.b;
            z = true;
        } else {
            i = czcVarV.a;
            z = false;
        }
        int iA = (z ? dpd.a(j2) : dpd.b(j2)) - i;
        final int iW = aooc.w((!java.lang.Float.isNaN(f) ? cyiVar.dp(f) : 0) - iDm, 0, iA);
        final int iW2 = aooc.w(((!java.lang.Float.isNaN(f2) ? cyiVar.dp(f2) : 0) - i) + iDm, 0, iA - iW);
        if (z) {
            iMax = czcVarV.a;
            iMax2 = java.lang.Math.max(czcVarV.b + iW + iW2, dpd.c(j2));
        } else {
            iMax = java.lang.Math.max(czcVarV.a + iW + iW2, dpd.d(j2));
            iMax2 = czcVarV.b;
        }
        final int i2 = iMax;
        final int i3 = iMax2;
        return cyiVar.du(i2, i3, aokd.a, new aonj() { // from class: avs
            public final java.lang.Object a(java.lang.Object obj) {
                int i4;
                int i5 = iW;
                boolean z3 = cwkVar instanceof cxa;
                float f3 = f;
                int i6 = iW2;
                czb czbVar = (czb) obj;
                czc czcVar = czcVarV;
                if (z3) {
                    i4 = 0;
                } else {
                    i4 = java.lang.Float.compare(f3, Float.NaN) == 0 ? (i2 - i6) - czcVar.a : i5;
                }
                if (!z3) {
                    i5 = 0;
                } else if (java.lang.Float.compare(f3, Float.NaN) == 0) {
                    i5 = (i3 - i6) - czcVar.b;
                }
                czbVar.u(czcVar, i4, i5, 0.0f);
                return aojh.a;
            }
        });
    }

    public final /* synthetic */ int e(cxf cxfVar, cxe cxeVar, int i) {
        return ddt.c(new defpackage.dbc(this), cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int f(cxf cxfVar, cxe cxeVar, int i) {
        return ddt.d(new defpackage.dbc(this), cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int i(cxf cxfVar, cxe cxeVar, int i) {
        return ddt.e(new defpackage.dbc(this), cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int j(cxf cxfVar, cxe cxeVar, int i) {
        return ddt.f(new defpackage.dbc(this), cxfVar, cxeVar, i);
    }
}
