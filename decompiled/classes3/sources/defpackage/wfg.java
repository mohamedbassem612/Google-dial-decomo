package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wfg extends defpackage.wfv {
    public wfg() {
        super("MOLECULE_EXIT");
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
        wgcVar.b.u(3.1415927f, 12.0f);
        wgcVar.c.u(3.1415927f, 4.0f);
        wgcVar.d.u(0.0f, 4.0f);
        wgcVar.e.u(0.0f, 12.0f);
        wgcVar.f.u(0.0f, 8.0f);
        wgcVar.g.u(0.0f, 8.0f);
        defpackage.wfv.g(wgcVar);
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            wgbVar.k(4.0f);
            wgbVar.h(0.0f);
        }
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        defpackage.wfv.l(wgcVar);
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        if (j2 - j >= 100) {
            i(wgcVar, j2);
            return false;
        }
        wgcVar.b.i(16.0f);
        wgcVar.c.i(9.0f);
        wgcVar.d.i(14.0f);
        wgcVar.e.i(10.0f);
        return true;
    }
}
