package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bpk extends cmv implements dcz, dan {
    public aiq a;
    public dpi b = null;
    public final aii c = aij.a(0.0f);
    public kaw d;
    private aoub e;

    public bpk(kaw kawVar, aiq aiqVar) {
        this.d = kawVar;
        this.a = aiqVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object cW(dpf dpfVar, java.lang.Object obj) {
        defpackage.bns bnsVar = obj instanceof defpackage.bns ? (defpackage.bns) obj : null;
        if (bnsVar == null) {
            bnsVar = new defpackage.bns(null);
        }
        dpq dpqVar = ((cmv) this).D ? (dpq) cfo.G(this, dfo.j) : dpq.a;
        ayy ayyVar = bnj.a;
        return new defpackage.bns(bnsVar.a, this.c, den.aV(bnj.a, dpqVar));
    }

    public final void d() {
        aoub aoubVar = this.e;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        this.e = aoov.an(M(), (aolr) null, 0, new bpj(this, (aoln) null, 0), 3);
    }

    public final void dc() {
        d();
    }

    public final void u() {
        this.e = null;
    }
}
