package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cra implements defpackage.dpf {
    public int a;
    public float e;
    public float f;
    public float g;
    public float j;
    public boolean n;
    public defpackage.cqx u;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public long h = -72057594037927936L;
    public long i = -72057594037927936L;
    public float k = 8.0f;
    public long l = defpackage.mni.bj(0.5f, 0.5f);
    public defpackage.crd m = defpackage.cqz.a;
    public int o = 0;
    public long p = 9205357640488583168L;
    public defpackage.cqr q = defpackage.cqr.a;
    public defpackage.dpf r = new defpackage.dpg(1.0f, 1.0f);
    public defpackage.dpq s = defpackage.dpq.a;
    public int t = 3;

    public final void A(long j) {
        if (this.i != j) {
            this.a |= 128;
            this.i = j;
        }
    }

    public final void B(long j) {
        if (this.l != j) {
            this.a |= 4096;
            this.l = j;
        }
    }

    public final void C(float f) {
        if (this.e != f) {
            this.a |= 8;
            this.e = f;
        }
    }

    @Override // defpackage.dpf
    public final float a() {
        return this.r.a();
    }

    @Override // defpackage.dpl
    public final float b() {
        return this.r.b();
    }

    @Override // defpackage.dpl
    public final /* synthetic */ float dh(long j) {
        return defpackage.dfd.m(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float di(float f) {
        return (f / a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dj(int i) {
        return (i / a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dk(long j) {
        return defpackage.dfd.o(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dl(float f) {
        return f * a();
    }

    @Override // defpackage.dpf
    /* JADX INFO: renamed from: do */
    public final /* synthetic */ int mo1do(long j) {
        throw null;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ int dp(float f) {
        return defpackage.dfd.p(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dq(long j) {
        return defpackage.dfd.q(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dr(long j) {
        return defpackage.dfd.r(this, j);
    }

    @Override // defpackage.dpl
    public final /* synthetic */ long ds(float f) {
        return defpackage.dfd.n(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dt(float f) {
        return defpackage.dfd.n(this, (f / a()) + 0.0f);
    }

    public final void n() {
        w(1.0f);
        x(1.0f);
        o(1.0f);
        C(0.0f);
        y(0.0f);
        p(-72057594037927936L);
        A(-72057594037927936L);
        v(0.0f);
        r(8.0f);
        B(defpackage.mni.bj(0.5f, 0.5f));
        z(defpackage.cqz.a);
        s(false);
        q(3);
        t(0);
        u(defpackage.cqr.a);
        this.p = 9205357640488583168L;
        this.u = null;
        this.a = 0;
    }

    public final void o(float f) {
        if (this.d != f) {
            this.a |= 4;
            this.d = f;
        }
    }

    public final void p(long j) {
        if (this.h != j) {
            this.a |= 64;
            this.h = j;
        }
    }

    public final void q(int i) {
        if (this.t != i) {
            this.a |= 524288;
            this.t = i;
        }
    }

    public final void r(float f) {
        if (this.k != f) {
            this.a |= 2048;
            this.k = f;
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.a |= 16384;
            this.n = z;
        }
    }

    public final void t(int i) {
        if (this.o != i) {
            this.a |= 32768;
            this.o = i;
        }
    }

    public final void u(defpackage.cqr cqrVar) {
        if (defpackage.aooh.n(this.q, cqrVar)) {
            return;
        }
        this.a |= 1048576;
        this.q = cqrVar;
    }

    public final void v(float f) {
        if (this.j != f) {
            this.a |= 1024;
            this.j = f;
        }
    }

    public final void w(float f) {
        if (this.b != f) {
            this.a |= 1;
            this.b = f;
        }
    }

    public final void x(float f) {
        if (this.c != f) {
            this.a |= 2;
            this.c = f;
        }
    }

    public final void y(float f) {
        if (this.g != f) {
            this.a |= 32;
            this.g = f;
        }
    }

    public final void z(defpackage.crd crdVar) {
        if (defpackage.aooh.n(this.m, crdVar)) {
            return;
        }
        this.a |= 8192;
        this.m = crdVar;
    }
}
