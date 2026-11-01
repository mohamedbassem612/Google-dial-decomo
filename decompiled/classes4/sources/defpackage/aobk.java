package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aobk implements defpackage.aobm {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.aobu b;

    public aobk(defpackage.aobu aobuVar, java.lang.Object obj) {
        this.a = obj;
        j$.util.Objects.requireNonNull(aobuVar);
        this.b = aobuVar;
    }

    @Override // defpackage.aobm
    public final void a(defpackage.aobs aobsVar) {
        aobsVar.a.n(this.b.f.a(this.a));
        aobsVar.a.d();
    }
}
