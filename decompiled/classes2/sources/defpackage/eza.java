package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eza {
    public static final defpackage.ffu a = new defpackage.ffu(new java.lang.Object(), -1, -1, -1, -1);
    public final defpackage.erm b;
    public final defpackage.ffu c;
    public final long d;
    public final long e;
    public final int f;
    public final defpackage.exl g;
    public final boolean h;
    public final defpackage.fhg i;
    public final defpackage.fin j;
    public final java.util.List k;
    public final defpackage.ffu l;
    public final boolean m;
    public final int n;
    public final int o;
    public final defpackage.erc p;
    public final boolean r;
    public volatile long s;
    public volatile long t;
    public volatile long u;
    public volatile long v;
    public volatile long w = 0;
    public final boolean q = false;

    public eza(defpackage.erm ermVar, defpackage.ffu ffuVar, long j, long j2, int i, defpackage.exl exlVar, boolean z, defpackage.fhg fhgVar, defpackage.fin finVar, java.util.List list, defpackage.ffu ffuVar2, boolean z2, int i2, int i3, defpackage.erc ercVar, long j3, long j4, long j5, long j6, boolean z3, boolean z4) {
        this.b = ermVar;
        this.c = ffuVar;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = exlVar;
        this.h = z;
        this.i = fhgVar;
        this.j = finVar;
        this.k = list;
        this.l = ffuVar2;
        this.m = z2;
        this.n = i2;
        this.o = i3;
        this.p = ercVar;
        this.s = j3;
        this.t = j4;
        this.u = j5;
        this.v = j6;
        this.r = z4;
    }

    public static defpackage.eza j(defpackage.fin finVar) {
        defpackage.erm ermVar = defpackage.erm.a;
        defpackage.ffu ffuVar = a;
        return new defpackage.eza(ermVar, ffuVar, -9223372036854775807L, 0L, 1, null, false, defpackage.fhg.a, finVar, aike.a, ffuVar, false, 1, 0, defpackage.erc.a, 0L, 0L, 0L, 0L, false, false);
    }

    public final long a(long j) {
        if (!k()) {
            return this.u;
        }
        while (true) {
            long j2 = this.w;
            long j3 = this.u;
            long j4 = this.v;
            if (j2 % 2 == 0 && j2 == this.w) {
                return eum.w(eum.C(j3) + ((long) (java.lang.Math.min(j - j4, 1500L) * this.p.b)));
            }
        }
    }

    public final defpackage.eza b(long j) {
        return new defpackage.eza(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.s, this.t, a(j), j, false, this.r);
    }

    public final defpackage.eza c(boolean z) {
        boolean z2 = this.r;
        return new defpackage.eza(this.b, this.c, this.d, this.e, this.f, this.g, z, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.s, this.t, this.u, this.v, false, z2);
    }

    public final defpackage.eza d(defpackage.ffu ffuVar) {
        boolean z = this.r;
        return new defpackage.eza(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, ffuVar, this.m, this.n, this.o, this.p, this.s, this.t, this.u, this.v, false, z);
    }

    public final defpackage.eza e(defpackage.ffu ffuVar, long j, long j2, long j3, long j4, long j5, defpackage.fhg fhgVar, defpackage.fin finVar, java.util.List list) {
        boolean z = this.r;
        defpackage.ffu ffuVar2 = this.l;
        boolean z2 = this.m;
        int i = this.n;
        int i2 = this.o;
        defpackage.erc ercVar = this.p;
        long j6 = this.s;
        return new defpackage.eza(this.b, ffuVar, j2, j3, this.f, this.g, this.h, fhgVar, finVar, list, ffuVar2, z2, i, i2, ercVar, j6, j4, j, j5, false, z);
    }

    public final defpackage.eza f(boolean z, int i, int i2) {
        boolean z2 = this.r;
        return new defpackage.eza(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, z, i, i2, this.p, this.s, this.t, this.u, this.v, false, z2);
    }

    public final defpackage.eza g(defpackage.exl exlVar) {
        boolean z = this.r;
        return new defpackage.eza(this.b, this.c, this.d, this.e, this.f, exlVar, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.s, this.t, this.u, this.v, false, z);
    }

    public final defpackage.eza h(int i) {
        boolean z = this.r;
        return new defpackage.eza(this.b, this.c, this.d, this.e, i, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.s, this.t, this.u, this.v, false, z);
    }

    public final defpackage.eza i(defpackage.erm ermVar) {
        return new defpackage.eza(ermVar, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.s, this.t, this.u, this.v, false, this.r);
    }

    public final boolean k() {
        return this.f == 3 && this.m && this.o == 0;
    }
}
