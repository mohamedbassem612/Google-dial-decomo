package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class absn implements java.util.concurrent.ThreadFactory {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    private final java.lang.Object b;

    public absn(java.lang.String str, int i) {
        this.$cid = i;
        this.b = new java.util.concurrent.atomic.AtomicInteger(1);
        this.a = str.concat("-thread-");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        if (this.$cid == 0) {
            return this.b.newThread(new defpackage.aawj(this, runnable, 7));
        }
        return new java.lang.Thread(runnable, ((java.lang.String) this.a) + ((java.util.concurrent.atomic.AtomicInteger) this.b).getAndIncrement());
    }

    public absn(java.util.concurrent.ThreadFactory threadFactory, absl abslVar, int i) {
        this.$cid = i;
        this.b = threadFactory;
        this.a = abslVar;
    }
}
