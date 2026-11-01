package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agsc extends defpackage.aosp implements defpackage.aota {
    private final defpackage.aosp a;
    private final defpackage.aota b;

    public agsc(defpackage.aosp aospVar, defpackage.aota aotaVar) {
        if (aospVar == null) {
            defpackage.aooh.i("coroutineDispatcher");
        }
        if (aotaVar == null) {
            defpackage.aooh.i("delayImpl");
        }
        this.a = aospVar;
        this.b = aotaVar;
    }

    @Override // defpackage.aosp
    public final void a(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        if (runnable == null) {
            defpackage.aooh.i("block");
        }
        defpackage.aosp aospVar = this.a;
        long j = defpackage.ahqx.a;
        if (defpackage.ahqx.o()) {
            runnable = defpackage.ahqx.g(runnable);
        }
        aospVar.a(aolrVar, runnable);
    }

    @Override // defpackage.aota
    public final defpackage.aotj c(long j, java.lang.Runnable runnable, defpackage.aolr aolrVar) {
        defpackage.aooh.f(aolrVar, "context");
        return this.b.c(j, runnable, aolrVar);
    }

    @Override // defpackage.aota
    public final void d(long j, defpackage.aosb aosbVar) {
        this.b.d(j, aosbVar);
    }
}
