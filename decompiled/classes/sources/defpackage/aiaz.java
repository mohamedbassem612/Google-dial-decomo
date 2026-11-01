package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiaz extends java.util.concurrent.locks.ReentrantLock {
    public final defpackage.aibt a;
    public volatile int b;
    long c;
    public int d;
    public int e;
    public volatile java.util.concurrent.atomic.AtomicReferenceArray f;
    final long g;
    final java.lang.ref.ReferenceQueue h;
    final java.lang.ref.ReferenceQueue i;
    final java.util.Queue j;
    final java.util.concurrent.atomic.AtomicInteger k = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.Queue l;
    public final java.util.Queue m;
    public final defpackage.ahvr n;

    public aiaz(defpackage.aibt aibtVar, int i, long j, defpackage.ahvr ahvrVar) {
        this.a = aibtVar;
        this.g = j;
        ahvrVar.getClass();
        this.n = ahvrVar;
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = new java.util.concurrent.atomic.AtomicReferenceArray(i);
        this.e = (atomicReferenceArray.length() * 3) / 4;
        if (!aibtVar.g()) {
            int i2 = this.e;
            if (i2 == j) {
                this.e = i2 + 1;
            }
        }
        this.f = atomicReferenceArray;
        this.h = aibtVar.n() ? new java.lang.ref.ReferenceQueue() : null;
        this.i = aibtVar.o() ? new java.lang.ref.ReferenceQueue() : null;
        this.j = aibtVar.m() ? new j$.util.concurrent.ConcurrentLinkedQueue() : defpackage.aibt.c;
        this.l = aibtVar.j() ? new defpackage.aibr() : defpackage.aibt.c;
        this.m = aibtVar.m() ? new defpackage.aiai() : defpackage.aibt.c;
    }

    final defpackage.aibu a(defpackage.aibu aibuVar, defpackage.aibu aibuVar2) {
        defpackage.aibi aibiVarD;
        java.lang.Object obj;
        java.lang.Object objJ = aibuVar.j();
        if (objJ == null || ((obj = (aibiVarD = aibuVar.d()).get()) == null && aibiVarD.f())) {
            return null;
        }
        defpackage.aibu aibuVarA = this.a.r.a(this, aibuVar, aibuVar2, objJ);
        aibuVarA.p(aibiVarD.b(this.i, obj, aibuVarA));
        return aibuVarA;
    }

    public final defpackage.aibu b(java.lang.Object obj, int i) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f;
        for (defpackage.aibu aibuVarE = (defpackage.aibu) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); aibuVarE != null; aibuVarE = aibuVarE.e()) {
            if (aibuVarE.a() == i) {
                java.lang.Object objJ = aibuVarE.j();
                if (objJ == null) {
                    u();
                } else if (this.a.h.d(obj, objJ)) {
                    return aibuVarE;
                }
            }
        }
        return null;
    }

    final defpackage.aibu c(java.lang.Object obj, int i, long j) {
        defpackage.aibu aibuVarB = b(obj, i);
        if (aibuVarB != null) {
            if (!this.a.k(aibuVarB, j)) {
                return aibuVarB;
            }
            v(j);
        }
        return null;
    }

    public final defpackage.aibu d(java.lang.Object obj, int i, defpackage.aibu aibuVar) {
        defpackage.aiap aiapVar = this.a.r;
        obj.getClass();
        return aiapVar.b(this, obj, i, aibuVar);
    }

    public final defpackage.aibu e(defpackage.aibu aibuVar, defpackage.aibu aibuVar2) {
        int i = this.b;
        defpackage.aibu aibuVarE = aibuVar2.e();
        while (aibuVar != aibuVar2) {
            defpackage.aibu aibuVarA = a(aibuVar, aibuVarE);
            if (aibuVarA != null) {
                aibuVarE = aibuVarA;
            } else {
                r(aibuVar);
                i--;
            }
            aibuVar = aibuVar.e();
        }
        this.b = i;
        return aibuVarE;
    }

    public final java.lang.Object f(java.lang.Object obj, int i) {
        try {
            java.lang.Object obj2 = null;
            if (this.b != 0) {
                defpackage.aibt aibtVar = this.a;
                long jA = aibtVar.q.a();
                defpackage.aibu aibuVarC = c(obj, i, jA);
                if (aibuVarC != null) {
                    java.lang.Object obj3 = aibuVarC.d().get();
                    if (obj3 != null) {
                        q(aibuVarC, jA);
                        aibuVarC.j();
                        aprf aprfVar = aibtVar.w;
                        obj2 = obj3;
                    } else {
                        u();
                    }
                }
            }
            return obj2;
        } finally {
            o();
        }
    }

    public final java.lang.Object g(defpackage.aibu aibuVar, long j) {
        if (aibuVar.j() == null) {
            u();
            return null;
        }
        java.lang.Object obj = aibuVar.d().get();
        if (obj == null) {
            u();
            return null;
        }
        if (!this.a.k(aibuVar, j)) {
            return obj;
        }
        v(j);
        return null;
    }

    final java.lang.Object h(java.lang.Object obj, int i, java.lang.Object obj2, boolean z) {
        java.lang.Object obj3;
        int i2;
        lock();
        try {
            defpackage.aibt aibtVar = this.a;
            long jA = aibtVar.q.a();
            s(jA);
            if (this.b + 1 > this.e) {
                m();
            }
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i;
            defpackage.aibu aibuVar = (defpackage.aibu) atomicReferenceArray.get(length);
            defpackage.aibu aibuVarE = aibuVar;
            while (true) {
                obj3 = null;
                if (aibuVarE == null) {
                    this.d++;
                    defpackage.aibu aibuVarD = d(obj, i, aibuVar);
                    z(aibuVarD, obj2, jA);
                    atomicReferenceArray.set(length, aibuVarD);
                    this.b++;
                    l(aibuVarD);
                    break;
                }
                java.lang.Object objJ = aibuVarE.j();
                if (aibuVarE.a() == i && objJ != null && aibtVar.h.d(obj, objJ)) {
                    defpackage.aibi aibiVarD = aibuVarE.d();
                    java.lang.Object obj4 = aibiVarD.get();
                    if (obj4 != null) {
                        if (z) {
                            p(aibuVarE, jA);
                        } else {
                            this.d++;
                            x(obj, obj4, aibiVarD.a(), 2);
                            z(aibuVarE, obj2, jA);
                            l(aibuVarE);
                        }
                        obj3 = obj4;
                        break;
                    }
                    this.d++;
                    if (aibiVarD.f()) {
                        x(obj, null, aibiVarD.a(), 3);
                        z(aibuVarE, obj2, jA);
                        i2 = this.b;
                    } else {
                        z(aibuVarE, obj2, jA);
                        i2 = this.b + 1;
                    }
                    this.b = i2;
                    l(aibuVarE);
                    break;
                }
                aibuVarE = aibuVarE.e();
            }
            return obj3;
        } finally {
            unlock();
            t();
        }
    }

    public final java.lang.Object i(defpackage.aibu aibuVar, java.lang.Object obj, defpackage.aibi aibiVar) {
        if (!aibiVar.g()) {
            throw new java.lang.AssertionError();
        }
        defpackage.ahvr.cc(!java.lang.Thread.holdsLock(aibuVar), "Recursive load of: %s", obj);
        java.lang.Object objD = aibiVar.d();
        if (objD != null) {
            q(aibuVar, this.a.q.a());
            return objD;
        }
        throw new aiab("CacheLoader returned null for key " + java.lang.String.valueOf(obj) + '.');
    }

    final void j() {
        while (true) {
            defpackage.aibu aibuVar = (defpackage.aibu) this.j.poll();
            if (aibuVar == null) {
                return;
            }
            java.util.Queue queue = this.m;
            if (queue.contains(aibuVar)) {
                queue.add(aibuVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0106 A[EDGE_INSN: B:45:0x0106->B:46:0x0109 BREAK  A[LOOP:3: B:26:0x00ac->B:42:0x00fb]] */
    final void k() {
        defpackage.aibt aibtVar = this.a;
        int i = 0;
        if (aibtVar.n()) {
            int i2 = 0;
            do {
                java.lang.Object objPoll = this.h.poll();
                if (objPoll == null) {
                    break;
                }
                defpackage.aibu aibuVar = (defpackage.aibu) objPoll;
                int iA = aibuVar.a();
                defpackage.aiaz aiazVarB = aibtVar.b(iA);
                aiazVarB.lock();
                try {
                    java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = aiazVarB.f;
                    int length = iA & (atomicReferenceArray.length() - 1);
                    defpackage.aibu aibuVar2 = (defpackage.aibu) atomicReferenceArray.get(length);
                    for (defpackage.aibu aibuVarE = aibuVar2; aibuVarE != null; aibuVarE = aibuVarE.e()) {
                        if (aibuVarE == aibuVar) {
                            aiazVarB.d++;
                            atomicReferenceArray.set(length, aiazVarB.y(aibuVar2, aibuVarE, aibuVarE.j(), aibuVarE.d().get(), aibuVarE.d(), 3));
                            aiazVarB.b--;
                            break;
                        }
                    }
                    aiazVarB.unlock();
                    aiazVarB.t();
                    i2++;
                } catch (java.lang.Throwable th) {
                    aiazVarB.unlock();
                    aiazVarB.t();
                    throw th;
                }
            } while (i2 != 16);
        }
        defpackage.aibt aibtVar2 = this.a;
        if (aibtVar2.o()) {
            do {
                java.lang.Object objPoll2 = this.i.poll();
                if (objPoll2 == null) {
                    return;
                }
                defpackage.aibi aibiVar = (defpackage.aibi) objPoll2;
                defpackage.aibu aibuVarC = aibiVar.c();
                int iA2 = aibuVarC.a();
                defpackage.aiaz aiazVarB2 = aibtVar2.b(iA2);
                java.lang.Object objJ = aibuVarC.j();
                aiazVarB2.lock();
                try {
                    java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray2 = aiazVarB2.f;
                    int length2 = iA2 & (atomicReferenceArray2.length() - 1);
                    defpackage.aibu aibuVarE2 = (defpackage.aibu) atomicReferenceArray2.get(length2);
                    int i3 = iA2;
                    while (true) {
                        if (aibuVarE2 == null) {
                            aiazVarB2.unlock();
                            if (!aiazVarB2.isHeldByCurrentThread()) {
                                aiazVarB2.t();
                                break;
                            }
                            break;
                        }
                        int i4 = i3;
                        java.lang.Object objJ2 = aibuVarE2.j();
                        if (aibuVarE2.a() == i4 && objJ2 != null && aiazVarB2.a.h.d(objJ, objJ2)) {
                            if (aibuVarE2.d() != aibiVar) {
                                aiazVarB2.unlock();
                                if (!aiazVarB2.isHeldByCurrentThread()) {
                                    aiazVarB2.t();
                                    break;
                                }
                                break;
                            }
                            aiazVarB2.d++;
                            atomicReferenceArray2.set(length2, aiazVarB2.y(aibuVarE2, aibuVarE2, objJ2, aibiVar.get(), aibiVar, 3));
                            aiazVarB2.b--;
                            aiazVarB2.unlock();
                            if (!aiazVarB2.isHeldByCurrentThread()) {
                                aiazVarB2.t();
                                break;
                            }
                            break;
                        }
                        aibuVarE2 = aibuVarE2.e();
                        i3 = i4;
                    }
                    i++;
                } catch (java.lang.Throwable th2) {
                    aiazVarB2.unlock();
                    if (aiazVarB2.isHeldByCurrentThread()) {
                        throw th2;
                    }
                    aiazVarB2.t();
                    throw th2;
                }
            } while (i != 16);
        }
    }

    public final void l(defpackage.aibu aibuVar) {
        defpackage.aibu aibuVar2;
        if (this.a.h()) {
            j();
            long jA = aibuVar.d().a();
            long j = this.g;
            if (jA > j && !w(aibuVar, aibuVar.a(), 5)) {
                throw new java.lang.AssertionError();
            }
            while (this.c > j) {
                java.util.Iterator it = this.m.iterator();
                do {
                    if (!it.hasNext()) {
                        throw new java.lang.AssertionError();
                    }
                    aibuVar2 = (defpackage.aibu) it.next();
                } while (aibuVar2.d().a() <= 0);
                if (!w(aibuVar2, aibuVar2.a(), 5)) {
                    throw new java.lang.AssertionError();
                }
            }
        }
    }

    public final void m() {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f;
        int length = atomicReferenceArray.length();
        if (length < 1073741824) {
            int i = this.b;
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray(length << 1);
            this.e = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                defpackage.aibu aibuVarE = (defpackage.aibu) atomicReferenceArray.get(i2);
                if (aibuVarE != null) {
                    defpackage.aibu aibuVarE2 = aibuVarE.e();
                    int iA = aibuVarE.a() & length2;
                    if (aibuVarE2 == null) {
                        atomicReferenceArray2.set(iA, aibuVarE);
                    } else {
                        defpackage.aibu aibuVar = aibuVarE;
                        while (aibuVarE2 != null) {
                            int iA2 = aibuVarE2.a() & length2;
                            if (iA2 != iA) {
                                aibuVar = aibuVarE2;
                                iA = iA2;
                            }
                            aibuVarE2 = aibuVarE2.e();
                        }
                        atomicReferenceArray2.set(iA, aibuVar);
                        while (aibuVarE != aibuVar) {
                            int iA3 = aibuVarE.a() & length2;
                            defpackage.aibu aibuVarA = a(aibuVarE, (defpackage.aibu) atomicReferenceArray2.get(iA3));
                            if (aibuVarA != null) {
                                atomicReferenceArray2.set(iA3, aibuVarA);
                            } else {
                                r(aibuVarE);
                                i--;
                            }
                            aibuVarE = aibuVarE.e();
                        }
                    }
                }
            }
            this.f = atomicReferenceArray2;
            this.b = i;
        }
    }

    final void n(long j) {
        defpackage.aibu aibuVar;
        defpackage.aibu aibuVar2;
        j();
        do {
            aibuVar = (defpackage.aibu) this.l.peek();
            if (aibuVar == null || !this.a.k(aibuVar, j)) {
                do {
                    aibuVar2 = (defpackage.aibu) this.m.peek();
                    if (aibuVar2 == null || !this.a.k(aibuVar2, j)) {
                        return;
                    }
                } while (w(aibuVar2, aibuVar2.a(), 4));
                throw new java.lang.AssertionError();
            }
        } while (w(aibuVar, aibuVar.a(), 4));
        throw new java.lang.AssertionError();
    }

    public final void o() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            s(this.a.q.a());
            t();
        }
    }

    public final void p(defpackage.aibu aibuVar, long j) {
        if (this.a.i()) {
            aibuVar.k(j);
        }
        this.m.add(aibuVar);
    }

    public final void q(defpackage.aibu aibuVar, long j) {
        if (this.a.i()) {
            aibuVar.k(j);
        }
        this.j.add(aibuVar);
    }

    final void r(defpackage.aibu aibuVar) {
        java.lang.Object objJ = aibuVar.j();
        aibuVar.a();
        x(objJ, aibuVar.d().get(), aibuVar.d().a(), 3);
        this.l.remove(aibuVar);
        this.m.remove(aibuVar);
    }

    public final void s(long j) {
        if (tryLock()) {
            try {
                k();
                n(j);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    public final void t() {
        if (isHeldByCurrentThread()) {
            return;
        }
        defpackage.aibt aibtVar = this.a;
        while (true) {
            defpackage.aibw aibwVar = (defpackage.aibw) aibtVar.o.poll();
            if (aibwVar == null) {
                return;
            }
            try {
                aibtVar.p.a(aibwVar);
            } catch (java.lang.Throwable th) {
                defpackage.aibt.a.logp(java.util.logging.Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
            }
        }
    }

    final void u() {
        if (tryLock()) {
            try {
                k();
            } finally {
                unlock();
            }
        }
    }

    final void v(long j) {
        if (tryLock()) {
            try {
                n(j);
            } finally {
                unlock();
            }
        }
    }

    final boolean w(defpackage.aibu aibuVar, int i, int i2) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f;
        int length = i & (atomicReferenceArray.length() - 1);
        defpackage.aibu aibuVar2 = (defpackage.aibu) atomicReferenceArray.get(length);
        for (defpackage.aibu aibuVarE = aibuVar2; aibuVarE != null; aibuVarE = aibuVarE.e()) {
            if (aibuVarE == aibuVar) {
                this.d++;
                atomicReferenceArray.set(length, y(aibuVar2, aibuVarE, aibuVarE.j(), aibuVarE.d().get(), aibuVarE.d(), i2));
                this.b--;
                return true;
            }
        }
        return false;
    }

    public final void x(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        this.c -= (long) i;
        java.util.Queue queue = this.a.o;
        if (queue != defpackage.aibt.c) {
            queue.offer(new defpackage.aibw(obj, obj2, i2));
        }
    }

    final defpackage.aibu y(defpackage.aibu aibuVar, defpackage.aibu aibuVar2, java.lang.Object obj, java.lang.Object obj2, defpackage.aibi aibiVar, int i) {
        x(obj, obj2, aibiVar.a(), i);
        this.l.remove(aibuVar2);
        this.m.remove(aibuVar2);
        if (!aibiVar.g()) {
            return e(aibuVar, aibuVar2);
        }
        aibiVar.e(null);
        return aibuVar;
    }

    public final void z(defpackage.aibu aibuVar, java.lang.Object obj, long j) {
        aibn aibfVar;
        defpackage.aibi aibiVarD = aibuVar.d();
        defpackage.aibt aibtVar = this.a;
        defpackage.ahzz ahzzVar = aibtVar.v;
        int iOrdinal = aibtVar.k.ordinal();
        if (iOrdinal == 0) {
            aibfVar = new defpackage.aibf(obj);
        } else if (iOrdinal == 1) {
            aibfVar = new aiba(this.i, obj, aibuVar);
        } else {
            if (iOrdinal != 2) {
                throw null;
            }
            aibfVar = new aibn(this.i, obj, aibuVar);
        }
        aibuVar.p(aibfVar);
        j();
        this.c++;
        if (aibtVar.i()) {
            aibuVar.k(j);
        }
        if (aibtVar.l()) {
            aibuVar.q(j);
        }
        this.m.add(aibuVar);
        this.l.add(aibuVar);
        aibiVarD.e(obj);
    }
}
