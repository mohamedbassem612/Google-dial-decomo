package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wfs extends defpackage.wfv {
    public wfs() {
        super("GOT IT");
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
        float f;
        java.util.Iterator it = wgcVar.iterator();
        while (true) {
            long j3 = j;
            long j4 = j2;
            f = defpackage.wfv.f(j3, j4, 1000L);
            if (!it.hasNext()) {
                break;
            }
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            float fB = f - (wgcVar.b(wgbVar) * 0.05f);
            if (fB < 0.0f) {
                h(wgcVar, wgbVar, j4);
            } else if (fB < 0.15f) {
                wgbVar.i(-8.0f);
            } else if (fB < 0.3f) {
                wgbVar.i(8.0f);
            } else {
                h(wgcVar, wgbVar, j4);
            }
            j = j3;
            j2 = j4;
        }
        return f < 1.0f;
    }
}
