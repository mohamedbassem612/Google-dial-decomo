package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aauo implements java.util.concurrent.Executor {
    private final /* synthetic */ int $cid;
    private final android.os.Handler a;

    public aauo(int i) {
        this.$cid = i;
        this.a = new defpackage.aanh(android.os.Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        int i = this.$cid;
        android.os.Handler handler = this.a;
        if (i != 0) {
            handler.post(runnable);
        } else {
            handler.post(runnable);
        }
    }

    public aauo(android.os.Looper looper, int i) {
        this.$cid = i;
        this.a = new defpackage.aanh(looper);
    }
}
