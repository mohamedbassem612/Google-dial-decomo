package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class appr implements apqb {
    final /* synthetic */ defpackage.appt a;
    private final apqf b = new apqf();

    public appr(defpackage.appt apptVar) {
        this.a = apptVar;
    }

    public final void close() {
        defpackage.appt apptVar = this.a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = apptVar.d;
        reentrantLock.lock();
        try {
            if (!apptVar.b) {
                if (apptVar.c && apptVar.a.b > 0) {
                    throw new java.io.IOException("source is closed");
                }
                apptVar.b = true;
                apptVar.e.signalAll();
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final apqf fP() {
        return this.b;
    }

    public final void fQ(apoy apoyVar, long j) {
        defpackage.appt apptVar = this.a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = apptVar.d;
        reentrantLock.lock();
        try {
            if (apptVar.b) {
                throw new java.lang.IllegalStateException("closed");
            }
            while (j > 0) {
                if (apptVar.c) {
                    throw new java.io.IOException("source is closed");
                }
                apoy apoyVar2 = apptVar.a;
                long j2 = 8192 - apoyVar2.b;
                if (j2 == 0) {
                    this.b.i(apptVar.e);
                } else {
                    long jMin = java.lang.Math.min(j2, j);
                    apoyVar2.fQ(apoyVar, jMin);
                    j -= jMin;
                    apptVar.e.signalAll();
                }
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        defpackage.appt apptVar = this.a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = apptVar.d;
        reentrantLock.lock();
        try {
            if (apptVar.b) {
                throw new java.lang.IllegalStateException("closed");
            }
            if (apptVar.c && apptVar.a.b > 0) {
                throw new java.io.IOException("source is closed");
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
