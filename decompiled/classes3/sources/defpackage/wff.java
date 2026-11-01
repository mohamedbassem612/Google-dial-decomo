package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wff extends defpackage.wfv {
    public wff() {
        super("MOLECULE");
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
        defpackage.wfv.g(wgcVar);
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        if (!defpackage.wfv.p(wgcVar) || j2 - j >= 100) {
            defpackage.wfv.o(wgcVar);
            return false;
        }
        wgcVar.b.i(12.0f);
        wgcVar.c.i(9.0f);
        wgcVar.d.i(14.0f);
        wgcVar.e.i(8.0f);
        return true;
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
    }
}
