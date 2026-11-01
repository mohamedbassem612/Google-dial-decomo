package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class foq {
    public static final /* synthetic */ int d = 0;
    public final long a;
    public final long b;
    public final int c;

    static {
        j$.util.Comparator.-EL.thenComparingInt(j$.util.Comparator.-EL.thenComparingLong(j$.util.Comparator.-CC.comparingLong(new defpackage.fhk(2)), new defpackage.fhk(3)), new defpackage.fiy(2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public foq(long j, long j2, int i) {
        ahvr.bM((boolean) ((j > j2 ? 1 : (j == j2 ? 0 : -1)) >>> 31));
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.foq foqVar = (defpackage.foq) obj;
            if (this.a == foqVar.a && this.b == foqVar.b && this.c == foqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Long.valueOf(this.a), java.lang.Long.valueOf(this.b), java.lang.Integer.valueOf(this.c)});
    }

    public final java.lang.String toString() {
        return eum.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", new java.lang.Object[]{java.lang.Long.valueOf(this.a), java.lang.Long.valueOf(this.b), java.lang.Integer.valueOf(this.c)});
    }
}
