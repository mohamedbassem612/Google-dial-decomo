package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wez extends defpackage.wfv {
    private boolean y;

    public wez() {
        super("ROTATION EXIT");
    }

    static final float d(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    @Override // defpackage.wfv
    public final void a(defpackage.wgc wgcVar) {
        this.y = false;
        if (defpackage.wfv.p(wgcVar)) {
            return;
        }
        wgcVar.g(12.0f);
    }

    @Override // defpackage.wfv
    public final void b(defpackage.wgc wgcVar) {
        if (this.y) {
            return;
        }
        wgcVar.h();
        wgcVar.e();
        defpackage.wfv.m(wgcVar);
    }

    @Override // defpackage.wfv
    public final boolean c(long j, long j2, defpackage.wgc wgcVar) {
        if (defpackage.wfv.p(wgcVar)) {
            return false;
        }
        if (this.y) {
            i(wgcVar, j2);
            if (defpackage.wfv.p(wgcVar)) {
                return false;
            }
        } else {
            float fA = wgcVar.a();
            float fA2 = wgcVar.b.a() + fA;
            float fA3 = wgcVar.c.a() + fA;
            float fA4 = wgcVar.d.a() + fA;
            float fA5 = wgcVar.e.a() + fA;
            float fD = d(2.7488937f - fA2);
            if (fD > d((-0.3926991f) - fA5)) {
                float f = 2.7488937f - fA3;
                float fD2 = d((-0.3926991f) - fA4);
                if (fD2 > d(f) && fD < 4.712389f && fD2 < 4.712389f) {
                    wgcVar.h();
                    wgcVar.e();
                    defpackage.wfv.m(wgcVar);
                    this.y = true;
                }
            }
        }
        return true;
    }
}
