package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wfj extends defpackage.wfv {
    public wfj() {
        super("MOLECULE_DRIFTING");
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
            defpackage.wfv.j(wgbVar, iB, defpackage.wfv.e(j2, iB));
        }
        return true;
    }
}
