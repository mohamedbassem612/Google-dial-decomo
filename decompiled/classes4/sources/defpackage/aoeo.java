package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoeo extends defpackage.aoeq {
    final /* synthetic */ defpackage.aoer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoeo(defpackage.aoer aoerVar) {
        super(aoerVar);
        j$.util.Objects.requireNonNull(aoerVar);
        this.a = aoerVar;
        int i = defpackage.aoik.a;
    }

    @Override // defpackage.aoeq
    public final void a() {
        int i;
        apoy apoyVar = new apoy();
        int i2 = defpackage.aoik.a;
        defpackage.aoer aoerVar = this.a;
        synchronized (aoerVar.a) {
            apoy apoyVar2 = aoerVar.b;
            apoyVar.fQ(apoyVar2, apoyVar2.h());
            aoerVar.d = false;
            i = aoerVar.i;
        }
        defpackage.aoer aoerVar2 = this.a;
        aoerVar2.f.fQ(apoyVar, apoyVar.b);
        synchronized (aoerVar2.a) {
            aoerVar2.i -= i;
        }
    }
}
