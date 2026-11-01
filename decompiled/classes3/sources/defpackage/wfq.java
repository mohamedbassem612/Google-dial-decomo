package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wfq extends defpackage.wfv {
    public wfq() {
        super("LISTENING");
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
        defpackage.wfv.m(wgcVar);
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            ((defpackage.wgb) it.next()).i(0.0f);
        }
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        i(wgcVar, j2);
        return true;
    }
}
