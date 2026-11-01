package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bwk {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public bwk(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final long a(float f) {
        return cfd.Q(this.a, this.b, ajk.c.a(f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bwk)) {
            defpackage.bwk bwkVar = (defpackage.bwk) obj;
            if (anty.ah(this.a, bwkVar.a) && anty.ah(this.b, bwkVar.b) && anty.ah(this.c, bwkVar.c) && anty.ah(this.d, bwkVar.d) && anty.ah(this.e, bwkVar.e) && anty.ah(this.f, bwkVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = anty.M(this.a) * 31;
        long j = this.f;
        long j2 = this.e;
        long j3 = this.d;
        return ((((((((iM + anty.M(this.b)) * 31) + anty.M(this.c)) * 31) + anty.M(j3)) * 31) + anty.M(j2)) * 31) + anty.M(j);
    }
}
