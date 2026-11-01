package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abry {
    public final java.lang.Thread a;
    public int b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final java.util.concurrent.atomic.AtomicLong f;
    private final boolean g;

    public abry(java.lang.Thread thread, int i, boolean z, int i2, boolean z2, boolean z3) {
        if (thread == null) {
            defpackage.aooh.i("thread");
        }
        this.a = thread;
        this.b = i;
        this.c = z2;
        this.g = z3;
        this.d = !z2;
        this.f = new java.util.concurrent.atomic.AtomicLong(defpackage.abrz.b(z, false, false, i2, -21, -21, 0L));
    }

    private final void e(long j) {
        if (defpackage.abrx.c(j)) {
            boolean zInterrupted = false;
            while (true) {
                try {
                    java.util.concurrent.locks.LockSupport.park(this);
                    if (!defpackage.abrx.b(this.f.get())) {
                        break;
                    } else {
                        zInterrupted |= java.lang.Thread.interrupted();
                    }
                } catch (java.lang.Throwable th) {
                    if (zInterrupted) {
                        this.a.interrupt();
                    }
                    throw th;
                }
            }
            if (zInterrupted) {
                this.a.interrupt();
            }
        }
    }

    public final void a(int i) {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
            boolean zD = defpackage.abrx.d(j);
            int iA = defpackage.abrx.a(j, 2);
            int iA2 = defpackage.abrx.a(j, 1);
            int iA3 = defpackage.abrx.a(j, 0);
            boolean zC = defpackage.abrx.c(j);
            int iF = defpackage.abrx.f(zD, iA, iA2, iA3);
            if (!zC) {
                throw new java.lang.IllegalStateException("Unexpected not set, saw " + ("State{started=" + defpackage.abrx.d(j) + ", setting=" + defpackage.abrx.c(j) + ", pool=" + defpackage.abrx.a(j, 2) + ", local=" + defpackage.abrx.a(j, 1) + ", inherited=" + defpackage.abrx.a(j, 0) + '}') + ' ' + java.lang.Long.toBinaryString(j));
            }
            if (!defpackage.abrx.d(j)) {
                int iA4 = defpackage.abro.a(iF);
                if (iA4 != defpackage.abro.a(i)) {
                    this.a.setPriority(iA4);
                }
            } else if (iF != i) {
                android.os.Process.setThreadPriority(this.b, iF);
                i = iF;
            }
        } while (!atomicLong.compareAndSet(j, defpackage.abrx.e(j, false, false, false, 0, 0, 0L, 121)));
        if (defpackage.abrx.b(j)) {
            java.util.concurrent.locks.LockSupport.unpark(this.a);
        }
    }

    public final void b() {
        long j;
        boolean z;
        while (true) {
            java.util.concurrent.atomic.AtomicLong atomicLong = this.f;
            j = atomicLong.get();
            boolean zC = defpackage.abrx.c(j);
            z = this.g;
            long jE = defpackage.abrx.e(j, false, false, zC & (!z), 0, -21, (8796093022207L & j) + 1, 27);
            if (!defpackage.abrx.c(j)) {
                if (defpackage.abrx.f(defpackage.abrx.d(j), defpackage.abrx.a(j, 2), defpackage.abrx.a(j, 1), defpackage.abrx.a(j, 0)) == defpackage.abrx.f(defpackage.abrx.d(jE), defpackage.abrx.a(jE, 2), defpackage.abrx.a(jE, 1), defpackage.abrx.a(jE, 0))) {
                    if (atomicLong.compareAndSet(j, jE)) {
                        break;
                    }
                } else if (atomicLong.compareAndSet(j, defpackage.abrx.e(jE, false, true, false, 0, 0, 0L, 125))) {
                    a(defpackage.abrx.f(defpackage.abrx.d(j), defpackage.abrx.a(j, 2), defpackage.abrx.a(j, 1), defpackage.abrx.a(j, 0)));
                    break;
                }
            } else if (atomicLong.compareAndSet(j, jE)) {
                break;
            }
        }
        if (z) {
            return;
        }
        e(j);
    }

    public final void c() {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, defpackage.abrx.e(j, false, false, defpackage.abrx.c(j), 0, 0, 0L, 122)));
        e(j);
    }

    public final void d() {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
            if (!defpackage.abrx.b(j)) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, defpackage.abrx.e(j, false, false, false, 0, 0, 0L, 123)));
    }

    public final java.lang.String toString() {
        return this.a.getName() + ' ' + this.b;
    }
}
