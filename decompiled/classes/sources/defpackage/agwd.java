package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agwd extends defpackage.aosp implements defpackage.aota {
    private final /* synthetic */ defpackage.aota a;
    private final defpackage.aosp b;

    public agwd(defpackage.ajcu ajcuVar) {
        if (ajcuVar == null) {
            defpackage.aooh.i("schedulerExecutorService");
        }
        this.a = new defpackage.aotu(ajcuVar);
        this.b = defpackage.aoth.b;
    }

    @Override // defpackage.aosp
    public final void a(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        defpackage.aooh.f(aolrVar, "context");
        defpackage.aooh.f(runnable, "block");
        long j = defpackage.ahqx.a;
        if (defpackage.ahqx.o()) {
            runnable = defpackage.ahqx.g(runnable);
        }
        this.b.a(aolrVar, runnable);
    }

    @Override // defpackage.aota
    public final defpackage.aotj c(long j, java.lang.Runnable runnable, defpackage.aolr aolrVar) {
        defpackage.aooh.f(aolrVar, "context");
        return this.a.c(j, runnable, aolrVar);
    }

    @Override // defpackage.aota
    public final void d(long j, defpackage.aosb aosbVar) {
        this.a.d(j, aosbVar);
    }

    @Override // defpackage.aosp
    public final boolean dB(defpackage.aolr aolrVar) {
        defpackage.aooh.f(aolrVar, "context");
        return false;
    }

    @Override // defpackage.aosp
    public final defpackage.aosp e(int i) {
        return this.b.e(1);
    }

    @Override // defpackage.aosp
    public final java.lang.String toString() {
        return "Dispatchers.Unconfined";
    }
}
