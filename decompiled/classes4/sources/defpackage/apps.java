package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apps implements apqd {
    final /* synthetic */ defpackage.appt a;
    private final apqf b = new apqf();

    public apps(defpackage.appt apptVar) {
        this.a = apptVar;
    }

    public final long b(apoy apoyVar, long j) {
        long jB;
        defpackage.appt apptVar = this.a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = apptVar.d;
        reentrantLock.lock();
        try {
            if (apptVar.c) {
                throw new java.lang.IllegalStateException("closed");
            }
            while (true) {
                apoy apoyVar2 = apptVar.a;
                if (apoyVar2.b != 0) {
                    jB = apoyVar2.b(apoyVar, 8192L);
                    apptVar.e.signalAll();
                    break;
                }
                if (apptVar.b) {
                    jB = -1;
                    break;
                }
                this.b.i(apptVar.e);
            }
            reentrantLock.unlock();
            return jB;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void close() {
        defpackage.appt apptVar = this.a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = apptVar.d;
        reentrantLock.lock();
        try {
            apptVar.c = true;
            apptVar.e.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final apqf fP() {
        return this.b;
    }
}
