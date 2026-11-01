package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class agqe implements java.util.concurrent.Executor {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.util.concurrent.Executor a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ agqe(java.lang.Object obj, java.util.concurrent.Executor executor, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = executor;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ajcq, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                this.b.c(runnable, this.a);
                return;
            } else {
                ((defpackage.aogc) this.b).b.execute(new defpackage.abqu(this.a, runnable, 10, null));
                return;
            }
        }
        java.util.concurrent.Executor executor = this.a;
        if (executor == null) {
            defpackage.aooh.i("executor");
        }
        if (runnable == null) {
            defpackage.aooh.i("task");
        }
        java.lang.Object obj = this.b;
        defpackage.nya nyaVar = new defpackage.nya(runnable, 3);
        defpackage.aajr aajrVar = new defpackage.aajr(obj, 2);
        defpackage.ajdk ajdkVar = new defpackage.ajdk(nyaVar);
        aajrVar.execute(ajdkVar);
        executor.execute(new defpackage.abqu(obj, ajdkVar, 2));
    }
}
