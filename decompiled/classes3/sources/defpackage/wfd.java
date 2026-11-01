package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wfd extends defpackage.wfv {
    public wfd() {
        super("MIC ENTER FAST");
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        defpackage.wfv.k(wgcVar);
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        if (!defpackage.wfv.p(wgcVar)) {
            i(wgcVar, j2);
            return false;
        }
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            ((defpackage.wgb) it.next()).i(-6.0f);
        }
        defpackage.wfv.n(wgcVar);
        java.util.Iterator it2 = wgcVar.iterator();
        while (it2.hasNext()) {
            if (!((defpackage.wgb) it2.next()).v()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
    }
}
