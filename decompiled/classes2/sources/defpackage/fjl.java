package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fjl implements defpackage.fkj {
    final /* synthetic */ defpackage.fjo a;

    public fjl(defpackage.fjo fjoVar) {
        j$.util.Objects.requireNonNull(fjoVar);
        this.a = fjoVar;
    }

    @Override // defpackage.fkj
    public final void a(defpackage.fkl fklVar) {
        defpackage.eqg eqgVar = fklVar.a;
        defpackage.fjo fjoVar = this.a;
        fjoVar.E = fjoVar.h(fklVar, eqgVar, false, 7001);
    }

    @Override // defpackage.fkj
    public final void b() {
        defpackage.fjo fjoVar = this.a;
        if (fjoVar.l != null) {
            fjoVar.aR();
        }
    }

    @Override // defpackage.fkj
    public final void c() {
        rai raiVar = this.a.I;
        if (raiVar != null) {
            raiVar.v();
        }
    }

    @Override // defpackage.fkj
    public final void d() {
        defpackage.fjo fjoVar = this.a;
        if (fjoVar.l != null) {
            fjoVar.aS(0, 1);
        }
    }

    @Override // defpackage.fkj
    public final void e() {
    }
}
