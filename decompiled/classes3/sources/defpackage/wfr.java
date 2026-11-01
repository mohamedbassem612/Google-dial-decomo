package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wfr extends defpackage.wfv {
    public wfr() {
        super("USER_SPEAKS");
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
        defpackage.wfv.m(wgcVar);
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            ((defpackage.wgb) it.next()).i(0.0f);
        }
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            ((defpackage.wgb) it.next()).g(0.0f);
        }
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        float f;
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            float f2 = wgbVar.j;
            int iB = wgcVar.b(wgbVar);
            if (iB == 0) {
                f = 9.0f;
            } else if (iB != 1) {
                f = iB != 2 ? 8.0f : 10.0f;
            } else {
                f = 7.0f;
            }
            wgbVar.g(f2 * f);
        }
        return true;
    }
}
