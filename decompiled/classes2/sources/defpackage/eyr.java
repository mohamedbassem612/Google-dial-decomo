package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class eyr {
    public final defpackage.ffu a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public eyr(defpackage.ffu ffuVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        ahvr.bM(!z3 || z);
        if (z2 && !z) {
            z4 = false;
        }
        ahvr.bM(z4);
        this.a = ffuVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = false;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public final defpackage.eyr a(long j) {
        return j != this.d ? new defpackage.eyr(this.a, this.b, this.c, j, this.e, this.g, this.h, this.i) : this;
    }

    public final defpackage.eyr b(long j, long j2) {
        return (j == this.b && j2 == this.c) ? this : new defpackage.eyr(this.a, j, j2, this.d, this.e, this.g, this.h, this.i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.eyr eyrVar = (defpackage.eyr) obj;
            if (this.b == eyrVar.b && this.d == eyrVar.d && this.e == eyrVar.e && this.g == eyrVar.g && this.h == eyrVar.h && this.i == eyrVar.i && j$.util.Objects.equals(this.a, eyrVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() + 527;
        long j = this.e;
        return (((((((((((iHashCode * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) j)) * 961) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
