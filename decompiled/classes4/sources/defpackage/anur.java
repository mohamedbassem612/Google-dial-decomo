package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class anur implements defpackage.anuu, defpackage.anzw {
    private boolean a;
    private final int b;
    private boolean c;
    private boolean d;
    private java.lang.Runnable e;
    private boolean f;
    public defpackage.anwf j;
    public final java.lang.Object k = new java.lang.Object();
    public final aodq l;
    public final defpackage.anzz m;
    public int n;
    public boolean o;
    public final defpackage.aodj p;
    public defpackage.anvr q;
    public anmy r;
    public volatile boolean s;
    public boolean t;

    protected anur(int i, defpackage.aodj aodjVar, aodq aodqVar) {
        this.l = aodqVar;
        defpackage.anzz anzzVar = new defpackage.anzz(this, anmh.a, i, aodjVar, aodqVar);
        this.m = anzzVar;
        this.j = anzzVar;
        this.b = 32768;
        this.r = anmy.b;
        this.d = false;
        this.p = aodjVar;
    }

    private final void c() {
        boolean zI;
        synchronized (this.k) {
            zI = i();
            if (!zI) {
                java.util.logging.Logger logger = defpackage.anus.v;
                if (logger.isLoggable(java.util.logging.Level.FINEST)) {
                    logger.logp(java.util.logging.Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new java.lang.Object[]{java.lang.Boolean.valueOf(this.a), java.lang.Integer.valueOf(this.n), java.lang.Integer.valueOf(this.b), java.lang.Boolean.valueOf(this.o)});
                }
            }
        }
        if (zI) {
            this.q.e();
        }
    }

    protected void d() {
        ahvr.bY(this.q != null);
        synchronized (this.k) {
            ahvr.bZ(!this.a, "Already allocated");
            this.a = true;
        }
        c();
    }

    @Override // defpackage.anzw
    public final void g(defpackage.aodl aodlVar) {
        this.q.d(aodlVar);
    }

    public final void h(int i) {
        boolean z;
        synchronized (this.k) {
            ahvr.bZ(this.a, "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.n;
            int i3 = this.b;
            int i4 = i2 - i;
            this.n = i4;
            z = false;
            if (i2 >= i3 && i4 < i3) {
                z = true;
            }
        }
        if (z) {
            c();
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.k) {
            z = false;
            if (this.a && this.n < this.b && !this.o) {
                z = true;
            }
        }
        return z;
    }

    public final void j(anqw anqwVar, defpackage.anvq anvqVar, anph anphVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        this.p.f();
        aodq aodqVar = this.l;
        if (anqwVar.h()) {
            aodqVar.c++;
        } else {
            aodqVar.d++;
        }
        this.q.a(anqwVar, anvqVar, anphVar);
    }

    @Override // defpackage.anzw
    public void k(boolean z) {
        ahvr.bZ(this.t, "status should have been reported on deframer closed");
        this.d = true;
        if (this.f && z) {
            l(anqw.k.f("Encountered end-of-stream mid-frame"), true, new anph());
        }
        java.lang.Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
            this.e = null;
        }
    }

    public final void l(anqw anqwVar, boolean z, anph anphVar) {
        m(anqwVar, defpackage.anvq.a, z, anphVar);
    }

    public final void m(anqw anqwVar, defpackage.anvq anvqVar, boolean z, anph anphVar) {
        ahvr.cj(anqwVar, "status");
        ahvr.cj(anphVar, "trailers");
        if (this.t) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.t = true;
        this.f = anqwVar.h();
        synchronized (this.k) {
            this.o = true;
        }
        if (this.d) {
            this.e = null;
            j(anqwVar, anvqVar, anphVar);
            return;
        }
        this.e = new abb(this, anqwVar, anvqVar, anphVar, 16);
        defpackage.anwf anwfVar = this.j;
        if (z) {
            anwfVar.close();
            return;
        }
        defpackage.anzz anzzVar = (defpackage.anzz) anwfVar;
        if (anzzVar.b()) {
            return;
        }
        if (anzzVar.c()) {
            anzzVar.close();
        } else {
            anzzVar.f = true;
        }
    }
}
