package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ahsu {
    public final long a;
    public final long b;

    public ahsu(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahsu) {
            defpackage.ahsu ahsuVar = (defpackage.ahsu) obj;
            if (this.a == ahsuVar.a && this.b == ahsuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final java.lang.String toString() {
        return "AsyncInfo{dispatchMarkId=" + this.a + ", dispatchMarkTimeNanos=" + this.b + '}';
    }

    public ahsu() {
        throw null;
    }
}
