package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afjl implements java.util.concurrent.ThreadFactory {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public afjl(int i) {
        this.$cid = i;
        this.a = new java.util.concurrent.atomic.AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        if (this.$cid != 0) {
            return this.a.newThread(new defpackage.absj(runnable, 0));
        }
        return new java.lang.Thread(runnable, "Survey #" + ((java.util.concurrent.atomic.AtomicInteger) this.a).getAndIncrement());
    }

    public afjl(java.util.concurrent.ThreadFactory threadFactory, int i) {
        this.$cid = i;
        this.a = threadFactory;
    }
}
