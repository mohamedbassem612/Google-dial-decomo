package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class anup extends defpackage.anus implements defpackage.anvp, defpackage.aoac {
    public static final java.util.logging.Logger s = java.util.logging.Logger.getLogger(defpackage.anup.class.getName());
    private anph a;
    private volatile boolean b;
    private final defpackage.aoad c;
    public final aodq t;
    public final boolean u;

    protected anup(defpackage.aodv aodvVar, defpackage.aodj aodjVar, aodq aodqVar, anph anphVar, anmb anmbVar) {
        ahvr.cj(anphVar, "headers");
        ahvr.cj(aodqVar, "transportTracer");
        this.t = aodqVar;
        this.u = anxo.i(anmbVar);
        this.c = new defpackage.aoad(this, aodvVar, aodjVar);
        this.a = anphVar;
    }

    @Override // defpackage.anvp
    public final void b(defpackage.anxu anxuVar) {
        anxuVar.b("remote_addr", a().a(defpackage.annh.a));
    }

    @Override // defpackage.anvp
    public final void c(anqw anqwVar) {
        ahvr.bN(!anqwVar.h(), "Should not cancel with OK status");
        this.b = true;
        p().a(anqwVar);
    }

    @Override // defpackage.anvp
    public final void e() {
        if (t().s) {
            return;
        }
        t().s = true;
        defpackage.aoad aoadVarV = v();
        if (aoadVarV.i) {
            return;
        }
        aoadVarV.i = true;
        defpackage.aodu aoduVar = aoadVarV.b;
        if (aoduVar != null && aoduVar.a() == 0 && aoadVarV.b != null) {
            aoadVarV.b = null;
        }
        aoadVarV.a(true, true);
    }

    @Override // defpackage.anvp
    public final void i(anmw anmwVar) {
        anph anphVar = this.a;
        anpc anpcVar = anxo.b;
        anphVar.f(anpcVar);
        this.a.h(anpcVar, java.lang.Long.valueOf(anmwVar.b(java.util.concurrent.TimeUnit.NANOSECONDS)));
    }

    @Override // defpackage.anvp
    public final void j(anmy anmyVar) {
        defpackage.anur anurVarT = t();
        ahvr.bZ(anurVarT.q == null, "Already called start");
        ahvr.cj(anmyVar, "decompressorRegistry");
        anurVarT.r = anmyVar;
    }

    @Override // defpackage.anvp
    public final void k(int i) {
        ((defpackage.anzz) t().j).b = i;
    }

    @Override // defpackage.anvp
    public final void l(int i) {
        defpackage.aoad aoadVar = this.c;
        ahvr.bZ(aoadVar.a == -1, "max size already set");
        aoadVar.a = i;
    }

    @Override // defpackage.anvp
    public final void m(defpackage.anvr anvrVar) {
        defpackage.anur anurVarT = t();
        ahvr.bZ(anurVarT.q == null, "Already called setListener");
        anurVarT.q = anvrVar;
        p().c(this.a);
        this.a = null;
    }

    @Override // defpackage.anus, defpackage.aodk
    public final boolean o() {
        return q().i() && !this.b;
    }

    protected abstract defpackage.anuo p();

    @Override // defpackage.anus
    protected /* bridge */ /* synthetic */ defpackage.anur q() {
        throw null;
    }

    protected abstract defpackage.anur t();

    @Override // defpackage.aoac
    public final void u(defpackage.aodu aoduVar, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (aoduVar == null && !z) {
            z3 = false;
        }
        ahvr.bN(z3, "null frame before EOS");
        p().b(aoduVar, z, z2, i);
    }

    @Override // defpackage.anus
    protected final defpackage.aoad v() {
        return this.c;
    }
}
