package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wfh extends defpackage.wfv {
    public wfh() {
        super("MOLECULE_WAVY");
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
        defpackage.wfv.o(wgcVar);
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        wsc.aa(wgcVar);
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            int iB = wgcVar.b(wgbVar);
            float fE = defpackage.wfv.e(j2, iB);
            defpackage.wfv.j(wgbVar, iB, fE);
            if (wgbVar == wgcVar.b) {
                if (((double) fE) % 0.5d < 0.25d) {
                    wgbVar.k(14.0f);
                } else {
                    wgbVar.k(12.0f);
                }
            }
        }
        return true;
    }
}
