package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ajde implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ java.util.concurrent.ThreadFactory a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong c;
    public final /* synthetic */ java.lang.Boolean d;
    public final /* synthetic */ java.lang.Integer e;

    public /* synthetic */ ajde(java.util.concurrent.ThreadFactory threadFactory, java.lang.String str, java.util.concurrent.atomic.AtomicLong atomicLong, java.lang.Boolean bool, java.lang.Integer num) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
        this.e = num;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = this.a.newThread(runnable);
        if (threadNewThread == null) {
            return null;
        }
        java.lang.String str = this.b;
        if (str != null) {
            threadNewThread.setName(java.lang.String.format(java.util.Locale.ROOT, str, java.lang.Long.valueOf(((java.util.concurrent.atomic.AtomicLong) j$.util.Objects.requireNonNull(this.c)).getAndIncrement())));
        }
        java.lang.Boolean bool = this.d;
        if (bool != null) {
            threadNewThread.setDaemon(bool.booleanValue());
        }
        java.lang.Integer num = this.e;
        if (num == null) {
            return threadNewThread;
        }
        num.intValue();
        threadNewThread.setPriority(5);
        return threadNewThread;
    }
}
