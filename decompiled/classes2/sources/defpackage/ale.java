package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ale implements cer {
    public defpackage.akh a;
    public defpackage.ala b;
    public boolean c;
    public aiw d;
    public final ajl e;
    final /* synthetic */ alg f;
    public final nf g;
    private final ccp h;
    private final aku i;
    private final ccp j;
    private final ccp k;
    private final ccp l;
    private final ccp m;
    private boolean n;
    private final ceg o;
    private final cek p;

    /* JADX WARN: Type inference failed for: r12v9, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [aonj, java.lang.Object] */
    public ale(alg algVar, java.lang.Object obj, aiw aiwVar, nf nfVar) {
        this.f = algVar;
        this.g = nfVar;
        cdu cduVar = cdu.c;
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cduVar);
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
        java.lang.Object objA = null;
        aku akuVar = new aku(1.0f, 1500.0f, (java.lang.Object) null);
        this.i = akuVar;
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableState(akuVar, cduVar);
        this.k = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.ala(d(), nfVar, obj, o(), aiwVar), cduVar);
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, cduVar);
        this.o = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(-1.0f);
        this.m = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cduVar);
        this.d = aiwVar;
        this.p = new androidx.compose.runtime.ParcelableSnapshotMutableLongState(e().a());
        if (!aooh.n(nfVar, alo.b) && !aooh.n(nfVar, alo.h) && !aooh.n(nfVar, alo.g)) {
            if (aooh.n(nfVar, alo.a)) {
                fValueOf = java.lang.Float.valueOf(0.01f);
            } else if (!aooh.n(nfVar, alo.i) && !aooh.n(nfVar, alo.e) && !aooh.n(nfVar, alo.f)) {
                fValueOf = (aooh.n(nfVar, alo.c) || aooh.n(nfVar, alo.d)) ? java.lang.Float.valueOf(0.4f) : null;
            }
        }
        if (fValueOf != null) {
            float fFloatValue = fValueOf.floatValue();
            aiw aiwVar2 = (aiw) nfVar.a.a(obj);
            int iB = aiwVar2.b();
            for (int i = 0; i < iB; i++) {
                aiwVar2.e(i, fFloatValue);
            }
            objA = this.g.b.a(aiwVar2);
        }
        this.e = new aku(1.0f, 1500.0f, objA);
    }

    private final java.lang.Object o() {
        return this.h.a();
    }

    private final void p(ajl ajlVar) {
        this.j.b(ajlVar);
    }

    private final void q(java.lang.Object obj) {
        this.h.b(obj);
    }

    private final void r(java.lang.Object obj, boolean z) {
        defpackage.ala alaVar = this.b;
        if (aooh.n(alaVar != null ? alaVar.a : null, o())) {
            g(new defpackage.ala(this.e, this.g, obj, obj, this.d.c()));
            this.c = true;
            h(e().a());
            return;
        }
        ajl ajlVarD = (!z || this.n || (d() instanceof aku)) ? d() : this.e;
        alg algVar = this.f;
        g(new defpackage.ala(algVar.b() > 0 ? new defpackage.akv(ajlVarD, algVar.b()) : ajlVarD, this.g, obj, o(), this.d));
        h(e().a());
        this.c = false;
        algVar.w(true);
        if (algVar.C()) {
            java.util.List listC = algVar.c.c();
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                defpackage.ale aleVar = (defpackage.ale) listC.get(i);
                aleVar.c();
                long j = algVar.e;
                aleVar.f(0L);
            }
            algVar.w(false);
        }
    }

    public final java.lang.Object a() {
        return this.m.a();
    }

    public final float b() {
        return this.o.c();
    }

    public final long c() {
        return this.p.c();
    }

    public final ajl d() {
        return (ajl) this.j.a();
    }

    public final defpackage.ala e() {
        return (defpackage.ala) this.k.a();
    }

    public final void f(long j) {
        if (b() == -1.0f) {
            this.n = true;
            if (aooh.n(e().a, e().b)) {
                k(e().a);
            } else {
                k(e().c(j));
                this.d = e().b(j);
            }
        }
    }

    public final void g(defpackage.ala alaVar) {
        this.k.b(alaVar);
    }

    public final void h(long j) {
        this.p.h(j);
    }

    public final void i(boolean z) {
        this.l.b(java.lang.Boolean.valueOf(z));
    }

    public final void j(float f) {
        this.o.h(f);
    }

    public final void k(java.lang.Object obj) {
        this.m.b(obj);
    }

    public final void l(java.lang.Object obj, java.lang.Object obj2, ajl ajlVar) {
        q(obj2);
        p(ajlVar);
        if (aooh.n(e().b, obj) && aooh.n(e().a, obj2)) {
            return;
        }
        r(obj, false);
    }

    public final void m(java.lang.Object obj, ajl ajlVar, java.lang.Object obj2, aiw aiwVar) {
        java.lang.Object objA;
        if (this.c) {
            defpackage.ala alaVar = this.b;
            if (aooh.n(obj, alaVar != null ? alaVar.a : null)) {
                return;
            }
        }
        if (aooh.n(o(), obj) && b() == -1.0f && (obj2 == null || aooh.n(obj2, e().b))) {
            return;
        }
        q(obj);
        p(ajlVar);
        if (obj2 == null) {
            objA = b() == -3.0f ? obj : a();
        } else {
            objA = obj2;
        }
        if (obj2 != null) {
            k(objA);
            if (aiwVar != null) {
                this.d = aiwVar;
            }
        }
        r(objA, !n() && obj2 == null);
        i(b() == -3.0f);
        if (b() >= 0.0f) {
            k(e().c((long) (e().a() * b())));
        } else if (b() == -3.0f) {
            k(obj);
        }
        this.c = false;
        j(-1.0f);
    }

    public final boolean n() {
        return ((java.lang.Boolean) this.l.a()).booleanValue();
    }

    public final java.lang.String toString() {
        return "current value: " + a() + ", target: " + o() + ", spec: " + d();
    }
}
