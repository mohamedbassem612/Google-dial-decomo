package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agwb extends defpackage.aosp implements defpackage.aota {
    private final /* synthetic */ defpackage.aota a;
    private final defpackage.aosp b;

    /* JADX WARN: Multi-variable type inference failed */
    public agwb(defpackage.aosp aospVar) {
        if (aospVar == 0) {
            defpackage.aooh.i("mainDispatcher");
        }
        this.a = (defpackage.aota) aospVar;
        this.b = aospVar;
    }

    @Override // defpackage.aosp
    public final void a(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        if (runnable == null) {
            defpackage.aooh.i("block");
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
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        return !defpackage.afec.h(java.lang.Thread.currentThread());
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.agwb) && defpackage.aooh.n(((defpackage.agwb) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
