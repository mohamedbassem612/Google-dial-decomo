package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aorm {
    public final java.lang.Object a;
    public final long b;

    public aorm(java.lang.Object obj, long j) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aorm) {
            defpackage.aorm aormVar = (defpackage.aorm) obj;
            if (aooh.n(this.a, aormVar.a)) {
                long j = this.b;
                long j2 = aormVar.b;
                long j3 = aorh.a;
                if (anty.ah(j, j2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = aorh.a;
        return iHashCode + anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + aorh.m(this.b) + ')';
    }
}
