package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agup implements defpackage.afam {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public agup(defpackage.aoin aoinVar, int i) {
        this.$cid = i;
        this.a = aoinVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.afam
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.haa.a = this.a;
            return;
        }
        if (i != 1) {
            defpackage.hcq.a = defpackage.aooc.ac(this.a);
            return;
        }
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(934, "ThemeStartupListener_onApplicationStartup", defpackage.ahot.a, true);
        try {
            ((defpackage.urg) this.a.a()).i();
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public agup(java.util.concurrent.Executor executor, int i) {
        this.$cid = i;
        this.a = executor;
    }
}
