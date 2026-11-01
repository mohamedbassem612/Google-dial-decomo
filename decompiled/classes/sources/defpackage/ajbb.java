package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajbb extends java.util.IdentityHashMap implements java.lang.AutoCloseable {
    public final defpackage.ajyk a = new defpackage.ajyk(this, (byte[]) null);
    private volatile boolean b;
    private volatile java.util.concurrent.CountDownLatch c;

    final defpackage.ajcq a(defpackage.ajbc ajbcVar, java.lang.Object obj) {
        defpackage.ajbb ajbbVar = new defpackage.ajbb();
        try {
            java.lang.Object objA = ajbcVar.a(ajbbVar.a, obj);
            return objA == null ? defpackage.ajcm.a : new defpackage.ajcm(objA);
        } finally {
            b(ajbbVar, defpackage.ajbm.INSTANCE);
        }
    }

    public final void b(java.lang.AutoCloseable autoCloseable, java.util.concurrent.Executor executor) {
        synchronized (this) {
            if (this.b) {
                defpackage.ajbg.g(autoCloseable, executor);
            } else {
                put(autoCloseable, executor);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                this.b = true;
                for (java.util.Map.Entry entry : entrySet()) {
                    defpackage.ajbg.g((java.lang.AutoCloseable) entry.getKey(), (java.util.concurrent.Executor) entry.getValue());
                }
                clear();
                java.util.concurrent.CountDownLatch countDownLatch = this.c;
            }
        }
    }
}
