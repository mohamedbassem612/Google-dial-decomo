package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adju {
    public final defpackage.adhw a;
    public final java.io.File b;
    private final com.google.android.libraries.micore.superpacks.base.BasePriority c;
    private final defpackage.adhk d;
    private final defpackage.adjc e;
    private final defpackage.adjd f;
    private long g = -1;
    private defpackage.adjc h;

    /* JADX WARN: Type inference failed for: r0v7, types: [adjd, java.lang.Object] */
    public adju(defpackage.ajje ajjeVar) {
        this.a = (defpackage.adhw) ajjeVar.e;
        this.b = (java.io.File) ajjeVar.d;
        this.e = (defpackage.adjc) ajjeVar.c;
        this.f = ajjeVar.f;
        this.c = (com.google.android.libraries.micore.superpacks.base.BasePriority) ajjeVar.a;
        java.lang.Object obj = ajjeVar.b;
        this.d = (defpackage.adhk) (obj == null ? defpackage.adhk.a : obj);
    }

    public final int a() {
        return this.c.c(c().a());
    }

    public final long b() {
        long j = this.g;
        if (j >= 0) {
            return j;
        }
        long jA = this.d.a(this.b);
        this.g = jA;
        return jA;
    }

    public final defpackage.adjc c() {
        defpackage.adjc adjcVarA = this.h;
        if (adjcVarA == null) {
            adjcVarA = this.e;
            if (adjcVarA == null) {
                defpackage.adjd adjdVar = this.f;
                adjdVar.getClass();
                adjcVarA = adjdVar.a(this.a);
            }
            adjcVarA.getClass();
            this.h = adjcVarA;
        }
        return adjcVarA;
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
