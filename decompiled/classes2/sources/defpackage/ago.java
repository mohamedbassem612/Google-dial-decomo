package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ago extends defpackage.ahn {
    private final ccp a;
    private final ccp b;
    private final defpackage.bhm c;

    public ago(defpackage.bhm bhmVar, defpackage.agu aguVar, cpn cpnVar) {
        this.c = bhmVar;
        cdu cduVar = cdu.c;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(aguVar, cduVar);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(cpnVar, cduVar);
    }

    @Override // defpackage.ahn
    public final defpackage.ahn a() {
        defpackage.bhm bhmVar = this.c;
        cdh.x(mni.bl(bhmVar.b(), bhmVar.e()), bhmVar.d());
        defpackage.agy agyVar = j().e;
        agyVar.s().y();
        agyVar.s();
        dpy.l(agyVar.e().b.b().h());
        return defpackage.agq.a;
    }

    @Override // defpackage.ahn
    public final cpn b() {
        return (cpn) this.b.a();
    }

    @Override // defpackage.ahn
    public final void d(cpn cpnVar) {
        this.b.b(cpnVar);
    }

    @Override // defpackage.ahn
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ahn
    public final defpackage.ahn f(defpackage.agx agxVar, defpackage.agu aguVar, long j, long j2, long j3) {
        wl.d(this.c, j, j2, j3, !aooh.n(j(), aguVar));
        this.a.b(aguVar);
        return this;
    }

    @Override // defpackage.ahn
    public final defpackage.bhm h() {
        return this.c;
    }

    @Override // defpackage.ahn
    public final boolean i() {
        return true;
    }

    public final defpackage.agu j() {
        return (defpackage.agu) this.a.a();
    }

    @Override // defpackage.ahn
    public final defpackage.ahn g(defpackage.agu aguVar) {
        return this;
    }
}
