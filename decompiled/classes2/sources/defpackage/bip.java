package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bip extends dap implements dan, defpackage.biv {
    public aonj a;
    public aonj b = null;
    public aonj c;
    public aoub d;
    public vm e;
    private final cer f;
    private cpn g;

    public bip(vm vmVar, aonj aonjVar, aonj aonjVar2) {
        this.e = vmVar;
        this.a = aonjVar;
        this.c = aonjVar2;
        defpackage.bhl bhlVar = new defpackage.bhl(this, 6);
        ajxw ajxwVar = ceo.a;
        this.f = new cbk(bhlVar, (cen) null);
        this.g = cpn.a;
    }

    @Override // defpackage.biv
    public final long a(cxi cxiVar) {
        return c(cxiVar).d();
    }

    @Override // defpackage.biv
    public final defpackage.bhe b() {
        return (defpackage.bhe) this.f.a();
    }

    @Override // defpackage.biv
    public final cpn c(cxi cxiVar) {
        java.lang.Object objA;
        if (!((cmv) this).D || (objA = this.c.a(cxiVar)) == null) {
            return this.g;
        }
        cpn cpnVar = (cpn) objA;
        this.g = cpnVar;
        return cpnVar;
    }

    public final void dc() {
        vm vmVar = this.e;
        vmVar.a = 3;
        vmVar.b = this;
    }

    public final void u() {
        vm vmVar = this.e;
        vmVar.a = 2;
        vmVar.b = null;
    }
}
