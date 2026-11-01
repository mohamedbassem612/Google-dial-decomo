package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apdw implements java.util.concurrent.Executor {
    public static final defpackage.apdw a = new defpackage.apdw(0);
    private final /* synthetic */ int $cid;

    public apdw(int i) {
        this.$cid = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (this.$cid != 0) {
            runnable.run();
        } else {
            runnable.run();
        }
    }
}
