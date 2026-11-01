package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class apow extends defpackage.apqf {
    public static final defpackage.appu b = new defpackage.appu();
    public static defpackage.apow c;
    public static final java.util.concurrent.locks.ReentrantLock d;
    public static final java.util.concurrent.locks.Condition e;
    public static final long f;
    public static final long g;
    public int h;
    public int i = -1;
    public long j;

    static {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        d = reentrantLock;
        java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
        defpackage.aooh.e(conditionNewCondition, "newCondition(...)");
        e = conditionNewCondition;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        f = 60000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        g = 60000000000L;
    }

    public java.io.IOException c(java.io.IOException iOException) {
        throw null;
    }

    public final void d() {
        long jN = n();
        boolean zH = h();
        if (jN != 0 || zH) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = d;
            reentrantLock.lock();
            try {
                if (this.h != 0) {
                    throw new java.lang.IllegalStateException("Unbalanced enter/exit");
                }
                this.h = 1;
                if (c == null) {
                    c = new defpackage.apow();
                    new defpackage.apot().start();
                }
                long jNanoTime = java.lang.System.nanoTime();
                long jN2 = n();
                boolean zH2 = h();
                if (n() != 0 && h()) {
                    this.j = jNanoTime + java.lang.Math.min(jN2, j() - jNanoTime);
                } else if (jN2 != 0) {
                    this.j = jNanoTime + jN2;
                } else {
                    if (!zH2) {
                        throw new java.lang.AssertionError();
                    }
                    this.j = j();
                }
                defpackage.appu appuVar = b;
                int i = appuVar.a + 1;
                appuVar.a = i;
                java.lang.Object obj = appuVar.b;
                if (i == ((defpackage.apow[]) obj).length) {
                    defpackage.apow[] apowVarArr = new defpackage.apow[i << 1];
                    defpackage.ajsz.dl((java.lang.Object[]) obj, apowVarArr, 0, 0, 14);
                    appuVar.b = apowVarArr;
                }
                appuVar.b(i, this);
                if (this.i == 1) {
                    e.signal();
                }
                reentrantLock.unlock();
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean e() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            int i = this.h;
            boolean z = false;
            this.h = 0;
            if (i == 1) {
                b.c(this);
            } else if (i == 2) {
                z = true;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected void a() {
    }
}
