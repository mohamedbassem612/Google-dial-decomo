package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class btw {
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

    public btw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final long a(boolean z) {
        return z ? this.c : this.e;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.btw)) {
            defpackage.btw btwVar = (defpackage.btw) obj;
            if (anty.ah(this.a, btwVar.a) && anty.ah(this.b, btwVar.b) && anty.ah(this.c, btwVar.c) && anty.ah(this.d, btwVar.d) && anty.ah(this.e, btwVar.e) && anty.ah(this.f, btwVar.f) && anty.ah(this.g, btwVar.g) && anty.ah(this.h, btwVar.h) && anty.ah(this.i, btwVar.i) && anty.ah(this.j, btwVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = anty.M(this.a) * 31;
        long j = this.j;
        long j2 = this.i;
        long j3 = this.h;
        long j4 = this.g;
        long j5 = this.f;
        long j6 = this.e;
        long j7 = this.d;
        return ((((((((((((((((iM + anty.M(this.b)) * 31) + anty.M(this.c)) * 31) + anty.M(j7)) * 31) + anty.M(j6)) * 31) + anty.M(j5)) * 31) + anty.M(j4)) * 31) + anty.M(j3)) * 31) + anty.M(j2)) * 31) + anty.M(j);
    }
}
