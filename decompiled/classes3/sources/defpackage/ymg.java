package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ymg implements java.util.concurrent.Executor {
    public static final defpackage.ymg a = new defpackage.ymg();
    private final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.b.post(runnable);
    }
}
