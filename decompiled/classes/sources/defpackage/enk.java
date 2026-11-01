package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class enk implements defpackage.emv {
    final /* synthetic */ defpackage.emp a;
    final /* synthetic */ defpackage.aoot b;
    final /* synthetic */ defpackage.aoss c;
    final /* synthetic */ defpackage.emp d;
    final /* synthetic */ defpackage.aosb e;
    final /* synthetic */ defpackage.aonn f;
    final /* synthetic */ defpackage.apdp g;

    public enk(defpackage.emp empVar, defpackage.aoot aootVar, defpackage.aoss aossVar, defpackage.emp empVar2, defpackage.aosb aosbVar, defpackage.apdp apdpVar, defpackage.aonn aonnVar) {
        this.a = empVar;
        this.b = aootVar;
        this.c = aossVar;
        this.d = empVar2;
        this.e = aosbVar;
        this.g = apdpVar;
        this.f = aonnVar;
    }

    @Override // defpackage.emv
    public final void a(defpackage.emx emxVar, defpackage.emp empVar) {
        if (empVar == this.a) {
            this.b.a = defpackage.aoov.an(this.c, null, 0, new defpackage.adxw(this.g, this.f, (defpackage.aoln) null, 1), 3);
            return;
        }
        if (empVar == this.d) {
            defpackage.aoot aootVar = this.b;
            defpackage.aoub aoubVar = (defpackage.aoub) aootVar.a;
            if (aoubVar != null) {
                aoubVar.s(null);
            }
            aootVar.a = null;
        }
        if (empVar == defpackage.emp.ON_DESTROY) {
            this.e.w(defpackage.aojh.a);
        }
    }
}
