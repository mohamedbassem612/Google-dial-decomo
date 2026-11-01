package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class brn extends defpackage.cmv implements defpackage.dan, defpackage.dbd {
    private java.util.Map a;

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        int iMax;
        int iMax2;
        float f = ((defpackage.dpi) defpackage.cfo.G(this, defpackage.bqd.c)).a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        defpackage.czc czcVarV = cydVar.v(j);
        int i = 0;
        boolean z = this.D && !java.lang.Float.isNaN(f) && defpackage.dpi.a(f, 0.0f) > 0;
        int iDp = !java.lang.Float.isNaN(f) ? cyiVar.dp(f) : 0;
        if (z) {
            iMax = java.lang.Math.max(czcVarV.a, iDp);
            iMax2 = java.lang.Math.max(czcVarV.b, iDp);
        } else {
            iMax = czcVarV.a;
            iMax2 = czcVarV.b;
        }
        if (z) {
            java.util.Map linkedHashMap = this.a;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap(2);
                this.a = linkedHashMap;
            }
            defpackage.czr czrVar = defpackage.bqd.b;
            int iRound = java.lang.Math.round((iDp - czcVarV.a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(czrVar, java.lang.Integer.valueOf(iRound));
            defpackage.cxa cxaVar = defpackage.bqd.a;
            int iRound2 = java.lang.Math.round((iDp - czcVarV.b) / 2.0f);
            if (iRound2 < 0) {
                iRound2 = 0;
            }
            linkedHashMap.put(cxaVar, java.lang.Integer.valueOf(iRound2));
        }
        java.util.Map map = this.a;
        if (map == null) {
            map = defpackage.aokd.a;
        }
        return cyiVar.du(iMax, iMax2, map, new defpackage.brm(iMax, czcVarV, iMax2, i));
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return wo.f(this, cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return wo.g(this, cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return wo.h(this, cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return wo.i(this, cxfVar, cxeVar, i);
    }
}
