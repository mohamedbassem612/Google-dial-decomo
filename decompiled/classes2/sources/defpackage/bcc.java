package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bcc implements bef {
    public final int a;
    public final java.lang.Object b;
    public final int d;
    public final java.util.List e;
    public final bdu f;
    public final int g;
    public int i;
    public final long j;
    public long k;
    public int l;
    public int m;
    public boolean n;
    private final int o;
    private final dpq p;
    private final int q;
    private final long r;
    private final long s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private int z;
    public final boolean c = true;
    public int h = Integer.MIN_VALUE;

    public bcc(int i, java.lang.Object obj, int i2, int i3, dpq dpqVar, int i4, int i5, java.util.List list, long j, bdu bduVar, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.o = i2;
        this.p = dpqVar;
        this.q = i4;
        this.d = i5;
        this.e = list;
        this.r = j;
        this.f = bduVar;
        this.s = j2;
        this.t = i6;
        this.u = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = java.lang.Math.max(iMax, ((czc) list.get(i8)).b);
        }
        this.g = iMax;
        this.y = i3;
        this.w = iMax;
        int i9 = this.o;
        this.v = i9;
        this.x = 0;
        this.j = (((long) i9) << 32) | (((long) iMax) & 4294967295L);
        this.k = 0L;
        this.l = -1;
        this.m = -1;
    }

    private static final int q(long j) {
        return (int) (j & 4294967295L);
    }

    public final int a() {
        return this.v;
    }

    public final int b() {
        return 0;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.t;
    }

    public final int e() {
        return this.w + this.y;
    }

    public final int f() {
        return this.u;
    }

    public final int g() {
        return this.w;
    }

    public final int h() {
        return this.y;
    }

    public final long i() {
        return this.s;
    }

    public final long j(int i) {
        return this.k;
    }

    public final java.lang.Object k() {
        return this.b;
    }

    public final java.util.List l() {
        return this.e;
    }

    public final void m() {
        this.n = true;
    }

    public final void n(czb czbVar, boolean z) {
        cso csoVarE;
        czb czbVar2;
        if (this.h == Integer.MIN_VALUE) {
            defpackage.avo.c("position() should be called first");
        }
        java.util.List list = this.e;
        int size = list.size();
        int i = 0;
        while (i < size) {
            czc czcVar = (czc) list.get(i);
            int i2 = this.z - czcVar.b;
            int i3 = this.i;
            long j = this.k;
            bfe bfeVarD = this.f.d(this.b, i);
            if (bfeVarD != null) {
                if (z) {
                    bfeVarD.l(j);
                } else {
                    long jD = dpn.d(bfeVarD.a() == 9223372034707292159L ? j : bfeVarD.a(), bfeVarD.b());
                    if ((q(j) <= i2 && q(jD) <= i2) || (q(j) >= i3 && q(jD) >= i3)) {
                        bfeVarD.j();
                    }
                    j = jD;
                }
                csoVarE = bfeVarD.e();
            } else {
                csoVarE = null;
            }
            cso csoVar = csoVarE;
            long jD2 = dpn.d(j, this.r);
            if (!z && bfeVarD != null) {
                bfeVarD.o(jD2);
            }
            if (csoVar != null) {
                czbVar2 = czbVar;
                czbVar2.w(czcVar, jD2, csoVar, 0.0f);
            } else {
                czbVar2 = czbVar;
                czb.A(czbVar2, czcVar, jD2, (aonj) null, 6);
            }
            i++;
            czbVar = czbVar2;
        }
    }

    public final void o(int i, int i2, int i3, int i4, int i5, int i6) {
        this.h = i4;
        if (this.p == dpq.b) {
            i2 = (i3 - i2) - this.o;
        }
        this.k = (((long) i2) << 32) | (((long) i) & 4294967295L);
        this.l = i5;
        this.m = i6;
        this.z = -this.q;
        this.i = i4 + this.d;
    }

    public final void p(int i, int i2, int i3, int i4) {
        o(i, i2, i3, i4, -1, -1);
    }
}
