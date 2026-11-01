package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wey extends defpackage.wfv {
    public wey() {
        super("REPLY");
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
        defpackage.wfv.q(wgcVar);
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            ((defpackage.wgb) it.next()).r(false);
        }
        defpackage.wfv.q(wgcVar);
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        if (j2 - j > 300) {
            java.util.Iterator it = wgcVar.iterator();
            while (it.hasNext()) {
                ((defpackage.wgb) it.next()).r(true);
            }
        }
        java.util.Iterator it2 = wgcVar.iterator();
        while (it2.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it2.next();
            wgbVar.j((wgbVar.j * 4.0f) + 4.0f);
        }
        return true;
    }
}
