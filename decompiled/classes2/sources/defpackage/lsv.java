package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lsv {
    public final long a;
    public final java.lang.String b;

    public lsv(long j, java.lang.String str) {
        aooh.f(str, "callerNumber");
        this.a = j;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lsv) {
            defpackage.lsv lsvVar = (defpackage.lsv) obj;
            if (this.a == lsvVar.a && aooh.n(this.b, lsvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.M(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ContactCheckSpoofCallLogDbEntity(callCreationTimeMillis=" + this.a + ", callerNumber=" + this.b + ')';
    }
}
