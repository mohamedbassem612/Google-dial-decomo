package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fbk implements java.util.concurrent.Executor {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ fbk(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [etk, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        int i = this.$cid;
        if (i == 0) {
            ((android.os.Handler) this.a).post(runnable);
            return;
        }
        if (i == 1) {
            this.a.d(runnable);
            return;
        }
        if (i == 2) {
            ((android.os.Handler) this.a).post(runnable);
            return;
        }
        if (i == 3) {
            ((android.os.Handler) this.a).post(runnable);
            return;
        }
        java.lang.Object obj = this.a;
        if (i != 4) {
            ((android.os.Handler) obj).post(runnable);
        } else {
            ((android.os.Handler) obj).post(runnable);
        }
    }
}
