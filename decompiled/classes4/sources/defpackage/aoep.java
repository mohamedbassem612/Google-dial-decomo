package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoep extends defpackage.aoeq {
    final /* synthetic */ defpackage.aoer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoep(defpackage.aoer aoerVar) {
        super(aoerVar);
        j$.util.Objects.requireNonNull(aoerVar);
        this.a = aoerVar;
        int i = defpackage.aoik.a;
    }

    @Override // defpackage.aoeq
    public final void a() {
        apoy apoyVar = new apoy();
        int i = defpackage.aoik.a;
        defpackage.aoer aoerVar = this.a;
        synchronized (aoerVar.a) {
            apoy apoyVar2 = aoerVar.b;
            apoyVar.fQ(apoyVar2, apoyVar2.b);
            aoerVar.e = false;
        }
        defpackage.aoer aoerVar2 = this.a;
        aoerVar2.f.fQ(apoyVar, apoyVar.b);
        aoerVar2.f.flush();
    }
}
