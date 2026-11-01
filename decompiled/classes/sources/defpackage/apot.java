package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apot extends java.lang.Thread {
    public apot() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                java.util.concurrent.locks.ReentrantLock reentrantLock = defpackage.apow.d;
                reentrantLock.lock();
                try {
                    defpackage.appu appuVar = defpackage.apow.b;
                    defpackage.apow apowVarA = appuVar.a();
                    if (apowVarA == null) {
                        long jNanoTime = java.lang.System.nanoTime();
                        defpackage.apow.e.await(defpackage.apow.f, java.util.concurrent.TimeUnit.MILLISECONDS);
                        apowVarA = (appuVar.a() != null || java.lang.System.nanoTime() - jNanoTime < defpackage.apow.g) ? null : defpackage.apow.c;
                    } else {
                        long jNanoTime2 = apowVarA.j - java.lang.System.nanoTime();
                        if (jNanoTime2 > 0) {
                            defpackage.apow.e.await(jNanoTime2, java.util.concurrent.TimeUnit.NANOSECONDS);
                        } else {
                            appuVar.c(apowVarA);
                            apowVarA.h = 2;
                        }
                    }
                    if (apowVarA == defpackage.apow.c) {
                        defpackage.apow.c = null;
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (apowVarA != null) {
                            apowVarA.a();
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
