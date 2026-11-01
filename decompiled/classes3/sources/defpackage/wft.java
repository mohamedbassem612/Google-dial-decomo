package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wft extends defpackage.wfv {
    public wft() {
        super("DIDN'T GET IT");
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
        defpackage.wfv.m(wgcVar);
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        java.util.Iterator it = wgcVar.iterator();
        while (it.hasNext()) {
            ((defpackage.wgb) it.next()).h(0.0f);
        }
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        float f;
        java.util.Iterator it = wgcVar.iterator();
        while (true) {
            long j3 = j;
            long j4 = j2;
            f = defpackage.wfv.f(j3, j4, 550L);
            if (!it.hasNext()) {
                break;
            }
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            wgbVar.h((float) (java.lang.Math.sin((f - (wgcVar.b(wgbVar) * 0.030909091f)) * 6.2831855f * 3.0f) * 6.0d));
            h(wgcVar, wgbVar, j4);
            j = j3;
            j2 = j4;
        }
        return f < 1.0f;
    }
}
