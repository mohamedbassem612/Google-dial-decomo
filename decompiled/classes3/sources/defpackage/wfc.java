package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wfc extends defpackage.wfv {
    public wfc() {
        super("MIC_EXIT");
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            wgbVar.n(0);
            wgbVar.h(0.0f);
            wgbVar.i(0.0f);
        }
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        defpackage.wgb wgbVar = wgcVar.c;
        wgbVar.n(0);
        defpackage.wgb wgbVar2 = wgcVar.d;
        wgbVar2.n(0);
        wgcVar.e.n(0);
        if (wgbVar.b() < 0.5f) {
            wgcVar.b.n(0);
            wgbVar.h(0.0f);
            wgbVar2.h(0.0f);
        }
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            h(wgcVar, (defpackage.wgb) it.next(), j2);
        }
        java.util.Iterator it2 = wgcVar.iterator();
        while (it2.hasNext()) {
            if (((defpackage.wgb) it2.next()).v()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
    }
}
