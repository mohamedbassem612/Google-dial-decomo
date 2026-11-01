package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaiv implements java.util.concurrent.ThreadFactory {
    private final java.lang.String a;
    private final java.util.concurrent.ThreadFactory b = java.util.concurrent.Executors.defaultThreadFactory();

    public aaiv(java.lang.String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = this.b.newThread(new defpackage.aaiw(runnable));
        threadNewThread.setName(this.a);
        return threadNewThread;
    }
}
