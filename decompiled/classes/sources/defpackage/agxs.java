package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class agxs {
    public final long a;

    public agxs(long j) {
        this.a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.agxs) && this.a == ((defpackage.agxs) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final java.lang.String toString() {
        return "LoadTaskIdentifier{index=" + this.a + '}';
    }

    public agxs() {
        throw null;
    }
}
