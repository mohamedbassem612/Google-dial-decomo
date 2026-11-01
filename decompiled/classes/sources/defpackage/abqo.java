package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class abqo implements java.util.concurrent.ThreadFactory {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.util.concurrent.ThreadFactory a;

    public /* synthetic */ abqo(java.util.concurrent.ThreadFactory threadFactory, int i) {
        this.$cid = i;
        this.a = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        if (this.$cid != 0) {
            return this.a.newThread(new defpackage.abqg(runnable, 1));
        }
        java.lang.Thread threadNewThread = this.a.newThread(runnable);
        if (threadNewThread.getContextClassLoader() != null) {
            return threadNewThread;
        }
        threadNewThread.setContextClassLoader(android.os.Looper.getMainLooper().getThread().getContextClassLoader());
        return threadNewThread;
    }
}
