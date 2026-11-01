package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class djn implements djd {
    public static final long a = dpy.h(8589934592L, 1.0f);
    public static final defpackage.djn b;
    private static final long h;
    public final crd c;
    public final long d;
    public final long e;
    public final long f;
    public final den g;

    static {
        long jE = dpy.e(0.25d);
        h = jE;
        b = new defpackage.djn(pqc.b, jE, jE, dpy.e(0.25d), csl.a);
    }

    public djn(crd crdVar, long j, long j2, long j3, den denVar) {
        this.c = crdVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = denVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.djn)) {
            defpackage.djn djnVar = (defpackage.djn) obj;
            if (aooh.n(this.c, djnVar.c)) {
                long j = this.d;
                long j2 = djnVar.d;
                dpt[] dptVarArr = dps.a;
                if (anty.ah(j, j2) && anty.ah(this.e, djnVar.e) && anty.ah(this.f, djnVar.f)) {
                    aooh.n((java.lang.Object) null, (java.lang.Object) null);
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        dpt[] dptVarArr = dps.a;
        long j = this.f;
        return ((((((((iHashCode + anty.M(this.d)) * 31) + anty.M(this.e)) * 31) + anty.M(j)) * 961) + 2143289344) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        long j = this.f;
        long j2 = this.e;
        return "Bullet(shape=" + this.c + ", size=(" + dps.c(this.d) + ", " + dps.c(j2) + "), padding=" + dps.c(j) + ", brush=null, alpha=NaN, drawStyle=" + this.g + ')';
    }
}
