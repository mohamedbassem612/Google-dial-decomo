package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xym implements java.util.concurrent.ThreadFactory {
    public final boolean a;
    private final java.util.concurrent.ThreadFactory b;
    private final java.lang.String c;
    private final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger();

    public xym(java.util.concurrent.ThreadFactory threadFactory, java.lang.String str, boolean z) {
        this.b = threadFactory;
        this.c = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        defpackage.xyk xykVar = new defpackage.xyk((defpackage.xyl) this.b, new defpackage.wdm(this, runnable, 7));
        xykVar.setName("glide-" + this.c + "-thread-" + this.d.getAndIncrement());
        return xykVar;
    }
}
