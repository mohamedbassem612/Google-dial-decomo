package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum ajuv implements java.util.concurrent.Executor {
    INSTANCE;

    private static final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        b.post(runnable);
    }
}
