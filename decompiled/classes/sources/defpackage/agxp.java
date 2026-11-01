package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class agxp {
    public final long a;

    public agxp(long j) {
        this.a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.agxp) && this.a == ((defpackage.agxp) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final java.lang.String toString() {
        return "FetchTaskIdentifier{index=" + this.a + '}';
    }

    public agxp() {
        throw null;
    }
}
