package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class dxq implements java.util.concurrent.Executor {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public dxq(int i) {
        this.$cid = i;
        this.a = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        int i = this.$cid;
        if (i == 0) {
            dzk.x(runnable);
            java.lang.Object obj = this.a;
            if (((android.os.Handler) obj).post(runnable)) {
                return;
            }
            java.util.Objects.toString(obj);
            throw new java.util.concurrent.RejectedExecutionException(obj.toString().concat(" is shutting down"));
        }
        if (i == 1) {
            ((android.os.Handler) this.a).post(runnable);
            return;
        }
        defpackage.apwo apwoVar = new defpackage.apwo(runnable, java.lang.Thread.currentThread());
        this.a.execute(apwoVar);
        org.chromium.net.InlineExecutionProhibitedException inlineExecutionProhibitedException = apwoVar.b;
        if (inlineExecutionProhibitedException != null) {
            throw inlineExecutionProhibitedException;
        }
        apwoVar.a = null;
    }

    public dxq(java.util.concurrent.Executor executor, int i) {
        this.$cid = i;
        this.a = executor;
    }

    public dxq(android.os.Handler handler, int i) {
        this.$cid = i;
        dzk.x(handler);
        this.a = handler;
    }
}
