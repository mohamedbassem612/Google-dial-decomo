package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aorl implements java.lang.Comparable {
    public final long a;

    public static long a(long j) {
        int i = aork.a;
        return (((-1) + j) | 1) == Long.MAX_VALUE ? aorh.l(aodc.m(j)) : aodc.n(aork.a(), j, aorj.a);
    }

    public static final long b(long j, long j2) {
        int i = aork.a;
        long j3 = (j2 - 1) | 1;
        aorj aorjVar = aorj.a;
        if (j3 != Long.MAX_VALUE) {
            return (((-1) + j) | 1) == Long.MAX_VALUE ? aodc.m(j) : aodc.n(j, j2, aorjVar);
        }
        if (j != j2) {
            return aorh.l(aodc.m(j2));
        }
        long j4 = aorh.a;
        return 0L;
    }

    public static java.lang.String c(long j) {
        return "ValueTimeMark(reading=" + j + ')';
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.aorl aorlVar = (defpackage.aorl) obj;
        aooh.f(aorlVar, "other");
        aooh.f(aorlVar, "other");
        aooh.f(aorlVar, "other");
        boolean z = aorlVar instanceof defpackage.aorl;
        long j = this.a;
        if (z) {
            long jB = b(j, aorlVar.a);
            long j2 = aorh.a;
            return aorh.a(jB, 0L);
        }
        throw new java.lang.IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + c(j) + " and " + aorlVar);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aorl) && this.a == ((defpackage.aorl) obj).a;
    }

    public final int hashCode() {
        return anty.M(this.a);
    }

    public final java.lang.String toString() {
        return c(this.a);
    }
}
