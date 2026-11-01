package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bfe {
    public final defpackage.aomy a;
    public boolean b;
    public defpackage.cso c;
    public final defpackage.aii d;
    public final defpackage.akbx e;
    private final defpackage.aoss f;
    private defpackage.ajl g;
    private final defpackage.ccp h;
    private defpackage.aoub i;
    private final defpackage.ccp j;
    private long k;
    private long l;
    private long m;
    private final defpackage.ccp n;
    private final defpackage.apkl o;

    public bfe(defpackage.aoss aossVar, defpackage.apkl apklVar, defpackage.aomy aomyVar) {
        this.f = aossVar;
        this.o = apklVar;
        this.a = aomyVar;
        defpackage.bfd bfdVar = defpackage.bfd.a;
        defpackage.cdu cduVar = defpackage.cdu.c;
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState(bfdVar, cduVar);
        this.e = new defpackage.akbx(new defpackage.aii(java.lang.Float.valueOf(1.0f), defpackage.alo.a, null, "Animatable"), new auj(this, 20));
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cduVar);
        this.k = 9223372034707292159L;
        this.l = 0L;
        this.m = 9223372034707292159L;
        this.c = apklVar.i();
        this.d = new defpackage.aii(new defpackage.dpn(0L), defpackage.alo.g, null, "Animatable");
        this.n = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dpn(0L), cduVar);
    }

    private final defpackage.bfd w() {
        return (defpackage.bfd) this.h.a();
    }

    private final void x(defpackage.bfd bfdVar, defpackage.bfd bfdVar2, defpackage.aonj aonjVar) {
        defpackage.aoub aoubVar = this.i;
        if (aoubVar != null) {
            aoubVar.s(null);
        }
        r(bfdVar);
        this.i = defpackage.aoov.an(this.f, null, 4, new amh(this, bfdVar2, aonjVar, (defpackage.aoln) null, 11), 1);
    }

    public final long a() {
        return this.m;
    }

    public final long b() {
        return ((defpackage.dpn) this.n.a()).a;
    }

    public final long c() {
        return this.l;
    }

    public final long d() {
        return this.k;
    }

    public final defpackage.cso e() {
        return this.c;
    }

    public final void f() {
        if (this.c != null) {
            defpackage.bfd bfdVarW = w();
            defpackage.bfd bfdVar = defpackage.bfd.c;
            if (bfdVarW != bfdVar) {
                x(bfdVar, defpackage.bfd.b, new auj(this, 19));
            }
        }
    }

    public final void g() {
        if (this.c != null) {
            defpackage.bfd bfdVarW = w();
            defpackage.bfd bfdVar = defpackage.bfd.d;
            if (bfdVarW != bfdVar) {
                x(bfdVar, defpackage.bfd.e, new aum(this, (defpackage.afs) null, 11));
            }
        }
    }

    public final void h(long j, boolean z) {
        defpackage.ajl ajlVar = this.g;
        if (ajlVar != null) {
            long jC = defpackage.dpn.c(b(), j);
            n(jC);
            m(true);
            this.b = z;
            defpackage.aoov.an(this.f, null, 0, new swh(this, ajlVar, jC, (defpackage.aoln) null, 1), 3);
        }
    }

    public final void i(long j) {
        this.k = defpackage.dpn.d(this.k, j);
    }

    public final void j() {
        if (u()) {
            defpackage.aoov.an(this.f, null, 0, new ahb(this, (defpackage.aoln) null, 20, (byte[]) null), 3);
        }
    }

    public final void k() {
        if (u()) {
            m(false);
            defpackage.aoov.an(this.f, null, 0, new bgx(this, (defpackage.aoln) null, 1), 3);
        }
        defpackage.aoub aoubVar = this.i;
        this.i = null;
        if (aoubVar != null) {
            aoubVar.s(null);
        }
        r(defpackage.bfd.a);
        this.e.b = 1;
        this.b = false;
        n(0L);
        this.k = 9223372034707292159L;
        defpackage.cso csoVar = this.c;
        if (csoVar != null) {
            this.o.k(csoVar);
        }
        this.c = null;
        this.g = null;
    }

    public final void l(long j) {
        this.m = j;
    }

    public final void m(boolean z) {
        this.j.b(java.lang.Boolean.valueOf(z));
    }

    public final void n(long j) {
        this.n.b(new defpackage.dpn(j));
    }

    public final void o(long j) {
        this.l = j;
    }

    public final void p(defpackage.ajl ajlVar) {
        this.g = ajlVar;
    }

    public final void q(long j) {
        this.k = j;
    }

    public final void r(defpackage.bfd bfdVar) {
        this.h.b(bfdVar);
    }

    public final boolean s() {
        return w() == defpackage.bfd.e;
    }

    public final boolean t() {
        return w() == defpackage.bfd.d;
    }

    public final boolean u() {
        return ((java.lang.Boolean) this.j.a()).booleanValue();
    }

    public final boolean v() {
        return this.b;
    }
}
