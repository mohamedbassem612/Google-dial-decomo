package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abrg implements java.util.concurrent.ThreadFactory {
    private final defpackage.abrh a;
    private final abrj b;
    private final abrn c;
    private final java.util.concurrent.atomic.AtomicInteger d;

    public abrg(abrj abrjVar, abrn abrnVar, java.util.concurrent.ThreadFactory threadFactory) {
        this.b = abrjVar;
        this.c = abrnVar;
        this.a = new defpackage.abrh(threadFactory);
        abrnVar.e();
        this.d = new java.util.concurrent.atomic.AtomicInteger(1000);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        int size;
        defpackage.abrh abrhVar = this.a;
        java.lang.Thread threadNewThread = abrhVar.newThread(runnable);
        this.c.d();
        if (abri.b()) {
            java.util.HashSet hashSet = abrhVar.a;
            synchronized (hashSet) {
                size = hashSet.size();
            }
            abrn abrnVar = this.c;
            abrnVar.e();
            if (size >= 1000) {
                while (true) {
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = this.d;
                    int i = atomicInteger.get();
                    if (size < i) {
                        break;
                    }
                    if (atomicInteger.compareAndSet(i, i << 1)) {
                        abrnVar.e();
                        abri.a(this.b, this.a.a(), new defpackage.abrm(a.bs(size, "Number of blocking threads ", " exceeds starvation threshold of 1000")));
                    }
                }
            }
        }
        return threadNewThread;
    }
}
