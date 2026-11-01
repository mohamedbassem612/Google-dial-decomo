package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wfm extends defpackage.wfv {
    private final int[] y;

    public wfm() {
        super("MOLECULE_APPEAR");
        this.y = new int[]{0, 2, 3, 1};
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
        defpackage.wfv.o(wgcVar);
        wgcVar.c(0.0f);
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            wgbVar.i(defpackage.wfv.a[wgcVar.b(wgbVar)] + 10.0f);
        }
        wgcVar.f();
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        wsc.aa(wgcVar);
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        float f;
        java.util.Iterator it = wgcVar.iterator();
        while (true) {
            long j3 = j;
            long j4 = j2;
            f = defpackage.wfv.f(j3, j4, 300L);
            if (!it.hasNext()) {
                break;
            }
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            int iB = wgcVar.b(wgbVar);
            float f2 = f - (this.y[iB] * 0.01f);
            if (f2 > 0.0f && f2 < 0.5f) {
                wgbVar.i(defpackage.wfv.a[iB] - 32.0f);
            } else if (f2 > 0.5f && f2 < 1.0f) {
                wgbVar.i(defpackage.wfv.a[iB]);
            }
            j = j3;
            j2 = j4;
        }
        wgcVar.c(f);
        return f < 1.0f;
    }
}
