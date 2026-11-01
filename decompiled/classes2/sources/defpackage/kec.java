package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kec {
    public final long a;
    public final long b;

    public kec(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kec) {
            defpackage.kec kecVar = (defpackage.kec) obj;
            if (this.a == kecVar.a && this.b == kecVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.M(this.a) * 31) + anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "CallRecord(id=" + this.a + ", timestamp=" + this.b + ')';
    }
}
