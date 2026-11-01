package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class apqf {
    public static final defpackage.apqf k = new defpackage.apqe();
    private boolean a;
    private long b;
    private long c;
    private volatile java.lang.Object d;

    public defpackage.apqf f(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (timeUnit == null) {
            defpackage.aooh.i("unit");
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bz(j, "timeout < 0: "));
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }

    public void g() throws java.io.InterruptedIOException {
        if (java.lang.Thread.currentThread().isInterrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        if (this.a && this.b - java.lang.System.nanoTime() <= 0) {
            throw new java.io.InterruptedIOException("deadline reached");
        }
    }

    public boolean h() {
        return this.a;
    }

    public final void i(java.util.concurrent.locks.Condition condition) throws java.io.InterruptedIOException {
        defpackage.aooh.f(condition, "condition");
        try {
            boolean zH = h();
            long jN = n();
            if (zH) {
                jN = jN != 0 ? java.lang.Math.min(jN, j() - java.lang.System.nanoTime()) : j() - java.lang.System.nanoTime();
            } else if (jN == 0) {
                condition.await();
                return;
            }
            if (jN <= 0) {
                throw new java.io.InterruptedIOException("timeout");
            }
            java.lang.Object obj = this.d;
            if (condition.awaitNanos(jN) > 0) {
                return;
            }
            java.lang.Object obj2 = this.d;
            throw new java.io.InterruptedIOException("timeout");
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException("interrupted");
        }
    }

    public long j() {
        if (this.a) {
            return this.b;
        }
        throw new java.lang.IllegalStateException("No deadline");
    }

    public defpackage.apqf k() {
        this.a = false;
        return this;
    }

    public defpackage.apqf l() {
        this.c = 0L;
        return this;
    }

    public defpackage.apqf m(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public long n() {
        return this.c;
    }
}
