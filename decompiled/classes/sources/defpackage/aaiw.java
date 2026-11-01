package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aaiw implements java.lang.Runnable {
    private final java.lang.Runnable a;

    public aaiw(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(0);
        this.a.run();
    }
}
