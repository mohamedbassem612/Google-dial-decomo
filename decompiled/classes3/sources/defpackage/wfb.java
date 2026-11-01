package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wfb extends defpackage.wfv {
    public wfb() {
        super("MIC ENTER");
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        defpackage.wfv.k(wgcVar);
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        if (!defpackage.wfv.p(wgcVar)) {
            i(wgcVar, j2);
            return true;
        }
        float f = defpackage.wfv.f(j, j2, 300L);
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            if (f - (wgcVar.b(wgbVar) * 0.15f) < 0.0f) {
                h(wgcVar, wgbVar, j2);
            } else {
                wgbVar.i(-6.0f);
            }
        }
        if (wgcVar.b.c() < -5.666999816894531d) {
            defpackage.wfv.n(wgcVar);
        }
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
