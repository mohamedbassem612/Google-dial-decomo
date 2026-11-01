package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agvx extends aosp implements aota {
    private final aosp a;
    private final amwu b;

    public agvx(aosp aospVar, aosp aospVar2, amwu amwuVar) {
        aooh.f(aospVar, "defaultDispatcher");
        this.a = aospVar2;
        this.b = amwuVar;
    }

    public final void a(aolr aolrVar, java.lang.Runnable runnable) {
        aooh.f(aolrVar, "context");
        aooh.f(runnable, "block");
        java.lang.Boolean.TRUE.booleanValue();
        this.a.a(aolrVar, runnable);
    }

    public final aotj c(long j, java.lang.Runnable runnable, aolr aolrVar) {
        aooh.f(aolrVar, "context");
        java.lang.Boolean.TRUE.booleanValue();
        return this.a.c(j, runnable, aolrVar);
    }

    public final void d(long j, aosb aosbVar) {
        java.lang.Boolean.TRUE.booleanValue();
        this.a.d(j, aosbVar);
    }

    public final boolean dB(aolr aolrVar) {
        aooh.f(aolrVar, "context");
        java.lang.Boolean.TRUE.booleanValue();
        return this.a.dB(aolrVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.agvx) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            defpackage.agvx agvxVar = (defpackage.agvx) obj;
            amwu amwuVar = agvxVar.b;
            if (aooh.n(bool, java.lang.Boolean.TRUE)) {
                java.lang.Boolean.TRUE.booleanValue();
                if (aooh.n(this.a, agvxVar.a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Boolean.TRUE.booleanValue();
        return this.a.hashCode();
    }
}
