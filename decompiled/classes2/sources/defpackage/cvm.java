package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cvm {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;
    public defpackage.cvm n;
    private java.util.List o;
    private boolean p;
    private boolean q;

    public cvm(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.m = 0L;
        this.p = z3;
        this.q = z3;
    }

    public final java.util.List a() {
        java.util.List list = this.o;
        return list == null ? aokc.a : list;
    }

    public final void b() {
        defpackage.cvm cvmVar = this.n;
        if (cvmVar != null) {
            cvmVar.b();
        } else {
            this.p = true;
            this.q = true;
        }
    }

    public final boolean c() {
        defpackage.cvm cvmVar = this.n;
        if (cvmVar != null) {
            return cvmVar.c();
        }
        return this.p || this.q;
    }

    public final java.lang.String toString() {
        long j = this.l;
        long j2 = this.j;
        long j3 = this.g;
        long j4 = this.c;
        return "PointerInputChange(id=" + cvl.a(this.a) + ", uptimeMillis=" + this.b + ", position=" + cpm.c(j4) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + cpm.c(j3) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + defpackage.cvu.a(this.i) + ", historical=" + a() + ", scrollDelta=" + cpm.c(j2) + ", scaleFactor=" + this.k + ", panOffset=" + cpm.c(j) + ')';
    }

    public cvm(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, java.util.List list, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, f2, j7);
        this.o = list;
        this.m = j8;
    }
}
