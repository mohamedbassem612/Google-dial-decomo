package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abrh implements java.util.concurrent.ThreadFactory {
    public final java.util.HashSet a = new java.util.HashSet();
    private final java.util.concurrent.ThreadFactory b;

    public abrh(java.util.concurrent.ThreadFactory threadFactory) {
        this.b = threadFactory;
    }

    public final java.util.ArrayList a() {
        java.util.ArrayList arrayList;
        java.util.HashSet hashSet = this.a;
        synchronized (hashSet) {
            arrayList = new java.util.ArrayList(hashSet);
        }
        return arrayList;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = this.b.newThread(new defpackage.aawj(this, runnable, 5));
        if (threadNewThread != null) {
            java.util.HashSet hashSet = this.a;
            synchronized (hashSet) {
                hashSet.add(threadNewThread);
            }
        }
        return threadNewThread;
    }
}
