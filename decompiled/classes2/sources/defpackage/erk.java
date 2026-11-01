package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class erk {
    public java.lang.Object a;
    public java.lang.Object b;
    public int c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public defpackage.ept h = defpackage.ept.a;

    static {
        eum.a;
    }

    public final int a(int i) {
        return this.h.a(i).b;
    }

    public final int b(long j) {
        defpackage.ept eptVar = this.h;
        long j2 = this.d;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = eptVar.b;
        return -1;
    }

    public final int c(long j) {
        defpackage.ept eptVar = this.h;
        int i = eptVar.b;
        eptVar.a(-1);
        return -1;
    }

    public final int d(int i) {
        return this.h.a(i).a(-1);
    }

    public final long e(int i, int i2) {
        defpackage.epr eprVarA = this.h.a(i);
        if (eprVarA.b != -1) {
            return eprVarA.f[i2];
        }
        return -9223372036854775807L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            defpackage.erk erkVar = (defpackage.erk) obj;
            if (j$.util.Objects.equals(this.a, erkVar.a) && j$.util.Objects.equals(this.b, erkVar.b) && this.c == erkVar.c && this.d == erkVar.d && this.g == erkVar.g && j$.util.Objects.equals(this.h, erkVar.h) && this.e == erkVar.e) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return eum.C(0L);
    }

    public final void g() {
        long j = this.h.c;
    }

    public final void h(int i) {
        boolean z = this.h.a(i).j;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.b;
        return ((((((((((((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31) + anty.M(this.d)) * 31) + anty.M(0L)) * 31) + (this.g ? 1 : 0)) * 31) + this.h.hashCode()) * 31) + anty.M(this.e);
    }

    public final void i(java.lang.Object obj, java.lang.Object obj2, int i, long j, long j2, defpackage.ept eptVar, boolean z, long j3) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.f = 0L;
        this.h = eptVar;
        this.g = z;
        this.e = j3;
    }

    public final void j() {
        int i = this.h.b;
    }

    public final void k(int i) {
        long j = this.h.a(i).a;
    }
}
