package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bte {
    public final long b;
    public final long c;
    public final long d;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long a = 0;
    public final long e = 0;

    public bte(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = j7;
        this.j = j8;
        this.k = j9;
        this.l = j10;
        this.m = j11;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bte)) {
            defpackage.bte bteVar = (defpackage.bte) obj;
            if (defpackage.anty.ah(0L, 0L) && defpackage.anty.ah(this.b, bteVar.b) && defpackage.anty.ah(this.c, bteVar.c) && defpackage.anty.ah(this.d, bteVar.d) && defpackage.anty.ah(0L, 0L) && defpackage.anty.ah(this.f, bteVar.f) && defpackage.anty.ah(this.g, bteVar.g) && defpackage.anty.ah(this.h, bteVar.h) && defpackage.anty.ah(this.i, bteVar.i) && defpackage.anty.ah(this.j, bteVar.j) && defpackage.anty.ah(this.k, bteVar.k) && defpackage.anty.ah(this.l, bteVar.l) && defpackage.anty.ah(this.m, bteVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = defpackage.anty.M(0L) * 31;
        long j = this.m;
        long j2 = this.l;
        long j3 = this.k;
        long j4 = this.j;
        long j5 = this.i;
        long j6 = this.h;
        long j7 = this.g;
        long j8 = this.f;
        long j9 = this.d;
        return ((((((((((((((((((((((iM + defpackage.anty.M(this.b)) * 31) + defpackage.anty.M(this.c)) * 31) + defpackage.anty.M(j9)) * 31) + defpackage.anty.M(0L)) * 31) + defpackage.anty.M(j8)) * 31) + defpackage.anty.M(j7)) * 31) + defpackage.anty.M(j6)) * 31) + defpackage.anty.M(j5)) * 31) + defpackage.anty.M(j4)) * 31) + defpackage.anty.M(j3)) * 31) + defpackage.anty.M(j2)) * 31) + defpackage.anty.M(j);
    }
}
