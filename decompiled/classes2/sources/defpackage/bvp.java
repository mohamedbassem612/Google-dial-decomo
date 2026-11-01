package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bvp {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;

    public bvp(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bvp)) {
            defpackage.bvp bvpVar = (defpackage.bvp) obj;
            if (anty.ah(this.a, bvpVar.a) && anty.ah(this.b, bvpVar.b) && anty.ah(this.c, bvpVar.c) && anty.ah(this.d, bvpVar.d) && anty.ah(this.e, bvpVar.e) && anty.ah(this.f, bvpVar.f) && anty.ah(this.g, bvpVar.g) && anty.ah(this.h, bvpVar.h) && anty.ah(this.i, bvpVar.i) && anty.ah(this.j, bvpVar.j) && anty.ah(this.k, bvpVar.k) && anty.ah(this.l, bvpVar.l) && anty.ah(this.m, bvpVar.m) && anty.ah(this.n, bvpVar.n) && anty.ah(this.o, bvpVar.o) && anty.ah(this.p, bvpVar.p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = anty.M(this.a) * 31;
        long j = this.p;
        long j2 = this.o;
        long j3 = this.n;
        long j4 = this.m;
        long j5 = this.l;
        long j6 = this.k;
        long j7 = this.j;
        long j8 = this.i;
        long j9 = this.h;
        long j10 = this.g;
        long j11 = this.f;
        long j12 = this.e;
        long j13 = this.d;
        return ((((((((((((((((((((((((((((iM + anty.M(this.b)) * 31) + anty.M(this.c)) * 31) + anty.M(j13)) * 31) + anty.M(j12)) * 31) + anty.M(j11)) * 31) + anty.M(j10)) * 31) + anty.M(j9)) * 31) + anty.M(j8)) * 31) + anty.M(j7)) * 31) + anty.M(j6)) * 31) + anty.M(j5)) * 31) + anty.M(j4)) * 31) + anty.M(j3)) * 31) + anty.M(j2)) * 31) + anty.M(j);
    }
}
