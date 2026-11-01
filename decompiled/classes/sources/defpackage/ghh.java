package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ghh {
    public defpackage.git a;
    public defpackage.aoss b;
    public defpackage.aomy c;
    public final long e;
    public defpackage.gip h;
    public boolean i;
    public defpackage.aoub j;
    public final java.lang.Object d = new java.lang.Object();
    public final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.concurrent.atomic.AtomicLong g = new java.util.concurrent.atomic.AtomicLong(android.os.SystemClock.uptimeMillis());

    public ghh(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.e = timeUnit.toMillis(j);
    }

    public final defpackage.gip a() {
        defpackage.gip gipVarB;
        defpackage.aoub aoubVar = this.j;
        defpackage.git gitVar = null;
        if (aoubVar != null) {
            aoubVar.s(null);
        }
        this.j = null;
        this.f.incrementAndGet();
        if (this.i) {
            throw new java.lang.IllegalStateException("Attempting to open already closed database.");
        }
        synchronized (this.d) {
            gipVarB = this.h;
            if (gipVarB == null || !gipVarB.m()) {
                defpackage.git gitVar2 = this.a;
                if (gitVar2 == null) {
                    defpackage.aooh.j("delegateOpenHelper");
                } else {
                    gitVar = gitVar2;
                }
                gipVarB = gitVar.b();
                this.h = gipVarB;
            }
        }
        return gipVarB;
    }

    public final java.lang.Object b(defpackage.aonj aonjVar) {
        try {
            return aonjVar.a(a());
        } finally {
            c();
        }
    }

    public final void c() {
        int iDecrementAndGet = this.f.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new java.lang.IllegalStateException("Unbalanced reference count.");
        }
        this.g.set(android.os.SystemClock.uptimeMillis());
        if (iDecrementAndGet == 0) {
            defpackage.aoss aossVar = this.b;
            if (aossVar == null) {
                defpackage.aooh.j("coroutineScope");
                aossVar = null;
            }
            this.j = defpackage.aoov.an(aossVar, null, 0, new defpackage.dgz(this, (defpackage.aoln) null, 8), 3);
        }
    }
}
