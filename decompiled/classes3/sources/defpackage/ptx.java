package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ptx {
    public final zpz d;
    private final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean i = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean j = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean k = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean l = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean m = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean n = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean o = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean p = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicLong c = new java.util.concurrent.atomic.AtomicLong(0);

    public ptx(zpz zpzVar) {
        this.d = zpzVar;
    }

    final void a(boolean z) {
        this.h.set(z);
        this.d.a(ajcm.a);
    }

    final void b(boolean z) {
        this.i.set(z);
        if (z) {
            this.j.set(true);
        }
        this.d.a(ajcm.a);
    }

    final void c(boolean z) {
        this.n.set(z);
        this.d.a(ajcm.a);
    }

    final void d(boolean z) {
        boolean andSet = this.f.getAndSet(z);
        if (z) {
            this.g.set(true);
        } else if (andSet) {
            this.c.set(j$.time.Instant.now().toEpochMilli());
        }
        this.d.a(ajcm.a);
    }

    final void e(boolean z) {
        this.o.set(z);
        if (z) {
            this.p.set(true);
        }
        this.d.a(ajcm.a);
    }

    final void f(boolean z) {
        this.e.set(z);
        this.d.a(ajcm.a);
    }

    final void g(boolean z) {
        this.k.set(z);
        this.d.a(ajcm.a);
    }

    final void h(boolean z) {
        this.l.set(z);
        this.d.a(ajcm.a);
    }

    final void i(boolean z) {
        this.m.set(z);
        this.d.a(ajcm.a);
    }

    public final boolean j() {
        return this.g.get();
    }

    public final boolean k() {
        return this.a.get();
    }

    public final boolean l() {
        return this.h.get();
    }

    public final boolean m() {
        return this.i.get();
    }

    public final boolean n() {
        return this.e.get();
    }

    public final boolean o() {
        return this.n.get();
    }

    public final boolean p() {
        return this.f.get();
    }

    public final boolean q() {
        return this.o.get();
    }

    public final boolean r() {
        return this.p.get();
    }

    public final boolean s() {
        return this.k.get();
    }

    public final boolean t() {
        return this.l.get();
    }

    public final boolean u() {
        return this.m.get();
    }
}
