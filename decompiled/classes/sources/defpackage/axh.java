package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class axh extends defpackage.cmv implements defpackage.dbd, defpackage.dcz {
    public float a;
    public int b;

    public axh(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.dcz
    public final java.lang.Object cW(defpackage.dpf dpfVar, java.lang.Object obj) {
        defpackage.axi axiVar = obj instanceof defpackage.axi ? (defpackage.axi) obj : null;
        if (axiVar == null) {
            return obj == null ? new defpackage.axi() : obj;
        }
        return axiVar;
    }

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        int iD;
        int iB;
        int iA;
        int i;
        if (!defpackage.dpd.h(j) || this.b == 1) {
            iD = defpackage.dpd.d(j);
            iB = defpackage.dpd.b(j);
        } else {
            float fB = defpackage.dpd.b(j) * this.a;
            int iD2 = defpackage.dpd.d(j);
            iD = defpackage.dpd.b(j);
            int iRound = java.lang.Math.round(fB);
            if (iRound >= iD2) {
                iD2 = iRound;
            }
            if (iD2 <= iD) {
                iD = iD2;
            }
            iB = iD;
        }
        if (!defpackage.dpd.g(j) || this.b == 2) {
            int iC = defpackage.dpd.c(j);
            int iA2 = defpackage.dpd.a(j);
            iA = iC;
            i = iA2;
        } else {
            float fA = defpackage.dpd.a(j) * this.a;
            int iC2 = defpackage.dpd.c(j);
            iA = defpackage.dpd.a(j);
            int iRound2 = java.lang.Math.round(fA);
            if (iRound2 >= iC2) {
                iC2 = iRound2;
            }
            if (iC2 <= iA) {
                iA = iC2;
            }
            i = iA;
        }
        defpackage.czc czcVarV = cydVar.v(defpackage.dpe.c(iD, iB, iA, i));
        return cyiVar.du(czcVarV.a, czcVarV.b, defpackage.aokd.a, new defpackage.afz(czcVarV, 4));
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.c(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.d(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.e(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.f(new dbc(this), cxfVar, cxeVar, i);
    }
}
