package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class brb {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;

    public brb(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.e = j;
        this.f = j2;
        this.a = j3;
        this.g = j4;
        this.h = j5;
        this.b = j6;
        this.c = j7;
        this.d = j8;
    }

    public final long a(boolean z) {
        return z ? this.f : this.h;
    }

    public final long b(boolean z) {
        return z ? this.e : this.g;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.brb)) {
            defpackage.brb brbVar = (defpackage.brb) obj;
            if (anty.ah(this.e, brbVar.e) && anty.ah(this.c, brbVar.c) && anty.ah(this.f, brbVar.f) && anty.ah(this.a, brbVar.a) && anty.ah(this.g, brbVar.g) && anty.ah(this.h, brbVar.h) && anty.ah(this.b, brbVar.b) && anty.ah(this.d, brbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = anty.M(this.e) * 31;
        long j = this.b;
        long j2 = this.h;
        long j3 = this.g;
        long j4 = this.a;
        return ((((((((((((iM + anty.M(this.c)) * 31) + anty.M(this.f)) * 31) + anty.M(j4)) * 31) + anty.M(j3)) * 31) + anty.M(j2)) * 31) + anty.M(j)) * 31) + anty.M(this.d);
    }
}
