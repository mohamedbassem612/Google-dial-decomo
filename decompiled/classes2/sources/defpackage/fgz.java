package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fgz extends defpackage.fhi {
    private final defpackage.fgy[] e;

    /* JADX WARN: Illegal instructions before constructor call */
    public fgz(defpackage.ffw ffwVar, java.util.List list, defpackage.ffw[] ffwVarArr) {
        int i = ((aike) list).d;
        int length = ffwVarArr.length;
        ahvr.bM(i == length);
        defpackage.fgy[] fgyVarArr = new defpackage.fgy[length];
        for (int i2 = 0; i2 < ffwVarArr.length; i2++) {
            defpackage.ffw ffwVar2 = ffwVarArr[i2];
            long j = ((defpackage.eqs) list.get(i2)).h;
            fgyVarArr[i2] = new defpackage.fgy(ffwVar2);
        }
        defpackage.ffw[] ffwVarArr2 = new defpackage.ffw[length + 1];
        ffwVarArr2[0] = ffwVar;
        java.lang.System.arraycopy(fgyVarArr, 0, ffwVarArr2, 1, length);
        super(new defpackage.fge(ffwVarArr2));
        this.e = fgyVarArr;
    }

    @Override // defpackage.fhi, defpackage.few, defpackage.ffw
    public final void o(defpackage.eqt eqtVar) {
        super.o(eqtVar);
        defpackage.eqq eqqVar = eqtVar.b;
        ahvr.ci(eqqVar);
        int i = 0;
        while (true) {
            defpackage.fgy[] fgyVarArr = this.e;
            if (i >= fgyVarArr.length) {
                return;
            }
            aify aifyVar = eqqVar.g;
            defpackage.fgy fgyVar = fgyVarArr[i];
            long j = ((defpackage.eqs) aifyVar.get(i)).h;
            int i2 = 0;
            while (true) {
                java.util.List list = fgyVar.e;
                if (i2 < list.size()) {
                    ((defpackage.fhe) list.get(i2)).b = 0L;
                    i2++;
                }
            }
            i++;
        }
    }
}
