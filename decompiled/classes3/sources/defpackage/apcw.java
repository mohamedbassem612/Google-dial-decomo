package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class apcw extends apbl {
    public static final defpackage.apcw a = new defpackage.apcw();
    private static final java.util.concurrent.locks.ReentrantReadWriteLock b = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private static final java.util.WeakHashMap c = new java.util.WeakHashMap();

    public final aonj a(java.lang.Class cls) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = b;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            aonj aonjVar = (aonj) c.get(cls);
            lock.unlock();
            if (aonjVar != null) {
                return aonjVar;
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                java.util.WeakHashMap weakHashMap = c;
                aonj aonjVarB = (aonj) weakHashMap.get(cls);
                if (aonjVarB != null) {
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                } else {
                    aonjVarB = apbv.b(cls);
                    weakHashMap.put(cls, aonjVarB);
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
                return aonjVarB;
            } catch (java.lang.Throwable th) {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
