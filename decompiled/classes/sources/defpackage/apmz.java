package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmz implements defpackage.apqc {
    public final int a;
    public final defpackage.apms b;
    public final defpackage.apnh c;
    public long d;
    public long e;
    public final java.util.ArrayDeque f;
    public final defpackage.apmx g;
    public final defpackage.apmw h;
    public final defpackage.apmy i;
    public final defpackage.apmy j;
    public java.io.IOException k;
    private boolean l;
    private defpackage.apme m;

    public apmz(int i, defpackage.apms apmsVar, boolean z, boolean z2, defpackage.apiu apiuVar) {
        this.a = i;
        this.b = apmsVar;
        this.c = new defpackage.apnh(i);
        this.e = apmsVar.r.c();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.f = arrayDeque;
        this.g = new defpackage.apmx(this, apmsVar.q.c(), z2);
        this.h = new defpackage.apmw(this, z);
        this.i = new defpackage.apmy(this);
        this.j = new defpackage.apmy(this);
        if (apiuVar == null) {
            if (!m()) {
                throw new java.lang.IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m()) {
                throw new java.lang.IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(apiuVar);
        }
    }

    private final boolean o(defpackage.apme apmeVar, java.io.IOException iOException) {
        java.util.TimeZone timeZone = defpackage.apjx.a;
        synchronized (this) {
            if (c() == null) {
                this.m = apmeVar;
                this.k = iOException;
                notifyAll();
                if (!this.g.b || !this.h.a) {
                    this.b.b(this.a);
                    return true;
                }
            }
            return false;
        }
    }

    @Override // defpackage.apqc
    public final /* synthetic */ defpackage.apqb a() {
        return this.h;
    }

    @Override // defpackage.apqc
    public final /* synthetic */ defpackage.apqd b() {
        return this.g;
    }

    public final defpackage.apme c() {
        defpackage.apme apmeVar;
        synchronized (this) {
            apmeVar = this.m;
        }
        return apmeVar;
    }

    public final void d(long j) {
        this.e += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void e() {
        boolean z;
        boolean zN;
        java.util.TimeZone timeZone = defpackage.apjx.a;
        synchronized (this) {
            defpackage.apmx apmxVar = this.g;
            z = false;
            if (!apmxVar.b && apmxVar.e) {
                defpackage.apmw apmwVar = this.h;
                if (apmwVar.a || apmwVar.b) {
                    z = true;
                }
            }
            zN = n();
        }
        if (z) {
            g(defpackage.apme.CANCEL, null);
        } else {
            if (zN) {
                return;
            }
            this.b.b(this.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: apng */
    public final void f() throws apng, java.io.IOException {
        defpackage.apmw apmwVar = this.h;
        if (apmwVar.b) {
            throw new java.io.IOException("stream closed");
        }
        if (apmwVar.a) {
            throw new java.io.IOException("stream finished");
        }
        if (c() != null) {
            java.io.IOException iOException = this.k;
            if (iOException != null) {
                throw iOException;
            }
            defpackage.apme apmeVarC = c();
            defpackage.aooh.c(apmeVarC);
            throw new apng(apmeVarC);
        }
    }

    public final void g(defpackage.apme apmeVar, java.io.IOException iOException) {
        if (o(apmeVar, iOException)) {
            this.b.j(this.a, apmeVar);
        }
    }

    public final void h(defpackage.apme apmeVar) {
        if (o(apmeVar, null)) {
            this.b.k(this.a, apmeVar);
        }
    }

    public final void i(defpackage.apiu apiuVar, boolean z) {
        boolean zN;
        if (apiuVar == null) {
            defpackage.aooh.i("headers");
        }
        java.util.TimeZone timeZone = defpackage.apjx.a;
        synchronized (this) {
            if (!this.l || apiuVar.b(":status") != null || apiuVar.b(":method") != null) {
                this.l = true;
                this.f.add(apiuVar);
            }
            if (z) {
                this.g.b = true;
            }
            zN = n();
            notifyAll();
        }
        if (zN) {
            return;
        }
        this.b.b(this.a);
    }

    public final void j(defpackage.apme apmeVar) {
        synchronized (this) {
            if (c() == null) {
                this.m = apmeVar;
                notifyAll();
            }
        }
    }

    public final void k() throws java.io.InterruptedIOException {
        try {
            wait();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException();
        }
    }

    public final boolean l() {
        defpackage.apmw apmwVar = this.h;
        return apmwVar.b || apmwVar.a;
    }

    public final boolean m() {
        return (this.a & 1) == 1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0012, B:11:0x0018, B:13:0x001c), top: B:22:0x0001 }] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r3.l == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() {
        /*
            r3 = this;
            monitor-enter(r3)
            apme r0 = r3.c()     // Catch: java.lang.Throwable -> L25
            r1 = 0
            if (r0 != 0) goto L23
            apmx r0 = r3.g     // Catch: java.lang.Throwable -> L25
            boolean r2 = r0.b     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L12
            boolean r0 = r0.e     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L20
        L12:
            apmw r0 = r3.h     // Catch: java.lang.Throwable -> L25
            boolean r2 = r0.a     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L1c
            boolean r0 = r0.b     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L20
        L1c:
            boolean r0 = r3.l     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L23
        L20:
            monitor-exit(r3)
            r1 = 1
            goto L24
        L23:
            monitor-exit(r3)
        L24:
            return r1
        L25:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apmz.n():boolean");
    }
}
