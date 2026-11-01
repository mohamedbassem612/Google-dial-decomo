package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yft implements java.util.concurrent.Executor {
    private final /* synthetic */ int $cid;

    public yft(int i) {
        this.$cid = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (this.$cid != 0) {
            defpackage.ygc.h(runnable);
        } else {
            runnable.run();
        }
    }
}
