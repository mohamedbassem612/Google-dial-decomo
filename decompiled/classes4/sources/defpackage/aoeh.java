package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class aoeh implements defpackage.anqm {
    public final /* synthetic */ aolr a;
    public final /* synthetic */ aonj b;

    public /* synthetic */ aoeh(aolr aolrVar, aonj aonjVar) {
        this.a = aolrVar;
        this.b = aonjVar;
    }

    @Override // defpackage.anqm
    public final defpackage.antw a(defpackage.anql anqlVar, anph anphVar) {
        java.lang.Object objA = defpackage.aoec.a.a();
        aooh.e(objA, "get(...)");
        aolr aolrVarPlus = this.a.plus((aolr) objA);
        defpackage.anmv anmvVarK = defpackage.anmv.k();
        aooh.e(anmvVarK, "current(...)");
        aolr aolrVarPlus2 = aolrVarPlus.plus(new defpackage.aoed(anmvVarK));
        defpackage.apjb apjbVar = new defpackage.apjb(new defpackage.ahca(anqlVar, 8));
        aowi aowiVarH = aooh.H(1, 0, (aonj) null, 6);
        return new defpackage.aoei(aoov.an(aosv.n(aolrVarPlus2), (aolr) null, 0, new defpackage.aoem(this.b, new aowy(new defpackage.aoej(new java.util.concurrent.atomic.AtomicBoolean(false), anqlVar, aowiVarH, null)), apjbVar, anqlVar, null), 3), aowiVarH, anqlVar, apjbVar);
    }
}
