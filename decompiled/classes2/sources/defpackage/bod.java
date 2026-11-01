package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bod {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    private final long g;
    private final long h;

    public bod(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.g = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.h = j6;
        this.e = j7;
        this.f = j8;
    }

    public final long a(boolean z) {
        return z ? this.g : this.h;
    }

    public final defpackage.bod b(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        return new defpackage.bod(j != 16 ? j : this.a, j2 != 16 ? j2 : this.g, j3 != 16 ? j3 : this.b, j4 != 16 ? j4 : this.c, j5 != 16 ? j5 : this.d, j6 != 16 ? j6 : this.h, j7 != 16 ? j7 : this.e, j8 != 16 ? j8 : this.f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bod)) {
            defpackage.bod bodVar = (defpackage.bod) obj;
            if (anty.ah(this.a, bodVar.a) && anty.ah(this.g, bodVar.g) && anty.ah(this.b, bodVar.b) && anty.ah(this.c, bodVar.c) && anty.ah(this.d, bodVar.d) && anty.ah(this.h, bodVar.h) && anty.ah(this.e, bodVar.e) && anty.ah(this.f, bodVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = anty.M(this.a) * 31;
        long j = this.f;
        long j2 = this.e;
        long j3 = this.h;
        long j4 = this.d;
        long j5 = this.c;
        return ((((((((((((iM + anty.M(this.g)) * 31) + anty.M(this.b)) * 31) + anty.M(j5)) * 31) + anty.M(j4)) * 31) + anty.M(j3)) * 31) + anty.M(j2)) * 31) + anty.M(j);
    }
}
