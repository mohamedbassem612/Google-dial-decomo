package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wfl extends defpackage.wfv {
    public wfl() {
        super("MOLECULE HIDDEN");
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
        defpackage.wfv.o(wgcVar);
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            wgbVar.i(defpackage.wfv.a[wgcVar.b(wgbVar)] + 10.0f);
            wgcVar.c(0.0f);
        }
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        wgcVar.c(0.0f);
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        return false;
    }
}
