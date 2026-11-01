package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abbw implements defpackage.abbo {
    private defpackage.abbo a;
    private final defpackage.abbp b;
    private final java.util.concurrent.locks.ReentrantReadWriteLock c;
    private boolean d;

    public abbw(defpackage.abbo abboVar, defpackage.abbp abbpVar) {
        aooh.f(abboVar, "delegate");
        aooh.f(abbpVar, "backend");
        this.a = abboVar;
        this.b = abbpVar;
        this.c = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    @Override // defpackage.abbo
    public final defpackage.abbb a(defpackage.abba abbaVar, aolr aolrVar) {
        aooh.f(abbaVar, "request");
        aooh.f(aolrVar, "coroutineContext");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock lock = this.c.readLock();
        lock.lock();
        try {
            if (this.d) {
                throw new java.lang.IllegalStateException("Classifier already closed");
            }
            defpackage.abbb abbbVarA = this.a.a(abbaVar, aolrVar);
            lock.unlock();
            return abbbVarA;
        } catch (java.lang.Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0 A[LOOP:1: B:40:0x009e->B:41:0x00a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.abbm abbmVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.abbv abbvVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i;
        if (aolnVar instanceof defpackage.abbv) {
            abbvVar = (defpackage.abbv) aolnVar;
            int i2 = abbvVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                abbvVar.f = i2 - Integer.MIN_VALUE;
            } else {
                abbvVar = new defpackage.abbv(this, aolnVar);
            }
        } else {
            abbvVar = new defpackage.abbv(this, aolnVar);
        }
        java.lang.Object obj3 = abbvVar.d;
        aolu aoluVar = aolu.a;
        int i3 = abbvVar.f;
        int i4 = 0;
        if (i3 == 0) {
            aooc.af(obj3);
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = this.c;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i5 = 0; i5 < readHoldCount; i5++) {
                lock.unlock();
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                if (this.d) {
                    throw new java.lang.IllegalStateException("Classifier already closed");
                }
                defpackage.abbp abbpVar = this.b;
                abbvVar.a = lock;
                abbvVar.b = writeLock;
                abbvVar.c = readHoldCount;
                abbvVar.f = 1;
                java.lang.Object objA = abbpVar.a(abbmVar, abbvVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                obj = writeLock;
                obj2 = lock;
                obj3 = objA;
                i = readHoldCount;
            } catch (java.lang.Throwable th) {
                th = th;
                obj = writeLock;
                obj2 = lock;
                i = readHoldCount;
                while (i4 < i) {
                    ((java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock) obj2).lock();
                    i4++;
                }
                ((java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) obj).unlock();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = abbvVar.c;
            obj = abbvVar.b;
            obj2 = abbvVar.a;
            try {
                aooc.af(obj3);
            } catch (java.lang.Throwable th2) {
                th = th2;
                while (i4 < i) {
                    ((java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock) obj2).lock();
                    i4++;
                }
                ((java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) obj).unlock();
                throw th;
            }
        }
        afsq.cP(this.a);
        this.a = (defpackage.abbo) obj3;
        while (i4 < i) {
            ((java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock) obj2).lock();
            i4++;
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) obj).unlock();
        return aojh.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = this.c;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            afsq.cP(this.a);
            this.d = true;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }
}
